package Btapthem;

public class _12 {
	public static int sonhonhat(int Min, int n) {
		if (n % 10 == 0)
			return Min;
		Min = (Min < (n % 10) ? Min : (n % 10));
		return sonhonhat(Min, n / 10);

	}
	
	public static void main(String[] args) {
		System.out.println(sonhonhat(Integer.MAX_VALUE,2345));
	}
}
