package test.testInterface;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-17-1:21
 */
public class Test2 extends Cla1 implements Int1,Int2,Int3 {
    // ����û��ʵ��fight��������Ϊ����ǵõ���Cla1����һ����ӿ�����ͬ�ķ��������з�����
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
