package test.testGenericity;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-09-1:02
 */
public class GenericityH<T> {
	private Object[] array;

	public GenericityH() {
	}

	public GenericityH(int size) {
		array = new Object[size];
	}

	public void put(int index, T obj) {
		array[index] = obj;
	}

	public T get(int index) {
		return (T) array[index];
	}

	public T[] getArray() {
		return (T[]) array;
	}

	public static void main(String[] args) {
		GenericityH<Integer> genericityH = new GenericityH<>(10);
		for (int i = 0; i < 10; i++) {
			genericityH.put(i, i);
		}
		for (int i = 0; i < 10; i++) {
			Integer integer = genericityH.get(i);
			System.out.println(genericityH.get(i));
		}
		// µ÷ÓÃgenericityH.getArray()Å×Òì³£
//		System.out.println(genericityH.getArray().getClass().getSimpleName());
//		GenericityH[] ints = (GenericityH[]) new Object[10];
		GenericityH t = (GenericityH) new Object();
	}

}
