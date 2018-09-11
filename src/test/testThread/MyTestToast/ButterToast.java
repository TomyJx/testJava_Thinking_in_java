package test.testThread.MyTestToast;


import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-09-25-23:08
 */
public class ButterToast implements Runnable {

	private LinkedBlockingQueue<Toast> dryToasts, butterToasts;

	public ButterToast(LinkedBlockingQueue dryToasts, LinkedBlockingQueue butterToasts) {
		this.dryToasts = dryToasts;
		this.butterToasts = butterToasts;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				Toast toast = dryToasts.take();
				toast.setButter(true);
				System.out.println(toast);
				butterToasts.put(toast);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Buttered off");
	}
}
