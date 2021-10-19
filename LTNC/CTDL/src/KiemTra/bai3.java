package KiemTra;

public class bai3 {
	public static int sum(int[] arr, int i) {

		if (i == arr.length)
			return 0;
		return sum(arr, i + 1) + arr[i];
	}

	public static int sum(int[] arr) {
		return sum(arr, 0);
	}

	public static boolean check(int[] arr, int i) {
		if (i == arr.length)
			return true;
		return check(arr, i + 1) && arr[i] % 9 == 0 && sum(arr) % 9 == 0; 
	}

	public static boolean check(int[] arr) {
		return check(arr, 0);

	}

	public static void main(String[] args) {
		int[] arr = { 45, 9, 18 };
		int[] arr1 = { 72, 15, 18 };
		
		System.out.println(sum(arr));
		System.out.println(check(arr1));
		System.out.println(check(arr));
	}
}
