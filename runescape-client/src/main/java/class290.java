import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("la")
public class class290 {
	@ObfuscatedName("tv")
	@ObfuscatedSignature(
		descriptor = "Lbi;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)Ljava/lang/String;",
		garbageValue = "-6836"
	)
	public static String method5660(String var0) {
		int var1 = var0.length(); // L: 162
		char[] var2 = new char[var1]; // L: 163
		byte var3 = 2; // L: 164

		for (int var4 = 0; var4 < var1; ++var4) { // L: 165
			char var5 = var0.charAt(var4); // L: 166
			if (var3 == 0) { // L: 167
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) { // L: 168
				char var6;
				if (var5 != 181 && var5 != 402) { // L: 171
					var6 = Character.toTitleCase(var5); // L: 175
				} else {
					var6 = var5; // L: 172
				}

				var5 = var6; // L: 177
			}

			if (Character.isLetter(var5)) {
				var3 = 0; // L: 179
			} else if (var5 != '.' && var5 != '?' && var5 != '!') { // L: 180
				if (Character.isSpaceChar(var5)) { // L: 181
					if (var3 != 2) {
						var3 = 1;
					}
				} else {
					var3 = 1; // L: 184
				}
			} else {
				var3 = 2; // L: 182
			}

			var2[var4] = var5; // L: 185
		}

		return new String(var2); // L: 187
	}
}
