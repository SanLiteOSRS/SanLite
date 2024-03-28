import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
@Implements("GroundObject")
public final class GroundObject {
	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	static SpritePixels field2556;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 334123469
	)
	@Export("z")
	int z;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 2007569035
	)
	@Export("x")
	int x;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1499379891
	)
	@Export("y")
	int y;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = 9050821616856748983L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -362934189
	)
	@Export("flags")
	int flags;

	GroundObject() {
	} // L: 11

	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-1438496947"
	)
	static final void method4550(Widget var0) {
		int var1 = var0.contentType; // L: 12490
		if (var1 == 324) { // L: 12491
			if (Client.field799 == -1) { // L: 12492
				Client.field799 = var0.spriteId2; // L: 12493
				Client.field800 = var0.spriteId; // L: 12494
			}

			if (Client.playerAppearance.field3686 == 1) { // L: 12496
				var0.spriteId2 = Client.field799;
			} else {
				var0.spriteId2 = Client.field800; // L: 12497
			}

		} else if (var1 == 325) { // L: 12500
			if (Client.field799 == -1) { // L: 12501
				Client.field799 = var0.spriteId2; // L: 12502
				Client.field800 = var0.spriteId; // L: 12503
			}

			if (Client.playerAppearance.field3686 == 1) { // L: 12505
				var0.spriteId2 = Client.field800;
			} else {
				var0.spriteId2 = Client.field799; // L: 12506
			}

		} else if (var1 == 327) { // L: 12509
			var0.modelAngleX = 150; // L: 12510
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 12511
			var0.modelType = 5; // L: 12512
			var0.modelId = 0; // L: 12513
		} else if (var1 == 328) { // L: 12516
			var0.modelAngleX = 150; // L: 12517
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 12518
			var0.modelType = 5; // L: 12519
			var0.modelId = 1; // L: 12520
		}
	} // L: 12498 12507 12514 12521 12523
}
