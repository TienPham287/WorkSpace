package Btapthem;

public class _26 {
public static int getSn26(int n) {
	if ( n== 1) 
		return 1;
	return getSn24(n) + getSn26(n-1);
	
}

public static int getSn24(int n) {
	if(n==1)
		return 1;
	return getSn24(n-1)*n;
}

public static void main(String[] args) {
	System.out.println(getSn26(3));
}
}