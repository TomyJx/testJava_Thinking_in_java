package test.testIOChannel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-07-25-23:47
 */
public class NioReadAndWriter {
	public static void main(String[] args) throws IOException {
		/*FileChannel in = new FileInputStream("E:\\data.txt").getChannel();
		FileChannel out = new FileOutputStream("E:\\dataOut.txt").getChannel();
		ByteBuffer bb = ByteBuffer.allocate(1024);
		while (in.read(bb) != -1) {
			bb.flip();// ��һ����Ϊд��׼��
			out.write(bb);
			bb.clear();// ���bbΪ��һ�εĶ���׼��
		}*/

		// ����һ�ָ��õķ�ʽ�����滻���ĵķ���
		FileChannel in = new FileInputStream("E:\\data.txt").getChannel();
		FileChannel out = new FileOutputStream("E:\\dataOut.txt").getChannel();
		ByteBuffer bb = ByteBuffer.allocate(1024);
		// ��һ����������Ҫ�������ݵ���ʼλ��
//		in.transferTo(0, in.size(), out);
//		in.transferTo(0, in.size(), out);
//		out.transferFrom(in, 0, in.size());
	}
}
