import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1988306865
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1610249635
	)
	@Export("height")
	int height;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -422238423
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 189641591
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lfm;"
	)
	@Export("entity")
	public Renderable entity;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1450544677
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 876164639
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 691537969
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 574238181
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1114926277
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 936749737
	)
	int field2191;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -823788373
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		longValue = 1468949973913714587L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -49778541
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(IB)Ljs;",
		garbageValue = "53"
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

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		signature = "([Lhu;IIIIIIII)V",
		garbageValue = "762293873"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			Widget var9 = var0[var8];
			if (var9 != null && var9.parentId == var1 && (!var9.isIf3 || var9.type == 0 || var9.hasListener || DirectByteArrayCopier.getWidgetClickMask(var9) != 0 || var9 == Client.clickedWidgetParent || var9.contentType == 1338)) {
				if (var9.isIf3) {
					if (WorldMapArea.isComponentHidden(var9)) {
						continue;
					}
				} else if (var9.type == 0 && var9 != Varps.mousedOverWidgetIf1 && WorldMapArea.isComponentHidden(var9)) {
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
					Client.field783 = true;
					Client.field784 = var10;
					Client.field845 = var11;
				}

				boolean var32 = false;
				if (var9.field2698) {
					switch(Client.field764) {
					case 0:
						var32 = true;
					case 1:
					default:
						break;
					case 2:
						if (Client.field765 == var9.id >>> 16) {
							var32 = true;
						}
						break;
					case 3:
						if (var9.id == Client.field765) {
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

								if (class34.widgetDragDuration == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}

								if (!Client.isMenuOpen) {
									VerticalAlignment.addCancelMenuEntry();
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
							BuddyRankComparator.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) {
						class14.checkIfMinimapClicked(var9, var10, var11);
					} else {
						if (var9.contentType == 1400) {
							UserComparator4.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var33, var10, var11, var9.width, var9.height);
						}

						if (!Client.isMenuOpen && var33) {
							if (var9.contentType == 1400) {
								UserComparator4.worldMap.addElementMenuOptions(var10, var11, var9.width, var9.height, var17, var18);
							} else {
								class12.method212(var9, var17 - var10, var18 - var11);
							}
						}

						boolean var21;
						int var23;
						if (var32) {
							for (int var20 = 0; var20 < var9.field2699.length; ++var20) {
								var21 = false;
								boolean var22 = false;
								if (!var21 && var9.field2699[var20] != null) {
									for (var23 = 0; var23 < var9.field2699[var20].length; ++var23) {
										boolean var24 = false;
										if (var9.field2653 != null) {
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field2699[var20][var23]];
										}

										if (BoundaryObject.method3787(var9.field2699[var20][var23]) || var24) {
											var21 = true;
											if (var9.field2653 != null && var9.field2653[var20] > Client.cycle) {
												break;
											}

											byte var25 = var9.field2747[var20][var23];
											if (var25 == 0 || ((var25 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var25 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var25 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var25 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) {
												var22 = true;
												break;
											}
										}
									}
								}

								if (var22) {
									if (var20 < 10) {
										class376.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) {
										WorldMapID.Widget_runOnTargetLeave();
										Strings.selectSpell(var9.id, var9.childIndex, class223.method4231(DirectByteArrayCopier.getWidgetClickMask(var9)), var9.itemId);
										Client.selectedSpellActionName = class11.method199(var9);
										if (Client.selectedSpellActionName == null) {
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + DefaultsGroup.colorStartTag(16777215);
									}

									var23 = var9.field2701[var20];
									if (var9.field2653 == null) {
										var9.field2653 = new int[var9.field2699.length];
									}

									if (var9.field2692 == null) {
										var9.field2692 = new int[var9.field2699.length];
									}

									if (var23 != 0) {
										if (var9.field2653[var20] == 0) {
											var9.field2653[var20] = var23 + Client.cycle + var9.field2692[var20];
										} else {
											var9.field2653[var20] = var23 + Client.cycle;
										}
									} else {
										var9.field2653[var20] = Integer.MAX_VALUE;
									}
								}

								if (!var21 && var9.field2653 != null) {
									var9.field2653[var20] = 0;
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
							if ((MouseHandler.MouseHandler_currentButton == 1 || !MouseHandler.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var33) {
								var34 = true;
							}

							var21 = false;
							if ((MouseHandler.MouseHandler_lastButton == 1 || !MouseHandler.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) {
								var21 = true;
							}

							if (var21) {
								PcmPlayer.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var10, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.contentType == 1400) {
								UserComparator4.worldMap.method6197(var17, var18, var33 & var34, var33 & var21);
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var33 && ObjectSound.method1797(DirectByteArrayCopier.getWidgetClickMask(var9))) {
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) {
								Client.field780 = true;
								Client.field727 = var10;
								Client.field782 = var11;
							}

							if (var9.hasListener) {
								ScriptEvent var29;
								if (var33 && Client.mouseWheelRotation != 0 && var9.onScroll != null) {
									var29 = new ScriptEvent();
									var29.isMouseInputEvent = true;
									var29.widget = var9;
									var29.mouseY = Client.mouseWheelRotation;
									var29.args = var9.onScroll;
									Client.scriptEvents.addFirst(var29);
								}

								if (Client.clickedWidget != null || ClientPacket.dragInventoryWidget != null || Client.isMenuOpen) {
									var21 = false;
									var34 = false;
									var33 = false;
								}

								if (!var9.isClicked && var21) {
									var9.isClicked = true;
									if (var9.onClick != null) {
										var29 = new ScriptEvent();
										var29.isMouseInputEvent = true;
										var29.widget = var9;
										var29.mouseX = MouseHandler.MouseHandler_lastPressedX - var10;
										var29.mouseY = MouseHandler.MouseHandler_lastPressedY - var11;
										var29.args = var9.onClick;
										Client.scriptEvents.addFirst(var29);
									}
								}

								if (var9.isClicked && var34 && var9.onClickRepeat != null) {
									var29 = new ScriptEvent();
									var29.isMouseInputEvent = true;
									var29.widget = var9;
									var29.mouseX = MouseHandler.MouseHandler_x - var10;
									var29.mouseY = MouseHandler.MouseHandler_y - var11;
									var29.args = var9.onClickRepeat;
									Client.scriptEvents.addFirst(var29);
								}

								if (var9.isClicked && !var34) {
									var9.isClicked = false;
									if (var9.onRelease != null) {
										var29 = new ScriptEvent();
										var29.isMouseInputEvent = true;
										var29.widget = var9;
										var29.mouseX = MouseHandler.MouseHandler_x - var10;
										var29.mouseY = MouseHandler.MouseHandler_y - var11;
										var29.args = var9.onRelease;
										Client.field688.addFirst(var29);
									}
								}

								if (var34 && var9.onHold != null) {
									var29 = new ScriptEvent();
									var29.isMouseInputEvent = true;
									var29.widget = var9;
									var29.mouseX = MouseHandler.MouseHandler_x - var10;
									var29.mouseY = MouseHandler.MouseHandler_y - var11;
									var29.args = var9.onHold;
									Client.scriptEvents.addFirst(var29);
								}

								if (!var9.containsMouse && var33) {
									var9.containsMouse = true;
									if (var9.onMouseOver != null) {
										var29 = new ScriptEvent();
										var29.isMouseInputEvent = true;
										var29.widget = var9;
										var29.mouseX = MouseHandler.MouseHandler_x - var10;
										var29.mouseY = MouseHandler.MouseHandler_y - var11;
										var29.args = var9.onMouseOver;
										Client.scriptEvents.addFirst(var29);
									}
								}

								if (var9.containsMouse && var33 && var9.onMouseRepeat != null) {
									var29 = new ScriptEvent();
									var29.isMouseInputEvent = true;
									var29.widget = var9;
									var29.mouseX = MouseHandler.MouseHandler_x - var10;
									var29.mouseY = MouseHandler.MouseHandler_y - var11;
									var29.args = var9.onMouseRepeat;
									Client.scriptEvents.addFirst(var29);
								}

								if (var9.containsMouse && !var33) {
									var9.containsMouse = false;
									if (var9.onMouseLeave != null) {
										var29 = new ScriptEvent();
										var29.isMouseInputEvent = true;
										var29.widget = var9;
										var29.mouseX = MouseHandler.MouseHandler_x - var10;
										var29.mouseY = MouseHandler.MouseHandler_y - var11;
										var29.args = var9.onMouseLeave;
										Client.field688.addFirst(var29);
									}
								}

								if (var9.onTimer != null) {
									var29 = new ScriptEvent();
									var29.widget = var9;
									var29.args = var9.onTimer;
									Client.field806.addFirst(var29);
								}

								ScriptEvent var30;
								int var35;
								int var36;
								if (var9.onVarTransmit != null && Client.field789 > var9.field2760) {
									if (var9.varTransmitTriggers != null && Client.field789 - var9.field2760 <= 32) {
										label915:
										for (var35 = var9.field2760; var35 < Client.field789; ++var35) {
											var23 = Client.field788[var35 & 31];

											for (var36 = 0; var36 < var9.varTransmitTriggers.length; ++var36) {
												if (var23 == var9.varTransmitTriggers[var36]) {
													var30 = new ScriptEvent();
													var30.widget = var9;
													var30.args = var9.onVarTransmit;
													Client.scriptEvents.addFirst(var30);
													break label915;
												}
											}
										}
									} else {
										var29 = new ScriptEvent();
										var29.widget = var9;
										var29.args = var9.onVarTransmit;
										Client.scriptEvents.addFirst(var29);
									}

									var9.field2760 = Client.field789;
								}

								if (var9.onInvTransmit != null && Client.field791 > var9.field2748) {
									if (var9.invTransmitTriggers != null && Client.field791 - var9.field2748 <= 32) {
										label891:
										for (var35 = var9.field2748; var35 < Client.field791; ++var35) {
											var23 = Client.changedItemContainers[var35 & 31];

											for (var36 = 0; var36 < var9.invTransmitTriggers.length; ++var36) {
												if (var23 == var9.invTransmitTriggers[var36]) {
													var30 = new ScriptEvent();
													var30.widget = var9;
													var30.args = var9.onInvTransmit;
													Client.scriptEvents.addFirst(var30);
													break label891;
												}
											}
										}
									} else {
										var29 = new ScriptEvent();
										var29.widget = var9;
										var29.args = var9.onInvTransmit;
										Client.scriptEvents.addFirst(var29);
									}

									var9.field2748 = Client.field791;
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field2754) {
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field2754 <= 32) {
										label867:
										for (var35 = var9.field2754; var35 < Client.changedSkillsCount; ++var35) {
											var23 = Client.changedSkills[var35 & 31];

											for (var36 = 0; var36 < var9.statTransmitTriggers.length; ++var36) {
												if (var23 == var9.statTransmitTriggers[var36]) {
													var30 = new ScriptEvent();
													var30.widget = var9;
													var30.args = var9.onStatTransmit;
													Client.scriptEvents.addFirst(var30);
													break label867;
												}
											}
										}
									} else {
										var29 = new ScriptEvent();
										var29.widget = var9;
										var29.args = var9.onStatTransmit;
										Client.scriptEvents.addFirst(var29);
									}

									var9.field2754 = Client.changedSkillsCount;
								}

								if (Client.chatCycle > var9.field2759 && var9.onChatTransmit != null) {
									var29 = new ScriptEvent();
									var29.widget = var9;
									var29.args = var9.onChatTransmit;
									Client.scriptEvents.addFirst(var29);
								}

								if (Client.field797 > var9.field2759 && var9.onFriendTransmit != null) {
									var29 = new ScriptEvent();
									var29.widget = var9;
									var29.args = var9.onFriendTransmit;
									Client.scriptEvents.addFirst(var29);
								}

								if (Client.field798 > var9.field2759 && var9.onClanTransmit != null) {
									var29 = new ScriptEvent();
									var29.widget = var9;
									var29.args = var9.onClanTransmit;
									Client.scriptEvents.addFirst(var29);
								}

								if (Client.field786 > var9.field2759 && var9.field2736 != null) {
									var29 = new ScriptEvent();
									var29.widget = var9;
									var29.args = var9.field2736;
									Client.scriptEvents.addFirst(var29);
								}

								if (Client.field800 > var9.field2759 && var9.field2655 != null) {
									var29 = new ScriptEvent();
									var29.widget = var9;
									var29.args = var9.field2655;
									Client.scriptEvents.addFirst(var29);
								}

								if (Client.field801 > var9.field2759 && var9.onStockTransmit != null) {
									var29 = new ScriptEvent();
									var29.widget = var9;
									var29.args = var9.onStockTransmit;
									Client.scriptEvents.addFirst(var29);
								}

								if (Client.field802 > var9.field2759 && var9.field2743 != null) {
									var29 = new ScriptEvent();
									var29.widget = var9;
									var29.args = var9.field2743;
									Client.scriptEvents.addFirst(var29);
								}

								if (Client.field803 > var9.field2759 && var9.onMiscTransmit != null) {
									var29 = new ScriptEvent();
									var29.widget = var9;
									var29.args = var9.onMiscTransmit;
									Client.scriptEvents.addFirst(var29);
								}

								var9.field2759 = Client.cycleCntr;
								if (var9.onKey != null) {
									for (var35 = 0; var35 < Client.field827; ++var35) {
										ScriptEvent var31 = new ScriptEvent();
										var31.widget = var9;
										var31.keyTyped = Client.field792[var35];
										var31.keyPressed = Client.field828[var35];
										var31.args = var9.onKey;
										Client.scriptEvents.addFirst(var31);
									}
								}
							}
						}

						if (!var9.isIf3) {
							if (Client.clickedWidget != null || ClientPacket.dragInventoryWidget != null || Client.isMenuOpen) {
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								if (var9.mouseOverRedirect >= 0) {
									Varps.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									Varps.mousedOverWidgetIf1 = var9;
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								Player.field1192 = var9;
							}

							if (var9.scrollHeight > var9.height) {
								LoginType.method6344(var9, var10 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) {
							updateInterface(var0, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY);
							if (var9.children != null) {
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var27 = (InterfaceParent)Client.interfaceParents.get((long)var9.id);
							if (var27 != null) {
								if (var27.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) {
									for (ScriptEvent var28 = (ScriptEvent)Client.scriptEvents.last(); var28 != null; var28 = (ScriptEvent)Client.scriptEvents.previous()) {
										if (var28.isMouseInputEvent) {
											var28.remove();
											var28.widget.containsMouse = false;
										}
									}

									if (class34.widgetDragDuration == 0) {
										Client.clickedWidget = null;
										Client.clickedWidgetParent = null;
									}

									if (!Client.isMenuOpen) {
										VerticalAlignment.addCancelMenuEntry();
									}
								}

								class5.updateRootInterface(var27.group, var12, var13, var14, var15, var10, var11);
							}
						}
					}
				}
			}
		}

	}
}
