package test.testGenericity;

import java.util.HashMap;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-08-23:11
 */
public class GenericityG<T> {

	public GenericityG(Class<?> aClass) {
		this.aClass = aClass;
//		this.f(t);
	}

	private Class<?> aClass;

	public void f(T t) {
//		if (t instanceof T) {}
//		T t1 = new T();
//		T[] tt = new T[12];
//		T[] tt = (T[]) new Object[18];
//		Integer[] in = (Integer[]) new Object[19];
//		Map<GenericityC<?>, Integer> map = new HashMap<>();
//		new Integer(1);
//		new Long(11);

	}

	public static void main(String[] args) {
		GenericityG<Integer>[] aa = new GenericityG[18];
		// Å×Òì³£ClassCastException
//		GenericityG<Integer>[] aaa = (GenericityG<Integer>[])new Object[18];
		// Å×Òì³£ClassCastException
//		GenericityG<Integer>[] aaa = (GenericityG[])new Object[18];
		aa[0] = new GenericityG<>(Integer.class);
		System.out.println(aa.getClass().getSimpleName());
		System.out.println(aa[0]);
	}

}
