package bai3;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import bai2.ArtObject;
import bai2.Painting;

public class Dan extends JFrame implements ActionListener {
	private String[] type1 = { "sơn dầu", "sơn mài", "gốm", "thủy mặc", "đơn sắc", "men" };
	private String[] type2 = { "cổ điển", "hiện đại" };
	private String[] type3 = { "abc", "Pham Thuy Tien" };
	private JLabel label1, label2, label3, label4;
	private JTextField textField1, textField2, textField3;
	private JComboBox comboBox1, comboBox2, comboBox3;
	ArtObject artObject = new ArtObject() {
	};
	List<Painting> list = artObject.listPainting;
	JButton btnThem, btnSx;
	JTextArea table;

	public Dan() {
		this.setTitle("Art Management");
		ImageIcon iconAdd = new ImageIcon(
				new ImageIcon("./2015/bai3/add.jpg").getImage().getScaledInstance(20, 20, DO_NOTHING_ON_CLOSE));// muốn
																												// cho
																												// nó
																												// nhỏ
																												// phải
																												// 2 lần
																												// ImageIcon
		ImageIcon iconTri = new ImageIcon(
				new ImageIcon("./2015/bai3/tamgiac.png").getImage().getScaledInstance(20, 20, DO_NOTHING_ON_CLOSE));// muốn

		this.setLayout(new GridLayout(2, 1));

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		JPanel panel0 = new JPanel();
		panel0.add(new JLabel("CÁC TÁC PHẨM HỘI HỌA"));
		panel.add(panel0);

		JPanel panel1 = new JPanel();
		panel1.add(label1 = new JLabel("Tên tác phẩm"));
		panel1.add(textField1 = new JTextField());
		panel.add(panel1);
		label1.setPreferredSize(new Dimension(100, 30));
		textField1.setPreferredSize(new Dimension(300, 20));

		JPanel panel2 = new JPanel();

		panel2.add(label2 = new JLabel("Năm sáng tác"));
		panel2.add(textField2 = new JTextField());
		panel.add(panel2);

		label2.setPreferredSize(new Dimension(100, 30));
		textField2.setPreferredSize(new Dimension(300, 20));

		JPanel panel3 = new JPanel();
		panel3.add(label3 = new JLabel("Loại tranh"));
		panel3.add(comboBox1 = new JComboBox(type1));
		panel.add(panel3);
		label3.setPreferredSize(new Dimension(100, 30));
		comboBox1.setPreferredSize(new Dimension(300, 20));

		JPanel panel4 = new JPanel();
		panel4.add(label4 = new JLabel("phong cách"));
		panel4.add(comboBox2 = new JComboBox(type2));
		panel.add(panel4);

		label4.setPreferredSize(new Dimension(100, 30));
		comboBox2.setPreferredSize(new Dimension(300, 20));
		JPanel panel5 = new JPanel();
		panel5.add(label4 = new JLabel("Tác giả"));
		panel5.add(comboBox3 = new JComboBox(type3));
		panel.add(panel5);
		label4.setPreferredSize(new Dimension(100, 30));
		comboBox3.setPreferredSize(new Dimension(300, 20));

		JPanel panel6 = new JPanel();
		panel6.add(btnThem = new JButton("Thêm", iconAdd));
		panel6.add(btnSx = new JButton("Sắp xếp", iconTri));
		panel.add(panel6);
		this.add(panel);
		btnThem.addActionListener(this);
		table = new JTextArea();
		btnSx.addActionListener(this);
		table.setEditable(false);
		table.setText("");
		JScrollPane scrollPane = new JScrollPane(table);

		this.add(scrollPane);
		viewPaintinglist();
		setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private void viewPaintinglist() {
		StringBuffer s = new StringBuffer();
		for (int i = 0; i < list.size(); i++) {

			Painting painting = list.get(i);
			s.append((i + 1) + "-" + painting.toString() + "\n");

		}
		table.setText(s.toString());
		table.setFont(new Font("arial", Font.PLAIN, 15));
	}

	public static void main(String[] args) {
		new Dan();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Painting painting = new Painting();
		if (e.getSource() == btnThem) {
			if (textField2.getText().matches("^\\d+$")) {// chu cai
				painting.setArtist(comboBox3.getSelectedItem().toString());
				painting.setTitle(textField1.getText());

				painting.setYear(Integer.parseInt(textField2.getText()));

				list.add(painting);
				textField1.setText(" ");
				textField2.setText("");
				viewPaintinglist();

			} else
				JOptionPane.showMessageDialog(this, "\"Năm sáng tác\" Phải là số nguyên!");

		}

		if (e.getSource() == btnSx) {
			Collections.sort(list, new Comparator<Painting>() {

				@Override
				public int compare(Painting o1, Painting o2) {
					// TODO Auto-generated method stub
					return o1.getTitle().compareToIgnoreCase(o2.getTitle());

				}

			});
			viewPaintinglist();
		}

	}

}
