import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("SpotAnimationDefinition_archive")
	static AbstractArchive SpotAnimationDefinition_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("SpotAnimationDefinition_modelArchive")
	static AbstractArchive SpotAnimationDefinition_modelArchive;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("SpotAnimationDefinition_cached")
	public static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("SpotAnimationDefinition_cachedModels")
	public static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1720155211
	)
	static int field2083;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1489929653
	)
	@Export("id")
	int id;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1082374293
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1076840233
	)
	@Export("sequence")
	public int sequence;
	@ObfuscatedName("aj")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("ac")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ag")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("ad")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -471999085
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -387831259
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1047931025
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 937462487
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2105617673
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ltc;S)V",
		garbageValue = "-12131"
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ltc;IB)V",
		garbageValue = "55"
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
		} else if (var2 == 8) {
			this.contrast = var1.readUnsignedByte(); // L: 62
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljh;",
		garbageValue = "104"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		Model var2 = this.method3728(); // L: 85
		Model var3;
		if (this.sequence != -1 && var1 != -1) { // L: 87
			var3 = class149.SequenceDefinition_get(this.sequence).method4001(var2, var1);
		} else {
			var3 = var2.method4752(true); // L: 88
		}

		if (this.widthScale != 128 || this.heightScale != 128) { // L: 89
			var3.scale(this.widthScale, this.heightScale, this.widthScale);
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Ljh;",
		garbageValue = "24"
	)
	public final Model method3728() {
		Model var1 = (Model)SpotAnimationDefinition_cachedModels.get((long)this.id); // L: 106
		if (var1 == null) { // L: 107
			ModelData var2 = ModelData.ModelData_get(SpotAnimationDefinition_modelArchive, this.archive, 0); // L: 108
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
			SpotAnimationDefinition_cachedModels.put(var1, (long)this.id); // L: 121
		}

		return var1; // L: 123
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lhx;",
		garbageValue = "-993152993"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0); // L: 35
		if (var1 != null) { // L: 36
			return var1;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0); // L: 37
			var1 = new KitDefinition(); // L: 38
			if (var2 != null) { // L: 39
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0); // L: 40
			return var1; // L: 41
		}
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-32"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (WorldMapAreaData.loadInterface(var0)) { // L: 11670
			class12.runComponentCloseListeners(UserComparator6.Widget_interfaceComponents[var0], var1); // L: 11671
		}
	} // L: 11672
}
