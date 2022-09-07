import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
public abstract class class144 extends Node {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1519113599
	)
	@Export("ItemComposition_fileCount")
	public static int ItemComposition_fileCount;

	class144() {
	} // L: 49

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "1539485988"
	)
	abstract void vmethod3074(Buffer var1);

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lec;I)V",
		garbageValue = "-1270425284"
	)
	abstract void vmethod3073(ClanChannel var1);

	@ObfuscatedName("s")
	public static final void method3006(long var0) {
		if (var0 > 0L) { // L: 9
			if (var0 % 10L == 0L) { // L: 10
				class422.method7384(var0 - 1L); // L: 11
				class422.method7384(1L); // L: 12
			} else {
				class422.method7384(var0); // L: 14
			}

		}
	} // L: 15

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "419995164"
	)
	static void method3011() {
		Tiles.Tiles_underlays = null; // L: 64
		Tiles.Tiles_overlays = null; // L: 65
		AbstractUserComparator.Tiles_shapes = null; // L: 66
		GrandExchangeOfferOwnWorldComparator.field473 = null; // L: 67
		class17.field92 = null; // L: 68
		Tiles.field975 = null; // L: 69
		class135.field1587 = null; // L: 70
		class121.Tiles_hue = null; // L: 71
		Login.Tiles_saturation = null; // L: 72
		GrandExchangeEvents.Tiles_lightness = null; // L: 73
		PcmPlayer.Tiles_hueMultiplier = null; // L: 74
		FaceNormal.field2453 = null; // L: 75
	} // L: 76

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "28"
	)
	static void method3010() {
		Login.worldSelectOpen = false; // L: 1896
		class10.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1897
		Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1898
		MusicPatchPcmStream.logoSprite.drawAt(Login.xPadding + 382 - MusicPatchPcmStream.logoSprite.subWidth / 2, 18); // L: 1899
	} // L: 1900
}
