package test.testThread.testExchanger;

import test.testThread.testSemaphore.Fat;

import java.util.List;
import java.util.concurrent.*;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-10-25-22:42
 */
public class ExchangerDemo {
	static int size = 10;
	static int delay = 5;

	public static void main(String[] args) throws InterruptedException {
		ExecutorService exec = Executors.newCachedThreadPool();
		Exchanger<List<Fat>> exchanger = new Exchanger<>();
		List<Fat> produceList = new CopyOnWriteArrayList<>();
		List<Fat> consumerList = new CopyOnWriteArrayList<>();
		exec.execute(new ExchangerProducer<Fat>(BasicGenerator.create(Fat.class), exchanger, produceList));
		exec.execute(new ExchangerConsumer<>(exchanger, consumerList));
		TimeUnit.SECONDS.sleep(delay);
		exec.shutdownNow();
	}
}
