package test.testEnum;

/**
 * �������û��Ĭ�ϵĹ����������๹�����ͱ���Ҳ��һ��ͬ���Ĺ��������򱨴���Ϊ�����ʼ��������֮ǰ
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
//        super(aa); ��������д�����У���Ϊʵ������ʱ����ĳ�ʼ��������֮ǰ
        super(anInt); // ���������������
    }
}

class parent{
    private int anInt;

    public parent(int anInt) {
        this.anInt = anInt;

    }
}
