import java.util.concurrent.locks.ReentrantLock;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bx")
public class class47 {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 346167861
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	VorbisSample field315;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lbt;"
	)
	RawSound field317;
	@ObfuscatedName("ar")
	ReentrantLock field316;

	@ObfuscatedSignature(
		descriptor = "(Lcv;Lbt;)V"
	)
	class47(VorbisSample var1, RawSound var2) {
		this.field315 = var1; // L: 11
		this.field317 = var2; // L: 12
		this.field316 = new ReentrantLock(); // L: 13
	} // L: 14

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1747596015"
	)
	static int method898(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) { // L: 483
			class517.Interpreter_intStackSize -= 3; // L: 484
			var9 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 485
			var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 486
			int var11 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 2]; // L: 487
			if (var4 == 0) { // L: 488
				throw new RuntimeException(); // L: 489
			} else {
				Widget var6 = HealthBarDefinition.field1877.method6285(var9); // L: 491
				if (var6.children == null) { // L: 492
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) { // L: 493
					Widget[] var7 = new Widget[var11 + 1]; // L: 494

					for (int var8 = 0; var8 < var6.children.length; ++var8) { // L: 495
						var7[var8] = var6.children[var8];
					}

					var6.children = var7; // L: 496
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) {
					throw new RuntimeException("" + (var11 - 1)); // L: 498
				} else {
					Widget var12 = new Widget(); // L: 499
					var12.type = var4; // L: 500
					var12.parentId = var12.id = var6.id; // L: 501
					var12.childIndex = var11; // L: 502
					var12.isIf3 = true; // L: 503
					if (var4 == 12) { // L: 504
						var12.method6687(); // L: 505
						var12.method6688().method6441(new class105(var12)); // L: 506
						var12.method6688().method6407(new class106(var12)); // L: 516
					}

					var6.children[var11] = var12; // L: 527
					if (var2) { // L: 528
						Interpreter.scriptDotWidget = var12;
					} else {
						HealthBar.field1302 = var12; // L: 529
					}

					class159.invalidateWidget(var6); // L: 530
					return 1; // L: 531
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 533
				var3 = var2 ? Interpreter.scriptDotWidget : HealthBar.field1302; // L: 534
				Widget var10 = HealthBarDefinition.field1877.method6285(var3.id); // L: 535
				var10.children[var3.childIndex] = null; // L: 536
				class159.invalidateWidget(var10); // L: 537
				return 1; // L: 538
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 540
				var3 = HealthBarDefinition.field1877.method6285(Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]); // L: 541
				var3.children = null; // L: 542
				class159.invalidateWidget(var3); // L: 543
				return 1; // L: 544
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 546
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 559
					var3 = HealthBarDefinition.field1877.method6285(Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]); // L: 560
					if (var3 != null) { // L: 561
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 1; // L: 562
						if (var2) { // L: 563
							Interpreter.scriptDotWidget = var3;
						} else {
							HealthBar.field1302 = var3; // L: 564
						}
					} else {
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 566
					}

					return 1; // L: 567
				} else {
					return 2; // L: 569
				}
			} else {
				class517.Interpreter_intStackSize -= 2; // L: 547
				var9 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 548
				var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 549
				Widget var5 = HealthBarDefinition.field1877.method6279(var9, var4); // L: 550
				if (var5 != null && var4 != -1) { // L: 551
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 1; // L: 552
					if (var2) { // L: 553
						Interpreter.scriptDotWidget = var5;
					} else {
						HealthBar.field1302 = var5; // L: 554
					}
				} else {
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 556
				}

				return 1; // L: 557
			}
		}
	}
}
