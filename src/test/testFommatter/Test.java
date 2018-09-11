package test.testFommatter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Formatter;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-22-23:32
 */
public class Test {
	public static void main(String[] args) throws FileNotFoundException {
		/*char u = 'a';
		Formatter formatter = new Formatter(System.out);
		formatter.format("s: %s \n", u);
		formatter.format("s: %d \n", u);*/
		/*byte[] data = new byte[1024];
		for (int i = 0; i < 1024; i++) {
			data[i] = (byte) (i % 16);
		}

		System.out.print(format(data));*/
		/*System.out.println("abc".matches(".*"));
		System.out.println("abc".matches("[abc]"));
		System.out.println("c".matches("[abc]"));
		System.out.println("b".matches("[abc]"));
		System.out.println("a".matches("[abc]"));
		System.out.println("ac".matches("[abc]"));*/
		System.out.println("abcabc".matches("abc+"));
		System.out.println("abcabc".matches("(abc)+"));

	}

	public static String format(byte[] data) {
		StringBuilder result = new StringBuilder();
		int n = 0;
		for (byte b : data) {
			if (n % 16 == 0) {
				result.append(String.format("%05x: ", n));
			}
			result.append(String.format("%02x: ", b));
			n++;
			result.append("\n");
		}
		return result.toString();
	}
}
