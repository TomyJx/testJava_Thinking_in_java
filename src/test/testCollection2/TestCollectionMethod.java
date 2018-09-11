package test.testCollection2;

import java.util.*;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-22-22:00
 */
public class TestCollectionMethod {
	public static void main(String[] args) {
//		Collection<Integer> list = new ArrayList<>();
//		System.out.println(list);
//		list.add(1);
//		System.out.println(list);
//		list.clear();
//		System.out.println(list);
//		list.add(2);
//		System.out.println(list.contains(2));
//		System.out.println(list.contains(1));

		Collection<Integer> list1 = new ArrayList<>(Arrays.asList(new Integer[]{1, 2}));
		Collection<Integer> list2 = new ArrayList<>(Arrays.asList(new Integer[]{2}));
//		System.out.println(list.containsAll(list));
//		System.out.println(list.containsAll(list1));
//		System.out.println(list.containsAll(list2));
//		System.out.println(list2.isEmpty());
//		list2.remove(0);
//		list2.clear();
//		System.out.println(list2.isEmpty());
//		list2.add(null);
//		System.out.println(list2.size());
//		System.out.println(list2.isEmpty());
//		System.out.println(list1);
//		list1.removeAll(list2);
//		list1.retainAll(list2);
//		System.out.println(list1);
//		System.out.println(list2);
//
		list1.toArray(new Integer[list1.size()]);
		Collection<Integer> list = new ArrayList<>(Arrays.asList(new Integer[]{1, 2, 5}));
		Collection<Integer> set = new HashSet<>(Arrays.asList(new Integer[]{1, 2}));
		System.out.println(list);
//		list.addAll(set);
//		System.out.println(list.containsAll(set));
		list.retainAll(set);
//		list.removeAll(set);
		System.out.println(list);
	}
}
