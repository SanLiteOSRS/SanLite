import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
public class class191 {
	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	static Archive field1970;

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-411156376"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0); // L: 11102

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) { // L: 11103
			var1 = var1.substring(0, var2) + "," + var1.substring(var2); // L: 11104
		}

		if (var1.length() > 9) { // L: 11106
			return " " + MusicPatchPcmStream.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + MusicPatchPcmStream.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + MusicPatchPcmStream.colorStartTag(16776960) + var1 + "</col>"; // L: 11107 11108
		}
	}
}
