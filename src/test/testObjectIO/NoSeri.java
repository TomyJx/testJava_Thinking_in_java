package test.testObjectIO;

import java.util.Random;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-02-23:49
 */
public class NoSeri {
	private Random random = new Random(47);

	public int a;
	public int b;
	public int c;

	public NoSeri() {
		a = random.nextInt(10);
		b = random.nextInt(10);
		c = random.nextInt(10);
	}

	@Override
	public String toString() {
		return "NoSeri{" +
				"random=" + random +
				", a=" + a +
				", b=" + b +
				", c=" + c +
				'}' + super.toString();
	}
}
