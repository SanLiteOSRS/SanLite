import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("t")
public class class6 extends class14 {
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1741203959
	)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;
	@ObfuscatedName("mh")
	@ObfuscatedGetter(
		intValue = -699595077
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 896931621
	)
	int field52;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1534263289
	)
	int field56;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lo;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lo;)V"
	)
	class6(class2 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "110401227"
	)
	void vmethod339(Buffer var1) {
		this.field52 = var1.readInt();
		this.field56 = var1.readInt();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lx;I)V",
		garbageValue = "-1535989118"
	)
	void vmethod338(class11 var1) {
		var1.method126(this.field52, this.field56);
	}

	@ObfuscatedName("t")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L);
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(Lcj;B)V",
		garbageValue = "-122"
	)
	static final void method71(Actor var0) {
		var0.isWalking = false;
		SequenceDefinition var1;
		if (var0.movementSequence != -1) {
			var1 = Player.SequenceDefinition_get(var0.movementSequence);
			if (var1 != null && var1.frameIds != null) {
				++var0.movementFrameCycle;
				if (var0.movementFrame < var1.frameIds.length && var0.movementFrameCycle > var1.frameLengths[var0.movementFrame]) {
					var0.movementFrameCycle = 1;
					++var0.movementFrame;
					WorldMapManager.method3425(var1, var0.movementFrame, var0.x, var0.y);
				}

				if (var0.movementFrame >= var1.frameIds.length) {
					var0.movementFrameCycle = 0;
					var0.movementFrame = 0;
					WorldMapManager.method3425(var1, var0.movementFrame, var0.x, var0.y);
				}
			} else {
				var0.movementSequence = -1;
			}
		}

		if (var0.spotAnimation != -1 && Client.cycle >= var0.field1243) {
			if (var0.spotAnimationFrame < 0) {
				var0.spotAnimationFrame = 0;
			}

			int var3 = Friend.SpotAnimationDefinition_get(var0.spotAnimation).sequence;
			if (var3 != -1) {
				SequenceDefinition var2 = Player.SequenceDefinition_get(var3);
				if (var2 != null && var2.frameIds != null) {
					++var0.spotAnimationFrameCycle;
					if (var0.spotAnimationFrame < var2.frameIds.length && var0.spotAnimationFrameCycle > var2.frameLengths[var0.spotAnimationFrame]) {
						var0.spotAnimationFrameCycle = 1;
						++var0.spotAnimationFrame;
						WorldMapManager.method3425(var2, var0.spotAnimationFrame, var0.x, var0.y);
					}

					if (var0.spotAnimationFrame >= var2.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var2.frameIds.length)) {
						var0.spotAnimation = -1;
					}
				} else {
					var0.spotAnimation = -1;
				}
			} else {
				var0.spotAnimation = -1;
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay <= 1) {
			var1 = Player.SequenceDefinition_get(var0.sequence);
			if (var1.field1886 == 1 && var0.field1215 > 0 && var0.field1254 <= Client.cycle && var0.field1237 < Client.cycle) {
				var0.sequenceDelay = 1;
				return;
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) {
			var1 = Player.SequenceDefinition_get(var0.sequence);
			if (var1 != null && var1.frameIds != null) {
				++var0.sequenceFrameCycle;
				if (var0.sequenceFrame < var1.frameIds.length && var0.sequenceFrameCycle > var1.frameLengths[var0.sequenceFrame]) {
					var0.sequenceFrameCycle = 1;
					++var0.sequenceFrame;
					WorldMapManager.method3425(var1, var0.sequenceFrame, var0.x, var0.y);
				}

				if (var0.sequenceFrame >= var1.frameIds.length) {
					var0.sequenceFrame -= var1.frameCount;
					++var0.field1244;
					if (var0.field1244 >= var1.field1897) {
						var0.sequence = -1;
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var1.frameIds.length) {
						WorldMapManager.method3425(var1, var0.sequenceFrame, var0.x, var0.y);
					} else {
						var0.sequence = -1;
					}
				}

				var0.isWalking = var1.field1898;
			} else {
				var0.sequence = -1;
			}
		}

		if (var0.sequenceDelay > 0) {
			--var0.sequenceDelay;
		}

	}
}
