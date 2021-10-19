package Java1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Thread1 extends Thread{
	List<Integer> list = new ArrayList<>();
@Override
public void run() {
	//stop() hoac xu li het code
	Random random = new Random();
	for (int i = 0; i < 10; i++) {
		int rad = random.nextInt(100);
		list.add(rad);
		System.out.println("T1 > " +rad);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	//stop();
}
}
