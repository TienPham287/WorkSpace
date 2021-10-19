package QuanLySV;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class ViewSinhvien extends JFrame implements ActionListener, MouseListener {
	private static final long serialVesionUID = 1L;
private JTextField txtMaso;
private JComboBox<String> cbMalop;
private JTextField txtDiemLT;
private JTextField txtDiemTH;
private JTextField txtDiemTB;
private JTextField txtKQ;
private JButton bttKQ;
private JButton bttAdd;
private DefaultTableModel dfModel;
private JTable tabel;
private JTextField txtHoten;
private DanhSachSinhvien ds;
private JButton bttClear;
private JButton bttSave;
private JButton bttDelete;
private JButton bttLoad;
private JButton bttFind;
private final String FILENAME = "DATA_SINHVIEN.DAT";

public ViewSinhvien() {
	setTitle("Chương trình quản lí sinh viên");
	setSize(600,700);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	napDanhSachSinhVien(FILENAME);
	buildGUI();
}
private void napDanhSachSinhVien(String file) {
	if (new File(file).exists()) {// nếu tồn tại file chứa danh sách sv
		try {
			FileInputStream in = new FileInputStream(FILENAME);
			ObjectInputStream os = new ObjectInputStream(in);
			ds = (DanhSachSinhvien)os.readObject();
			// Đọc file và gán vòa danh sách
			napvaoBang();
			os.close();
			
		} catch (Exception e) {
		JOptionPane.showMessageDialog(null, "IO Error");
		return;
		}
		
	}
	else 
		ds = new DanhSachSinhvien();
	
}
private void napvaoBang() {
	dfModel.setRowCount(0);
	for (int i = 0; i< ds.sumSinhvien(); i++) {
		Sinhvien sv = ds.getSinhvien(i);
		String[] dataRow = {sv.getMssv(), sv.getHoten(),sv.getMalop(), sv.getDiemLT()+"", sv.getDiemTH()+"", sv.diemTB()+ "", sv.ketqua()};
		dfModel.addRow(dataRow);
		}
	}

	

private void buildGUI() {
	JPanel pnLeft = new JPanel(new GridLayout(0, 1));
	pnLeft.add(new JLabel("THÔNG TIN SINH VIÊN"), JLabel.CENTER);
	pnLeft.add(new JLabel("Mã sinh viên: "));
	pnLeft.add(txtMaso = new JTextField(20));
	
	pnLeft.add(new JLabel("Họ và tên: "));
	pnLeft.add(txtHoten = new JTextField(20));
	
	pnLeft.add(new JLabel("Mã lớp: "));
	pnLeft.add(cbMalop = new JComboBox<String>());
	String[] dslop = {"DHTA", "DHTB", "DHTC", "DHTD", "DHTK"};
	for ( int i = 0;i<dslop.length; i++) {
		cbMalop.addItem(dslop[i]);
	}
	pnLeft.add(new JLabel("Điểm lí thuyết: "));
	pnLeft.add(txtDiemLT = new JTextField(20));
	
	pnLeft.add(new JLabel("Điểm thực hành: "));
	pnLeft.add(txtDiemTH = new JTextField(20));
	
	pnLeft.add(new JLabel("Điểm trung bình: "));
	pnLeft.add(txtDiemTB = new JTextField(20));
	txtDiemTB.setEditable(false);
	
	pnLeft.add(new JLabel("Kết quả: "));
	pnLeft.add(txtKQ = new JTextField(20));
	txtKQ.setEditable(false);
	
	JPanel pnLeftButtom;
	pnLeft.add(pnLeftButtom = new JPanel());
	pnLeftButtom.add(bttKQ = new JButton("Kết quả"));
	pnLeftButtom.add(bttAdd = new JButton("Thêm"));
	pnLeftButtom.add(bttClear = new JButton("CLear"));
	
	JPanel pnLeftButtom2;
	pnLeft.add(pnLeftButtom2 = new JPanel());
	pnLeftButtom2.add(bttSave = new JButton("Lưu"));
	pnLeftButtom2.add(bttDelete = new JButton("Xóa"));
	pnLeftButtom2.add(bttLoad = new JButton("Sửa"));
	pnLeftButtom2.add(bttFind = new JButton("Tìm"));
	
	JPanel pnRight = new JPanel(new GridLayout(1,1));
	String[] headers = {"Mã SV", "Họ tên", "Lớp","Lý thuyết", "Thực hành", "Trung Bình", "Kết quả"};
	pnRight.add(new JScrollPane(tabel = new JTable(dfModel = new DefaultTableModel(headers, 0))));
	add(new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, pnLeft, pnRight));
	
	
	bttClear.addActionListener(this);
	bttKQ.addActionListener(this);
	bttAdd.addActionListener(this);
	bttSave.addActionListener(this);
	bttLoad.addActionListener(this);
	bttFind.addActionListener(this);
	bttDelete.addActionListener(this);
	
	tabel.addMouseListener(this);
	}
	
	public static void main(String[] args) {
		new ViewSinhvien().setVisible(true);
	}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	int vitri = tabel.getSelectedRow();//Lấy vị trí được chọn trong table
	Sinhvien sv = ds.getSinhvien(vitri);
	//Lấy thông tin của thông tin vitri trong dssv
	//Nạp thông tin của sinh viên vào các compoment tương ứng
	napLaiThongTin(sv);
}



private void napLaiThongTin(Sinhvien sv) {
	txtMaso.setText(sv.getMssv());
	txtHoten.setText(sv.getHoten());
	cbMalop.setSelectedItem(sv.getMalop());
	txtDiemLT.setText(sv.getDiemLT()+"");
	txtDiemTH.setText(sv.getDiemTH()+"");
	txtDiemTB.setText(sv.diemTB()+ "");
	txtKQ.setText(sv.ketqua());
	txtMaso.requestFocus();
	
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}



@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}



@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}



@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource().equals(bttLoad)) {
		try {
			Sinhvien ssVesion2 = new Sinhvien(txtMaso.getText(), txtHoten.getText(), cbMalop.getSelectedItem().toString(), Double.parseDouble(txtDiemLT.getText()), 
					Double.parseDouble(txtDiemTH.getText()));
			if (!ds.LoadSinhvien(txtMaso.getText(), ssVesion2)) {
				JOptionPane.showMessageDialog(null, "Không tồn tại sinh vien có mã số:"+txtMaso.getText());
				return;
				
			}
			else 
				napvaoBang();
		}catch (Exception ex) {
JOptionPane.showMessageDialog(null, "Lỗi");
return;
			
		}
			
}else if (e.getSource().equals(bttFind)) {
	try {
		String masv = JOptionPane.showInputDialog("Nhập mã sv cần tìm:");
		if (masv!=null && masv.trim().equals("")) {
			Sinhvien sv = ds.Find(masv);
			if (sv!= null)
				napLaiThongTin(sv);
		
			else
			{
		JOptionPane.showMessageDialog( null, "Không tồn tại sinh viên có mã số:"+ masv);
		return;
		}
		}
		
		
	} catch (Exception e2) {
		JOptionPane.showMessageDialog(null, "Lỗi");
		return;
	}
}else if(e.getSource().equals(bttDelete)) {
	try {
		String masv = JOptionPane.showInputDialog("Nhap masv can xoa");
		if (masv!= null && masv.trim().equals("")) {
			Sinhvien sv = ds.Find(masv);
			if (sv != null) {
				if (JOptionPane.showConfirmDialog(null, "Co chac chan xoa khong?", "Thong bao", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION) {
					ds.DeleteSinhvien(masv);
					napvaoBang();
				}
			}else {
				JOptionPane.showMessageDialog(null, "Khong ton tai masv" +masv);
				return;
			}
		}
	} catch (Exception e2) {
		JOptionPane.showMessageDialog(null, "Loi");
		return;
		
	}
	
}else if (e.getSource().equals(bttSave)) {
		try { 
			FileOutputStream out = new FileOutputStream(FILENAME);
			ObjectOutputStream oos = new ObjectOutputStream(out);
			oos.writeObject(ds);
			oos.close();
			
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, "IO Error");
			return;
			}
	}else if (e.getSource().equals(bttClear)) {
		txtMaso.setText("");
		txtHoten.setText("");
		txtDiemLT.setText("");
		txtDiemTB.setText("");
		txtDiemTH.setText("");
		txtKQ.setText("");
		txtMaso.requestFocus();
		
	}else {
		String masv ="", hoten ="", malop="";
		double diemLT = 0.0, diemTH=0.0;
		Sinhvien sv = null;
		try {
			masv = txtMaso.getText();
			hoten = txtHoten.getText();
			malop = cbMalop.getSelectedItem().toString();
			diemLT = Double.parseDouble(txtDiemLT.getText());
			diemTH = Double.parseDouble(txtDiemTH.getText());
			sv = new Sinhvien(masv, hoten, malop, diemLT, diemTH);
					} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, "Lỗi"+ e2.getMessage());
			return;
			
		}
		if (e.getSource().equals(bttAdd)) {
			if (!ds.addSinhvien(sv)) {
				JOptionPane.showMessageDialog(null, "Trùng ma số");
				return;
			}
			String[] dataRow ={sv.getMssv(), sv.getHoten(),sv.getMalop(), sv.getDiemLT()+"", sv.getDiemTH()+"", sv.diemTB()+ "", sv.ketqua()};
		dfModel.addRow(dataRow);
		
		}else if (e.getSource().equals(bttKQ)) {
			txtDiemTB.setText(sv.diemTB()+"");
			txtKQ.setText(sv.ketqua());
		}
		
		
		
		
	}
	}






}

