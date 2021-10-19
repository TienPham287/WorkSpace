package Tien;

public class BirthDate implements Comparable<BirthDate> {

	private int day;
	private int month;
	private int year;

	public BirthDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	} 

	public String toString() {
		return this.day + "/" + month + "/" + year;
	}

	@Override
	public int compareTo(BirthDate other) {
		int diff = this.year - other.year;
		if (diff != 0)
			return diff;

		diff = this.month - other.month;
		if (diff != 0)
			return diff;

		diff = this.day - other.day;
		return diff;
	}

}
