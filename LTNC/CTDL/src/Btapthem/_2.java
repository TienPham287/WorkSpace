package Btapthem;

public class _2 {
	public static boolean check(int n) {

		int a = _5.tongcacso(n);
		if (a % 9 == 0) {
			if (((n % 3) == 0 && (n % 9) == 0))
				return true;
		}

		return false;
	}

	public static void main(String[] args) {
		System.out.println(check(19));
	}
}
