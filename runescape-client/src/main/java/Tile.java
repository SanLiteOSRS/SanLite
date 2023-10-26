import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jh")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -426858433
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 577254467
	)
	@Export("x")
	int x;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1425720507
	)
	@Export("y")
	int y;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 193501399
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("wallObject")
	WallObject wallObject;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("decorativeObject")
	DecorativeObject decorativeObject;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("groundObject")
	GroundObject groundObject;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljc;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 695074411
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[Lkl;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("ap")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2101885247
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 751624075
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("aj")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("an")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("au")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1914560291
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 463473407
	)
	int field2545;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 678547447
	)
	int field2532;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1289761703
	)
	int field2547;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("linkedBelowTile")
	Tile linkedBelowTile;

	Tile(int var1, int var2, int var3) {
		this.gameObjects = new GameObject[5]; // L: 17
		this.gameObjectEdgeMasks = new int[5]; // L: 18
		this.gameObjectsEdgeMask = 0;
		this.originalPlane = this.plane = var1; // L: 31
		this.x = var2; // L: 32
		this.y = var3; // L: 33
	} // L: 34

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Ltr;",
		garbageValue = "1668422636"
	)
	public static class517 method4516(int var0) {
		int var1 = class515.field5063[var0]; // L: 19
		if (var1 == 1) { // L: 20
			return class517.field5067; // L: 21
		} else if (var1 == 2) { // L: 23
			return class517.field5065; // L: 24
		} else {
			return var1 == 3 ? class517.field5066 : null; // L: 26 27 29
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1270571298"
	)
	static void method4515() {
		ItemContainer.itemContainers = new NodeHashTable(32); // L: 78
	} // L: 79

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "([Lnm;IIIIIIIII)V",
		garbageValue = "-1800705740"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10643
		Rasterizer3D.method4535(); // L: 10644

		for (int var9 = 0; var9 < var0.length; ++var9) { // L: 10645
			Widget var10 = var0[var9]; // L: 10646
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) { // L: 10647 10648
				int var11;
				if (var8 == -1) { // L: 10650
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6; // L: 10651
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y; // L: 10652
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width; // L: 10653
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height; // L: 10654
					var11 = ++Client.rootWidgetCount - 1; // L: 10655
				} else {
					var11 = var8; // L: 10657
				}

				var10.rootIndex = var11; // L: 10658
				var10.cycle = Client.cycle; // L: 10659
				if (!var10.isIf3 || !CollisionMap.isComponentHidden(var10)) { // L: 10660
					if (var10.contentType > 0) { // L: 10661
						class6.method40(var10);
					}

					int var12 = var10.x + var6; // L: 10662
					int var13 = var7 + var10.y; // L: 10663
					int var14 = var10.transparencyTop; // L: 10664
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) { // L: 10665
						if (var1 != -1412584499 && !var10.isScrollBar) { // L: 10666
							class9.field35 = var0; // L: 10667
							GrandExchangeEvent.field4389 = var6; // L: 10668
							class10.field48 = var7; // L: 10669
							continue; // L: 10670
						}

						if (Client.isDraggingWidget && Client.field647) { // L: 10672
							var15 = MouseHandler.MouseHandler_x; // L: 10673
							var16 = MouseHandler.MouseHandler_y; // L: 10674
							var15 -= Client.widgetClickX; // L: 10675
							var16 -= Client.widgetClickY; // L: 10676
							if (var15 < Client.field750) { // L: 10677
								var15 = Client.field750;
							}

							if (var15 + var10.width > Client.field750 + Client.clickedWidgetParent.width) { // L: 10678
								var15 = Client.field750 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field748) { // L: 10679
								var16 = Client.field748;
							}

							if (var16 + var10.height > Client.field748 + Client.clickedWidgetParent.height) { // L: 10680
								var16 = Client.field748 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15; // L: 10681
							var13 = var16; // L: 10682
						}

						if (!var10.isScrollBar) { // L: 10684
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 9) { // L: 10690
						var19 = var12; // L: 10691
						var20 = var13; // L: 10692
						var21 = var12 + var10.width; // L: 10693
						var22 = var13 + var10.height; // L: 10694
						if (var21 < var12) { // L: 10695
							var19 = var21; // L: 10697
							var21 = var12; // L: 10698
						}

						if (var22 < var13) { // L: 10700
							var20 = var22; // L: 10702
							var22 = var13; // L: 10703
						}

						++var21; // L: 10705
						++var22; // L: 10706
						var15 = var19 > var2 ? var19 : var2; // L: 10707
						var16 = var20 > var3 ? var20 : var3; // L: 10708
						var17 = var21 < var4 ? var21 : var4; // L: 10709
						var18 = var22 < var5 ? var22 : var5; // L: 10710
					} else {
						var19 = var12 + var10.width; // L: 10713
						var20 = var13 + var10.height; // L: 10714
						var15 = var12 > var2 ? var12 : var2; // L: 10715
						var16 = var13 > var3 ? var13 : var3; // L: 10716
						var17 = var19 < var4 ? var19 : var4; // L: 10717
						var18 = var20 < var5 ? var20 : var5; // L: 10718
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) { // L: 10720
						if (var10.contentType != 0) { // L: 10721
							if (var10.contentType == 1336) { // L: 10722
								if (class91.clientPreferences.method2523()) { // L: 10723
									var13 += 15; // L: 10724
									UserComparator6.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1); // L: 10725
									var13 += 15; // L: 10726
									Runtime var41 = Runtime.getRuntime(); // L: 10727
									var20 = (int)((var41.totalMemory() - var41.freeMemory()) / 1024L); // L: 10728
									var21 = 16776960; // L: 10729
									if (var20 > 327680 && !Client.isLowDetail) { // L: 10730
										var21 = 16711680;
									}

									UserComparator6.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1); // L: 10731
									var13 += 15; // L: 10732
								}
								continue;
							}

							if (var10.contentType == 1337) { // L: 10736
								Client.viewportX = var12; // L: 10737
								Client.viewportY = var13; // L: 10738
								class432.drawEntities(var12, var13, var10.width, var10.height); // L: 10739
								Client.field739[var10.rootIndex] = true; // L: 10740
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10741
								continue; // L: 10742
							}

							if (var10.contentType == 1338) { // L: 10744
								class436.drawMinimap(var10, var12, var13, var11); // L: 10745
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10746
								continue; // L: 10747
							}

							if (var10.contentType == 1339) { // L: 10749
								class127.method2946(var10, var12, var13, var11); // L: 10750
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10751
								continue; // L: 10752
							}

							if (var10.contentType == 1400) { // L: 10754
								class434.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle); // L: 10755
							}

							if (var10.contentType == 1401) { // L: 10757
								class434.worldMap.drawOverview(var12, var13, var10.width, var10.height); // L: 10758
							}

							if (var10.contentType == 1402) { // L: 10760
								class544.loginScreenRunesAnimation.draw(var12, Client.cycle); // L: 10761
							}
						}

						if (var10.type == 0) { // L: 10764
							if (!var10.isIf3 && CollisionMap.isComponentHidden(var10) && var10 != class64.mousedOverWidgetIf1) { // L: 10765
								continue;
							}

							if (!var10.isIf3) { // L: 10766
								if (var10.scrollY > var10.scrollHeight - var10.height) { // L: 10767
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) { // L: 10768
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11); // L: 10770
							if (var10.children != null) { // L: 10771
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var10.id); // L: 10772
							if (var28 != null) { // L: 10773
								class410.method7604(var28.group, var15, var16, var17, var18, var12, var13, var11); // L: 10774
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10776
							Rasterizer3D.method4535(); // L: 10777
						} else if (var10.type == 11) { // L: 10779
							if (CollisionMap.isComponentHidden(var10) && var10 != class64.mousedOverWidgetIf1) { // L: 10780
								continue;
							}

							if (var10.children != null) { // L: 10781
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10782
							Rasterizer3D.method4535(); // L: 10783
						}

						if (Client.isResizable || Client.field677[var11] || Client.field719 > 1) { // L: 10785
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) { // L: 10786 10787
								class223.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) { // L: 10789
								if (var10.type == 3) { // L: 10792
									if (UserComparator9.runCs1(var10)) { // L: 10794
										var19 = var10.color2; // L: 10795
										if (var10 == class64.mousedOverWidgetIf1 && var10.field3704 != 0) { // L: 10796
											var19 = var10.field3704;
										}
									} else {
										var19 = var10.color; // L: 10799
										if (var10 == class64.mousedOverWidgetIf1 && var10.field3805 != 0) { // L: 10800
											var19 = var10.field3805;
										}
									}

									if (var10.fill) { // L: 10802
										switch(var10.fillMode.field5223) { // L: 10803
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2); // L: 10808
											break; // L: 10809
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255)); // L: 10805
											break; // L: 10806
										default:
											if (var14 == 0) { // L: 10811
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10812
											}
										}
									} else if (var14 == 0) { // L: 10817
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10818
									}
								} else if (var10.type == 4) { // L: 10822
									Font var40 = var10.method6592(class33.field184); // L: 10823
									if (var40 == null) { // L: 10824
										if (Widget.field3666) { // L: 10825
											ClanChannelMember.invalidateWidget(var10);
										}
									} else {
										String var42 = var10.text; // L: 10829
										if (UserComparator9.runCs1(var10)) { // L: 10830
											var20 = var10.color2; // L: 10831
											if (var10 == class64.mousedOverWidgetIf1 && var10.field3704 != 0) { // L: 10832
												var20 = var10.field3704;
											}

											if (var10.field3810.length() > 0) { // L: 10833
												var42 = var10.field3810;
											}
										} else {
											var20 = var10.color; // L: 10836
											if (var10 == class64.mousedOverWidgetIf1 && var10.field3805 != 0) { // L: 10837
												var20 = var10.field3805;
											}
										}

										if (var10.isIf3 && var10.itemId != -1) { // L: 10839
											ItemComposition var43 = class214.ItemComposition_get(var10.itemId); // L: 10840
											var42 = var43.name; // L: 10841
											if (var42 == null) { // L: 10842
												var42 = "null";
											}

											if ((var43.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) { // L: 10843
												var42 = Client.colorStartTag(16748608) + var42 + "</col>" + " " + 'x' + class174.formatItemStacks(var10.itemQuantity);
											}
										}

										if (var10 == Client.meslayerContinueWidget) { // L: 10845
											var42 = "Please wait..."; // L: 10846
											var20 = var10.color; // L: 10847
										}

										if (!var10.isIf3) { // L: 10849
											var42 = class463.method8315(var42, var10);
										}

										var40.method7625(var42, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, class481.method8532(var10.transparencyTop), var10.textXAlignment, var10.textYAlignment, var10.textLineHeight); // L: 10850
									}
								} else {
									int var23;
									int var24;
									int var25;
									if (var10.type == 5) { // L: 10853
										SpritePixels var38;
										if (!var10.isIf3) { // L: 10854
											var38 = var10.method6587(class33.field184, UserComparator9.runCs1(var10), AbstractWorldMapIcon.urlRequester); // L: 10855
											if (var38 != null) { // L: 10856
												var38.drawTransBgAt(var12, var13);
											} else if (Widget.field3666) { // L: 10857
												ClanChannelMember.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) { // L: 10861
												var38 = class158.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var38 = var10.method6587(class33.field184, false, AbstractWorldMapIcon.urlRequester); // L: 10862
											}

											if (var38 == null) { // L: 10863
												if (Widget.field3666) { // L: 10887
													ClanChannelMember.invalidateWidget(var10);
												}
											} else {
												var20 = var38.width; // L: 10864
												var21 = var38.height; // L: 10865
												if (!var10.spriteTiling) { // L: 10866
													var22 = var10.width * 4096 / var20; // L: 10880
													if (var10.spriteAngle != 0) { // L: 10881
														var38.method9700(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) { // L: 10882
														var38.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) { // L: 10883
														var38.drawTransBgAt(var12, var13); // L: 10884
													} else {
														var38.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height); // L: 10867
													var22 = (var20 - 1 + var10.width) / var20; // L: 10868
													var23 = (var21 - 1 + var10.height) / var21; // L: 10869

													for (var24 = 0; var24 < var22; ++var24) { // L: 10870
														for (var25 = 0; var25 < var23; ++var25) { // L: 10871
															if (var10.spriteAngle != 0) { // L: 10872
																var38.method9700(var20 / 2 + var12 + var20 * var24, var21 / 2 + var13 + var21 * var25, var10.spriteAngle, 4096);
															} else if (var14 != 0) { // L: 10873
																var38.drawTransAt(var12 + var24 * var20, var13 + var21 * var25, 256 - (var14 & 255));
															} else {
																var38.drawTransBgAt(var12 + var20 * var24, var13 + var25 * var21); // L: 10874
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10877
												}
											}
										}
									} else {
										int var26;
										if (var10.type == 6) { // L: 10891
											boolean var36 = UserComparator9.runCs1(var10); // L: 10892
											if (var36) { // L: 10894
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId; // L: 10895
											}

											Model var39 = null; // L: 10896
											var22 = 0; // L: 10897
											if (var10.itemId != -1) { // L: 10898
												ItemComposition var44 = class214.ItemComposition_get(var10.itemId); // L: 10899
												if (var44 != null) { // L: 10900
													var44 = var44.getCountObj(var10.itemQuantity); // L: 10901
													var39 = var44.getModel(1); // L: 10902
													if (var39 != null) { // L: 10903
														var39.calculateBoundsCylinder(); // L: 10904
														var22 = var39.height / 2; // L: 10905
													} else {
														ClanChannelMember.invalidateWidget(var10); // L: 10907
													}
												}
											} else if (var10.modelType == 5) { // L: 10910
												if (var10.modelId == 0) { // L: 10911
													var39 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var39 = TextureProvider.localPlayer.getModel(); // L: 10912
												}
											} else if (var10.modelType == 7) { // L: 10914
												var39 = var10.field3734.getModel((SequenceDefinition)null, -1, class36.SequenceDefinition_get(TextureProvider.localPlayer.idleSequence), TextureProvider.localPlayer.movementFrame); // L: 10915
											} else {
												NPCComposition var45 = null; // L: 10918
												class204 var33 = null; // L: 10919
												if (var10.modelType == 6) { // L: 10920
													var25 = var10.modelId; // L: 10921
													if (var25 >= 0 && var25 < Client.npcs.length) { // L: 10922
														NPC var34 = Client.npcs[var25]; // L: 10923
														if (var34 != null) { // L: 10924
															var45 = var34.definition; // L: 10925
															var33 = var34.method2646(); // L: 10926
														}
													}
												}

												SequenceDefinition var35 = null; // L: 10930
												var26 = -1; // L: 10931
												if (var20 != -1) { // L: 10932
													var35 = class36.SequenceDefinition_get(var20); // L: 10933
													var26 = var10.modelFrame; // L: 10934
												}

												var39 = var10.method6626(class33.field184, var35, var26, var36, TextureProvider.localPlayer.appearance, var45, var33); // L: 10936
												if (var39 == null && Widget.field3666) { // L: 10937
													ClanChannelMember.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method4534(var10.width / 2 + var12, var10.height / 2 + var13); // L: 10939
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10940
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10941
											if (var39 != null) { // L: 10942
												if (!var10.isIf3) { // L: 10943
													var39.method4933(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var39.calculateBoundsCylinder(); // L: 10945
													if (var10.modelOrthog) { // L: 10946
														var39.method4928(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var39.method4933(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY); // L: 10947
													}
												}
											}

											Rasterizer3D.method4533(); // L: 10950
										} else {
											Font var29;
											if (var10.type == 8 && var10 == GrandExchangeOfferNameComparator.field4374 && Client.field530 == Client.field788) { // L: 10953 10954
												var19 = 0; // L: 10955
												var20 = 0; // L: 10956
												var29 = UserComparator6.fontPlain12; // L: 10957
												String var30 = var10.text; // L: 10958

												String var31;
												for (var30 = class463.method8315(var30, var10); var30.length() > 0; var20 = var20 + var29.ascent + 1) { // L: 10960 10961 10973
													var24 = var30.indexOf("<br>"); // L: 10962
													if (var24 != -1) { // L: 10963
														var31 = var30.substring(0, var24); // L: 10964
														var30 = var30.substring(var24 + 4); // L: 10965
													} else {
														var31 = var30; // L: 10968
														var30 = ""; // L: 10969
													}

													var25 = var29.stringWidth(var31); // L: 10971
													if (var25 > var19) { // L: 10972
														var19 = var25;
													}
												}

												var19 += 6; // L: 10975
												var20 += 7; // L: 10976
												var24 = var12 + var10.width - 5 - var19; // L: 10977
												var25 = var13 + var10.height + 5; // L: 10978
												if (var24 < var12 + 5) { // L: 10979
													var24 = var12 + 5;
												}

												if (var24 + var19 > var4) { // L: 10980
													var24 = var4 - var19;
												}

												if (var25 + var20 > var5) { // L: 10981
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120); // L: 10982
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0); // L: 10983
												var30 = var10.text; // L: 10984
												var26 = var25 + var29.ascent + 2; // L: 10985

												for (var30 = class463.method8315(var30, var10); var30.length() > 0; var26 = var26 + var29.ascent + 1) { // L: 10986 10987 10998
													int var27 = var30.indexOf("<br>"); // L: 10988
													if (var27 != -1) { // L: 10989
														var31 = var30.substring(0, var27); // L: 10990
														var30 = var30.substring(var27 + 4); // L: 10991
													} else {
														var31 = var30; // L: 10994
														var30 = ""; // L: 10995
													}

													var29.draw(var31, var24 + 3, var26, 0, -1); // L: 10997
												}
											}

											if (var10.type == 9) { // L: 11002
												if (var10.field3700) { // L: 11007
													var19 = var12; // L: 11008
													var20 = var13 + var10.height; // L: 11009
													var21 = var12 + var10.width; // L: 11010
													var22 = var13; // L: 11011
												} else {
													var19 = var12; // L: 11014
													var20 = var13; // L: 11015
													var21 = var12 + var10.width; // L: 11016
													var22 = var13 + var10.height; // L: 11017
												}

												if (var10.lineWid == 1) { // L: 11019
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color); // L: 11020
												} else {
													JagexCache.method3521(var19, var20, var21, var22, var10.color, var10.lineWid); // L: 11023
												}
											} else if (var10.type == 12) { // L: 11027
												class344 var37 = var10.method6614(); // L: 11028
												class339 var32 = var10.method6615(); // L: 11029
												if (var37 != null && var32 != null && var37.method6360()) { // L: 11030
													var29 = var10.method6592(class33.field184); // L: 11031
													if (var29 != null) { // L: 11032
														Client.field785.method9826(var12, var13, var10.width, var10.height, var37.method6361(), var37.method6362(), var37.method6358(), var37.method6359(), var37.method6357()); // L: 11033
														var22 = var10.textShadowed ? var10.spriteShadow : -1; // L: 11034
														if (!var37.method6355() && var37.method6532().method7477()) { // L: 11035
															Client.field785.method9830(var32.field3593, var22, var32.field3591, var32.field3592); // L: 11036
															Client.field785.method9827(var37.method6353(), var29); // L: 11037
														} else {
															Client.field785.method9830(var10.color, var22, var32.field3591, var32.field3592); // L: 11040
															Client.field785.method9827(var37.method6532(), var29); // L: 11041
														}

														Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 11043
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

	} // L: 11048

	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1817325777"
	)
	static void method4513() {
		class91.clientPreferences.method2522(Client.field717); // L: 12872
	} // L: 12873
}
