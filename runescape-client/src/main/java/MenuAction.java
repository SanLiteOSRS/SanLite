import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1773344917
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 2064070335
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 519860607
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1059226483
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("j")
	@Export("action")
	String action;

	MenuAction() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILnt;S)Let;",
		garbageValue = "256"
	)
	public static class136 method2027(int var0, Buffer var1) {
		int var2 = var1.readUnsignedByte();
		boolean var3 = (var2 & 1) != 0;
		boolean var4 = (var2 & 2) != 0;
		class136 var5 = new class136(var0);
		int var6;
		int[] var7;
		boolean var8;
		int var9;
		short var10;
		if (var3) {
			var6 = var1.readUnsignedByte();
			var7 = new int[]{var6 & 15, var6 >> 4 & 15};
			var8 = var5.field1542 != null && var7.length == var5.field1542.length;

			for (var9 = 0; var9 < 2; ++var9) {
				if (var7[var9] != 15) {
					var10 = (short)var1.readUnsignedShort();
					if (var8) {
						var5.field1542[var7[var9]] = var10;
					}
				}
			}
		}

		if (var4) {
			var6 = var1.readUnsignedByte();
			var7 = new int[]{var6 & 15, var6 >> 4 & 15};
			var8 = var5.field1541 != null && var7.length == var5.field1541.length;

			for (var9 = 0; var9 < 2; ++var9) {
				if (var7[var9] != 15) {
					var10 = (short)var1.readUnsignedShort();
					if (var8) {
						var5.field1541[var7[var9]] = var10;
					}
				}
			}
		}

		return var5;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljf;IIIBZI)V",
		garbageValue = "-1474960108"
	)
	@Export("requestNetFile")
	static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var6 = (long)((var1 << 16) + var2);
		NetFileRequest var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.get(var6);
		if (var8 == null) {
			var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var6);
			if (var8 == null) {
				var8 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var6);
				if (var8 != null) {
					if (var5) {
						var8.removeDual();
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6);
						--NetCache.NetCache_pendingWritesCount;
						++NetCache.NetCache_pendingPriorityWritesCount;
					}

				} else {
					if (!var5) {
						var8 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var6);
						if (var8 != null) {
							return;
						}
					}

					var8 = new NetFileRequest();
					var8.archive = var0;
					var8.crc = var3;
					var8.padding = var4;
					if (var5) {
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6);
						++NetCache.NetCache_pendingPriorityWritesCount;
					} else {
						NetCache.NetCache_pendingWritesQueue.addFirst(var8);
						NetCache.NetCache_pendingWrites.put(var8, var6);
						++NetCache.NetCache_pendingWritesCount;
					}

				}
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1466042172"
	)
	public static void method2028() {
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "871195420"
	)
	static final String method2026(int var0) {
		if (var0 < 100000) {
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>";
		}
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "([Liv;IIIIIIII)V",
		garbageValue = "1325285933"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			Widget var9 = var0[var8];
			if (var9 != null && var9.parentId == var1 && (!var9.isIf3 || var9.type == 0 || var9.hasListener || class22.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent || var9.contentType == 1338)) {
				if (var9.isIf3) {
					if (class35.isComponentHidden(var9)) {
						continue;
					}
				} else if (var9.type == 0 && var9 != MusicPatchNode.mousedOverWidgetIf1 && class35.isComponentHidden(var9)) {
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
					Client.field731 = true;
					Client.field804 = var10;
					Client.field805 = var11;
				}

				boolean var33 = false;
				if (var9.field3034) {
					switch(Client.field784) {
					case 0:
						var33 = true;
					case 1:
					default:
						break;
					case 2:
						if (Client.field694 == var9.id >>> 16) {
							var33 = true;
						}
						break;
					case 3:
						if (var9.id == Client.field694) {
							var33 = true;
						}
					}
				}

				if (var33 || !var9.isIf3 || var12 < var14 && var13 < var15) {
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

								if (UserComparator7.widgetDragDuration == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}

								if (!Client.isMenuOpen) {
									Script.addCancelMenuEntry();
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

					boolean var34 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15;
					if (var9.contentType == 1337) {
						if (!Client.isLoading && !Client.isMenuOpen && var34) {
							class391.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) {
						AbstractWorldMapIcon.checkIfMinimapClicked(var9, var10, var11);
					} else {
						if (var9.contentType == 1400) {
							class80.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var34, var10, var11, var9.width, var9.height);
						}

						if (!Client.isMenuOpen && var34) {
							if (var9.contentType == 1400) {
								class80.worldMap.addElementMenuOptions(var10, var11, var9.width, var9.height, var17, var18);
							} else {
								class261.Widget_addToMenu(var9, var17 - var10, var18 - var11);
							}
						}

						boolean var21;
						int var23;
						if (var33) {
							for (int var20 = 0; var20 < var9.field3035.length; ++var20) {
								var21 = false;
								boolean var27 = false;
								if (!var21 && var9.field3035[var20] != null) {
									for (var23 = 0; var23 < var9.field3035[var20].length; ++var23) {
										boolean var24 = false;
										if (var9.field3104 != null) {
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field3035[var20][var23]];
										}

										if (class22.method314(var9.field3035[var20][var23]) || var24) {
											var21 = true;
											if (var9.field3104 != null && var9.field3104[var20] > Client.cycle) {
												break;
											}

											byte var32 = var9.field3036[var20][var23];
											if (var32 == 0 || ((var32 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var32 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var32 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var32 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) {
												var27 = true;
												break;
											}
										}
									}
								}

								if (var27) {
									if (var20 < 10) {
										MouseHandler.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) {
										class20.Widget_runOnTargetLeave();
										ItemComposition.selectSpell(var9.id, var9.childIndex, ModelData0.Widget_unpackTargetMask(class22.getWidgetFlags(var9)), var9.itemId);
										Client.selectedSpellActionName = SecureRandomCallable.Widget_getSpellActionName(var9);
										if (Client.selectedSpellActionName == null) {
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + SecureRandomFuture.colorStartTag(16777215);
									}

									var23 = var9.field3037[var20];
									if (var9.field3104 == null) {
										var9.field3104 = new int[var9.field3035.length];
									}

									if (var9.field3038 == null) {
										var9.field3038 = new int[var9.field3035.length];
									}

									if (var23 != 0) {
										if (var9.field3104[var20] == 0) {
											var9.field3104[var20] = var23 + Client.cycle + var9.field3038[var20];
										} else {
											var9.field3104[var20] = var23 + Client.cycle;
										}
									} else {
										var9.field3104[var20] = Integer.MAX_VALUE;
									}
								}

								if (!var21 && var9.field3104 != null) {
									var9.field3104[var20] = 0;
								}
							}
						}

						if (var9.isIf3) {
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								var34 = true;
							} else {
								var34 = false;
							}

							boolean var35 = false;
							if ((MouseHandler.MouseHandler_currentButton == 1 || !UserComparator3.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var34) {
								var35 = true;
							}

							var21 = false;
							if ((MouseHandler.MouseHandler_lastButton == 1 || !UserComparator3.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) {
								var21 = true;
							}

							if (var21) {
								ItemLayer.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var10, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.contentType == 1400) {
								class80.worldMap.method6133(var17, var18, var34 & var35, var34 & var21);
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var34 && class5.method73(class22.getWidgetFlags(var9))) {
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) {
								Client.field821 = true;
								Client.field801 = var10;
								Client.field802 = var11;
							}

							if (var9.hasListener) {
								ScriptEvent var22;
								if (var34 && Client.mouseWheelRotation != 0 && var9.onScroll != null) {
									var22 = new ScriptEvent();
									var22.isMouseInputEvent = true;
									var22.widget = var9;
									var22.mouseY = Client.mouseWheelRotation;
									var22.args = var9.onScroll;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.clickedWidget != null || VerticalAlignment.dragInventoryWidget != null || Client.isMenuOpen) {
									var21 = false;
									var35 = false;
									var34 = false;
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

								if (var9.isClicked && var35 && var9.onClickRepeat != null) {
									var22 = new ScriptEvent();
									var22.isMouseInputEvent = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var10;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onClickRepeat;
									Client.scriptEvents.addFirst(var22);
								}

								if (var9.isClicked && !var35) {
									var9.isClicked = false;
									if (var9.onRelease != null) {
										var22 = new ScriptEvent();
										var22.isMouseInputEvent = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var10;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onRelease;
										Client.field860.addFirst(var22);
									}
								}

								if (var35 && var9.onHold != null) {
									var22 = new ScriptEvent();
									var22.isMouseInputEvent = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var10;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onHold;
									Client.scriptEvents.addFirst(var22);
								}

								if (!var9.containsMouse && var34) {
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

								if (var9.containsMouse && var34 && var9.onMouseRepeat != null) {
									var22 = new ScriptEvent();
									var22.isMouseInputEvent = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var10;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onMouseRepeat;
									Client.scriptEvents.addFirst(var22);
								}

								if (var9.containsMouse && !var34) {
									var9.containsMouse = false;
									if (var9.onMouseLeave != null) {
										var22 = new ScriptEvent();
										var22.isMouseInputEvent = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var10;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onMouseLeave;
										Client.field860.addFirst(var22);
									}
								}

								if (var9.onTimer != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onTimer;
									Client.field812.addFirst(var22);
								}

								ScriptEvent var25;
								int var36;
								int var37;
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field3089) {
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field3089 <= 32) {
										label809:
										for (var37 = var9.field3089; var37 < Client.changedVarpCount; ++var37) {
											var23 = Client.changedVarps[var37 & 31];

											for (var36 = 0; var36 < var9.varTransmitTriggers.length; ++var36) {
												if (var23 == var9.varTransmitTriggers[var36]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onVarTransmit;
													Client.scriptEvents.addFirst(var25);
													break label809;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onVarTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3089 = Client.changedVarpCount;
								}

								if (var9.onInvTransmit != null && Client.field711 > var9.field3100) {
									if (var9.invTransmitTriggers != null && Client.field711 - var9.field3100 <= 32) {
										label785:
										for (var37 = var9.field3100; var37 < Client.field711; ++var37) {
											var23 = Client.changedItemContainers[var37 & 31];

											for (var36 = 0; var36 < var9.invTransmitTriggers.length; ++var36) {
												if (var23 == var9.invTransmitTriggers[var36]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onInvTransmit;
													Client.scriptEvents.addFirst(var25);
													break label785;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onInvTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3100 = Client.field711;
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field2971) {
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field2971 <= 32) {
										label761:
										for (var37 = var9.field2971; var37 < Client.changedSkillsCount; ++var37) {
											var23 = Client.changedSkills[var37 & 31];

											for (var36 = 0; var36 < var9.statTransmitTriggers.length; ++var36) {
												if (var23 == var9.statTransmitTriggers[var36]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onStatTransmit;
													Client.scriptEvents.addFirst(var25);
													break label761;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onStatTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field2971 = Client.changedSkillsCount;
								}

								if (Client.chatCycle > var9.field3098 && var9.onChatTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onChatTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field817 > var9.field3098 && var9.onFriendTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onFriendTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field882 > var9.field3098 && var9.onClanTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onClanTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field819 > var9.field3098 && var9.field3075 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3075;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field820 > var9.field3098 && var9.field3076 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3076;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field827 > var9.field3098 && var9.onStockTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onStockTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field822 > var9.field3098 && var9.field3082 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3082;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field823 > var9.field3098 && var9.onMiscTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onMiscTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								var9.field3098 = Client.cycleCntr;
								if (var9.onKey != null) {
									for (var37 = 0; var37 < Client.field847; ++var37) {
										ScriptEvent var31 = new ScriptEvent();
										var31.widget = var9;
										var31.keyTyped = Client.field786[var37];
										var31.keyPressed = Client.field848[var37];
										var31.args = var9.onKey;
										Client.scriptEvents.addFirst(var31);
									}
								}

								ScriptEvent var30;
								int[] var38;
								if (var9.field3071 != null) {
									var38 = class171.method3615();

									for (var23 = 0; var23 < var38.length; ++var23) {
										var30 = new ScriptEvent();
										var30.widget = var9;
										var30.keyTyped = var38[var23];
										var30.args = var9.field3071;
										Client.scriptEvents.addFirst(var30);
									}
								}

								if (var9.field3000 != null) {
									var38 = Tiles.method2154();

									for (var23 = 0; var23 < var38.length; ++var23) {
										var30 = new ScriptEvent();
										var30.widget = var9;
										var30.keyTyped = var38[var23];
										var30.args = var9.field3000;
										Client.scriptEvents.addFirst(var30);
									}
								}
							}
						}

						if (!var9.isIf3) {
							if (Client.clickedWidget != null || VerticalAlignment.dragInventoryWidget != null || Client.isMenuOpen) {
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								if (var9.mouseOverRedirect >= 0) {
									MusicPatchNode.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									MusicPatchNode.mousedOverWidgetIf1 = var9;
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								class5.field42 = var9;
							}

							if (var9.scrollHeight > var9.height) {
								class18.method273(var9, var10 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
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

									if (UserComparator7.widgetDragDuration == 0) {
										Client.clickedWidget = null;
										Client.clickedWidgetParent = null;
									}

									if (!Client.isMenuOpen) {
										Script.addCancelMenuEntry();
									}
								}

								PacketWriter.updateRootInterface(var28.group, var12, var13, var14, var15, var10, var11);
							}
						}
					}
				}
			}
		}

	}
}
