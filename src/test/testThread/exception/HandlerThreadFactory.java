package test.testThread.exception;

import java.util.concurrent.ThreadFactory;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-30-23:09
 */
public class HandlerThreadFactory implements ThreadFactory {
	@Override
	public Thread newThread(Runnable r) {
		System.out.println(this + " creating new Thread");
		Thread t = new Thread(r);
		System.out.println("created " + t);
		t.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
		System.out.println("eh1 = " + t.getUncaughtExceptionHandler());
		return t;
	}
}
