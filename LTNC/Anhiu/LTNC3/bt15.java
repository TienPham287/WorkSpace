package LTNC3;

import java.util.Scanner;

public class bt15 {
	static Scanner sc = new Scanner(System.in);
	static int a = sc.nextInt();
	
	public static void bt15() {
		if (check(a)) {
			System.out.println(a);
			count(a);
		}
	}
	public static boolean check(int a) {
		if (a < 1) {
			return false;
		}
		for (int i = 2; i <= a / 2; i++)
			if (a % i == 0) {
				return false;
			}
		return true;
	}

	public static void count(int a) {
		for (int i = 2; i <= a; i++) {
			if (check(a)) {
				System.out.println(a);
			}
		}
	}

	public static void main(String[] args) {
		bt15();
	}

}
