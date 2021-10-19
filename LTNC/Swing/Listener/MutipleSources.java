package Listener;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MutipleSources extends JFrame {
	private JLabel statusbar;
	public MutipleSources() {
		initUI();
		
	}
	private void initUI() {
	JPanel panel = new JPanel();
			GroupLayout gl = new GroupLayout(panel);
		panel.setLayout(gl);
		statusbar = new JLabel("Ready");
		statusbar.setBorder(BorderFactory.createEtchedBorder());
		ButtonListener butList = new ButtonListener();
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(butList);
		JButton btnOpen = new JButton("Open");
		btnOpen.addActionListener(butList);
		JButton btnFind = new JButton("Find");
		btnFind.addActionListener(butList);
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(butList);
		
		gl.setAutoCreateContainerGaps(true);
		gl.setAutoCreateGaps(true);
		
		gl.setHorizontalGroup(gl.createParallelGroup().addComponent(btnClose).addComponent(btnOpen).addComponent(btnFind).addComponent(btnSave).addGap(400));
		gl.setVerticalGroup(gl.createSequentialGroup().addComponent(btnClose).addComponent(btnOpen).addComponent(btnFind).addComponent(btnSave).addGap(200));
		gl.linkSize(btnClose, btnOpen, btnFind, btnSave);
		add(panel, BorderLayout.CENTER);
		add(statusbar, BorderLayout.SOUTH);
		pack();
		
		setTitle("Event Example");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton o = (JButton)e.getSource();
			String label = o.getText();
			statusbar.setText(" "+ label + "Button click");
		}
		

}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				MutipleSources ms = new MutipleSources();
				ms.setVisible(true);
				
			}
		});
	}
}
