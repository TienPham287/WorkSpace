package Tien;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class MouselistenerExam1 {
	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;
	
		
	
	
public MouselistenerExam1() {
	prepareUI();
}
public static void main(String[] args) {
	MouselistenerExam1 demo = new MouselistenerExam1();
	demo.showMouseListenerDemo();
}
private void prepareUI() {
	mainFrame = new JFrame("Vi du java Swing");
	mainFrame.setSize(500, 400);
	mainFrame.setLayout(new GridLayout(3,1));
	headerLabel = new JLabel("", JLabel.CENTER);
	statusLabel = new JLabel("", JLabel.CENTER);
	statusLabel.setSize(350, 100);
	mainFrame.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent windowEvent) {
			System.exit(0);
		}
		});
	controlPanel = new JPanel();
	controlPanel.setLayout(new FlowLayout());
	mainFrame.add(headerLabel);
	mainFrame.add(statusLabel);
	mainFrame.add(controlPanel);
	mainFrame.setVisible(true);
}
public void showMouseListenerDemo() {
	headerLabel.setText("Listener in action: MouseListener");
	JPanel panel = new JPanel();
	 panel.setBackground(Color.magenta);
	 panel.addMouseListener(new CustomMouseListener());
	 JLabel msgLabel = new JLabel("Click vao day de lay toa do", JLabel.CENTER);
	 panel.add(msgLabel);
	 controlPanel.add(panel);
	 mainFrame.setVisible(true);
}
class CustomMouseListener implements MouseListener{
	public void mouseClicked(MouseEvent e) {
		statusLabel.setText("Mouse Clicked: " + "(" + e.getX() + "," + e.getY() + ")" );
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
			
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
	
}


