package Account;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AccUI extends JFrame {
JTextField txtAccNumber;
JTextField txtAccName;
JTextField txtAccMoney;
JTable tbAcc;
DefaultTableModel tbModelAcc;
JButton btnAdd, btnClear, btnExit;
public AccUI() {
	
	JPanel pnAccNumber = new JPanel();
	pnAccNumber.setLayout(new BoxLayout(pnAccNumber, BoxLayout.X_AXIS));
	JLabel lbAccNumber = new JLabel("Account Number: ");
	pnAccNumber.add(lbAccNumber);
	txtAccNumber = new JTextField(20);
	pnAccNumber.add(txtAccNumber);
	
	JPanel pnAccName = new JPanel();
	pnAccName.setLayout(new BoxLayout(pnAccName, BoxLayout.X_AXIS));
	JLabel lbAccName = new JLabel("Account Name: ");
	pnAccName.add(lbAccName);
	txtAccName = new JTextField(20);
	pnAccName.add(txtAccName);
	
	JPanel pnAccMoney = new JPanel();
	pnAccMoney.setLayout(new BoxLayout(pnAccMoney, BoxLayout.X_AXIS));
	JLabel lbAccMoney = new JLabel("Account Money: ");
	pnAccMoney.add(lbAccMoney);
	txtAccMoney = new JTextField(20);
	pnAccMoney.add(txtAccMoney);
	Container con = getContentPane();
	con.setLayout(new BorderLayout());
	JPanel pInfor = new JPanel();
	pInfor.setLayout(new BoxLayout(pInfor, BoxLayout.Y_AXIS));
	pInfor.add(pnAccNumber);
	pInfor.add(pnAccName);
	pInfor.add(pnAccMoney);
	con.add(pInfor, BorderLayout.NORTH);
	
	tbModelAcc = new DefaultTableModel();
	tbModelAcc.addColumn("AccNumber");
	tbModelAcc.addColumn("AccName");
	tbModelAcc.addColumn("AccMoney");
	tbAcc = new JTable(tbModelAcc);
	JScrollPane sc =  new JScrollPane(tbAcc, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	con.add(sc, BorderLayout.CENTER);
	
	JPanel pnButton = new JPanel();
	btnAdd = new JButton("Add");
	btnAdd.setMnemonic('A');
	btnClear = new JButton("Clear");
	btnClear.setMnemonic('C');
	btnExit = new JButton("Exit");
	btnExit.setMnemonic('E');
	pnButton.add(btnAdd);
	pnButton.add(btnClear);
	pnButton.add(btnExit);
	con.add(pnButton, BorderLayout.SOUTH);
	lbAccName.setPreferredSize(lbAccNumber.getPreferredSize());
	lbAccMoney.setPreferredSize(lbAccNumber.getPreferredSize());
	addEvents();
	
}
private void addEvents() {
	btnAdd.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
		String arr[] = {txtAccNumber.getText(),
				txtAccName.getText(), txtAccMoney.getText()};
		tbModelAcc.addRow(arr);
		
		}
	});
	btnExit.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			int ret = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Exit!", JOptionPane.YES_NO_OPTION);
			if (ret == JOptionPane.YES_OPTION) 
			System.exit(0);
			}
	});
}
	public void doShow() {
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		setTitle("Account");
	
}

}
