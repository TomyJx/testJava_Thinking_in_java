package test.testThread.syschronized;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-09-11-23:35
 */
public class DualSynch {
	public synchronized void f() {
		for (int i = 0; i < 100; i++) {
			System.out.println("f()");
			Thread.yield();
		}
	}

	public void g() {
		synchronized (DualSynch.class) {
			for (int i = 0; i < 100; i++) {
				System.out.println("g()");
				Thread.yield();
			}
		}
	}

	public static void main(String[] args) {
		DualSynch dualSynch = new DualSynch();
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(new Runnable() {
			@Override
			public void run() {
				dualSynch.f();
			}
		});
		exec.execute(new Runnable() {
			@Override
			public void run() {
				dualSynch.g();
			}
		});
	}
}
