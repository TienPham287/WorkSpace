package ONTHI;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		String soNguyen = S.next();
		String daoNguoc = "";
		for (int i = soNguyen.length() - 1; i >= 0; i--) {
			daoNguoc += soNguyen.charAt(i);
		}

		System.out.println(daoNguoc);
	}
}
