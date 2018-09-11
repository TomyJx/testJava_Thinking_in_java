package test.testClass;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-25-1:22
 */
public class Test02 {
	public static void main(String[] args) throws IllegalAccessException, InstantiationException {
//		Class<Number> clazz = int.class;
//		Class<?> clazz = int.class;
//		Class<? extends Number> clazz = int.class;
//		Class<Sub1> sub1Class = Sub1.class;
//		Class<Super1> superclass = sub1Class.getSuperclass();
//		Class<? super Sub1> superclass1 = sub1Class.getSuperclass();
//		Class<? extends Sub1> aClass = Super1.class.asSubclass(Sub1.class);
//		Class<? extends Super1> aClass = Class.class.asSubclass(Super1.class);
//		System.out.println(aClass.newInstance());
		Super1 sp = new Sub1();
		Object o = new Object();
		Class<Sub1> sub1Class = Sub1.class;
//		sp.show(); // 报错，没有这个方法
		Sub1 cast = sub1Class.cast(sp);
//		Sub1 cast1 = sub1Class.cast(o);
		System.out.println(cast);
		cast.show();
	}
}

class Super1 {
	@Override
	public String toString() {
		return "Super1{}";
	}
}

class Sub1 extends Super1 {
	@Override
	public String toString() {
		return "Sub1{}";
	}

	void show() {

	}
}
