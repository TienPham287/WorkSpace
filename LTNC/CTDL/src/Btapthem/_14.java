package Btapthem;

public class _14 {
	public static boolean toanSochan(int a) {
		if (a%2==1 )
			return false;
		if (a % 2 ==0 && a == 0)
			return true;
		return toanSochan(a / 10);
	}

	public static void main(String[] args) {
	System.out.println(toanSochan(148));
	}
}


