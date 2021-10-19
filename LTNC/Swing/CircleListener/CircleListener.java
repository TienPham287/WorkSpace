package CircleListener;

import java.awt.Color;
import java.awt.Frame;
import java .awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CircleListener extends MouseAdapter{
	private int radius = 20;
	public void mousePressed(MouseEvent event) {
		Frame app = (Frame)event.getSource();
		Graphics g = app.getGraphics();
		g.fillOval(event.getX()-radius, event.getY()-radius, 2*radius, 2*radius);
		
	
	}
	public static void main(String[] args) {
		new FrameEventExample();
	}

}
class FrameEventExample extends Frame {
	private int radius =10;
	public FrameEventExample() {
		addMouseListener(new CircleListener());
		
		setSize(300, 200);
		setVisible(true);
		
	}
}