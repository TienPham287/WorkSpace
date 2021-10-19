package CircleListener;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;

import java.text.DateFormat;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.Locale;


public class EventObjectEx extends JFrame {
	private JList List;
	private DefaultListModel model;
public EventObjectEx() { 
	initUI();
	
}

private void initUI() {
	Container pane = getContentPane();
	GroupLayout gl = new GroupLayout(pane);
	pane.setLayout(gl);
	
	model = new DefaultListModel<>();
	List = new JList<>(model);
	List.setMinimumSize(new Dimension(250, 150));
	List.setBorder(BorderFactory.createEtchedBorder());
	
	JButton okButton = new JButton("OK");
	okButton.addActionListener((ActionListener) new ClickAction());
	gl.setAutoCreateContainerGaps(true);
	gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(okButton).addGap(20).addComponent(List));
			gl.setVerticalGroup(gl.createParallelGroup().addComponent(okButton).addComponent(List));
			pack();
			
			setTitle("Event Example");
			setLocationRelativeTo(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
}
private class ClickAction extends AbstractAction {

	@Override
	public void actionPerformed(ActionEvent e) {
		Locale locale = Locale.getDefault();
		Date date =new Date(e.getWhen());
		String tm = DateFormat.getTimeInstance(DateFormat.SHORT, locale).format(date);
		
		if (!model.isEmpty()) {
			model.clear();
		}
		if (e.getID() == ActionEvent.ACTION_PERFORMED) {
			model.addElement("Event Id: ACTION_PERFORMED");
			
			}
		model.addElement("TIME:" + tm);
		String source= e.getSource().getClass().getName();
		model.addElement("Source:" + source);
		
		}
	
}
public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		
		@Override
		public void run() {
			EventObjectEx ex = new EventObjectEx();
			ex.setVisible(true);
		}
	});
}
	
}
