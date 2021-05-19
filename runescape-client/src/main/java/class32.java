import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("av")
public final class class32 {
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1588023984"
	)
	public static void method365() {
		ObjectComposition.ObjectDefinition_cached.clear();
		ObjectComposition.ObjectDefinition_cachedModelData.clear();
		ObjectComposition.ObjectDefinition_cachedEntities.clear();
		ObjectComposition.ObjectDefinition_cachedModels.clear();
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1988985171"
	)
	static void method367() {
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) {
			addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false);
		}

	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(Lcg;ZI)V",
		garbageValue = "1577475793"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) {
			var0.isUnanimated = false;
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.movementSequence == var0.idleSequence) {
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7;
			int var3 = var0.y >> 7;
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
				long var4 = class17.calculateTag(0, 0, 0, false, var0.index);
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) {
					var0.isUnanimated = false;
					var0.tileHeight = SceneTilePaint.getTileHeight(var0.x, var0.y, ParamComposition.Client_plane);
					var0.playerCycle = Client.cycle;
					class5.scene.addNullableObject(ParamComposition.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY);
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) {
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) {
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount;
					}

					var0.tileHeight = SceneTilePaint.getTileHeight(var0.x, var0.y, ParamComposition.Client_plane);
					var0.playerCycle = Client.cycle;
					class5.scene.drawEntity(ParamComposition.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking);
				}
			}
		}

	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(Liv;Lez;IIZI)V",
		garbageValue = "-1962227486"
	)
	@Export("addWidgetItemMenuItem")
	static final void addWidgetItemMenuItem(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
		String[] var5 = var1.inventoryActions;
		byte var6 = -1;
		String var7 = null;
		if (var5 != null && var5[var3] != null) {
			if (var3 == 0) {
				var6 = 33;
			} else if (var3 == 1) {
				var6 = 34;
			} else if (var3 == 2) {
				var6 = 35;
			} else if (var3 == 3) {
				var6 = 36;
			} else {
				var6 = 37;
			}

			var7 = var5[var3];
		} else if (var3 == 4) {
			var6 = 37;
			var7 = "Drop";
		}

		if (var6 != -1 && var7 != null) {
			class311.insertMenuItem(var7, HorizontalAlignment.colorStartTag(16748608) + var1.name, var6, var1.id, var2, var0.id, var4);
		}

	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "([Liv;IIIIIIII)V",
		garbageValue = "-1124545705"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			Widget var9 = var0[var8];
			if (var9 != null && var9.parentId == var1 && (!var9.isIf3 || var9.type == 0 || var9.hasListener || class26.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent || var9.contentType == 1338)) {
				if (var9.isIf3) {
					if (class11.isComponentHidden(var9)) {
						continue;
					}
				} else if (var9.type == 0 && var9 != SpriteMask.mousedOverWidgetIf1 && class11.isComponentHidden(var9)) {
					continue;
				}

				int var10 = var9.x + var6;
				int var11 = var7 + var9.y;
				int var12;
				int var13;
				int var14;
				int var15;
				int var17;
				int var18;
				if (var9.type == 2) {
					var12 = var2;
					var13 = var3;
					var14 = var4;
					var15 = var5;
				} else {
					int var16;
					if (var9.type == 9) {
						var16 = var10;
						var17 = var11;
						var18 = var10 + var9.width;
						int var19 = var11 + var9.height;
						if (var18 < var10) {
							var16 = var18;
							var18 = var10;
						}

						if (var19 < var11) {
							var17 = var19;
							var19 = var11;
						}

						++var18;
						++var19;
						var12 = var16 > var2 ? var16 : var2;
						var13 = var17 > var3 ? var17 : var3;
						var14 = var18 < var4 ? var18 : var4;
						var15 = var19 < var5 ? var19 : var5;
					} else {
						var16 = var10 + var9.width;
						var17 = var11 + var9.height;
						var12 = var10 > var2 ? var10 : var2;
						var13 = var11 > var3 ? var11 : var3;
						var14 = var16 < var4 ? var16 : var4;
						var15 = var17 < var5 ? var17 : var5;
					}
				}

				if (var9 == Client.clickedWidget) {
					Client.field797 = true;
					Client.field871 = var10;
					Client.field798 = var11;
				}

				boolean var32 = false;
				if (var9.field2985) {
					switch(Client.field778) {
					case 0:
						var32 = true;
					case 1:
					default:
						break;
					case 2:
						if (Client.field779 == var9.id >>> 16) {
							var32 = true;
						}
						break;
					case 3:
						if (var9.id == Client.field779) {
							var32 = true;
						}
					}
				}

				if (var32 || !var9.isIf3 || var12 < var14 && var13 < var15) {
					if (var9.isIf3) {
						ScriptEvent var26;
						if (var9.noClickThrough) {
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								for (var26 = (ScriptEvent)Client.scriptEvents.last(); var26 != null; var26 = (ScriptEvent)Client.scriptEvents.previous()) {
									if (var26.isMouseInputEvent) {
										var26.remove();
										var26.widget.containsMouse = false;
									}
								}

								if (class288.widgetDragDuration == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}

								if (!Client.isMenuOpen) {
									WorldMapEvent.addCancelMenuEntry();
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
							for (var26 = (ScriptEvent)Client.scriptEvents.last(); var26 != null; var26 = (ScriptEvent)Client.scriptEvents.previous()) {
								if (var26.isMouseInputEvent && var26.widget.onScroll == var26.args) {
									var26.remove();
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x;
					var18 = MouseHandler.MouseHandler_y;
					if (MouseHandler.MouseHandler_lastButton != 0) {
						var17 = MouseHandler.MouseHandler_lastPressedX;
						var18 = MouseHandler.MouseHandler_lastPressedY;
					}

					boolean var33 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15;
					if (var9.contentType == 1337) {
						if (!Client.isLoading && !Client.isMenuOpen && var33) {
							ScriptEvent.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) {
						WorldMapCacheName.checkIfMinimapClicked(var9, var10, var11);
					} else {
						if (var9.contentType == 1400) {
							NetSocket.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var33, var10, var11, var9.width, var9.height);
						}

						if (!Client.isMenuOpen && var33) {
							if (var9.contentType == 1400) {
								NetSocket.worldMap.addElementMenuOptions(var10, var11, var9.width, var9.height, var17, var18);
							} else {
								class2.Widget_addToMenu(var9, var17 - var10, var18 - var11);
							}
						}

						boolean var21;
						int var23;
						if (var32) {
							for (int var20 = 0; var20 < var9.field3039.length; ++var20) {
								var21 = false;
								boolean var27 = false;
								if (!var21 && var9.field3039[var20] != null) {
									for (var23 = 0; var23 < var9.field3039[var20].length; ++var23) {
										boolean var24 = false;
										if (var9.field3105 != null) {
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field3039[var20][var23]];
										}

										if (Canvas.method467(var9.field3039[var20][var23]) || var24) {
											var21 = true;
											if (var9.field3105 != null && var9.field3105[var20] > Client.cycle) {
												break;
											}

											byte var31 = var9.field2987[var20][var23];
											if (var31 == 0 || ((var31 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var31 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var31 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var31 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) {
												var27 = true;
												break;
											}
										}
									}
								}

								if (var27) {
									if (var20 < 10) {
										class245.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) {
										class15.Widget_runOnTargetLeave();
										GrandExchangeOffer.selectSpell(var9.id, var9.childIndex, AttackOption.Widget_unpackTargetMask(class26.getWidgetFlags(var9)), var9.itemId);
										Client.selectedSpellActionName = UserComparator9.Widget_getSpellActionName(var9);
										if (Client.selectedSpellActionName == null) {
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + HorizontalAlignment.colorStartTag(16777215);
									}

									var23 = var9.field3070[var20];
									if (var9.field3105 == null) {
										var9.field3105 = new int[var9.field3039.length];
									}

									if (var9.field3090 == null) {
										var9.field3090 = new int[var9.field3039.length];
									}

									if (var23 != 0) {
										if (var9.field3105[var20] == 0) {
											var9.field3105[var20] = var23 + Client.cycle + var9.field3090[var20];
										} else {
											var9.field3105[var20] = var23 + Client.cycle;
										}
									} else {
										var9.field3105[var20] = Integer.MAX_VALUE;
									}
								}

								if (!var21 && var9.field3105 != null) {
									var9.field3105[var20] = 0;
								}
							}
						}

						if (var9.isIf3) {
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								var33 = true;
							} else {
								var33 = false;
							}

							boolean var34 = false;
							if ((MouseHandler.MouseHandler_currentButton == 1 || !class229.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var33) {
								var34 = true;
							}

							var21 = false;
							if ((MouseHandler.MouseHandler_lastButton == 1 || !class229.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) {
								var21 = true;
							}

							if (var21) {
								class214.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var10, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.contentType == 1400) {
								NetSocket.worldMap.method5953(var17, var18, var33 & var34, var33 & var21);
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var33 && class2.method28(class26.getWidgetFlags(var9))) {
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) {
								Client.field794 = true;
								Client.field795 = var10;
								Client.field785 = var11;
							}

							if (var9.hasListener) {
								ScriptEvent var22;
								if (var33 && Client.mouseWheelRotation != 0 && var9.onScroll != null) {
									var22 = new ScriptEvent();
									var22.isMouseInputEvent = true;
									var22.widget = var9;
									var22.mouseY = Client.mouseWheelRotation;
									var22.args = var9.onScroll;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.clickedWidget != null || class34.dragInventoryWidget != null || Client.isMenuOpen) {
									var21 = false;
									var34 = false;
									var33 = false;
								}

								if (!var9.isClicked && var21) {
									var9.isClicked = true;
									if (var9.onClick != null) {
										var22 = new ScriptEvent();
										var22.isMouseInputEvent = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var10;
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11;
										var22.args = var9.onClick;
										Client.scriptEvents.addFirst(var22);
									}
								}

								if (var9.isClicked && var34 && var9.onClickRepeat != null) {
									var22 = new ScriptEvent();
									var22.isMouseInputEvent = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var10;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onClickRepeat;
									Client.scriptEvents.addFirst(var22);
								}

								if (var9.isClicked && !var34) {
									var9.isClicked = false;
									if (var9.onRelease != null) {
										var22 = new ScriptEvent();
										var22.isMouseInputEvent = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var10;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onRelease;
										Client.field821.addFirst(var22);
									}
								}

								if (var34 && var9.onHold != null) {
									var22 = new ScriptEvent();
									var22.isMouseInputEvent = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var10;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onHold;
									Client.scriptEvents.addFirst(var22);
								}

								if (!var9.containsMouse && var33) {
									var9.containsMouse = true;
									if (var9.onMouseOver != null) {
										var22 = new ScriptEvent();
										var22.isMouseInputEvent = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var10;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onMouseOver;
										Client.scriptEvents.addFirst(var22);
									}
								}

								if (var9.containsMouse && var33 && var9.onMouseRepeat != null) {
									var22 = new ScriptEvent();
									var22.isMouseInputEvent = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var10;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onMouseRepeat;
									Client.scriptEvents.addFirst(var22);
								}

								if (var9.containsMouse && !var33) {
									var9.containsMouse = false;
									if (var9.onMouseLeave != null) {
										var22 = new ScriptEvent();
										var22.isMouseInputEvent = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var10;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onMouseLeave;
										Client.field821.addFirst(var22);
									}
								}

								if (var9.onTimer != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onTimer;
									Client.field865.addFirst(var22);
								}

								ScriptEvent var25;
								int var35;
								int var36;
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field3100) {
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field3100 <= 32) {
										label791:
										for (var36 = var9.field3100; var36 < Client.changedVarpCount; ++var36) {
											var23 = Client.changedVarps[var36 & 31];

											for (var35 = 0; var35 < var9.varTransmitTriggers.length; ++var35) {
												if (var23 == var9.varTransmitTriggers[var35]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onVarTransmit;
													Client.scriptEvents.addFirst(var25);
													break label791;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onVarTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3100 = Client.changedVarpCount;
								}

								if (var9.onInvTransmit != null && Client.field805 > var9.field3101) {
									if (var9.invTransmitTriggers != null && Client.field805 - var9.field3101 <= 32) {
										label767:
										for (var36 = var9.field3101; var36 < Client.field805; ++var36) {
											var23 = Client.changedItemContainers[var36 & 31];

											for (var35 = 0; var35 < var9.invTransmitTriggers.length; ++var35) {
												if (var23 == var9.invTransmitTriggers[var35]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onInvTransmit;
													Client.scriptEvents.addFirst(var25);
													break label767;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onInvTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3101 = Client.field805;
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field3049) {
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field3049 <= 32) {
										label743:
										for (var36 = var9.field3049; var36 < Client.changedSkillsCount; ++var36) {
											var23 = Client.changedSkills[var36 & 31];

											for (var35 = 0; var35 < var9.statTransmitTriggers.length; ++var35) {
												if (var23 == var9.statTransmitTriggers[var35]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onStatTransmit;
													Client.scriptEvents.addFirst(var25);
													break label743;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onStatTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3049 = Client.changedSkillsCount;
								}

								if (Client.chatCycle > var9.field3015 && var9.onChatTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onChatTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field801 > var9.field3015 && var9.onFriendTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onFriendTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field698 > var9.field3015 && var9.onClanTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onClanTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field822 > var9.field3015 && var9.field3076 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3076;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field814 > var9.field3015 && var9.field2974 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field2974;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field815 > var9.field3015 && var9.onStockTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onStockTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field816 > var9.field3015 && var9.field3004 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3004;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field731 > var9.field3015 && var9.onMiscTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onMiscTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								var9.field3015 = Client.cycleCntr;
								if (var9.onKey != null) {
									for (var36 = 0; var36 < Client.field842; ++var36) {
										ScriptEvent var30 = new ScriptEvent();
										var30.widget = var9;
										var30.keyTyped = Client.field844[var36];
										var30.keyPressed = Client.field746[var36];
										var30.args = var9.onKey;
										Client.scriptEvents.addFirst(var30);
									}
								}
							}
						}

						if (!var9.isIf3) {
							if (Client.clickedWidget != null || class34.dragInventoryWidget != null || Client.isMenuOpen) {
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								if (var9.mouseOverRedirect >= 0) {
									SpriteMask.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									SpriteMask.mousedOverWidgetIf1 = var9;
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								class34.field241 = var9;
							}

							if (var9.scrollHeight > var9.height) {
								SpriteMask.method4580(var9, var10 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) {
							updateInterface(var0, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY);
							if (var9.children != null) {
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var9.id);
							if (var28 != null) {
								if (var28.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) {
									for (ScriptEvent var29 = (ScriptEvent)Client.scriptEvents.last(); var29 != null; var29 = (ScriptEvent)Client.scriptEvents.previous()) {
										if (var29.isMouseInputEvent) {
											var29.remove();
											var29.widget.containsMouse = false;
										}
									}

									if (class288.widgetDragDuration == 0) {
										Client.clickedWidget = null;
										Client.clickedWidgetParent = null;
									}

									if (!Client.isMenuOpen) {
										WorldMapEvent.addCancelMenuEntry();
									}
								}

								Clock.updateRootInterface(var28.group, var12, var13, var14, var15, var10, var11);
							}
						}
					}
				}
			}
		}

	}
}
