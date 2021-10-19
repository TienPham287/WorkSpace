package Baitap;

import java.util.Random;

public class RandomNum {
	public static int[] RandomSuArr(int[] arr, int qyt) {
		if (qyt > arr.length || qyt <= 0)
			return null;
		else {
			Random r = new Random();
			int[] arr1 = new int[qyt];
			int[] end = new int[qyt];
			for (int i = 0; i < qyt; i++) {
				arr1[i] = r.nextInt(arr.length - 1);
				for (int j = 0; j < i; j++) {
					if (arr1[j] == arr1[i]) {
						i--;
					}

				}
				end[i] = arr[arr1[i]];
			}
			return end;

		}

	}

	public static void main(String[] args) {
		int[] arr = { 1, 45, 46, 78, 234, 12, 43, 58 };
		int qyt = 5;
		int[] end = RandomSuArr(arr, qyt);
		for (int i = 0; i < 5; i++) {
			System.out.print(end[i] + " " );
		}

	}
}
