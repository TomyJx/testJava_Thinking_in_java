package test.testThread.interrupt;

import java.util.concurrent.TimeUnit;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-09-13-21:22
 */
public class SleepBlocked implements Runnable {
	@Override
	public void run() {
		try {
			TimeUnit.SECONDS.sleep(100);
		} catch (InterruptedException e) {
			System.out.println("SleepBlocked InterruptedException");
		}
		System.out.println("Exiting SleepBlocked.run()");
	}
}
