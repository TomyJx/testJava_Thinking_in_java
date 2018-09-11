package test.testCollection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-07-11-22:20
 */
public class TestC {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("hello");
		list.add("world");
		list.add("java");
		System.out.println(list);
		List<String> strings = Collections.checkedList(list, String.class);
		System.out.println(strings);
		strings.add("xx");
		System.out.println(strings);
		System.out.println(list);
		
	}
}
