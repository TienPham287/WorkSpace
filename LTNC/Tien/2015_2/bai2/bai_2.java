package bai2;

public class bai_2 {
	public static int ucln(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		if (a == 0 || b == 0) {
			return a + b;
		}
		while (a != b) {
			if (a > b)
				a = a - b;
			else
				b = b - a;
		}
		return a;
		
	}
	public static void main(String[] args) {
		System.out.println(ucln(3,8));
	}
}

