package Btapthem;

public class _4 {
public static int demsonguyen(int n) {
	if (n==0)
		return 0;
	return demsonguyen(n/10)+ 1;
}
public static void main(String[] args) {
	System.out.println(demsonguyen(50));
}
}
