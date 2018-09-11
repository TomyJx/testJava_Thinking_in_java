package test.testThread.MyTestToast;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-09-25-23:40
 */
public class Eater implements Runnable{
	private LinkedBlockingQueue<Toast> finishToasts;

	public Eater(LinkedBlockingQueue finishToasts) {
		this.finishToasts = finishToasts;
	}

	@Override
	public void run() {
		try {
			int count = 0;
			while (!Thread.interrupted()) {
				Toast toast = finishToasts.take();
				if (toast.getId() != count++ && toast.isButter() && toast.isJam()) {
					System.out.println("Shit toast");
					System.exit(1);
				} else {
					System.out.println("Delicious toast count : " + count + " id : " + toast.getId());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("End eat");
	}
}
