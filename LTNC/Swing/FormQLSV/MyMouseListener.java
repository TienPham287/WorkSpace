package FormQLSV;

import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class MyMouseListener extends MouseAdapter {
public void mousePressed(MouseEvent event) {
	System.out.println("Mouse-button pressed at("+event.getX()+","+ event.getY()+")");
	
}

}
 class FrameEventExample extends Frame{
	public FrameEventExample() {
		addMouseListener(new MyMouseListener());
		setTitle("Button Event Example");
		setSize(300, 200);
		setVisible(true);
		
		
	}
public static void main(String[] args) {
	new MyMouseListener();
}
}