import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nn")
public class class343 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	static final class343 field3838;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	static final class343 field3837;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 423459241
	)
	final int field3836;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1829805797
	)
	final int field3839;

	static {
		field3838 = new class343(51, 27, 800, 0, 16, 16); // L: 29
		field3837 = new class343(25, 28, 800, 656, 40, 40); // L: 30
	}

	class343(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field3836 = var5;
		this.field3839 = var6;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-19"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var2 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 26
		VarbitComposition var1;
		if (var2 != null) { // L: 27
			var1 = var2; // L: 28
		} else {
			byte[] var3 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0); // L: 31
			var2 = new VarbitComposition(); // L: 32
			if (var3 != null) { // L: 33
				var2.decode(new Buffer(var3));
			}

			VarbitComposition.VarbitDefinition_cached.put(var2, (long)var0); // L: 34
			var1 = var2; // L: 35
		}

		int var7 = var1.baseVar; // L: 38
		int var4 = var1.startBit; // L: 39
		int var5 = var1.endBit; // L: 40
		int var6 = Varps.Varps_masks[var5 - var4]; // L: 41
		return Varps.Varps_main[var7] >> var4 & var6; // L: 42
	}
}
