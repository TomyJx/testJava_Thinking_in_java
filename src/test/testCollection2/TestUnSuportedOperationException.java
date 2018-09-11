package test.testCollection2;

import java.util.*;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-22-23:39
 */
public class TestUnSuportedOperationException {
	private static void test(String msg, List<String> list) {
		System.out.println("-----------" + msg + "-----------");
		Collection<String> c = list;
		Collection<String> subList = list.subList(1, 8);
		Collection<String> c2 = new ArrayList<>(subList);
		try {
			c.retainAll(c2);
		} catch (Exception e) {
			System.out.println("retainAll" + e);
		}
		try {
			c.removeAll(c2);
		} catch (Exception e) {
			System.out.println("removeAll" + e);
		}
		try {
			c.remove("A");
		} catch (Exception e) {
			System.out.println("remove" + e);
		}
		try {
			c.add("X");
		} catch (Exception e) {
			System.out.println("add" + e);
		}
		try {
			c.addAll(c2);
		} catch (Exception e) {
			System.out.println("addAll" + e);
		}
		try {
			list.set(0, "AA");
		} catch (Exception e) {
			System.out.println("list set" + e);
		}
		try {
			c.clear();
		} catch (Exception e) {
			System.out.println("clear" + e);
		}
	}

	public static void main(String[] args) {
		List<String> list = Arrays.asList("A B C D E F G H I J K L M N O".split(" "));
		test("modifyCopy", new ArrayList<String>(list));
		test("Arrays.asList", list);
		test("unModifyCopy", Collections.unmodifiableList(new ArrayList<String>(list)));
	}
}
