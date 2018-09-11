package test.testClass;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-25-23:43
 */
public class Test03 {
	public static void main(String[] args) {
//		System.out.println(Sub3.class.isAssignableFrom(Super3.class));
//		System.out.println(Super3.class.isAssignableFrom(Sub3.class));
//		System.out.println(Super3.class.isAssignableFrom(Super3.class));
//		System.out.println(SubInter.class.getSuperclass());
//		System.out.println(Object.class.getSuperclass());
//		System.out.println(Sub3.class.getSuperclass());
//		System.out.println(int.class.getSuperclass());
//		System.out.println(void.class.getSuperclass());
		Class<Void> voidClass = void.class;
		System.out.println(voidClass.getName());
	}
}

class Super3{}
class Sub3 extends Super3{}
interface SuperInter{}

interface SubInter extends SuperInter {}