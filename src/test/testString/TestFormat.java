package test.testString;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-22-22:47
 */
public class TestFormat {
	public static void main(String[] args) {
		int x = 11;
		float ff = 11.5f;
		double dd = 55.11;
		System.out.println(x + ff + dd);
		System.out.printf("[%d %f] \n", x, ff);
		System.out.format("[%d %f] \n", x, ff);
		System.out.printf("[%d %f]", x, dd);

	}
}
