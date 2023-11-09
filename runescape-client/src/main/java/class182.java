import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("he")
public class class182 {
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = 1447068489
	)
	static int field1891;
	@ObfuscatedName("av")
	public short[] field1890;
	@ObfuscatedName("as")
	public short[] field1888;

	class182(int var1) {
		ItemComposition var2 = class300.ItemComposition_get(var1); // L: 12
		if (var2.method3964()) { // L: 13
			this.field1890 = new short[var2.recolorTo.length]; // L: 14
			System.arraycopy(var2.recolorTo, 0, this.field1890, 0, this.field1890.length); // L: 15
		}

		if (var2.method4008()) { // L: 17
			this.field1888 = new short[var2.retextureTo.length]; // L: 18
			System.arraycopy(var2.retextureTo, 0, this.field1888, 0, this.field1888.length); // L: 19
		}

	} // L: 21
}
