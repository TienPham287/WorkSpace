package _9;

public class Recursive {
	public static int recur1(int a) {

		if (a == 1)
			return 1;
		else

			return (int) Math.pow((-1), (a + 1)) * a + recur1(a - 1);
	}

	public static int recur2(int b) {
		if (b == 1)
			return 1;

		return fact(b) + recur1(b - 1);
	}

	private static int fact(int b) {
		// TODO Auto-generated method stub
		if (b == 0)
			return 1;
		else
		return b * fact(b - 1); 
	}
	public static int recur3(int c) {
		if (c == 1)
			return 1;
		else
		return (int) (Math.pow(c, 2) + recur3(c-1));
	}
	public static double recur4(int d) {
		if (d==1)
			return 1.0;
		else
		return fact4(d) + recur4(d-1);
	}
	private static double fact4(int d) {
		if (d==1)
			return 0.5;
		else 
		return 1/(2*d* fact4(d-1));  
	}
	
	public static void main(String[] args) {
		System.out.println(recur1(3));
		System.out.println(recur2(3));
		System.out.println(recur3(3));
		System.out.println(recur4(2));
	}

}
