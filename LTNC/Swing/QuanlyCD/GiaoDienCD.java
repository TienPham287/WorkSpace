package QuanlyCD;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class GiaoDienCD extends JFrame implements ActionListener, MouseListener {
	private static final String FILENAME = "DSCD";
	private JTextField tfMaso;
	private JTextField tfTua;
	private JTextField tfCasy;
	private JTextField tfGiathanh;
	private JTextField tfsobaihat;
	private JButton btThem;
	private JButton btLuu;
	private JButton btXoa;
	private JButton btSua;
	private JButton btTim;
	private JTable table;
	private DefaultTableModel dfModel;
	private JButton btClear;
	private DanhSachCD ds;

	public GiaoDienCD() {
		setTitle("Chương trình quản lí CD");
		setSize(1000, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		buildGUI();
		createDB();
	}

	/*
	 * Tạo danh sách dữ liệu null Nễu tồn tại file dữ liệu trước đó thì nạp từ file
	 * lên trên bảng, ngược lại khởi tạo danh sách
	 */
	private void createDB() {
		if (new File(FILENAME).exists())
			napDuLieu();
		else
			ds = new DanhSachCD();

	}

	private void napDuLieu() {
		FileInputStream in = null;
		ObjectInputStream ois = null;
		try {
			in = new FileInputStream(FILENAME);
			ois = new ObjectInputStream(in);
			ds = (DanhSachCD) ois.readObject();
			ois.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Lỗi IO");
			return;
		}
		napvaobang();

	}

	public void buildGUI() {
		Box b = Box.createVerticalBox();
		Box b1 = Box.createHorizontalBox();
		Box b2 = Box.createHorizontalBox();
		Box b3 = Box.createHorizontalBox();
		Box b4 = Box.createHorizontalBox();
		Box b5 = Box.createHorizontalBox();
		Box b6 = Box.createHorizontalBox();
		Box b7 = Box.createHorizontalBox();

		b1.add(new JLabel("THÔNG TIN CD"), JLabel.CENTER);
		JLabel lbMaSo, lbTuaDe, lbCasy, lbSoBaiHat, lbGia;
		b2.add(lbMaSo = new JLabel("Mã Số"));
		b2.add(tfMaso = new JTextField(20));
		b3.add(lbTuaDe = new JLabel("Tựa Đề"));
		b3.add(tfTua = new JTextField(20));
		b4.add(lbCasy = new JLabel("Ca Sỹ"));
		b4.add(tfCasy = new JTextField(20));
		b5.add(lbSoBaiHat = new JLabel("Số bài hát"));
		b5.add(tfsobaihat = new JTextField(20));
		b6.add(lbGia = new JLabel("Gía Thành"));
		b6.add(tfGiathanh = new JTextField(20));
		lbCasy.setPreferredSize(lbSoBaiHat.getPreferredSize());
		lbMaSo.setPreferredSize(lbSoBaiHat.getPreferredSize());
		lbTuaDe.setPreferredSize(lbSoBaiHat.getPreferredSize());
		lbGia.setPreferredSize(lbSoBaiHat.getPreferredSize());
		lbCasy.setPreferredSize(lbSoBaiHat.getPreferredSize());

		b7.add(btThem = new JButton("Thêm"));
		btThem.setMnemonic('T');
		b7.add(btClear = new JButton("Clear"));
		btClear.setMnemonic('C');

		b7.add(btLuu = new JButton("Lưu"));
		btLuu.setMnemonic('L');

		b7.add(btXoa = new JButton("Xóa"));
		btXoa.setMnemonic('X');

		b7.add(btSua = new JButton("Sữa"));
		btSua.setMnemonic('S');
		b7.add(btTim = new JButton("Tim"));
		btTim.setMnemonic('T');

		btThem.addActionListener(this);
		btClear.addActionListener(this);
		btLuu.addActionListener(this);
		btXoa.addActionListener(this);
		btSua.addActionListener(this);
		btTim.addActionListener(this);
		b.add(Box.createVerticalStrut(5));
		b.add(b1);
		b.add(Box.createVerticalStrut(5));
		b.add(b2);
		b.add(Box.createVerticalStrut(5));
		b.add(b3);
		b.add(Box.createVerticalStrut(5));
		b.add(b4);
		b.add(Box.createVerticalStrut(5));
		b.add(b5);
		b.add(Box.createVerticalStrut(5));
		b.add(b6);
		b.add(Box.createVerticalStrut(5));
		b.add(b7);
		b.add(Box.createVerticalStrut(5));
		JPanel pnl;
		b.add(pnl = new JPanel(new GridLayout(1, 1)));
		String[] headers = { "STT", "Mã CD", "Tựa CD", "Ca sỹ", "Số bài hát", "Đơn Gía" };
		pnl.add(new JScrollPane(table = new JTable(dfModel = new DefaultTableModel(headers, 0))));
		table.addMouseListener(this);
		add(b);
	}

	public static void main(String[] args) {
		new GiaoDienCD().setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		tableAction();
	}

	public void tableAction() {
		int viTri = table.getSelectedRow();
		if (viTri >= 0 && viTri <= ds.tongCD()) {
			Cd cd = ds.getCD(viTri); 
			napvaocacOduLieu(cd);
		}
	}

	private void napvaocacOduLieu(Cd cd) {
		tfMaso.setText(cd.getMaCD());
		tfTua.setText(cd.getTuaCD());
		tfCasy.setText(cd.getCasy());
		tfsobaihat.setText(cd.getSoBaiHat() + "");
		tfGiathanh.setText(cd.getGiathanh() + "");
		tfMaso.requestFocus();

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
		if (e.getSource().equals(btThem))
			themAction();
		else if (e.getSource().equals(btClear))
			clearAction();
		else if (e.getSource().equals(btLuu))
			luuAction();
		else if (e.getSource().equals(btTim))
			timAction();
		else if (e.getSource().equals(btSua))
			suaAction();
		else if (e.getSource().equals(btXoa))
			xoaAction();
	}

	private void xoaAction() {
		String maCD = JOptionPane.showInputDialog("Nhập mã CD cần xóa: ");
		if (maCD != null && !maCD.trim().equals("")) {
			Cd cd = ds.timkiem(maCD);
			if (cd != null) {
				if (JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn không?", "Thôn báo ",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					ds.xoaCD(maCD);
					napvaobang();
					clearAction();
				}

			} else {
				JOptionPane.showMessageDialog(null, "Không tìm thấy");
				return;
			}
		}
	}

	private void suaAction() {
		String maCD, tuaCD, casy;
		int soBaiHat;
		double giathanh;
		try {
			maCD = tfMaso.getText();
			tuaCD = tfTua.getText();
			casy = tfCasy.getText();
			soBaiHat = Integer.parseInt(tfsobaihat.getText());
			giathanh = Double.parseDouble(tfGiathanh.getText());
			if (!ds.capnhat(maCD, tuaCD, casy, soBaiHat, giathanh)) {
				JOptionPane.showMessageDialog(null, "cập nhật Không thành công");
				tfMaso.selectAll();
				tfMaso.requestFocus();
				return;
			} else
				napvaobang();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
			return;
		}

	}

	private void timAction() {
		String maCD = JOptionPane.showInputDialog("Nhập mã CD càn tìm: ");
		if (maCD != null && !maCD.trim().equals("")) {
			Cd cd = ds.timkiem(maCD);
			if (cd != null) {
				napvaocacOduLieu(cd);

			} else {
				JOptionPane.showMessageDialog(null, "Không tìm thấy");
				return;
			}
		}
	}

	private void luuAction() {
		FileOutputStream out = null;
		ObjectOutputStream oos = null;
		try {
			out = new FileOutputStream(FILENAME);
			oos = new ObjectOutputStream(out);
			oos.writeObject(ds);
			oos.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Lỗi");
			return;
		}
	}

	private void themAction() {
		Cd cd = null;
		String maCD, tuaCD, casy;
		int soBaiHat;
		double Giathanh;
		try {
			maCD = tfMaso.getText().toUpperCase();
			tuaCD = tfTua.getText();
			casy = tfCasy.getText();
			soBaiHat = Integer.parseInt(tfsobaihat.getText());
			Giathanh = Double.parseDouble(tfGiathanh.getText());
			cd = new Cd(maCD, tuaCD, casy, soBaiHat, Giathanh);
			if (!ds.themCd(cd)) {
				JOptionPane.showMessageDialog(null, "Trùng mã CD");
				tfMaso.selectAll();
				tfMaso.requestFocus();
			} else {
				napvaobang();

			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return;
		}
	}

	private void napvaobang() {
		dfModel.setRowCount(0);
		for (int i = 0; i < ds.tongCD(); i++) {
			Cd cd = ds.getCD(i);
			String[] row = { (i + 1) + "", cd.getMaCD(), cd.getTuaCD(), cd.getCasy(), cd.getSoBaiHat() + "",
					new DecimalFormat("#,##0.00").format(cd.getGiathanh()) };
			dfModel.addRow(row);
		}

	}

	private void clearAction() {
		tfMaso.setText("");
		tfTua.setText("");

		tfsobaihat.setText("");
		tfCasy.setText("");

		tfGiathanh.setText("");
		tfMaso.requestFocus();

	}

}
