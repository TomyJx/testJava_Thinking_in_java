package test.testThread.waitAndNotify;

import java.util.concurrent.TimeUnit;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-09-20-21:28
 */
public class WaxOff implements Runnable {

	private Car car;

	public WaxOff(Car car) {
		this.car = car;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				car.waitForWaxing();
				System.out.println("Wax Off");
				TimeUnit.MILLISECONDS.sleep(200);
				car.buffed();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
