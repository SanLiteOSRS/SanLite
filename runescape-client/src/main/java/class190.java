import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
public class class190 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	static EvictingDualNodeHashTable field2011;

	static {
		field2011 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)I",
		garbageValue = "-105"
	)
	public static int method3772(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) { // L: 17
			int var6 = var3; // L: 18
			var3 = var4; // L: 19
			var4 = var6; // L: 20
		}

		var2 &= 3; // L: 22
		if (var2 == 0) { // L: 23
			return var0;
		} else if (var2 == 1) { // L: 24
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1); // L: 25 26
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1968515161"
	)
	public static void method3773() {
		ItemComposition.ItemComposition_cached.clear(); // L: 590
		ItemComposition.ItemComposition_cachedModels.clear(); // L: 591
		ItemComposition.ItemComposition_cachedSprites.clear(); // L: 592
	} // L: 593

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1019496566"
	)
	static final void method3774() {
		if (class125.pcmPlayer1 != null) { // L: 3758
			class125.pcmPlayer1.run();
		}

	} // L: 3759

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1572187025"
	)
	static final int method3768(int var0) {
		return Math.min(Math.max(var0, 128), 383); // L: 3944
	}
}
