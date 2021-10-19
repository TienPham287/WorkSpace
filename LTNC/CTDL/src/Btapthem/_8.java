package Btapthem;

public class _8 {
	public static int tongSoChan(int n) {
		if (n == 0)
			return 0;
		if (n % 2 == 0)
			return tongSoChan(n / 10) + (n % 10);
		return tongSoChan(n / 10);

	}

	public static void main(String[] args) {
		System.out.println(tongSoChan(256));
	}
}
