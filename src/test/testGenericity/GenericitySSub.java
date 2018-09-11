package test.testGenericity;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-14-21:48
 */
public class GenericitySSub extends GenericityS<GenericitySSub> {
	void set(Sub arg) {
		System.out.println("sub");
	}
}
