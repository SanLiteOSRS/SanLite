import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("et")
public class class151 extends class155 {
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1413057797
	)
	static int field1743;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("archive11")
	static Archive archive11;
	@ObfuscatedName("f")
	String field1744;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1914806007
	)
	int field1748;
	@ObfuscatedName("v")
	byte field1745;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class156 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class151(class156 var1) {
		this.this$0 = var1;
		this.field1744 = null; // L: 55
	} // L: 59

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lrd;B)V",
		garbageValue = "-123"
	)
	void vmethod3387(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 62
			--var1.offset; // L: 63
			var1.readLong(); // L: 64
		}

		this.field1744 = var1.readStringCp1252NullTerminatedOrNull(); // L: 66
		this.field1748 = var1.readUnsignedShort(); // L: 67
		this.field1745 = var1.readByte(); // L: 68
		var1.readLong(); // L: 69
	} // L: 70

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lfm;I)V",
		garbageValue = "127147356"
	)
	void vmethod3388(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember(); // L: 73
		var2.username = new Username(this.field1744); // L: 74
		var2.world = this.field1748; // L: 75
		var2.rank = this.field1745; // L: 76
		var1.addMember(var2); // L: 77
	} // L: 78

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I",
		garbageValue = "-1068248433"
	)
	static int method3302(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) { // L: 2647
			class302.Interpreter_intStackSize -= 2; // L: 2648
			var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 2649
			var9 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 2650
			EnumComposition var10 = UserComparator10.getEnum(var3); // L: 2651
			if (var10.outputType != 's') { // L: 2652
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) { // L: 2653
				if (var9 == var10.keys[var6]) { // L: 2654
					Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var10.strVals[var6]; // L: 2655
					var10 = null; // L: 2656
					break;
				}
			}

			if (var10 != null) { // L: 2660
				Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1; // L: 2661
		} else if (var0 != ScriptOpcodes.ENUM) { // L: 2663
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) { // L: 2689
				var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 2690
				EnumComposition var4 = UserComparator10.getEnum(var3); // L: 2691
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4.size(); // L: 2692
				return 1; // L: 2693
			} else {
				return 2; // L: 2695
			}
		} else {
			class302.Interpreter_intStackSize -= 4; // L: 2664
			var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 2665
			var9 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 2666
			int var5 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2]; // L: 2667
			var6 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 3]; // L: 2668
			EnumComposition var7 = UserComparator10.getEnum(var5); // L: 2669
			if (var3 == var7.inputType && var9 == var7.outputType) { // L: 2670
				for (int var8 = 0; var8 < var7.outputCount; ++var8) { // L: 2675
					if (var6 == var7.keys[var8]) { // L: 2676
						if (var9 == 115) { // L: 2677
							Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7.intVals[var8]; // L: 2678
						}

						var7 = null; // L: 2679
						break;
					}
				}

				if (var7 != null) { // L: 2683
					if (var9 == 115) { // L: 2684
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7.defaultInt; // L: 2685
					}
				}

				return 1; // L: 2687
			} else {
				if (var9 == 115) { // L: 2671
					Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 2672
				}

				return 1; // L: 2673
			}
		}
	}
}
