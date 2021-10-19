package Btapthem;

public class _6 {
public static int tichcacso(int n) {
	if (n==0)
		return 1;
	return tichcacso(n/10) * n%10;
	
}
public static void main(String[] args) {
	System.out.println(tichcacso(1001));
}
}
