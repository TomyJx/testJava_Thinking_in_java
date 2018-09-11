package test.testThread.testSimulation.Bank;

/**
 * @author jiyx
 * @create 2017-11-27-23:26
 */
public class Customer {
	private final int serviceTime;

	public Customer(int serviceTime) {
		this.serviceTime = serviceTime;
	}

	public int getServiceTime() {
		return serviceTime;
	}

	@Override
	public String toString() {
		return "[" + serviceTime + ']';
	}
}
