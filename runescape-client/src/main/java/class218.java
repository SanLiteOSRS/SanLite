import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
public class class218 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lij;"
	)
	public static class216[] field2412;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "-1881729951"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		return WorldMapData_1.method5345(var0, 10, true); // L: 40
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "-7050902"
	)
	static int method4244(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == 8000) { // L: 5287
			--SoundCache.Interpreter_intStackSize; // L: 5288
			var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 5289
			var4 = Interpreter.Interpreter_arrayLengths[var3]; // L: 5290
			class477.method8446(Interpreter.Interpreter_arrays[var3], new int[var4], 0, var4 - 1); // L: 5291
			return 1; // L: 5292
		} else if (var0 == 8001) { // L: 5294
			SoundCache.Interpreter_intStackSize -= 3; // L: 5295
			var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 5296
			var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 5297
			int var5 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2]; // L: 5298
			int var6 = Interpreter.Interpreter_arrayLengths[var3]; // L: 5299
			if (var6 <= 1) { // L: 5300
				return 1;
			} else {
				class409.method7633(Interpreter.Interpreter_arrays[var3], var6, var4, var5); // L: 5301
				return 1; // L: 5302
			}
		} else {
			return 2; // L: 5304
		}
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-864232113"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1; // L: 4447
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(Lmi;I)V",
		garbageValue = "634496397"
	)
	@Export("invalidateWidget")
	public static void invalidateWidget(Widget var0) {
		if (var0 != null && var0.cycle == Client.field747) { // L: 12099
			Client.field536[var0.rootIndex] = true; // L: 12100
		}

	} // L: 12102
}
