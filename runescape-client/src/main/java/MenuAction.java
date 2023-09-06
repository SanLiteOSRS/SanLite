import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cz")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1513396029
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -76660391
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 362704459
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1921854171
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 306205453
	)
	int field916;
	@ObfuscatedName("ai")
	String field921;
	@ObfuscatedName("az")
	String field922;

	MenuAction() {
	} // L: 13018

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1991089185"
	)
	public static final void method2083(int var0, int var1) {
		ViewportMouse.ViewportMouse_x = var0; // L: 80
		ViewportMouse.ViewportMouse_y = var1; // L: 81
		ViewportMouse.ViewportMouse_isInViewport = true; // L: 82
		ViewportMouse.ViewportMouse_entityCount = 0; // L: 83
		ViewportMouse.ViewportMouse_false0 = false; // L: 84
	} // L: 85

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZB)I",
		garbageValue = "64"
	)
	static int method2084(int var0, Script var1, boolean var2) {
		Widget var3 = class92.getWidget(Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]); // L: 1636
		if (var0 == ScriptOpcodes.IF_GETX) { // L: 1637
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.x; // L: 1638
			return 1; // L: 1639
		} else if (var0 == ScriptOpcodes.IF_GETY) { // L: 1641
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.y; // L: 1642
			return 1; // L: 1643
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) { // L: 1645
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.width; // L: 1646
			return 1; // L: 1647
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) { // L: 1649
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.height; // L: 1650
			return 1; // L: 1651
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) { // L: 1653
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1654
			return 1; // L: 1655
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) { // L: 1657
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.parentId; // L: 1658
			return 1; // L: 1659
		} else {
			return 2; // L: 1661
		}
	}
}
