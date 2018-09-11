package test.testObjectIO;

import java.io.*;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-02-23:38
 */
public class TestObjectIO {
	/*public static void main(String[] args) throws IOException, ClassNotFoundException {
		Parent parent = new Parent();
//		parent.noSeri = new NoSeri();
		System.out.println(parent);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("E:\\data4.txt"));
		out.writeObject(parent);

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("E:\\data4.txt"));
		Parent o = (Parent)in.readObject();
		System.out.println(o);
	}*/
	/*public static void main(String[] args) throws IOException, ClassNotFoundException {
		ExterTest ex = new ExterTest(1);
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("E:\\data4.txt"));
		out.writeObject(ex);

		ObjectInput in = new ObjectInputStream(new FileInputStream("E:\\data4.txt"));
		Object o = in.readObject();
		System.out.println(o.getClass().getSimpleName());
	}*/
	/*public static void main(String[] args) throws IOException, ClassNotFoundException {
		SeriaTest st = new SeriaTest(1, "kasksafd");
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("E:\\data4.txt"));
		out.writeObject(st);
		System.out.println(st);

		ObjectInput in = new ObjectInputStream(new FileInputStream("E:\\data4.txt"));
		Object o = in.readObject();
		System.out.println(o);
	}*/
	public static void main(String[] args) {
		switch (3) {
			default:
				System.out.println(3);
			case 0 :
				System.out.println(0);
			case 1:
				System.out.println(1);
			case 2:
				System.out.println(2);
		}
	}
}
