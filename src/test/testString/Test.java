package test.testString;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-18-16:50
 */
public class Test {
    public static void main(String[] args) {
        /*String result = null;
        for (int i = 0; i < 25; i++) {
            result += "1";
        }
        System.out.println(result);*/
        /*StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 25; i++) {
            sb.append("1");
        }
        System.out.println(sb.toString());*/
        System.out.println(new A());
    }
}

class A {
    @Override
    public String toString() {
        // ��������StackOverflowError�쳣����Ϊ����this��ʱ��JVM��ͼ��thisת�����ַ������ͻ����this��toString�������ͷ����˵ݹ�
//        return this + "A ";
        return super.toString();
    }
}
