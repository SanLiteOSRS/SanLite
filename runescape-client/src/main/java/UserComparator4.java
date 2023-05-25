import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ej")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("ax")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("af")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpb;Lpb;B)I",
		garbageValue = "54"
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Laq;I)Lac;",
		garbageValue = "502312663"
	)
	public static class3 method2883(class6 var0) {
		switch(var0.field18) { // L: 9
		case 0:
			return new class0(); // L: 16
		default:
			throw new IllegalArgumentException(); // L: 12
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)[Ldj;",
		garbageValue = "32"
	)
	static AttackOption[] method2885() {
		return new AttackOption[]{AttackOption.field1307, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_alwaysRightClick, AttackOption.field1303, AttackOption.AttackOption_hidden}; // L: 12290
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZI)I",
		garbageValue = "-1691226639"
	)
	static int method2878(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) { // L: 4296
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferNameComparator.getWindowedMode(); // L: 4297
			return 1; // L: 4298
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) { // L: 4300
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4301
				if (var3 == 1 || var3 == 2) { // L: 4302
					Decimator.setWindowedMode(var3);
				}

				return 1; // L: 4303
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) { // L: 4305
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class20.clientPreferences.method2471(); // L: 4306
				return 1; // L: 4307
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) { // L: 4309
				if (var0 == 5310) { // L: 4316
					--Interpreter.Interpreter_intStackSize; // L: 4317
					return 1; // L: 4318
				} else {
					return 2; // L: 4320
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4310
				if (var3 == 1 || var3 == 2) { // L: 4311
					class20.clientPreferences.method2470(var3); // L: 4312
				}

				return 1; // L: 4314
			}
		}
	}

	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "(Lsg;IB)V",
		garbageValue = "-18"
	)
	static void method2868(Buffer var0, int var1) {
		byte[] var2 = var0.array; // L: 12135
		if (Client.randomDatData == null) { // L: 12137
			Client.randomDatData = new byte[24];
		}

		class384.writeRandomDat(var2, var1, Client.randomDatData, 0, 24); // L: 12138
		class179.method3631(var0, var1); // L: 12140
	} // L: 12141
}
