package test.testClass;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-14-22:33
 */
public class Test04 {
	static void hello(SuperS s1, SuperS s2) {
		s1.hello();
		s2.hello();
	}
	public static void main(String[] args) {
		hello(new Subs1(), new Subs2());
	}
}

class SuperS {
	void hello() {
		System.out.println("SuperS hello");
	}
}

class Subs1 extends SuperS {
	void hello() {
		System.out.println("Subs1 hello");
	}
}

class Subs2 extends SuperS {
	void hello() {
		System.out.println("Subs2 hello");
	}
}

