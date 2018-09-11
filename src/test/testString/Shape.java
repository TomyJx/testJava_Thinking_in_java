package test.testString;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-24-23:32
 */
public abstract class Shape {
	void draw() {
		System.out.println(this + "sss");
	}

	public abstract String toString();

}

class Super {
	public void show() {
		System.out.println("shoiw");
	}
}

abstract class Sub extends Super{
	public abstract void show();
}