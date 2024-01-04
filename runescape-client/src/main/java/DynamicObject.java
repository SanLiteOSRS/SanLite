import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 397033549
	)
	@Export("id")
	int id;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 907568557
	)
	@Export("type")
	int type;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1972714689
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1138644923
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -267615049
	)
	@Export("x")
	int x;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1043709331
	)
	@Export("y")
	int y;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2062693637
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1708122471
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZLkt;)V"
	)
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
		this.id = var1; // L: 20
		this.type = var2; // L: 21
		this.orientation = var3; // L: 22
		this.plane = var4; // L: 23
		this.x = var5; // L: 24
		this.y = var6; // L: 25
		if (var7 != -1) { // L: 26
			this.sequenceDefinition = SequenceDefinition_get(var7); // L: 27
			this.frame = 0; // L: 28
			this.cycleStart = Client.cycle - 1; // L: 29
			if (this.sequenceDefinition.field2230 == 0 && var9 != null && var9 instanceof DynamicObject) { // L: 30
				DynamicObject var10 = (DynamicObject)var9; // L: 31
				if (var10.sequenceDefinition == this.sequenceDefinition) { // L: 32
					this.frame = var10.frame; // L: 33
					this.cycleStart = var10.cycleStart; // L: 34
					return; // L: 35
				}
			}

			if (var8 && this.sequenceDefinition.frameCount != -1) { // L: 38
				if (!this.sequenceDefinition.isCachedModelIdSet()) { // L: 39
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length); // L: 40
					this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]); // L: 41
				} else {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.method4064()); // L: 44
				}
			}
		}

	} // L: 48

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Lka;",
		garbageValue = "1"
	)
	@Export("getModel")
	protected final Model getModel() {
		int var2;
		if (this.sequenceDefinition != null) {
			int var1 = Client.cycle - this.cycleStart;
			if (var1 > 100 && this.sequenceDefinition.frameCount > 0) {
				var1 = 100;
			}

			if (this.sequenceDefinition.isCachedModelIdSet()) { // L: 54
				var2 = this.sequenceDefinition.method4064(); // L: 68
				this.frame += var1; // L: 69
				var1 = 0; // L: 70
				if (this.frame >= var2) { // L: 71
					this.frame = var2 - this.sequenceDefinition.frameCount; // L: 72
					if (this.frame < 0 || this.frame > var2) { // L: 73
						this.sequenceDefinition = null; // L: 74
					}
				}
			} else {
				label80: {
					do {
						do {
							if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) {
								break label80;
							}

							var1 -= this.sequenceDefinition.frameLengths[this.frame];
							++this.frame;
						} while(this.frame < this.sequenceDefinition.frameIds.length);

						this.frame -= this.sequenceDefinition.frameCount; // L: 59
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

					this.sequenceDefinition = null;
				}
			}

			this.cycleStart = Client.cycle - var1; // L: 78
		}

		ObjectComposition var12 = WorldMapSection2.getObjectDefinition(this.id); // L: 80
		if (var12.transforms != null) { // L: 81
			var12 = var12.transform();
		}

		if (var12 == null) { // L: 82
			return null;
		} else {
			int var3;
			if (this.orientation != 1 && this.orientation != 3) { // L: 85
				var2 = var12.sizeX; // L: 90
				var3 = var12.sizeY; // L: 91
			} else {
				var2 = var12.sizeY; // L: 86
				var3 = var12.sizeX; // L: 87
			}

			int var4 = (var2 >> 1) + this.x; // L: 93
			int var5 = (var2 + 1 >> 1) + this.x; // L: 94
			int var6 = (var3 >> 1) + this.y; // L: 95
			int var7 = (var3 + 1 >> 1) + this.y; // L: 96
			int[][] var8 = Tiles.Tiles_heights[this.plane]; // L: 97
			int var9 = var8[var5][var7] + var8[var5][var6] + var8[var4][var6] + var8[var4][var7] >> 2; // L: 98
			int var10 = (this.x << 7) + (var2 << 6); // L: 99
			int var11 = (this.y << 7) + (var3 << 6); // L: 100
			return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame); // L: 101
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lhx;",
		garbageValue = "-1047374686"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0); // L: 51
		if (var1 != null) { // L: 52
			return var1; // L: 53
		} else {
			byte[] var2 = class369.SequenceDefinition_archive.takeFile(12, var0); // L: 55
			var1 = new SequenceDefinition(); // L: 56
			if (var2 != null) { // L: 57
				var1.decode(new Buffer(var2)); // L: 58
			}

			var1.postDecode(); // L: 60
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0); // L: 61
			return var1; // L: 62
		}
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(Lhx;IIILdf;I)V",
		garbageValue = "732979691"
	)
	static void method2244(SequenceDefinition var0, int var1, int var2, int var3, Actor var4) {
		if (Client.soundEffectCount < 50) { // L: 3635
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) { // L: 3636
				int var5 = var0.soundEffects[var1] & 15; // L: 3637
				if ((var5 <= 0 || WorldMapIcon_1.clientPreferences.method2605() != 0) && (var5 != 0 || WorldMapIcon_1.clientPreferences.method2556() != 0)) { // L: 3638
					int var6 = var0.soundEffects[var1]; // L: 3639
					boolean var9 = var4 == class229.localPlayer; // L: 3642
					if (var6 != 0) { // L: 3644
						int var10 = var6 & 15; // L: 3645
						int var11;
						int var12;
						if (var10 == 0) { // L: 3646
							if (!var9) { // L: 3647
								return; // L: 3665
							}

							Client.soundLocations[Client.soundEffectCount] = 0; // L: 3650
						} else {
							var11 = (var2 - 64) / 128; // L: 3653
							var12 = (var3 - 64) / 128; // L: 3654
							Client.soundLocations[Client.soundEffectCount] = var10 + (var12 << 8) + (var11 << 16); // L: 3655
						}

						var11 = var6 >> 8; // L: 3657
						var12 = var6 >> 4 & 7; // L: 3658
						Client.soundEffectIds[Client.soundEffectCount] = var11; // L: 3659
						Client.queuedSoundEffectLoops[Client.soundEffectCount] = var12; // L: 3660
						Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 3661
						Client.soundEffects[Client.soundEffectCount] = null; // L: 3662
						++Client.soundEffectCount; // L: 3663
					}

				}
			}
		}
	}
}
