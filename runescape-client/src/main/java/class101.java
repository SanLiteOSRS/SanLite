import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ci")
final class class101 implements class301 {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lkz;)V"
	)
	class101(Widget var1) {
		this.val$cc = var1; // L: 518
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1666573426"
	)
	public void vmethod5862() {
		if (this.val$cc != null && this.val$cc.method6228().field3481 != null) { // L: 520
			ScriptEvent var1 = new ScriptEvent(); // L: 521
			var1.method2313(this.val$cc); // L: 522
			var1.setArgs(this.val$cc.method6228().field3481); // L: 523
			class12.method171().addFirst(var1); // L: 524
		}

	} // L: 526

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "([BIIS)Ljava/lang/String;",
		garbageValue = "-26255"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2]; // L: 105
		int var4 = 0; // L: 106

		for (int var5 = 0; var5 < var2; ++var5) { // L: 107
			int var6 = var0[var5 + var1] & 255; // L: 108
			if (var6 != 0) { // L: 109
				if (var6 >= 128 && var6 < 160) { // L: 110
					char var7 = class362.cp1252AsciiExtension[var6 - 128]; // L: 111
					if (var7 == 0) { // L: 112
						var7 = '?';
					}

					var6 = var7; // L: 113
				}

				var3[var4++] = (char)var6; // L: 115
			}
		}

		return new String(var3, 0, var4); // L: 117
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZB)I",
		garbageValue = "42"
	)
	static int method2732(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) { // L: 4194
			class302.Interpreter_intStackSize -= 2; // L: 4195
			var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 4196
			int var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 4197
			if (!Client.isCameraLocked) { // L: 4198
				Client.camAngleX = var3; // L: 4199
				Client.camAngleY = var4; // L: 4200
			}

			return 1; // L: 4202
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) { // L: 4204
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.camAngleX; // L: 4205
			return 1; // L: 4206
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) { // L: 4208
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.camAngleY; // L: 4209
			return 1; // L: 4210
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) { // L: 4212
			var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 4213
			if (var3 < 0) { // L: 4214
				var3 = 0;
			}

			Client.camFollowHeight = var3; // L: 4215
			return 1; // L: 4216
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) { // L: 4218
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.camFollowHeight; // L: 4219
			return 1; // L: 4220
		} else {
			return 2; // L: 4222
		}
	}
}
