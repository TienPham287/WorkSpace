package MyPaint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;

public class TriangleType2 extends AShape {
	private int altitude;
	private int side, vertex1x, y;
	int xG, yG;

	public TriangleType2(int x, int y, Color color, BasicStroke stroke) {
		super(x, y, color, stroke);
		altitude = 1;
		side = 1;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setSecondPoint(int x, int y) {
		xG = (vertex1x + 2 * location.x) / 3;
		yG = (location.y + 2 * altitude) / 3;

		// TODO Auto-generated method stub
		side = (x - location.x);
		altitude = y;
		vertex1x = location.x + side;
		this.y = location.y;
		xG = (vertex1x + 2 * location.x) / 3;
		yG = (location.y + 2 * altitude) / 3;

	}

	@Override
	public void draw(Graphics2D g) {
		// TODO Auto-generated method stub
		g.setColor(color);
		g.setStroke(stroke);
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.drawPolygon(new int[] { location.x, location.x, vertex1x }, new int[] { location.y, altitude, altitude }, 3);
	}

	@Override
	public boolean contains(Point p) {

		double d1, d2, d3;
		boolean has_neg, has_pos;

		d1 = sign(p.x, p.y, location.x, location.y, location.x, altitude);
		d2 = sign(p.x, p.y, location.x, altitude, location.x + side, altitude);
		d3 = sign(p.x, p.y, location.x + side, altitude, location.x, location.y);

		has_neg = (d1 < 0) || (d2 < 0) || (d3 < 0);
		has_pos = (d1 > 0) || (d2 > 0) || (d3 > 0);
		return !(has_neg && has_pos);

	}

	private double sign(int xA, int yA, int xB, int yB, int xC, int yC) {
		return (xA - xC) * (yB - yC) - (xB - xC) * (yA - yC);
	}

	@Override
	public void fill(Graphics2D g) {
		// TODO Auto-generated method stub
		g.setColor(color);
		g.fillPolygon(new int[] { location.x, location.x, location.x + side },
				new int[] { location.y, altitude, altitude }, 3);
	}

	@Override
	public int perimeter() {
		// TODO Auto-generated method stub
		return (int) (altitude + side + Math.sqrt(altitude * altitude + side * side));
	}

	
	@Override
	public void setCommand(StatusBar statusBar) {
		// TODO Auto-generated method stub

		statusBar.command1.setText(statusBar.command1.getText()
				
				+ "-TriangleTye2: center(" + center().x + ";" + center().y + ")" + " ||ch??u d??i c???nh b??n: "
				+ Math.sqrt(altitude * altitude + side * side) + " ||ch??u d??i c???nh huy???n: " + side * side
				+ " ||perimeter: " + perimeter() + " ||area: " + area() + " ~~Finish\n");
	}

	@Override
	public void move(Point end) {
		// TODO Auto-generated method stub
		vertex1x = end.x + side;
//		altitude = end.y;
		location.x = end.x;
		location.y = end.y;
		if (location.y < altitude)
			altitude = end.y + location.y;
		if (location.y > altitude)
			altitude = end.y - altitude;
		xG = (vertex1x + 2 * location.x) / 3;
		yG = (location.y + 2 * altitude) / 3;
	}

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return (int) 0.5 * side * altitude;
	}

	@Override
	public Point center() {
		// TODO Auto-generated method stub
		return new Point(xG, yG);
	}

	@Override
	public void select(Graphics2D g) {
		// TODO Auto-generated method stub
		g.setColor(Color.BLUE);
		g.fillRect(location.x - 10, location.y - 10, (int) (10 + stroke.getLineWidth()),
				(int) (10 + stroke.getLineWidth()));
		g.fillRect(vertex1x - 10, altitude - 10, (int) (10 + stroke.getLineWidth()),
				(int) (10 + stroke.getLineWidth()));
		g.fillRect(location.x - 10, altitude - 10, (int) (10 + stroke.getLineWidth()),
				(int) (10 + stroke.getLineWidth()));
		g.fillRect(xG - 10, yG - 10, (int) (10 + stroke.getLineWidth()), (int) (10 + stroke.getLineWidth()));
		g.setColor(color);
	}

	@Override
	public boolean round(Point p) {
		// TODO Auto-generated method stub

		if (xG - 20 < p.x && xG + 20 + (int) (10 + stroke.getLineWidth()) > p.x && yG - 20 < p.y
				&& yG + 20 + (int) (10 + stroke.getLineWidth()) > p.y) {
			return false;
		}
		if (location.x - 20 < p.x && location.x + 20 + (int) (10 + stroke.getLineWidth()) > p.x && location.y - 20 < p.y
				&& location.y + 20 + (int) (10 + stroke.getLineWidth()) > p.y) {
			return false;
		}
		return true;
	}

	@Override
	public boolean center(Point p) {
		// TODO Auto-generated method stub

		if (vertex1x - 20 < p.x && vertex1x + 20 + (int) (10 + stroke.getLineWidth()) > p.x && altitude - 20 < p.y
				&& altitude + 20 + (int) (10 + stroke.getLineWidth()) > p.y) {
			return false;
		}
		if (location.x - 20 < p.x && location.x + 20 + (int) (10 + stroke.getLineWidth()) > p.x && altitude - 20 < p.y
				&& altitude + 20 + (int) (10 + stroke.getLineWidth()) > p.y) {
			return false;
		}

		return true;
	}

	@Override
	public void scale(int x, int y) {
		// TODO Auto-generated method stub
		side = (x - location.x);
		altitude = y;
		vertex1x = location.x + side;

		xG = (vertex1x + 2 * location.x) / 3;
		yG = (location.y + 2 * altitude) / 3;
	}

}
