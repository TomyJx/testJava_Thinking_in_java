package test.testGenericity;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-14-21:47
 */
public class GenericityS<T extends GenericityS<T>> {
	void set(T arg) {
		System.out.println("super");
	}
}
