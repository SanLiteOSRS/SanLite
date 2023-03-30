import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cx")
final class class69 implements ThreadFactory {
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load"); // L: 12374
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZB)I",
		garbageValue = "48"
	)
	static int method2039(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) { // L: 4275
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class7.getWindowedMode(); // L: 4276
			return 1; // L: 4277
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) { // L: 4279
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4280
				if (var3 == 1 || var3 == 2) { // L: 4281
					NPC.setWindowedMode(var3);
				}

				return 1; // L: 4282
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) { // L: 4284
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSectionType.clientPreferences.method2450(); // L: 4285
				return 1; // L: 4286
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) { // L: 4288
				if (var0 == 5310) { // L: 4295
					--Interpreter.Interpreter_intStackSize; // L: 4296
					return 1; // L: 4297
				} else {
					return 2; // L: 4299
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4289
				if (var3 == 1 || var3 == 2) { // L: 4290
					WorldMapSectionType.clientPreferences.method2510(var3); // L: 4291
				}

				return 1; // L: 4293
			}
		}
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(Lmy;B)V",
		garbageValue = "2"
	)
	@Export("invalidateWidget")
	public static void invalidateWidget(Widget var0) {
		if (var0 != null && var0.cycle == Client.field695) { // L: 11521
			Client.field722[var0.rootIndex] = true; // L: 11522
		}

	} // L: 11524
}
