package test.testThread.testSimulation.distribute;

/**
 * @author jiyx
 * @create 2017-12-07-23:36
 */
public class DriveTrainRobot extends Robot {

	public DriveTrainRobot(RobotPool pool) {
		super(pool);
	}

	@Override
	protected void performService() {
		System.out.println(this + " installing driveTrain");
		assembler.car().addDriveTrain();
	}
}
