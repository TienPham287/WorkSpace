package Btapthem;

public class _10 {
	public static int daonguoc(int n) {
		int out = 0;
		while (n != 0) {
			out = out * 10 + n % 10;
			n=n/10;

			
		}
		return out;
	}

	public static void main(String[] args) {
		System.out.println(daonguoc(123));
	
	}
}
