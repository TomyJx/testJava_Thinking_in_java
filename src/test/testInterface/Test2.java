package test.testInterface;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-17-1:21
 */
public class Test2 extends Cla1 implements Int1,Int2,Int3 {
    // 这里没有实现fight方法，因为这里记得的类Cla1中有一个与接口名相同的方法，切有方法体
    @Override
    public void swim() {

    }

    @Override
    public void fly() {

    }
}

interface Int1 {
    void fight();
}

interface Int2 {
    void swim();
}

interface Int3 {
    void fly();
}

class Cla1 {
    public void fight() {
        System.out.println("fight");
    }
}
