package test.testThread.responsiveUI;

import java.io.IOException;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-30-22:46
 */
public class UnresponsiveUI {
	private volatile double d = 1;

	public UnresponsiveUI() throws IOException {
		while (d > 0) {
			d = d + (Math.PI + Math.E) / d;
			System.in.read();
		}
	}
}
