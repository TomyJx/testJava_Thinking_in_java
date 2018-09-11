package test.testThread;

import java.util.concurrent.ThreadFactory;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-28-23:51
 */
public class DeamonThreadFactory implements ThreadFactory {
	@Override
	public Thread newThread(Runnable r) {
		Thread t = new Thread(r);
		t.setDaemon(true);
		return t;
	}
}
