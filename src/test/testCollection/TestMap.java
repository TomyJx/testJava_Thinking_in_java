package test.testCollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-09-10:08
 */
public class TestMap {
	public static void main(String[] args) {
		Map<String, String> map1 = new HashMap<>();

		Map<String, String> map2 = new TreeMap<>();

		Map<String, String> map3 = new LinkedHashMap<>();

		map1.put("java", "1");
		map1.put("hello", "1");
		map1.put("nihao", "1");
		map1.put("abc", "1");

		map2.put("java", "1");
		map2.put("hello", "1");
		map2.put("nihao", "1");
		map2.put("abc", "1");

		map3.put("java", "1");
		map3.put("hello", "1");
		map3.put("nihao", "1");
		map3.put("abc", "1");

		System.out.println(map1);
		System.out.println(map2);
		System.out.println(map3);
	}
}
