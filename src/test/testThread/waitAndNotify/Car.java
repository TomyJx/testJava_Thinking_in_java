package test.testThread.waitAndNotify;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-09-20-21:19
 */
public class Car {
	private boolean waxOn = false;

	public synchronized void waxed() {
		waxOn = true;
		notifyAll();
	}

	public synchronized void buffed() {
		waxOn = false;
		notifyAll();
	}

	public synchronized void waitForWaxing() throws InterruptedException {
		while (!waxOn)
		wait();
	}

	public synchronized void waitForBuffing() throws InterruptedException {
		while (waxOn)
		wait();
	}
}
