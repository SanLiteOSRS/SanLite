import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("k")
final class class1 implements class0 {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Ldy;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/Object;Lkf;B)V",
		garbageValue = "21"
	)
	public void vmethod70(Object var1, Buffer var2) {
		this.method10((Integer)var1, var2);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Lkf;I)Ljava/lang/Object;",
		garbageValue = "-453860591"
	)
	public Object vmethod61(Buffer var1) {
		return var1.readInt();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/Integer;Lkf;I)V",
		garbageValue = "-1705916618"
	)
	void method10(Integer var1, Buffer var2) {
		var2.writeInt(var1);
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(ILcy;ZI)I",
		garbageValue = "-1453115535"
	)
	static int method22(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = TileItem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? Canvas.field438 : class3.field12;
		}

		class52.invalidateWidget(var3);
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) {
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
				var3.modelType = 2;
				var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
				var3.modelType = 3;
				var3.modelId = WorldMapLabelSize.localPlayer.appearance.getChatHeadId();
				return 1;
			} else {
				return 2;
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 2;
			int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			var3.itemId = var4;
			var3.itemQuantity = var5;
			ItemComposition var6 = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var4);
			var3.modelAngleX = var6.xan2d;
			var3.modelAngleY = var6.yan2d;
			var3.modelAngleZ = var6.zan2d;
			var3.modelOffsetX = var6.offsetX2d;
			var3.modelOffsetY = var6.offsetY2d;
			var3.modelZoom = var6.zoom2d;
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | var6.isStackable == 1) {
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2;
			}

			if (var3.field2728 > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.field2728;
			} else if (var3.rawWidth > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(CI)Z",
		garbageValue = "2143002774"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9';
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		signature = "(Lhq;III)V",
		garbageValue = "362928511"
	)
	static final void method21(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) {
			StructDefinition.insertMenuItemNoShift(var0.buttonText, "", 24, 0, 0, var0.id);
		}

		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			var3 = SpriteMask.method4059(var0);
			if (var3 != null) {
				StructDefinition.insertMenuItemNoShift(var3, WorldMapAreaData.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id);
			}
		}

		if (var0.buttonType == 3) {
			StructDefinition.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			StructDefinition.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			StructDefinition.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			StructDefinition.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		int var4;
		int var19;
		if (var0.type == 2) {
			var19 = 0;

			for (var4 = 0; var4 < var0.height; ++var4) {
				for (int var5 = 0; var5 < var0.width; ++var5) {
					int var6 = (var0.paddingX + 32) * var5;
					int var7 = (var0.paddingY + 32) * var4;
					if (var19 < 20) {
						var6 += var0.inventoryXOffsets[var19];
						var7 += var0.inventoryYOffsets[var19];
					}

					if (var1 >= var6 && var2 >= var7 && var1 < var6 + 32 && var2 < var7 + 32) {
						Client.dragItemSlotDestination = var19;
						VerticalAlignment.field3226 = var0;
						if (var0.itemIds[var19] > 0) {
							label324: {
								ItemComposition var8 = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var0.itemIds[var19] - 1);
								boolean var9;
								int var10;
								if (Client.isItemSelected == 1) {
									var10 = WorldMapIcon_0.getWidgetClickMask(var0);
									var9 = (var10 >> 30 & 1) != 0;
									if (var9) {
										if (var0.id != class105.selectedItemWidget || var19 != GrandExchangeOfferUnitPriceComparator.selectedItemSlot) {
											StructDefinition.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + WorldMapAreaData.colorStartTag(16748608) + var8.name, 31, var8.id, var19, var0.id);
										}
										break label324;
									}
								}

								if (Client.isSpellSelected) {
									var10 = WorldMapIcon_0.getWidgetClickMask(var0);
									var9 = (var10 >> 30 & 1) != 0;
									if (var9) {
										if ((UserComparator8.selectedSpellFlags & 16) == 16) {
											StructDefinition.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + WorldMapAreaData.colorStartTag(16748608) + var8.name, 32, var8.id, var19, var0.id);
										}
										break label324;
									}
								}

								String[] var20 = var8.inventoryActions;
								var10 = -1;
								if (Client.shiftClickDrop && SoundSystem.method2593()) {
									var10 = var8.getShiftClickIndex();
								}

								int var12 = WorldMapIcon_0.getWidgetClickMask(var0);
								boolean var11 = (var12 >> 30 & 1) != 0;
								if (var11) {
									for (int var13 = 4; var13 >= 3; --var13) {
										if (var13 != var10) {
											class247.addWidgetItemMenuItem(var0, var8, var19, var13, false);
										}
									}
								}

								int var14 = WorldMapIcon_0.getWidgetClickMask(var0);
								boolean var23 = (var14 >> 31 & 1) != 0;
								if (var23) {
									StructDefinition.insertMenuItemNoShift("Use", WorldMapAreaData.colorStartTag(16748608) + var8.name, 38, var8.id, var19, var0.id);
								}

								int var16 = WorldMapIcon_0.getWidgetClickMask(var0);
								boolean var15 = (var16 >> 30 & 1) != 0;
								int var17;
								if (var15) {
									for (var17 = 2; var17 >= 0; --var17) {
										if (var17 != var10) {
											class247.addWidgetItemMenuItem(var0, var8, var19, var17, false);
										}
									}

									if (var10 >= 0) {
										class247.addWidgetItemMenuItem(var0, var8, var19, var10, true);
									}
								}

								var20 = var0.itemActions;
								if (var20 != null) {
									for (var17 = 4; var17 >= 0; --var17) {
										if (var20[var17] != null) {
											byte var18 = 0;
											if (var17 == 0) {
												var18 = 39;
											}

											if (var17 == 1) {
												var18 = 40;
											}

											if (var17 == 2) {
												var18 = 41;
											}

											if (var17 == 3) {
												var18 = 42;
											}

											if (var17 == 4) {
												var18 = 43;
											}

											StructDefinition.insertMenuItemNoShift(var20[var17], WorldMapAreaData.colorStartTag(16748608) + var8.name, var18, var8.id, var19, var0.id);
										}
									}
								}

								StructDefinition.insertMenuItemNoShift("Examine", WorldMapAreaData.colorStartTag(16748608) + var8.name, 1005, var8.id, var19, var0.id);
							}
						}
					}

					++var19;
				}
			}
		}

		if (var0.isIf3) {
			if (Client.isSpellSelected) {
				var4 = WorldMapIcon_0.getWidgetClickMask(var0);
				boolean var24 = (var4 >> 21 & 1) != 0;
				if (var24 && (UserComparator8.selectedSpellFlags & 32) == 32) {
					StructDefinition.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id);
				}
			} else {
				for (var19 = 9; var19 >= 5; --var19) {
					String var21 = WorldMapAreaData.method756(var0, var19);
					if (var21 != null) {
						StructDefinition.insertMenuItemNoShift(var21, var0.dataText, 1007, var19 + 1, var0.childIndex, var0.id);
					}
				}

				var3 = SpriteMask.method4059(var0);
				if (var3 != null) {
					StructDefinition.insertMenuItemNoShift(var3, var0.dataText, 25, 0, var0.childIndex, var0.id);
				}

				for (var4 = 4; var4 >= 0; --var4) {
					String var22 = WorldMapAreaData.method756(var0, var4);
					if (var22 != null) {
						Tiles.insertMenuItem(var22, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.field2747);
					}
				}

				if (class39.method614(WorldMapIcon_0.getWidgetClickMask(var0))) {
					StructDefinition.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
				}
			}
		}

	}
}
