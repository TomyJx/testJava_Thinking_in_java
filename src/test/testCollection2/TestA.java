package test.testCollection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-20-23:38
 */
public class TestA {

	public static void main(String[] args) {
		List<StringAddress> list = new ArrayList<>(Collections.nCopies(4, new StringAddress("java")));
		System.out.println(list);
		Collections.fill(list, new StringAddress("hello"));
		System.out.println(list);
		Collections.addAll(list, new StringAddress[]{new StringAddress("world"), new StringAddress("1111")});
		System.out.println(list);
		list.addAll(list);
		System.out.println(list);
	}
}
