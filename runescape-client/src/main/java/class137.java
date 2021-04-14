import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
public class class137 {
	@ObfuscatedName("u")
	@Export("directions")
	public static int[][] directions;
	@ObfuscatedName("p")
	@Export("distances")
	public static int[][] distances;
	@ObfuscatedName("g")
	@Export("bufferX")
	public static int[] bufferX;
	@ObfuscatedName("h")
	@Export("bufferY")
	public static int[] bufferY;

	static {
		directions = new int[128][128];
		distances = new int[128][128];
		bufferX = new int[4096];
		bufferY = new int[4096];
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "-2142993463"
	)
	public static int method2654(int var0, int var1) {
		return (var0 << 8) + var1;
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		signature = "(Lcd;II)V",
		garbageValue = "391699616"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		if (var0.field1255 >= Client.cycle) {
			class26.method367(var0);
		} else if (var0.field1268 >= Client.cycle) {
			WorldMapData_1.method2990(var0);
		} else {
			class22.method330(var0);
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field1255 = 0;
			var0.field1268 = 0;
			var0.x = var0.pathX[0] * 128 + var0.field1258 * 64;
			var0.y = var0.pathY[0] * 128 + var0.field1258 * 64;
			var0.method2157();
		}

		if (Varcs.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field1255 = 0;
			var0.field1268 = 0;
			var0.x = var0.pathX[0] * 128 + var0.field1258 * 64;
			var0.y = var0.pathY[0] * 128 + var0.field1258 * 64;
			var0.method2157();
		}

		int var5;
		if (var0.field1262 != 0) {
			if (var0.targetIndex != -1) {
				Object var2 = null;
				if (var0.targetIndex < 32768) {
					var2 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= 32768) {
					var2 = Client.players[var0.targetIndex - 32768];
				}

				if (var2 != null) {
					int var3 = var0.x - ((Actor)var2).x;
					int var4 = var0.y - ((Actor)var2).y;
					if (var3 != 0 || var4 != 0) {
						var0.orientation = (int)(Math.atan2((double)var3, (double)var4) * 325.949D) & 2047;
					}
				} else if (var0.false0) {
					var0.targetIndex = -1;
					var0.false0 = false;
				}
			}

			if (var0.field1237 != -1 && (var0.pathLength == 0 || var0.field1267 > 0)) {
				var0.orientation = var0.field1237;
				var0.field1237 = -1;
			}

			var5 = var0.orientation - var0.rotation & 2047;
			if (var5 == 0 && var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}

			if (var5 != 0) {
				++var0.field1261;
				boolean var8;
				if (var5 > 1024) {
					var0.rotation -= var0.field1262;
					var8 = true;
					if (var5 < var0.field1262 || var5 > 2048 - var0.field1262) {
						var0.rotation = var0.orientation;
						var8 = false;
					}

					if (var0.movementSequence == var0.readySequence && (var0.field1261 > 25 || var8)) {
						if (var0.turnLeftSequence != -1) {
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				} else {
					var0.rotation += var0.field1262;
					var8 = true;
					if (var5 < var0.field1262 || var5 > 2048 - var0.field1262) {
						var0.rotation = var0.orientation;
						var8 = false;
					}

					if (var0.movementSequence == var0.readySequence && (var0.field1261 > 25 || var8)) {
						if (var0.turnRightSequence != -1) {
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				}

				var0.rotation &= 2047;
			} else {
				var0.field1261 = 0;
			}
		}

		var0.isWalking = false;
		SequenceDefinition var7;
		if (var0.movementSequence != -1) {
			var7 = class225.SequenceDefinition_get(var0.movementSequence);
			if (var7 != null && var7.frameIds != null) {
				++var0.movementFrameCycle;
				if (var0.movementFrame < var7.frameIds.length && var0.movementFrameCycle > var7.frameLengths[var0.movementFrame]) {
					var0.movementFrameCycle = 1;
					++var0.movementFrame;
					class232.method4364(var7, var0.movementFrame, var0.x, var0.y);
				}

				if (var0.movementFrame >= var7.frameIds.length) {
					var0.movementFrameCycle = 0;
					var0.movementFrame = 0;
					class232.method4364(var7, var0.movementFrame, var0.x, var0.y);
				}
			} else {
				var0.movementSequence = -1;
			}
		}

		if (var0.spotAnimation != -1 && Client.cycle >= var0.field1249) {
			if (var0.spotAnimationFrame < 0) {
				var0.spotAnimationFrame = 0;
			}

			var5 = Varps.SpotAnimationDefinition_get(var0.spotAnimation).sequence;
			if (var5 != -1) {
				SequenceDefinition var6 = class225.SequenceDefinition_get(var5);
				if (var6 != null && var6.frameIds != null) {
					++var0.spotAnimationFrameCycle;
					if (var0.spotAnimationFrame < var6.frameIds.length && var0.spotAnimationFrameCycle > var6.frameLengths[var0.spotAnimationFrame]) {
						var0.spotAnimationFrameCycle = 1;
						++var0.spotAnimationFrame;
						class232.method4364(var6, var0.spotAnimationFrame, var0.x, var0.y);
					}

					if (var0.spotAnimationFrame >= var6.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var6.frameIds.length)) {
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
			var7 = class225.SequenceDefinition_get(var0.sequence);
			if (var7.field3722 == 1 && var0.field1224 > 0 && var0.field1255 <= Client.cycle && var0.field1268 < Client.cycle) {
				var0.sequenceDelay = 1;
				return;
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) {
			var7 = class225.SequenceDefinition_get(var0.sequence);
			if (var7 != null && var7.frameIds != null) {
				++var0.sequenceFrameCycle;
				if (var0.sequenceFrame < var7.frameIds.length && var0.sequenceFrameCycle > var7.frameLengths[var0.sequenceFrame]) {
					var0.sequenceFrameCycle = 1;
					++var0.sequenceFrame;
					class232.method4364(var7, var0.sequenceFrame, var0.x, var0.y);
				}

				if (var0.sequenceFrame >= var7.frameIds.length) {
					var0.sequenceFrame -= var7.frameCount;
					++var0.field1245;
					if (var0.field1245 >= var7.field3721) {
						var0.sequence = -1;
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var7.frameIds.length) {
						class232.method4364(var7, var0.sequenceFrame, var0.x, var0.y);
					} else {
						var0.sequence = -1;
					}
				}

				var0.isWalking = var7.field3712;
			} else {
				var0.sequence = -1;
			}
		}

		if (var0.sequenceDelay > 0) {
			--var0.sequenceDelay;
		}

	}
}
