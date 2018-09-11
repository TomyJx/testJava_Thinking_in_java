package test.testArrays;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-20-22:53
 */
public class ComPType implements Comparable<ComPType> {

	public int i;
	public int j;

	public ComPType(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public int compareTo(ComPType o) {
		return this.i < o.i ? -1 : (this.i == o.i ? 0 : 1);
	}

	@Override
	public String toString() {
		return "ComPType{" +
				"i=" + i +
				", j=" + j +
				'}';
	}
}
