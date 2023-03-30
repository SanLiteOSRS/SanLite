import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dg")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("aj")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("al")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 587446233
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("ab")
	static short[][][] field995;
	@ObfuscatedName("an")
	static short[][][] field996;
	@ObfuscatedName("av")
	static byte[][][] field997;
	@ObfuscatedName("ar")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("ag")
	static final int[] field998;
	@ObfuscatedName("at")
	static final int[] field1006;
	@ObfuscatedName("af")
	static final int[] field1000;
	@ObfuscatedName("ai")
	static final int[] field1002;
	@ObfuscatedName("aw")
	static final int[] field1003;
	@ObfuscatedName("aa")
	static final int[] field1004;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -2077266171
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -77149953
	)
	@Export("rndLightness")
	static int rndLightness;

	static {
		Tiles_heights = new int[4][105][105]; // L: 17
		Tiles_renderFlags = new byte[4][104][104]; // L: 18
		Tiles_minPlane = 99; // L: 19
		field998 = new int[]{1, 2, 4, 8}; // L: 35
		field1006 = new int[]{16, 32, 64, 128}; // L: 36
		field1000 = new int[]{1, 0, -1, 0}; // L: 37
		field1002 = new int[]{0, -1, 0, 1}; // L: 38
		field1003 = new int[]{1, -1, -1, 1}; // L: 39
		field1004 = new int[]{-1, -1, 1, 1}; // L: 40
		rndHue = (int)(Math.random() * 17.0D) - 8; // L: 41
		rndLightness = (int)(Math.random() * 33.0D) - 16; // L: 42
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lew;FI)F",
		garbageValue = "-1929092975"
	)
	static float method2219(class127 var0, float var1) {
		if (var0 == null) { // L: 100
			return 0.0F; // L: 101
		} else {
			float var2;
			if (var0.field1505 == var1) { // L: 104
				var2 = 0.0F; // L: 105
			} else if (var0.field1504 == var1) { // L: 107
				var2 = 1.0F; // L: 108
			} else {
				var2 = (var1 - var0.field1505) / (var0.field1504 - var0.field1505); // L: 111
			}

			float var3;
			if (var0.field1519) { // L: 114
				var3 = var2; // L: 115
			} else {
				class123.field1460[3] = var0.field1500;
				class123.field1460[2] = var0.field1507; // L: 119
				class123.field1460[1] = var0.field1506; // L: 120
				class123.field1460[0] = var0.field1521 - var2; // L: 121
				class123.field1461[0] = 0.0F; // L: 122
				class123.field1461[1] = 0.0F; // L: 123
				class123.field1461[2] = 0.0F; // L: 124
				class123.field1461[3] = 0.0F; // L: 125
				class123.field1461[4] = 0.0F; // L: 126
				int var4 = class368.method6936(class123.field1460, 3, 0.0F, true, 1.0F, true, class123.field1461); // L: 127
				if (var4 == 1) { // L: 128
					var3 = class123.field1461[0]; // L: 129
				} else {
					var3 = 0.0F; // L: 132
				}
			}

			return var0.field1509 + (var0.field1510 + (var3 * var0.field1520 + var0.field1511) * var3) * var3; // L: 135
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZI)I",
		garbageValue = "1859570443"
	)
	static int method2194(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1006
			var0 -= 1000; // L: 1007
			var3 = WorldMapSection1.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1008
		} else {
			var3 = var2 ? GameObject.scriptDotWidget : SoundSystem.field319; // L: 1010
		}

		class69.invalidateWidget(var3); // L: 1011
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 1012
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 1032
				var3.modelType = 2; // L: 1033
				var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1034
				return 1; // L: 1035
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 1037
				var3.modelType = 3; // L: 1038
				var3.modelId = BuddyRankComparator.localPlayer.appearance.getChatHeadId(); // L: 1039
				return 1; // L: 1040
			} else {
				return 2; // L: 1042
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 2; // L: 1013
			int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1014
			int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1015
			var3.itemId = var4; // L: 1016
			var3.itemQuantity = var5; // L: 1017
			ItemComposition var6 = ParamComposition.ItemComposition_get(var4); // L: 1018
			var3.modelAngleX = var6.xan2d; // L: 1019
			var3.modelAngleY = var6.yan2d; // L: 1020
			var3.modelAngleZ = var6.zan2d; // L: 1021
			var3.modelOffsetX = var6.offsetX2d; // L: 1022
			var3.modelOffsetY = var6.offsetY2d; // L: 1023
			var3.modelZoom = var6.zoom2d; // L: 1024
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) { // L: 1025
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | var6.isStackable == 1) { // L: 1026
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2; // L: 1027
			}

			if (var3.field3532 > 0) { // L: 1028
				var3.modelZoom = var3.modelZoom * 32 / var3.field3532;
			} else if (var3.rawWidth > 0) { // L: 1029
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1; // L: 1030
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1637419736"
	)
	static final void method2216(String var0) {
		MusicPatchNode.addGameMessage(30, "", var0); // L: 117
	} // L: 118

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIILir;[Liz;)V"
	)
	static final void method2163(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
		Buffer var10 = new Buffer(var0); // L: 311
		int var11 = -1; // L: 312

		while (true) {
			int var12 = var10.method8696(); // L: 314
			if (var12 == 0) { // L: 315
				return; // L: 370
			}

			var11 += var12; // L: 316
			int var13 = 0; // L: 317

			while (true) {
				int var14 = var10.readUShortSmart(); // L: 319
				if (var14 == 0) { // L: 320
					break;
				}

				var13 += var14 - 1; // L: 321
				int var15 = var13 & 63; // L: 322
				int var16 = var13 >> 6 & 63; // L: 323
				int var17 = var13 >> 12; // L: 324
				int var18 = var10.readUnsignedByte(); // L: 325
				int var19 = var18 >> 2; // L: 326
				int var20 = var18 & 3; // L: 327
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) { // L: 328
					ObjectComposition var21 = DecorativeObject.getObjectDefinition(var11); // L: 329
					int var22 = var2 + UserComparator4.method2843(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20); // L: 330
					int var25 = var16 & 7; // L: 333
					int var26 = var15 & 7; // L: 334
					int var28 = var21.sizeX; // L: 336
					int var29 = var21.sizeY; // L: 337
					int var30;
					if ((var20 & 1) == 1) { // L: 339
						var30 = var28; // L: 340
						var28 = var29; // L: 341
						var29 = var30; // L: 342
					}

					int var27 = var7 & 3; // L: 344
					int var24;
					if (var27 == 0) { // L: 345
						var24 = var26; // L: 346
					} else if (var27 == 1) { // L: 349
						var24 = 7 - var25 - (var28 - 1); // L: 350
					} else if (var27 == 2) { // L: 353
						var24 = 7 - var26 - (var29 - 1); // L: 354
					} else {
						var24 = var25; // L: 357
					}

					var30 = var3 + var24; // L: 359
					if (var22 > 0 && var30 > 0 && var22 < 103 && var30 < 103) { // L: 360
						int var31 = var1; // L: 361
						if ((Tiles_renderFlags[1][var22][var30] & 2) == 2) { // L: 362
							var31 = var1 - 1;
						}

						CollisionMap var32 = null; // L: 363
						if (var31 >= 0) { // L: 364
							var32 = var9[var31];
						}

						class30.addObjects(var1, var22, var30, var11, var20 + var7 & 3, var19, var8, var32); // L: 365
					}
				}
			}
		}
	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(Lmy;IIB)V",
		garbageValue = "-26"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) { // L: 10595
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) { // L: 10596
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) { // L: 10597
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) { // L: 10598
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) { // L: 10599
			var0.x = (var1 - var0.width) / 2 + (var0.rawX * var1 >> 14);
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14); // L: 10600
		}

		if (var0.yAlignment == 0) { // L: 10601
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) { // L: 10602
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) { // L: 10603
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14; // L: 10604
		} else if (var0.yAlignment == 4) { // L: 10605
			var0.y = (var2 - var0.height) / 2 + (var2 * var0.rawY >> 14);
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14); // L: 10606
		}

	} // L: 10607
}
