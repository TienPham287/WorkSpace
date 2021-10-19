package Btapthem;

public class _3 {
	public static int tongcacso(int n) {
		if (n==0)
			return 0;
		return tongcacso(n/10) + n%10;
	}
	public static boolean check(int n) {

		int a = tongcacso(n);
		if (a % 9 != 0) {
			if (((n % 3) == 0 && n % 9 !=0))
				return true;
		}

		return false;
	}

	public static void main(String[] args) {
		System.out.println(check(9));
	}
}
