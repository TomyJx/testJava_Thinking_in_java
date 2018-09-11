package test.testIO;

import java.io.*;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-07-24-22:48
 */
public class TestPrintWriter {
	public static void main(String[] args) throws IOException {
		/*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while ((s = reader.readLine()) != null && s.length() != 0) {
			System.out.println(s);
		}*/
		/*BufferedInputStream in = new BufferedInputStream(System.in);
		byte[] bytes = new byte[1024];
		int length = 0;
		while ((length = in.read(bytes)) != 0) {
			System.out.print(new String(bytes, 0, length));
		}*/
		/*PrintWriter pw = new PrintWriter(System.out);
		pw.println("hhhhhh");
		pw.flush();*/
		/*PrintWriter pw = new PrintWriter(System.out, true);
		pw.println("hhhhhh");*/

		// 标准输入输出重定向
		PrintStream console = System.out;
		BufferedInputStream in = new BufferedInputStream(new FileInputStream("E:\\3.txt"));
		PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream("E:\\aaa.txt")));
		System.setIn(in);
		System.setErr(out);
		System.setOut(out);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while ((s = reader.readLine()) != null) {
			System.out.println(s);
		}
		out.close();
		System.setOut(console);
		System.out.println("111111111");
	}
}
