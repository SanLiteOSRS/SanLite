import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
final class class108 implements class337 {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lnm;)V"
	)
	class108(Widget var1) {
		this.val$cc = var1; // L: 516
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-118"
	)
	public void vmethod6238() {
		if (this.val$cc != null && this.val$cc.method6617().field3607 != null) { // L: 518
			ScriptEvent var1 = new ScriptEvent(); // L: 519
			var1.method2317(this.val$cc); // L: 520
			var1.setArgs(this.val$cc.method6617().field3607); // L: 521
			class7.method58().addFirst(var1); // L: 522
		}

	} // L: 524

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Luy;B)I",
		garbageValue = "0"
	)
	static int method2739(PacketBuffer var0) {
		int var1 = var0.readBits(2); // L: 438
		int var2;
		if (var1 == 0) { // L: 440
			var2 = 0;
		} else if (var1 == 1) {
			var2 = var0.readBits(5); // L: 441
		} else if (var1 == 2) { // L: 442
			var2 = var0.readBits(8);
		} else {
			var2 = var0.readBits(11); // L: 443
		}

		return var2; // L: 444
	}

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-957149443"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) { // L: 10321
			class153.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3); // L: 10322
		}

		long var4 = -1L; // L: 10325
		long var6 = -1L; // L: 10326
		int var8 = 0;

		while (true) {
			int var10 = ViewportMouse.ViewportMouse_entityCount; // L: 10331
			if (var8 >= var10) { // L: 10333
				if (var4 != -1L) { // L: 10476
					var8 = (int)(var4 >>> 0 & 127L); // L: 10479
					var10 = (int)(var4 >>> 7 & 127L); // L: 10484
					Player var12 = Client.players[Client.combatTargetPlayerIndex]; // L: 10487
					DirectByteArrayCopier.addPlayerToMenu(var12, Client.combatTargetPlayerIndex, var8, var10); // L: 10488
				}

				return; // L: 10490
			}

			long var26 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 10336
			if (var6 != var26) { // L: 10339
				label363: {
					var6 = var26; // L: 10340
					int var15 = HealthBar.method2616(var8); // L: 10341
					int var16 = class228.method4335(var8); // L: 10342
					long var19 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 10346
					int var18 = (int)(var19 >>> 14 & 3L); // L: 10348
					int var28 = GrandExchangeOfferOwnWorldComparator.method1242(var8); // L: 10353
					int var23;
					if (var18 == 2 && class10.scene.getObjectFlags(class87.Client_plane, var15, var16, var26) >= 0) { // L: 10354 10355
						ObjectComposition var20 = class91.getObjectDefinition(var28); // L: 10356
						if (var20.transforms != null) { // L: 10357
							var20 = var20.transform();
						}

						if (var20 == null) { // L: 10358
							break label363;
						}

						PendingSpawn var21 = null; // L: 10359

						for (PendingSpawn var22 = (PendingSpawn)Client.pendingSpawns.last(); var22 != null; var22 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 10360
							if (var22.plane == class87.Client_plane && var15 == var22.x && var16 == var22.y && var28 == var22.field1177) { // L: 10361
								var21 = var22; // L: 10362
								break;
							}
						}

						if (Client.isItemSelected == 1) { // L: 10366
							class153.insertMenuItemNoShift("Use", Client.field772 + " " + "->" + " " + Client.colorStartTag(65535) + var20.name, 1, var28, var15, var16); // L: 10367
						} else if (Client.isSpellSelected) { // L: 10370
							if ((class31.field173 & 4) == 4) { // L: 10371
								class153.insertMenuItemNoShift(Client.field751, Client.field688 + " " + "->" + " " + Client.colorStartTag(65535) + var20.name, 2, var28, var15, var16); // L: 10372
							}
						} else {
							String[] var36 = var20.actions; // L: 10377
							if (var36 != null) { // L: 10378
								for (var23 = 4; var23 >= 0; --var23) { // L: 10379
									if ((var21 == null || var21.method2415(var23)) && var36[var23] != null) { // L: 10380 10381
										short var24 = 0; // L: 10382
										if (var23 == 0) { // L: 10383
											var24 = 3;
										}

										if (var23 == 1) { // L: 10384
											var24 = 4;
										}

										if (var23 == 2) { // L: 10385
											var24 = 5;
										}

										if (var23 == 3) { // L: 10386
											var24 = 6;
										}

										if (var23 == 4) { // L: 10387
											var24 = 1001;
										}

										class153.insertMenuItemNoShift(var36[var23], Client.colorStartTag(65535) + var20.name, var24, var28, var15, var16); // L: 10388
									}
								}
							}

							class153.insertMenuItemNoShift("Examine", Client.colorStartTag(65535) + var20.name, 1002, var20.id, var15, var16); // L: 10393
						}
					}

					int var29;
					Player var30;
					NPC var37;
					int[] var38;
					if (var18 == 1) { // L: 10398
						NPC var32 = Client.npcs[var28]; // L: 10399
						if (var32 == null) { // L: 10400
							break label363;
						}

						if (var32.definition.size == 1 && (var32.x & 127) == 64 && (var32.y & 127) == 64) { // L: 10401
							for (var29 = 0; var29 < Client.npcCount; ++var29) { // L: 10402
								var37 = Client.npcs[Client.npcIndices[var29]]; // L: 10403
								if (var37 != null && var32 != var37 && var37.definition.size == 1 && var37.x == var32.x && var37.y == var32.y) { // L: 10404
									class16.addNpcToMenu(var37, Client.npcIndices[var29], var15, var16);
								}
							}

							var29 = Players.Players_count; // L: 10406
							var38 = Players.Players_indices; // L: 10407

							for (var23 = 0; var23 < var29; ++var23) { // L: 10408
								var30 = Client.players[var38[var23]]; // L: 10409
								if (var30 != null && var30.x == var32.x && var32.y == var30.y) { // L: 10410
									DirectByteArrayCopier.addPlayerToMenu(var30, var38[var23], var15, var16);
								}
							}
						}

						class16.addNpcToMenu(var32, var28, var15, var16); // L: 10413
					}

					if (var18 == 0) { // L: 10415
						Player var33 = Client.players[var28]; // L: 10416
						if (var33 == null) { // L: 10417
							break label363;
						}

						if ((var33.x & 127) == 64 && (var33.y & 127) == 64) { // L: 10418
							for (var29 = 0; var29 < Client.npcCount; ++var29) { // L: 10419
								var37 = Client.npcs[Client.npcIndices[var29]]; // L: 10420
								if (var37 != null && var37.definition.size == 1 && var37.x == var33.x && var33.y == var37.y) { // L: 10421
									class16.addNpcToMenu(var37, Client.npcIndices[var29], var15, var16);
								}
							}

							var29 = Players.Players_count; // L: 10423
							var38 = Players.Players_indices; // L: 10424

							for (var23 = 0; var23 < var29; ++var23) { // L: 10425
								var30 = Client.players[var38[var23]]; // L: 10426
								if (var30 != null && var30 != var33 && var30.x == var33.x && var33.y == var30.y) { // L: 10427
									DirectByteArrayCopier.addPlayerToMenu(var30, var38[var23], var15, var16);
								}
							}
						}

						if (var28 != Client.combatTargetPlayerIndex) { // L: 10430
							DirectByteArrayCopier.addPlayerToMenu(var33, var28, var15, var16);
						} else {
							var4 = var26; // L: 10431
						}
					}

					if (var18 == 3) { // L: 10433
						NodeDeque var34 = Client.groundItems[class87.Client_plane][var15][var16]; // L: 10434
						if (var34 != null) { // L: 10435
							for (TileItem var35 = (TileItem)var34.first(); var35 != null; var35 = (TileItem)var34.next()) { // L: 10436 10437 10471
								ItemComposition var39 = class214.ItemComposition_get(var35.id); // L: 10438
								if (Client.isItemSelected == 1) { // L: 10439
									class153.insertMenuItemNoShift("Use", Client.field772 + " " + "->" + " " + Client.colorStartTag(16748608) + var39.name, 16, var35.id, var15, var16); // L: 10440
								} else if (Client.isSpellSelected) { // L: 10443
									if ((class31.field173 & 1) == 1) { // L: 10444
										class153.insertMenuItemNoShift(Client.field751, Client.field688 + " " + "->" + " " + Client.colorStartTag(16748608) + var39.name, 17, var35.id, var15, var16); // L: 10445
									}
								} else {
									String[] var31 = var39.groundActions; // L: 10450

									for (int var40 = 4; var40 >= 0; --var40) { // L: 10451
										if (var35.method2726(var40)) { // L: 10452
											if (var31 != null && var31[var40] != null) { // L: 10453
												byte var25 = 0; // L: 10454
												if (var40 == 0) { // L: 10455
													var25 = 18;
												}

												if (var40 == 1) { // L: 10456
													var25 = 19;
												}

												if (var40 == 2) { // L: 10457
													var25 = 20;
												}

												if (var40 == 3) { // L: 10458
													var25 = 21;
												}

												if (var40 == 4) { // L: 10459
													var25 = 22;
												}

												class153.insertMenuItemNoShift(var31[var40], Client.colorStartTag(16748608) + var39.name, var25, var35.id, var15, var16); // L: 10460
											} else if (var40 == 2) { // L: 10463
												class153.insertMenuItemNoShift("Take", Client.colorStartTag(16748608) + var39.name, 20, var35.id, var15, var16); // L: 10464
											}
										}
									}

									class153.insertMenuItemNoShift("Examine", Client.colorStartTag(16748608) + var39.name, 1004, var35.id, var15, var16); // L: 10468
								}
							}
						}
					}
				}
			}

			++var8; // L: 10327
		}
	}

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "([Lnm;IIIIIIIB)V",
		garbageValue = "13"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) { // L: 11467
			Widget var9 = var0[var8]; // L: 11468
			if (var9 != null && var9.parentId == var1 && (var9.method6596() || MouseRecorder.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) { // L: 11469 11470 11471
				if (var9.isIf3) { // L: 11472
					if (CollisionMap.isComponentHidden(var9)) { // L: 11473
						continue;
					}
				} else if (var9.type == 0 && var9 != class64.mousedOverWidgetIf1 && CollisionMap.isComponentHidden(var9)) { // L: 11476
					continue;
				}

				if (var9.type == 11) { // L: 11478
					if (var9.method6611(class33.field184, AbstractWorldMapIcon.urlRequester)) { // L: 11479
						if (var9.method6604()) { // L: 11480
							ClanChannelMember.invalidateWidget(var9); // L: 11481
							PendingSpawn.revalidateWidgetScroll(var9.children, var9, true); // L: 11482
						}

						if (var9.field3801 != null) { // L: 11484
							ScriptEvent var10 = new ScriptEvent(); // L: 11485
							var10.widget = var9; // L: 11486
							var10.args = var9.field3801; // L: 11487
							Client.scriptEvents.addFirst(var10); // L: 11488
						}
					}
				} else if (var9.type == 12 && var9.method6619(class33.field184)) { // L: 11492 11493
					ClanChannelMember.invalidateWidget(var9); // L: 11494
				}

				int var26 = var9.x + var6; // L: 11497
				int var11 = var7 + var9.y; // L: 11498
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				if (var9.type == 9) { // L: 11503
					var16 = var26; // L: 11504
					var17 = var11; // L: 11505
					var18 = var26 + var9.width; // L: 11506
					int var19 = var11 + var9.height; // L: 11507
					if (var18 < var26) { // L: 11508
						var16 = var18; // L: 11510
						var18 = var26; // L: 11511
					}

					if (var19 < var11) { // L: 11513
						var17 = var19; // L: 11515
						var19 = var11; // L: 11516
					}

					++var18; // L: 11518
					++var19; // L: 11519
					var12 = var16 > var2 ? var16 : var2; // L: 11520
					var13 = var17 > var3 ? var17 : var3; // L: 11521
					var14 = var18 < var4 ? var18 : var4; // L: 11522
					var15 = var19 < var5 ? var19 : var5; // L: 11523
				} else {
					var16 = var26 + var9.width; // L: 11526
					var17 = var11 + var9.height; // L: 11527
					var12 = var26 > var2 ? var26 : var2; // L: 11528
					var13 = var11 > var3 ? var11 : var3; // L: 11529
					var14 = var16 < var4 ? var16 : var4; // L: 11530
					var15 = var17 < var5 ? var17 : var5; // L: 11531
				}

				if (var9 == Client.clickedWidget) { // L: 11533
					Client.field685 = true; // L: 11534
					Client.field554 = var26; // L: 11535
					Client.field711 = var11; // L: 11536
				}

				boolean var34 = false; // L: 11538
				if (var9.field3751) { // L: 11539
					switch(Client.field691) { // L: 11540
					case 0:
						var34 = true; // L: 11542
					case 1:
					default:
						break;
					case 2:
						if (Client.field692 == var9.id >>> 16) { // L: 11550
							var34 = true; // L: 11551
						}
						break;
					case 3:
						if (var9.id == Client.field692) { // L: 11545
							var34 = true; // L: 11546
						}
					}
				}

				if (var34 || !var9.isIf3 || var12 < var14 && var13 < var15) { // L: 11556
					if (var9.isIf3) { // L: 11557
						ScriptEvent var27;
						if (var9.noClickThrough) { // L: 11558
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11559
								for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11560
									if (var27.field1077) { // L: 11561
										var27.remove(); // L: 11562
										var27.widget.field3815 = false; // L: 11563
									}
								}

								Clock.method3596(); // L: 11566
								if (FriendsChatManager.widgetDragDuration == 0) { // L: 11567
									Client.clickedWidget = null; // L: 11568
									Client.clickedWidgetParent = null; // L: 11569
								}

								if (!Client.isMenuOpen) { // L: 11571
									StudioGame.addCancelMenuEntry(); // L: 11572
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11576 11577
							for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11578
								if (var27.field1077 && var27.widget.onScroll == var27.args) { // L: 11579
									var27.remove(); // L: 11580
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x; // L: 11586
					var18 = MouseHandler.MouseHandler_y; // L: 11587
					if (MouseHandler.MouseHandler_lastButton != 0) { // L: 11588
						var17 = MouseHandler.MouseHandler_lastPressedX; // L: 11589
						var18 = MouseHandler.MouseHandler_lastPressedY; // L: 11590
					}

					boolean var35 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15; // L: 11592
					if (var9.contentType == 1337) { // L: 11593
						if (!Client.field531 && !Client.isMenuOpen && var35) { // L: 11594
							addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) { // L: 11597
						class401.checkIfMinimapClicked(var9, var26, var11); // L: 11598
					} else {
						if (var9.contentType == 1400) { // L: 11601
							class434.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height); // L: 11602
						}

						if (!Client.isMenuOpen && var35) { // L: 11604
							if (var9.contentType == 1400) { // L: 11605
								class434.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18); // L: 11606
							} else {
								GroundObject.method4500(var9); // L: 11609
							}
						}

						boolean var21;
						int var23;
						if (var34) { // L: 11612
							for (int var20 = 0; var20 < var9.field3752.length; ++var20) { // L: 11613
								var21 = false; // L: 11614
								boolean var28 = false; // L: 11615
								if (!var21 && var9.field3752[var20] != null) { // L: 11616
									for (var23 = 0; var23 < var9.field3752[var20].length; ++var23) { // L: 11617
										boolean var24 = false; // L: 11618
										if (var9.field3689 != null) { // L: 11619
											var24 = Client.field755.method4280(var9.field3752[var20][var23]); // L: 11620
										}

										if (class131.method3016(var9.field3752[var20][var23]) || var24) { // L: 11622
											var21 = true; // L: 11623
											if (var9.field3689 != null && var9.field3689[var20] > Client.cycle) { // L: 11624
												break;
											}

											byte var33 = var9.field3779[var20][var23]; // L: 11625
											if (var33 == 0 || ((var33 & 8) == 0 || !Client.field755.method4280(86) && !Client.field755.method4280(82) && !Client.field755.method4280(81)) && ((var33 & 2) == 0 || Client.field755.method4280(86)) && ((var33 & 1) == 0 || Client.field755.method4280(82)) && ((var33 & 4) == 0 || Client.field755.method4280(81))) { // L: 11626 11627 11628 11629 11630
												var28 = true; // L: 11632
												break;
											}
										}
									}
								}

								if (var28) { // L: 11638
									if (var20 < 10) { // L: 11639
										TextureProvider.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) { // L: 11640
										class286.method5663(); // L: 11641
										class478.method8514(var9.id, var9.childIndex, KitDefinition.Widget_unpackTargetMask(MouseRecorder.getWidgetFlags(var9)), var9.itemId); // L: 11642
										Client.field751 = class155.Widget_getSpellActionName(var9); // L: 11643
										if (Client.field751 == null) { // L: 11644
											Client.field751 = "null";
										}

										Client.field688 = var9.dataText + Client.colorStartTag(16777215); // L: 11645
									}

									var23 = var9.field3770[var20]; // L: 11647
									if (var9.field3689 == null) { // L: 11648
										var9.field3689 = new int[var9.field3752.length];
									}

									if (var9.field3800 == null) { // L: 11649
										var9.field3800 = new int[var9.field3752.length];
									}

									if (var23 != 0) { // L: 11650
										if (var9.field3689[var20] == 0) { // L: 11651
											var9.field3689[var20] = var23 + Client.cycle + var9.field3800[var20];
										} else {
											var9.field3689[var20] = var23 + Client.cycle; // L: 11652
										}
									} else {
										var9.field3689[var20] = Integer.MAX_VALUE; // L: 11654
									}
								}

								if (!var21 && var9.field3689 != null) { // L: 11656 11657
									var9.field3689[var20] = 0;
								}
							}
						}

						if (var9.isIf3) { // L: 11661
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11662
								var35 = true;
							} else {
								var35 = false; // L: 11663
							}

							boolean var36 = false; // L: 11664
							if ((MouseHandler.MouseHandler_currentButton == 1 || !UserComparator8.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) { // L: 11665
								var36 = true;
							}

							var21 = false; // L: 11666
							if ((MouseHandler.MouseHandler_lastButton == 1 || !UserComparator8.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) { // L: 11667
								var21 = true;
							}

							if (var21) { // L: 11668
								TaskHandler.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11); // L: 11669
							}

							if (var9.method6597()) { // L: 11671
								if (var21) { // L: 11672
									Client.field534.addFirst(new class225(0, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9)); // L: 11673
								}

								if (var36) { // L: 11675
									Client.field534.addFirst(new class225(1, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9)); // L: 11676
								}
							}

							if (var9.contentType == 1400) { // L: 11679
								class434.worldMap.method8656(var17, var18, var35 & var36, var35 & var21); // L: 11680
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && class517.method9044(MouseRecorder.getWidgetFlags(var9))) { // L: 11682
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) { // L: 11683
								Client.field647 = true; // L: 11684
								Client.field750 = var26; // L: 11685
								Client.field748 = var11; // L: 11686
							}

							if (var9.hasListener) { // L: 11688
								ScriptEvent var22;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) { // L: 11689
									var22 = new ScriptEvent(); // L: 11690
									var22.field1077 = true; // L: 11691
									var22.widget = var9; // L: 11692
									var22.mouseY = Client.mouseWheelRotation; // L: 11693
									var22.args = var9.onScroll; // L: 11694
									Client.scriptEvents.addFirst(var22); // L: 11695
								}

								if (Client.clickedWidget != null || Client.isMenuOpen) { // L: 11697
									var21 = false; // L: 11698
									var36 = false; // L: 11699
									var35 = false; // L: 11700
								}

								if (!var9.field3816 && var21) { // L: 11702
									var9.field3816 = true; // L: 11703
									if (var9.onClick != null) { // L: 11704
										var22 = new ScriptEvent(); // L: 11705
										var22.field1077 = true; // L: 11706
										var22.widget = var9; // L: 11707
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var26; // L: 11708
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11; // L: 11709
										var22.args = var9.onClick; // L: 11710
										Client.scriptEvents.addFirst(var22); // L: 11711
									}
								}

								if (var9.field3816 && var36 && var9.onClickRepeat != null) { // L: 11714 11715
									var22 = new ScriptEvent(); // L: 11716
									var22.field1077 = true; // L: 11717
									var22.widget = var9; // L: 11718
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11719
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11720
									var22.args = var9.onClickRepeat; // L: 11721
									Client.scriptEvents.addFirst(var22); // L: 11722
								}

								if (var9.field3816 && !var36) { // L: 11725
									var9.field3816 = false; // L: 11726
									if (var9.onRelease != null) { // L: 11727
										var22 = new ScriptEvent(); // L: 11728
										var22.field1077 = true; // L: 11729
										var22.widget = var9; // L: 11730
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11731
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11732
										var22.args = var9.onRelease; // L: 11733
										Client.field734.addFirst(var22); // L: 11734
									}
								}

								if (var36 && var9.onHold != null) { // L: 11737 11738
									var22 = new ScriptEvent(); // L: 11739
									var22.field1077 = true; // L: 11740
									var22.widget = var9; // L: 11741
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11742
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11743
									var22.args = var9.onHold; // L: 11744
									Client.scriptEvents.addFirst(var22); // L: 11745
								}

								if (!var9.field3815 && var35) { // L: 11748
									var9.field3815 = true; // L: 11749
									if (var9.onMouseOver != null) { // L: 11750
										var22 = new ScriptEvent(); // L: 11751
										var22.field1077 = true; // L: 11752
										var22.widget = var9; // L: 11753
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11754
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11755
										var22.args = var9.onMouseOver; // L: 11756
										Client.scriptEvents.addFirst(var22); // L: 11757
									}
								}

								if (var9.field3815 && var35 && var9.onMouseRepeat != null) { // L: 11760 11761
									var22 = new ScriptEvent(); // L: 11762
									var22.field1077 = true; // L: 11763
									var22.widget = var9; // L: 11764
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11765
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11766
									var22.args = var9.onMouseRepeat; // L: 11767
									Client.scriptEvents.addFirst(var22); // L: 11768
								}

								if (var9.field3815 && !var35) { // L: 11771
									var9.field3815 = false; // L: 11772
									if (var9.onMouseLeave != null) { // L: 11773
										var22 = new ScriptEvent(); // L: 11774
										var22.field1077 = true; // L: 11775
										var22.widget = var9; // L: 11776
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11777
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11778
										var22.args = var9.onMouseLeave; // L: 11779
										Client.field734.addFirst(var22); // L: 11780
									}
								}

								if (var9.onTimer != null) { // L: 11783
									var22 = new ScriptEvent(); // L: 11784
									var22.widget = var9; // L: 11785
									var22.args = var9.onTimer; // L: 11786
									Client.field542.addFirst(var22); // L: 11787
								}

								ScriptEvent var25;
								int var37;
								int var39;
								if (var9.onVarTransmit != null && Client.field631 > var9.field3667) { // L: 11789
									if (var9.varTransmitTriggers != null && Client.field631 - var9.field3667 <= 32) { // L: 11790
										label831:
										for (var39 = var9.field3667; var39 < Client.field631; ++var39) { // L: 11797
											var23 = Client.field716[var39 & 31]; // L: 11798

											for (var37 = 0; var37 < var9.varTransmitTriggers.length; ++var37) { // L: 11799
												if (var23 == var9.varTransmitTriggers[var37]) { // L: 11800
													var25 = new ScriptEvent(); // L: 11801
													var25.widget = var9; // L: 11802
													var25.args = var9.onVarTransmit; // L: 11803
													Client.scriptEvents.addFirst(var25); // L: 11804
													break label831; // L: 11805
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11791
										var22.widget = var9; // L: 11792
										var22.args = var9.onVarTransmit; // L: 11793
										Client.scriptEvents.addFirst(var22); // L: 11794
									}

									var9.field3667 = Client.field631; // L: 11810
								}

								if (var9.onInvTransmit != null && Client.field602 > var9.field3819) { // L: 11812
									if (var9.invTransmitTriggers != null && Client.field602 - var9.field3819 <= 32) { // L: 11813
										label807:
										for (var39 = var9.field3819; var39 < Client.field602; ++var39) { // L: 11820
											var23 = Client.field676[var39 & 31]; // L: 11821

											for (var37 = 0; var37 < var9.invTransmitTriggers.length; ++var37) { // L: 11822
												if (var23 == var9.invTransmitTriggers[var37]) { // L: 11823
													var25 = new ScriptEvent(); // L: 11824
													var25.widget = var9; // L: 11825
													var25.args = var9.onInvTransmit; // L: 11826
													Client.scriptEvents.addFirst(var25); // L: 11827
													break label807; // L: 11828
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11814
										var22.widget = var9; // L: 11815
										var22.args = var9.onInvTransmit; // L: 11816
										Client.scriptEvents.addFirst(var22); // L: 11817
									}

									var9.field3819 = Client.field602; // L: 11833
								}

								if (var9.onStatTransmit != null && Client.field605 > var9.field3820) { // L: 11835
									if (var9.statTransmitTriggers != null && Client.field605 - var9.field3820 <= 32) { // L: 11836
										label783:
										for (var39 = var9.field3820; var39 < Client.field605; ++var39) { // L: 11843
											var23 = Client.field718[var39 & 31]; // L: 11844

											for (var37 = 0; var37 < var9.statTransmitTriggers.length; ++var37) { // L: 11845
												if (var23 == var9.statTransmitTriggers[var37]) { // L: 11846
													var25 = new ScriptEvent(); // L: 11847
													var25.widget = var9; // L: 11848
													var25.args = var9.onStatTransmit; // L: 11849
													Client.scriptEvents.addFirst(var25); // L: 11850
													break label783; // L: 11851
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11837
										var22.widget = var9; // L: 11838
										var22.args = var9.onStatTransmit; // L: 11839
										Client.scriptEvents.addFirst(var22); // L: 11840
									}

									var9.field3820 = Client.field605; // L: 11856
								}

								if (Client.chatCycle > var9.field3817 && var9.onChatTransmit != null) { // L: 11858
									var22 = new ScriptEvent(); // L: 11859
									var22.widget = var9; // L: 11860
									var22.args = var9.onChatTransmit; // L: 11861
									Client.scriptEvents.addFirst(var22); // L: 11862
								}

								if (Client.field723 > var9.field3817 && var9.onFriendTransmit != null) { // L: 11864
									var22 = new ScriptEvent(); // L: 11865
									var22.widget = var9; // L: 11866
									var22.args = var9.onFriendTransmit; // L: 11867
									Client.scriptEvents.addFirst(var22); // L: 11868
								}

								if (Client.field710 > var9.field3817 && var9.onClanTransmit != null) { // L: 11870
									var22 = new ScriptEvent(); // L: 11871
									var22.widget = var9; // L: 11872
									var22.args = var9.onClanTransmit; // L: 11873
									Client.scriptEvents.addFirst(var22); // L: 11874
								}

								if (Client.field642 > var9.field3817 && var9.field3793 != null) { // L: 11876
									var22 = new ScriptEvent(); // L: 11877
									var22.widget = var9; // L: 11878
									var22.args = var9.field3793; // L: 11879
									Client.scriptEvents.addFirst(var22); // L: 11880
								}

								if (Client.field517 > var9.field3817 && var9.field3794 != null) { // L: 11882
									var22 = new ScriptEvent(); // L: 11883
									var22.widget = var9; // L: 11884
									var22.args = var9.field3794; // L: 11885
									Client.scriptEvents.addFirst(var22); // L: 11886
								}

								if (Client.field727 > var9.field3817 && var9.onStockTransmit != null) { // L: 11888
									var22 = new ScriptEvent(); // L: 11889
									var22.widget = var9; // L: 11890
									var22.args = var9.onStockTransmit; // L: 11891
									Client.scriptEvents.addFirst(var22); // L: 11892
								}

								if (Client.field744 > var9.field3817 && var9.field3708 != null) { // L: 11894
									var22 = new ScriptEvent(); // L: 11895
									var22.widget = var9; // L: 11896
									var22.args = var9.field3708; // L: 11897
									Client.scriptEvents.addFirst(var22); // L: 11898
								}

								if (Client.field729 > var9.field3817 && var9.onMiscTransmit != null) { // L: 11900
									var22 = new ScriptEvent(); // L: 11901
									var22.widget = var9; // L: 11902
									var22.args = var9.onMiscTransmit; // L: 11903
									Client.scriptEvents.addFirst(var22); // L: 11904
								}

								var9.field3817 = Client.cycleCntr; // L: 11906
								if (var9.onKey != null) { // L: 11907
									for (var39 = 0; var39 < Client.field757; ++var39) { // L: 11908
										ScriptEvent var32 = new ScriptEvent(); // L: 11909
										var32.widget = var9; // L: 11910
										var32.keyTyped = Client.field759[var39]; // L: 11911
										var32.keyPressed = Client.field661[var39]; // L: 11912
										var32.args = var9.onKey; // L: 11913
										Client.scriptEvents.addFirst(var32); // L: 11914
									}
								}

								ScriptEvent var31;
								int[] var38;
								if (var9.field3789 != null) { // L: 11917
									var38 = Client.field755.method4298(); // L: 11918

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 11919
										var31 = new ScriptEvent(); // L: 11920
										var31.widget = var9; // L: 11921
										var31.keyTyped = var38[var23]; // L: 11922
										var31.args = var9.field3789; // L: 11923
										Client.scriptEvents.addFirst(var31); // L: 11924
									}
								}

								if (var9.field3790 != null) { // L: 11927
									var38 = Client.field755.method4292(); // L: 11928

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 11929
										var31 = new ScriptEvent(); // L: 11930
										var31.widget = var9; // L: 11931
										var31.keyTyped = var38[var23]; // L: 11932
										var31.args = var9.field3790; // L: 11933
										Client.scriptEvents.addFirst(var31); // L: 11934
									}
								}
							}
						}

						if (!var9.isIf3) { // L: 11939
							if (Client.clickedWidget != null || Client.isMenuOpen) { // L: 11940
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.field3805 != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11941
								if (var9.mouseOverRedirect >= 0) { // L: 11942
									class64.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									class64.mousedOverWidgetIf1 = var9; // L: 11943
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11945
								GrandExchangeOfferNameComparator.field4374 = var9; // L: 11946
							}

							if (var9.scrollHeight > var9.height) { // L: 11948
								class305.method5862(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) { // L: 11950
							updateInterface(var0, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY); // L: 11951
							if (var9.children != null) { // L: 11952
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var29 = (InterfaceParent)Client.interfaceParents.get((long)var9.id); // L: 11953
							if (var29 != null) { // L: 11954
								if (var29.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) { // L: 11955
									for (ScriptEvent var30 = (ScriptEvent)Client.scriptEvents.last(); var30 != null; var30 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11956
										if (var30.field1077) { // L: 11957
											var30.remove(); // L: 11958
											var30.widget.field3815 = false; // L: 11959
										}
									}

									if (FriendsChatManager.widgetDragDuration == 0) { // L: 11962
										Client.clickedWidget = null; // L: 11963
										Client.clickedWidgetParent = null; // L: 11964
									}

									if (!Client.isMenuOpen) { // L: 11966
										StudioGame.addCancelMenuEntry(); // L: 11967
									}
								}

								class511.addPendingSpawnToScene(var29.group, var12, var13, var14, var15, var26, var11); // L: 11970
							}
						}
					}
				}
			}
		}

	} // L: 11974
}
