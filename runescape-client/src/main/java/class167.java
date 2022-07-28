import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public class class167 {
	@ObfuscatedName("f")
	public short[] field1802;
	@ObfuscatedName("u")
	public short[] field1805;

	public class167(int var1) {
		ItemComposition var2 = class258.ItemComposition_get(var1); // L: 12
		if (var2.method3716()) { // L: 13
			this.field1802 = new short[var2.recolorTo.length]; // L: 14
			System.arraycopy(var2.recolorTo, 0, this.field1802, 0, this.field1802.length); // L: 15
		}

		if (var2.method3731()) { // L: 17
			this.field1805 = new short[var2.retextureTo.length]; // L: 18
			System.arraycopy(var2.retextureTo, 0, this.field1805, 0, this.field1805.length); // L: 19
		}

	} // L: 21

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(CLlj;B)I",
		garbageValue = "37"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4; // L: 104
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) { // L: 105
			var0 = Character.toLowerCase(var0); // L: 106
			var2 = (var0 << 4) + 1; // L: 107
		}

		if (var0 == 241 && var1 == Language.Language_ES) { // L: 109
			var2 = 1762;
		}

		return var2; // L: 110
	}
}
