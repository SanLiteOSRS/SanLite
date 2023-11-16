import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
public final class class355 {
	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1520986974"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0); // L: 11155

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) { // L: 11156
			var1 = var1.substring(0, var2) + "," + var1.substring(var2); // L: 11157
		}

		if (var1.length() > 9) { // L: 11159
			return " " + class167.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + class167.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + class167.colorStartTag(16776960) + var1 + "</col>"; // L: 11160 11161
		}
	}
}
