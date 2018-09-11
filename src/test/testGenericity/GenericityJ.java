package test.testGenericity;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-09-1:32
 */
public class GenericityJ<T> {
	private T[] array;

	public GenericityJ(Class<T> clazz, int size) {
		this.array = (T[]) Array.newInstance(clazz, size);
	}

	public T getT(int index) {
		return array[index];
	}

	public T[] getArray() {
		return array;
	}

	public void put(int index, T t) {
		array[index] = t;
	}

	public static void main(String[] args) {
		GenericityJ<Integer> genericityJ = new GenericityJ<>(Integer.class, 10);
		for (int i = 0; i < 10; i++) {
			genericityJ.put(i, i);
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(genericityJ.getT(i));
		}
		System.out.println(Arrays.toString(genericityJ.getArray()));
	}
}
