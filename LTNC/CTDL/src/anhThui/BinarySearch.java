package anhThui;

public class BinarySearch {
	public static int search(int[] arr, int target) {
		int low = 0;
		int hight = arr.length - 1;
		int mid = (low + hight) / 2;
		while (low < hight||hight<low) {
			if (target == arr[mid])
				return mid;
			else if (target < arr[mid])
				hight = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}

	public static int search1(int[] arr1, int target, int low, int high) {
		int mid = (low + high) / 2;
		if (low > high||high<low)
			return -1;
		else {
			if (target == arr1[mid])
				return mid;
			else if (target < arr1[mid])
				return search1(arr1, target, low, mid - 1);
			else
				return search1(arr1, target, mid + 1, high);
		}

	}
	public static int search1(int[] arr1, int target) {
		return search1(arr1, target,0,arr1.length-1);
	}
	public static void main(String[] args) {
		int[] arr = { 2, 5, 8, 3, 6, 1 };
		System.out.println(search(arr, 8));            
		System.out.println(search1(arr,5));
	}
}
