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
			bb.flip();// 这一步是为写做准备
			out.write(bb);
			bb.clear();// 清空bb为下一次的读做准备
		}*/

		// 还有一种更好的方式可以替换上文的方法
		FileChannel in = new FileInputStream("E:\\data.txt").getChannel();
		FileChannel out = new FileOutputStream("E:\\dataOut.txt").getChannel();
		ByteBuffer bb = ByteBuffer.allocate(1024);
		// 第一个参数就是要输入内容的起始位置
//		in.transferTo(0, in.size(), out);
//		in.transferTo(0, in.size(), out);
//		out.transferFrom(in, 0, in.size());
	}
}
