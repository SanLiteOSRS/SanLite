import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("pb")
public class class397 {
	@ObfuscatedName("at")
	static char[] field4458;
	@ObfuscatedName("ah")
	static char[] field4456;
	@ObfuscatedName("ar")
	static char[] field4457;
	@ObfuscatedName("ao")
	static int[] field4455;

	static {
		field4458 = new char[64]; // L: 7

		int var0;
		for (var0 = 0; var0 < 26; ++var0) { // L: 8
			field4458[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 9
			field4458[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 10
			field4458[var0] = (char)(var0 + 48 - 52);
		}

		field4458[62] = '+'; // L: 11
		field4458[63] = '/'; // L: 12
		field4456 = new char[64]; // L: 18

		for (var0 = 0; var0 < 26; ++var0) { // L: 19
			field4456[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 20
			field4456[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 21
			field4456[var0] = (char)(var0 + 48 - 52);
		}

		field4456[62] = '*'; // L: 22
		field4456[63] = '-'; // L: 23
		field4457 = new char[64]; // L: 29

		for (var0 = 0; var0 < 26; ++var0) { // L: 30
			field4457[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 31
			field4457[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 32
			field4457[var0] = (char)(var0 + 48 - 52);
		}

		field4457[62] = '-'; // L: 33
		field4457[63] = '_'; // L: 34
		field4455 = new int[128]; // L: 40

		for (var0 = 0; var0 < field4455.length; ++var0) { // L: 41
			field4455[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) { // L: 42
			field4455[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) { // L: 43
			field4455[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) { // L: 44
			field4455[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4455; // L: 45
		field4455[43] = 62; // L: 46
		var2[42] = 62; // L: 47
		int[] var1 = field4455; // L: 48
		field4455[47] = 63; // L: 49
		var1[45] = 63; // L: 50
	} // L: 51
}
