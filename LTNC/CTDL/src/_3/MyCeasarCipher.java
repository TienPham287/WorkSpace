package _3;

public class MyCeasarCipher {
	private static final char[] ALPHABET = { ' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'K', 'J', 'M', 'N', 'Q',
			'P', 'R', 'O', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
	private static int step;

	public MyCeasarCipher(int step) {
		// TODO Auto-generated constructor stub
		this.step = step;
	}

	public static char encoder(char c) {
		int b = 0;
		for (int i = 0; i < ALPHABET.length; i++) {
			if ((ALPHABET[i] + "").equals((c + "").toUpperCase())) {
				b = i;
			}
		}

		int a = (b + step) % 26;
		if (b == 0)
			a = 0;
		return ALPHABET[a];

	}

	public String encoder(String s) {

		StringBuffer st = new StringBuffer();
		char[] anhiu = s.toCharArray();
		for (int i = 0; i < anhiu.length; i++) {

			st.append(encoder(anhiu[i]));

		}

		return st.toString();

	}

	public static char dencoder(char c) {
		int b = 0;
		for (int i = 0; i < ALPHABET.length; i++) {
			if ((ALPHABET[i] + "").equals((c + "").toUpperCase())) {
				b = i;
			}
		}
		int a = (b - step + 26) % 26;
		if (b == 0)
			a = 0;
		return ALPHABET[a];
	}
 
	public String dencoder(String s) {
		StringBuffer st = new StringBuffer();
		char[] anhiu = s.toCharArray();
		for (int i = 0; i < anhiu.length; i++) {
			st.append(dencoder(anhiu[i]));
		}
		return st.toString();
	}

	public static void main(String[] args) {
		MyCeasarCipher m = new MyCeasarCipher(10);
		System.out.println(encoder('T'));
		System.out.println(m.encoder("ANH YEU EM"));
		System.out.println(dencoder('D'));
System.out.println(m.dencoder("JWR IPE PV"));
		
	}

}
