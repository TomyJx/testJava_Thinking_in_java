package test.testThread.testVolatile;

import java.util.concurrent.TimeUnit;

/**
 * @author jiyx
 * @create 2017-12-11-23:20
 */
public class Test {
	public static void main(String[] args) {
		Person person = new Person();
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					person.setPerson("Ð¡ºì",18);
				}
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					person.setPerson("Ð¡Ã÷",26);
				}
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					person.showPerson();
				}
			}
		}).start();
	}
}
