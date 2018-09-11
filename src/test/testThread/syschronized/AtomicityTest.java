package test.testThread.syschronized;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-09-06-23:23
 */
public class AtomicityTest implements Runnable {

	private int i = 0;

	public synchronized int getValue() {
		return i;
	}

	public synchronized void evenIncre() throws InterruptedException {
		i++;
		Thread.sleep(1);
		i++;
	}

	@Override
	public void run() {
		while (true) {
			try {
				evenIncre();
				System.out.println(Thread.currentThread().getContextClassLoader().getClass().getSimpleName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ExecutorService service = Executors.newCachedThreadPool();
		AtomicityTest test = new AtomicityTest();
		service.execute(test);
		while (true) {
			int value = test.getValue();
			if (value % 2 != 0) {
				System.out.println(value + "is not even");
				System.exit(0);
			}
		}
		/*haha:
		for (int i = 0; i < 10; i++) {
			if (i == 3) {
				continue haha;
			}
			System.out.println(i);
		}*/
	}
}
