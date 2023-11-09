import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mg")
public class class327 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lnm;B)V",
		garbageValue = "6"
	)
	public static void method6574(AbstractArchive var0) {
		class483.field4968 = var0; // L: 20
	} // L: 21

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZB)I",
		garbageValue = "46"
	)
	static int method6575(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) { // L: 4372
			Interpreter.Interpreter_intStackSize -= 2; // L: 4373
			Client.field758 = (short)VertexNormal.method4909(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 4374
			if (Client.field758 <= 0) { // L: 4375
				Client.field758 = 256;
			}

			Client.field759 = (short)VertexNormal.method4909(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4376
			if (Client.field759 <= 0) { // L: 4377
				Client.field759 = 256;
			}

			return 1; // L: 4378
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) { // L: 4380
			Interpreter.Interpreter_intStackSize -= 2; // L: 4381
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4382
			if (Client.zoomHeight <= 0) { // L: 4383
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4384
			if (Client.zoomWidth <= 0) { // L: 4385
				Client.zoomWidth = 320;
			}

			return 1; // L: 4386
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) { // L: 4388
			Interpreter.Interpreter_intStackSize -= 4; // L: 4389
			Client.field572 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4390
			if (Client.field572 <= 0) { // L: 4391
				Client.field572 = 1;
			}

			Client.field763 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4392
			if (Client.field763 <= 0) { // L: 4393
				Client.field763 = 32767;
			} else if (Client.field763 < Client.field572) { // L: 4394
				Client.field763 = Client.field572;
			}

			Client.field620 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 4395
			if (Client.field620 <= 0) { // L: 4396
				Client.field620 = 1;
			}

			Client.field694 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 4397
			if (Client.field694 <= 0) { // L: 4398
				Client.field694 = 32767;
			} else if (Client.field694 < Client.field620) { // L: 4399
				Client.field694 = Client.field620;
			}

			return 1; // L: 4400
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) { // L: 4402
			if (Client.viewportWidget != null) { // L: 4403
				class36.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false); // L: 4404
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportWidth; // L: 4405
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportHeight; // L: 4406
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4409
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4410
			}

			return 1; // L: 4412
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) { // L: 4414
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomHeight; // L: 4415
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomWidth; // L: 4416
			return 1; // L: 4417
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) { // L: 4419
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SoundSystem.method878(Client.field758); // L: 4420
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SoundSystem.method878(Client.field759); // L: 4421
			return 1; // L: 4422
		} else if (var0 == 6220) { // L: 4424
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4425
			return 1; // L: 4426
		} else if (var0 == 6221) { // L: 4428
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4429
			return 1; // L: 4430
		} else if (var0 == 6222) { // L: 4432
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GameEngine.canvasWidth; // L: 4433
			return 1; // L: 4434
		} else if (var0 == 6223) { // L: 4436
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class262.canvasHeight; // L: 4437
			return 1; // L: 4438
		} else {
			return 2; // L: 4440
		}
	}
}
