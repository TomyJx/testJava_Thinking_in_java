package test.testInit;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-02-21:18
 */
public class Parent {
    static {
        System.out.println("parent init");
    }

    public static void staticMethod1() {
        System.out.println("parent static mehtod");
    }

    public void hello() {
        System.out.println("hello");
    }
}
