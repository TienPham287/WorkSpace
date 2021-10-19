package Btapthem;

public class _30 {
public static float getSn30(float n) {
	if (n==1)
		return 1;
	return getSn30(n-1)+n;
}
public static float fact(float n) {
	if (n==1)
		return 1;
	return 1/getSn30(n) + fact(n-1);
}
public static void main(String[] args) {
	System.out.println(fact(3));
}
}
