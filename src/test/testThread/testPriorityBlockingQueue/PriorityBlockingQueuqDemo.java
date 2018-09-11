package test.testThread.testPriorityBlockingQueue;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-10-23-21:59
 */
public class PriorityBlockingQueuqDemo {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		Random random = new Random(47);
		PriorityBlockingQueue<Runnable> queue = new PriorityBlockingQueue<>();
		exec.execute(new PrioritizedTaskProducer(queue, exec));
		exec.execute(new PrioritizedTaskConsumer(queue));
	}
}
