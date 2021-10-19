package Listener;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
public class AdapterEx extends JFrame {
	private JLabel labelx;
	private JLabel labely;
	public AdapterEx() {
		initUI();
		
		
	}
	private void initUI() {
	Container pane = getContentPane();
	GroupLayout gl = new GroupLayout(pane);
	pane.setLayout(gl);
	addComponentListener(new MoveAdapter());
	labelx = new JLabel("x:");
	labelx.setFont(new Font("serif", Font.BOLD, 14));
	
	labely = new JLabel("y:");
	labely.setFont(new Font("serif", Font.BOLD, 14) );
	
	gl.setAutoCreateContainerGaps(true);
	gl.setAutoCreateGaps(true);
	
	gl.setHorizontalGroup(gl.createParallelGroup().addComponent(labelx).addComponent(labely).addGap(200));
	gl.setVerticalGroup(gl.createSequentialGroup().addComponent(labelx).addComponent(labely).addGap(130));
	
	pack();
	setSize(300, 200);
	setTitle("Event Example");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	
	
	
	
	
}
	private class MoveAdapter extends ComponentAdapter{
		
@Override
public void componentMoved(ComponentEvent e) {
	int x = e.getComponent().getX();
	int y = e.getComponent().getY();
	labelx.setText("x:" + x);
	labely.setText("y:" + y);
	super.componentMoved(e);
}

		
		
		
		
		
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				AdapterEx ex = new AdapterEx();
				ex.setVisible(true);
			}
		});
	}
}