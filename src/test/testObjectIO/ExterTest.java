package test.testObjectIO;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * ʵ����Externalizable�ӿڵ���Ҳ���Ա����л������л��Զ�����writeExternal�������ڽ��з����л���ʱ������Ĭ�ϵĹ�������ͬʱ����readExternal��
 * ���Ǿ����飬�����л���ʱ�򣬱����л����������Ĭ�ϵ��޲ι�����
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
