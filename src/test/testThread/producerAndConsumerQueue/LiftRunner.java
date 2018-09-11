package test.testThread.producerAndConsumerQueue;

import test.testThread.LiftOff;

import java.util.concurrent.BlockingQueue;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-09-25-22:18
 */
public class LiftRunner implements Runnable {

	private BlockingQueue<LiftOff> queue;

	public LiftRunner(BlockingQueue queue) {
		this.queue = queue;
	}

	public void add(LiftOff liftOff) {
		try {
			queue.put(liftOff);
//			queue.add(liftOff);
		} catch (InterruptedException e) {
			System.out.println("InterruptedException during put()");
		}
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				LiftOff take = queue.take();
				take.run();
			}
		} catch (InterruptedException e) {
			System.out.println("Waking  from take()");
		}
		System.out.println("Exiting LiftOffRunning");
	}
}
