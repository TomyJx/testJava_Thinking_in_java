package test.testThread.testSemaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-10-25-21:57
 */
public class SemaphoreDemo {
	final static int SIZE = 25;

	public static void main(String[] args) throws InterruptedException {
		final Pool<Fat> pool = new Pool<>(Fat.class, SIZE);
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < SIZE; i++) {
			exec.execute(new CheckOutTask<Fat>(pool));
		}
		System.out.println("All CheckOutTasks Created");
		List<Fat> list = new ArrayList<>();
		for (int i = 0; i < SIZE; i++) {
			Fat fat = pool.checkOut();
			System.out.println(i + ": main() thread checked out");
			fat.operation();
			list.add(fat);
		}
		Future<?> blocked = exec.submit(new Runnable() {
			@Override
			public void run() {
				try {
					pool.checkOut();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		TimeUnit.SECONDS.sleep(2);
		blocked.cancel(true);
		System.out.println("Checking in objects in " + list);
		for (Fat fat : list) {
			pool.checkIn(fat);
//			System.out.println("first check in ");
		}

		for (Fat fat : list) {
			pool.checkIn(fat);
//			System.out.println("second check in ");
		}

		exec.shutdownNow();
	}
}
