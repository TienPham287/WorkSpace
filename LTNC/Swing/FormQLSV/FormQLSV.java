package FormQLSV;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class FormQLSV extends JFrame implements ActionListener {
	private JButton btAdd;
	private JButton btUpdate;
	private JButton btRemove;
	private JButton btClear;
	private JTextField txtMaSV;
	private JTextField txtHoten;
	private JTextField txtTuoi;
	private DefaultListModel model;
	private JList listSinhvien;

	public FormQLSV(String title) {
		super(title);
		initUI();
		addAction();
	}

	private void addAction() {
		btAdd.addActionListener(this);
		btUpdate.addActionListener(this);
		btRemove.addActionListener(this);
		btClear.addActionListener(this);

	}

	private void initUI() {
		setSize(600, 350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		JPanel pnBorder = new JPanel(new BorderLayout());
		// Bắt đầu North
		JPanel pnNorth = new JPanel();
		Font title = new Font("tahoma", Font.BOLD, 18);

		JLabel lbTitle = new JLabel("THÔNG TIN SINH VIÊN");
		lbTitle.setFont(title);
		lbTitle.setForeground(Color.RED);
		pnNorth.add(lbTitle);
		pnBorder.add(pnNorth, BorderLayout.NORTH);
		// Kết thúc vùng North

		// Bắt đầu vùng South
		JPanel pnSouth = new JPanel();
		btAdd = new JButton("Add");
		pnSouth.add(btAdd);
		btRemove = new JButton("Remove");
		pnSouth.add(btRemove);
		btUpdate = new JButton("Update");
		pnSouth.add(btUpdate);
		btClear = new JButton("Clear");
		pnSouth.add(btClear);

		pnBorder.add(pnSouth, BorderLayout.SOUTH);
		// Kết thúc Vùng South
		// Bắt đầu vùng West

		JPanel pnWest = new JPanel();
		Border borderWest = BorderFactory.createLineBorder(Color.RED);
		TitledBorder titleBorder = new TitledBorder(borderWest, "Danh sách sinh viên");
		pnWest.setBorder(titleBorder);
		model = new DefaultListModel();
		model.addElement("Lê Văn Thế");
		model.addElement("Phạm Thùy Tiên");
		model.addElement("Nguyễn Thị Tiên");

		listSinhvien = new JList();
		listSinhvien.setModel(model);

		listSinhvien.setPreferredSize(new Dimension(100, 200));

		pnWest.add(listSinhvien);
		pnBorder.add(pnWest, BorderLayout.WEST);

		// Kết thúc vùng West
		// Bắt đầu vùng Center
		JPanel panelCenter = new JPanel();
		JPanel pnLabel = new JPanel();
		pnLabel.setLayout(new BoxLayout(pnLabel, BoxLayout.Y_AXIS));

		JLabel lblMaSV = new JLabel("Mã SV:");

		JLabel lblHoten = new JLabel("Họ tên:");

		JLabel lblTuoi = new JLabel("Tuoi:");
		pnLabel.add(lblMaSV);
		pnLabel.add(Box.createVerticalStrut(25));
		pnLabel.add(lblHoten);
		pnLabel.add(Box.createVerticalStrut(25));
		pnLabel.add(lblTuoi);

		JPanel pnTextField = new JPanel();
		pnTextField.setLayout(new BoxLayout(pnTextField, BoxLayout.Y_AXIS));
		txtTuoi = new JTextField(20);
		txtMaSV = new JTextField(20);
		txtHoten = new JTextField(20);

		pnTextField.add(txtMaSV);
		pnTextField.add(Box.createVerticalStrut(25));
		pnTextField.add(txtHoten);
		pnTextField.add(Box.createVerticalStrut(25));
		pnTextField.add(txtTuoi);

		panelCenter.add(pnLabel);
		panelCenter.add(pnTextField);

		pnBorder.add(panelCenter, BorderLayout.CENTER);

		add(pnBorder);
	}

	public static void main(String[] args) {
		new FormQLSV("Quản Lí Sinh Viên").setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Clear")) {
			txtMaSV.setText("");
			txtHoten.setText("");
			txtTuoi.setText("");

		} else if (e.getActionCommand().equals("Add")) {
			String maSV = txtMaSV.getText().trim();
			String hoTen = txtHoten.getText().trim();
			String Tuoi = txtTuoi.getText().trim();
			model.addElement(hoTen);
			JOptionPane.showMessageDialog(rootPane, "Lưu sinh viên thành công ");

		} else if (e.getActionCommand().equals("Remove")) {
			int index = listSinhvien.getSelectedIndex();

			if (index >= 0) {
				model.remove(index);
				JOptionPane.showMessageDialog(rootPane, "Xóa thành công");

			} else {
				JOptionPane.showMessageDialog(rootPane, "Bạn phải chọn ít nhất một người để xoá");
			}
		} else if (e.getActionCommand().equals("Update")) {
			System.out.println("chaỵ vào nút Update");

		}
	}
}
