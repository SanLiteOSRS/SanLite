import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("mr")
public class class363 {
	@ObfuscatedName("f")
	public static char[] field4363;
	@ObfuscatedName("w")
	static char[] field4364;
	@ObfuscatedName("v")
	static char[] field4367;
	@ObfuscatedName("s")
	static int[] field4362;

	static {
		field4363 = new char[64]; // L: 7

		int var0;
		for (var0 = 0; var0 < 26; ++var0) { // L: 8
			field4363[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 9
			field4363[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 10
			field4363[var0] = (char)(var0 + 48 - 52);
		}

		field4363[62] = '+'; // L: 11
		field4363[63] = '/'; // L: 12
		field4364 = new char[64]; // L: 18

		for (var0 = 0; var0 < 26; ++var0) { // L: 19
			field4364[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 20
			field4364[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 21
			field4364[var0] = (char)(var0 + 48 - 52);
		}

		field4364[62] = '*'; // L: 22
		field4364[63] = '-'; // L: 23
		field4367 = new char[64]; // L: 29

		for (var0 = 0; var0 < 26; ++var0) { // L: 30
			field4367[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 31
			field4367[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 32
			field4367[var0] = (char)(var0 + 48 - 52);
		}

		field4367[62] = '-'; // L: 33
		field4367[63] = '_'; // L: 34
		field4362 = new int[128]; // L: 40

		for (var0 = 0; var0 < field4362.length; ++var0) { // L: 41
			field4362[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) { // L: 42
			field4362[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) { // L: 43
			field4362[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) { // L: 44
			field4362[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4362; // L: 45
		field4362[43] = 62; // L: 46
		var2[42] = 62; // L: 47
		int[] var1 = field4362; // L: 48
		field4362[47] = 63; // L: 49
		var1[45] = 63; // L: 50
	} // L: 51
}
