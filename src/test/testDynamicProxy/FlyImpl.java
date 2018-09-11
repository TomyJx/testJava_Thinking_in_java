package test.testDynamicProxy;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-05-23:10
 */
public class FlyImpl implements InterfaceFly {
	@Override
	public void fly() {
		System.out.println("I use Wings fly!!!");
	}
}
