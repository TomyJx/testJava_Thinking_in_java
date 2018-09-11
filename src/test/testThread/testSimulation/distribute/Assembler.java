package test.testThread.testSimulation.distribute;

import java.util.concurrent.CyclicBarrier;

/**
 * @author jiyx
 * @create 2017-12-04-23:59
 */
public class Assembler implements Runnable {

	private CarQueue chassisQueue, finishingQueue;
	private Car car;
	private CyclicBarrier barrier = new CyclicBarrier(4);
	private RobotPool robotPool;

	public Assembler(CarQueue chassisQueue, CarQueue finishingQueue, RobotPool robotPool) {
		this.chassisQueue = chassisQueue;
		this.finishingQueue = finishingQueue;
		this.robotPool = robotPool;
	}

	public Car car() {
		return car;
	}

	public CyclicBarrier cyclicBarrier() {
		return barrier;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				car = chassisQueue.take();
				robotPool.hire(EngineRobot.class, this);
				robotPool.hire(DriveTrainRobot.class, this);
				robotPool.hire(WheelRobot.class, this);
				barrier.wait();
				finishingQueue.put(car);
			}
		} catch (InterruptedException e) {
			System.out.println("Exiting Assembler via interrupt");
		}
		System.out.println("Assembler off");
	}
}
