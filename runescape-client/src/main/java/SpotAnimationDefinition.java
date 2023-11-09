import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("SpotAnimationDefinition_archive")
	public static AbstractArchive SpotAnimationDefinition_archive;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("SpotAnimationDefinition_modelArchive")
	public static AbstractArchive SpotAnimationDefinition_modelArchive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("SpotAnimationDefinition_cached")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("SpotAnimationDefinition_cachedModels")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "[Lry;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 112872075
	)
	@Export("id")
	int id;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1921428249
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -407882935
	)
	@Export("sequence")
	public int sequence;
	@ObfuscatedName("d")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("n")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("r")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("l")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1904272911
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1359658687
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -535278233
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1137902335
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -608370479
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "1953563970"
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)V",
		garbageValue = "-1244957740"
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(II)Lha;",
		garbageValue = "-572346987"
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
			if (this.recolorFrom != null) {
				for (var4 = 0; var4 < this.recolorFrom.length; ++var4) {
					var3.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
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
			var5 = WorldMapElement.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIII)J",
		garbageValue = "-878617555"
	)
	static long method3591(int var0, int var1, int var2) {
		return (long)(var2 << 16 | var0 << 8 | var1); // L: 38
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lbt;Lbt;IZIZI)I",
		garbageValue = "-977260089"
	)
	static int method3600(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
		int var6 = class270.compareWorlds(var0, var1, var2, var3); // L: 199
		if (var6 != 0) { // L: 200
			return var3 ? -var6 : var6; // L: 201
		} else if (var4 == -1) { // L: 204
			return 0;
		} else {
			int var7 = class270.compareWorlds(var0, var1, var4, var5); // L: 205
			return var5 ? -var7 : var7; // L: 206
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIIZII)J",
		garbageValue = "2119003678"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17; // L: 84
		if (var3) { // L: 85
			var5 |= 65536L;
		}

		return var5; // L: 86
	}
}
