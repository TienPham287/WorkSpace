package Java1;

public class Main {
public static void main(String[] args) throws InterruptedException {
	Thread1 t1 = new Thread1();
	Thread2 t2 = new Thread2();
	t1.start();
	t2.start();
	t1.join();
	t2.join();
//	System.out.println((int) 'a');
//	System.out.println((int) 'z');
	System.out.println("Hien thi ket qua ngau nhiencua 2 Thread ");
	System.out.println("T1: ");
	for (int i = 0; i < t1.list.size(); i++) {
		System.out.print(" " + t1.list.get(i));
	}
	System.out.println("\nT2: ");
		for (int i = 0; i < t2.list.size(); i++) {
			System.out.print(" " + t2.list.get(i));
	}
}

}