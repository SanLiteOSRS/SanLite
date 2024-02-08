import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("oc")
public enum class367 implements class387 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	field4287(-1),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	field4286(0),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	field4288(1),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	field4289(2);

	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		intValue = -748641331
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1201784613
	)
	final int field4291;

	class367(int var3) {
		this.field4291 = var3; // L: 19
	} // L: 20

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-884190501"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4291; // L: 24
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "-65"
	)
	static int method6958(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class31.scriptDotWidget : class185.field1932; // L: 1371
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1372
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.x; // L: 1373
			return 1; // L: 1374
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1376
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.y; // L: 1377
			return 1; // L: 1378
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1380
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.width; // L: 1381
			return 1; // L: 1382
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1384
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.height; // L: 1385
			return 1; // L: 1386
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1388
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1389
			return 1; // L: 1390
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1392
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.parentId; // L: 1393
			return 1; // L: 1394
		} else {
			return 2; // L: 1396
		}
	}
}
