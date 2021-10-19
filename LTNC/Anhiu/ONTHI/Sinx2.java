package ONTHI;

public class Sinx2 {
	public static void main(String[] args) { 
		double x =1;
		double num = 1/1000;
		int n =5;
		System.out.println(Ct(n, x));
		System.out.println(sin(num, x));
		
	}
	public static double sin(double num, double x) {
		int n=0;
		double kq = 0;
		if (x == 0) return kq;
		while (Ct(n, x) >= num) {
			kq = (n%2==0)? kq + Ct(n, x):kq - Ct(n, x);
			n++;
			if (Ct(n, x)==0)
				break;
		//	System.out.println(kq);
		
		}
		return kq;
		}
	public static double Ct(int n,double x) {
	double a=1, b=1;
	for (int i =1; i <=2*n +1; i++) {
		b *= i;
		
	}
	for (int i =1; i<=2*n+1; i++) {
		a*=i;
		
	}
	a = a/b;
	return a;
	
	}

}
