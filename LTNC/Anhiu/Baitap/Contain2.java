package Baitap;

public class Contain2 {
	public static boolean contain(int[] arr1, int[] arr2) {
		if (arr2.length > arr1.length)
			return false;
		int count = arr1.length - arr2.length;
		int[] temp = new int[arr2.length];
		for (int i = 0; i <= count; i++) {
			System.arraycopy(arr1, i, temp, 0, temp.length);
			if (arrayEqual(temp, arr2))
				return true;

		}
		return false;
		
	}

	private static boolean arrayEqual(int[] temp, int[] arr2) {
		if (temp.length != arr2.length)
			return false;
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] == arr2[i])
				return true;

		}
		// TODO Auto-generated method stub
		return true;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 1, 2, 3 };
		System.out.println(contain(arr1, arr2));
	}

}
