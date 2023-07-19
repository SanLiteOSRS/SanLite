import java.awt.Component;
import java.awt.Graphics;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("wv")
	static List field110;
	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("ot")
	@ObfuscatedGetter(
		intValue = -1224052835
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	@ObfuscatedName("ai")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1; // L: 11
	} // L: 12

	public final void update(Graphics var1) {
		this.component.update(var1); // L: 15
	} // L: 16

	public final void paint(Graphics var1) {
		this.component.paint(var1); // L: 19
	} // L: 20

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "([Lme;IIIIIIIIB)V",
		garbageValue = "83"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10562
		Rasterizer3D.method4490(); // L: 10563

		for (int var9 = 0; var9 < var0.length; ++var9) { // L: 10564
			Widget var10 = var0[var9]; // L: 10565
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) { // L: 10566 10567
				int var11;
				if (var8 == -1) { // L: 10569
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6; // L: 10570
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y; // L: 10571
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width; // L: 10572
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height; // L: 10573
					var11 = ++Client.rootWidgetCount - 1; // L: 10574
				} else {
					var11 = var8; // L: 10576
				}

				var10.rootIndex = var11; // L: 10577
				var10.cycle = Client.cycle; // L: 10578
				if (!var10.isIf3 || !UserComparator4.isComponentHidden(var10)) { // L: 10579
					if (var10.contentType > 0) { // L: 10580
						method343(var10);
					}

					int var12 = var10.x + var6; // L: 10581
					int var13 = var7 + var10.y; // L: 10582
					int var14 = var10.transparencyTop; // L: 10583
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) { // L: 10584
						if (var1 != -1412584499 && !var10.isScrollBar) { // L: 10585
							class72.field899 = var0; // L: 10586
							SoundSystem.field311 = var6; // L: 10587
							DynamicObject.field996 = var7; // L: 10588
							continue; // L: 10589
						}

						if (Client.isDraggingWidget && Client.field684) { // L: 10591
							var15 = MouseHandler.MouseHandler_x; // L: 10592
							var16 = MouseHandler.MouseHandler_y; // L: 10593
							var15 -= Client.widgetClickX; // L: 10594
							var16 -= Client.widgetClickY; // L: 10595
							if (var15 < Client.field685) { // L: 10596
								var15 = Client.field685;
							}

							if (var15 + var10.width > Client.field685 + Client.clickedWidgetParent.width) { // L: 10597
								var15 = Client.field685 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field776) { // L: 10598
								var16 = Client.field776;
							}

							if (var16 + var10.height > Client.field776 + Client.clickedWidgetParent.height) { // L: 10599
								var16 = Client.field776 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15; // L: 10600
							var13 = var16; // L: 10601
						}

						if (!var10.isScrollBar) { // L: 10603
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 9) { // L: 10609
						var19 = var12; // L: 10610
						var20 = var13; // L: 10611
						var21 = var12 + var10.width; // L: 10612
						var22 = var13 + var10.height; // L: 10613
						if (var21 < var12) { // L: 10614
							var19 = var21; // L: 10616
							var21 = var12; // L: 10617
						}

						if (var22 < var13) { // L: 10619
							var20 = var22; // L: 10621
							var22 = var13; // L: 10622
						}

						++var21; // L: 10624
						++var22; // L: 10625
						var15 = var19 > var2 ? var19 : var2; // L: 10626
						var16 = var20 > var3 ? var20 : var3; // L: 10627
						var17 = var21 < var4 ? var21 : var4; // L: 10628
						var18 = var22 < var5 ? var22 : var5; // L: 10629
					} else {
						var19 = var12 + var10.width; // L: 10632
						var20 = var13 + var10.height; // L: 10633
						var15 = var12 > var2 ? var12 : var2; // L: 10634
						var16 = var13 > var3 ? var13 : var3; // L: 10635
						var17 = var19 < var4 ? var19 : var4; // L: 10636
						var18 = var20 < var5 ? var20 : var5; // L: 10637
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) { // L: 10639
						if (var10.contentType != 0) { // L: 10640
							if (var10.contentType == 1336) { // L: 10641
								if (ScriptFrame.clientPreferences.method2510()) { // L: 10642
									var13 += 15; // L: 10643
									StudioGame.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1); // L: 10644
									var13 += 15; // L: 10645
									Runtime var41 = Runtime.getRuntime(); // L: 10646
									var20 = (int)((var41.totalMemory() - var41.freeMemory()) / 1024L); // L: 10647
									var21 = 16776960; // L: 10648
									if (var20 > 327680 && !Client.isLowDetail) { // L: 10649
										var21 = 16711680;
									}

									StudioGame.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1); // L: 10650
									var13 += 15; // L: 10651
								}
								continue;
							}

							if (var10.contentType == 1337) { // L: 10655
								Client.viewportX = var12; // L: 10656
								Client.viewportY = var13; // L: 10657
								class72.drawEntities(var12, var13, var10.width, var10.height); // L: 10658
								Client.field717[var10.rootIndex] = true; // L: 10659
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10660
								continue; // L: 10661
							}

							if (var10.contentType == 1338) { // L: 10663
								class357.drawMinimap(var10, var12, var13, var11); // L: 10664
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10665
								continue; // L: 10666
							}

							if (var10.contentType == 1339) { // L: 10668
								class398.drawCompass(var10, var12, var13, var11); // L: 10669
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10670
								continue; // L: 10671
							}

							if (var10.contentType == 1400) { // L: 10673
								ScriptFrame.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle); // L: 10674
							}

							if (var10.contentType == 1401) { // L: 10676
								ScriptFrame.worldMap.drawOverview(var12, var13, var10.width, var10.height); // L: 10677
							}

							if (var10.contentType == 1402) { // L: 10679
								ModelData0.loginScreenRunesAnimation.draw(var12, Client.cycle); // L: 10680
							}
						}

						if (var10.type == 0) { // L: 10683
							if (!var10.isIf3 && UserComparator4.isComponentHidden(var10) && var10 != class308.mousedOverWidgetIf1) { // L: 10684
								continue;
							}

							if (!var10.isIf3) { // L: 10685
								if (var10.scrollY > var10.scrollHeight - var10.height) { // L: 10686
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) { // L: 10687
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11); // L: 10689
							if (var10.children != null) { // L: 10690
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var10.id); // L: 10691
							if (var28 != null) { // L: 10692
								RouteStrategy.drawWidgets(var28.group, var15, var16, var17, var18, var12, var13, var11); // L: 10693
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10695
							Rasterizer3D.method4490(); // L: 10696
						} else if (var10.type == 11) { // L: 10698
							if (UserComparator4.isComponentHidden(var10) && var10 != class308.mousedOverWidgetIf1) { // L: 10699
								continue;
							}

							if (var10.children != null) { // L: 10700
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10701
							Rasterizer3D.method4490(); // L: 10702
						}

						if (Client.isResizable || Client.field719[var11] || Client.field724 > 1) { // L: 10704
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) { // L: 10705 10706
								MusicPatchPcmStream.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) { // L: 10708
								if (var10.type == 3) { // L: 10711
									if (MenuAction.runCs1(var10)) { // L: 10713
										var19 = var10.color2; // L: 10714
										if (var10 == class308.mousedOverWidgetIf1 && var10.field3655 != 0) { // L: 10715
											var19 = var10.field3655;
										}
									} else {
										var19 = var10.color; // L: 10718
										if (var10 == class308.mousedOverWidgetIf1 && var10.field3654 != 0) { // L: 10719
											var19 = var10.field3654;
										}
									}

									if (var10.fill) { // L: 10721
										switch(var10.fillMode.field5147) { // L: 10722
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2); // L: 10731
											break; // L: 10732
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255)); // L: 10728
											break; // L: 10729
										default:
											if (var14 == 0) { // L: 10724
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10725
											}
										}
									} else if (var14 == 0) { // L: 10736
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10737
									}
								} else if (var10.type == 4) { // L: 10741
									Font var40 = var10.getFont(); // L: 10742
									if (var40 == null) { // L: 10743
										if (Widget.field3769) { // L: 10744
											class303.invalidateWidget(var10);
										}
									} else {
										String var42 = var10.text; // L: 10748
										if (MenuAction.runCs1(var10)) { // L: 10749
											var20 = var10.color2; // L: 10750
											if (var10 == class308.mousedOverWidgetIf1 && var10.field3655 != 0) { // L: 10751
												var20 = var10.field3655;
											}

											if (var10.field3771.length() > 0) { // L: 10752
												var42 = var10.field3771;
											}
										} else {
											var20 = var10.color; // L: 10755
											if (var10 == class308.mousedOverWidgetIf1 && var10.field3654 != 0) { // L: 10756
												var20 = var10.field3654;
											}
										}

										if (var10.isIf3 && var10.itemId != -1) { // L: 10758
											ItemComposition var43 = class141.ItemComposition_get(var10.itemId); // L: 10759
											var42 = var43.name; // L: 10760
											if (var42 == null) { // L: 10761
												var42 = "null";
											}

											if ((var43.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) { // L: 10762
												var42 = class17.colorStartTag(16748608) + var42 + "</col>" + " " + 'x' + formatItemStacks(var10.itemQuantity);
											}
										}

										if (var10 == Client.meslayerContinueWidget) { // L: 10764
											var42 = "Please wait..."; // L: 10765
											var20 = var10.color; // L: 10766
										}

										if (!var10.isIf3) { // L: 10768
											var42 = KitDefinition.method3729(var42, var10);
										}

										var40.method7575(var42, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, DefaultsGroup.method8138(var10.transparencyTop), var10.textXAlignment, var10.textYAlignment, var10.textLineHeight); // L: 10769
									}
								} else {
									int var23;
									int var24;
									int var25;
									if (var10.type == 5) { // L: 10772
										SpritePixels var38;
										if (!var10.isIf3) { // L: 10773
											var38 = var10.getSprite(MenuAction.runCs1(var10), class327.urlRequester); // L: 10774
											if (var38 != null) { // L: 10775
												var38.drawTransBgAt(var12, var13);
											} else if (Widget.field3769) { // L: 10776
												class303.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) { // L: 10780
												var38 = World.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var38 = var10.getSprite(false, class327.urlRequester); // L: 10781
											}

											if (var38 == null) { // L: 10782
												if (Widget.field3769) { // L: 10806
													class303.invalidateWidget(var10);
												}
											} else {
												var20 = var38.width; // L: 10783
												var21 = var38.height; // L: 10784
												if (!var10.spriteTiling) { // L: 10785
													var22 = var10.width * 4096 / var20; // L: 10799
													if (var10.spriteAngle != 0) { // L: 10800
														var38.method9548(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) { // L: 10801
														var38.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) { // L: 10802
														var38.drawTransBgAt(var12, var13); // L: 10803
													} else {
														var38.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height); // L: 10786
													var22 = (var20 - 1 + var10.width) / var20; // L: 10787
													var23 = (var21 - 1 + var10.height) / var21; // L: 10788

													for (var24 = 0; var24 < var22; ++var24) { // L: 10789
														for (var25 = 0; var25 < var23; ++var25) { // L: 10790
															if (var10.spriteAngle != 0) { // L: 10791
																var38.method9548(var20 / 2 + var12 + var20 * var24, var21 / 2 + var13 + var21 * var25, var10.spriteAngle, 4096);
															} else if (var14 != 0) { // L: 10792
																var38.drawTransAt(var12 + var20 * var24, var13 + var25 * var21, 256 - (var14 & 255));
															} else {
																var38.drawTransBgAt(var12 + var24 * var20, var13 + var25 * var21); // L: 10793
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10796
												}
											}
										}
									} else {
										int var26;
										if (var10.type == 6) { // L: 10810
											boolean var36 = MenuAction.runCs1(var10); // L: 10811
											if (var36) { // L: 10813
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId; // L: 10814
											}

											Model var39 = null; // L: 10815
											var22 = 0; // L: 10816
											if (var10.itemId != -1) { // L: 10817
												ItemComposition var44 = class141.ItemComposition_get(var10.itemId); // L: 10818
												if (var44 != null) { // L: 10819
													var44 = var44.getCountObj(var10.itemQuantity); // L: 10820
													var39 = var44.getModel(1); // L: 10821
													if (var39 != null) { // L: 10822
														var39.calculateBoundsCylinder(); // L: 10823
														var22 = var39.height / 2; // L: 10824
													} else {
														class303.invalidateWidget(var10); // L: 10826
													}
												}
											} else if (var10.modelType == 5) { // L: 10829
												if (var10.modelId == 0) { // L: 10830
													var39 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var39 = class27.localPlayer.getModel(); // L: 10831
												}
											} else if (var10.modelType == 7) { // L: 10833
												var39 = var10.field3685.getModel((SequenceDefinition)null, -1, class140.SequenceDefinition_get(class27.localPlayer.idleSequence), class27.localPlayer.movementFrame); // L: 10834
											} else {
												NPCComposition var45 = null; // L: 10837
												class194 var33 = null; // L: 10838
												if (var10.modelType == 6) { // L: 10839
													var25 = var10.modelId; // L: 10840
													if (var25 >= 0 && var25 < Client.npcs.length) { // L: 10841
														NPC var34 = Client.npcs[var25]; // L: 10842
														if (var34 != null) { // L: 10843
															var45 = var34.definition; // L: 10844
															var33 = var34.method2640(); // L: 10845
														}
													}
												}

												SequenceDefinition var35 = null; // L: 10849
												var26 = -1; // L: 10850
												if (var20 != -1) { // L: 10851
													var35 = class140.SequenceDefinition_get(var20); // L: 10852
													var26 = var10.modelFrame; // L: 10853
												}

												var39 = var10.method6527(var35, var26, var36, class27.localPlayer.appearance, var45, var33); // L: 10855
												if (var39 == null && Widget.field3769) { // L: 10856
													class303.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method4493(var10.width / 2 + var12, var10.height / 2 + var13); // L: 10858
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10859
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10860
											if (var39 != null) { // L: 10861
												if (!var10.isIf3) { // L: 10862
													var39.method4897(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var39.calculateBoundsCylinder(); // L: 10864
													if (var10.modelOrthog) { // L: 10865
														var39.method4866(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var39.method4897(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY); // L: 10866
													}
												}
											}

											Rasterizer3D.method4492(); // L: 10869
										} else {
											Font var29;
											if (var10.type == 8 && var10 == class4.field11 && Client.field658 == Client.field659) { // L: 10872 10873
												var19 = 0; // L: 10874
												var20 = 0; // L: 10875
												var29 = StudioGame.fontPlain12; // L: 10876
												String var30 = var10.text; // L: 10877

												String var31;
												for (var30 = KitDefinition.method3729(var30, var10); var30.length() > 0; var20 = var20 + var29.ascent + 1) { // L: 10879 10880 10892
													var24 = var30.indexOf("<br>"); // L: 10881
													if (var24 != -1) { // L: 10882
														var31 = var30.substring(0, var24); // L: 10883
														var30 = var30.substring(var24 + 4); // L: 10884
													} else {
														var31 = var30; // L: 10887
														var30 = ""; // L: 10888
													}

													var25 = var29.stringWidth(var31); // L: 10890
													if (var25 > var19) { // L: 10891
														var19 = var25;
													}
												}

												var19 += 6; // L: 10894
												var20 += 7; // L: 10895
												var24 = var12 + var10.width - 5 - var19; // L: 10896
												var25 = var13 + var10.height + 5; // L: 10897
												if (var24 < var12 + 5) { // L: 10898
													var24 = var12 + 5;
												}

												if (var24 + var19 > var4) { // L: 10899
													var24 = var4 - var19;
												}

												if (var25 + var20 > var5) { // L: 10900
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120); // L: 10901
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0); // L: 10902
												var30 = var10.text; // L: 10903
												var26 = var25 + var29.ascent + 2; // L: 10904

												for (var30 = KitDefinition.method3729(var30, var10); var30.length() > 0; var26 = var26 + var29.ascent + 1) { // L: 10905 10906 10917
													int var27 = var30.indexOf("<br>"); // L: 10907
													if (var27 != -1) { // L: 10908
														var31 = var30.substring(0, var27); // L: 10909
														var30 = var30.substring(var27 + 4); // L: 10910
													} else {
														var31 = var30; // L: 10913
														var30 = ""; // L: 10914
													}

													var29.draw(var31, var24 + 3, var26, 0, -1); // L: 10916
												}
											}

											if (var10.type == 9) { // L: 10921
												if (var10.field3661) { // L: 10926
													var19 = var12; // L: 10927
													var20 = var13 + var10.height; // L: 10928
													var21 = var12 + var10.width; // L: 10929
													var22 = var13; // L: 10930
												} else {
													var19 = var12; // L: 10933
													var20 = var13; // L: 10934
													var21 = var12 + var10.width; // L: 10935
													var22 = var13 + var10.height; // L: 10936
												}

												if (var10.lineWid == 1) { // L: 10938
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color); // L: 10939
												} else {
													EnumComposition.method3787(var19, var20, var21, var22, var10.color, var10.lineWid); // L: 10942
												}
											} else if (var10.type == 12) { // L: 10946
												class329 var37 = var10.method6470(); // L: 10947
												class324 var32 = var10.method6471(); // L: 10948
												if (var37 != null && var32 != null && var37.method6218()) { // L: 10949
													var29 = var10.getFont(); // L: 10950
													if (var29 != null) { // L: 10951
														Client.field709.method9677(var12, var13, var10.width, var10.height, var37.method6346(), var37.method6220(), var37.method6177(), var37.method6263(), var37.method6215()); // L: 10952
														var22 = var10.textShadowed ? var10.spriteShadow : -1; // L: 10953
														if (!var37.method6434() && var37.method6210().method7452()) { // L: 10954
															Client.field709.method9679(var32.field3540, var22, var32.field3539, var32.field3538); // L: 10955
															Client.field709.method9680(var37.method6219(), var29); // L: 10956
														} else {
															Client.field709.method9679(var10.color, var22, var32.field3539, var32.field3538); // L: 10959
															Client.field709.method9680(var37.method6210(), var29); // L: 10960
														}

														Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10962
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

	} // L: 10967

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1524127494"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0); // L: 11015

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) { // L: 11016
			var1 = var1.substring(0, var2) + "," + var1.substring(var2); // L: 11017
		}

		if (var1.length() > 9) { // L: 11019
			return " " + class17.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + class17.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + class17.colorStartTag(16776960) + var1 + "</col>"; // L: 11020 11021
		}
	}

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(Lme;I)V",
		garbageValue = "-1738173771"
	)
	static final void method343(Widget var0) {
		int var1 = var0.contentType; // L: 12311
		if (var1 == 324) { // L: 12312
			if (Client.field783 == -1) { // L: 12313
				Client.field783 = var0.spriteId2; // L: 12314
				Client.field784 = var0.spriteId; // L: 12315
			}

			if (Client.playerAppearance.field3563 == 1) { // L: 12317
				var0.spriteId2 = Client.field783;
			} else {
				var0.spriteId2 = Client.field784; // L: 12318
			}

		} else if (var1 == 325) { // L: 12321
			if (Client.field783 == -1) { // L: 12322
				Client.field783 = var0.spriteId2; // L: 12323
				Client.field784 = var0.spriteId; // L: 12324
			}

			if (Client.playerAppearance.field3563 == 1) { // L: 12326
				var0.spriteId2 = Client.field784;
			} else {
				var0.spriteId2 = Client.field783; // L: 12327
			}

		} else if (var1 == 327) { // L: 12330
			var0.modelAngleX = 150; // L: 12331
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 12332
			var0.modelType = 5; // L: 12333
			var0.modelId = 0; // L: 12334
		} else if (var1 == 328) { // L: 12337
			var0.modelAngleX = 150; // L: 12338
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 12339
			var0.modelType = 5; // L: 12340
			var0.modelId = 1; // L: 12341
		}
	} // L: 12319 12328 12335 12342 12344
}
