package test.testThread.testSimulation.Bank;

import java.util.concurrent.TimeUnit;

/**
 * @author jiyx
 * @create 2017-11-27-23:34
 */
public class Teller implements Runnable, Comparable<Teller> {

	private static int counter = 0;
	private final int id = counter++;
	private int customerServed = 0;
	private CustomerLine customers;
	private boolean servinngCustomerLine = true;

	public Teller(CustomerLine customers) {
		this.customers = customers;
	}

	@Override
	public int compareTo(Teller o) {
		return this.customerServed < o.customerServed ? -1 : this.customerServed == o.customerServed ? 0 : 1;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				Customer take = customers.take();
				TimeUnit.MILLISECONDS.sleep(take.getServiceTime());
				synchronized (this) {
					while (!servinngCustomerLine) {
						wait();
					}
				}
			}
		} catch (InterruptedException e) {
			System.out.println(this + "interrupted");
			// һ����������쳣�Ļ��������̵߳�interrupt״̬������������Ҫ��������
//			Thread.currentThread().interrupt();
		}
		System.out.println(this + "terminating");
	}

	public synchronized void doSomethingEles() {
		customerServed = 0;
		servinngCustomerLine = false;
	}

	public synchronized void serveCustomerLine() {
		servinngCustomerLine = true;
		notifyAll();
	}

	@Override
	public String toString() {
		return "Teller " + id + " ";
	}

	public String shortString() {
		return "T" + id;
	}

}
