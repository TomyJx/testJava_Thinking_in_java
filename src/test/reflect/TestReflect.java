package test.reflect;

import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-05-22:25
 */
public class TestReflect {
	public static void main(String[] args) throws ClassNotFoundException {
		Pattern compile = Pattern.compile("\\w+\\.");
		Class<?> clazz = Class.forName("test.reflect.TestReflect");System.out.println(clazz.isInstance(new TestReflect()));
		System.out.println(clazz.isInstance(new Object()));
		System.out.println(Object.class.isInstance(new Object()));;
		System.out.println(Object.class.isInstance(new TestReflect()));;
		Method[] methods = clazz.getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
			System.out.println(methods[i]);
		}
		for (int i = 0; i < methods.length; i++) {
			/*Matcher matcher = compile.matcher(methods[i].toString());
			while (matcher.find()) {
				System.out.println(matcher.group());
			}*/
			System.out.println(compile.matcher(methods[i].toString()).replaceAll(""));
		}

	}

	private void show() {

	}

	public void hello() {

	}

	void word() {

	}

	public int count() {
		return 1;
	}
}
