package _1;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Main {
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Layout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton jb1 = new JButton("Button 1");
		JButton jb2 = new JButton("Button 2");
		JButton jb3 = new JButton("Button 3");
		// Define the panel to hold the button
		JPanel panel = new JPanel();
		FlowLayout flowlayout = new FlowLayout();
		flowlayout.setAlignment(FlowLayout.RIGHT);
		flowlayout.setHgap(20);
		panel.setLayout(flowlayout);
		panel.add(jb1);
		panel.add(jb2);
		panel.add(jb3);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
	}
}
