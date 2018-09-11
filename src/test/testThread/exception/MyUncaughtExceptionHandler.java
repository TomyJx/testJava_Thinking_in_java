package test.testThread.exception;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-30-23:08
 */
public class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("I catch the throwable" + e);
	}
}
