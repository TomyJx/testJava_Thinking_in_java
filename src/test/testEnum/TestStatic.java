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
        // ������ֶ��ǲ����ص�ֻ�з�����д���з���������static��final��
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
    // ���ؾ�̬����
    public static void hello(int i) {
        System.out.println();
    }

    public void dyHello() {
        System.out.println("super dyHello");
    }

    // ����ֵ��ͬ����������
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
        sup.show();// �÷����ڸ�������private�ģ����������еķ���ֻ��ͬ������û�и��Ǹ���ĸ÷���
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
