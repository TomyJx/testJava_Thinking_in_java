package test.testEnum;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-14-0:55
 */
public class TestStatic {
    public static void main(String[] args) {
        Super sup = new Sub();
        // 父类的字段是不重载的只有方法重写，切方法不能是static和final的
        System.out.println("super age:" + sup.age + " super.getAge:" + sup.getAge());
        sup.dyHello();
        sup.hello();

        Sub sub = new Sub();
        System.out.println("sub age:" + sub.age + " sub.getAge:" + sub.getAge() + " sub.getSuperAge:" + sub.getSuperAge());
        sub.dyHello();
        sub.hello();
    }
}

class Super {
    public static void hello() {
        System.out.println("super hello");
    }
    // 重载静态方法
    public static void hello(int i) {
        System.out.println();
    }

    public void dyHello() {
        System.out.println("super dyHello");
    }

    // 返回值不同并不是重载
    /*public int dyHello() {

    }*/

    private void show() {
        System.out.println("super show");
    }

    public int age = 11;

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Super sup = new Sub();
        sup.show();// 该方法在父类中是private的，所以子类中的方法只是同名，并没有覆盖父类的该方法
    }
}

class Sub extends Super {
    public int age = 19;

    public int getAge() {
        return age;
    }

    public int getSuperAge() {
        return super.age;
    }
    public void show() {
        System.out.println("sub show");
    }

    public static void hello() {
        System.out.println("sub hello");
    }

    public void dyHello() {
        System.out.println("sub dyHello");
    }
}
