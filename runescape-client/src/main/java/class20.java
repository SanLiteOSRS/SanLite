import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("aa")
public class class20 {
	@ObfuscatedName("tb")
	@ObfuscatedGetter(
		intValue = 158969199
	)
	static int field91;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1662314691
	)
	final int field89;
	@ObfuscatedName("ah")
	final Map field94;
	@ObfuscatedName("af")
	final String field90;

	class20(String var1) {
		this.field89 = 400; // L: 35
		this.field94 = null; // L: 36
		this.field90 = ""; // L: 37
	} // L: 38

	class20(HttpURLConnection var1) throws IOException {
		this.field89 = var1.getResponseCode(); // L: 17
		var1.getResponseMessage(); // L: 18
		this.field94 = var1.getHeaderFields(); // L: 19
		StringBuilder var2 = new StringBuilder(); // L: 20
		InputStream var3 = this.field89 >= 300 ? var1.getErrorStream() : var1.getInputStream(); // L: 21
		if (var3 != null) { // L: 22
			InputStreamReader var4 = new InputStreamReader(var3); // L: 23
			BufferedReader var5 = new BufferedReader(var4); // L: 24

			String var6;
			while ((var6 = var5.readLine()) != null) { // L: 26
				var2.append(var6); // L: 27
			}

			var3.close(); // L: 29
		}

		this.field90 = var2.toString(); // L: 31
	} // L: 32

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-111"
	)
	public int method272() {
		return this.field89; // L: 41
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "1915901233"
	)
	public Map method278() {
		return this.field94; // L: 45
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2025221215"
	)
	public String method274() {
		return this.field90; // L: 49
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Lck;",
		garbageValue = "-107"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0; // L: 248
		return UserComparator6.getNextWorldListWorld(); // L: 249
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "1623837451"
	)
	static int method271(int var0, Script var1, boolean var2) {
		Widget var3 = class243.field2620.method6281(Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]); // L: 1679
		if (var0 == ScriptOpcodes.IF_GETX) { // L: 1680
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.x; // L: 1681
			return 1; // L: 1682
		} else if (var0 == ScriptOpcodes.IF_GETY) { // L: 1684
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.y; // L: 1685
			return 1; // L: 1686
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) { // L: 1688
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.width; // L: 1689
			return 1; // L: 1690
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) { // L: 1692
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.height; // L: 1693
			return 1; // L: 1694
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) { // L: 1696
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1697
			return 1; // L: 1698
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) { // L: 1700
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.parentId; // L: 1701
			return 1; // L: 1702
		} else {
			return 2; // L: 1704
		}
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "([Lnt;IIIIIIIIB)V",
		garbageValue = "-99"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10690
		Rasterizer3D.method4576(); // L: 10691

		for (int var9 = 0; var9 < var0.length; ++var9) { // L: 10692
			Widget var10 = var0[var9]; // L: 10693
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) { // L: 10694 10695
				int var11;
				if (var8 == -1) { // L: 10697
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6; // L: 10698
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y; // L: 10699
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width; // L: 10700
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height; // L: 10701
					var11 = ++Client.rootWidgetCount - 1; // L: 10702
				} else {
					var11 = var8; // L: 10704
				}

				var10.rootIndex = var11; // L: 10705
				var10.cycle = Client.cycle; // L: 10706
				if (!var10.isIf3 || !class430.isComponentHidden(var10)) { // L: 10707
					if (var10.contentType > 0) { // L: 10708
						GroundObject.method4550(var10);
					}

					int var12 = var10.x + var6; // L: 10709
					int var13 = var7 + var10.y; // L: 10710
					int var14 = var10.transparencyTop; // L: 10711
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) { // L: 10712
						if (var1 != -1412584499 && !var10.isScrollBar) { // L: 10713
							MusicPatchNode.field3599 = var0; // L: 10714
							class276.field3040 = var6; // L: 10715
							HealthBarDefinition.field2044 = var7; // L: 10716
							continue; // L: 10717
						}

						if (Client.isDraggingWidget && Client.field699) { // L: 10719
							var15 = MouseHandler.MouseHandler_x; // L: 10720
							var16 = MouseHandler.MouseHandler_y; // L: 10721
							var15 -= Client.widgetClickX; // L: 10722
							var16 -= Client.widgetClickY; // L: 10723
							if (var15 < Client.field700) { // L: 10724
								var15 = Client.field700;
							}

							if (var15 + var10.width > Client.field700 + Client.clickedWidgetParent.width) { // L: 10725
								var15 = Client.field700 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field701) { // L: 10726
								var16 = Client.field701;
							}

							if (var16 + var10.height > Client.field701 + Client.clickedWidgetParent.height) { // L: 10727
								var16 = Client.field701 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15; // L: 10728
							var13 = var16; // L: 10729
						}

						if (!var10.isScrollBar) { // L: 10731
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 9) { // L: 10737
						var19 = var12; // L: 10738
						var20 = var13; // L: 10739
						var21 = var12 + var10.width; // L: 10740
						var22 = var13 + var10.height; // L: 10741
						if (var21 < var12) { // L: 10742
							var19 = var21; // L: 10744
							var21 = var12; // L: 10745
						}

						if (var22 < var13) { // L: 10747
							var20 = var22; // L: 10749
							var22 = var13; // L: 10750
						}

						++var21; // L: 10752
						++var22; // L: 10753
						var15 = var19 > var2 ? var19 : var2; // L: 10754
						var16 = var20 > var3 ? var20 : var3; // L: 10755
						var17 = var21 < var4 ? var21 : var4; // L: 10756
						var18 = var22 < var5 ? var22 : var5; // L: 10757
					} else {
						var19 = var12 + var10.width; // L: 10760
						var20 = var13 + var10.height; // L: 10761
						var15 = var12 > var2 ? var12 : var2; // L: 10762
						var16 = var13 > var3 ? var13 : var3; // L: 10763
						var17 = var19 < var4 ? var19 : var4; // L: 10764
						var18 = var20 < var5 ? var20 : var5; // L: 10765
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) { // L: 10767
						if (var10.contentType != 0) { // L: 10768
							if (var10.contentType == 1336) { // L: 10769
								if (NPC.clientPreferences.method2466()) { // L: 10770
									var13 += 15; // L: 10771
									class316.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1); // L: 10772
									var13 += 15; // L: 10773
									Runtime var40 = Runtime.getRuntime(); // L: 10774
									var20 = (int)((var40.totalMemory() - var40.freeMemory()) / 1024L); // L: 10775
									var21 = 16776960; // L: 10776
									if (var20 > 327680 && !Client.isLowDetail) { // L: 10777
										var21 = 16711680;
									}

									class316.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1); // L: 10778
									var13 += 15; // L: 10779
								}
								continue;
							}

							if (var10.contentType == 1337) { // L: 10783
								Client.viewportX = var12; // L: 10784
								Client.viewportY = var13; // L: 10785
								WorldMapSectionType.drawEntities(var12, var13, var10.width, var10.height); // L: 10786
								Client.field732[var10.rootIndex] = true; // L: 10787
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10788
								continue; // L: 10789
							}

							if (var10.contentType == 1338) { // L: 10791
								FileSystem.drawMinimap(var10, var12, var13, var11); // L: 10792
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10793
								continue; // L: 10794
							}

							if (var10.contentType == 1339) { // L: 10796
								ViewportMouse.method5101(var10, var12, var13, var11); // L: 10797
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10798
								continue; // L: 10799
							}

							if (var10.contentType == 1400) { // L: 10801
								ModeWhere.worldMap.method8727(var12, var13, var10.width, var10.height, Client.cycle, NPC.clientPreferences.method2470()); // L: 10802
							}

							if (var10.contentType == 1401) { // L: 10804
								ModeWhere.worldMap.drawOverview(var12, var13, var10.width, var10.height); // L: 10805
							}

							if (var10.contentType == 1402) { // L: 10807
								class59.loginScreenRunesAnimation.draw(var12, Client.cycle); // L: 10808
							}
						}

						if (var10.type == 0) { // L: 10811
							if (!var10.isIf3 && class430.isComponentHidden(var10) && var10 != ModelData0.mousedOverWidgetIf1) { // L: 10812
								continue;
							}

							if (!var10.isIf3) { // L: 10813
								if (var10.scrollY > var10.scrollHeight - var10.height) { // L: 10814
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) { // L: 10815
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11); // L: 10817
							if (var10.children != null) { // L: 10818
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var10.id); // L: 10819
							if (var28 != null) { // L: 10820
								Messages.method2769(var28.group, var15, var16, var17, var18, var12, var13, var11); // L: 10821
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10823
							Rasterizer3D.method4576(); // L: 10824
						} else if (var10.type == 11) { // L: 10826
							if (class430.isComponentHidden(var10) && var10 != ModelData0.mousedOverWidgetIf1) { // L: 10827
								continue;
							}

							if (var10.children != null) { // L: 10828
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10829
							Rasterizer3D.method4576(); // L: 10830
						}

						if (Client.isResizable || Client.field734[var11] || Client.field739 > 1) { // L: 10832
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) { // L: 10833 10834
								class9.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) { // L: 10836
								if (var10.type == 3) { // L: 10839
									if (SoundSystem.runCs1(var10)) { // L: 10841
										var19 = var10.color2; // L: 10842
										if (var10 == ModelData0.mousedOverWidgetIf1 && var10.field3771 != 0) { // L: 10843
											var19 = var10.field3771;
										}
									} else {
										var19 = var10.color; // L: 10846
										if (var10 == ModelData0.mousedOverWidgetIf1 && var10.field3827 != 0) { // L: 10847
											var19 = var10.field3827;
										}
									}

									if (var10.fill) { // L: 10849
										switch(var10.fillMode.field5318) { // L: 10850
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2); // L: 10855
											break; // L: 10856
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255)); // L: 10852
											break; // L: 10853
										default:
											if (var14 == 0) { // L: 10858
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10859
											}
										}
									} else if (var14 == 0) { // L: 10864
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10865
									}
								} else if (var10.type == 4) { // L: 10869
									Font var39 = var10.method6656(class243.field2620); // L: 10870
									if (var39 == null) { // L: 10871
										if (Widget.field3740) { // L: 10872
											WorldMapData_0.invalidateWidget(var10);
										}
									} else {
										String var41 = var10.text; // L: 10876
										if (SoundSystem.runCs1(var10)) { // L: 10877
											var20 = var10.color2; // L: 10878
											if (var10 == ModelData0.mousedOverWidgetIf1 && var10.field3771 != 0) { // L: 10879
												var20 = var10.field3771;
											}

											if (var10.field3807.length() > 0) { // L: 10880
												var41 = var10.field3807;
											}
										} else {
											var20 = var10.color; // L: 10883
											if (var10 == ModelData0.mousedOverWidgetIf1 && var10.field3827 != 0) { // L: 10884
												var20 = var10.field3827;
											}
										}

										if (var10.isIf3 && var10.itemId != -1) { // L: 10886
											ItemComposition var42 = class10.ItemComposition_get(var10.itemId); // L: 10887
											var41 = var42.name; // L: 10888
											if (var41 == null) { // L: 10889
												var41 = "null";
											}

											if ((var42.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) { // L: 10890
												var41 = Decimator.colorStartTag(16748608) + var41 + "</col>" + " " + 'x' + class158.formatItemStacks(var10.itemQuantity);
											}
										}

										if (var10 == Client.meslayerContinueWidget) { // L: 10892
											var41 = "Please wait..."; // L: 10893
											var20 = var10.color; // L: 10894
										}

										if (!var10.isIf3) { // L: 10896
											var41 = class142.method3137(var41, var10);
										}

										var39.method7665(var41, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, class486.method8586(var10.transparencyTop), var10.textXAlignment, var10.textYAlignment, var10.textLineHeight); // L: 10897
									}
								} else {
									int var23;
									int var24;
									int var25;
									if (var10.type == 5) { // L: 10900
										SpritePixels var37;
										if (!var10.isIf3) { // L: 10901
											var37 = var10.method6651(class243.field2620, SoundSystem.runCs1(var10), class94.urlRequester); // L: 10902
											if (var37 != null) { // L: 10903
												var37.drawTransBgAt(var12, var13);
											} else if (Widget.field3740) { // L: 10904
												WorldMapData_0.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) { // L: 10908
												var37 = VarcInt.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var37 = var10.method6651(class243.field2620, false, class94.urlRequester); // L: 10909
											}

											if (var37 == null) { // L: 10910
												if (Widget.field3740) { // L: 10934
													WorldMapData_0.invalidateWidget(var10);
												}
											} else {
												var20 = var37.width; // L: 10911
												var21 = var37.height; // L: 10912
												if (!var10.spriteTiling) { // L: 10913
													var22 = var10.width * 4096 / var20; // L: 10927
													if (var10.spriteAngle != 0) { // L: 10928
														var37.method9778(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) { // L: 10929
														var37.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) { // L: 10930
														var37.drawTransBgAt(var12, var13); // L: 10931
													} else {
														var37.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height); // L: 10914
													var22 = (var20 - 1 + var10.width) / var20; // L: 10915
													var23 = (var21 - 1 + var10.height) / var21; // L: 10916

													for (var24 = 0; var24 < var22; ++var24) { // L: 10917
														for (var25 = 0; var25 < var23; ++var25) { // L: 10918
															if (var10.spriteAngle != 0) { // L: 10919
																var37.method9778(var20 / 2 + var12 + var20 * var24, var21 / 2 + var13 + var25 * var21, var10.spriteAngle, 4096);
															} else if (var14 != 0) { // L: 10920
																var37.drawTransAt(var12 + var24 * var20, var13 + var25 * var21, 256 - (var14 & 255));
															} else {
																var37.drawTransBgAt(var12 + var20 * var24, var13 + var21 * var25); // L: 10921
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10924
												}
											}
										}
									} else {
										int var26;
										if (var10.type == 6) { // L: 10938
											boolean var35 = SoundSystem.runCs1(var10); // L: 10939
											if (var35) { // L: 10941
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId; // L: 10942
											}

											Model var38 = null; // L: 10943
											var22 = 0; // L: 10944
											if (var10.itemId != -1) { // L: 10945
												ItemComposition var43 = class10.ItemComposition_get(var10.itemId); // L: 10946
												if (var43 != null) { // L: 10947
													var43 = var43.getCountObj(var10.itemQuantity); // L: 10948
													var38 = var43.getModel(1); // L: 10949
													if (var38 != null) { // L: 10950
														var38.calculateBoundsCylinder(); // L: 10951
														var22 = var38.height / 2; // L: 10952
													} else {
														WorldMapData_0.invalidateWidget(var10); // L: 10954
													}
												}
											} else if (var10.modelType == 5) { // L: 10957
												if (var10.modelId == 0) { // L: 10958
													var38 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var38 = class133.localPlayer.getModel(); // L: 10959
												}
											} else if (var10.modelType == 7) { // L: 10961
												var38 = var10.field3801.getModel((SequenceDefinition)null, -1, DevicePcmPlayerProvider.SequenceDefinition_get(class133.localPlayer.idleSequence), class133.localPlayer.movementFrame); // L: 10962
											} else {
												class206 var44 = null; // L: 10965
												if (var10.modelType == 6) { // L: 10966
													var24 = var10.modelId; // L: 10967
													if (var24 >= 0 && var24 < Client.npcs.length) { // L: 10968
														NPC var33 = Client.npcs[var24]; // L: 10969
														if (var33 != null && var33.definition != null) { // L: 10970
															var26 = var33.definition.method3867(); // L: 10971
															if (var26 != -1) { // L: 10972
																var10.modelId = var26;
															}

															var44 = var33.method2594(); // L: 10973
														}
													}
												} else if (var10.modelType == 2) { // L: 10977
													var24 = var10.modelId; // L: 10978
													var25 = UserComparator10.getNpcDefinition(var24).method3867(); // L: 10979
													if (var25 != -1) { // L: 10980
														var10.modelId = var25;
													}
												}

												SequenceDefinition var34 = null; // L: 10982
												var25 = -1; // L: 10983
												if (var20 != -1) { // L: 10984
													var34 = DevicePcmPlayerProvider.SequenceDefinition_get(var20); // L: 10985
													var25 = var10.modelFrame; // L: 10986
												}

												var38 = var10.method6657(class243.field2620, var34, var25, var35, class133.localPlayer.appearance, var44); // L: 10988
												if (var38 == null && Widget.field3740) { // L: 10989
													WorldMapData_0.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method4579(var10.width / 2 + var12, var10.height / 2 + var13); // L: 10991
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10992
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10993
											if (var38 != null) { // L: 10994
												if (!var10.isIf3) { // L: 10995
													var38.method5031(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var38.calculateBoundsCylinder(); // L: 10997
													if (var10.modelOrthog) { // L: 10998
														var38.method4974(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var38.method5031(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY); // L: 10999
													}
												}
											}

											Rasterizer3D.method4578(); // L: 11002
										} else {
											Font var29;
											if (var10.type == 8 && var10 == class288.field3137 && Client.field673 == Client.field622) { // L: 11005 11006
												var19 = 0; // L: 11007
												var20 = 0; // L: 11008
												var29 = class316.fontPlain12; // L: 11009
												String var30 = var10.text; // L: 11010

												String var31;
												for (var30 = class142.method3137(var30, var10); var30.length() > 0; var20 = var20 + var29.ascent + 1) { // L: 11012 11013 11025
													var24 = var30.indexOf("<br>"); // L: 11014
													if (var24 != -1) { // L: 11015
														var31 = var30.substring(0, var24); // L: 11016
														var30 = var30.substring(var24 + 4); // L: 11017
													} else {
														var31 = var30; // L: 11020
														var30 = ""; // L: 11021
													}

													var25 = var29.stringWidth(var31); // L: 11023
													if (var25 > var19) { // L: 11024
														var19 = var25;
													}
												}

												var19 += 6; // L: 11027
												var20 += 7; // L: 11028
												var24 = var12 + var10.width - 5 - var19; // L: 11029
												var25 = var13 + var10.height + 5; // L: 11030
												if (var24 < var12 + 5) { // L: 11031
													var24 = var12 + 5;
												}

												if (var24 + var19 > var4) { // L: 11032
													var24 = var4 - var19;
												}

												if (var20 + var25 > var5) { // L: 11033
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120); // L: 11034
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0); // L: 11035
												var30 = var10.text; // L: 11036
												var26 = var25 + var29.ascent + 2; // L: 11037

												for (var30 = class142.method3137(var30, var10); var30.length() > 0; var26 = var26 + var29.ascent + 1) { // L: 11038 11039 11050
													int var27 = var30.indexOf("<br>"); // L: 11040
													if (var27 != -1) { // L: 11041
														var31 = var30.substring(0, var27); // L: 11042
														var30 = var30.substring(var27 + 4); // L: 11043
													} else {
														var31 = var30; // L: 11046
														var30 = ""; // L: 11047
													}

													var29.draw(var31, var24 + 3, var26, 0, -1); // L: 11049
												}
											}

											if (var10.type == 9) { // L: 11054
												if (var10.field3862) { // L: 11059
													var19 = var12; // L: 11060
													var20 = var13 + var10.height; // L: 11061
													var21 = var12 + var10.width; // L: 11062
													var22 = var13; // L: 11063
												} else {
													var19 = var12; // L: 11066
													var20 = var13; // L: 11067
													var21 = var12 + var10.width; // L: 11068
													var22 = var13 + var10.height; // L: 11069
												}

												if (var10.lineWid == 1) { // L: 11071
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color); // L: 11072
												} else {
													WorldMapIcon_0.method5608(var19, var20, var21, var22, var10.color, var10.lineWid); // L: 11075
												}
											} else if (var10.type == 12) { // L: 11079
												class347 var36 = var10.method6667(); // L: 11080
												class341 var32 = var10.method6699(); // L: 11081
												if (var36 != null && var32 != null && var36.method6513()) { // L: 11082
													var29 = var10.method6656(class243.field2620); // L: 11083
													if (var29 != null) { // L: 11084
														Client.field724.method9871(var12, var13, var10.width, var10.height, var36.method6473(), var36.method6422(), var36.method6510(), var36.method6559(), var36.method6616()); // L: 11085
														var22 = var10.textShadowed ? var10.spriteShadow : -1; // L: 11086
														if (!var36.method6459() && var36.method6412().method7566()) { // L: 11087
															Client.field724.method9872(var32.field3657, var22, var32.field3655, var32.field3656); // L: 11088
															Client.field724.method9873(var36.method6413(), var29); // L: 11089
														} else {
															Client.field724.method9872(var10.color, var22, var32.field3655, var32.field3656); // L: 11092
															Client.field724.method9873(var36.method6412(), var29); // L: 11093
														}

														Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 11095
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

	} // L: 11100
}
