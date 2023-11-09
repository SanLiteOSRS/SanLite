import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
	@ObfuscatedName("at")
	@Export("javaVendor")
	public static String javaVendor;
	@ObfuscatedName("an")
	@Export("javaVersion")
	public static String javaVersion;
	@ObfuscatedName("oa")
	@ObfuscatedGetter(
		intValue = -540054147
	)
	static int field1820;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	@Export("current")
	Task current;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("ax")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("ap")
	@Export("isClosed")
	boolean isClosed;

	public TaskHandler() {
		this.current = null; // L: 11
		this.task = null; // L: 12
		this.isClosed = false; // L: 14
		javaVendor = "Unknown"; // L: 20
		javaVersion = "1.6"; // L: 21

		try {
			javaVendor = System.getProperty("java.vendor"); // L: 23
			javaVersion = System.getProperty("java.version"); // L: 24
		} catch (Exception var2) { // L: 26
		}

		this.isClosed = false; // L: 27
		this.thread = new Thread(this); // L: 28
		this.thread.setPriority(10); // L: 29
		this.thread.setDaemon(true); // L: 30
		this.thread.start(); // L: 31
	} // L: 32

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1272500882"
	)
	@Export("close")
	public final void close() {
		synchronized(this) { // L: 35
			this.isClosed = true; // L: 36
			this.notifyAll(); // L: 37
		} // L: 38

		try {
			this.thread.join(); // L: 40
		} catch (InterruptedException var3) { // L: 42
		}

	} // L: 43

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/lang/Object;I)Lgu;",
		garbageValue = "122006443"
	)
	@Export("newTask")
	final Task newTask(int var1, int var2, int var3, Object var4) {
		Task var5 = new Task(); // L: 90
		var5.type = var1; // L: 91
		var5.intArgument = var2; // L: 92
		var5.objectArgument = var4; // L: 93
		synchronized(this) { // L: 94
			if (this.task != null) { // L: 95
				this.task.next = var5; // L: 96
				this.task = var5; // L: 97
			} else {
				this.task = this.current = var5; // L: 100
			}

			this.notify(); // L: 102
			return var5; // L: 104
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lgu;",
		garbageValue = "1393829156"
	)
	@Export("newSocketTask")
	public final Task newSocketTask(String var1, int var2) {
		return this.newTask(1, var2, 0, var1); // L: 108
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;II)Lgu;",
		garbageValue = "1287584329"
	)
	@Export("newThreadTask")
	public final Task newThreadTask(Runnable var1, int var2) {
		return this.newTask(2, var2, 0, var1); // L: 112
	}

	public final void run() {
		while (true) {
			Task var1;
			synchronized(this) { // L: 48
				while (true) {
					if (this.isClosed) { // L: 50
						return;
					}

					if (this.current != null) { // L: 51
						var1 = this.current; // L: 52
						this.current = this.current.next; // L: 53
						if (this.current == null) { // L: 54
							this.task = null;
						}
						break;
					}

					try {
						this.wait(); // L: 58
					} catch (InterruptedException var8) { // L: 60
					}
				}
			}

			try {
				int var5 = var1.type; // L: 64
				if (var5 == 1) { // L: 65
					var1.result = new Socket(InetAddress.getByName((String)var1.objectArgument), var1.intArgument); // L: 66
				} else if (var5 == 2) { // L: 68
					Thread var3 = new Thread((Runnable)var1.objectArgument); // L: 69
					var3.setDaemon(true); // L: 70
					var3.start(); // L: 71
					var3.setPriority(var1.intArgument); // L: 72
					var1.result = var3; // L: 73
				} else if (var5 == 4) { // L: 75
					var1.result = new DataInputStream(((URL)var1.objectArgument).openStream()); // L: 76
				}

				var1.status = 1; // L: 78
			} catch (ThreadDeath var6) { // L: 80
				throw var6; // L: 81
			} catch (Throwable var7) { // L: 83
				var1.status = 2; // L: 84
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Lfz;",
		garbageValue = "624885159"
	)
	static class136 method3484(int var0) {
		class136 var2 = HealthBar.method2553(var0); // L: 393
		int var1;
		if (var2 == null) { // L: 394
			var1 = 2; // L: 395
		} else {
			var1 = var2.method3051() ? 0 : 1; // L: 398
		}

		return var1 != 0 ? null : HealthBar.method2553(var0); // L: 400 401 403
	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "([Lmb;IIIIIIIIS)V",
		garbageValue = "-13451"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10564
		Rasterizer3D.method4382(); // L: 10565

		for (int var9 = 0; var9 < var0.length; ++var9) { // L: 10566
			Widget var10 = var0[var9]; // L: 10567
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) { // L: 10568 10569
				int var11;
				if (var8 == -1) { // L: 10571
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6; // L: 10572
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y; // L: 10573
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width; // L: 10574
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height; // L: 10575
					var11 = ++Client.rootWidgetCount - 1; // L: 10576
				} else {
					var11 = var8; // L: 10578
				}

				var10.rootIndex = var11; // L: 10579
				var10.cycle = Client.cycle; // L: 10580
				if (!var10.isIf3 || !UserComparator9.isComponentHidden(var10)) { // L: 10581
					if (var10.contentType > 0) { // L: 10582
						class36.method658(var10);
					}

					int var12 = var10.x + var6; // L: 10583
					int var13 = var7 + var10.y; // L: 10584
					int var14 = var10.transparencyTop; // L: 10585
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) { // L: 10586
						if (var1 != -1412584499 && !var10.isScrollBar) { // L: 10587
							class134.field1575 = var0; // L: 10588
							class74.field911 = var6; // L: 10589
							class171.field1825 = var7; // L: 10590
							continue; // L: 10591
						}

						if (Client.isDraggingWidget && Client.field639) { // L: 10593
							var15 = MouseHandler.MouseHandler_x; // L: 10594
							var16 = MouseHandler.MouseHandler_y; // L: 10595
							var15 -= Client.widgetClickX; // L: 10596
							var16 -= Client.widgetClickY; // L: 10597
							if (var15 < Client.field534) { // L: 10598
								var15 = Client.field534;
							}

							if (var15 + var10.width > Client.field534 + Client.clickedWidgetParent.width) { // L: 10599
								var15 = Client.field534 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field692) { // L: 10600
								var16 = Client.field692;
							}

							if (var16 + var10.height > Client.field692 + Client.clickedWidgetParent.height) { // L: 10601
								var16 = Client.field692 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15; // L: 10602
							var13 = var16; // L: 10603
						}

						if (!var10.isScrollBar) { // L: 10605
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 9) { // L: 10611
						var19 = var12; // L: 10612
						var20 = var13; // L: 10613
						var21 = var12 + var10.width; // L: 10614
						var22 = var13 + var10.height; // L: 10615
						if (var21 < var12) { // L: 10616
							var19 = var21; // L: 10618
							var21 = var12; // L: 10619
						}

						if (var22 < var13) { // L: 10621
							var20 = var22; // L: 10623
							var22 = var13; // L: 10624
						}

						++var21; // L: 10626
						++var22; // L: 10627
						var15 = var19 > var2 ? var19 : var2; // L: 10628
						var16 = var20 > var3 ? var20 : var3; // L: 10629
						var17 = var21 < var4 ? var21 : var4; // L: 10630
						var18 = var22 < var5 ? var22 : var5; // L: 10631
					} else {
						var19 = var12 + var10.width; // L: 10634
						var20 = var13 + var10.height; // L: 10635
						var15 = var12 > var2 ? var12 : var2; // L: 10636
						var16 = var13 > var3 ? var13 : var3; // L: 10637
						var17 = var19 < var4 ? var19 : var4; // L: 10638
						var18 = var20 < var5 ? var20 : var5; // L: 10639
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) { // L: 10641
						if (var10.contentType != 0) { // L: 10642
							if (var10.contentType == 1336) { // L: 10643
								if (class10.clientPreferences.method2448()) { // L: 10644
									var13 += 15; // L: 10645
									class404.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1); // L: 10646
									var13 += 15; // L: 10647
									Runtime var41 = Runtime.getRuntime(); // L: 10648
									var20 = (int)((var41.totalMemory() - var41.freeMemory()) / 1024L); // L: 10649
									var21 = 16776960; // L: 10650
									if (var20 > 327680 && !Client.isLowDetail) { // L: 10651
										var21 = 16711680;
									}

									class404.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1); // L: 10652
									var13 += 15; // L: 10653
								}
								continue;
							}

							if (var10.contentType == 1337) { // L: 10657
								Client.field662 = var12; // L: 10658
								Client.field663 = var13; // L: 10659
								Skeleton.drawEntities(var12, var13, var10.width, var10.height); // L: 10660
								Client.field723[var10.rootIndex] = true; // L: 10661
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10662
								continue; // L: 10663
							}

							if (var10.contentType == 1338) { // L: 10665
								Decimator.drawMinimap(var10, var12, var13, var11); // L: 10666
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10667
								continue; // L: 10668
							}

							if (var10.contentType == 1339) { // L: 10670
								HealthBarUpdate.drawCompass(var10, var12, var13, var11); // L: 10671
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10672
								continue; // L: 10673
							}

							if (var10.contentType == 1400) { // L: 10675
								ScriptFrame.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle); // L: 10676
							}

							if (var10.contentType == 1401) { // L: 10678
								ScriptFrame.worldMap.drawOverview(var12, var13, var10.width, var10.height); // L: 10679
							}

							if (var10.contentType == 1402) { // L: 10681
								class237.loginScreenRunesAnimation.draw(var12, Client.cycle); // L: 10682
							}
						}

						if (var10.type == 0) { // L: 10685
							if (!var10.isIf3 && UserComparator9.isComponentHidden(var10) && var10 != ClanChannel.mousedOverWidgetIf1) { // L: 10686
								continue;
							}

							if (!var10.isIf3) { // L: 10687
								if (var10.scrollY > var10.scrollHeight - var10.height) { // L: 10688
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) { // L: 10689
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11); // L: 10691
							if (var10.children != null) { // L: 10692
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var10.id); // L: 10693
							if (var28 != null) { // L: 10694
								Renderable.drawWidgets(var28.group, var15, var16, var17, var18, var12, var13, var11); // L: 10695
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10697
							Rasterizer3D.method4382(); // L: 10698
						} else if (var10.type == 11) { // L: 10700
							if (UserComparator9.isComponentHidden(var10) && var10 != ClanChannel.mousedOverWidgetIf1) { // L: 10701
								continue;
							}

							if (var10.children != null) { // L: 10702
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10703
							Rasterizer3D.method4382(); // L: 10704
						}

						if (Client.isResizable || Client.field743[var11] || Client.gameDrawingMode > 1) { // L: 10706
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) { // L: 10707 10708
								WorldMapLabelSize.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) { // L: 10710
								if (var10.type == 3) { // L: 10713
									if (ItemComposition.runCs1(var10)) { // L: 10715
										var19 = var10.color2; // L: 10716
										if (var10 == ClanChannel.mousedOverWidgetIf1 && var10.field3630 != 0) { // L: 10717
											var19 = var10.field3630;
										}
									} else {
										var19 = var10.color; // L: 10720
										if (var10 == ClanChannel.mousedOverWidgetIf1 && var10.field3704 != 0) { // L: 10721
											var19 = var10.field3704;
										}
									}

									if (var10.fill) { // L: 10723
										switch(var10.fillMode.field5101) { // L: 10724
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2); // L: 10733
											break; // L: 10734
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255)); // L: 10730
											break; // L: 10731
										default:
											if (var14 == 0) { // L: 10726
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10727
											}
										}
									} else if (var14 == 0) { // L: 10738
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10739
									}
								} else if (var10.type == 4) { // L: 10743
									Font var40 = var10.getFont(); // L: 10744
									if (var40 == null) { // L: 10745
										if (Widget.field3600) { // L: 10746
											Messages.invalidateWidget(var10);
										}
									} else {
										String var42 = var10.text; // L: 10750
										if (ItemComposition.runCs1(var10)) { // L: 10751
											var20 = var10.color2; // L: 10752
											if (var10 == ClanChannel.mousedOverWidgetIf1 && var10.field3630 != 0) { // L: 10753
												var20 = var10.field3630;
											}

											if (var10.field3666.length() > 0) { // L: 10754
												var42 = var10.field3666;
											}
										} else {
											var20 = var10.color; // L: 10757
											if (var10 == ClanChannel.mousedOverWidgetIf1 && var10.field3704 != 0) { // L: 10758
												var20 = var10.field3704;
											}
										}

										if (var10.isIf3 && var10.itemId != -1) { // L: 10760
											ItemComposition var43 = class300.ItemComposition_get(var10.itemId); // L: 10761
											var42 = var43.name; // L: 10762
											if (var42 == null) { // L: 10763
												var42 = "null";
											}

											if ((var43.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) { // L: 10764
												var42 = class349.colorStartTag(16748608) + var42 + "</col>" + " " + 'x' + class346.formatItemStacks(var10.itemQuantity);
											}
										}

										if (var10 == Client.meslayerContinueWidget) { // L: 10766
											var42 = "Please wait..."; // L: 10767
											var20 = var10.color; // L: 10768
										}

										if (!var10.isIf3) { // L: 10770
											var42 = BuddyRankComparator.method2892(var42, var10);
										}

										var40.method7431(var42, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, class388.method7210(var10.transparencyTop), var10.textXAlignment, var10.textYAlignment, var10.textLineHeight); // L: 10771
									}
								} else {
									int var23;
									int var24;
									int var25;
									if (var10.type == 5) { // L: 10774
										SpritePixels var38;
										if (!var10.isIf3) { // L: 10775
											var38 = var10.getSprite(ItemComposition.runCs1(var10), class47.urlRequester); // L: 10776
											if (var38 != null) { // L: 10777
												var38.drawTransBgAt(var12, var13);
											} else if (Widget.field3600) { // L: 10778
												Messages.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) { // L: 10782
												var38 = ScriptEvent.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var38 = var10.getSprite(false, class47.urlRequester); // L: 10783
											}

											if (var38 == null) { // L: 10784
												if (Widget.field3600) { // L: 10808
													Messages.invalidateWidget(var10);
												}
											} else {
												var20 = var38.width; // L: 10785
												var21 = var38.height; // L: 10786
												if (!var10.spriteTiling) { // L: 10787
													var22 = var10.width * 4096 / var20; // L: 10801
													if (var10.spriteAngle != 0) { // L: 10802
														var38.method9438(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) { // L: 10803
														var38.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) { // L: 10804
														var38.drawTransBgAt(var12, var13); // L: 10805
													} else {
														var38.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height); // L: 10788
													var22 = (var20 - 1 + var10.width) / var20; // L: 10789
													var23 = (var21 - 1 + var10.height) / var21; // L: 10790

													for (var24 = 0; var24 < var22; ++var24) { // L: 10791
														for (var25 = 0; var25 < var23; ++var25) { // L: 10792
															if (var10.spriteAngle != 0) { // L: 10793
																var38.method9438(var20 / 2 + var12 + var20 * var24, var21 / 2 + var13 + var21 * var25, var10.spriteAngle, 4096);
															} else if (var14 != 0) { // L: 10794
																var38.drawTransAt(var12 + var24 * var20, var13 + var25 * var21, 256 - (var14 & 255));
															} else {
																var38.drawTransBgAt(var12 + var24 * var20, var13 + var25 * var21); // L: 10795
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10798
												}
											}
										}
									} else {
										int var26;
										if (var10.type == 6) { // L: 10812
											boolean var36 = ItemComposition.runCs1(var10); // L: 10813
											if (var36) { // L: 10815
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId; // L: 10816
											}

											Model var39 = null; // L: 10817
											var22 = 0; // L: 10818
											if (var10.itemId != -1) { // L: 10819
												ItemComposition var44 = class300.ItemComposition_get(var10.itemId); // L: 10820
												if (var44 != null) { // L: 10821
													var44 = var44.getCountObj(var10.itemQuantity); // L: 10822
													var39 = var44.getModel(1); // L: 10823
													if (var39 != null) { // L: 10824
														var39.calculateBoundsCylinder(); // L: 10825
														var22 = var39.height / 2; // L: 10826
													} else {
														Messages.invalidateWidget(var10); // L: 10828
													}
												}
											} else if (var10.modelType == 5) { // L: 10831
												if (var10.modelId == 0) { // L: 10832
													var39 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var39 = Projectile.localPlayer.getModel(); // L: 10833
												}
											} else if (var10.modelType == 7) { // L: 10835
												var39 = var10.field3631.getModel((SequenceDefinition)null, -1, WorldMapLabelSize.SequenceDefinition_get(Projectile.localPlayer.idleSequence), Projectile.localPlayer.movementFrame); // L: 10836
											} else {
												NPCComposition var45 = null; // L: 10839
												class193 var33 = null; // L: 10840
												if (var10.modelType == 6) { // L: 10841
													var25 = var10.modelId; // L: 10842
													if (var25 >= 0 && var25 < Client.npcs.length) { // L: 10843
														NPC var34 = Client.npcs[var25]; // L: 10844
														if (var34 != null) { // L: 10845
															var45 = var34.definition; // L: 10846
															var33 = var34.method2586(); // L: 10847
														}
													}
												}

												SequenceDefinition var35 = null; // L: 10851
												var26 = -1; // L: 10852
												if (var20 != -1) { // L: 10853
													var35 = WorldMapLabelSize.SequenceDefinition_get(var20); // L: 10854
													var26 = var10.modelFrame; // L: 10855
												}

												var39 = var10.method6379(var35, var26, var36, Projectile.localPlayer.appearance, var45, var33); // L: 10857
												if (var39 == null && Widget.field3600) { // L: 10858
													Messages.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method4387(var10.width / 2 + var12, var10.height / 2 + var13); // L: 10860
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10861
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10862
											if (var39 != null) { // L: 10863
												if (!var10.isIf3) { // L: 10864
													var39.method4798(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var39.calculateBoundsCylinder(); // L: 10866
													if (var10.modelOrthog) { // L: 10867
														var39.method4799(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var39.method4798(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY); // L: 10868
													}
												}
											}

											Rasterizer3D.method4386(); // L: 10871
										} else {
											Font var29;
											if (var10.type == 8 && var10 == class19.field99 && Client.field665 == Client.field664) { // L: 10874 10875
												var19 = 0; // L: 10876
												var20 = 0; // L: 10877
												var29 = class404.fontPlain12; // L: 10878
												String var30 = var10.text; // L: 10879

												String var31;
												for (var30 = BuddyRankComparator.method2892(var30, var10); var30.length() > 0; var20 = var20 + var29.ascent + 1) { // L: 10881 10882 10894
													var24 = var30.indexOf("<br>"); // L: 10883
													if (var24 != -1) { // L: 10884
														var31 = var30.substring(0, var24); // L: 10885
														var30 = var30.substring(var24 + 4); // L: 10886
													} else {
														var31 = var30; // L: 10889
														var30 = ""; // L: 10890
													}

													var25 = var29.stringWidth(var31); // L: 10892
													if (var25 > var19) { // L: 10893
														var19 = var25;
													}
												}

												var19 += 6; // L: 10896
												var20 += 7; // L: 10897
												var24 = var12 + var10.width - 5 - var19; // L: 10898
												var25 = var13 + var10.height + 5; // L: 10899
												if (var24 < var12 + 5) { // L: 10900
													var24 = var12 + 5;
												}

												if (var19 + var24 > var4) { // L: 10901
													var24 = var4 - var19;
												}

												if (var25 + var20 > var5) { // L: 10902
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120); // L: 10903
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0); // L: 10904
												var30 = var10.text; // L: 10905
												var26 = var25 + var29.ascent + 2; // L: 10906

												for (var30 = BuddyRankComparator.method2892(var30, var10); var30.length() > 0; var26 = var26 + var29.ascent + 1) { // L: 10907 10908 10919
													int var27 = var30.indexOf("<br>"); // L: 10909
													if (var27 != -1) { // L: 10910
														var31 = var30.substring(0, var27); // L: 10911
														var30 = var30.substring(var27 + 4); // L: 10912
													} else {
														var31 = var30; // L: 10915
														var30 = ""; // L: 10916
													}

													var29.draw(var31, var24 + 3, var26, 0, -1); // L: 10918
												}
											}

											if (var10.type == 9) { // L: 10923
												if (var10.field3658) { // L: 10928
													var19 = var12; // L: 10929
													var20 = var13 + var10.height; // L: 10930
													var21 = var12 + var10.width; // L: 10931
													var22 = var13; // L: 10932
												} else {
													var19 = var12; // L: 10935
													var20 = var13; // L: 10936
													var21 = var12 + var10.width; // L: 10937
													var22 = var13 + var10.height; // L: 10938
												}

												if (var10.lineWid == 1) { // L: 10940
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color); // L: 10941
												} else {
													class129.method3001(var19, var20, var21, var22, var10.color, var10.lineWid); // L: 10944
												}
											} else if (var10.type == 12) { // L: 10948
												class327 var37 = var10.method6380(); // L: 10949
												class322 var32 = var10.method6381(); // L: 10950
												if (var37 != null && var32 != null && var37.method6238()) { // L: 10951
													var29 = var10.getFont(); // L: 10952
													if (var29 != null) { // L: 10953
														Client.field715.method9539(var12, var13, var10.width, var10.height, var37.method6157(), var37.method6114(), var37.method6239(), var37.method6232(), var37.method6109()); // L: 10954
														var22 = var10.textShadowed ? var10.spriteShadow : -1; // L: 10955
														if (!var37.method6107() && var37.method6163().method7410()) { // L: 10956
															Client.field715.method9547(var32.field3520, var22, var32.field3522, var32.field3519); // L: 10957
															Client.field715.method9545(var37.method6105(), var29); // L: 10958
														} else {
															Client.field715.method9547(var10.color, var22, var32.field3522, var32.field3519); // L: 10961
															Client.field715.method9545(var37.method6163(), var29); // L: 10962
														}

														Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10964
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

	} // L: 10969
}
