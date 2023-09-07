import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ac")
public final class class4 {
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = 559950057
	)
	@Export("currentPort")
	static int currentPort;

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIILiw;Lis;Z[I[ILij;I)I",
		garbageValue = "-375034258"
	)
	public static int method13(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4, boolean var5, int[] var6, int[] var7, class216 var8) {
		var8.method4234(); // L: 11
		int var9 = var8.method4199(); // L: 12
		int var10 = var8.method4216(); // L: 13
		int[][] var11 = var8.method4202(); // L: 14
		int[][] var12 = var8.method4222(); // L: 15
		int[] var13 = var8.method4203(); // L: 16
		int[] var14 = var8.method4204(); // L: 17
		boolean var15;
		int var17;
		int var18;
		int var23;
		int var24;
		int var25;
		int var26;
		int var27;
		int var28;
		int var29;
		int var31;
		int var33;
		int var42;
		if (var2 == 1) { // L: 19
			var17 = var8.method4199(); // L: 22
			var18 = var8.method4216(); // L: 23
			int[][] var19 = var8.method4202(); // L: 24
			int[][] var20 = var8.method4222(); // L: 25
			int[] var21 = var8.method4203(); // L: 26
			int[] var22 = var8.method4204(); // L: 27
			var23 = var8.method4205(); // L: 28
			var24 = var0; // L: 29
			var25 = var1; // L: 30
			var26 = var17 >> 1; // L: 31
			var27 = var18 >> 1; // L: 32
			var28 = var0 - var26; // L: 33
			var29 = var1 - var27; // L: 34
			var20[var26][var27] = 99; // L: 35
			var19[var26][var27] = 0; // L: 36
			byte var30 = 0; // L: 37
			var31 = 0; // L: 38
			var21[var30] = var0; // L: 39
			var42 = var30 + 1; // L: 40
			var22[var30] = var1;
			int[][] var32 = var4.flags; // L: 41

			boolean var16;
			while (true) {
				if (var42 == var31) { // L: 44
					var8.method4196(var24, var25); // L: 115
					var16 = false; // L: 116
					break;
				}

				var24 = var21[var31]; // L: 45
				var25 = var22[var31]; // L: 46
				var31 = var31 + 1 & var23; // L: 47
				var26 = var24 - var28; // L: 48
				var27 = var25 - var29; // L: 49
				var33 = var24 - var4.xInset; // L: 50
				int var34 = var25 - var4.yInset; // L: 51
				if (var3.hasArrived(1, var24, var25, var4)) { // L: 52
					var8.method4196(var24, var25); // L: 53
					var16 = true; // L: 54
					break;
				}

				int var35 = var19[var26][var27] + 1; // L: 57
				if (var26 > 0 && var20[var26 - 1][var27] == 0 && (var32[var33 - 1][var34] & 19136776) == 0) { // L: 58
					var21[var42] = var24 - 1; // L: 59
					var22[var42] = var25; // L: 60
					var42 = var42 + 1 & var23; // L: 61
					var20[var26 - 1][var27] = 2; // L: 62
					var19[var26 - 1][var27] = var35; // L: 63
				}

				if (var26 < var17 - 1 && var20[var26 + 1][var27] == 0 && (var32[var33 + 1][var34] & 19136896) == 0) { // L: 65
					var21[var42] = var24 + 1; // L: 66
					var22[var42] = var25; // L: 67
					var42 = var42 + 1 & var23; // L: 68
					var20[var26 + 1][var27] = 8; // L: 69
					var19[var26 + 1][var27] = var35; // L: 70
				}

				if (var27 > 0 && var20[var26][var27 - 1] == 0 && (var32[var33][var34 - 1] & 19136770) == 0) { // L: 72
					var21[var42] = var24; // L: 73
					var22[var42] = var25 - 1; // L: 74
					var42 = var42 + 1 & var23; // L: 75
					var20[var26][var27 - 1] = 1; // L: 76
					var19[var26][var27 - 1] = var35; // L: 77
				}

				if (var27 < var18 - 1 && var20[var26][var27 + 1] == 0 && (var32[var33][var34 + 1] & 19136800) == 0) { // L: 79
					var21[var42] = var24; // L: 80
					var22[var42] = var25 + 1; // L: 81
					var42 = var42 + 1 & var23; // L: 82
					var20[var26][var27 + 1] = 4; // L: 83
					var19[var26][var27 + 1] = var35; // L: 84
				}

				if (var26 > 0 && var27 > 0 && var20[var26 - 1][var27 - 1] == 0 && (var32[var33 - 1][var34 - 1] & 19136782) == 0 && (var32[var33 - 1][var34] & 19136776) == 0 && (var32[var33][var34 - 1] & 19136770) == 0) { // L: 86
					var21[var42] = var24 - 1; // L: 87
					var22[var42] = var25 - 1; // L: 88
					var42 = var42 + 1 & var23; // L: 89
					var20[var26 - 1][var27 - 1] = 3; // L: 90
					var19[var26 - 1][var27 - 1] = var35; // L: 91
				}

				if (var26 < var17 - 1 && var27 > 0 && var20[var26 + 1][var27 - 1] == 0 && (var32[var33 + 1][var34 - 1] & 19136899) == 0 && (var32[var33 + 1][var34] & 19136896) == 0 && (var32[var33][var34 - 1] & 19136770) == 0) { // L: 93
					var21[var42] = var24 + 1; // L: 94
					var22[var42] = var25 - 1; // L: 95
					var42 = var42 + 1 & var23; // L: 96
					var20[var26 + 1][var27 - 1] = 9; // L: 97
					var19[var26 + 1][var27 - 1] = var35; // L: 98
				}

				if (var26 > 0 && var27 < var18 - 1 && var20[var26 - 1][var27 + 1] == 0 && (var32[var33 - 1][var34 + 1] & 19136824) == 0 && (var32[var33 - 1][var34] & 19136776) == 0 && (var32[var33][var34 + 1] & 19136800) == 0) { // L: 100
					var21[var42] = var24 - 1; // L: 101
					var22[var42] = var25 + 1; // L: 102
					var42 = var42 + 1 & var23; // L: 103
					var20[var26 - 1][var27 + 1] = 6; // L: 104
					var19[var26 - 1][var27 + 1] = var35; // L: 105
				}

				if (var26 < var17 - 1 && var27 < var18 - 1 && var20[var26 + 1][var27 + 1] == 0 && (var32[var33 + 1][var34 + 1] & 19136992) == 0 && (var32[var33 + 1][var34] & 19136896) == 0 && (var32[var33][var34 + 1] & 19136800) == 0) { // L: 107
					var21[var42] = var24 + 1; // L: 108
					var22[var42] = var25 + 1; // L: 109
					var42 = var42 + 1 & var23; // L: 110
					var20[var26 + 1][var27 + 1] = 12; // L: 111
					var19[var26 + 1][var27 + 1] = var35; // L: 112
				}
			}

			var15 = var16; // L: 118
		} else if (var2 == 2) { // L: 120
			var15 = LoginPacket.method5713(var0, var1, var3, var4, var8);
		} else {
			var15 = FontName.method8702(var0, var1, var2, var3, var4, var8); // L: 121
		}

		int var41 = var0 - (var9 >> 1); // L: 122
		var17 = var1 - (var10 >> 1); // L: 123
		var18 = var8.method4197(); // L: 124
		int var36 = var8.method4198(); // L: 125
		int var37;
		int var38;
		if (!var15) { // L: 126
			var37 = Integer.MAX_VALUE; // L: 128
			var38 = Integer.MAX_VALUE; // L: 129
			byte var39 = 10; // L: 130
			var23 = var3.approxDestinationX; // L: 131
			var24 = var3.approxDestinationY; // L: 132
			var25 = var3.approxDestinationSizeX; // L: 133
			var26 = var3.approxDestinationSizeY; // L: 134

			for (var27 = var23 - var39; var27 <= var39 + var23; ++var27) { // L: 135
				for (var28 = var24 - var39; var28 <= var24 + var39; ++var28) { // L: 136
					var29 = var27 - var41; // L: 137
					var42 = var28 - var17; // L: 138
					if (var29 >= 0 && var42 >= 0 && var29 < var9 && var42 < var10 && var11[var29][var42] < 100) { // L: 139 140
						var31 = 0; // L: 141
						if (var27 < var23) { // L: 142
							var31 = var23 - var27;
						} else if (var27 > var23 + var25 - 1) { // L: 143
							var31 = var27 - (var25 + var23 - 1);
						}

						int var40 = 0; // L: 144
						if (var28 < var24) { // L: 145
							var40 = var24 - var28;
						} else if (var28 > var26 + var24 - 1) { // L: 146
							var40 = var28 - (var26 + var24 - 1);
						}

						var33 = var40 * var40 + var31 * var31; // L: 147
						if (var33 < var37 || var33 == var37 && var11[var29][var42] < var38) { // L: 148
							var37 = var33; // L: 149
							var38 = var11[var29][var42]; // L: 150
							var18 = var27; // L: 151
							var36 = var28; // L: 152
						}
					}
				}
			}

			if (var37 == Integer.MAX_VALUE) { // L: 158
				return -1;
			}
		}

		if (var0 == var18 && var36 == var1) { // L: 162
			var6[0] = var18; // L: 163
			var7[0] = var36; // L: 164
			return 0; // L: 165
		} else {
			byte var43 = 0; // L: 167
			var13[var43] = var18; // L: 170
			var37 = var43 + 1; // L: 171
			var14[var43] = var36;

			int var44;
			for (var38 = var44 = var12[var18 - var41][var36 - var17]; var0 != var18 || var36 != var1; var38 = var12[var18 - var41][var36 - var17]) { // L: 172 173 183
				if (var38 != var44) { // L: 174
					var44 = var38; // L: 175
					var13[var37] = var18; // L: 176
					var14[var37++] = var36; // L: 177
				}

				if ((var38 & 2) != 0) { // L: 179
					++var18;
				} else if ((var38 & 8) != 0) { // L: 180
					--var18;
				}

				if ((var38 & 1) != 0) { // L: 181
					++var36;
				} else if ((var38 & 4) != 0) { // L: 182
					--var36;
				}
			}

			var23 = 0; // L: 185

			while (var37-- > 0) { // L: 186
				var6[var23] = var13[var37]; // L: 187
				var7[var23++] = var14[var37]; // L: 188
				if (var23 >= var6.length) { // L: 189
					break;
				}
			}

			return var23; // L: 191
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)Lui;",
		garbageValue = "693042452"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) { // L: 377
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) { // L: 378
			var4 = 1;
		}

		long var6 = ((long)var4 << 40) + ((long)var2 << 38) + ((long)var1 << 16) + (long)var0 + ((long)var3 << 42); // L: 379
		SpritePixels var8;
		if (!var5) { // L: 381
			var8 = (SpritePixels)ItemComposition.ItemComposition_cachedSprites.get(var6); // L: 382
			if (var8 != null) { // L: 383
				return var8;
			}
		}

		ItemComposition var9 = InvDefinition.ItemComposition_get(var0); // L: 385
		if (var1 > 1 && var9.countobj != null) { // L: 386
			int var10 = -1; // L: 387

			for (int var11 = 0; var11 < 10; ++var11) { // L: 388
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) { // L: 389
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) { // L: 391
				var9 = InvDefinition.ItemComposition_get(var10);
			}
		}

		Model var22 = var9.getModel(1); // L: 393
		if (var22 == null) { // L: 394
			return null;
		} else {
			SpritePixels var23 = null; // L: 395
			if (var9.noteTemplate != -1) { // L: 396
				var23 = getItemSprite(var9.note, 10, 1, 0, 0, true); // L: 397
				if (var23 == null) { // L: 398
					return null;
				}
			} else if (var9.notedId != -1) { // L: 400
				var23 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false); // L: 401
				if (var23 == null) { // L: 402
					return null;
				}
			} else if (var9.placeholderTemplate != -1) { // L: 404
				var23 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false); // L: 405
				if (var23 == null) { // L: 406
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels; // L: 408
			int var13 = Rasterizer2D.Rasterizer2D_width; // L: 409
			int var14 = Rasterizer2D.Rasterizer2D_height; // L: 410
			float[] var15 = Rasterizer2D.field5184; // L: 411
			int[] var16 = new int[4]; // L: 412
			Rasterizer2D.Rasterizer2D_getClipArray(var16); // L: 413
			var8 = new SpritePixels(36, 32); // L: 414
			Rasterizer3D.method4388(var8.pixels, 36, 32, (float[])null); // L: 415
			Rasterizer2D.Rasterizer2D_clear(); // L: 416
			Rasterizer3D.method4389(); // L: 417
			Rasterizer3D.method4449(16, 16); // L: 418
			Rasterizer3D.field2536.field2811 = false; // L: 419
			if (var9.placeholderTemplate != -1) { // L: 420
				var23.drawTransBgAt(0, 0);
			}

			int var17 = var9.zoom2d; // L: 421
			if (var5) { // L: 422
				var17 = (int)((double)var17 * 1.5D);
			} else if (var2 == 2) { // L: 423
				var17 = (int)((double)var17 * 1.04D);
			}

			int var18 = var17 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16; // L: 424
			int var19 = var17 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16; // L: 425
			var22.calculateBoundsCylinder(); // L: 426
			var22.method4785(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var22.height / 2 + var18 + var9.offsetY2d, var19 + var9.offsetY2d); // L: 427
			if (var9.notedId != -1) {
				var23.drawTransBgAt(0, 0); // L: 428
			}

			if (var2 >= 1) { // L: 429
				var8.outline(1);
			}

			if (var2 >= 2) { // L: 430
				var8.outline(16777215);
			}

			if (var3 != 0) { // L: 431
				var8.shadow(var3);
			}

			Rasterizer3D.method4388(var8.pixels, 36, 32, (float[])null); // L: 432
			if (var9.noteTemplate != -1) { // L: 433
				var23.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) { // L: 434
				Font var20 = class452.field4759; // L: 435
				String var21;
				if (var1 < 100000) { // L: 438
					var21 = "<col=ffff00>" + var1 + "</col>"; // L: 439
				} else if (var1 < 10000000) { // L: 442
					var21 = "<col=ffffff>" + var1 / 1000 + "K" + "</col>"; // L: 443
				} else {
					var21 = "<col=00ff80>" + var1 / 1000000 + "M" + "</col>"; // L: 446
				}

				var20.draw(var21, 0, 9, 16776960, 1); // L: 448
			}

			if (!var5) { // L: 450
				ItemComposition.ItemComposition_cachedSprites.put(var8, var6);
			}

			Rasterizer3D.method4388(var12, var13, var14, var15); // L: 451
			Rasterizer2D.Rasterizer2D_setClipArray(var16); // L: 452
			Rasterizer3D.method4389(); // L: 453
			Rasterizer3D.field2536.field2811 = true; // L: 454
			return var8; // L: 455
		}
	}
}
