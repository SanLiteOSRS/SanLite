import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("d")
public class class12 extends class16 {
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("archive7")
	static Archive archive7;
	@ObfuscatedName("f")
	String field111;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1521537625
	)
	int field110;
	@ObfuscatedName("u")
	byte field109;
	// $FF: synthetic field
	@ObfuscatedSignature(
		signature = "Lx;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		signature = "(Lx;)V"
	)
	class12(class19 var1) {
		this.this$0 = var1;
		this.field111 = null;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "-1239860939"
	)
	void vmethod356(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

		this.field111 = var1.readStringCp1252NullTerminatedOrNull();
		this.field110 = var1.readUnsignedShort();
		this.field109 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lp;I)V",
		garbageValue = "1583378087"
	)
	void vmethod352(class3 var1) {
		class9 var2 = new class9();
		var2.field65 = this.field111;
		var2.field64 = this.field110;
		var2.field66 = this.field109;
		var1.method61(var2);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(ZZI)Low;",
		garbageValue = "-430901660"
	)
	static IndexedSprite method213(boolean var0, boolean var1) {
		return var0 ? (var1 ? VarcInt.field3429 : Skeleton.options_buttons_2Sprite) : (var1 ? UrlRequester.field1400 : TileItem.options_buttons_0Sprite);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		signature = "(ILcc;ZI)I",
		garbageValue = "-1693166177"
	)
	static int method209(int var0, Script var1, boolean var2) {
		if (var0 != 7000 && var0 != 7005 && var0 != 7010 && var0 != 7015 && var0 != 7020 && var0 != 7025 && var0 != 7030 && var0 != 7035) {
			if (var0 != 7001 && var0 != 7002 && var0 != 7011 && var0 != 7012 && var0 != 7021 && var0 != 7022) {
				if (var0 != 7003 && var0 != 7013 && var0 != 7023) {
					if (var0 != 7006 && var0 != 7007 && var0 != 7016 && var0 != 7017 && var0 != 7026 && var0 != 7027) {
						if (var0 != 7008 && var0 != 7018 && var0 != 7028) {
							if (var0 != 7031 && var0 != 7032) {
								if (var0 == 7033) {
									--Interpreter.Interpreter_stringStackSize;
									return 1;
								} else if (var0 != 7036 && var0 != 7037) {
									if (var0 == 7038) {
										--class16.Interpreter_intStackSize;
										return 1;
									} else if (var0 != 7004 && var0 != 7009 && var0 != 7014 && var0 != 7019 && var0 != 7024 && var0 != 7029 && var0 != 7034 && var0 != 7039) {
										return 2;
									} else {
										--class16.Interpreter_intStackSize;
										return 1;
									}
								} else {
									class16.Interpreter_intStackSize -= 2;
									return 1;
								}
							} else {
								--Interpreter.Interpreter_stringStackSize;
								--class16.Interpreter_intStackSize;
								return 1;
							}
						} else {
							--class16.Interpreter_intStackSize;
							return 1;
						}
					} else {
						class16.Interpreter_intStackSize -= 2;
						return 1;
					}
				} else {
					class16.Interpreter_intStackSize -= 2;
					return 1;
				}
			} else {
				class16.Interpreter_intStackSize -= 3;
				return 1;
			}
		} else {
			class16.Interpreter_intStackSize -= 5;
			return 1;
		}
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		signature = "(Lhu;IIB)V",
		garbageValue = "1"
	)
	static final void method212(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) {
			SpriteMask.insertMenuItemNoShift(var0.buttonText, "", 24, 0, 0, var0.id);
		}

		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			var3 = class11.method199(var0);
			if (var3 != null) {
				SpriteMask.insertMenuItemNoShift(var3, DefaultsGroup.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id);
			}
		}

		if (var0.buttonType == 3) {
			SpriteMask.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			SpriteMask.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			SpriteMask.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			SpriteMask.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		int var4;
		int var6;
		int var7;
		int var15;
		if (var0.type == 2) {
			var15 = 0;

			for (var4 = 0; var4 < var0.height; ++var4) {
				for (int var5 = 0; var5 < var0.width; ++var5) {
					var6 = (var0.paddingX + 32) * var5;
					var7 = (var0.paddingY + 32) * var4;
					if (var15 < 20) {
						var6 += var0.inventoryXOffsets[var15];
						var7 += var0.inventoryYOffsets[var15];
					}

					if (var1 >= var6 && var2 >= var7 && var1 < var6 + 32 && var2 < var7 + 32) {
						Client.dragItemSlotDestination = var15;
						ScriptFrame.field579 = var0;
						if (var0.itemIds[var15] > 0) {
							ItemComposition var8 = class23.ItemDefinition_get(var0.itemIds[var15] - 1);
							if (Client.isItemSelected == 1 && class221.method4200(DirectByteArrayCopier.getWidgetClickMask(var0))) {
								if (var0.id != UserComparator6.selectedItemWidget || var15 != class208.selectedItemSlot) {
									SpriteMask.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + DefaultsGroup.colorStartTag(16748608) + var8.name, 31, var8.id, var15, var0.id);
								}
							} else if (Client.isSpellSelected && class221.method4200(DirectByteArrayCopier.getWidgetClickMask(var0))) {
								if ((UserComparator10.selectedSpellFlags & 16) == 16) {
									SpriteMask.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + DefaultsGroup.colorStartTag(16748608) + var8.name, 32, var8.id, var15, var0.id);
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

								if (class221.method4200(DirectByteArrayCopier.getWidgetClickMask(var0))) {
									for (int var21 = 4; var21 >= 3; --var21) {
										if (var10 != var21) {
											World.addWidgetItemMenuItem(var0, var8, var15, var21, false);
										}
									}
								}

								int var12 = DirectByteArrayCopier.getWidgetClickMask(var0);
								var11 = (var12 >> 31 & 1) != 0;
								if (var11) {
									SpriteMask.insertMenuItemNoShift("Use", DefaultsGroup.colorStartTag(16748608) + var8.name, 38, var8.id, var15, var0.id);
								}

								Object var10000 = null;
								int var13;
								if (class221.method4200(DirectByteArrayCopier.getWidgetClickMask(var0))) {
									for (var13 = 2; var13 >= 0; --var13) {
										if (var10 != var13) {
											World.addWidgetItemMenuItem(var0, var8, var15, var13, false);
										}
									}

									if (var10 >= 0) {
										World.addWidgetItemMenuItem(var0, var8, var15, var10, true);
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

											SpriteMask.insertMenuItemNoShift(var9[var13], DefaultsGroup.colorStartTag(16748608) + var8.name, var14, var8.id, var15, var0.id);
										}
									}
								}

								SpriteMask.insertMenuItemNoShift("Examine", DefaultsGroup.colorStartTag(16748608) + var8.name, 1005, var8.id, var15, var0.id);
							}
						}
					}

					++var15;
				}
			}
		}

		if (var0.isIf3) {
			if (Client.isSpellSelected) {
				if (class223.method4239(DirectByteArrayCopier.getWidgetClickMask(var0)) && (UserComparator10.selectedSpellFlags & 32) == 32) {
					SpriteMask.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id);
				}
			} else {
				for (var15 = 9; var15 >= 5; --var15) {
					var6 = DirectByteArrayCopier.getWidgetClickMask(var0);
					boolean var19 = (var6 >> var15 + 1 & 1) != 0;
					String var16;
					if (!var19 && var0.onOp == null) {
						var16 = null;
					} else if (var0.actions != null && var0.actions.length > var15 && var0.actions[var15] != null && var0.actions[var15].trim().length() != 0) {
						var16 = var0.actions[var15];
					} else {
						var16 = null;
					}

					if (var16 != null) {
						SpriteMask.insertMenuItemNoShift(var16, var0.dataText, 1007, var15 + 1, var0.childIndex, var0.id);
					}
				}

				var3 = class11.method199(var0);
				if (var3 != null) {
					SpriteMask.insertMenuItemNoShift(var3, var0.dataText, 25, 0, var0.childIndex, var0.id);
				}

				for (var4 = 4; var4 >= 0; --var4) {
					var7 = DirectByteArrayCopier.getWidgetClickMask(var0);
					boolean var20 = (var7 >> var4 + 1 & 1) != 0;
					String var17;
					if (!var20 && var0.onOp == null) {
						var17 = null;
					} else if (var0.actions != null && var0.actions.length > var4 && var0.actions[var4] != null && var0.actions[var4].trim().length() != 0) {
						var17 = var0.actions[var4];
					} else {
						var17 = null;
					}

					if (var17 != null) {
						AbstractByteArrayCopier.insertMenuItem(var17, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.field2768);
					}
				}

				if (WorldMapEvent.method3267(DirectByteArrayCopier.getWidgetClickMask(var0))) {
					SpriteMask.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
				}
			}
		}

	}
}
