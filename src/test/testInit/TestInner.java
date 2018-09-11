package test.testInit;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-03-0:47
 */
public interface TestInner {

    void show();

    class Inner implements TestInner, in{

        @Override
        public void show() {
            System.out.println("hello out");
        }

        public static void main(String[] args) {
            new Inner().show();
        }
    }
    interface in{

    }
}
