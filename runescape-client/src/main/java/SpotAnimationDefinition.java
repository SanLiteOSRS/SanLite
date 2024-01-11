import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("SpotAnimationDefinition_archive")
	static AbstractArchive SpotAnimationDefinition_archive;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("SpotAnimationDefinition_cached")
	public static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static EvictingDualNodeHashTable field2021;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 216273167
	)
	@Export("id")
	int id;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 40174983
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1626267687
	)
	@Export("sequence")
	public int sequence;
	@ObfuscatedName("ao")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("ae")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("aa")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("au")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2103071131
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -954982103
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1037110477
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 859860569
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -863846891
	)
	@Export("contrast")
	int contrast;

	static {
		SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
		field2021 = new EvictingDualNodeHashTable(30); // L: 15
	}

	SpotAnimationDefinition() {
		this.sequence = -1; // L: 18
		this.widthScale = 128; // L: 23
		this.heightScale = 128; // L: 24
		this.orientation = 0; // L: 25
		this.ambient = 0;
		this.contrast = 0; // L: 27
	} // L: 29

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Luk;B)V",
		garbageValue = "-81"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Luk;II)V",
		garbageValue = "1911696940"
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Lko;",
		garbageValue = "0"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		Model var2 = this.method3795(); // L: 85
		Model var3;
		if (this.sequence != -1 && var1 != -1) { // L: 87
			var3 = class9.SequenceDefinition_get(this.sequence).method4092(var2, var1);
		} else {
			var3 = var2.method5639(true); // L: 88
		}

		if (this.widthScale != 128 || this.heightScale != 128) {
			var3.scale(this.widthScale, this.heightScale, this.widthScale); // L: 89
		}

		if (this.orientation != 0) { // L: 90
			if (this.orientation == 90) { // L: 91
				var3.rotateY90Ccw();
			}

			if (this.orientation == 180) { // L: 92
				var3.rotateY90Ccw(); // L: 93
				var3.rotateY90Ccw(); // L: 94
			}

			if (this.orientation == 270) { // L: 96
				var3.rotateY90Ccw(); // L: 97
				var3.rotateY90Ccw(); // L: 98
				var3.rotateY90Ccw(); // L: 99
			}
		}

		return var3; // L: 102
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lko;",
		garbageValue = "2136947186"
	)
	public final Model method3795() {
		Model var1 = (Model)field2021.get((long)this.id); // L: 106
		if (var1 == null) { // L: 107
			ModelData var2 = ModelData.ModelData_get(class105.field1341, this.archive, 0); // L: 108
			if (var2 == null) { // L: 109
				return null;
			}

			int var3;
			if (this.recolorFrom != null) { // L: 110
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 111
					var2.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 112
				}
			}

			if (this.retextureFrom != null) { // L: 115
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 116
					var2.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 117
				}
			}

			var1 = var2.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30); // L: 120
			field2021.put(var1, (long)this.id); // L: 121
		}

		return var1; // L: 123
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2022716626"
	)
	public static int method3814(int var0) {
		return class317.field3440[var0]; // L: 26
	}
}
