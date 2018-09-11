package test.testThread;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-28-21:52
 */
public class LiftOff implements Runnable {

	protected int countDown = 10;

	private static int taskCunt = 0;

	private final int id = taskCunt++;

	public LiftOff() {
	}

	public LiftOff(int countDown) {
		this.countDown = countDown;
	}

	public String status() {
		return "#" + id + "(" + (countDown > 0 ? countDown : "liftOff!") + "), ";
	}

	@Override
	public void run() {
		while (countDown-- > 0) {
			System.out.print(status());
//			Thread.yield();
		}
		System.out.println();
	}
}
