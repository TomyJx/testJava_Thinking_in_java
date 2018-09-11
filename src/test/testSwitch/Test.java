package test.testSwitch;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-07-23:27
 */
public class Test {

	private Colors color = Colors.RED;

	private int change() {
		switch (color) {
			case GREEN:
				color = Colors.RED;
				return 1;

			case RED:
				color = Colors.YELLOW;
				return 2;
			default:
				return 0;
		}
	}

	@Override
	public String toString() {
		return "Test{" +
				"color=" + color +
				'}';
	}

	public static void main(String[] args) {
		Test t = new Test();
		for (int i = 0; i < 10; i++) {
			System.out.println(t);
			t.change();
		}
	}
}
