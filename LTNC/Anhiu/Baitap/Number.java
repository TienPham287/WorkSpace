package Baitap;

public class Number {
	public static int[] number(int n) {
		int[] res = new int[5];
		int count =0;
		while (n%5 != 0 ) {
			count++;
			n--;
			
		}
		for (int i = 0; i < res.length; i++) {
			res[i]=n/5;
		
		}
		for(int i=0; i< count;i++) {
			res[i]++;
			
		}
		return res;
	}
public static void main(String[] args) {
	int n =25;
	int[] arr = number(n);
	for (int i=0; i < arr.length; i++) {
		System.out.println(arr[i]+"");
	}
}
}
