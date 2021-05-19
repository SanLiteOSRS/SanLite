import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ea")
public class class135 {
	@ObfuscatedName("tl")
	@ObfuscatedGetter(
		intValue = -980191255
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("o")
	public short[] field1527;
	@ObfuscatedName("g")
	public short[] field1531;

	class135(int var1) {
		ItemComposition var2 = Strings.ItemDefinition_get(var1);
		if (var2.method2964()) {
			this.field1527 = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.field1527, 0, this.field1527.length);
		}

		if (var2.method2965()) {
			this.field1531 = new short[var2.retextureTo.length];
			System.arraycopy(var2.retextureTo, 0, this.field1531, 0, this.field1531.length);
		}

	}
}
