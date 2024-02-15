import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
public class class129 {
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	static GameBuild field1536;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 335239889
	)
	public final int field1528;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	public class129 field1522;
	@ObfuscatedName("al")
	float[][] field1523;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Lsr;"
	)
	final class469[] field1524;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Lsr;"
	)
	class469[] field1525;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Lsr;"
	)
	class469[] field1526;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	class469 field1527;
	@ObfuscatedName("az")
	boolean field1533;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	class469 field1529;
	@ObfuscatedName("au")
	boolean field1530;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	class469 field1531;
	@ObfuscatedName("ah")
	float[][] field1535;
	@ObfuscatedName("aj")
	float[][] field1521;
	@ObfuscatedName("af")
	float[][] field1534;

	@ObfuscatedSignature(
		descriptor = "(ILuq;Z)V"
	)
	public class129(int var1, Buffer var2, boolean var3) {
		this.field1527 = new class469(); // L: 13
		this.field1533 = true; // L: 14
		this.field1529 = new class469(); // L: 15
		this.field1530 = true; // L: 16
		this.field1531 = new class469(); // L: 17
		this.field1528 = var2.readShort(); // L: 23
		this.field1524 = new class469[var1]; // L: 24
		this.field1525 = new class469[this.field1524.length]; // L: 25
		this.field1526 = new class469[this.field1524.length]; // L: 26
		this.field1523 = new float[this.field1524.length][3]; // L: 27

		for (int var4 = 0; var4 < this.field1524.length; ++var4) { // L: 28
			this.field1524[var4] = new class469(var2, var3); // L: 29
			this.field1523[var4][0] = var2.method9481(); // L: 30
			this.field1523[var4][1] = var2.method9481(); // L: 31
			this.field1523[var4][2] = var2.method9481(); // L: 32
		}

		this.method3023(); // L: 34
	} // L: 35

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-3568"
	)
	void method3023() {
		this.field1535 = new float[this.field1524.length][3]; // L: 38
		this.field1521 = new float[this.field1524.length][3]; // L: 39
		this.field1534 = new float[this.field1524.length][3]; // L: 40
		class469 var1 = UserComparator9.method2965(); // L: 41

		for (int var2 = 0; var2 < this.field1524.length; ++var2) { // L: 42
			class469 var3 = this.method3046(var2); // L: 43
			var1.method8629(var3); // L: 44
			var1.method8685(); // L: 45
			this.field1535[var2] = var1.method8634(); // L: 46
			this.field1521[var2][0] = var3.field4843[12]; // L: 47
			this.field1521[var2][1] = var3.field4843[13]; // L: 48
			this.field1521[var2][2] = var3.field4843[14]; // L: 49
			this.field1534[var2] = var3.method8623(); // L: 50
		}

		var1.method8648(); // L: 52
	} // L: 53

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lsr;",
		garbageValue = "2146006295"
	)
	class469 method3046(int var1) {
		return this.field1524[var1]; // L: 56
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lsr;",
		garbageValue = "1910783398"
	)
	class469 method3024(int var1) {
		if (this.field1525[var1] == null) { // L: 60
			this.field1525[var1] = new class469(this.method3046(var1)); // L: 61
			if (this.field1522 != null) { // L: 62
				this.field1525[var1].method8633(this.field1522.method3024(var1)); // L: 63
			} else {
				this.field1525[var1].method8633(class469.field4844); // L: 66
			}
		}

		return this.field1525[var1]; // L: 69
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Lsr;",
		garbageValue = "953941007"
	)
	class469 method3052(int var1) {
		if (this.field1526[var1] == null) {
			this.field1526[var1] = new class469(this.method3024(var1)); // L: 74
			this.field1526[var1].method8685(); // L: 75
		}

		return this.field1526[var1]; // L: 77
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lsr;I)V",
		garbageValue = "-618236681"
	)
	void method3027(class469 var1) {
		this.field1527.method8629(var1); // L: 81
		this.field1533 = true; // L: 82
		this.field1530 = true; // L: 83
	} // L: 84

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Lsr;",
		garbageValue = "-107"
	)
	class469 method3056() {
		return this.field1527; // L: 87
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lsr;",
		garbageValue = "-986807821"
	)
	class469 method3028() {
		if (this.field1533) { // L: 91
			this.field1529.method8629(this.method3056()); // L: 92
			if (this.field1522 != null) { // L: 93
				this.field1529.method8633(this.field1522.method3028()); // L: 94
			}

			this.field1533 = false; // L: 96
		}

		return this.field1529; // L: 98
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsr;",
		garbageValue = "-105"
	)
	public class469 method3060(int var1) {
		if (this.field1530) { // L: 102
			this.field1531.method8629(this.method3052(var1)); // L: 103
			this.field1531.method8633(this.method3028()); // L: 104
			this.field1530 = false; // L: 105
		}

		return this.field1531; // L: 107
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-20472245"
	)
	float[] method3061(int var1) {
		return this.field1535[var1]; // L: 111
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "2027097190"
	)
	float[] method3031(int var1) {
		return this.field1521[var1]; // L: 115
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "-29"
	)
	float[] method3063(int var1) {
		return this.field1534[var1]; // L: 119
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-1081828510"
	)
	public static int method3066(CharSequence var0) {
		return Script.method2242(var0, 10, true); // L: 73
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1910155406"
	)
	static final void method3067(int var0) {
		if (var0 >= 0) { // L: 9385
			int var1 = Client.menuArguments1[var0]; // L: 9386
			int var2 = Client.menuArguments2[var0]; // L: 9387
			int var3 = Client.menuOpcodes[var0]; // L: 9388
			int var4 = Client.menuIdentifiers[var0]; // L: 9389
			int var5 = Client.field680[var0]; // L: 9390
			String var6 = Client.menuActions[var0]; // L: 9391
			String var7 = Client.menuTargets[var0]; // L: 9392
			ReflectionCheck.method661(var1, var2, var3, var4, var5, var6, var7, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 9393
		}
	} // L: 9394

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "([Lng;IIIIIIIII)V",
		garbageValue = "-411156538"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10671
		Rasterizer3D.method5292(); // L: 10672

		for (int var9 = 0; var9 < var0.length; ++var9) { // L: 10673
			Widget var10 = var0[var9]; // L: 10674
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) { // L: 10675 10676
				int var11;
				if (var8 == -1) { // L: 10678
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6; // L: 10679
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y; // L: 10680
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width; // L: 10681
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height; // L: 10682
					var11 = ++Client.rootWidgetCount - 1; // L: 10683
				} else {
					var11 = var8; // L: 10685
				}

				var10.rootIndex = var11; // L: 10686
				var10.cycle = Client.cycle; // L: 10687
				if (!var10.isIf3 || !PcmPlayer.isComponentHidden(var10)) { // L: 10688
					if (var10.contentType > 0) { // L: 10689
						GrandExchangeOfferOwnWorldComparator.method1202(var10);
					}

					int var12 = var10.x + var6; // L: 10690
					int var13 = var7 + var10.y; // L: 10691
					int var14 = var10.transparencyTop; // L: 10692
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) { // L: 10693
						if (var1 != -1412584499 && !var10.isScrollBar) { // L: 10694
							ModelData0.field3105 = var0; // L: 10695
							class103.field1354 = var6; // L: 10696
							WallObject.field3111 = var7; // L: 10697
							continue; // L: 10698
						}

						if (Client.isDraggingWidget && Client.field746) { // L: 10700
							var15 = MouseHandler.MouseHandler_x; // L: 10701
							var16 = MouseHandler.MouseHandler_y; // L: 10702
							var15 -= Client.widgetClickX; // L: 10703
							var16 -= Client.widgetClickY; // L: 10704
							if (var15 < Client.field765) { // L: 10705
								var15 = Client.field765;
							}

							if (var15 + var10.width > Client.field765 + Client.clickedWidgetParent.width) { // L: 10706
								var15 = Client.field765 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field774) { // L: 10707
								var16 = Client.field774;
							}

							if (var16 + var10.height > Client.field774 + Client.clickedWidgetParent.height) { // L: 10708
								var16 = Client.field774 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15; // L: 10709
							var13 = var16; // L: 10710
						}

						if (!var10.isScrollBar) { // L: 10712
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 9) { // L: 10718
						var19 = var12; // L: 10719
						var20 = var13; // L: 10720
						var21 = var12 + var10.width; // L: 10721
						var22 = var13 + var10.height; // L: 10722
						if (var21 < var12) { // L: 10723
							var19 = var21; // L: 10725
							var21 = var12; // L: 10726
						}

						if (var22 < var13) { // L: 10728
							var20 = var22; // L: 10730
							var22 = var13; // L: 10731
						}

						++var21; // L: 10733
						++var22; // L: 10734
						var15 = var19 > var2 ? var19 : var2; // L: 10735
						var16 = var20 > var3 ? var20 : var3; // L: 10736
						var17 = var21 < var4 ? var21 : var4; // L: 10737
						var18 = var22 < var5 ? var22 : var5; // L: 10738
					} else {
						var19 = var12 + var10.width; // L: 10741
						var20 = var13 + var10.height; // L: 10742
						var15 = var12 > var2 ? var12 : var2; // L: 10743
						var16 = var13 > var3 ? var13 : var3; // L: 10744
						var17 = var19 < var4 ? var19 : var4; // L: 10745
						var18 = var20 < var5 ? var20 : var5; // L: 10746
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) { // L: 10748
						if (var10.contentType != 0) { // L: 10749
							if (var10.contentType == 1336) { // L: 10750
								if (class30.clientPreferences.method2637()) { // L: 10751
									var13 += 15; // L: 10752
									class141.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1); // L: 10753
									var13 += 15; // L: 10754
									Runtime var41 = Runtime.getRuntime(); // L: 10755
									var20 = (int)((var41.totalMemory() - var41.freeMemory()) / 1024L); // L: 10756
									var21 = 16776960; // L: 10757
									if (var20 > 327680 && !Client.isLowDetail) { // L: 10758
										var21 = 16711680;
									}

									class141.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1); // L: 10759
									var13 += 15; // L: 10760
								}
								continue;
							}

							if (var10.contentType == 1337) { // L: 10764
								Client.viewportX = var12; // L: 10765
								Client.viewportY = var13; // L: 10766
								class366.drawEntities(var12, var13, var10.width, var10.height); // L: 10767
								Client.field816[var10.rootIndex] = true; // L: 10768
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10769
								continue; // L: 10770
							}

							if (var10.contentType == 1338) { // L: 10772
								MouseRecorder.drawMinimap(var10, var12, var13, var11); // L: 10773
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10774
								continue; // L: 10775
							}

							if (var10.contentType == 1339) { // L: 10777
								GrandExchangeOfferNameComparator.method7261(var10, var12, var13, var11); // L: 10778
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10779
								continue; // L: 10780
							}

							if (var10.contentType == 1400) { // L: 10782
								Tiles.worldMap.method8900(var12, var13, var10.width, var10.height, Client.cycle, class30.clientPreferences.method2542()); // L: 10783
							}

							if (var10.contentType == 1401) { // L: 10785
								Tiles.worldMap.drawOverview(var12, var13, var10.width, var10.height); // L: 10786
							}

							if (var10.contentType == 1402) { // L: 10788
								class325.loginScreenRunesAnimation.draw(var12, Client.cycle); // L: 10789
							}
						}

						if (var10.type == 0) { // L: 10792
							if (!var10.isIf3 && PcmPlayer.isComponentHidden(var10) && var10 != class134.mousedOverWidgetIf1) { // L: 10793
								continue;
							}

							if (!var10.isIf3) { // L: 10794
								if (var10.scrollY > var10.scrollHeight - var10.height) { // L: 10795
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) { // L: 10796
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11); // L: 10798
							if (var10.children != null) { // L: 10799
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var10.id); // L: 10800
							if (var28 != null) { // L: 10801
								class228.method4456(var28.group, var15, var16, var17, var18, var12, var13, var11); // L: 10802
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10804
							Rasterizer3D.method5292(); // L: 10805
						} else if (var10.type == 11) { // L: 10807
							if (PcmPlayer.isComponentHidden(var10) && var10 != class134.mousedOverWidgetIf1) { // L: 10808
								continue;
							}

							if (var10.children != null) { // L: 10809
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10810
							Rasterizer3D.method5292(); // L: 10811
						}

						if (Client.isResizable || Client.field570[var11] || Client.field755 > 1) { // L: 10813
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) { // L: 10814 10815
								class170.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) { // L: 10817
								if (var10.type == 3) { // L: 10820
									if (class341.runCs1(var10)) { // L: 10822
										var19 = var10.color2; // L: 10823
										if (var10 == class134.mousedOverWidgetIf1 && var10.field3743 != 0) { // L: 10824
											var19 = var10.field3743;
										}
									} else {
										var19 = var10.color; // L: 10827
										if (var10 == class134.mousedOverWidgetIf1 && var10.field3752 != 0) { // L: 10828
											var19 = var10.field3752;
										}
									}

									if (var10.fill) { // L: 10830
										switch(var10.fillMode.field5286) { // L: 10831
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2); // L: 10837
											break; // L: 10838
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255)); // L: 10840
											break; // L: 10841
										default:
											if (var14 == 0) { // L: 10833
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10834
											}
										}
									} else if (var14 == 0) { // L: 10845
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10846
									}
								} else if (var10.type == 4) { // L: 10850
									Font var40 = var10.method6799(ArchiveLoader.field1070); // L: 10851
									if (var40 == null) { // L: 10852
										if (Widget.field3722) { // L: 10853
											UserComparator5.invalidateWidget(var10);
										}
									} else {
										String var42 = var10.text; // L: 10857
										if (class341.runCs1(var10)) { // L: 10858
											var20 = var10.color2; // L: 10859
											if (var10 == class134.mousedOverWidgetIf1 && var10.field3743 != 0) { // L: 10860
												var20 = var10.field3743;
											}

											if (var10.field3789.length() > 0) { // L: 10861
												var42 = var10.field3789;
											}
										} else {
											var20 = var10.color; // L: 10864
											if (var10 == class134.mousedOverWidgetIf1 && var10.field3752 != 0) { // L: 10865
												var20 = var10.field3752;
											}
										}

										if (var10.isIf3 && var10.itemId != -1) { // L: 10867
											ItemComposition var43 = ArchiveDiskActionHandler.ItemComposition_get(var10.itemId); // L: 10868
											var42 = var43.name; // L: 10869
											if (var42 == null) { // L: 10870
												var42 = "null";
											}

											if ((var43.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) { // L: 10871
												var42 = class370.colorStartTag(16748608) + var42 + "</col>" + " " + 'x' + UserComparator6.formatItemStacks(var10.itemQuantity);
											}
										}

										if (var10 == Client.meslayerContinueWidget) { // L: 10873
											var42 = "Please wait..."; // L: 10874
											var20 = var10.color; // L: 10875
										}

										if (!var10.isIf3) { // L: 10877
											var42 = class13.method155(var42, var10);
										}

										var40.method7867(var42, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, class485.method8809(var10.transparencyTop), var10.textXAlignment, var10.textYAlignment, var10.textLineHeight); // L: 10878
									}
								} else {
									int var23;
									int var24;
									int var25;
									if (var10.type == 5) { // L: 10881
										SpritePixels var38;
										if (!var10.isIf3) { // L: 10882
											var38 = var10.method6916(ArchiveLoader.field1070, class341.runCs1(var10), InvDefinition.urlRequester); // L: 10883
											if (var38 != null) { // L: 10884
												var38.drawTransBgAt(var12, var13);
											} else if (Widget.field3722) { // L: 10885
												UserComparator5.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) { // L: 10889
												var38 = class102.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var38 = var10.method6916(ArchiveLoader.field1070, false, InvDefinition.urlRequester); // L: 10890
											}

											if (var38 == null) { // L: 10891
												if (Widget.field3722) { // L: 10915
													UserComparator5.invalidateWidget(var10);
												}
											} else {
												var20 = var38.width; // L: 10892
												var21 = var38.height; // L: 10893
												if (!var10.spriteTiling) { // L: 10894
													var22 = var10.width * 4096 / var20; // L: 10908
													if (var10.spriteAngle != 0) { // L: 10909
														var38.method9929(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) { // L: 10910
														var38.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) { // L: 10911
														var38.drawTransBgAt(var12, var13); // L: 10912
													} else {
														var38.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height); // L: 10895
													var22 = (var20 - 1 + var10.width) / var20; // L: 10896
													var23 = (var21 - 1 + var10.height) / var21; // L: 10897

													for (var24 = 0; var24 < var22; ++var24) { // L: 10898
														for (var25 = 0; var25 < var23; ++var25) { // L: 10899
															if (var10.spriteAngle != 0) { // L: 10900
																var38.method9929(var20 / 2 + var12 + var24 * var20, var21 / 2 + var13 + var21 * var25, var10.spriteAngle, 4096);
															} else if (var14 != 0) { // L: 10901
																var38.drawTransAt(var12 + var24 * var20, var13 + var21 * var25, 256 - (var14 & 255));
															} else {
																var38.drawTransBgAt(var12 + var24 * var20, var13 + var25 * var21); // L: 10902
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10905
												}
											}
										}
									} else {
										int var26;
										if (var10.type == 6) { // L: 10919
											boolean var36 = class341.runCs1(var10); // L: 10920
											if (var36) { // L: 10922
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId; // L: 10923
											}

											Model var39 = null; // L: 10924
											var22 = 0; // L: 10925
											if (var10.itemId != -1) { // L: 10926
												ItemComposition var44 = ArchiveDiskActionHandler.ItemComposition_get(var10.itemId); // L: 10927
												if (var44 != null) { // L: 10928
													var44 = var44.getCountObj(var10.itemQuantity); // L: 10929
													var39 = var44.getModel(1); // L: 10930
													if (var39 != null) { // L: 10931
														var39.calculateBoundsCylinder(); // L: 10932
														var22 = var39.height / 2; // L: 10933
													} else {
														UserComparator5.invalidateWidget(var10); // L: 10935
													}
												}
											} else if (var10.modelType == 5) { // L: 10938
												if (var10.modelId == 0) { // L: 10939
													var39 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var39 = VarpDefinition.localPlayer.getModel(); // L: 10940
												}
											} else if (var10.modelType == 7) { // L: 10942
												var39 = var10.field3774.getModel((SequenceDefinition)null, -1, MilliClock.SequenceDefinition_get(VarpDefinition.localPlayer.idleSequence), VarpDefinition.localPlayer.movementFrame); // L: 10943
											} else {
												NPCComposition var45 = null; // L: 10946
												class188 var33 = null; // L: 10947
												if (var10.modelType == 6) { // L: 10948
													var25 = var10.modelId; // L: 10949
													if (var25 >= 0 && var25 < Client.npcs.length) { // L: 10950
														NPC var34 = Client.npcs[var25]; // L: 10951
														if (var34 != null) { // L: 10952
															var45 = var34.definition; // L: 10953
															var33 = var34.method2669(); // L: 10954
														}
													}
												}

												SequenceDefinition var35 = null; // L: 10958
												var26 = -1; // L: 10959
												if (var20 != -1) { // L: 10960
													var35 = MilliClock.SequenceDefinition_get(var20); // L: 10961
													var26 = var10.modelFrame; // L: 10962
												}

												var39 = var10.method6800(ArchiveLoader.field1070, var35, var26, var36, VarpDefinition.localPlayer.appearance, var45, var33); // L: 10964
												if (var39 == null && Widget.field3722) { // L: 10965
													UserComparator5.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method5277(var10.width / 2 + var12, var10.height / 2 + var13); // L: 10967
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10968
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10969
											if (var39 != null) { // L: 10970
												if (!var10.isIf3) { // L: 10971
													var39.method5782(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var39.calculateBoundsCylinder(); // L: 10973
													if (var10.modelOrthog) { // L: 10974
														var39.method5708(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var39.method5782(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY); // L: 10975
													}
												}
											}

											Rasterizer3D.method5294(); // L: 10978
										} else {
											Font var29;
											if (var10.type == 8 && var10 == FontName.field5062 && Client.field690 == Client.field689) { // L: 10981 10982
												var19 = 0; // L: 10983
												var20 = 0; // L: 10984
												var29 = class141.fontPlain12; // L: 10985
												String var30 = var10.text; // L: 10986

												String var31;
												for (var30 = class13.method155(var30, var10); var30.length() > 0; var20 = var20 + var29.ascent + 1) { // L: 10988 10989 11001
													var24 = var30.indexOf("<br>"); // L: 10990
													if (var24 != -1) { // L: 10991
														var31 = var30.substring(0, var24); // L: 10992
														var30 = var30.substring(var24 + 4); // L: 10993
													} else {
														var31 = var30; // L: 10996
														var30 = ""; // L: 10997
													}

													var25 = var29.stringWidth(var31); // L: 10999
													if (var25 > var19) { // L: 11000
														var19 = var25;
													}
												}

												var19 += 6; // L: 11003
												var20 += 7; // L: 11004
												var24 = var12 + var10.width - 5 - var19; // L: 11005
												var25 = var13 + var10.height + 5; // L: 11006
												if (var24 < var12 + 5) { // L: 11007
													var24 = var12 + 5;
												}

												if (var19 + var24 > var4) { // L: 11008
													var24 = var4 - var19;
												}

												if (var20 + var25 > var5) { // L: 11009
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120); // L: 11010
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0); // L: 11011
												var30 = var10.text; // L: 11012
												var26 = var25 + var29.ascent + 2; // L: 11013

												for (var30 = class13.method155(var30, var10); var30.length() > 0; var26 = var26 + var29.ascent + 1) { // L: 11014 11015 11026
													int var27 = var30.indexOf("<br>"); // L: 11016
													if (var27 != -1) { // L: 11017
														var31 = var30.substring(0, var27); // L: 11018
														var30 = var30.substring(var27 + 4); // L: 11019
													} else {
														var31 = var30; // L: 11022
														var30 = ""; // L: 11023
													}

													var29.draw(var31, var24 + 3, var26, 0, -1); // L: 11025
												}
											}

											if (var10.type == 9) { // L: 11030
												if (var10.field3759) { // L: 11035
													var19 = var12; // L: 11036
													var20 = var13 + var10.height; // L: 11037
													var21 = var12 + var10.width; // L: 11038
													var22 = var13; // L: 11039
												} else {
													var19 = var12; // L: 11042
													var20 = var13; // L: 11043
													var21 = var12 + var10.width; // L: 11044
													var22 = var13 + var10.height; // L: 11045
												}

												if (var10.lineWid == 1) { // L: 11047
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color); // L: 11048
												} else {
													MusicPatchNode.method6381(var19, var20, var21, var22, var10.color, var10.lineWid); // L: 11051
												}
											} else if (var10.type == 12) { // L: 11055
												class347 var37 = var10.method6806(); // L: 11056
												class341 var32 = var10.method6823(); // L: 11057
												if (var37 != null && var32 != null && var37.method6562()) { // L: 11058
													var29 = var10.method6799(ArchiveLoader.field1070); // L: 11059
													if (var29 != null) { // L: 11060
														Client.field740.method10058(var12, var13, var10.width, var10.height, var37.method6507(), var37.method6564(), var37.method6560(), var37.method6561(), var37.method6559()); // L: 11061
														var22 = var10.textShadowed ? var10.spriteShadow : -1; // L: 11062
														if (!var37.method6557() && var37.method6515().method7778()) { // L: 11063
															Client.field740.method10059(var32.field3640, var22, var32.field3643, var32.field3639); // L: 11064
															Client.field740.method10060(var37.method6711(), var29); // L: 11065
														} else {
															Client.field740.method10059(var10.color, var22, var32.field3643, var32.field3639); // L: 11068
															Client.field740.method10060(var37.method6515(), var29); // L: 11069
														}

														Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 11071
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

	} // L: 11076
}
