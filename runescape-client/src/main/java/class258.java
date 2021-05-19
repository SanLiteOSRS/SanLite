import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ib")
public class class258 {
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "-76"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + DirectByteArrayCopier.charToByteCp1252(var0.charAt(var3));
		}

		return var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "209273359"
	)
	static int method4787(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) {
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = HitSplatDefinition.getWindowedMode();
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) {
				var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					class374.setWindowedMode(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = class12.clientPreferences.windowMode;
				return 1;
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
				if (var0 == 5310) {
					--WorldMapCacheName.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5350) {
					class13.Interpreter_stringStackSize -= 2;
					--WorldMapCacheName.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5351) {
					--class13.Interpreter_stringStackSize;
					return 1;
				} else {
					return 2;
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					class12.clientPreferences.windowMode = var3;
					KeyHandler.savePreferences();
				}

				return 1;
			}
		}
	}
}
