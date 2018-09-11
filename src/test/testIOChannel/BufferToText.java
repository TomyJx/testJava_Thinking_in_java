package test.testIOChannel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-07-26-22:52
 */
public class BufferToText {
	private static final int BSIZE = 1024;

	public static void main(String[] args) throws IOException {
		FileChannel fc = new FileOutputStream("E:\\data2.txt").getChannel();
		fc.write(ByteBuffer.wrap("Some text".getBytes()));
		fc.close();
		fc = new FileInputStream("E:\\data2.txt").getChannel();
		ByteBuffer bb = ByteBuffer.allocate(BSIZE);
		fc.read(bb);
		bb.flip();
		System.out.println(bb.asCharBuffer());
		bb.rewind();
		String encoding = System.getProperty("file.encoding");
		System.out.println("Decoded using " + encoding + ": " + Charset.forName(encoding).decode(bb));

		fc = new FileOutputStream("E:\\data2.txt").getChannel();
		fc.write(ByteBuffer.wrap("this is encoding by utf-16be".getBytes("UTF-16BE")));// 这个编码很特殊
//		fc.write(ByteBuffer.wrap("this is encoding by utf-16be".getBytes("UTF-8")));
		fc.close();
		fc = new FileInputStream("E:\\data2.txt").getChannel();
		bb.clear();
		fc.read(bb);
		bb.flip();
		System.out.println(bb.asCharBuffer());

		/*fc = new FileOutputStream("E:\\data2.txt").getChannel();
		bb = ByteBuffer.allocate(30);
		bb.asCharBuffer().put("hello my daling");
		fc.write(bb);
		fc.close();
		fc = new FileInputStream("E:\\data2.txt").getChannel();
		bb.clear();
		fc.read(bb);
		bb.flip();
		System.out.println(bb.asCharBuffer());*/
	}
}
