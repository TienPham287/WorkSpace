package Tien;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class TestPanle extends JFrame implements ActionListener {
	String[] buttonString = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "%", "/", "*", "=", "x", ".",
			"C", "CE" };
	JButton[] button = new JButton[20];
	JTextArea textArea;

	public TestPanle() {

		JPanel panel = new JPanel();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(5, 4));
		textArea = new JTextArea();
		panel1.add(textArea);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(panel1);
		panel.add(panel2);
		add(panel);
		panel2.setPreferredSize(new Dimension(100, 400));
		textArea.setPreferredSize(new Dimension(300, 100));
		textArea.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		panel2.setBorder(BorderFactory.createLineBorder(Color.black, 1));
//		textArea.setEditable(false);
		textArea.setFont(new Font("segoe ui", Font.BOLD, 20));
		for (int i = 0; i < buttonString.length; i++) {
			button[i] = new JButton(buttonString[i]);
			button[i].setForeground(Color.red);
			panel2.add(button[i]);
			button[i].setBackground(Color.white);
			button[i].setBorder(BorderFactory.createLineBorder(Color.black, 1));
			button[i].setFocusable(false);
			button[i].setFont(new Font("segoe ui", Font.BOLD, 20));
			button[i].setActionCommand(buttonString[i]);
			button[i].addActionListener(this);
		}
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(340, 540);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TestPanle();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			if (e.getSource() == button[i]) {
				textArea.setText(textArea.getText() + buttonString[i]);
			}
		}
		if (e.getSource() == button[19] && e.getSource() == button[18]) {
			textArea.setText(" ");
		}
		if (e.getSource() == button[17]) {

		}
	}
}
