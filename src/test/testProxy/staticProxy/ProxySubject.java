package test.testProxy.staticProxy;

import test.testProxy.Subject;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-09-12-11:30
 */
public class ProxySubject implements Subject {
	private Subject realSubject;

	public ProxySubject(Subject realSubject) {
		this.realSubject = realSubject;
	}

	@Override
	public void doSomething() {
		System.out.println("Before realSubject do something");
		realSubject.doSomething();
		System.out.println("after realSubject do something");
	}

	public void doOtherthing() {
		System.out.println("ProxySubject do otherthing");
	}

}
