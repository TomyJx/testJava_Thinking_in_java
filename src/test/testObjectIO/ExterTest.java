package test.testObjectIO;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * 实现了Externalizable接口的类也可以被序列化。序列化自动调用writeExternal。不过在进行反序列化的时候会调用默认的构造器。同时调用readExternal。
 * 但是经试验，反序列化的时候，被序列话的类必须有默认的无参构造器
 *
 * @author jiyx
 * @create 2017-08-03-22:25
 */
public class ExterTest implements Externalizable {

	public ExterTest() {
		System.out.println("ExterTest Constructor");
	}

	public ExterTest(int i) {
		System.out.println("ExterTest Constructor");
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("ExterTest writeExternal");
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		System.out.println("ExterTest readExternal");
	}
}
