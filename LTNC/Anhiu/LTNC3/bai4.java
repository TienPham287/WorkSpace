package LTNC3;

import java.util.Scanner;

public class bai4 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int number = S.nextInt();
		int array[] = new int[number];
		for (int i = 0; i < number; i++) {
			array[i] = S.nextInt();
		}
		int tmp = array[0];
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] > array[j]) {
					tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		for (int i = 0; i < number; i++) {
			System.out.print(array[i] + " ");

		}

	}

}
