package test.testEnum;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-07-22:38
 */
public class TestWeather {
	public static void main(String[] args) {
		Weather cool = Weather.Hot;
		System.out.println(cool);
		for (Weather weather : Weather.values()) {
			System.out.println("value=" + weather + ",ordinal=" + weather.ordinal() + ",name=" + weather.name());
			System.out.println(weather.compareTo(Weather.VERY_HOT));
			System.out.println(weather.equals(Weather.Hot));
			System.out.println(weather == Weather.Hot);
			System.out.println(weather.getDeclaringClass());
			System.out.println(weather.getClass());
			System.out.println(weather.toString());
			System.out.println("------------------");
		}

		System.out.println(Weather.valueOf("VERY_HOT"));
		System.out.println(Weather.VERY_HOT.equals("VERY_HOT"));
		System.out.println("========================");
		for (Weather weather : cool.getClass().getEnumConstants()) {
			System.out.println("value=" + weather + ",ordinal=" + weather.ordinal() + ",name=" + weather.name());
		}
		Enum enum1 = cool;
	}
}
