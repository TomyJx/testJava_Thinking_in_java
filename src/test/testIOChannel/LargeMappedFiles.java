package test.testIOChannel;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-07-27-23:39
 */
public class LargeMappedFiles {
	static int lenght = 0x8FFFFFF;

	public static void main(String[] args) throws IOException {
		MappedByteBuffer out;
		out = new RandomAccessFile("E:\\data3.txt", "rw").getChannel().map(FileChannel.MapMode.READ_WRITE, 0, lenght);
		for (int i = 0; i < lenght; i++) {
			out.put((byte) 'x');
		}
		System.out.println("finish");
		for (int i = lenght / 2; i < lenght / 2 + 6; i++) {
			System.out.println((char)out.get(i));
		}
	}
}
