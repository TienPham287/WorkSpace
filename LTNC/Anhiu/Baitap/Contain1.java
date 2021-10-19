package Baitap;

import java.util.Iterator;

	


public class Contain1 {
	static int location = -1;
	public static int location(int[] arr1, int[] arr2) {
		return location;
	}
		
	public static boolean Contain(int[] arr1, int[] arr2 ) {
		boolean n = false;
		if (arr2.length == 0) return true;
		for (int i =0; i < arr1.length; i++) {
			if (arr1.length-i < arr2.length) return false;
			if (arr1[i] == arr2[0]) {
				n = true;
			 for (int j = i+1, k=1; k< arr2.length; j++,k++) {
				 if(arr1[j] != arr2[k]) {
					 n = false; break;
				 }
			 }
			 if (n == true) {
				 location =i;
				 return n;
			 }
					
				}
			}
		
		
		return n;
		
	}
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4};
		int[] arr2 = {2};
		System.out.println(Contain(arr1, arr2)+ "" +location(arr1, arr2));
	}

}
