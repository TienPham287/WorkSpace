package bai_4;

import java.awt.BorderLayout;
import java.awt.Dimension;
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

import bai_3.CertificateOfDeposit;

public class CertificateOfDepositAccount extends JFrame implements ActionListener {
	private JButton btAdd, btClear;
	private JLabel lb, lb1, lb2, lb3, lb4, lb5;
	private JTextField tf1, tf2, tf3, tf4, tf5;
	JTextArea ta;
	private ArrayList<CertificateOfDeposit> account = new ArrayList<CertificateOfDeposit>();

	public CertificateOfDepositAccount() {
		setSize(800, 600);
		setLocationRelativeTo(null);
		setTitle("Certificate Of Deposit");
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
		panel.setLayout(new GridLayout(5, 2, 0, 5));
		panelCen.add(panel);

		lb1 = new JLabel("ID",JLabel.CENTER);
		tf1 = new JTextField();
		panel.add(lb1);
		panel.add(tf1);
		lb2 = new JLabel("Name", JLabel.CENTER);
		tf2 = new JTextField();
		panel.add(lb2);
		panel.add(tf2);
		lb3 = new JLabel("Interrest Rate", JLabel.CENTER);
		tf3 = new JTextField();
		panel.add(lb3);
		panel.add(tf3);

		lb4 = new JLabel("Current Balance", JLabel.CENTER);
		tf4 = new JTextField();
		panel.add(lb4);
		panel.add(tf4);

		lb5 = new JLabel("Maturity", JLabel.CENTER);
		tf5 = new JTextField();
		panel.add(lb5);
		panel.add(tf5);

		ta = new JTextArea();
		ta.setBorder(BorderFactory.createTitledBorder("Certificate Of Deposit Impormation"));
		ta.setEditable(false);
		panelCen.add(ta);
		ta.setText("ID\t\tName\t\tIR(%)\t\tCB\t\tMaturity\n");
	}

	public static void main(String[] args) {
		new CertificateOfDepositAccount();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btAdd) {
			int id = Integer.parseInt(tf1.getText());
			String name = tf2.getText();
			double ir = Double.parseDouble(tf3.getText());
			double cb = Double.parseDouble(tf4.getText());

			String date = tf5.getText();
			int index1 = date.indexOf("/");
			int index2 = date.indexOf("/", index1 + 1);
			int day = Integer.parseInt(date.substring(0, index1));
			int month = Integer.parseInt(date.substring(index1 + 1, index2));
			int year = Integer.parseInt(date.substring(index2 + 1, date.length()));

			if (day >= 1 && day <= 31 && month >= 1 && month <= 12) {
				CertificateOfDeposit c = new CertificateOfDeposit(id, name, ir, cb, date);
				account.add(c);
				ta.setText("ID\t\tName\t\tMB\t\tCB\t\tMaturity\n" + toString());

			}

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
		for (CertificateOfDeposit c : account) {
			s.append(c.toString());
		}
		return s.toString();
	}
}