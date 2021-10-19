package Baitap;

import java.util.Iterator;

public class FillNum {
	public static int[] fill(int a, int b) {
		int[] res = new int[b];
		for (int i = 1; i <= a; i++) {
			res[i % b]++;
		}
		return res;
	}

	public static void display(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println("du " + i + ": " + ar[i]);
		}
	}

	public static void main(String[] args) {
		int a = 25;
		int b = 5;
		display(fill(a, b));

	}
}
