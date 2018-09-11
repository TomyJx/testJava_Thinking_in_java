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

		//当前系统默认时区的时间：
		Calendar calendar=new GregorianCalendar();
		System.out.print("时区："+calendar.getTimeZone().getID()+"  ");
		System.out.println("时间："+calendar.get(Calendar.HOUR_OF_DAY)+":"+calendar.get(Calendar.MINUTE));
		//美国洛杉矶时区
		TimeZone tz=TimeZone.getTimeZone("America/Los_Angeles");
		//时区转换
		calendar.setTimeZone(tz);
		System.out.print("时区："+calendar.getTimeZone().getID()+"  ");
		System.out.println("时间："+calendar.get(Calendar.HOUR_OF_DAY)+":"+calendar.get(Calendar.MINUTE));
		Date time=new Date();

		//1、取得本地时间：
		java.util.Calendar cal = java.util.Calendar.getInstance();

		//2、取得时间偏移量：
		int zoneOffset = cal.get(java.util.Calendar.ZONE_OFFSET);

		//3、取得夏令时差：
		int dstOffset = cal.get(java.util.Calendar.DST_OFFSET);

		//4、从本地时间里扣除这些差量，即可以取得UTC时间：
		cal.add(java.util.Calendar.MILLISECOND, -(zoneOffset + dstOffset));

		//之后调用cal.get(int x)或cal.getTimeInMillis()方法所取得的时间即是UTC标准时间。
		System.out.println("UTC:"+new Date(cal.getTimeInMillis()));

		Calendar calendar1 = Calendar.getInstance();
		TimeZone tztz = TimeZone.getTimeZone("GMT");
		calendar1.setTimeZone(tztz);
		System.out.println(calendar.getTime());
		System.out.println(calendar.getTimeInMillis());
		System.out.println(getUTCTimeStr());
	}

	/**
	 * 得到UTC时间，类型为字符串，格式为"yyyy-MM-ddTHH:mm:ssZ"<br />
	 * 如果获取失败，返回null
	 * @return
	 */
	public static String getUTCTimeStr() {
		DateFormat format = new SimpleDateFormat("YYYY-MM-dd'T'HH:mm:ss'Z'");
		StringBuffer UTCTimeBuffer = new StringBuffer();
		// 1、取得本地时间：
		Calendar cal = Calendar.getInstance() ;
		// 2、取得时间偏移量：
		int zoneOffset = cal.get(java.util.Calendar.ZONE_OFFSET);
		// 3、取得夏令时差：
		int dstOffset = cal.get(java.util.Calendar.DST_OFFSET);
		// 4、从本地时间里扣除这些差量，即可以取得UTC时间：
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
