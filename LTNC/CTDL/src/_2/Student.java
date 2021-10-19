package _2;

public class Student {
	private String id;
	private String fullName;
	private boolean isFemale; // la nu
	private String provide_city; //  thanh pho
	private int covid_Vacxin; // so mui covid dc da tiem

	public Student(String id, String fullName, boolean isFemale, String provide_city, int covid_Vacxin) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.isFemale = isFemale;
		this.provide_city = provide_city;
		this.covid_Vacxin = covid_Vacxin;
	}

	public String toString() {
		return "id: " + this.id + " || " + "fulName: " + this.fullName + " || " + "isFemale: " + this.isFemale + " || "
				+ "provideCity: " + this.provide_city + " || " + "covidVacxin: " + this.covid_Vacxin;

	}

	public static void main(String[] args) {
		System.out.println(new Student("123abc", "tran huu dan", false, "hcm", 1).toString());
		System.out.println(new Student("123abc", "tran huu dan", false, "hcm", 2).toString());
		System.out.println(new Student("123abc", "tran huu dan", false, "hcm", 1).toString());
		System.out.println(new Student("123abc", "tran huu dan", false, "hcm", 2).toString());
	}

	public int getCovid_Vacxin() {
		return covid_Vacxin;
	}

	public String getProvide_city() {
		return provide_city;
	}
}
