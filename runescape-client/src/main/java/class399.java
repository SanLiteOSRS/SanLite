import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pu")
public class class399 extends class406 {
	@ObfuscatedSignature(
		descriptor = "(Lps;)V"
	)
	public class399(class406 var1) {
		super(var1); // L: 9
		super.field4513 = "AddRequestTask"; // L: 10
	} // L: 11

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1705548260"
	)
	public boolean vmethod7648(int var1) {
		while (!class305.field3392.isEmpty()) { // L: 15
			class317 var2 = (class317)class305.field3392.peek(); // L: 16
			if (var2 == null) { // L: 17
				class305.field3392.pop(); // L: 18
			} else {
				var2.field3511 = this.method7606(); // L: 21
				class305.field3397.add(var2); // L: 22
				class305.field3392.pop(); // L: 23
			}
		}

		return true; // L: 25
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)Llm;",
		garbageValue = "22741"
	)
	MidiPcmStream method7606() {
		MidiPcmStream var1 = null; // L: 29
		Iterator var2 = class305.field3395.iterator(); // L: 30

		while (true) {
			MidiPcmStream var3;
			do {
				do {
					if (!var2.hasNext()) {
						if (var1 != null) { // L: 38
							++var1.field3434; // L: 39
							if (var1.method5887() == 0 && var1.isReady()) { // L: 40
								var1.clear(); // L: 41
								var1.method5832(); // L: 42
								var1.setPcmStreamVolume(0); // L: 43
							}
						}

						return var1; // L: 46
					}

					var3 = (MidiPcmStream)var2.next(); // L: 31
				} while(var3 == null);
			} while(var1 != null && var1.field3434 <= var3.field3434 && (var1.field3434 != var3.field3434 || var3.method5887() != 0 || !var3.isReady())); // L: 33

			var1 = var3; // L: 34
		}
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1862171737"
	)
	static final void method7610() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8364 8365 8371
			if (var0.hitpoints == -1) { // L: 8366
				var0.delay = 0; // L: 8367
				MilliClock.method3630(var0); // L: 8368
			} else {
				var0.remove(); // L: 8370
			}
		}

	} // L: 8373

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "([Lme;IIIIIIII)V",
		garbageValue = "823595489"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) { // L: 11385
			Widget var9 = var0[var8]; // L: 11386
			if (var9 != null && var9.parentId == var1 && (var9.method6452() || class19.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) { // L: 11387 11388 11389
				if (var9.isIf3) { // L: 11390
					if (UserComparator4.isComponentHidden(var9)) { // L: 11391
						continue;
					}
				} else if (var9.type == 0 && var9 != class308.mousedOverWidgetIf1 && UserComparator4.isComponentHidden(var9)) { // L: 11394
					continue;
				}

				if (var9.type == 11) { // L: 11396
					if (var9.method6510(class327.urlRequester)) { // L: 11397
						if (var9.method6460()) { // L: 11398
							class303.invalidateWidget(var9); // L: 11399
							class238.revalidateWidgetScroll(var9.children, var9, true); // L: 11400
						}

						if (var9.field3751 != null) { // L: 11402
							ScriptEvent var10 = new ScriptEvent(); // L: 11403
							var10.widget = var9; // L: 11404
							var10.args = var9.field3751; // L: 11405
							Client.scriptEvents.addFirst(var10); // L: 11406
						}
					}
				} else if (var9.type == 12 && var9.method6475()) { // L: 11410 11411
					class303.invalidateWidget(var9); // L: 11412
				}

				int var26 = var9.x + var6; // L: 11415
				int var11 = var7 + var9.y; // L: 11416
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				if (var9.type == 9) { // L: 11421
					var16 = var26; // L: 11422
					var17 = var11; // L: 11423
					var18 = var26 + var9.width; // L: 11424
					int var19 = var11 + var9.height; // L: 11425
					if (var18 < var26) { // L: 11426
						var16 = var18; // L: 11428
						var18 = var26; // L: 11429
					}

					if (var19 < var11) { // L: 11431
						var17 = var19; // L: 11433
						var19 = var11; // L: 11434
					}

					++var18; // L: 11436
					++var19; // L: 11437
					var12 = var16 > var2 ? var16 : var2; // L: 11438
					var13 = var17 > var3 ? var17 : var3; // L: 11439
					var14 = var18 < var4 ? var18 : var4; // L: 11440
					var15 = var19 < var5 ? var19 : var5; // L: 11441
				} else {
					var16 = var26 + var9.width; // L: 11444
					var17 = var11 + var9.height; // L: 11445
					var12 = var26 > var2 ? var26 : var2; // L: 11446
					var13 = var11 > var3 ? var11 : var3; // L: 11447
					var14 = var16 < var4 ? var16 : var4; // L: 11448
					var15 = var17 < var5 ? var17 : var5; // L: 11449
				}

				if (var9 == Client.clickedWidget) { // L: 11451
					Client.field687 = true; // L: 11452
					Client.field688 = var26; // L: 11453
					Client.field614 = var11; // L: 11454
				}

				boolean var34 = false; // L: 11456
				if (var9.field3702) { // L: 11457
					switch(Client.field669) { // L: 11458
					case 0:
						var34 = true; // L: 11470
					case 1:
					default:
						break;
					case 2:
						if (Client.field557 == var9.id >>> 16) { // L: 11465
							var34 = true; // L: 11466
						}
						break;
					case 3:
						if (var9.id == Client.field557) { // L: 11460
							var34 = true; // L: 11461
						}
					}
				}

				if (var34 || !var9.isIf3 || var12 < var14 && var13 < var15) { // L: 11474
					if (var9.isIf3) { // L: 11475
						ScriptEvent var27;
						if (var9.noClickThrough) { // L: 11476
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11477
								for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11478
									if (var27.field1074) { // L: 11479
										var27.remove(); // L: 11480
										var27.widget.field3757 = false; // L: 11481
									}
								}

								SecureRandomFuture.method2172(); // L: 11484
								if (MusicPatchPcmStream.widgetDragDuration == 0) { // L: 11485
									Client.clickedWidget = null; // L: 11486
									Client.clickedWidgetParent = null; // L: 11487
								}

								if (!Client.isMenuOpen) { // L: 11489
									class170.addCancelMenuEntry(); // L: 11490
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11494 11495
							for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11496
								if (var27.field1074 && var27.widget.onScroll == var27.args) { // L: 11497
									var27.remove(); // L: 11498
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x; // L: 11504
					var18 = MouseHandler.MouseHandler_y; // L: 11505
					if (MouseHandler.MouseHandler_lastButton != 0) { // L: 11506
						var17 = MouseHandler.MouseHandler_lastPressedX; // L: 11507
						var18 = MouseHandler.MouseHandler_lastPressedY; // L: 11508
					}

					boolean var35 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15; // L: 11510
					if (var9.contentType == 1337) { // L: 11511
						if (!Client.field510 && !Client.isMenuOpen && var35) { // L: 11512
							class105.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) { // L: 11515
						WorldMapLabelSize.checkIfMinimapClicked(var9, var26, var11); // L: 11516
					} else {
						if (var9.contentType == 1400) { // L: 11519
							ScriptFrame.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height); // L: 11520
						}

						if (!Client.isMenuOpen && var35) { // L: 11522
							if (var9.contentType == 1400) { // L: 11523
								ScriptFrame.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18); // L: 11524
							} else {
								ScriptEvent.method2314(var9); // L: 11527
							}
						}

						boolean var21;
						int var23;
						if (var34) { // L: 11530
							for (int var20 = 0; var20 < var9.field3703.length; ++var20) { // L: 11531
								var21 = false; // L: 11532
								boolean var28 = false; // L: 11533
								if (!var21 && var9.field3703[var20] != null) { // L: 11534
									for (var23 = 0; var23 < var9.field3703[var20].length; ++var23) { // L: 11535
										boolean var24 = false; // L: 11536
										if (var9.field3773 != null) { // L: 11537
											var24 = Client.field519.method4285(var9.field3703[var20][var23]); // L: 11538
										}

										if (class177.method3611(var9.field3703[var20][var23]) || var24) { // L: 11540
											var21 = true; // L: 11541
											if (var9.field3773 != null && var9.field3773[var20] > Client.cycle) { // L: 11542
												break;
											}

											byte var33 = var9.field3704[var20][var23]; // L: 11543
											if (var33 == 0 || ((var33 & 8) == 0 || !Client.field519.method4285(86) && !Client.field519.method4285(82) && !Client.field519.method4285(81)) && ((var33 & 2) == 0 || Client.field519.method4285(86)) && ((var33 & 1) == 0 || Client.field519.method4285(82)) && ((var33 & 4) == 0 || Client.field519.method4285(81))) { // L: 11544 11545 11546 11547 11548
												var28 = true; // L: 11550
												break;
											}
										}
									}
								}

								if (var28) { // L: 11556
									if (var20 < 10) { // L: 11557
										class33.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) { // L: 11558
										class167.Widget_runOnTargetLeave(); // L: 11559
										FloorOverlayDefinition.selectSpell(var9.id, var9.childIndex, UserComparator4.Widget_unpackTargetMask(class19.getWidgetFlags(var9)), var9.itemId); // L: 11560
										Client.field665 = class108.Widget_getSpellActionName(var9); // L: 11561
										if (Client.field665 == null) { // L: 11562
											Client.field665 = "null";
										}

										Client.field666 = var9.dataText + class17.colorStartTag(16777215); // L: 11563
									}

									var23 = var9.field3705[var20]; // L: 11565
									if (var9.field3773 == null) { // L: 11566
										var9.field3773 = new int[var9.field3703.length];
									}

									if (var9.field3706 == null) { // L: 11567
										var9.field3706 = new int[var9.field3703.length];
									}

									if (var23 != 0) { // L: 11568
										if (var9.field3773[var20] == 0) { // L: 11569
											var9.field3773[var20] = var23 + Client.cycle + var9.field3706[var20];
										} else {
											var9.field3773[var20] = var23 + Client.cycle; // L: 11570
										}
									} else {
										var9.field3773[var20] = Integer.MAX_VALUE; // L: 11572
									}
								}

								if (!var21 && var9.field3773 != null) { // L: 11574 11575
									var9.field3773[var20] = 0;
								}
							}
						}

						if (var9.isIf3) { // L: 11579
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11580
								var35 = true;
							} else {
								var35 = false; // L: 11581
							}

							boolean var36 = false; // L: 11582
							if ((MouseHandler.MouseHandler_currentButton == 1 || !class412.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) { // L: 11583
								var36 = true;
							}

							var21 = false; // L: 11584
							if ((MouseHandler.MouseHandler_lastButton == 1 || !class412.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) { // L: 11585
								var21 = true;
							}

							if (var21) { // L: 11586
								class305.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11); // L: 11587
							}

							if (var9.method6453()) { // L: 11589
								if (var21) { // L: 11590
									Client.field584.addFirst(new class211(0, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9)); // L: 11591
								}

								if (var36) { // L: 11593
									Client.field584.addFirst(new class211(1, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9)); // L: 11594
								}
							}

							if (var9.contentType == 1400) { // L: 11597
								ScriptFrame.worldMap.method8508(var17, var18, var35 & var36, var35 & var21); // L: 11598
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && class209.method4224(class19.getWidgetFlags(var9))) { // L: 11600
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) { // L: 11601
								Client.field684 = true; // L: 11602
								Client.field685 = var26; // L: 11603
								Client.field776 = var11; // L: 11604
							}

							if (var9.hasListener) { // L: 11606
								ScriptEvent var22;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) { // L: 11607
									var22 = new ScriptEvent(); // L: 11608
									var22.field1074 = true; // L: 11609
									var22.widget = var9; // L: 11610
									var22.mouseY = Client.mouseWheelRotation; // L: 11611
									var22.args = var9.onScroll; // L: 11612
									Client.scriptEvents.addFirst(var22); // L: 11613
								}

								if (Client.clickedWidget != null || Client.isMenuOpen) { // L: 11615
									var21 = false; // L: 11616
									var36 = false; // L: 11617
									var35 = false; // L: 11618
								}

								if (!var9.field3766 && var21) { // L: 11620
									var9.field3766 = true; // L: 11621
									if (var9.onClick != null) { // L: 11622
										var22 = new ScriptEvent(); // L: 11623
										var22.field1074 = true; // L: 11624
										var22.widget = var9; // L: 11625
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var26; // L: 11626
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11; // L: 11627
										var22.args = var9.onClick; // L: 11628
										Client.scriptEvents.addFirst(var22); // L: 11629
									}
								}

								if (var9.field3766 && var36 && var9.onClickRepeat != null) { // L: 11632 11633
									var22 = new ScriptEvent(); // L: 11634
									var22.field1074 = true; // L: 11635
									var22.widget = var9; // L: 11636
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11637
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11638
									var22.args = var9.onClickRepeat; // L: 11639
									Client.scriptEvents.addFirst(var22); // L: 11640
								}

								if (var9.field3766 && !var36) { // L: 11643
									var9.field3766 = false; // L: 11644
									if (var9.onRelease != null) { // L: 11645
										var22 = new ScriptEvent(); // L: 11646
										var22.field1074 = true; // L: 11647
										var22.widget = var9; // L: 11648
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11649
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11650
										var22.args = var9.onRelease; // L: 11651
										Client.field712.addFirst(var22); // L: 11652
									}
								}

								if (var36 && var9.onHold != null) { // L: 11655 11656
									var22 = new ScriptEvent(); // L: 11657
									var22.field1074 = true; // L: 11658
									var22.widget = var9; // L: 11659
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11660
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11661
									var22.args = var9.onHold; // L: 11662
									Client.scriptEvents.addFirst(var22); // L: 11663
								}

								if (!var9.field3757 && var35) { // L: 11666
									var9.field3757 = true; // L: 11667
									if (var9.onMouseOver != null) { // L: 11668
										var22 = new ScriptEvent(); // L: 11669
										var22.field1074 = true; // L: 11670
										var22.widget = var9; // L: 11671
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11672
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11673
										var22.args = var9.onMouseOver; // L: 11674
										Client.scriptEvents.addFirst(var22); // L: 11675
									}
								}

								if (var9.field3757 && var35 && var9.onMouseRepeat != null) { // L: 11678 11679
									var22 = new ScriptEvent(); // L: 11680
									var22.field1074 = true; // L: 11681
									var22.widget = var9; // L: 11682
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11683
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11684
									var22.args = var9.onMouseRepeat; // L: 11685
									Client.scriptEvents.addFirst(var22); // L: 11686
								}

								if (var9.field3757 && !var35) { // L: 11689
									var9.field3757 = false; // L: 11690
									if (var9.onMouseLeave != null) { // L: 11691
										var22 = new ScriptEvent(); // L: 11692
										var22.field1074 = true; // L: 11693
										var22.widget = var9; // L: 11694
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11695
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11696
										var22.args = var9.onMouseLeave; // L: 11697
										Client.field712.addFirst(var22); // L: 11698
									}
								}

								if (var9.onTimer != null) { // L: 11701
									var22 = new ScriptEvent(); // L: 11702
									var22.widget = var9; // L: 11703
									var22.args = var9.onTimer; // L: 11704
									Client.field711.addFirst(var22); // L: 11705
								}

								ScriptEvent var25;
								int var37;
								int var39;
								if (var9.onVarTransmit != null && Client.field693 > var9.field3768) { // L: 11707
									if (var9.varTransmitTriggers != null && Client.field693 - var9.field3768 <= 32) { // L: 11708
										label821:
										for (var39 = var9.field3768; var39 < Client.field693; ++var39) { // L: 11715
											var23 = Client.field692[var39 & 31]; // L: 11716

											for (var37 = 0; var37 < var9.varTransmitTriggers.length; ++var37) { // L: 11717
												if (var23 == var9.varTransmitTriggers[var37]) { // L: 11718
													var25 = new ScriptEvent(); // L: 11719
													var25.widget = var9; // L: 11720
													var25.args = var9.onVarTransmit; // L: 11721
													Client.scriptEvents.addFirst(var25); // L: 11722
													break label821; // L: 11723
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11709
										var22.widget = var9; // L: 11710
										var22.args = var9.onVarTransmit; // L: 11711
										Client.scriptEvents.addFirst(var22); // L: 11712
									}

									var9.field3768 = Client.field693; // L: 11728
								}

								if (var9.onInvTransmit != null && Client.field695 > var9.field3669) { // L: 11730
									if (var9.invTransmitTriggers != null && Client.field695 - var9.field3669 <= 32) { // L: 11731
										label797:
										for (var39 = var9.field3669; var39 < Client.field695; ++var39) { // L: 11738
											var23 = Client.field575[var39 & 31]; // L: 11739

											for (var37 = 0; var37 < var9.invTransmitTriggers.length; ++var37) { // L: 11740
												if (var23 == var9.invTransmitTriggers[var37]) { // L: 11741
													var25 = new ScriptEvent(); // L: 11742
													var25.widget = var9; // L: 11743
													var25.args = var9.onInvTransmit; // L: 11744
													Client.scriptEvents.addFirst(var25); // L: 11745
													break label797; // L: 11746
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11732
										var22.widget = var9; // L: 11733
										var22.args = var9.onInvTransmit; // L: 11734
										Client.scriptEvents.addFirst(var22); // L: 11735
									}

									var9.field3669 = Client.field695; // L: 11751
								}

								if (var9.onStatTransmit != null && Client.field697 > var9.field3734) { // L: 11753
									if (var9.statTransmitTriggers != null && Client.field697 - var9.field3734 <= 32) { // L: 11754
										label773:
										for (var39 = var9.field3734; var39 < Client.field697; ++var39) { // L: 11761
											var23 = Client.field794[var39 & 31]; // L: 11762

											for (var37 = 0; var37 < var9.statTransmitTriggers.length; ++var37) { // L: 11763
												if (var23 == var9.statTransmitTriggers[var37]) { // L: 11764
													var25 = new ScriptEvent(); // L: 11765
													var25.widget = var9; // L: 11766
													var25.args = var9.onStatTransmit; // L: 11767
													Client.scriptEvents.addFirst(var25); // L: 11768
													break label773; // L: 11769
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11755
										var22.widget = var9; // L: 11756
										var22.args = var9.onStatTransmit; // L: 11757
										Client.scriptEvents.addFirst(var22); // L: 11758
									}

									var9.field3734 = Client.field697; // L: 11774
								}

								if (Client.chatCycle > var9.field3767 && var9.onChatTransmit != null) { // L: 11776
									var22 = new ScriptEvent(); // L: 11777
									var22.widget = var9; // L: 11778
									var22.args = var9.onChatTransmit; // L: 11779
									Client.scriptEvents.addFirst(var22); // L: 11780
								}

								if (Client.field701 > var9.field3767 && var9.onFriendTransmit != null) { // L: 11782
									var22 = new ScriptEvent(); // L: 11783
									var22.widget = var9; // L: 11784
									var22.args = var9.onFriendTransmit; // L: 11785
									Client.scriptEvents.addFirst(var22); // L: 11786
								}

								if (Client.field702 > var9.field3767 && var9.onClanTransmit != null) { // L: 11788
									var22 = new ScriptEvent(); // L: 11789
									var22.widget = var9; // L: 11790
									var22.args = var9.onClanTransmit; // L: 11791
									Client.scriptEvents.addFirst(var22); // L: 11792
								}

								if (Client.field617 > var9.field3767 && var9.field3743 != null) { // L: 11794
									var22 = new ScriptEvent(); // L: 11795
									var22.widget = var9; // L: 11796
									var22.args = var9.field3743; // L: 11797
									Client.scriptEvents.addFirst(var22); // L: 11798
								}

								if (Client.field694 > var9.field3767 && var9.field3667 != null) { // L: 11800
									var22 = new ScriptEvent(); // L: 11801
									var22.widget = var9; // L: 11802
									var22.args = var9.field3667; // L: 11803
									Client.scriptEvents.addFirst(var22); // L: 11804
								}

								if (Client.field705 > var9.field3767 && var9.onStockTransmit != null) { // L: 11806
									var22 = new ScriptEvent(); // L: 11807
									var22.widget = var9; // L: 11808
									var22.args = var9.onStockTransmit; // L: 11809
									Client.scriptEvents.addFirst(var22); // L: 11810
								}

								if (Client.field706 > var9.field3767 && var9.field3750 != null) { // L: 11812
									var22 = new ScriptEvent(); // L: 11813
									var22.widget = var9; // L: 11814
									var22.args = var9.field3750; // L: 11815
									Client.scriptEvents.addFirst(var22); // L: 11816
								}

								if (Client.field707 > var9.field3767 && var9.onMiscTransmit != null) { // L: 11818
									var22 = new ScriptEvent(); // L: 11819
									var22.widget = var9; // L: 11820
									var22.args = var9.onMiscTransmit; // L: 11821
									Client.scriptEvents.addFirst(var22); // L: 11822
								}

								var9.field3767 = Client.cycleCntr; // L: 11824
								if (var9.onKey != null) { // L: 11825
									for (var39 = 0; var39 < Client.field735; ++var39) { // L: 11826
										ScriptEvent var32 = new ScriptEvent(); // L: 11827
										var32.widget = var9; // L: 11828
										var32.keyTyped = Client.field737[var39]; // L: 11829
										var32.keyPressed = Client.field736[var39]; // L: 11830
										var32.args = var9.onKey; // L: 11831
										Client.scriptEvents.addFirst(var32); // L: 11832
									}
								}

								ScriptEvent var31;
								int[] var38;
								if (var9.field3739 != null) { // L: 11835
									var38 = Client.field519.method4263(); // L: 11836

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 11837
										var31 = new ScriptEvent(); // L: 11838
										var31.widget = var9; // L: 11839
										var31.keyTyped = var38[var23]; // L: 11840
										var31.args = var9.field3739; // L: 11841
										Client.scriptEvents.addFirst(var31); // L: 11842
									}
								}

								if (var9.field3673 != null) { // L: 11845
									var38 = Client.field519.method4264(); // L: 11846

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 11847
										var31 = new ScriptEvent(); // L: 11848
										var31.widget = var9; // L: 11849
										var31.keyTyped = var38[var23]; // L: 11850
										var31.args = var9.field3673; // L: 11851
										Client.scriptEvents.addFirst(var31); // L: 11852
									}
								}
							}
						}

						if (!var9.isIf3) { // L: 11857
							if (Client.clickedWidget != null || Client.isMenuOpen) { // L: 11858
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.field3654 != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11859
								if (var9.mouseOverRedirect >= 0) { // L: 11860
									class308.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									class308.mousedOverWidgetIf1 = var9; // L: 11861
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11863
								class4.field11 = var9; // L: 11864
							}

							if (var9.scrollHeight > var9.height) { // L: 11866
								class18.method302(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) { // L: 11868
							updateInterface(var0, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY); // L: 11869
							if (var9.children != null) { // L: 11870
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var29 = (InterfaceParent)Client.interfaceParents.get((long)var9.id); // L: 11871
							if (var29 != null) { // L: 11872
								if (var29.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) { // L: 11873
									for (ScriptEvent var30 = (ScriptEvent)Client.scriptEvents.last(); var30 != null; var30 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11874
										if (var30.field1074) { // L: 11875
											var30.remove(); // L: 11876
											var30.widget.field3757 = false; // L: 11877
										}
									}

									if (MusicPatchPcmStream.widgetDragDuration == 0) { // L: 11880
										Client.clickedWidget = null; // L: 11881
										Client.clickedWidgetParent = null; // L: 11882
									}

									if (!Client.isMenuOpen) { // L: 11884
										class170.addCancelMenuEntry(); // L: 11885
									}
								}

								PacketWriter.updateRootInterface(var29.group, var12, var13, var14, var15, var26, var11); // L: 11888
							}
						}
					}
				}
			}
		}

	} // L: 11892
}
