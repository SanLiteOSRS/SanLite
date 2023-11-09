import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
public class class183 {
	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;
	@ObfuscatedName("ar")
	public short[] field1898;
	@ObfuscatedName("ab")
	public short[] field1902;

	public class183(int var1) {
		ItemComposition var2 = class230.ItemComposition_get(var1); // L: 12
		if (var2.method3955()) { // L: 13
			this.field1898 = new short[var2.recolorTo.length]; // L: 14
			System.arraycopy(var2.recolorTo, 0, this.field1898, 0, this.field1898.length); // L: 15
		}

		if (var2.method3971()) { // L: 17
			this.field1902 = new short[var2.retextureTo.length]; // L: 18
			System.arraycopy(var2.retextureTo, 0, this.field1902, 0, this.field1902.length); // L: 19
		}

	} // L: 21
}
