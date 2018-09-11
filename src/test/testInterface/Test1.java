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
    // 该方法其实是public void hello();
    void hello();
}

class SuperImpl implements Super {

    @Override
    // 这里只能是public其他的都不行
    public void hello() {
        System.out.println("hello");
    }
}
