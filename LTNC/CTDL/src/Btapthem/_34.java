package Btapthem;

public class _34 {
public static float Funcion(float n) {
	if (n==1)
		return  (float) Math.sqrt(2);
	return (float) Math.sqrt(2+Funcion(n-1));
	
}
public static float Funcion35(float n) {
	if (n==1)
		return 1;
	return (float) (Math.sqrt(n+Funcion35(n-1)));
}
public static float Funcion36(float n) {
	if (n==1)
		return 1;
	return (float) (Math.sqrt(Funcion36(n)+fact(n-1)));
}
public  static  float fact(float  n) {
	if(n==1)
		return  1;
	return (float) Math.sqrt(n);

}
public static void main(String[] args) {
	System.out.println(Funcion(3));
	System.out.println(Funcion35(3));
	System.out.println(Funcion36(3));
	}

}
