import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("as")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("sy")
	@ObfuscatedSignature(
		signature = "Lc;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("archive7")
	static Archive archive7;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -2060258139
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1398963829
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 682976363
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 38335685
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1282107961
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -167107483
	)
	@Export("regionEndY")
	int regionEndY;

	WorldMapSection1() {
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Lar;B)V",
		garbageValue = "100"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.regionEndX) {
			var1.regionLowX = this.regionEndX;
		}

		if (var1.regionHighX < this.regionEndX) {
			var1.regionHighX = this.regionEndX;
		}

		if (var1.regionLowY > this.regionEndY) {
			var1.regionLowY = this.regionEndY;
		}

		if (var1.regionHighY < this.regionEndY) {
			var1.regionHighY = this.regionEndY;
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(IIII)Z",
		garbageValue = "-339896458"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) {
			return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(III)Z",
		garbageValue = "-2135820245"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(IIII)[I",
		garbageValue = "-1761492451"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.regionEndX * 64 - this.regionStartX * 64 + var2, var3 + (this.regionEndY * 64 - this.regionStartY * 64)};
			return var4;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(III)Lhg;",
		garbageValue = "-1553504587"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1;
			int var4 = this.regionStartY * 64 - this.regionEndY * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lkf;I)V",
		garbageValue = "2144381737"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1994421574"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "1982002808"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var1 = TaskHandler.method3567(var0);
		int var2 = var1.baseVar;
		int var3 = var1.startBit;
		int var4 = var1.endBit;
		int var5 = Varps.Varps_masks[var4 - var3];
		return Varps.Varps_main[var2] >> var3 & var5;
	}

	@ObfuscatedName("z")
	public static String method650(long var0) {
		Calendar.Calendar_calendar.setTime(new Date(var0));
		int var2 = Calendar.Calendar_calendar.get(7);
		int var3 = Calendar.Calendar_calendar.get(5);
		int var4 = Calendar.Calendar_calendar.get(2);
		int var5 = Calendar.Calendar_calendar.get(1);
		int var6 = Calendar.Calendar_calendar.get(11);
		int var7 = Calendar.Calendar_calendar.get(12);
		int var8 = Calendar.Calendar_calendar.get(13);
		return Calendar.DAYS_OF_THE_WEEK[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1996016917"
	)
	static final void method649() {
		Object var10000 = null;
		String var0 = "You can't add yourself to your own friend list";
		WorldMapRectangle.addGameMessage(30, "", var0);
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		signature = "(Lhq;IIIIIIB)V",
		garbageValue = "21"
	)
	static final void method648(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field743) {
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0;
		}

		Client.field743 = false;
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !ScriptEvent.mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.scrollY -= 4;
				class52.invalidateWidget(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
				var0.scrollY += 4;
				class52.invalidateWidget(var0);
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
				var7 = var3 * (var3 - 32) / var4;
				if (var7 < 8) {
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2;
				int var9 = var3 - 32 - var7;
				var0.scrollY = var8 * (var4 - var3) / var9;
				class52.invalidateWidget(var0);
				Client.field743 = true;
			}
		}

		if (Client.mouseWheelRotation != 0) {
			var7 = var0.width;
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.scrollY += Client.mouseWheelRotation * 45;
				class52.invalidateWidget(var0);
			}
		}

	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		signature = "([Lhq;IIIIIIIB)V",
		garbageValue = "2"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			Widget var9 = var0[var8];
			if (var9 != null && var9.parentId == var1 && (!var9.isIf3 || var9.type == 0 || var9.hasListener || WorldMapIcon_0.getWidgetClickMask(var9) != 0 || var9 == Client.clickedWidgetParent || var9.contentType == 1338)) {
				if (var9.isIf3) {
					if (GrandExchangeOfferUnitPriceComparator.isComponentHidden(var9)) {
						continue;
					}
				} else if (var9.type == 0 && var9 != TriBool.mousedOverWidgetIf1 && GrandExchangeOfferUnitPriceComparator.isComponentHidden(var9)) {
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
					Client.field880 = true;
					Client.field859 = var10;
					Client.field795 = var11;
				}

				boolean var32 = false;
				if (var9.field2676) {
					switch(Client.field865) {
					case 0:
						var32 = true;
					case 1:
					default:
						break;
					case 2:
						if (Client.field840 == var9.id >>> 16) {
							var32 = true;
						}
						break;
					case 3:
						if (var9.id == Client.field840) {
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

								if (BoundaryObject.widgetDragDuration == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}

								if (!Client.isMenuOpen) {
									WorldMapAreaData.addCancelMenuEntry();
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
							JagexCache.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) {
						GrandExchangeEvent.checkIfMinimapClicked(var9, var10, var11);
					} else {
						if (var9.contentType == 1400) {
							Message.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var33, var10, var11, var9.width, var9.height);
						}

						if (!Client.isMenuOpen && var33) {
							if (var9.contentType == 1400) {
								Message.worldMap.addElementMenuOptions(var10, var11, var9.width, var9.height, var17, var18);
							} else {
								class1.method21(var9, var17 - var10, var18 - var11);
							}
						}

						boolean var21;
						int var23;
						if (var32) {
							for (int var20 = 0; var20 < var9.field2626.length; ++var20) {
								var21 = false;
								boolean var22 = false;
								if (!var21 && var9.field2626[var20] != null) {
									for (var23 = 0; var23 < var9.field2626[var20].length; ++var23) {
										boolean var24 = false;
										if (var9.field2661 != null) {
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field2626[var20][var23]];
										}

										if (Buddy.method5277(var9.field2626[var20][var23]) || var24) {
											var21 = true;
											if (var9.field2661 != null && var9.field2661[var20] > Client.cycle) {
												break;
											}

											byte var25 = var9.field2719[var20][var23];
											if (var25 == 0 || ((var25 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var25 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var25 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var25 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) {
												var22 = true;
												break;
											}
										}
									}
								}

								if (var22) {
									if (var20 < 10) {
										UserComparator8.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) {
										class22.Widget_runOnTargetLeave();
										Nameable.selectSpell(var9.id, var9.childIndex, GrandExchangeOfferTotalQuantityComparator.method176(WorldMapIcon_0.getWidgetClickMask(var9)), var9.itemId);
										Client.selectedSpellActionName = SpriteMask.method4059(var9);
										if (Client.selectedSpellActionName == null) {
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + WorldMapAreaData.colorStartTag(16777215);
									}

									var23 = var9.field2682[var20];
									if (var9.field2661 == null) {
										var9.field2661 = new int[var9.field2626.length];
									}

									if (var9.field2683 == null) {
										var9.field2683 = new int[var9.field2626.length];
									}

									if (var23 != 0) {
										if (var9.field2661[var20] == 0) {
											var9.field2661[var20] = var23 + Client.cycle + var9.field2683[var20];
										} else {
											var9.field2661[var20] = var23 + Client.cycle;
										}
									} else {
										var9.field2661[var20] = Integer.MAX_VALUE;
									}
								}

								if (!var21 && var9.field2661 != null) {
									var9.field2661[var20] = 0;
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
							if ((MouseHandler.MouseHandler_currentButton == 1 || !ScriptEvent.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var33) {
								var34 = true;
							}

							var21 = false;
							if ((MouseHandler.MouseHandler_lastButton == 1 || !ScriptEvent.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) {
								var21 = true;
							}

							if (var21) {
								class13.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var10, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.contentType == 1400) {
								Message.worldMap.method6430(var17, var18, var33 & var34, var33 & var21);
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var33 && Archive.method4386(WorldMapIcon_0.getWidgetClickMask(var9))) {
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) {
								Client.field799 = true;
								Client.field856 = var10;
								Client.field785 = var11;
							}

							if (var9.hasListener) {
								ScriptEvent var28;
								if (var33 && Client.mouseWheelRotation != 0 && var9.onScroll != null) {
									var28 = new ScriptEvent();
									var28.isMouseInputEvent = true;
									var28.widget = var9;
									var28.mouseY = Client.mouseWheelRotation;
									var28.args = var9.onScroll;
									Client.scriptEvents.addFirst(var28);
								}

								if (Client.clickedWidget != null || BuddyRankComparator.dragInventoryWidget != null || Client.isMenuOpen) {
									var21 = false;
									var34 = false;
									var33 = false;
								}

								if (!var9.isClicked && var21) {
									var9.isClicked = true;
									if (var9.onClick != null) {
										var28 = new ScriptEvent();
										var28.isMouseInputEvent = true;
										var28.widget = var9;
										var28.mouseX = MouseHandler.MouseHandler_lastPressedX - var10;
										var28.mouseY = MouseHandler.MouseHandler_lastPressedY - var11;
										var28.args = var9.onClick;
										Client.scriptEvents.addFirst(var28);
									}
								}

								if (var9.isClicked && var34 && var9.onClickRepeat != null) {
									var28 = new ScriptEvent();
									var28.isMouseInputEvent = true;
									var28.widget = var9;
									var28.mouseX = MouseHandler.MouseHandler_x - var10;
									var28.mouseY = MouseHandler.MouseHandler_y - var11;
									var28.args = var9.onClickRepeat;
									Client.scriptEvents.addFirst(var28);
								}

								if (var9.isClicked && !var34) {
									var9.isClicked = false;
									if (var9.onRelease != null) {
										var28 = new ScriptEvent();
										var28.isMouseInputEvent = true;
										var28.widget = var9;
										var28.mouseX = MouseHandler.MouseHandler_x - var10;
										var28.mouseY = MouseHandler.MouseHandler_y - var11;
										var28.args = var9.onRelease;
										Client.field912.addFirst(var28);
									}
								}

								if (var34 && var9.onHold != null) {
									var28 = new ScriptEvent();
									var28.isMouseInputEvent = true;
									var28.widget = var9;
									var28.mouseX = MouseHandler.MouseHandler_x - var10;
									var28.mouseY = MouseHandler.MouseHandler_y - var11;
									var28.args = var9.onHold;
									Client.scriptEvents.addFirst(var28);
								}

								if (!var9.containsMouse && var33) {
									var9.containsMouse = true;
									if (var9.onMouseOver != null) {
										var28 = new ScriptEvent();
										var28.isMouseInputEvent = true;
										var28.widget = var9;
										var28.mouseX = MouseHandler.MouseHandler_x - var10;
										var28.mouseY = MouseHandler.MouseHandler_y - var11;
										var28.args = var9.onMouseOver;
										Client.scriptEvents.addFirst(var28);
									}
								}

								if (var9.containsMouse && var33 && var9.onMouseRepeat != null) {
									var28 = new ScriptEvent();
									var28.isMouseInputEvent = true;
									var28.widget = var9;
									var28.mouseX = MouseHandler.MouseHandler_x - var10;
									var28.mouseY = MouseHandler.MouseHandler_y - var11;
									var28.args = var9.onMouseRepeat;
									Client.scriptEvents.addFirst(var28);
								}

								if (var9.containsMouse && !var33) {
									var9.containsMouse = false;
									if (var9.onMouseLeave != null) {
										var28 = new ScriptEvent();
										var28.isMouseInputEvent = true;
										var28.widget = var9;
										var28.mouseX = MouseHandler.MouseHandler_x - var10;
										var28.mouseY = MouseHandler.MouseHandler_y - var11;
										var28.args = var9.onMouseLeave;
										Client.field912.addFirst(var28);
									}
								}

								if (var9.onTimer != null) {
									var28 = new ScriptEvent();
									var28.widget = var9;
									var28.args = var9.onTimer;
									Client.field877.addFirst(var28);
								}

								ScriptEvent var29;
								int var35;
								int var36;
								if (var9.onVarTransmit != null && Client.field864 > var9.field2618) {
									if (var9.varTransmitTriggers != null && Client.field864 - var9.field2618 <= 32) {
										label886:
										for (var35 = var9.field2618; var35 < Client.field864; ++var35) {
											var23 = Client.field863[var35 & 31];

											for (var36 = 0; var36 < var9.varTransmitTriggers.length; ++var36) {
												if (var23 == var9.varTransmitTriggers[var36]) {
													var29 = new ScriptEvent();
													var29.widget = var9;
													var29.args = var9.onVarTransmit;
													Client.scriptEvents.addFirst(var29);
													break label886;
												}
											}
										}
									} else {
										var28 = new ScriptEvent();
										var28.widget = var9;
										var28.args = var9.onVarTransmit;
										Client.scriptEvents.addFirst(var28);
									}

									var9.field2618 = Client.field864;
								}

								if (var9.onInvTransmit != null && Client.field903 > var9.field2727) {
									if (var9.invTransmitTriggers != null && Client.field903 - var9.field2727 <= 32) {
										label862:
										for (var35 = var9.field2727; var35 < Client.field903; ++var35) {
											var23 = Client.changedItemContainers[var35 & 31];

											for (var36 = 0; var36 < var9.invTransmitTriggers.length; ++var36) {
												if (var23 == var9.invTransmitTriggers[var36]) {
													var29 = new ScriptEvent();
													var29.widget = var9;
													var29.args = var9.onInvTransmit;
													Client.scriptEvents.addFirst(var29);
													break label862;
												}
											}
										}
									} else {
										var28 = new ScriptEvent();
										var28.widget = var9;
										var28.args = var9.onInvTransmit;
										Client.scriptEvents.addFirst(var28);
									}

									var9.field2727 = Client.field903;
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field2681) {
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field2681 <= 32) {
										label838:
										for (var35 = var9.field2681; var35 < Client.changedSkillsCount; ++var35) {
											var23 = Client.changedSkills[var35 & 31];

											for (var36 = 0; var36 < var9.statTransmitTriggers.length; ++var36) {
												if (var23 == var9.statTransmitTriggers[var36]) {
													var29 = new ScriptEvent();
													var29.widget = var9;
													var29.args = var9.onStatTransmit;
													Client.scriptEvents.addFirst(var29);
													break label838;
												}
											}
										}
									} else {
										var28 = new ScriptEvent();
										var28.widget = var9;
										var28.args = var9.onStatTransmit;
										Client.scriptEvents.addFirst(var28);
									}

									var9.field2681 = Client.changedSkillsCount;
								}

								if (Client.chatCycle > var9.field2664 && var9.onChatTransmit != null) {
									var28 = new ScriptEvent();
									var28.widget = var9;
									var28.args = var9.onChatTransmit;
									Client.scriptEvents.addFirst(var28);
								}

								if (Client.field870 > var9.field2664 && var9.onFriendTransmit != null) {
									var28 = new ScriptEvent();
									var28.widget = var9;
									var28.args = var9.onFriendTransmit;
									Client.scriptEvents.addFirst(var28);
								}

								if (Client.field871 > var9.field2664 && var9.onClanTransmit != null) {
									var28 = new ScriptEvent();
									var28.widget = var9;
									var28.args = var9.onClanTransmit;
									Client.scriptEvents.addFirst(var28);
								}

								if (Client.field872 > var9.field2664 && var9.onStockTransmit != null) {
									var28 = new ScriptEvent();
									var28.widget = var9;
									var28.args = var9.onStockTransmit;
									Client.scriptEvents.addFirst(var28);
								}

								if (Client.field873 > var9.field2664 && var9.field2722 != null) {
									var28 = new ScriptEvent();
									var28.widget = var9;
									var28.args = var9.field2722;
									Client.scriptEvents.addFirst(var28);
								}

								if (Client.field775 > var9.field2664 && var9.onMiscTransmit != null) {
									var28 = new ScriptEvent();
									var28.widget = var9;
									var28.args = var9.onMiscTransmit;
									Client.scriptEvents.addFirst(var28);
								}

								var9.field2664 = Client.cycleCntr;
								if (var9.onKey != null) {
									for (var35 = 0; var35 < Client.field898; ++var35) {
										ScriptEvent var30 = new ScriptEvent();
										var30.widget = var9;
										var30.keyTyped = Client.field900[var35];
										var30.keyPressed = Client.field899[var35];
										var30.args = var9.onKey;
										Client.scriptEvents.addFirst(var30);
									}
								}
							}
						}

						if (!var9.isIf3) {
							if (Client.clickedWidget != null || BuddyRankComparator.dragInventoryWidget != null || Client.isMenuOpen) {
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								if (var9.mouseOverRedirect >= 0) {
									TriBool.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									TriBool.mousedOverWidgetIf1 = var9;
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								Occluder.field1950 = var9;
							}

							if (var9.scrollHeight > var9.height) {
								method648(var9, var10 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
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
									for (ScriptEvent var31 = (ScriptEvent)Client.scriptEvents.last(); var31 != null; var31 = (ScriptEvent)Client.scriptEvents.previous()) {
										if (var31.isMouseInputEvent) {
											var31.remove();
											var31.widget.containsMouse = false;
										}
									}

									if (BoundaryObject.widgetDragDuration == 0) {
										Client.clickedWidget = null;
										Client.clickedWidgetParent = null;
									}

									if (!Client.isMenuOpen) {
										WorldMapAreaData.addCancelMenuEntry();
									}
								}

								GameObject.updateRootInterface(var27.group, var12, var13, var14, var15, var10, var11);
							}
						}
					}
				}
			}
		}

	}
}
