package ON;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		System.out.println("nhap mot so");
		Scanner S = new Scanner(System.in);
		int number = S.nextInt();
		if (Math.sqrt(number)/2 != 1) {
			System.out.println("so nguyen to");
		}else 
			System.out.println("khong la so nguyen to");
		
	}

}
