package test.testCollection;

import java.util.ArrayList;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-06-23:09
 */
public class Test01 {
	public static void main(String[] args) {
		ArrayList<String> arry = new ArrayList<>();
		arry.add("111");
		arry.add("112");
		arry.add("113");
		arry.add("114");
		arry.add("115");
		arry.add("116");
		arry.add("117");
		for (int i = 0; i < arry.size(); i++) {
			if (i % 2 == 0) {
				arry.remove(arry.get(i));
			}
		}
		for (String s: arry) {
			arry.remove(s);
		}
	}
}

class SixTuple<A, B, C, D, E, F>{
	public A a;
	public final B b;
	public final C c;
	public final D d;
	public final E e;
	public final F f;
	public final String bb = "";

	SixTuple(B b, C c, D d, E e, F f) {
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
}
