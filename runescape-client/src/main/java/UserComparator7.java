import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
	@ObfuscatedName("o")
	static int[][][] field1410;
	@ObfuscatedName("a")
	@Export("reversed")
	final boolean reversed;

	public UserComparator7(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lof;Lof;I)I",
		garbageValue = "-1526473747"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) { // L: 14
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "([Lkn;IIIIIIII)V",
		garbageValue = "-1217539726"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) { // L: 11314
			Widget var9 = var0[var8]; // L: 11315
			if (var9 != null && var9.parentId == var1 && (var9.method6108() || class197.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) { // L: 11316 11317 11318
				if (var9.isIf3) { // L: 11319
					if (class6.isComponentHidden(var9)) { // L: 11320
						continue;
					}
				} else if (var9.type == 0 && var9 != Occluder.mousedOverWidgetIf1 && class6.isComponentHidden(var9)) { // L: 11323
					continue;
				}

				if (var9.type == 11) { // L: 11325
					if (var9.method6073(PcmPlayer.urlRequester)) { // L: 11326
						if (var9.method6075()) { // L: 11327
							class143.invalidateWidget(var9); // L: 11328
							class16.revalidateWidgetScroll(var9.children, var9, true); // L: 11329
						}

						if (var9.field3610 != null) { // L: 11331
							ScriptEvent var10 = new ScriptEvent(); // L: 11332
							var10.widget = var9; // L: 11333
							var10.args = var9.field3610; // L: 11334
							Client.scriptEvents.addFirst(var10); // L: 11335
						}
					}
				} else if (var9.type == 12 && var9.method6125()) { // L: 11339 11340
					class143.invalidateWidget(var9); // L: 11341
				}

				int var26 = var9.x + var6; // L: 11344
				int var11 = var7 + var9.y; // L: 11345
				int var12;
				int var13;
				int var14;
				int var15;
				int var17;
				int var18;
				if (var9.type == 2) { // L: 11350
					var12 = var2; // L: 11351
					var13 = var3; // L: 11352
					var14 = var4; // L: 11353
					var15 = var5; // L: 11354
				} else {
					int var16;
					if (var9.type == 9) { // L: 11356
						var16 = var26; // L: 11357
						var17 = var11; // L: 11358
						var18 = var26 + var9.width; // L: 11359
						int var19 = var11 + var9.height; // L: 11360
						if (var18 < var26) { // L: 11361
							var16 = var18; // L: 11363
							var18 = var26; // L: 11364
						}

						if (var19 < var11) { // L: 11366
							var17 = var19; // L: 11368
							var19 = var11; // L: 11369
						}

						++var18; // L: 11371
						++var19; // L: 11372
						var12 = var16 > var2 ? var16 : var2; // L: 11373
						var13 = var17 > var3 ? var17 : var3; // L: 11374
						var14 = var18 < var4 ? var18 : var4; // L: 11375
						var15 = var19 < var5 ? var19 : var5; // L: 11376
					} else {
						var16 = var26 + var9.width; // L: 11379
						var17 = var11 + var9.height; // L: 11380
						var12 = var26 > var2 ? var26 : var2; // L: 11381
						var13 = var11 > var3 ? var11 : var3; // L: 11382
						var14 = var16 < var4 ? var16 : var4; // L: 11383
						var15 = var17 < var5 ? var17 : var5; // L: 11384
					}
				}

				if (var9 == Client.clickedWidget) { // L: 11386
					Client.field640 = true; // L: 11387
					Client.field688 = var26; // L: 11388
					Client.field689 = var11; // L: 11389
				}

				boolean var34 = false; // L: 11391
				if (var9.field3561) { // L: 11392
					switch(Client.field668) { // L: 11393
					case 0:
						var34 = true; // L: 11400
					case 1:
					default:
						break;
					case 2:
						if (Client.field755 == var9.id >>> 16) { // L: 11395
							var34 = true; // L: 11396
						}
						break;
					case 3:
						if (var9.id == Client.field755) { // L: 11403
							var34 = true; // L: 11404
						}
					}
				}

				if (var34 || !var9.isIf3 || var12 < var14 && var13 < var15) { // L: 11409
					if (var9.isIf3) { // L: 11410
						ScriptEvent var27;
						if (var9.noClickThrough) { // L: 11411
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11412
								for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11413
									if (var27.isMouseInputEvent) { // L: 11414
										var27.remove(); // L: 11415
										var27.widget.containsMouse = false; // L: 11416
									}
								}

								SequenceDefinition.method3881(); // L: 11419
								if (Script.widgetDragDuration == 0) { // L: 11420
									Client.clickedWidget = null; // L: 11421
									Client.clickedWidgetParent = null; // L: 11422
								}

								if (!Client.isMenuOpen) { // L: 11424
									MusicPatchNode.addCancelMenuEntry(); // L: 11425
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11429 11430
							for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11431
								if (var27.isMouseInputEvent && var27.widget.onScroll == var27.args) { // L: 11432
									var27.remove(); // L: 11433
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x; // L: 11439
					var18 = MouseHandler.MouseHandler_y; // L: 11440
					if (MouseHandler.MouseHandler_lastButton != 0) { // L: 11441
						var17 = MouseHandler.MouseHandler_lastPressedX; // L: 11442
						var18 = MouseHandler.MouseHandler_lastPressedY; // L: 11443
					}

					boolean var35 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15; // L: 11445
					if (var9.contentType == 1337) { // L: 11446
						if (!Client.isLoading && !Client.isMenuOpen && var35) { // L: 11447
							MouseHandler.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) { // L: 11450
						class152.checkIfMinimapClicked(var9, var26, var11); // L: 11451
					} else {
						if (var9.contentType == 1400) { // L: 11454
							class7.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height); // L: 11455
						}

						if (!Client.isMenuOpen && var35) { // L: 11457
							if (var9.contentType == 1400) { // L: 11458
								class7.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18); // L: 11459
							} else {
								Message.Widget_addToMenu(var9, var17 - var26, var18 - var11); // L: 11462
							}
						}

						boolean var21;
						int var23;
						if (var34) { // L: 11465
							for (int var20 = 0; var20 < var9.field3562.length; ++var20) { // L: 11466
								var21 = false; // L: 11467
								boolean var28 = false; // L: 11468
								if (!var21 && var9.field3562[var20] != null) { // L: 11469
									for (var23 = 0; var23 < var9.field3562[var20].length; ++var23) { // L: 11470
										boolean var24 = false; // L: 11471
										if (var9.field3564 != null) { // L: 11472
											var24 = Client.field733.method3956(var9.field3562[var20][var23]); // L: 11473
										}

										if (class151.method3180(var9.field3562[var20][var23]) || var24) { // L: 11475
											var21 = true; // L: 11476
											if (var9.field3564 != null && var9.field3564[var20] > Client.cycle) { // L: 11477
												break;
											}

											byte var33 = var9.field3563[var20][var23]; // L: 11478
											if (var33 == 0 || ((var33 & 8) == 0 || !Client.field733.method3956(86) && !Client.field733.method3956(82) && !Client.field733.method3956(81)) && ((var33 & 2) == 0 || Client.field733.method3956(86)) && ((var33 & 1) == 0 || Client.field733.method3956(82)) && ((var33 & 4) == 0 || Client.field733.method3956(81))) { // L: 11479 11480 11481 11482 11483
												var28 = true; // L: 11485
												break;
											}
										}
									}
								}

								if (var28) { // L: 11491
									if (var20 < 10) { // L: 11492
										class279.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) { // L: 11493
										class101.Widget_runOnTargetLeave(); // L: 11494
										class238.selectSpell(var9.id, var9.childIndex, class167.Widget_unpackTargetMask(class197.getWidgetFlags(var9)), var9.itemId); // L: 11495
										Client.selectedSpellActionName = class313.Widget_getSpellActionName(var9); // L: 11496
										if (Client.selectedSpellActionName == null) { // L: 11497
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + GameObject.colorStartTag(16777215); // L: 11498
									}

									var23 = var9.field3611[var20]; // L: 11500
									if (var9.field3564 == null) { // L: 11501
										var9.field3564 = new int[var9.field3562.length];
									}

									if (var9.field3565 == null) { // L: 11502
										var9.field3565 = new int[var9.field3562.length];
									}

									if (var23 != 0) { // L: 11503
										if (var9.field3564[var20] == 0) { // L: 11504
											var9.field3564[var20] = var23 + Client.cycle + var9.field3565[var20];
										} else {
											var9.field3564[var20] = var23 + Client.cycle; // L: 11505
										}
									} else {
										var9.field3564[var20] = Integer.MAX_VALUE; // L: 11507
									}
								}

								if (!var21 && var9.field3564 != null) { // L: 11509 11510
									var9.field3564[var20] = 0;
								}
							}
						}

						if (var9.isIf3) { // L: 11514
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11515
								var35 = true;
							} else {
								var35 = false; // L: 11516
							}

							boolean var36 = false; // L: 11517
							if ((MouseHandler.MouseHandler_currentButton == 1 || !class82.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) { // L: 11518
								var36 = true;
							}

							var21 = false; // L: 11519
							if ((MouseHandler.MouseHandler_lastButton == 1 || !class82.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) { // L: 11520
								var21 = true;
							}

							if (var21) { // L: 11521
								Huffman.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11); // L: 11522
							}

							if (var9.method6061()) { // L: 11524
								if (var21) { // L: 11525
									Client.field713.addFirst(new class198(0, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9)); // L: 11526
								}

								if (var36) { // L: 11528
									Client.field713.addFirst(new class198(1, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9)); // L: 11529
								}
							}

							if (var9.contentType == 1400) { // L: 11532
								class7.worldMap.method8033(var17, var18, var35 & var36, var35 & var21); // L: 11533
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && class16.method207(class197.getWidgetFlags(var9))) { // L: 11535
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) { // L: 11536
								Client.field684 = true; // L: 11537
								Client.field603 = var26; // L: 11538
								Client.field686 = var11; // L: 11539
							}

							if (var9.hasListener) { // L: 11541
								ScriptEvent var22;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) { // L: 11542
									var22 = new ScriptEvent(); // L: 11543
									var22.isMouseInputEvent = true; // L: 11544
									var22.widget = var9; // L: 11545
									var22.mouseY = Client.mouseWheelRotation; // L: 11546
									var22.args = var9.onScroll; // L: 11547
									Client.scriptEvents.addFirst(var22); // L: 11548
								}

								if (Client.clickedWidget != null || VerticalAlignment.dragInventoryWidget != null || Client.isMenuOpen) { // L: 11550
									var21 = false; // L: 11551
									var36 = false; // L: 11552
									var35 = false; // L: 11553
								}

								if (!var9.field3512 && var21) { // L: 11555
									var9.field3512 = true; // L: 11556
									if (var9.onClick != null) { // L: 11557
										var22 = new ScriptEvent(); // L: 11558
										var22.isMouseInputEvent = true; // L: 11559
										var22.widget = var9; // L: 11560
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var26; // L: 11561
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11; // L: 11562
										var22.args = var9.onClick; // L: 11563
										Client.scriptEvents.addFirst(var22); // L: 11564
									}
								}

								if (var9.field3512 && var36 && var9.onClickRepeat != null) { // L: 11567 11568
									var22 = new ScriptEvent(); // L: 11569
									var22.isMouseInputEvent = true; // L: 11570
									var22.widget = var9; // L: 11571
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11572
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11573
									var22.args = var9.onClickRepeat; // L: 11574
									Client.scriptEvents.addFirst(var22); // L: 11575
								}

								if (var9.field3512 && !var36) { // L: 11578
									var9.field3512 = false; // L: 11579
									if (var9.onRelease != null) { // L: 11580
										var22 = new ScriptEvent(); // L: 11581
										var22.isMouseInputEvent = true; // L: 11582
										var22.widget = var9; // L: 11583
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11584
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11585
										var22.args = var9.onRelease; // L: 11586
										Client.field670.addFirst(var22); // L: 11587
									}
								}

								if (var36 && var9.onHold != null) { // L: 11590 11591
									var22 = new ScriptEvent(); // L: 11592
									var22.isMouseInputEvent = true; // L: 11593
									var22.widget = var9; // L: 11594
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11595
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11596
									var22.args = var9.onHold; // L: 11597
									Client.scriptEvents.addFirst(var22); // L: 11598
								}

								if (!var9.containsMouse && var35) { // L: 11601
									var9.containsMouse = true; // L: 11602
									if (var9.onMouseOver != null) { // L: 11603
										var22 = new ScriptEvent(); // L: 11604
										var22.isMouseInputEvent = true; // L: 11605
										var22.widget = var9; // L: 11606
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11607
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11608
										var22.args = var9.onMouseOver; // L: 11609
										Client.scriptEvents.addFirst(var22); // L: 11610
									}
								}

								if (var9.containsMouse && var35 && var9.onMouseRepeat != null) { // L: 11613 11614
									var22 = new ScriptEvent(); // L: 11615
									var22.isMouseInputEvent = true; // L: 11616
									var22.widget = var9; // L: 11617
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11618
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11619
									var22.args = var9.onMouseRepeat; // L: 11620
									Client.scriptEvents.addFirst(var22); // L: 11621
								}

								if (var9.containsMouse && !var35) { // L: 11624
									var9.containsMouse = false; // L: 11625
									if (var9.onMouseLeave != null) { // L: 11626
										var22 = new ScriptEvent(); // L: 11627
										var22.isMouseInputEvent = true; // L: 11628
										var22.widget = var9; // L: 11629
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11630
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11631
										var22.args = var9.onMouseLeave; // L: 11632
										Client.field670.addFirst(var22); // L: 11633
									}
								}

								if (var9.onTimer != null) { // L: 11636
									var22 = new ScriptEvent(); // L: 11637
									var22.widget = var9; // L: 11638
									var22.args = var9.onTimer; // L: 11639
									Client.field711.addFirst(var22); // L: 11640
								}

								ScriptEvent var25;
								int var37;
								int var39;
								if (var9.onVarTransmit != null && Client.field547 > var9.field3627) { // L: 11642
									if (var9.varTransmitTriggers != null && Client.field547 - var9.field3627 <= 32) { // L: 11643
										label843:
										for (var39 = var9.field3627; var39 < Client.field547; ++var39) { // L: 11650
											var23 = Client.field788[var39 & 31]; // L: 11651

											for (var37 = 0; var37 < var9.varTransmitTriggers.length; ++var37) { // L: 11652
												if (var23 == var9.varTransmitTriggers[var37]) { // L: 11653
													var25 = new ScriptEvent(); // L: 11654
													var25.widget = var9; // L: 11655
													var25.args = var9.onVarTransmit; // L: 11656
													Client.scriptEvents.addFirst(var25); // L: 11657
													break label843; // L: 11658
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11644
										var22.widget = var9; // L: 11645
										var22.args = var9.onVarTransmit; // L: 11646
										Client.scriptEvents.addFirst(var22); // L: 11647
									}

									var9.field3627 = Client.field547; // L: 11663
								}

								if (var9.onInvTransmit != null && Client.field695 > var9.field3628) { // L: 11665
									if (var9.invTransmitTriggers != null && Client.field695 - var9.field3628 <= 32) { // L: 11666
										label819:
										for (var39 = var9.field3628; var39 < Client.field695; ++var39) { // L: 11673
											var23 = Client.field694[var39 & 31]; // L: 11674

											for (var37 = 0; var37 < var9.invTransmitTriggers.length; ++var37) { // L: 11675
												if (var23 == var9.invTransmitTriggers[var37]) { // L: 11676
													var25 = new ScriptEvent(); // L: 11677
													var25.widget = var9; // L: 11678
													var25.args = var9.onInvTransmit; // L: 11679
													Client.scriptEvents.addFirst(var25); // L: 11680
													break label819; // L: 11681
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11667
										var22.widget = var9; // L: 11668
										var22.args = var9.onInvTransmit; // L: 11669
										Client.scriptEvents.addFirst(var22); // L: 11670
									}

									var9.field3628 = Client.field695; // L: 11686
								}

								if (var9.onStatTransmit != null && Client.field599 > var9.field3618) { // L: 11688
									if (var9.statTransmitTriggers != null && Client.field599 - var9.field3618 <= 32) { // L: 11689
										label795:
										for (var39 = var9.field3618; var39 < Client.field599; ++var39) { // L: 11696
											var23 = Client.field696[var39 & 31]; // L: 11697

											for (var37 = 0; var37 < var9.statTransmitTriggers.length; ++var37) { // L: 11698
												if (var23 == var9.statTransmitTriggers[var37]) { // L: 11699
													var25 = new ScriptEvent(); // L: 11700
													var25.widget = var9; // L: 11701
													var25.args = var9.onStatTransmit; // L: 11702
													Client.scriptEvents.addFirst(var25); // L: 11703
													break label795; // L: 11704
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11690
										var22.widget = var9; // L: 11691
										var22.args = var9.onStatTransmit; // L: 11692
										Client.scriptEvents.addFirst(var22); // L: 11693
									}

									var9.field3618 = Client.field599; // L: 11709
								}

								if (Client.chatCycle > var9.field3626 && var9.onChatTransmit != null) { // L: 11711
									var22 = new ScriptEvent(); // L: 11712
									var22.widget = var9; // L: 11713
									var22.args = var9.onChatTransmit; // L: 11714
									Client.scriptEvents.addFirst(var22); // L: 11715
								}

								if (Client.field701 > var9.field3626 && var9.onFriendTransmit != null) { // L: 11717
									var22 = new ScriptEvent(); // L: 11718
									var22.widget = var9; // L: 11719
									var22.args = var9.onFriendTransmit; // L: 11720
									Client.scriptEvents.addFirst(var22); // L: 11721
								}

								if (Client.field702 > var9.field3626 && var9.onClanTransmit != null) { // L: 11723
									var22 = new ScriptEvent(); // L: 11724
									var22.widget = var9; // L: 11725
									var22.args = var9.onClanTransmit; // L: 11726
									Client.scriptEvents.addFirst(var22); // L: 11727
								}

								if (Client.field703 > var9.field3626 && var9.field3602 != null) { // L: 11729
									var22 = new ScriptEvent(); // L: 11730
									var22.widget = var9; // L: 11731
									var22.args = var9.field3602; // L: 11732
									Client.scriptEvents.addFirst(var22); // L: 11733
								}

								if (Client.field704 > var9.field3626 && var9.field3473 != null) { // L: 11735
									var22 = new ScriptEvent(); // L: 11736
									var22.widget = var9; // L: 11737
									var22.args = var9.field3473; // L: 11738
									Client.scriptEvents.addFirst(var22); // L: 11739
								}

								if (Client.field705 > var9.field3626 && var9.onStockTransmit != null) { // L: 11741
									var22 = new ScriptEvent(); // L: 11742
									var22.widget = var9; // L: 11743
									var22.args = var9.onStockTransmit; // L: 11744
									Client.scriptEvents.addFirst(var22); // L: 11745
								}

								if (Client.field706 > var9.field3626 && var9.field3582 != null) { // L: 11747
									var22 = new ScriptEvent(); // L: 11748
									var22.widget = var9; // L: 11749
									var22.args = var9.field3582; // L: 11750
									Client.scriptEvents.addFirst(var22); // L: 11751
								}

								if (Client.field499 > var9.field3626 && var9.onMiscTransmit != null) { // L: 11753
									var22 = new ScriptEvent(); // L: 11754
									var22.widget = var9; // L: 11755
									var22.args = var9.onMiscTransmit; // L: 11756
									Client.scriptEvents.addFirst(var22); // L: 11757
								}

								var9.field3626 = Client.cycleCntr; // L: 11759
								if (var9.onKey != null) { // L: 11760
									for (var39 = 0; var39 < Client.field679; ++var39) { // L: 11761
										ScriptEvent var32 = new ScriptEvent(); // L: 11762
										var32.widget = var9; // L: 11763
										var32.keyTyped = Client.field737[var39]; // L: 11764
										var32.keyPressed = Client.field613[var39]; // L: 11765
										var32.args = var9.onKey; // L: 11766
										Client.scriptEvents.addFirst(var32); // L: 11767
									}
								}

								ScriptEvent var31;
								int[] var38;
								if (var9.field3598 != null) { // L: 11770
									var38 = Client.field733.method3985(); // L: 11771

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 11772
										var31 = new ScriptEvent(); // L: 11773
										var31.widget = var9; // L: 11774
										var31.keyTyped = var38[var23]; // L: 11775
										var31.args = var9.field3598; // L: 11776
										Client.scriptEvents.addFirst(var31); // L: 11777
									}
								}

								if (var9.field3599 != null) { // L: 11780
									var38 = Client.field733.method3959(); // L: 11781

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 11782
										var31 = new ScriptEvent(); // L: 11783
										var31.widget = var9; // L: 11784
										var31.keyTyped = var38[var23]; // L: 11785
										var31.args = var9.field3599; // L: 11786
										Client.scriptEvents.addFirst(var31); // L: 11787
									}
								}
							}
						}

						if (!var9.isIf3) { // L: 11792
							if (Client.clickedWidget != null || VerticalAlignment.dragInventoryWidget != null || Client.isMenuOpen) { // L: 11793
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11794
								if (var9.mouseOverRedirect >= 0) { // L: 11795
									Occluder.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									Occluder.mousedOverWidgetIf1 = var9; // L: 11796
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11798
								Occluder.field2556 = var9; // L: 11799
							}

							if (var9.scrollHeight > var9.height) { // L: 11801
								class7.method32(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) { // L: 11803
							updateInterface(var0, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY); // L: 11804
							if (var9.children != null) { // L: 11805
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var29 = (InterfaceParent)Client.interfaceParents.get((long)var9.id); // L: 11806
							if (var29 != null) { // L: 11807
								if (var29.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) { // L: 11808
									for (ScriptEvent var30 = (ScriptEvent)Client.scriptEvents.last(); var30 != null; var30 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11809
										if (var30.isMouseInputEvent) { // L: 11810
											var30.remove(); // L: 11811
											var30.widget.containsMouse = false; // L: 11812
										}
									}

									if (Script.widgetDragDuration == 0) { // L: 11815
										Client.clickedWidget = null; // L: 11816
										Client.clickedWidgetParent = null; // L: 11817
									}

									if (!Client.isMenuOpen) { // L: 11819
										MusicPatchNode.addCancelMenuEntry(); // L: 11820
									}
								}

								WorldMapID.updateRootInterface(var29.group, var12, var13, var14, var15, var26, var11); // L: 11823
							}
						}
					}
				}
			}
		}

	} // L: 11827
}
