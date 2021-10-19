package _9;

public class USCLN {
	public static int UCLN(int a, int b) {
		if (b == 0)
			return a; 
		else
			return UCLN(b, a % b); 
	}

	public static void main(String[] args) {
		
		System.out.println(UCLN(5, 10));
	}
}
