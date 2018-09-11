package test.testString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-23-23:11
 */
public class TestRegex {
	public static void main(String[] args) throws InterruptedException {
		/*String str = "\"orderIdList\":[\"201707221234560003\"]\n";
		Pattern pattern = Pattern.compile(".*[\\d*]");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			System.out.format("%s Match %s at positions %d - %d", str, matcher.group(), matcher.start(), matcher.end() - 1);
			System.out.println();
		}*/
		/*String str = "Never give up! Never surrender!";
		String regex = "Never.+?!";
		Matcher matcher = Pattern.compile(regex).matcher(str);
		while (matcher.find()) {
			System.out.format("Match %s at positions %d - %d", matcher.group(), matcher.start(), matcher.end() - 1);
			System.out.println();
			System.out.println(matcher.groupCount());
		}
		if (matcher.lookingAt()) {
			System.out.format("LokingAt %s at positions %d - %d", matcher.group(), matcher.start(), matcher.end() - 1);
			System.out.println();
		}
		if (matcher.matches()) {
			System.out.format("matches %s at positions %d - %d", matcher.group(), matcher.start(), matcher.end() - 1);
			System.out.println();
		}*/
		/*String str = "The time is over";
		String regex = "(?m)((\\S+)\\s+(\\S+))$";
		Matcher matcher = Pattern.compile(regex).matcher(str);
		while (matcher.find()) {
			for (int i = 0; i < matcher.groupCount(); i++) {
				System.out.print("[" + matcher.group(i) + "]");
			}
			System.out.println();
		}*/
		/*String str = "hello regex i use java to prictace regex";
		String regex = "[eujt]";
		Matcher matcher = Pattern.compile(regex).matcher(str);
		StringBuffer sb = new StringBuffer();
		while (matcher.find()) {
			matcher.appendReplacement(sb, matcher.group().toUpperCase());
		}
		matcher.appendTail(sb);
		System.out.println(sb.toString());*/
//		System.out.println("123abc456abc123".replace('1', 'O'));
//		System.out.println("123abc456abc123".replace("123", "321"));
		new TestRegex().f();
	}

	public void f() throws InterruptedException {
		wait();
	}
}
