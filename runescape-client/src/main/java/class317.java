import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ly")
public class class317 {
	@ObfuscatedName("i")
	static char[] field3854;
	@ObfuscatedName("w")
	static char[] field3852;
	@ObfuscatedName("s")
	static char[] field3851;
	@ObfuscatedName("a")
	static int[] field3853;

	static {
		field3854 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field3854[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3854[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3854[var0] = (char)(var0 + 48 - 52);
		}

		field3854[62] = '+';
		field3854[63] = '/';
		field3852 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field3852[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3852[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3852[var0] = (char)(var0 + 48 - 52);
		}

		field3852[62] = '*';
		field3852[63] = '-';
		field3851 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field3851[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3851[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3851[var0] = (char)(var0 + 48 - 52);
		}

		field3851[62] = '-';
		field3851[63] = '_';
		field3853 = new int[128];

		for (var0 = 0; var0 < field3853.length; ++var0) {
			field3853[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field3853[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field3853[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field3853[var0] = var0 - 48 + 52;
		}

		int[] var2 = field3853;
		field3853[43] = 62;
		var2[42] = 62;
		int[] var1 = field3853;
		field3853[47] = 63;
		var1[45] = 63;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1157640581"
	)
	public static int method5852(int var0, int var1) {
		int var2;
		for (var2 = 1; var1 > 1; var1 >>= 1) {
			if ((var1 & 1) != 0) {
				var2 = var0 * var2;
			}

			var0 *= var0;
		}

		if (var1 == 1) {
			return var0 * var2;
		} else {
			return var2;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(CLkz;I)C",
		garbageValue = "-307782821"
	)
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) {
			if (var0 >= 192 && var0 <= 198) {
				return 'A';
			}

			if (var0 == 199) {
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) {
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) {
				return 'I';
			}

			if (var0 == 209 && var1 != Language.Language_ES) {
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) {
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) {
				return 'U';
			}

			if (var0 == 221) {
				return 'Y';
			}

			if (var0 == 223) {
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) {
				return 'a';
			}

			if (var0 == 231) {
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) {
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) {
				return 'i';
			}

			if (var0 == 241 && var1 != Language.Language_ES) {
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) {
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) {
				return 'u';
			}

			if (var0 == 253 || var0 == 255) {
				return 'y';
			}
		}

		if (var0 == 338) {
			return 'O';
		} else if (var0 == 339) {
			return 'o';
		} else {
			return var0 == 376 ? 'Y' : var0;
		}
	}
}
