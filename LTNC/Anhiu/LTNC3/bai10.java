package LTNC3;

import java.util.Scanner;

public class bai10 {
	public static void main(String[] args) {
		String isMonth = "";
		System.out.print("nhap ngay : ");
		Scanner S = new Scanner(System.in);
		int day = S.nextInt();
		System.out.println("nhap thang:");
		int month = S.nextInt();
		System.out.println("nhap nam: ");
		int year = S.nextInt();
		switch (month) {
		case 1: {
			isMonth = "January";
			break;
		}
		case 2: {
			isMonth = "Febuary";
			break;
		}
		case 3: {
			isMonth = "Match";
			break;
		}
		case 4: {
			isMonth = "April";
			break;
		}
		case 5: {
			isMonth = "May";
			break;
		}
		case 6: {
			isMonth = "June";
			break;
		}
		case 7: {
			isMonth = "July";
			break;
		}
		case 8: {
			isMonth = "August";
			break;
		}
		case 9: {
			isMonth = "September";
			break;
		}
		case 10: {
			isMonth = "October";
			break;
		}
		case 11: {
			isMonth = "November";
			break;
		}
		case 12: {
			isMonth = "December";
			break;
		}
		default:
			throw new IllegalArgumentException("nhap lai : " + isMonth);
		}

		System.out.println(day + "/" + isMonth + "/" + year);

	}
}
