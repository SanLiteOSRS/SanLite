import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ov")
public class class382 {
	@ObfuscatedName("ay")
	@Export("cp1252AsciiExtension")
	public static final char[] cp1252AsciiExtension;
	@ObfuscatedName("cj")
	@Export("otp")
	static String otp;

	static {
		cp1252AsciiExtension = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'}; // L: 4
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "13"
	)
	static boolean method7153() {
		Date var0;
		try {
			SimpleDateFormat var2 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH); // L: 1079
			var2.setLenient(false); // L: 1080
			StringBuilder var3 = new StringBuilder(); // L: 1081
			String[] var4 = Login.field905; // L: 1083
			int var5 = 0;

			while (true) {
				Date var1;
				if (var5 < var4.length) {
					String var6 = var4[var5]; // L: 1085
					if (var6 != null) { // L: 1087
						var3.append(var6); // L: 1092
						++var5; // L: 1084
						continue;
					}

					class151.method3174("Date not valid.", "Please ensure all characters are populated.", ""); // L: 1088
					var1 = null; // L: 1089
				} else {
					var3.append("12"); // L: 1096
					var1 = var2.parse(var3.toString()); // L: 1097
				}

				var0 = var1; // L: 1099
				break;
			}
		} catch (ParseException var10) { // L: 1101
			class151.method3174("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 1102
			return false; // L: 1103
		}

		if (var0 == null) { // L: 1105
			return false; // L: 1106
		} else {
			java.util.Calendar var11 = java.util.Calendar.getInstance(); // L: 1110
			var11.set(1, var11.get(1) - 13); // L: 1111
			var11.set(5, var11.get(5) + 1); // L: 1112
			var11.set(11, 0); // L: 1113
			var11.set(12, 0); // L: 1114
			var11.set(13, 0); // L: 1115
			var11.set(14, 0); // L: 1116
			Date var12 = var11.getTime(); // L: 1117
			boolean var7 = var0.before(var12); // L: 1118
			boolean var9 = class406.method7618(var0); // L: 1121
			if (!var9) { // L: 1122
				class151.method3174("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 1123
				return false; // L: 1124
			} else {
				if (!var7) { // L: 1126
					ClientPreferences.field1262 = 8388607; // L: 1127
				} else {
					ClientPreferences.field1262 = (int)(var0.getTime() / 86400000L - 11745L); // L: 1130
				}

				return true; // L: 1132
			}
		}
	}
}
