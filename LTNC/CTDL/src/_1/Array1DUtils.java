package _1;

import java.util.Arrays;

public class Array1DUtils {
	/*
	 * Lop tien ich chua cac ham tien ich Ham co static de dung o lop khac co the
	 * goi ham thong qua ten lop
	 */
	public static String print1DArray(int[] array) {
		// TO DO
		/*
		 * re write Arrays.toString(array)
		 */
		String result = "[ ";
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				result += array[i];
			} else {
				result += array[i] + "; ";
			}

		}
		return result + " ]";

	}

	// Tinh tong cac so hang
	public static int sum(int[] array) {
		int n = 0;
		for (int i = 0; i < array.length; i++) {
			n = n + array[i];
		}
		return n;
	}

	// Tinh trung binh cac so hang trong mang
	public static double average(int[] array) {
		// TODO

		return sum(array) / array.length;
	}

	// Update gia tri tai mot vi tri trong mang
	public static void update(int[] array, int index, int value) {
		// TODO
		array[index] = value;
		System.out.print("method update: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");
	}

	// Kiem tra trong mang co chua gia tri nhan vao khong?
	public static boolean isContain(int[] array, int target) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == target)
				return true;
		}

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = { 1, 2, 3 };
		System.out.println(Array1DUtils.print1DArray(test));

		System.out.println("method sum: " + sum(test));

		System.out.println("method average: " + average(test));
		update(test, 1, 5);
		System.out.println("method isContain: " + isContain(test, 2));
	}

}
