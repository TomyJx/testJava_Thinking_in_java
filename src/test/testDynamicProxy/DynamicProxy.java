package test.testDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-05-23:06
 */
public class DynamicProxy implements InvocationHandler {
	private Object realObj;

	public DynamicProxy(Object realObj) {
		this.realObj = realObj;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("**poxy" + proxy.getClass() + " method:" + method + " args:" + args);
		DynamicProxy.emptyList();
		return method.invoke(realObj, args);

	}

	public static final <T> List<T> emptyList() {
		return (List<T>) Collections.emptyList();
	}
}
