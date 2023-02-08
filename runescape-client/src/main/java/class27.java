import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
public class class27 {
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("archive20")
	static Archive archive20;
	@ObfuscatedName("pw")
	@ObfuscatedGetter(
		intValue = 1959084887
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("i")
	int[] field162;
	@ObfuscatedName("n")
	int[] field161;

	public class27() {
		this.field162 = new int[112]; // L: 12
		this.field161 = new int[192]; // L: 13
		Arrays.fill(this.field162, 3); // L: 16
		Arrays.fill(this.field161, 3); // L: 17
	} // L: 18

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1922919708"
	)
	public void method391(int var1, int var2) {
		if (this.method399(var1) && this.method401(var2)) { // L: 21
			this.field162[var1] = var2; // L: 22
		}

	} // L: 24

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(CII)V",
		garbageValue = "2116821772"
	)
	public void method417(char var1, int var2) {
		if (this.method423(var1) && this.method401(var2)) { // L: 27
			this.field161[var1] = var2; // L: 28
		}

	} // L: 30

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "969220450"
	)
	public int method393(int var1) {
		return this.method399(var1) ? this.field162[var1] : 0; // L: 33 34 36
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(CI)I",
		garbageValue = "2077314756"
	)
	public int method394(char var1) {
		return this.method423(var1) ? this.field161[var1] : 0; // L: 40 41 43
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "100"
	)
	public boolean method416(int var1) {
		return this.method399(var1) && (this.field162[var1] == 1 || this.field162[var1] == 3); // L: 47
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(CS)Z",
		garbageValue = "-12278"
	)
	public boolean method396(char var1) {
		return this.method423(var1) && (this.field161[var1] == 1 || this.field161[var1] == 3); // L: 51
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1145062404"
	)
	public boolean method411(int var1) {
		return this.method399(var1) && (this.field162[var1] == 2 || this.field162[var1] == 3); // L: 55
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "25"
	)
	public boolean method398(char var1) {
		return this.method423(var1) && (this.field161[var1] == 2 || this.field161[var1] == 3); // L: 59
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1719071766"
	)
	boolean method399(int var1) {
		if (var1 >= 0 && var1 < 112) { // L: 63
			return true; // L: 67
		} else {
			System.out.println("Invalid keycode: " + var1); // L: 64
			return false; // L: 65
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "2"
	)
	boolean method423(char var1) {
		if (var1 >= 0 && var1 < 192) { // L: 71
			return true; // L: 75
		} else {
			System.out.println("Invalid keychar: " + var1); // L: 72
			return false; // L: 73
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1586560827"
	)
	boolean method401(int var1) {
		if (var1 >= 0 && var1 < 4) { // L: 79
			return true; // L: 83
		} else {
			System.out.println("Invalid mode: " + var1); // L: 80
			return false; // L: 81
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)[Ljs;",
		garbageValue = "-94"
	)
	public static class280[] method424() {
		return new class280[]{class280.field3179, class280.field3172, class280.field3173, class280.field3174, class280.field3175, class280.field3178, class280.field3176, class280.field3171, class280.field3183, class280.field3180, class280.field3181, class280.field3182, class280.field3177}; // L: 20
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "([Lkz;IIIIIIIIB)V",
		garbageValue = "101"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10846
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 10847

		for (int var9 = 0; var9 < var0.length; ++var9) { // L: 10848
			Widget var10 = var0[var9]; // L: 10849
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) { // L: 10850 10851
				int var11;
				if (var8 == -1) { // L: 10853
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6; // L: 10854
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y; // L: 10855
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width; // L: 10856
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height; // L: 10857
					var11 = ++Client.rootWidgetCount - 1; // L: 10858
				} else {
					var11 = var8; // L: 10860
				}

				var10.rootIndex = var11; // L: 10861
				var10.cycle = Client.cycle; // L: 10862
				if (!var10.isIf3 || !class160.isComponentHidden(var10)) { // L: 10863
					if (var10.contentType > 0) { // L: 10864
						class468.method8572(var10);
					}

					int var12 = var10.x + var6; // L: 10865
					int var13 = var7 + var10.y; // L: 10866
					int var14 = var10.transparencyTop; // L: 10867
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) { // L: 10868
						if (var1 != -1412584499 && !var10.isScrollBar) { // L: 10869
							MouseHandler.field262 = var0; // L: 10870
							class288.field3342 = var6; // L: 10871
							class366.field4370 = var7; // L: 10872
							continue; // L: 10873
						}

						if (Client.isDraggingWidget && Client.field692) { // L: 10875
							var15 = MouseHandler.MouseHandler_x; // L: 10876
							var16 = MouseHandler.MouseHandler_y; // L: 10877
							var15 -= Client.widgetClickX; // L: 10878
							var16 -= Client.widgetClickY; // L: 10879
							if (var15 < Client.field795) { // L: 10880
								var15 = Client.field795;
							}

							if (var15 + var10.width > Client.field795 + Client.clickedWidgetParent.width) { // L: 10881
								var15 = Client.field795 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field803) { // L: 10882
								var16 = Client.field803;
							}

							if (var16 + var10.height > Client.field803 + Client.clickedWidgetParent.height) { // L: 10883
								var16 = Client.field803 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15; // L: 10884
							var13 = var16; // L: 10885
						}

						if (!var10.isScrollBar) { // L: 10887
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 2) { // L: 10893
						var15 = var2; // L: 10894
						var16 = var3; // L: 10895
						var17 = var4; // L: 10896
						var18 = var5; // L: 10897
					} else if (var10.type == 9) { // L: 10899
						var19 = var12; // L: 10900
						var20 = var13; // L: 10901
						var21 = var12 + var10.width; // L: 10902
						var22 = var13 + var10.height; // L: 10903
						if (var21 < var12) { // L: 10904
							var19 = var21; // L: 10906
							var21 = var12; // L: 10907
						}

						if (var22 < var13) { // L: 10909
							var20 = var22; // L: 10911
							var22 = var13; // L: 10912
						}

						++var21; // L: 10914
						++var22; // L: 10915
						var15 = var19 > var2 ? var19 : var2; // L: 10916
						var16 = var20 > var3 ? var20 : var3; // L: 10917
						var17 = var21 < var4 ? var21 : var4; // L: 10918
						var18 = var22 < var5 ? var22 : var5; // L: 10919
					} else {
						var19 = var12 + var10.width; // L: 10922
						var20 = var13 + var10.height; // L: 10923
						var15 = var12 > var2 ? var12 : var2; // L: 10924
						var16 = var13 > var3 ? var13 : var3; // L: 10925
						var17 = var19 < var4 ? var19 : var4; // L: 10926
						var18 = var20 < var5 ? var20 : var5; // L: 10927
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) { // L: 10929
						if (var10.contentType != 0) { // L: 10930
							if (var10.contentType == 1336) { // L: 10931
								if (PacketWriter.clientPreferences.method2489()) { // L: 10932
									var13 += 15; // L: 10933
									MenuAction.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1); // L: 10934
									var13 += 15; // L: 10935
									Runtime var46 = Runtime.getRuntime(); // L: 10936
									var20 = (int)((var46.totalMemory() - var46.freeMemory()) / 1024L); // L: 10937
									var21 = 16776960; // L: 10938
									if (var20 > 327680 && !Client.isLowDetail) { // L: 10939
										var21 = 16711680;
									}

									MenuAction.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1); // L: 10940
									var13 += 15; // L: 10941
								}
								continue;
							}

							if (var10.contentType == 1337) { // L: 10945
								Client.viewportX = var12; // L: 10946
								Client.viewportY = var13; // L: 10947
								VarpDefinition.drawEntities(var12, var13, var10.width, var10.height); // L: 10948
								Client.field725[var10.rootIndex] = true; // L: 10949
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10950
								continue; // L: 10951
							}

							if (var10.contentType == 1338) { // L: 10953
								WorldMapSectionType.drawMinimap(var10, var12, var13, var11); // L: 10954
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10955
								continue; // L: 10956
							}

							if (var10.contentType == 1339) { // L: 10958
								CollisionMap.drawCompass(var10, var12, var13, var11); // L: 10959
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10960
								continue; // L: 10961
							}

							if (var10.contentType == 1400) { // L: 10963
								GrandExchangeOfferUnitPriceComparator.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle); // L: 10964
							}

							if (var10.contentType == 1401) { // L: 10966
								GrandExchangeOfferUnitPriceComparator.worldMap.drawOverview(var12, var13, var10.width, var10.height); // L: 10967
							}

							if (var10.contentType == 1402) { // L: 10969
								class305.loginScreenRunesAnimation.draw(var12, Client.cycle); // L: 10970
							}
						}

						if (var10.type == 0) { // L: 10973
							if (!var10.isIf3 && class160.isComponentHidden(var10) && var10 != class25.mousedOverWidgetIf1) { // L: 10974
								continue;
							}

							if (!var10.isIf3) { // L: 10975
								if (var10.scrollY > var10.scrollHeight - var10.height) { // L: 10976
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) { // L: 10977
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11); // L: 10979
							if (var10.children != null) { // L: 10980
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)var10.id); // L: 10981
							if (var30 != null) { // L: 10982
								class97.drawWidgets(var30.group, var15, var16, var17, var18, var12, var13, var11); // L: 10983
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10985
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 10986
						} else if (var10.type == 11) { // L: 10988
							if (class160.isComponentHidden(var10) && var10 != class25.mousedOverWidgetIf1) { // L: 10989
								continue;
							}

							if (var10.children != null) { // L: 10990
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10991
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 10992
						}

						if (Client.isResizable || Client.field560[var11] || Client.gameDrawingMode > 1) { // L: 10994
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) { // L: 10995 10996
								ParamComposition.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) { // L: 10998
								int var23;
								int var24;
								int var25;
								int var26;
								if (var10.type == 2) { // L: 11001
									var19 = 0; // L: 11002

									for (var20 = 0; var20 < var10.rawHeight; ++var20) { // L: 11003
										for (var21 = 0; var21 < var10.rawWidth; ++var21) { // L: 11004
											var22 = var12 + var21 * (var10.paddingX + 32); // L: 11005
											var23 = var13 + var20 * (var10.paddingY + 32); // L: 11006
											if (var19 < 20) { // L: 11007
												var22 += var10.inventoryXOffsets[var19]; // L: 11008
												var23 += var10.inventoryYOffsets[var19]; // L: 11009
											}

											if (var10.itemIds[var19] <= 0) { // L: 11011
												if (var10.inventorySprites != null && var19 < 20) { // L: 11056
													SpritePixels var52 = var10.getInventorySprite(var19); // L: 11057
													if (var52 != null) { // L: 11058
														var52.drawTransBgAt(var22, var23);
													} else if (Widget.field3579) { // L: 11059
														LoginScreenAnimation.invalidateWidget(var10);
													}
												}
											} else {
												boolean var40 = false; // L: 11012
												boolean var41 = false; // L: 11013
												var26 = var10.itemIds[var19] - 1; // L: 11014
												if (var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == WorldMapLabelSize.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 11015
													SpritePixels var38;
													if (Client.isItemSelected == 1 && var19 == WorldMapIcon_0.selectedItemSlot && var10.id == WorldMapLabel.selectedItemWidget) { // L: 11017
														var38 = TextureProvider.getItemSprite(var26, var10.itemQuantities[var19], 2, 0, 2, false);
													} else {
														var38 = TextureProvider.getItemSprite(var26, var10.itemQuantities[var19], 1, 3153952, 2, false); // L: 11018
													}

													if (var38 != null) { // L: 11019
														if (var10 == WorldMapLabelSize.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 11020
															var24 = MouseHandler.MouseHandler_x - Client.draggedWidgetX; // L: 11021
															var25 = MouseHandler.MouseHandler_y - Client.draggedWidgetY; // L: 11022
															if (var24 < 5 && var24 > -5) { // L: 11023
																var24 = 0;
															}

															if (var25 < 5 && var25 > -5) { // L: 11024
																var25 = 0;
															}

															if (Client.itemDragDuration < 5) { // L: 11025
																var24 = 0; // L: 11026
																var25 = 0; // L: 11027
															}

															var38.drawTransAt(var24 + var22, var25 + var23, 128); // L: 11029
															if (var1 != -1) { // L: 11030
																Widget var28 = var0[var1 & 65535]; // L: 11031
																int var29;
																if (var23 + var25 < Rasterizer2D.Rasterizer2D_yClipStart && var28.scrollY > 0) { // L: 11032
																	var29 = (Rasterizer2D.Rasterizer2D_yClipStart - var23 - var25) * Client.field574 / 3; // L: 11033
																	if (var29 > Client.field574 * 10) { // L: 11034
																		var29 = Client.field574 * 10;
																	}

																	if (var29 > var28.scrollY) { // L: 11035
																		var29 = var28.scrollY;
																	}

																	var28.scrollY -= var29; // L: 11036
																	Client.draggedWidgetY += var29; // L: 11037
																	LoginScreenAnimation.invalidateWidget(var28); // L: 11038
																}

																if (var23 + var25 + 32 > Rasterizer2D.Rasterizer2D_yClipEnd && var28.scrollY < var28.scrollHeight - var28.height) { // L: 11040
																	var29 = (var23 + var25 + 32 - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.field574 / 3; // L: 11041
																	if (var29 > Client.field574 * 10) { // L: 11042
																		var29 = Client.field574 * 10;
																	}

																	if (var29 > var28.scrollHeight - var28.height - var28.scrollY) { // L: 11043
																		var29 = var28.scrollHeight - var28.height - var28.scrollY;
																	}

																	var28.scrollY += var29; // L: 11044
																	Client.draggedWidgetY -= var29; // L: 11045
																	LoginScreenAnimation.invalidateWidget(var28); // L: 11046
																}
															}
														} else if (var10 == class378.field4437 && var19 == Client.field619) { // L: 11050
															var38.drawTransAt(var22, var23, 128);
														} else {
															var38.drawTransBgAt(var22, var23); // L: 11051
														}
													} else {
														LoginScreenAnimation.invalidateWidget(var10); // L: 11053
													}
												}
											}

											++var19; // L: 11061
										}
									}
								} else if (var10.type == 3) { // L: 11066
									if (UserComparator5.runCs1(var10)) { // L: 11068
										var19 = var10.color2; // L: 11069
										if (var10 == class25.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 11070
											var19 = var10.mouseOverColor2;
										}
									} else {
										var19 = var10.color; // L: 11073
										if (var10 == class25.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 11074
											var19 = var10.mouseOverColor;
										}
									}

									if (var10.fill) { // L: 11076
										switch(var10.fillMode.field5015) { // L: 11077
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2); // L: 11079
											break; // L: 11080
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255)); // L: 11086
											break; // L: 11087
										default:
											if (var14 == 0) { // L: 11082
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 11083
											}
										}
									} else if (var14 == 0) { // L: 11091
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 11092
									}
								} else {
									Font var42;
									if (var10.type == 4) { // L: 11096
										var42 = var10.getFont(); // L: 11097
										if (var42 == null) { // L: 11098
											if (Widget.field3579) { // L: 11099
												LoginScreenAnimation.invalidateWidget(var10);
											}
										} else {
											String var48 = var10.text; // L: 11103
											if (UserComparator5.runCs1(var10)) { // L: 11104
												var20 = var10.color2; // L: 11105
												if (var10 == class25.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 11106
													var20 = var10.mouseOverColor2;
												}

												if (var10.text2.length() > 0) { // L: 11107
													var48 = var10.text2;
												}
											} else {
												var20 = var10.color; // L: 11110
												if (var10 == class25.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 11111
													var20 = var10.mouseOverColor;
												}
											}

											if (var10.isIf3 && var10.itemId != -1) { // L: 11113
												ItemComposition var49 = TileItem.ItemComposition_get(var10.itemId); // L: 11114
												var48 = var49.name; // L: 11115
												if (var48 == null) { // L: 11116
													var48 = "null";
												}

												if ((var49.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) { // L: 11117
													var48 = class149.colorStartTag(16748608) + var48 + "</col>" + " " + 'x' + WorldMapCacheName.formatItemStacks(var10.itemQuantity);
												}
											}

											if (var10 == Client.meslayerContinueWidget) { // L: 11119
												var48 = "Please wait..."; // L: 11120
												var20 = var10.color; // L: 11121
											}

											if (!var10.isIf3) { // L: 11123
												var48 = GroundObject.method4312(var48, var10);
											}

											var42.drawLines(var48, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight); // L: 11124
										}
									} else if (var10.type == 5) { // L: 11127
										SpritePixels var44;
										if (!var10.isIf3) { // L: 11128
											var44 = var10.getSprite(UserComparator5.runCs1(var10), class245.urlRequester); // L: 11129
											if (var44 != null) { // L: 11130
												var44.drawTransBgAt(var12, var13);
											} else if (Widget.field3579) { // L: 11131
												LoginScreenAnimation.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) { // L: 11135
												var44 = TextureProvider.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var44 = var10.getSprite(false, class245.urlRequester); // L: 11136
											}

											if (var44 == null) { // L: 11137
												if (Widget.field3579) { // L: 11161
													LoginScreenAnimation.invalidateWidget(var10);
												}
											} else {
												var20 = var44.width; // L: 11138
												var21 = var44.height; // L: 11139
												if (!var10.spriteTiling) { // L: 11140
													var22 = var10.width * 4096 / var20; // L: 11154
													if (var10.spriteAngle != 0) { // L: 11155
														var44.method9135(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) { // L: 11156
														var44.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) { // L: 11157
														var44.drawTransBgAt(var12, var13); // L: 11158
													} else {
														var44.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height); // L: 11141
													var22 = (var20 - 1 + var10.width) / var20; // L: 11142
													var23 = (var21 - 1 + var10.height) / var21; // L: 11143

													for (var24 = 0; var24 < var22; ++var24) { // L: 11144
														for (var25 = 0; var25 < var23; ++var25) { // L: 11145
															if (var10.spriteAngle != 0) { // L: 11146
																var44.method9135(var20 / 2 + var12 + var20 * var24, var21 / 2 + var13 + var21 * var25, var10.spriteAngle, 4096);
															} else if (var14 != 0) { // L: 11147
																var44.drawTransAt(var12 + var20 * var24, var13 + var25 * var21, 256 - (var14 & 255));
															} else {
																var44.drawTransBgAt(var12 + var20 * var24, var13 + var21 * var25); // L: 11148
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 11151
												}
											}
										}
									} else {
										ItemComposition var33;
										if (var10.type == 6) { // L: 11165
											boolean var39 = UserComparator5.runCs1(var10); // L: 11166
											if (var39) { // L: 11168
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId; // L: 11169
											}

											Model var45 = null; // L: 11170
											var22 = 0; // L: 11171
											if (var10.itemId != -1) { // L: 11172
												var33 = TileItem.ItemComposition_get(var10.itemId); // L: 11173
												if (var33 != null) { // L: 11174
													var33 = var33.getCountObj(var10.itemQuantity); // L: 11175
													var45 = var33.getModel(1); // L: 11176
													if (var45 != null) { // L: 11177
														var45.calculateBoundsCylinder(); // L: 11178
														var22 = var45.height / 2; // L: 11179
													} else {
														LoginScreenAnimation.invalidateWidget(var10); // L: 11181
													}
												}
											} else if (var10.modelType == 5) { // L: 11184
												if (var10.modelId == 0) { // L: 11185
													var45 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var45 = class387.localPlayer.getModel(); // L: 11186
												}
											} else {
												NPCComposition var50 = null; // L: 11189
												class189 var51 = null; // L: 11190
												if (var10.modelType == 6) { // L: 11191
													var25 = var10.modelId; // L: 11192
													if (var25 >= 0 && var25 < Client.npcs.length) { // L: 11193
														NPC var36 = Client.npcs[var25]; // L: 11194
														if (var36 != null) { // L: 11195
															var50 = var36.definition; // L: 11196
															var51 = var36.method2633(); // L: 11197
														}
													}
												}

												SequenceDefinition var37 = null; // L: 11201
												var26 = -1; // L: 11202
												if (var20 != -1) { // L: 11203
													var37 = class85.SequenceDefinition_get(var20); // L: 11204
													var26 = var10.modelFrame; // L: 11205
												}

												var45 = var10.method6206(var37, var26, var39, class387.localPlayer.appearance, var50, var51); // L: 11207
												if (var45 == null && Widget.field3579) { // L: 11208
													LoginScreenAnimation.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method4417(var10.width / 2 + var12, var10.height / 2 + var13); // L: 11210
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 11211
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 11212
											if (var45 != null) { // L: 11213
												if (!var10.isIf3) { // L: 11214
													var45.method4706(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var45.calculateBoundsCylinder(); // L: 11216
													if (var10.modelOrthog) { // L: 11217
														var45.method4794(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var45.method4706(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY); // L: 11218
													}
												}
											}

											Rasterizer3D.Rasterizer3D_method3(); // L: 11221
										} else {
											if (var10.type == 7) { // L: 11224
												var42 = var10.getFont(); // L: 11225
												if (var42 == null) { // L: 11226
													if (Widget.field3579) { // L: 11227
														LoginScreenAnimation.invalidateWidget(var10);
													}
													continue;
												}

												var20 = 0; // L: 11230

												for (var21 = 0; var21 < var10.rawHeight; ++var21) { // L: 11231
													for (var22 = 0; var22 < var10.rawWidth; ++var22) { // L: 11232
														if (var10.itemIds[var20] > 0) { // L: 11233
															var33 = TileItem.ItemComposition_get(var10.itemIds[var20] - 1); // L: 11234
															String var35;
															if (var33.isStackable != 1 && var10.itemQuantities[var20] == 1) { // L: 11236
																var35 = class149.colorStartTag(16748608) + var33.name + "</col>"; // L: 11237
															} else {
																var35 = class149.colorStartTag(16748608) + var33.name + "</col>" + " " + 'x' + WorldMapCacheName.formatItemStacks(var10.itemQuantities[var20]);
															}

															var25 = var12 + var22 * (var10.paddingX + 115); // L: 11238
															var26 = (var10.paddingY + 12) * var21 + var13; // L: 11239
															if (var10.textXAlignment == 0) { // L: 11240
																var42.draw(var35, var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else if (var10.textXAlignment == 1) { // L: 11241
																var42.drawCentered(var35, var10.width / 2 + var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else {
																var42.drawRightAligned(var35, var25 + var10.width - 1, var26, var10.color, var10.textShadowed ? 0 : -1); // L: 11242
															}
														}

														++var20; // L: 11244
													}
												}
											}

											Font var31;
											if (var10.type == 8 && var10 == class18.field102 && Client.field666 == Client.field665) { // L: 11248 11249
												var19 = 0; // L: 11250
												var20 = 0; // L: 11251
												var31 = MenuAction.fontPlain12; // L: 11252
												String var32 = var10.text; // L: 11253

												String var47;
												for (var32 = GroundObject.method4312(var32, var10); var32.length() > 0; var20 = var20 + var31.ascent + 1) { // L: 11255 11256 11268
													var24 = var32.indexOf("<br>"); // L: 11257
													if (var24 != -1) { // L: 11258
														var47 = var32.substring(0, var24); // L: 11259
														var32 = var32.substring(var24 + 4); // L: 11260
													} else {
														var47 = var32; // L: 11263
														var32 = ""; // L: 11264
													}

													var25 = var31.stringWidth(var47); // L: 11266
													if (var25 > var19) { // L: 11267
														var19 = var25;
													}
												}

												var19 += 6; // L: 11270
												var20 += 7; // L: 11271
												var24 = var12 + var10.width - 5 - var19; // L: 11272
												var25 = var13 + var10.height + 5; // L: 11273
												if (var24 < var12 + 5) { // L: 11274
													var24 = var12 + 5;
												}

												if (var24 + var19 > var4) { // L: 11275
													var24 = var4 - var19;
												}

												if (var20 + var25 > var5) { // L: 11276
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120); // L: 11277
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0); // L: 11278
												var32 = var10.text; // L: 11279
												var26 = var25 + var31.ascent + 2; // L: 11280

												for (var32 = GroundObject.method4312(var32, var10); var32.length() > 0; var26 = var26 + var31.ascent + 1) { // L: 11281 11282 11293
													int var27 = var32.indexOf("<br>"); // L: 11283
													if (var27 != -1) { // L: 11284
														var47 = var32.substring(0, var27); // L: 11285
														var32 = var32.substring(var27 + 4); // L: 11286
													} else {
														var47 = var32; // L: 11289
														var32 = ""; // L: 11290
													}

													var31.draw(var47, var24 + 3, var26, 0, -1); // L: 11292
												}
											}

											if (var10.type == 9) { // L: 11297
												if (var10.field3606) { // L: 11302
													var19 = var12; // L: 11303
													var20 = var13 + var10.height; // L: 11304
													var21 = var12 + var10.width; // L: 11305
													var22 = var13; // L: 11306
												} else {
													var19 = var12; // L: 11309
													var20 = var13; // L: 11310
													var21 = var12 + var10.width; // L: 11311
													var22 = var13 + var10.height; // L: 11312
												}

												if (var10.lineWid == 1) { // L: 11314
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color); // L: 11315
												} else {
													class17.method229(var19, var20, var21, var22, var10.color, var10.lineWid); // L: 11318
												}
											} else if (var10.type == 12) { // L: 11322
												class307 var43 = var10.method6235(); // L: 11323
												class302 var34 = var10.method6226(); // L: 11324
												if (var43 != null && var34 != null && var43.method5979()) { // L: 11325
													var31 = var10.getFont(); // L: 11326
													if (var31 != null) { // L: 11327
														Client.field717.method9237(var12, var13, var10.width, var10.height, var43.method5980(), var43.method6041(), 0, 0, var43.method6145(), var43.method5978(), var43.method5976()); // L: 11328
														var22 = var10.textShadowed ? var10.spriteShadow : -1; // L: 11329
														if (!var43.method5974() && var43.method5971().method7076()) { // L: 11330
															Client.field717.method9232(var34.field3467, var22, var34.field3465, var34.field3470); // L: 11331
															Client.field717.method9236(var43.method6128(), var31); // L: 11332
														} else {
															Client.field717.method9232(var10.color, var22, var34.field3465, var34.field3470); // L: 11335
															Client.field717.method9236(var43.method5971(), var31); // L: 11336
														}

														Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 11338
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

	} // L: 11343
}
