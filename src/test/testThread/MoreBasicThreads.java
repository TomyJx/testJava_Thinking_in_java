package test.testThread;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-28-22:00
 */
public class MoreBasicThreads {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Thread t = new Thread(new LiftOff());
			t.start();
		}
		System.out.println("Waiting for liftOff!");
	}
}
