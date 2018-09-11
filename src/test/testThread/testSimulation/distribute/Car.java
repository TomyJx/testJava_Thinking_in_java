package test.testThread.testSimulation.distribute;

/**
 * @author jiyx
 * @create 2017-12-04-23:07
 */
public class Car {
	private final int id;
	private boolean engine = false, driveTrain = false, wheels = false;

	public Car(int id) {
		this.id = id;
	}

	public Car() {
		id = -1;
	}

	public synchronized int getId() {
		return id;
	}

	public synchronized void addEngine() {
		engine = true;
	}

	public synchronized void addDriveTrain() {
		driveTrain = true;
	}

	public synchronized void addWheels() {
		wheels = true;
	}

	@Override
	public String toString() {
		return "Car " + id + " [" + " engine: " + engine + " driveTrain: " + driveTrain + " wheels:" + wheels + "]";
	}
}
