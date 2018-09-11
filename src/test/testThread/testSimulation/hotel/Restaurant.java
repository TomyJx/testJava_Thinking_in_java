package test.testThread.testSimulation.hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author jiyx
 * @create 2017-11-29-12:52
 */
public class Restaurant implements Runnable {

	private List<WaitPerson> waitPeople = new ArrayList<>();
	private List<Chef> chefs = new ArrayList<>();
	private ExecutorService exec;
	private Random rand = new Random(47);
	BlockingQueue<Order> orders = new LinkedBlockingQueue<>();

	public Restaurant(ExecutorService exec, int nWaitPersons, int nChefs) {
		this.exec = exec;

		for (int i = 0; i < nWaitPersons; i++) {
			WaitPerson waitPerson = new WaitPerson(this);
			waitPeople.add(waitPerson);
			exec.execute(waitPerson);
		}

		for (int i = 0; i < nChefs; i++) {
			Chef chef = new Chef(this);
			chefs.add(chef);
			exec.execute(chef);
		}
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				WaitPerson waitPerson = waitPeople.get(rand.nextInt(waitPeople.size()));
				Customer c = new Customer(waitPerson);
				exec.execute(c);
				TimeUnit.MILLISECONDS.sleep(100);
			}
		} catch (InterruptedException e) {
			System.out.println("Restaurant interrupted");
		}
		System.out.println("Restaurant closing");
	}
}
