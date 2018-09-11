package test.testGenericity;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-08-22:55
 */
public class GenericityD {
	private Object object;

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public static void main(String[] args) {
		GenericityD genericityD = new GenericityD();
		genericityD.setObject("Item");
		String object = (String) genericityD.getObject();
	}
}
