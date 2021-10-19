package LTNC1;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		System.out.println("nhap mot so");
		Scanner S = new Scanner(System.in);
		int so = S.nextInt();
		if (Math.sqrt(so) / 2 != 1) {
			System.out.println("la so nguyen to");

		} else {
			System.out.println("khong phai la so nguyen to");
		}

	}
}
