import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("he")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("VarcInt_archive")
	public static AbstractArchive VarcInt_archive;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("VarcInt_cached")
	static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("ar")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	VarcInt() {
		this.persist = false; // L: 12
	} // L: 14

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "1325526126"
	)
	void method3627(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 28
			if (var2 == 0) { // L: 29
				return; // L: 32
			}

			this.method3635(var1, var2); // L: 30
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lty;IB)V",
		garbageValue = "109"
	)
	void method3635(Buffer var1, int var2) {
		if (var2 == 2) { // L: 35
			this.persist = true; // L: 36
		}

	} // L: 39

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "1683320936"
	)
	static int method3638(int var0, Script var1, boolean var2) {
		Widget var3 = VarbitComposition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1633
		if (var0 == ScriptOpcodes.IF_GETX) { // L: 1634
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x; // L: 1635
			return 1; // L: 1636
		} else if (var0 == ScriptOpcodes.IF_GETY) { // L: 1638
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y; // L: 1639
			return 1; // L: 1640
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) { // L: 1642
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width; // L: 1643
			return 1; // L: 1644
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) { // L: 1646
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height; // L: 1647
			return 1; // L: 1648
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) { // L: 1650
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1651
			return 1; // L: 1652
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) { // L: 1654
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId; // L: 1655
			return 1; // L: 1656
		} else {
			return 2; // L: 1658
		}
	}
}
