package test.testGenericity;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-14-21:36
 */
public class GenericityRTest {
	void test(GenericityRSub genericityRSub) {
		GenericityRSub genericityRSub1 = genericityRSub.get();
		GenericityR genericityRSub2 = genericityRSub.get();
	}
}
