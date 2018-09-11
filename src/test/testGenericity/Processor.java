package test.testGenericity;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-14-22:31
 */
public interface Processor<T, E extends Exception> {
	void process(List<T> list) throws E;
}
