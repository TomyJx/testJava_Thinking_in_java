package test.testThread;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-28-21:58
 */
public class BasicThreads {
	public static void main(String[] args) {
		Thread t = new Thread(new LiftOff());
		t.start();
		System.out.println("Waiting for liftOff!");
	}
}
