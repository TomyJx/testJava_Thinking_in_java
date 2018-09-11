package test.testGenericity;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-14-22:39
 */
public class ProcessorImpl implements Processor<String, Failure> {
	static int count = 3;
	@Override
	public void process(List<String> list) throws Failure {
		if (count-- > 0) {
			list.add("hello");
		} else {
			list.add("end");
		}
		if (count < 0) {
			throw new Failure();
		}
	}
}
