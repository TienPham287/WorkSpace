package Btapthem;

public class _13 {
	public static boolean toanSoLe(int a) {
		if (a%2==0 && a==0)
			return false;
		if (a % 2 ==1)
			return true;
		return toanSoLe(a / 10);
	}

	public static void main(String[] args) {
	System.out.println(toanSoLe(0));
	}
}
