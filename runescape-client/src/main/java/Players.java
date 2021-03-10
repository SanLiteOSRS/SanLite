import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("Players")
public class Players {
	@ObfuscatedName("d")
	static byte[] field1275;
	@ObfuscatedName("c")
	static byte[] field1274;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "[Lkx;"
	)
	static Buffer[] field1269;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 286612825
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("z")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1913130791
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("q")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("l")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("s")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("b")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 8929153
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("w")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lkx;"
	)
	static Buffer field1279;

	static {
		field1275 = new byte[2048];
		field1274 = new byte[2048];
		field1269 = new Buffer[2048];
		Players_count = 0;
		Players_indices = new int[2048];
		Players_emptyIdxCount = 0;
		Players_emptyIndices = new int[2048];
		Players_regions = new int[2048];
		Players_orientations = new int[2048];
		Players_targetIndices = new int[2048];
		Players_pendingUpdateCount = 0;
		Players_pendingUpdateIndices = new int[2048];
		field1279 = new Buffer(new byte[5000]);
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		signature = "(Lcv;I)V",
		garbageValue = "-202535471"
	)
	static final void method2286(Actor var0) {
		var0.isWalking = false;
		SequenceDefinition var1;
		if (var0.movementSequence != -1) {
			var1 = InterfaceParent.SequenceDefinition_get(var0.movementSequence);
			if (var1 != null && var1.frameIds != null) {
				++var0.movementFrameCycle;
				if (var0.movementFrame < var1.frameIds.length && var0.movementFrameCycle > var1.frameLengths[var0.movementFrame]) {
					var0.movementFrameCycle = 1;
					++var0.movementFrame;
					class169.method3637(var1, var0.movementFrame, var0.x, var0.y);
				}

				if (var0.movementFrame >= var1.frameIds.length) {
					var0.movementFrameCycle = 0;
					var0.movementFrame = 0;
					class169.method3637(var1, var0.movementFrame, var0.x, var0.y);
				}
			} else {
				var0.movementSequence = -1;
			}
		}

		if (var0.spotAnimation != -1 && Client.cycle >= var0.field993) {
			if (var0.spotAnimationFrame < 0) {
				var0.spotAnimationFrame = 0;
			}

			int var3 = AbstractUserComparator.SpotAnimationDefinition_get(var0.spotAnimation).sequence;
			if (var3 != -1) {
				SequenceDefinition var2 = InterfaceParent.SequenceDefinition_get(var3);
				if (var2 != null && var2.frameIds != null) {
					++var0.spotAnimationFrameCycle;
					if (var0.spotAnimationFrame < var2.frameIds.length && var0.spotAnimationFrameCycle > var2.frameLengths[var0.spotAnimationFrame]) {
						var0.spotAnimationFrameCycle = 1;
						++var0.spotAnimationFrame;
						class169.method3637(var2, var0.spotAnimationFrame, var0.x, var0.y);
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
			var1 = InterfaceParent.SequenceDefinition_get(var0.sequence);
			if (var1.field3564 == 1 && var0.field1012 > 0 && var0.field999 <= Client.cycle && var0.field1000 < Client.cycle) {
				var0.sequenceDelay = 1;
				return;
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) {
			var1 = InterfaceParent.SequenceDefinition_get(var0.sequence);
			if (var1 != null && var1.frameIds != null) {
				++var0.sequenceFrameCycle;
				if (var0.sequenceFrame < var1.frameIds.length && var0.sequenceFrameCycle > var1.frameLengths[var0.sequenceFrame]) {
					var0.sequenceFrameCycle = 1;
					++var0.sequenceFrame;
					class169.method3637(var1, var0.sequenceFrame, var0.x, var0.y);
				}

				if (var0.sequenceFrame >= var1.frameIds.length) {
					var0.sequenceFrame -= var1.frameCount;
					++var0.field973;
					if (var0.field973 >= var1.field3563) {
						var0.sequence = -1;
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var1.frameIds.length) {
						class169.method3637(var1, var0.sequenceFrame, var0.x, var0.y);
					} else {
						var0.sequence = -1;
					}
				}

				var0.isWalking = var1.field3559;
			} else {
				var0.sequence = -1;
			}
		}

		if (var0.sequenceDelay > 0) {
			--var0.sequenceDelay;
		}

	}
}
