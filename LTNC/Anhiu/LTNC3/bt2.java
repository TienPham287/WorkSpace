package LTNC3;

public class bt2 {
	public static int[][] traingle(int[] arr) {
		int[][] arr1 = new int[arr.length][];
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = new int[i + 1];

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i, value = arr[i]; j > -1; j--, value--) {
				arr1[i][j] = value;
			}
		}
		return arr1;

	}

	public static void dislaypascan(int[][] arr2) {
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int[] arr = { 8, 5, 2 };
		dislaypascan(traingle(arr));
	}
}
