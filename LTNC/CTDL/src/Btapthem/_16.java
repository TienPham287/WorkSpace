package Btapthem;

public class _16 {
	public static int getSn16(int n) {
		if (n == 0)
			return 0;

		return n + getSn16(n - 1);
	}

	public static int getSn17(int n) {
		if (n == 1)
			return 1;

		return n * n + getSn17(n - 1);
	}

	public static double getSn18(double n) {
		if (n == 1)
			return 1;
		else
		return ((1/n)+getSn18(n-1));
	}

	public static double getSn19(double n) {
		if (n == 1)
			return 0.5;
		
		return  getSn19(n - 1)+1/( 2 * n);
	}
	public static double getSn20(double n) {
		if (n==0)
			return 1;
		return (1/((2*n)+1) + getSn20(n-1));
	}
	public static double getSn21(double n) {
		if (n==1)
			return 0.5;
		return (1/(n*(n+1)) + getSn21(n-1));
	}
	public static double getSn22(double n) {
		if (n==1)
			return 0.5;
		return (n/(n+1) + getSn21(n-1));
	}
	public static double getSn23(double n) {
		if (n==0)
			return 0.5;
		return (((2*n)+1)/((2*n)+2) + getSn23(n-1));
	}
public static int getSn24(int n) {
	if(n==1)
		return 1;
	return getSn24(n-1)*n;
}

	public static void main(String[] args) {
		System.out.println(getSn16(3));
		System.out.println(getSn17(2));
		System.out.println(getSn18(2));
		System.out.println(getSn19(2));
		System.out.println(getSn20(2));
		System.out.println(getSn21(2));
		System.out.println(getSn22(2));
		System.out.println(getSn23(2));
		System.out.println(getSn24(4));
	}
}
