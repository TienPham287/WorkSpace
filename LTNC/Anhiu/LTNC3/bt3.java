package LTNC3;

public class bt3 {
	public static boolean songuyento(int i) {

		if (i > 2 && Math.sqrt(i) / 2 != 1) {
			return true;
		} else {
			return false;
		}

	}

	public static void phantich(int i) {
		for (int a = 2; a <= i; a++) {
			while (songuyento(i) && (i % a == 0)) {
				System.out.println(i);
				i = i / a;
			}

		}

	}

	public static void main(String[] args) {
		bt3 p = new bt3();
		p.phantich(10);
	}

}
