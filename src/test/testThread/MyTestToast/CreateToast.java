package test.testThread.MyTestToast;

import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-09-25-23:00
 */
public class CreateToast implements Runnable {

	private LinkedBlockingQueue<Toast> toasts;

	private Random random = new Random(47);

	public CreateToast(LinkedBlockingQueue toasts) {
		this.toasts = toasts;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				TimeUnit.MILLISECONDS.sleep(100 + random.nextInt(100));
				Toast toast = new Toast();
				System.out.println(toast);
				toasts.put(toast);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Created off");
	}
}
