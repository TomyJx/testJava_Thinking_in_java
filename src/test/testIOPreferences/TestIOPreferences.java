package test.testIOPreferences;

import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-07-22:16
 */
public class TestIOPreferences {
	public static void main(String[] args) throws BackingStoreException {
		Preferences preferences = Preferences.userNodeForPackage(TestIOPreferences.class);
		preferences.put("aaaaa", "bbbbb");
		preferences.putInt("Int", 10);
		preferences.putBoolean("True", true);
		preferences.putDouble("Double", 1.123465D);
		preferences.putLong("Long", 456L);

		int usageCount = preferences.getInt("UsageCount", 0);
		usageCount++;
		preferences.putInt("UsageCount", usageCount);

		for (String s : preferences.keys()) {
			System.out.println(s + ": " + preferences.get(s, null));
		}

		System.out.println(preferences.getInt("Int", 0));

	}
}
