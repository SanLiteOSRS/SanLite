import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mi")
public class class342 {
	@ObfuscatedName("o")
	static char[] field4169;
	@ObfuscatedName("q")
	static char[] field4166;
	@ObfuscatedName("f")
	static char[] field4167;
	@ObfuscatedName("u")
	static int[] field4168;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	static IndexedSprite field4165;
	@ObfuscatedName("x")
	public static boolean field4171;

	static {
		field4169 = new char[64]; // L: 7

		int var0;
		for (var0 = 0; var0 < 26; ++var0) { // L: 8
			field4169[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 9
			field4169[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 10
			field4169[var0] = (char)(var0 + 48 - 52);
		}

		field4169[62] = '+';
		field4169[63] = '/';
		field4166 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4166[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4166[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4166[var0] = (char)(var0 + 48 - 52);
		}

		field4166[62] = '*';
		field4166[63] = '-';
		field4167 = new char[64]; // L: 29

		for (var0 = 0; var0 < 26; ++var0) { // L: 30
			field4167[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 31
			field4167[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 32
			field4167[var0] = (char)(var0 + 48 - 52);
		}

		field4167[62] = '-'; // L: 33
		field4167[63] = '_'; // L: 34
		field4168 = new int[128]; // L: 40

		for (var0 = 0; var0 < field4168.length; ++var0) { // L: 41
			field4168[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) { // L: 42
			field4168[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) { // L: 43
			field4168[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) { // L: 44
			field4168[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4168; // L: 45
		field4168[43] = 62; // L: 46
		var2[42] = 62; // L: 47
		int[] var1 = field4168; // L: 48
		field4168[47] = 63; // L: 49
		var1[45] = 63; // L: 50
	} // L: 51

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "576354890"
	)
	public static String method6309(CharSequence var0) {
		int var1 = var0.length(); // L: 11
		StringBuilder var2 = new StringBuilder(var1); // L: 12

		for (int var3 = 0; var3 < var1; ++var3) { // L: 13
			char var4 = var0.charAt(var3); // L: 14
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') { // L: 15
				if (var4 == ' ') { // L: 16
					var2.append('+');
				} else {
					byte var5 = Calendar.charToByteCp1252(var4); // L: 18
					var2.append('%'); // L: 19
					int var6 = var5 >> 4 & 15; // L: 20
					if (var6 >= 10) { // L: 21
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48)); // L: 22
					}

					var6 = var5 & 15; // L: 23
					if (var6 >= 10) { // L: 24
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48)); // L: 25
					}
				}
			} else {
				var2.append(var4);
			}
		}

		return var2.toString(); // L: 28
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Llc;Ljava/lang/String;Ljava/lang/String;B)[Lql;",
		garbageValue = "6"
	)
	public static IndexedSprite[] method6304(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1); // L: 68
		int var4 = var0.getFileId(var3, var2); // L: 69
		byte[] var7 = var0.takeFile(var3, var4); // L: 74
		boolean var6;
		if (var7 == null) { // L: 75
			var6 = false; // L: 76
		} else {
			class83.SpriteBuffer_decode(var7); // L: 79
			var6 = true; // L: 80
		}

		IndexedSprite[] var5;
		if (!var6) { // L: 82
			var5 = null; // L: 83
		} else {
			var5 = class389.method7083(); // L: 86
		}

		return var5; // L: 88
	}
}
