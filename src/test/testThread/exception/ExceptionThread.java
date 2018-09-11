package test.testThread.exception;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-30-23:01
 */
public class ExceptionThread implements Runnable {
	@Override
	public void run() {
		throw new RuntimeException("this exception can't catch by common method");
	}

	public static void main(String[] args) {
		try {
			ExecutorService exec = Executors.newCachedThreadPool();
			exec.execute(new ExceptionThread());
		} catch (Exception e) {
			System.out.println("I catch the exception from thread");
		}
	}
}
