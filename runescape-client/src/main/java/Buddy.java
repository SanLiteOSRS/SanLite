import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("of")
@Implements("Buddy")
public class Buddy extends Nameable {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1899402835
	)
	@Export("world")
	public int world;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1732968995
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 924228175
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1; // L: 4
	} // L: 8

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "78"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1; // L: 11
		this.int2 = var2; // L: 12
	} // L: 13

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-949915725"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world; // L: 16
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "75"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0; // L: 20
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-974133059"
	)
	static int method7457(int var0, Script var1, boolean var2) {
		Widget var3 = class281.getWidget(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]); // L: 1611
		if (var0 == ScriptOpcodes.IF_GETX) { // L: 1612
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.x; // L: 1613
			return 1; // L: 1614
		} else if (var0 == ScriptOpcodes.IF_GETY) { // L: 1616
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.y; // L: 1617
			return 1; // L: 1618
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) { // L: 1620
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.width; // L: 1621
			return 1; // L: 1622
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) { // L: 1624
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.height; // L: 1625
			return 1; // L: 1626
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) { // L: 1628
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1629
			return 1; // L: 1630
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) { // L: 1632
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.parentId; // L: 1633
			return 1; // L: 1634
		} else {
			return 2; // L: 1636
		}
	}
}
