import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cv")
public class class67 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field519;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field495;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field496;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field497;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field498;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field499;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field500;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field494;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field502;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field503;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field504;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field505;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field511;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field506;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field501;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field509;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field518;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field508;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field512;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field513;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field507;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field515;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field516;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field517;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field514;

	static {
		field519 = new class67(); // L: 13045
		field495 = new class67(); // L: 13046
		field496 = new class67(); // L: 13047
		field497 = new class67(); // L: 13048
		field498 = new class67(); // L: 13049
		field499 = new class67(); // L: 13050
		field500 = new class67(); // L: 13051
		field494 = new class67(); // L: 13052
		field502 = new class67(); // L: 13053
		field503 = new class67(); // L: 13054
		field504 = new class67(); // L: 13055
		field505 = new class67(); // L: 13056
		field511 = new class67(); // L: 13057
		field506 = new class67(); // L: 13058
		field501 = new class67(); // L: 13059
		field509 = new class67(); // L: 13060
		field518 = new class67(); // L: 13061
		field508 = new class67(); // L: 13062
		field512 = new class67(); // L: 13063
		field513 = new class67(); // L: 13064
		field507 = new class67(); // L: 13065
		field515 = new class67(); // L: 13066
		field516 = new class67(); // L: 13067
		field517 = new class67(); // L: 13068
		field514 = new class67(); // L: 13069
	}

	class67() {
	} // L: 13071

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "1635168506"
	)
	static int method1207(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) { // L: 4421
			Interpreter.Interpreter_intStackSize -= 2; // L: 4422
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4423
			int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4424
			if (!Client.isCameraLocked) { // L: 4425
				Client.camAngleX = var3; // L: 4426
				Client.camAngleY = var4; // L: 4427
			}

			return 1; // L: 4429
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) { // L: 4431
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleX; // L: 4432
			return 1; // L: 4433
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) { // L: 4435
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleY; // L: 4436
			return 1; // L: 4437
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) { // L: 4439
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4440
			if (var3 < 0) { // L: 4441
				var3 = 0;
			}

			Client.camFollowHeight = var3; // L: 4442
			return 1; // L: 4443
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) { // L: 4445
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camFollowHeight; // L: 4446
			return 1; // L: 4447
		} else {
			return 2; // L: 4449
		}
	}

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "689752090"
	)
	static void method1206() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) { // L: 12241
			int var1 = var0.group; // L: 12242
			if (ArchiveLoader.field1070.method6437(var1)) { // L: 12243
				boolean var2 = true; // L: 12244
				Widget[] var3 = ArchiveLoader.field1070.field3633[var1]; // L: 12245

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) { // L: 12246
					if (var3[var4] != null) { // L: 12247
						var2 = var3[var4].isIf3; // L: 12248
						break;
					}
				}

				if (!var2) { // L: 12252
					var4 = (int)var0.key; // L: 12253
					Widget var5 = ArchiveLoader.field1070.method6431(var4); // L: 12254
					if (var5 != null) { // L: 12255
						UserComparator5.invalidateWidget(var5);
					}
				}
			}
		}

	} // L: 12259
}
