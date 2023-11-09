import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
public class class135 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lui;",
		garbageValue = "82"
	)
	static SpritePixels method3051(int var0, int var1, int var2) {
		DemotingHashTable var3 = WorldMapRegion.WorldMapRegion_cachedSprites; // L: 38
		long var4 = (long)(var2 << 16 | var0 << 8 | var1); // L: 41
		return (SpritePixels)var3.get(var4); // L: 43
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lmi;III)V",
		garbageValue = "-1092198621"
	)
	public static void method3052(Widget var0, int var1, int var2) {
		PlayerComposition var3 = var0.field3704; // L: 987
		boolean var4 = var2 != var3.field3572; // L: 988
		var3.field3572 = var2; // L: 989
		if (var4) { // L: 990
			int var5;
			int var6;
			if (var3.field3572 == var1) { // L: 991
				for (var5 = 0; var5 < PlayerComposition.equipmentIndices.length; ++var5) { // L: 992
					var6 = PlayerComposition.equipmentIndices[var5]; // L: 993
					if (var3.equipment[var6] > 0 && var3.equipment[var6] < 512) { // L: 994
						var3.equipment[var6] = var3.field3584[var6]; // L: 995
					}
				}
			} else {
				if (var3.equipment[0] < 512 || Actor.method2406(var3)) { // L: 1000
					var3.equipment[class209.field2339.field2334] = 1; // L: 1001
				}

				for (var5 = 0; var5 < 7; ++var5) { // L: 1003
					var6 = PlayerComposition.equipmentIndices[var5]; // L: 1004
					if (var3.equipment[var6] > 0 && var3.equipment[var6] < 512) { // L: 1005
						int[] var7 = var3.equipment; // L: 1006

						for (int var8 = 0; var8 < KitDefinition.field1980; ++var8) { // L: 1008
							KitDefinition var9 = ClanChannel.KitDefinition_get(var8); // L: 1009
							if (var9 != null && !var9.nonSelectable && var5 + (var2 == 1 ? 7 : 0) == var9.bodypartID) { // L: 1010
								var7[PlayerComposition.equipmentIndices[var5]] = var8 + 256; // L: 1011
								break; // L: 1012
							}
						}
					}
				}
			}
		}

		var3.method6072(); // L: 1020
	} // L: 1021

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1108375870"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[HealthBar.Client_plane][var0][var1]; // L: 8708
		if (var2 == null) { // L: 8709
			class130.scene.removeGroundItemPile(HealthBar.Client_plane, var0, var1); // L: 8710
		} else {
			long var3 = -99999999L; // L: 8713
			TileItem var5 = null; // L: 8714

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 8715 8716 8726
				ItemComposition var7 = InvDefinition.ItemComposition_get(var6.id); // L: 8717
				long var11 = (long)var7.price; // L: 8718
				if (var7.isStackable == 1) { // L: 8719
					var11 *= var6.quantity < Integer.MAX_VALUE ? (long)(var6.quantity + 1) : (long)var6.quantity; // L: 8720
				}

				if (var11 > var3) { // L: 8722
					var3 = var11; // L: 8723
					var5 = var6; // L: 8724
				}
			}

			if (var5 == null) { // L: 8728
				class130.scene.removeGroundItemPile(HealthBar.Client_plane, var0, var1); // L: 8729
			} else {
				var2.addLast(var5); // L: 8732
				TileItem var13 = null; // L: 8733
				TileItem var8 = null; // L: 8734

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 8735 8736 8741
					if (var6.id != var5.id) { // L: 8737
						if (var13 == null) { // L: 8738
							var13 = var6;
						}

						if (var6.id != var13.id && var8 == null) { // L: 8739
							var8 = var6;
						}
					}
				}

				long var9 = FontName.calculateTag(var0, var1, 3, false, 0); // L: 8743
				class130.scene.newGroundItemPile(HealthBar.Client_plane, var0, var1, class18.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, HealthBar.Client_plane), var5, var9, var13, var8); // L: 8744
			}
		}
	} // L: 8711 8730 8745

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "([Lmi;IIIIIIIII)V",
		garbageValue = "-1671360760"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10565
		Rasterizer3D.method4389(); // L: 10566

		for (int var9 = 0; var9 < var0.length; ++var9) { // L: 10567
			Widget var10 = var0[var9]; // L: 10568
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) { // L: 10569 10570
				int var11;
				if (var8 == -1) { // L: 10572
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6; // L: 10573
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y; // L: 10574
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width; // L: 10575
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height; // L: 10576
					var11 = ++Client.rootWidgetCount - 1; // L: 10577
				} else {
					var11 = var8; // L: 10579
				}

				var10.rootIndex = var11; // L: 10580
				var10.cycle = Client.cycle; // L: 10581
				if (!var10.isIf3 || !class143.isComponentHidden(var10)) { // L: 10582
					if (var10.contentType > 0) { // L: 10583
						StructComposition.method3843(var10);
					}

					int var12 = var10.x + var6; // L: 10584
					int var13 = var7 + var10.y; // L: 10585
					int var14 = var10.transparencyTop; // L: 10586
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) { // L: 10587
						if (var1 != -1412584499 && !var10.isScrollBar) { // L: 10588
							class162.field1797 = var0; // L: 10589
							class134.field1611 = var6; // L: 10590
							class326.field3559 = var7; // L: 10591
							continue; // L: 10592
						}

						if (Client.isDraggingWidget && Client.field715) { // L: 10594
							var15 = MouseHandler.MouseHandler_x; // L: 10595
							var16 = MouseHandler.MouseHandler_y; // L: 10596
							var15 -= Client.widgetClickX; // L: 10597
							var16 -= Client.widgetClickY; // L: 10598
							if (var15 < Client.field716) { // L: 10599
								var15 = Client.field716;
							}

							if (var15 + var10.width > Client.field716 + Client.clickedWidgetParent.width) { // L: 10600
								var15 = Client.field716 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field717) { // L: 10601
								var16 = Client.field717;
							}

							if (var16 + var10.height > Client.field717 + Client.clickedWidgetParent.height) { // L: 10602
								var16 = Client.field717 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15; // L: 10603
							var13 = var16; // L: 10604
						}

						if (!var10.isScrollBar) { // L: 10606
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 9) { // L: 10612
						var19 = var12; // L: 10613
						var20 = var13; // L: 10614
						var21 = var12 + var10.width; // L: 10615
						var22 = var13 + var10.height; // L: 10616
						if (var21 < var12) { // L: 10617
							var19 = var21; // L: 10619
							var21 = var12; // L: 10620
						}

						if (var22 < var13) { // L: 10622
							var20 = var22; // L: 10624
							var22 = var13; // L: 10625
						}

						++var21; // L: 10627
						++var22; // L: 10628
						var15 = var19 > var2 ? var19 : var2; // L: 10629
						var16 = var20 > var3 ? var20 : var3; // L: 10630
						var17 = var21 < var4 ? var21 : var4; // L: 10631
						var18 = var22 < var5 ? var22 : var5; // L: 10632
					} else {
						var19 = var12 + var10.width; // L: 10635
						var20 = var13 + var10.height; // L: 10636
						var15 = var12 > var2 ? var12 : var2; // L: 10637
						var16 = var13 > var3 ? var13 : var3; // L: 10638
						var17 = var19 < var4 ? var19 : var4; // L: 10639
						var18 = var20 < var5 ? var20 : var5; // L: 10640
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) { // L: 10642
						if (var10.contentType != 0) { // L: 10643
							if (var10.contentType == 1336) { // L: 10644
								if (class449.clientPreferences.method2463()) { // L: 10645
									var13 += 15; // L: 10646
									SecureRandomCallable.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1); // L: 10647
									var13 += 15; // L: 10648
									Runtime var41 = Runtime.getRuntime(); // L: 10649
									var20 = (int)((var41.totalMemory() - var41.freeMemory()) / 1024L); // L: 10650
									var21 = 16776960; // L: 10651
									if (var20 > 327680 && !Client.isLowDetail) { // L: 10652
										var21 = 16711680;
									}

									SecureRandomCallable.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1); // L: 10653
									var13 += 15; // L: 10654
								}
								continue;
							}

							if (var10.contentType == 1337) { // L: 10658
								Client.viewportX = var12; // L: 10659
								Client.viewportY = var13; // L: 10660
								class132.drawEntities(var12, var13, var10.width, var10.height); // L: 10661
								Client.field536[var10.rootIndex] = true; // L: 10662
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10663
								continue; // L: 10664
							}

							if (var10.contentType == 1338) { // L: 10666
								class6.drawMinimap(var10, var12, var13, var11); // L: 10667
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10668
								continue; // L: 10669
							}

							if (var10.contentType == 1339) { // L: 10671
								class11.drawCompass(var10, var12, var13, var11); // L: 10672
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10673
								continue; // L: 10674
							}

							if (var10.contentType == 1400) { // L: 10676
								Canvas.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle); // L: 10677
							}

							if (var10.contentType == 1401) { // L: 10679
								Canvas.worldMap.drawOverview(var12, var13, var10.width, var10.height); // L: 10680
							}

							if (var10.contentType == 1402) { // L: 10682
								class139.loginScreenRunesAnimation.draw(var12, Client.cycle); // L: 10683
							}
						}

						if (var10.type == 0) { // L: 10686
							if (!var10.isIf3 && class143.isComponentHidden(var10) && var10 != class146.mousedOverWidgetIf1) { // L: 10687
								continue;
							}

							if (!var10.isIf3) { // L: 10688
								if (var10.scrollY > var10.scrollHeight - var10.height) { // L: 10689
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) { // L: 10690
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11); // L: 10692
							if (var10.children != null) { // L: 10693
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var10.id); // L: 10694
							if (var28 != null) { // L: 10695
								class36.drawWidgets(var28.group, var15, var16, var17, var18, var12, var13, var11); // L: 10696
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10698
							Rasterizer3D.method4389(); // L: 10699
						} else if (var10.type == 11) { // L: 10701
							if (class143.isComponentHidden(var10) && var10 != class146.mousedOverWidgetIf1) { // L: 10702
								continue;
							}

							if (var10.children != null) { // L: 10703
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10704
							Rasterizer3D.method4389(); // L: 10705
						}

						if (Client.isResizable || Client.field750[var11] || Client.field755 > 1) { // L: 10707
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) { // L: 10708 10709
								class164.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) { // L: 10711
								if (var10.type == 3) { // L: 10714
									if (class27.runCs1(var10)) { // L: 10716
										var19 = var10.color2; // L: 10717
										if (var10 == class146.mousedOverWidgetIf1 && var10.field3719 != 0) { // L: 10718
											var19 = var10.field3719;
										}
									} else {
										var19 = var10.color; // L: 10721
										if (var10 == class146.mousedOverWidgetIf1 && var10.field3675 != 0) { // L: 10722
											var19 = var10.field3675;
										}
									}

									if (var10.fill) { // L: 10724
										switch(var10.fillMode.field5192) { // L: 10725
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2); // L: 10730
											break; // L: 10731
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255)); // L: 10727
											break; // L: 10728
										default:
											if (var14 == 0) { // L: 10733
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10734
											}
										}
									} else if (var14 == 0) { // L: 10739
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10740
									}
								} else if (var10.type == 4) { // L: 10744
									Font var40 = var10.getFont(); // L: 10745
									if (var40 == null) { // L: 10746
										if (Widget.field3644) { // L: 10747
											class218.invalidateWidget(var10);
										}
									} else {
										String var42 = var10.text; // L: 10751
										if (class27.runCs1(var10)) { // L: 10752
											var20 = var10.color2; // L: 10753
											if (var10 == class146.mousedOverWidgetIf1 && var10.field3719 != 0) { // L: 10754
												var20 = var10.field3719;
											}

											if (var10.field3626.length() > 0) { // L: 10755
												var42 = var10.field3626;
											}
										} else {
											var20 = var10.color; // L: 10758
											if (var10 == class146.mousedOverWidgetIf1 && var10.field3675 != 0) { // L: 10759
												var20 = var10.field3675;
											}
										}

										if (var10.isIf3 && var10.itemId != -1) { // L: 10761
											ItemComposition var43 = InvDefinition.ItemComposition_get(var10.itemId); // L: 10762
											var42 = var43.name; // L: 10763
											if (var42 == null) { // L: 10764
												var42 = "null";
											}

											if ((var43.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) { // L: 10765
												var42 = class217.colorStartTag(16748608) + var42 + "</col>" + " " + 'x' + WorldMapData_0.formatItemStacks(var10.itemQuantity);
											}
										}

										if (var10 == Client.meslayerContinueWidget) { // L: 10767
											var42 = "Please wait..."; // L: 10768
											var20 = var10.color; // L: 10769
										}

										if (!var10.isIf3) { // L: 10771
											var42 = WorldMapSectionType.method5444(var42, var10);
										}

										var40.method7436(var42, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, class466.method8365(var10.transparencyTop), var10.textXAlignment, var10.textYAlignment, var10.textLineHeight); // L: 10772
									}
								} else {
									int var23;
									int var24;
									int var25;
									if (var10.type == 5) { // L: 10775
										SpritePixels var38;
										if (!var10.isIf3) { // L: 10776
											var38 = var10.getSprite(class27.runCs1(var10), FriendsChatManager.urlRequester); // L: 10777
											if (var38 != null) { // L: 10778
												var38.drawTransBgAt(var12, var13);
											} else if (Widget.field3644) { // L: 10779
												class218.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) { // L: 10783
												var38 = class4.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var38 = var10.getSprite(false, FriendsChatManager.urlRequester); // L: 10784
											}

											if (var38 == null) { // L: 10785
												if (Widget.field3644) { // L: 10809
													class218.invalidateWidget(var10);
												}
											} else {
												var20 = var38.width; // L: 10786
												var21 = var38.height; // L: 10787
												if (!var10.spriteTiling) { // L: 10788
													var22 = var10.width * 4096 / var20; // L: 10802
													if (var10.spriteAngle != 0) { // L: 10803
														var38.method9521(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) { // L: 10804
														var38.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) { // L: 10805
														var38.drawTransBgAt(var12, var13); // L: 10806
													} else {
														var38.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height); // L: 10789
													var22 = (var20 - 1 + var10.width) / var20; // L: 10790
													var23 = (var21 - 1 + var10.height) / var21; // L: 10791

													for (var24 = 0; var24 < var22; ++var24) { // L: 10792
														for (var25 = 0; var25 < var23; ++var25) { // L: 10793
															if (var10.spriteAngle != 0) { // L: 10794
																var38.method9521(var20 / 2 + var12 + var20 * var24, var21 / 2 + var13 + var21 * var25, var10.spriteAngle, 4096);
															} else if (var14 != 0) { // L: 10795
																var38.drawTransAt(var12 + var20 * var24, var13 + var21 * var25, 256 - (var14 & 255));
															} else {
																var38.drawTransBgAt(var12 + var20 * var24, var13 + var21 * var25); // L: 10796
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10799
												}
											}
										}
									} else {
										int var26;
										if (var10.type == 6) { // L: 10813
											boolean var36 = class27.runCs1(var10); // L: 10814
											if (var36) { // L: 10816
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId; // L: 10817
											}

											Model var39 = null; // L: 10818
											var22 = 0; // L: 10819
											if (var10.itemId != -1) { // L: 10820
												ItemComposition var44 = InvDefinition.ItemComposition_get(var10.itemId); // L: 10821
												if (var44 != null) { // L: 10822
													var44 = var44.getCountObj(var10.itemQuantity); // L: 10823
													var39 = var44.getModel(1); // L: 10824
													if (var39 != null) { // L: 10825
														var39.calculateBoundsCylinder(); // L: 10826
														var22 = var39.height / 2; // L: 10827
													} else {
														class218.invalidateWidget(var10); // L: 10829
													}
												}
											} else if (var10.modelType == 5) { // L: 10832
												if (var10.modelId == 0) { // L: 10833
													var39 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var39 = VarbitComposition.localPlayer.getModel(); // L: 10834
												}
											} else if (var10.modelType == 7) { // L: 10836
												var39 = var10.field3704.getModel((SequenceDefinition)null, -1, EnumComposition.SequenceDefinition_get(VarbitComposition.localPlayer.idleSequence), VarbitComposition.localPlayer.movementFrame); // L: 10837
											} else {
												NPCComposition var45 = null; // L: 10840
												class194 var33 = null; // L: 10841
												if (var10.modelType == 6) { // L: 10842
													var25 = var10.modelId; // L: 10843
													if (var25 >= 0 && var25 < Client.npcs.length) { // L: 10844
														NPC var34 = Client.npcs[var25]; // L: 10845
														if (var34 != null) { // L: 10846
															var45 = var34.definition; // L: 10847
															var33 = var34.method2583(); // L: 10848
														}
													}
												}

												SequenceDefinition var35 = null; // L: 10852
												var26 = -1; // L: 10853
												if (var20 != -1) { // L: 10854
													var35 = EnumComposition.SequenceDefinition_get(var20); // L: 10855
													var26 = var10.modelFrame; // L: 10856
												}

												var39 = var10.method6394(var35, var26, var36, VarbitComposition.localPlayer.appearance, var45, var33); // L: 10858
												if (var39 == null && Widget.field3644) { // L: 10859
													class218.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method4449(var10.width / 2 + var12, var10.height / 2 + var13); // L: 10861
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10862
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10863
											if (var39 != null) { // L: 10864
												if (!var10.isIf3) { // L: 10865
													var39.method4785(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var39.calculateBoundsCylinder(); // L: 10867
													if (var10.modelOrthog) { // L: 10868
														var39.method4796(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var39.method4785(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY); // L: 10869
													}
												}
											}

											Rasterizer3D.method4391(); // L: 10872
										} else {
											Font var29;
											if (var10.type == 8 && var10 == class343.field3868 && Client.field690 == Client.field689) { // L: 10875 10876
												var19 = 0; // L: 10877
												var20 = 0; // L: 10878
												var29 = SecureRandomCallable.fontPlain12; // L: 10879
												String var30 = var10.text; // L: 10880

												String var31;
												for (var30 = WorldMapSectionType.method5444(var30, var10); var30.length() > 0; var20 = var20 + var29.ascent + 1) { // L: 10882 10883 10895
													var24 = var30.indexOf("<br>"); // L: 10884
													if (var24 != -1) { // L: 10885
														var31 = var30.substring(0, var24); // L: 10886
														var30 = var30.substring(var24 + 4); // L: 10887
													} else {
														var31 = var30; // L: 10890
														var30 = ""; // L: 10891
													}

													var25 = var29.stringWidth(var31); // L: 10893
													if (var25 > var19) { // L: 10894
														var19 = var25;
													}
												}

												var19 += 6; // L: 10897
												var20 += 7; // L: 10898
												var24 = var12 + var10.width - 5 - var19; // L: 10899
												var25 = var13 + var10.height + 5; // L: 10900
												if (var24 < var12 + 5) { // L: 10901
													var24 = var12 + 5;
												}

												if (var19 + var24 > var4) { // L: 10902
													var24 = var4 - var19;
												}

												if (var20 + var25 > var5) { // L: 10903
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120); // L: 10904
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0); // L: 10905
												var30 = var10.text; // L: 10906
												var26 = var25 + var29.ascent + 2; // L: 10907

												for (var30 = WorldMapSectionType.method5444(var30, var10); var30.length() > 0; var26 = var26 + var29.ascent + 1) { // L: 10908 10909 10920
													int var27 = var30.indexOf("<br>"); // L: 10910
													if (var27 != -1) { // L: 10911
														var31 = var30.substring(0, var27); // L: 10912
														var30 = var30.substring(var27 + 4); // L: 10913
													} else {
														var31 = var30; // L: 10916
														var30 = ""; // L: 10917
													}

													var29.draw(var31, var24 + 3, var26, 0, -1); // L: 10919
												}
											}

											if (var10.type == 9) { // L: 10924
												if (var10.field3680) { // L: 10929
													var19 = var12; // L: 10930
													var20 = var13 + var10.height; // L: 10931
													var21 = var12 + var10.width; // L: 10932
													var22 = var13; // L: 10933
												} else {
													var19 = var12; // L: 10936
													var20 = var13; // L: 10937
													var21 = var12 + var10.width; // L: 10938
													var22 = var13 + var10.height; // L: 10939
												}

												if (var10.lineWid == 1) { // L: 10941
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color); // L: 10942
												} else {
													Language.method6953(var19, var20, var21, var22, var10.color, var10.lineWid); // L: 10945
												}
											} else if (var10.type == 12) { // L: 10949
												class329 var37 = var10.method6532(); // L: 10950
												class324 var32 = var10.method6416(); // L: 10951
												if (var37 != null && var32 != null && var37.method6162()) { // L: 10952
													var29 = var10.getFont(); // L: 10953
													if (var29 != null) { // L: 10954
														Client.field740.method9669(var12, var13, var10.width, var10.height, var37.method6163(), var37.method6286(), var37.method6160(), var37.method6161(), var37.method6210()); // L: 10955
														var22 = var10.textShadowed ? var10.spriteShadow : -1; // L: 10956
														if (!var37.method6157() && var37.method6230().method7371()) { // L: 10957
															Client.field740.method9670(var32.field3549, var22, var32.field3547, var32.field3548); // L: 10958
															Client.field740.method9672(var37.method6155(), var29); // L: 10959
														} else {
															Client.field740.method9670(var10.color, var22, var32.field3547, var32.field3548); // L: 10962
															Client.field740.method9672(var37.method6230(), var29); // L: 10963
														}

														Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10965
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

	} // L: 10970
}
