import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("kr")
public class class299 {
	@ObfuscatedName("m")
	public static char[] field3677;
	@ObfuscatedName("o")
	static char[] field3674;
	@ObfuscatedName("q")
	static char[] field3675;
	@ObfuscatedName("j")
	static int[] field3673;

	static {
		field3677 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field3677[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3677[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3677[var0] = (char)(var0 + 48 - 52);
		}

		field3677[62] = '+';
		field3677[63] = '/';
		field3674 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field3674[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3674[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3674[var0] = (char)(var0 + 48 - 52);
		}

		field3674[62] = '*';
		field3674[63] = '-';
		field3675 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field3675[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3675[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3675[var0] = (char)(var0 + 48 - 52);
		}

		field3675[62] = '-';
		field3675[63] = '_';
		field3673 = new int[128];

		for (var0 = 0; var0 < field3673.length; ++var0) {
			field3673[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field3673[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field3673[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field3673[var0] = var0 - 48 + 52;
		}

		int[] var2 = field3673;
		field3673[43] = 62;
		var2[42] = 62;
		int[] var1 = field3673;
		field3673[47] = 63;
		var1[45] = 63;
	}
}
