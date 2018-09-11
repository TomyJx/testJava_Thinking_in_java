package test.testThread.MyTestToast;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-09-25-23:50
 */
public class ToastOMatic {
	public static void main(String[] args) throws InterruptedException {
		LinkedBlockingQueue dryToasts = new LinkedBlockingQueue();
		LinkedBlockingQueue butterToasts = new LinkedBlockingQueue();
		LinkedBlockingQueue jamToasts = new LinkedBlockingQueue();
		ExecutorService exec = Executors.newCachedThreadPool();
		CreateToast ct = new CreateToast(dryToasts);
		ButterToast bt = new ButterToast(dryToasts, butterToasts);
		JamToast jt = new JamToast(jamToasts, butterToasts);
		Eater eater = new Eater(jamToasts);
		exec.execute(ct);
		exec.execute(bt);
		exec.execute(jt);
		exec.execute(eater);
		TimeUnit.SECONDS.sleep(5);
		exec.shutdownNow();

	}
}
