package bai1;

public class bai_1 {
	public static boolean PhamThuyTien(int[][] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i][i] > arr[i + 1][i + 1]) {
				return false;

			}

		}

		return true;
	}
	public static boolean PhamThuyTien2(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i; j < arr.length; j++) {
				if(arr[i][i] < arr[j][j]){
					return false;

				}
			}

		}

		return true;
	}
	
	public static void main(String[] args) {
	int[][] arr = { { 4, 5, 7 }, { 6, 6, 5 }, { 1, 6, 6 } };
		System.out.println(PhamThuyTien(arr));
		System.out.println(PhamThuyTien2(arr));
	}
}
