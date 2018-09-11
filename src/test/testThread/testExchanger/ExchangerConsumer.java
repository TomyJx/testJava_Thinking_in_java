package test.testThread.testExchanger;

import java.util.List;
import java.util.concurrent.Exchanger;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-10-25-22:39
 */
public class ExchangerConsumer<T> implements Runnable {

	private Exchanger<List<T>> exchanger;
	private List<T> holder;
	private volatile T value;

	public ExchangerConsumer(Exchanger<List<T>> exchanger, List<T> holder) {
		this.exchanger = exchanger;
		this.holder = holder;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				System.out.println("Consumer before exchange List:" + holder);
				holder = exchanger.exchange(holder);
				System.out.println("Consumer after exchange List:" + holder);
				for (T t : holder) {
					value = t;
					holder.remove(t);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Final value: " + value);
	}
}
