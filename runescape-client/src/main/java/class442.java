import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("rl")
class class442 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	final class443 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lrt;)V"
	)
	class442(class443 var1) {
		this.this$0 = var1; // L: 7
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lrv;Lrv;I)I",
		garbageValue = "-841356644"
	)
	int method7996(class444 var1, class444 var2) {
		if (var1.field4760 > var2.field4760) { // L: 9
			return 1;
		} else {
			return var1.field4760 < var2.field4760 ? -1 : 0; // L: 10 11
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 19
	}

	public int compare(Object var1, Object var2) {
		return this.method7996((class444)var1, (class444)var2); // L: 15
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZB)I",
		garbageValue = "-97"
	)
	public static int method8005(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 86
			boolean var3 = false; // L: 87
			boolean var4 = false; // L: 88
			int var5 = 0; // L: 89
			int var6 = var0.length(); // L: 90

			for (int var7 = 0; var7 < var6; ++var7) { // L: 91
				char var8 = var0.charAt(var7); // L: 92
				if (var7 == 0) { // L: 93
					if (var8 == '-') { // L: 94
						var3 = true; // L: 95
						continue;
					}

					if (var8 == '+') { // L: 98
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 100
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 101
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 102
						throw new NumberFormatException(); // L: 103
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 104
					throw new NumberFormatException();
				}

				if (var3) { // L: 105
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10; // L: 106
				if (var9 / var1 != var5) { // L: 107
					throw new NumberFormatException();
				}

				var5 = var9; // L: 108
				var4 = true; // L: 109
			}

			if (!var4) { // L: 111
				throw new NumberFormatException();
			} else {
				return var5; // L: 112
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZB)I",
		garbageValue = "15"
	)
	static int method8004(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) { // L: 4480
			class19.Interpreter_intStackSize -= 2; // L: 4481
			Client.field785 = (short)GrandExchangeOfferTotalQuantityComparator.method7092(Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]); // L: 4482
			if (Client.field785 <= 0) { // L: 4483
				Client.field785 = 256;
			}

			Client.field786 = (short)GrandExchangeOfferTotalQuantityComparator.method7092(Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]); // L: 4484
			if (Client.field786 <= 0) { // L: 4485
				Client.field786 = 256;
			}

			return 1; // L: 4486
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) { // L: 4488
			class19.Interpreter_intStackSize -= 2; // L: 4489
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 4490
			if (Client.zoomHeight <= 0) { // L: 4491
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 4492
			if (Client.zoomWidth <= 0) { // L: 4493
				Client.zoomWidth = 320;
			}

			return 1; // L: 4494
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) { // L: 4496
			class19.Interpreter_intStackSize -= 4; // L: 4497
			Client.field789 = (short)Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 4498
			if (Client.field789 <= 0) { // L: 4499
				Client.field789 = 1;
			}

			Client.field728 = (short)Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 4500
			if (Client.field728 <= 0) { // L: 4501
				Client.field728 = 32767;
			} else if (Client.field728 < Client.field789) { // L: 4502
				Client.field728 = Client.field789;
			}

			Client.field791 = (short)Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 2]; // L: 4503
			if (Client.field791 <= 0) { // L: 4504
				Client.field791 = 1;
			}

			Client.field792 = (short)Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 3]; // L: 4505
			if (Client.field792 <= 0) { // L: 4506
				Client.field792 = 32767;
			} else if (Client.field792 < Client.field791) { // L: 4507
				Client.field792 = Client.field791;
			}

			return 1; // L: 4508
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) { // L: 4510
			if (Client.viewportWidget != null) { // L: 4511
				SecureRandomFuture.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false); // L: 4512
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Client.viewportWidth; // L: 4513
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Client.viewportHeight; // L: 4514
			} else {
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = -1; // L: 4517
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = -1; // L: 4518
			}

			return 1; // L: 4520
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) { // L: 4522
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Client.zoomHeight; // L: 4523
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Client.zoomWidth; // L: 4524
			return 1; // L: 4525
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) { // L: 4527
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Skills.method6858(Client.field785); // L: 4528
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Skills.method6858(Client.field786); // L: 4529
			return 1; // L: 4530
		} else if (var0 == 6220) { // L: 4532
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 4533
			return 1; // L: 4534
		} else if (var0 == 6221) { // L: 4536
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 4537
			return 1; // L: 4538
		} else if (var0 == 6222) { // L: 4540
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class148.canvasWidth; // L: 4541
			return 1; // L: 4542
		} else if (var0 == 6223) { // L: 4544
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class342.canvasHeight; // L: 4545
			return 1; // L: 4546
		} else {
			return 2; // L: 4548
		}
	}
}
