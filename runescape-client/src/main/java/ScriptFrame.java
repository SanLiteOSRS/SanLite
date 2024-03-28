import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cc")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("df")
	static boolean field460;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1861957827
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("af")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("at")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1; // L: 5
	} // L: 9

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZB)I",
		garbageValue = "41"
	)
	static int method1147(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) { // L: 1636
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) { // L: 1653
				var7 = var2 ? class475.scriptDotWidget : class535.field5236; // L: 1654
				var4 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 1655
				if (var4 >= 1 && var4 <= 10) { // L: 1656
					class103 var8 = new class103(var4, var7.id, var7.childIndex, var7.itemId); // L: 1659
					Interpreter.field867.add(var8); // L: 1660
					return 1; // L: 1661
				} else {
					throw new RuntimeException(); // L: 1657
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) { // L: 1663
				class19.Interpreter_intStackSize -= 3; // L: 1664
				int var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 1665
				var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 1666
				int var5 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 2]; // L: 1667
				if (var5 >= 1 && var5 <= 10) { // L: 1668
					class103 var6 = new class103(var5, var3, var4, class243.field2620.method6281(var3).itemId); // L: 1671
					Interpreter.field867.add(var6); // L: 1672
					return 1; // L: 1673
				} else {
					throw new RuntimeException(); // L: 1669
				}
			} else {
				return 2; // L: 1675
			}
		} else if (Interpreter.field875 >= 10) { // L: 1637
			throw new RuntimeException(); // L: 1638
		} else {
			if (var0 >= 2000) { // L: 1641
				var7 = class243.field2620.method6281(Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]); // L: 1642
			} else {
				var7 = var2 ? class475.scriptDotWidget : class535.field5236; // L: 1644
			}

			if (var7.onResize == null) { // L: 1645
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent(); // L: 1646
				var9.widget = var7; // L: 1647
				var9.args = var7.onResize; // L: 1648
				var9.field1087 = Interpreter.field875 + 1; // L: 1649
				Client.scriptEvents.addFirst(var9); // L: 1650
				return 1; // L: 1651
			}
		}
	}
}
