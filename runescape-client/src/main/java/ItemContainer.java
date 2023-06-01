import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("an")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("ar")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32); // L: 7
	}

	ItemContainer() {
		this.ids = new int[]{-1}; // L: 8
		this.quantities = new int[]{0}; // L: 9
	} // L: 11

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhl;",
		garbageValue = "14"
	)
	public static VarcInt method2224(int var0) {
		VarcInt var1 = (VarcInt)VarcInt.VarcInt_cached.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = VarcInt.VarcInt_archive.takeFile(19, var0); // L: 23
			var1 = new VarcInt(); // L: 24
			if (var2 != null) { // L: 25
				var1.method3588(new Buffer(var2));
			}

			VarcInt.VarcInt_cached.put(var1, (long)var0); // L: 26
			return var1; // L: 27
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-327270791"
	)
	public static void method2222(int var0) {
		class304.musicPlayerStatus = 1; // L: 87
		HealthBar.musicTrackArchive = null; // L: 88
		class7.musicTrackGroupId = -1; // L: 89
		class438.musicTrackFileId = -1; // L: 90
		class178.musicTrackVolume = 0; // L: 91
		class404.musicTrackBoolean = false; // L: 92
		class128.pcmSampleLength = var0; // L: 93
	} // L: 94
}
