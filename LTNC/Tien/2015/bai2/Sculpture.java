package bai2;

public class Sculpture extends ArtObject {
	String materialFrom;
	double height, weight;

	public Sculpture(String artist, int year, String title, String materialFrom, double height, double weight) {
		super(artist, year, title);
		this.materialFrom = materialFrom;
		this.height = height;
		this.weight = weight;
	}

	public String getMaterialFrom() {
		return materialFrom;
	}

	public void setMaterialFrom(String materialFrom) {
		this.materialFrom = materialFrom;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Sculpture [materialFrom=" + materialFrom + ", height=" + height + ", weight=" + weight + ", artist="
				+ artist + ", year=" + year + ", title=" + title + ", listPainting=" + listPainting + "]";
	}

	}
