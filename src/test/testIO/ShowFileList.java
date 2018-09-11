package test.testIO;

import java.io.File;
import java.io.IOException;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-07-17-23:32
 */
public class ShowFileList {
	public static void main(String[] args) throws IOException {
		/*File file = new File("E:\\");
		String[] list;
		list = file.list();
		System.out.println("AllList:" + Arrays.toString(list));
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		System.out.println("AllList:" + Arrays.toString(list));

		list = file.list(new FilenameFilter() {
			private Pattern pattern = Pattern.compile(".*.xml");

			@Override
			public boolean accept(File dir, String name) {
				return pattern.matcher(name).matches();
			}
		});
		System.out.println("AllList:" + Arrays.toString(list));
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		System.out.println("AllList:" + Arrays.toString(list));
*/
		/*File file = new File(".");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getCanonicalPath());
		System.out.println(file.getPath());*/

		File file = new File("D:\\text.txt");
		System.out.println(file.getCanonicalPath());
		System.out.println(file.getAbsolutePath());
		System.out.println("-------------------------");
		file = new File("D:\\Text.txt");
		System.out.println(file.getCanonicalPath());
		System.out.println(file.getAbsolutePath());
	}

}
