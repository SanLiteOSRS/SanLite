import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gd")
public class class168 extends class161 {
	@ObfuscatedName("ac")
	String field1797;
	@ObfuscatedName("al")
	byte field1794;
	@ObfuscatedName("ak")
	byte field1795;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	final class162 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgf;)V"
	)
	class168(class162 var1) {
		this.this$0 = var1; // L: 157
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;B)V",
		garbageValue = "0"
	)
	void vmethod3405(Buffer var1) {
		this.field1797 = var1.readStringCp1252NullTerminatedOrNull(); // L: 160
		if (this.field1797 != null) { // L: 161
			var1.readUnsignedByte(); // L: 162
			this.field1794 = var1.readByte(); // L: 163
			this.field1795 = var1.readByte(); // L: 164
		}

	} // L: 166

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgb;B)V",
		garbageValue = "0"
	)
	void vmethod3411(ClanChannel var1) {
		var1.name = this.field1797; // L: 169
		if (this.field1797 != null) { // L: 170
			var1.field1777 = this.field1794; // L: 171
			var1.field1778 = this.field1795; // L: 172
		}

	} // L: 174

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZB)I",
		garbageValue = "-85"
	)
	static int method3407(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) { // L: 483
			Interpreter.Interpreter_intStackSize -= 3; // L: 484
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 485
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 486
			int var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 487
			if (var4 == 0) { // L: 488
				throw new RuntimeException(); // L: 489
			} else {
				Widget var6 = class33.field184.method6240(var9); // L: 491
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

				if (var11 > 0 && var6.children[var11 - 1] == null) { // L: 498
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget(); // L: 499
					var12.type = var4; // L: 500
					var12.parentId = var12.id = var6.id; // L: 501
					var12.childIndex = var11; // L: 502
					var12.isIf3 = true; // L: 503
					if (var4 == 12) { // L: 504
						var12.method6621(); // L: 505
						var12.method6614().method6349(new class107(var12)); // L: 506
						var12.method6614().method6350(new class108(var12)); // L: 516
					}

					var6.children[var11] = var12; // L: 527
					if (var2) { // L: 528
						class416.scriptDotWidget = var12;
					} else {
						class306.field3131 = var12; // L: 529
					}

					ClanChannelMember.invalidateWidget(var6); // L: 530
					return 1; // L: 531
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 533
				var3 = var2 ? class416.scriptDotWidget : class306.field3131; // L: 534
				Widget var10 = class33.field184.method6240(var3.id); // L: 535
				var10.children[var3.childIndex] = null; // L: 536
				ClanChannelMember.invalidateWidget(var10); // L: 537
				return 1; // L: 538
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 540
				var3 = class33.field184.method6240(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 541
				var3.children = null; // L: 542
				ClanChannelMember.invalidateWidget(var3); // L: 543
				return 1; // L: 544
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 546
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 559
					var3 = class33.field184.method6240(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 560
					if (var3 != null) { // L: 561
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 562
						if (var2) { // L: 563
							class416.scriptDotWidget = var3;
						} else {
							class306.field3131 = var3; // L: 564
						}
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 566
					}

					return 1; // L: 567
				} else {
					return 2; // L: 569
				}
			} else {
				Interpreter.Interpreter_intStackSize -= 2; // L: 547
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 548
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 549
				Widget var5 = class33.field184.method6241(var9, var4); // L: 550
				if (var5 != null && var4 != -1) { // L: 551
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 552
					if (var2) { // L: 553
						class416.scriptDotWidget = var5;
					} else {
						class306.field3131 = var5; // L: 554
					}
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 556
				}

				return 1; // L: 557
			}
		}
	}
}
