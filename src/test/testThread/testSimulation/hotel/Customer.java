package test.testThread.testSimulation.hotel;

import java.util.concurrent.SynchronousQueue;

/**
 * @author jiyx
 * @create 2017-11-29-12:42
 */
public class Customer implements Runnable {

	private static int counter = 0;
	private final int id = counter++;
	private final WaitPerson waitPerson;
	private SynchronousQueue<Plate> placeSetting = new SynchronousQueue<>();

	public Customer(WaitPerson waitPerson) {
		this.waitPerson = waitPerson;
	}

	public void deliver(Plate plate) throws InterruptedException {
		placeSetting.put(plate);
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			Food food = new Food();
			try{
				waitPerson.palceOrder(this, food);
				System.out.println(this + "eating " + placeSetting.take());
			} catch (InterruptedException e) {
				System.out.println(this + "waiting for " + "interrupted");
				break;
			}
		}
		System.out.println(this + "finished meal, leaving");
	}

	@Override
	public String toString() {
		return "Customer " + id + " ";
	}
}
