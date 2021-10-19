package Listener;

import java.awt.Container;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import com.sun.jdi.event.EventQueue;

public class InerClassEx extends JFrame{
public InerClassEx() {
	initUI();
	
}

/**
 * 
 */
private void initUI() {
	Container pane = getContentPane();
	GroupLayout gl = new GroupLayout(pane);
	pane.setLayout(gl);
	
	JButton closeButton = new JButton("Close");
	ButtonCloseListener listener = new ButtonCloseListener();
	
	
    closeButton.addActionListener(listener);
  
	
    gl.setAutoCreateContainerGaps(true);
    gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(closeButton).addGap(220));
    gl.setVerticalGroup(gl.createSequentialGroup().addComponent(closeButton).addGap(180));
    pack();
    setTitle("Event Example");
    setLocationRelativeTo(null);
    
    
}



private Container getContainPane() {
	// TODO Auto-generated method stub
	return null;
}

private class ButtonCloseListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}




}
public static void main(String[] args) {
	 java.awt.EventQueue.invokeLater(new Runnable() {
		
		@Override
		public void run() {
			InerClassEx ex = new InerClassEx();
			ex.setVisible(true);
			
		}
	});

}
}
