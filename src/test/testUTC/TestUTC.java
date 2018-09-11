package test.testUTC;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-08-9:47
 */
public class TestUTC {

	public static void main(String[] args) {
		SimpleDateFormat foo = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("foo:"+foo.format(new Date()));

		Calendar gc = GregorianCalendar.getInstance();
		System.out.println("gc.getTime():"+gc.getTime());
		System.out.println("gc.getTimeInMillis():"+new Date(gc.getTimeInMillis()));

		//��ǰϵͳĬ��ʱ����ʱ�䣺
		Calendar calendar=new GregorianCalendar();
		System.out.print("ʱ����"+calendar.getTimeZone().getID()+"  ");
		System.out.println("ʱ�䣺"+calendar.get(Calendar.HOUR_OF_DAY)+":"+calendar.get(Calendar.MINUTE));
		//������ɼ�ʱ��
		TimeZone tz=TimeZone.getTimeZone("America/Los_Angeles");
		//ʱ��ת��
		calendar.setTimeZone(tz);
		System.out.print("ʱ����"+calendar.getTimeZone().getID()+"  ");
		System.out.println("ʱ�䣺"+calendar.get(Calendar.HOUR_OF_DAY)+":"+calendar.get(Calendar.MINUTE));
		Date time=new Date();

		//1��ȡ�ñ���ʱ�䣺
		java.util.Calendar cal = java.util.Calendar.getInstance();

		//2��ȡ��ʱ��ƫ������
		int zoneOffset = cal.get(java.util.Calendar.ZONE_OFFSET);

		//3��ȡ������ʱ�
		int dstOffset = cal.get(java.util.Calendar.DST_OFFSET);

		//4���ӱ���ʱ����۳���Щ������������ȡ��UTCʱ�䣺
		cal.add(java.util.Calendar.MILLISECOND, -(zoneOffset + dstOffset));

		//֮�����cal.get(int x)��cal.getTimeInMillis()������ȡ�õ�ʱ�伴��UTC��׼ʱ�䡣
		System.out.println("UTC:"+new Date(cal.getTimeInMillis()));

		Calendar calendar1 = Calendar.getInstance();
		TimeZone tztz = TimeZone.getTimeZone("GMT");
		calendar1.setTimeZone(tztz);
		System.out.println(calendar.getTime());
		System.out.println(calendar.getTimeInMillis());
		System.out.println(getUTCTimeStr());
	}

	/**
	 * �õ�UTCʱ�䣬����Ϊ�ַ�������ʽΪ"yyyy-MM-ddTHH:mm:ssZ"<br />
	 * �����ȡʧ�ܣ�����null
	 * @return
	 */
	public static String getUTCTimeStr() {
		DateFormat format = new SimpleDateFormat("YYYY-MM-dd'T'HH:mm:ss'Z'");
		StringBuffer UTCTimeBuffer = new StringBuffer();
		// 1��ȡ�ñ���ʱ�䣺
		Calendar cal = Calendar.getInstance() ;
		// 2��ȡ��ʱ��ƫ������
		int zoneOffset = cal.get(java.util.Calendar.ZONE_OFFSET);
		// 3��ȡ������ʱ�
		int dstOffset = cal.get(java.util.Calendar.DST_OFFSET);
		// 4���ӱ���ʱ����۳���Щ������������ȡ��UTCʱ�䣺
		cal.add(java.util.Calendar.MILLISECOND, -(zoneOffset + dstOffset));
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		UTCTimeBuffer.append(year).append("-").append(month < 10 ? "0" + month : month).append("-").append(day < 10 ? "0" + day : day) ;
		UTCTimeBuffer.append("T").append(hour < 10 ? "0" + hour : hour).append(":").append(minute < 10 ? "0" + minute : minute) ;
		UTCTimeBuffer.append(":").append(second < 10 ? "0" + second : second).append("Z");
		try{
			format.parse(UTCTimeBuffer.toString()) ;
			return UTCTimeBuffer.toString() ;
		}catch(ParseException e)
		{
			e.printStackTrace() ;
		}
		return null ;
	}
}
