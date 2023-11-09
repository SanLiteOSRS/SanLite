import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("SpotAnimationDefinition_archive")
	public static AbstractArchive SpotAnimationDefinition_archive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("SpotAnimationDefinition_modelArchive")
	public static AbstractArchive SpotAnimationDefinition_modelArchive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("SpotAnimationDefinition_cached")
	public static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("SpotAnimationDefinition_cachedModels")
	public static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1136184781
	)
	@Export("id")
	int id;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 590008803
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 672890511
	)
	@Export("sequence")
	public int sequence;
	@ObfuscatedName("k")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("o")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("n")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("d")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1162147017
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1392330275
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1895455467
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -542780989
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1964148583
	)
	@Export("contrast")
	int contrast;

	static {
		SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
		SpotAnimationDefinition_cachedModels = new EvictingDualNodeHashTable(30); // L: 15
	}

	SpotAnimationDefinition() {
		this.sequence = -1; // L: 18
		this.widthScale = 128; // L: 23
		this.heightScale = 128; // L: 24
		this.orientation = 0; // L: 25
		this.ambient = 0; // L: 26
		this.contrast = 0; // L: 27
	} // L: 29

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-1938461985"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 44
			if (var2 == 0) { // L: 45
				return; // L: 48
			}

			this.decodeNext(var1, var2); // L: 46
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)V",
		garbageValue = "-806454373"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 51
			this.archive = var1.readUnsignedShort();
		} else if (var2 == 2) { // L: 52
			this.sequence = var1.readUnsignedShort();
		} else if (var2 == 4) { // L: 53
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 5) { // L: 54
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 55
			this.orientation = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 56
			this.ambient = var1.readUnsignedByte();
		} else if (var2 == 8) { // L: 57
			this.contrast = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 40) { // L: 58
				var3 = var1.readUnsignedByte(); // L: 59
				this.recolorFrom = new short[var3]; // L: 60
				this.recolorTo = new short[var3]; // L: 61

				for (var4 = 0; var4 < var3; ++var4) { // L: 62
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 63
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 64
				}
			} else if (var2 == 41) { // L: 67
				var3 = var1.readUnsignedByte(); // L: 68
				this.retextureFrom = new short[var3]; // L: 69
				this.retextureTo = new short[var3]; // L: 70

				for (var4 = 0; var4 < var3; ++var4) { // L: 71
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 72
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 73
				}
			}
		}

	} // L: 77

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lhp;",
		garbageValue = "325187963"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		Model var2 = (Model)SpotAnimationDefinition_cachedModels.get((long)this.id); // L: 80
		if (var2 == null) { // L: 81
			ModelData var3 = ModelData.ModelData_get(SpotAnimationDefinition_modelArchive, this.archive, 0); // L: 82
			if (var3 == null) { // L: 83
				return null;
			}

			int var4;
			if (this.recolorFrom != null) { // L: 84
				for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 85
					var3.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 86
				}
			}

			if (this.retextureFrom != null) { // L: 89
				for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 90
					var3.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 91
				}
			}

			var2 = var3.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30); // L: 94
			SpotAnimationDefinition_cachedModels.put(var2, (long)this.id); // L: 95
		}

		Model var5;
		if (this.sequence != -1 && var1 != -1) { // L: 98
			var5 = ByteArrayPool.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
		} else {
			var5 = var2.toSharedSpotAnimationModel(true); // L: 99
		}

		if (this.widthScale != 128 || this.heightScale != 128) { // L: 100
			var5.scale(this.widthScale, this.heightScale, this.widthScale);
		}

		if (this.orientation != 0) { // L: 101
			if (this.orientation == 90) { // L: 102
				var5.rotateY90Ccw();
			}

			if (this.orientation == 180) { // L: 103
				var5.rotateY90Ccw(); // L: 104
				var5.rotateY90Ccw(); // L: 105
			}

			if (this.orientation == 270) { // L: 107
				var5.rotateY90Ccw(); // L: 108
				var5.rotateY90Ccw(); // L: 109
				var5.rotateY90Ccw(); // L: 110
			}
		}

		return var5; // L: 113
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(FFFF[FI)V",
		garbageValue = "-1512331269"
	)
	static void method3448(float var0, float var1, float var2, float var3, float[] var4) {
		float var5 = var1 - var0; // L: 320
		float var6 = var2 - var1; // L: 321
		float var7 = var3 - var2; // L: 322
		float var8 = var6 - var5; // L: 323
		var4[3] = var7 - var6 - var8; // L: 324
		var4[2] = var8 + var8 + var8; // L: 325
		var4[1] = var5 + var5 + var5; // L: 326
		var4[0] = var0; // L: 327
	} // L: 328
}
