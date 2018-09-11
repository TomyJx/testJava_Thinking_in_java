package test.testProxy.staticProxy;

import test.testProxy.Subject;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-09-12-11:33
 */
public class Client {
	public static void main(String[] args) {
		Subject realSubject = new RealSubject();
		ProxySubject proxySubject = new ProxySubject(realSubject);
		proxySubject.doSomething();
		proxySubject.doOtherthing();
	}
}
