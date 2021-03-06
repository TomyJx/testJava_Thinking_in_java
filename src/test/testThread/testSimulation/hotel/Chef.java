package test.testThread.testSimulation.hotel;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author jiyx
 * @create 2017-11-30-12:27
 */
public class Chef implements Runnable {

	private static int counter = 0;
	private final int id = counter++;
	private final Restaurant restaurant;
	private static Random rand = new Random(47);

	public Chef(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				Order order = restaurant.orders.take();
				Food item = order.item();
				TimeUnit.MILLISECONDS.sleep(rand.nextInt(500));
				Plate plate = new Plate(order, item);
				order.getWaitPerson().filledOrders.put(plate);
			}
		} catch (InterruptedException e) {
			System.out.println(this + " interrupted");
		}
		System.out.println(this + " off duty");
	}

	@Override
	public String toString() {
		return "Chef " + id + " ";
	}
}
