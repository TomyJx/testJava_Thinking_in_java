package test.testThread.testExchanger;

import java.util.List;
import java.util.concurrent.Exchanger;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-10-25-22:35
 */
public class ExchangerProducer<T> implements Runnable {

	private Generator<T> generator;
	private Exchanger<List<T>> exchanger;
	private List<T> holder;

	public ExchangerProducer(Generator<T> generator, Exchanger<List<T>> exchanger, List<T> holder) {
		this.generator = generator;
		this.exchanger = exchanger;
		this.holder = holder;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				for (int i = 0; i < ExchangerDemo.size; i++) {
					holder.add(generator.next());
				}
				System.out.println("Producer before exchange List:" + holder);
				holder = exchanger.exchange(holder);
				System.out.println("Producer after exchange List:" + holder);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
