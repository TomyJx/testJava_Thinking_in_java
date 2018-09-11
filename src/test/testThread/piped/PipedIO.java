package test.testThread.piped;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-09-27-22:53
 */
public class PipedIO {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService exec = Executors.newCachedThreadPool();
		Sender sender = new Sender();
		Recevier recevier = new Recevier(sender);
		exec.execute(sender);
		exec.execute(recevier);
		TimeUnit.SECONDS.sleep(5);
		exec.shutdownNow();
	}
}
