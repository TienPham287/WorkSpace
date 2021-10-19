package _1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class MySpringLayout {

	public MySpringLayout() {
		JFrame frame = new JFrame();
		
		JLabel label = new JLabel("Tien");
        JLabel label1 = new JLabel("Dan");
        JTextField textfield = new JTextField(10);
        JTextField textfield1 = new JTextField(10);
        JPanel panel = new JPanel();
        SpringLayout sp = new SpringLayout();
        panel.setLayout(sp);
        panel.add(label);
        panel.add(textfield1);
        panel.add(label1);
        panel.add(textfield);
        
        sp.putConstraint(SpringLayout.WEST, textfield, 50, SpringLayout.WEST, panel);
        sp.putConstraint(SpringLayout.NORTH, textfield, 10, SpringLayout.NORTH, panel);
        
        sp.putConstraint(SpringLayout.WEST, label, 10, SpringLayout.WEST, panel);
        sp.putConstraint(SpringLayout.NORTH, label, 10, SpringLayout.NORTH, panel);

        sp.putConstraint(SpringLayout.WEST, textfield1, 50, SpringLayout.WEST, panel);
        sp.putConstraint(SpringLayout.NORTH, textfield1, 50, SpringLayout.NORTH, panel);
        
        sp.putConstraint(SpringLayout.WEST, label1, 10, SpringLayout.WEST, panel);
        sp.putConstraint(SpringLayout.NORTH, label1, 50, SpringLayout.NORTH, panel);
        
  
        frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 400);
        frame.add(panel);
        
     
	}
	public static void main(String[] args) {
		new MySpringLayout();
	}
}
