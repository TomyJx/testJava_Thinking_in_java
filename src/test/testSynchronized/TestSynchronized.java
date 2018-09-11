package test.testSynchronized;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-28-12:40
 */
public class TestSynchronized {

	public synchronized void method1() {
		System.out.println("method1");
	}

	public void method2() {
		synchronized (TestSynchronized.class) {
			System.out.println("method2");
		}
	}

	public void method3() {
		try {
			System.out.println("method3");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void method4() throws Exception {
		try {
			System.out.println("method4");
		} catch (Exception e) {
			throw new Exception(e);
		}finally {
			System.out.println("method44");
		}
	}

}
