package test.testThread.piped;

import java.io.IOException;
import java.io.PipedWriter;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-09-27-22:47
 */
public class Sender implements Runnable {

	private PipedWriter writer = new PipedWriter();

	private Random random = new Random(47);

	public PipedWriter getWriter() {
		return writer;
	}

	@Override
	public void run() {
		try {
			while (true) {
				for (char i = 'A'; i <= 'z'; i++) {
					writer.write(i);
					TimeUnit.MILLISECONDS.sleep(random.nextInt(100));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
