package test.testClass;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-16-12:52
 */
public class Test05 {

	void hello(int i) {
		System.out.println("hello");
	}

	int hello() {
		System.out.println("return int");
		return 1;
	}
	public static void main(String[] args) {
		new Test05().hello();
	}
}
