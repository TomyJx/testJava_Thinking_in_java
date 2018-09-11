package test.testGenericity;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-12-23:26
 */
public class Test01 {
	private static List list00;
	private static List<?> list01;
	private static List<? extends Object> list02;
	static void f1(List list) {
		list00 = list;
		list01 = list;
		list02 = list;
	}

	static void f2(List<?> list) {
		list00 = list;
		list01 = list;
		list02 = list;
	}

	static void f53(List<? extends Object> list) {
		list00 = list;
		list01 = list;
		list02 = list;
	}

	static void f3(List<? extends Object> list) {
		list00 = list;
		list01 = list;
		list02 = list;
	}

	public static void main(String[] args) {
		f1(new ArrayList());
		f2(new ArrayList());
		f3(new ArrayList());
		f1(new ArrayList<String>());
		f2(new ArrayList<String>());
		f3(new ArrayList<String>());
		List<?> list = new ArrayList<>();
		f1(list);
		f2(list);
		f3(list);
//		list.add(new Object());

		list = new ArrayList<String>();
		f1(list);
		f2(list);
		f3(list);
		List ll = new ArrayList();
		ll.add(new Object());







	}
}
