package Anhiu2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.xml.transform.Source;

public class Huudan2 extends JFrame implements ActionListener {
	private JPanel panelCen;
	private JLabel lb, label;
	private String[] hocSinh = { "phan ban", "khong phan ban" };
	private String[] sinhVien = { "ki thuat", "xa hoi" };
	private String[] kiSu = { "co khi", "CNTT" };
	private JComboBox<String> db;
	private JRadioButton jrHocSinh, jrSinhVien, jrKiSu;
	private JCheckBox cbDocBao, cbDocSach, cbNgheNhac;
	private String text = "";

	public Huudan2() {
		// TODO Auto-generated constructor stub
		view();
		setSize(500, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	private void view() {
		// TODO Auto-generated method stub
		setLayout(new BorderLayout());
		panelCen = new JPanel();
		panelCen.setLayout(new GridLayout(4, 2));
		panelCen.add(lb = new JLabel("Nghe nghiep"));
		panelCen.add(db = new JComboBox<String>(hocSinh));
		panelCen.add(jrHocSinh = new JRadioButton("Hoc sinh"));
		panelCen.add(cbDocBao = new JCheckBox("Doc bao"));
		panelCen.add(jrSinhVien = new JRadioButton("Sinh Vien"));
		panelCen.add(cbDocSach = new JCheckBox("Doc Sach"));
		panelCen.add(jrKiSu = new JRadioButton("Ky Su"));
		panelCen.add(cbNgheNhac = new JCheckBox("Nghe Nhac"));
		jrHocSinh.setSelected(true);
		ButtonGroup btgr = new ButtonGroup();
		btgr.add(jrHocSinh);
		btgr.add(jrSinhVien);
		btgr.add(jrKiSu);
		JPanel panel = new JPanel();
		add(panel, BorderLayout.SOUTH);
		panel.setBackground(Color.white);
		panel.add(label = new JLabel("ANH YEU EM 3000"));
		add(panelCen);
		jrHocSinh.addActionListener(this);
		jrSinhVien.addActionListener(this);
		jrKiSu.addActionListener(this);
		cbDocBao.addActionListener(this);
		cbDocSach.addActionListener(this);
		cbNgheNhac.addActionListener(this);
		db.addActionListener(this);
	}

	public static void main(String[] args) {
		new Huudan2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String stDocBao = "", stNgheNhac = "", stDocSach = "", combobx, st = "";

		if (e.getSource() == jrHocSinh) {
			db.removeAllItems();
			for (int i = 0; i < hocSinh.length; i++) {
				db.addItem(hocSinh[i]);
			}
			text = "học sinh";
		}
		if (e.getSource() == jrSinhVien) {
			db.removeAllItems();
			for (int i = 0; i < sinhVien.length; i++) {
				db.addItem(sinhVien[i]);
			}
			text = "sinh vien";
		}
		if (e.getSource() == jrKiSu) {
			db.removeAllItems();
			for (int i = 0; i < kiSu.length; i++) {
				db.addItem(kiSu[i]);
			}
			text = "ki su";
		}

		for (int i = 0; i < 2; i++) {
			if (db.getSelectedIndex() == i) {
				combobx = db.getSelectedItem().toString();

				if (cbDocBao.isSelected())
					stDocBao = " doc bao,";

				if (cbDocSach.isSelected())
					stDocSach = " doc sach,";

				if (cbNgheNhac.isSelected())
					stNgheNhac = " nghe nhac,";

				st = text + " " + combobx + " thich: " + stDocBao + stDocSach + stNgheNhac;
				StringBuffer sb = new StringBuffer();
				char[] ch = st.toCharArray();
				for (int j = 0; j < ch.length; j++) {
					if (ch[ch.length - 1] == ',') {
						if (j < ch.length -1)
							sb.append(ch[j]);
					} else
						sb.append(ch[j]);
				}
				
				label.setText(sb.toString());

			}
		}

	}
}
