package test.testIOChannel;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-07-25-23:29
 */
public class GetChannel {
	public static void main(String[] args) throws IOException {
		FileChannel channel = new FileOutputStream("E:\\data.txt").getChannel();
		channel.write(ByteBuffer.wrap("ni hao channel".getBytes()));
		channel.close();
		channel = new RandomAccessFile("E:\\data.txt", "rw").getChannel();
		// 移动到文件末尾
		channel.position(channel.size());
		channel.write(ByteBuffer.wrap("zai ci jian mian".getBytes()));
		channel.close();

		channel = new FileInputStream("E:\\data.txt").getChannel();
		ByteBuffer bb = ByteBuffer.allocate(1024);
		channel.read(bb);
		bb.flip();
		while (bb.hasRemaining()) {
			System.out.print((char) bb.get());
		}

	}
}
