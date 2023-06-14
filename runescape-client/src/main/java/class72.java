import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
public class class72 {
	@ObfuscatedName("ax")
	static final BigInteger field890;
	@ObfuscatedName("ap")
	static final BigInteger field891;

	static {
		field890 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		field891 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([FIFZFZ[FI)I",
		garbageValue = "-11306176"
	)
	public static int method2044(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
		float var7 = 0.0F; // L: 15

		for (int var8 = 0; var8 < var1 + 1; ++var8) { // L: 16
			var7 += Math.abs(var0[var8]); // L: 17
		}

		float var24 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * class125.field1463; // L: 19
		if (var7 <= var24) { // L: 20
			return -1; // L: 21
		} else {
			float[] var9 = new float[var1 + 1]; // L: 23

			int var10;
			for (var10 = 0; var10 < var1 + 1; ++var10) { // L: 24
				var9[var10] = var0[var10] * (1.0F / var7); // L: 25
			}

			while (Math.abs(var9[var1]) < var24) { // L: 27
				--var1; // L: 28
			}

			var10 = 0; // L: 30
			if (var1 == 0) { // L: 31
				return var10; // L: 32
			} else if (var1 == 1) { // L: 34
				var6[0] = -var9[0] / var9[1]; // L: 35
				boolean var22 = var3 ? var2 < var6[0] + var24 : var2 < var6[0] - var24; // L: 36
				boolean var23 = var5 ? var4 > var6[0] - var24 : var4 > var24 + var6[0]; // L: 37
				var10 = var22 && var23 ? 1 : 0; // L: 38
				if (var10 > 0) { // L: 39
					if (var3 && var6[0] < var2) { // L: 40
						var6[0] = var2; // L: 41
					} else if (var5 && var6[0] > var4) { // L: 43
						var6[0] = var4; // L: 44
					}
				}

				return var10; // L: 47
			} else {
				class440 var11 = new class440(var9, var1); // L: 50
				float[] var12 = new float[var1 + 1]; // L: 51

				for (int var13 = 1; var13 <= var1; ++var13) { // L: 52
					var12[var13 - 1] = (float)var13 * var9[var13]; // L: 53
				}

				float[] var21 = new float[var1 + 1]; // L: 55
				int var14 = method2044(var12, var1 - 1, var2, false, var4, false, var21); // L: 56
				if (var14 == -1) { // L: 57
					return 0; // L: 58
				} else {
					boolean var15 = false; // L: 60
					float var17 = 0.0F; // L: 62
					float var18 = 0.0F; // L: 63
					float var19 = 0.0F; // L: 64

					for (int var20 = 0; var20 <= var14; ++var20) { // L: 65
						if (var10 > var1) { // L: 66
							return var10;
						}

						float var16;
						if (var20 == 0) { // L: 67
							var16 = var2; // L: 68
							var18 = FriendLoginUpdate.method7784(var9, var1, var2); // L: 69
							if (Math.abs(var18) <= var24 && var3) { // L: 70
								var6[var10++] = var2;
							}
						} else {
							var16 = var19; // L: 73
							var18 = var17; // L: 74
						}

						if (var20 == var14) { // L: 76
							var19 = var4; // L: 77
							var15 = false; // L: 78
						} else {
							var19 = var21[var20]; // L: 81
						}

						var17 = FriendLoginUpdate.method7784(var9, var1, var19); // L: 83
						if (var15) { // L: 84
							var15 = false; // L: 85
						} else if (Math.abs(var17) < var24) { // L: 88
							if (var20 != var14 || var5) { // L: 89
								var6[var10++] = var19; // L: 90
								var15 = true; // L: 91
							}
						} else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) { // L: 94
							var6[var10++] = AbstractArchive.method6743(var11, var16, var19, 0.0F); // L: 95
							if (var10 > 1 && var6[var10 - 2] >= var6[var10 - 1] - var24) { // L: 96
								var6[var10 - 2] = 0.5F * (var6[var10 - 2] + var6[var10 - 1]); // L: 97
								--var10; // L: 98
							}
						}
					}

					return var10; // L: 104
				}
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Leq;FZB)F",
		garbageValue = "-113"
	)
	static float method2050(class129 var0, float var1, boolean var2) {
		float var3 = 0.0F;
		if (var0 != null && var0.method2981() != 0) {
			float var4 = (float)var0.field1510[0].field1457;
			float var5 = (float)var0.field1510[var0.method2981() - 1].field1457;
			float var6 = var5 - var4;
			if ((double)var6 == 0.0D) {
				return var0.field1510[0].field1455; // L: 218
			} else {
				float var7 = 0.0F;
				if (var1 > var5) {
					var7 = (var1 - var5) / var6;
				} else {
					var7 = (var1 - var4) / var6;
				}

				double var8 = (double)((int)var7);
				float var10 = Math.abs((float)((double)var7 - var8));
				float var11 = var10 * var6;
				var8 = Math.abs(1.0D + var8);
				double var12 = var8 / 2.0D; // L: 231
				double var14 = (double)((int)var12);
				var10 = (float)(var12 - var14);
				float var16;
				float var17;
				if (var2) {
					if (var0.field1506 == class127.field1491) { // L: 237
						if ((double)var10 != 0.0D) {
							var11 += var4;
						} else {
							var11 = var5 - var11; // L: 242
						}
					} else if (var0.field1506 != class127.field1487 && var0.field1506 != class127.field1488) {
						if (var0.field1506 == class127.field1486) {
							var11 = var4 - var1;
							var16 = var0.field1510[0].field1456;
							var17 = var0.field1510[0].field1461; // L: 251
							var3 = var0.field1510[0].field1455; // L: 252
							if (0.0D != (double)var16) {
								var3 -= var11 * var17 / var16;
							}

							return var3;
						}
					} else {
						var11 = var5 - var11; // L: 246
					}
				} else if (var0.field1507 == class127.field1491) {
					if (0.0D != (double)var10) {
						var11 = var5 - var11;
					} else {
						var11 += var4; // L: 265
					}
				} else if (var0.field1507 != class127.field1487 && var0.field1507 != class127.field1488) {
					if (var0.field1507 == class127.field1486) {
						var11 = var1 - var5;
						var16 = var0.field1510[var0.method2981() - 1].field1458;
						var17 = var0.field1510[var0.method2981() - 1].field1459; // L: 274
						var3 = var0.field1510[var0.method2981() - 1].field1455;
						if (0.0D != (double)var16) {
							var3 += var17 * var11 / var16;
						}

						return var3;
					}
				} else {
					var11 += var4; // L: 269
				}

				var3 = class130.method3002(var0, var11); // L: 282
				float var18;
				if (var2 && var0.field1506 == class127.field1488) {
					var18 = var0.field1510[var0.method2981() - 1].field1455 - var0.field1510[0].field1455;
					var3 = (float)((double)var3 - var8 * (double)var18); // L: 286
				} else if (!var2 && var0.field1507 == class127.field1488) {
					var18 = var0.field1510[var0.method2981() - 1].field1455 - var0.field1510[0].field1455;
					var3 = (float)((double)var3 + (double)var18 * var8);
				}

				return var3; // L: 292
			}
		} else {
			return var3;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ltl;II)V",
		garbageValue = "-1616435394"
	)
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1; // L: 201
		if (var2) { // L: 202
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}

		int var3 = var0.readBits(2); // L: 203
		Player var4 = Client.players[var1]; // L: 204
		if (var3 == 0) { // L: 205
			if (var2) { // L: 206
				var4.field1124 = false; // L: 207
			} else if (Client.localPlayerIndex == var1) { // L: 210
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (class213.baseX * 64 + var4.pathX[0] >> 13 << 14) + (class101.baseY * 64 + var4.pathY[0] >> 13); // L: 211
				if (var4.field1228 != -1) { // L: 212
					Players.Players_orientations[var1] = var4.field1228;
				} else {
					Players.Players_orientations[var1] = var4.orientation; // L: 213
				}

				Players.Players_targetIndices[var1] = var4.targetIndex; // L: 214
				Client.players[var1] = null; // L: 215
				if (var0.readBits(1) != 0) { // L: 216
					UserComparator7.updateExternalPlayer(var0, var1);
				}

			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) { // L: 219
				var5 = var0.readBits(3); // L: 220
				var6 = var4.pathX[0]; // L: 221
				var7 = var4.pathY[0]; // L: 222
				if (var5 == 0) { // L: 223
					--var6; // L: 224
					--var7; // L: 225
				} else if (var5 == 1) { // L: 227
					--var7;
				} else if (var5 == 2) { // L: 228
					++var6; // L: 229
					--var7; // L: 230
				} else if (var5 == 3) { // L: 232
					--var6;
				} else if (var5 == 4) { // L: 233
					++var6;
				} else if (var5 == 5) { // L: 234
					--var6; // L: 235
					++var7; // L: 236
				} else if (var5 == 6) { // L: 238
					++var7;
				} else if (var5 == 7) { // L: 239
					++var6; // L: 240
					++var7; // L: 241
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 243
					var4.resetPath(var6, var7); // L: 244
					var4.field1124 = false; // L: 245
				} else if (var2) { // L: 247
					var4.field1124 = true; // L: 248
					var4.tileX = var6; // L: 249
					var4.tileY = var7; // L: 250
				} else {
					var4.field1124 = false; // L: 253
					var4.method2301(var6, var7, Players.field1328[var1]); // L: 254
				}

			} else if (var3 == 2) { // L: 258
				var5 = var0.readBits(4); // L: 259
				var6 = var4.pathX[0]; // L: 260
				var7 = var4.pathY[0]; // L: 261
				if (var5 == 0) { // L: 262
					var6 -= 2; // L: 263
					var7 -= 2; // L: 264
				} else if (var5 == 1) { // L: 266
					--var6; // L: 267
					var7 -= 2; // L: 268
				} else if (var5 == 2) { // L: 270
					var7 -= 2;
				} else if (var5 == 3) { // L: 271
					++var6; // L: 272
					var7 -= 2; // L: 273
				} else if (var5 == 4) { // L: 275
					var6 += 2; // L: 276
					var7 -= 2; // L: 277
				} else if (var5 == 5) { // L: 279
					var6 -= 2; // L: 280
					--var7; // L: 281
				} else if (var5 == 6) { // L: 283
					var6 += 2; // L: 284
					--var7; // L: 285
				} else if (var5 == 7) { // L: 287
					var6 -= 2;
				} else if (var5 == 8) { // L: 288
					var6 += 2;
				} else if (var5 == 9) { // L: 289
					var6 -= 2; // L: 290
					++var7; // L: 291
				} else if (var5 == 10) { // L: 293
					var6 += 2; // L: 294
					++var7; // L: 295
				} else if (var5 == 11) { // L: 297
					var6 -= 2; // L: 298
					var7 += 2; // L: 299
				} else if (var5 == 12) { // L: 301
					--var6; // L: 302
					var7 += 2; // L: 303
				} else if (var5 == 13) { // L: 305
					var7 += 2;
				} else if (var5 == 14) { // L: 306
					++var6; // L: 307
					var7 += 2; // L: 308
				} else if (var5 == 15) { // L: 310
					var6 += 2; // L: 311
					var7 += 2; // L: 312
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 314
					var4.resetPath(var6, var7); // L: 315
					var4.field1124 = false; // L: 316
				} else if (var2) { // L: 318
					var4.field1124 = true; // L: 319
					var4.tileX = var6; // L: 320
					var4.tileY = var7; // L: 321
				} else {
					var4.field1124 = false; // L: 324
					var4.method2301(var6, var7, Players.field1328[var1]); // L: 325
				}

			} else {
				var5 = var0.readBits(1); // L: 329
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) { // L: 330
					var6 = var0.readBits(12); // L: 331
					var7 = var6 >> 10; // L: 332
					var8 = var6 >> 5 & 31; // L: 333
					if (var8 > 15) { // L: 334
						var8 -= 32;
					}

					var9 = var6 & 31; // L: 335
					if (var9 > 15) { // L: 336
						var9 -= 32;
					}

					var10 = var8 + var4.pathX[0]; // L: 337
					var11 = var9 + var4.pathY[0]; // L: 338
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 339
						var4.resetPath(var10, var11); // L: 340
						var4.field1124 = false; // L: 341
					} else if (var2) { // L: 343
						var4.field1124 = true; // L: 344
						var4.tileX = var10; // L: 345
						var4.tileY = var11; // L: 346
					} else {
						var4.field1124 = false; // L: 349
						var4.method2301(var10, var11, Players.field1328[var1]); // L: 350
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 352
					if (Client.localPlayerIndex == var1) { // L: 353
						Clock.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30); // L: 356
					var7 = var6 >> 28; // L: 357
					var8 = var6 >> 14 & 16383; // L: 358
					var9 = var6 & 16383; // L: 359
					var10 = (class213.baseX * 64 + var8 + var4.pathX[0] & 16383) - class213.baseX * 64; // L: 360
					var11 = (class101.baseY * 64 + var9 + var4.pathY[0] & 16383) - class101.baseY * 64; // L: 361
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 362
						var4.resetPath(var10, var11); // L: 363
						var4.field1124 = false; // L: 364
					} else if (var2) { // L: 366
						var4.field1124 = true; // L: 367
						var4.tileX = var10; // L: 368
						var4.tileY = var11; // L: 369
					} else {
						var4.field1124 = false; // L: 372
						var4.method2301(var10, var11, Players.field1328[var1]); // L: 373
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 375
					if (Client.localPlayerIndex == var1) { // L: 376
						Clock.Client_plane = var4.plane;
					}

				}
			}
		}
	} // L: 208 217 256 327 354 377
}
