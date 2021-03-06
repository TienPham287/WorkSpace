package anhThui;

public class LinearSearch {
	public static int search(int[] arr, int target) {

		for (int i = 0; i < arr.length; i++) {
			if (target == arr[i])
				return i;
		}
		return -1;

	}
	
	public static int cursiveSearch(int[] arr, int target, int i) {
		if (i == arr.length)
			return -1;

		else if (arr[i] == target)
			return i;
		else
			return cursiveSearch(arr, target, i + 1);

	}

	public static int cursiveSearch(int[] arr, int target) {
		return cursiveSearch(arr, target, 0);
	}
	

	public static void main(String[] args) {
		int[] arr = { 3, 2, 5 };
		System.out.println(search(arr, 5));
		System.out.println(cursiveSearch(arr, 5));
	}
}
