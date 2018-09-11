package test;

import test.testExtends.SuperA;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-14-21:18
 */
public class SubA extends SuperA {

	@Override
	public void f1() {

	}

//	@Override
	void f2() {

	}

	@Override
	protected void f3() {

	}

	//	@Override
	private void f4() {

	}

	public static void main(String[] args) {
		SuperA s = new SubA();
		s.f1();
//		s.f2();
//		s.f3();
//		s.f4();
		SubA su = new SubA();
		su.f1();
//		su.f2();
		su.f3();
//		su.f4();
	}
}
