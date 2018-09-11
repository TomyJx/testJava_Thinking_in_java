package test.testThread.testSemaphore;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-10-25-21:49
 */
public class Fat {
	private volatile double d;
	private static int counter = 0;
	private final int id = counter++;

	public Fat() {
		for (int i = 0; i < 10000; i++) {
			d += (Math.PI + Math.E) / i;
		}
	}

	public void operation() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Fat{" +
				"d=" + d +
				", id=" + id +
				'}';
	}
}
