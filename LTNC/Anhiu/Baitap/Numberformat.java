package Baitap;

public class Numberformat {
	public static String Numberformat(int num) {
		StringBuilder sb = new StringBuilder(""+ num);
		for (int index = sb.length()-3; index>0; index -= 3) {
			sb.insert(index, ",");
			
		}
		return sb.toString();
		
	}
	public static void main(String[] args) {
		System.out.println(Numberformat(0));
		System.out.println(Numberformat(99));
		System.out.println(Numberformat(10000));
		System.out.println(Numberformat(123456));
	}

}
