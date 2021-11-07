import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gf")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "[[Ljf;"
	)
	@Export("Widget_interfaceComponents")
	public static Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("ff")
	static String field2203;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 627592207
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1419661361
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1032024163
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1425416297
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -605929777
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1140960947
	)
	@Export("regionEndY")
	int regionEndY;

	WorldMapSection1() {
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lfb;I)V",
		garbageValue = "-1844012640"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.regionEndX) {
			var1.regionLowX = this.regionEndX;
		}

		if (var1.regionHighX < this.regionEndX) {
			var1.regionHighX = this.regionEndX;
		}

		if (var1.regionLowY > this.regionEndY) {
			var1.regionLowY = this.regionEndY;
		}

		if (var1.regionHighY < this.regionEndY) {
			var1.regionHighY = this.regionEndY;
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1501827396"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) {
			return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-356013678"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-79"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.regionEndX * 64 - this.regionStartX * 64 + var2, var3 + (this.regionEndY * 64 - this.regionStartY * 64)};
			return var4;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)Lie;",
		garbageValue = "494177498"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1;
			int var4 = this.regionStartY * 64 - this.regionEndY * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-682362313"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "124"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZB)I",
		garbageValue = "-4"
	)
	static int method3999(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class120.scriptDotWidget : Frames.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETTEXT) {
			Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETTRANS) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == 1610) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == 1613) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else if (var0 != 1615 && var0 != 1616) {
			return 2;
		} else {
			++class14.Interpreter_intStackSize;
			return 1;
		}
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "209576607"
	)
	@Export("updateSoundEffectVolume")
	static final void updateSoundEffectVolume(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class408.clientPreferences.soundEffectsVolume = var0;
		Login.savePreferences();
	}
}
