package test.testGenericity;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-12-21:41
 */
public class TestArray {
	/*public static void main(String[] args) {
		Fruit[] array = new Apple[10];
		array[0] = new Apple();
		array[1] = new Jonathon();
		try {
			array[2] = new Orange();
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			array[3] = new Fruit();
		} catch (Exception e) {
			System.out.println(e);
		}
	}*/
	/*public static void main(String[] args) {
//		List<Fruit> list = new ArrayList<Apple>();
		List<? extends Fruit> list = new ArrayList<Apple>();
//		list.add(new Apple());
//		list.add(new Fruit());
//		list.add(new Object());
//		list.add(new Orange());
		List<Apple> appleList = new ArrayList<>();
		appleList.add(new Apple());
		appleList.add(new Apple());
		appleList.add(new Apple());
		for (Apple apple : appleList) {
			System.out.println(apple);
		}
		System.out.println(list.size());
		list = appleList;
		System.out.println(list.size());
//		list.add(new Apple());
		Fruit fruit = list.get(0);
		Apple apple = (Apple) list.get(0);
		try {
			Orange orange = (Orange) list.get(0);
		} catch (Exception e) {
			System.out.println(e);
		}

	}*/

	static <T> void f1(List<? super T> list, T item) {
		list.add(item);
		Object object = list.get(0);
	}

	static void f2(List<? extends Apple> list) {

	}

	static void f3(List<? super Apple> list) {

	}

	public static void main(String[] args) {
		/*List<? super Apple> list = new ArrayList<>();
		Fruit a = new Apple();
		list.add(new Jonathon());
		list.add(new Apple());
		list.add(a);
		list.add(new Fruit());*/
		f2(new ArrayList<Apple>());
//		f2(new ArrayList<Fruit>());
		f2(new ArrayList<Jonathon>());
//		f2(new ArrayList<Object>());

		f3(new ArrayList<Apple>());
		f3(new ArrayList<Fruit>());
//		f3(new ArrayList<Jonathon>());
		f3(new ArrayList<Object>());
		List lll = new ArrayList<String>();

		List<Apple> llll = new ArrayList<>();
		llll.add(new Jonathon());

	}
}


class Fruit{}
class Apple extends Fruit{}
class Jonathon extends Apple{}
class Orange extends Fruit{}
