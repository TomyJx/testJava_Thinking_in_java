package test.testThread.interrupt;

import java.util.concurrent.*;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-09-18-22:35
 */
public class TestCallable implements Callable {
	@Override
	public Integer call() throws Exception {
		for (int i = 0; i < 10; i++) {
			System.out.println("testCall : " + i);
		}
		return 8;
	}

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		ExecutorService exec = Executors.newCachedThreadPool();
		Future submit = exec.submit(new TestCallable());
		System.out.println(submit.get());
	}
}
