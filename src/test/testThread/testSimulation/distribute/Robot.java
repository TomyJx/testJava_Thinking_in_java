package test.testThread.testSimulation.distribute;

import java.util.concurrent.BrokenBarrierException;

/**
 * @author jiyx
 * @create 2017-12-07-23:34
 */
public abstract class Robot implements Runnable {

	private RobotPool pool;

	public Robot(RobotPool pool) {
		this.pool = pool;
	}

	protected Assembler assembler;

	public Robot assignAssembler(Assembler assembler) {
		this.assembler = assembler;
		return this;
	}

	private boolean engage = false;

	public synchronized void engage() {
		engage = true;
		notifyAll();
	}

	protected abstract void performService();

	@Override
	public void run() {
		try{
			powerDown();
			while (!Thread.interrupted()) {
				performService();
				assembler.cyclicBarrier().await();
				powerDown();
			}
		} catch (InterruptedException e) {
			System.out.println("Exiting " + this + " via interrupted");
		} catch (BrokenBarrierException e) {
			throw new RuntimeException(e);
		}
		System.out.println(this + " off");
	}

	private synchronized void powerDown() throws InterruptedException {
		engage = false;
		assembler = null;
		pool.release(this);
		while (engage == false) {
			wait();
		}
	}

	@Override
	public String toString() {
		return getClass().getName();
	}
}
