import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bn")
public class class33 {
	@ObfuscatedName("jn")
	@Export("regions")
	static int[] regions;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1247328515
	)
	int field177;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -764887695
	)
	int field173;

	class33(int var1, int var2) {
		this.field177 = var1; // L: 14
		this.field173 = var2; // L: 15
	} // L: 16

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lbt;I)Z",
		garbageValue = "-1051519216"
	)
	boolean method490(class29 var1) {
		if (var1 == null) { // L: 19
			return false;
		} else {
			switch(this.field177) { // L: 20
			case 1:
				return var1.vmethod4418(this.field173); // L: 30
			case 2:
				return var1.vmethod4460(this.field173); // L: 24
			case 3:
				return var1.vmethod4420((char)this.field173); // L: 22
			case 4:
				return var1.vmethod4422(this.field173 == 1); // L: 26
			default:
				return false; // L: 28
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1381424190"
	)
	public static void method495() {
		InvDefinition.InvDefinition_cached.clear(); // L: 44
	} // L: 45

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "459990555"
	)
	static int method494(int var0, Script var1, boolean var2) {
		Widget var3 = class380.field4414.method6348(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]); // L: 1677
		if (var0 == ScriptOpcodes.IF_GETX) { // L: 1678
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.x; // L: 1679
			return 1; // L: 1680
		} else if (var0 == ScriptOpcodes.IF_GETY) { // L: 1682
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.y; // L: 1683
			return 1; // L: 1684
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) { // L: 1686
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.width; // L: 1687
			return 1; // L: 1688
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) { // L: 1690
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.height; // L: 1691
			return 1; // L: 1692
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) { // L: 1694
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1695
			return 1; // L: 1696
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) { // L: 1698
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.parentId; // L: 1699
			return 1; // L: 1700
		} else {
			return 2; // L: 1702
		}
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2022690739"
	)
	static void method489() {
		class10.field37 = System.getenv("JX_ACCESS_TOKEN"); // L: 940
		class4.field4 = System.getenv("JX_REFRESH_TOKEN"); // L: 941
		ClanChannel.field1765 = System.getenv("JX_SESSION_ID"); // L: 942
		class60.field437 = System.getenv("JX_CHARACTER_ID"); // L: 943
		String var0 = System.getenv("JX_DISPLAY_NAME"); // L: 944
		Login.field926 = MidiPcmStream.method6176(var0); // L: 946
	} // L: 948
}
