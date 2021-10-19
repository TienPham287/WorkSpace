package LTNC4;

import java.util.Random;

public class Thread2 extends Thread {
	ShareData sharedata;

	public Thread2(ShareData sharedata) {
			this.sharedata = sharedata;
		}
	@Override
	public void run() {
for (int i = 0; i <20; i++) {
	synchronized(sharedata) {
		System.out.println("T2<i>" +i);
		sharedata.notifyAll();
	//	if (i == 19) {
//			System.out.println("Stop t1!");
//			stop();
		try {
			sharedata.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	int result = sharedata.rad* sharedata.rad;
	System.out.println("T2>" +result);
	
}
	}
	}
}
