package ONTHI;

import java.util.Scanner;

public class FindNum {
	public static int[] findnum(int[] n, int x) {
		int[] array = new int[n.length - 1];
		for (int i = 0; i < n.length; i++) {
			if (n[i] == x) {
				System.arraycopy(n, 0, array, i , i-1);
				System.arraycopy(n, i, array, n.length, n.length - i);
			}
		}
		return array;
	}
	
	public static void main(String[] args) {
		int[] n = { 1, 2, 3, 4, 5 };
		System.out.println(findnum(n, 3));
	}
}
