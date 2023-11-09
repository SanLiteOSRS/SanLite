import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bv")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("f")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("w")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 2029245625
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("s")
	static short[][][] field1010;
	@ObfuscatedName("j")
	static byte[][][] field1011;
	@ObfuscatedName("i")
	static byte[][][] field1012;
	@ObfuscatedName("n")
	static byte[][][] field1013;
	@ObfuscatedName("r")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("u")
	static final int[] field1015;
	@ObfuscatedName("x")
	static final int[] field1016;
	@ObfuscatedName("a")
	static final int[] field1017;
	@ObfuscatedName("q")
	static final int[] field1007;
	@ObfuscatedName("d")
	static final int[] field1019;
	@ObfuscatedName("e")
	static final int[] field1020;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1002490687
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1127262765
	)
	@Export("rndLightness")
	static int rndLightness;

	static {
		Tiles_heights = new int[4][105][105]; // L: 17
		Tiles_renderFlags = new byte[4][104][104]; // L: 18
		Tiles_minPlane = 99; // L: 19
		field1015 = new int[]{1, 2, 4, 8}; // L: 35
		field1016 = new int[]{16, 32, 64, 128}; // L: 36
		field1017 = new int[]{1, 0, -1, 0}; // L: 37
		field1007 = new int[]{0, -1, 0, 1}; // L: 38
		field1019 = new int[]{1, -1, -1, 1}; // L: 39
		field1020 = new int[]{-1, -1, 1, 1}; // L: 40
		rndHue = (int)(Math.random() * 17.0D) - 8; // L: 41
		rndLightness = (int)(Math.random() * 33.0D) - 16; // L: 42
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIILhn;[Lgv;)V"
	)
	static final void method2274(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
		Buffer var10 = new Buffer(var0); // L: 288
		int var11 = -1; // L: 289

		while (true) {
			int var12 = var10.method8809(); // L: 291
			if (var12 == 0) { // L: 292
				return; // L: 347
			}

			var11 += var12; // L: 293
			int var13 = 0; // L: 294

			while (true) {
				int var14 = var10.readUShortSmart(); // L: 296
				if (var14 == 0) { // L: 297
					break;
				}

				var13 += var14 - 1; // L: 298
				int var15 = var13 & 63; // L: 299
				int var16 = var13 >> 6 & 63; // L: 300
				int var17 = var13 >> 12; // L: 301
				int var18 = var10.readUnsignedByte(); // L: 302
				int var19 = var18 >> 2; // L: 303
				int var20 = var18 & 3; // L: 304
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) { // L: 305
					ObjectComposition var21 = class463.getObjectDefinition(var11); // L: 306
					int var22 = var2 + WorldMapRegion.method5148(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20); // L: 307
					int var25 = var16 & 7; // L: 310
					int var26 = var15 & 7; // L: 311
					int var28 = var21.sizeX; // L: 313
					int var29 = var21.sizeY; // L: 314
					int var30;
					if ((var20 & 1) == 1) { // L: 316
						var30 = var28; // L: 317
						var28 = var29; // L: 318
						var29 = var30; // L: 319
					}

					int var27 = var7 & 3; // L: 321
					int var24;
					if (var27 == 0) { // L: 322
						var24 = var26; // L: 323
					} else if (var27 == 1) { // L: 326
						var24 = 7 - var25 - (var28 - 1); // L: 327
					} else if (var27 == 2) { // L: 330
						var24 = 7 - var26 - (var29 - 1); // L: 331
					} else {
						var24 = var25; // L: 334
					}

					var30 = var3 + var24; // L: 336
					if (var22 > 0 && var30 > 0 && var22 < 103 && var30 < 103) { // L: 337
						int var31 = var1; // L: 338
						if ((Tiles_renderFlags[1][var22][var30] & 2) == 2) { // L: 339
							var31 = var1 - 1;
						}

						CollisionMap var32 = null; // L: 340
						if (var31 >= 0) { // L: 341
							var32 = var9[var31];
						}

						NameableContainer.addObjects(var1, var22, var30, var11, var20 + var7 & 3, var19, var8, var32); // L: 342
					}
				}
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I",
		garbageValue = "1451168135"
	)
	static int method2277(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) { // L: 1560
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) { // L: 1577
				var7 = var2 ? Interpreter.scriptDotWidget : class85.field1091; // L: 1578
				var4 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 1579
				if (var4 >= 1 && var4 <= 10) { // L: 1580
					class97 var8 = new class97(var4, var7.id, var7.childIndex, var7.itemId); // L: 1583
					Interpreter.field864.add(var8); // L: 1584
					return 1; // L: 1585
				} else {
					throw new RuntimeException(); // L: 1581
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) { // L: 1587
				class302.Interpreter_intStackSize -= 3; // L: 1588
				int var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 1589
				var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 1590
				int var5 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2]; // L: 1591
				if (var5 >= 1 && var5 <= 10) { // L: 1592
					class97 var6 = new class97(var5, var3, var4, class133.getWidget(var3).itemId); // L: 1595
					Interpreter.field864.add(var6); // L: 1596
					return 1; // L: 1597
				} else {
					throw new RuntimeException(); // L: 1593
				}
			} else {
				return 2; // L: 1599
			}
		} else if (Interpreter.field861 >= 10) { // L: 1561
			throw new RuntimeException(); // L: 1562
		} else {
			if (var0 >= 2000) { // L: 1565
				var7 = class133.getWidget(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]); // L: 1566
			} else {
				var7 = var2 ? Interpreter.scriptDotWidget : class85.field1091; // L: 1568
			}

			if (var7.onResize == null) { // L: 1569
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent(); // L: 1570
				var9.widget = var7; // L: 1571
				var9.args = var7.onResize; // L: 1572
				var9.field1071 = Interpreter.field861 + 1; // L: 1573
				Client.scriptEvents.addFirst(var9); // L: 1574
				return 1; // L: 1575
			}
		}
	}

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqc;",
		garbageValue = "-124"
	)
	static class467 method2276(int var0) {
		class467 var1 = (class467)Client.Widget_cachedModels.get((long)var0); // L: 13392
		if (var1 == null) { // L: 13393
			var1 = new class467(Canvas.field132, WorldMapLabelSize.method4893(var0), MidiPcmStream.method5728(var0)); // L: 13394
			Client.Widget_cachedModels.put(var1, (long)var0); // L: 13395
		}

		return var1; // L: 13397
	}
}
