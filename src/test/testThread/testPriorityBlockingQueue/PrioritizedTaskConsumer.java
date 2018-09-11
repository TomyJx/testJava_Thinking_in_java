package test.testThread.testPriorityBlockingQueue;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-10-23-21:56
 */
public class PrioritizedTaskConsumer implements Runnable {

	private PriorityBlockingQueue<Runnable> q;

	public PrioritizedTaskConsumer(PriorityBlockingQueue<Runnable> q) {
		this.q = q;
	}

	@Override
	public void run() {
		try{
			while (!Thread.interrupted()) {
				q.take().run();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Finished PrioritizdTaskConsumer");
	}
}
