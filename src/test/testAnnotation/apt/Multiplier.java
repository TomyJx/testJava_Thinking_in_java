package test.testAnnotation.apt;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-17-22:06
 */
@ExtractInterface("IMultiplier")
public class Multiplier {
	public int multiplier(int x, int y) {
		int total = 0;
		for (int i = 0; i < x; i++) {
			total = add(total, y);
		}
		return total;
	}

	private int add(int total, int y) {
		return total + y;
	}

}
