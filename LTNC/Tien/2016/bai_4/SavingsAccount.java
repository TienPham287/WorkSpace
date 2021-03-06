package bai_4;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import bai_3.SavingAccount;

public class SavingsAccount extends JFrame implements ActionListener {
	private JButton btAdd, btClear;
	private JLabel lb, lb1, lb2, lb3, lb4;
	private JTextField tf1, tf2, tf3, tf4;
	JTextArea ta;
	private ArrayList<SavingAccount> savingsAcount = new ArrayList<SavingAccount>();

	public SavingsAccount() {
		setSize(600, 650);
		setLocationRelativeTo(null);
		setTitle("Savings Account");
		view();
	}

	private void view() {
		btAdd = new JButton("Add",new ImageIcon(
				new ImageIcon("./2016/bai_4/add.png").getImage().getScaledInstance(10, 10, DO_NOTHING_ON_CLOSE)));
		btClear = new JButton("Clear",new ImageIcon(
				new ImageIcon("./2016/bai_4/clear.png").getImage().getScaledInstance(10, 10, DO_NOTHING_ON_CLOSE)));
		setLayout(new BorderLayout());
		JToolBar tb = new JToolBar();
		add(tb, BorderLayout.NORTH);
		tb.add(btAdd);
		tb.add(btClear);
		btAdd.addActionListener(this);
		btClear.addActionListener(this);
		JPanel panelCen = new JPanel();
		panelCen.setLayout(new GridLayout(2, 1));
		add(panelCen, BorderLayout.CENTER);
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4, 2, 0, 5));
		panelCen.add(panel);

		lb1 = new JLabel("ID", JLabel.CENTER);
		tf1 = new JTextField();
		panel.add(lb1);
		panel.add(tf1);

		lb2 = new JLabel("Name", JLabel.CENTER);
		tf2 = new JTextField();
		panel.add(lb2);
		panel.add(tf2);
		lb3 = new JLabel("Interest Rate", JLabel.CENTER);
		tf3 = new JTextField();
		panel.add(lb3);
		panel.add(tf3);

		lb4 = new JLabel("Current Balance", JLabel.CENTER);
		tf4 = new JTextField();
		panel.add(lb4);
		panel.add(tf4);

		ta = new JTextArea();
		ta.setBorder(BorderFactory.createTitledBorder("Savings Account Information"));
		ta.setEditable(false);
		panelCen.add(ta);
		ta.setText("ID\t\tName\t\tIR(%)\t\tCB\n");
	}

	public static void main(String[] args) {
		new SavingsAccount();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btAdd) {
			int id = Integer.parseInt(tf1.getText());
			String name = tf2.getText();
			double ir = Double.parseDouble(tf3.getText());
			double cb = Double.parseDouble(tf4.getText());
			SavingAccount accounts = new SavingAccount(id, name, ir, cb);
			savingsAcount.add(accounts);
			ta.setText("ID\t\tName\t\tIR(%)\t\tCB\n" + toString());
		}
		if (e.getSource() == btClear) {
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			tf4.setText("");
		}

	}

	public String toString() {
		StringBuffer s = new StringBuffer();
		for (SavingAccount c : savingsAcount) {
			s.append(c.toString());
		}
		return s.toString();
	}
}
