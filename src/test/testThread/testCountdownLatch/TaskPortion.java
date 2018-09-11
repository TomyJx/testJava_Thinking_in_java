package test.testThread.testCountdownLatch;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-09-28-23:27
 */
public class TaskPortion implements Runnable {

	private static int counter = 0;

	private final int id = counter++;

	private CountDownLatch latch;

	private Random random = new Random(47);

	public TaskPortion(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		try {
			doWork();
			latch.countDown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void doWork() throws InterruptedException {
		TimeUnit.MILLISECONDS.sleep(random.nextInt(1000));
		System.out.println(this + " completed");
	}

	@Override
	public String toString() {
		return String.format("%1$-3d", id);
	}
}
