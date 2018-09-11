package test.testThread.exception;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-30-23:06
 */
public class ExceptionThread2 implements Runnable {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("run() by " + t);
		System.out.println("eh = " + t.getUncaughtExceptionHandler());
		throw new RuntimeException();
	}
}
