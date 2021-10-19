package LTNC4;

public class ShareData {
public int rad = 0;
public int x = 0;
public synchronized void Add(int plus) {
	x += plus;
	System.out.println("\n day so x: " +x);
	for (int i = 0; i < x; i++) {
		System.out.println(" " +  x);
		
	}
}
}
