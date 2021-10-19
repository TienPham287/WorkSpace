package Ex;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class FormEx1 extends JFrame {
	public FormEx1(String Title) {
		super(Title);
		initUI();

	}

	public void initUI() {
		setSize(700, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setAlwaysOnTop(true);

		JPanel pnBorderLayout = new JPanel(new BorderLayout());
		// Tao vung North
		JPanel pnNorth = new JPanel();
		JLabel label = new JLabel("Cộng Trừ Nhân Chia");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("tahoma", Font.BOLD, 36));

		pnNorth.add(label);
		pnBorderLayout.add(pnNorth, BorderLayout.NORTH);
		// kết thúc vùng North
		// tạo vung West

		JPanel pnWest = new JPanel();
		pnWest.setPreferredSize(new Dimension(100, 0));
		pnWest.setLayout(new BoxLayout(pnWest, BoxLayout.Y_AXIS));
		pnWest.setBackground(Color.GRAY); 
		Border borderWest = BorderFactory.createLineBorder(Color.RED);
		TitledBorder titledBorderWest = new TitledBorder(borderWest, "Chọn Tác vụ");
		pnWest.setBorder(titledBorderWest);
	
		JButton btnGiai = new JButton("Gỉai   ");
		JButton btnXoa = new JButton("Xoa   ");
		JButton btnThoat = new JButton("Thoát");
		pnWest.add(Box.createVerticalStrut(10));
		pnWest.add(btnGiai);
		
		pnWest.add(Box.createVerticalStrut(10));
		pnWest.add(btnXoa);
		
		pnWest.add(Box.createVerticalStrut(10));
		pnWest.add(btnThoat);

		pnBorderLayout.add(pnWest, BorderLayout.WEST);
		// kết thúc vùng West 
		
		//Bắt đầu tạo vùng South
		JPanel pnSouth = new JPanel();
		pnSouth.setPreferredSize(new Dimension(30, 50));
		pnSouth.setBackground(Color.PINK);
		JPanel pnBox1 = new JPanel();
		pnBox1.setPreferredSize(new Dimension(15, 15));
		pnBox1.setBackground(Color.BLUE);
		JPanel pnBox2 = new JPanel();
		pnBox2.setPreferredSize(new Dimension(15, 15));
		pnBox2.setBackground(Color.YELLOW);
		JPanel pnBox3 = new JPanel();
		pnBox3.setBackground(Color.RED);
		pnBox3.setPreferredSize(new Dimension(15, 15));
		pnSouth.add(pnBox1);
		pnSouth.add(pnBox2);
		pnSouth.add(pnBox3);
		// ket thuc vung South
		
		//Tao vung Center
		JPanel pnCenter = new JPanel();
		
		
		
		
		pnBorderLayout.add(pnSouth, BorderLayout.SOUTH);
		add(pnBorderLayout);

	}

	public static void main(String[] args) {
		new FormEx1("Base Caculator").setVisible(true);
		;
	}
}
