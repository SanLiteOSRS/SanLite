import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
public class class303 {
	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([BIII)Z",
		garbageValue = "756949404"
	)
	static final boolean method5753(byte[] var0, int var1, int var2) {
		boolean var3 = true; // L: 239
		Buffer var4 = new Buffer(var0); // L: 240
		int var5 = -1; // L: 241

		label70:
		while (true) {
			int var6 = var4.method9104(); // L: 243
			if (var6 == 0) { // L: 244
				return var3; // L: 275
			}

			var5 += var6; // L: 245
			int var7 = 0; // L: 246
			boolean var8 = false; // L: 247

			while (true) {
				int var9;
				while (!var8) { // L: 249
					var9 = var4.readUShortSmart(); // L: 255
					if (var9 == 0) { // L: 256
						continue label70;
					}

					var7 += var9 - 1; // L: 257
					int var10 = var7 & 63; // L: 258
					int var11 = var7 >> 6 & 63; // L: 259
					int var12 = var4.readUnsignedByte() >> 2; // L: 260
					int var13 = var11 + var1; // L: 261
					int var14 = var10 + var2; // L: 262
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) { // L: 263
						ObjectComposition var15 = class90.getObjectDefinition(var5); // L: 264
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) { // L: 265
							if (!var15.needsModelFiles()) { // L: 266
								++Client.field679; // L: 267
								var3 = false; // L: 268
							}

							var8 = true; // L: 270
						}
					}
				}

				var9 = var4.readUShortSmart(); // L: 250
				if (var9 == 0) { // L: 251
					break;
				}

				var4.readUnsignedByte(); // L: 252
			}
		}
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIIII)V",
		garbageValue = "-1236623427"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) { // L: 5161
			if (var0 instanceof NPC) { // L: 5162
				NPCComposition var6 = ((NPC)var0).definition; // L: 5163
				if (var6.transforms != null) { // L: 5164
					var6 = var6.transform();
				}

				if (var6 == null) { // L: 5165
					return;
				}
			}

			int var75 = Players.Players_count; // L: 5167
			int[] var7 = Players.Players_indices; // L: 5168
			boolean var8 = var1 < var75; // L: 5169
			int var9 = -2; // L: 5170
			if (var0.field1213 != null && (!var8 || !var0.field1192 && (Client.publicChatMode == 4 || !var0.field1204 && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).method2319())))) { // L: 5171 5172
				class141.method3119(var0, var0.defaultHeight); // L: 5173
				if (Client.viewportTempX > -1 && Client.field531 < Client.field615) { // L: 5174
					Client.field722[Client.field531] = Calendar.fontBold12.stringWidth(var0.field1213) / 2; // L: 5175
					Client.field621[Client.field531] = Calendar.fontBold12.ascent; // L: 5176
					Client.field751[Client.field531] = Client.viewportTempX; // L: 5177
					Client.field646[Client.field531] = Client.viewportTempY - var9; // L: 5178
					Client.field623[Client.field531] = var0.field1207; // L: 5179
					Client.field683[Client.field531] = var0.field1208; // L: 5180
					Client.field579[Client.field531] = var0.field1182; // L: 5181
					Client.field638[Client.field531] = var0.field1189; // L: 5182
					Client.field627[Client.field531] = var0.field1213; // L: 5183
					++Client.field531; // L: 5184
					var9 += 12; // L: 5185
				}
			}

			int var15;
			int var22;
			int var23;
			if (!var0.healthBars.method7083()) { // L: 5189
				class141.method3119(var0, var0.defaultHeight + 15); // L: 5190

				for (HealthBar var10 = (HealthBar)var0.healthBars.last(); var10 != null; var10 = (HealthBar)var0.healthBars.previous()) { // L: 5191
					HealthBarUpdate var11 = var10.getInventorySprite(Client.cycle); // L: 5192
					if (var11 == null) { // L: 5193
						if (var10.isEmpty()) { // L: 5251
							var10.remove();
						}
					} else {
						HealthBarDefinition var12 = var10.definition; // L: 5194
						SpritePixels var79 = var12.method3674(); // L: 5195
						SpritePixels var83 = var12.getFrontSprite(); // L: 5196
						int var84 = 0; // L: 5198
						if (var79 != null && var83 != null) { // L: 5199
							if (var12.widthPadding * 2 < var83.subWidth) { // L: 5200
								var84 = var12.widthPadding;
							}

							var15 = var83.subWidth - var84 * 2; // L: 5201
						} else {
							var15 = var12.width; // L: 5203
						}

						int var81 = 255; // L: 5204
						boolean var85 = true; // L: 5205
						int var86 = Client.cycle - var11.cycle; // L: 5206
						int var87 = var15 * var11.health2 / var12.width; // L: 5207
						int var88;
						int var98;
						if (var11.cycleOffset > var86) { // L: 5208
							var88 = var12.field1953 == 0 ? 0 : var12.field1953 * (var86 / var12.field1953); // L: 5209
							var22 = var15 * var11.health / var12.width; // L: 5210
							var98 = var88 * (var87 - var22) / var11.cycleOffset + var22; // L: 5211
						} else {
							var98 = var87; // L: 5214
							var88 = var11.cycleOffset + var12.int5 - var86; // L: 5215
							if (var12.int3 >= 0) { // L: 5216
								var81 = (var88 << 8) / (var12.int5 - var12.int3);
							}
						}

						if (var11.health2 > 0 && var98 < 1) { // L: 5218
							var98 = 1;
						}

						if (var79 != null && var83 != null) { // L: 5219
							if (var15 == var98) { // L: 5220
								var98 += var84 * 2;
							} else {
								var98 += var84; // L: 5221
							}

							var88 = var79.subHeight; // L: 5222
							var9 += var88; // L: 5223
							var22 = var2 + Client.viewportTempX - (var15 >> 1); // L: 5224
							var23 = var3 + Client.viewportTempY - var9; // L: 5225
							var22 -= var84; // L: 5226
							if (var81 >= 0 && var81 < 255) { // L: 5227
								var79.drawTransAt(var22, var23, var81); // L: 5228
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var98, var23 + var88); // L: 5229
								var83.drawTransAt(var22, var23, var81); // L: 5230
							} else {
								var79.drawTransBgAt(var22, var23); // L: 5233
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var98, var23 + var88); // L: 5234
								var83.drawTransBgAt(var22, var23); // L: 5235
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5); // L: 5237
							var9 += 2; // L: 5238
						} else {
							var9 += 5; // L: 5241
							if (Client.viewportTempX > -1) { // L: 5242
								var88 = var2 + Client.viewportTempX - (var15 >> 1); // L: 5243
								var22 = var3 + Client.viewportTempY - var9; // L: 5244
								Rasterizer2D.Rasterizer2D_fillRectangle(var88, var22, var98, 5, 65280); // L: 5245
								Rasterizer2D.Rasterizer2D_fillRectangle(var98 + var88, var22, var15 - var98, 5, 16711680); // L: 5246
							}

							var9 += 2; // L: 5248
						}
					}
				}
			}

			if (var9 == -2) { // L: 5254
				var9 += 7;
			}

			Player var89;
			if (var8 && var0.playerCycle == Client.cycle && class60.method1192((Player)var0)) { // L: 5255
				var89 = (Player)var0; // L: 5256
				if (var8) { // L: 5257
					class141.method3119(var0, var0.defaultHeight + 15); // L: 5258
					AbstractFont var90 = (AbstractFont)Client.field582.get(FontName.FontName_plain12); // L: 5259
					var9 += 4; // L: 5260
					var90.drawCentered(var89.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var9, 16777215, 0); // L: 5261
					var9 += 18; // L: 5262
				}
			}

			if (var8) { // L: 5265
				var89 = (Player)var0; // L: 5266
				if (var89.isHidden) { // L: 5267
					return;
				}

				if (var89.headIconPk != -1 || var89.headIconPrayer != -1) { // L: 5268
					class141.method3119(var0, var0.defaultHeight + 15); // L: 5269
					if (Client.viewportTempX > -1) { // L: 5270
						if (var89.headIconPk != -1) { // L: 5271
							var9 += 25; // L: 5272
							class506.field5041[var89.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5273
						}

						if (var89.headIconPrayer != -1) { // L: 5275
							var9 += 25; // L: 5276
							class17.field92[var89.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5277
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.field538) { // L: 5281
					class141.method3119(var0, var0.defaultHeight + 15); // L: 5282
					if (Client.viewportTempX > -1) { // L: 5283
						var9 += class345.field3858[1].subHeight; // L: 5284
						class345.field3858[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5285
					}
				}
			} else {
				NPC var91 = (NPC)var0; // L: 5290
				int[] var92 = var91.method2596(); // L: 5291
				short[] var93 = var91.method2621(); // L: 5292
				if (var93 != null && var92 != null) { // L: 5293
					for (int var13 = 0; var13 < var93.length; ++var13) { // L: 5294
						if (var93[var13] >= 0 && var92[var13] >= 0) { // L: 5295
							long var14 = (long)var92[var13] << 8 | (long)var93[var13]; // L: 5298
							SpritePixels var16 = (SpritePixels)Client.archive5.method7829(var14); // L: 5299
							if (var16 == null) { // L: 5300
								SpritePixels[] var17 = class453.method8339(class386.field4436, var92[var13], 0); // L: 5301
								if (var17 != null && var93[var13] < var17.length) { // L: 5302
									var16 = var17[var93[var13]]; // L: 5303
									Client.archive5.method7830(var14, var16); // L: 5304
								}
							}

							if (var16 != null) { // L: 5307
								class141.method3119(var0, var0.defaultHeight + 15); // L: 5308
								if (Client.viewportTempX > -1) { // L: 5309
									var16.drawTransBgAt(var2 + Client.viewportTempX - (var16.subWidth >> 1), Client.viewportTempY + (var3 - var16.subHeight) - 4); // L: 5310
								}
							}
						}
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.field696 && Client.cycle % 20 < 10) { // L: 5315
					class141.method3119(var0, var0.defaultHeight + 15); // L: 5316
					if (Client.viewportTempX > -1) { // L: 5317
						class345.field3858[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			for (int var76 = 0; var76 < 4; ++var76) { // L: 5320
				int var77 = var0.hitSplatCycles[var76]; // L: 5321
				int var78 = var0.hitSplatTypes[var76]; // L: 5322
				HitSplatDefinition var96 = null; // L: 5323
				int var80 = 0; // L: 5324
				if (var78 >= 0) { // L: 5325
					if (var77 <= Client.cycle) { // L: 5326
						continue;
					}

					var96 = class177.method3541(var0.hitSplatTypes[var76]); // L: 5327
					var80 = var96.field2123; // L: 5328
					if (var96 != null && var96.transforms != null) { // L: 5329
						var96 = var96.transform(); // L: 5330
						if (var96 == null) { // L: 5331
							var0.hitSplatCycles[var76] = -1; // L: 5332
							continue; // L: 5333
						}
					}
				} else if (var77 < 0) { // L: 5337
					continue;
				}

				var15 = var0.hitSplatTypes2[var76]; // L: 5338
				HitSplatDefinition var94 = null; // L: 5339
				if (var15 >= 0) { // L: 5340
					var94 = class177.method3541(var15); // L: 5341
					if (var94 != null && var94.transforms != null) { // L: 5342
						var94 = var94.transform();
					}
				}

				if (var77 - var80 <= Client.cycle) { // L: 5344
					if (var96 == null) { // L: 5345
						var0.hitSplatCycles[var76] = -1; // L: 5346
					} else {
						class141.method3119(var0, var0.defaultHeight / 2); // L: 5349
						if (Client.viewportTempX > -1) { // L: 5350
							boolean var97 = true; // L: 5351
							if (var76 == 1) { // L: 5352
								Client.viewportTempY -= 20; // L: 5353
							}

							if (var76 == 2) { // L: 5355
								Client.viewportTempX -= 15; // L: 5356
								Client.viewportTempY -= 10; // L: 5357
							}

							if (var76 == 3) { // L: 5359
								Client.viewportTempX += 15; // L: 5360
								Client.viewportTempY -= 10; // L: 5361
							}

							SpritePixels var18 = null; // L: 5363
							SpritePixels var19 = null; // L: 5364
							SpritePixels var20 = null; // L: 5365
							SpritePixels var21 = null; // L: 5366
							var22 = 0; // L: 5367
							var23 = 0; // L: 5368
							int var24 = 0; // L: 5369
							int var25 = 0; // L: 5370
							int var26 = 0; // L: 5371
							int var27 = 0; // L: 5372
							int var28 = 0; // L: 5373
							int var29 = 0; // L: 5374
							SpritePixels var30 = null; // L: 5375
							SpritePixels var31 = null; // L: 5376
							SpritePixels var32 = null; // L: 5377
							SpritePixels var33 = null; // L: 5378
							int var34 = 0; // L: 5379
							int var35 = 0; // L: 5380
							int var36 = 0; // L: 5381
							int var37 = 0; // L: 5382
							int var38 = 0; // L: 5383
							int var39 = 0; // L: 5384
							int var40 = 0; // L: 5385
							int var41 = 0; // L: 5386
							int var42 = 0; // L: 5387
							var18 = var96.method3878(); // L: 5388
							int var43;
							if (var18 != null) { // L: 5389
								var22 = var18.subWidth; // L: 5390
								var43 = var18.subHeight; // L: 5391
								if (var43 > var42) { // L: 5392
									var42 = var43;
								}

								var26 = var18.xOffset; // L: 5393
							}

							var19 = var96.method3882(); // L: 5395
							if (var19 != null) { // L: 5396
								var23 = var19.subWidth; // L: 5397
								var43 = var19.subHeight; // L: 5398
								if (var43 > var42) { // L: 5399
									var42 = var43;
								}

								var27 = var19.xOffset; // L: 5400
							}

							var20 = var96.method3883(); // L: 5402
							if (var20 != null) { // L: 5403
								var24 = var20.subWidth; // L: 5404
								var43 = var20.subHeight; // L: 5405
								if (var43 > var42) { // L: 5406
									var42 = var43;
								}

								var28 = var20.xOffset; // L: 5407
							}

							var21 = var96.method3884(); // L: 5409
							if (var21 != null) { // L: 5410
								var25 = var21.subWidth; // L: 5411
								var43 = var21.subHeight; // L: 5412
								if (var43 > var42) { // L: 5413
									var42 = var43;
								}

								var29 = var21.xOffset; // L: 5414
							}

							if (var94 != null) { // L: 5416
								var30 = var94.method3878(); // L: 5417
								if (var30 != null) { // L: 5418
									var34 = var30.subWidth; // L: 5419
									var43 = var30.subHeight; // L: 5420
									if (var43 > var42) { // L: 5421
										var42 = var43;
									}

									var38 = var30.xOffset; // L: 5422
								}

								var31 = var94.method3882(); // L: 5424
								if (var31 != null) { // L: 5425
									var35 = var31.subWidth; // L: 5426
									var43 = var31.subHeight; // L: 5427
									if (var43 > var42) { // L: 5428
										var42 = var43;
									}

									var39 = var31.xOffset; // L: 5429
								}

								var32 = var94.method3883(); // L: 5431
								if (var32 != null) { // L: 5432
									var36 = var32.subWidth; // L: 5433
									var43 = var32.subHeight; // L: 5434
									if (var43 > var42) { // L: 5435
										var42 = var43;
									}

									var40 = var32.xOffset; // L: 5436
								}

								var33 = var94.method3884(); // L: 5438
								if (var33 != null) { // L: 5439
									var37 = var33.subWidth; // L: 5440
									var43 = var33.subHeight; // L: 5441
									if (var43 > var42) { // L: 5442
										var42 = var43;
									}

									var41 = var33.xOffset; // L: 5443
								}
							}

							Font var82 = var96.getFont(); // L: 5448
							if (var82 == null) { // L: 5449
								var82 = ItemComposition.field2225;
							}

							Font var44;
							if (var94 != null) { // L: 5450
								var44 = var94.getFont(); // L: 5451
								if (var44 == null) { // L: 5452
									var44 = ItemComposition.field2225;
								}
							} else {
								var44 = ItemComposition.field2225; // L: 5454
							}

							String var45 = null; // L: 5455
							String var46 = null; // L: 5456
							boolean var47 = false; // L: 5457
							int var48 = 0; // L: 5458
							var45 = var96.getString(var0.hitSplatValues[var76]); // L: 5459
							int var95 = var82.stringWidth(var45); // L: 5460
							if (var94 != null) { // L: 5461
								var46 = var94.getString(var0.hitSplatValues2[var76]); // L: 5462
								var48 = var44.stringWidth(var46); // L: 5463
							}

							int var49 = 0; // L: 5465
							int var50 = 0; // L: 5466
							if (var23 > 0) { // L: 5467
								if (var20 == null && var21 == null) { // L: 5468
									var49 = 1; // L: 5469
								} else {
									var49 = var95 / var23 + 1;
								}
							}

							if (var94 != null && var35 > 0) { // L: 5471 5472
								if (var32 == null && var33 == null) { // L: 5473
									var50 = 1; // L: 5474
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0; // L: 5477
							int var52 = var51; // L: 5478
							if (var22 > 0) {
								var51 += var22; // L: 5479
							}

							var51 += 2; // L: 5480
							int var53 = var51; // L: 5481
							if (var24 > 0) { // L: 5482
								var51 += var24;
							}

							int var54 = var51; // L: 5483
							int var55 = var51; // L: 5484
							int var56;
							if (var23 > 0) { // L: 5485
								var56 = var49 * var23; // L: 5486
								var51 += var56; // L: 5487
								var55 += (var56 - var95) / 2; // L: 5488
							} else {
								var51 += var95; // L: 5491
							}

							var56 = var51; // L: 5493
							if (var25 > 0) { // L: 5494
								var51 += var25;
							}

							int var57 = 0; // L: 5495
							int var58 = 0; // L: 5496
							int var59 = 0; // L: 5497
							int var60 = 0; // L: 5498
							int var61 = 0; // L: 5499
							int var62;
							if (var94 != null) { // L: 5500
								var51 += 2; // L: 5501
								var57 = var51; // L: 5502
								if (var34 > 0) { // L: 5503
									var51 += var34;
								}

								var51 += 2; // L: 5504
								var58 = var51; // L: 5505
								if (var36 > 0) { // L: 5506
									var51 += var36;
								}

								var59 = var51; // L: 5507
								var61 = var51; // L: 5508
								if (var35 > 0) { // L: 5509
									var62 = var35 * var50; // L: 5510
									var51 += var62; // L: 5511
									var61 += (var62 - var48) / 2; // L: 5512
								} else {
									var51 += var48; // L: 5515
								}

								var60 = var51; // L: 5517
								if (var37 > 0) { // L: 5518
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var76] - Client.cycle; // L: 5520
							int var63 = var96.field2129 - var62 * var96.field2129 / var96.field2123; // L: 5521
							int var64 = var62 * var96.field2125 / var96.field2123 + -var96.field2125; // L: 5522
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1)); // L: 5523
							int var66 = var3 + Client.viewportTempY - 12 + var64; // L: 5524
							int var67 = var66; // L: 5525
							int var68 = var66 + var42; // L: 5526
							int var69 = var66 + var96.field2109 + 15; // L: 5527
							int var70 = var69 - var82.maxAscent; // L: 5528
							int var71 = var69 + var82.maxDescent; // L: 5529
							if (var70 < var66) { // L: 5530
								var67 = var70;
							}

							if (var71 > var68) { // L: 5531
								var68 = var71;
							}

							int var72 = 0; // L: 5532
							int var73;
							int var74;
							if (var94 != null) { // L: 5533
								var72 = var66 + var94.field2109 + 15; // L: 5534
								var73 = var72 - var44.maxAscent; // L: 5535
								var74 = var72 + var44.maxDescent; // L: 5536
								if (var73 < var67) { // L: 5537
									;
								}

								if (var74 > var68) { // L: 5538
									;
								}
							}

							var73 = 255; // L: 5540
							if (var96.field2126 >= 0) { // L: 5541
								var73 = (var62 << 8) / (var96.field2123 - var96.field2126);
							}

							if (var73 >= 0 && var73 < 255) { // L: 5542
								if (var18 != null) { // L: 5543
									var18.drawTransAt(var52 + var65 - var26, var66, var73);
								}

								if (var20 != null) { // L: 5544
									var20.drawTransAt(var53 + var65 - var28, var66, var73);
								}

								if (var19 != null) { // L: 5545
									for (var74 = 0; var74 < var49; ++var74) { // L: 5546
										var19.drawTransAt(var74 * var23 + (var54 + var65 - var27), var66, var73); // L: 5547
									}
								}

								if (var21 != null) { // L: 5550
									var21.drawTransAt(var65 + var56 - var29, var66, var73);
								}

								var82.drawAlpha(var45, var65 + var55, var69, var96.textColor, 0, var73); // L: 5551
								if (var94 != null) { // L: 5552
									if (var30 != null) { // L: 5553
										var30.drawTransAt(var65 + var57 - var38, var66, var73);
									}

									if (var32 != null) { // L: 5554
										var32.drawTransAt(var65 + var58 - var40, var66, var73);
									}

									if (var31 != null) { // L: 5555
										for (var74 = 0; var74 < var50; ++var74) { // L: 5556
											var31.drawTransAt(var74 * var35 + (var65 + var59 - var39), var66, var73); // L: 5557
										}
									}

									if (var33 != null) { // L: 5560
										var33.drawTransAt(var65 + var60 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var61 + var65, var72, var94.textColor, 0, var73); // L: 5561
								}
							} else {
								if (var18 != null) { // L: 5565
									var18.drawTransBgAt(var52 + var65 - var26, var66);
								}

								if (var20 != null) { // L: 5566
									var20.drawTransBgAt(var53 + var65 - var28, var66);
								}

								if (var19 != null) { // L: 5567
									for (var74 = 0; var74 < var49; ++var74) { // L: 5568
										var19.drawTransBgAt(var23 * var74 + (var54 + var65 - var27), var66); // L: 5569
									}
								}

								if (var21 != null) { // L: 5572
									var21.drawTransBgAt(var65 + var56 - var29, var66);
								}

								var82.draw(var45, var55 + var65, var69, var96.textColor | -16777216, 0); // L: 5573
								if (var94 != null) { // L: 5574
									if (var30 != null) { // L: 5575
										var30.drawTransBgAt(var65 + var57 - var38, var66);
									}

									if (var32 != null) { // L: 5576
										var32.drawTransBgAt(var65 + var58 - var40, var66);
									}

									if (var31 != null) { // L: 5577
										for (var74 = 0; var74 < var50; ++var74) { // L: 5578
											var31.drawTransBgAt(var35 * var74 + (var59 + var65 - var39), var66); // L: 5579
										}
									}

									if (var33 != null) { // L: 5582
										var33.drawTransBgAt(var60 + var65 - var41, var66);
									}

									var44.draw(var46, var65 + var61, var72, var94.textColor | -16777216, 0); // L: 5583
								}
							}
						}
					}
				}
			}

		}
	} // L: 5588

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(ZLtc;B)V",
		garbageValue = "46"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0; // L: 5819
		int var2;
		int var3;
		int var5;
		int var6;
		int var7;
		if (!Client.isInInstance) { // L: 5820
			var2 = var1.readUnsignedShort(); // L: 5821
			var3 = var1.readUnsignedShort(); // L: 5822
			int var4 = var1.readUnsignedShort(); // L: 5823
			class18.xteaKeys = new int[var4][4]; // L: 5824

			for (var5 = 0; var5 < var4; ++var5) { // L: 5825
				for (var6 = 0; var6 < 4; ++var6) { // L: 5826
					class18.xteaKeys[var5][var6] = var1.readInt(); // L: 5827
				}
			}

			MusicPatch.regions = new int[var4]; // L: 5830
			UserComparator4.regionMapArchiveIds = new int[var4]; // L: 5831
			class170.regionLandArchiveIds = new int[var4]; // L: 5832
			class155.regionLandArchives = new byte[var4][]; // L: 5833
			class389.regionMapArchives = new byte[var4][]; // L: 5834
			var4 = 0; // L: 5835

			for (var5 = (var3 - 6) / 8; var5 <= (var3 + 6) / 8; ++var5) { // L: 5836
				for (var6 = (var2 - 6) / 8; var6 <= (var2 + 6) / 8; ++var6) { // L: 5837
					var7 = var6 + (var5 << 8); // L: 5838
					MusicPatch.regions[var4] = var7; // L: 5839
					UserComparator4.regionMapArchiveIds[var4] = Canvas.archive6.getGroupId("m" + var5 + "_" + var6); // L: 5840
					class170.regionLandArchiveIds[var4] = Canvas.archive6.getGroupId("l" + var5 + "_" + var6); // L: 5841
					++var4; // L: 5842
				}
			}

			class385.method7202(var3, var2, true); // L: 5845
		} else {
			var2 = var1.method9116(); // L: 5848
			var3 = var1.method9087(); // L: 5849
			boolean var15 = var1.method9089() == 1; // L: 5850
			var5 = var1.readUnsignedShort(); // L: 5851
			var1.importIndex(); // L: 5852

			int var8;
			int var9;
			for (var6 = 0; var6 < 4; ++var6) { // L: 5853
				for (var7 = 0; var7 < 13; ++var7) { // L: 5854
					for (var8 = 0; var8 < 13; ++var8) { // L: 5855
						var9 = var1.readBits(1); // L: 5856
						if (var9 == 1) {
							Client.field590[var6][var7][var8] = var1.readBits(26); // L: 5857
						} else {
							Client.field590[var6][var7][var8] = -1; // L: 5858
						}
					}
				}
			}

			var1.exportIndex(); // L: 5862
			class18.xteaKeys = new int[var5][4]; // L: 5863

			for (var6 = 0; var6 < var5; ++var6) { // L: 5864
				for (var7 = 0; var7 < 4; ++var7) { // L: 5865
					class18.xteaKeys[var6][var7] = var1.readInt(); // L: 5866
				}
			}

			MusicPatch.regions = new int[var5]; // L: 5869
			UserComparator4.regionMapArchiveIds = new int[var5]; // L: 5870
			class170.regionLandArchiveIds = new int[var5]; // L: 5871
			class155.regionLandArchives = new byte[var5][]; // L: 5872
			class389.regionMapArchives = new byte[var5][]; // L: 5873
			var5 = 0; // L: 5874

			for (var6 = 0; var6 < 4; ++var6) { // L: 5875
				for (var7 = 0; var7 < 13; ++var7) { // L: 5876
					for (var8 = 0; var8 < 13; ++var8) { // L: 5877
						var9 = Client.field590[var6][var7][var8]; // L: 5878
						if (var9 != -1) { // L: 5879
							int var10 = var9 >> 14 & 1023; // L: 5880
							int var11 = var9 >> 3 & 2047; // L: 5881
							int var12 = (var10 / 8 << 8) + var11 / 8; // L: 5882

							int var13;
							for (var13 = 0; var13 < var5; ++var13) { // L: 5883
								if (MusicPatch.regions[var13] == var12) {
									var12 = -1; // L: 5884
									break; // L: 5885
								}
							}

							if (var12 != -1) { // L: 5887
								MusicPatch.regions[var5] = var12; // L: 5888
								var13 = var12 >> 8 & 255; // L: 5889
								int var14 = var12 & 255; // L: 5890
								UserComparator4.regionMapArchiveIds[var5] = Canvas.archive6.getGroupId("m" + var13 + "_" + var14); // L: 5891
								class170.regionLandArchiveIds[var5] = Canvas.archive6.getGroupId("l" + var13 + "_" + var14); // L: 5892
								++var5; // L: 5893
							}
						}
					}
				}
			}

			class385.method7202(var2, var3, !var15); // L: 5899
		}

	} // L: 5901
}
