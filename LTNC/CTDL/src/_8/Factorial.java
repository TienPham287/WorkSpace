package _8;

public class Factorial {
	public static int nonRecursiveFactorial(int n) {
		int result = 1;
		if (n == 0)
			result = 1;
		else {
			for (int i = 1; i < n + 1; i++) {
				result *= i;
			}
		}
		return result;

	}

	public static void main(String[] args) {
		System.out.println(Factorial.nonRecursiveFactorial(10));
	}
}
