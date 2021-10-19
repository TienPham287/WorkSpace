package LTNC3;

public class bt1 {

	public static int max(int[] arr) {
		int a = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > a) {
				a = arr[i];
			}

		}

		return a;
	}

	public static int min(int[] arr) {
		int b = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < b) {
				b = arr[i];

			}
		}
		return b;
	}

	public static int sum(int[] arr) {
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			c += arr[i];
		}
		return c;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		System.out.println(max(arr));
		System.out.println(min(arr));
		System.out.println(sum(arr));
	}

}
