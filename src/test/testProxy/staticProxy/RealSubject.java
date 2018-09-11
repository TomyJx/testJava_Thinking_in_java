package test.testProxy.staticProxy;

import test.testProxy.Subject;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-09-12-11:29
 */
public class RealSubject implements Subject {
	@Override
	public void doSomething() {
		System.out.println("RealSubject do something");
	}
}
