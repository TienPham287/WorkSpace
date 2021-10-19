package Demo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;


public class Congtrunhanchia extends JFrame{
public Congtrunhanchia(String title) {
	setTitle(title);
}
public void doShow() {
	setSize(500, 400);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	addControl();
	setResizable(false);
	setVisible(true);
}
public void addControl() {
	JPanel pnBorder = new JPanel();
	pnBorder.setLayout(new BorderLayout());
	JPanel pnNorth = new JPanel();
	JLabel lblTiltle = new JLabel("Cong Tru Nhan Chia");
	pnNorth.add(lblTiltle);
	pnBorder.add(pnNorth, BorderLayout.NORTH);
	lblTiltle.setForeground(Color.BLUE);
	lblTiltle.setFont(new Font("arial", Font.BOLD, 25));
	
	JPanel pnWest = new JPanel();
	pnWest.setLayout(new BoxLayout(pnWest, BoxLayout.Y_AXIS));
	JButton bntGiai = new JButton("Giai");
	JButton bntXoa = new JButton("Xoa");
	JButton bntThoat = new JButton("Thoat");
	pnWest.add(bntGiai);
	pnWest.add(Box.createVerticalStrut(10));
	pnWest.add(bntXoa);
	pnWest.add(Box.createVerticalStrut(10));
	pnWest.add(bntThoat);
	pnBorder.add(pnWest , BorderLayout.WEST);
	pnWest.setBackground(Color.LIGHT_GRAY);
	Border southBorder = BorderFactory.createLineBorder(Color.RED);
	TitledBorder southttBorder= new TitledBorder(southBorder, "Chon tac vu");
	pnWest.setBorder(southttBorder);
	
	JPanel pnSouth = new JPanel();
	pnSouth.setPreferredSize(new Dimension(10, 30));
	pnSouth.setBackground(Color.PINK);
	JPanel pns1 = new JPanel();
	pns1.setBackground(Color.BLUE);
	JPanel pns2 = new JPanel();
	pns2.setBackground(Color.RED);
	JPanel pns3 = new JPanel();
	pns3.setBackground(Color.YELLOW);
	pnSouth.add(pns1);
	pnSouth.add(pns2);
	pnSouth.add(pns3);
	pnBorder.add(pnSouth, BorderLayout.SOUTH);
	
	JPanel pnCenter = new JPanel();
	pnCenter.setLayout(new BoxLayout(pnCenter, BoxLayout.Y_AXIS));
	pnBorder.add(pnCenter, BorderLayout.CENTER);
	Border centerBorder = BorderFactory.createLineBorder(Color.RED);
	TitledBorder centerttBorder = new TitledBorder(centerBorder, "Nhap 2 so a va b:");
	pnCenter.setBorder(centerttBorder);
	JPanel pna = new JPanel();
	JLabel lbla = new JLabel("Nhap a:");
	final JTextField txta =new JTextField(15);
	pna.add(lbla);
	pna.add(txta);
	pnCenter.add(pna);
	JPanel pnb = new JPanel();
	JLabel lblb = new JLabel("Nhap b:");
	final JTextField txtb =new JTextField(15);
	pnb.add(lblb);
	pnb.add(txtb);
	pnCenter.add(pnb);
	
	JPanel pnc = new JPanel();
	JPanel pnpheptoan = new JPanel();
	pnpheptoan.setLayout(new GridLayout(2,2));
	pnpheptoan.setBorder(new TitledBorder(BorderFactory.createLineBorder(Color.BLACK)));
	final JRadioButton radCong = new JRadioButton("Cong");
	pnpheptoan.add(radCong);
	final JRadioButton radTru = new JRadioButton("Tru");
	pnpheptoan.add(radTru);
	final JRadioButton radNhan = new JRadioButton("Nhan");
	pnpheptoan.add(radNhan);
	final JRadioButton radChia = new JRadioButton("Chia");
	pnpheptoan.add(radChia);
	ButtonGroup group = new ButtonGroup();
	group.add(radCong);group.add(radTru);
	group.add(radNhan);group.add(radChia);
	pnc.add(pnpheptoan);
	pnCenter.add(pnc);
	
	JPanel pnkq = new JPanel();
		JLabel lbkq = new JLabel("Ket qua");
		final JTextField txtkq = new JTextField(15);
		pnkq.add(lbkq);
		pnkq.add(txtkq);
		pnCenter.add(pnkq);
		
		lbla.setPreferredSize(lbkq.getPreferredSize());
		lblb.setPreferredSize(lbkq.getPreferredSize());
		bntThoat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int ret = JOptionPane.showConfirmDialog(null, "Muon thoat ha", "Thoat", JOptionPane.YES_NO_CANCEL_OPTION);
				if (ret == JOptionPane.YES_OPTION)
					System.exit(0);
			}
		});
	bntXoa.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			txta.setText("");
			txtb.setText("");
			txtkq.setText("");
			txta.requestFocus();
		}
	});	
		bntGiai.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String sa = txta.getText();
				int a=0,b=0;
				try {
					a = Integer.parseInt(sa);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "a nhap sai dinh dang");
					txtb.selectAll();
					txtb.requestFocus();
					return;
				}
				double kq=0;
				if (radCong.isSelected()) {
					kq=(a+b);
				}else if (radTru.isSelected()) {
					kq=(a-b);
				}else if (radNhan.isSelected()) {
					kq=(a*b);
				}
				else{
					kq=(a*1.0/b*1.0);
				}
				txtkq.setText(kq + "");
			}
		});
		Container con = getContentPane();
		con.add(pnBorder);
		
}
public static void main(String[] args) {
	Congtrunhanchia con = new Congtrunhanchia("Cong - tru - nhan - chia");
	con.doShow();
}
}
