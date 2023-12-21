import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mr")
public class class335 {
	@ObfuscatedName("aa")
	static boolean[] field3569;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	AbstractArchive field3566;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	AbstractArchive field3564;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	AbstractArchive field3565;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	AbstractArchive field3575;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	AbstractArchive field3563;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[[Lnn;"
	)
	public Widget[][] field3568;
	@ObfuscatedName("ac")
	Map field3572;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	EvictingDualNodeHashTable field3571;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	EvictingDualNodeHashTable field3570;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	EvictingDualNodeHashTable field3573;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	EvictingDualNodeHashTable field3574;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	class435 field3567;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	class435 field3576;

	@ObfuscatedSignature(
		descriptor = "(Lol;Lol;Lol;Lol;Lol;)V"
	)
	public class335(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4, AbstractArchive var5) {
		this.field3572 = new HashMap(); // L: 20
		this.field3571 = new EvictingDualNodeHashTable(200); // L: 21
		this.field3570 = new EvictingDualNodeHashTable(50); // L: 22
		this.field3573 = new EvictingDualNodeHashTable(20); // L: 23
		this.field3574 = new EvictingDualNodeHashTable(8); // L: 24
		this.field3567 = new class435(10, class433.field4645); // L: 25
		this.field3576 = new class435(10, class433.field4645); // L: 26
		int var6 = 0; // L: 29
		if (var1 != null) { // L: 30
			this.field3566 = var1; // L: 31
			this.field3565 = var2; // L: 32
			this.field3575 = var3; // L: 33
			this.field3563 = var4; // L: 34
			this.field3564 = var5; // L: 35
			var6 = this.field3566.getGroupCount(); // L: 36
		}

		this.field3568 = new Widget[var6][]; // L: 38
		field3569 = new boolean[var6]; // L: 39
	} // L: 40

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Lnn;",
		garbageValue = "16"
	)
	public Widget method6285(int var1) {
		int var2 = var1 >> 16; // L: 43
		int var3 = var1 & 65535; // L: 44
		if (this.field3568[var2] == null || this.field3568[var2][var3] == null) { // L: 45
			boolean var4 = this.method6282(var2); // L: 46
			if (!var4) { // L: 47
				return null;
			}
		}

		return this.field3568[var2][var3]; // L: 49
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)Lnn;",
		garbageValue = "1789235417"
	)
	public Widget method6279(int var1, int var2) {
		Widget var3 = this.method6285(var1); // L: 53
		if (var2 == -1) { // L: 54
			return var3;
		} else {
			return var3 != null && var3.children != null && var2 < var3.children.length ? var3.children[var2] : null; // L: 55 56
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1302781087"
	)
	public boolean method6282(int var1) {
		if (field3569[var1]) { // L: 60
			return true;
		} else if (!this.field3566.tryLoadGroup(var1)) { // L: 61
			return false;
		} else {
			int var2 = this.field3566.getGroupFileCount(var1); // L: 62
			if (var2 == 0) { // L: 63
				field3569[var1] = true; // L: 64
				return true; // L: 65
			} else {
				if (this.field3568[var1] == null) { // L: 67
					this.field3568[var1] = new Widget[var2];
				}

				for (int var3 = 0; var3 < var2; ++var3) { // L: 68
					if (this.field3568[var1][var3] == null) { // L: 69
						byte[] var4 = this.field3566.takeFile(var1, var3); // L: 70
						if (var4 != null) { // L: 71
							this.field3568[var1][var3] = new Widget(); // L: 72
							this.field3568[var1][var3].id = var3 + (var1 << 16); // L: 73
							if (var4[0] == -1) { // L: 74
								this.field3568[var1][var3].decode(new Buffer(var4));
							} else {
								this.field3568[var1][var3].decodeLegacy(new Buffer(var4)); // L: 75
							}

							if (this.field3564 != null) { // L: 76
								byte[] var5 = this.field3564.takeFile(var1, var3); // L: 77
								if (var5 != null && var5.length > 0) { // L: 78
									this.field3568[var1][var3].method6766(new Buffer(var5)); // L: 79
									this.field3572.put(this.field3568[var1][var3].field3660, var1); // L: 80
								}
							}
						}
					}
				}

				field3569[var1] = true; // L: 86
				return true; // L: 87
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	public void method6283(int var1) {
		if (var1 != -1) { // L: 91
			if (field3569[var1]) { // L: 92
				this.field3566.clearFilesGroup(var1); // L: 93
				if (this.field3568[var1] != null) { // L: 94
					for (int var2 = 0; var2 < this.field3568[var1].length; ++var2) { // L: 95
						if (this.field3568[var1][var2] != null) { // L: 96
							this.field3568[var1][var2] = null; // L: 97
						}
					}

					this.field3568[var1] = null; // L: 100
					field3569[var1] = false; // L: 101
				}
			}
		}
	} // L: 102

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2131589936"
	)
	public void method6288() {
		this.field3571.clear(); // L: 105
		this.field3570.clear(); // L: 106
		this.field3573.clear(); // L: 107
		this.field3574.clear(); // L: 108
	} // L: 109

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "0"
	)
	static int method6300(int var0, Script var1, boolean var2) {
		int var3 = -1; // L: 573
		Widget var4;
		if (var0 >= 2000) { // L: 575
			var0 -= 1000; // L: 576
			var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 577
			var4 = HealthBarDefinition.field1877.method6285(var3); // L: 578
		} else {
			var4 = var2 ? Interpreter.scriptDotWidget : HealthBar.field1302; // L: 580
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) { // L: 581
			class517.Interpreter_intStackSize -= 4; // L: 582
			var4.rawX = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 583
			var4.rawY = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 584
			var4.xAlignment = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 2]; // L: 585
			var4.yAlignment = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 3]; // L: 586
			class159.invalidateWidget(var4); // L: 587
			SpriteMask.client.alignWidget(var4); // L: 588
			if (var3 != -1 && var4.type == 0) { // L: 589
				class132.revalidateWidgetScroll(HealthBarDefinition.field1877.field3568[var3 >> 16], var4, false);
			}

			return 1; // L: 590
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) { // L: 592
			class517.Interpreter_intStackSize -= 4; // L: 593
			var4.rawWidth = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 594
			var4.rawHeight = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 595
			var4.widthAlignment = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 2]; // L: 596
			var4.heightAlignment = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 3]; // L: 597
			class159.invalidateWidget(var4); // L: 598
			SpriteMask.client.alignWidget(var4); // L: 599
			if (var3 != -1 && var4.type == 0) { // L: 600
				class132.revalidateWidgetScroll(HealthBarDefinition.field1877.field3568[var3 >> 16], var4, false);
			}

			return 1; // L: 601
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) { // L: 603
			boolean var5 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 604
			if (var5 != var4.isHidden) { // L: 605
				var4.isHidden = var5; // L: 606
				class159.invalidateWidget(var4); // L: 607
			}

			return 1; // L: 609
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) { // L: 611
			var4.noClickThrough = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 612
			return 1; // L: 613
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) { // L: 615
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 616
			return 1; // L: 617
		} else {
			return 2; // L: 619
		}
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(Lnn;B)Z",
		garbageValue = "64"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) { // L: 11303
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) { // L: 11304
				int var2 = UserComparator4.method2942(var0, var1); // L: 11305
				int var3 = var0.cs1ComparisonValues[var1]; // L: 11306
				if (var0.cs1Comparisons[var1] == 2) { // L: 11307
					if (var2 >= var3) { // L: 11308
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) { // L: 11310
					if (var2 <= var3) { // L: 11311
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) { // L: 11313
					if (var2 == var3) { // L: 11314
						return false;
					}
				} else if (var2 != var3) { // L: 11316
					return false;
				}
			}

			return true; // L: 11318
		}
	}
}
