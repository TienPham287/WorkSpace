package Ex;

import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayer;
import javax.swing.JPasswordField;

public class JPasswordEx extends JFrame {
private static GraphicsConfiguration title;
public JPasswordEx( ) {
	super(title);
	setLayout(new FlowLayout());
	JLabel lbPassword = new JLabel("Password");
	add(lbPassword);
	JPasswordField Password = new JPasswordField(20);
	Password.setEchoChar('*');
	add(Password);
	setSize(300, 200);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
public static void main(String[] args) {
	new JPasswordEx();
	
}
}
