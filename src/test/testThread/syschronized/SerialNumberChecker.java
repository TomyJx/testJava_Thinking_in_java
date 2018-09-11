package test.testThread.syschronized;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-09-07-0:09
 */
public class SerialNumberChecker {
	private static final int SIZE = 10;
	private static CircularSet set = new CircularSet(1000);
	private static ExecutorService service = Executors.newCachedThreadPool();

	static class SerialChecker implements Runnable {

		@Override
		public void run() {
			while (true) {
				int value = SerialNumberGenerator.nextSerialNumber();
				if (set.contains(value)) {
					System.out.println("Duplicate: " + value);
					System.exit(0);
				}
				set.add(value);
			}
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < SIZE; i++) {
			service.execute(new SerialChecker());
		}
	}
}
