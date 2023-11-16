import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
public class class169 {
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1420775345
	)
	static int field1790;
	@ObfuscatedName("su")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("ar")
	public short[] field1792;
	@ObfuscatedName("ao")
	public short[] field1793;

	class169(int var1) {
		ItemComposition var2 = class214.ItemComposition_get(var1); // L: 12
		if (var2.method3965()) { // L: 13
			this.field1792 = new short[var2.recolorTo.length]; // L: 14
			System.arraycopy(var2.recolorTo, 0, this.field1792, 0, this.field1792.length); // L: 15
		}

		if (var2.method3952()) { // L: 17
			this.field1793 = new short[var2.retextureTo.length]; // L: 18
			System.arraycopy(var2.retextureTo, 0, this.field1793, 0, this.field1793.length); // L: 19
		}

	} // L: 21

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-19"
	)
	public static void method3518() {
		FileSystem.FileSystem_cacheFiles.clear(); // L: 46
	} // L: 47
}
