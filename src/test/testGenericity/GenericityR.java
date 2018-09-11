package test.testGenericity;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-14-21:33
 */
public interface GenericityR<T extends GenericityR<T>> {
	T get();
}
