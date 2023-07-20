import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@mu
@ObfuscatedName("lt")
public final class class301 {
	@ObfuscatedName("ar")
	static final HashMap field3362;
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = 1053823081
	)
	static int field3359;

	static {
		field3362 = new HashMap(); // L: 11
		java.util.Calendar.getInstance(method5742("Europe/London")); // L: 14
	} // L: 15

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)Ljava/util/TimeZone;",
		garbageValue = "13393"
	)
	static TimeZone method5742(String var0) {
		synchronized(field3362) { // L: 22
			TimeZone var2 = (TimeZone)field3362.get(var0); // L: 23
			if (var2 == null) { // L: 24
				var2 = TimeZone.getTimeZone(var0); // L: 25
				field3362.put(var0, var2); // L: 26
			}

			return var2; // L: 28
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-2109434245"
	)
	static int method5746(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) { // L: 480
			Interpreter.Interpreter_intStackSize -= 3; // L: 481
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 482
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 483
			int var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 484
			if (var4 == 0) { // L: 485
				throw new RuntimeException(); // L: 486
			} else {
				Widget var6 = VarbitComposition.getWidget(var9); // L: 488
				if (var6.children == null) { // L: 489
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) { // L: 490
					Widget[] var7 = new Widget[var11 + 1]; // L: 491

					for (int var8 = 0; var8 < var6.children.length; ++var8) { // L: 492
						var7[var8] = var6.children[var8];
					}

					var6.children = var7; // L: 493
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) { // L: 495
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget(); // L: 496
					var12.type = var4; // L: 497
					var12.parentId = var12.id = var6.id; // L: 498
					var12.childIndex = var11; // L: 499
					var12.isIf3 = true; // L: 500
					if (var4 == 12) { // L: 501
						var12.method6455(); // L: 502
						var12.method6504().method6207(new class105(var12)); // L: 503
						var12.method6504().method6227(new class106(var12)); // L: 513
					}

					var6.children[var11] = var12; // L: 524
					if (var2) { // L: 525
						class36.scriptDotWidget = var12;
					} else {
						class351.field3896 = var12; // L: 526
					}

					class200.invalidateWidget(var6); // L: 527
					return 1; // L: 528
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 530
				var3 = var2 ? class36.scriptDotWidget : class351.field3896; // L: 531
				Widget var10 = VarbitComposition.getWidget(var3.id); // L: 532
				var10.children[var3.childIndex] = null; // L: 533
				class200.invalidateWidget(var10); // L: 534
				return 1; // L: 535
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 537
				var3 = VarbitComposition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 538
				var3.children = null; // L: 539
				class200.invalidateWidget(var3); // L: 540
				return 1; // L: 541
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 543
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 556
					var3 = VarbitComposition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 557
					if (var3 != null) { // L: 558
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 559
						if (var2) { // L: 560
							class36.scriptDotWidget = var3;
						} else {
							class351.field3896 = var3; // L: 561
						}
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 563
					}

					return 1; // L: 564
				} else {
					return 2; // L: 566
				}
			} else {
				Interpreter.Interpreter_intStackSize -= 2; // L: 544
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 545
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 546
				Widget var5 = MouseRecorder.getWidgetChild(var9, var4); // L: 547
				if (var5 != null && var4 != -1) { // L: 548
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 549
					if (var2) { // L: 550
						class36.scriptDotWidget = var5;
					} else {
						class351.field3896 = var5; // L: 551
					}
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 553
				}

				return 1; // L: 554
			}
		}
	}
}
