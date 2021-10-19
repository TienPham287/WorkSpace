package LTNC1;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		System.out.println("nhap mot so");
		Scanner S = new Scanner(System.in);
		int so = S.nextInt();
		if (so % 2 == 0) {
			System.out.println("so do la so chan");
		} else
			System.out.println("so do la so le");

	}
}