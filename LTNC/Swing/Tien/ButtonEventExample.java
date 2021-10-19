package Tien;
import java.awt.*;



public class ButtonEventExample extends Frame{
	public  ButtonEventExample() {
		Button b = new Button();
		add(b);
		b.addMouseMotionListener(new MyMouseListener());
		setTitle("Button Event Example");
		setSize(300, 200);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new ButtonEventExample();
	}

}
