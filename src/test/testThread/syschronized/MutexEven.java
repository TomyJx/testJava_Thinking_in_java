package test.testThread.syschronized;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-09-05-23:36
 */
public class MutexEven {
	private int currentEvenValue = 0;
	private Lock lock = new ReentrantLock();

	public int next() {
		lock.lock();
		try {
			currentEvenValue++;
			currentEvenValue++;
			return currentEvenValue;
		}finally {
			lock.unlock();
		}
	}
}
