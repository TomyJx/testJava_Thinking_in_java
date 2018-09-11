package test.testStaticBindAndDynamicBind;

/**
 * output��
 * ride horse
 * ride horse
 * �����������������Ϊjava�Ķ�̬�;�̬�󶨻���
 * һ��Java�����ִ��Ҫ���������ִ�У����ͣ����������裬ͬʱJava�����������ı�����ԡ�������͸������ͬһ��������������д�˸���ķ���������������ʱ���÷����ǵ��ø���ķ��������������д�����أ���Ӧ���������ڳ�ѧJavaʱ���������⡣�����������ǽ�ȷ�����ֵ��ú��ַ���ʵ�ֻ��߱����Ĳ��������󶨡�
 * ��Java�д������ְ󶨷�ʽ��һ��Ϊ��̬�󶨣��ֳ������ڰ󶨡���һ�־��Ƕ�̬�󶨣����Ϊ���ڰ󶨡�
 *
 * ����Ա�
 * 		��̬�󶨷����ڱ���ʱ�ڣ���̬�󶨷���������ʱ
 * 		ʹ��private��static��final���εı������߷�����ʹ�þ�̬�󶨡����鷽�������Ա�������д�ķ���������������ʱ�Ķ�����ж�̬�󶨡�
 *		��̬��ʹ������Ϣ����ɣ�����̬������Ҫʹ�ö�����Ϣ����ɡ�
 *		����(Overload)�ķ���ʹ�þ�̬����ɣ�����д(Override)�ķ�����ʹ�ö�̬����ɡ�
 *
 * @author jiyx
 * @create 2017-08-14-22:46
 */
public class Mozi {
	void ride(Horse horse) {
		System.out.println("ride horse");
	}

	void ride(WhiteHorse whiteHorse) {
		System.out.println("ride whiteHorse");
	}

	void ride(BlackHorse blackHorse) {
		System.out.println("ride blackHorse");
	}

	public static void main(String[] args) {
		Mozi mozi = new Mozi();
		Horse wh = new WhiteHorse();
		Horse bh = new BlackHorse();
		mozi.ride(wh);
		mozi.ride(bh);
	}
}

class Horse {

}

class WhiteHorse extends Horse {

}

class BlackHorse extends Horse{

}
