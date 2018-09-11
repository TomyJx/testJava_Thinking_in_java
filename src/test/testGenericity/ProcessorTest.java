package test.testGenericity;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-14-22:43
 */
public class ProcessorTest {
	public static void main(String[] args) {
		ProcessRunner<String, Failure> processors = new ProcessRunner<>();
		for (int i = 0; i < 4; i++) {
			processors.add(new ProcessorImpl());
		}
		try {
			System.out.println(processors.processAll());
		} catch (Failure failure) {
			failure.printStackTrace();
		}
	}
}
