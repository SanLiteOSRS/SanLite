import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pr")
public final class class395 {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1579232837
	)
	static int field4450;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Date;",
		garbageValue = "-1974311975"
	)
	static Date method7402() throws ParseException {
		SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH); // L: 1493
		var0.setLenient(false); // L: 1494
		StringBuilder var1 = new StringBuilder(); // L: 1495
		String[] var2 = Login.field907; // L: 1497

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 1498
			String var4 = var2[var3]; // L: 1499
			if (var4 == null) { // L: 1501
				UserComparator7.method2966(7); // L: 1503
				class139.setLoginResponseString("Date not valid.", "Please ensure all characters are populated.", ""); // L: 1504
				return null; // L: 1506
			}

			var1.append(var4); // L: 1508
		}

		var1.append("12"); // L: 1512
		return var0.parse(var1.toString()); // L: 1513
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1509651634"
	)
	static int method7401(int var0, int var1) {
		int var2 = var1 - 334; // L: 5695
		if (var2 < 0) { // L: 5696
			var2 = 0;
		} else if (var2 > 100) { // L: 5697
			var2 = 100;
		}

		int var3 = (Client.zoomWidth - Client.zoomHeight) * var2 / 100 + Client.zoomHeight; // L: 5698
		return var0 * var3 / 256; // L: 5699
	}
}
