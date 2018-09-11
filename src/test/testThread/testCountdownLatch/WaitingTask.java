package test.testThread.testCountdownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-09-28-23:27
 */
public class WaitingTask implements Runnable {

	private static int counter = 0;

	private final int id = counter++;

	private CountDownLatch countDownLatch;

	public WaitingTask(CountDownLatch countDownLatch) {
		this.countDownLatch = countDownLatch;
	}

	@Override
	public void run() {
		try {
			countDownLatch.await();
			System.out.println("lathc barrier passed for " + this);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return String.format("WaitingTask %1$-3d", id);
	}

}
