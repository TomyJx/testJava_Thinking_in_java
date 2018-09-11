package test.testClass;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-25-0:56
 */
public class Test01 {
	public static void main(String[] args) throws ClassNotFoundException {
		/*Class<Boolean> booleanClass = boolean.class;
		Class<Boolean> type = Boolean.TYPE;
		Class<Boolean> booleanClass1 = Boolean.class;
		printClassInfo(booleanClass);
		printClassInfo(booleanClass1);
		printClassInfo(type);*/
//		Class.forName("test.testClass.Init");
//		Class<Init> initClass = Init.class;
		new Sub().show();
	}

	private static void printClassInfo(Class clazz) {
		System.out.println(clazz.getName() + "---" +  clazz.getSimpleName());
	}
}

class Init{
	static {
		System.out.println("init class init");
	}
}

class Super {

}

class Sub extends Super {
	void show() {
		System.out.println(super.toString());
		System.out.println(this.toString());
	}
}
