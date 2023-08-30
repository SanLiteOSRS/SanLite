import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("rj")
public class class448 {
	@ObfuscatedName("au")
	float field4726;
	@ObfuscatedName("ae")
	float field4725;
	@ObfuscatedName("ao")
	float field4727;

	static {
		new class448(0.0F, 0.0F, 0.0F); // L: 5
		new class448(1.0F, 1.0F, 1.0F); // L: 9
		new class448(1.0F, 0.0F, 0.0F); // L: 13
		new class448(0.0F, 1.0F, 0.0F); // L: 17
		new class448(0.0F, 0.0F, 1.0F); // L: 21
		WorldMapArea.method5176(100); // L: 25
	} // L: 26

	class448(float var1, float var2, float var3) {
		this.field4726 = var1; // L: 35
		this.field4725 = var2; // L: 36
		this.field4727 = var3; // L: 37
	} // L: 38

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "36"
	)
	final float method8152() {
		return (float)Math.sqrt((double)(this.field4726 * this.field4726 + this.field4725 * this.field4725 + this.field4727 * this.field4727)); // L: 41
	}

	public String toString() {
		return this.field4726 + ", " + this.field4725 + ", " + this.field4727; // L: 46
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "853635809"
	)
	static int method8160(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) { // L: 4423
			SoundCache.Interpreter_intStackSize -= 2; // L: 4424
			Client.field800 = (short)class155.method3248(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]); // L: 4425
			if (Client.field800 <= 0) { // L: 4426
				Client.field800 = 256;
			}

			Client.field685 = (short)class155.method3248(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]); // L: 4427
			if (Client.field685 <= 0) { // L: 4428
				Client.field685 = 256;
			}

			return 1; // L: 4429
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) { // L: 4431
			SoundCache.Interpreter_intStackSize -= 2; // L: 4432
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 4433
			if (Client.zoomHeight <= 0) { // L: 4434
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 4435
			if (Client.zoomWidth <= 0) { // L: 4436
				Client.zoomWidth = 320;
			}

			return 1; // L: 4437
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) { // L: 4439
			SoundCache.Interpreter_intStackSize -= 4; // L: 4440
			Client.field804 = (short)Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 4441
			if (Client.field804 <= 0) { // L: 4442
				Client.field804 = 1;
			}

			Client.field635 = (short)Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 4443
			if (Client.field635 <= 0) { // L: 4444
				Client.field635 = 32767;
			} else if (Client.field635 < Client.field804) { // L: 4445
				Client.field635 = Client.field804;
			}

			Client.field806 = (short)Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2]; // L: 4446
			if (Client.field806 <= 0) { // L: 4447
				Client.field806 = 1;
			}

			Client.field807 = (short)Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 3]; // L: 4448
			if (Client.field807 <= 0) { // L: 4449
				Client.field807 = 32767;
			} else if (Client.field807 < Client.field806) { // L: 4450
				Client.field807 = Client.field806;
			}

			return 1; // L: 4451
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) { // L: 4453
			if (Client.viewportWidget != null) { // L: 4454
				GrandExchangeOfferOwnWorldComparator.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false); // L: 4455
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.viewportWidth; // L: 4456
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.viewportHeight; // L: 4457
			} else {
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1; // L: 4460
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1; // L: 4461
			}

			return 1; // L: 4463
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) { // L: 4465
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.zoomHeight; // L: 4466
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.zoomWidth; // L: 4467
			return 1; // L: 4468
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) { // L: 4470
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class332.method6542(Client.field800); // L: 4471
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class332.method6542(Client.field685); // L: 4472
			return 1; // L: 4473
		} else if (var0 == 6220) { // L: 4475
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 4476
			return 1; // L: 4477
		} else if (var0 == 6221) { // L: 4479
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 4480
			return 1; // L: 4481
		} else if (var0 == 6222) { // L: 4483
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class113.canvasWidth; // L: 4484
			return 1; // L: 4485
		} else if (var0 == 6223) { // L: 4487
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class177.canvasHeight; // L: 4488
			return 1; // L: 4489
		} else {
			return 2; // L: 4491
		}
	}
}
