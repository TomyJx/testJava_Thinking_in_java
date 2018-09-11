package test.testThread.testDelayQueue;

import java.util.Random;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-10-11-22:51
 */
public class DelayQueueDemo {
	public static void main(String[] args) {
		Random random = new Random(47);
		ExecutorService exec = Executors.newCachedThreadPool();
		DelayQueue<DelayedTask> queue = new DelayQueue<>();
		for (int i = 0; i < 20; i++) {
			queue.put(new DelayedTask(random.nextInt(5000)));
		}
		queue.add(new DelayedTask.EndSentinel(5000, exec));
		exec.execute(new DelayedTask.DelayedTaskConsumer(queue));
	}
}
