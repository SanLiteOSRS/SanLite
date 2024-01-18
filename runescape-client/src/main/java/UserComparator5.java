import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	static Font field1453;
	@ObfuscatedName("am")
	@Export("reversed")
	final boolean reversed;

	public UserComparator5(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lrj;Lrj;B)I",
		garbageValue = "-73"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0) { // L: 14
			if (var2.world == 0) { // L: 15
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world != 0) {
			return this.reversed ? 1 : -1; // L: 18
		}

		return this.compareUser(var1, var2); // L: 20
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 24
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lvp;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) { // L: 100
			var2 = (RunException)var0; // L: 101
			var2.message = var2.message + ' ' + var1; // L: 102
		} else {
			var2 = new RunException(var0, var1); // L: 104
		}

		return var2; // L: 105
	}

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "([Lnn;IIIIIIIII)V",
		garbageValue = "-595539709"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10502
		Rasterizer3D.method5300(); // L: 10503

		for (int var9 = 0; var9 < var0.length; ++var9) { // L: 10504
			Widget var10 = var0[var9]; // L: 10505
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) { // L: 10506 10507
				int var11;
				if (var8 == -1) { // L: 10509
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6; // L: 10510
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y; // L: 10511
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width; // L: 10512
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height; // L: 10513
					var11 = ++Client.rootWidgetCount - 1; // L: 10514
				} else {
					var11 = var8; // L: 10516
				}

				var10.rootIndex = var11; // L: 10517
				var10.cycle = Client.cycle; // L: 10518
				if (!var10.isIf3 || !class59.isComponentHidden(var10)) { // L: 10519
					if (var10.contentType > 0) { // L: 10520
						class326.method6261(var10);
					}

					int var12 = var10.x + var6; // L: 10521
					int var13 = var7 + var10.y; // L: 10522
					int var14 = var10.transparencyTop; // L: 10523
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) { // L: 10524
						if (var1 != -1412584499 && !var10.isScrollBar) { // L: 10525
							class18.field78 = var0; // L: 10526
							class27.field135 = var6; // L: 10527
							class106.field1342 = var7; // L: 10528
							continue;
						}

						if (Client.isDraggingWidget && Client.field739) { // L: 10531
							var15 = MouseHandler.MouseHandler_x; // L: 10532
							var16 = MouseHandler.MouseHandler_y; // L: 10533
							var15 -= Client.widgetClickX; // L: 10534
							var16 -= Client.widgetClickY; // L: 10535
							if (var15 < Client.field688) { // L: 10536
								var15 = Client.field688;
							}

							if (var15 + var10.width > Client.field688 + Client.clickedWidgetParent.width) { // L: 10537
								var15 = Client.field688 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field689) { // L: 10538
								var16 = Client.field689;
							}

							if (var16 + var10.height > Client.field689 + Client.clickedWidgetParent.height) { // L: 10539
								var16 = Client.field689 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15; // L: 10540
							var13 = var16; // L: 10541
						}

						if (!var10.isScrollBar) { // L: 10543
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 9) { // L: 10549
						var19 = var12; // L: 10550
						var20 = var13; // L: 10551
						var21 = var12 + var10.width; // L: 10552
						var22 = var13 + var10.height; // L: 10553
						if (var21 < var12) { // L: 10554
							var19 = var21; // L: 10556
							var21 = var12; // L: 10557
						}

						if (var22 < var13) { // L: 10559
							var20 = var22; // L: 10561
							var22 = var13; // L: 10562
						}

						++var21; // L: 10564
						++var22; // L: 10565
						var15 = var19 > var2 ? var19 : var2; // L: 10566
						var16 = var20 > var3 ? var20 : var3; // L: 10567
						var17 = var21 < var4 ? var21 : var4; // L: 10568
						var18 = var22 < var5 ? var22 : var5; // L: 10569
					} else {
						var19 = var12 + var10.width; // L: 10572
						var20 = var13 + var10.height; // L: 10573
						var15 = var12 > var2 ? var12 : var2; // L: 10574
						var16 = var13 > var3 ? var13 : var3; // L: 10575
						var17 = var19 < var4 ? var19 : var4; // L: 10576
						var18 = var20 < var5 ? var20 : var5; // L: 10577
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) { // L: 10579
						if (var10.contentType != 0) { // L: 10580
							if (var10.contentType == 1336) { // L: 10581
								if (class93.clientPreferences.method2541()) { // L: 10582
									var13 += 15; // L: 10583
									class339.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1); // L: 10584
									var13 += 15; // L: 10585
									Runtime var41 = Runtime.getRuntime(); // L: 10586
									var20 = (int)((var41.totalMemory() - var41.freeMemory()) / 1024L); // L: 10587
									var21 = 16776960; // L: 10588
									if (var20 > 327680 && !Client.isLowDetail) { // L: 10589
										var21 = 16711680;
									}

									class339.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1); // L: 10590
									var13 += 15; // L: 10591
								}
								continue;
							}

							if (var10.contentType == 1337) { // L: 10595
								Client.viewportX = var12; // L: 10596
								Client.viewportY = var13; // L: 10597
								GameEngine.drawEntities(var12, var13, var10.width, var10.height); // L: 10598
								Client.field720[var10.rootIndex] = true; // L: 10599
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10600
								continue; // L: 10601
							}

							if (var10.contentType == 1338) { // L: 10603
								class113.drawMinimap(var10, var12, var13, var11); // L: 10604
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10605
								continue; // L: 10606
							}

							if (var10.contentType == 1339) { // L: 10608
								class520.method9265(var10, var12, var13, var11); // L: 10609
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10610
								continue; // L: 10611
							}

							if (var10.contentType == 1400) { // L: 10613
								GrandExchangeOfferUnitPriceComparator.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle); // L: 10614
							}

							if (var10.contentType == 1401) { // L: 10616
								GrandExchangeOfferUnitPriceComparator.worldMap.drawOverview(var12, var13, var10.width, var10.height); // L: 10617
							}

							if (var10.contentType == 1402) { // L: 10619
								SpriteMask.loginScreenRunesAnimation.draw(var12, Client.cycle); // L: 10620
							}
						}

						if (var10.type == 0) { // L: 10623
							if (!var10.isIf3 && class59.isComponentHidden(var10) && var10 != class433.mousedOverWidgetIf1) { // L: 10624
								continue;
							}

							if (!var10.isIf3) { // L: 10625
								if (var10.scrollY > var10.scrollHeight - var10.height) { // L: 10626
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) { // L: 10627
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11); // L: 10629
							if (var10.children != null) { // L: 10630
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var10.id); // L: 10631
							if (var28 != null) { // L: 10632
								TextureProvider.method5591(var28.group, var15, var16, var17, var18, var12, var13, var11); // L: 10633
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10635
							Rasterizer3D.method5300(); // L: 10636
						} else if (var10.type == 11) { // L: 10638
							if (class59.isComponentHidden(var10) && var10 != class433.mousedOverWidgetIf1) { // L: 10639
								continue;
							}

							if (var10.children != null) { // L: 10640
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10641
							Rasterizer3D.method5300(); // L: 10642
						}

						if (Client.isResizable || Client.field729[var11] || Client.field727 > 1) { // L: 10644
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) { // L: 10645 10646
								UserComparator9.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) { // L: 10648
								if (var10.type == 3) { // L: 10651
									if (class345.runCs1(var10)) { // L: 10653
										var19 = var10.color2; // L: 10654
										if (var10 == class433.mousedOverWidgetIf1 && var10.field3729 != 0) { // L: 10655
											var19 = var10.field3729;
										}
									} else {
										var19 = var10.color; // L: 10658
										if (var10 == class433.mousedOverWidgetIf1 && var10.field3778 != 0) { // L: 10659
											var19 = var10.field3778;
										}
									}

									if (var10.fill) { // L: 10661
										switch(var10.fillMode.field5264) { // L: 10662
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2); // L: 10664
											break; // L: 10665
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255)); // L: 10671
											break; // L: 10672
										default:
											if (var14 == 0) { // L: 10667
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10668
											}
										}
									} else if (var14 == 0) { // L: 10676
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10677
									}
								} else if (var10.type == 4) { // L: 10681
									Font var40 = var10.method6698(class380.field4414); // L: 10682
									if (var40 == null) { // L: 10683
										if (Widget.field3698) { // L: 10684
											FaceNormal.invalidateWidget(var10);
										}
									} else {
										String var42 = var10.text; // L: 10688
										if (class345.runCs1(var10)) { // L: 10689
											var20 = var10.color2; // L: 10690
											if (var10 == class433.mousedOverWidgetIf1 && var10.field3729 != 0) { // L: 10691
												var20 = var10.field3729;
											}

											if (var10.field3752.length() > 0) { // L: 10692
												var42 = var10.field3752;
											}
										} else {
											var20 = var10.color; // L: 10695
											if (var10 == class433.mousedOverWidgetIf1 && var10.field3778 != 0) { // L: 10696
												var20 = var10.field3778;
											}
										}

										if (var10.isIf3 && var10.itemId != -1) { // L: 10698
											ItemComposition var43 = class341.ItemComposition_get(var10.itemId); // L: 10699
											var42 = var43.name; // L: 10700
											if (var42 == null) { // L: 10701
												var42 = "null";
											}

											if ((var43.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) { // L: 10702
												var42 = class208.colorStartTag(16748608) + var42 + "</col>" + " " + 'x' + class138.formatItemStacks(var10.itemQuantity);
											}
										}

										if (var10 == Client.meslayerContinueWidget) { // L: 10704
											var42 = "Please wait..."; // L: 10705
											var20 = var10.color; // L: 10706
										}

										if (!var10.isIf3) { // L: 10708
											var42 = class47.method912(var42, var10);
										}

										var40.method7859(var42, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, class482.method8734(var10.transparencyTop), var10.textXAlignment, var10.textYAlignment, var10.textLineHeight); // L: 10709
									}
								} else {
									int var23;
									int var24;
									int var25;
									if (var10.type == 5) { // L: 10712
										SpritePixels var38;
										if (!var10.isIf3) { // L: 10713
											var38 = var10.method6693(class380.field4414, class345.runCs1(var10), class113.urlRequester); // L: 10714
											if (var38 != null) { // L: 10715
												var38.drawTransBgAt(var12, var13);
											} else if (Widget.field3698) { // L: 10716
												FaceNormal.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) { // L: 10720
												var38 = UserComparator7.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var38 = var10.method6693(class380.field4414, false, class113.urlRequester); // L: 10721
											}

											if (var38 == null) { // L: 10722
												if (Widget.field3698) { // L: 10746
													FaceNormal.invalidateWidget(var10);
												}
											} else {
												var20 = var38.width; // L: 10723
												var21 = var38.height; // L: 10724
												if (!var10.spriteTiling) { // L: 10725
													var22 = var10.width * 4096 / var20; // L: 10739
													if (var10.spriteAngle != 0) { // L: 10740
														var38.method9857(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) { // L: 10741
														var38.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) { // L: 10742
														var38.drawTransBgAt(var12, var13); // L: 10743
													} else {
														var38.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height); // L: 10726
													var22 = (var20 - 1 + var10.width) / var20; // L: 10727
													var23 = (var21 - 1 + var10.height) / var21; // L: 10728

													for (var24 = 0; var24 < var22; ++var24) { // L: 10729
														for (var25 = 0; var25 < var23; ++var25) { // L: 10730
															if (var10.spriteAngle != 0) { // L: 10731
																var38.method9857(var20 / 2 + var12 + var24 * var20, var21 / 2 + var13 + var25 * var21, var10.spriteAngle, 4096);
															} else if (var14 != 0) { // L: 10732
																var38.drawTransAt(var12 + var20 * var24, var13 + var21 * var25, 256 - (var14 & 255));
															} else {
																var38.drawTransBgAt(var12 + var20 * var24, var13 + var21 * var25); // L: 10733
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10736
												}
											}
										}
									} else {
										int var26;
										if (var10.type == 6) { // L: 10750
											boolean var36 = class345.runCs1(var10); // L: 10751
											if (var36) { // L: 10753
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId; // L: 10754
											}

											Model var39 = null; // L: 10755
											var22 = 0; // L: 10756
											if (var10.itemId != -1) { // L: 10757
												ItemComposition var44 = class341.ItemComposition_get(var10.itemId); // L: 10758
												if (var44 != null) { // L: 10759
													var44 = var44.getCountObj(var10.itemQuantity); // L: 10760
													var39 = var44.getModel(1); // L: 10761
													if (var39 != null) { // L: 10762
														var39.calculateBoundsCylinder(); // L: 10763
														var22 = var39.height / 2; // L: 10764
													} else {
														FaceNormal.invalidateWidget(var10); // L: 10766
													}
												}
											} else if (var10.modelType == 5) { // L: 10769
												if (var10.modelId == 0) { // L: 10770
													var39 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var39 = class25.localPlayer.getModel(); // L: 10771
												}
											} else if (var10.modelType == 7) { // L: 10773
												var39 = var10.field3759.getModel((SequenceDefinition)null, -1, class9.SequenceDefinition_get(class25.localPlayer.idleSequence), class25.localPlayer.movementFrame); // L: 10774
											} else {
												NPCComposition var45 = null; // L: 10777
												class187 var33 = null; // L: 10778
												if (var10.modelType == 6) { // L: 10779
													var25 = var10.modelId; // L: 10780
													if (var25 >= 0 && var25 < Client.npcs.length) { // L: 10781
														NPC var34 = Client.npcs[var25]; // L: 10782
														if (var34 != null) { // L: 10783
															var45 = var34.definition; // L: 10784
															var33 = var34.method2671(); // L: 10785
														}
													}
												}

												SequenceDefinition var35 = null; // L: 10789
												var26 = -1; // L: 10790
												if (var20 != -1) { // L: 10791
													var35 = class9.SequenceDefinition_get(var20); // L: 10792
													var26 = var10.modelFrame; // L: 10793
												}

												var39 = var10.method6699(class380.field4414, var35, var26, var36, class25.localPlayer.appearance, var45, var33); // L: 10795
												if (var39 == null && Widget.field3698) { // L: 10796
													FaceNormal.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method5264(var10.width / 2 + var12, var10.height / 2 + var13); // L: 10798
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10799
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10800
											if (var39 != null) { // L: 10801
												if (!var10.isIf3) { // L: 10802
													var39.method5660(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var39.calculateBoundsCylinder(); // L: 10804
													if (var10.modelOrthog) { // L: 10805
														var39.method5661(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var39.method5660(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY); // L: 10806
													}
												}
											}

											Rasterizer3D.method5263(); // L: 10809
										} else {
											Font var29;
											if (var10.type == 8 && var10 == class209.field2287 && Client.field750 == Client.field662) { // L: 10812 10813
												var19 = 0; // L: 10814
												var20 = 0; // L: 10815
												var29 = class339.fontPlain12; // L: 10816
												String var30 = var10.text; // L: 10817

												String var31;
												for (var30 = class47.method912(var30, var10); var30.length() > 0; var20 = var20 + var29.ascent + 1) { // L: 10819 10820 10832
													var24 = var30.indexOf("<br>"); // L: 10821
													if (var24 != -1) { // L: 10822
														var31 = var30.substring(0, var24); // L: 10823
														var30 = var30.substring(var24 + 4); // L: 10824
													} else {
														var31 = var30; // L: 10827
														var30 = ""; // L: 10828
													}

													var25 = var29.stringWidth(var31); // L: 10830
													if (var25 > var19) { // L: 10831
														var19 = var25;
													}
												}

												var19 += 6; // L: 10834
												var20 += 7; // L: 10835
												var24 = var12 + var10.width - 5 - var19; // L: 10836
												var25 = var13 + var10.height + 5; // L: 10837
												if (var24 < var12 + 5) { // L: 10838
													var24 = var12 + 5;
												}

												if (var24 + var19 > var4) { // L: 10839
													var24 = var4 - var19;
												}

												if (var25 + var20 > var5) { // L: 10840
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120); // L: 10841
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0); // L: 10842
												var30 = var10.text; // L: 10843
												var26 = var25 + var29.ascent + 2; // L: 10844

												for (var30 = class47.method912(var30, var10); var30.length() > 0; var26 = var26 + var29.ascent + 1) { // L: 10845 10846 10857
													int var27 = var30.indexOf("<br>"); // L: 10847
													if (var27 != -1) { // L: 10848
														var31 = var30.substring(0, var27); // L: 10849
														var30 = var30.substring(var27 + 4); // L: 10850
													} else {
														var31 = var30; // L: 10853
														var30 = ""; // L: 10854
													}

													var29.draw(var31, var24 + 3, var26, 0, -1); // L: 10856
												}
											}

											if (var10.type == 9) { // L: 10861
												if (var10.field3735) { // L: 10866
													var19 = var12; // L: 10867
													var20 = var13 + var10.height; // L: 10868
													var21 = var12 + var10.width; // L: 10869
													var22 = var13; // L: 10870
												} else {
													var19 = var12; // L: 10873
													var20 = var13; // L: 10874
													var21 = var12 + var10.width; // L: 10875
													var22 = var13 + var10.height; // L: 10876
												}

												if (var10.lineWid == 1) { // L: 10878
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color); // L: 10879
												} else {
													WorldMapSection0.method4978(var19, var20, var21, var22, var10.color, var10.lineWid); // L: 10882
												}
											} else if (var10.type == 12) { // L: 10886
												class344 var37 = var10.method6700(); // L: 10887
												class339 var32 = var10.method6729(); // L: 10888
												if (var37 != null && var32 != null && var37.method6472()) { // L: 10889
													var29 = var10.method6698(class380.field4414); // L: 10890
													if (var29 != null) { // L: 10891
														Client.field712.method9979(var12, var13, var10.width, var10.height, var37.method6504(), var37.method6474(), var37.method6471(), var37.method6531(), var37.method6548()); // L: 10892
														var22 = var10.textShadowed ? var10.spriteShadow : -1; // L: 10893
														if (!var37.method6468() && var37.method6442().method7605()) { // L: 10894
															Client.field712.method9978(var32.field3620, var22, var32.field3623, var32.field3619); // L: 10895
															Client.field712.method9981(var37.method6564(), var29); // L: 10896
														} else {
															Client.field712.method9978(var10.color, var22, var32.field3623, var32.field3619); // L: 10899
															Client.field712.method9981(var37.method6442(), var29); // L: 10900
														}

														Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10902
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

	} // L: 10907

	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-243762193"
	)
	static boolean method2958(int var0) {
		for (int var1 = 0; var1 < Client.field738; ++var1) { // L: 11812
			if (Client.field559[var1] == var0) { // L: 11813
				return true;
			}
		}

		return false; // L: 11815
	}

	@ObfuscatedName("pm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-903137864"
	)
	static void method2963() {
		Client.packetWriter.addNode(class482.getPacketBufferNode(ClientPacket.field3246, Client.packetWriter.isaacCipher)); // L: 12695
		Client.oculusOrbState = 0; // L: 12696
	} // L: 12697
}
