package test.testThread.interrupt;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-09-13-21:25
 */
public class SynchronizedBlocked implements Runnable {

	public SynchronizedBlocked() {
		new Thread(){
			@Override
			public void run() {
				method();
			}
		}.start();
	}

	public synchronized void method() {
		while (true) {
			Thread.yield();
		}
	}

	@Override
	public void run() {
		System.out.println("Trying to call method()");
		method();
		System.out.println("Exiting SynchronizedBlocked.run()");
	}
}
