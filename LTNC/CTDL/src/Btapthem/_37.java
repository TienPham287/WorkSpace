package Btapthem;

public class _37 {
public static float _37(float n) {
	if(n==1)
		return 1;
	return 1/(n+(_37(n-1)));
}
public static void main(String[] args) {
	System.out.println(_37(3));
}
}
