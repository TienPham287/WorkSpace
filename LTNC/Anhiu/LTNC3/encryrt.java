package LTNC3;

import java.util.Iterator;

public class encryrt {
	public static String encryrt(String st) {
		String code = "";
		int count = 0;
		int b = (st.length() % 5 != 0) ? st.length() / 5 + 1 : st.length() / 5;
		char[][] arr = new char[b][5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (count > st.length() - 1) {
					arr[i][j] = '-';
					continue;
				}
				arr[i][j] = st.charAt(count);
				count++;
			}
		}
		
			for (int j = 0; j < 5; j++) {
				for (int i = 0; i < arr.length; i++) {
				code += arr[i][j];
			}
		}
		return code;

	}

	public static void main(String[] args) {
		String st = "i am a studen";
		System.out.println(encryrt(st));
	}

}
