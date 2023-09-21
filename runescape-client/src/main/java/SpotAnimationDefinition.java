import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("SpotAnimationDefinition_archive")
	public static AbstractArchive SpotAnimationDefinition_archive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	public static AbstractArchive field2116;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("SpotAnimationDefinition_cached")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	static EvictingDualNodeHashTable field2120;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -529110127
	)
	@Export("id")
	int id;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 201436745
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 253020647
	)
	@Export("sequence")
	public int sequence;
	@ObfuscatedName("ab")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("am")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("av")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("ag")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1359832271
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1245789773
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -314997151
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 226238365
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1173342985
	)
	@Export("contrast")
	int contrast;

	static {
		SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
		field2120 = new EvictingDualNodeHashTable(30); // L: 15
	}

	SpotAnimationDefinition() {
		this.sequence = -1; // L: 18
		this.widthScale = 128; // L: 23
		this.heightScale = 128; // L: 24
		this.orientation = 0; // L: 25
		this.ambient = 0; // L: 26
		this.contrast = 0; // L: 27
	} // L: 29

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "-1113058920"
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lul;II)V",
		garbageValue = "2121319025"
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Ljn;",
		garbageValue = "1896803273"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		Model var2 = this.method3863(); // L: 80
		Model var3;
		if (this.sequence != -1 && var1 != -1) { // L: 82
			var3 = class36.SequenceDefinition_get(this.sequence).method4164(var2, var1);
		} else {
			var3 = var2.method4907(true); // L: 83
		}

		if (this.widthScale != 128 || this.heightScale != 128) {
			var3.scale(this.widthScale, this.heightScale, this.widthScale); // L: 84
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Ljn;",
		garbageValue = "6"
	)
	public final Model method3863() {
		Model var1 = (Model)field2120.get((long)this.id); // L: 101
		if (var1 == null) { // L: 102
			ModelData var2 = ModelData.ModelData_get(field2116, this.archive, 0); // L: 103
			if (var2 == null) {
				return null;
			}

			int var3;
			if (this.recolorFrom != null) {
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) {
					var2.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 107
				}
			}

			if (this.retextureFrom != null) { // L: 110
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 111
					var2.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 112
				}
			}

			var1 = var2.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30); // L: 115
			field2120.put(var1, (long)this.id); // L: 116
		}

		return var1; // L: 118
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-113"
	)
	public static final void method3868() {
		ViewportMouse.ViewportMouse_isInViewport = false; // L: 104
		ViewportMouse.ViewportMouse_entityCount = 0; // L: 105
	} // L: 106
}
