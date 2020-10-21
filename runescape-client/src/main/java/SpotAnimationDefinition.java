import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ie")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("SpotAnimationDefinition_archive")
	static AbstractArchive SpotAnimationDefinition_archive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("SpotAnimationDefinition_modelArchive")
	static AbstractArchive SpotAnimationDefinition_modelArchive;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lev;"
	)
	@Export("SpotAnimationDefinition_cached")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lev;"
	)
	@Export("SpotAnimationDefinition_cachedModels")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels;
	@ObfuscatedName("ex")
	@ObfuscatedGetter(
		intValue = 324624887
	)
	static int field3282;
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = -787495021
	)
	@Export("selectedItemWidget")
	static int selectedItemWidget;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -378851373
	)
	@Export("id")
	int id;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1622885381
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1604295303
	)
	@Export("sequence")
	public int sequence;
	@ObfuscatedName("c")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("u")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("t")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("e")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1171838019
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1777738887
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 439933857
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -2047701161
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1188839011
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(Lkb;B)V",
		garbageValue = "57"
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lkb;II)V",
		garbageValue = "-1222478116"
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(IB)Leh;",
		garbageValue = "-32"
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
			var5 = class105.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(ILco;ZI)I",
		garbageValue = "2006459682"
	)
	static int method4577(int var0, Script var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
			var4 = UserComparator4.getWidget(var3);
		} else {
			var4 = var2 ? MouseRecorder.field621 : Interpreter.field1122;
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			MilliClock.Interpreter_intStackSize -= 4;
			var4.rawX = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
			var4.rawY = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
			var4.xAlignment = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 2];
			var4.yAlignment = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 3];
			GrandExchangeOfferOwnWorldComparator.invalidateWidget(var4);
			ByteArrayPool.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				UserComparator9.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			MilliClock.Interpreter_intStackSize -= 4;
			var4.rawWidth = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
			var4.rawHeight = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
			var4.widthAlignment = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 2];
			var4.heightAlignment = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 3];
			GrandExchangeOfferOwnWorldComparator.invalidateWidget(var4);
			ByteArrayPool.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				UserComparator9.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var5 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var4);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var4.noClickThrough = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}
}
