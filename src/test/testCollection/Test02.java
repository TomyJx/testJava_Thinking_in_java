package test.testCollection;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-12-23:37
 */
public class Test02 {
	public static void main(String[] args) {
		int count = 10000;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			list.add(i);
		}
		Long startTime = System.currentTimeMillis();
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {

		}
		long entTime = System.currentTimeMillis();
		System.out.println("fori " + (entTime - startTime));
		startTime = System.currentTimeMillis();
		for (Integer integer : list) {

		}
		entTime = System.currentTimeMillis();
		System.out.println("foreach " + (entTime - startTime));

	}
}
