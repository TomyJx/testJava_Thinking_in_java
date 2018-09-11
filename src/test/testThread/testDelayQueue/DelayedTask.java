package test.testThread.testDelayQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-10-11-21:46
 */
public class DelayedTask implements Runnable, Delayed {

	private static int counter = 0;
	private final int id = counter++;
	private final int delta;
	private final long trigger;
	protected static List<DelayedTask> sequence = new ArrayList<>();

	public DelayedTask(int delayInMilliseconds) {
		delta = delayInMilliseconds;
		trigger = System.nanoTime() + TimeUnit.NANOSECONDS.convert(delta, TimeUnit.MILLISECONDS);
		sequence.add(this);
	}

	@Override
	public long getDelay(TimeUnit unit) {
		return unit.convert(trigger - System.nanoTime(), TimeUnit.NANOSECONDS);
	}

	@Override
	public int compareTo(Delayed o) {
		DelayedTask that = (DelayedTask) o;
		if (trigger < that.trigger) {
			return -1;
		}
		if (trigger > that.trigger) {
			return 1;
		}
		return 0;
	}

	@Override
	public void run() {
		System.out.println(this + " ");
	}

	@Override
	public String toString() {
		return String.format("[%1$-4d]", delta) + " Task " + id;
	}

	public String summary() {
		return "(" + id + ":" + delta + ")";
	}

	public static class EndSentinel extends DelayedTask {
		private ExecutorService exec;
		public EndSentinel(int delay, ExecutorService service) {
			super(delay);
			exec = service;
		}

		@Override
		public void run() {
			for (DelayedTask delayedTask : sequence) {
				System.out.println(delayedTask.summary() + " ");
			}
			System.out.println();
			System.out.println(this + " Calling shutdownNow()");
			exec.shutdownNow();
		}
	}

	static class DelayedTaskConsumer implements Runnable {
		private DelayQueue<DelayedTask> queue;

		public DelayedTaskConsumer(DelayQueue<DelayedTask> queue) {
			this.queue = queue;
		}

		@Override
		public void run() {
			try {
				while (!Thread.interrupted()) {
					queue.take().run();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Finished DelayedTaskConsumer");
		}
	}


}
