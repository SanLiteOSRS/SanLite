import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@kv
@ObfuscatedName("jd")
public final class class278 {
	@ObfuscatedName("tg")
	@ObfuscatedGetter(
		intValue = -1139972992
	)
	static int field3264;
	@ObfuscatedName("c")
	static final HashMap field3260;
	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "[Lri;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;

	static {
		field3260 = new HashMap(); // L: 11
		TimeZone var0;
		synchronized(field3260) { // L: 16
			TimeZone var2 = (TimeZone)field3260.get("Europe/London"); // L: 17
			if (var2 == null) { // L: 18
				var2 = TimeZone.getTimeZone("Europe/London"); // L: 19
				field3260.put("Europe/London", var2); // L: 20
			}

			var0 = var2; // L: 22
		}

		java.util.Calendar.getInstance(var0); // L: 25
	} // L: 26

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "951493136"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4]; // L: 63
		int[] var3 = new int[4]; // L: 64
		var2[0] = var0; // L: 65
		var3[0] = var1; // L: 66
		int var4 = 1; // L: 67

		for (int var5 = 0; var5 < 4; ++var5) { // L: 68
			if (World.World_sortOption1[var5] != var0) { // L: 69
				var2[var4] = World.World_sortOption1[var5]; // L: 70
				var3[var4] = World.World_sortOption2[var5]; // L: 71
				++var4; // L: 72
			}
		}

		World.World_sortOption1 = var2; // L: 75
		World.World_sortOption2 = var3; // L: 76
		class10.sortWorlds(class412.World_worlds, 0, class412.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 77
	} // L: 78

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Ljc;",
		garbageValue = "-685608574"
	)
	public static PacketBufferNode method5404() {
		PacketBufferNode var0 = WorldMapLabelSize.method4683(); // L: 42
		var0.clientPacket = null; // L: 43
		var0.clientPacketLength = 0; // L: 44
		var0.packetBuffer = new PacketBuffer(5000); // L: 45
		return var0; // L: 46
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "([Lkn;IIIIIIIIB)V",
		garbageValue = "-38"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10305
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 10306

		for (int var9 = 0; var9 < var0.length; ++var9) { // L: 10307
			Widget var10 = var0[var9]; // L: 10308
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) { // L: 10309 10310
				int var11;
				if (var8 == -1) { // L: 10312
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6; // L: 10313
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y; // L: 10314
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width; // L: 10315
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height; // L: 10316
					var11 = ++Client.rootWidgetCount - 1; // L: 10317
				} else {
					var11 = var8; // L: 10319
				}

				var10.rootIndex = var11; // L: 10320
				var10.cycle = Client.cycle; // L: 10321
				if (!var10.isIf3 || !class6.isComponentHidden(var10)) { // L: 10322
					if (var10.contentType > 0) { // L: 10323
						method5406(var10);
					}

					int var12 = var10.x + var6; // L: 10324
					int var13 = var7 + var10.y; // L: 10325
					int var14 = var10.transparencyTop; // L: 10326
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) { // L: 10327
						if (var1 != -1412584499 && !var10.isScrollBar) { // L: 10328
							Script.field971 = var0; // L: 10329
							class380.field4439 = var6; // L: 10330
							SoundSystem.field332 = var7; // L: 10331
							continue; // L: 10332
						}

						if (Client.isDraggingWidget && Client.field684) { // L: 10334
							var15 = MouseHandler.MouseHandler_x; // L: 10335
							var16 = MouseHandler.MouseHandler_y; // L: 10336
							var15 -= Client.widgetClickX; // L: 10337
							var16 -= Client.widgetClickY; // L: 10338
							if (var15 < Client.field603) { // L: 10339
								var15 = Client.field603;
							}

							if (var15 + var10.width > Client.field603 + Client.clickedWidgetParent.width) { // L: 10340
								var15 = Client.field603 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field686) { // L: 10341
								var16 = Client.field686;
							}

							if (var16 + var10.height > Client.field686 + Client.clickedWidgetParent.height) { // L: 10342
								var16 = Client.field686 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15; // L: 10343
							var13 = var16; // L: 10344
						}

						if (!var10.isScrollBar) { // L: 10346
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 2) { // L: 10352
						var15 = var2; // L: 10353
						var16 = var3; // L: 10354
						var17 = var4; // L: 10355
						var18 = var5; // L: 10356
					} else if (var10.type == 9) { // L: 10358
						var19 = var12; // L: 10359
						var20 = var13; // L: 10360
						var21 = var12 + var10.width; // L: 10361
						var22 = var13 + var10.height; // L: 10362
						if (var21 < var12) { // L: 10363
							var19 = var21; // L: 10365
							var21 = var12; // L: 10366
						}

						if (var22 < var13) { // L: 10368
							var20 = var22; // L: 10370
							var22 = var13; // L: 10371
						}

						++var21; // L: 10373
						++var22; // L: 10374
						var15 = var19 > var2 ? var19 : var2; // L: 10375
						var16 = var20 > var3 ? var20 : var3; // L: 10376
						var17 = var21 < var4 ? var21 : var4; // L: 10377
						var18 = var22 < var5 ? var22 : var5; // L: 10378
					} else {
						var19 = var12 + var10.width; // L: 10381
						var20 = var13 + var10.height; // L: 10382
						var15 = var12 > var2 ? var12 : var2; // L: 10383
						var16 = var13 > var3 ? var13 : var3; // L: 10384
						var17 = var19 < var4 ? var19 : var4; // L: 10385
						var18 = var20 < var5 ? var20 : var5; // L: 10386
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) { // L: 10388
						if (var10.contentType != 0) { // L: 10389
							if (var10.contentType == 1336) { // L: 10390
								if (BufferedSink.clientPreferences.method2386()) { // L: 10391
									var13 += 15; // L: 10392
									Language.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1); // L: 10393
									var13 += 15; // L: 10394
									Runtime var44 = Runtime.getRuntime(); // L: 10395
									var20 = (int)((var44.totalMemory() - var44.freeMemory()) / 1024L); // L: 10396
									var21 = 16776960; // L: 10397
									if (var20 > 327680 && !Client.isLowDetail) { // L: 10398
										var21 = 16711680;
									}

									Language.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1); // L: 10399
									var13 += 15; // L: 10400
								}
								continue;
							}

							if (var10.contentType == 1337) { // L: 10404
								Client.viewportX = var12; // L: 10405
								Client.viewportY = var13; // L: 10406
								class21.drawEntities(var12, var13, var10.width, var10.height); // L: 10407
								Client.field717[var10.rootIndex] = true; // L: 10408
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10409
								continue; // L: 10410
							}

							if (var10.contentType == 1338) { // L: 10412
								MenuAction.drawMinimap(var10, var12, var13, var11); // L: 10413
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10414
								continue;
							}

							if (var10.contentType == 1339) { // L: 10417
								class108.drawCompass(var10, var12, var13, var11); // L: 10418
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10419
								continue; // L: 10420
							}

							if (var10.contentType == 1400) { // L: 10422
								class7.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle); // L: 10423
							}

							if (var10.contentType == 1401) { // L: 10425
								class7.worldMap.drawOverview(var12, var13, var10.width, var10.height); // L: 10426
							}

							if (var10.contentType == 1402) { // L: 10428
								GraphicsObject.loginScreenRunesAnimation.draw(var12, Client.cycle); // L: 10429
							}
						}

						if (var10.type == 0) { // L: 10432
							if (!var10.isIf3 && class6.isComponentHidden(var10) && var10 != Occluder.mousedOverWidgetIf1) { // L: 10433
								continue;
							}

							if (!var10.isIf3) { // L: 10434
								if (var10.scrollY > var10.scrollHeight - var10.height) { // L: 10435
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) { // L: 10436
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11); // L: 10438
							if (var10.children != null) { // L: 10439
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)var10.id); // L: 10440
							if (var30 != null) { // L: 10441
								KeyHandler.drawWidgets(var30.group, var15, var16, var17, var18, var12, var13, var11); // L: 10442
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10444
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 10445
						} else if (var10.type == 11) { // L: 10447
							if (class6.isComponentHidden(var10) && var10 != Occluder.mousedOverWidgetIf1) { // L: 10448
								continue;
							}

							if (var10.children != null) { // L: 10449
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10450
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 10451
						}

						if (Client.isResizable || Client.field657[var11] || Client.gameDrawingMode > 1) { // L: 10453
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) { // L: 10454 10455
								ClientPreferences.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) { // L: 10457
								int var23;
								int var24;
								int var25;
								int var26;
								if (var10.type == 2) { // L: 10460
									var19 = 0; // L: 10461

									for (var20 = 0; var20 < var10.rawHeight; ++var20) { // L: 10462
										for (var21 = 0; var21 < var10.rawWidth; ++var21) { // L: 10463
											var22 = var12 + var21 * (var10.paddingX + 32); // L: 10464
											var23 = var13 + var20 * (var10.paddingY + 32); // L: 10465
											if (var19 < 20) { // L: 10466
												var22 += var10.inventoryXOffsets[var19]; // L: 10467
												var23 += var10.inventoryYOffsets[var19]; // L: 10468
											}

											if (var10.itemIds[var19] <= 0) { // L: 10470
												if (var10.inventorySprites != null && var19 < 20) { // L: 10515
													SpritePixels var49 = var10.getInventorySprite(var19); // L: 10516
													if (var49 != null) { // L: 10517
														var49.drawTransBgAt(var22, var23);
													} else if (Widget.field3479) { // L: 10518
														class143.invalidateWidget(var10);
													}
												}
											} else {
												boolean var38 = false; // L: 10471
												boolean var39 = false; // L: 10472
												var26 = var10.itemIds[var19] - 1; // L: 10473
												if (var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == VerticalAlignment.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 10474
													SpritePixels var36;
													if (Client.isItemSelected == 1 && var19 == class1.selectedItemSlot && var10.id == class230.selectedItemWidget) { // L: 10476
														var36 = ChatChannel.getItemSprite(var26, var10.itemQuantities[var19], 2, 0, 2, false);
													} else {
														var36 = ChatChannel.getItemSprite(var26, var10.itemQuantities[var19], 1, 3153952, 2, false); // L: 10477
													}

													if (var36 != null) { // L: 10478
														if (var10 == VerticalAlignment.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 10479
															var24 = MouseHandler.MouseHandler_x - Client.draggedWidgetX; // L: 10480
															var25 = MouseHandler.MouseHandler_y - Client.draggedWidgetY; // L: 10481
															if (var24 < 5 && var24 > -5) { // L: 10482
																var24 = 0;
															}

															if (var25 < 5 && var25 > -5) { // L: 10483
																var25 = 0;
															}

															if (Client.itemDragDuration < 5) { // L: 10484
																var24 = 0; // L: 10485
																var25 = 0; // L: 10486
															}

															var36.drawTransAt(var22 + var24, var23 + var25, 128); // L: 10488
															if (var1 != -1) { // L: 10489
																Widget var28 = var0[var1 & 65535]; // L: 10490
																int var29;
																if (var25 + var23 < Rasterizer2D.Rasterizer2D_yClipStart && var28.scrollY > 0) { // L: 10491
																	var29 = (Rasterizer2D.Rasterizer2D_yClipStart - var23 - var25) * Client.field558 / 3; // L: 10492
																	if (var29 > Client.field558 * 10) { // L: 10493
																		var29 = Client.field558 * 10;
																	}

																	if (var29 > var28.scrollY) { // L: 10494
																		var29 = var28.scrollY;
																	}

																	var28.scrollY -= var29; // L: 10495
																	Client.draggedWidgetY += var29; // L: 10496
																	class143.invalidateWidget(var28); // L: 10497
																}

																if (var25 + var23 + 32 > Rasterizer2D.Rasterizer2D_yClipEnd && var28.scrollY < var28.scrollHeight - var28.height) { // L: 10499
																	var29 = (var23 + var25 + 32 - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.field558 / 3; // L: 10500
																	if (var29 > Client.field558 * 10) { // L: 10501
																		var29 = Client.field558 * 10;
																	}

																	if (var29 > var28.scrollHeight - var28.height - var28.scrollY) { // L: 10502
																		var29 = var28.scrollHeight - var28.height - var28.scrollY;
																	}

																	var28.scrollY += var29; // L: 10503
																	Client.draggedWidgetY -= var29; // L: 10504
																	class143.invalidateWidget(var28); // L: 10505
																}
															}
														} else if (var10 == class133.field1575 && var19 == Client.field745) { // L: 10509
															var36.drawTransAt(var22, var23, 128);
														} else {
															var36.drawTransBgAt(var22, var23); // L: 10510
														}
													} else {
														class143.invalidateWidget(var10); // L: 10512
													}
												}
											}

											++var19; // L: 10520
										}
									}
								} else if (var10.type == 3) { // L: 10525
									if (MouseHandler.runCs1(var10)) { // L: 10527
										var19 = var10.color2; // L: 10528
										if (var10 == Occluder.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 10529
											var19 = var10.mouseOverColor2;
										}
									} else {
										var19 = var10.color; // L: 10532
										if (var10 == Occluder.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 10533
											var19 = var10.mouseOverColor;
										}
									}

									if (var10.fill) { // L: 10535
										switch(var10.fillMode.field4947) { // L: 10536
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2); // L: 10538
											break; // L: 10539
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255)); // L: 10545
											break; // L: 10546
										default:
											if (var14 == 0) { // L: 10541
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10542
											}
										}
									} else if (var14 == 0) { // L: 10550
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10551
									}
								} else {
									Font var40;
									if (var10.type == 4) { // L: 10555
										var40 = var10.getFont(); // L: 10556
										if (var40 == null) { // L: 10557
											if (Widget.field3479) { // L: 10558
												class143.invalidateWidget(var10);
											}
										} else {
											String var46 = var10.text; // L: 10562
											if (MouseHandler.runCs1(var10)) { // L: 10563
												var20 = var10.color2; // L: 10564
												if (var10 == Occluder.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 10565
													var20 = var10.mouseOverColor2;
												}

												if (var10.text2.length() > 0) { // L: 10566
													var46 = var10.text2;
												}
											} else {
												var20 = var10.color; // L: 10569
												if (var10 == Occluder.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 10570
													var20 = var10.mouseOverColor;
												}
											}

											if (var10.isIf3 && var10.itemId != -1) { // L: 10572
												ItemComposition var47 = MidiPcmStream.ItemComposition_get(var10.itemId); // L: 10573
												var46 = var47.name; // L: 10574
												if (var46 == null) { // L: 10575
													var46 = "null";
												}

												if ((var47.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) { // L: 10576
													var46 = GameObject.colorStartTag(16748608) + var46 + "</col>" + " " + 'x' + class28.formatItemStacks(var10.itemQuantity);
												}
											}

											if (var10 == Client.meslayerContinueWidget) { // L: 10578
												var46 = "Please wait..."; // L: 10579
												var20 = var10.color; // L: 10580
											}

											if (!var10.isIf3) { // L: 10582
												var46 = Canvas.method319(var46, var10);
											}

											var40.drawLines(var46, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight); // L: 10583
										}
									} else if (var10.type == 5) { // L: 10586
										SpritePixels var42;
										if (!var10.isIf3) { // L: 10587
											var42 = var10.getSprite(MouseHandler.runCs1(var10), PcmPlayer.urlRequester); // L: 10588
											if (var42 != null) { // L: 10589
												var42.drawTransBgAt(var12, var13);
											} else if (Widget.field3479) { // L: 10590
												class143.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) { // L: 10594
												var42 = ChatChannel.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var42 = var10.getSprite(false, PcmPlayer.urlRequester); // L: 10595
											}

											if (var42 == null) { // L: 10596
												if (Widget.field3479) { // L: 10620
													class143.invalidateWidget(var10);
												}
											} else {
												var20 = var42.width; // L: 10597
												var21 = var42.height; // L: 10598
												if (!var10.spriteTiling) { // L: 10599
													var22 = var10.width * 4096 / var20; // L: 10613
													if (var10.spriteAngle != 0) { // L: 10614
														var42.method8854(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) { // L: 10615
														var42.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) { // L: 10616
														var42.drawTransBgAt(var12, var13); // L: 10617
													} else {
														var42.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height); // L: 10600
													var22 = (var20 - 1 + var10.width) / var20; // L: 10601
													var23 = (var21 - 1 + var10.height) / var21; // L: 10602

													for (var24 = 0; var24 < var22; ++var24) { // L: 10603
														for (var25 = 0; var25 < var23; ++var25) { // L: 10604
															if (var10.spriteAngle != 0) { // L: 10605
																var42.method8854(var20 / 2 + var12 + var24 * var20, var21 / 2 + var13 + var25 * var21, var10.spriteAngle, 4096);
															} else if (var14 != 0) { // L: 10606
																var42.drawTransAt(var12 + var20 * var24, var13 + var21 * var25, 256 - (var14 & 255));
															} else {
																var42.drawTransBgAt(var12 + var24 * var20, var13 + var25 * var21); // L: 10607
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10610
												}
											}
										}
									} else {
										ItemComposition var33;
										if (var10.type == 6) { // L: 10624
											boolean var37 = MouseHandler.runCs1(var10); // L: 10625
											if (var37) { // L: 10627
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId; // L: 10628
											}

											Model var43 = null; // L: 10629
											var22 = 0; // L: 10630
											if (var10.itemId != -1) { // L: 10631
												var33 = MidiPcmStream.ItemComposition_get(var10.itemId); // L: 10632
												if (var33 != null) { // L: 10633
													var33 = var33.getCountObj(var10.itemQuantity); // L: 10634
													var43 = var33.getModel(1); // L: 10635
													if (var43 != null) { // L: 10636
														var43.calculateBoundsCylinder(); // L: 10637
														var22 = var43.height / 2; // L: 10638
													} else {
														class143.invalidateWidget(var10); // L: 10640
													}
												}
											} else if (var10.modelType == 5) { // L: 10643
												if (var10.modelId == 0) { // L: 10644
													var43 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var43 = class296.localPlayer.getModel(); // L: 10645
												}
											} else if (var20 == -1) { // L: 10647
												var43 = var10.getModel((SequenceDefinition)null, -1, var37, class296.localPlayer.appearance); // L: 10648
												if (var43 == null && Widget.field3479) { // L: 10649
													class143.invalidateWidget(var10);
												}
											} else {
												SequenceDefinition var48 = WorldMapElement.SequenceDefinition_get(var20); // L: 10652
												var43 = var10.getModel(var48, var10.modelFrame, var37, class296.localPlayer.appearance); // L: 10653
												if (var43 == null && Widget.field3479) { // L: 10654
													class143.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method4192(var10.width / 2 + var12, var10.height / 2 + var13); // L: 10656
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10657
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10658
											if (var43 != null) { // L: 10659
												if (!var10.isIf3) { // L: 10660
													var43.method4590(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var43.calculateBoundsCylinder(); // L: 10662
													if (var10.modelOrthog) { // L: 10663
														var43.method4512(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var43.method4590(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY); // L: 10664
													}
												}
											}

											Rasterizer3D.Rasterizer3D_method3(); // L: 10667
										} else {
											if (var10.type == 7) { // L: 10670
												var40 = var10.getFont(); // L: 10671
												if (var40 == null) { // L: 10672
													if (Widget.field3479) { // L: 10673
														class143.invalidateWidget(var10);
													}
													continue;
												}

												var20 = 0; // L: 10676

												for (var21 = 0; var21 < var10.rawHeight; ++var21) { // L: 10677
													for (var22 = 0; var22 < var10.rawWidth; ++var22) { // L: 10678
														if (var10.itemIds[var20] > 0) { // L: 10679
															var33 = MidiPcmStream.ItemComposition_get(var10.itemIds[var20] - 1); // L: 10680
															String var35;
															if (var33.isStackable != 1 && var10.itemQuantities[var20] == 1) { // L: 10682
																var35 = GameObject.colorStartTag(16748608) + var33.name + "</col>"; // L: 10683
															} else {
																var35 = GameObject.colorStartTag(16748608) + var33.name + "</col>" + " " + 'x' + class28.formatItemStacks(var10.itemQuantities[var20]);
															}

															var25 = var12 + var22 * (var10.paddingX + 115); // L: 10684
															var26 = (var10.paddingY + 12) * var21 + var13; // L: 10685
															if (var10.textXAlignment == 0) { // L: 10686
																var40.draw(var35, var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else if (var10.textXAlignment == 1) { // L: 10687
																var40.drawCentered(var35, var10.width / 2 + var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else {
																var40.drawRightAligned(var35, var25 + var10.width - 1, var26, var10.color, var10.textShadowed ? 0 : -1); // L: 10688
															}
														}

														++var20; // L: 10690
													}
												}
											}

											Font var31;
											if (var10.type == 8 && var10 == Occluder.field2556 && Client.field786 == Client.field527) { // L: 10694 10695
												var19 = 0; // L: 10696
												var20 = 0; // L: 10697
												var31 = Language.fontPlain12; // L: 10698
												String var32 = var10.text; // L: 10699

												String var45;
												for (var32 = Canvas.method319(var32, var10); var32.length() > 0; var20 = var20 + var31.ascent + 1) { // L: 10701 10702 10714
													var24 = var32.indexOf("<br>"); // L: 10703
													if (var24 != -1) { // L: 10704
														var45 = var32.substring(0, var24); // L: 10705
														var32 = var32.substring(var24 + 4); // L: 10706
													} else {
														var45 = var32; // L: 10709
														var32 = ""; // L: 10710
													}

													var25 = var31.stringWidth(var45); // L: 10712
													if (var25 > var19) { // L: 10713
														var19 = var25;
													}
												}

												var19 += 6; // L: 10716
												var20 += 7; // L: 10717
												var24 = var12 + var10.width - 5 - var19; // L: 10718
												var25 = var13 + var10.height + 5; // L: 10719
												if (var24 < var12 + 5) { // L: 10720
													var24 = var12 + 5;
												}

												if (var24 + var19 > var4) { // L: 10721
													var24 = var4 - var19;
												}

												if (var20 + var25 > var5) { // L: 10722
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120); // L: 10723
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0); // L: 10724
												var32 = var10.text; // L: 10725
												var26 = var25 + var31.ascent + 2; // L: 10726

												for (var32 = Canvas.method319(var32, var10); var32.length() > 0; var26 = var26 + var31.ascent + 1) { // L: 10727 10728 10739
													int var27 = var32.indexOf("<br>"); // L: 10729
													if (var27 != -1) { // L: 10730
														var45 = var32.substring(0, var27); // L: 10731
														var32 = var32.substring(var27 + 4); // L: 10732
													} else {
														var45 = var32; // L: 10735
														var32 = ""; // L: 10736
													}

													var31.draw(var45, var24 + 3, var26, 0, -1); // L: 10738
												}
											}

											if (var10.type == 9) { // L: 10743
												if (var10.field3515) { // L: 10748
													var19 = var12; // L: 10749
													var20 = var13 + var10.height; // L: 10750
													var21 = var12 + var10.width; // L: 10751
													var22 = var13; // L: 10752
												} else {
													var19 = var12; // L: 10755
													var20 = var13; // L: 10756
													var21 = var12 + var10.width; // L: 10757
													var22 = var13 + var10.height; // L: 10758
												}

												if (var10.lineWid == 1) { // L: 10760
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color); // L: 10761
												} else {
													Friend.method7293(var19, var20, var21, var22, var10.color, var10.lineWid); // L: 10764
												}
											} else if (var10.type == 12) { // L: 10768
												class300 var41 = var10.method6076(); // L: 10769
												class295 var34 = var10.method6153(); // L: 10770
												if (var41 != null && var34 != null && var41.method5906()) { // L: 10771
													var31 = var10.getFont(); // L: 10772
													if (var31 != null) { // L: 10773
														Client.field709.method8980(var12, var13, var10.width, var10.height, var41.method5824(), var41.method5892(), 0, 0, var41.method5821(), var41.method5898(), var41.method5820()); // L: 10774
														var22 = var10.textShadowed ? var10.spriteShadow : -1; // L: 10775
														if (!var41.method5800() && var41.method5962().method6883()) { // L: 10776
															Client.field709.method8981(var34.field3400, var22, var34.field3399, var34.field3401); // L: 10777
															Client.field709.method8979(var41.method5816(), var31); // L: 10778
														} else {
															Client.field709.method8981(var10.color, var22, var34.field3399, var34.field3401); // L: 10781
															Client.field709.method8979(var41.method5962(), var31); // L: 10782
														}

														Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10784
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

	} // L: 10789

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I)V",
		garbageValue = "-305440002"
	)
	static final void method5406(Widget var0) {
		int var1 = var0.contentType; // L: 12254
		if (var1 == 324) { // L: 12255
			if (Client.field539 == -1) { // L: 12256
				Client.field539 = var0.spriteId2; // L: 12257
				Client.field543 = var0.spriteId; // L: 12258
			}

			if (Client.playerAppearance.field3423 == 1) { // L: 12260
				var0.spriteId2 = Client.field539;
			} else {
				var0.spriteId2 = Client.field543; // L: 12261
			}

		} else if (var1 == 325) { // L: 12264
			if (Client.field539 == -1) { // L: 12265
				Client.field539 = var0.spriteId2; // L: 12266
				Client.field543 = var0.spriteId; // L: 12267
			}

			if (Client.playerAppearance.field3423 == 1) { // L: 12269
				var0.spriteId2 = Client.field543;
			} else {
				var0.spriteId2 = Client.field539; // L: 12270
			}

		} else if (var1 == 327) { // L: 12273
			var0.modelAngleX = 150; // L: 12274
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 12275
			var0.modelType = 5; // L: 12276
			var0.modelId = 0; // L: 12277
		} else if (var1 == 328) { // L: 12280
			var0.modelAngleX = 150; // L: 12281
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 12282
			var0.modelType = 5; // L: 12283
			var0.modelId = 1; // L: 12284
		}
	} // L: 12262 12271 12278 12285 12287
}
