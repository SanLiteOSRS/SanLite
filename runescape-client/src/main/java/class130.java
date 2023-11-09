import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ev")
final class class130 implements ThreadFactory {
	@ObfuscatedName("o")
	@Export("cacheSubPaths")
	public static String[] cacheSubPaths;
	@ObfuscatedName("nd")
	@ObfuscatedGetter(
		intValue = -685565429
	)
	@Export("menuX")
	static int menuX;

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load"); // L: 49
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I",
		garbageValue = "-1879910170"
	)
	static int method3087(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) { // L: 485
			class302.Interpreter_intStackSize -= 3; // L: 486
			var9 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 487
			var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 488
			int var11 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2]; // L: 489
			if (var4 == 0) { // L: 490
				throw new RuntimeException(); // L: 491
			} else {
				Widget var6 = class133.getWidget(var9); // L: 493
				if (var6.children == null) { // L: 494
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) { // L: 495
					Widget[] var7 = new Widget[var11 + 1]; // L: 496

					for (int var8 = 0; var8 < var6.children.length; ++var8) { // L: 497
						var7[var8] = var6.children[var8];
					}

					var6.children = var7; // L: 498
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) { // L: 500
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget(); // L: 501
					var12.type = var4; // L: 502
					var12.parentId = var12.id = var6.id; // L: 503
					var12.childIndex = var11; // L: 504
					var12.isIf3 = true; // L: 505
					if (var4 == 12) { // L: 506
						var12.method6224(); // L: 507
						var12.method6235().method5970(new class100(var12)); // L: 508
						var12.method6235().method5969(new class101(var12)); // L: 518
					}

					var6.children[var11] = var12; // L: 529
					if (var2) { // L: 530
						Interpreter.scriptDotWidget = var12;
					} else {
						class85.field1091 = var12; // L: 531
					}

					LoginScreenAnimation.invalidateWidget(var6); // L: 532
					return 1; // L: 533
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 535
				var3 = var2 ? Interpreter.scriptDotWidget : class85.field1091; // L: 536
				Widget var10 = class133.getWidget(var3.id); // L: 537
				var10.children[var3.childIndex] = null; // L: 538
				LoginScreenAnimation.invalidateWidget(var10); // L: 539
				return 1; // L: 540
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 542
				var3 = class133.getWidget(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]); // L: 543
				var3.children = null; // L: 544
				LoginScreenAnimation.invalidateWidget(var3); // L: 545
				return 1; // L: 546
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 548
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 561
					var3 = class133.getWidget(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]); // L: 562
					if (var3 != null) { // L: 563
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 1; // L: 564
						if (var2) { // L: 565
							Interpreter.scriptDotWidget = var3;
						} else {
							class85.field1091 = var3; // L: 566
						}
					} else {
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 568
					}

					return 1; // L: 569
				} else {
					return 2; // L: 571
				}
			} else {
				class302.Interpreter_intStackSize -= 2; // L: 549
				var9 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 550
				var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 551
				Widget var5 = class135.getWidgetChild(var9, var4); // L: 552
				if (var5 != null && var4 != -1) { // L: 553
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 1; // L: 554
					if (var2) { // L: 555
						Interpreter.scriptDotWidget = var5;
					} else {
						class85.field1091 = var5; // L: 556
					}
				} else {
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 558
				}

				return 1; // L: 559
			}
		}
	}
}
