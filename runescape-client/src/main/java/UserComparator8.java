import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ds")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("tu")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("fi")
	@ObfuscatedGetter(
		intValue = 1658638723
	)
	static int field1461;
	@ObfuscatedName("h")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Loa;Loa;B)I",
		garbageValue = "81"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) { // L: 15
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1; // L: 16
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1; // L: 19
		}

		return this.compareUser(var1, var2); // L: 21
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 25
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lql;III)I",
		garbageValue = "2141786547"
	)
	static int method2819(IterableNodeHashTable var0, int var1, int var2) {
		if (var0 == null) { // L: 33
			return var2;
		} else {
			IntegerNode var3 = (IntegerNode)var0.get((long)var1); // L: 34
			return var3 == null ? var2 : var3.integer; // L: 35 36
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZI)I",
		garbageValue = "-100254626"
	)
	static int method2820(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) { // L: 485
			class87.Interpreter_intStackSize -= 3; // L: 486
			var9 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 487
			var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 488
			int var11 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2]; // L: 489
			if (var4 == 0) { // L: 490
				throw new RuntimeException(); // L: 491
			} else {
				Widget var6 = class175.getWidget(var9); // L: 493
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
						var12.method6261(); // L: 507
						var12.method6167().method5927(new class101(var12)); // L: 508
						var12.method6167().method5926(new class102(var12)); // L: 518
					}

					var6.children[var11] = var12; // L: 529
					if (var2) { // L: 530
						class190.scriptDotWidget = var12;
					} else {
						class360.field4354 = var12; // L: 531
					}

					class69.invalidateWidget(var6); // L: 532
					return 1; // L: 533
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 535
				var3 = var2 ? class190.scriptDotWidget : class360.field4354; // L: 536
				Widget var10 = class175.getWidget(var3.id); // L: 537
				var10.children[var3.childIndex] = null; // L: 538
				class69.invalidateWidget(var10); // L: 539
				return 1; // L: 540
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 542
				var3 = class175.getWidget(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]); // L: 543
				var3.children = null; // L: 544
				class69.invalidateWidget(var3); // L: 545
				return 1; // L: 546
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 548
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 561
					var3 = class175.getWidget(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]); // L: 562
					if (var3 != null) { // L: 563
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 1; // L: 564
						if (var2) { // L: 565
							class190.scriptDotWidget = var3;
						} else {
							class360.field4354 = var3; // L: 566
						}
					} else {
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 568
					}

					return 1; // L: 569
				} else {
					return 2; // L: 571
				}
			} else {
				class87.Interpreter_intStackSize -= 2; // L: 549
				var9 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 550
				var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 551
				Widget var5 = AttackOption.getWidgetChild(var9, var4); // L: 552
				if (var5 != null && var4 != -1) { // L: 553
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 1; // L: 554
					if (var2) { // L: 555
						class190.scriptDotWidget = var5;
					} else {
						class360.field4354 = var5; // L: 556
					}
				} else {
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 558
				}

				return 1; // L: 559
			}
		}
	}
}
