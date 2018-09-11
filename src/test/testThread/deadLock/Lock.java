package test.testThread.deadLock;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-10-25-15:59
 */
public class Lock {
	protected Object monitorObject = new Object();
	protected boolean isLocked = false;

	public static void main(String[] args) {
		Lock l = new Lock();
		l.isLocked = true;

		MyRunnable r1 = new MyRunnable(l, 0);
		MyRunnable r2 = new MyRunnable(l, 0);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
        /*
         * 時而鎖住，時而釋放，因為另外兩條線程沒有有时捕捉不到isLocked = false
         */
//      for (int i = 0; i < 100; i++) {
//          l.isLocked = false;
//          try {
//              Thread.sleep(10);
//          } catch (InterruptedException e) {
//              e.printStackTrace();
//          }
//      }
		//

	}

	public void lock() throws InterruptedException {
		// 当执行这个方法时，isLocked=true时,其他方法无论执行lock方法还是执行Unlock方法都会导致管程死锁
		// 只有手动将isLocked 设置为false才能解决死锁，设置为false时必须让其他线程检测到，所以必须设置时间长一点
		synchronized (this) {
			while (isLocked) {
				synchronized (this.monitorObject) {
					this.monitorObject.wait();
				}
			}
			isLocked = true;
		}
	}

	public void unlock() {
		synchronized (this) {
			this.isLocked = false;
			synchronized (this.monitorObject) {
				this.monitorObject.notify();
			}
		}
	}

	static class MyRunnable implements Runnable {
		Lock l = null;
		int i;

		public MyRunnable(Lock l, int i) {
			this.l = l;
			this.i = i;
		}

		@Override
		public void run() {
			try {
				if (i % 2 == 0) {
					this.l.lock();
				} else {
					this.l.unlock();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
