package LTNC4;

import java.util.Random;



public class Thread1 extends Thread {
	ShareData sharedata;

public Thread1(ShareData sharedata) {
		this.sharedata = sharedata;
	}

@Override
public void run() {
	Random radom = new Random();
	for (int i = 0; i < 20; i++) {
		synchronized(sharedata) {// trạng thái đòng bộ 
		System.out.println("T1<i>" + i);
		int rad = radom.nextInt(100);
		sharedata.rad = rad;
		System.out.println("T1 >" +rad);
		sharedata.notifyAll(); // trạng thái đánh thức
//		if (i == 19) {
//			System.out.println("Stop t1!");
//			stop();
		
	try {
		sharedata.wait();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
}
} 

