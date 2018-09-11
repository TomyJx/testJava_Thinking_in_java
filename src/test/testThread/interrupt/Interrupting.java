package test.testThread.interrupt;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-09-13-21:32
 */
public class Interrupting {

	private static ExecutorService exec = Executors.newCachedThreadPool();

	private static void test(Runnable r) throws InterruptedException {
		Future<?> submit = exec.submit(r);
		TimeUnit.MILLISECONDS.sleep(100);
		System.out.println("Interrupting " + r.getClass().getSimpleName());
		submit.cancel(true);
		System.out.println("Interrupt send to " + r.getClass().getSimpleName());
	}

	public static void main(String[] args) throws InterruptedException {
		IOBlocked ioBlocked = new IOBlocked(System.in);
		SleepBlocked sleepBlocked = new SleepBlocked();
		SynchronizedBlocked synchronizedBlocked = new SynchronizedBlocked();
		test(sleepBlocked);
		test(ioBlocked);
		test(synchronizedBlocked);
		TimeUnit.SECONDS.sleep(3);
		System.out.println("Aborting with System.exit(0)");
		System.exit(0);
	}
}
