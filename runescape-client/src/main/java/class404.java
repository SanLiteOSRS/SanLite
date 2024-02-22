import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("px")
public class class404 {
	@ObfuscatedName("aq")
	static char[] field4534;
	@ObfuscatedName("aw")
	static char[] field4536;
	@ObfuscatedName("al")
	static char[] field4535;
	@ObfuscatedName("ai")
	static int[] field4537;

	static {
		field4534 = new char[64]; // L: 7

		int var0;
		for (var0 = 0; var0 < 26; ++var0) { // L: 8
			field4534[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 9
			field4534[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 10
			field4534[var0] = (char)(var0 + 48 - 52);
		}

		field4534[62] = '+'; // L: 11
		field4534[63] = '/'; // L: 12
		field4536 = new char[64]; // L: 18

		for (var0 = 0; var0 < 26; ++var0) { // L: 19
			field4536[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 20
			field4536[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 21
			field4536[var0] = (char)(var0 + 48 - 52);
		}

		field4536[62] = '*'; // L: 22
		field4536[63] = '-'; // L: 23
		field4535 = new char[64]; // L: 29

		for (var0 = 0; var0 < 26; ++var0) { // L: 30
			field4535[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 31
			field4535[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 32
			field4535[var0] = (char)(var0 + 48 - 52);
		}

		field4535[62] = '-'; // L: 33
		field4535[63] = '_'; // L: 34
		field4537 = new int[128]; // L: 40

		for (var0 = 0; var0 < field4537.length; ++var0) { // L: 41
			field4537[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) { // L: 42
			field4537[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) { // L: 43
			field4537[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) { // L: 44
			field4537[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4537; // L: 45
		field4537[43] = 62; // L: 46
		var2[42] = 62; // L: 47
		int[] var1 = field4537; // L: 48
		field4537[47] = 63; // L: 49
		var1[45] = 63; // L: 50
	} // L: 51
}
