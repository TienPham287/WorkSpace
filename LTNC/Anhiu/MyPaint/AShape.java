package MyPaint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public abstract class AShape implements IShape {
	protected Point location;
	Color color;
	public boolean fill;
	BasicStroke stroke;
	boolean select;

	public AShape(int x, int y, Color color, BasicStroke stroke) {
		this.location = new Point(x, y);
		this.color = color;
		this.fill = false;
		this.select = false;
		this.stroke = stroke;
	}
}
