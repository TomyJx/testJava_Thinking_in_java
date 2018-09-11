package test.testThread.piped;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-09-27-22:50
 */
public class Recevier implements Runnable {

	private PipedReader reader;

	public Recevier(Sender sender) {
		try {
			this.reader = new PipedReader(sender.getWriter());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		try {
			while (true) {
				System.out.println((char)reader.read());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
