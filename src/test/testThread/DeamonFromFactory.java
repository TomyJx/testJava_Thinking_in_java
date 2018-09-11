package test.testThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-28-23:53
 */
public class DeamonFromFactory implements Runnable {
	@Override
	public void run() {
		while (true) {
			try {
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println(Thread.currentThread() + " " + this);
			} catch (InterruptedException e) {
				System.out.println("interrupted");
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ExecutorService execu = Executors.newCachedThreadPool(new DeamonThreadFactory());
		for (int i = 0; i < 10; i++) {
			execu.execute(new DeamonFromFactory());
		}
		System.out.println("All deamons started");
		TimeUnit.MILLISECONDS.sleep(120);

	}
}
