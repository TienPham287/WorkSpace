package Baitap;

import java.util.Locale;

public class DateFor {
	

	public static String dateFor(String date) {
		String res = "";
		String month = "";
		StringBuilder sb = new StringBuilder(date);
		for (int i = 0; i < sb.indexOf("/"); i++) {
			res += sb.charAt(i);
		}
		sb = sb.delete(0, sb.indexOf("/") + 1);
		for (int i = 0; i < sb.indexOf("/"); i++) {
			month += sb.charAt(i);
		}
		sb = sb.delete(0, sb.indexOf("/") + 1);
		switch (month) {
		case "1":
			res += "january";
			break;
		case "2":
			res += "February";
			break;
		case "3":
			res += "March";
			break;
		case "4":
			res += "April";
			break;
		case "5":
			res += "May";
			break;
		case "6":
			res += "June";
			break;
		case "7":
			res += "July";
			break;
		case "8":
			res += "August";
			break;
		case "9":
			res += "September";
			break;
		case "10":
			res += "October";
			break;
		case "11":
			res += "November";
			break;
		case "12":
			res += "December";
			break;
		default:
			return null;

		}
		for (int i = 0; i < sb.length(); i++) {
			res += sb.charAt(i);
		}
		return res;
	}

	public static void main(String[] args) {
		String date = "12/12/2012";
		System.out.println(dateFor(date));
	}

	
	}
