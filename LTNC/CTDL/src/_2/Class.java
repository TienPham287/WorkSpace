package _2;

public class Class {
	private static Student[] studentArray;// mang cac sinh vien
	private String name;
	private int quantityStudent;

	public Class(String name, int quantityStudent) {
		super();
		this.name = name;
		this.quantityStudent = quantityStudent;
		this.studentArray = new Student[quantityStudent];
	}

	public Class(Student[] studentArray, String name) {
		super();
		this.studentArray = studentArray;
		this.name = name;
		this.quantityStudent = studentArray.length;
	}

	public static Student[] getStudentHas2Vacxin() {
		// TODO
		int n = tongSL(2);
		Student[] st = new Student[n];
		int m = 0;
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i].getCovid_Vacxin() == 2) {

				st[m] = studentArray[i];
				m++;

			}
		}
		return st;
	}

	private static int tongSL(int m) {
		int n = 0;
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i].getCovid_Vacxin() == m) {
				n++;
			}
		}
		return n;
	}

	public static Student[] getStudentHasNonVacxin() {
		// TODO
		int n = tongSL(0);
		Student[] st = new Student[n];
		int m = 0;
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i].getCovid_Vacxin() == 0) {

				st[m] = studentArray[i];
				m++;

			}
		}
		return st;
	}

	public void printList(Student[] s) {
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i] + " ");
		}
	}

	public int quantityStudentAt(String province_city) {
		int n = 0;

		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i].getProvide_city().toUpperCase().equals(province_city.toUpperCase())) {
				n++;
			}
		}

		return n;
	}

	public static void main(String[] args) {
		Student st1 = new Student("123a", "dan", false, "HCM", 1);
		Student st2 = new Student("123aa", "dan2", false, "HN", 2);
		Student st3 = new Student("123ads", "dan3", false, "DN", 2);
		Student st4 = new Student("123aaa", "dan4", false, "PQ", 1);
		Student st5 = new Student("123avc", "dan5", false, "Hcm", 0);

		Class cl = new Class("12a", 5);

		Student[] ar = { st1, st2, st3, st4, st5 };

		Class cl2 = new Class(ar, "12b");

		cl.printList(getStudentHasNonVacxin());
		System.out.println("_____");
		cl.printList(getStudentHas2Vacxin());
		System.out.println("_____");
		System.out.println(cl2.quantityStudentAt("hcm"));

	}

}
