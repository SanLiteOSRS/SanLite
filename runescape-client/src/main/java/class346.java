import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
public class class346 {
	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1225846728"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0); // L: 11027

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) { // L: 11028
			var1 = var1.substring(0, var2) + "," + var1.substring(var2); // L: 11029
		}

		if (var1.length() > 9) { // L: 11031
			return " " + class349.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + class349.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + class349.colorStartTag(16776960) + var1 + "</col>"; // L: 11032 11033
		}
	}
}
