import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cw")
public class class82 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIIB)V",
		garbageValue = "-111"
	)
	@Export("sortItemsByName")
	public static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 9
			int var4 = (var3 + var2) / 2; // L: 10
			int var5 = var2; // L: 11
			String var6 = var0[var4]; // L: 12
			var0[var4] = var0[var3]; // L: 13
			var0[var3] = var6; // L: 14
			short var7 = var1[var4]; // L: 15
			var1[var4] = var1[var3]; // L: 16
			var1[var3] = var7; // L: 17

			for (int var8 = var2; var8 < var3; ++var8) { // L: 18
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) { // L: 19
					String var9 = var0[var8]; // L: 20
					var0[var8] = var0[var5]; // L: 21
					var0[var5] = var9; // L: 22
					short var10 = var1[var8]; // L: 23
					var1[var8] = var1[var5]; // L: 24
					var1[var5++] = var10; // L: 25
				}
			}

			var0[var3] = var0[var5]; // L: 29
			var0[var5] = var6; // L: 30
			var1[var3] = var1[var5]; // L: 31
			var1[var5] = var7; // L: 32
			sortItemsByName(var0, var1, var2, var5 - 1); // L: 33
			sortItemsByName(var0, var1, var5 + 1, var3); // L: 34
		}

	} // L: 36

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZI)I",
		garbageValue = "1832001725"
	)
	static int method2248(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) { // L: 4183
			class87.Interpreter_intStackSize -= 2; // L: 4184
			var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 4185
			int var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 4186
			if (!Client.isCameraLocked) { // L: 4187
				Client.camAngleX = var3; // L: 4188
				Client.camAngleY = var4; // L: 4189
			}

			return 1; // L: 4191
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) { // L: 4193
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.camAngleX; // L: 4194
			return 1; // L: 4195
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) { // L: 4197
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.camAngleY; // L: 4198
			return 1; // L: 4199
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) { // L: 4201
			var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 4202
			if (var3 < 0) { // L: 4203
				var3 = 0;
			}

			Client.camFollowHeight = var3; // L: 4204
			return 1; // L: 4205
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) { // L: 4207
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.camFollowHeight; // L: 4208
			return 1; // L: 4209
		} else {
			return 2; // L: 4211
		}
	}
}
