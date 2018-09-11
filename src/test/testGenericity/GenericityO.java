package test.testGenericity;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-14-0:33
 */
public class GenericityO extends GenericityN implements Comparable<GenericityN> {
	@Override
	public int compareTo(GenericityN o) {
		return 0;
	}
}

class Su<T> {

}
