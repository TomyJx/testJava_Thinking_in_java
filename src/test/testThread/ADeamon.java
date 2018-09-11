package test.testThread;

import java.util.concurrent.TimeUnit;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-29-0:09
 */
public class ADeamon implements Runnable {
	@Override
	public void run() {
		try {
			System.out.println("Starting deamon");
			TimeUnit.MILLISECONDS.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			System.out.println("this should always run?");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new ADeamon());
		t.setDaemon(true);
		t.start();
		TimeUnit.MILLISECONDS.sleep(10);
	}
}
