import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("Widget_archive")
	public static AbstractArchive Widget_archive;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -859723449
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 36021957
	)
	@Export("health")
	int health;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1070199867
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 687360175
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-629620630"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-1591"
	)
	public static void method2197() {
		VarbitComposition.VarbitDefinition_cached.clear();
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "(B)Lmc;",
		garbageValue = "7"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return class243.worldMap;
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1808857292"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (MouseRecorder.pcmPlayer1 != null) {
			MouseRecorder.pcmPlayer1.run();
		}

		if (DesktopPlatformInfoProvider.pcmPlayer0 != null) {
			DesktopPlatformInfoProvider.pcmPlayer0.run();
		}

	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(Lio;III)V",
		garbageValue = "-190288118"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) {
			Occluder.insertMenuItemNoShift(var0.buttonText, "", 24, 0, 0, var0.id);
		}

		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			var3 = BoundaryObject.Widget_getSpellActionName(var0);
			if (var3 != null) {
				Occluder.insertMenuItemNoShift(var3, class44.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id);
			}
		}

		if (var0.buttonType == 3) {
			Occluder.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			Occluder.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			Occluder.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			Occluder.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		int var4;
		int var5;
		int var13;
		if (var0.type == 2) {
			var13 = 0;

			for (var4 = 0; var4 < var0.height; ++var4) {
				for (var5 = 0; var5 < var0.width; ++var5) {
					int var16 = (var0.paddingX + 32) * var5;
					int var7 = (var0.paddingY + 32) * var4;
					if (var13 < 20) {
						var16 += var0.inventoryXOffsets[var13];
						var7 += var0.inventoryYOffsets[var13];
					}

					if (var1 >= var16 && var2 >= var7 && var1 < var16 + 32 && var2 < var7 + 32) {
						Client.dragItemSlotDestination = var13;
						class18.hoveredItemContainer = var0;
						if (var0.itemIds[var13] > 0) {
							ItemComposition var8 = class260.ItemDefinition_get(var0.itemIds[var13] - 1);
							if (Client.isItemSelected == 1 && World.method1663(class21.getWidgetFlags(var0))) {
								if (var0.id != Player.selectedItemWidget || var13 != class9.selectedItemSlot) {
									Occluder.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class44.colorStartTag(16748608) + var8.name, 31, var8.id, var13, var0.id);
								}
							} else if (Client.isSpellSelected && World.method1663(class21.getWidgetFlags(var0))) {
								if ((class4.selectedSpellFlags & 16) == 16) {
									Occluder.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class44.colorStartTag(16748608) + var8.name, 32, var8.id, var13, var0.id);
								}
							} else {
								String[] var9 = var8.inventoryActions;
								int var10 = -1;
								if (Client.shiftClickDrop) {
									boolean var11 = Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81];
									if (var11) {
										var10 = var8.getShiftClickIndex();
									}
								}

								int var18;
								if (World.method1663(class21.getWidgetFlags(var0))) {
									for (var18 = 4; var18 >= 3; --var18) {
										if (var10 != var18) {
											class125.addWidgetItemMenuItem(var0, var8, var13, var18, false);
										}
									}
								}

								if (StructComposition.method2908(class21.getWidgetFlags(var0))) {
									Occluder.insertMenuItemNoShift("Use", class44.colorStartTag(16748608) + var8.name, 38, var8.id, var13, var0.id);
								}

								if (World.method1663(class21.getWidgetFlags(var0))) {
									for (var18 = 2; var18 >= 0; --var18) {
										if (var18 != var10) {
											class125.addWidgetItemMenuItem(var0, var8, var13, var18, false);
										}
									}

									if (var10 >= 0) {
										class125.addWidgetItemMenuItem(var0, var8, var13, var10, true);
									}
								}

								var9 = var0.itemActions;
								if (var9 != null) {
									for (var18 = 4; var18 >= 0; --var18) {
										if (var9[var18] != null) {
											byte var12 = 0;
											if (var18 == 0) {
												var12 = 39;
											}

											if (var18 == 1) {
												var12 = 40;
											}

											if (var18 == 2) {
												var12 = 41;
											}

											if (var18 == 3) {
												var12 = 42;
											}

											if (var18 == 4) {
												var12 = 43;
											}

											Occluder.insertMenuItemNoShift(var9[var18], class44.colorStartTag(16748608) + var8.name, var12, var8.id, var13, var0.id);
										}
									}
								}

								Occluder.insertMenuItemNoShift("Examine", class44.colorStartTag(16748608) + var8.name, 1005, var8.id, var13, var0.id);
							}
						}
					}

					++var13;
				}
			}
		}

		if (var0.isIf3) {
			if (Client.isSpellSelected) {
				var4 = class21.getWidgetFlags(var0);
				boolean var19 = (var4 >> 21 & 1) != 0;
				if (var19 && (class4.selectedSpellFlags & 32) == 32) {
					Occluder.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id);
				}
			} else {
				for (var13 = 9; var13 >= 5; --var13) {
					String var15;
					if (!TextureProvider.method4141(class21.getWidgetFlags(var0), var13) && var0.onOp == null) {
						var15 = null;
					} else if (var0.actions != null && var0.actions.length > var13 && var0.actions[var13] != null && var0.actions[var13].trim().length() != 0) {
						var15 = var0.actions[var13];
					} else {
						var15 = null;
					}

					if (var15 != null) {
						Occluder.insertMenuItemNoShift(var15, var0.dataText, 1007, var13 + 1, var0.childIndex, var0.id);
					}
				}

				var3 = BoundaryObject.Widget_getSpellActionName(var0);
				if (var3 != null) {
					Occluder.insertMenuItemNoShift(var3, var0.dataText, 25, 0, var0.childIndex, var0.id);
				}

				for (var4 = 4; var4 >= 0; --var4) {
					String var14;
					if (!TextureProvider.method4141(class21.getWidgetFlags(var0), var4) && var0.onOp == null) {
						var14 = null;
					} else if (var0.actions != null && var0.actions.length > var4 && var0.actions[var4] != null && var0.actions[var4].trim().length() != 0) {
						var14 = var0.actions[var4];
					} else {
						var14 = null;
					}

					if (var14 != null) {
						BoundaryObject.insertMenuItem(var14, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.prioritizeMenuEntry);
					}
				}

				var5 = class21.getWidgetFlags(var0);
				boolean var17 = (var5 & 1) != 0;
				if (var17) {
					Occluder.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
				}
			}
		}

	}
}
