package test.testThread.testSimulation.hotel;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author jiyx
 * @create 2017-11-29-12:42
 */
public class WaitPerson implements Runnable{

	private static int counter = 0;
	private final int id = counter++;
	private final Restaurant restaurant;
	BlockingQueue<Plate> filledOrders = new LinkedBlockingQueue<>();

	public WaitPerson(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public void palceOrder(Customer customer, Food food){
		try {
			restaurant.orders.put(new Order(customer, this, food));
		} catch (InterruptedException e) {
			System.out.println(this + " placeOrder interrupted");
		}
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				Plate plate = filledOrders.take();
				System.out.println(this + "received " + plate + " delivering to " + plate.getOrder().getCustomer());
				plate.getOrder().getCustomer().deliver(plate);
			}
		} catch (InterruptedException e) {
			System.out.println(this + " interrupted");
		}
		System.out.println(this + " off duty");
	}

	@Override
	public String toString() {
		return "WaitPerson " + id + " ";
	}
}
