package test.testGenericity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-07-22:10
 */
public class Test {

	public Test() {
	}

	public <A> Test(A a) {
		System.out.println(a.getClass().getSimpleName());
	}

	public static void show(Map<String, Integer> maps) {

	}

	public static GenericityA f1() {
		return GenericityA.get("1", 12);
	}

	public static GenericityA<String, Integer> f2() {
		return GenericityA.get("1", 13);
	}

	public static GenericityA<String, Integer> f3() {
		return GenericityA.get();
	}

	public static void main(String[] args) {
//		List<? extends GenericityA<String, Integer>> list = new ArrayList<>();
//		new Test(8);
//		new Test("111");
//		new Test(new Test(new Object()));
//		show(GenericityA.<String, Integer>newHash());
		System.out.println(f1());;
		System.out.println(f2());
		String a = f2().getA();
		Integer b = f2().getB();
		Object a1 = f1().getA();
		Object b1 = f1().getB();
		System.out.println(f3());
		ArrayList.class.getName();
//		ArrayList<String>.class.getName;
		Class<? extends ArrayList> aClass = new ArrayList<String>().getClass();
		Class<? extends ArrayList> aClass1 = new ArrayList<Integer>().getClass();
		System.out.println(aClass == aClass1);
		Class<? extends Test> aClass2 = new Test().getClass();
		Class<? extends Test> aClass3 = new Test().getClass();
		System.out.println(aClass2 == aClass3);
	}
}
