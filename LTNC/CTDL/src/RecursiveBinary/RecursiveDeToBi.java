package RecursiveBinary;

public class RecursiveDeToBi {
	public static String RecursiveDecToBi(int deNUm) {
		String result = "";
		if ((deNUm / 2) == 1) {
			result += "1" + deNUm % 2;
		} else {
			result += RecursiveDecToBi(deNUm / 2) + deNUm % 2;

		}
		return result;
	}

	/*
	 * deNUm = 15 result = recursiveDecToBi(7)+1 decNum = 7 result =
	 * recursiveDecToBi(3)+"11" decNum = 3 result = recursiveDecToBi(1)+"111" decNum
	 * = 1 stop condition result "1"+"111" = "1111"
	 */
	// I has String abc => cba
	public static String reverseString(String text) {
		String result = "";
		if (text.length() == 1) {
			result = text;
		} else {
			result += text.charAt(text.length() - 1) + reverseString(text.substring(0, text.length() - 1));
		}

		return result;
	}

	public static String decToBin(int dec) {
		if (dec == 1) {
			return 1 + "";

		}
		return decToBin(dec / 2) + "" + (dec % 2);
	}

	public static void main(String[] args) {
		System.out.println(RecursiveDeToBi.reverseString("abc"));
		System.out.println(RecursiveDeToBi.RecursiveDecToBi(43));
	}
}
