package test.testThread.testSimulation.distribute;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jiyx
 * @create 2017-12-07-23:26
 */
public class RobotPool {

	private volatile Set<Robot> pool = new HashSet<>();

	public synchronized void add(Robot robot) {
		pool.add(robot);
		notifyAll();
	}

	public synchronized void hire(Class<? extends Robot> robotType, Assembler assembler) throws InterruptedException {
		for (Robot robot : pool) {
			if (robot.getClass().equals(robotType)) {
				pool.remove(robot);
				robot.assignAssembler(assembler);
				robot.engage();
				return;
			}
		}
		wait();
		hire(robotType, assembler);
	}

	public synchronized void release(Robot robot) {
		add(robot);
	}

}
