package bai3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class KQ extends JFrame {
	private JPanel panel1, panel2, panel3;
	JLabel label;
	JTextArea text1, text2, text3;
	JButton button;

	public KQ() {

		setLayout(new BorderLayout());
		add(label = new JLabel("KQ bầu cử"), BorderLayout.NORTH);
		label.setFont(new Font("arial", Font.PLAIN, 30));
		JPanel panelBot = new JPanel();
		panelBot.add(button = new JButton("Thoat"));
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main main = new main();
				main.setVisible(true);
				setVisible(false);
			}
		});
		add(panelBot, BorderLayout.SOUTH);
		JPanel panelCen = new JPanel();
		add(panelCen, BorderLayout.CENTER);
		panelCen.setLayout(new GridLayout(1, 3));
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLUE), "PHƯỜNG"));
		panel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLUE), "QUẬN"));
		panel3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLUE), "THÀNH PHỐ"));
		panel1.setBackground(Color.white);
		panel2.setBackground(Color.white);
		panel3.setBackground(Color.white);
		panelCen.add(panel1);
		panelCen.add(panel2);
		panelCen.add(panel3);

		panel1.add(text1 = new JTextArea(toString(main.phuong)));
		panel2.add(text2 = new JTextArea(toString(main.quan)));
		panel3.add(text3 = new JTextArea(toString(main.thanhPho)));
		text1.setEditable(false);
		text2.setEditable(false);
		text3.setEditable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(500, 500);
	}

	public String toString(List<String> list) {
		StringBuffer s = new StringBuffer();
		for (String st : list) {
			s.append(st + "\n");
		}
		return s.toString();
	}
}
