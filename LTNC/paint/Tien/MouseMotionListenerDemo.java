
package Tien;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class MouseMotionListenerDemo extends Frame implements  MouseMotionListener  {
	
	MouseMotionListenerDemo(){
		addMouseMotionListener(this);
		setSize(500, 400);
		setLayout(null);
		setVisible(true);
		
		}


@Override
public void mouseDragged(MouseEvent e) {
	Graphics g = getGraphics();
	g.setColor(Color.BLUE);
	g.fillOval(e.getX(), e.getY(),2, 2);
	
}

@Override
public void mouseMoved(MouseEvent e) {
	
	
}
public static void main(String[] args) {
	new MouseMotionListenerDemo();
	
}
}
