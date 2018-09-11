package test.testGenericity;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-14-22:33
 */
public class ProcessRunner<T, E extends Exception> extends ArrayList<Processor<T, E>> {
	List<T> processAll() throws E {
		List<T> list = new ArrayList<>();
		for (Processor<T, E> pro : this) {
			pro.process(list);
		}
		return list;
	} 
}
