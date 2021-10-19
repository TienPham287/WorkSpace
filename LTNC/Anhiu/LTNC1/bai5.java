package LTNC1;

public class bai5 {
	static int[] arrayPlus(int[] arr1, int[] arr2) {
		int[] arr3;

		int maxlen = (arr1.length > arr2.length) ? arr1.length : arr2.length;

		arr3 = new int[maxlen];

		System.arraycopy(arr1, 0, arr3, 0, arr1.length);

		for (int i = maxlen - 1, j = arr2.length - 1; j > -1; i--, j--) {
			arr3[i] = arr3[i] + arr2[j];
		}
		return arr3;

	}

	public static void main(String[] args) {
		int arr1[] = { 1, 4, 6 };
		int arr2[] = { 2, 7 };

		int[] arr3 = arrayPlus(arr1, arr2);
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}

	}

}
