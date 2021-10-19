package Ex;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;


public class FormEx extends JFrame {
public FormEx(String title) {
	super(title);
	initUI();  
	
}

private void initUI() {
	this.setSize(700, 400);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	JPanel panel = new JPanel(new BorderLayout(5, 5));
	setAlwaysOnTop(true);
	// Taá»� vung North
	JPanel paNorth = new JPanel();
	JLabel lbTitle = new JLabel("Giai phÆ°Æ¡ng trÃ¬nh báº­c 2");
	lbTitle.setFont(new Font("Tahoma", Font.BOLD, 32));
	paNorth.setBackground(Color.gray);
	paNorth.add(lbTitle);
	panel.add(paNorth, BorderLayout.NORTH);
	// Káº¿t thÃºc vÃ¹ng táº¡o North
	// taá»� vÃ¹ng south
	JPanel paSouth = new JPanel();
	//Táº¡o Ä‘Æ°á»�ng viá»�n
	Border borderSouth = BorderFactory.createLineBorder(Color.red);
	TitledBorder titleBorderSouth = new TitledBorder(borderSouth, "Chá»�n tÃ¡c vá»¥");
	
	paSouth.setBorder(titleBorderSouth);
	JButton btnGiai = new JButton("Giai");
	JButton btnXoa = new JButton("XÃ³a Tráº¯ng");
	JButton btnThoat = new JButton("ThoÃ¡t");
	paSouth.add(btnThoat);
	paSouth.add(btnXoa);
	paSouth.add(btnGiai);
	
	
	panel.add(paSouth, BorderLayout.SOUTH);
	//KÃ©t thÃºc táº¡o vÃ¹ng South
	// taá»� vÃ¹ng Center
		JPanel paCenter = new JPanel();
		paCenter.setLayout(new BoxLayout(paCenter, BoxLayout.Y_AXIS));
		//Táº¡o Ä‘Æ°á»�ng viá»�n
		Border borderCenter = BorderFactory.createLineBorder(Color.BLUE);
		TitledBorder titleBorderCenter = new TitledBorder(borderCenter, "Nháº­p a, b, c");
		
		paCenter.setBorder(titleBorderCenter);
		JPanel pnA = new JPanel();
		pnA.add(new JLabel("a:"));
		pnA.add(new JTextField(20));
		paCenter.add(pnA);
		
		JPanel pnB = new JPanel();
		pnB.add(new JLabel("b:"));
		pnB.add(new JTextField(20));
		paCenter.add(pnB);
		
		JPanel pnC = new JPanel();
		pnC.add(new JLabel("c:"));
		pnC.add(new JTextField(20));
		paCenter.add(pnC);
		
		
		JPanel pntextKQ = new JPanel();
		pntextKQ.add(new JLabel("Káº¿t quáº£: "));
		paCenter.add(pntextKQ);
		
		JPanel pnKQ = new JPanel();
		
		JTextField txtKQ = new JTextField(20);
		pnKQ.add(txtKQ);
		txtKQ.setEditable(false);
		paCenter.add(pnKQ);


		panel.add(paCenter, BorderLayout.CENTER);
	//Ä�Æ°a vÃ o frame
	add(panel);

}
public static void main(String[] args) {
	new FormEx("Giáº£i phÆ°Æ¡ng trÃ¬nh báº­c 2").setVisible(true);
}
}
