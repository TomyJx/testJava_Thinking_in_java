package test.testProxy.dynamic;

import test.testGenericity.Sub;
import test.testProxy.Subject;
import test.testProxy.staticProxy.RealSubject;

import java.io.*;
import java.lang.reflect.*;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-09-12-11:36
 */
public class DynamicClient {

	private static InvocationHandler handler = new InvocationHandler() {

		private RealSubject realSubject = new RealSubject();

		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			System.out.println(proxy.getClass());
			return method.invoke(realSubject, args);
		}
	};

	public static void main(String[] args) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
		DynamicClient dynamicClient = new DynamicClient();
		//(2)通过为 Proxy 类指定 ClassLoader 对象和一组 interface 来创建动态代理类
		Class<?> proxyClass = Proxy.getProxyClass(dynamicClient.getClass().getClassLoader(), Subject.class);
		//(3)通过反射机制获得动态代理类的构造函数，其唯一参数类型是调用处理器接口类型
		Constructor<?> constructor = proxyClass.getConstructor(InvocationHandler.class);
		//(4)通过构造函数创建动态代理类实例，构造时调用处理器对象作为参数被传入
		Object o = constructor.newInstance(DynamicClient.handler);
		//(5)通过动态代理对象调用
		Subject subject = (Subject) o;
		//(6)输出委托类的结果
		subject.doSomething();

		// 简化上述(2)(3)(4)步骤
		Object o1 = Proxy.newProxyInstance(dynamicClient.getClass().getClassLoader(), new Class<?>[]{Subject.class}, DynamicClient.handler);
		subject = (Subject) o1;
		subject.doSomething();
	}
}
