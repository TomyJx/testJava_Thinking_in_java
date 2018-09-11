package test.testObjectIO;

import java.io.Serializable;
import java.util.Random;

/**
 * һ��Ҫ��ĳ������������л���ʱ��һ��ʵ�ֵ���Serializable�ӿڡ�ʵ�ָýӿڷ����л���ʱ�򲻻����Ĭ�ϵĹ�����
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
