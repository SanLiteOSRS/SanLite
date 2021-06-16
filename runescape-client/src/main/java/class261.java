import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jj")
public class class261 {
	static {
		Math.sqrt(8192.0D);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lex;",
		garbageValue = "-1540124861"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0);
			var1 = new InvDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Liv;IIB)V",
		garbageValue = "-13"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) {
			class22.insertMenuItemNoShift(var0.buttonText, "", 24, 0, 0, var0.id);
		}

		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			var3 = SecureRandomCallable.Widget_getSpellActionName(var0);
			if (var3 != null) {
				class22.insertMenuItemNoShift(var3, SecureRandomFuture.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id);
			}
		}

		if (var0.buttonType == 3) {
			class22.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			class22.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			class22.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			class22.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		int var4;
		int var5;
		int var15;
		if (var0.type == 2) {
			var15 = 0;

			for (var4 = 0; var4 < var0.height; ++var4) {
				for (var5 = 0; var5 < var0.width; ++var5) {
					int var18 = (var0.paddingX + 32) * var5;
					int var7 = (var0.paddingY + 32) * var4;
					if (var15 < 20) {
						var18 += var0.inventoryXOffsets[var15];
						var7 += var0.inventoryYOffsets[var15];
					}

					if (var1 >= var18 && var2 >= var7 && var1 < var18 + 32 && var2 < var7 + 32) {
						Client.dragItemSlotDestination = var15;
						UserComparator2.hoveredItemContainer = var0;
						if (var0.itemIds[var15] > 0) {
							ItemComposition var8 = class250.ItemDefinition_get(var0.itemIds[var15] - 1);
							if (Client.isItemSelected == 1 && class372.method6497(class22.getWidgetFlags(var0))) {
								if (var0.id != class246.selectedItemWidget || var15 != Timer.selectedItemSlot) {
									class22.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + SecureRandomFuture.colorStartTag(16748608) + var8.name, 31, var8.id, var15, var0.id);
								}
							} else if (Client.isSpellSelected && class372.method6497(class22.getWidgetFlags(var0))) {
								if ((LoginPacket.selectedSpellFlags & 16) == 16) {
									class22.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + SecureRandomFuture.colorStartTag(16748608) + var8.name, 32, var8.id, var15, var0.id);
								}
							} else {
								String[] var9 = var8.inventoryActions;
								int var10 = -1;
								boolean var11;
								if (Client.shiftClickDrop) {
									var11 = Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81];
									if (var11) {
										var10 = var8.getShiftClickIndex();
									}
								}

								if (class372.method6497(class22.getWidgetFlags(var0))) {
									for (int var20 = 4; var20 >= 3; --var20) {
										if (var10 != var20) {
											class14.addWidgetItemMenuItem(var0, var8, var15, var20, false);
										}
									}
								}

								int var12 = class22.getWidgetFlags(var0);
								var11 = (var12 >> 31 & 1) != 0;
								if (var11) {
									class22.insertMenuItemNoShift("Use", SecureRandomFuture.colorStartTag(16748608) + var8.name, 38, var8.id, var15, var0.id);
								}

								Object var10000 = null;
								int var13;
								if (class372.method6497(class22.getWidgetFlags(var0))) {
									for (var13 = 2; var13 >= 0; --var13) {
										if (var13 != var10) {
											class14.addWidgetItemMenuItem(var0, var8, var15, var13, false);
										}
									}

									if (var10 >= 0) {
										class14.addWidgetItemMenuItem(var0, var8, var15, var10, true);
									}
								}

								var9 = var0.itemActions;
								if (var9 != null) {
									for (var13 = 4; var13 >= 0; --var13) {
										if (var9[var13] != null) {
											byte var14 = 0;
											if (var13 == 0) {
												var14 = 39;
											}

											if (var13 == 1) {
												var14 = 40;
											}

											if (var13 == 2) {
												var14 = 41;
											}

											if (var13 == 3) {
												var14 = 42;
											}

											if (var13 == 4) {
												var14 = 43;
											}

											class22.insertMenuItemNoShift(var9[var13], SecureRandomFuture.colorStartTag(16748608) + var8.name, var14, var8.id, var15, var0.id);
										}
									}
								}

								class22.insertMenuItemNoShift("Examine", SecureRandomFuture.colorStartTag(16748608) + var8.name, 1005, var8.id, var15, var0.id);
							}
						}
					}

					++var15;
				}
			}
		}

		if (var0.isIf3) {
			if (Client.isSpellSelected) {
				var4 = class22.getWidgetFlags(var0);
				boolean var21 = (var4 >> 21 & 1) != 0;
				if (var21 && (LoginPacket.selectedSpellFlags & 32) == 32) {
					class22.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id);
				}
			} else {
				for (var15 = 9; var15 >= 5; --var15) {
					String var17;
					if (!class136.method2696(class22.getWidgetFlags(var0), var15) && var0.onOp == null) {
						var17 = null;
					} else if (var0.actions != null && var0.actions.length > var15 && var0.actions[var15] != null && var0.actions[var15].trim().length() != 0) {
						var17 = var0.actions[var15];
					} else {
						var17 = null;
					}

					if (var17 != null) {
						class22.insertMenuItemNoShift(var17, var0.dataText, 1007, var15 + 1, var0.childIndex, var0.id);
					}
				}

				var3 = SecureRandomCallable.Widget_getSpellActionName(var0);
				if (var3 != null) {
					class22.insertMenuItemNoShift(var3, var0.dataText, 25, 0, var0.childIndex, var0.id);
				}

				for (var4 = 4; var4 >= 0; --var4) {
					String var16;
					if (!class136.method2696(class22.getWidgetFlags(var0), var4) && var0.onOp == null) {
						var16 = null;
					} else if (var0.actions != null && var0.actions.length > var4 && var0.actions[var4] != null && var0.actions[var4].trim().length() != 0) {
						var16 = var0.actions[var4];
					} else {
						var16 = null;
					}

					if (var16 != null) {
						PacketWriter.insertMenuItem(var16, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.prioritizeMenuEntry);
					}
				}

				var5 = class22.getWidgetFlags(var0);
				boolean var19 = (var5 & 1) != 0;
				if (var19) {
					class22.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
				}
			}
		}

	}
}
