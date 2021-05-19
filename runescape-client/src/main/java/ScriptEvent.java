import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cp")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("h")
	@Export("args")
	Object[] args;
	@ObfuscatedName("c")
	@Export("isMouseInputEvent")
	boolean isMouseInputEvent;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -536753663
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1589642175
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1051394147
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1110784837
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1654982573
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("q")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1407639647
	)
	int field1140;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1084436757
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)V",
		garbageValue = "-2043975850"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1691988247"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lnm;ILcg;IB)V",
		garbageValue = "106"
	)
	static final void method2116(PacketBuffer var0, int var1, Player var2, int var3) {
		byte var4 = -1;
		if ((var3 & 8) != 0) {
			var2.targetIndex = var0.readUnsignedShort();
			if (var2.targetIndex == 65535) {
				var2.targetIndex = -1;
			}
		}

		int var5;
		if ((var3 & 256) != 0) {
			var2.spotAnimation = var0.method6486();
			var5 = var0.method6481();
			var2.field1224 = var5 >> 16;
			var2.field1243 = (var5 & 65535) + Client.cycle;
			var2.spotAnimationFrame = 0;
			var2.spotAnimationFrameCycle = 0;
			if (var2.field1243 > Client.cycle) {
				var2.spotAnimationFrame = -1;
			}

			if (var2.spotAnimation == 65535) {
				var2.spotAnimation = -1;
			}
		}

		int var6;
		int var8;
		int var9;
		int var12;
		if ((var3 & 16) != 0) {
			var5 = var0.method6478();
			int var7;
			int var10;
			int var15;
			if (var5 > 0) {
				for (var6 = 0; var6 < var5; ++var6) {
					var8 = -1;
					var9 = -1;
					var10 = -1;
					var7 = var0.readUShortSmart();
					if (var7 == 32767) {
						var7 = var0.readUShortSmart();
						var9 = var0.readUShortSmart();
						var8 = var0.readUShortSmart();
						var10 = var0.readUShortSmart();
					} else if (var7 != 32766) {
						var9 = var0.readUShortSmart();
					} else {
						var7 = -1;
					}

					var15 = var0.readUShortSmart();
					var2.addHitSplat(var7, var9, var8, var10, Client.cycle, var15);
				}
			}

			var6 = var0.readUnsignedByte();
			if (var6 > 0) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var0.readUShortSmart();
					var9 = var0.readUShortSmart();
					if (var9 != 32767) {
						var10 = var0.readUShortSmart();
						var15 = var0.method6477();
						var12 = var9 > 0 ? var0.method6476() : var15;
						var2.addHealthBar(var8, Client.cycle, var9, var10, var15, var12);
					} else {
						var2.removeHealthBar(var8);
					}
				}
			}
		}

		if ((var3 & 1) != 0) {
			var2.field1247 = var0.method6648();
			if (var2.pathLength == 0) {
				var2.orientation = var2.field1247;
				var2.field1247 = -1;
			}
		}

		if ((var3 & 2048) != 0) {
			Players.field1345[var1] = var0.method6480();
		}

		if ((var3 & 512) != 0) {
			for (var5 = 0; var5 < 3; ++var5) {
				var2.actions[var5] = var0.readStringCp1252NullTerminated();
			}
		}

		if ((var3 & 8192) != 0) {
			var2.field1236 = var0.method6526();
			var2.field1252 = var0.method6530();
			var2.field1251 = var0.method6530();
			var2.field1253 = var0.method6480();
			var2.field1254 = var0.readUnsignedShort() + Client.cycle;
			var2.field1237 = var0.method6486() + Client.cycle;
			var2.field1256 = var0.method6648();
			if (var2.field1186) {
				var2.field1236 += var2.tileX;
				var2.field1252 += var2.tileY;
				var2.field1251 += var2.tileX;
				var2.field1253 += var2.tileY;
				var2.pathLength = 0;
			} else {
				var2.field1236 += var2.pathX[0];
				var2.field1252 += var2.pathY[0];
				var2.field1251 += var2.pathX[0];
				var2.field1253 += var2.pathY[0];
				var2.pathLength = 1;
			}

			var2.field1215 = 0;
		}

		if ((var3 & 64) != 0) {
			var5 = var0.method6486();
			PlayerType var13 = (PlayerType)UserComparator4.findEnumerated(class249.PlayerType_values(), var0.method6478());
			boolean var17 = var0.method6476() == 1;
			var8 = var0.method6476();
			var9 = var0.offset;
			if (var2.username != null && var2.appearance != null) {
				boolean var18 = false;
				if (var13.isUser && GrandExchangeOfferUnitPriceComparator.friendSystem.isIgnored(var2.username)) {
					var18 = true;
				}

				if (!var18 && Client.field727 == 0 && !var2.isHidden) {
					Players.field1357.offset = 0;
					var0.method6499(Players.field1357.array, 0, var8);
					Players.field1357.offset = 0;
					String var11 = AbstractFont.escapeBrackets(Clock.method2592(class22.method299(Players.field1357)));
					var2.overheadText = var11.trim();
					var2.overheadTextColor = var5 >> 8;
					var2.overheadTextEffect = var5 & 255;
					var2.overheadTextCyclesRemaining = 150;
					var2.isAutoChatting = var17;
					var2.field1223 = var2 != class35.localPlayer && var13.isUser && "" != Client.field843 && var11.toLowerCase().indexOf(Client.field843) == -1;
					if (var13.isPrivileged) {
						var12 = var17 ? 91 : 1;
					} else {
						var12 = var17 ? 90 : 2;
					}

					if (var13.modIcon != -1) {
						WorldMapScaleHandler.addGameMessage(var12, class169.method3495(var13.modIcon) + var2.username.getName(), var11);
					} else {
						WorldMapScaleHandler.addGameMessage(var12, var2.username.getName(), var11);
					}
				}
			}

			var0.offset = var9 + var8;
		}

		if ((var3 & 2) != 0) {
			var5 = var0.method6476();
			byte[] var19 = new byte[var5];
			Buffer var14 = new Buffer(var19);
			var0.method6499(var19, 0, var5);
			Players.field1346[var1] = var14;
			var2.read(var14);
		}

		if ((var3 & 4) != 0) {
			var5 = var0.method6620();
			if (var5 == 65535) {
				var5 = -1;
			}

			var6 = var0.method6476();
			class69.performPlayerAnimation(var2, var5, var6);
		}

		if ((var3 & 4096) != 0) {
			var4 = var0.method6530();
		}

		if ((var3 & 32) != 0) {
			var2.overheadText = var0.readStringCp1252NullTerminated();
			if (var2.overheadText.charAt(0) == '~') {
				var2.overheadText = var2.overheadText.substring(1);
				WorldMapScaleHandler.addGameMessage(2, var2.username.getName(), var2.overheadText);
			} else if (var2 == class35.localPlayer) {
				WorldMapScaleHandler.addGameMessage(2, var2.username.getName(), var2.overheadText);
			}

			var2.isAutoChatting = false;
			var2.overheadTextColor = 0;
			var2.overheadTextEffect = 0;
			var2.overheadTextCyclesRemaining = 150;
		}

		if (var2.field1186) {
			if (var4 == 127) {
				var2.resetPath(var2.tileX, var2.tileY);
			} else {
				byte var16;
				if (var4 != -1) {
					var16 = var4;
				} else {
					var16 = Players.field1345[var1];
				}

				var2.method2140(var2.tileX, var2.tileY, var16);
			}
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZS)I",
		garbageValue = "-4573"
	)
	static int method2120(int var0, Script var1, boolean var2) {
		boolean var3 = true;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = DevicePcmPlayerProvider.getWidget(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]);
			var3 = false;
		} else {
			var4 = var2 ? class308.scriptDotWidget : class24.scriptActiveWidget;
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) {
			var11 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] - 1;
			if (var11 >= 0 && var11 <= 9) {
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]);
				return 1;
			} else {
				--class13.Interpreter_stringStackSize;
				return 1;
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) {
				WorldMapCacheName.Interpreter_intStackSize -= 2;
				var11 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
				var4.parent = PacketWriter.getWidgetChild(var11, var6);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) {
				var4.isScrollBar = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) {
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) {
				var4.dragThreshold = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) {
				var4.dataText = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) {
				var4.spellActionName = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) {
				var4.actions = null;
				return 1;
			} else if (var0 == 1308) {
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == 1309) {
				--WorldMapCacheName.Interpreter_intStackSize;
				return 1;
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) {
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) {
						WorldMapCacheName.Interpreter_intStackSize -= 2;
						var5 = 10;
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]};
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]};
						ServerPacket.Widget_setKey(var4, var5, var8, var9);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) {
						WorldMapCacheName.Interpreter_intStackSize -= 3;
						var11 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize] - 1;
						var6 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
						var7 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2];
						if (var11 >= 0 && var11 <= 9) {
							LoginPacket.Widget_setKeyRate(var4, var11, var6, var7);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) {
						var5 = 10;
						var6 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
						var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
						LoginPacket.Widget_setKeyRate(var4, var5, var6, var7);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) {
						--WorldMapCacheName.Interpreter_intStackSize;
						var11 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize] - 1;
						if (var11 >= 0 && var11 <= 9) {
							SoundSystem.Widget_setKeyIgnoreHeld(var4, var11);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) {
						var5 = 10;
						SoundSystem.Widget_setKeyIgnoreHeld(var4, var5);
						return 1;
					} else {
						return 2;
					}
				} else {
					byte[] var10 = null;
					var8 = null;
					if (var3) {
						WorldMapCacheName.Interpreter_intStackSize -= 10;

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + WorldMapCacheName.Interpreter_intStackSize] >= 0; var7 += 2) {
						}

						if (var7 > 0) {
							var10 = new byte[var7 / 2];
							var8 = new byte[var7 / 2];

							for (var7 -= 2; var7 >= 0; var7 -= 2) {
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + WorldMapCacheName.Interpreter_intStackSize];
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + WorldMapCacheName.Interpreter_intStackSize + 1];
							}
						}
					} else {
						WorldMapCacheName.Interpreter_intStackSize -= 2;
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]};
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]};
					}

					var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] - 1;
					if (var7 >= 0 && var7 <= 9) {
						ServerPacket.Widget_setKey(var4, var7, var10, var8);
						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1097710894"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			InterfaceParent.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		long var6 = -1L;
		int var8 = 0;

		while (true) {
			int var10 = ViewportMouse.ViewportMouse_entityCount;
			if (var8 >= var10) {
				if (var4 != -1L) {
					var8 = (int)(var4 >>> 0 & 127L);
					var10 = (int)(var4 >>> 7 & 127L);
					Player var12 = Client.players[Client.combatTargetPlayerIndex];
					FontName.addPlayerToMenu(var12, Client.combatTargetPlayerIndex, var8, var10);
				}

				return;
			}

			long var26 = ViewportMouse.ViewportMouse_entityTags[var8];
			if (var6 != var26) {
				label326: {
					var6 = var26;
					int var15 = InterfaceParent.method2111(var8);
					int var16 = MouseHandler.method688(var8);
					int var17 = VarbitComposition.method2813(var8);
					int var18 = class6.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var8]);
					int var19 = var18;
					if (var17 == 2 && class5.scene.getObjectFlags(ParamComposition.Client_plane, var15, var16, var26) >= 0) {
						ObjectComposition var20 = AttackOption.getObjectDefinition(var18);
						if (var20.transforms != null) {
							var20 = var20.transform();
						}

						if (var20 == null) {
							break label326;
						}

						if (Client.isItemSelected == 1) {
							InterfaceParent.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + HorizontalAlignment.colorStartTag(65535) + var20.name, 1, var18, var15, var16);
						} else if (Client.isSpellSelected) {
							if ((GrandExchangeOfferUnitPriceComparator.selectedSpellFlags & 4) == 4) {
								InterfaceParent.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + HorizontalAlignment.colorStartTag(65535) + var20.name, 2, var18, var15, var16);
							}
						} else {
							String[] var21 = var20.actions;
							if (var21 != null) {
								for (int var22 = 4; var22 >= 0; --var22) {
									if (var21[var22] != null) {
										short var23 = 0;
										if (var22 == 0) {
											var23 = 3;
										}

										if (var22 == 1) {
											var23 = 4;
										}

										if (var22 == 2) {
											var23 = 5;
										}

										if (var22 == 3) {
											var23 = 6;
										}

										if (var22 == 4) {
											var23 = 1001;
										}

										InterfaceParent.insertMenuItemNoShift(var21[var22], HorizontalAlignment.colorStartTag(65535) + var20.name, var23, var19, var15, var16);
									}
								}
							}

							InterfaceParent.insertMenuItemNoShift("Examine", HorizontalAlignment.colorStartTag(65535) + var20.name, 1002, var20.id, var15, var16);
						}
					}

					Player var24;
					int var28;
					NPC var29;
					int var36;
					int[] var37;
					if (var17 == 1) {
						NPC var32 = Client.npcs[var19];
						if (var32 == null) {
							break label326;
						}

						if (var32.definition.size == 1 && (var32.x & 127) == 64 && (var32.y & 127) == 64) {
							for (var28 = 0; var28 < Client.npcCount; ++var28) {
								var29 = Client.npcs[Client.npcIndices[var28]];
								if (var29 != null && var29 != var32 && var29.definition.size == 1 && var29.x == var32.x && var32.y == var29.y) {
									Script.addNpcToMenu(var29.definition, Client.npcIndices[var28], var15, var16);
								}
							}

							var28 = Players.Players_count;
							var37 = Players.Players_indices;

							for (var36 = 0; var36 < var28; ++var36) {
								var24 = Client.players[var37[var36]];
								if (var24 != null && var24.x == var32.x && var32.y == var24.y) {
									FontName.addPlayerToMenu(var24, var37[var36], var15, var16);
								}
							}
						}

						Script.addNpcToMenu(var32.definition, var19, var15, var16);
					}

					if (var17 == 0) {
						Player var33 = Client.players[var19];
						if (var33 == null) {
							break label326;
						}

						if ((var33.x & 127) == 64 && (var33.y & 127) == 64) {
							for (var28 = 0; var28 < Client.npcCount; ++var28) {
								var29 = Client.npcs[Client.npcIndices[var28]];
								if (var29 != null && var29.definition.size == 1 && var33.x == var29.x && var33.y == var29.y) {
									Script.addNpcToMenu(var29.definition, Client.npcIndices[var28], var15, var16);
								}
							}

							var28 = Players.Players_count;
							var37 = Players.Players_indices;

							for (var36 = 0; var36 < var28; ++var36) {
								var24 = Client.players[var37[var36]];
								if (var24 != null && var33 != var24 && var33.x == var24.x && var24.y == var33.y) {
									FontName.addPlayerToMenu(var24, var37[var36], var15, var16);
								}
							}
						}

						if (var19 != Client.combatTargetPlayerIndex) {
							FontName.addPlayerToMenu(var33, var19, var15, var16);
						} else {
							var4 = var26;
						}
					}

					if (var17 == 3) {
						NodeDeque var35 = Client.groundItems[ParamComposition.Client_plane][var15][var16];
						if (var35 != null) {
							for (TileItem var34 = (TileItem)var35.first(); var34 != null; var34 = (TileItem)var35.next()) {
								ItemComposition var38 = Strings.ItemDefinition_get(var34.id);
								if (Client.isItemSelected == 1) {
									InterfaceParent.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + HorizontalAlignment.colorStartTag(16748608) + var38.name, 16, var34.id, var15, var16);
								} else if (Client.isSpellSelected) {
									if ((GrandExchangeOfferUnitPriceComparator.selectedSpellFlags & 1) == 1) {
										InterfaceParent.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + HorizontalAlignment.colorStartTag(16748608) + var38.name, 17, var34.id, var15, var16);
									}
								} else {
									String[] var30 = var38.groundActions;

									for (int var31 = 4; var31 >= 0; --var31) {
										if (var30 != null && var30[var31] != null) {
											byte var25 = 0;
											if (var31 == 0) {
												var25 = 18;
											}

											if (var31 == 1) {
												var25 = 19;
											}

											if (var31 == 2) {
												var25 = 20;
											}

											if (var31 == 3) {
												var25 = 21;
											}

											if (var31 == 4) {
												var25 = 22;
											}

											InterfaceParent.insertMenuItemNoShift(var30[var31], HorizontalAlignment.colorStartTag(16748608) + var38.name, var25, var34.id, var15, var16);
										} else if (var31 == 2) {
											InterfaceParent.insertMenuItemNoShift("Take", HorizontalAlignment.colorStartTag(16748608) + var38.name, 20, var34.id, var15, var16);
										}
									}

									InterfaceParent.insertMenuItemNoShift("Examine", HorizontalAlignment.colorStartTag(16748608) + var38.name, 1004, var34.id, var15, var16);
								}
							}
						}
					}
				}
			}

			++var8;
		}
	}
}
