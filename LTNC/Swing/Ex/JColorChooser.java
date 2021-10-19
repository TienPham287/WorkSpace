package Ex;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;



public class JColorChooser  extends JFrame implements ActionListener  {
JButton b;
Color color;
Container c;
JColorChooser(){
	c = getContentPane();
	c.setLayout(new FlowLayout());
	
	b = new JButton("Color");
	b.addActionListener(this);
	c.add(b);
}
	@Override
	public void actionPerformed(ActionEvent e) {
	Color initialcolor = Color.RED;
	Color color = JColorChooser.showDialog(null, "Setlect a color", initialcolor);
	c.setBackground(color);
	
	
	}
	private static Color showDialog(JColorChooser jColorChooser, String string, Color initialcolor) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) {
		JColorChooser ch = new JColorChooser();
		ch.setSize(300,400);
		ch.setVisible(true);
		ch.setTitle("vi du JColorChooser trong java swing");
		ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	







	
}
