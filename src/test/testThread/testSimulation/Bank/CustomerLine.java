package test.testThread.testSimulation.Bank;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author jiyx
 * @create 2017-11-27-23:28
 */
public class CustomerLine extends ArrayBlockingQueue<Customer> {

	public CustomerLine(int capacity) {
		super(capacity);
	}

	@Override
	public String toString() {
		if (this.size() == 0) {
			return "[empty]";
		}
		StringBuilder sb = new StringBuilder();
		for (Customer customer : this) {
			sb.append(customer);
		}
		return sb.toString();
	}
}
