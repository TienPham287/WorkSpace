package Btapthem;

public class _33 {
public static int uocleMax(int n) {
if (n%2==1)
	return n;
return uocleMax(n/2);
}
public static void main(String[] args) {
	System.out.println(uocleMax(100));
}
}