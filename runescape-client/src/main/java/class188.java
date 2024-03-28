import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
final class class188 implements ThreadFactory {
	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load"); // L: 467
	}

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "([Lnt;IIIIIIIB)V",
		garbageValue = "78"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) { // L: 11504
			Widget var9 = var0[var8]; // L: 11505
			if (var9 != null && var9.parentId == var1 && (var9.method6660() || class33.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) { // L: 11506 11507 11508
				if (var9.isIf3) { // L: 11509
					if (class430.isComponentHidden(var9)) { // L: 11510
						continue;
					}
				} else if (var9.type == 0 && var9 != ModelData0.mousedOverWidgetIf1 && class430.isComponentHidden(var9)) { // L: 11513
					continue;
				}

				if (var9.type == 11) { // L: 11515
					if (var9.method6677(class243.field2620, class94.urlRequester)) { // L: 11516
						if (var9.method6697()) { // L: 11517
							WorldMapData_0.invalidateWidget(var9); // L: 11518
							IsaacCipher.revalidateWidgetScroll(var9.children, var9, true); // L: 11519
							var9.method6769().method3440().method3576(3, var9.method6769().method3452()); // L: 11520
						}

						if (var9.field3867 != null) { // L: 11522
							ScriptEvent var10 = new ScriptEvent(); // L: 11523
							var10.widget = var9; // L: 11524
							var10.args = var9.field3867; // L: 11525
							Client.scriptEvents.addFirst(var10); // L: 11526
						}
					}
				} else if (var9.type == 12 && var9.method6685(class243.field2620)) { // L: 11530 11531
					WorldMapData_0.invalidateWidget(var9); // L: 11532
				}

				int var26 = var9.x + var6; // L: 11535
				int var11 = var7 + var9.y; // L: 11536
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				if (var9.type == 9) { // L: 11541
					var16 = var26; // L: 11542
					var17 = var11; // L: 11543
					var18 = var26 + var9.width; // L: 11544
					int var19 = var11 + var9.height; // L: 11545
					if (var18 < var26) { // L: 11546
						var16 = var18; // L: 11548
						var18 = var26; // L: 11549
					}

					if (var19 < var11) { // L: 11551
						var17 = var19; // L: 11553
						var19 = var11; // L: 11554
					}

					++var18; // L: 11556
					++var19; // L: 11557
					var12 = var16 > var2 ? var16 : var2; // L: 11558
					var13 = var17 > var3 ? var17 : var3; // L: 11559
					var14 = var18 < var4 ? var18 : var4; // L: 11560
					var15 = var19 < var5 ? var19 : var5; // L: 11561
				} else {
					var16 = var26 + var9.width; // L: 11564
					var17 = var11 + var9.height; // L: 11565
					var12 = var26 > var2 ? var26 : var2; // L: 11566
					var13 = var11 > var3 ? var11 : var3; // L: 11567
					var14 = var16 < var4 ? var16 : var4; // L: 11568
					var15 = var17 < var5 ? var17 : var5; // L: 11569
				}

				if (var9 == Client.clickedWidget) { // L: 11571
					Client.field702 = true; // L: 11572
					Client.field570 = var26; // L: 11573
					Client.field704 = var11; // L: 11574
				}

				boolean var34 = false; // L: 11576
				if (var9.field3818) { // L: 11577
					switch(Client.field684) { // L: 11578
					case 0:
						var34 = true; // L: 11590
					case 1:
					default:
						break;
					case 2:
						if (Client.field685 == var9.id >>> 16) { // L: 11585
							var34 = true; // L: 11586
						}
						break;
					case 3:
						if (var9.id == Client.field685) { // L: 11580
							var34 = true; // L: 11581
						}
					}
				}

				if (var34 || !var9.isIf3 || var12 < var14 && var13 < var15) { // L: 11594
					if (var9.isIf3) { // L: 11595
						ScriptEvent var27;
						if (var9.noClickThrough) { // L: 11596
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11597
								for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11598
									if (var27.field1078) { // L: 11599
										var27.remove(); // L: 11600
										var27.widget.field3881 = false; // L: 11601
									}
								}

								class159.method3345(); // L: 11604
								if (class179.widgetDragDuration == 0) { // L: 11605
									Client.clickedWidget = null; // L: 11606
									Client.clickedWidgetParent = null; // L: 11607
								}

								if (!Client.isMenuOpen) { // L: 11609
									class344.addCancelMenuEntry(); // L: 11610
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11614 11615
							for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11616
								if (var27.field1078 && var27.widget.onScroll == var27.args) { // L: 11617
									var27.remove(); // L: 11618
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x; // L: 11624
					var18 = MouseHandler.MouseHandler_y; // L: 11625
					if (MouseHandler.MouseHandler_lastButton != 0) { // L: 11626
						var17 = MouseHandler.MouseHandler_lastPressedX; // L: 11627
						var18 = MouseHandler.MouseHandler_lastPressedY; // L: 11628
					}

					boolean var35 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15; // L: 11630
					if (var9.contentType == 1337) { // L: 11631
						if (!Client.field521 && !Client.isMenuOpen && var35) { // L: 11632
							Skills.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) { // L: 11635
						UrlRequest.checkIfMinimapClicked(var9, var26, var11); // L: 11636
					} else {
						if (var9.contentType == 1400) { // L: 11639
							ModeWhere.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height); // L: 11640
						}

						if (!Client.isMenuOpen && var35) { // L: 11642
							if (var9.contentType == 1400) { // L: 11643
								ModeWhere.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18); // L: 11644
							} else {
								class31.method440(var9); // L: 11647
							}
						}

						boolean var21;
						int var23;
						if (var34) { // L: 11650
							for (int var20 = 0; var20 < var9.field3836.length; ++var20) { // L: 11651
								var21 = false; // L: 11652
								boolean var28 = false; // L: 11653
								if (!var21 && var9.field3836[var20] != null) { // L: 11654
									for (var23 = 0; var23 < var9.field3836[var20].length; ++var23) { // L: 11655
										boolean var24 = false; // L: 11656
										if (var9.field3766 != null) { // L: 11657
											var24 = Client.field748.method4318(var9.field3836[var20][var23]); // L: 11658
										}

										if (Projectile.method2171(var9.field3836[var20][var23]) || var24) { // L: 11660
											var21 = true; // L: 11661
											if (var9.field3766 != null && var9.field3766[var20] > Client.cycle) { // L: 11662
												break;
											}

											byte var33 = var9.field3820[var20][var23]; // L: 11663
											if (var33 == 0 || ((var33 & 8) == 0 || !Client.field748.method4318(86) && !Client.field748.method4318(82) && !Client.field748.method4318(81)) && ((var33 & 2) == 0 || Client.field748.method4318(86)) && ((var33 & 1) == 0 || Client.field748.method4318(82)) && ((var33 & 4) == 0 || Client.field748.method4318(81))) { // L: 11664 11665 11666 11667 11668
												var28 = true; // L: 11670
												break;
											}
										}
									}
								}

								if (var28) { // L: 11676
									if (var20 < 10) { // L: 11677
										AbstractArchive.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) { // L: 11678
										WorldMapCacheName.method5751(); // L: 11679
										Interpreter.method2068(var9.id, var9.childIndex, class342.Widget_unpackTargetMask(class33.getWidgetFlags(var9)), var9.itemId); // L: 11680
										Client.field557 = class160.Widget_getSpellActionName(var9); // L: 11681
										if (Client.field557 == null) { // L: 11682
											Client.field557 = "null";
										}

										Client.field801 = var9.dataText + Decimator.colorStartTag(16777215); // L: 11683
									}

									var23 = var9.field3821[var20]; // L: 11685
									if (var9.field3766 == null) { // L: 11686
										var9.field3766 = new int[var9.field3836.length];
									}

									if (var9.field3738 == null) { // L: 11687
										var9.field3738 = new int[var9.field3836.length];
									}

									if (var23 != 0) { // L: 11688
										if (var9.field3766[var20] == 0) { // L: 11689
											var9.field3766[var20] = var23 + Client.cycle + var9.field3738[var20];
										} else {
											var9.field3766[var20] = var23 + Client.cycle; // L: 11690
										}
									} else {
										var9.field3766[var20] = Integer.MAX_VALUE; // L: 11692
									}
								}

								if (!var21 && var9.field3766 != null) { // L: 11694 11695
									var9.field3766[var20] = 0;
								}
							}
						}

						if (var9.isIf3) { // L: 11699
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11700
								var35 = true;
							} else {
								var35 = false; // L: 11701
							}

							boolean var36 = false; // L: 11702
							if ((MouseHandler.MouseHandler_currentButton == 1 || !class412.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) { // L: 11703
								var36 = true;
							}

							var21 = false; // L: 11704
							if ((MouseHandler.MouseHandler_lastButton == 1 || !class412.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) { // L: 11705
								var21 = true;
							}

							if (var21) { // L: 11706
								class31.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11); // L: 11707
							}

							if (var9.method6661()) { // L: 11709
								if (var21) { // L: 11710
									Client.field726.addFirst(new class227(0, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9)); // L: 11711
								}

								if (var36) { // L: 11713
									Client.field726.addFirst(new class227(1, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9)); // L: 11714
								}
							}

							if (var9.contentType == 1400) { // L: 11717
								ModeWhere.worldMap.method8843(var17, var18, var35 & var36, var35 & var21); // L: 11718
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && WorldMapSection1.method5719(class33.getWidgetFlags(var9))) { // L: 11720
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) { // L: 11721
								Client.field699 = true; // L: 11722
								Client.field700 = var26; // L: 11723
								Client.field701 = var11; // L: 11724
							}

							if (var9.hasListener) { // L: 11726
								ScriptEvent var22;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) { // L: 11727
									var22 = new ScriptEvent(); // L: 11728
									var22.field1078 = true; // L: 11729
									var22.widget = var9; // L: 11730
									var22.mouseY = Client.mouseWheelRotation; // L: 11731
									var22.args = var9.onScroll; // L: 11732
									Client.scriptEvents.addFirst(var22); // L: 11733
								}

								if (Client.clickedWidget != null || Client.isMenuOpen) { // L: 11735
									var21 = false; // L: 11736
									var36 = false; // L: 11737
									var35 = false; // L: 11738
								}

								if (!var9.field3882 && var21) { // L: 11740
									var9.field3882 = true; // L: 11741
									if (var9.onClick != null) { // L: 11742
										var22 = new ScriptEvent(); // L: 11743
										var22.field1078 = true; // L: 11744
										var22.widget = var9; // L: 11745
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var26; // L: 11746
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11; // L: 11747
										var22.args = var9.onClick; // L: 11748
										Client.scriptEvents.addFirst(var22); // L: 11749
									}
								}

								if (var9.field3882 && var36 && var9.onClickRepeat != null) { // L: 11752 11753
									var22 = new ScriptEvent(); // L: 11754
									var22.field1078 = true; // L: 11755
									var22.widget = var9; // L: 11756
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11757
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11758
									var22.args = var9.onClickRepeat; // L: 11759
									Client.scriptEvents.addFirst(var22); // L: 11760
								}

								if (var9.field3882 && !var36) { // L: 11763
									var9.field3882 = false; // L: 11764
									if (var9.onRelease != null) { // L: 11765
										var22 = new ScriptEvent(); // L: 11766
										var22.field1078 = true; // L: 11767
										var22.widget = var9; // L: 11768
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11769
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11770
										var22.args = var9.onRelease; // L: 11771
										Client.field520.addFirst(var22); // L: 11772
									}
								}

								if (var36 && var9.onHold != null) { // L: 11775 11776
									var22 = new ScriptEvent(); // L: 11777
									var22.field1078 = true; // L: 11778
									var22.widget = var9; // L: 11779
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11780
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11781
									var22.args = var9.onHold; // L: 11782
									Client.scriptEvents.addFirst(var22); // L: 11783
								}

								if (!var9.field3881 && var35) { // L: 11786
									var9.field3881 = true; // L: 11787
									if (var9.onMouseOver != null) { // L: 11788
										var22 = new ScriptEvent(); // L: 11789
										var22.field1078 = true; // L: 11790
										var22.widget = var9; // L: 11791
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11792
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11793
										var22.args = var9.onMouseOver; // L: 11794
										Client.scriptEvents.addFirst(var22); // L: 11795
									}
								}

								if (var9.field3881 && var35 && var9.onMouseRepeat != null) { // L: 11798 11799
									var22 = new ScriptEvent(); // L: 11800
									var22.field1078 = true; // L: 11801
									var22.widget = var9; // L: 11802
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11803
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11804
									var22.args = var9.onMouseRepeat; // L: 11805
									Client.scriptEvents.addFirst(var22); // L: 11806
								}

								if (var9.field3881 && !var35) { // L: 11809
									var9.field3881 = false; // L: 11810
									if (var9.onMouseLeave != null) { // L: 11811
										var22 = new ScriptEvent(); // L: 11812
										var22.field1078 = true; // L: 11813
										var22.widget = var9; // L: 11814
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11815
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11816
										var22.args = var9.onMouseLeave; // L: 11817
										Client.field520.addFirst(var22); // L: 11818
									}
								}

								if (var9.onTimer != null) { // L: 11821
									var22 = new ScriptEvent(); // L: 11822
									var22.widget = var9; // L: 11823
									var22.args = var9.onTimer; // L: 11824
									Client.field593.addFirst(var22); // L: 11825
								}

								ScriptEvent var25;
								int var37;
								int var39;
								if (var9.onVarTransmit != null && Client.field708 > var9.field3884) { // L: 11827
									if (var9.varTransmitTriggers != null && Client.field708 - var9.field3884 <= 32) { // L: 11828
										label827:
										for (var39 = var9.field3884; var39 < Client.field708; ++var39) { // L: 11835
											var23 = Client.field707[var39 & 31]; // L: 11836

											for (var37 = 0; var37 < var9.varTransmitTriggers.length; ++var37) { // L: 11837
												if (var23 == var9.varTransmitTriggers[var37]) { // L: 11838
													var25 = new ScriptEvent(); // L: 11839
													var25.widget = var9; // L: 11840
													var25.args = var9.onVarTransmit; // L: 11841
													Client.scriptEvents.addFirst(var25); // L: 11842
													break label827; // L: 11843
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11829
										var22.widget = var9; // L: 11830
										var22.args = var9.onVarTransmit; // L: 11831
										Client.scriptEvents.addFirst(var22); // L: 11832
									}

									var9.field3884 = Client.field708; // L: 11848
								}

								if (var9.onInvTransmit != null && Client.field710 > var9.field3847) { // L: 11850
									if (var9.invTransmitTriggers != null && Client.field710 - var9.field3847 <= 32) { // L: 11851
										label803:
										for (var39 = var9.field3847; var39 < Client.field710; ++var39) { // L: 11858
											var23 = Client.field572[var39 & 31]; // L: 11859

											for (var37 = 0; var37 < var9.invTransmitTriggers.length; ++var37) { // L: 11860
												if (var23 == var9.invTransmitTriggers[var37]) { // L: 11861
													var25 = new ScriptEvent(); // L: 11862
													var25.widget = var9; // L: 11863
													var25.args = var9.onInvTransmit; // L: 11864
													Client.scriptEvents.addFirst(var25); // L: 11865
													break label803; // L: 11866
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11852
										var22.widget = var9; // L: 11853
										var22.args = var9.onInvTransmit; // L: 11854
										Client.scriptEvents.addFirst(var22); // L: 11855
									}

									var9.field3847 = Client.field710; // L: 11871
								}

								if (var9.onStatTransmit != null && Client.field658 > var9.field3886) { // L: 11873
									if (var9.statTransmitTriggers != null && Client.field658 - var9.field3886 <= 32) { // L: 11874
										label779:
										for (var39 = var9.field3886; var39 < Client.field658; ++var39) { // L: 11881
											var23 = Client.field711[var39 & 31]; // L: 11882

											for (var37 = 0; var37 < var9.statTransmitTriggers.length; ++var37) { // L: 11883
												if (var23 == var9.statTransmitTriggers[var37]) { // L: 11884
													var25 = new ScriptEvent(); // L: 11885
													var25.widget = var9; // L: 11886
													var25.args = var9.onStatTransmit; // L: 11887
													Client.scriptEvents.addFirst(var25); // L: 11888
													break label779; // L: 11889
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11875
										var22.widget = var9; // L: 11876
										var22.args = var9.onStatTransmit; // L: 11877
										Client.scriptEvents.addFirst(var22); // L: 11878
									}

									var9.field3886 = Client.field658; // L: 11894
								}

								if (Client.chatCycle > var9.field3883 && var9.onChatTransmit != null) { // L: 11896
									var22 = new ScriptEvent(); // L: 11897
									var22.widget = var9; // L: 11898
									var22.args = var9.onChatTransmit; // L: 11899
									Client.scriptEvents.addFirst(var22); // L: 11900
								}

								if (Client.field716 > var9.field3883 && var9.onFriendTransmit != null) { // L: 11902
									var22 = new ScriptEvent(); // L: 11903
									var22.widget = var9; // L: 11904
									var22.args = var9.onFriendTransmit; // L: 11905
									Client.scriptEvents.addFirst(var22); // L: 11906
								}

								if (Client.field717 > var9.field3883 && var9.onClanTransmit != null) { // L: 11908
									var22 = new ScriptEvent(); // L: 11909
									var22.widget = var9; // L: 11910
									var22.args = var9.onClanTransmit; // L: 11911
									Client.scriptEvents.addFirst(var22); // L: 11912
								}

								if (Client.field681 > var9.field3883 && var9.field3859 != null) { // L: 11914
									var22 = new ScriptEvent(); // L: 11915
									var22.widget = var9; // L: 11916
									var22.args = var9.field3859; // L: 11917
									Client.scriptEvents.addFirst(var22); // L: 11918
								}

								if (Client.field719 > var9.field3883 && var9.field3860 != null) { // L: 11920
									var22 = new ScriptEvent(); // L: 11921
									var22.widget = var9; // L: 11922
									var22.args = var9.field3860; // L: 11923
									Client.scriptEvents.addFirst(var22); // L: 11924
								}

								if (Client.field720 > var9.field3883 && var9.onStockTransmit != null) { // L: 11926
									var22 = new ScriptEvent(); // L: 11927
									var22.widget = var9; // L: 11928
									var22.args = var9.onStockTransmit; // L: 11929
									Client.scriptEvents.addFirst(var22); // L: 11930
								}

								if (Client.field721 > var9.field3883 && var9.field3866 != null) { // L: 11932
									var22 = new ScriptEvent(); // L: 11933
									var22.widget = var9; // L: 11934
									var22.args = var9.field3866; // L: 11935
									Client.scriptEvents.addFirst(var22); // L: 11936
								}

								if (Client.field722 > var9.field3883 && var9.onMiscTransmit != null) { // L: 11938
									var22 = new ScriptEvent(); // L: 11939
									var22.widget = var9; // L: 11940
									var22.args = var9.onMiscTransmit; // L: 11941
									Client.scriptEvents.addFirst(var22); // L: 11942
								}

								var9.field3883 = Client.cycleCntr; // L: 11944
								if (var9.onKey != null) { // L: 11945
									for (var39 = 0; var39 < Client.field611; ++var39) { // L: 11946
										ScriptEvent var32 = new ScriptEvent(); // L: 11947
										var32.widget = var9; // L: 11948
										var32.keyTyped = Client.field767[var39]; // L: 11949
										var32.keyPressed = Client.field512[var39]; // L: 11950
										var32.args = var9.onKey; // L: 11951
										Client.scriptEvents.addFirst(var32); // L: 11952
									}
								}

								ScriptEvent var31;
								int[] var38;
								if (var9.field3855 != null) { // L: 11955
									var38 = Client.field748.method4320(); // L: 11956

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 11957
										var31 = new ScriptEvent(); // L: 11958
										var31.widget = var9; // L: 11959
										var31.keyTyped = var38[var23]; // L: 11960
										var31.args = var9.field3855; // L: 11961
										Client.scriptEvents.addFirst(var31); // L: 11962
									}
								}

								if (var9.field3856 != null) { // L: 11965
									var38 = Client.field748.method4321(); // L: 11966

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 11967
										var31 = new ScriptEvent(); // L: 11968
										var31.widget = var9; // L: 11969
										var31.keyTyped = var38[var23]; // L: 11970
										var31.args = var9.field3856; // L: 11971
										Client.scriptEvents.addFirst(var31); // L: 11972
									}
								}
							}
						}

						if (!var9.isIf3) { // L: 11977
							if (Client.clickedWidget != null || Client.isMenuOpen) { // L: 11978
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.field3827 != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11979
								if (var9.mouseOverRedirect >= 0) { // L: 11980
									ModelData0.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									ModelData0.mousedOverWidgetIf1 = var9; // L: 11981
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11983
								class288.field3137 = var9; // L: 11984
							}

							if (var9.scrollHeight > var9.height) { // L: 11986
								class130.method3010(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) { // L: 11988
							updateInterface(var0, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY); // L: 11989
							if (var9.children != null) { // L: 11990
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var29 = (InterfaceParent)Client.interfaceParents.get((long)var9.id); // L: 11991
							if (var29 != null) { // L: 11992
								if (var29.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) { // L: 11993
									for (ScriptEvent var30 = (ScriptEvent)Client.scriptEvents.last(); var30 != null; var30 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11994
										if (var30.field1078) { // L: 11995
											var30.remove(); // L: 11996
											var30.widget.field3881 = false; // L: 11997
										}
									}

									if (class179.widgetDragDuration == 0) { // L: 12000
										Client.clickedWidget = null; // L: 12001
										Client.clickedWidgetParent = null; // L: 12002
									}

									if (!Client.isMenuOpen) { // L: 12004
										class344.addCancelMenuEntry(); // L: 12005
									}
								}

								class31.method435(var29.group, var12, var13, var14, var15, var26, var11); // L: 12008
							}
						}
					}
				}
			}
		}

	} // L: 12012
}
