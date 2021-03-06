package test.testThread.testSimulation.hotel;

/**
 * @author jiyx
 * @create 2017-11-29-12:43
 */
public class Plate {
	private final Order order;
	private final Food food;

	public Plate(Order order, Food food) {
		this.order = order;
		this.food = food;
	}

	public Order getOrder() {
		return order;
	}

	public Food getFood() {
		return food;
	}

	@Override
	public String toString() {
		return food.toString();
	}
}
