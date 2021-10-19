package _1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class FirstStudy {
	int i=0;
	FirstStudy() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		JButton button1 = new JButton("button1");
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		panel2.add(panel);
		JLabel label = new JLabel();
		label.setText(i+"");
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(button1);
		panel.add(label);
		frame.add(panel2);
		frame.setTitle("first study");
		frame.setSize(300, 300);
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setText(i++ +"");
			}
		});
	}

	public static void main(String[] args) {
		FirstStudy f1 = new FirstStudy();
	}
}
