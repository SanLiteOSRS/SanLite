import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
public class class82 {
	@ObfuscatedName("di")
	@Export("mouseCam")
	static boolean mouseCam;

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "2142843749"
	)
	public static String method2229(String var0) {
		StringBuilder var1 = new StringBuilder(var0.length()); // L: 160
		int var2 = 0; // L: 161
		int var3 = -1; // L: 162

		for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 163
			char var5 = var0.charAt(var4); // L: 164
			if (var5 == '<') { // L: 165
				var1.append(var0.substring(var2, var4)); // L: 166
				var3 = var4; // L: 167
			} else if (var5 == '>' && var3 != -1) { // L: 170
				String var6 = var0.substring(var3 + 1, var4); // L: 171
				var3 = -1; // L: 172
				if (var6.equals("lt")) { // L: 173
					var1.append("<"); // L: 174
				} else if (var6.equals("gt")) { // L: 176
					var1.append(">"); // L: 177
				} else if (var6.equals("br")) { // L: 179
					var1.append("\n"); // L: 180
				}

				var2 = var4 + 1; // L: 182
			}
		}

		if (var2 < var0.length()) { // L: 185
			var1.append(var0.substring(var2, var0.length())); // L: 186
		}

		return var1.toString(); // L: 188
	}
}
