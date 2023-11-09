import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dm")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 420327375
	)
	@Export("id")
	int id;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1148954327
	)
	@Export("quantity")
	int quantity;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1261516135
	)
	int field1313;

	TileItem() {
		this.field1313 = 31; // L: 11
	} // L: 13

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-87"
	)
	void method2640(int var1) {
		this.field1313 = var1; // L: 16
	} // L: 17

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Ljh;",
		garbageValue = "4"
	)
	@Export("getModel")
	protected final Model getModel() {
		return class230.ItemComposition_get(this.id).getModel(this.quantity); // L: 27
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "76"
	)
	boolean method2642(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 20
			return (this.field1313 & 1 << var1) != 0; // L: 21
		} else {
			return true; // L: 23
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZI)I",
		garbageValue = "-1697170561"
	)
	static int method2649(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) { // L: 479
			class336.Interpreter_intStackSize -= 3; // L: 480
			var9 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 481
			var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 482
			int var11 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 2]; // L: 483
			if (var4 == 0) { // L: 484
				throw new RuntimeException(); // L: 485
			} else {
				Widget var6 = ArchiveDiskActionHandler.getWidget(var9); // L: 487
				if (var6.children == null) { // L: 488
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) { // L: 489
					Widget[] var7 = new Widget[var11 + 1]; // L: 490

					for (int var8 = 0; var8 < var6.children.length; ++var8) { // L: 491
						var7[var8] = var6.children[var8];
					}

					var6.children = var7; // L: 492
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) { // L: 494
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget(); // L: 495
					var12.type = var4; // L: 496
					var12.parentId = var12.id = var6.id; // L: 497
					var12.childIndex = var11; // L: 498
					var12.isIf3 = true; // L: 499
					if (var4 == 12) { // L: 500
						var12.method6454(); // L: 501
						var12.method6544().method6200(new class104(var12)); // L: 502
						var12.method6544().method6217(new class105(var12)); // L: 512
					}

					var6.children[var11] = var12; // L: 523
					if (var2) { // L: 524
						Interpreter.scriptDotWidget = var12;
					} else {
						HealthBarUpdate.field1223 = var12; // L: 525
					}

					HorizontalAlignment.invalidateWidget(var6); // L: 526
					return 1; // L: 527
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 529
				var3 = var2 ? Interpreter.scriptDotWidget : HealthBarUpdate.field1223; // L: 530
				Widget var10 = ArchiveDiskActionHandler.getWidget(var3.id); // L: 531
				var10.children[var3.childIndex] = null; // L: 532
				HorizontalAlignment.invalidateWidget(var10); // L: 533
				return 1; // L: 534
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 536
				var3 = ArchiveDiskActionHandler.getWidget(Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]); // L: 537
				var3.children = null; // L: 538
				HorizontalAlignment.invalidateWidget(var3); // L: 539
				return 1; // L: 540
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 542
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 555
					var3 = ArchiveDiskActionHandler.getWidget(Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]); // L: 556
					if (var3 != null) { // L: 557
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 1; // L: 558
						if (var2) { // L: 559
							Interpreter.scriptDotWidget = var3;
						} else {
							HealthBarUpdate.field1223 = var3; // L: 560
						}
					} else {
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 562
					}

					return 1; // L: 563
				} else {
					return 2; // L: 565
				}
			} else {
				class336.Interpreter_intStackSize -= 2; // L: 543
				var9 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 544
				var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 545
				Widget var5 = ModelData0.getWidgetChild(var9, var4); // L: 546
				if (var5 != null && var4 != -1) { // L: 547
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 1; // L: 548
					if (var2) { // L: 549
						Interpreter.scriptDotWidget = var5;
					} else {
						HealthBarUpdate.field1223 = var5; // L: 550
					}
				} else {
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 552
				}

				return 1; // L: 553
			}
		}
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZI)V",
		garbageValue = "-256667256"
	)
	static final void method2645(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		if (!Client.isMenuOpen) { // L: 9915
			if (Client.menuOptionsCount < 500) { // L: 9916
				Client.menuActions[Client.menuOptionsCount] = var0; // L: 9917
				Client.menuTargets[Client.menuOptionsCount] = var1; // L: 9918
				Client.menuOpcodes[Client.menuOptionsCount] = var2; // L: 9919
				Client.menuIdentifiers[Client.menuOptionsCount] = var3; // L: 9920
				Client.menuArguments1[Client.menuOptionsCount] = var4; // L: 9921
				Client.menuArguments2[Client.menuOptionsCount] = var5; // L: 9922
				Client.field632[Client.menuOptionsCount] = var6; // L: 9923
				Client.menuShiftClick[Client.menuOptionsCount] = var7; // L: 9924
				++Client.menuOptionsCount; // L: 9925
			}

		}
	} // L: 9927
}
