package test.testGenericity;

import java.util.HashMap;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-07-22:10
 */
public class GenericityA<A, B> {

	private Class<A> t;

	private A a;

	private B b;

	public GenericityA(A a , B b) {
		this.a = a;
		this.b = b;
	}

	public GenericityA() {
	}
	/**
	 * static方法不能访问到泛型类的类型参数，也就是A。个人觉得一个是编译期的事一个是运行期才知道的，所以这里不能直接使用
	 * 如果飞要static方法可以访问到类型参数的话，就需要泛型方法
	 */
	/*public static void hello(A a) {
		System.out.println(a);
	}*/



	public static <K, V> HashMap<K, V> newHash() {
		return new HashMap<K, V>();
	}

	public void show(A a) {
		System.out.println(a);
	}

	public static <A, B> GenericityA<A, B> get(A a, B b) {
		return new GenericityA<A, B>(a, b);
	}

	public static <A, B> GenericityA<A, B> get() {
		return new GenericityA<A, B>();
	}

	@Override
	public String toString() {
		return "GenericityA{" +
				"a=" + a +
				", b=" + b +
				'}';
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
}
