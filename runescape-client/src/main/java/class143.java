import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
public abstract class class143 extends Node {
	class143() {
	} // L: 68

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)V",
		garbageValue = "1"
	)
	abstract void vmethod3345(Buffer var1);

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfb;I)V",
		garbageValue = "-621392079"
	)
	abstract void vmethod3346(ClanSettings var1);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lal;B)Lab;",
		garbageValue = "17"
	)
	public static class3 method3109(class6 var0) {
		switch(var0.field16) { // L: 9
		case 0:
			return new class0(); // L: 16
		default:
			throw new IllegalArgumentException(); // L: 12
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1258650141"
	)
	public static int method3103(int var0, int var1, int var2) {
		int var3 = WorldMapElement.method3585(var2 - var1 + 1); // L: 53
		var3 <<= var1; // L: 54
		return var0 & ~var3; // L: 55
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-970039818"
	)
	public static void method3110() {
		ItemComposition.ItemComposition_cached.clear(); // L: 588
		ItemComposition.ItemComposition_cachedModels.clear(); // L: 589
		ItemComposition.ItemComposition_cachedSprites.clear(); // L: 590
	} // L: 591

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-450556018"
	)
	static void method3111(int var0, int var1) {
		if (WorldMapManager.clientPreferences.method2440() != 0 && var0 != -1) { // L: 3743
			Archive var2 = class10.field45; // L: 3744
			int var3 = WorldMapManager.clientPreferences.method2440(); // L: 3745
			class304.musicPlayerStatus = 1; // L: 3747
			HealthBar.musicTrackArchive = var2; // L: 3748
			class7.musicTrackGroupId = var0; // L: 3749
			class438.musicTrackFileId = 0; // L: 3750
			class178.musicTrackVolume = var3; // L: 3751
			class404.musicTrackBoolean = false; // L: 3752
			class128.pcmSampleLength = 10000; // L: 3753
			Client.playingJingle = true; // L: 3755
		}

	} // L: 3757
}
