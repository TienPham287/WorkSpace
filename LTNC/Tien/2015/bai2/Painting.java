package bai2;

public class Painting extends ArtObject {
	private String paintype;
	private String style;

	public Painting() {
		// TODO Auto-generated constructor stub
		
	}

	public Painting(String artist, int year, String title, String paintype, String style) {
		super(artist, year, title);
		this.paintype = paintype;
		this.style = style;
	}

	public String getPaintype() {
		return paintype;
	}

	public void setPaintype(String paintype) {
		this.paintype = paintype;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	@Override
	public String toString() {
		return this.title + "\t" + this.artist + "\t" + this.year;
	}
	

}
