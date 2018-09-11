package test.testThread.testSimulation.distribute;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author jiyx
 * @create 2017-12-07-23:49
 */
public class CarBuilder {
	public static void main(String[] args) throws InterruptedException {
		CarQueue chassisQueue = new CarQueue();
		CarQueue finishingQueue = new CarQueue();
		ExecutorService exec = Executors.newCachedThreadPool();
		RobotPool pool = new RobotPool();
		exec.execute(new EngineRobot(pool));
		exec.execute(new WheelRobot(pool));
		exec.execute(new DriveTrainRobot(pool));
		exec.execute(new Assembler(chassisQueue, finishingQueue, pool));
		exec.execute(new Reporter(finishingQueue));
		exec.execute(new ChassisBuilder(chassisQueue));
		TimeUnit.SECONDS.sleep(7);
		exec.shutdownNow();
	}
}
