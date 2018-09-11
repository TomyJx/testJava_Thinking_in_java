package test.testGenericity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-14-22:10
 */
public class CheckedList {
	static void add(List list) {
		list.add(new Cat());
	}

	public static void main(String[] args) {
		List<Dog> dogs = new ArrayList<>();
		add(dogs);
		List<Dog> dogList = Collections.checkedList(dogs, Dog.class);
		add(dogs);
		add(dogList);
	}
}
