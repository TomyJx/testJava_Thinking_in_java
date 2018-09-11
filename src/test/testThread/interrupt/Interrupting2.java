package test.testThread.interrupt;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-09-18-22:19
 */
public class Interrupting2 {
	static class BlockedMutex {
		private Lock lock = new ReentrantLock();

		public BlockedMutex() {
			lock.lock();
		}

		public void f() {
			try {
				lock.lockInterruptibly();
				System.out.println("lock acquired in f()");
			} catch (InterruptedException e) {
				System.out.println("Interrupted from lock acquisition in f()");
			}
		}
	}

	static class Blocked2 implements Runnable {
		private BlockedMutex blockedMutex = new BlockedMutex();

		@Override
		public void run() {
			System.out.println("Waiting for f() in BlockedMutex");
			blockedMutex.f();
			System.out.println("Broken out of blocked call");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new Blocked2());
		t.start();
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Issuing t.interrupt()");
		t.interrupt();
	}
}
