package bai_1;

import java.util.Scanner;

public class bai1 {
	public static boolean songuyento(int a) {
		if (a < 2) {
			return false;
		}
		if (Math.sqrt(a) / 2 != 1) {
			return true;
		}	
		if(a==2) {
			return true;
		}

		return false;

	}
	public static int countNum(int b) {
		int count =0;
		
		while(b>0) {
			b /=10;
			count++;
		}
		return count;
	}
	public static String checkGB(int c) {
		if(songuyento(c)) {
			return "Good" + " "+countNum(c);
		} else {
			return "Bad";
		}
	}
	public static void main(String[] args) {
		System.out.println(songuyento(4));
		System.out.println(countNum(10));
		System.out.println("Nhap mot so nguyen: ");
		Scanner scanner = new Scanner(System.in);
		int songuyen = scanner.nextInt();
		System.out.println(checkGB(songuyen));
	}
}
