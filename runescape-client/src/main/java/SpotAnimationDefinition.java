import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("SpotAnimationDefinition_archive")
	static AbstractArchive SpotAnimationDefinition_archive;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("SpotAnimationDefinition_modelArchive")
	static AbstractArchive SpotAnimationDefinition_modelArchive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("SpotAnimationDefinition_cached")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("SpotAnimationDefinition_cachedModels")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1537555243
	)
	@Export("id")
	int id;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 903909845
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -295593061
	)
	@Export("sequence")
	public int sequence;
	@ObfuscatedName("r")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("u")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("b")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("j")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -289907207
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1592669609
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 919548227
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 291323671
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1468773977
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
		this.orientation = 0;
		this.ambient = 0;
		this.contrast = 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqy;B)V",
		garbageValue = "48"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 49
			if (var2 == 0) { // L: 50
				return; // L: 53
			}

			this.decodeNext(var1, var2); // L: 51
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lqy;IB)V",
		garbageValue = "76"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 56
			this.archive = var1.readUnsignedShort();
		} else if (var2 == 2) { // L: 57
			this.sequence = var1.readUnsignedShort();
		} else if (var2 == 4) { // L: 58
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 5) { // L: 59
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 60
			this.orientation = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 61
			this.ambient = var1.readUnsignedByte();
		} else if (var2 == 8) { // L: 62
			this.contrast = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 40) { // L: 63
				var3 = var1.readUnsignedByte(); // L: 64
				this.recolorFrom = new short[var3]; // L: 65
				this.recolorTo = new short[var3]; // L: 66

				for (var4 = 0; var4 < var3; ++var4) { // L: 67
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 68
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 69
				}
			} else if (var2 == 41) { // L: 72
				var3 = var1.readUnsignedByte(); // L: 73
				this.retextureFrom = new short[var3]; // L: 74
				this.retextureTo = new short[var3]; // L: 75

				for (var4 = 0; var4 < var3; ++var4) { // L: 76
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 77
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 78
				}
			}
		}

	} // L: 82

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Lhh;",
		garbageValue = "975498886"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		Model var2 = (Model)SpotAnimationDefinition_cachedModels.get((long)this.id); // L: 85
		if (var2 == null) { // L: 86
			ModelData var3 = ModelData.ModelData_get(SpotAnimationDefinition_modelArchive, this.archive, 0); // L: 87
			if (var3 == null) { // L: 88
				return null;
			}

			int var4;
			if (this.recolorFrom != null) { // L: 89
				for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 90
					var3.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 91
				}
			}

			if (this.retextureFrom != null) { // L: 94
				for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 95
					var3.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 96
				}
			}

			var2 = var3.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30); // L: 99
			SpotAnimationDefinition_cachedModels.put(var2, (long)this.id); // L: 100
		}

		Model var5;
		if (this.sequence != -1 && var1 != -1) { // L: 103
			var5 = class216.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
		} else {
			var5 = var2.toSharedSpotAnimationModel(true); // L: 104
		}

		if (this.widthScale != 128 || this.heightScale != 128) { // L: 105
			var5.scale(this.widthScale, this.heightScale, this.widthScale);
		}

		if (this.orientation != 0) { // L: 106
			if (this.orientation == 90) { // L: 107
				var5.rotateY90Ccw();
			}

			if (this.orientation == 180) { // L: 108
				var5.rotateY90Ccw(); // L: 109
				var5.rotateY90Ccw(); // L: 110
			}

			if (this.orientation == 270) { // L: 112
				var5.rotateY90Ccw(); // L: 113
				var5.rotateY90Ccw(); // L: 114
				var5.rotateY90Ccw(); // L: 115
			}
		}

		return var5; // L: 118
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Lop;",
		garbageValue = "-1315664177"
	)
	public static class409 method3751() {
		synchronized(class409.field4601) {
			if (class409.field4604 == 0) {
				return new class409();
			} else {
				class409.field4601[--class409.field4604].method7763();
				return class409.field4601[class409.field4604];
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-891167706"
	)
	static void method3743() {
		StructComposition.field2122 = new int[2000]; // L: 25
		int var0 = 0; // L: 26
		int var1 = 240; // L: 27

		int var3;
		for (byte var2 = 12; var0 < 16; var1 -= var2) { // L: 28
			var3 = class201.method4112((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)(0.425F * (float)var0 / 16.0F + 0.075F)); // L: 30
			StructComposition.field2122[var0] = var3; // L: 31
			++var0; // L: 29
		}

		var1 = 48; // L: 33

		for (int var5 = var1 / 6; var0 < StructComposition.field2122.length; var1 -= var5) { // L: 34 35 41
			var3 = var0 * 2; // L: 36

			for (int var4 = class201.method4112((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < StructComposition.field2122.length; ++var0) { // L: 37 38
				StructComposition.field2122[var0] = var4; // L: 39
			}
		}

	} // L: 43

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)[Ljn;",
		garbageValue = "113"
	)
	public static class276[] method3732() {
		return new class276[]{class276.field3170, class276.field3158, class276.field3159, class276.field3171, class276.field3161, class276.field3166, class276.field3168, class276.field3164, class276.field3165, class276.field3157, class276.field3167, class276.field3160, class276.field3169, class276.field3163}; // L: 21
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1666232175"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7; // L: 5512
		int var4 = var1 >> 7; // L: 5513
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) { // L: 5514
			int var5 = var2; // L: 5515
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 5516
				var5 = var2 + 1;
			}

			int var6 = var0 & 127; // L: 5517
			int var7 = var1 & 127; // L: 5518
			int var8 = Tiles.Tiles_heights[var5][var3 + 1][var4] * var6 + (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] >> 7; // L: 5519
			int var9 = var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] + Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) >> 7; // L: 5520
			return var8 * (128 - var7) + var7 * var9 >> 7; // L: 5521
		} else {
			return 0;
		}
	}
}
