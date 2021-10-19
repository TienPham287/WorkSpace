package ONTHI;

import java.util.Scanner;

public class Bai2 {
	
	public static void main(String[] args) {
		int c,i;
		Scanner S = new Scanner(System.in);
		System.out.println("nhap so phan tu cua mang");
		int n = S.nextInt();
		int[] tien = new int[n];
		for ( i = 0; i < n; i++) {
			System.out.println("nhap phan tu " + i);
		tien[i] = S.nextInt();
		
		}
		System.out.println("nhap x");
		int x = S.nextInt();
		for ( c = i = 0;i < n;i++) {
			if(tien[i] !=x) {
				tien[c] = tien[i];
				c++;
			}
		}
		n=c;
		
		for(i = 0; i<n;i++) {
			System.out.print(tien[i]);
		}
		
	}

}
