import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fg")
public abstract class class165 {
	@ObfuscatedName("v")
	String field1783;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	final class155 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leu;Ljava/lang/String;)V"
	)
	class165(class155 var1, String var2) {
		this.this$0 = var1; // L: 331
		this.field1783 = var2; // L: 332
	} // L: 333

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2051475580"
	)
	public abstract int vmethod3237();

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-91"
	)
	public String vmethod3250() {
		return null; // L: 342
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1570944667"
	)
	public int vmethod3239() {
		return -1; // L: 346
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "293520700"
	)
	public String method3238() {
		return this.field1783; // L: 336
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-389831112"
	)
	static int method3253(int var0, Script var1, boolean var2) {
		Widget var3 = HitSplatDefinition.getWidget(Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]); // L: 1323
		if (var0 == ScriptOpcodes.IF_GETX) { // L: 1324
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.x; // L: 1325
			return 1; // L: 1326
		} else if (var0 == ScriptOpcodes.IF_GETY) { // L: 1328
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.y; // L: 1329
			return 1; // L: 1330
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) { // L: 1332
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.width; // L: 1333
			return 1; // L: 1334
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) { // L: 1336
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.height; // L: 1337
			return 1; // L: 1338
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) { // L: 1340
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1341
			return 1; // L: 1342
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) { // L: 1344
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.parentId; // L: 1345
			return 1; // L: 1346
		} else {
			return 2; // L: 1348
		}
	}
}
