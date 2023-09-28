import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("po")
public class class400 {
	@ObfuscatedName("ac")
	static char[] field4477;
	@ObfuscatedName("al")
	static char[] field4476;
	@ObfuscatedName("ak")
	static char[] field4478;
	@ObfuscatedName("ax")
	static int[] field4479;

	static {
		field4477 = new char[64]; // L: 7

		int var0;
		for (var0 = 0; var0 < 26; ++var0) { // L: 8
			field4477[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 9
			field4477[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 10
			field4477[var0] = (char)(var0 + 48 - 52);
		}

		field4477[62] = '+'; // L: 11
		field4477[63] = '/'; // L: 12
		field4476 = new char[64]; // L: 18

		for (var0 = 0; var0 < 26; ++var0) { // L: 19
			field4476[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 20
			field4476[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 21
			field4476[var0] = (char)(var0 + 48 - 52);
		}

		field4476[62] = '*'; // L: 22
		field4476[63] = '-'; // L: 23
		field4478 = new char[64]; // L: 29

		for (var0 = 0; var0 < 26; ++var0) { // L: 30
			field4478[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 31
			field4478[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 32
			field4478[var0] = (char)(var0 + 48 - 52);
		}

		field4478[62] = '-'; // L: 33
		field4478[63] = '_'; // L: 34
		field4479 = new int[128]; // L: 40

		for (var0 = 0; var0 < field4479.length; ++var0) { // L: 41
			field4479[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) { // L: 42
			field4479[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) { // L: 43
			field4479[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) { // L: 44
			field4479[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4479; // L: 45
		field4479[43] = 62; // L: 46
		var2[42] = 62; // L: 47
		int[] var1 = field4479; // L: 48
		field4479[47] = 63; // L: 49
		var1[45] = 63; // L: 50
	} // L: 51
}
