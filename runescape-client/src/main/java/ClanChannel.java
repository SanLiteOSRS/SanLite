import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("y")
	public static short[][] field1512;
	@ObfuscatedName("i")
	boolean field1510;
	@ObfuscatedName("w")
	boolean field1518;
	@ObfuscatedName("s")
	@Export("members")
	public List members;
	@ObfuscatedName("a")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = -4755117634906331749L
	)
	long field1514;
	@ObfuscatedName("g")
	@Export("name")
	public String name;
	@ObfuscatedName("e")
	public byte field1516;
	@ObfuscatedName("p")
	public byte field1511;

	static {
		new BitSet(65536);
	}

	@ObfuscatedSignature(
		descriptor = "(Lop;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1518 = true;
		this.name = null;
		this.method2806(var1);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "32"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.members.size()];
			this.sortedMembers = new int[this.members.size()];

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method7579();
			}

			int[] var3 = this.sortedMembers;
			class122.method2599(var1, var3, 0, var1.length - 1);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lde;B)V",
		garbageValue = "8"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1989668553"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-77"
	)
	public int method2809() {
		return this.members.size();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-328026821"
	)
	public int method2817(String var1) {
		if (!this.field1518) {
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var2 = 0; var2 < this.members.size(); ++var2) {
				if (((ClanChannelMember)this.members.get(var2)).username.getName().equalsIgnoreCase(var1)) {
					return var2;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "1502263315"
	)
	void method2806(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
			this.field1510 = true;
		}

		if ((var2 & 2) != 0) {
			this.field1518 = true;
		}

		int var3 = 2;
		if ((var2 & 4) != 0) {
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong();
		this.field1514 = var1.readLong();
		this.name = var1.readStringCp1252NullTerminated();
		var1.readBoolean();
		this.field1511 = var1.readByte();
		this.field1516 = var1.readByte();
		int var4 = var1.readUnsignedShort();
		if (var4 > 0) {
			this.members = new ArrayList(var4);

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanChannelMember var6 = new ClanChannelMember();
				if (this.field1510) {
					var1.readLong();
				}

				if (this.field1518) {
					var6.username = new Username(var1.readStringCp1252NullTerminated());
				}

				var6.rank = var1.readByte();
				var6.world = var1.readUnsignedShort();
				if (var3 >= 3) {
					var1.readBoolean();
				}

				this.members.add(var5, var6);
			}
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-894225257"
	)
	public static int method2824(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + var0.charAt(var3);
		}

		return var2;
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "([Ljf;IIIIIIII)V",
		garbageValue = "-879561434"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			Widget var9 = var0[var8];
			if (var9 != null && var9.parentId == var1 && (!var9.isIf3 || var9.type == 0 || var9.hasListener || PendingSpawn.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent || var9.contentType == 1338)) {
				if (var9.isIf3) {
					if (Varcs.isComponentHidden(var9)) {
						continue;
					}
				} else if (var9.type == 0 && var9 != WorldMapData_0.mousedOverWidgetIf1 && Varcs.isComponentHidden(var9)) {
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
					Client.field680 = true;
					Client.field652 = var10;
					Client.field468 = var11;
				}

				boolean var33 = false;
				if (var9.field3125) {
					switch(Client.field479) {
					case 0:
						var33 = true;
					case 1:
					default:
						break;
					case 2:
						if (Client.field633 == var9.id >>> 16) {
							var33 = true;
						}
						break;
					case 3:
						if (var9.id == Client.field633) {
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

								if (class134.widgetDragDuration == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}

								if (!Client.isMenuOpen) {
									FriendSystem.addCancelMenuEntry();
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
							DevicePcmPlayerProvider.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) {
						class1.checkIfMinimapClicked(var9, var10, var11);
					} else {
						if (var9.contentType == 1400) {
							class133.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var34, var10, var11, var9.width, var9.height);
						}

						if (!Client.isMenuOpen && var34) {
							if (var9.contentType == 1400) {
								class133.worldMap.addElementMenuOptions(var10, var11, var9.width, var9.height, var17, var18);
							} else {
								class114.Widget_addToMenu(var9, var17 - var10, var18 - var11);
							}
						}

						boolean var21;
						int var23;
						if (var33) {
							for (int var20 = 0; var20 < var9.field3180.length; ++var20) {
								var21 = false;
								boolean var27 = false;
								if (!var21 && var9.field3180[var20] != null) {
									for (var23 = 0; var23 < var9.field3180[var20].length; ++var23) {
										boolean var24 = false;
										if (var9.field3194 != null) {
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field3180[var20][var23]];
										}

										if (InterfaceParent.method2080(var9.field3180[var20][var23]) || var24) {
											var21 = true;
											if (var9.field3194 != null && var9.field3194[var20] > Client.cycle) {
												break;
											}

											byte var32 = var9.field3105[var20][var23];
											if (var32 == 0 || ((var32 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var32 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var32 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var32 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) {
												var27 = true;
												break;
											}
										}
									}
								}

								if (var27) {
									if (var20 < 10) {
										GrandExchangeEvents.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) {
										class262.Widget_runOnTargetLeave();
										Decimator.selectSpell(var9.id, var9.childIndex, SecureRandomCallable.Widget_unpackTargetMask(PendingSpawn.getWidgetFlags(var9)), var9.itemId);
										Client.selectedSpellActionName = class20.Widget_getSpellActionName(var9);
										if (Client.selectedSpellActionName == null) {
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + MouseHandler.colorStartTag(16777215);
									}

									var23 = var9.field3128[var20];
									if (var9.field3194 == null) {
										var9.field3194 = new int[var9.field3180.length];
									}

									if (var9.field3129 == null) {
										var9.field3129 = new int[var9.field3180.length];
									}

									if (var23 != 0) {
										if (var9.field3194[var20] == 0) {
											var9.field3194[var20] = var23 + Client.cycle + var9.field3129[var20];
										} else {
											var9.field3194[var20] = var23 + Client.cycle;
										}
									} else {
										var9.field3194[var20] = Integer.MAX_VALUE;
									}
								}

								if (!var21 && var9.field3194 != null) {
									var9.field3194[var20] = 0;
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
							if ((MouseHandler.MouseHandler_currentButton == 1 || !ApproximateRouteStrategy.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var34) {
								var35 = true;
							}

							var21 = false;
							if ((MouseHandler.MouseHandler_lastButton == 1 || !ApproximateRouteStrategy.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) {
								var21 = true;
							}

							if (var21) {
								UserComparator6.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var10, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.contentType == 1400) {
								class133.worldMap.method6625(var17, var18, var34 & var35, var34 & var21);
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var34 && PlayerComposition.method5067(PendingSpawn.getWidgetFlags(var9))) {
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) {
								Client.field648 = true;
								Client.field649 = var10;
								Client.field650 = var11;
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

								if (Client.clickedWidget != null || class247.dragInventoryWidget != null || Client.isMenuOpen) {
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
										Client.field675.addFirst(var22);
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
										Client.field675.addFirst(var22);
									}
								}

								if (var9.onTimer != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onTimer;
									Client.field674.addFirst(var22);
								}

								ScriptEvent var25;
								int var36;
								int var37;
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field3189) {
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field3189 <= 32) {
										label818:
										for (var37 = var9.field3189; var37 < Client.changedVarpCount; ++var37) {
											var23 = Client.changedVarps[var37 & 31];

											for (var36 = 0; var36 < var9.varTransmitTriggers.length; ++var36) {
												if (var23 == var9.varTransmitTriggers[var36]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onVarTransmit;
													Client.scriptEvents.addFirst(var25);
													break label818;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onVarTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3189 = Client.changedVarpCount;
								}

								if (var9.onInvTransmit != null && Client.field659 > var9.field3073) {
									if (var9.invTransmitTriggers != null && Client.field659 - var9.field3073 <= 32) {
										label794:
										for (var37 = var9.field3073; var37 < Client.field659; ++var37) {
											var23 = Client.changedItemContainers[var37 & 31];

											for (var36 = 0; var36 < var9.invTransmitTriggers.length; ++var36) {
												if (var23 == var9.invTransmitTriggers[var36]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onInvTransmit;
													Client.scriptEvents.addFirst(var25);
													break label794;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onInvTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3073 = Client.field659;
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field3191) {
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field3191 <= 32) {
										label770:
										for (var37 = var9.field3191; var37 < Client.changedSkillsCount; ++var37) {
											var23 = Client.changedSkills[var37 & 31];

											for (var36 = 0; var36 < var9.statTransmitTriggers.length; ++var36) {
												if (var23 == var9.statTransmitTriggers[var36]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onStatTransmit;
													Client.scriptEvents.addFirst(var25);
													break label770;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onStatTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3191 = Client.changedSkillsCount;
								}

								if (Client.chatCycle > var9.field3188 && var9.onChatTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onChatTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field679 > var9.field3188 && var9.onFriendTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onFriendTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field666 > var9.field3188 && var9.onClanTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onClanTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field681 > var9.field3188 && var9.field3056 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3056;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field724 > var9.field3188 && var9.field3166 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3166;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field536 > var9.field3188 && var9.onStockTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onStockTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field670 > var9.field3188 && var9.field3172 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3172;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field494 > var9.field3188 && var9.onMiscTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onMiscTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								var9.field3188 = Client.cycleCntr;
								if (var9.onKey != null) {
									for (var37 = 0; var37 < Client.field695; ++var37) {
										ScriptEvent var31 = new ScriptEvent();
										var31.widget = var9;
										var31.keyTyped = Client.field697[var37];
										var31.keyPressed = Client.field696[var37];
										var31.args = var9.onKey;
										Client.scriptEvents.addFirst(var31);
									}
								}

								ScriptEvent var30;
								int[] var38;
								if (var9.field3161 != null) {
									var38 = class7.method57();

									for (var23 = 0; var23 < var38.length; ++var23) {
										var30 = new ScriptEvent();
										var30.widget = var9;
										var30.keyTyped = var38[var23];
										var30.args = var9.field3161;
										Client.scriptEvents.addFirst(var30);
									}
								}

								if (var9.field3162 != null) {
									var38 = TaskHandler.method2879();

									for (var23 = 0; var23 < var38.length; ++var23) {
										var30 = new ScriptEvent();
										var30.widget = var9;
										var30.keyTyped = var38[var23];
										var30.args = var9.field3162;
										Client.scriptEvents.addFirst(var30);
									}
								}
							}
						}

						if (!var9.isIf3) {
							if (Client.clickedWidget != null || class247.dragInventoryWidget != null || Client.isMenuOpen) {
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								if (var9.mouseOverRedirect >= 0) {
									WorldMapData_0.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									WorldMapData_0.mousedOverWidgetIf1 = var9;
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								Skills.field3247 = var9;
							}

							if (var9.scrollHeight > var9.height) {
								class13.method177(var9, var10 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
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

									if (class134.widgetDragDuration == 0) {
										Client.clickedWidget = null;
										Client.clickedWidgetParent = null;
									}

									if (!Client.isMenuOpen) {
										FriendSystem.addCancelMenuEntry();
									}
								}

								Messages.updateRootInterface(var28.group, var12, var13, var14, var15, var10, var11);
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "76"
	)
	static final void method2825(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class408.clientPreferences.areaSoundEffectsVolume = var0;
		Login.savePreferences();
	}
}
