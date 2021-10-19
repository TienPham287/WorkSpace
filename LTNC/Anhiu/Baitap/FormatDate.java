package Baitap;

public class FormatDate {
	public static String format(String str) {
		final String[] MONTH_STRING = { "", "January", "Febuary", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December" };
		int index = str.indexOf('/');
		int index2 = str.indexOf('/', index + 1);
		String date = str.substring(0, index);
		String month = str.substring(index + 1, index2);
		String year = str.substring(index2 + 1, str.length());

		int n = Integer.parseInt(month);

		return date + " " + MONTH_STRING[n] + " " + year;
	}

	public static void main(String[] args) {
		System.out.println(format("15/05/2020"));
	}

}
