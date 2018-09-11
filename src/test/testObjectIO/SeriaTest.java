package test.testObjectIO;

import java.io.Serializable;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-03-22:48
 */
public class SeriaTest implements Serializable {
	private int i;
	private transient String a;

	public SeriaTest(int i, String a) {
		this.i = i;
		this.a = a;
	}

	@Override
	public String toString() {
		return "SeriaTest{" +
				"i=" + i +
				", a='" + a + '\'' +
				'}';
	}
}
