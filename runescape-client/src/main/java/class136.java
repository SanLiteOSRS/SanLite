import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ew")
public class class136 extends class135 {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static Widget field1589;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1922783559
	)
	int field1587;
	@ObfuscatedName("f")
	boolean field1588;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	final class138 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lel;)V"
	)
	class136(class138 var1) {
		this.this$0 = var1;
		this.field1587 = -1; // L: 178
	} // L: 181

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-1428026624"
	)
	void vmethod3254(Buffer var1) {
		this.field1587 = var1.readUnsignedShort(); // L: 184
		this.field1588 = var1.readUnsignedByte() == 1; // L: 185
	} // L: 186

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ler;B)V",
		garbageValue = "-110"
	)
	void vmethod3248(ClanSettings var1) {
		var1.method3102(this.field1587, this.field1588); // L: 189
	} // L: 190

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZS)I",
		garbageValue = "3789"
	)
	static int method2991(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) { // L: 2654
			class379.Interpreter_intStackSize -= 2; // L: 2655
			var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 2656
			var9 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 2657
			EnumComposition var10 = Clock.getEnum(var3); // L: 2658
			if (var10.outputType != 's') { // L: 2659
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) { // L: 2660
				if (var9 == var10.keys[var6]) { // L: 2661
					Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var10.strVals[var6]; // L: 2662
					var10 = null; // L: 2663
					break;
				}
			}

			if (var10 != null) { // L: 2667
				Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1; // L: 2668
		} else if (var0 != ScriptOpcodes.ENUM) { // L: 2670
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) { // L: 2696
				var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 2697
				EnumComposition var4 = Clock.getEnum(var3); // L: 2698
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4.size(); // L: 2699
				return 1; // L: 2700
			} else {
				return 2; // L: 2702
			}
		} else {
			class379.Interpreter_intStackSize -= 4; // L: 2671
			var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 2672
			var9 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 2673
			int var5 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2]; // L: 2674
			var6 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 3]; // L: 2675
			EnumComposition var7 = Clock.getEnum(var5); // L: 2676
			if (var3 == var7.inputType && var9 == var7.outputType) { // L: 2677
				for (int var8 = 0; var8 < var7.outputCount; ++var8) { // L: 2682
					if (var6 == var7.keys[var8]) { // L: 2683
						if (var9 == 115) { // L: 2684
							Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7.intVals[var8]; // L: 2685
						}

						var7 = null; // L: 2686
						break;
					}
				}

				if (var7 != null) { // L: 2690
					if (var9 == 115) { // L: 2691
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7.defaultInt; // L: 2692
					}
				}

				return 1; // L: 2694
			} else {
				if (var9 == 115) { // L: 2678
					Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 2679
				}

				return 1; // L: 2680
			}
		}
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(Lkn;Lgp;IIZI)V",
		garbageValue = "1315594698"
	)
	@Export("addWidgetItemMenuItem")
	static final void addWidgetItemMenuItem(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
		String[] var5 = var1.inventoryActions; // L: 11096
		byte var6 = -1; // L: 11097
		String var7 = null; // L: 11098
		if (var5 != null && var5[var3] != null) { // L: 11099
			if (var3 == 0) { // L: 11100
				var6 = 33;
			} else if (var3 == 1) { // L: 11101
				var6 = 34;
			} else if (var3 == 2) {
				var6 = 35; // L: 11102
			} else if (var3 == 3) { // L: 11103
				var6 = 36;
			} else {
				var6 = 37; // L: 11104
			}

			var7 = var5[var3]; // L: 11105
		} else if (var3 == 4) { // L: 11108
			var6 = 37; // L: 11109
			var7 = "Drop"; // L: 11110
		}

		if (var6 != -1 && var7 != null) { // L: 11113
			UserComparator8.method2744(var7, GameObject.colorStartTag(16748608) + var1.name, var6, 0, var2, var0.id, var1.id, var4); // L: 11114
		}

	} // L: 11116
}
