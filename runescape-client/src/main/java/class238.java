import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
public class class238 {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-27"
	)
	static String method4767() {
		String var0;
		if (class449.clientPreferences.method2454()) { // L: 243
			String var2 = Login.Login_username; // L: 245
			String var1 = class270.method5493('*', var2.length()); // L: 247
			var0 = var1; // L: 249
		} else {
			var0 = Login.Login_username; // L: 251
		}

		return var0; // L: 252
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1067657553"
	)
	public static boolean method4765(int var0) {
		return (var0 >> 20 & 1) != 0; // L: 17
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZB)I",
		garbageValue = "-50"
	)
	static int method4766(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) { // L: 2865
			var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 2866
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.field674.method4120(var3) ? 1 : 0; // L: 2867
			return 1; // L: 2868
		} else if (var0 == 3501) { // L: 2870
			var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 2871
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.field674.method4110(var3) ? 1 : 0; // L: 2872
			return 1; // L: 2873
		} else if (var0 == 3502) { // L: 2875
			var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 2876
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.field674.method4105(var3) ? 1 : 0; // L: 2877
			return 1; // L: 2878
		} else {
			return 2; // L: 2880
		}
	}
}
