import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("SpotAnimationDefinition_archive")
	public static AbstractArchive SpotAnimationDefinition_archive;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("SpotAnimationDefinition_cached")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("SpotAnimationDefinition_cachedModels")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 987064541
	)
	@Export("id")
	int id;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1577260275
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1755441209
	)
	@Export("sequence")
	public int sequence;
	@ObfuscatedName("az")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("av")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ap")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("aq")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1007984865
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 629405947
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1478414419
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1660525129
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 808325515
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "26"
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lty;II)V",
		garbageValue = "-797026654"
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
		} else if (var2 == 8) {
			this.contrast = var1.readUnsignedByte(); // L: 57
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Ljo;",
		garbageValue = "-2055096855"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		Model var2 = this.method3778(); // L: 80
		Model var3;
		if (this.sequence != -1 && var1 != -1) { // L: 82
			var3 = class135.SequenceDefinition_get(this.sequence).method4069(var2, var1);
		} else {
			var3 = var2.method4795(true); // L: 83
		}

		if (this.widthScale != 128 || this.heightScale != 128) { // L: 84
			var3.scale(this.widthScale, this.heightScale, this.widthScale);
		}

		if (this.orientation != 0) { // L: 85
			if (this.orientation == 90) { // L: 86
				var3.rotateY90Ccw();
			}

			if (this.orientation == 180) { // L: 87
				var3.rotateY90Ccw(); // L: 88
				var3.rotateY90Ccw(); // L: 89
			}

			if (this.orientation == 270) { // L: 91
				var3.rotateY90Ccw(); // L: 92
				var3.rotateY90Ccw(); // L: 93
				var3.rotateY90Ccw(); // L: 94
			}
		}

		return var3; // L: 97
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljo;",
		garbageValue = "1754203875"
	)
	public final Model method3778() {
		Model var1 = (Model)SpotAnimationDefinition_cachedModels.get((long)this.id); // L: 101
		if (var1 == null) { // L: 102
			ModelData var2 = ModelData.ModelData_get(class53.field393, this.archive, 0); // L: 103
			if (var2 == null) { // L: 104
				return null;
			}

			int var3;
			if (this.recolorFrom != null) { // L: 105
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 106
					var2.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 107
				}
			}

			if (this.retextureFrom != null) { // L: 110
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 111
					var2.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 112
				}
			}

			var1 = var2.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30); // L: 115
			SpotAnimationDefinition_cachedModels.put(var1, (long)this.id); // L: 116
		}

		return var1; // L: 118
	}
}
