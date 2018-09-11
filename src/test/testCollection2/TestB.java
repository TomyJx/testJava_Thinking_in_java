package test.testCollection2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-07-04-23:12
 */
public class TestB {
	public static void main(String[] args) {
		/*List<String> list = new ArrayList<>();
		list.set(1, "11");
		System.out.println(list);*/
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(1, "hello");
		map.put(0, "java");
		map.put(3, "what");
		map.put(4, "ni");
		map.put(2, "22");
		System.out.println(map);
		System.out.println(map.comparator());
		int low = 0;
		int high = 0;
		Iterator<Integer> it = map.keySet().iterator();
		for (int i = 0; i <= 3; i++) {
			if (i == 1) {
				low = it.next();
			}
			else if (i == 3) {
				high = it.next();
			} else it.next();
		}
		System.out.println(low + "====" + high);
	}
}
