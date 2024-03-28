import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("iv")
public class class225 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("Widget_cachedSprites")
	static final class225 Widget_cachedSprites;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("Widget_cachedModels")
	static final class225 Widget_cachedModels;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("Widget_cachedFonts")
	static final class225 Widget_cachedFonts;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("Widget_cachedSpriteMasks")
	static final class225 Widget_cachedSpriteMasks;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	public static final class225 field2409;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static final class225 field2406;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	public static final class225 field2401;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	public static final class225 field2408;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	public static final class225 field2404;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	public static final class225 field2410;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	public static final class225 field2411;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	public static final class225 field2407;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static final class225 field2413;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static final class225 field2414;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1103762697
	)
	public final int field2415;

	static {
		Widget_cachedSprites = new class225(0); // L: 4
		Widget_cachedModels = new class225(1); // L: 5
		Widget_cachedFonts = new class225(2); // L: 6
		Widget_cachedSpriteMasks = new class225(3); // L: 7
		field2409 = new class225(4, class211.field2170); // L: 8
		field2406 = new class225(5); // L: 9
		field2401 = new class225(6, class211.field2168); // L: 10
		field2408 = new class225(7, class211.field2167); // L: 11
		field2404 = new class225(8, class211.field2165); // L: 12
		field2410 = new class225(9, class211.field2166); // L: 13
		field2411 = new class225(10, class211.field2171); // L: 14
		field2407 = new class225(11, class211.field2163); // L: 15
		field2413 = new class225(12); // L: 16
		field2414 = new class225(13); // L: 17
	}

	class225(int var1) {
		this(var1, (class211)null);
	}

	@ObfuscatedSignature(
		descriptor = "(ILin;)V"
	)
	class225(int var1, class211 var2) {
		this.field2415 = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "21"
	)
	static void method4274(int var0) {
		class470.field4875 = var0; // L: 21
		class470.field4870 = new class470[var0]; // L: 22
		ByteArrayPool.field4688 = 0; // L: 23
	} // L: 24

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Loc;IIB)[Lvl;",
		garbageValue = "38"
	)
	public static IndexedSprite[] method4272(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 25
		boolean var3;
		if (var4 == null) { // L: 26
			var3 = false; // L: 27
		} else {
			class483.SpriteBuffer_decode(var4); // L: 30
			var3 = true; // L: 31
		}

		return !var3 ? null : class469.method8384(); // L: 33 34
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZS)I",
		garbageValue = "256"
	)
	static int method4273(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) { // L: 485
			class19.Interpreter_intStackSize -= 3; // L: 486
			var9 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 487
			var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 488
			int var11 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 2]; // L: 489
			if (var4 == 0) { // L: 490
				throw new RuntimeException(); // L: 491
			} else {
				Widget var6 = class243.field2620.method6281(var9); // L: 493
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

				if (var11 > 0 && var6.children[var11 - 1] == null) {
					throw new RuntimeException("" + (var11 - 1)); // L: 500
				} else {
					Widget var12 = new Widget(); // L: 501
					var12.type = var4; // L: 502
					var12.parentId = var12.id = var6.id; // L: 503
					var12.childIndex = var11; // L: 504
					var12.isIf3 = true; // L: 505
					if (var4 == 12) { // L: 506
						var12.method6679(); // L: 507
						var12.method6667().method6411(new class106(var12)); // L: 508
						var12.method6667().method6410(new class107(var12)); // L: 518
					}

					var6.children[var11] = var12; // L: 529
					if (var2) { // L: 530
						class475.scriptDotWidget = var12;
					} else {
						class535.field5236 = var12; // L: 531
					}

					WorldMapData_0.invalidateWidget(var6); // L: 532
					return 1; // L: 533
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 535
				var3 = var2 ? class475.scriptDotWidget : class535.field5236; // L: 536
				Widget var10 = class243.field2620.method6281(var3.id); // L: 537
				var10.children[var3.childIndex] = null; // L: 538
				WorldMapData_0.invalidateWidget(var10); // L: 539
				return 1; // L: 540
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 542
				var3 = class243.field2620.method6281(Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]); // L: 543
				var3.children = null; // L: 544
				WorldMapData_0.invalidateWidget(var3); // L: 545
				return 1; // L: 546
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 548
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 561
					var3 = class243.field2620.method6281(Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]); // L: 562
					if (var3 != null) { // L: 563
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 1; // L: 564
						if (var2) { // L: 565
							class475.scriptDotWidget = var3;
						} else {
							class535.field5236 = var3; // L: 566
						}
					} else {
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 568
					}

					return 1; // L: 569
				} else {
					return 2; // L: 571
				}
			} else {
				class19.Interpreter_intStackSize -= 2; // L: 549
				var9 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 550
				var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 551
				Widget var5 = class243.field2620.method6286(var9, var4); // L: 552
				if (var5 != null && var4 != -1) { // L: 553
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 1; // L: 554
					if (var2) { // L: 555
						class475.scriptDotWidget = var5;
					} else {
						class535.field5236 = var5; // L: 556
					}
				} else {
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 558
				}

				return 1; // L: 559
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "38"
	)
	public static int method4276(int var0) {
		return class206.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 64
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "74"
	)
	static String method4275(int var0) {
		if (var0 < 0) { // L: 10298
			return "";
		} else {
			return Client.menuTargets[var0].length() > 0 ? Client.menuActions[var0] + " " + Client.menuTargets[var0] : Client.menuActions[var0]; // L: 10299 10300
		}
	}
}
