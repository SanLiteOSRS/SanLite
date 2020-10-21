import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("he")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("bg")
	public static String field2839;
	@ObfuscatedName("cj")
	public static String field3046;
	@ObfuscatedName("jv")
	public static String field3054;
	@ObfuscatedName("js")
	public static String field3055;
	@ObfuscatedName("ja")
	public static String field3056;

	static {
		field2839 = "Please visit the support page for assistance.";
		field3046 = "Please visit the support page for assistance.";
		field3054 = "";
		field3055 = "Page has opened in a new window.";
		field3056 = "(Please check your popup blocker.)";
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(II)Ljava/lang/String;",
		garbageValue = "-1467551929"
	)
	static final String method4258(int var0) {
		if (var0 < 100000) {
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>";
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(ILco;ZB)I",
		garbageValue = "58"
	)
	static int method4259(int var0, Script var1, boolean var2) {
		Widget var3 = UserComparator4.getWidget(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETX) {
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETY) {
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) {
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) {
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) {
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}
}
