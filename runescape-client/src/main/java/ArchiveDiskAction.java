import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nx")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 65388251
	)
	@Export("type")
	int type;
	@ObfuscatedName("an")
	@Export("data")
	byte[] data;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("archive")
	Archive archive;

	ArchiveDiskAction() {
	} // L: 12

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2066808995"
	)
	static void method6660(int var0, int var1) {
		int[] var2 = new int[9]; // L: 1684

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 1685
			int var4 = var3 * 32 + 15 + 128; // L: 1686
			int var5 = var4 * 3 + 600; // L: 1689
			int var7 = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 1692
			int var6 = ItemLayer.method4224(var5, var1); // L: 1693
			var2[var3] = var7 * var6 >> 16; // L: 1694
		}

		Scene.Scene_buildVisiblityMap(var2, 500, 800, var0 * 334 / var1, 334); // L: 1696
	} // L: 1697
}
