package bai_2;

public class bai2 {
	public static String chuoi(String s) {
		char[] c = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < c.length; i++) {
			if (c[i] >= 'a' && c[i] <= 'z') {
				sb.append(c[i]);
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		System.out.println(chuoi("PphamTthuyTtien"));
	}
	
}
