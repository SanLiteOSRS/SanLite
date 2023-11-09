import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oj")
public class class385 {
	@ObfuscatedName("ai")
	static char[] field4413;
	@ObfuscatedName("aj")
	static char[] field4411;
	@ObfuscatedName("ac")
	static char[] field4410;
	@ObfuscatedName("aw")
	static int[] field4412;

	static {
		field4413 = new char[64]; // L: 7

		int var0;
		for (var0 = 0; var0 < 26; ++var0) { // L: 8
			field4413[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 9
			field4413[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 10
			field4413[var0] = (char)(var0 + 48 - 52);
		}

		field4413[62] = '+'; // L: 11
		field4413[63] = '/'; // L: 12
		field4411 = new char[64]; // L: 18

		for (var0 = 0; var0 < 26; ++var0) { // L: 19
			field4411[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 20
			field4411[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 21
			field4411[var0] = (char)(var0 + 48 - 52);
		}

		field4411[62] = '*'; // L: 22
		field4411[63] = '-'; // L: 23
		field4410 = new char[64]; // L: 29

		for (var0 = 0; var0 < 26; ++var0) { // L: 30
			field4410[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 31
			field4410[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 32
			field4410[var0] = (char)(var0 + 48 - 52);
		}

		field4410[62] = '-'; // L: 33
		field4410[63] = '_'; // L: 34
		field4412 = new int[128]; // L: 40

		for (var0 = 0; var0 < field4412.length; ++var0) { // L: 41
			field4412[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) { // L: 42
			field4412[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) { // L: 43
			field4412[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) { // L: 44
			field4412[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4412; // L: 45
		field4412[43] = 62; // L: 46
		var2[42] = 62; // L: 47
		int[] var1 = field4412; // L: 48
		field4412[47] = 63; // L: 49
		var1[45] = 63; // L: 50
	} // L: 51

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lme;IIII)V",
		garbageValue = "-1763732175"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3705 == null) { // L: 1226
			throw new RuntimeException(); // L: 1227
		} else {
			var0.field3705[var1] = var2; // L: 1229
			var0.field3706[var1] = var3; // L: 1230
		}
	} // L: 1231
}
