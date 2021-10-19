package Demo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;



public class Logon extends JFrame implements ActionListener  {
private JButton bttLogon;
private JButton bttExit;
private JTextField txtUser;
private JPasswordField fPass;
public Logon() {
	setTitle("Logon program");
	setSize(500, 400);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	initUI();
	pack();
}
private void initUI() {
	JPanel pnNorth = new JPanel();
	pnNorth.setBorder(BorderFactory.createLineBorder(Color.red));
	JLabel labellogin;
	pnNorth.add(labellogin = new JLabel("Logon"));
	labellogin.setFont(new Font("Arial", Font.BOLD, 30));
	labellogin.setForeground(Color.red);
	add(pnNorth, BorderLayout.NORTH);
	
	JPanel pnWest = new JPanel();
	pnWest.setBorder(BorderFactory.createLineBorder(Color.red));
	//ImageIcon myImage = new ImageIcon("./Swing/Demo/tien.png");
	//pnWest.add(new JLabel(myImage));
	add(pnWest, BorderLayout.WEST);
	
	JPanel pnSouth = new JPanel();
	pnSouth.setBorder(BorderFactory.createLineBorder(Color.RED));
	pnSouth.add(bttLogon = new JButton("Logon"));
	pnSouth.add(bttExit = new JButton("Exit"));
	add(pnSouth, BorderLayout.SOUTH);
	JPanel pnCenter = new JPanel();
	pnCenter.setBorder(BorderFactory.createLineBorder(Color.RED));
	Box b = Box.createVerticalBox();
	Box b1 = Box.createHorizontalBox();
	Box b2 = Box.createHorizontalBox();
	JLabel lbUser, lbPass;
	b1.add(lbUser = new JLabel("User name:"));
	lbUser.setFont(new Font("Arial", Font.BOLD, 15));
	b1.add(txtUser = new JTextField(20));
	
	b2.add(lbPass = new JLabel("Password:"));
	lbPass.setFont(new Font("Arial", Font.BOLD, 15));
	b2.add(fPass = new JPasswordField(20));
	lbPass.setPreferredSize(lbUser.getPreferredSize());
	b.add(Box.createVerticalStrut(50));
	b.add(b1);b.add(Box.createVerticalStrut(10));
	b.add(b2);
	pnCenter.add(b);
	add(pnCenter, BorderLayout.CENTER);
	
	txtUser.addActionListener(this);
	fPass.addActionListener(this);
	bttLogon.addActionListener(this);
	bttExit.addActionListener(this);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	char[] correctPass = {'1','2', '3', '4', '5', '6', '7', '8', '9'};
	if (e.getSource().equals(bttLogon)||e.getSource().equals(txtUser)
	|| e.getSource().equals(fPass)){
		if (txtUser.getText().equalsIgnoreCase("Hung")&& Arrays.equals(fPass.getPassword(), correctPass)) {
			dispose();//login thanh cong
			
			
		}else {
			JOptionPane.showMessageDialog(null, "sai user name hoac password khi dang nhap");
			//txtUser.requestFocus();
		}
	}
	else
			System.exit(0);
	
		
		
	}
public static void main(String[] args) {
	new Logon().setVisible(true);
}
	}
	


