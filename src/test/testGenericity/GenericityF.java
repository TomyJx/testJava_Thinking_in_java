package test.testGenericity;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-08-22:57
 */
public class GenericityF<T extends GenericityD> {
	private T object;

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}

	public static void main(String[] args) {
		GenericityF<GenericityD> genericityE = new GenericityF<>();
		genericityE.setObject(new GenericityD());
		GenericityD object = genericityE.getObject();
	}
	
}
