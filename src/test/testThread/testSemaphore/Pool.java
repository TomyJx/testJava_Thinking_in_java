package test.testThread.testSemaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-10-25-21:28
 */
public class Pool<T> {
	private int size;
	private List<T> items = new ArrayList<T>();
	private volatile boolean[] checkedOut;
	private Semaphore available;

	public Pool(Class<T> clazz, int size) {
		this.size = size;
		checkedOut = new boolean[size];
		available = new Semaphore(size, true);
		try {
			for (int i = 0; i < size; i++) {
				items.add(clazz.newInstance());
			}
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public T checkOut() throws InterruptedException {
		available.acquire();
		return getItem();
	}

	public void checkIn(T t) {
		if (releaseItem(t)) {
			available.release();
		}
	}

	private synchronized boolean releaseItem(T t) {
		int index = items.indexOf(t);
		if (index == -1) {
			return false;
		}

		if (checkedOut[index]) {
			checkedOut[index] = false;
			return true;
		}

		return false;
	}

	private synchronized T getItem() {
		for (int i = 0; i < size; i++) {
			if (!checkedOut[i]) {
				checkedOut[i] = true;
				return items.get(i);
			}
		}
		return null;
	}
}
