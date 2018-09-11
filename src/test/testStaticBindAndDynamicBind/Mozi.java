package test.testStaticBindAndDynamicBind;

/**
 * output：
 * ride horse
 * ride horse
 * 出现这种情况就是因为java的动态和静态绑定机制
 * 一个Java程序的执行要经过编译和执行（解释）这两个步骤，同时Java又是面向对象的编程语言。当子类和父类存在同一个方法，子类重写了父类的方法，程序在运行时调用方法是调用父类的方法还是子类的重写方法呢，这应该是我们在初学Java时遇到的问题。这里首先我们将确定这种调用何种方法实现或者变量的操作叫做绑定。
 * 在Java中存在两种绑定方式，一种为静态绑定，又称作早期绑定。另一种就是动态绑定，亦称为后期绑定。
 *
 * 区别对比
 * 		静态绑定发生在编译时期，动态绑定发生在运行时
 * 		使用private或static或final修饰的变量或者方法，使用静态绑定。而虚方法（可以被子类重写的方法）则会根据运行时的对象进行动态绑定。
 *		静态绑定使用类信息来完成，而动态绑定则需要使用对象信息来完成。
 *		重载(Overload)的方法使用静态绑定完成，而重写(Override)的方法则使用动态绑定完成。
 *
 * @author jiyx
 * @create 2017-08-14-22:46
 */
public class Mozi {
	void ride(Horse horse) {
		System.out.println("ride horse");
	}

	void ride(WhiteHorse whiteHorse) {
		System.out.println("ride whiteHorse");
	}

	void ride(BlackHorse blackHorse) {
		System.out.println("ride blackHorse");
	}

	public static void main(String[] args) {
		Mozi mozi = new Mozi();
		Horse wh = new WhiteHorse();
		Horse bh = new BlackHorse();
		mozi.ride(wh);
		mozi.ride(bh);
	}
}

class Horse {

}

class WhiteHorse extends Horse {

}

class BlackHorse extends Horse{

}
