package Btapthem;

public class _5 {
public static int tongcacso(int n) {
	if (n==0)
		return 0;
	return tongcacso(n/10) + n%10;
}
public static void main(String[] args) {
	System.out.println(tongcacso(37));
}
}
