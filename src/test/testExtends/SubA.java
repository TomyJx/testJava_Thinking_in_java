package test.testExtends;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-14-21:17
 */
public class SubA extends SuperA {

	@Override
	public void f1() {

	}

	@Override
	void f2() {

	}

	@Override
	protected void f3() {

	}

//	@Override
	private void f4() {

	}

	public SubA f5() {
		return null;
	}

//	@Override
	public static void f6() {

	}

	public static void main(String[] args) {
		SuperA s = new SubA();
		s.f1();
		s.f2();
		s.f3();
	}
}
