package LTNC1;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		System.out.println("nhap mot nam");
		Scanner S = new Scanner(System.in);
		int year = S.nextInt();
		if ((year % 4) != 1 && (year % 400)!=1 ) {
			System.out.println("nam nhuan");
			
		}
		else {
			System.out.println("khong nhuan");
			
		}
	}

}
