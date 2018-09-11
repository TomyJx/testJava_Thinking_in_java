package test.testGenericity;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-13-23:49
 */
public class GenericityL {
	public static void main(String[] args) {
		GenericityL cast = new GenericityL().getClass().cast(new Object());
	}
}

interface Depart<T>{}

//class GongGuan implements Depart<Person>{}
//class CaiWu extends GongGuan implements Depart<CaiWu>{}
class GongGuan1 implements Depart{}
class CaiWu1 extends GongGuan1 implements Depart{}

interface AA{
	void show();
}
class BB implements AA{
	@Override
	public void show() {

	}
}
class CC extends BB implements AA{}
