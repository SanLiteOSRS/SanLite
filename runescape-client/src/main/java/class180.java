import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
public class class180 {
	@ObfuscatedName("sc")
	static boolean field1875;
	@ObfuscatedName("ac")
	public short[] field1871;
	@ObfuscatedName("ab")
	public short[] field1872;

	class180(int var1) {
		ItemComposition var2 = ParamComposition.ItemComposition_get(var1); // L: 12
		if (var2.method3983()) { // L: 13
			this.field1871 = new short[var2.recolorTo.length]; // L: 14
			System.arraycopy(var2.recolorTo, 0, this.field1871, 0, this.field1871.length); // L: 15
		}

		if (var2.method3926()) { // L: 17
			this.field1872 = new short[var2.retextureTo.length]; // L: 18
			System.arraycopy(var2.retextureTo, 0, this.field1872, 0, this.field1872.length); // L: 19
		}

	} // L: 21

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lne;I)V",
		garbageValue = "-1529721231"
	)
	public static void method3538(AbstractArchive var0) {
		EnumComposition.EnumDefinition_archive = var0; // L: 25
	} // L: 26
}
