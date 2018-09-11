package test.testThread.testSimulation.distribute;

/**
 * @author jiyx
 * @create 2017-12-07-23:36
 */
public class WheelRobot extends Robot {

	public WheelRobot(RobotPool pool) {
		super(pool);
	}

	@Override
	protected void performService() {
		System.out.println(this + " installing wheels");
		assembler.car().addDriveTrain();
	}
}
