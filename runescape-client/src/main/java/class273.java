import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
public class class273 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-957570994"
	)
	public static void method5480() {
		StructComposition.StructDefinition_cached.clear(); // L: 67
	} // L: 68

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(Lct;I)V",
		garbageValue = "-912521373"
	)
	static final void method5479(Actor var0) {
		int var1 = Math.max(1, var0.field1233 - Client.cycle); // L: 4169
		int var2 = var0.field1196 * 128 + var0.field1181 * 64; // L: 4170
		int var3 = var0.field1185 * 128 + var0.field1181 * 64; // L: 4171
		var0.x += (var2 - var0.x) / var1; // L: 4172
		var0.y += (var3 - var0.y) / var1; // L: 4173
		var0.field1239 = 0; // L: 4174
		var0.orientation = var0.field1235; // L: 4175
	} // L: 4176

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(Lkd;IIB)V",
		garbageValue = "-128"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) { // L: 11144
			ScriptFrame.method1172(var0.buttonText, "", 24, 0, 0, var0.id, var0.itemId); // L: 11145
		}

		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) { // L: 11148
			var3 = ArchiveLoader.Widget_getSpellActionName(var0); // L: 11149
			if (var3 != null) { // L: 11150
				ScriptFrame.method1172(var3, MouseRecorder.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id, var0.itemId); // L: 11151
			}
		}

		if (var0.buttonType == 3) { // L: 11155
			ObjectSound.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id); // L: 11156
		}

		if (var0.buttonType == 4) { // L: 11159
			ObjectSound.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id); // L: 11160
		}

		if (var0.buttonType == 5) { // L: 11163
			ObjectSound.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id); // L: 11164
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) { // L: 11167
			ObjectSound.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id); // L: 11168
		}

		int var4;
		int var5;
		int var13;
		if (var0.type == 2) { // L: 11171
			var13 = 0; // L: 11172

			for (var4 = 0; var4 < var0.height; ++var4) { // L: 11173
				for (var5 = 0; var5 < var0.width; ++var5) { // L: 11174
					int var16 = (var0.paddingX + 32) * var5; // L: 11175
					int var7 = (var0.paddingY + 32) * var4; // L: 11176
					if (var13 < 20) { // L: 11177
						var16 += var0.inventoryXOffsets[var13]; // L: 11178
						var7 += var0.inventoryYOffsets[var13]; // L: 11179
					}

					if (var1 >= var16 && var2 >= var7 && var1 < var16 + 32 && var2 < var7 + 32) { // L: 11181
						Client.dragItemSlotDestination = var13; // L: 11182
						WorldMapID.hoveredItemContainer = var0; // L: 11183
						if (var0.itemIds[var13] > 0) { // L: 11184
							ItemComposition var8 = NPCComposition.ItemComposition_get(var0.itemIds[var13] - 1); // L: 11185
							if (Client.isItemSelected == 1 && WorldMapSection2.method4907(Clock.getWidgetFlags(var0))) { // L: 11186
								if (var0.id != ModeWhere.selectedItemWidget || var13 != class101.selectedItemSlot) { // L: 11187
									ScriptFrame.method1172("Use", Client.selectedItemName + " " + "->" + " " + MouseRecorder.colorStartTag(16748608) + var8.name, 31, 0, var13, var0.id, var8.id); // L: 11188
								}
							} else if (Client.isSpellSelected && WorldMapSection2.method4907(Clock.getWidgetFlags(var0))) { // L: 11192
								if ((class21.selectedSpellFlags & 16) == 16) { // L: 11193
									ScriptFrame.method1172(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + MouseRecorder.colorStartTag(16748608) + var8.name, 32, 0, var13, var0.id, var8.id); // L: 11194
								}
							} else {
								String[] var9 = var8.inventoryActions; // L: 11199
								int var10 = -1; // L: 11200
								if (Client.shiftClickDrop) { // L: 11201
									boolean var11 = Client.tapToDrop || Client.field747.method4106(81); // L: 11204
									if (var11) { // L: 11206
										var10 = var8.getShiftClickIndex(); // L: 11207
									}
								}

								int var18;
								if (WorldMapSection2.method4907(Clock.getWidgetFlags(var0))) { // L: 11210
									for (var18 = 4; var18 >= 3; --var18) { // L: 11211
										if (var10 != var18) { // L: 11212
											class317.addWidgetItemMenuItem(var0, var8, var13, var18, false); // L: 11213
										}
									}
								}

								if (UserComparator10.method2867(Clock.getWidgetFlags(var0))) { // L: 11216
									ScriptFrame.method1172("Use", MouseRecorder.colorStartTag(16748608) + var8.name, 38, 0, var13, var0.id, var8.id); // L: 11217
								}

								if (WorldMapSection2.method4907(Clock.getWidgetFlags(var0))) { // L: 11220
									for (var18 = 2; var18 >= 0; --var18) { // L: 11221
										if (var18 != var10) { // L: 11222
											class317.addWidgetItemMenuItem(var0, var8, var13, var18, false); // L: 11223
										}
									}

									if (var10 >= 0) { // L: 11225
										class317.addWidgetItemMenuItem(var0, var8, var13, var10, true); // L: 11226
									}
								}

								var9 = var0.itemActions; // L: 11229
								if (var9 != null) { // L: 11230
									for (var18 = 4; var18 >= 0; --var18) { // L: 11231
										if (var9[var18] != null) { // L: 11232
											byte var12 = 0; // L: 11233
											if (var18 == 0) { // L: 11234
												var12 = 39;
											}

											if (var18 == 1) { // L: 11235
												var12 = 40;
											}

											if (var18 == 2) { // L: 11236
												var12 = 41;
											}

											if (var18 == 3) { // L: 11237
												var12 = 42;
											}

											if (var18 == 4) { // L: 11238
												var12 = 43;
											}

											ScriptFrame.method1172(var9[var18], MouseRecorder.colorStartTag(16748608) + var8.name, var12, 0, var13, var0.id, var8.id); // L: 11239
										}
									}
								}

								ScriptFrame.method1172("Examine", MouseRecorder.colorStartTag(16748608) + var8.name, 1005, 0, var13, var0.id, var8.id); // L: 11244
							}
						}
					}

					++var13; // L: 11249
				}
			}
		}

		if (var0.isIf3) { // L: 11253
			if (Client.isSpellSelected) { // L: 11254
				var4 = Clock.getWidgetFlags(var0); // L: 11256
				boolean var19 = (var4 >> 21 & 1) != 0; // L: 11258
				if (var19 && (class21.selectedSpellFlags & 32) == 32) { // L: 11260
					ScriptFrame.method1172(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id, var0.itemId); // L: 11261
				}
			} else {
				for (var13 = 9; var13 >= 5; --var13) { // L: 11266
					String var15;
					if (!class251.method5275(Clock.getWidgetFlags(var0), var13) && var0.onOp == null) { // L: 11269
						var15 = null; // L: 11270
					} else if (var0.actions != null && var0.actions.length > var13 && var0.actions[var13] != null && var0.actions[var13].trim().length() != 0) { // L: 11273
						var15 = var0.actions[var13]; // L: 11277
					} else {
						var15 = null; // L: 11274
					}

					if (var15 != null) { // L: 11280
						ScriptFrame.method1172(var15, var0.dataText, 1007, var13 + 1, var0.childIndex, var0.id, var0.itemId); // L: 11281
					}
				}

				var3 = ArchiveLoader.Widget_getSpellActionName(var0); // L: 11285
				if (var3 != null) { // L: 11286
					ScriptFrame.method1172(var3, var0.dataText, 25, 0, var0.childIndex, var0.id, var0.itemId); // L: 11287
				}

				for (var4 = 4; var4 >= 0; --var4) { // L: 11290
					String var14;
					if (!class251.method5275(Clock.getWidgetFlags(var0), var4) && var0.onOp == null) { // L: 11293
						var14 = null; // L: 11294
					} else if (var0.actions != null && var0.actions.length > var4 && var0.actions[var4] != null && var0.actions[var4].trim().length() != 0) { // L: 11297
						var14 = var0.actions[var4]; // L: 11301
					} else {
						var14 = null; // L: 11298
					}

					if (var14 != null) { // L: 11304
						class37.method706(var14, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry); // L: 11305
					}
				}

				var5 = Clock.getWidgetFlags(var0); // L: 11310
				boolean var17 = (var5 & 1) != 0; // L: 11312
				if (var17) { // L: 11314
					ObjectSound.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id); // L: 11315
				}
			}
		}

	} // L: 11320

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1263982193"
	)
	static final int method5478() {
		float var0 = 200.0F * ((float)StructComposition.clientPreferences.method2422() - 0.5F); // L: 12161
		return 100 - Math.round(var0); // L: 12162
	}
}
