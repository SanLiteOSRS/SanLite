import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("kw")
public class class303 {
	@ObfuscatedName("f")
	public static char[] field3747;
	@ObfuscatedName("e")
	static char[] field3745;
	@ObfuscatedName("v")
	static char[] field3748;
	@ObfuscatedName("y")
	static int[] field3746;

	static {
		field3747 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field3747[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3747[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3747[var0] = (char)(var0 + 48 - 52);
		}

		field3747[62] = '+';
		field3747[63] = '/';
		field3745 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field3745[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3745[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3745[var0] = (char)(var0 + 48 - 52);
		}

		field3745[62] = '*';
		field3745[63] = '-';
		field3748 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field3748[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3748[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3748[var0] = (char)(var0 + 48 - 52);
		}

		field3748[62] = '-';
		field3748[63] = '_';
		field3746 = new int[128];

		for (var0 = 0; var0 < field3746.length; ++var0) {
			field3746[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field3746[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field3746[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field3746[var0] = var0 - 48 + 52;
		}

		int[] var2 = field3746;
		field3746[43] = 62;
		var2[42] = 62;
		int[] var1 = field3746;
		field3746[47] = 63;
		var1[45] = 63;
	}
}
