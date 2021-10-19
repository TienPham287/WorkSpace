package _1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("JOptionPane showMessageDialog example");
		JOptionPane.showMessageDialog(frame, "Message Example", "Title Example", JOptionPane.INFORMATION_MESSAGE);

	}
}
