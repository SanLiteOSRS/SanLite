import java.util.regex.Pattern;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@mz
@ObfuscatedName("pz")
public final class class402 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	static IndexedSprite field4500;

	static {
		Pattern.compile("^\\D*(\\d+)\\D*$"); // L: 9
	} // L: 10

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "-23"
	)
	static int method7522(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class31.scriptDotWidget : class185.field1932; // L: 1564
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) { // L: 1565
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.itemId; // L: 1566
			return 1; // L: 1567
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) { // L: 1569
			if (var3.itemId != -1) { // L: 1570
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 1571
			}

			return 1; // L: 1572
		} else if (var0 == ScriptOpcodes.CC_GETID) { // L: 1574
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.childIndex; // L: 1575
			return 1; // L: 1576
		} else if (var0 == 1707) { // L: 1578
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.method6762() ? 1 : 0; // L: 1579
			return 1; // L: 1580
		} else if (var0 == 1708) { // L: 1582
			return class132.method3116(var3); // L: 1583
		} else {
			return var0 == 1709 ? BuddyRankComparator.method2997(var3) : 2; // L: 1585 1586 1588
		}
	}
}
