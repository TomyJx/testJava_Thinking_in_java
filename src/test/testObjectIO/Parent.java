package test.testObjectIO;

import java.io.Serializable;
import java.util.Random;

/**
 * 一般要对某个对象进行序列化的时候一般实现的是Serializable接口。实现该接口反序列话的时候不会调用默认的构造器
 *
 * @author jiyx
 * @create 2017-08-02-23:39
 */
public class Parent implements Serializable {
	private static Random random = new Random(47);

	public int a;
	public int b;
	public int c;

	public NoSeri noSeri;

	public Parent() {
		System.out.println("Parent constructor");
		a = random.nextInt(10);
		b = random.nextInt(10);
		c = random.nextInt(10);
	}

	@Override
	public String toString() {
		return "Parent{" +
				"random=" + random +
				", a=" + a +
				", b=" + b +
				", c=" + c +
				", noSeri=" + noSeri +
				'}' + super.toString();
	}

	public static void main(String[] args) {
		System.out.println(random.nextInt(10));
		System.out.println(random.nextInt(10));
		System.out.println(random.nextInt(10));
	}
}
