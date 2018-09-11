package test.testThread.syschronized;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-09-06-22:08
 */
public class Volatile implements Runnable{

	private volatile int count = 10;

	@Override
	public void run() {
		while (count > 0) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			--count;
			System.out.println(Thread.currentThread() + "" + count);
		}
	}

	public static void main(String[] args) {
		final Volatile v = new Volatile();
		for (int i = 0; i < 2; i++) {
			new Thread(v).start();
		}
	}
}
