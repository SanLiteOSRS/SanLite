import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
public class class34 {
	@ObfuscatedName("te")
	@ObfuscatedGetter(
		intValue = -1813982848
	)
	static int field208;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -307686371
	)
	public static int field205;
	@ObfuscatedName("ga")
	@Export("secureRandom")
	static SecureRandom secureRandom;
	@ObfuscatedName("qv")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	@Export("Ignored_cached")
	static class451 Ignored_cached;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1855727059
	)
	int field200;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1617185935
	)
	int field202;

	class34(int var1, int var2) {
		this.field200 = var1; // L: 14
		this.field202 = var2; // L: 15
	} // L: 16

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lav;I)Z",
		garbageValue = "-30387471"
	)
	boolean method487(class30 var1) {
		if (var1 == null) { // L: 19
			return false;
		} else {
			switch(this.field200) { // L: 20
			case 1:
				return var1.vmethod4138(this.field202); // L: 22
			case 2:
				return var1.vmethod4099(this.field202); // L: 30
			case 3:
				return var1.vmethod4097((char)this.field202); // L: 24
			case 4:
				return var1.vmethod4102(this.field202 == 1); // L: 26
			default:
				return false; // L: 28
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(II)Ldz;",
		garbageValue = "-1802972375"
	)
	static class127 method490(int var0) {
		class127 var1 = (class127)World.findEnumerated(class182.method3636(), var0); // L: 92
		if (var1 == null) {
			var1 = class127.field1589; // L: 93
		}

		return var1; // L: 94
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "27440"
	)
	public static void method489() {
		PlayerComposition.PlayerComposition_cachedModels.clear(); // L: 265
	} // L: 266

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-303589538"
	)
	static final void method485() {
		Scene.Scene_isLowDetail = false; // L: 923
		Client.isLowDetail = false; // L: 924
	} // L: 925

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1908709885"
	)
	static String method491(int var0) {
		if (var0 < 0) { // L: 9995
			return "";
		} else {
			return Client.menuTargets[var0].length() > 0 ? Client.menuActions[var0] + " " + Client.menuTargets[var0] : Client.menuActions[var0]; // L: 9996 9997
		}
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "([Lkd;IIIIIIIIB)V",
		garbageValue = "-10"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10319
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 10320

		for (int var9 = 0; var9 < var0.length; ++var9) { // L: 10321
			Widget var10 = var0[var9]; // L: 10322
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) { // L: 10323 10324
				int var11;
				if (var8 == -1) { // L: 10326
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6; // L: 10327
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y; // L: 10328
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width; // L: 10329
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height; // L: 10330
					var11 = ++Client.rootWidgetCount - 1; // L: 10331
				} else {
					var11 = var8; // L: 10333
				}

				var10.rootIndex = var11; // L: 10334
				var10.cycle = Client.cycle; // L: 10335
				if (!var10.isIf3 || !FriendSystem.isComponentHidden(var10)) { // L: 10336
					if (var10.contentType > 0) { // L: 10337
						class413.method7860(var10);
					}

					int var12 = var10.x + var6; // L: 10338
					int var13 = var7 + var10.y; // L: 10339
					int var14 = var10.transparencyTop; // L: 10340
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) { // L: 10341
						if (var1 != -1412584499 && !var10.isScrollBar) { // L: 10342
							MouseHandler.field268 = var0; // L: 10343
							class142.field1691 = var6; // L: 10344
							HealthBarDefinition.field1989 = var7; // L: 10345
							continue; // L: 10346
						}

						if (Client.isDraggingWidget && Client.field745) { // L: 10348
							var15 = MouseHandler.MouseHandler_x; // L: 10349
							var16 = MouseHandler.MouseHandler_y; // L: 10350
							var15 -= Client.widgetClickX; // L: 10351
							var16 -= Client.widgetClickY; // L: 10352
							if (var15 < Client.field699) { // L: 10353
								var15 = Client.field699;
							}

							if (var15 + var10.width > Client.field699 + Client.clickedWidgetParent.width) { // L: 10354
								var15 = Client.field699 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field613) { // L: 10355
								var16 = Client.field613;
							}

							if (var16 + var10.height > Client.field613 + Client.clickedWidgetParent.height) { // L: 10356
								var16 = Client.field613 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15; // L: 10357
							var13 = var16; // L: 10358
						}

						if (!var10.isScrollBar) { // L: 10360
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 2) { // L: 10366
						var15 = var2; // L: 10367
						var16 = var3; // L: 10368
						var17 = var4; // L: 10369
						var18 = var5; // L: 10370
					} else if (var10.type == 9) { // L: 10372
						var19 = var12; // L: 10373
						var20 = var13; // L: 10374
						var21 = var12 + var10.width; // L: 10375
						var22 = var13 + var10.height; // L: 10376
						if (var21 < var12) { // L: 10377
							var19 = var21; // L: 10379
							var21 = var12; // L: 10380
						}

						if (var22 < var13) { // L: 10382
							var20 = var22; // L: 10384
							var22 = var13; // L: 10385
						}

						++var21; // L: 10387
						++var22; // L: 10388
						var15 = var19 > var2 ? var19 : var2; // L: 10389
						var16 = var20 > var3 ? var20 : var3; // L: 10390
						var17 = var21 < var4 ? var21 : var4; // L: 10391
						var18 = var22 < var5 ? var22 : var5; // L: 10392
					} else {
						var19 = var12 + var10.width; // L: 10395
						var20 = var13 + var10.height; // L: 10396
						var15 = var12 > var2 ? var12 : var2; // L: 10397
						var16 = var13 > var3 ? var13 : var3; // L: 10398
						var17 = var19 < var4 ? var19 : var4; // L: 10399
						var18 = var20 < var5 ? var20 : var5; // L: 10400
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) { // L: 10402
						if (var10.contentType != 0) { // L: 10403
							if (var10.contentType == 1336) { // L: 10404
								if (StructComposition.clientPreferences.method2419()) { // L: 10405
									var13 += 15; // L: 10406
									AbstractWorldMapData.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1); // L: 10407
									var13 += 15; // L: 10408
									Runtime var46 = Runtime.getRuntime(); // L: 10409
									var20 = (int)((var46.totalMemory() - var46.freeMemory()) / 1024L); // L: 10410
									var21 = 16776960; // L: 10411
									if (var20 > 327680 && !Client.isLowDetail) { // L: 10412
										var21 = 16711680;
									}

									AbstractWorldMapData.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1); // L: 10413
									var13 += 15; // L: 10414
								}
								continue;
							}

							if (var10.contentType == 1337) { // L: 10418
								Client.viewportX = var12; // L: 10419
								Client.viewportY = var13; // L: 10420
								Projectile.drawEntities(var12, var13, var10.width, var10.height); // L: 10421
								Client.field731[var10.rootIndex] = true; // L: 10422
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10423
								continue; // L: 10424
							}

							if (var10.contentType == 1338) { // L: 10426
								Player.drawMinimap(var10, var12, var13, var11); // L: 10427
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10428
								continue; // L: 10429
							}

							if (var10.contentType == 1339) { // L: 10431
								SoundCache.drawCompass(var10, var12, var13, var11); // L: 10432
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10433
								continue; // L: 10434
							}

							if (var10.contentType == 1400) { // L: 10436
								KitDefinition.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle); // L: 10437
							}

							if (var10.contentType == 1401) { // L: 10439
								KitDefinition.worldMap.drawOverview(var12, var13, var10.width, var10.height); // L: 10440
							}

							if (var10.contentType == 1402) { // L: 10442
								class154.loginScreenRunesAnimation.draw(var12, Client.cycle); // L: 10443
							}
						}

						if (var10.type == 0) { // L: 10446
							if (!var10.isIf3 && FriendSystem.isComponentHidden(var10) && var10 != WorldMapScaleHandler.mousedOverWidgetIf1) { // L: 10447
								continue;
							}

							if (!var10.isIf3) { // L: 10448
								if (var10.scrollY > var10.scrollHeight - var10.height) { // L: 10449
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) { // L: 10450
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11); // L: 10452
							if (var10.children != null) { // L: 10453
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)var10.id); // L: 10454
							if (var30 != null) { // L: 10455
								HealthBar.drawWidgets(var30.group, var15, var16, var17, var18, var12, var13, var11); // L: 10456
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10458
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 10459
						} else if (var10.type == 11) { // L: 10461
							if (FriendSystem.isComponentHidden(var10) && var10 != WorldMapScaleHandler.mousedOverWidgetIf1) { // L: 10462
								continue;
							}

							if (var10.children != null) { // L: 10463
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10464
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 10465
						}

						if (Client.isResizable || Client.field733[var11] || Client.gameDrawingMode > 1) { // L: 10467
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) { // L: 10468 10469
								Interpreter.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) { // L: 10471
								int var23;
								int var24;
								int var25;
								int var26;
								if (var10.type == 2) { // L: 10474
									var19 = 0; // L: 10475

									for (var20 = 0; var20 < var10.rawHeight; ++var20) { // L: 10476
										for (var21 = 0; var21 < var10.rawWidth; ++var21) { // L: 10477
											var22 = var12 + var21 * (var10.paddingX + 32); // L: 10478
											var23 = var13 + var20 * (var10.paddingY + 32); // L: 10479
											if (var19 < 20) { // L: 10480
												var22 += var10.inventoryXOffsets[var19]; // L: 10481
												var23 += var10.inventoryYOffsets[var19]; // L: 10482
											}

											if (var10.itemIds[var19] <= 0) { // L: 10484
												if (var10.inventorySprites != null && var19 < 20) { // L: 10529
													SpritePixels var52 = var10.getInventorySprite(var19); // L: 10530
													if (var52 != null) { // L: 10531
														var52.drawTransBgAt(var22, var23);
													} else if (Widget.field3539) { // L: 10532
														class69.invalidateWidget(var10);
													}
												}
											} else {
												boolean var40 = false; // L: 10485
												boolean var41 = false; // L: 10486
												var26 = var10.itemIds[var19] - 1; // L: 10487
												if (var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == class368.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 10488
													SpritePixels var38;
													if (Client.isItemSelected == 1 && var19 == class101.selectedItemSlot && var10.id == ModeWhere.selectedItemWidget) { // L: 10490
														var38 = class200.getItemSprite(var26, var10.itemQuantities[var19], 2, 0, 2, false);
													} else {
														var38 = class200.getItemSprite(var26, var10.itemQuantities[var19], 1, 3153952, 2, false); // L: 10491
													}

													if (var38 != null) { // L: 10492
														if (var10 == class368.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 10493
															var24 = MouseHandler.MouseHandler_x - Client.draggedWidgetX; // L: 10494
															var25 = MouseHandler.MouseHandler_y - Client.draggedWidgetY; // L: 10495
															if (var24 < 5 && var24 > -5) { // L: 10496
																var24 = 0;
															}

															if (var25 < 5 && var25 > -5) { // L: 10497
																var25 = 0;
															}

															if (Client.itemDragDuration < 5) { // L: 10498
																var24 = 0; // L: 10499
																var25 = 0; // L: 10500
															}

															var38.drawTransAt(var22 + var24, var25 + var23, 128); // L: 10502
															if (var1 != -1) { // L: 10503
																Widget var28 = var0[var1 & 65535]; // L: 10504
																int var29;
																if (var23 + var25 < Rasterizer2D.Rasterizer2D_yClipStart && var28.scrollY > 0) { // L: 10505
																	var29 = (Rasterizer2D.Rasterizer2D_yClipStart - var23 - var25) * Client.field563 / 3; // L: 10506
																	if (var29 > Client.field563 * 10) { // L: 10507
																		var29 = Client.field563 * 10;
																	}

																	if (var29 > var28.scrollY) { // L: 10508
																		var29 = var28.scrollY;
																	}

																	var28.scrollY -= var29; // L: 10509
																	Client.draggedWidgetY += var29; // L: 10510
																	class69.invalidateWidget(var28); // L: 10511
																}

																if (var23 + var25 + 32 > Rasterizer2D.Rasterizer2D_yClipEnd && var28.scrollY < var28.scrollHeight - var28.height) { // L: 10513
																	var29 = (var23 + var25 + 32 - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.field563 / 3; // L: 10514
																	if (var29 > Client.field563 * 10) { // L: 10515
																		var29 = Client.field563 * 10;
																	}

																	if (var29 > var28.scrollHeight - var28.height - var28.scrollY) { // L: 10516
																		var29 = var28.scrollHeight - var28.height - var28.scrollY;
																	}

																	var28.scrollY += var29; // L: 10517
																	Client.draggedWidgetY -= var29; // L: 10518
																	class69.invalidateWidget(var28); // L: 10519
																}
															}
														} else if (var10 == MusicPatchPcmStream.field3411 && var19 == Client.field625) { // L: 10523
															var38.drawTransAt(var22, var23, 128);
														} else {
															var38.drawTransBgAt(var22, var23); // L: 10524
														}
													} else {
														class69.invalidateWidget(var10); // L: 10526
													}
												}
											}

											++var19; // L: 10534
										}
									}
								} else if (var10.type == 3) { // L: 10539
									if (class26.runCs1(var10)) { // L: 10541
										var19 = var10.color2; // L: 10542
										if (var10 == WorldMapScaleHandler.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 10543
											var19 = var10.mouseOverColor2;
										}
									} else {
										var19 = var10.color; // L: 10546
										if (var10 == WorldMapScaleHandler.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 10547
											var19 = var10.mouseOverColor;
										}
									}

									if (var10.fill) { // L: 10549
										switch(var10.fillMode.field4995) { // L: 10550
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2); // L: 10559
											break; // L: 10560
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255)); // L: 10556
											break; // L: 10557
										default:
											if (var14 == 0) { // L: 10552
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10553
											}
										}
									} else if (var14 == 0) { // L: 10564
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10565
									}
								} else {
									Font var42;
									if (var10.type == 4) { // L: 10569
										var42 = var10.getFont(); // L: 10570
										if (var42 == null) { // L: 10571
											if (Widget.field3539) { // L: 10572
												class69.invalidateWidget(var10);
											}
										} else {
											String var48 = var10.text; // L: 10576
											if (class26.runCs1(var10)) { // L: 10577
												var20 = var10.color2; // L: 10578
												if (var10 == WorldMapScaleHandler.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 10579
													var20 = var10.mouseOverColor2;
												}

												if (var10.text2.length() > 0) { // L: 10580
													var48 = var10.text2;
												}
											} else {
												var20 = var10.color; // L: 10583
												if (var10 == WorldMapScaleHandler.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 10584
													var20 = var10.mouseOverColor;
												}
											}

											if (var10.isIf3 && var10.itemId != -1) { // L: 10586
												ItemComposition var49 = NPCComposition.ItemComposition_get(var10.itemId); // L: 10587
												var48 = var49.name; // L: 10588
												if (var48 == null) { // L: 10589
													var48 = "null";
												}

												if ((var49.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) { // L: 10590
													var48 = MouseRecorder.colorStartTag(16748608) + var48 + "</col>" + " " + 'x' + FontName.formatItemStacks(var10.itemQuantity);
												}
											}

											if (var10 == Client.meslayerContinueWidget) { // L: 10592
												var48 = "Please wait..."; // L: 10593
												var20 = var10.color; // L: 10594
											}

											if (!var10.isIf3) { // L: 10596
												var48 = HealthBarDefinition.method3622(var48, var10);
											}

											var42.drawLines(var48, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight); // L: 10597
										}
									} else if (var10.type == 5) { // L: 10600
										SpritePixels var44;
										if (!var10.isIf3) { // L: 10601
											var44 = var10.getSprite(class26.runCs1(var10), TaskHandler.urlRequester); // L: 10602
											if (var44 != null) { // L: 10603
												var44.drawTransBgAt(var12, var13);
											} else if (Widget.field3539) { // L: 10604
												class69.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) { // L: 10608
												var44 = class200.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var44 = var10.getSprite(false, TaskHandler.urlRequester); // L: 10609
											}

											if (var44 == null) { // L: 10610
												if (Widget.field3539) { // L: 10634
													class69.invalidateWidget(var10);
												}
											} else {
												var20 = var44.width; // L: 10611
												var21 = var44.height; // L: 10612
												if (!var10.spriteTiling) { // L: 10613
													var22 = var10.width * 4096 / var20; // L: 10627
													if (var10.spriteAngle != 0) { // L: 10628
														var44.method9030(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) { // L: 10629
														var44.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) { // L: 10630
														var44.drawTransBgAt(var12, var13); // L: 10631
													} else {
														var44.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height); // L: 10614
													var22 = (var20 - 1 + var10.width) / var20; // L: 10615
													var23 = (var21 - 1 + var10.height) / var21; // L: 10616

													for (var24 = 0; var24 < var22; ++var24) { // L: 10617
														for (var25 = 0; var25 < var23; ++var25) { // L: 10618
															if (var10.spriteAngle != 0) { // L: 10619
																var44.method9030(var20 / 2 + var12 + var24 * var20, var21 / 2 + var13 + var25 * var21, var10.spriteAngle, 4096);
															} else if (var14 != 0) { // L: 10620
																var44.drawTransAt(var12 + var20 * var24, var13 + var21 * var25, 256 - (var14 & 255));
															} else {
																var44.drawTransBgAt(var12 + var20 * var24, var13 + var25 * var21); // L: 10621
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10624
												}
											}
										}
									} else {
										ItemComposition var33;
										if (var10.type == 6) { // L: 10638
											boolean var39 = class26.runCs1(var10); // L: 10639
											if (var39) { // L: 10641
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId; // L: 10642
											}

											Model var45 = null; // L: 10643
											var22 = 0; // L: 10644
											if (var10.itemId != -1) { // L: 10645
												var33 = NPCComposition.ItemComposition_get(var10.itemId); // L: 10646
												if (var33 != null) { // L: 10647
													var33 = var33.getCountObj(var10.itemQuantity); // L: 10648
													var45 = var33.getModel(1); // L: 10649
													if (var45 != null) { // L: 10650
														var45.calculateBoundsCylinder(); // L: 10651
														var22 = var45.height / 2; // L: 10652
													} else {
														class69.invalidateWidget(var10); // L: 10654
													}
												}
											} else if (var10.modelType == 5) { // L: 10657
												if (var10.modelId == 0) { // L: 10658
													var45 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var45 = class155.localPlayer.getModel(); // L: 10659
												}
											} else {
												NPCComposition var50 = null; // L: 10662
												class185 var51 = null; // L: 10663
												if (var10.modelType == 6) { // L: 10664
													var25 = var10.modelId; // L: 10665
													if (var25 >= 0 && var25 < Client.npcs.length) { // L: 10666
														NPC var36 = Client.npcs[var25]; // L: 10667
														if (var36 != null) { // L: 10668
															var50 = var36.definition; // L: 10669
															var51 = var36.method2543(); // L: 10670
														}
													}
												}

												SequenceDefinition var37 = null; // L: 10674
												var26 = -1; // L: 10675
												if (var20 != -1) { // L: 10676
													var37 = class216.SequenceDefinition_get(var20); // L: 10677
													var26 = var10.modelFrame; // L: 10678
												}

												var45 = var10.method6228(var37, var26, var39, class155.localPlayer.appearance, var50, var51); // L: 10680
												if (var45 == null && Widget.field3539) { // L: 10681
													class69.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method4395(var10.width / 2 + var12, var10.height / 2 + var13); // L: 10683
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10684
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10685
											if (var45 != null) { // L: 10686
												if (!var10.isIf3) { // L: 10687
													var45.method4682(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var45.calculateBoundsCylinder(); // L: 10689
													if (var10.modelOrthog) { // L: 10690
														var45.method4711(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var45.method4682(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY); // L: 10691
													}
												}
											}

											Rasterizer3D.Rasterizer3D_method3(); // L: 10694
										} else {
											if (var10.type == 7) { // L: 10697
												var42 = var10.getFont(); // L: 10698
												if (var42 == null) { // L: 10699
													if (Widget.field3539) { // L: 10700
														class69.invalidateWidget(var10);
													}
													continue;
												}

												var20 = 0; // L: 10703

												for (var21 = 0; var21 < var10.rawHeight; ++var21) { // L: 10704
													for (var22 = 0; var22 < var10.rawWidth; ++var22) { // L: 10705
														if (var10.itemIds[var20] > 0) { // L: 10706
															var33 = NPCComposition.ItemComposition_get(var10.itemIds[var20] - 1); // L: 10707
															String var35;
															if (var33.isStackable != 1 && var10.itemQuantities[var20] == 1) { // L: 10709
																var35 = MouseRecorder.colorStartTag(16748608) + var33.name + "</col>"; // L: 10710
															} else {
																var35 = MouseRecorder.colorStartTag(16748608) + var33.name + "</col>" + " " + 'x' + FontName.formatItemStacks(var10.itemQuantities[var20]);
															}

															var25 = var22 * (var10.paddingX + 115) + var12; // L: 10711
															var26 = (var10.paddingY + 12) * var21 + var13; // L: 10712
															if (var10.textXAlignment == 0) { // L: 10713
																var42.draw(var35, var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else if (var10.textXAlignment == 1) { // L: 10714
																var42.drawCentered(var35, var10.width / 2 + var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else {
																var42.drawRightAligned(var35, var25 + var10.width - 1, var26, var10.color, var10.textShadowed ? 0 : -1); // L: 10715
															}
														}

														++var20; // L: 10717
													}
												}
											}

											Font var31;
											if (var10.type == 8 && var10 == class380.field4470 && Client.field521 == Client.field553) { // L: 10721 10722
												var19 = 0; // L: 10723
												var20 = 0; // L: 10724
												var31 = AbstractWorldMapData.fontPlain12; // L: 10725
												String var32 = var10.text; // L: 10726

												String var47;
												for (var32 = HealthBarDefinition.method3622(var32, var10); var32.length() > 0; var20 = var20 + var31.ascent + 1) { // L: 10728 10729 10741
													var24 = var32.indexOf("<br>"); // L: 10730
													if (var24 != -1) { // L: 10731
														var47 = var32.substring(0, var24); // L: 10732
														var32 = var32.substring(var24 + 4); // L: 10733
													} else {
														var47 = var32; // L: 10736
														var32 = ""; // L: 10737
													}

													var25 = var31.stringWidth(var47); // L: 10739
													if (var25 > var19) { // L: 10740
														var19 = var25;
													}
												}

												var19 += 6; // L: 10743
												var20 += 7; // L: 10744
												var24 = var12 + var10.width - 5 - var19; // L: 10745
												var25 = var13 + var10.height + 5; // L: 10746
												if (var24 < var12 + 5) { // L: 10747
													var24 = var12 + 5;
												}

												if (var24 + var19 > var4) { // L: 10748
													var24 = var4 - var19;
												}

												if (var20 + var25 > var5) { // L: 10749
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120); // L: 10750
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0); // L: 10751
												var32 = var10.text; // L: 10752
												var26 = var25 + var31.ascent + 2; // L: 10753

												for (var32 = HealthBarDefinition.method3622(var32, var10); var32.length() > 0; var26 = var26 + var31.ascent + 1) { // L: 10754 10755 10766
													int var27 = var32.indexOf("<br>"); // L: 10756
													if (var27 != -1) { // L: 10757
														var47 = var32.substring(0, var27); // L: 10758
														var32 = var32.substring(var27 + 4); // L: 10759
													} else {
														var47 = var32; // L: 10762
														var32 = ""; // L: 10763
													}

													var31.draw(var47, var24 + 3, var26, 0, -1); // L: 10765
												}
											}

											if (var10.type == 9) { // L: 10770
												if (var10.field3575) { // L: 10775
													var19 = var12; // L: 10776
													var20 = var13 + var10.height; // L: 10777
													var21 = var12 + var10.width; // L: 10778
													var22 = var13; // L: 10779
												} else {
													var19 = var12; // L: 10782
													var20 = var13; // L: 10783
													var21 = var12 + var10.width; // L: 10784
													var22 = var13 + var10.height; // L: 10785
												}

												if (var10.lineWid == 1) { // L: 10787
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color); // L: 10788
												} else {
													Buddy.method7626(var19, var20, var21, var22, var10.color, var10.lineWid); // L: 10791
												}
											} else if (var10.type == 12) { // L: 10795
												class303 var43 = var10.method6167(); // L: 10796
												class298 var34 = var10.method6293(); // L: 10797
												if (var43 != null && var34 != null && var43.method6062()) { // L: 10798
													var31 = var10.getFont(); // L: 10799
													if (var31 != null) { // L: 10800
														Client.field505.method9152(var12, var13, var10.width, var10.height, var43.method5937(), var43.method5938(), 0, 0, var43.method5934(), var43.method5913(), var43.method5933()); // L: 10801
														var22 = var10.textShadowed ? var10.spriteShadow : -1; // L: 10802
														if (!var43.method5963() && var43.method6004().method7103()) { // L: 10803
															Client.field505.method9144(var34.field3455, var22, var34.field3454, var34.field3456); // L: 10804
															Client.field505.method9143(var43.method5893(), var31); // L: 10805
														} else {
															Client.field505.method9144(var10.color, var22, var34.field3454, var34.field3456); // L: 10808
															Client.field505.method9143(var43.method6004(), var31); // L: 10809
														}

														Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10811
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 10816
}
