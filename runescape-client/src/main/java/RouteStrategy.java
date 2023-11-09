import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gv")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("ij")
	@Export("regions")
	static int[] regions;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1816036113
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -639446105
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1855921895
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 969919873
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	} // L: 9

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIILgr;I)Z",
		garbageValue = "-376004430"
	)
	@Export("hasArrived")
	public abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZB)I",
		garbageValue = "-27"
	)
	static int method4044(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) { // L: 1568
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) { // L: 1585
				var7 = var2 ? class140.scriptDotWidget : class136.field1589; // L: 1586
				var4 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 1587
				if (var4 >= 1 && var4 <= 10) { // L: 1588
					class97 var8 = new class97(var4, var7.id, var7.childIndex, var7.itemId); // L: 1591
					Interpreter.field851.add(var8); // L: 1592
					return 1; // L: 1593
				} else {
					throw new RuntimeException(); // L: 1589
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) { // L: 1595
				class379.Interpreter_intStackSize -= 3; // L: 1596
				int var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 1597
				var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 1598
				int var5 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2]; // L: 1599
				if (var5 >= 1 && var5 <= 10) { // L: 1600
					class97 var6 = new class97(var5, var3, var4, class281.getWidget(var3).itemId); // L: 1603
					Interpreter.field851.add(var6); // L: 1604
					return 1; // L: 1605
				} else {
					throw new RuntimeException(); // L: 1601
				}
			} else {
				return 2; // L: 1607
			}
		} else if (Interpreter.field839 >= 10) { // L: 1569
			throw new RuntimeException(); // L: 1570
		} else {
			if (var0 >= 2000) { // L: 1573
				var7 = class281.getWidget(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]); // L: 1574
			} else {
				var7 = var2 ? class140.scriptDotWidget : class136.field1589; // L: 1576
			}

			if (var7.onResize == null) { // L: 1577
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent(); // L: 1578
				var9.widget = var7; // L: 1579
				var9.args = var7.onResize; // L: 1580
				var9.field1053 = Interpreter.field839 + 1; // L: 1581
				Client.scriptEvents.addFirst(var9); // L: 1582
				return 1; // L: 1583
			}
		}
	}
}
