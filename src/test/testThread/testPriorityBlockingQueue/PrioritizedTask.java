package test.testThread.testPriorityBlockingQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-10-23-21:27
 */
public class PrioritizedTask implements Runnable, Comparable<PrioritizedTask> {
	private Random random = new Random(47);
	private static int counter = 0;
	private final int id = counter++;
	private final int priority;
	protected static List<PrioritizedTask> sequeue = new ArrayList<>();

	public PrioritizedTask(int priority) {
		this.priority = priority;
		sequeue.add(this);
	}

	@Override
	public int compareTo(PrioritizedTask o) {
		return priority < o.priority ? 1 : priority > o.priority ? -1 : 0;
	}

	@Override
	public void run() {
		try {
			TimeUnit.MILLISECONDS.sleep(random.nextInt(250));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "PiroritizedTask{" +
				"random=" + random +
				", id=" + id +
				", priority=" + priority +
				'}';
	}

	public String summary() {
		return "(" + id + ":" + priority + ")";
	}

	public static class EndSentinel extends PrioritizedTask {

		private ExecutorService exec;

		public EndSentinel(ExecutorService exec) {
			super(-1);
			this.exec = exec;
		}

		@Override
		public void run() {
			int count = 0;
			for (PrioritizedTask task : sequeue) {
				System.out.print(task.summary() + " ");
				if (++count % 5 == 0) {
					System.out.println();
				}
			}
			System.out.println();
			System.out.println(this + " Calling shutdownNow()");
			exec.shutdownNow();
		}
	}

}
