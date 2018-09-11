package test.testEnum;

/**
 * 如果父类没有默认的构造器，子类构造器就必须也有一个同样的构造器否则报错，因为父类初始化在子类之前
 *
 * @author jiyx
 * @create 2017-04-13-0:35
 */
public class TestExtend extends parent {

    private int aa = 0;

    public TestExtend() {
        super(11);
    }

    public TestExtend(int anInt) {
//        super(aa); 报错这种写法不行，因为实例化的时候父类的初始化在子类之前
        super(anInt); // 这里必须这样做，
    }
}

class parent{
    private int anInt;

    public parent(int anInt) {
        this.anInt = anInt;

    }
}
