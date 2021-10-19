package bai1;

import java.util.Random;
import java.util.Scanner;

public class bai1 {
	public static int[] createArr(int n) {

		int[] arr = new int[n];
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(n);
		}

		return arr;
	}

	public static void sum(int x, int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == x) {
					System.out.print(arr[i] + " " + arr[j] + "\n");
				}
			}
		}
	}

	public static void prin(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		while (true) {
			System.out.println("\nnhập số x ");
			Scanner scanner = new Scanner(System.in);
			int x = scanner.nextInt();
			int n = 20;
			int[] arr = createArr(n);
			System.out.println("tạo mảng: \n");
			prin(arr);
			System.out.println("tổng bằng x: ");
			sum(x, arr);
		}
	}
}
