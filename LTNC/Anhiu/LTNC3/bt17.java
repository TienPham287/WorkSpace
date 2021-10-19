package LTNC3;

public class bt17 {
	public static void main(String[] args) {
		int count = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;

		for (int i = 0; i <= 100; i++) {
			if (i % 5 == 0) {
				count++;
			}
			if (i % 5 == 1) {
				count2++;
			}
			if (i % 5 == 2) {
				count3++;
			}
			if (i % 5 == 3) {
				count4++;
			}
			if (i % 5 == 4) {
				count5++;
			}
		}
		System.out.println(count);
		System.out.println(count2);
		System.out.println(count3);
		System.out.println(count4);
		System.out.println(count5);

	}

}
