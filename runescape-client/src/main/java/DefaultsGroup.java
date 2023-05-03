import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("qp")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	static final DefaultsGroup field4635;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 595484225
	)
	@Export("group")
	final int group;

	static {
		field4635 = new DefaultsGroup(3); // L: 4
	}

	DefaultsGroup(int var1) {
		this.group = var1; // L: 8
	} // L: 9

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZI)I",
		garbageValue = "1228806354"
	)
	static int method8080(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? SoundSystem.scriptDotWidget : class1.field5; // L: 1515
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) { // L: 1516
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId; // L: 1517
			return 1; // L: 1518
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) { // L: 1520
			if (var3.itemId != -1) { // L: 1521
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1522
			}

			return 1; // L: 1523
		} else if (var0 == ScriptOpcodes.CC_GETID) { // L: 1525
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.childIndex; // L: 1526
			return 1; // L: 1527
		} else if (var0 == 1707) { // L: 1529
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method6382() ? 1 : 0; // L: 1530
			return 1; // L: 1531
		} else if (var0 == 1708) { // L: 1533
			return BufferedSource.method8029(var3); // L: 1534
		} else {
			return var0 == 1709 ? class4.method22(var3) : 2; // L: 1536 1537 1539
		}
	}
}
