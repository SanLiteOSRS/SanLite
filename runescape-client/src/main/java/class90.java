import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dc")
public enum class90 implements class371 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	field1105(0, -1),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	field1099(1, 2),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	field1100(2, 3),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	field1101(3, 4),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	field1102(4, 5),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	field1103(5, 6);

	@ObfuscatedName("ul")
	@ObfuscatedGetter(
		intValue = -1608269824
	)
	static int field1106;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1861856329
	)
	final int field1107;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -72379757
	)
	final int field1098;

	class90(int var3, int var4) {
		this.field1107 = var3; // L: 21
		this.field1098 = var4; // L: 22
	} // L: 23

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1233989967"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1098; // L: 27
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lav;I)Law;",
		garbageValue = "-1926603343"
	)
	public static class3 method2341(class6 var0) {
		switch(var0.field16) { // L: 9
		case 0:
			return new class0(); // L: 12
		default:
			throw new IllegalArgumentException(); // L: 16
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-873279933"
	)
	public static void method2339(int var0, int var1) {
		class305.field3401 = var0; // L: 102
		class305.field3400 = var1; // L: 103
		class305.field3403 = 0; // L: 104
		class305.field3402 = 0; // L: 105
		class305.field3398.clear(); // L: 107
		if (!class305.field3397.isEmpty() && (var0 != 0 || var1 != 0)) { // L: 108
			class305.field3393.add(new class402((class406)null, class305.field3401)); // L: 109
			class305.field3393.add(new class404((class406)null, 0, false, class305.field3400)); // L: 110
		}

		ArrayList var3 = new ArrayList(); // L: 114
		Iterator var4 = class305.field3397.iterator(); // L: 115

		while (var4.hasNext()) {
			class317 var5 = (class317)var4.next(); // L: 116
			var3.add(var5); // L: 118
		}

		class305.field3393.add(new class401((class406)null, var3)); // L: 124
	} // L: 125

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZB)I",
		garbageValue = "1"
	)
	static int method2342(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) { // L: 4420
			Interpreter.Interpreter_intStackSize -= 2; // L: 4421
			Client.field769 = (short)GroundObject.method4466(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 4422
			if (Client.field769 <= 0) { // L: 4423
				Client.field769 = 256;
			}

			Client.field585 = (short)GroundObject.method4466(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4424
			if (Client.field585 <= 0) { // L: 4425
				Client.field585 = 256;
			}

			return 1; // L: 4426
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) { // L: 4428
			Interpreter.Interpreter_intStackSize -= 2; // L: 4429
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4430
			if (Client.zoomHeight <= 0) { // L: 4431
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4432
			if (Client.zoomWidth <= 0) { // L: 4433
				Client.zoomWidth = 320;
			}

			return 1; // L: 4434
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) { // L: 4436
			Interpreter.Interpreter_intStackSize -= 4; // L: 4437
			Client.field612 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4438
			if (Client.field612 <= 0) { // L: 4439
				Client.field612 = 1;
			}

			Client.field774 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4440
			if (Client.field774 <= 0) { // L: 4441
				Client.field774 = 32767;
			} else if (Client.field774 < Client.field612) { // L: 4442
				Client.field774 = Client.field612;
			}

			Client.field775 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 4443
			if (Client.field775 <= 0) { // L: 4444
				Client.field775 = 1;
			}

			Client.field542 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 4445
			if (Client.field542 <= 0) { // L: 4446
				Client.field542 = 32767;
			} else if (Client.field542 < Client.field775) { // L: 4447
				Client.field542 = Client.field775;
			}

			return 1; // L: 4448
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) { // L: 4450
			if (Client.viewportWidget != null) { // L: 4451
				class344.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false); // L: 4452
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportWidth; // L: 4453
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportHeight; // L: 4454
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4457
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4458
			}

			return 1; // L: 4460
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) { // L: 4462
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomHeight; // L: 4463
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomWidth; // L: 4464
			return 1; // L: 4465
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) { // L: 4467
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class153.method3272(Client.field769); // L: 4468
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class153.method3272(Client.field585); // L: 4469
			return 1; // L: 4470
		} else if (var0 == 6220) { // L: 4472
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4473
			return 1; // L: 4474
		} else if (var0 == 6221) { // L: 4476
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4477
			return 1; // L: 4478
		} else if (var0 == 6222) { // L: 4480
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = VarbitComposition.canvasWidth; // L: 4481
			return 1; // L: 4482
		} else if (var0 == 6223) { // L: 4484
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class370.canvasHeight; // L: 4485
			return 1; // L: 4486
		} else {
			return 2; // L: 4488
		}
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-234809875"
	)
	static boolean method2343() {
		return (Client.drawPlayerNames & 2) != 0; // L: 5271
	}
}
