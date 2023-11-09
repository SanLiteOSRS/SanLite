import java.util.BitSet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mz")
public class class318 extends Node {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1329856589
	)
	int field3524;
	@ObfuscatedName("aj")
	BitSet field3522;

	class318(int var1) {
		this.field3524 = var1; // L: 11
		this.field3522 = new BitSet(128); // L: 12
	} // L: 13

	@ObfuscatedName("ap")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L); // L: 68
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZB)I",
		garbageValue = "20"
	)
	static int method6084(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) { // L: 4372
			Interpreter.Interpreter_intStackSize -= 2; // L: 4373
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4374
			int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4375
			if (!Client.isCameraLocked) { // L: 4376
				Client.camAngleX = var3; // L: 4377
				Client.camAngleY = var4; // L: 4378
			}

			return 1; // L: 4380
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) { // L: 4382
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleX; // L: 4383
			return 1; // L: 4384
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) { // L: 4386
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleY; // L: 4387
			return 1; // L: 4388
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) { // L: 4390
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4391
			if (var3 < 0) { // L: 4392
				var3 = 0;
			}

			Client.camFollowHeight = var3; // L: 4393
			return 1; // L: 4394
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) { // L: 4396
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camFollowHeight; // L: 4397
			return 1; // L: 4398
		} else {
			return 2; // L: 4400
		}
	}
}
