package Btapthem;

public class _9 {
public static int tichsole(int n) {
	if (n==0)
		return 1;
	if (n % 2 ==1)
		return tichsole(n/10)* (n%10);
	return tichsole(n/10);
}
public static void main(String[] args) {
	System.out.println(tichsole(1359));
}
}
