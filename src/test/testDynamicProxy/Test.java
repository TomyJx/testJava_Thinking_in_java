package test.testDynamicProxy;

import java.lang.reflect.Proxy;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-05-23:11
 */
public class Test {
	public static void main(String[] args) {
		FlyImpl fly = new FlyImpl();
		fly.fly();

		InterfaceFly o = (InterfaceFly)Proxy.newProxyInstance(Test.class.getClassLoader(), new Class[]{InterfaceFly.class}, new DynamicProxy(fly));
		o.fly();
	}
}
