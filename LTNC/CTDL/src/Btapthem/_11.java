package Btapthem;

public class _11 {
	public static int solonnhat(int Max, int n) {
		if (n  == 0)
			return Max;
		Max = (Max > (n % 10) ? Max : (n % 10));
		return solonnhat(Max, n / 10);

	}
	
	public static void main(String[] args) {
		System.out.println(solonnhat(Integer.MIN_VALUE,451));
	}
}
