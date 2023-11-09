import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
	@ObfuscatedName("at")
	@Export("reversed")
	final boolean reversed;

	public UserComparator3(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqg;Lqg;I)I",
		garbageValue = "1689179887"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.world != var1.world) { // L: 14
			return this.reversed ? var1.world - var2.world : var2.world - var1.world; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "455985244"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 48
		return var1 == null ? 0 : var1.size(); // L: 49 50
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "([Lmb;IIIIIIII)V",
		garbageValue = "-1666219635"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) { // L: 11368
			Widget var9 = var0[var8]; // L: 11369
			if (var9 != null && var9.parentId == var1 && (var9.method6456() || StudioGame.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) { // L: 11370 11371 11372
				if (var9.isIf3) { // L: 11373
					if (UserComparator9.isComponentHidden(var9)) { // L: 11374
						continue;
					}
				} else if (var9.type == 0 && var9 != ClanChannel.mousedOverWidgetIf1 && UserComparator9.isComponentHidden(var9)) { // L: 11377
					continue;
				}

				if (var9.type == 11) { // L: 11379
					if (var9.method6377(class47.urlRequester)) { // L: 11380
						if (var9.method6359()) { // L: 11381
							Messages.invalidateWidget(var9); // L: 11382
							Projectile.revalidateWidgetScroll(var9.children, var9, true); // L: 11383
						}

						if (var9.field3703 != null) { // L: 11385
							ScriptEvent var10 = new ScriptEvent(); // L: 11386
							var10.widget = var9; // L: 11387
							var10.args = var9.field3703; // L: 11388
							Client.scriptEvents.addFirst(var10); // L: 11389
						}
					}
				} else if (var9.type == 12 && var9.method6429()) { // L: 11393 11394
					Messages.invalidateWidget(var9); // L: 11395
				}

				int var26 = var9.x + var6; // L: 11398
				int var11 = var7 + var9.y; // L: 11399
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				if (var9.type == 9) { // L: 11404
					var16 = var26; // L: 11405
					var17 = var11; // L: 11406
					var18 = var26 + var9.width; // L: 11407
					int var19 = var11 + var9.height; // L: 11408
					if (var18 < var26) { // L: 11409
						var16 = var18; // L: 11411
						var18 = var26; // L: 11412
					}

					if (var19 < var11) { // L: 11414
						var17 = var19; // L: 11416
						var19 = var11; // L: 11417
					}

					++var18; // L: 11419
					++var19; // L: 11420
					var12 = var16 > var2 ? var16 : var2; // L: 11421
					var13 = var17 > var3 ? var17 : var3; // L: 11422
					var14 = var18 < var4 ? var18 : var4; // L: 11423
					var15 = var19 < var5 ? var19 : var5; // L: 11424
				} else {
					var16 = var26 + var9.width; // L: 11427
					var17 = var11 + var9.height; // L: 11428
					var12 = var26 > var2 ? var26 : var2; // L: 11429
					var13 = var11 > var3 ? var11 : var3; // L: 11430
					var14 = var16 < var4 ? var16 : var4; // L: 11431
					var15 = var17 < var5 ? var17 : var5; // L: 11432
				}

				if (var9 == Client.clickedWidget) { // L: 11434
					Client.field693 = true; // L: 11435
					Client.field694 = var26; // L: 11436
					Client.field735 = var11; // L: 11437
				}

				boolean var34 = false; // L: 11439
				if (var9.field3677) { // L: 11440
					switch(Client.field517) { // L: 11441
					case 0:
						var34 = true; // L: 11443
					case 1:
					default:
						break;
					case 2:
						if (Client.field613 == var9.id >>> 16) { // L: 11451
							var34 = true; // L: 11452
						}
						break;
					case 3:
						if (var9.id == Client.field613) { // L: 11446
							var34 = true; // L: 11447
						}
					}
				}

				if (var34 || !var9.isIf3 || var12 < var14 && var13 < var15) { // L: 11457
					if (var9.isIf3) { // L: 11458
						ScriptEvent var27;
						if (var9.noClickThrough) { // L: 11459
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11460
								for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11461
									if (var27.field1062) { // L: 11462
										var27.remove(); // L: 11463
										var27.widget.field3740 = false; // L: 11464
									}
								}

								ChatChannel.method2159(); // L: 11467
								if (class348.widgetDragDuration == 0) { // L: 11468
									Client.clickedWidget = null; // L: 11469
									Client.clickedWidgetParent = null; // L: 11470
								}

								if (!Client.isMenuOpen) { // L: 11472
									class442.addCancelMenuEntry(); // L: 11473
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11477 11478
							for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11479
								if (var27.field1062 && var27.widget.onScroll == var27.args) { // L: 11480
									var27.remove(); // L: 11481
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x; // L: 11487
					var18 = MouseHandler.MouseHandler_y; // L: 11488
					if (MouseHandler.MouseHandler_lastButton != 0) { // L: 11489
						var17 = MouseHandler.MouseHandler_lastPressedX; // L: 11490
						var18 = MouseHandler.MouseHandler_lastPressedY; // L: 11491
					}

					boolean var35 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15; // L: 11493
					if (var9.contentType == 1337) { // L: 11494
						if (!Client.field516 && !Client.isMenuOpen && var35) { // L: 11495
							class163.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) { // L: 11498
						Friend.checkIfMinimapClicked(var9, var26, var11); // L: 11499
					} else {
						if (var9.contentType == 1400) { // L: 11502
							ScriptFrame.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height); // L: 11503
						}

						if (!Client.isMenuOpen && var35) { // L: 11505
							if (var9.contentType == 1400) { // L: 11506
								ScriptFrame.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18); // L: 11507
							} else {
								ModeWhere.method6925(var9); // L: 11510
							}
						}

						boolean var21;
						int var23;
						if (var34) { // L: 11513
							for (int var20 = 0; var20 < var9.field3678.length; ++var20) { // L: 11514
								var21 = false; // L: 11515
								boolean var28 = false; // L: 11516
								if (!var21 && var9.field3678[var20] != null) { // L: 11517
									for (var23 = 0; var23 < var9.field3678[var20].length; ++var23) { // L: 11518
										boolean var24 = false; // L: 11519
										if (var9.field3669 != null) { // L: 11520
											var24 = Client.field739.method4134(var9.field3678[var20][var23]); // L: 11521
										}

										if (FaceNormal.method4720(var9.field3678[var20][var23]) || var24) { // L: 11523
											var21 = true; // L: 11524
											if (var9.field3669 != null && var9.field3669[var20] > Client.cycle) { // L: 11525
												break;
											}

											byte var33 = var9.field3671[var20][var23]; // L: 11526
											if (var33 == 0 || ((var33 & 8) == 0 || !Client.field739.method4134(86) && !Client.field739.method4134(82) && !Client.field739.method4134(81)) && ((var33 & 2) == 0 || Client.field739.method4134(86)) && ((var33 & 1) == 0 || Client.field739.method4134(82)) && ((var33 & 4) == 0 || Client.field739.method4134(81))) { // L: 11527 11528 11529 11530 11531
												var28 = true; // L: 11533
												break; // L: 11534
											}
										}
									}
								}

								if (var28) { // L: 11539
									if (var20 < 10) { // L: 11540
										InvDefinition.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) { // L: 11541
										FriendsList.Widget_runOnTargetLeave(); // L: 11542
										FriendLoginUpdate.selectSpell(var9.id, var9.childIndex, LoginScreenAnimation.Widget_unpackTargetMask(StudioGame.getWidgetFlags(var9)), var9.itemId); // L: 11543
										Client.field671 = BuddyRankComparator.Widget_getSpellActionName(var9); // L: 11544
										if (Client.field671 == null) { // L: 11545
											Client.field671 = "null";
										}

										Client.field716 = var9.dataText + class349.colorStartTag(16777215); // L: 11546
									}

									var23 = var9.field3639[var20]; // L: 11548
									if (var9.field3669 == null) { // L: 11549
										var9.field3669 = new int[var9.field3678.length];
									}

									if (var9.field3681 == null) { // L: 11550
										var9.field3681 = new int[var9.field3678.length];
									}

									if (var23 != 0) { // L: 11551
										if (var9.field3669[var20] == 0) { // L: 11552
											var9.field3669[var20] = var23 + Client.cycle + var9.field3681[var20];
										} else {
											var9.field3669[var20] = var23 + Client.cycle; // L: 11553
										}
									} else {
										var9.field3669[var20] = Integer.MAX_VALUE; // L: 11555
									}
								}

								if (!var21 && var9.field3669 != null) { // L: 11557 11558
									var9.field3669[var20] = 0;
								}
							}
						}

						if (var9.isIf3) { // L: 11562
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11563
								var35 = true;
							} else {
								var35 = false; // L: 11564
							}

							boolean var36 = false; // L: 11565
							if ((MouseHandler.MouseHandler_currentButton == 1 || !class305.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) { // L: 11566
								var36 = true;
							}

							var21 = false; // L: 11567
							if ((MouseHandler.MouseHandler_lastButton == 1 || !class305.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) { // L: 11568
								var21 = true;
							}

							if (var21) { // L: 11569
								UserComparator10.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11); // L: 11570
							}

							if (var9.method6363()) { // L: 11572
								if (var21) { // L: 11573
									Client.field742.addFirst(new class210(0, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9)); // L: 11574
								}

								if (var36) { // L: 11576
									Client.field742.addFirst(new class210(1, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9)); // L: 11577
								}
							}

							if (var9.contentType == 1400) { // L: 11580
								ScriptFrame.worldMap.method8389(var17, var18, var35 & var36, var35 & var21); // L: 11581
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && class145.method3147(StudioGame.getWidgetFlags(var9))) { // L: 11583
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) { // L: 11584
								Client.field639 = true; // L: 11585
								Client.field534 = var26; // L: 11586
								Client.field692 = var11; // L: 11587
							}

							if (var9.hasListener) { // L: 11589
								ScriptEvent var22;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) { // L: 11590
									var22 = new ScriptEvent(); // L: 11591
									var22.field1062 = true; // L: 11592
									var22.widget = var9; // L: 11593
									var22.mouseY = Client.mouseWheelRotation; // L: 11594
									var22.args = var9.onScroll; // L: 11595
									Client.scriptEvents.addFirst(var22); // L: 11596
								}

								if (Client.clickedWidget != null || Client.isMenuOpen) { // L: 11598
									var21 = false; // L: 11599
									var36 = false; // L: 11600
									var35 = false; // L: 11601
								}

								if (!var9.field3741 && var21) { // L: 11603
									var9.field3741 = true; // L: 11604
									if (var9.onClick != null) { // L: 11605
										var22 = new ScriptEvent(); // L: 11606
										var22.field1062 = true; // L: 11607
										var22.widget = var9; // L: 11608
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var26; // L: 11609
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11; // L: 11610
										var22.args = var9.onClick; // L: 11611
										Client.scriptEvents.addFirst(var22); // L: 11612
									}
								}

								if (var9.field3741 && var36 && var9.onClickRepeat != null) { // L: 11615 11616
									var22 = new ScriptEvent(); // L: 11617
									var22.field1062 = true; // L: 11618
									var22.widget = var9; // L: 11619
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11620
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11621
									var22.args = var9.onClickRepeat; // L: 11622
									Client.scriptEvents.addFirst(var22); // L: 11623
								}

								if (var9.field3741 && !var36) { // L: 11626
									var9.field3741 = false; // L: 11627
									if (var9.onRelease != null) { // L: 11628
										var22 = new ScriptEvent(); // L: 11629
										var22.field1062 = true; // L: 11630
										var22.widget = var9; // L: 11631
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11632
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11633
										var22.args = var9.onRelease; // L: 11634
										Client.field710.addFirst(var22); // L: 11635
									}
								}

								if (var36 && var9.onHold != null) { // L: 11638 11639
									var22 = new ScriptEvent(); // L: 11640
									var22.field1062 = true; // L: 11641
									var22.widget = var9; // L: 11642
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11643
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11644
									var22.args = var9.onHold; // L: 11645
									Client.scriptEvents.addFirst(var22); // L: 11646
								}

								if (!var9.field3740 && var35) { // L: 11649
									var9.field3740 = true; // L: 11650
									if (var9.onMouseOver != null) { // L: 11651
										var22 = new ScriptEvent(); // L: 11652
										var22.field1062 = true; // L: 11653
										var22.widget = var9; // L: 11654
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11655
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11656
										var22.args = var9.onMouseOver; // L: 11657
										Client.scriptEvents.addFirst(var22); // L: 11658
									}
								}

								if (var9.field3740 && var35 && var9.onMouseRepeat != null) { // L: 11661 11662
									var22 = new ScriptEvent(); // L: 11663
									var22.field1062 = true; // L: 11664
									var22.widget = var9; // L: 11665
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11666
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11667
									var22.args = var9.onMouseRepeat; // L: 11668
									Client.scriptEvents.addFirst(var22); // L: 11669
								}

								if (var9.field3740 && !var35) { // L: 11672
									var9.field3740 = false; // L: 11673
									if (var9.onMouseLeave != null) { // L: 11674
										var22 = new ScriptEvent(); // L: 11675
										var22.field1062 = true; // L: 11676
										var22.widget = var9; // L: 11677
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11678
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11679
										var22.args = var9.onMouseLeave; // L: 11680
										Client.field710.addFirst(var22); // L: 11681
									}
								}

								if (var9.onTimer != null) { // L: 11684
									var22 = new ScriptEvent(); // L: 11685
									var22.widget = var9; // L: 11686
									var22.args = var9.onTimer; // L: 11687
									Client.field717.addFirst(var22); // L: 11688
								}

								ScriptEvent var25;
								int var37;
								int var39;
								if (var9.onVarTransmit != null && Client.field699 > var9.field3743) { // L: 11690
									if (var9.varTransmitTriggers != null && Client.field699 - var9.field3743 <= 32) { // L: 11691
										label827:
										for (var39 = var9.field3743; var39 < Client.field699; ++var39) { // L: 11698
											var23 = Client.field653[var39 & 31]; // L: 11699

											for (var37 = 0; var37 < var9.varTransmitTriggers.length; ++var37) { // L: 11700
												if (var23 == var9.varTransmitTriggers[var37]) { // L: 11701
													var25 = new ScriptEvent(); // L: 11702
													var25.widget = var9; // L: 11703
													var25.args = var9.onVarTransmit; // L: 11704
													Client.scriptEvents.addFirst(var25); // L: 11705
													break label827; // L: 11706
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11692
										var22.widget = var9; // L: 11693
										var22.args = var9.onVarTransmit; // L: 11694
										Client.scriptEvents.addFirst(var22); // L: 11695
									}

									var9.field3743 = Client.field699; // L: 11711
								}

								if (var9.onInvTransmit != null && Client.field701 > var9.field3744) { // L: 11713
									if (var9.invTransmitTriggers != null && Client.field701 - var9.field3744 <= 32) { // L: 11714
										label803:
										for (var39 = var9.field3744; var39 < Client.field701; ++var39) { // L: 11721
											var23 = Client.field700[var39 & 31]; // L: 11722

											for (var37 = 0; var37 < var9.invTransmitTriggers.length; ++var37) { // L: 11723
												if (var23 == var9.invTransmitTriggers[var37]) { // L: 11724
													var25 = new ScriptEvent(); // L: 11725
													var25.widget = var9; // L: 11726
													var25.args = var9.onInvTransmit; // L: 11727
													Client.scriptEvents.addFirst(var25); // L: 11728
													break label803; // L: 11729
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11715
										var22.widget = var9; // L: 11716
										var22.args = var9.onInvTransmit; // L: 11717
										Client.scriptEvents.addFirst(var22); // L: 11718
									}

									var9.field3744 = Client.field701; // L: 11734
								}

								if (var9.onStatTransmit != null && Client.field703 > var9.field3601) { // L: 11736
									if (var9.statTransmitTriggers != null && Client.field703 - var9.field3601 <= 32) { // L: 11737
										label779:
										for (var39 = var9.field3601; var39 < Client.field703; ++var39) { // L: 11744
											var23 = Client.field672[var39 & 31]; // L: 11745

											for (var37 = 0; var37 < var9.statTransmitTriggers.length; ++var37) { // L: 11746
												if (var23 == var9.statTransmitTriggers[var37]) { // L: 11747
													var25 = new ScriptEvent(); // L: 11748
													var25.widget = var9; // L: 11749
													var25.args = var9.onStatTransmit; // L: 11750
													Client.scriptEvents.addFirst(var25); // L: 11751
													break label779; // L: 11752
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11738
										var22.widget = var9; // L: 11739
										var22.args = var9.onStatTransmit; // L: 11740
										Client.scriptEvents.addFirst(var22); // L: 11741
									}

									var9.field3601 = Client.field703; // L: 11757
								}

								if (Client.chatCycle > var9.field3742 && var9.onChatTransmit != null) { // L: 11759
									var22 = new ScriptEvent(); // L: 11760
									var22.widget = var9; // L: 11761
									var22.args = var9.onChatTransmit; // L: 11762
									Client.scriptEvents.addFirst(var22); // L: 11763
								}

								if (Client.field707 > var9.field3742 && var9.onFriendTransmit != null) { // L: 11765
									var22 = new ScriptEvent(); // L: 11766
									var22.widget = var9; // L: 11767
									var22.args = var9.onFriendTransmit; // L: 11768
									Client.scriptEvents.addFirst(var22); // L: 11769
								}

								if (Client.field766 > var9.field3742 && var9.onClanTransmit != null) { // L: 11771
									var22 = new ScriptEvent(); // L: 11772
									var22.widget = var9; // L: 11773
									var22.args = var9.onClanTransmit; // L: 11774
									Client.scriptEvents.addFirst(var22); // L: 11775
								}

								if (Client.field709 > var9.field3742 && var9.field3718 != null) { // L: 11777
									var22 = new ScriptEvent(); // L: 11778
									var22.widget = var9; // L: 11779
									var22.args = var9.field3718; // L: 11780
									Client.scriptEvents.addFirst(var22); // L: 11781
								}

								if (Client.field690 > var9.field3742 && var9.field3719 != null) { // L: 11783
									var22 = new ScriptEvent(); // L: 11784
									var22.widget = var9; // L: 11785
									var22.args = var9.field3719; // L: 11786
									Client.scriptEvents.addFirst(var22); // L: 11787
								}

								if (Client.field734 > var9.field3742 && var9.onStockTransmit != null) { // L: 11789
									var22 = new ScriptEvent(); // L: 11790
									var22.widget = var9; // L: 11791
									var22.args = var9.onStockTransmit; // L: 11792
									Client.scriptEvents.addFirst(var22); // L: 11793
								}

								if (Client.field712 > var9.field3742 && var9.field3725 != null) { // L: 11795
									var22 = new ScriptEvent(); // L: 11796
									var22.widget = var9; // L: 11797
									var22.args = var9.field3725; // L: 11798
									Client.scriptEvents.addFirst(var22); // L: 11799
								}

								if (Client.field711 > var9.field3742 && var9.onMiscTransmit != null) { // L: 11801
									var22 = new ScriptEvent(); // L: 11802
									var22.widget = var9; // L: 11803
									var22.args = var9.onMiscTransmit; // L: 11804
									Client.scriptEvents.addFirst(var22); // L: 11805
								}

								var9.field3742 = Client.cycleCntr; // L: 11807
								if (var9.onKey != null) { // L: 11808
									for (var39 = 0; var39 < Client.field741; ++var39) { // L: 11809
										ScriptEvent var32 = new ScriptEvent(); // L: 11810
										var32.widget = var9; // L: 11811
										var32.keyTyped = Client.field545[var39]; // L: 11812
										var32.keyPressed = Client.field676[var39]; // L: 11813
										var32.args = var9.onKey; // L: 11814
										Client.scriptEvents.addFirst(var32); // L: 11815
									}
								}

								ScriptEvent var31;
								int[] var38;
								if (var9.field3714 != null) { // L: 11818
									var38 = Client.field739.method4136(); // L: 11819

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 11820
										var31 = new ScriptEvent(); // L: 11821
										var31.widget = var9; // L: 11822
										var31.keyTyped = var38[var23]; // L: 11823
										var31.args = var9.field3714; // L: 11824
										Client.scriptEvents.addFirst(var31); // L: 11825
									}
								}

								if (var9.field3715 != null) { // L: 11828
									var38 = Client.field739.method4137(); // L: 11829

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 11830
										var31 = new ScriptEvent(); // L: 11831
										var31.widget = var9; // L: 11832
										var31.keyTyped = var38[var23]; // L: 11833
										var31.args = var9.field3715; // L: 11834
										Client.scriptEvents.addFirst(var31); // L: 11835
									}
								}
							}
						}

						if (!var9.isIf3) { // L: 11840
							if (Client.clickedWidget != null || Client.isMenuOpen) { // L: 11841
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.field3704 != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11842
								if (var9.mouseOverRedirect >= 0) { // L: 11843
									ClanChannel.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									ClanChannel.mousedOverWidgetIf1 = var9; // L: 11844
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11846
								class19.field99 = var9; // L: 11847
							}

							if (var9.scrollHeight > var9.height) { // L: 11849
								class20.method304(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) { // L: 11851
							updateInterface(var0, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY); // L: 11852
							if (var9.children != null) { // L: 11853
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var29 = (InterfaceParent)Client.interfaceParents.get((long)var9.id); // L: 11854
							if (var29 != null) { // L: 11855
								if (var29.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) { // L: 11856
									for (ScriptEvent var30 = (ScriptEvent)Client.scriptEvents.last(); var30 != null; var30 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11857
										if (var30.field1062) { // L: 11858
											var30.remove(); // L: 11859
											var30.widget.field3740 = false; // L: 11860
										}
									}

									if (class348.widgetDragDuration == 0) { // L: 11863
										Client.clickedWidget = null; // L: 11864
										Client.clickedWidgetParent = null; // L: 11865
									}

									if (!Client.isMenuOpen) { // L: 11867
										class442.addCancelMenuEntry(); // L: 11868
									}
								}

								RouteStrategy.updateRootInterface(var29.group, var12, var13, var14, var15, var26, var11); // L: 11871
							}
						}
					}
				}
			}
		}

	} // L: 11875
}
