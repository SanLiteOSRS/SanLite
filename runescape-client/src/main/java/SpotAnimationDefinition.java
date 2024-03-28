import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("SpotAnimationDefinition_archive")
	public static AbstractArchive SpotAnimationDefinition_archive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	public static AbstractArchive field2173;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("SpotAnimationDefinition_cached")
	public static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	public static EvictingDualNodeHashTable field2175;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -828236871
	)
	@Export("id")
	int id;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 257967473
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1810535167
	)
	@Export("sequence")
	public int sequence;
	@ObfuscatedName("aw")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("ad")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("al")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("as")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1020551627
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -849190015
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -217106641
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1561843695
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2128906521
	)
	@Export("contrast")
	int contrast;

	static {
		SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
		field2175 = new EvictingDualNodeHashTable(30); // L: 15
	}

	SpotAnimationDefinition() {
		this.sequence = -1; // L: 18
		this.widthScale = 128; // L: 23
		this.heightScale = 128; // L: 24
		this.orientation = 0; // L: 25
		this.ambient = 0; // L: 26
		this.contrast = 0; // L: 27
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lur;B)V",
		garbageValue = "1"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) { // L: 45
				return; // L: 48
			}

			this.decodeNext(var1, var2); // L: 46
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lur;II)V",
		garbageValue = "-1451302455"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Ljn;",
		garbageValue = "2000373936"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		Model var2 = this.method3940(); // L: 80
		if (var2 == null) { // L: 81
			return null;
		} else {
			Model var3;
			if (this.sequence != -1 && var1 != -1) { // L: 83
				var3 = DevicePcmPlayerProvider.SequenceDefinition_get(this.sequence).method4227(var2, var1);
			} else {
				var3 = var2.method5035(true); // L: 84
			}

			if (this.widthScale != 128 || this.heightScale != 128) { // L: 85
				var3.scale(this.widthScale, this.heightScale, this.widthScale);
			}

			if (this.orientation != 0) { // L: 86
				if (this.orientation == 90) { // L: 87
					var3.rotateY90Ccw();
				}

				if (this.orientation == 180) { // L: 88
					var3.rotateY90Ccw(); // L: 89
					var3.rotateY90Ccw(); // L: 90
				}

				if (this.orientation == 270) { // L: 92
					var3.rotateY90Ccw(); // L: 93
					var3.rotateY90Ccw(); // L: 94
					var3.rotateY90Ccw(); // L: 95
				}
			}

			return var3; // L: 98
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljn;",
		garbageValue = "255235863"
	)
	public final Model method3940() {
		Model var1 = (Model)field2175.get((long)this.id); // L: 102
		if (var1 == null) { // L: 103
			ModelData var2 = ModelData.ModelData_get(field2173, this.archive, 0); // L: 104
			if (var2 == null) { // L: 105
				return null;
			}

			int var3;
			if (this.recolorFrom != null) { // L: 106
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 107
					var2.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 108
				}
			}

			if (this.retextureFrom != null) { // L: 111
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 112
					var2.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 113
				}
			}

			var1 = var2.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30); // L: 116
			field2175.put(var1, (long)this.id); // L: 117
		}

		return var1; // L: 119
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1016719915"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var2 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 28
		VarbitComposition var1;
		if (var2 != null) { // L: 29
			var1 = var2; // L: 30
		} else {
			byte[] var3 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0); // L: 33
			var2 = new VarbitComposition(); // L: 34
			if (var3 != null) { // L: 35
				var2.decode(new Buffer(var3));
			}

			VarbitComposition.VarbitDefinition_cached.put(var2, (long)var0); // L: 36
			var1 = var2; // L: 37
		}

		int var7 = var1.baseVar; // L: 40
		int var4 = var1.startBit; // L: 41
		int var5 = var1.endBit; // L: 42
		int var6 = Varps.Varps_masks[var5 - var4]; // L: 43
		return Varps.Varps_main[var7] >> var4 & var6; // L: 44
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public static void method3949() {
		class549.SpriteBuffer_xOffsets = null; // L: 221
		class549.SpriteBuffer_yOffsets = null; // L: 222
		class549.SpriteBuffer_spriteWidths = null; // L: 223
		Ignored.SpriteBuffer_spriteHeights = null; // L: 224
		class126.SpriteBuffer_spritePalette = null; // L: 225
		class549.SpriteBuffer_pixels = null; // L: 226
	} // L: 227
}
