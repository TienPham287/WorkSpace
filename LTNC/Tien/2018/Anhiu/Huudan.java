package Anhiu;

public class Huudan {
	public static String WordCorrect(String s) {

		StringBuffer sb = new StringBuffer();
		char[] anhiu = s.toCharArray();
		for (int i = 0; i < anhiu.length; i++) {
			if (i == 0) {
				if (anhiu[i] == ' ')
					sb.append(anhiu[i]);
				else
					sb.append((anhiu[i] + " ").toUpperCase());
			} else if (anhiu[i] != ' ') {
				sb.append((anhiu[i] + " ").toLowerCase());
			} else
				sb.append(anhiu[i]);

		}

		return sb.toString();

	}
	public static void main(String[] args) {
		System.out.println(WordCorrect("anh       yêu               EM "));
	}
}
