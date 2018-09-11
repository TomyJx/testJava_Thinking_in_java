package test.testThread.producerAndConsumer;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-09-20-22:49
 */
public class Meal {
	private final int orderNum;

	public Meal(int orderNum) {
		this.orderNum = orderNum;
	}

	@Override
	public String toString() {
		return "Meal{" +
				"orderNum=" + orderNum +
				'}';
	}
}
