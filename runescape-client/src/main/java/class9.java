import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("af")
public class class9 implements class371 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	public static final class9 field32;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	public static final class9 field31;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	static final class9 field35;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	static final class9 field33;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	static final class9 field34;
	@ObfuscatedName("gq")
	static String field40;
	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "Lcz;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1495438921
	)
	int field30;
	@ObfuscatedName("az")
	String field36;
	@ObfuscatedName("ap")
	boolean field45;
	@ObfuscatedName("aa")
	boolean field38;

	static {
		field32 = new class9(0, "POST", true, true); // L: 6
		field31 = new class9(1, "GET", true, false); // L: 7
		field35 = new class9(2, "PUT", false, true); // L: 8
		field33 = new class9(3, "PATCH", false, true); // L: 9
		field34 = new class9(4, "DELETE", false, true); // L: 10
	}

	class9(int var1, String var2, boolean var3, boolean var4) {
		this.field30 = var1; // L: 17
		this.field36 = var2; // L: 18
		this.field45 = var3; // L: 19
		this.field38 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2119966021"
	)
	boolean method65() {
		return this.field45; // L: 24
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field30; // L: 37
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1243672924"
	)
	public String method62() {
		return this.field36; // L: 28
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "861678070"
	)
	boolean method63() {
		return this.field38; // L: 32
	}

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "([Lmi;IIIIIIIB)V",
		garbageValue = "-33"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) { // L: 11428
			Widget var9 = var0[var8]; // L: 11429
			if (var9 != null && var9.parentId == var1 && (var9.method6397() || class194.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) { // L: 11430 11431 11432
				if (var9.isIf3) { // L: 11433
					if (class143.isComponentHidden(var9)) { // L: 11434
						continue;
					}
				} else if (var9.type == 0 && var9 != class146.mousedOverWidgetIf1 && class143.isComponentHidden(var9)) { // L: 11437
					continue;
				}

				if (var9.type == 11) { // L: 11439
					if (var9.method6454(FriendsChatManager.urlRequester)) { // L: 11440
						if (var9.method6474()) { // L: 11441
							class218.invalidateWidget(var9); // L: 11442
							Login.revalidateWidgetScroll(var9.children, var9, true); // L: 11443
						}

						if (var9.field3714 != null) { // L: 11445
							ScriptEvent var10 = new ScriptEvent(); // L: 11446
							var10.widget = var9; // L: 11447
							var10.args = var9.field3714; // L: 11448
							Client.scriptEvents.addFirst(var10); // L: 11449
						}
					}
				} else if (var9.type == 12 && var9.method6420()) { // L: 11453 11454
					class218.invalidateWidget(var9); // L: 11455
				}

				int var26 = var9.x + var6; // L: 11458
				int var11 = var7 + var9.y; // L: 11459
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				if (var9.type == 9) { // L: 11464
					var16 = var26; // L: 11465
					var17 = var11; // L: 11466
					var18 = var26 + var9.width; // L: 11467
					int var19 = var11 + var9.height; // L: 11468
					if (var18 < var26) { // L: 11469
						var16 = var18; // L: 11471
						var18 = var26; // L: 11472
					}

					if (var19 < var11) { // L: 11474
						var17 = var19; // L: 11476
						var19 = var11; // L: 11477
					}

					++var18; // L: 11479
					++var19; // L: 11480
					var12 = var16 > var2 ? var16 : var2; // L: 11481
					var13 = var17 > var3 ? var17 : var3; // L: 11482
					var14 = var18 < var4 ? var18 : var4; // L: 11483
					var15 = var19 < var5 ? var19 : var5; // L: 11484
				} else {
					var16 = var26 + var9.width; // L: 11487
					var17 = var11 + var9.height; // L: 11488
					var12 = var26 > var2 ? var26 : var2; // L: 11489
					var13 = var11 > var3 ? var11 : var3; // L: 11490
					var14 = var16 < var4 ? var16 : var4; // L: 11491
					var15 = var17 < var5 ? var17 : var5; // L: 11492
				}

				if (var9 == Client.clickedWidget) { // L: 11494
					Client.field762 = true; // L: 11495
					Client.field564 = var26; // L: 11496
					Client.field636 = var11; // L: 11497
				}

				boolean var34 = false; // L: 11499
				if (var9.field3721) { // L: 11500
					switch(Client.field540) { // L: 11501
					case 0:
						var34 = true; // L: 11508
					case 1:
					default:
						break;
					case 2:
						if (Client.field701 == var9.id >>> 16) { // L: 11503
							var34 = true; // L: 11504
						}
						break;
					case 3:
						if (var9.id == Client.field701) { // L: 11511
							var34 = true; // L: 11512
						}
					}
				}

				if (var34 || !var9.isIf3 || var12 < var14 && var13 < var15) { // L: 11517
					if (var9.isIf3) { // L: 11518
						ScriptEvent var27;
						if (var9.noClickThrough) { // L: 11519
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11520
								for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11521
									if (var27.field1095) { // L: 11522
										var27.remove(); // L: 11523
										var27.widget.field3668 = false; // L: 11524
									}
								}

								class500.method8904(); // L: 11527
								if (class159.widgetDragDuration == 0) { // L: 11528
									Client.clickedWidget = null; // L: 11529
									Client.clickedWidgetParent = null; // L: 11530
								}

								if (!Client.isMenuOpen) { // L: 11532
									class349.addCancelMenuEntry(); // L: 11533
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11537 11538
							for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11539
								if (var27.field1095 && var27.widget.onScroll == var27.args) { // L: 11540
									var27.remove(); // L: 11541
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x; // L: 11547
					var18 = MouseHandler.MouseHandler_y; // L: 11548
					if (MouseHandler.MouseHandler_lastButton != 0) { // L: 11549
						var17 = MouseHandler.MouseHandler_lastPressedX; // L: 11550
						var18 = MouseHandler.MouseHandler_lastPressedY; // L: 11551
					}

					boolean var35 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15; // L: 11553
					if (var9.contentType == 1337) { // L: 11554
						if (!Client.field539 && !Client.isMenuOpen && var35) { // L: 11555
							class134.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) { // L: 11558
						class348.checkIfMinimapClicked(var9, var26, var11); // L: 11559
					} else {
						if (var9.contentType == 1400) { // L: 11562
							Canvas.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height); // L: 11563
						}

						if (!Client.isMenuOpen && var35) { // L: 11565
							if (var9.contentType == 1400) { // L: 11566
								Canvas.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18); // L: 11567
							} else {
								ClanChannelMember.method3120(var9); // L: 11570
							}
						}

						boolean var21;
						int var23;
						if (var34) { // L: 11573
							for (int var20 = 0; var20 < var9.field3697.length; ++var20) { // L: 11574
								var21 = false; // L: 11575
								boolean var28 = false; // L: 11576
								if (!var21 && var9.field3697[var20] != null) { // L: 11577
									for (var23 = 0; var23 < var9.field3697[var20].length; ++var23) { // L: 11578
										boolean var24 = false; // L: 11579
										if (var9.field3792 != null) { // L: 11580
											var24 = Client.field674.method4120(var9.field3697[var20][var23]); // L: 11581
										}

										if (class398.method7558(var9.field3697[var20][var23]) || var24) { // L: 11583
											var21 = true; // L: 11584
											if (var9.field3792 != null && var9.field3792[var20] > Client.cycle) { // L: 11585
												break;
											}

											byte var33 = var9.field3796[var20][var23]; // L: 11586
											if (var33 == 0 || ((var33 & 8) == 0 || !Client.field674.method4120(86) && !Client.field674.method4120(82) && !Client.field674.method4120(81)) && ((var33 & 2) == 0 || Client.field674.method4120(86)) && ((var33 & 1) == 0 || Client.field674.method4120(82)) && ((var33 & 4) == 0 || Client.field674.method4120(81))) { // L: 11587 11588 11589 11590 11591
												var28 = true; // L: 11593
												break;
											}
										}
									}
								}

								if (var28) { // L: 11599
									if (var20 < 10) { // L: 11600
										class47.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) { // L: 11601
										InvDefinition.Widget_runOnTargetLeave(); // L: 11602
										DirectByteArrayCopier.selectSpell(var9.id, var9.childIndex, HealthBarDefinition.Widget_unpackTargetMask(class194.getWidgetFlags(var9)), var9.itemId); // L: 11603
										Client.field709 = class300.Widget_getSpellActionName(var9); // L: 11604
										if (Client.field709 == null) { // L: 11605
											Client.field709 = "null";
										}

										Client.field720 = var9.dataText + class217.colorStartTag(16777215); // L: 11606
									}

									var23 = var9.field3724[var20]; // L: 11608
									if (var9.field3792 == null) { // L: 11609
										var9.field3792 = new int[var9.field3697.length];
									}

									if (var9.field3725 == null) { // L: 11610
										var9.field3725 = new int[var9.field3697.length];
									}

									if (var23 != 0) { // L: 11611
										if (var9.field3792[var20] == 0) { // L: 11612
											var9.field3792[var20] = var23 + Client.cycle + var9.field3725[var20];
										} else {
											var9.field3792[var20] = var23 + Client.cycle; // L: 11613
										}
									} else {
										var9.field3792[var20] = Integer.MAX_VALUE; // L: 11615
									}
								}

								if (!var21 && var9.field3792 != null) { // L: 11617 11618
									var9.field3792[var20] = 0;
								}
							}
						}

						if (var9.isIf3) { // L: 11622
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11623
								var35 = true;
							} else {
								var35 = false; // L: 11624
							}

							boolean var36 = false; // L: 11625
							if ((MouseHandler.MouseHandler_currentButton == 1 || !class183.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) { // L: 11626
								var36 = true;
							}

							var21 = false; // L: 11627
							if ((MouseHandler.MouseHandler_lastButton == 1 || !class183.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) { // L: 11628
								var21 = true;
							}

							if (var21) { // L: 11629
								class227.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11); // L: 11630
							}

							if (var9.method6398()) { // L: 11632
								if (var21) { // L: 11633
									Client.field780.addFirst(new class211(0, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9)); // L: 11634
								}

								if (var36) { // L: 11636
									Client.field780.addFirst(new class211(1, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9)); // L: 11637
								}
							}

							if (var9.contentType == 1400) { // L: 11640
								Canvas.worldMap.method8500(var17, var18, var35 & var36, var35 & var21); // L: 11641
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && class238.method4765(class194.getWidgetFlags(var9))) { // L: 11643
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) { // L: 11644
								Client.field715 = true; // L: 11645
								Client.field716 = var26; // L: 11646
								Client.field717 = var11; // L: 11647
							}

							if (var9.hasListener) { // L: 11649
								ScriptEvent var22;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) { // L: 11650
									var22 = new ScriptEvent(); // L: 11651
									var22.field1095 = true; // L: 11652
									var22.widget = var9; // L: 11653
									var22.mouseY = Client.mouseWheelRotation; // L: 11654
									var22.args = var9.onScroll; // L: 11655
									Client.scriptEvents.addFirst(var22); // L: 11656
								}

								if (Client.clickedWidget != null || Client.isMenuOpen) { // L: 11658
									var21 = false; // L: 11659
									var36 = false; // L: 11660
									var35 = false; // L: 11661
								}

								if (!var9.field3785 && var21) { // L: 11663
									var9.field3785 = true; // L: 11664
									if (var9.onClick != null) { // L: 11665
										var22 = new ScriptEvent(); // L: 11666
										var22.field1095 = true; // L: 11667
										var22.widget = var9; // L: 11668
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var26; // L: 11669
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11; // L: 11670
										var22.args = var9.onClick; // L: 11671
										Client.scriptEvents.addFirst(var22); // L: 11672
									}
								}

								if (var9.field3785 && var36 && var9.onClickRepeat != null) { // L: 11675 11676
									var22 = new ScriptEvent(); // L: 11677
									var22.field1095 = true; // L: 11678
									var22.widget = var9; // L: 11679
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11680
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11681
									var22.args = var9.onClickRepeat; // L: 11682
									Client.scriptEvents.addFirst(var22); // L: 11683
								}

								if (var9.field3785 && !var36) { // L: 11686
									var9.field3785 = false; // L: 11687
									if (var9.onRelease != null) { // L: 11688
										var22 = new ScriptEvent(); // L: 11689
										var22.field1095 = true; // L: 11690
										var22.widget = var9; // L: 11691
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11692
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11693
										var22.args = var9.onRelease; // L: 11694
										Client.field743.addFirst(var22); // L: 11695
									}
								}

								if (var36 && var9.onHold != null) { // L: 11698 11699
									var22 = new ScriptEvent(); // L: 11700
									var22.field1095 = true; // L: 11701
									var22.widget = var9; // L: 11702
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11703
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11704
									var22.args = var9.onHold; // L: 11705
									Client.scriptEvents.addFirst(var22); // L: 11706
								}

								if (!var9.field3668 && var35) { // L: 11709
									var9.field3668 = true; // L: 11710
									if (var9.onMouseOver != null) { // L: 11711
										var22 = new ScriptEvent(); // L: 11712
										var22.field1095 = true; // L: 11713
										var22.widget = var9; // L: 11714
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11715
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11716
										var22.args = var9.onMouseOver; // L: 11717
										Client.scriptEvents.addFirst(var22); // L: 11718
									}
								}

								if (var9.field3668 && var35 && var9.onMouseRepeat != null) { // L: 11721 11722
									var22 = new ScriptEvent(); // L: 11723
									var22.field1095 = true; // L: 11724
									var22.widget = var9; // L: 11725
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11726
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11727
									var22.args = var9.onMouseRepeat; // L: 11728
									Client.scriptEvents.addFirst(var22); // L: 11729
								}

								if (var9.field3668 && !var35) { // L: 11732
									var9.field3668 = false; // L: 11733
									if (var9.onMouseLeave != null) { // L: 11734
										var22 = new ScriptEvent(); // L: 11735
										var22.field1095 = true; // L: 11736
										var22.widget = var9; // L: 11737
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11738
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11739
										var22.args = var9.onMouseLeave; // L: 11740
										Client.field743.addFirst(var22); // L: 11741
									}
								}

								if (var9.onTimer != null) { // L: 11744
									var22 = new ScriptEvent(); // L: 11745
									var22.widget = var9; // L: 11746
									var22.args = var9.onTimer; // L: 11747
									Client.field727.addFirst(var22); // L: 11748
								}

								ScriptEvent var25;
								int var37;
								int var39;
								if (var9.onVarTransmit != null && Client.field724 > var9.field3787) { // L: 11750
									if (var9.varTransmitTriggers != null && Client.field724 - var9.field3787 <= 32) { // L: 11751
										label830:
										for (var39 = var9.field3787; var39 < Client.field724; ++var39) { // L: 11758
											var23 = Client.field723[var39 & 31]; // L: 11759

											for (var37 = 0; var37 < var9.varTransmitTriggers.length; ++var37) { // L: 11760
												if (var23 == var9.varTransmitTriggers[var37]) { // L: 11761
													var25 = new ScriptEvent(); // L: 11762
													var25.widget = var9; // L: 11763
													var25.args = var9.onVarTransmit; // L: 11764
													Client.scriptEvents.addFirst(var25); // L: 11765
													break label830; // L: 11766
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11752
										var22.widget = var9; // L: 11753
										var22.args = var9.onVarTransmit; // L: 11754
										Client.scriptEvents.addFirst(var22); // L: 11755
									}

									var9.field3787 = Client.field724; // L: 11771
								}

								if (var9.onInvTransmit != null && Client.field726 > var9.field3788) { // L: 11773
									if (var9.invTransmitTriggers != null && Client.field726 - var9.field3788 <= 32) { // L: 11774
										label806:
										for (var39 = var9.field3788; var39 < Client.field726; ++var39) { // L: 11781
											var23 = Client.field725[var39 & 31]; // L: 11782

											for (var37 = 0; var37 < var9.invTransmitTriggers.length; ++var37) { // L: 11783
												if (var23 == var9.invTransmitTriggers[var37]) { // L: 11784
													var25 = new ScriptEvent(); // L: 11785
													var25.widget = var9; // L: 11786
													var25.args = var9.onInvTransmit; // L: 11787
													Client.scriptEvents.addFirst(var25); // L: 11788
													break label806; // L: 11789
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11775
										var22.widget = var9; // L: 11776
										var22.args = var9.onInvTransmit; // L: 11777
										Client.scriptEvents.addFirst(var22); // L: 11778
									}

									var9.field3788 = Client.field726; // L: 11794
								}

								if (var9.onStatTransmit != null && Client.field728 > var9.field3789) { // L: 11796
									if (var9.statTransmitTriggers != null && Client.field728 - var9.field3789 <= 32) { // L: 11797
										label782:
										for (var39 = var9.field3789; var39 < Client.field728; ++var39) { // L: 11804
											var23 = Client.field650[var39 & 31]; // L: 11805

											for (var37 = 0; var37 < var9.statTransmitTriggers.length; ++var37) { // L: 11806
												if (var23 == var9.statTransmitTriggers[var37]) { // L: 11807
													var25 = new ScriptEvent(); // L: 11808
													var25.widget = var9; // L: 11809
													var25.args = var9.onStatTransmit; // L: 11810
													Client.scriptEvents.addFirst(var25); // L: 11811
													break label782; // L: 11812
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11798
										var22.widget = var9; // L: 11799
										var22.args = var9.onStatTransmit; // L: 11800
										Client.scriptEvents.addFirst(var22); // L: 11801
									}

									var9.field3789 = Client.field728; // L: 11817
								}

								if (Client.chatCycle > var9.field3718 && var9.onChatTransmit != null) { // L: 11819
									var22 = new ScriptEvent(); // L: 11820
									var22.widget = var9; // L: 11821
									var22.args = var9.onChatTransmit; // L: 11822
									Client.scriptEvents.addFirst(var22); // L: 11823
								}

								if (Client.field732 > var9.field3718 && var9.onFriendTransmit != null) { // L: 11825
									var22 = new ScriptEvent(); // L: 11826
									var22.widget = var9; // L: 11827
									var22.args = var9.onFriendTransmit; // L: 11828
									Client.scriptEvents.addFirst(var22); // L: 11829
								}

								if (Client.field733 > var9.field3718 && var9.onClanTransmit != null) { // L: 11831
									var22 = new ScriptEvent(); // L: 11832
									var22.widget = var9; // L: 11833
									var22.args = var9.onClanTransmit; // L: 11834
									Client.scriptEvents.addFirst(var22); // L: 11835
								}

								if (Client.field734 > var9.field3718 && var9.field3762 != null) { // L: 11837
									var22 = new ScriptEvent(); // L: 11838
									var22.widget = var9; // L: 11839
									var22.args = var9.field3762; // L: 11840
									Client.scriptEvents.addFirst(var22); // L: 11841
								}

								if (Client.field735 > var9.field3718 && var9.field3763 != null) { // L: 11843
									var22 = new ScriptEvent(); // L: 11844
									var22.widget = var9; // L: 11845
									var22.args = var9.field3763; // L: 11846
									Client.scriptEvents.addFirst(var22); // L: 11847
								}

								if (Client.field736 > var9.field3718 && var9.onStockTransmit != null) { // L: 11849
									var22 = new ScriptEvent(); // L: 11850
									var22.widget = var9; // L: 11851
									var22.args = var9.onStockTransmit; // L: 11852
									Client.scriptEvents.addFirst(var22); // L: 11853
								}

								if (Client.field597 > var9.field3718 && var9.field3784 != null) { // L: 11855
									var22 = new ScriptEvent(); // L: 11856
									var22.widget = var9; // L: 11857
									var22.args = var9.field3784; // L: 11858
									Client.scriptEvents.addFirst(var22); // L: 11859
								}

								if (Client.field578 > var9.field3718 && var9.onMiscTransmit != null) { // L: 11861
									var22 = new ScriptEvent(); // L: 11862
									var22.widget = var9; // L: 11863
									var22.args = var9.onMiscTransmit; // L: 11864
									Client.scriptEvents.addFirst(var22); // L: 11865
								}

								var9.field3718 = Client.cycleCntr; // L: 11867
								if (var9.onKey != null) { // L: 11868
									for (var39 = 0; var39 < Client.field766; ++var39) { // L: 11869
										ScriptEvent var32 = new ScriptEvent(); // L: 11870
										var32.widget = var9; // L: 11871
										var32.keyTyped = Client.field768[var39]; // L: 11872
										var32.keyPressed = Client.field767[var39]; // L: 11873
										var32.args = var9.onKey; // L: 11874
										Client.scriptEvents.addFirst(var32); // L: 11875
									}
								}

								ScriptEvent var31;
								int[] var38;
								if (var9.field3767 != null) { // L: 11878
									var38 = Client.field674.method4113(); // L: 11879

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 11880
										var31 = new ScriptEvent(); // L: 11881
										var31.widget = var9; // L: 11882
										var31.keyTyped = var38[var23]; // L: 11883
										var31.args = var9.field3767; // L: 11884
										Client.scriptEvents.addFirst(var31); // L: 11885
									}
								}

								if (var9.field3723 != null) { // L: 11888
									var38 = Client.field674.method4114(); // L: 11889

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 11890
										var31 = new ScriptEvent(); // L: 11891
										var31.widget = var9; // L: 11892
										var31.keyTyped = var38[var23]; // L: 11893
										var31.args = var9.field3723; // L: 11894
										Client.scriptEvents.addFirst(var31); // L: 11895
									}
								}
							}
						}

						if (!var9.isIf3) { // L: 11900
							if (Client.clickedWidget != null || Client.isMenuOpen) { // L: 11901
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.field3675 != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11902
								if (var9.mouseOverRedirect >= 0) { // L: 11903
									class146.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									class146.mousedOverWidgetIf1 = var9; // L: 11904
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11906
								class343.field3868 = var9; // L: 11907
							}

							if (var9.scrollHeight > var9.height) { // L: 11909
								class406.method7612(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) { // L: 11911
							updateInterface(var0, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY); // L: 11912
							if (var9.children != null) { // L: 11913
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var29 = (InterfaceParent)Client.interfaceParents.get((long)var9.id); // L: 11914
							if (var29 != null) { // L: 11915
								if (var29.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) { // L: 11916
									for (ScriptEvent var30 = (ScriptEvent)Client.scriptEvents.last(); var30 != null; var30 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11917
										if (var30.field1095) { // L: 11918
											var30.remove(); // L: 11919
											var30.widget.field3668 = false; // L: 11920
										}
									}

									if (class159.widgetDragDuration == 0) { // L: 11923
										Client.clickedWidget = null; // L: 11924
										Client.clickedWidgetParent = null; // L: 11925
									}

									if (!Client.isMenuOpen) { // L: 11927
										class349.addCancelMenuEntry(); // L: 11928
									}
								}

								LoginScreenAnimation.updateRootInterface(var29.group, var12, var13, var14, var15, var26, var11); // L: 11931
							}
						}
					}
				}
			}
		}

	} // L: 11935

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-1162"
	)
	static void method75() {
		class449.clientPreferences.method2547(Client.field531); // L: 12892
	} // L: 12893
}
