package Btapthem;

public class _25 {
public static float luyThua(float x, int n) {
	if (n==0)
		return 1;
	if(n<0)
		return luyThua(x,n+1) * 1/x;
	return luyThua(x, n-1)*x; 
		
}
public static float getSn25(float x ,int n) {
	if (n==0)
		return 1;
	return luyThua(x, n) + getSn25(x, n-1);
}
public static float getSn28(float x, int n) {
	if (n==0)
		return 1;
	return luyThua(x, 2*n) + getSn28(x, (n-1)); 
}
public static float getSn29(float x, int n) {
	if (n==0)
		return 1;
	return luyThua(x, (2*n)+1) + getSn29(x, (n-1)); 
}
public static void main(String[] args) {
	System.out.println(luyThua(4,-3));
	System.out.println(getSn25(3, 3));
	System.out.println(getSn28(3, 4));
	System.out.println(getSn29(3, 4));
}
}
