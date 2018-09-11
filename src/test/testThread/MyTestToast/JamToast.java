package test.testThread.MyTestToast;

import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-09-25-23:08
 */
public class JamToast implements Runnable {

	private LinkedBlockingQueue<Toast> jamToasts, butterToasts;

	public JamToast(LinkedBlockingQueue jamToasts, LinkedBlockingQueue butterToasts) {
		this.jamToasts = jamToasts;
		this.butterToasts = butterToasts;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				Toast toast = butterToasts.take();
				toast.setJam(true);
				System.out.println(toast);
				jamToasts.put(toast);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Jam off");
	}
}
