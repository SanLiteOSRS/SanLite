import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	@Export("SpotAnimationDefinition_archive")
	public static AbstractArchive SpotAnimationDefinition_archive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	@Export("SpotAnimationDefinition_modelArchive")
	public static AbstractArchive SpotAnimationDefinition_modelArchive;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lgf;"
	)
	@Export("SpotAnimationDefinition_cached")
	public static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lgf;"
	)
	@Export("SpotAnimationDefinition_cachedModels")
	public static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1763837413
	)
	@Export("id")
	int id;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -680345807
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1398815435
	)
	@Export("sequence")
	public int sequence;
	@ObfuscatedName("g")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("h")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("n")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("l")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 91063733
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1248170611
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -211246217
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 87174687
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -477885717
	)
	@Export("contrast")
	int contrast;

	static {
		SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64);
		SpotAnimationDefinition_cachedModels = new EvictingDualNodeHashTable(30);
	}

	SpotAnimationDefinition() {
		this.sequence = -1;
		this.widthScale = 128;
		this.heightScale = 128;
		this.orientation = 0;
		this.ambient = 0;
		this.contrast = 0;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lnu;B)V",
		garbageValue = "29"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Lnu;II)V",
		garbageValue = "1730148365"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.archive = var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.sequence = var1.readUnsignedShort();
		} else if (var2 == 4) {
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 5) {
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 6) {
			this.orientation = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.ambient = var1.readUnsignedByte();
		} else if (var2 == 8) {
			this.contrast = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 40) {
				var3 = var1.readUnsignedByte();
				this.recolorFrom = new short[var3];
				this.recolorTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.recolorFrom[var4] = (short)var1.readUnsignedShort();
					this.recolorTo[var4] = (short)var1.readUnsignedShort();
				}
			} else if (var2 == 41) {
				var3 = var1.readUnsignedByte();
				this.retextureFrom = new short[var3];
				this.retextureTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.retextureFrom[var4] = (short)var1.readUnsignedShort();
					this.retextureTo[var4] = (short)var1.readUnsignedShort();
				}
			}
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(II)Lgv;",
		garbageValue = "-1890190190"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		Model var2 = (Model)SpotAnimationDefinition_cachedModels.get((long)this.id);
		if (var2 == null) {
			ModelData var3 = ModelData.ModelData_get(SpotAnimationDefinition_modelArchive, this.archive, 0);
			if (var3 == null) {
				return null;
			}

			int var4;
			if (this.recolorFrom != null) {
				for (var4 = 0; var4 < this.recolorFrom.length; ++var4) {
					var3.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
				}
			}

			if (this.retextureFrom != null) {
				for (var4 = 0; var4 < this.retextureFrom.length; ++var4) {
					var3.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
				}
			}

			var2 = var3.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
			SpotAnimationDefinition_cachedModels.put(var2, (long)this.id);
		}

		Model var5;
		if (this.sequence != -1 && var1 != -1) {
			var5 = class225.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
		} else {
			var5 = var2.toSharedSpotAnimationModel(true);
		}

		if (this.widthScale != 128 || this.heightScale != 128) {
			var5.scale(this.widthScale, this.heightScale, this.widthScale);
		}

		if (this.orientation != 0) {
			if (this.orientation == 90) {
				var5.rotateY90Ccw();
			}

			if (this.orientation == 180) {
				var5.rotateY90Ccw();
				var5.rotateY90Ccw();
			}

			if (this.orientation == 270) {
				var5.rotateY90Ccw();
				var5.rotateY90Ccw();
				var5.rotateY90Ccw();
			}
		}

		return var5;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		signature = "(ILcc;ZB)I",
		garbageValue = "3"
	)
	static int method5048(int var0, Script var1, boolean var2) {
		if (var0 >= 7200 && var0 < 7204) {
			class16.Interpreter_intStackSize -= 5;
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 == 7204) {
			class16.Interpreter_intStackSize -= 6;
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 >= 7205 && var0 < 7209) {
			Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 == 7209) {
			class16.Interpreter_intStackSize -= 2;
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 >= 7210 && var0 < 7214) {
			--class16.Interpreter_intStackSize;
			return 1;
		} else if (var0 == 7214) {
			class16.Interpreter_intStackSize -= 2;
			return 1;
		} else {
			return 2;
		}
	}
}
