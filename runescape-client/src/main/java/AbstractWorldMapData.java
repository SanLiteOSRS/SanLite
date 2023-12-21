import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("uk")
	@ObfuscatedGetter(
		intValue = -820338560
	)
	static int field2575;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 591798592
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1345736704
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1733375591
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1535123345
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1960357167
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -459409055
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1748298895
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 611955849
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("ax")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("as")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("ay")
	byte[][][] field2560;
	@ObfuscatedName("ak")
	byte[][][] field2571;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[[[[Ljs;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("am")
	boolean field2573;
	@ObfuscatedName("aq")
	boolean field2565;

	AbstractWorldMapData() {
		this.groupId = -1; // L: 14
		this.fileId = -1; // L: 15
		new LinkedList();
		this.field2573 = false; // L: 26
		this.field2565 = false; // L: 27
	} // L: 29

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Luj;B)V",
		garbageValue = "7"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "153115175"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2573 && this.field2565; // L: 32
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lol;I)V",
		garbageValue = "816077843"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) { // L: 36
			byte[] var2 = var1.takeFile(this.groupId, this.fileId); // L: 37
			if (var2 != null) { // L: 38
				this.readGeography(new Buffer(var2)); // L: 39
				this.field2573 = true; // L: 40
				this.field2565 = true; // L: 41
			}

		}
	} // L: 43

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1929265244"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null; // L: 46
		this.floorOverlayIds = null; // L: 47
		this.field2560 = null; // L: 48
		this.field2571 = null; // L: 49
		this.decorations = null; // L: 50
		this.field2573 = false; // L: 51
		this.field2565 = false; // L: 52
	} // L: 53

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IILuj;I)V",
		garbageValue = "-2036497889"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte(); // L: 56
		if (var4 != 0) { // L: 57
			if ((var4 & 1) != 0) { // L: 60
				this.method4897(var1, var2, var3, var4); // L: 61
			} else {
				this.method4898(var1, var2, var3, var4); // L: 64
			}

		}
	} // L: 58 66

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IILuj;II)V",
		garbageValue = "-388208328"
	)
	void method4897(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0; // L: 69
		if (var5) { // L: 70
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedShort(); // L: 71
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort(); // L: 73
	} // L: 74

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IILuj;II)V",
		garbageValue = "1227555705"
	)
	void method4898(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1; // L: 77
		boolean var6 = (var4 & 2) != 0; // L: 78
		boolean var7 = (var4 & 4) != 0; // L: 79
		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort(); // L: 80
		int var8;
		int var9;
		int var11;
		if (var6) { // L: 81
			var8 = var3.readUnsignedByte(); // L: 82

			for (var9 = 0; var9 < var8; ++var9) { // L: 83
				int var14 = var3.readUnsignedShort(); // L: 84
				if (var14 != 0) { // L: 85
					this.floorOverlayIds[var9][var1][var2] = (short)var14; // L: 86
					var11 = var3.readUnsignedByte(); // L: 87
					this.field2560[var9][var1][var2] = (byte)(var11 >> 2); // L: 88
					this.field2571[var9][var1][var2] = (byte)(var11 & 3); // L: 89
				}
			}
		}

		if (var7) { // L: 93
			for (var8 = 0; var8 < var5; ++var8) { // L: 94
				var9 = var3.readUnsignedByte(); // L: 95
				if (var9 != 0) { // L: 96
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9]; // L: 99

					for (var11 = 0; var11 < var9; ++var11) { // L: 100
						int var12 = var3.method9280(); // L: 101
						int var13 = var3.readUnsignedByte(); // L: 102
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3); // L: 103
					}
				}
			}
		}

	} // L: 107

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "908938497"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX; // L: 112
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY; // L: 116
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lnn;II)V",
		garbageValue = "1102490716"
	)
	public static void method4899(Widget var0, int var1) {
		ItemComposition var2 = class214.ItemComposition_get(var1); // L: 1029
		var0.field3717.equipment[var2.maleModel] = var1 + 512; // L: 1030
		if (var2.maleModel1 != -1) { // L: 1031
			var0.field3717.equipment[var2.maleModel1] = 0; // L: 1032
		}

		if (var2.maleModel2 != -1) { // L: 1034
			var0.field3717.equipment[var2.maleModel2] = 0; // L: 1035
		}

		var0.field3717.method6323(); // L: 1037
	} // L: 1038

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "([Lnn;IIIIIIIB)V",
		garbageValue = "-49"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) { // L: 11531
			Widget var9 = var0[var8]; // L: 11532
			if (var9 != null && var9.parentId == var1 && (var9.method6708() || class361.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) { // L: 11533 11534 11535
				if (var9.isIf3) { // L: 11536
					if (class11.isComponentHidden(var9)) { // L: 11537
						continue;
					}
				} else if (var9.type == 0 && var9 != Interpreter.mousedOverWidgetIf1 && class11.isComponentHidden(var9)) { // L: 11540
					continue;
				}

				if (var9.type == 11) { // L: 11542
					if (var9.method6675(HealthBarDefinition.field1877, class60.urlRequester)) { // L: 11543
						if (var9.method6682()) { // L: 11544
							class159.invalidateWidget(var9); // L: 11545
							class132.revalidateWidgetScroll(var9.children, var9, true); // L: 11546
						}

						if (var9.field3783 != null) { // L: 11548
							ScriptEvent var10 = new ScriptEvent(); // L: 11549
							var10.widget = var9; // L: 11550
							var10.args = var9.field3783; // L: 11551
							Client.scriptEvents.addFirst(var10); // L: 11552
						}
					}
				} else if (var9.type == 12 && var9.method6693(HealthBarDefinition.field1877)) { // L: 11556 11557
					class159.invalidateWidget(var9); // L: 11558
				}

				int var26 = var9.x + var6; // L: 11561
				int var11 = var7 + var9.y; // L: 11562
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				if (var9.type == 9) { // L: 11567
					var16 = var26; // L: 11568
					var17 = var11; // L: 11569
					var18 = var26 + var9.width; // L: 11570
					int var19 = var11 + var9.height; // L: 11571
					if (var18 < var26) { // L: 11572
						var16 = var18; // L: 11574
						var18 = var26; // L: 11575
					}

					if (var19 < var11) { // L: 11577
						var17 = var19; // L: 11579
						var19 = var11; // L: 11580
					}

					++var18; // L: 11582
					++var19; // L: 11583
					var12 = var16 > var2 ? var16 : var2; // L: 11584
					var13 = var17 > var3 ? var17 : var3; // L: 11585
					var14 = var18 < var4 ? var18 : var4; // L: 11586
					var15 = var19 < var5 ? var19 : var5; // L: 11587
				} else {
					var16 = var26 + var9.width; // L: 11590
					var17 = var11 + var9.height; // L: 11591
					var12 = var26 > var2 ? var26 : var2; // L: 11592
					var13 = var11 > var3 ? var11 : var3; // L: 11593
					var14 = var16 < var4 ? var16 : var4; // L: 11594
					var15 = var17 < var5 ? var17 : var5; // L: 11595
				}

				if (var9 == Client.clickedWidget) { // L: 11597
					Client.field516 = true; // L: 11598
					Client.field533 = var26; // L: 11599
					Client.field679 = var11; // L: 11600
				}

				boolean var34 = false; // L: 11602
				if (var9.field3734) { // L: 11603
					switch(Client.field659) { // L: 11604
					case 0:
						var34 = true; // L: 11611
					case 1:
					default:
						break;
					case 2:
						if (Client.field660 == var9.id >>> 16) { // L: 11614
							var34 = true; // L: 11615
						}
						break;
					case 3:
						if (var9.id == Client.field660) { // L: 11606
							var34 = true; // L: 11607
						}
					}
				}

				if (var34 || !var9.isIf3 || var12 < var14 && var13 < var15) { // L: 11620
					if (var9.isIf3) { // L: 11621
						ScriptEvent var27;
						if (var9.noClickThrough) { // L: 11622
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11623
								for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11624
									if (var27.field1054) { // L: 11625
										var27.remove(); // L: 11626
										var27.widget.field3797 = false; // L: 11627
									}
								}

								Tile.method5187(); // L: 11630
								if (class148.widgetDragDuration == 0) { // L: 11631
									Client.clickedWidget = null; // L: 11632
									Client.clickedWidgetParent = null; // L: 11633
								}

								if (!Client.isMenuOpen) { // L: 11635
									UserComparator10.addCancelMenuEntry(); // L: 11636
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11640 11641
							for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11642
								if (var27.field1054 && var27.widget.onScroll == var27.args) { // L: 11643
									var27.remove(); // L: 11644
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x; // L: 11650
					var18 = MouseHandler.MouseHandler_y; // L: 11651
					if (MouseHandler.MouseHandler_lastButton != 0) { // L: 11652
						var17 = MouseHandler.MouseHandler_lastPressedX; // L: 11653
						var18 = MouseHandler.MouseHandler_lastPressedY; // L: 11654
					}

					boolean var35 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15; // L: 11656
					if (var9.contentType == 1337) { // L: 11657
						if (!Client.field498 && !Client.isMenuOpen && var35) { // L: 11658
							PacketBufferNode.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) { // L: 11661
						class18.checkIfMinimapClicked(var9, var26, var11); // L: 11662
					} else {
						if (var9.contentType == 1400) { // L: 11665
							class187.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height); // L: 11666
						}

						if (!Client.isMenuOpen && var35) { // L: 11668
							if (var9.contentType == 1400) { // L: 11669
								class187.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18); // L: 11670
							} else {
								class93.method2452(var9); // L: 11673
							}
						}

						boolean var21;
						int var23;
						if (var34) { // L: 11676
							for (int var20 = 0; var20 < var9.field3735.length; ++var20) { // L: 11677
								var21 = false; // L: 11678
								boolean var28 = false; // L: 11679
								if (!var21 && var9.field3735[var20] != null) { // L: 11680
									for (var23 = 0; var23 < var9.field3735[var20].length; ++var23) { // L: 11681
										boolean var24 = false; // L: 11682
										if (var9.field3805 != null) { // L: 11683
											var24 = Client.field724.method4316(var9.field3735[var20][var23]); // L: 11684
										}

										if (class163.method3462(var9.field3735[var20][var23]) || var24) { // L: 11686
											var21 = true; // L: 11687
											if (var9.field3805 != null && var9.field3805[var20] > Client.cycle) { // L: 11688
												break;
											}

											byte var33 = var9.field3704[var20][var23]; // L: 11689
											if (var33 == 0 || ((var33 & 8) == 0 || !Client.field724.method4316(86) && !Client.field724.method4316(82) && !Client.field724.method4316(81)) && ((var33 & 2) == 0 || Client.field724.method4316(86)) && ((var33 & 1) == 0 || Client.field724.method4316(82)) && ((var33 & 4) == 0 || Client.field724.method4316(81))) { // L: 11690 11691 11692 11693 11694
												var28 = true; // L: 11696
												break;
											}
										}
									}
								}

								if (var28) { // L: 11702
									if (var20 < 10) { // L: 11703
										FloorOverlayDefinition.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) { // L: 11704
										class53.method1111(); // L: 11705
										class416.method7830(var9.id, var9.childIndex, WorldMapData_0.Widget_unpackTargetMask(class361.getWidgetFlags(var9)), var9.itemId); // L: 11706
										Client.field655 = class89.Widget_getSpellActionName(var9); // L: 11707
										if (Client.field655 == null) { // L: 11708
											Client.field655 = "null";
										}

										Client.field656 = var9.dataText + class167.colorStartTag(16777215); // L: 11709
									}

									var23 = var9.field3672[var20]; // L: 11711
									if (var9.field3805 == null) { // L: 11712
										var9.field3805 = new int[var9.field3735.length];
									}

									if (var9.field3756 == null) { // L: 11713
										var9.field3756 = new int[var9.field3735.length];
									}

									if (var23 != 0) { // L: 11714
										if (var9.field3805[var20] == 0) { // L: 11715
											var9.field3805[var20] = var23 + Client.cycle + var9.field3756[var20];
										} else {
											var9.field3805[var20] = var23 + Client.cycle; // L: 11716
										}
									} else {
										var9.field3805[var20] = Integer.MAX_VALUE; // L: 11718
									}
								}

								if (!var21 && var9.field3805 != null) { // L: 11720 11721
									var9.field3805[var20] = 0;
								}
							}
						}

						if (var9.isIf3) { // L: 11725
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11726
								var35 = true;
							} else {
								var35 = false; // L: 11727
							}

							boolean var36 = false; // L: 11728
							if ((MouseHandler.MouseHandler_currentButton == 1 || !class19.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) { // L: 11729
								var36 = true;
							}

							var21 = false; // L: 11730
							if ((MouseHandler.MouseHandler_lastButton == 1 || !class19.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) { // L: 11731
								var21 = true;
							}

							if (var21) { // L: 11732
								HorizontalAlignment.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11); // L: 11733
							}

							if (var9.method6771()) { // L: 11735
								if (var21) { // L: 11736
									Client.field682.addFirst(new class222(0, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9)); // L: 11737
								}

								if (var36) { // L: 11739
									Client.field682.addFirst(new class222(1, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9)); // L: 11740
								}
							}

							if (var9.contentType == 1400) { // L: 11743
								class187.worldMap.method8715(var17, var18, var35 & var36, var35 & var21); // L: 11744
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && class12.method169(class361.getWidgetFlags(var9))) { // L: 11746
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) { // L: 11747
								Client.field674 = true; // L: 11748
								Client.field554 = var26; // L: 11749
								Client.field676 = var11; // L: 11750
							}

							if (var9.hasListener) { // L: 11752
								ScriptEvent var22;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) { // L: 11753
									var22 = new ScriptEvent(); // L: 11754
									var22.field1054 = true; // L: 11755
									var22.widget = var9; // L: 11756
									var22.mouseY = Client.mouseWheelRotation; // L: 11757
									var22.args = var9.onScroll; // L: 11758
									Client.scriptEvents.addFirst(var22); // L: 11759
								}

								if (Client.clickedWidget != null || Client.isMenuOpen) { // L: 11761
									var21 = false; // L: 11762
									var36 = false; // L: 11763
									var35 = false; // L: 11764
								}

								if (!var9.field3798 && var21) { // L: 11766
									var9.field3798 = true; // L: 11767
									if (var9.onClick != null) { // L: 11768
										var22 = new ScriptEvent(); // L: 11769
										var22.field1054 = true; // L: 11770
										var22.widget = var9; // L: 11771
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var26; // L: 11772
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11; // L: 11773
										var22.args = var9.onClick; // L: 11774
										Client.scriptEvents.addFirst(var22); // L: 11775
									}
								}

								if (var9.field3798 && var36 && var9.onClickRepeat != null) { // L: 11778 11779
									var22 = new ScriptEvent(); // L: 11780
									var22.field1054 = true; // L: 11781
									var22.widget = var9; // L: 11782
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11783
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11784
									var22.args = var9.onClickRepeat; // L: 11785
									Client.scriptEvents.addFirst(var22); // L: 11786
								}

								if (var9.field3798 && !var36) { // L: 11789
									var9.field3798 = false; // L: 11790
									if (var9.onRelease != null) { // L: 11791
										var22 = new ScriptEvent(); // L: 11792
										var22.field1054 = true; // L: 11793
										var22.widget = var9; // L: 11794
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11795
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11796
										var22.args = var9.onRelease; // L: 11797
										Client.field703.addFirst(var22); // L: 11798
									}
								}

								if (var36 && var9.onHold != null) { // L: 11801 11802
									var22 = new ScriptEvent(); // L: 11803
									var22.field1054 = true; // L: 11804
									var22.widget = var9; // L: 11805
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11806
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11807
									var22.args = var9.onHold; // L: 11808
									Client.scriptEvents.addFirst(var22); // L: 11809
								}

								if (!var9.field3797 && var35) { // L: 11812
									var9.field3797 = true; // L: 11813
									if (var9.onMouseOver != null) { // L: 11814
										var22 = new ScriptEvent(); // L: 11815
										var22.field1054 = true; // L: 11816
										var22.widget = var9; // L: 11817
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11818
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11819
										var22.args = var9.onMouseOver; // L: 11820
										Client.scriptEvents.addFirst(var22); // L: 11821
									}
								}

								if (var9.field3797 && var35 && var9.onMouseRepeat != null) { // L: 11824 11825
									var22 = new ScriptEvent(); // L: 11826
									var22.field1054 = true; // L: 11827
									var22.widget = var9; // L: 11828
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11829
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11830
									var22.args = var9.onMouseRepeat; // L: 11831
									Client.scriptEvents.addFirst(var22); // L: 11832
								}

								if (var9.field3797 && !var35) { // L: 11835
									var9.field3797 = false; // L: 11836
									if (var9.onMouseLeave != null) { // L: 11837
										var22 = new ScriptEvent(); // L: 11838
										var22.field1054 = true; // L: 11839
										var22.widget = var9; // L: 11840
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11841
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11842
										var22.args = var9.onMouseLeave; // L: 11843
										Client.field703.addFirst(var22); // L: 11844
									}
								}

								if (var9.onTimer != null) { // L: 11847
									var22 = new ScriptEvent(); // L: 11848
									var22.widget = var9; // L: 11849
									var22.args = var9.onTimer; // L: 11850
									Client.field793.addFirst(var22); // L: 11851
								}

								ScriptEvent var25;
								int var37;
								int var39;
								if (var9.onVarTransmit != null && Client.field683 > var9.field3800) { // L: 11853
									if (var9.varTransmitTriggers != null && Client.field683 - var9.field3800 <= 32) { // L: 11854
										label829:
										for (var39 = var9.field3800; var39 < Client.field683; ++var39) { // L: 11861
											var23 = Client.field712[var39 & 31]; // L: 11862

											for (var37 = 0; var37 < var9.varTransmitTriggers.length; ++var37) { // L: 11863
												if (var23 == var9.varTransmitTriggers[var37]) { // L: 11864
													var25 = new ScriptEvent(); // L: 11865
													var25.widget = var9; // L: 11866
													var25.args = var9.onVarTransmit; // L: 11867
													Client.scriptEvents.addFirst(var25); // L: 11868
													break label829; // L: 11869
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11855
										var22.widget = var9; // L: 11856
										var22.args = var9.onVarTransmit; // L: 11857
										Client.scriptEvents.addFirst(var22); // L: 11858
									}

									var9.field3800 = Client.field683; // L: 11874
								}

								if (var9.onInvTransmit != null && Client.field685 > var9.field3801) { // L: 11876
									if (var9.invTransmitTriggers != null && Client.field685 - var9.field3801 <= 32) { // L: 11877
										label805:
										for (var39 = var9.field3801; var39 < Client.field685; ++var39) { // L: 11884
											var23 = Client.field541[var39 & 31]; // L: 11885

											for (var37 = 0; var37 < var9.invTransmitTriggers.length; ++var37) { // L: 11886
												if (var23 == var9.invTransmitTriggers[var37]) { // L: 11887
													var25 = new ScriptEvent(); // L: 11888
													var25.widget = var9; // L: 11889
													var25.args = var9.onInvTransmit; // L: 11890
													Client.scriptEvents.addFirst(var25); // L: 11891
													break label805; // L: 11892
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11878
										var22.widget = var9; // L: 11879
										var22.args = var9.onInvTransmit; // L: 11880
										Client.scriptEvents.addFirst(var22); // L: 11881
									}

									var9.field3801 = Client.field685; // L: 11897
								}

								if (var9.onStatTransmit != null && Client.field687 > var9.field3763) { // L: 11899
									if (var9.statTransmitTriggers != null && Client.field687 - var9.field3763 <= 32) { // L: 11900
										label781:
										for (var39 = var9.field3763; var39 < Client.field687; ++var39) { // L: 11907
											var23 = Client.field686[var39 & 31]; // L: 11908

											for (var37 = 0; var37 < var9.statTransmitTriggers.length; ++var37) { // L: 11909
												if (var23 == var9.statTransmitTriggers[var37]) { // L: 11910
													var25 = new ScriptEvent(); // L: 11911
													var25.widget = var9; // L: 11912
													var25.args = var9.onStatTransmit; // L: 11913
													Client.scriptEvents.addFirst(var25); // L: 11914
													break label781; // L: 11915
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11901
										var22.widget = var9; // L: 11902
										var22.args = var9.onStatTransmit; // L: 11903
										Client.scriptEvents.addFirst(var22); // L: 11904
									}

									var9.field3763 = Client.field687; // L: 11920
								}

								if (Client.chatCycle > var9.field3799 && var9.onChatTransmit != null) { // L: 11922
									var22 = new ScriptEvent(); // L: 11923
									var22.widget = var9; // L: 11924
									var22.args = var9.onChatTransmit; // L: 11925
									Client.scriptEvents.addFirst(var22); // L: 11926
								}

								if (Client.field747 > var9.field3799 && var9.onFriendTransmit != null) { // L: 11928
									var22 = new ScriptEvent(); // L: 11929
									var22.widget = var9; // L: 11930
									var22.args = var9.onFriendTransmit; // L: 11931
									Client.scriptEvents.addFirst(var22); // L: 11932
								}

								if (Client.field692 > var9.field3799 && var9.onClanTransmit != null) { // L: 11934
									var22 = new ScriptEvent(); // L: 11935
									var22.widget = var9; // L: 11936
									var22.args = var9.onClanTransmit; // L: 11937
									Client.scriptEvents.addFirst(var22); // L: 11938
								}

								if (Client.field693 > var9.field3799 && var9.field3676 != null) { // L: 11940
									var22 = new ScriptEvent(); // L: 11941
									var22.widget = var9; // L: 11942
									var22.args = var9.field3676; // L: 11943
									Client.scriptEvents.addFirst(var22); // L: 11944
								}

								if (Client.field588 > var9.field3799 && var9.field3776 != null) { // L: 11946
									var22 = new ScriptEvent(); // L: 11947
									var22.widget = var9; // L: 11948
									var22.args = var9.field3776; // L: 11949
									Client.scriptEvents.addFirst(var22); // L: 11950
								}

								if (Client.field551 > var9.field3799 && var9.onStockTransmit != null) { // L: 11952
									var22 = new ScriptEvent(); // L: 11953
									var22.widget = var9; // L: 11954
									var22.args = var9.onStockTransmit; // L: 11955
									Client.scriptEvents.addFirst(var22); // L: 11956
								}

								if (Client.field782 > var9.field3799 && var9.field3782 != null) { // L: 11958
									var22 = new ScriptEvent(); // L: 11959
									var22.widget = var9; // L: 11960
									var22.args = var9.field3782; // L: 11961
									Client.scriptEvents.addFirst(var22); // L: 11962
								}

								if (Client.field697 > var9.field3799 && var9.onMiscTransmit != null) { // L: 11964
									var22 = new ScriptEvent(); // L: 11965
									var22.widget = var9; // L: 11966
									var22.args = var9.onMiscTransmit; // L: 11967
									Client.scriptEvents.addFirst(var22); // L: 11968
								}

								var9.field3799 = Client.cycleCntr; // L: 11970
								if (var9.onKey != null) { // L: 11971
									for (var39 = 0; var39 < Client.field726; ++var39) { // L: 11972
										ScriptEvent var32 = new ScriptEvent(); // L: 11973
										var32.widget = var9; // L: 11974
										var32.keyTyped = Client.field518[var39]; // L: 11975
										var32.keyPressed = Client.field586[var39]; // L: 11976
										var32.args = var9.onKey; // L: 11977
										Client.scriptEvents.addFirst(var32); // L: 11978
									}
								}

								ScriptEvent var31;
								int[] var38;
								if (var9.field3771 != null) { // L: 11981
									var38 = Client.field724.method4318(); // L: 11982

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 11983
										var31 = new ScriptEvent(); // L: 11984
										var31.widget = var9; // L: 11985
										var31.keyTyped = var38[var23]; // L: 11986
										var31.args = var9.field3771; // L: 11987
										Client.scriptEvents.addFirst(var31); // L: 11988
									}
								}

								if (var9.field3772 != null) { // L: 11991
									var38 = Client.field724.method4319(); // L: 11992

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 11993
										var31 = new ScriptEvent(); // L: 11994
										var31.widget = var9; // L: 11995
										var31.keyTyped = var38[var23]; // L: 11996
										var31.args = var9.field3772; // L: 11997
										Client.scriptEvents.addFirst(var31); // L: 11998
									}
								}
							}
						}

						if (!var9.isIf3) { // L: 12003
							if (Client.clickedWidget != null || Client.isMenuOpen) { // L: 12004
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.field3686 != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 12005
								if (var9.mouseOverRedirect >= 0) { // L: 12006
									Interpreter.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									Interpreter.mousedOverWidgetIf1 = var9; // L: 12007
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 12009
								class412.field4539 = var9; // L: 12010
							}

							if (var9.scrollHeight > var9.height) { // L: 12012
								class17.method245(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) { // L: 12014
							updateInterface(var0, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY); // L: 12015
							if (var9.children != null) { // L: 12016
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var29 = (InterfaceParent)Client.interfaceParents.get((long)var9.id); // L: 12017
							if (var29 != null) { // L: 12018
								if (var29.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) { // L: 12019
									for (ScriptEvent var30 = (ScriptEvent)Client.scriptEvents.last(); var30 != null; var30 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 12020
										if (var30.field1054) { // L: 12021
											var30.remove(); // L: 12022
											var30.widget.field3797 = false; // L: 12023
										}
									}

									if (class148.widgetDragDuration == 0) { // L: 12026
										Client.clickedWidget = null; // L: 12027
										Client.clickedWidgetParent = null; // L: 12028
									}

									if (!Client.isMenuOpen) { // L: 12030
										UserComparator10.addCancelMenuEntry(); // L: 12031
									}
								}

								class406.addPendingSpawnToScene(var29.group, var12, var13, var14, var15, var26, var11); // L: 12034
							}
						}
					}
				}
			}
		}

	} // L: 12038
}
