import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oa")
public final class class383 {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -366396283
	)
	public static int field4405;

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([FIFZFZ[FS)I",
		garbageValue = "7098"
	)
	public static int method7205(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
		float var7 = 0.0F; // L: 15

		for (int var8 = 0; var8 < var1 + 1; ++var8) { // L: 16
			var7 += Math.abs(var0[var8]); // L: 17
		}

		float var44 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * class126.field1494; // L: 19
		if (var7 <= var44) { // L: 20
			return -1; // L: 21
		} else {
			float[] var9 = new float[var1 + 1]; // L: 23

			int var10;
			for (var10 = 0; var10 < var1 + 1; ++var10) { // L: 24
				var9[var10] = var0[var10] * (1.0F / var7); // L: 25
			}

			while (Math.abs(var9[var1]) < var44) { // L: 27
				--var1; // L: 28
			}

			var10 = 0; // L: 30
			if (var1 == 0) { // L: 31
				return var10; // L: 32
			} else if (var1 == 1) { // L: 34
				var6[0] = -var9[0] / var9[1]; // L: 35
				boolean var42 = var3 ? var2 < var44 + var6[0] : var2 < var6[0] - var44; // L: 36
				boolean var43 = var5 ? var4 > var6[0] - var44 : var4 > var6[0] + var44; // L: 37
				var10 = var42 && var43 ? 1 : 0; // L: 38
				if (var10 > 0) { // L: 39
					if (var3 && var6[0] < var2) { // L: 40
						var6[0] = var2; // L: 41
					} else if (var5 && var6[0] > var4) { // L: 43
						var6[0] = var4; // L: 44
					}
				}

				return var10; // L: 47
			} else {
				class452 var11 = new class452(var9, var1); // L: 50
				float[] var12 = new float[var1 + 1]; // L: 51

				for (int var13 = 1; var13 <= var1; ++var13) { // L: 52
					var12[var13 - 1] = (float)var13 * var9[var13]; // L: 53
				}

				float[] var41 = new float[var1 + 1]; // L: 55
				int var14 = method7205(var12, var1 - 1, var2, false, var4, false, var41); // L: 56
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
							var18 = class177.method3610(var9, var1, var2); // L: 69
							if (Math.abs(var18) <= var44 && var3) { // L: 70
								var6[var10++] = var2;
							}
						} else {
							var16 = var19; // L: 73
							var18 = var17; // L: 74
						}

						if (var14 == var20) { // L: 76
							var19 = var4; // L: 77
							var15 = false; // L: 78
						} else {
							var19 = var41[var20]; // L: 81
						}

						var17 = class177.method3610(var9, var1, var19); // L: 83
						if (var15) { // L: 84
							var15 = false; // L: 85
						} else if (Math.abs(var17) < var44) { // L: 88
							if (var20 != var14 || var5) { // L: 89
								var6[var10++] = var19; // L: 90
								var15 = true; // L: 91
							}
						} else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) { // L: 94
							int var22 = var10++; // L: 96
							float var24 = var16; // L: 98
							float var25 = var19; // L: 99
							float var26 = class177.method3610(var11.field4750, var11.field4751, var16); // L: 101
							float var23;
							if (Math.abs(var26) < class126.field1494) { // L: 102
								var23 = var16; // L: 103
							} else {
								float var27 = class177.method3610(var11.field4750, var11.field4751, var19); // L: 106
								if (Math.abs(var27) < class126.field1494) { // L: 107
									var23 = var19; // L: 108
								} else {
									float var28 = 0.0F; // L: 111
									float var29 = 0.0F; // L: 112
									float var30 = 0.0F; // L: 113
									float var35 = 0.0F; // L: 118
									boolean var36 = true; // L: 119
									boolean var37 = false; // L: 120

									do {
										var37 = false; // L: 122
										if (var36) { // L: 123
											var28 = var24; // L: 124
											var35 = var26; // L: 125
											var29 = var25 - var24; // L: 126
											var30 = var29; // L: 127
											var36 = false; // L: 128
										}

										if (Math.abs(var35) < Math.abs(var27)) { // L: 130
											var24 = var25; // L: 131
											var25 = var28; // L: 132
											var28 = var24; // L: 133
											var26 = var27; // L: 134
											var27 = var35; // L: 135
											var35 = var26; // L: 136
										}

										float var38 = class126.field1495 * Math.abs(var25) + 0.0F; // L: 138
										float var39 = (var28 - var25) * 0.5F; // L: 139
										boolean var40 = Math.abs(var39) > var38 && 0.0F != var27; // L: 140
										if (var40) { // L: 141
											if (Math.abs(var30) >= var38 && Math.abs(var26) > Math.abs(var27)) { // L: 142
												float var34 = var27 / var26; // L: 147
												float var31;
												float var32;
												if (var28 == var24) { // L: 148
													var31 = 2.0F * var39 * var34; // L: 149
													var32 = 1.0F - var34; // L: 150
												} else {
													var32 = var26 / var35; // L: 153
													float var33 = var27 / var35; // L: 154
													var31 = var34 * ((var32 - var33) * var39 * 2.0F * var32 - (var33 - 1.0F) * (var25 - var24)); // L: 155
													var32 = (var34 - 1.0F) * (var32 - 1.0F) * (var33 - 1.0F); // L: 156
												}

												if ((double)var31 > 0.0D) { // L: 158
													var32 = -var32;
												} else {
													var31 = -var31; // L: 159
												}

												var34 = var30; // L: 160
												var30 = var29; // L: 161
												if (2.0F * var31 < var39 * 3.0F * var32 - Math.abs(var32 * var38) && var31 < Math.abs(0.5F * var34 * var32)) { // L: 162
													var29 = var31 / var32; // L: 163
												} else {
													var29 = var39; // L: 166
													var30 = var39; // L: 167
												}
											} else {
												var29 = var39; // L: 143
												var30 = var39; // L: 144
											}

											var24 = var25; // L: 170
											var26 = var27; // L: 171
											if (Math.abs(var29) > var38) { // L: 172
												var25 += var29;
											} else if ((double)var39 > 0.0D) { // L: 173
												var25 += var38;
											} else {
												var25 -= var38; // L: 174
											}

											var27 = class177.method3610(var11.field4750, var11.field4751, var25); // L: 175
											if ((double)(var27 * (var35 / Math.abs(var35))) > 0.0D) { // L: 176
												var36 = true; // L: 177
												var37 = true; // L: 178
											} else {
												var37 = true; // L: 181
											}
										}
									} while(var37);

									var23 = var25; // L: 185
								}
							}

							var6[var22] = var23; // L: 187
							if (var10 > 1 && var6[var10 - 2] >= var6[var10 - 1] - var44) { // L: 188
								var6[var10 - 2] = 0.5F * (var6[var10 - 1] + var6[var10 - 2]); // L: 189
								--var10; // L: 190
							}
						}
					}

					return var10; // L: 196
				}
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILiw;Lig;I)V",
		garbageValue = "404864442"
	)
	@Export("addObjects")
	static final void addObjects(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) { // L: 303 304 305
			if (var0 < Tiles.Tiles_minPlane) { // L: 308
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = Language.getObjectDefinition(var3); // L: 309
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) { // L: 312
				var9 = var8.sizeX; // L: 317
				var10 = var8.sizeY; // L: 318
			} else {
				var9 = var8.sizeY; // L: 313
				var10 = var8.sizeX; // L: 314
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) { // L: 324
				var11 = (var9 >> 1) + var1; // L: 325
				var12 = (var9 + 1 >> 1) + var1; // L: 326
			} else {
				var11 = var1; // L: 329
				var12 = var1 + 1; // L: 330
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) { // L: 332
				var13 = (var10 >> 1) + var2; // L: 333
				var14 = var2 + (var10 + 1 >> 1); // L: 334
			} else {
				var13 = var2; // L: 337
				var14 = var2 + 1; // L: 338
			}

			int[][] var15 = Tiles.Tiles_heights[var0]; // L: 340
			int var16 = var15[var12][var14] + var15[var11][var14] + var15[var11][var13] + var15[var12][var13] >> 2; // L: 341
			int var17 = (var1 << 7) + (var9 << 6); // L: 342
			int var18 = (var2 << 7) + (var10 << 6); // L: 343
			long var19 = ChatChannel.calculateTag(var1, var2, 2, var8.int1 == 0, var3); // L: 344
			int var21 = var5 + (var4 << 6); // L: 345
			if (var8.int3 == 1) { // L: 346
				var21 += 256;
			}

			if (var8.hasSound()) { // L: 347
				class145.method3225(var0, var1, var2, var8, var4);
			}

			Object var29;
			if (var5 == 22) { // L: 348
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) { // L: 349
					if (var8.animationId == -1 && var8.transforms == null) { // L: 351
						var29 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 352
					}

					var6.newGroundObject(var0, var1, var2, var16, (Renderable)var29, var19, var21); // L: 353
					if (var8.interactType == 1 && var7 != null) { // L: 354
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else {
				int var28;
				if (var5 != 10 && var5 != 11) { // L: 357
					int[] var10000;
					if (var5 >= 12) { // L: 378
						if (var8.animationId == -1 && var8.transforms == null) { // L: 380
							var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 381
						}

						var6.method4786(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 382
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) { // L: 383
							var10000 = WorldMapCacheName.field3059[var0][var1];
							var10000[var2] |= 2340;
						}

						if (var8.interactType != 0 && var7 != null) { // L: 384
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

					} else if (var5 == 0) { // L: 387
						if (var8.animationId == -1 && var8.transforms == null) { // L: 389
							var29 = var8.getEntity(0, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 390
						}

						var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1023[var4], 0, var19, var21); // L: 391
						if (var4 == 0) { // L: 392
							if (var8.clipped) { // L: 393
								class350.field3891[var0][var1][var2] = 50; // L: 394
								class350.field3891[var0][var1][var2 + 1] = 50; // L: 395
							}

							if (var8.modelClipped) { // L: 397
								var10000 = WorldMapCacheName.field3059[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) { // L: 399
							if (var8.clipped) { // L: 400
								class350.field3891[var0][var1][var2 + 1] = 50; // L: 401
								class350.field3891[var0][var1 + 1][var2 + 1] = 50; // L: 402
							}

							if (var8.modelClipped) { // L: 404
								var10000 = WorldMapCacheName.field3059[var0][var1];
								var10000[var2 + 1] |= 1170;
							}
						} else if (var4 == 2) { // L: 406
							if (var8.clipped) { // L: 407
								class350.field3891[var0][var1 + 1][var2] = 50; // L: 408
								class350.field3891[var0][var1 + 1][var2 + 1] = 50; // L: 409
							}

							if (var8.modelClipped) { // L: 411
								var10000 = WorldMapCacheName.field3059[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) { // L: 413
							if (var8.clipped) { // L: 414
								class350.field3891[var0][var1][var2] = 50; // L: 415
								class350.field3891[var0][var1 + 1][var2] = 50; // L: 416
							}

							if (var8.modelClipped) { // L: 418
								var10000 = WorldMapCacheName.field3059[var0][var1];
								var10000[var2] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 420
							var7.method4302(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 421
							var6.method4630(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 1) { // L: 424
						if (var8.animationId == -1 && var8.transforms == null) { // L: 426
							var29 = var8.getEntity(1, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 427
						}

						var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1024[var4], 0, var19, var21); // L: 428
						if (var8.clipped) { // L: 429
							if (var4 == 0) { // L: 430
								class350.field3891[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) { // L: 431
								class350.field3891[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) { // L: 432
								class350.field3891[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) { // L: 433
								class350.field3891[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 435
							var7.method4302(var1, var2, var5, var4, var8.boolean1);
						}

					} else {
						int var22;
						if (var5 == 2) { // L: 438
							var22 = var4 + 1 & 3; // L: 439
							Object var24;
							Object var30;
							if (var8.animationId == -1 && var8.transforms == null) { // L: 442
								var30 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18); // L: 443
								var24 = var8.getEntity(2, var22, var15, var17, var16, var18); // L: 444
							} else {
								var30 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 447
								var24 = new DynamicObject(var3, 2, var22, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 448
							}

							var6.newWallObject(var0, var1, var2, var16, (Renderable)var30, (Renderable)var24, Tiles.field1023[var4], Tiles.field1023[var22], var19, var21); // L: 450
							if (var8.modelClipped) { // L: 451
								if (var4 == 0) { // L: 452
									var10000 = WorldMapCacheName.field3059[var0][var1]; // L: 453
									var10000[var2] |= 585;
									var10000 = WorldMapCacheName.field3059[var0][var1]; // L: 454
									var10000[var2 + 1] |= 1170;
								} else if (var4 == 1) { // L: 456
									var10000 = WorldMapCacheName.field3059[var0][var1]; // L: 457
									var10000[1 + var2] |= 1170;
									var10000 = WorldMapCacheName.field3059[var0][var1 + 1]; // L: 458
									var10000[var2] |= 585;
								} else if (var4 == 2) { // L: 460
									var10000 = WorldMapCacheName.field3059[var0][var1 + 1]; // L: 461
									var10000[var2] |= 585;
									var10000 = WorldMapCacheName.field3059[var0][var1]; // L: 462
									var10000[var2] |= 1170;
								} else if (var4 == 3) { // L: 464
									var10000 = WorldMapCacheName.field3059[var0][var1]; // L: 465
									var10000[var2] |= 1170;
									var10000 = WorldMapCacheName.field3059[var0][var1]; // L: 466
									var10000[var2] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 469
								var7.method4302(var1, var2, var5, var4, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 470
								var6.method4630(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 3) { // L: 473
							if (var8.animationId == -1 && var8.transforms == null) { // L: 475
								var29 = var8.getEntity(3, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 476
							}

							var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1024[var4], 0, var19, var21); // L: 477
							if (var8.clipped) { // L: 478
								if (var4 == 0) { // L: 479
									class350.field3891[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) { // L: 480
									class350.field3891[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) { // L: 481
									class350.field3891[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) { // L: 482
									class350.field3891[var0][var1][var2] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 484
								var7.method4302(var1, var2, var5, var4, var8.boolean1);
							}

						} else if (var5 == 9) { // L: 487
							if (var8.animationId == -1 && var8.transforms == null) { // L: 489
								var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 490
							}

							var6.method4786(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 491
							if (var8.interactType != 0 && var7 != null) { // L: 492
								var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 493
								var6.method4630(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 4) { // L: 496
							if (var8.animationId == -1 && var8.transforms == null) { // L: 498
								var29 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 499
							}

							var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1023[var4], 0, 0, 0, var19, var21); // L: 500
						} else {
							long var23;
							Object var25;
							if (var5 == 5) { // L: 503
								var22 = 16; // L: 504
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 505
								if (var23 != 0L) { // L: 506
									var22 = Language.getObjectDefinition(class318.Entity_unpackID(var23)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 508
									var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 509
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field1023[var4], 0, var22 * Tiles.field1025[var4], var22 * Tiles.field1030[var4], var19, var21); // L: 510
							} else if (var5 == 6) { // L: 513
								var22 = 8; // L: 514
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 515
								if (var23 != 0L) { // L: 516
									var22 = Language.getObjectDefinition(class318.Entity_unpackID(var23)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 518
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 519
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var22 * Tiles.field1027[var4], var22 * Tiles.field1031[var4], var19, var21); // L: 520
							} else if (var5 == 7) { // L: 523
								var28 = var4 + 2 & 3; // L: 525
								if (var8.animationId == -1 && var8.transforms == null) { // L: 526
									var29 = var8.getEntity(4, var28 + 4, var15, var17, var16, var18);
								} else {
									var29 = new DynamicObject(var3, 4, var28 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 527
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, 256, var28, 0, 0, var19, var21); // L: 528
							} else if (var5 == 8) { // L: 531
								var22 = 8; // L: 532
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 533
								if (var23 != 0L) { // L: 534
									var22 = Language.getObjectDefinition(class318.Entity_unpackID(var23)).int2 / 2;
								}

								int var27 = var4 + 2 & 3; // L: 537
								Object var26;
								if (var8.animationId == -1 && var8.transforms == null) { // L: 538
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18); // L: 539
									var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18); // L: 540
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 543
									var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 544
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var22 * Tiles.field1027[var4], var22 * Tiles.field1031[var4], var19, var21); // L: 546
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) { // L: 359
						var29 = var8.getEntity(10, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 360
					}

					if (var29 != null && var6.method4786(var0, var1, var2, var16, var9, var10, (Renderable)var29, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) { // L: 361 362
						var28 = 15; // L: 363
						if (var29 instanceof Model) { // L: 364
							var28 = ((Model)var29).method4851() / 4; // L: 365
							if (var28 > 30) { // L: 366
								var28 = 30;
							}
						}

						for (int var31 = 0; var31 <= var9; ++var31) { // L: 368
							for (int var32 = 0; var32 <= var10; ++var32) { // L: 369
								if (var28 > class350.field3891[var0][var31 + var1][var32 + var2]) { // L: 370
									class350.field3891[var0][var31 + var1][var32 + var2] = (byte)var28;
								}
							}
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 375
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				}
			}
		}
	} // L: 355 376 385 422 436 471 485 494 501 511 521 529 547 549

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1638011266"
	)
	static void method7203(int var0, int var1, int var2) {
		if (var0 != 0) { // L: 3725
			int var3 = var0 >> 8; // L: 3726
			int var4 = var0 >> 4 & 7; // L: 3727
			int var5 = var0 & 15; // L: 3728
			Client.soundEffectIds[Client.soundEffectCount] = var3; // L: 3729
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var4; // L: 3730
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 3731
			Client.soundEffects[Client.soundEffectCount] = null; // L: 3732
			int var6 = (var1 - 64) / 128; // L: 3733
			int var7 = (var2 - 64) / 128; // L: 3734
			Client.soundLocations[Client.soundEffectCount] = var5 + (var7 << 8) + (var6 << 16); // L: 3735
			++Client.soundEffectCount; // L: 3736
		}
	} // L: 3737
}
