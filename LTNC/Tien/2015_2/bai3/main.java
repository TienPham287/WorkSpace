package bai3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class main extends JFrame implements ActionListener {
	private JCheckBox checkbox;
	private JButton button;
	private JLabel label1, labelPhuong, labelQuan, labelThanhPho;
	private String s[] = { "Nguyễn Tấn Khởi", "Nguyễn Xí", "Nguyễn Xuân An", "Hồ Thanh Hà" };
	private String s1[] = { "Vũ Thái Hòa", "Đỗ Thị Thanh Hương", "Lâm Quốc Quân", "Hồ Thị Lan", "Nguyễn Văn Kiên",
			"Nguyễn Tân Phát" };
	private String s2[] = { "Lê Vũ Chương", "Nguyễn Hữu Thịnh", "Huỳnh Thành An", "Phạm Văn Cảnh", "Tạ Thị Kim Chi",
			"Đặng Quốc Cường", "Trần Hữu Dân" };
	JCheckBox[] cbPhuong = new JCheckBox[s.length];
	JCheckBox[] cbQuan = new JCheckBox[s1.length];
	JCheckBox[] cbThanhPho = new JCheckBox[s2.length];
	JPanel panel1, panel2, panel3;
	static List<String> phuong = new ArrayList<String>();
	static List<String> quan = new ArrayList<String>();
	static List<String> thanhPho = new ArrayList<String>();

	public main() {
		View();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
		setLocationRelativeTo(null);

	}

	public void View() {
		JPanel panel = new JPanel();
		JPanel panelTop = new JPanel();
		JPanel panelBot = new JPanel();
		panel.setLayout(new GridLayout(1, 3));
		panelBot.setLayout(new BorderLayout());
		panelBot.add(button = new JButton("BỎ PHIẾU"), BorderLayout.EAST);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				KQ kq = new KQ();
				setVisible(false);
//				setContentPane(kq);
			}
		});
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel1.setBorder(
				BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLUE), "CẤP PHƯỜNG(chọn 3)"));
		panel2.setBorder(
				BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLUE), "CẤP QUẬN(chọn 4)"));
		panel3.setBorder(
				BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLUE), "CẤP THÀNH PHỐ(chọn 5)"));
		panel.add(panel1);
		panel.add(panel2);
		panel.add(panel3);
		label1 = new JLabel("PHIẾU BẦU CỬ CÁC CẤP", JLabel.CENTER);
		panelTop.add(label1);

		panelTop.setBackground(Color.YELLOW);
		panelTop.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(panelTop, BorderLayout.NORTH);
		panel1.setLayout(new GridLayout(s.length + 1, 1));
		panel2.setLayout(new GridLayout(s1.length + 1, 1));
		panel3.setLayout(new GridLayout(s2.length + 1, 1));

		for (int i = 0; i < s.length; i++) {
			panel1.add(cbPhuong[i] = new JCheckBox(s[i]));
			cbPhuong[i].addActionListener(this);
		}
		for (int i = 0; i < s1.length; i++) {
			panel2.add(cbQuan[i] = new JCheckBox(s1[i]));
			cbQuan[i].addActionListener(this);
		}
		for (int i = 0; i < s2.length; i++) {
			panel3.add(cbThanhPho[i] = new JCheckBox(s2[i]));
			cbThanhPho[i].addActionListener(this);
		}

		panel1.add(labelPhuong = new JLabel("Số người đã chọn: 0"));
		panel2.add(labelQuan = new JLabel("Số người đã chọn: 0"));
		panel3.add(labelThanhPho = new JLabel("Số người đã chọn: 0"));
		phuong.add("phiếu không hợp lệ ");
		quan.add("phiếu không hợp lệ ");
		thanhPho.add("phiếu không hợp lệ ");
		getContentPane().add(panelBot, BorderLayout.SOUTH);
		getContentPane().add(panel, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		new main();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int count1 = 0;

		for (int i = 0; i < cbPhuong.length; i++) {
			if (cbPhuong[i].isSelected()) {
				count1++;
				phuong.add(s[i]);
			}
		}

		labelPhuong.setText("Số người đã chọn: " + count1);
		int count2 = 0;
		for (int i = 0; i < cbQuan.length; i++) {
			if (cbQuan[i].isSelected()) {
				count2++;
				quan.add(s1[i]);
			}
		}
		labelQuan.setText("Số người đã chọn: " + count2);

		int count3 = 0;
		for (int i = 0; i < cbThanhPho.length; i++) {
			if (cbThanhPho[i].isSelected()) {
				count3++;
				thanhPho.add(s2[i]);
			}
		}
		labelThanhPho.setText("Số người đã chọn: " + count3);
		
		if (count1 != 3 || count2 != 4 || count3 != 5) {
			phuong.clear();
			quan.clear();
			thanhPho.clear();
			phuong.add("phiếu không hợp lệ ");
			quan.add("phiếu không hợp lệ ");
			thanhPho.add("phiếu không hợp lệ ");
		}

	}
}
