import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hn")
@Implements("WallObject")
public final class WallObject {
	@ObfuscatedName("cj")
	public static char field2636;
	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static Widget field2634;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1760692663
	)
	@Export("z")
	int z;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1190754957
	)
	@Export("x")
	int x;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 2046459239
	)
	@Export("y")
	int y;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -283671445
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1295985349
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		longValue = 2351322069323510671L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1112023027
	)
	@Export("flags")
	int flags;

	WallObject() {
		this.tag = 0L; // L: 11
		this.flags = 0; // L: 12
	} // L: 14

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "797879953"
	)
	static int method4420(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) { // L: 489
			Nameable.Interpreter_intStackSize -= 3; // L: 490
			var9 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 491
			var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 492
			int var11 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 2]; // L: 493
			if (var4 == 0) { // L: 494
				throw new RuntimeException(); // L: 495
			} else {
				Widget var6 = HitSplatDefinition.getWidget(var9); // L: 497
				if (var6.children == null) { // L: 498
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) { // L: 499
					Widget[] var7 = new Widget[var11 + 1]; // L: 500

					for (int var8 = 0; var8 < var6.children.length; ++var8) { // L: 501
						var7[var8] = var6.children[var8];
					}

					var6.children = var7; // L: 502
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) { // L: 504
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget(); // L: 505
					var12.type = var4; // L: 506
					var12.parentId = var12.id = var6.id; // L: 507
					var12.childIndex = var11; // L: 508
					var12.isIf3 = true; // L: 509
					var6.children[var11] = var12; // L: 510
					if (var2) { // L: 511
						SoundSystem.scriptDotWidget = var12;
					} else {
						Ignored.scriptActiveWidget = var12; // L: 512
					}

					class125.invalidateWidget(var6); // L: 513
					return 1; // L: 514
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 516
				var3 = var2 ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget; // L: 517
				Widget var10 = HitSplatDefinition.getWidget(var3.id); // L: 518
				var10.children[var3.childIndex] = null; // L: 519
				class125.invalidateWidget(var10); // L: 520
				return 1; // L: 521
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 523
				var3 = HitSplatDefinition.getWidget(Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]); // L: 524
				var3.children = null; // L: 525
				class125.invalidateWidget(var3); // L: 526
				return 1; // L: 527
			} else if (var0 == 103) { // L: 529
				Nameable.Interpreter_intStackSize -= 3; // L: 530
				return 1; // L: 531
			} else if (var0 == 104) { // L: 533
				--Nameable.Interpreter_intStackSize; // L: 534
				return 1; // L: 535
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 537
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 550
					var3 = HitSplatDefinition.getWidget(Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]); // L: 551
					if (var3 != null) { // L: 552
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 1; // L: 553
						if (var2) { // L: 554
							SoundSystem.scriptDotWidget = var3;
						} else {
							Ignored.scriptActiveWidget = var3; // L: 555
						}
					} else {
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 557
					}

					return 1; // L: 558
				} else if (var0 == 202) { // L: 560
					Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1] = 0; // L: 561
					return 1; // L: 562
				} else if (var0 == 203) { // L: 564
					Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize + 1] = 0; // L: 565
					return 1; // L: 566
				} else {
					return 2; // L: 568
				}
			} else {
				Nameable.Interpreter_intStackSize -= 2; // L: 538
				var9 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 539
				var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 540
				Widget var5 = class128.getWidgetChild(var9, var4); // L: 541
				if (var5 != null && var4 != -1) { // L: 542
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 1; // L: 543
					if (var2) { // L: 544
						SoundSystem.scriptDotWidget = var5;
					} else {
						Ignored.scriptActiveWidget = var5; // L: 545
					}
				} else {
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 547
				}

				return 1; // L: 548
			}
		}
	}
}
