package test.testIOChannel;

import java.io.*;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;

/**
 * –‘ƒ‹≤‚ ‘
 *
 * @author jiyx
 * @create 2017-07-31-22:44
 */
public class MappedIO {
	private static int numOfInts = 4000000;
	private static int numOfUbuffInts = 200000;
	private static abstract class Tester{
		private String name;

		public Tester(String name) {
			this.name = name;
		}

		public void runTest() throws IOException {
			System.out.println(name + ": ");
			long start = System.nanoTime();
			test();
			double duration = System.nanoTime() - start;
			System.out.format("%.9f\n", duration / 10e9);
		}

		protected abstract void test() throws IOException;
	}

	private static Tester[] tests = {
		new Tester("Stream Writer") {
			@Override
			protected void test() throws IOException {
				DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("E:\\data3.txt")));
				for (int i = 0; i < numOfInts; i++) {
					out.writeInt(i);
				}
				out.close();
			}
		},
		new Tester("Mapped Writer") {
			@Override
			protected void test() throws IOException {
				FileChannel fc = new RandomAccessFile("E:\\data3.txt", "rw").getChannel();
				IntBuffer buffer = fc.map(FileChannel.MapMode.READ_WRITE, 0, fc.size()).asIntBuffer();
				for (int i = 0; i < numOfInts; i++) {
					buffer.put(i);
				}
				fc.close();
			}
		},
		new Tester("Stream Read") {
			@Override
			protected void test() throws IOException {
				DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("E:\\data3.txt")));
				for (int i = 0; i < numOfInts; i++) {
					in.readInt();
				}
				in.close();
			}
		},
		new Tester("Mapped Read") {
			@Override
			protected void test() throws IOException {
				FileChannel fc = new FileInputStream("E:\\data3.txt").getChannel();
				IntBuffer buffer = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size()).asIntBuffer();
				while (buffer.hasRemaining()) {
					buffer.get();
				}
				fc.close();
			}
		},
		new Tester("Stream Read/Writer") {
			@Override
			protected void test() throws IOException {
				RandomAccessFile raf = new RandomAccessFile(new File("E:\\data3.txt"), "rw");
				raf.writeInt(1);
				for (int i = 0; i < numOfUbuffInts; i++) {
					raf.seek(raf.length() - 4);
					raf.writeInt(raf.readInt());
				}
				raf.close();
			}
		},
		new Tester("Mapped Read/Writer") {
			@Override
			protected void test() throws IOException {
				FileChannel fc = new RandomAccessFile(new File("E:\\data3.txt"), "rw").getChannel();
				IntBuffer intBuffer = fc.map(FileChannel.MapMode.READ_WRITE, 0, fc.size()).asIntBuffer();
				for (int i = 1; i < numOfUbuffInts; i++) {
					intBuffer.put(intBuffer.get(i - 1));
				}
				fc.close();
			}
		}
	};

	public static void main(String[] args) throws IOException {
		for (Tester test : tests) {
			test.runTest();
		}
	}
}
