package test.testInterface;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-17-0:57
 */
public class Test1 {
    public static void main(String[] args) {

    }
}

interface Super {
    // �÷�����ʵ��public void hello();
    void hello();
}

class SuperImpl implements Super {

    @Override
    // ����ֻ����public�����Ķ�����
    public void hello() {
        System.out.println("hello");
    }
}
