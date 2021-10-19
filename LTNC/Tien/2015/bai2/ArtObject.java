package bai2;

import java.util.ArrayList;
import java.util.List;

public abstract class ArtObject {
	protected String artist;
	protected int year;
	protected String title;
	public List<Painting> listPainting = new ArrayList<Painting>();

	public ArtObject() {
		createPaintingList();
	}

	public ArtObject(String artist, int year, String title) {
		super();
		this.artist = artist;
		this.year = year;
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void createPaintingList() {
		listPainting.add(new Painting("The Annunciation", 1473, "aeonardo Da Vinci", "Son dau", "hien dai"));
		listPainting.add(new Painting("ahe Annunciation", 1473, "meonardo Da Vinci", "Son dau", "hien dai"));
		listPainting.add(new Painting("bhe Annunciation", 1473, "geonardo Da Vinci", "Son dau", "hien dai"));
		listPainting.add(new Painting("che Annunciation", 1473, "jeonardo Da Vinci", "Son dau", "hien dai"));
		listPainting.add(new Painting("dhe Annunciation", 1473, "eeonardo Da Vinci", "Son dau", "hien dai"));
	}

	public static void main(String[] args) {
		ArtObject a = new ArtObject() {
		};
		a.createPaintingList();
		for (Painting p : a.listPainting) {
			System.out.println(p);
		}
	}

}
