import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ey")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -655054217
	)
	@Export("idxCount")
	static int idxCount;
	@ObfuscatedName("at")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lrh;Lrh;I)I",
		garbageValue = "-464829605"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) { // L: 14
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "-32"
	)
	static int method3019(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) { // L: 1603
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) { // L: 1620
				var7 = var2 ? Interpreter.scriptDotWidget : HealthBar.field1302; // L: 1621
				var4 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 1622
				if (var4 >= 1 && var4 <= 10) { // L: 1623
					class102 var8 = new class102(var4, var7.id, var7.childIndex, var7.itemId); // L: 1626
					Interpreter.field847.add(var8); // L: 1627
					return 1; // L: 1628
				} else {
					throw new RuntimeException(); // L: 1624
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) { // L: 1630
				class517.Interpreter_intStackSize -= 3; // L: 1631
				int var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 1632
				var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 1633
				int var5 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 2]; // L: 1634
				if (var5 >= 1 && var5 <= 10) { // L: 1635
					class102 var6 = new class102(var5, var3, var4, HealthBarDefinition.field1877.method6285(var3).itemId); // L: 1638
					Interpreter.field847.add(var6); // L: 1639
					return 1; // L: 1640
				} else {
					throw new RuntimeException(); // L: 1636
				}
			} else {
				return 2; // L: 1642
			}
		} else if (Interpreter.field849 >= 10) { // L: 1604
			throw new RuntimeException(); // L: 1605
		} else {
			if (var0 >= 2000) { // L: 1608
				var7 = HealthBarDefinition.field1877.method6285(Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]); // L: 1609
			} else {
				var7 = var2 ? Interpreter.scriptDotWidget : HealthBar.field1302; // L: 1611
			}

			if (var7.onResize == null) { // L: 1612
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent(); // L: 1613
				var9.widget = var7; // L: 1614
				var9.args = var7.onResize; // L: 1615
				var9.field1063 = Interpreter.field849 + 1; // L: 1616
				Client.scriptEvents.addFirst(var9); // L: 1617
				return 1; // L: 1618
			}
		}
	}
}
