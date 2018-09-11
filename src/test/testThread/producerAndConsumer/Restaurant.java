package test.testThread.producerAndConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-09-20-22:51
 */
public class Restaurant {
	public Meal meal;
	public WaitPerson waitPerson = new WaitPerson(this);
	public Chef chef = new Chef(this);
	public ExecutorService exec = Executors.newCachedThreadPool();

	public Restaurant() {
		exec.execute(waitPerson);
		exec.execute(chef);
	}

	public static void main(String[] args) {
		new Restaurant();
	}
}
