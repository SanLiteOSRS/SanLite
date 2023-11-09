import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
public class class302 {
	@ObfuscatedName("vz")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	public static class326 field3596;
	@ObfuscatedName("ui")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static final class302 field3600;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static final class302 field3597;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2057015371
	)
	final int field3601;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 929892857
	)
	final int field3599;

	static {
		field3600 = new class302(51, 27, 800, 0, 16, 16); // L: 33
		field3597 = new class302(25, 28, 800, 656, 40, 40); // L: 34
	}

	class302(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field3601 = var5; // L: 39
		this.field3599 = var6; // L: 40
	} // L: 41

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(Lku;III)V",
		garbageValue = "197731620"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) { // L: 10752
			UserComparator4.method2657(var0.buttonText, "", 24, 0, 0, var0.id, var0.itemId); // L: 10753
		}

		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) { // L: 10756
			var3 = IgnoreList.Widget_getSpellActionName(var0); // L: 10757
			if (var3 != null) { // L: 10758
				UserComparator4.method2657(var3, class82.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id, var0.itemId); // L: 10759
			}
		}

		if (var0.buttonType == 3) { // L: 10763
			StructComposition.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id); // L: 10764
		}

		if (var0.buttonType == 4) { // L: 10767
			StructComposition.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id); // L: 10768
		}

		if (var0.buttonType == 5) { // L: 10771
			StructComposition.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id); // L: 10772
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) { // L: 10775
			StructComposition.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id); // L: 10776
		}

		int var4;
		int var5;
		int var15;
		if (var0.type == 2) { // L: 10779
			var15 = 0; // L: 10780

			for (var4 = 0; var4 < var0.height; ++var4) { // L: 10781
				for (var5 = 0; var5 < var0.width; ++var5) { // L: 10782
					int var18 = (var0.paddingX + 32) * var5; // L: 10783
					int var7 = (var0.paddingY + 32) * var4; // L: 10784
					if (var15 < 20) { // L: 10785
						var18 += var0.inventoryXOffsets[var15]; // L: 10786
						var7 += var0.inventoryYOffsets[var15]; // L: 10787
					}

					if (var1 >= var18 && var2 >= var7 && var1 < var18 + 32 && var2 < var7 + 32) { // L: 10789
						Client.dragItemSlotDestination = var15; // L: 10790
						NetCache.hoveredItemContainer = var0; // L: 10791
						if (var0.itemIds[var15] > 0) { // L: 10792
							ItemComposition var8 = class258.ItemComposition_get(var0.itemIds[var15] - 1); // L: 10793
							if (Client.isItemSelected == 1 && SpotAnimationDefinition.method3518(class67.getWidgetFlags(var0))) { // L: 10794
								if (var0.id != GraphicsObject.selectedItemWidget || var15 != GrandExchangeOfferOwnWorldComparator.selectedItemSlot) { // L: 10795
									UserComparator4.method2657("Use", Client.selectedItemName + " " + "->" + " " + class82.colorStartTag(16748608) + var8.name, 31, 0, var15, var0.id, var8.id); // L: 10796
								}
							} else if (Client.isSpellSelected && SpotAnimationDefinition.method3518(class67.getWidgetFlags(var0))) { // L: 10800
								if ((Coord.selectedSpellFlags & 16) == 16) { // L: 10801
									UserComparator4.method2657(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class82.colorStartTag(16748608) + var8.name, 32, 0, var15, var0.id, var8.id); // L: 10802
								}
							} else {
								String[] var9 = var8.inventoryActions; // L: 10807
								int var10 = -1; // L: 10808
								boolean var11;
								if (Client.shiftClickDrop) { // L: 10809
									var11 = Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81]; // L: 10812
									if (var11) { // L: 10814
										var10 = var8.getShiftClickIndex(); // L: 10815
									}
								}

								if (SpotAnimationDefinition.method3518(class67.getWidgetFlags(var0))) { // L: 10818
									for (int var20 = 4; var20 >= 3; --var20) { // L: 10819
										if (var20 != var10) { // L: 10820
											Archive.addWidgetItemMenuItem(var0, var8, var15, var20, false); // L: 10821
										}
									}
								}

								int var12 = class67.getWidgetFlags(var0); // L: 10825
								var11 = (var12 >> 31 & 1) != 0; // L: 10827
								if (var11) { // L: 10829
									UserComparator4.method2657("Use", class82.colorStartTag(16748608) + var8.name, 38, 0, var15, var0.id, var8.id); // L: 10830
								}

								Object var10000 = null; // L: 10833
								int var13;
								if (SpotAnimationDefinition.method3518(class67.getWidgetFlags(var0))) {
									for (var13 = 2; var13 >= 0; --var13) { // L: 10834
										if (var13 != var10) { // L: 10835
											Archive.addWidgetItemMenuItem(var0, var8, var15, var13, false); // L: 10836
										}
									}

									if (var10 >= 0) { // L: 10838
										Archive.addWidgetItemMenuItem(var0, var8, var15, var10, true); // L: 10839
									}
								}

								var9 = var0.itemActions; // L: 10842
								if (var9 != null) { // L: 10843
									for (var13 = 4; var13 >= 0; --var13) { // L: 10844
										if (var9[var13] != null) { // L: 10845
											byte var14 = 0; // L: 10846
											if (var13 == 0) { // L: 10847
												var14 = 39;
											}

											if (var13 == 1) { // L: 10848
												var14 = 40;
											}

											if (var13 == 2) { // L: 10849
												var14 = 41;
											}

											if (var13 == 3) { // L: 10850
												var14 = 42;
											}

											if (var13 == 4) { // L: 10851
												var14 = 43;
											}

											UserComparator4.method2657(var9[var13], class82.colorStartTag(16748608) + var8.name, var14, 0, var15, var0.id, var8.id); // L: 10852
										}
									}
								}

								UserComparator4.method2657("Examine", class82.colorStartTag(16748608) + var8.name, 1005, 0, var15, var0.id, var8.id); // L: 10857
							}
						}
					}

					++var15; // L: 10862
				}
			}
		}

		if (var0.isIf3) { // L: 10866
			if (Client.isSpellSelected) { // L: 10867
				if (class136.method2955(class67.getWidgetFlags(var0)) && (Coord.selectedSpellFlags & 32) == 32) { // L: 10868
					UserComparator4.method2657(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id, var0.itemId); // L: 10869
				}
			} else {
				for (var15 = 9; var15 >= 5; --var15) { // L: 10874
					String var17;
					if (!class201.method4100(class67.getWidgetFlags(var0), var15) && var0.onOp == null) { // L: 10877
						var17 = null; // L: 10878
					} else if (var0.actions != null && var0.actions.length > var15 && var0.actions[var15] != null && var0.actions[var15].trim().length() != 0) { // L: 10881
						var17 = var0.actions[var15]; // L: 10885
					} else {
						var17 = null; // L: 10882
					}

					if (var17 != null) { // L: 10888
						UserComparator4.method2657(var17, var0.dataText, 1007, var15 + 1, var0.childIndex, var0.id, var0.itemId); // L: 10889
					}
				}

				var3 = IgnoreList.Widget_getSpellActionName(var0); // L: 10893
				if (var3 != null) { // L: 10894
					UserComparator4.method2657(var3, var0.dataText, 25, 0, var0.childIndex, var0.id, var0.itemId); // L: 10895
				}

				for (var4 = 4; var4 >= 0; --var4) { // L: 10898
					String var16;
					if (!class201.method4100(class67.getWidgetFlags(var0), var4) && var0.onOp == null) { // L: 10901
						var16 = null; // L: 10902
					} else if (var0.actions != null && var0.actions.length > var4 && var0.actions[var4] != null && var0.actions[var4].trim().length() != 0) { // L: 10905
						var16 = var0.actions[var4]; // L: 10909
					} else {
						var16 = null; // L: 10906
					}

					if (var16 != null) { // L: 10912
						ViewportMouse.method4487(var16, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry); // L: 10913
					}
				}

				var5 = class67.getWidgetFlags(var0); // L: 10918
				boolean var19 = (var5 & 1) != 0; // L: 10920
				if (var19) { // L: 10922
					StructComposition.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id); // L: 10923
				}
			}
		}

	} // L: 10928
}
