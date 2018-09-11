package test.testThread.testExchanger;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-10-25-22:48
 */
public class BasicGenerator {
	public static Generator create(Class clazz) {
		return new Generator() {
			@Override
			public Object next() {
				try {
					return clazz.newInstance();
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
				return null;
			}
		};
	}

}
