package LTNC1;

import java.util.Scanner;

public class bai4 {
	
	public static void main(String[] args) {
		System.out.println("nhap mot so");
		Scanner S = new Scanner(System.in);
		int number = S.nextInt();
		
		int count = 0;
		
		if(number==0) {
			 count++;
		}
		while (number != 0) {
			number = number/10;
			count++;
		}
		System.out.println(count);
	}


}
