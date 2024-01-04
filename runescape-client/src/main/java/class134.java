import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fe")
class class134 implements Callable {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lup;"
	)
	static IndexedSprite[] field1580;
	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "[Lup;"
	)
	static IndexedSprite[] field1582;
	@ObfuscatedName("uc")
	@ObfuscatedGetter(
		intValue = -2047858965
	)
	static int field1581;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	final class139 this$0;
	// $FF: synthetic field
	final int val$workStart;
	// $FF: synthetic field
	final int val$workEnd;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "[Lfd;"
	)
	final class130[] val$curveLoadJobs;

	@ObfuscatedSignature(
		descriptor = "(Lfo;II[Lfd;)V"
	)
	class134(class139 var1, int var2, int var3, class130[] var4) {
		this.this$0 = var1; // L: 145
		this.val$workStart = var2;
		this.val$workEnd = var3;
		this.val$curveLoadJobs = var4;
	}

	public Object call() {
		for (int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) { // L: 148
			this.val$curveLoadJobs[var1].call(); // L: 149
		}

		return null; // L: 151
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "392757608"
	)
	static boolean method3146(int var0, int var1, int var2) {
		return var0 >= 0 && var0 < 4 && var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104; // L: 16
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1168679162"
	)
	public static int method3149(int var0) {
		return (var0 & class520.field5086) - 1; // L: 26
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1497825445"
	)
	static int method3148(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) { // L: 4438
			class517.Interpreter_intStackSize -= 2; // L: 4439
			Client.field760 = (short)class354.method6859(Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]); // L: 4440
			if (Client.field760 <= 0) { // L: 4441
				Client.field760 = 256;
			}

			Client.field761 = (short)class354.method6859(Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]); // L: 4442
			if (Client.field761 <= 0) { // L: 4443
				Client.field761 = 256;
			}

			return 1; // L: 4444
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) { // L: 4446
			class517.Interpreter_intStackSize -= 2; // L: 4447
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 4448
			if (Client.zoomHeight <= 0) { // L: 4449
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 4450
			if (Client.zoomWidth <= 0) { // L: 4451
				Client.zoomWidth = 320;
			}

			return 1; // L: 4452
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) { // L: 4454
			class517.Interpreter_intStackSize -= 4; // L: 4455
			Client.field764 = (short)Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 4456
			if (Client.field764 <= 0) { // L: 4457
				Client.field764 = 1;
			}

			Client.field765 = (short)Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 4458
			if (Client.field765 <= 0) { // L: 4459
				Client.field765 = 32767;
			} else if (Client.field765 < Client.field764) { // L: 4460
				Client.field765 = Client.field764;
			}

			Client.field531 = (short)Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 2]; // L: 4461
			if (Client.field531 <= 0) { // L: 4462
				Client.field531 = 1;
			}

			Client.field722 = (short)Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 3]; // L: 4463
			if (Client.field722 <= 0) { // L: 4464
				Client.field722 = 32767;
			} else if (Client.field722 < Client.field531) { // L: 4465
				Client.field722 = Client.field531;
			}

			return 1; // L: 4466
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) { // L: 4468
			if (Client.viewportWidget != null) { // L: 4469
				class348.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false); // L: 4470
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.viewportWidth; // L: 4471
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.viewportHeight; // L: 4472
			} else {
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1; // L: 4475
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1; // L: 4476
			}

			return 1; // L: 4478
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) { // L: 4480
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.zoomHeight; // L: 4481
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.zoomWidth; // L: 4482
			return 1; // L: 4483
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) { // L: 4485
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class142.method3220(Client.field760); // L: 4486
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class142.method3220(Client.field761); // L: 4487
			return 1; // L: 4488
		} else if (var0 == 6220) { // L: 4490
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 4491
			return 1; // L: 4492
		} else if (var0 == 6221) { // L: 4494
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 4495
			return 1; // L: 4496
		} else if (var0 == 6222) { // L: 4498
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Language.canvasWidth; // L: 4499
			return 1; // L: 4500
		} else if (var0 == 6223) { // L: 4502
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class47.canvasHeight; // L: 4503
			return 1; // L: 4504
		} else {
			return 2; // L: 4506
		}
	}
}
