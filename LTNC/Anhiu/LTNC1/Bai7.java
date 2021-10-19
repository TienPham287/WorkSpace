package LTNC1;

import java.util.Scanner;

public class Bai7 {
	public static int nhap() {
		Scanner scanner = new Scanner(System.in);
		boolean check = false;
		int n = 0;
		while (!check) {
			System.out.println(" ");
			try {
				n = scanner.nextInt();
				check = true;

			} catch (Exception e) {
				System.out.println("Ban phai nhap lai so ");
				scanner.nextInt();

			}
		}
		return (n);

	}

	public static int UCLN(int a, int b) {

		while (a != b) {
			if (a > b)
				a = a - b;

		}
		return (a);
	}

	public static void main(String[] args) {
		System.out.println("Nhap a");
		int a = nhap();
		System.out.println("Nhap b");
		int b = nhap();
		System.out.println("Uoc chung lon nhat cua " + a + "va" + b + "la" + UCLN(a, b));
		System.out.println("Boi chung nho nhat cua " + a + "va" + b + "la:" + ((a * b) / UCLN(a, b)));
	}
}
