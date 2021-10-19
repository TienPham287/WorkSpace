 package Baitap;

public class Numberformat2 {
	public static String Numberformat(int num) {
		StringBuilder sb = new StringBuilder(""+ num);
		int n =(sb.charAt(0)=='-')?1:0;
		for (int i = sb.length()-3; i > n; i -= 3) {
			sb.insert(i, ","); 
			
		}
		
		return sb.toString();
		
	}
	public static void main(String[] args) {
		int num = 123456;
		System.out.println(Numberformat(num));
	}

}
