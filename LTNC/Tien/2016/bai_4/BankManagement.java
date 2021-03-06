package bai_4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class BankManagement extends JFrame implements ActionListener {
	JMenuItem item, item1, item2, item3;
	JMenu jmenu1;

	public BankManagement() {
		JMenuBar jMenuBar = new JMenuBar();
		setJMenuBar(jMenuBar);
		JMenu jmenu = new JMenu("Account Management");
		jmenu1 = new JMenu("Exit");
		jMenuBar.add(jmenu);
		jMenuBar.add(jmenu1);

		item = new JMenuItem("Checking Account", new ImageIcon(
				new ImageIcon("./2016/bai_4/bank.jpg").getImage().getScaledInstance(10, 10, DO_NOTHING_ON_CLOSE)));
		item1 = new JMenuItem("Savings Account", new ImageIcon(
				new ImageIcon("./2016/bai_4/bank.jpg").getImage().getScaledInstance(10, 10, DO_NOTHING_ON_CLOSE)));
		item2 = new JMenuItem("Certificate of deposite ", new ImageIcon(
				new ImageIcon("./2016/bai_4/bank.jpg").getImage().getScaledInstance(10, 10, DO_NOTHING_ON_CLOSE)));
		item3 = new JMenuItem("Exit");

		item.addActionListener(this);
		item1.addActionListener(this);
		item2.addActionListener(this);
		item3.addActionListener(this);

		jmenu1.add(item3);

		jmenu.add(item);
		jmenu.add(item1);
		jmenu.add(item2);

		item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.ALT_MASK));
		item1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
		item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.ALT_MASK));
		JLabel bg = new JLabel(new ImageIcon(
				new ImageIcon("./2016/bai_4/bank.jpg").getImage().getScaledInstance(200, 150, DO_NOTHING_ON_CLOSE)));

		this.add(bg);
		setVisible(true);
		setSize(500, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

	}

	public static void main(String[] args) {
		new BankManagement();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == item) {
			new ChenkingAccount().setVisible(true);

		}
		if (e.getSource() == item1) {
			new SavingsAccount().setVisible(true);

		}
		if (e.getSource() == item2) {
			new CertificateOfDepositAccount().setVisible(true);

		}
		if (e.getSource() == item3) {
			System.exit(0);
			System.out.println("??");
		}
	}

}