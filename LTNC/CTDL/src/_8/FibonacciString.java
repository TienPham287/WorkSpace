package _8;

public class FibonacciString {
	public String s = "";

	public FibonacciString(int n) {
		this.s = run(n);
	}

	private String run(int n) {
		String result = "";
		for (int i = 1; i < n + 1; i++) {
			result += fib(i) + "";
		}
		return result;
	}

	private int fib(int n) {
		int result = 0;
		if (n < 1)
			throw new RuntimeException("loi roi");

		else {
			if ((n == 1) || (n == 2))
				result += 1;

			else
				result += fib(n - 1) + fib(n - 2);

		}
		return result;

	}

	public String totring() {
		return "Fibonacci [" + s + "]";
	}

	public static void main(String[] args) {
		FibonacciString fi = new FibonacciString(-1);
		System.out.println(fi.fib(-1));
	}
}
