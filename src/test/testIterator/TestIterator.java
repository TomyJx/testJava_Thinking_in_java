package test.testIterator;

import java.util.Iterator;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-07-21:52
 */
public class TestIterator implements Iterable<Integer> {

	private int n = 0;

	public TestIterator(int n) {
		this.n = n;
	}

	int next() {
		return n;
	}

	public Iterator iterator() {
		return new Iterator() {
			@Override
			public boolean hasNext() {
				return n > 0;
			}

			@Override
			public Object next() {
				n--;
				return TestIterator.this.next();
			}

			@Override
			public void remove() {

			}
		};
	}

	public static void main(String[] args) {
		for (int i : new TestIterator(10)) {
			System.out.println(i);
		}
	}
}
