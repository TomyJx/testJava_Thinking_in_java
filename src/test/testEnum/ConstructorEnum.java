package test.testEnum;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-07-23:02
 */
public enum ConstructorEnum {
	NOT(1, "hello"),
	YES(2, "world");
	private int anInt;
	private String string;
	ConstructorEnum(int i, String hello) {
		anInt = i;
		string = hello;
	}

	public int getAnInt() {
		return anInt;
	}

	public void setAnInt(int anInt) {
		this.anInt = anInt;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public static void main(String[] args) {
		for (ConstructorEnum constructorEnum : ConstructorEnum.values()) {
			System.out.println("value=" + constructorEnum + ",ordinal=" + constructorEnum.ordinal() + ",name=" + constructorEnum.name());
			constructorEnum.setAnInt(111);
			System.out.println("int=" + constructorEnum.getAnInt() + ",String=" + constructorEnum.getString());
		}
//		ConstructorEnum constructorEnum = new ConstructorEnum(2, "111");
	}
}
