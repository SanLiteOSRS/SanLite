import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nc")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
	AbstractSocket() {
	} // L: 7

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "126370664"
	)
	@Export("isAvailable")
	public abstract boolean isAvailable(int var1) throws IOException;

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "14"
	)
	@Export("available")
	public abstract int available() throws IOException;

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-660901031"
	)
	@Export("readUnsignedByte")
	public abstract int readUnsignedByte() throws IOException;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "-6"
	)
	@Export("read")
	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "([BIIS)V",
		garbageValue = "-16011"
	)
	@Export("write")
	public abstract void write(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-947955059"
	)
	@Export("close")
	public abstract void close();

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(Lkn;IIB)V",
		garbageValue = "-77"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) { // L: 10593
			ClientPacket.method5130(var0.buttonText, "", 24, 0, 0, var0.id, var0.itemId); // L: 10594
		}

		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) { // L: 10597
			var3 = WorldMapDecoration.Widget_getSpellActionName(var0); // L: 10598
			if (var3 != null) { // L: 10599
				ClientPacket.method5130(var3, Clock.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id, var0.itemId); // L: 10600
			}
		}

		if (var0.buttonType == 3) { // L: 10604
			ChatChannel.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id); // L: 10605
		}

		if (var0.buttonType == 4) { // L: 10608
			ChatChannel.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id); // L: 10609
		}

		if (var0.buttonType == 5) { // L: 10612
			ChatChannel.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id); // L: 10613
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) { // L: 10616
			ChatChannel.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id); // L: 10617
		}

		int var4;
		int var17;
		if (var0.type == 2) { // L: 10620
			var17 = 0; // L: 10621

			for (var4 = 0; var4 < var0.height; ++var4) { // L: 10622
				for (int var19 = 0; var19 < var0.width; ++var19) { // L: 10623
					int var6 = (var0.paddingX + 32) * var19; // L: 10624
					int var7 = (var0.paddingY + 32) * var4; // L: 10625
					if (var17 < 20) { // L: 10626
						var6 += var0.inventoryXOffsets[var17]; // L: 10627
						var7 += var0.inventoryYOffsets[var17]; // L: 10628
					}

					if (var1 >= var6 && var2 >= var7 && var1 < var6 + 32 && var2 < var7 + 32) { // L: 10630
						Client.dragItemSlotDestination = var17; // L: 10631
						class133.hoveredItemContainer = var0; // L: 10632
						if (var0.itemIds[var17] > 0) { // L: 10633
							label300: {
								ItemComposition var8 = AttackOption.ItemComposition_get(var0.itemIds[var17] - 1); // L: 10634
								boolean var9;
								int var10;
								if (Client.isItemSelected == 1) { // L: 10636
									var10 = class193.getWidgetFlags(var0); // L: 10638
									var9 = (var10 >> 30 & 1) != 0; // L: 10640
									if (var9) { // L: 10642
										if (var0.id != class150.selectedItemWidget || var17 != class67.selectedItemSlot) { // L: 10643
											ClientPacket.method5130("Use", Client.selectedItemName + " " + "->" + " " + Clock.colorStartTag(16748608) + var8.name, 31, 0, var17, var0.id, var8.id); // L: 10644
										}
										break label300;
									}
								}

								if (Client.isSpellSelected) { // L: 10651
									var10 = class193.getWidgetFlags(var0); // L: 10653
									var9 = (var10 >> 30 & 1) != 0; // L: 10655
									if (var9) { // L: 10657
										if ((class149.selectedSpellFlags & 16) == 16) { // L: 10658
											ClientPacket.method5130(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + Clock.colorStartTag(16748608) + var8.name, 32, 0, var17, var0.id, var8.id); // L: 10659
										}
										break label300;
									}
								}

								String[] var20 = var8.inventoryActions; // L: 10665
								var10 = -1; // L: 10666
								if (Client.shiftClickDrop && class142.method2990()) { // L: 10667
									var10 = var8.getShiftClickIndex(); // L: 10668
								}

								int var12 = class193.getWidgetFlags(var0); // L: 10671
								boolean var11 = (var12 >> 30 & 1) != 0; // L: 10673
								if (var11) { // L: 10675
									for (int var13 = 4; var13 >= 3; --var13) { // L: 10676
										if (var10 != var13) { // L: 10677
											SoundSystem.addWidgetItemMenuItem(var0, var8, var17, var13, false); // L: 10678
										}
									}
								}

								Object var10000 = null; // L: 10681
								if (class286.method5454(class193.getWidgetFlags(var0))) {
									ClientPacket.method5130("Use", Clock.colorStartTag(16748608) + var8.name, 38, 0, var17, var0.id, var8.id); // L: 10682
								}

								int var14 = class193.getWidgetFlags(var0); // L: 10686
								boolean var21 = (var14 >> 30 & 1) != 0; // L: 10688
								int var15;
								if (var21) { // L: 10690
									for (var15 = 2; var15 >= 0; --var15) { // L: 10691
										if (var10 != var15) { // L: 10692
											SoundSystem.addWidgetItemMenuItem(var0, var8, var17, var15, false); // L: 10693
										}
									}

									if (var10 >= 0) { // L: 10695
										SoundSystem.addWidgetItemMenuItem(var0, var8, var17, var10, true); // L: 10696
									}
								}

								var20 = var0.itemActions; // L: 10699
								if (var20 != null) { // L: 10700
									for (var15 = 4; var15 >= 0; --var15) { // L: 10701
										if (var20[var15] != null) { // L: 10702
											byte var16 = 0; // L: 10703
											if (var15 == 0) { // L: 10704
												var16 = 39;
											}

											if (var15 == 1) { // L: 10705
												var16 = 40;
											}

											if (var15 == 2) { // L: 10706
												var16 = 41;
											}

											if (var15 == 3) { // L: 10707
												var16 = 42;
											}

											if (var15 == 4) { // L: 10708
												var16 = 43;
											}

											ClientPacket.method5130(var20[var15], Clock.colorStartTag(16748608) + var8.name, var16, 0, var17, var0.id, var8.id); // L: 10709
										}
									}
								}

								ClientPacket.method5130("Examine", Clock.colorStartTag(16748608) + var8.name, 1005, 0, var17, var0.id, var8.id); // L: 10714
							}
						}
					}

					++var17; // L: 10720
				}
			}
		}

		if (var0.isIf3) { // L: 10724
			if (Client.isSpellSelected) { // L: 10725
				if (HealthBarDefinition.method3371(class193.getWidgetFlags(var0)) && (class149.selectedSpellFlags & 32) == 32) { // L: 10726
					ClientPacket.method5130(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id, var0.itemId); // L: 10727
				}
			} else {
				for (var17 = 9; var17 >= 5; --var17) { // L: 10732
					String var18 = GrandExchangeOfferAgeComparator.method5910(var0, var17); // L: 10733
					if (var18 != null) { // L: 10734
						ClientPacket.method5130(var18, var0.dataText, 1007, var17 + 1, var0.childIndex, var0.id, var0.itemId); // L: 10735
					}
				}

				var3 = WorldMapDecoration.Widget_getSpellActionName(var0); // L: 10739
				if (var3 != null) { // L: 10740
					ClientPacket.method5130(var3, var0.dataText, 25, 0, var0.childIndex, var0.id, var0.itemId); // L: 10741
				}

				for (var4 = 4; var4 >= 0; --var4) { // L: 10744
					String var5 = GrandExchangeOfferAgeComparator.method5910(var0, var4); // L: 10745
					if (var5 != null) { // L: 10746
						CollisionMap.method3809(var5, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry); // L: 10747
					}
				}

				if (class385.method6873(class193.getWidgetFlags(var0))) { // L: 10751
					ChatChannel.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id); // L: 10752
				}
			}
		}

	} // L: 10757
}
