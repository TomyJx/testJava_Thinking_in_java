package test.testThread;

import java.util.concurrent.TimeUnit;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-28-23:43
 */
public class SimpleDeamons implements Runnable {
	@Override
	public void run() {
		while (true) {
			try {
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println(Thread.currentThread() + " " + this);
			} catch (InterruptedException e) {
				System.out.println("sleep() interrupted");
			}finally {
				System.out.println("11111");
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(new SimpleDeamons());
			t.setDaemon(true);
			t.start();
		}
		System.out.println("All deamon started");
//		TimeUnit.MILLISECONDS.sleep(120);
	}
}
