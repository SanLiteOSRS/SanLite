import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bz")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	static Archive field298;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lby;"
	)
	@Export("players")
	public volatile PcmPlayer[] players;

	public SoundSystem() {
		this.players = new PcmPlayer[2]; // L: 6
	}

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) {
				PcmPlayer var2 = this.players[var1];
				if (var2 != null) { // L: 12
					var2.run();
				}
			}
		} catch (Exception var4) { // L: 15
			GrandExchangeOfferWorldComparator.RunException_sendStackTrace((String)null, var4); // L: 16
		}

	} // L: 18

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Liu;",
		garbageValue = "1"
	)
	public static Clock method863() {
		try {
			return new NanoClock(); // L: 8
		} catch (Throwable var1) { // L: 10
			return new MilliClock(); // L: 11
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "467776303"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!SpriteMask.client.method1351() && !SpriteMask.client.isOtlTokenRequesterInitialized() && !SpriteMask.client.method1267()) { // L: 1532
			Login.Login_response1 = ""; // L: 1536
			Login.Login_response2 = "Enter your username/email & password."; // L: 1537
			Login.Login_response3 = ""; // L: 1538
			UserComparator7.method2966(2); // L: 1539
			if (var0) {
				Login.Login_password = ""; // L: 1540
			}

			Frames.method5517(); // L: 1541
			class150.method3281(); // L: 1542
		} else {
			UserComparator7.method2966(10); // L: 1533
		}
	} // L: 1534 1543

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "0"
	)
	static int method869(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) { // L: 4390
			class517.Interpreter_intStackSize -= 2; // L: 4391
			var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 4392
			int var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 4393
			if (!Client.isCameraLocked) { // L: 4394
				Client.camAngleX = var3; // L: 4395
				Client.camAngleY = var4; // L: 4396
			}

			return 1; // L: 4398
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) { // L: 4400
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.camAngleX; // L: 4401
			return 1; // L: 4402
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) { // L: 4404
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.camAngleY; // L: 4405
			return 1; // L: 4406
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) { // L: 4408
			var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4409
			if (var3 < 0) { // L: 4410
				var3 = 0;
			}

			Client.camFollowHeight = var3; // L: 4411
			return 1; // L: 4412
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) { // L: 4414
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.camFollowHeight; // L: 4415
			return 1; // L: 4416
		} else {
			return 2; // L: 4418
		}
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "702782966"
	)
	static final void method867(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) { // L: 9325
			if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) { // L: 9326
				Client.field785[var4] = true;
			}
		}

	} // L: 9328

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "([Lnn;IIIIIIIII)V",
		garbageValue = "-610795305"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10692
		Rasterizer3D.method5203(); // L: 10693

		for (int var9 = 0; var9 < var0.length; ++var9) { // L: 10694
			Widget var10 = var0[var9]; // L: 10695
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) { // L: 10696 10697
				int var11;
				if (var8 == -1) { // L: 10699
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6; // L: 10700
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y; // L: 10701
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width; // L: 10702
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height; // L: 10703
					var11 = ++Client.rootWidgetCount - 1; // L: 10704
				} else {
					var11 = var8; // L: 10706
				}

				var10.rootIndex = var11; // L: 10707
				var10.cycle = Client.cycle; // L: 10708
				if (!var10.isIf3 || !class11.isComponentHidden(var10)) { // L: 10709
					if (var10.contentType > 0) { // L: 10710
						class348.method6831(var10);
					}

					int var12 = var10.x + var6; // L: 10711
					int var13 = var7 + var10.y; // L: 10712
					int var14 = var10.transparencyTop; // L: 10713
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) { // L: 10714
						if (var1 != -1412584499 && !var10.isScrollBar) { // L: 10715
							UserComparator10.field1453 = var0; // L: 10716
							ParamComposition.field2040 = var6; // L: 10717
							PendingSpawn.field1167 = var7; // L: 10718
							continue; // L: 10719
						}

						if (Client.isDraggingWidget && Client.field674) { // L: 10721
							var15 = MouseHandler.MouseHandler_x; // L: 10722
							var16 = MouseHandler.MouseHandler_y; // L: 10723
							var15 -= Client.widgetClickX; // L: 10724
							var16 -= Client.widgetClickY; // L: 10725
							if (var15 < Client.field554) { // L: 10726
								var15 = Client.field554;
							}

							if (var15 + var10.width > Client.field554 + Client.clickedWidgetParent.width) { // L: 10727
								var15 = Client.field554 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field676) { // L: 10728
								var16 = Client.field676;
							}

							if (var16 + var10.height > Client.field676 + Client.clickedWidgetParent.height) { // L: 10729
								var16 = Client.field676 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15; // L: 10730
							var13 = var16; // L: 10731
						}

						if (!var10.isScrollBar) { // L: 10733
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 9) { // L: 10739
						var19 = var12; // L: 10740
						var20 = var13; // L: 10741
						var21 = var12 + var10.width; // L: 10742
						var22 = var13 + var10.height; // L: 10743
						if (var21 < var12) { // L: 10744
							var19 = var21; // L: 10746
							var21 = var12; // L: 10747
						}

						if (var22 < var13) { // L: 10749
							var20 = var22; // L: 10751
							var22 = var13; // L: 10752
						}

						++var21; // L: 10754
						++var22; // L: 10755
						var15 = var19 > var2 ? var19 : var2; // L: 10756
						var16 = var20 > var3 ? var20 : var3; // L: 10757
						var17 = var21 < var4 ? var21 : var4; // L: 10758
						var18 = var22 < var5 ? var22 : var5; // L: 10759
					} else {
						var19 = var12 + var10.width; // L: 10762
						var20 = var13 + var10.height; // L: 10763
						var15 = var12 > var2 ? var12 : var2; // L: 10764
						var16 = var13 > var3 ? var13 : var3; // L: 10765
						var17 = var19 < var4 ? var19 : var4; // L: 10766
						var18 = var20 < var5 ? var20 : var5; // L: 10767
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) { // L: 10769
						if (var10.contentType != 0) { // L: 10770
							if (var10.contentType == 1336) { // L: 10771
								if (WorldMapIcon_1.clientPreferences.method2608()) { // L: 10772
									var13 += 15; // L: 10773
									ItemLayer.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1); // L: 10774
									var13 += 15; // L: 10775
									Runtime var41 = Runtime.getRuntime(); // L: 10776
									var20 = (int)((var41.totalMemory() - var41.freeMemory()) / 1024L); // L: 10777
									var21 = 16776960; // L: 10778
									if (var20 > 327680 && !Client.isLowDetail) { // L: 10779
										var21 = 16711680;
									}

									ItemLayer.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1); // L: 10780
									var13 += 15; // L: 10781
								}
								continue;
							}

							if (var10.contentType == 1337) { // L: 10785
								Client.viewportX = var12; // L: 10786
								Client.viewportY = var13; // L: 10787
								PlayerComposition.drawEntities(var12, var13, var10.width, var10.height); // L: 10788
								Client.field708[var10.rootIndex] = true; // L: 10789
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10790
								continue; // L: 10791
							}

							if (var10.contentType == 1338) { // L: 10793
								class36.drawMinimap(var10, var12, var13, var11); // L: 10794
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10795
								continue; // L: 10796
							}

							if (var10.contentType == 1339) { // L: 10798
								MilliClock.method4249(var10, var12, var13, var11); // L: 10799
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10800
								continue; // L: 10801
							}

							if (var10.contentType == 1400) { // L: 10803
								class187.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle); // L: 10804
							}

							if (var10.contentType == 1401) { // L: 10806
								class187.worldMap.drawOverview(var12, var13, var10.width, var10.height); // L: 10807
							}

							if (var10.contentType == 1402) { // L: 10809
								EnumComposition.loginScreenRunesAnimation.draw(var12, Client.cycle); // L: 10810
							}
						}

						if (var10.type == 0) { // L: 10813
							if (!var10.isIf3 && class11.isComponentHidden(var10) && var10 != Interpreter.mousedOverWidgetIf1) { // L: 10814
								continue;
							}

							if (!var10.isIf3) { // L: 10815
								if (var10.scrollY > var10.scrollHeight - var10.height) { // L: 10816
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) { // L: 10817
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11); // L: 10819
							if (var10.children != null) { // L: 10820
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var10.id); // L: 10821
							if (var28 != null) { // L: 10822
								Canvas.method327(var28.group, var15, var16, var17, var18, var12, var13, var11); // L: 10823
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10825
							Rasterizer3D.method5203(); // L: 10826
						} else if (var10.type == 11) { // L: 10828
							if (class11.isComponentHidden(var10) && var10 != Interpreter.mousedOverWidgetIf1) { // L: 10829
								continue;
							}

							if (var10.children != null) { // L: 10830
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10831
							Rasterizer3D.method5203(); // L: 10832
						}

						if (Client.isResizable || Client.field515[var11] || Client.field715 > 1) { // L: 10834
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) { // L: 10835 10836
								Varcs.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) { // L: 10838
								if (var10.type == 3) { // L: 10841
									if (class335.runCs1(var10)) { // L: 10843
										var19 = var10.color2; // L: 10844
										if (var10 == Interpreter.mousedOverWidgetIf1 && var10.field3687 != 0) { // L: 10845
											var19 = var10.field3687;
										}
									} else {
										var19 = var10.color; // L: 10848
										if (var10 == Interpreter.mousedOverWidgetIf1 && var10.field3686 != 0) { // L: 10849
											var19 = var10.field3686;
										}
									}

									if (var10.fill) { // L: 10851
										switch(var10.fillMode.field5221) { // L: 10852
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2); // L: 10857
											break; // L: 10858
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255)); // L: 10854
											break; // L: 10855
										default:
											if (var14 == 0) { // L: 10860
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10861
											}
										}
									} else if (var14 == 0) { // L: 10866
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10867
									}
								} else if (var10.type == 4) { // L: 10871
									Font var40 = var10.method6666(HealthBarDefinition.field1877); // L: 10872
									if (var40 == null) { // L: 10873
										if (Widget.field3656) { // L: 10874
											class159.invalidateWidget(var10);
										}
									} else {
										String var42 = var10.text; // L: 10878
										if (class335.runCs1(var10)) { // L: 10879
											var20 = var10.color2; // L: 10880
											if (var10 == Interpreter.mousedOverWidgetIf1 && var10.field3687 != 0) { // L: 10881
												var20 = var10.field3687;
											}

											if (var10.field3723.length() > 0) { // L: 10882
												var42 = var10.field3723;
											}
										} else {
											var20 = var10.color; // L: 10885
											if (var10 == Interpreter.mousedOverWidgetIf1 && var10.field3686 != 0) { // L: 10886
												var20 = var10.field3686;
											}
										}

										if (var10.isIf3 && var10.itemId != -1) { // L: 10888
											ItemComposition var43 = class214.ItemComposition_get(var10.itemId); // L: 10889
											var42 = var43.name; // L: 10890
											if (var42 == null) { // L: 10891
												var42 = "null";
											}

											if ((var43.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) { // L: 10892
												var42 = class167.colorStartTag(16748608) + var42 + "</col>" + " " + 'x' + class355.formatItemStacks(var10.itemQuantity);
											}
										}

										if (var10 == Client.meslayerContinueWidget) { // L: 10894
											var42 = "Please wait..."; // L: 10895
											var20 = var10.color; // L: 10896
										}

										if (!var10.isIf3) { // L: 10898
											var42 = HitSplatDefinition.method3864(var42, var10);
										}

										var40.method7673(var42, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, class478.method8602(var10.transparencyTop), var10.textXAlignment, var10.textYAlignment, var10.textLineHeight); // L: 10899
									}
								} else {
									int var23;
									int var24;
									int var25;
									if (var10.type == 5) { // L: 10902
										SpritePixels var38;
										if (!var10.isIf3) { // L: 10903
											var38 = var10.method6661(HealthBarDefinition.field1877, class335.runCs1(var10), class60.urlRequester); // L: 10904
											if (var38 != null) { // L: 10905
												var38.drawTransBgAt(var12, var13);
											} else if (Widget.field3656) { // L: 10906
												class159.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) { // L: 10910
												var38 = class6.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var38 = var10.method6661(HealthBarDefinition.field1877, false, class60.urlRequester); // L: 10911
											}

											if (var38 == null) { // L: 10912
												if (Widget.field3656) { // L: 10936
													class159.invalidateWidget(var10);
												}
											} else {
												var20 = var38.width; // L: 10913
												var21 = var38.height; // L: 10914
												if (!var10.spriteTiling) { // L: 10915
													var22 = var10.width * 4096 / var20; // L: 10929
													if (var10.spriteAngle != 0) { // L: 10930
														var38.method9767(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) { // L: 10931
														var38.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) { // L: 10932
														var38.drawTransBgAt(var12, var13); // L: 10933
													} else {
														var38.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height); // L: 10916
													var22 = (var20 - 1 + var10.width) / var20; // L: 10917
													var23 = (var21 - 1 + var10.height) / var21; // L: 10918

													for (var24 = 0; var24 < var22; ++var24) { // L: 10919
														for (var25 = 0; var25 < var23; ++var25) { // L: 10920
															if (var10.spriteAngle != 0) { // L: 10921
																var38.method9767(var20 / 2 + var12 + var20 * var24, var21 / 2 + var13 + var21 * var25, var10.spriteAngle, 4096);
															} else if (var14 != 0) { // L: 10922
																var38.drawTransAt(var12 + var20 * var24, var13 + var21 * var25, 256 - (var14 & 255));
															} else {
																var38.drawTransBgAt(var12 + var20 * var24, var13 + var25 * var21); // L: 10923
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10926
												}
											}
										}
									} else {
										int var26;
										if (var10.type == 6) { // L: 10940
											boolean var36 = class335.runCs1(var10); // L: 10941
											if (var36) { // L: 10943
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId; // L: 10944
											}

											Model var39 = null; // L: 10945
											var22 = 0; // L: 10946
											if (var10.itemId != -1) { // L: 10947
												ItemComposition var44 = class214.ItemComposition_get(var10.itemId); // L: 10948
												if (var44 != null) { // L: 10949
													var44 = var44.getCountObj(var10.itemQuantity); // L: 10950
													var39 = var44.getModel(1); // L: 10951
													if (var39 != null) { // L: 10952
														var39.calculateBoundsCylinder(); // L: 10953
														var22 = var39.height / 2; // L: 10954
													} else {
														class159.invalidateWidget(var10); // L: 10956
													}
												}
											} else if (var10.modelType == 5) { // L: 10959
												if (var10.modelId == 0) { // L: 10960
													var39 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var39 = class229.localPlayer.getModel(); // L: 10961
												}
											} else if (var10.modelType == 7) { // L: 10963
												var39 = var10.field3717.getModel((SequenceDefinition)null, -1, DynamicObject.SequenceDefinition_get(class229.localPlayer.idleSequence), class229.localPlayer.movementFrame); // L: 10964
											} else {
												NPCComposition var45 = null; // L: 10967
												class187 var33 = null; // L: 10968
												if (var10.modelType == 6) { // L: 10969
													var25 = var10.modelId; // L: 10970
													if (var25 >= 0 && var25 < Client.npcs.length) { // L: 10971
														NPC var34 = Client.npcs[var25]; // L: 10972
														if (var34 != null) { // L: 10973
															var45 = var34.definition; // L: 10974
															var33 = var34.method2672(); // L: 10975
														}
													}
												}

												SequenceDefinition var35 = null; // L: 10979
												var26 = -1; // L: 10980
												if (var20 != -1) { // L: 10981
													var35 = DynamicObject.SequenceDefinition_get(var20); // L: 10982
													var26 = var10.modelFrame; // L: 10983
												}

												var39 = var10.method6667(HealthBarDefinition.field1877, var35, var26, var36, class229.localPlayer.appearance, var45, var33); // L: 10985
												if (var39 == null && Widget.field3656) { // L: 10986
													class159.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method5206(var10.width / 2 + var12, var10.height / 2 + var13); // L: 10988
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10989
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10990
											if (var39 != null) { // L: 10991
												if (!var10.isIf3) { // L: 10992
													var39.method5558(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var39.calculateBoundsCylinder(); // L: 10994
													if (var10.modelOrthog) { // L: 10995
														var39.method5586(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var39.method5558(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY); // L: 10996
													}
												}
											}

											Rasterizer3D.method5205(); // L: 10999
										} else {
											Font var29;
											if (var10.type == 8 && var10 == class412.field4539 && Client.field768 == Client.field648) { // L: 11002 11003
												var19 = 0; // L: 11004
												var20 = 0; // L: 11005
												var29 = ItemLayer.fontPlain12; // L: 11006
												String var30 = var10.text; // L: 11007

												String var31;
												for (var30 = HitSplatDefinition.method3864(var30, var10); var30.length() > 0; var20 = var20 + var29.ascent + 1) { // L: 11009 11010 11022
													var24 = var30.indexOf("<br>"); // L: 11011
													if (var24 != -1) { // L: 11012
														var31 = var30.substring(0, var24); // L: 11013
														var30 = var30.substring(var24 + 4); // L: 11014
													} else {
														var31 = var30; // L: 11017
														var30 = ""; // L: 11018
													}

													var25 = var29.stringWidth(var31); // L: 11020
													if (var25 > var19) { // L: 11021
														var19 = var25;
													}
												}

												var19 += 6; // L: 11024
												var20 += 7; // L: 11025
												var24 = var12 + var10.width - 5 - var19; // L: 11026
												var25 = var13 + var10.height + 5; // L: 11027
												if (var24 < var12 + 5) { // L: 11028
													var24 = var12 + 5;
												}

												if (var19 + var24 > var4) { // L: 11029
													var24 = var4 - var19;
												}

												if (var20 + var25 > var5) { // L: 11030
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120); // L: 11031
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0); // L: 11032
												var30 = var10.text; // L: 11033
												var26 = var25 + var29.ascent + 2; // L: 11034

												for (var30 = HitSplatDefinition.method3864(var30, var10); var30.length() > 0; var26 = var26 + var29.ascent + 1) { // L: 11035 11036 11047
													int var27 = var30.indexOf("<br>"); // L: 11037
													if (var27 != -1) { // L: 11038
														var31 = var30.substring(0, var27); // L: 11039
														var30 = var30.substring(var27 + 4); // L: 11040
													} else {
														var31 = var30; // L: 11043
														var30 = ""; // L: 11044
													}

													var29.draw(var31, var24 + 3, var26, 0, -1); // L: 11046
												}
											}

											if (var10.type == 9) { // L: 11051
												if (var10.field3693) { // L: 11056
													var19 = var12; // L: 11057
													var20 = var13 + var10.height; // L: 11058
													var21 = var12 + var10.width; // L: 11059
													var22 = var13; // L: 11060
												} else {
													var19 = var12; // L: 11063
													var20 = var13; // L: 11064
													var21 = var12 + var10.width; // L: 11065
													var22 = var13 + var10.height; // L: 11066
												}

												if (var10.lineWid == 1) { // L: 11068
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color); // L: 11069
												} else {
													UrlRequest.method2922(var19, var20, var21, var22, var10.color, var10.lineWid); // L: 11072
												}
											} else if (var10.type == 12) { // L: 11076
												class341 var37 = var10.method6688(); // L: 11077
												class336 var32 = var10.method6724(); // L: 11078
												if (var37 != null && var32 != null && var37.method6394()) { // L: 11079
													var29 = var10.method6666(HealthBarDefinition.field1877); // L: 11080
													if (var29 != null) { // L: 11081
														Client.field573.method9922(var12, var13, var10.width, var10.height, var37.method6418(), var37.method6419(), var37.method6415(), var37.method6416(), var37.method6414()); // L: 11082
														var22 = var10.textShadowed ? var10.spriteShadow : -1; // L: 11083
														if (!var37.method6640() && var37.method6616().method7520()) { // L: 11084
															Client.field573.method9912(var32.field3579, var22, var32.field3580, var32.field3578); // L: 11085
															Client.field573.method9913(var37.method6644(), var29); // L: 11086
														} else {
															Client.field573.method9912(var10.color, var22, var32.field3580, var32.field3578); // L: 11089
															Client.field573.method9913(var37.method6616(), var29); // L: 11090
														}

														Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 11092
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

	} // L: 11097

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "4026"
	)
	static final void method868(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 12337
		WorldMapIcon_1.clientPreferences.updateSoundEffectVolume(var0); // L: 12338
	} // L: 12339
}
