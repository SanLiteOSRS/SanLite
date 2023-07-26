import java.awt.datatransfer.Clipboard;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("aw")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 581659887
	)
	@Export("world")
	public int world;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	} // L: 10

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([BB)Lud;",
		garbageValue = "-39"
	)
	public static final SpritePixels method3152(byte[] var0) {
		BufferedImage var1 = null; // L: 20

		try {
			Class var2 = ImageIO.class; // L: 22
			synchronized(ImageIO.class) {
				var1 = ImageIO.read(new ByteArrayInputStream(var0)); // L: 23
			} // L: 24

			int var6 = var1.getWidth(); // L: 25
			int var7 = var1.getHeight(); // L: 26
			int[] var4 = new int[var7 * var6]; // L: 27
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var6, var7, var4, 0, var6); // L: 28
			var5.grabPixels(); // L: 29
			return new SpritePixels(var4, var6, var7); // L: 30
		} catch (IOException var9) { // L: 32
		} catch (InterruptedException var10) { // L: 33
		}

		return new SpritePixels(0, 0); // L: 34
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-729456803"
	)
	static int method3150(int var0, int var1) {
		if (var0 == -2) { // L: 63
			return 12345678;
		} else if (var0 == -1) { // L: 64
			if (var1 < 0) { // L: 65
				var1 = 0; // L: 66
			} else if (var1 > 127) { // L: 68
				var1 = 127; // L: 69
			}

			var1 = 127 - var1; // L: 71
			return var1; // L: 72
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 74
			if (var1 < 2) { // L: 75
				var1 = 2;
			} else if (var1 > 126) { // L: 76
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 77
		}
	}

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "([Lmt;IIIIIIIB)V",
		garbageValue = "14"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) { // L: 11455
			Widget var9 = var0[var8]; // L: 11456
			if (var9 != null && var9.parentId == var1 && (var9.method6505() || UserComparator8.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) { // L: 11457 11458 11459
				if (var9.isIf3) { // L: 11460
					if (WorldMapDecorationType.isComponentHidden(var9)) { // L: 11461
						continue;
					}
				} else if (var9.type == 0 && var9 != WorldMapScaleHandler.mousedOverWidgetIf1 && WorldMapDecorationType.isComponentHidden(var9)) { // L: 11464
					continue;
				}

				if (var9.type == 11) { // L: 11466
					if (var9.method6466(WorldMapLabel.urlRequester)) { // L: 11467
						if (var9.method6459()) { // L: 11468
							class200.invalidateWidget(var9); // L: 11469
							SoundCache.revalidateWidgetScroll(var9.children, var9, true); // L: 11470
						}

						if (var9.field3747 != null) { // L: 11472
							ScriptEvent var10 = new ScriptEvent(); // L: 11473
							var10.widget = var9; // L: 11474
							var10.args = var9.field3747; // L: 11475
							Client.scriptEvents.addFirst(var10); // L: 11476
						}
					}
				} else if (var9.type == 12 && var9.method6473()) { // L: 11480 11481
					class200.invalidateWidget(var9); // L: 11482
				}

				int var26 = var9.x + var6; // L: 11485
				int var11 = var7 + var9.y; // L: 11486
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				if (var9.type == 9) { // L: 11491
					var16 = var26; // L: 11492
					var17 = var11; // L: 11493
					var18 = var26 + var9.width; // L: 11494
					int var19 = var11 + var9.height; // L: 11495
					if (var18 < var26) { // L: 11496
						var16 = var18; // L: 11498
						var18 = var26; // L: 11499
					}

					if (var19 < var11) { // L: 11501
						var17 = var19; // L: 11503
						var19 = var11; // L: 11504
					}

					++var18; // L: 11506
					++var19; // L: 11507
					var12 = var16 > var2 ? var16 : var2; // L: 11508
					var13 = var17 > var3 ? var17 : var3; // L: 11509
					var14 = var18 < var4 ? var18 : var4; // L: 11510
					var15 = var19 < var5 ? var19 : var5; // L: 11511
				} else {
					var16 = var26 + var9.width; // L: 11514
					var17 = var11 + var9.height; // L: 11515
					var12 = var26 > var2 ? var26 : var2; // L: 11516
					var13 = var11 > var3 ? var11 : var3; // L: 11517
					var14 = var16 < var4 ? var16 : var4; // L: 11518
					var15 = var17 < var5 ? var17 : var5; // L: 11519
				}

				if (var9 == Client.clickedWidget) { // L: 11521
					Client.field809 = true; // L: 11522
					Client.field705 = var26; // L: 11523
					Client.field706 = var11; // L: 11524
				}

				boolean var34 = false; // L: 11526
				if (var9.field3698) { // L: 11527
					switch(Client.field617) { // L: 11528
					case 0:
						var34 = true; // L: 11535
					case 1:
					default:
						break;
					case 2:
						if (Client.field687 == var9.id >>> 16) { // L: 11538
							var34 = true; // L: 11539
						}
						break;
					case 3:
						if (var9.id == Client.field687) { // L: 11530
							var34 = true; // L: 11531
						}
					}
				}

				if (var34 || !var9.isIf3 || var12 < var14 && var13 < var15) { // L: 11544
					if (var9.isIf3) { // L: 11545
						ScriptEvent var27;
						if (var9.noClickThrough) { // L: 11546
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11547
								for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11548
									if (var27.field1070) { // L: 11549
										var27.remove(); // L: 11550
										var27.widget.field3761 = false; // L: 11551
									}
								}

								class417.method7750(); // L: 11554
								if (class130.widgetDragDuration == 0) { // L: 11555
									Client.clickedWidget = null; // L: 11556
									Client.clickedWidgetParent = null; // L: 11557
								}

								if (!Client.isMenuOpen) { // L: 11559
									class89.addCancelMenuEntry(); // L: 11560
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11564 11565
							for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11566
								if (var27.field1070 && var27.widget.onScroll == var27.args) { // L: 11567
									var27.remove(); // L: 11568
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x; // L: 11574
					var18 = MouseHandler.MouseHandler_y; // L: 11575
					if (MouseHandler.MouseHandler_lastButton != 0) { // L: 11576
						var17 = MouseHandler.MouseHandler_lastPressedX; // L: 11577
						var18 = MouseHandler.MouseHandler_lastPressedY; // L: 11578
					}

					boolean var35 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15; // L: 11580
					if (var9.contentType == 1337) { // L: 11581
						if (!Client.field682 && !Client.isMenuOpen && var35) { // L: 11582
							class59.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) { // L: 11585
						class166.checkIfMinimapClicked(var9, var26, var11); // L: 11586
					} else {
						if (var9.contentType == 1400) { // L: 11589
							class127.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height); // L: 11590
						}

						if (!Client.isMenuOpen && var35) { // L: 11592
							if (var9.contentType == 1400) { // L: 11593
								class127.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18); // L: 11594
							} else {
								class317.method6057(var9); // L: 11597
							}
						}

						boolean var21;
						int var23;
						if (var34) { // L: 11600
							for (int var20 = 0; var20 < var9.field3711.length; ++var20) { // L: 11601
								var21 = false; // L: 11602
								boolean var28 = false; // L: 11603
								if (!var21 && var9.field3711[var20] != null) { // L: 11604
									for (var23 = 0; var23 < var9.field3711[var20].length; ++var23) { // L: 11605
										boolean var24 = false; // L: 11606
										if (var9.field3769 != null) { // L: 11607
											var24 = Client.field750.method4151(var9.field3711[var20][var23]); // L: 11608
										}

										if (class319.method6070(var9.field3711[var20][var23]) || var24) { // L: 11610
											var21 = true; // L: 11611
											if (var9.field3769 != null && var9.field3769[var20] > Client.cycle) { // L: 11612
												break;
											}

											byte var33 = var9.field3700[var20][var23]; // L: 11613
											if (var33 == 0 || ((var33 & 8) == 0 || !Client.field750.method4151(86) && !Client.field750.method4151(82) && !Client.field750.method4151(81)) && ((var33 & 2) == 0 || Client.field750.method4151(86)) && ((var33 & 1) == 0 || Client.field750.method4151(82)) && ((var33 & 4) == 0 || Client.field750.method4151(81))) { // L: 11614 11615 11616 11617 11618
												var28 = true; // L: 11620
												break;
											}
										}
									}
								}

								if (var28) { // L: 11626
									if (var20 < 10) { // L: 11627
										BufferedSource.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) { // L: 11628
										SoundCache.Widget_runOnTargetLeave(); // L: 11629
										ArchiveDiskAction.selectSpell(var9.id, var9.childIndex, class273.Widget_unpackTargetMask(UserComparator8.getWidgetFlags(var9)), var9.itemId); // L: 11630
										Client.field636 = class13.Widget_getSpellActionName(var9); // L: 11631
										if (Client.field636 == null) { // L: 11632
											Client.field636 = "null";
										}

										Client.field734 = var9.dataText + MusicPatchPcmStream.colorStartTag(16777215); // L: 11633
									}

									var23 = var9.field3657[var20]; // L: 11635
									if (var9.field3769 == null) { // L: 11636
										var9.field3769 = new int[var9.field3711.length];
									}

									if (var9.field3630 == null) { // L: 11637
										var9.field3630 = new int[var9.field3711.length];
									}

									if (var23 != 0) { // L: 11638
										if (var9.field3769[var20] == 0) { // L: 11639
											var9.field3769[var20] = var23 + Client.cycle + var9.field3630[var20];
										} else {
											var9.field3769[var20] = var23 + Client.cycle; // L: 11640
										}
									} else {
										var9.field3769[var20] = Integer.MAX_VALUE; // L: 11642
									}
								}

								if (!var21 && var9.field3769 != null) { // L: 11644 11645
									var9.field3769[var20] = 0;
								}
							}
						}

						if (var9.isIf3) { // L: 11649
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11650
								var35 = true;
							} else {
								var35 = false; // L: 11651
							}

							boolean var36 = false; // L: 11652
							if ((MouseHandler.MouseHandler_currentButton == 1 || !KeyHandler.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) { // L: 11653
								var36 = true;
							}

							var21 = false; // L: 11654
							if ((MouseHandler.MouseHandler_lastButton == 1 || !KeyHandler.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) { // L: 11655
								var21 = true;
							}

							if (var21) { // L: 11656
								class353.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11); // L: 11657
							}

							if (var9.method6452()) { // L: 11659
								if (var21) { // L: 11660
									Client.field810.addFirst(new class212(0, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9)); // L: 11661
								}

								if (var36) { // L: 11663
									Client.field810.addFirst(new class212(1, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9)); // L: 11664
								}
							}

							if (var9.contentType == 1400) { // L: 11667
								class127.worldMap.method8533(var17, var18, var35 & var36, var35 & var21); // L: 11668
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && class319.method6069(UserComparator8.getWidgetFlags(var9))) { // L: 11670
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) { // L: 11671
								Client.field761 = true; // L: 11672
								Client.field648 = var26; // L: 11673
								Client.field703 = var11; // L: 11674
							}

							if (var9.hasListener) { // L: 11676
								ScriptEvent var22;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) { // L: 11677
									var22 = new ScriptEvent(); // L: 11678
									var22.field1070 = true; // L: 11679
									var22.widget = var9; // L: 11680
									var22.mouseY = Client.mouseWheelRotation; // L: 11681
									var22.args = var9.onScroll; // L: 11682
									Client.scriptEvents.addFirst(var22); // L: 11683
								}

								if (Client.clickedWidget != null || Client.isMenuOpen) { // L: 11685
									var21 = false; // L: 11686
									var36 = false; // L: 11687
									var35 = false; // L: 11688
								}

								if (!var9.field3762 && var21) { // L: 11690
									var9.field3762 = true; // L: 11691
									if (var9.onClick != null) { // L: 11692
										var22 = new ScriptEvent(); // L: 11693
										var22.field1070 = true; // L: 11694
										var22.widget = var9; // L: 11695
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var26; // L: 11696
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11; // L: 11697
										var22.args = var9.onClick; // L: 11698
										Client.scriptEvents.addFirst(var22); // L: 11699
									}
								}

								if (var9.field3762 && var36 && var9.onClickRepeat != null) { // L: 11702 11703
									var22 = new ScriptEvent(); // L: 11704
									var22.field1070 = true; // L: 11705
									var22.widget = var9; // L: 11706
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11707
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11708
									var22.args = var9.onClickRepeat; // L: 11709
									Client.scriptEvents.addFirst(var22); // L: 11710
								}

								if (var9.field3762 && !var36) { // L: 11713
									var9.field3762 = false; // L: 11714
									if (var9.onRelease != null) { // L: 11715
										var22 = new ScriptEvent(); // L: 11716
										var22.field1070 = true; // L: 11717
										var22.widget = var9; // L: 11718
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11719
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11720
										var22.args = var9.onRelease; // L: 11721
										Client.field729.addFirst(var22); // L: 11722
									}
								}

								if (var36 && var9.onHold != null) { // L: 11725 11726
									var22 = new ScriptEvent(); // L: 11727
									var22.field1070 = true; // L: 11728
									var22.widget = var9; // L: 11729
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11730
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11731
									var22.args = var9.onHold; // L: 11732
									Client.scriptEvents.addFirst(var22); // L: 11733
								}

								if (!var9.field3761 && var35) { // L: 11736
									var9.field3761 = true; // L: 11737
									if (var9.onMouseOver != null) { // L: 11738
										var22 = new ScriptEvent(); // L: 11739
										var22.field1070 = true; // L: 11740
										var22.widget = var9; // L: 11741
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11742
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11743
										var22.args = var9.onMouseOver; // L: 11744
										Client.scriptEvents.addFirst(var22); // L: 11745
									}
								}

								if (var9.field3761 && var35 && var9.onMouseRepeat != null) { // L: 11748 11749
									var22 = new ScriptEvent(); // L: 11750
									var22.field1070 = true; // L: 11751
									var22.widget = var9; // L: 11752
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11753
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11754
									var22.args = var9.onMouseRepeat; // L: 11755
									Client.scriptEvents.addFirst(var22); // L: 11756
								}

								if (var9.field3761 && !var35) { // L: 11759
									var9.field3761 = false; // L: 11760
									if (var9.onMouseLeave != null) { // L: 11761
										var22 = new ScriptEvent(); // L: 11762
										var22.field1070 = true; // L: 11763
										var22.widget = var9; // L: 11764
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11765
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11766
										var22.args = var9.onMouseLeave; // L: 11767
										Client.field729.addFirst(var22); // L: 11768
									}
								}

								if (var9.onTimer != null) { // L: 11771
									var22 = new ScriptEvent(); // L: 11772
									var22.widget = var9; // L: 11773
									var22.args = var9.onTimer; // L: 11774
									Client.field728.addFirst(var22); // L: 11775
								}

								ScriptEvent var25;
								int var37;
								int var39;
								if (var9.onVarTransmit != null && Client.field710 > var9.field3748) { // L: 11777
									if (var9.varTransmitTriggers != null && Client.field710 - var9.field3748 <= 32) { // L: 11778
										label826:
										for (var39 = var9.field3748; var39 < Client.field710; ++var39) { // L: 11785
											var23 = Client.field709[var39 & 31]; // L: 11786

											for (var37 = 0; var37 < var9.varTransmitTriggers.length; ++var37) { // L: 11787
												if (var23 == var9.varTransmitTriggers[var37]) { // L: 11788
													var25 = new ScriptEvent(); // L: 11789
													var25.widget = var9; // L: 11790
													var25.args = var9.onVarTransmit; // L: 11791
													Client.scriptEvents.addFirst(var25); // L: 11792
													break label826; // L: 11793
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11779
										var22.widget = var9; // L: 11780
										var22.args = var9.onVarTransmit; // L: 11781
										Client.scriptEvents.addFirst(var22); // L: 11782
									}

									var9.field3748 = Client.field710; // L: 11798
								}

								if (var9.onInvTransmit != null && Client.field686 > var9.field3675) { // L: 11800
									if (var9.invTransmitTriggers != null && Client.field686 - var9.field3675 <= 32) { // L: 11801
										label802:
										for (var39 = var9.field3675; var39 < Client.field686; ++var39) { // L: 11808
											var23 = Client.field807[var39 & 31]; // L: 11809

											for (var37 = 0; var37 < var9.invTransmitTriggers.length; ++var37) { // L: 11810
												if (var23 == var9.invTransmitTriggers[var37]) { // L: 11811
													var25 = new ScriptEvent(); // L: 11812
													var25.widget = var9; // L: 11813
													var25.args = var9.onInvTransmit; // L: 11814
													Client.scriptEvents.addFirst(var25); // L: 11815
													break label802; // L: 11816
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11802
										var22.widget = var9; // L: 11803
										var22.args = var9.onInvTransmit; // L: 11804
										Client.scriptEvents.addFirst(var22); // L: 11805
									}

									var9.field3675 = Client.field686; // L: 11821
								}

								if (var9.onStatTransmit != null && Client.field711 > var9.field3766) { // L: 11823
									if (var9.statTransmitTriggers != null && Client.field711 - var9.field3766 <= 32) { // L: 11824
										label778:
										for (var39 = var9.field3766; var39 < Client.field711; ++var39) { // L: 11831
											var23 = Client.field713[var39 & 31]; // L: 11832

											for (var37 = 0; var37 < var9.statTransmitTriggers.length; ++var37) { // L: 11833
												if (var23 == var9.statTransmitTriggers[var37]) { // L: 11834
													var25 = new ScriptEvent(); // L: 11835
													var25.widget = var9; // L: 11836
													var25.args = var9.onStatTransmit; // L: 11837
													Client.scriptEvents.addFirst(var25); // L: 11838
													break label778; // L: 11839
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11825
										var22.widget = var9; // L: 11826
										var22.args = var9.onStatTransmit; // L: 11827
										Client.scriptEvents.addFirst(var22); // L: 11828
									}

									var9.field3766 = Client.field711; // L: 11844
								}

								if (Client.chatCycle > var9.field3763 && var9.onChatTransmit != null) { // L: 11846
									var22 = new ScriptEvent(); // L: 11847
									var22.widget = var9; // L: 11848
									var22.args = var9.onChatTransmit; // L: 11849
									Client.scriptEvents.addFirst(var22); // L: 11850
								}

								if (Client.field763 > var9.field3763 && var9.onFriendTransmit != null) { // L: 11852
									var22 = new ScriptEvent(); // L: 11853
									var22.widget = var9; // L: 11854
									var22.args = var9.onFriendTransmit; // L: 11855
									Client.scriptEvents.addFirst(var22); // L: 11856
								}

								if (Client.field719 > var9.field3763 && var9.onClanTransmit != null) { // L: 11858
									var22 = new ScriptEvent(); // L: 11859
									var22.widget = var9; // L: 11860
									var22.args = var9.onClanTransmit; // L: 11861
									Client.scriptEvents.addFirst(var22); // L: 11862
								}

								if (Client.field553 > var9.field3763 && var9.field3739 != null) { // L: 11864
									var22 = new ScriptEvent(); // L: 11865
									var22.widget = var9; // L: 11866
									var22.args = var9.field3739; // L: 11867
									Client.scriptEvents.addFirst(var22); // L: 11868
								}

								if (Client.field622 > var9.field3763 && var9.field3740 != null) { // L: 11870
									var22 = new ScriptEvent(); // L: 11871
									var22.widget = var9; // L: 11872
									var22.args = var9.field3740; // L: 11873
									Client.scriptEvents.addFirst(var22); // L: 11874
								}

								if (Client.field721 > var9.field3763 && var9.onStockTransmit != null) { // L: 11876
									var22 = new ScriptEvent(); // L: 11877
									var22.widget = var9; // L: 11878
									var22.args = var9.onStockTransmit; // L: 11879
									Client.scriptEvents.addFirst(var22); // L: 11880
								}

								if (Client.field723 > var9.field3763 && var9.field3746 != null) { // L: 11882
									var22 = new ScriptEvent(); // L: 11883
									var22.widget = var9; // L: 11884
									var22.args = var9.field3746; // L: 11885
									Client.scriptEvents.addFirst(var22); // L: 11886
								}

								if (Client.field724 > var9.field3763 && var9.onMiscTransmit != null) { // L: 11888
									var22 = new ScriptEvent(); // L: 11889
									var22.widget = var9; // L: 11890
									var22.args = var9.onMiscTransmit; // L: 11891
									Client.scriptEvents.addFirst(var22); // L: 11892
								}

								var9.field3763 = Client.cycleCntr; // L: 11894
								if (var9.onKey != null) { // L: 11895
									for (var39 = 0; var39 < Client.field752; ++var39) { // L: 11896
										ScriptEvent var32 = new ScriptEvent(); // L: 11897
										var32.widget = var9; // L: 11898
										var32.keyTyped = Client.field754[var39]; // L: 11899
										var32.keyPressed = Client.field753[var39]; // L: 11900
										var32.args = var9.onKey; // L: 11901
										Client.scriptEvents.addFirst(var32); // L: 11902
									}
								}

								ScriptEvent var31;
								int[] var38;
								if (var9.field3618 != null) { // L: 11905
									var38 = Client.field750.method4177(); // L: 11906

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 11907
										var31 = new ScriptEvent(); // L: 11908
										var31.widget = var9; // L: 11909
										var31.keyTyped = var38[var23]; // L: 11910
										var31.args = var9.field3618; // L: 11911
										Client.scriptEvents.addFirst(var31); // L: 11912
									}
								}

								if (var9.field3635 != null) { // L: 11915
									var38 = Client.field750.method4154(); // L: 11916

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 11917
										var31 = new ScriptEvent(); // L: 11918
										var31.widget = var9; // L: 11919
										var31.keyTyped = var38[var23]; // L: 11920
										var31.args = var9.field3635; // L: 11921
										Client.scriptEvents.addFirst(var31); // L: 11922
									}
								}
							}
						}

						if (!var9.isIf3) { // L: 11927
							if (Client.clickedWidget != null || Client.isMenuOpen) { // L: 11928
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.field3650 != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11929
								if (var9.mouseOverRedirect >= 0) { // L: 11930
									WorldMapScaleHandler.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									WorldMapScaleHandler.mousedOverWidgetIf1 = var9; // L: 11931
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11933
								class403.field4519 = var9; // L: 11934
							}

							if (var9.scrollHeight > var9.height) { // L: 11936
								class143.method3138(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) { // L: 11938
							updateInterface(var0, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY); // L: 11939
							if (var9.children != null) { // L: 11940
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var29 = (InterfaceParent)Client.interfaceParents.get((long)var9.id); // L: 11941
							if (var29 != null) { // L: 11942
								if (var29.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) { // L: 11943
									for (ScriptEvent var30 = (ScriptEvent)Client.scriptEvents.last(); var30 != null; var30 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11944
										if (var30.field1070) { // L: 11945
											var30.remove(); // L: 11946
											var30.widget.field3761 = false; // L: 11947
										}
									}

									if (class130.widgetDragDuration == 0) { // L: 11950
										Client.clickedWidget = null; // L: 11951
										Client.clickedWidgetParent = null; // L: 11952
									}

									if (!Client.isMenuOpen) { // L: 11954
										class89.addCancelMenuEntry(); // L: 11955
									}
								}

								class10.updateRootInterface(var29.group, var12, var13, var14, var15, var26, var11); // L: 11958
							}
						}
					}
				}
			}
		}

	} // L: 11962

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "-2056572724"
	)
	public static Clipboard method3153() {
		return TileItem.client.method478(); // L: 12925
	}
}
