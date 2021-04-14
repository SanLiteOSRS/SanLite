import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bd")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("hg")
	@ObfuscatedGetter(
		intValue = -1657025249
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("f")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1338843583
	)
	@Export("id")
	int id;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -983973645
	)
	@Export("size")
	int size;
	@ObfuscatedName("p")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("b")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("e")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("k")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("g")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-2134581058"
	)
	public static void method1172() {
		Widget.Widget_cachedSprites.clear();
		Widget.Widget_cachedModels.clear();
		Widget.Widget_cachedFonts.clear();
		Widget.Widget_cachedSpriteMasks.clear();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "(ILcc;ZI)I",
		garbageValue = "298552186"
	)
	static int method1171(int var0, Script var1, boolean var2) {
		Widget var3 = class139.getWidget(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) {
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTRANSTOP) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTRANSBOT) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETFILLMODE) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else if (var0 != 2615 && var0 != 2616) {
			return 2;
		} else {
			++class16.Interpreter_intStackSize;
			return 1;
		}
	}
}
