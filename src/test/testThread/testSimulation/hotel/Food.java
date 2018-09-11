package test.testThread.testSimulation.hotel;

import java.util.Random;

/**
 * @author jiyx
 * @create 2017-11-29-12:42
 */
public class Food {
	private static Random rand = new Random(47);

	@Override
	public String toString() {
		int r = rand.nextInt(3) % 3;

		switch (r) {
			case 0:
				return "SPRING_ROLLS";
			case 1:
				return "BURRITO";
			case 2:
				return "SOUP";
			default:
				return "VINDALOO";
		}
	}

}
