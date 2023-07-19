import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
public class class126 {
	@ObfuscatedName("aw")
	public static final float field1494;
	@ObfuscatedName("ay")
	public static final float field1495;
	@ObfuscatedName("ap")
	static float[] field1492;
	@ObfuscatedName("av")
	static float[] field1491;

	static {
		field1494 = Math.ulp(1.0F); // L: 10
		field1495 = 2.0F * field1494; // L: 11
		field1492 = new float[4]; // L: 12
		field1491 = new float[5]; // L: 13
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-83"
	)
	static boolean method2994(char var0) {
		return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var0) != -1; // L: 1140
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZI)I",
		garbageValue = "2105463740"
	)
	static int method3003(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) { // L: 2862
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2863
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field519.method4285(var3) ? 1 : 0; // L: 2864
			return 1; // L: 2865
		} else if (var0 == 3501) { // L: 2867
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2868
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field519.method4260(var3) ? 1 : 0; // L: 2869
			return 1; // L: 2870
		} else if (var0 == 3502) { // L: 2872
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2873
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field519.method4268(var3) ? 1 : 0; // L: 2874
			return 1; // L: 2875
		} else {
			return 2; // L: 2877
		}
	}

	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "723515974"
	)
	static void method3006(int var0) {
		if (var0 != Client.loginState) { // L: 12844
			Client.loginState = var0; // L: 12845
		}
	} // L: 12846
}
