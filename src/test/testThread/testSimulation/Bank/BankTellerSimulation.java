package test.testThread.testSimulation.Bank;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author jiyx
 * @create 2017-11-27-23:56
 */
public class BankTellerSimulation {
	static final int MAX_LINE_SIZE = 50;
	static final int ADJUSTMENT_PERIO = 1000;

	public static void main(String[] args) throws InterruptedException, IOException {
		ExecutorService exec = Executors.newCachedThreadPool();
		CustomerLine customers = new CustomerLine(MAX_LINE_SIZE);
		exec.execute(new CustomerGenerator(customers));
		exec.execute(new TellerManager(exec, customers, ADJUSTMENT_PERIO));
//		TimeUnit.SECONDS.sleep(10);
		System.out.println("Press 'Enter' to quit");
		System.in.read();
		exec.shutdownNow();

	}
}
