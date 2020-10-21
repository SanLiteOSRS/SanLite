import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fz")
public enum class169 implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lfz;"
	)
	field2033(2, 0),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lfz;"
	)
	field2029(0, 1),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lfz;"
	)
	field2028(1, 2),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lfz;"
	)
	field2034(3, 3);

	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1161977131
	)
	static int field2035;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1105831857
	)
	public final int field2032;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1075265281
	)
	@Export("id")
	final int id;

	class169(int var3, int var4) {
		this.field2032 = var3;
		this.id = var4;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "23"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "19136995"
	)
	public static void method3571(int var0, int var1) {
		VarbitComposition var3 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
		VarbitComposition var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			byte[] var8 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
			var3 = new VarbitComposition();
			if (var8 != null) {
				var3.decode(new Buffer(var8));
			}

			VarbitComposition.VarbitDefinition_cached.put(var3, (long)var0);
			var2 = var3;
		}

		int var4 = var2.baseVar;
		int var5 = var2.startBit;
		int var6 = var2.endBit;
		int var7 = Varps.Varps_masks[var6 - var5];
		if (var1 < 0 || var1 > var7) {
			var1 = 0;
		}

		var7 <<= var5;
		Varps.Varps_main[var4] = Varps.Varps_main[var4] & ~var7 | var1 << var5 & var7;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		signature = "(ILco;ZB)I",
		garbageValue = "-118"
	)
	static int method3572(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) {
			MilliClock.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
			int var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
			if (!Client.isCameraLocked) {
				Client.camAngleX = var3;
				Client.camAngleY = var4;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) {
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.camAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) {
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.camAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
			var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
			if (var3 < 0) {
				var3 = 0;
			}

			Client.camFollowHeight = var3;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.camFollowHeight;
			return 1;
		} else {
			return 2;
		}
	}
}
