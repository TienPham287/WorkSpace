package LTNC3;

import java.util.Scanner;

public class docso {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("nhap 1 so");
			int number = s.nextInt();
			int surplus2 = number % 100;
			int surplus = number % 10;
			String translate = "";
			String[] unit = { "khong", "mot", "hai", "ba", "bon", "nam", "sau", "bay", "tam", "chin" };
			String[] prefix = { "muoif", "le", "tram", "mots", "lam", "muoi" };
			if (number < 10) {
				translate += unit[surplus];
			} else if (number > 10 && number < 20) {
				if (surplus == 5) {
					translate += prefix[0] + " " + prefix[4];
				} else {
					translate += prefix[0] + " " + unit[surplus];
				}
			}
			int sohangdau = (number - surplus) / 10;
			if (number % 10 == 0 && number < 100) {
				translate += unit[sohangdau] + " " + prefix[0];
			} else if (number > 20 && number < 100 && number % 10 == 0) {
				translate += unit[sohangdau] + " " + unit[surplus];
			}
			int sohangdau1 = (number - surplus) / 100;
			if (number % 100 == 0) {
				translate += unit[sohangdau1] + " " + prefix[2];
			}

			System.out.println(translate);
		}
	}
}
