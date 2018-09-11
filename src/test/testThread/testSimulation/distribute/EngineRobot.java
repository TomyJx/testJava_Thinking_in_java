package test.testThread.testSimulation.distribute;

/**
 * @author jiyx
 * @create 2017-12-07-23:33
 */
public class EngineRobot extends Robot {
	public EngineRobot(RobotPool pool) {
		super(pool);
	}

	@Override
	protected void performService() {
		System.out.println(this + " installing engine");
		assembler.car().addEngine();
	}
}
