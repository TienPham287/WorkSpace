package MyPaint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;


public class Circle extends AShape {
	int radius;

	public Circle(int x, int y, Color color, BasicStroke stroke) {
		super(x, y, color, stroke);
		// TODO Auto-generated constructor stub
		radius = 1;
	}

	@Override
	public void setSecondPoint(int x, int y) {
		radius = (int) Math.sqrt((location.x - x) * (location.x - x) + (location.y - y) * (location.y - y));
	}

	@Override
	public void draw(Graphics2D g) {

		g.setColor(color);
		g.setStroke(stroke);
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.drawOval(location.x - radius, location.y - radius, 2 * radius, 2 * radius);

	}

	@Override
	public boolean contains(Point p) {
		// TODO Auto-generated method stub
		// t�m
		if ((Math.pow(Math.abs(p.x - location.x), 2) / (Math.pow(radius, 2))
				+ Math.pow(Math.abs(p.y - location.y), 2) / (Math.pow(radius, 2))) > 1) {
			return false;
		}

		return true;

	}

	@Override
	public void fill(Graphics2D g) {
		// TODO Auto-generated method stub
		g.setColor(this.color);
		g.fillOval(location.x - radius, location.y - radius, 2 * radius, 2 * radius);
	}

//
	@Override
	public int perimeter() {
		// TODO Auto-generated method stub
		return (int) (radius * 2 * Math.PI);
	}


	@Override
	public void setCommand(StatusBar statusBar) {

		statusBar.setForeground(Color.black);
		// TODO Auto-generated method stub
		statusBar.command1.setText(statusBar.command1.getText()

				+ "-Circle: center(" + center().x + ";" + center().y + ")" + " ||radius: " + radius + " ||perimeter: "
				+ perimeter() + " ||area: " + area() + " ~~Finish\n");
	}

	@Override
	public void move(Point end) {
		// TODO Auto-generated method stub
		location.x = end.x;
		location.y = end.y;
	}

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return (int) Math.PI * radius * radius;
	}

	@Override
	public Point center() {
		// TODO Auto-generated method stub
		return new Point(location.x, location.y);
	}

	@Override
	public void select(Graphics2D g) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 4; i++) {
			double t = 2 * Math.PI * i / 4;
			int x = (int) Math.round(location.x + radius * Math.cos(t));
			int y = (int) Math.round(location.y + radius * Math.sin(t));
			g.setColor(Color.BLUE);
			g.fillRect(x - 10, y - 10, (int) (10 + stroke.getLineWidth()), (int) (10 + stroke.getLineWidth()));
		}
		g.fillRect(location.x - 10, location.y - 10, (int) (10 + stroke.getLineWidth()),
				(int) (10 + stroke.getLineWidth()));

	}

	@Override
	public boolean round(Point p) {

		// TODO Auto-generated method stub
		for (int i = 0; i < 4; i++) {
			double t = 2 * Math.PI * i / 4;
			int x = (int) Math.round(location.x + radius * Math.cos(t));
			int y = (int) Math.round(location.y + radius * Math.sin(t));
			if (x - 20 < p.x && x + 20 + (int) (10 + stroke.getLineWidth()) > p.x && y - 20 < p.y
					&& y + 20 + (int) (10 + stroke.getLineWidth()) > p.y) {
				return true;
			}
		}

		return false;

	}

	@Override
	public boolean center(Point p) {
		// TODO Auto-generated method stub
		if (location.x - 20 < p.x && location.x + 20 + (int) (10 + stroke.getLineWidth()) > p.x && location.y - 20 < p.y
				&& location.y + 20 + (int) (10 + stroke.getLineWidth()) > p.y) {
			return true;
		}
		return false;
	}

	@Override
	public void scale(int x, int y) {
		// TODO Auto-generated method stub
		radius = (int) Math.sqrt((location.x - x) * (location.x - x) + (location.y - y) * (location.y - y));

	}

}
