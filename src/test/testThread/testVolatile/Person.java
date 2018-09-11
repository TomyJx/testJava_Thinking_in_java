package test.testThread.testVolatile;

import java.util.concurrent.TimeUnit;

/**
 * @author jiyx
 * @create 2017-12-11-23:18
 */
public class Person {
	private String name;
	private int age;

	public void showPerson() {
		System.out.println("name=" + this.name + " age=" + this.age);
	}

	public void setPerson(String name,int age) {
		this.name = name;
		this.age = age;
	}
}
