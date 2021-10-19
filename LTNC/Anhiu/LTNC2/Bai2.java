package LTNC2;

public class Bai2 {
	public static void main(String[] args) {
		int[][] soNguyen = new int[7][10];
		for (int i = 0; i < soNguyen.length; i++) {
			for (int j = 0; j < soNguyen[i].length; j++) {
				soNguyen[i][j] = i + j;

			}

		}
		for (int i = 0; i < soNguyen.length; i++) {
			for (int j = 0; j < soNguyen[i].length; j++) {
				System.out.print(soNguyen[i][j]);
			}
			System.out.println();
		}

	}

}
