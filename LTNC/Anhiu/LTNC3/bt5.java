package LTNC3;

public class bt5 {
	public static int[][] traingle(int size) {
		int[][] arr1 = new int[size][];
		for (int i = 0; i < size; i++) {
			arr1[i] = new int[i + 1];

		}
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = j+1;
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
		dislaypascan(traingle(2));
	}
}
