package test.testThread.syschronized;

import java.util.Random;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-09-07-0:03
 */
public class SerialNumberGenerator {
	private static volatile int serialNumber = 0;

	public static synchronized int nextSerialNumber() {
		return serialNumber++;
	}

	public void hello() {
		int i = 0;
		synchronized (this) {
			System.out.println(i);
		}
		int j = 0;
	}

	public static void main(String[] args) {
		/*Random random = new Random(47);
		for (int i = 0; i < 5; i++) {
			System.out.println(random.nextInt(10000));

		}*/
		new ThreadLocal<Integer>(){
			@Override
			protected Integer initialValue() {
				return super.initialValue();
			}
		};
	}

	static class AAA{
		static {
			System.out.println(11111);
		}
	}
}
