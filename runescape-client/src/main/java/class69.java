import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("br")
public class class69 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lle;"
	)
	static IndexedSprite field583;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Ldd;"
	)
	@Export("pcmPlayerProvider")
	public static PlayerProvider pcmPlayerProvider;

	@ObfuscatedName("f")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; 0L != var3; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) {
					long var6 = var0;
					var0 /= 37L;
					var8 = class299.base37Table[(int)(var6 - 37L * var0)];
					if (var8 == '_') {
						int var9 = var5.length() - 1;
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
						var8 = 160;
					}
				}

				var5.reverse();
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
				return var5.toString();
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(ILco;ZI)I",
		garbageValue = "-2072046578"
	)
	static int method1266(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = UserComparator4.getWidget(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? MouseRecorder.field621 : Interpreter.field1122;
		}

		GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3);
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) {
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
				var3.modelType = 2;
				var3.modelId = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
				var3.modelType = 3;
				var3.modelId = PlayerType.localPlayer.appearance.getChatHeadId();
				return 1;
			} else {
				return 2;
			}
		} else {
			MilliClock.Interpreter_intStackSize -= 2;
			int var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
			int var5 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
			var3.itemId = var4;
			var3.itemQuantity = var5;
			ItemComposition var6 = AbstractWorldMapData.ItemDefinition_get(var4);
			var3.modelAngleX = var6.xan2d;
			var3.modelAngleY = var6.yan2d;
			var3.modelAngleZ = var6.zan2d;
			var3.modelOffsetX = var6.offsetX2d;
			var3.modelOffsetY = var6.offsetY2d;
			var3.modelZoom = var6.zoom2d;
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.isStackable) {
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2;
			}

			if (var3.field2678 > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.field2678;
			} else if (var3.rawWidth > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1;
		}
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "319100634"
	)
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) {
			Widget var0 = ItemContainer.getWidgetChild(class307.selectedSpellWidget, Client.selectedSpellChildIndex);
			if (var0 != null && var0.onTargetLeave != null) {
				ScriptEvent var1 = new ScriptEvent();
				var1.widget = var0;
				var1.args = var0.onTargetLeave;
				Renderable.runScriptEvent(var1);
			}

			Client.isSpellSelected = false;
			GrandExchangeOfferOwnWorldComparator.invalidateWidget(var0);
		}
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		signature = "([Lht;IIIIIIIS)V",
		garbageValue = "482"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			Widget var9 = var0[var8];
			if (var9 != null && var9.parentId == var1 && (!var9.isIf3 || var9.type == 0 || var9.hasListener || WorldMapData_0.getWidgetClickMask(var9) != 0 || var9 == Client.clickedWidgetParent || var9.contentType == 1338)) {
				if (var9.isIf3) {
					if (VertexNormal.isComponentHidden(var9)) {
						continue;
					}
				} else if (var9.type == 0 && var9 != GrandExchangeEvent.mousedOverWidgetIf1 && VertexNormal.isComponentHidden(var9)) {
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
					Client.field705 = true;
					Client.field931 = var10;
					Client.field701 = var11;
				}

				boolean var32 = false;
				if (var9.field2667) {
					switch(Client.field843) {
					case 0:
						var32 = true;
					case 1:
					default:
						break;
					case 2:
						if (Client.field844 == var9.id >>> 16) {
							var32 = true;
						}
						break;
					case 3:
						if (var9.id == Client.field844) {
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

								if (GrandExchangeEvent.widgetDragDuration == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}

								if (!Client.isMenuOpen) {
									WorldMapSection2.addCancelMenuEntry();
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
							KeyHandler.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) {
						class9.checkIfMinimapClicked(var9, var10, var11);
					} else {
						if (var9.contentType == 1400) {
							KeyHandler.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var33, var10, var11, var9.width, var9.height);
						}

						if (!Client.isMenuOpen && var33) {
							if (var9.contentType == 1400) {
								KeyHandler.worldMap.addElementMenuOptions(var10, var11, var9.width, var9.height, var17, var18);
							} else {
								class238.method4268(var9, var17 - var10, var18 - var11);
							}
						}

						boolean var21;
						int var23;
						if (var32) {
							for (int var20 = 0; var20 < var9.field2668.length; ++var20) {
								var21 = false;
								boolean var22 = false;
								if (!var21 && var9.field2668[var20] != null) {
									for (var23 = 0; var23 < var9.field2668[var20].length; ++var23) {
										boolean var24 = false;
										if (var9.field2594 != null) {
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field2668[var20][var23]];
										}

										if (TileItem.method2235(var9.field2668[var20][var23]) || var24) {
											var21 = true;
											if (var9.field2594 != null && var9.field2594[var20] > Client.cycle) {
												break;
											}

											byte var25 = var9.field2649[var20][var23];
											if (var25 == 0 || ((var25 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var25 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var25 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var25 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) {
												var22 = true;
												break;
											}
										}
									}
								}

								if (var22) {
									if (var20 < 10) {
										Messages.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) {
										Widget_runOnTargetLeave();
										class3.selectSpell(var9.id, var9.childIndex, JagexCache.method3625(WorldMapData_0.getWidgetClickMask(var9)), var9.itemId);
										Client.selectedSpellActionName = PendingSpawn.method1843(var9);
										if (Client.selectedSpellActionName == null) {
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + Client.colorStartTag(16777215);
									}

									var23 = var9.field2670[var20];
									if (var9.field2594 == null) {
										var9.field2594 = new int[var9.field2668.length];
									}

									if (var9.field2671 == null) {
										var9.field2671 = new int[var9.field2668.length];
									}

									if (var23 != 0) {
										if (var9.field2594[var20] == 0) {
											var9.field2594[var20] = var23 + Client.cycle + var9.field2671[var20];
										} else {
											var9.field2594[var20] = var23 + Client.cycle;
										}
									} else {
										var9.field2594[var20] = Integer.MAX_VALUE;
									}
								}

								if (!var21 && var9.field2594 != null) {
									var9.field2594[var20] = 0;
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
							if ((MouseHandler.MouseHandler_currentButton == 1 || !MusicPatchNode.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var33) {
								var34 = true;
							}

							var21 = false;
							if ((MouseHandler.MouseHandler_lastButton == 1 || !MusicPatchNode.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) {
								var21 = true;
							}

							if (var21) {
								class228.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var10, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.contentType == 1400) {
								KeyHandler.worldMap.method6456(var17, var18, var33 & var34, var33 & var21);
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var33 && MusicPatch.method4039(WorldMapData_0.getWidgetClickMask(var9))) {
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) {
								Client.field859 = true;
								Client.field860 = var10;
								Client.field861 = var11;
							}

							if (var9.hasListener) {
								ScriptEvent var27;
								if (var33 && Client.mouseWheelRotation != 0 && var9.onScroll != null) {
									var27 = new ScriptEvent();
									var27.isMouseInputEvent = true;
									var27.widget = var9;
									var27.mouseY = Client.mouseWheelRotation;
									var27.args = var9.onScroll;
									Client.scriptEvents.addFirst(var27);
								}

								if (Client.clickedWidget != null || GameBuild.dragInventoryWidget != null || Client.isMenuOpen) {
									var21 = false;
									var34 = false;
									var33 = false;
								}

								if (!var9.isClicked && var21) {
									var9.isClicked = true;
									if (var9.onClick != null) {
										var27 = new ScriptEvent();
										var27.isMouseInputEvent = true;
										var27.widget = var9;
										var27.mouseX = MouseHandler.MouseHandler_lastPressedX - var10;
										var27.mouseY = MouseHandler.MouseHandler_lastPressedY - var11;
										var27.args = var9.onClick;
										Client.scriptEvents.addFirst(var27);
									}
								}

								if (var9.isClicked && var34 && var9.onClickRepeat != null) {
									var27 = new ScriptEvent();
									var27.isMouseInputEvent = true;
									var27.widget = var9;
									var27.mouseX = MouseHandler.MouseHandler_x - var10;
									var27.mouseY = MouseHandler.MouseHandler_y - var11;
									var27.args = var9.onClickRepeat;
									Client.scriptEvents.addFirst(var27);
								}

								if (var9.isClicked && !var34) {
									var9.isClicked = false;
									if (var9.onRelease != null) {
										var27 = new ScriptEvent();
										var27.isMouseInputEvent = true;
										var27.widget = var9;
										var27.mouseX = MouseHandler.MouseHandler_x - var10;
										var27.mouseY = MouseHandler.MouseHandler_y - var11;
										var27.args = var9.onRelease;
										Client.field939.addFirst(var27);
									}
								}

								if (var34 && var9.onHold != null) {
									var27 = new ScriptEvent();
									var27.isMouseInputEvent = true;
									var27.widget = var9;
									var27.mouseX = MouseHandler.MouseHandler_x - var10;
									var27.mouseY = MouseHandler.MouseHandler_y - var11;
									var27.args = var9.onHold;
									Client.scriptEvents.addFirst(var27);
								}

								if (!var9.containsMouse && var33) {
									var9.containsMouse = true;
									if (var9.onMouseOver != null) {
										var27 = new ScriptEvent();
										var27.isMouseInputEvent = true;
										var27.widget = var9;
										var27.mouseX = MouseHandler.MouseHandler_x - var10;
										var27.mouseY = MouseHandler.MouseHandler_y - var11;
										var27.args = var9.onMouseOver;
										Client.scriptEvents.addFirst(var27);
									}
								}

								if (var9.containsMouse && var33 && var9.onMouseRepeat != null) {
									var27 = new ScriptEvent();
									var27.isMouseInputEvent = true;
									var27.widget = var9;
									var27.mouseX = MouseHandler.MouseHandler_x - var10;
									var27.mouseY = MouseHandler.MouseHandler_y - var11;
									var27.args = var9.onMouseRepeat;
									Client.scriptEvents.addFirst(var27);
								}

								if (var9.containsMouse && !var33) {
									var9.containsMouse = false;
									if (var9.onMouseLeave != null) {
										var27 = new ScriptEvent();
										var27.isMouseInputEvent = true;
										var27.widget = var9;
										var27.mouseX = MouseHandler.MouseHandler_x - var10;
										var27.mouseY = MouseHandler.MouseHandler_y - var11;
										var27.args = var9.onMouseLeave;
										Client.field939.addFirst(var27);
									}
								}

								if (var9.onTimer != null) {
									var27 = new ScriptEvent();
									var27.widget = var9;
									var27.args = var9.onTimer;
									Client.field881.addFirst(var27);
								}

								ScriptEvent var28;
								int var35;
								int var36;
								if (var9.onVarTransmit != null && Client.field868 > var9.field2727) {
									if (var9.varTransmitTriggers != null && Client.field868 - var9.field2727 <= 32) {
										label884:
										for (var35 = var9.field2727; var35 < Client.field868; ++var35) {
											var23 = Client.field867[var35 & 31];

											for (var36 = 0; var36 < var9.varTransmitTriggers.length; ++var36) {
												if (var23 == var9.varTransmitTriggers[var36]) {
													var28 = new ScriptEvent();
													var28.widget = var9;
													var28.args = var9.onVarTransmit;
													Client.scriptEvents.addFirst(var28);
													break label884;
												}
											}
										}
									} else {
										var27 = new ScriptEvent();
										var27.widget = var9;
										var27.args = var9.onVarTransmit;
										Client.scriptEvents.addFirst(var27);
									}

									var9.field2727 = Client.field868;
								}

								if (var9.onInvTransmit != null && Client.field941 > var9.field2728) {
									if (var9.invTransmitTriggers != null && Client.field941 - var9.field2728 <= 32) {
										label860:
										for (var35 = var9.field2728; var35 < Client.field941; ++var35) {
											var23 = Client.changedItemContainers[var35 & 31];

											for (var36 = 0; var36 < var9.invTransmitTriggers.length; ++var36) {
												if (var23 == var9.invTransmitTriggers[var36]) {
													var28 = new ScriptEvent();
													var28.widget = var9;
													var28.args = var9.onInvTransmit;
													Client.scriptEvents.addFirst(var28);
													break label860;
												}
											}
										}
									} else {
										var27 = new ScriptEvent();
										var27.widget = var9;
										var27.args = var9.onInvTransmit;
										Client.scriptEvents.addFirst(var27);
									}

									var9.field2728 = Client.field941;
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field2729) {
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field2729 <= 32) {
										label836:
										for (var35 = var9.field2729; var35 < Client.changedSkillsCount; ++var35) {
											var23 = Client.changedSkills[var35 & 31];

											for (var36 = 0; var36 < var9.statTransmitTriggers.length; ++var36) {
												if (var23 == var9.statTransmitTriggers[var36]) {
													var28 = new ScriptEvent();
													var28.widget = var9;
													var28.args = var9.onStatTransmit;
													Client.scriptEvents.addFirst(var28);
													break label836;
												}
											}
										}
									} else {
										var27 = new ScriptEvent();
										var27.widget = var9;
										var27.args = var9.onStatTransmit;
										Client.scriptEvents.addFirst(var27);
									}

									var9.field2729 = Client.changedSkillsCount;
								}

								if (Client.chatCycle > var9.field2726 && var9.onChatTransmit != null) {
									var27 = new ScriptEvent();
									var27.widget = var9;
									var27.args = var9.onChatTransmit;
									Client.scriptEvents.addFirst(var27);
								}

								if (Client.field874 > var9.field2726 && var9.onFriendTransmit != null) {
									var27 = new ScriptEvent();
									var27.widget = var9;
									var27.args = var9.onFriendTransmit;
									Client.scriptEvents.addFirst(var27);
								}

								if (Client.field875 > var9.field2726 && var9.onClanTransmit != null) {
									var27 = new ScriptEvent();
									var27.widget = var9;
									var27.args = var9.onClanTransmit;
									Client.scriptEvents.addFirst(var27);
								}

								if (Client.field885 > var9.field2726 && var9.onStockTransmit != null) {
									var27 = new ScriptEvent();
									var27.widget = var9;
									var27.args = var9.onStockTransmit;
									Client.scriptEvents.addFirst(var27);
								}

								if (Client.field852 > var9.field2726 && var9.field2669 != null) {
									var27 = new ScriptEvent();
									var27.widget = var9;
									var27.args = var9.field2669;
									Client.scriptEvents.addFirst(var27);
								}

								if (Client.field878 > var9.field2726 && var9.onMiscTransmit != null) {
									var27 = new ScriptEvent();
									var27.widget = var9;
									var27.args = var9.onMiscTransmit;
									Client.scriptEvents.addFirst(var27);
								}

								var9.field2726 = Client.cycleCntr;
								if (var9.onKey != null) {
									for (var35 = 0; var35 < Client.field902; ++var35) {
										ScriptEvent var29 = new ScriptEvent();
										var29.widget = var9;
										var29.keyTyped = Client.field904[var35];
										var29.keyPressed = Client.field903[var35];
										var29.args = var9.onKey;
										Client.scriptEvents.addFirst(var29);
									}
								}
							}
						}

						if (!var9.isIf3) {
							if (Client.clickedWidget != null || GameBuild.dragInventoryWidget != null || Client.isMenuOpen) {
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								if (var9.mouseOverRedirect >= 0) {
									GrandExchangeEvent.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									GrandExchangeEvent.mousedOverWidgetIf1 = var9;
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								GrandExchangeOfferOwnWorldComparator.field677 = var9;
							}

							if (var9.scrollHeight > var9.height) {
								PacketBufferNode.method3759(var9, var10 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) {
							updateInterface(var0, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY);
							if (var9.children != null) {
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)var9.id);
							if (var30 != null) {
								if (var30.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) {
									for (ScriptEvent var31 = (ScriptEvent)Client.scriptEvents.last(); var31 != null; var31 = (ScriptEvent)Client.scriptEvents.previous()) {
										if (var31.isMouseInputEvent) {
											var31.remove();
											var31.widget.containsMouse = false;
										}
									}

									if (GrandExchangeEvent.widgetDragDuration == 0) {
										Client.clickedWidget = null;
										Client.clickedWidgetParent = null;
									}

									if (!Client.isMenuOpen) {
										WorldMapSection2.addCancelMenuEntry();
									}
								}

								DynamicObject.updateRootInterface(var30.group, var12, var13, var14, var15, var10, var11);
							}
						}
					}
				}
			}
		}

	}
}
