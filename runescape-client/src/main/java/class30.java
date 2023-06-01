import java.util.Date;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("bg")
public class class30 {
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;

	static {
		ImageIO.setUseCache(false); // L: 12
	} // L: 13

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltc;Ljava/lang/String;I)I",
		garbageValue = "-1697454052"
	)
	public static int method433(Buffer var0, String var1) {
		int var2 = var0.offset; // L: 18
		byte[] var3 = WorldMapLabelSize.method5044(var1); // L: 19
		var0.writeSmartByteShort(var3.length); // L: 20
		var0.offset += class332.huffman.compress(var3, 0, var3.length, var0.array, var0.offset); // L: 21
		return var0.offset - var2; // L: 22
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "([Lmo;IIIIIIIII)V",
		garbageValue = "-1693826123"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10316
		Rasterizer3D.method4319(); // L: 10317

		for (int var9 = 0; var9 < var0.length; ++var9) { // L: 10318
			Widget var10 = var0[var9]; // L: 10319
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) { // L: 10320 10321
				int var11;
				if (var8 == -1) { // L: 10323
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6; // L: 10324
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y; // L: 10325
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width; // L: 10326
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height; // L: 10327
					var11 = ++Client.rootWidgetCount - 1; // L: 10328
				} else {
					var11 = var8; // L: 10330
				}

				var10.rootIndex = var11; // L: 10331
				var10.cycle = Client.cycle; // L: 10332
				if (!var10.isIf3 || !UserComparator9.isComponentHidden(var10)) { // L: 10333
					if (var10.contentType > 0) { // L: 10334
						WorldMapSectionType.method5451(var10);
					}

					int var12 = var10.x + var6; // L: 10335
					int var13 = var7 + var10.y; // L: 10336
					int var14 = var10.transparencyTop; // L: 10337
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) { // L: 10338
						if (var1 != -1412584499 && !var10.isScrollBar) { // L: 10339
							UrlRequest.field1414 = var0; // L: 10340
							class33.field167 = var6; // L: 10341
							Varcs.field1374 = var7; // L: 10342
							continue; // L: 10343
						}

						if (Client.isDraggingWidget && Client.field667) { // L: 10345
							var15 = MouseHandler.MouseHandler_x; // L: 10346
							var16 = MouseHandler.MouseHandler_y; // L: 10347
							var15 -= Client.widgetClickX; // L: 10348
							var16 -= Client.widgetClickY; // L: 10349
							if (var15 < Client.field668) { // L: 10350
								var15 = Client.field668;
							}

							if (var15 + var10.width > Client.field668 + Client.clickedWidgetParent.width) { // L: 10351
								var15 = Client.field668 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field670) { // L: 10352
								var16 = Client.field670;
							}

							if (var16 + var10.height > Client.field670 + Client.clickedWidgetParent.height) { // L: 10353
								var16 = Client.field670 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15; // L: 10354
							var13 = var16; // L: 10355
						}

						if (!var10.isScrollBar) { // L: 10357
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 9) { // L: 10363
						var19 = var12; // L: 10364
						var20 = var13; // L: 10365
						var21 = var12 + var10.width; // L: 10366
						var22 = var13 + var10.height; // L: 10367
						if (var21 < var12) { // L: 10368
							var19 = var21; // L: 10370
							var21 = var12; // L: 10371
						}

						if (var22 < var13) { // L: 10373
							var20 = var22; // L: 10375
							var22 = var13; // L: 10376
						}

						++var21; // L: 10378
						++var22; // L: 10379
						var15 = var19 > var2 ? var19 : var2; // L: 10380
						var16 = var20 > var3 ? var20 : var3; // L: 10381
						var17 = var21 < var4 ? var21 : var4; // L: 10382
						var18 = var22 < var5 ? var22 : var5; // L: 10383
					} else {
						var19 = var12 + var10.width; // L: 10386
						var20 = var13 + var10.height; // L: 10387
						var15 = var12 > var2 ? var12 : var2; // L: 10388
						var16 = var13 > var3 ? var13 : var3; // L: 10389
						var17 = var19 < var4 ? var19 : var4; // L: 10390
						var18 = var20 < var5 ? var20 : var5; // L: 10391
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) { // L: 10393
						if (var10.contentType != 0) { // L: 10394
							if (var10.contentType == 1336) { // L: 10395
								if (WorldMapManager.clientPreferences.method2434()) { // L: 10396
									var13 += 15; // L: 10397
									class302.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1); // L: 10398
									var13 += 15; // L: 10399
									Runtime var41 = Runtime.getRuntime(); // L: 10400
									var20 = (int)((var41.totalMemory() - var41.freeMemory()) / 1024L); // L: 10401
									var21 = 16776960; // L: 10402
									if (var20 > 327680 && !Client.isLowDetail) { // L: 10403
										var21 = 16711680;
									}

									class302.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1); // L: 10404
									var13 += 15; // L: 10405
								}
								continue;
							}

							if (var10.contentType == 1337) { // L: 10409
								Client.field639 = var12; // L: 10410
								Client.field533 = var13; // L: 10411
								MouseHandler.drawEntities(var12, var13, var10.width, var10.height); // L: 10412
								Client.field693[var10.rootIndex] = true; // L: 10413
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10414
								continue; // L: 10415
							}

							if (var10.contentType == 1338) { // L: 10417
								MouseRecorder.drawMinimap(var10, var12, var13, var11); // L: 10418
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10419
								continue; // L: 10420
							}

							if (var10.contentType == 1339) { // L: 10422
								class12.drawCompass(var10, var12, var13, var11); // L: 10423
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10424
								continue; // L: 10425
							}

							if (var10.contentType == 1400) { // L: 10427
								ScriptEvent.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle); // L: 10428
							}

							if (var10.contentType == 1401) { // L: 10430
								ScriptEvent.worldMap.drawOverview(var12, var13, var10.width, var10.height); // L: 10431
							}

							if (var10.contentType == 1402) { // L: 10433
								SecureRandomCallable.loginScreenRunesAnimation.draw(var12, Client.cycle); // L: 10434
							}
						}

						if (var10.type == 0) { // L: 10437
							if (!var10.isIf3 && UserComparator9.isComponentHidden(var10) && var10 != class216.mousedOverWidgetIf1) { // L: 10438
								continue;
							}

							if (!var10.isIf3) { // L: 10439
								if (var10.scrollY > var10.scrollHeight - var10.height) { // L: 10440
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) { // L: 10441
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11); // L: 10443
							if (var10.children != null) { // L: 10444
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var10.id); // L: 10445
							if (var28 != null) { // L: 10446
								MouseHandler.drawWidgets(var28.group, var15, var16, var17, var18, var12, var13, var11); // L: 10447
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10449
							Rasterizer3D.method4319(); // L: 10450
						} else if (var10.type == 11) { // L: 10452
							if (UserComparator9.isComponentHidden(var10) && var10 != class216.mousedOverWidgetIf1) { // L: 10453
								continue;
							}

							if (var10.children != null) { // L: 10454
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10455
							Rasterizer3D.method4319(); // L: 10456
						}

						if (Client.isResizable || Client.field745[var11] || Client.gameDrawingMode > 1) { // L: 10458
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) { // L: 10459 10460
								class304.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) { // L: 10462
								if (var10.type == 3) { // L: 10465
									if (HitSplatDefinition.runCs1(var10)) { // L: 10467
										var19 = var10.color2; // L: 10468
										if (var10 == class216.mousedOverWidgetIf1 && var10.field3636 != 0) { // L: 10469
											var19 = var10.field3636;
										}
									} else {
										var19 = var10.color; // L: 10472
										if (var10 == class216.mousedOverWidgetIf1 && var10.field3635 != 0) { // L: 10473
											var19 = var10.field3635;
										}
									}

									if (var10.fill) { // L: 10475
										switch(var10.fillMode.field5099) { // L: 10476
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2); // L: 10485
											break; // L: 10486
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255)); // L: 10478
											break; // L: 10479
										default:
											if (var14 == 0) { // L: 10481
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10482
											}
										}
									} else if (var14 == 0) { // L: 10490
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10491
									}
								} else if (var10.type == 4) { // L: 10495
									Font var40 = var10.getFont(); // L: 10496
									if (var40 == null) { // L: 10497
										if (Widget.field3606) { // L: 10498
											HorizontalAlignment.invalidateWidget(var10);
										}
									} else {
										String var42 = var10.text; // L: 10502
										if (HitSplatDefinition.runCs1(var10)) { // L: 10503
											var20 = var10.color2; // L: 10504
											if (var10 == class216.mousedOverWidgetIf1 && var10.field3636 != 0) { // L: 10505
												var20 = var10.field3636;
											}

											if (var10.field3684.length() > 0) { // L: 10506
												var42 = var10.field3684;
											}
										} else {
											var20 = var10.color; // L: 10509
											if (var10 == class216.mousedOverWidgetIf1 && var10.field3635 != 0) { // L: 10510
												var20 = var10.field3635;
											}
										}

										if (var10.isIf3 && var10.itemId != -1) { // L: 10512
											ItemComposition var43 = class230.ItemComposition_get(var10.itemId); // L: 10513
											var42 = var43.name; // L: 10514
											if (var42 == null) { // L: 10515
												var42 = "null";
											}

											if ((var43.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) { // L: 10516
												var42 = class396.colorStartTag(16748608) + var42 + "</col>" + " " + 'x' + PendingSpawn.formatItemStacks(var10.itemQuantity);
											}
										}

										if (var10 == Client.meslayerContinueWidget) { // L: 10518
											var42 = "Please wait..."; // L: 10519
											var20 = var10.color; // L: 10520
										}

										if (!var10.isIf3) { // L: 10522
											var42 = class347.method6646(var42, var10);
										}

										var40.method7411(var42, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, WorldMap.method8636(var10.transparencyTop), var10.textXAlignment, var10.textYAlignment, var10.textLineHeight); // L: 10523
									}
								} else {
									int var23;
									int var24;
									int var25;
									if (var10.type == 5) { // L: 10526
										SpritePixels var38;
										if (!var10.isIf3) { // L: 10527
											var38 = var10.getSprite(HitSplatDefinition.runCs1(var10), PendingSpawn.urlRequester); // L: 10528
											if (var38 != null) { // L: 10529
												var38.drawTransBgAt(var12, var13);
											} else if (Widget.field3606) { // L: 10530
												HorizontalAlignment.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) { // L: 10534
												var38 = class148.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var38 = var10.getSprite(false, PendingSpawn.urlRequester); // L: 10535
											}

											if (var38 == null) { // L: 10536
												if (Widget.field3606) { // L: 10560
													HorizontalAlignment.invalidateWidget(var10);
												}
											} else {
												var20 = var38.width; // L: 10537
												var21 = var38.height; // L: 10538
												if (!var10.spriteTiling) { // L: 10539
													var22 = var10.width * 4096 / var20; // L: 10553
													if (var10.spriteAngle != 0) { // L: 10554
														var38.method9450(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) { // L: 10555
														var38.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) { // L: 10556
														var38.drawTransBgAt(var12, var13); // L: 10557
													} else {
														var38.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height); // L: 10540
													var22 = (var20 - 1 + var10.width) / var20; // L: 10541
													var23 = (var21 - 1 + var10.height) / var21; // L: 10542

													for (var24 = 0; var24 < var22; ++var24) { // L: 10543
														for (var25 = 0; var25 < var23; ++var25) { // L: 10544
															if (var10.spriteAngle != 0) { // L: 10545
																var38.method9450(var20 / 2 + var12 + var24 * var20, var21 / 2 + var13 + var21 * var25, var10.spriteAngle, 4096);
															} else if (var14 != 0) { // L: 10546
																var38.drawTransAt(var12 + var20 * var24, var13 + var25 * var21, 256 - (var14 & 255));
															} else {
																var38.drawTransBgAt(var12 + var20 * var24, var13 + var25 * var21); // L: 10547
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10550
												}
											}
										}
									} else {
										int var26;
										if (var10.type == 6) { // L: 10564
											boolean var36 = HitSplatDefinition.runCs1(var10); // L: 10565
											if (var36) { // L: 10567
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId; // L: 10568
											}

											Model var39 = null; // L: 10569
											var22 = 0; // L: 10570
											if (var10.itemId != -1) { // L: 10571
												ItemComposition var44 = class230.ItemComposition_get(var10.itemId); // L: 10572
												if (var44 != null) { // L: 10573
													var44 = var44.getCountObj(var10.itemQuantity); // L: 10574
													var39 = var44.getModel(1); // L: 10575
													if (var39 != null) { // L: 10576
														var39.calculateBoundsCylinder(); // L: 10577
														var22 = var39.height / 2; // L: 10578
													} else {
														HorizontalAlignment.invalidateWidget(var10); // L: 10580
													}
												}
											} else if (var10.modelType == 5) { // L: 10583
												if (var10.modelId == 0) { // L: 10584
													var39 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var39 = HitSplatDefinition.localPlayer.getModel(); // L: 10585
												}
											} else if (var10.modelType == 7) { // L: 10587
												var39 = var10.field3666.getModel((SequenceDefinition)null, -1, class149.SequenceDefinition_get(HitSplatDefinition.localPlayer.idleSequence), HitSplatDefinition.localPlayer.movementFrame); // L: 10588
											} else {
												NPCComposition var45 = null; // L: 10591
												class193 var33 = null; // L: 10592
												if (var10.modelType == 6) { // L: 10593
													var25 = var10.modelId; // L: 10594
													if (var25 >= 0 && var25 < Client.npcs.length) { // L: 10595
														NPC var34 = Client.npcs[var25]; // L: 10596
														if (var34 != null) { // L: 10597
															var45 = var34.definition; // L: 10598
															var33 = var34.method2563(); // L: 10599
														}
													}
												}

												SequenceDefinition var35 = null; // L: 10603
												var26 = -1; // L: 10604
												if (var20 != -1) { // L: 10605
													var35 = class149.SequenceDefinition_get(var20); // L: 10606
													var26 = var10.modelFrame; // L: 10607
												}

												var39 = var10.method6535(var35, var26, var36, HitSplatDefinition.localPlayer.appearance, var45, var33); // L: 10609
												if (var39 == null && Widget.field3606) { // L: 10610
													HorizontalAlignment.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method4335(var10.width / 2 + var12, var10.height / 2 + var13); // L: 10612
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10613
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10614
											if (var39 != null) { // L: 10615
												if (!var10.isIf3) { // L: 10616
													var39.method4773(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var39.calculateBoundsCylinder(); // L: 10618
													if (var10.modelOrthog) { // L: 10619
														var39.method4818(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var39.method4773(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY); // L: 10620
													}
												}
											}

											Rasterizer3D.method4334(); // L: 10623
										} else {
											Font var29;
											if (var10.type == 8 && var10 == WorldMapSectionType.field2979 && Client.field699 == Client.field642) { // L: 10626 10627
												var19 = 0; // L: 10628
												var20 = 0; // L: 10629
												var29 = class302.fontPlain12; // L: 10630
												String var30 = var10.text; // L: 10631

												String var31;
												for (var30 = class347.method6646(var30, var10); var30.length() > 0; var20 = var20 + var29.ascent + 1) { // L: 10633 10634 10646
													var24 = var30.indexOf("<br>"); // L: 10635
													if (var24 != -1) { // L: 10636
														var31 = var30.substring(0, var24); // L: 10637
														var30 = var30.substring(var24 + 4); // L: 10638
													} else {
														var31 = var30; // L: 10641
														var30 = ""; // L: 10642
													}

													var25 = var29.stringWidth(var31); // L: 10644
													if (var25 > var19) { // L: 10645
														var19 = var25;
													}
												}

												var19 += 6; // L: 10648
												var20 += 7; // L: 10649
												var24 = var12 + var10.width - 5 - var19; // L: 10650
												var25 = var13 + var10.height + 5; // L: 10651
												if (var24 < var12 + 5) { // L: 10652
													var24 = var12 + 5;
												}

												if (var19 + var24 > var4) { // L: 10653
													var24 = var4 - var19;
												}

												if (var25 + var20 > var5) { // L: 10654
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120); // L: 10655
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0); // L: 10656
												var30 = var10.text; // L: 10657
												var26 = var25 + var29.ascent + 2; // L: 10658

												for (var30 = class347.method6646(var30, var10); var30.length() > 0; var26 = var26 + var29.ascent + 1) { // L: 10659 10660 10671
													int var27 = var30.indexOf("<br>"); // L: 10661
													if (var27 != -1) { // L: 10662
														var31 = var30.substring(0, var27); // L: 10663
														var30 = var30.substring(var27 + 4); // L: 10664
													} else {
														var31 = var30; // L: 10667
														var30 = ""; // L: 10668
													}

													var29.draw(var31, var24 + 3, var26, 0, -1); // L: 10670
												}
											}

											if (var10.type == 9) { // L: 10675
												if (var10.field3642) { // L: 10680
													var19 = var12; // L: 10681
													var20 = var13 + var10.height; // L: 10682
													var21 = var12 + var10.width; // L: 10683
													var22 = var13; // L: 10684
												} else {
													var19 = var12; // L: 10687
													var20 = var13; // L: 10688
													var21 = var12 + var10.width; // L: 10689
													var22 = var13 + var10.height; // L: 10690
												}

												if (var10.lineWid == 1) { // L: 10692
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color); // L: 10693
												} else {
													SecureRandomCallable.method2213(var19, var20, var21, var22, var10.color, var10.lineWid); // L: 10696
												}
											} else if (var10.type == 12) { // L: 10700
												class327 var37 = var10.method6544(); // L: 10701
												class322 var32 = var10.method6456(); // L: 10702
												if (var37 != null && var32 != null && var37.method6209()) { // L: 10703
													var29 = var10.getFont(); // L: 10704
													if (var29 != null) { // L: 10705
														Client.field692.method9580(var12, var13, var10.width, var10.height, var37.method6210(), var37.method6178(), var37.method6207(), var37.method6208(), var37.method6224()); // L: 10706
														var22 = var10.textShadowed ? var10.spriteShadow : -1; // L: 10707
														if (!var37.method6380() && var37.method6201().method7254()) { // L: 10708
															Client.field692.method9577(var32.field3518, var22, var32.field3520, var32.field3519); // L: 10709
															Client.field692.method9578(var37.method6191(), var29); // L: 10710
														} else {
															Client.field692.method9577(var10.color, var22, var32.field3520, var32.field3519); // L: 10713
															Client.field692.method9578(var37.method6201(), var29); // L: 10714
														}

														Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10716
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

	} // L: 10721

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(Lmo;IIZI)V",
		garbageValue = "285356504"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width; // L: 10845
		int var5 = var0.height; // L: 10846
		if (var0.widthAlignment == 0) { // L: 10847
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) { // L: 10848
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) { // L: 10849
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) { // L: 10850
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) { // L: 10851
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) {
			var0.height = var2 * var0.rawHeight >> 14; // L: 10852
		}

		if (var0.widthAlignment == 4) { // L: 10853
			var0.width = var0.height * var0.field3625 / var0.field3626;
		}

		if (var0.heightAlignment == 4) { // L: 10854
			var0.height = var0.field3626 * var0.width / var0.field3625;
		}

		if (var0.contentType == 1337) { // L: 10855
			Client.viewportWidget = var0;
		}

		if (var0.type == 12) { // L: 10856
			var0.method6544().method6296(var0.width, var0.height); // L: 10857
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) { // L: 10859
			ScriptEvent var6 = new ScriptEvent(); // L: 10860
			var6.widget = var0; // L: 10861
			var6.args = var0.onResize; // L: 10862
			Client.scriptEvents.addFirst(var6); // L: 10863
		}

	} // L: 10865

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "99"
	)
	static void method430(int var0, int var1) {
		MenuAction var2 = class402.tempMenuAction; // L: 11870
		if (var2 != null) { // L: 11872
			AbstractUserComparator.method7847(var2.param0, var2.param1, var2.opcode, var2.identifier, var2.field872, var2.field873, var2.field868, var0, var1); // L: 11873
		}

		class402.tempMenuAction = null; // L: 11876
	} // L: 11877

	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-18647"
	)
	static final void method432() {
		PacketBufferNode var0 = class251.getPacketBufferNode(ClientPacket.field3160, Client.packetWriter.isaacCipher); // L: 12157
		Client.packetWriter.addNode(var0); // L: 12158
		Interpreter.field833 = true; // L: 12159

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) { // L: 12160
			if (var1.type == 0 || var1.type == 3) { // L: 12161
				class10.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) { // L: 12163
			HorizontalAlignment.invalidateWidget(Client.meslayerContinueWidget); // L: 12164
			Client.meslayerContinueWidget = null; // L: 12165
		}

		Interpreter.field833 = false; // L: 12167
	} // L: 12168

	@ObfuscatedName("nq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "-11488"
	)
	static void method434(String var0) {
		class406.field4553 = var0; // L: 12488

		try {
			String var1 = class439.client.getParameter(Integer.toString(18)); // L: 12490
			String var2 = class439.client.getParameter(Integer.toString(13)); // L: 12491
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2; // L: 12492
			String var5;
			if (var0.length() == 0) { // L: 12493
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				String var4 = var3 + "; Expires="; // L: 12495
				long var6 = Canvas.method310() + 94608000000L; // L: 12497
				Calendar.Calendar_calendar.setTime(new Date(var6)); // L: 12499
				int var8 = Calendar.Calendar_calendar.get(7); // L: 12500
				int var9 = Calendar.Calendar_calendar.get(5); // L: 12501
				int var10 = Calendar.Calendar_calendar.get(2); // L: 12502
				int var11 = Calendar.Calendar_calendar.get(1); // L: 12503
				int var12 = Calendar.Calendar_calendar.get(11); // L: 12504
				int var13 = Calendar.Calendar_calendar.get(12); // L: 12505
				int var14 = Calendar.Calendar_calendar.get(13); // L: 12506
				var5 = Calendar.DAYS_OF_THE_WEEK[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT"; // L: 12507
				var3 = var4 + var5 + "; Max-Age=" + 94608000L; // L: 12509
			}

			Client var16 = class439.client; // L: 12511
			var5 = "document.cookie=\"" + var3 + "\""; // L: 12512
			JSObject.getWindow(var16).eval(var5); // L: 12515
		} catch (Throwable var15) { // L: 12518
		}

	} // L: 12519
}
