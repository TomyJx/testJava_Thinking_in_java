package test.testGenericity;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-13-22:55
 */
public class GenericityK {
	public static void main(String[] args) {
		String[] strArr = {"1hhh", "hello"};
		String[] strArr1 = {"1hhh", "hello"};
		List<String> list = Arrays.asList(strArr);
		List<String> list11 = Arrays.asList(new String[]{"1hhh", "hello"});
		System.out.println(list11.getClass().getName() + "@");
		List<String> list1 = Arrays.asList("1hhh", "hello");
//		List<String> list2 = Arrays.asList({"1hhh","hello"});
		byte[] bytes = {1, 3, 8, 127};
		List<byte[]> byteList = Arrays.asList(bytes);
		HashSet<byte[]> set = new HashSet<>(Arrays.asList(bytes));

		Person[] persons = {new Person(), new Person()};
		List<Person> people = Arrays.asList(persons);

		int[] ints = {1111, 112, 10};
		List<int[]> integerList = Arrays.asList(ints);
		List<Integer> integerList1 = Arrays.asList(100, 200, 300);
		Integer[] inters = {1111, 112, 10};
		List<Integer> integerList01 = Arrays.asList(inters);
	}

}
