package Btapthem;

public class _31 {
public static float getSn31(float x, int n) {
	if (n==1)
		return x;
	return (_25.luyThua(x, n)/_16.getSn24(n))+getSn31(x, n-1);
}
public static float getSn32(float x, int n) {
	if (n==0)
		return 1;
	return (_25.luyThua(x, 2*n)/_16.getSn24(2*n))+getSn32(x, n-1);
}
	public static void main(String[] args) {
		System.out.println(getSn31(3, 4));
		System.out.println(getSn32(3, 2));
	}
}
