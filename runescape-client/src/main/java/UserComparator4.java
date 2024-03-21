import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ev")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("aq")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lry;Lry;S)I",
		garbageValue = "-17937"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 14
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2); // L: 18
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 22
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lhp;",
		garbageValue = "1460065169"
	)
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition)ParamComposition.ParamComposition_cached.get((long)var0); // L: 25
		if (var1 != null) { // L: 26
			return var1;
		} else {
			byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0); // L: 27
			var1 = new ParamComposition(); // L: 28
			if (var2 != null) { // L: 29
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 30
			ParamComposition.ParamComposition_cached.put(var1, (long)var0); // L: 31
			return var1; // L: 32
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "23"
	)
	static int method2936(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) { // L: 1634
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) { // L: 1651
				var7 = var2 ? Interpreter.scriptDotWidget : class141.field1644; // L: 1652
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1653
				if (var4 >= 1 && var4 <= 10) { // L: 1654
					class103 var8 = new class103(var4, var7.id, var7.childIndex, var7.itemId); // L: 1657
					Interpreter.field895.add(var8); // L: 1658
					return 1; // L: 1659
				} else {
					throw new RuntimeException(); // L: 1655
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) { // L: 1661
				Interpreter.Interpreter_intStackSize -= 3; // L: 1662
				int var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1663
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1664
				int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 1665
				if (var5 >= 1 && var5 <= 10) { // L: 1666
					class103 var6 = new class103(var5, var3, var4, ArchiveLoader.field1070.method6431(var3).itemId); // L: 1669
					Interpreter.field895.add(var6); // L: 1670
					return 1; // L: 1671
				} else {
					throw new RuntimeException(); // L: 1667
				}
			} else {
				return 2; // L: 1673
			}
		} else if (Interpreter.field896 >= 10) { // L: 1635
			throw new RuntimeException(); // L: 1636
		} else {
			if (var0 >= 2000) { // L: 1639
				var7 = ArchiveLoader.field1070.method6431(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1640
			} else {
				var7 = var2 ? Interpreter.scriptDotWidget : class141.field1644; // L: 1642
			}

			if (var7.onResize == null) { // L: 1643
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent(); // L: 1644
				var9.widget = var7; // L: 1645
				var9.args = var7.onResize; // L: 1646
				var9.field1102 = Interpreter.field896 + 1; // L: 1647
				Client.scriptEvents.addFirst(var9); // L: 1648
				return 1; // L: 1649
			}
		}
	}
}
