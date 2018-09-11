package test.testThread.testSimulation.distribute;

/**
 * @author jiyx
 * @create 2017-12-07-23:34
 */
public class Reporter implements Runnable {

	private CarQueue carQueue;

	public Reporter(CarQueue carQueue) {
		this.carQueue = carQueue;
	}

	@Override
	public void run() {
		try{
			while (!Thread.interrupted()) {
				System.out.println(carQueue.take());
			}
		} catch (InterruptedException e) {
			System.out.println("Exiting Reporter via interrupted");
		}
		System.out.println("Reporter off");
	}
}
