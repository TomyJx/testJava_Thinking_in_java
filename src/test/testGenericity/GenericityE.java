package test.testGenericity;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-08-22:56
 */
public class GenericityE<T> {
	private T object;

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}

	public static void main(String[] args) {
		GenericityE<String> genericityE = new GenericityE<>();
		genericityE.setObject("Item");
		String object = genericityE.getObject();
	}
}
