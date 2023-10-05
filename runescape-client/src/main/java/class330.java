import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("me")
public class class330 implements Comparator {
	class330() {
	} // L: 679

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lmu;Lmu;B)I",
		garbageValue = "1"
	)
	int method6197(class323 var1, class323 var2) {
		return var1.field3494 - var2.field3494; // L: 682
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 690
	}

	public int compare(Object var1, Object var2) {
		return this.method6197((class323)var1, (class323)var2); // L: 686
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZB)I",
		garbageValue = "-1"
	)
	static int method6205(int var0, Script var1, boolean var2) {
		if (var0 == 6754) { // L: 5073
			int var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5074
			NPCComposition var6 = class190.getNpcDefinition(var5); // L: 5075
			Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var6 != null ? var6.name : ""; // L: 5076
			return 1; // L: 5077
		} else {
			NPCComposition var3;
			if (var0 == 6764) { // L: 5079
				Interpreter.Interpreter_intStackSize -= 2; // L: 5080
				var3 = class190.getNpcDefinition(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 5081
				int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 5082
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method3792(var4); // L: 5083
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method3794(var4); // L: 5084
				return 1; // L: 5085
			} else if (var0 == 6765) { // L: 5087
				var3 = class190.getNpcDefinition(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 5088
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 != null ? var3.combatLevel : 0; // L: 5089
				return 1; // L: 5090
			} else {
				return 2; // L: 5092
			}
		}
	}

	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1170534602"
	)
	static void method6204(boolean var0) {
		Client.field745 = var0; // L: 12881
	} // L: 12882
}
