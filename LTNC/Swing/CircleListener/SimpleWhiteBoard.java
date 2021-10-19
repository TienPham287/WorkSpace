package CircleListener;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

 
public class SimpleWhiteBoard extends Frame {
	protected int lastX=0, lastY=0;
	public SimpleWhiteBoard() {
		setBackground(Color.white);
		setForeground(Color.blue);
		addMouseListener(new PositionRecorder());
		addMouseMotionListener(new LineDrawer());
		setSize(600, 200);
		setVisible(true); 
		
	}
	private class PositionRecorder extends MouseAdapter {
		public void mouseEntered(MouseEvent event) {
			requestFocus();
			Record(event.getX(), event.getY());
			
		}

		private void Record(int x, int y) {
			// TODO Auto-generated method stub
			
		}

		
	}
private class LineDrawer extends MouseMotionAdapter {
	public void mouseDragged(MouseEvent event) {
		int x = event.getX();
		int y = event.getY();
		Graphics g = getGraphics();
		g.drawLine(lastX, lastY, x, y);
		Record(x, y);
		
	}

	private void Record(int x, int y) {
		// TODO Auto-generated method stub
		
	}

}


	
	
public static void main(String[] args) {
	new SimpleWhiteBoard();
}
}