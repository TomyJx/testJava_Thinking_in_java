package test.testThread;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-29-23:25
 */
public class SimpleThread extends Thread {
	private int countDown = 100;
	private static int threadCount = 0;

	public SimpleThread() {
		super(Integer.toString(++threadCount));
		start();
	}

	@Override
	public String toString() {
		return "#" + getName() + "(" + countDown + ")";
	}

	@Override
	public void run() {
		while (true) {
			System.out.print(this);
			if (--countDown == 0) {
				System.out.println();
				return;
			}
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new SimpleThread();
		}
	}
}
