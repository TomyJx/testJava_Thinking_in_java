package test.testEnum;

import java.util.EnumSet;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-09-22:12
 */
public class EnumSets {
	enum AlarmPoints {
		STAIR1,
		STAIR2,
		LOBBY,
		OFFICE1,
		OFFICE2,
		OFFICE3,
		BATHROOM,
		UTILITY
	}

	public static void main(String[] args) {
		EnumSet<AlarmPoints> enumSetss = EnumSet.allOf(AlarmPoints.class);
		System.out.println(enumSetss);
		enumSetss = EnumSet.of(AlarmPoints.STAIR1, AlarmPoints.STAIR2);
		System.out.println(enumSetss);
		enumSetss = EnumSet.complementOf(enumSetss);
		System.out.println(enumSetss);
	}

}
