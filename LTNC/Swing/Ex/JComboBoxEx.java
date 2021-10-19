package Ex;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBoxEx extends JFrame{
private String[] flagTitles = {"Viet Nam", "Canada", "China", "France", "Germany"};
private JComboBox cbo = new JComboBox();

	public JComboBoxEx() {
		add(cbo, BorderLayout.CENTER);
		setVisible(true);
		setSize(300, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JComboBox();
	}
}




