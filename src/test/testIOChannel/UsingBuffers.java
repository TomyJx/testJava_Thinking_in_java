package test.testIOChannel;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-07-27-23:28
 */
public class UsingBuffers {
	private static void symmetricScramble(CharBuffer charBuffer) {
		while (charBuffer.hasRemaining()) {
			charBuffer.mark();
			char c1 = charBuffer.get();
			char c2 = charBuffer.get();
			charBuffer.reset();
			charBuffer.put(c2).put(c1);
		}
	}

	public static void main(String[] args) {
		char[] chars = "wo de tian".toCharArray();
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		CharBuffer charBuffer = buffer.asCharBuffer();
		charBuffer.put(chars);
		System.out.println(charBuffer);
		System.out.println(charBuffer.rewind());
		symmetricScramble(charBuffer);
		System.out.println(charBuffer.rewind());
		symmetricScramble(charBuffer);
		System.out.println(charBuffer.rewind());

	}
}
