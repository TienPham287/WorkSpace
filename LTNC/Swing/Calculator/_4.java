package Calculator;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class _4 extends JFrame implements ActionListener, java.awt.event.KeyListener {

	JPanel panCen, panBot, panMain, panTop, panCen2, panExtra;
	JTextArea text;
	JLabel label;

	JButton[] ButtonsMain = new JButton[30];
	JButton[] ButtonsDisplay = new JButton[6];
	String str2 = "";
	String str = "";

	Font myFont1 = new Font("Edda ", Font.BOLD, 55);
	Font myFont2 = new Font("Edda  ", Font.BOLD, 20);
	Font myFont3 = new Font("Edda  ", Font.ITALIC, 30);

	String buttonsName[] = { "M", "MS", "M-", "M+", "MR", "MC", "%", "C", "CE", "<=", "1", "2", "3", "+", "4", "5", "6",
			"-", "7", "8", "9", "*", ".", "0", ",", "/", "(", "sqrt(", ")", "=" };

	double a = 0, b = 0, c = 0, d = 0, e = 0;

	public _4() {

		// create pannel Main
		panMain = new JPanel();
		panMain.setLayout(new BorderLayout());

		// create pannel center
		panCen = new JPanel();
		panCen.setLayout(new GridLayout(1, 1));

		// create pannel Bot
		panBot = new JPanel();
		panBot.setLayout(new GridLayout(6, 6));
		// create pannel Top
		panTop = new JPanel();
		panTop.setLayout(new GridLayout(1, 1));
		// create pannel cen2
		panCen2 = new JPanel();
		panCen2.setLayout(new GridLayout(1, 5));

		// creat pannel extra
		panExtra = new JPanel();
		panExtra.setLayout(new BorderLayout());

		panExtra.add(panCen);
		panExtra.add(panCen2);
		this.getContentPane().setBackground(Color.black);
		panMain.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		panCen.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		panTop.setBorder(BorderFactory.createLineBorder(Color.red, 1));

		text = new JTextArea();
		text.setWrapStyleWord(true);
		text.setLineWrap(true);
		panBot.setBackground(Color.gray);
		text.setEditable(false);
		panCen.add(text);
		label = new JLabel("CASIO");
		panTop.add(label);
		label.setHorizontalAlignment(JLabel.CENTER);

		for (int i = 0; i < 6; i++) {
			ButtonsDisplay[i] = new JButton(buttonsName[i]);
			ButtonsDisplay[i].addActionListener(this);
			ButtonsDisplay[i].addKeyListener(this);
			ButtonsDisplay[i].setBackground(Color.white);
			panCen2.add(ButtonsDisplay[i]);

		}

		for (int i = 6; i < 30; i++) {
			ButtonsMain[i] = new JButton(buttonsName[i]);
			ButtonsMain[i].addActionListener(this);
			ButtonsMain[i].addKeyListener(this);
			ButtonsMain[i].setFont(myFont2);
			panBot.add(ButtonsMain[i]);
			ButtonsMain[i].setBackground(Color.white);
		}

		panMain.addKeyListener(this);

		label.setForeground(Color.RED);// set font color of text
		label.setFont(myFont1);// set font off text
		panMain.add(panBot, BorderLayout.SOUTH);
		panMain.add(panTop, BorderLayout.NORTH);
		panMain.add(panExtra, BorderLayout.CENTER);
		panExtra.add(panCen, BorderLayout.NORTH);
		panExtra.add(panCen2, BorderLayout.SOUTH);
		panCen.setPreferredSize(new Dimension(100, 100));
		panBot.setPreferredSize(new Dimension(325, 330));
		panTop.setPreferredSize(new Dimension(50, 50));
		panCen2.setPreferredSize(new Dimension(30, 30));

		this.setFocusable(true);
		this.setFocusCycleRoot(true);
		this.addKeyListener(this);
		this.add(panMain);
		this.setSize(350, 550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setTitle("CALCULATOR");
	}

	public static void main(String[] args) {
		new _4();

	}

	public void actionPerformed(ActionEvent e) {

		for (int i = 10; i < 29; i++) {
			if (e.getSource() == ButtonsMain[i]) {
				text.setText(str += (buttonsName[i]));
				text.setFont(myFont3);// set font off text);
			}
		}

		if (e.getSource() == ButtonsMain[29]) { // Addition, Subtraction, Multiplication, Division

			if (str.indexOf("+") != -1) {
				a += Double.parseDouble(str.substring(0, str.indexOf("+")));
				b += Double.parseDouble(str.substring(str.indexOf("+") + 1, str.length()));
				text.setText(String.valueOf(a + b)); // Show result
				str = String.valueOf(a + b);
				a = 0;
				b = 0; // Restart show & vaiable a, b
			}
			if (str.indexOf("-") != -1) {
				a += Double.parseDouble(str.substring(0, str.indexOf("-")));
				b += Double.parseDouble(str.substring(str.indexOf("-") + 1, str.length()));
				text.setText(String.valueOf(a - b)); // Show result
				str = String.valueOf(a - b);
				a = 0;
				b = 0; // Restart show & vaiable a, b
			}
			if (str.indexOf("*") != -1) {
				a += Double.parseDouble(str.substring(0, str.indexOf("*")));
				b += Double.parseDouble(str.substring(str.indexOf("*") + 1, str.length()));
				text.setText(String.valueOf(a * b)); // Show result
				str = String.valueOf(a * b);
				a = 0;
				b = 0; // Restart show & vaiable a, b
			}
			if (str.indexOf("/") != -1) {
				a += Double.parseDouble(str.substring(0, str.indexOf("/")));
				b += Double.parseDouble(str.substring(str.indexOf("/") + 1, str.length()));
				text.setText(String.valueOf(a / b)); // Show result
				str = String.valueOf(a / b);
				a = 0;
				b = 0; // Restart show & vaiable a, b
			}
			if (str.indexOf("%") != -1) {
				a += Double.parseDouble(str.substring(0, str.indexOf("%")));
				b += Double.parseDouble(str.substring(str.indexOf("%") + 1, str.length()));
				text.setText(String.valueOf(a % b)); // Show result
				str = String.valueOf(a % b);
				a = 0;
				b = 0; // Restart show & vaiable a, b
			}

			if (str.indexOf("sqrt(") != -1) {
				a += Double.parseDouble(
						text.getText().substring(text.getText().indexOf("(") + 1, text.getText().indexOf(")")));
				text.setText(String.valueOf(Math.sqrt(a))); // Show resul

				str = String.valueOf(Math.sqrt(a));
				a = 0;
				b = 0; // Restart show & vaiable a, b
			}
		}

		if (e.getSource() == ButtonsMain[6]) {
			text.setText(str += "%");
			text.setFont(myFont3);
		}

		if (e.getSource() == ButtonsMain[9]) {
			String string = text.getText();
			text.setText("");
			for (int i = 0; i < string.length() - 1; i++) {
				text.setText(text.getText() + string.charAt(i));
				str = "";
			}
		}

		if ((e.getSource() == ButtonsMain[8]) || (e.getSource() == ButtonsMain[7])) {
			str = "";
			text.setText(str);
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
	

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
