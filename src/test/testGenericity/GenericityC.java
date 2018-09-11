package test.testGenericity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-08-22:17
 */
public class GenericityC<T> {
	private Class<T> kind;

	public GenericityC(Class<T> kind) {
		this.kind = kind;
	}

	T[] create(int length) {
		return (T[]) Array.newInstance(kind, length);
	}

	public static void main(String[] args) {
		GenericityC<String> genericityC = new GenericityC<>(String.class);
		String[] strings = genericityC.create(4);
		System.out.println(Arrays.toString(strings));
		System.out.println(11111111);
		System.out.println(new String());
		System.out.println(11111111);
		System.out.println(Arrays.toString((String[]) Array.newInstance(String.class, 4)));
		System.out.println(11111111);

		Object o = Array.newInstance(String.class, 4);
//		Array.newInstance(new ArrayList<String>(), 4);

	}
}
