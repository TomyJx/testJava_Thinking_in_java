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
		//(2)ͨ��Ϊ Proxy ��ָ�� ClassLoader �����һ�� interface ��������̬������
		Class<?> proxyClass = Proxy.getProxyClass(dynamicClient.getClass().getClassLoader(), Subject.class);
		//(3)ͨ��������ƻ�ö�̬������Ĺ��캯������Ψһ���������ǵ��ô������ӿ�����
		Constructor<?> constructor = proxyClass.getConstructor(InvocationHandler.class);
		//(4)ͨ�����캯��������̬������ʵ��������ʱ���ô�����������Ϊ����������
		Object o = constructor.newInstance(DynamicClient.handler);
		//(5)ͨ����̬����������
		Subject subject = (Subject) o;
		//(6)���ί����Ľ��
		subject.doSomething();

		// ������(2)(3)(4)����
		Object o1 = Proxy.newProxyInstance(dynamicClient.getClass().getClassLoader(), new Class<?>[]{Subject.class}, DynamicClient.handler);
		subject = (Subject) o1;
		subject.doSomething();
	}
}
