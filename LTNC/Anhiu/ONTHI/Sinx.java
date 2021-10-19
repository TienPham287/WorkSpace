package ONTHI;

public class Sinx {
	public static long fact(int n) {
		long res = 1;
		for (int i = 1; i <= n; i++) {
			res *= i;
		}
		return res;
	}

	public static double gma(double x, int n) {
		return Math.pow(x, 2 * n + 1) / fact(2 * n + 1);
	}

	public static double sin(double x, double a) {
		double b = 0, c;
		int n = 0;
		int i = 1;
		x = x % (Math.PI);
		do {
			c = gma(x, n++);
			b += c * i;
			i *= -1;
		} while (c > a);
		return b;
	}

	public static void main(String[] args) {
		double x = Math.PI / 2;
		double a = 0.00000000000000000000000001;
		System.out.println(sin(x, a));
		System.out.println(Math.sin(x));
	}
}
