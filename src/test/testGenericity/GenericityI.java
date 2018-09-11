package test.testGenericity;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-09-1:22
 */
public class GenericityI<T> {
	private T[] array;

	public GenericityI(int size) {
		this.array = (T[]) new Object[size];
	}

	public T[] getArray() {
		return array;
	}

	public void put(int index, T t) {
		array[index] = t;
	}

	public static void main(String[] args) {
		GenericityI<Integer> genericityI = new GenericityI<>(10);
		for (int i = 0; i < 10; i++) {
			genericityI.put(i, i);
		}
		// Å×Òì³£ClassCastException
//		Integer[] array = genericityI.getArray();
		Object[] array = genericityI.getArray();
	}
}
