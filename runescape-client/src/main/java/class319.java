import java.util.BitSet;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mx")
public class class319 extends Node {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 269673261
	)
	int field3519;
	@ObfuscatedName("ay")
	BitSet field3520;

	class319(int var1) {
		this.field3519 = var1; // L: 11
		this.field3520 = new BitSet(128); // L: 12
	} // L: 13

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2041814477"
	)
	public static boolean method6069(int var0) {
		return (var0 >> 20 & 1) != 0; // L: 17
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "1437385247"
	)
	static int method6071(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) { // L: 1590
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) { // L: 1607
				var7 = var2 ? class36.scriptDotWidget : class351.field3896; // L: 1608
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1609
				if (var4 >= 1 && var4 <= 10) { // L: 1610
					class102 var8 = new class102(var4, var7.id, var7.childIndex, var7.itemId); // L: 1613
					Interpreter.field880.add(var8); // L: 1614
					return 1; // L: 1615
				} else {
					throw new RuntimeException(); // L: 1611
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) { // L: 1617
				Interpreter.Interpreter_intStackSize -= 3; // L: 1618
				int var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1619
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1620
				int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 1621
				if (var5 >= 1 && var5 <= 10) { // L: 1622
					class102 var6 = new class102(var5, var3, var4, VarbitComposition.getWidget(var3).itemId); // L: 1625
					Interpreter.field880.add(var6); // L: 1626
					return 1; // L: 1627
				} else {
					throw new RuntimeException(); // L: 1623
				}
			} else {
				return 2; // L: 1629
			}
		} else if (Interpreter.field881 >= 10) { // L: 1591
			throw new RuntimeException(); // L: 1592
		} else {
			if (var0 >= 2000) { // L: 1595
				var7 = VarbitComposition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1596
			} else {
				var7 = var2 ? class36.scriptDotWidget : class351.field3896; // L: 1598
			}

			if (var7.onResize == null) { // L: 1599
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent(); // L: 1600
				var9.widget = var7; // L: 1601
				var9.args = var7.onResize; // L: 1602
				var9.field1074 = Interpreter.field881 + 1; // L: 1603
				Client.scriptEvents.addFirst(var9); // L: 1604
				return 1; // L: 1605
			}
		}
	}

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "1"
	)
	static boolean method6070(int var0) {
		for (int var1 = 0; var1 < Client.field752; ++var1) { // L: 11965
			if (Client.field754[var1] == var0) { // L: 11966
				return true;
			}
		}

		return false; // L: 11968
	}
}
