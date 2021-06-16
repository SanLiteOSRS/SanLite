import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("f")
public class class0 extends class14 {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 566766495
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1559337791
	)
	static int field2;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 469754669
	)
	int field3;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		longValue = -494167787820068405L
	)
	long field0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lv;)V"
	)
	class0(class2 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "73833784"
	)
	void vmethod363(Buffer var1) {
		this.field3 = var1.readInt();
		this.field0 = var1.readLong();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lb;I)V",
		garbageValue = "1885623446"
	)
	void vmethod354(ClanSettings var1) {
		var1.method137(this.field3, this.field0);
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(Lcl;B)V",
		garbageValue = "-91"
	)
	static final void method11(Actor var0) {
		var0.isWalking = false;
		SequenceDefinition var1;
		if (var0.movementSequence != -1) {
			var1 = WorldMapScaleHandler.SequenceDefinition_get(var0.movementSequence);
			if (var1 != null && var1.frameIds != null) {
				++var0.movementFrameCycle;
				if (var0.movementFrame < var1.frameIds.length && var0.movementFrameCycle > var1.frameLengths[var0.movementFrame]) {
					var0.movementFrameCycle = 1;
					++var0.movementFrame;
					Buddy.method5896(var1, var0.movementFrame, var0.x, var0.y);
				}

				if (var0.movementFrame >= var1.frameIds.length) {
					var0.movementFrameCycle = 0;
					var0.movementFrame = 0;
					Buddy.method5896(var1, var0.movementFrame, var0.x, var0.y);
				}
			} else {
				var0.movementSequence = -1;
			}
		}

		if (var0.spotAnimation != -1 && Client.cycle >= var0.field1262) {
			if (var0.spotAnimationFrame < 0) {
				var0.spotAnimationFrame = 0;
			}

			int var3 = Tiles.SpotAnimationDefinition_get(var0.spotAnimation).sequence;
			if (var3 != -1) {
				SequenceDefinition var2 = WorldMapScaleHandler.SequenceDefinition_get(var3);
				if (var2 != null && var2.frameIds != null) {
					++var0.spotAnimationFrameCycle;
					if (var0.spotAnimationFrame < var2.frameIds.length && var0.spotAnimationFrameCycle > var2.frameLengths[var0.spotAnimationFrame]) {
						var0.spotAnimationFrameCycle = 1;
						++var0.spotAnimationFrame;
						Buddy.method5896(var2, var0.spotAnimationFrame, var0.x, var0.y);
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
			var1 = WorldMapScaleHandler.SequenceDefinition_get(var0.sequence);
			if (var1.field1895 == 1 && var0.field1281 > 0 && var0.field1276 <= Client.cycle && var0.field1269 < Client.cycle) {
				var0.sequenceDelay = 1;
				return;
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) {
			var1 = WorldMapScaleHandler.SequenceDefinition_get(var0.sequence);
			if (var1 != null && var1.frameIds != null) {
				++var0.sequenceFrameCycle;
				if (var0.sequenceFrame < var1.frameIds.length && var0.sequenceFrameCycle > var1.frameLengths[var0.sequenceFrame]) {
					var0.sequenceFrameCycle = 1;
					++var0.sequenceFrame;
					Buddy.method5896(var1, var0.sequenceFrame, var0.x, var0.y);
				}

				if (var0.sequenceFrame >= var1.frameIds.length) {
					var0.sequenceFrame -= var1.frameCount;
					++var0.field1258;
					if (var0.field1258 >= var1.field1896) {
						var0.sequence = -1;
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var1.frameIds.length) {
						Buddy.method5896(var1, var0.sequenceFrame, var0.x, var0.y);
					} else {
						var0.sequence = -1;
					}
				}

				var0.isWalking = var1.field1888;
			} else {
				var0.sequence = -1;
			}
		}

		if (var0.sequenceDelay > 0) {
			--var0.sequenceDelay;
		}

	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1925251884"
	)
	static String method1(int var0) {
		if (var0 < 0) {
			return "";
		} else {
			return Client.menuTargets[var0].length() > 0 ? Client.menuActions[var0] + " " + Client.menuTargets[var0] : Client.menuActions[var0];
		}
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "935953368"
	)
	static final void method0(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != class4.clientPreferences.musicVolume) {
			if (class4.clientPreferences.musicVolume == 0 && Client.currentTrackGroupId != -1) {
				class105.method2357(DynamicObject.archive6, Client.currentTrackGroupId, 0, var0, false);
				Client.field862 = false;
			} else if (var0 == 0) {
				Decimator.method1169();
				Client.field862 = false;
			} else if (class233.musicPlayerStatus != 0) {
				class233.musicTrackVolume = var0;
			} else {
				class233.midiPcmStream.setPcmStreamVolume(var0);
			}

			class4.clientPreferences.musicVolume = var0;
			Actor.savePreferences();
		}

	}
}
