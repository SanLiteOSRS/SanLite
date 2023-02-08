import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
public class class103 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	static final class103 field1370;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	static final class103 field1371;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	static final class103 field1356;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	static final class103 field1354;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	static final class103 field1358;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	static final class103 field1359;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	static final class103 field1360;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	static final class103 field1361;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	static final class103 field1362;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	static final class103 field1363;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	static final class103 field1364;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	static final class103 field1365;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	static final class103 field1355;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	static final class103 field1367;
	@ObfuscatedName("js")
	@ObfuscatedGetter(
		intValue = 1869714183
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("mw")
	@ObfuscatedGetter(
		intValue = 1817318801
	)
	@Export("Client_plane")
	static int Client_plane;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1578729661
	)
	int field1368;

	static {
		field1370 = new class103(0); // L: 1902
		field1371 = new class103(1); // L: 1903
		field1356 = new class103(2); // L: 1904
		field1354 = new class103(3); // L: 1905
		field1358 = new class103(4); // L: 1906
		field1359 = new class103(5); // L: 1907
		field1360 = new class103(6); // L: 1908
		field1361 = new class103(7); // L: 1909
		field1362 = new class103(8); // L: 1910
		field1363 = new class103(9); // L: 1911
		field1364 = new class103(10); // L: 1912
		field1365 = new class103(11); // L: 1913
		field1355 = new class103(12); // L: 1914
		field1367 = new class103(13); // L: 1915
	}

	class103(int var1) {
		this.field1368 = var1; // L: 1919
	} // L: 1920

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(Lkz;IIB)V",
		garbageValue = "123"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) { // L: 11678
			class285.method5570(var0.buttonText, "", 24, 0, 0, var0.id, var0.itemId); // L: 11679
		}

		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) { // L: 11682
			var3 = class317.Widget_getSpellActionName(var0); // L: 11683
			if (var3 != null) { // L: 11684
				class285.method5570(var3, class149.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id, var0.itemId); // L: 11685
			}
		}

		if (var0.buttonType == 3) { // L: 11689
			WorldMapManager.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id); // L: 11690
		}

		if (var0.buttonType == 4) { // L: 11693
			WorldMapManager.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id); // L: 11694
		}

		if (var0.buttonType == 5) { // L: 11697
			WorldMapManager.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id); // L: 11698
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) { // L: 11701
			WorldMapManager.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id); // L: 11702
		}

		int var4;
		int var5;
		int var17;
		if (var0.type == 2) { // L: 11705
			var17 = 0; // L: 11706

			for (var4 = 0; var4 < var0.height; ++var4) { // L: 11707
				for (var5 = 0; var5 < var0.width; ++var5) { // L: 11708
					int var20 = (var0.paddingX + 32) * var5; // L: 11709
					int var7 = (var0.paddingY + 32) * var4; // L: 11710
					if (var17 < 20) { // L: 11711
						var20 += var0.inventoryXOffsets[var17]; // L: 11712
						var7 += var0.inventoryYOffsets[var17]; // L: 11713
					}

					if (var1 >= var20 && var2 >= var7 && var1 < var20 + 32 && var2 < var7 + 32) { // L: 11715
						Client.dragItemSlotDestination = var17; // L: 11716
						class157.hoveredItemContainer = var0; // L: 11717
						if (var0.itemIds[var17] > 0) { // L: 11718
							label379: {
								ItemComposition var8 = TileItem.ItemComposition_get(var0.itemIds[var17] - 1); // L: 11719
								boolean var9;
								int var10;
								if (Client.isItemSelected == 1) { // L: 11721
									var10 = class173.getWidgetFlags(var0); // L: 11723
									var9 = (var10 >> 30 & 1) != 0; // L: 11725
									if (var9) { // L: 11727
										if (var0.id != WorldMapLabel.selectedItemWidget || var17 != WorldMapIcon_0.selectedItemSlot) { // L: 11728
											class285.method5570("Use", Client.selectedItemName + " " + "->" + " " + class149.colorStartTag(16748608) + var8.name, 31, 0, var17, var0.id, var8.id); // L: 11729
										}
										break label379;
									}
								}

								if (Client.isSpellSelected) { // L: 11736
									var10 = class173.getWidgetFlags(var0); // L: 11738
									var9 = (var10 >> 30 & 1) != 0; // L: 11740
									if (var9) { // L: 11742
										if ((class149.selectedSpellFlags & 16) == 16) { // L: 11743
											class285.method5570(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class149.colorStartTag(16748608) + var8.name, 32, 0, var17, var0.id, var8.id); // L: 11744
										}
										break label379;
									}
								}

								String[] var21 = var8.inventoryActions; // L: 11750
								var10 = -1; // L: 11751
								boolean var11;
								if (Client.shiftClickDrop) { // L: 11752
									var11 = Client.tapToDrop || Client.field702.method4143(81); // L: 11755
									if (var11) { // L: 11757
										var10 = var8.getShiftClickIndex(); // L: 11758
									}
								}

								int var12 = class173.getWidgetFlags(var0); // L: 11762
								var11 = (var12 >> 30 & 1) != 0; // L: 11764
								if (var11) { // L: 11766
									for (int var13 = 4; var13 >= 3; --var13) { // L: 11767
										if (var13 != var10) { // L: 11768
											WorldMapRegion.addWidgetItemMenuItem(var0, var8, var17, var13, false); // L: 11769
										}
									}
								}

								Object var10000 = null; // L: 11772
								if (class288.method5596(class173.getWidgetFlags(var0))) {
									class285.method5570("Use", class149.colorStartTag(16748608) + var8.name, 38, 0, var17, var0.id, var8.id); // L: 11773
								}

								int var14 = class173.getWidgetFlags(var0); // L: 11777
								boolean var23 = (var14 >> 30 & 1) != 0; // L: 11779
								int var15;
								if (var23) { // L: 11781
									for (var15 = 2; var15 >= 0; --var15) { // L: 11782
										if (var15 != var10) { // L: 11783
											WorldMapRegion.addWidgetItemMenuItem(var0, var8, var17, var15, false); // L: 11784
										}
									}

									if (var10 >= 0) { // L: 11786
										WorldMapRegion.addWidgetItemMenuItem(var0, var8, var17, var10, true); // L: 11787
									}
								}

								var21 = var0.itemActions; // L: 11790
								if (var21 != null) { // L: 11791
									for (var15 = 4; var15 >= 0; --var15) { // L: 11792
										if (var21[var15] != null) { // L: 11793
											byte var16 = 0; // L: 11794
											if (var15 == 0) { // L: 11795
												var16 = 39;
											}

											if (var15 == 1) { // L: 11796
												var16 = 40;
											}

											if (var15 == 2) { // L: 11797
												var16 = 41;
											}

											if (var15 == 3) { // L: 11798
												var16 = 42;
											}

											if (var15 == 4) { // L: 11799
												var16 = 43;
											}

											class285.method5570(var21[var15], class149.colorStartTag(16748608) + var8.name, var16, 0, var17, var0.id, var8.id); // L: 11800
										}
									}
								}

								class285.method5570("Examine", class149.colorStartTag(16748608) + var8.name, 1005, 0, var17, var0.id, var8.id); // L: 11805
							}
						}
					}

					++var17; // L: 11811
				}
			}
		}

		if (var0.isIf3) { // L: 11815
			if (Client.isSpellSelected) { // L: 11816
				var4 = class173.getWidgetFlags(var0); // L: 11818
				boolean var24 = (var4 >> 21 & 1) != 0; // L: 11820
				if (var24 && (class149.selectedSpellFlags & 32) == 32) { // L: 11822
					class285.method5570(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id, var0.itemId); // L: 11823
				}
			} else {
				for (var17 = 9; var17 >= 5; --var17) { // L: 11828
					String var19;
					if (!ItemLayer.method4229(class173.getWidgetFlags(var0), var17) && var0.onOp == null) { // L: 11831
						var19 = null; // L: 11832
					} else if (var0.actions != null && var0.actions.length > var17 && var0.actions[var17] != null && var0.actions[var17].trim().length() != 0) { // L: 11835
						var19 = var0.actions[var17]; // L: 11839
					} else {
						var19 = null; // L: 11836
					}

					if (var19 != null) { // L: 11842
						class285.method5570(var19, var0.dataText, 1007, var17 + 1, var0.childIndex, var0.id, var0.itemId); // L: 11843
					}
				}

				var3 = class317.Widget_getSpellActionName(var0); // L: 11847
				if (var3 != null) { // L: 11848
					class285.method5570(var3, var0.dataText, 25, 0, var0.childIndex, var0.id, var0.itemId); // L: 11849
				}

				for (var4 = 4; var4 >= 0; --var4) { // L: 11852
					String var18;
					if (!ItemLayer.method4229(class173.getWidgetFlags(var0), var4) && var0.onOp == null) { // L: 11855
						var18 = null; // L: 11856
					} else if (var0.actions != null && var0.actions.length > var4 && var0.actions[var4] != null && var0.actions[var4].trim().length() != 0) { // L: 11859
						var18 = var0.actions[var4]; // L: 11863
					} else {
						var18 = null; // L: 11860
					}

					if (var18 != null) { // L: 11866
						class290.method5598(var18, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry); // L: 11867
					}
				}

				var5 = class173.getWidgetFlags(var0); // L: 11872
				boolean var22 = (var5 & 1) != 0; // L: 11874
				if (var22) { // L: 11876
					WorldMapManager.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id); // L: 11877
				}
			}
		}

	} // L: 11882
}
