package _4;

import java.util.Arrays;

public class MyArray {
	private static int[] array;

	public MyArray(int[] array) {
		this.array = array;
	}

	// UPDATE the value at index i by newValue
	public void update(int i, int newValue) {
		array[i] = newValue;
	}

	// CHECK whether there exist a value at index i in the array
	public boolean find(int i) {
		if (i < 0 || i > array.length - 1)
			return false;
		return true;
	}

	// Method mirror that outputs the contents of an array in a //reverse order like
	// a mirror
	// Example: input [1, 2, 3] ==> output: [1, 2, 3, 3, 2, 1]
	// input [1, 2, 3] ==> [1, 2, 3, 3, 2, 1]

	public int[] mirror() {
		int[] arr = new int[array.length * 2];
		for (int i = 0; i < array.length; i++) {
			arr[i] = array[i];
			arr[arr.length - i - 1] = array[i];
		}
		return arr;
	}

	// GET the element which its occurence is the most in the array.
	// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}
	// Output: 10

	public static int count(int value) {

		int c = 0;
		for (int i = 0; i < array.length; i++) {
			if (value == array[i])
				c++;
		}

		return c;
	}

	public int getMode() {
		int output = 0, save = 0;
		for (int i = 0; i < array.length; i++) {
			int c = count(array[i]);
			if (c > save) {
				save = c;
				output = array[i];
			}
		}

		return output;
	}

	// GET unique elements in the array.
	// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}
	// Output: 12, 9, 2
	public int[] getUniqueElements() {
		int c = 0;
		for (int i = 0; i < array.length; i++) {
			int count = count(array[i]);

			if (count == 1)
				c++;
		}
		int[] arr = new int[c];
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			int count = count(array[i]);
			if (count == 1) {
				arr[index] = array[i];
				index++;
			}
		}

		return arr;
	}

	// GET distinct elements in the array.
	// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}
	// Output: 12, 10, 9, 45, 2
	public int[] getDistinctElements() {

		int[] arr2 = new int[array.length];
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j <= i; j++) {

				if (i == j) {

					arr2[index] = array[i];
					index++;
				}
				if (array[i] == array[j])
					break;
			}
		}
		int[] output = new int[index];// dong for da chay xong
		System.arraycopy(arr2, 0, output, 0, index);

		return output;
	}

	public static int[] getDistinctElements(int[] a) {
		 

		int[] arr2 = new int[a.length];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <= i; j++) {

				if (i == j) {

					arr2[index] = a[i];
					index++;
				}
				if (a[i] == a[j])
					break;
			}
		}
		int[] output = new int[index];// dong for da chay xong
		System.arraycopy(arr2, 0, output, 0, index);

		return output;
	}

	// Common items that belong to two different sets
	public static int[] getIntersectionElements(int[] array1, int[] array2) {
		int[] arr3 = new int[Math.min(getDistinctElements(array1).length, getDistinctElements(array2).length)];
		int index = 0;
		for (int i = 0; i < getDistinctElements(array1).length; i++) {

			for (int j = 0; j < getDistinctElements(array2).length; j++) {
				if (getDistinctElements(array1)[i] == getDistinctElements(array2)[j]) {
					arr3[index] = getDistinctElements(array1)[i];
					index++;
				}
			}

		}
		return arr3;
	}

	// DISPLAY the elements of the array. Using loop to print the elements in the
	// array (without using Arrays.toString(...)
	public String toString() {
		// TODO
		return "";
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 5, 5, 1 };
		int[] array2 = { 1, 2, 5, 1 };

		MyArray myArray = new MyArray(array);
		System.out.println(myArray.getMode());
		myArray.find(5);
		System.out.println(Arrays.toString(myArray.mirror()));
		System.out.println(Arrays.toString(myArray.getUniqueElements()));
		System.out.println(Arrays.toString(myArray.getDistinctElements()));
		System.out.println(Arrays.toString(getIntersectionElements(array, array2)));
	}
}
