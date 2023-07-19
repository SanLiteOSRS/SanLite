import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ff")
public class class151 extends class144 {
	@ObfuscatedName("le")
	@ObfuscatedGetter(
		intValue = -572990465
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("ai")
	boolean field1693;
	@ObfuscatedName("aj")
	byte field1695;
	@ObfuscatedName("ac")
	byte field1694;
	@ObfuscatedName("aw")
	byte field1692;
	@ObfuscatedName("ay")
	byte field1696;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lft;)V"
	)
	class151(class147 var1) {
		this.this$0 = var1; // L: 248
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "-25252119"
	)
	void vmethod3458(Buffer var1) {
		this.field1693 = var1.readUnsignedByte() == 1; // L: 251
		this.field1695 = var1.readByte(); // L: 252
		this.field1694 = var1.readByte(); // L: 253
		this.field1692 = var1.readByte(); // L: 254
		this.field1696 = var1.readByte(); // L: 255
	} // L: 256

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "-1582049647"
	)
	void vmethod3460(ClanSettings var1) {
		var1.allowGuests = this.field1693; // L: 259
		var1.field1723 = this.field1695; // L: 260
		var1.field1725 = this.field1694; // L: 261
		var1.field1727 = this.field1692; // L: 262
		var1.field1715 = this.field1696; // L: 263
	} // L: 264

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZB)I",
		garbageValue = "-70"
	)
	static int method3264(int var0, Script var1, boolean var2) {
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
				Widget var6 = Interpreter.getWidget(var9); // L: 488
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

				if (var11 > 0 && var6.children[var11 - 1] == null) {
					throw new RuntimeException("" + (var11 - 1)); // L: 495
				} else {
					Widget var12 = new Widget(); // L: 496
					var12.type = var4; // L: 497
					var12.parentId = var12.id = var6.id; // L: 498
					var12.childIndex = var11; // L: 499
					var12.isIf3 = true; // L: 500
					if (var4 == 12) { // L: 501
						var12.method6469(); // L: 502
						var12.method6470().method6190(new class105(var12)); // L: 503
						var12.method6470().method6208(new class106(var12)); // L: 513
					}

					var6.children[var11] = var12; // L: 524
					if (var2) { // L: 525
						Interpreter.scriptDotWidget = var12;
					} else {
						class184.field1907 = var12; // L: 526
					}

					class303.invalidateWidget(var6); // L: 527
					return 1; // L: 528
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 530
				var3 = var2 ? Interpreter.scriptDotWidget : class184.field1907; // L: 531
				Widget var10 = Interpreter.getWidget(var3.id); // L: 532
				var10.children[var3.childIndex] = null; // L: 533
				class303.invalidateWidget(var10); // L: 534
				return 1; // L: 535
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 537
				var3 = Interpreter.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 538
				var3.children = null; // L: 539
				class303.invalidateWidget(var3); // L: 540
				return 1; // L: 541
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 543
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 556
					var3 = Interpreter.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 557
					if (var3 != null) { // L: 558
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 559
						if (var2) { // L: 560
							Interpreter.scriptDotWidget = var3;
						} else {
							class184.field1907 = var3; // L: 561
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
				Widget var5 = ServerPacket.getWidgetChild(var9, var4); // L: 547
				if (var5 != null && var4 != -1) { // L: 548
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 549
					if (var2) { // L: 550
						Interpreter.scriptDotWidget = var5;
					} else {
						class184.field1907 = var5; // L: 551
					}
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 553
				}

				return 1; // L: 554
			}
		}
	}
}
