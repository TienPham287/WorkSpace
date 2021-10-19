package Btapthem;

public class _7 {
	public static int demsole(int n) {

		if (n == 0)
			return 0;
		if (n % 2 == 1)
			return demsole(n / 10) + 1;
		return demsole(n / 10);
	}

	public static void main(String[] args) {
		System.out.println(demsole(135));
	}
}
