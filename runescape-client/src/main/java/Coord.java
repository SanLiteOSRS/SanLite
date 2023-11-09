import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ku")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("qr")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static class392 field3318;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 2112007443
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -887279971
	)
	@Export("x")
	public int x;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -325968273
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Lku;)V"
	)
	public Coord(Coord var1) {
		this.plane = var1.plane; // L: 15
		this.x = var1.x; // L: 16
		this.y = var1.y; // L: 17
	} // L: 18

	public Coord(int var1, int var2, int var3) {
		this.plane = var1; // L: 9
		this.x = var2; // L: 10
		this.y = var3; // L: 11
	} // L: 12

	public Coord(int var1) {
		if (var1 == -1) { // L: 21
			this.plane = -1;
		} else {
			this.plane = var1 >> 28 & 3; // L: 23
			this.x = var1 >> 14 & 16383; // L: 24
			this.y = var1 & 16383; // L: 25
		}

	} // L: 27

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "90"
	)
	@Export("packed")
	public int packed() {
		int var2 = this.plane; // L: 31
		int var3 = this.x; // L: 32
		int var4 = this.y; // L: 33
		int var1 = var2 << 28 | var3 << 14 | var4; // L: 35
		return var1; // L: 37
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lku;I)Z",
		garbageValue = "143934889"
	)
	@Export("equalsCoord")
	boolean equalsCoord(Coord var1) {
		if (this.plane != var1.plane) { // L: 48
			return false;
		} else if (this.x != var1.x) { // L: 49
			return false;
		} else {
			return this.y == var1.y; // L: 50
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1811449401"
	)
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63); // L: 64
	}

	public int hashCode() {
		return this.packed(); // L: 56
	}

	public boolean equals(Object var1) {
		if (this == var1) { // L: 42
			return true;
		} else {
			return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1); // L: 43 44
		}
	}

	public String toString() {
		return this.toString(","); // L: 60
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "561803064"
	)
	static int method5485(int var0, Script var1, boolean var2) {
		int var3 = -1; // L: 572
		Widget var4;
		if (var0 >= 2000) { // L: 574
			var0 -= 1000; // L: 575
			var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 576
			var4 = HitSplatDefinition.getWidget(var3); // L: 577
		} else {
			var4 = var2 ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget; // L: 579
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) { // L: 580
			Nameable.Interpreter_intStackSize -= 4; // L: 581
			var4.rawX = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 582
			var4.rawY = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 583
			var4.xAlignment = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 2]; // L: 584
			var4.yAlignment = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 3]; // L: 585
			class125.invalidateWidget(var4); // L: 586
			AbstractByteArrayCopier.client.alignWidget(var4); // L: 587
			if (var3 != -1 && var4.type == 0) { // L: 588
				class181.revalidateWidgetScroll(class358.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 589
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) { // L: 591
			Nameable.Interpreter_intStackSize -= 4; // L: 592
			var4.rawWidth = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 593
			var4.rawHeight = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 594
			var4.widthAlignment = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 2]; // L: 595
			var4.heightAlignment = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 3]; // L: 596
			class125.invalidateWidget(var4); // L: 597
			AbstractByteArrayCopier.client.alignWidget(var4); // L: 598
			if (var3 != -1 && var4.type == 0) { // L: 599
				class181.revalidateWidgetScroll(class358.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 600
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) { // L: 602
			boolean var5 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 603
			if (var5 != var4.isHidden) { // L: 604
				var4.isHidden = var5; // L: 605
				class125.invalidateWidget(var4); // L: 606
			}

			return 1; // L: 608
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) { // L: 610
			var4.noClickThrough = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 611
			return 1; // L: 612
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) { // L: 614
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 615
			return 1; // L: 616
		} else {
			return 2; // L: 618
		}
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "([Lkn;IIIIIIII)V",
		garbageValue = "-1296371253"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) { // L: 10778
			Widget var9 = var0[var8]; // L: 10779
			if (var9 != null && var9.parentId == var1 && (var9.method5545() || class193.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) { // L: 10780 10781 10782
				if (var9.isIf3) { // L: 10783
					if (Tiles.isComponentHidden(var9)) { // L: 10784
						continue;
					}
				} else if (var9.type == 0 && var9 != class113.mousedOverWidgetIf1 && Tiles.isComponentHidden(var9)) { // L: 10787
					continue;
				}

				if (var9.type == 11 && var9.method5610(MilliClock.urlRequester)) { // L: 10789 10790
					if (var9.method5562()) { // L: 10791
						class125.invalidateWidget(var9); // L: 10792
						class181.revalidateWidgetScroll(var9.children, var9, true); // L: 10793
					}

					if (var9.field3364 != null) { // L: 10795
						ScriptEvent var10 = new ScriptEvent(); // L: 10796
						var10.widget = var9; // L: 10797
						var10.args = var9.field3364; // L: 10798
						Client.scriptEvents.addFirst(var10); // L: 10799
					}
				}

				int var26 = var9.x + var6; // L: 10803
				int var11 = var7 + var9.y; // L: 10804
				int var12;
				int var13;
				int var14;
				int var15;
				int var17;
				int var18;
				if (var9.type == 2) { // L: 10809
					var12 = var2; // L: 10810
					var13 = var3; // L: 10811
					var14 = var4; // L: 10812
					var15 = var5; // L: 10813
				} else {
					int var16;
					if (var9.type == 9) { // L: 10815
						var16 = var26; // L: 10816
						var17 = var11; // L: 10817
						var18 = var26 + var9.width; // L: 10818
						int var19 = var11 + var9.height; // L: 10819
						if (var18 < var26) { // L: 10820
							var16 = var18; // L: 10822
							var18 = var26; // L: 10823
						}

						if (var19 < var11) { // L: 10825
							var17 = var19; // L: 10827
							var19 = var11; // L: 10828
						}

						++var18; // L: 10830
						++var19; // L: 10831
						var12 = var16 > var2 ? var16 : var2; // L: 10832
						var13 = var17 > var3 ? var17 : var3; // L: 10833
						var14 = var18 < var4 ? var18 : var4; // L: 10834
						var15 = var19 < var5 ? var19 : var5; // L: 10835
					} else {
						var16 = var26 + var9.width; // L: 10838
						var17 = var11 + var9.height; // L: 10839
						var12 = var26 > var2 ? var26 : var2; // L: 10840
						var13 = var11 > var3 ? var11 : var3; // L: 10841
						var14 = var16 < var4 ? var16 : var4; // L: 10842
						var15 = var17 < var5 ? var17 : var5; // L: 10843
					}
				}

				if (var9 == Client.clickedWidget) { // L: 10845
					Client.field494 = true; // L: 10846
					Client.field671 = var26; // L: 10847
					Client.field672 = var11; // L: 10848
				}

				boolean var34 = false; // L: 10850
				if (var9.field3436) { // L: 10851
					switch(Client.field741) { // L: 10852
					case 0:
						var34 = true; // L: 10859
					case 1:
					default:
						break;
					case 2:
						if (Client.field652 == var9.id >>> 16) { // L: 10854
							var34 = true; // L: 10855
						}
						break;
					case 3:
						if (var9.id == Client.field652) { // L: 10862
							var34 = true; // L: 10863
						}
					}
				}

				if (var34 || !var9.isIf3 || var12 < var14 && var13 < var15) { // L: 10868
					if (var9.isIf3) { // L: 10869
						ScriptEvent var27;
						if (var9.noClickThrough) { // L: 10870
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10871
								for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10872
									if (var27.isMouseInputEvent) { // L: 10873
										var27.remove(); // L: 10874
										var27.widget.containsMouse = false; // L: 10875
									}
								}

								if (NPCComposition.widgetDragDuration == 0) { // L: 10878
									Client.clickedWidget = null; // L: 10879
									Client.clickedWidgetParent = null; // L: 10880
								}

								if (!Client.isMenuOpen) { // L: 10882
									Ignored.addCancelMenuEntry(); // L: 10883
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10887 10888
							for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10889
								if (var27.isMouseInputEvent && var27.widget.onScroll == var27.args) { // L: 10890
									var27.remove(); // L: 10891
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x; // L: 10897
					var18 = MouseHandler.MouseHandler_y; // L: 10898
					if (MouseHandler.MouseHandler_lastButton != 0) { // L: 10899
						var17 = MouseHandler.MouseHandler_lastPressedX; // L: 10900
						var18 = MouseHandler.MouseHandler_lastPressedY; // L: 10901
					}

					boolean var35 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15; // L: 10903
					if (var9.contentType == 1337) { // L: 10904
						if (!Client.isLoading && !Client.isMenuOpen && var35) { // L: 10905
							WorldMapSection1.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) { // L: 10908
						class359.checkIfMinimapClicked(var9, var26, var11); // L: 10909
					} else {
						if (var9.contentType == 1400) { // L: 10912
							ClientPacket.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height); // L: 10913
						}

						if (!Client.isMenuOpen && var35) { // L: 10915
							if (var9.contentType == 1400) { // L: 10916
								ClientPacket.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18); // L: 10917
							} else {
								AbstractSocket.Widget_addToMenu(var9, var17 - var26, var18 - var11); // L: 10920
							}
						}

						boolean var21;
						int var29;
						if (var34) { // L: 10923
							for (int var20 = 0; var20 < var9.field3349.length; ++var20) { // L: 10924
								var21 = false; // L: 10925
								boolean var28 = false; // L: 10926
								if (!var21 && var9.field3349[var20] != null) { // L: 10927
									for (var29 = 0; var29 < var9.field3349[var20].length; ++var29) { // L: 10928
										boolean var24 = false; // L: 10929
										if (var9.field3506 != null) { // L: 10930
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field3349[var20][var29]]; // L: 10931
										}

										if (class268.method5149(var9.field3349[var20][var29]) || var24) { // L: 10933
											var21 = true; // L: 10934
											if (var9.field3506 != null && var9.field3506[var20] > Client.cycle) { // L: 10935
												break;
											}

											byte var33 = var9.field3497[var20][var29]; // L: 10936
											if (var33 == 0 || ((var33 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var33 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var33 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var33 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) { // L: 10937 10938 10939 10940 10941
												var28 = true; // L: 10943
												break;
											}
										}
									}
								}

								if (var28) { // L: 10949
									if (var20 < 10) { // L: 10950
										ArchiveDiskAction.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) { // L: 10951
										ReflectionCheck.Widget_runOnTargetLeave(); // L: 10952
										DynamicObject.selectSpell(var9.id, var9.childIndex, ModeWhere.Widget_unpackTargetMask(class193.getWidgetFlags(var9)), var9.itemId); // L: 10953
										Client.selectedSpellActionName = WorldMapDecoration.Widget_getSpellActionName(var9); // L: 10954
										if (Client.selectedSpellActionName == null) { // L: 10955
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + Clock.colorStartTag(16777215); // L: 10956
									}

									var29 = var9.field3439[var20]; // L: 10958
									if (var9.field3506 == null) { // L: 10959
										var9.field3506 = new int[var9.field3349.length];
									}

									if (var9.field3410 == null) { // L: 10960
										var9.field3410 = new int[var9.field3349.length];
									}

									if (var29 != 0) { // L: 10961
										if (var9.field3506[var20] == 0) { // L: 10962
											var9.field3506[var20] = var29 + Client.cycle + var9.field3410[var20];
										} else {
											var9.field3506[var20] = var29 + Client.cycle; // L: 10963
										}
									} else {
										var9.field3506[var20] = Integer.MAX_VALUE; // L: 10965
									}
								}

								if (!var21 && var9.field3506 != null) { // L: 10967 10968
									var9.field3506[var20] = 0;
								}
							}
						}

						if (var9.isIf3) { // L: 10972
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10973
								var35 = true;
							} else {
								var35 = false; // L: 10974
							}

							boolean var36 = false; // L: 10975
							if ((MouseHandler.MouseHandler_currentButton == 1 || !Bounds.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) { // L: 10976
								var36 = true;
							}

							var21 = false; // L: 10977
							if ((MouseHandler.MouseHandler_lastButton == 1 || !Bounds.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) { // L: 10978
								var21 = true;
							}

							int[] var22;
							if (var21) { // L: 10979
								class229.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11); // L: 10980
								if (var9.type == 11 && var9.method5550(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY, var6, var7)) { // L: 10981
									switch(var9.method5554()) { // L: 10982
									case 0:
										class400.openURL(var9.method5556(), true, false); // L: 10984
										break;
									case 1:
										if (class439.method7568(class193.getWidgetFlags(var9))) { // L: 10987
											var22 = var9.method5595(); // L: 10988
											if (var22 != null) { // L: 10989
												PacketBufferNode var23 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2919, Client.packetWriter.isaacCipher); // L: 10990
												var23.packetBuffer.method7687(var9.id); // L: 10991
												var23.packetBuffer.method7686(var22[0]); // L: 10992
												var23.packetBuffer.method7673(var22[1]); // L: 10993
												var23.packetBuffer.writeInt(var9.method5555()); // L: 10994
												var23.packetBuffer.method7675(var9.childIndex); // L: 10995
												var23.packetBuffer.method7687(var22[2]); // L: 10996
												Client.packetWriter.addNode(var23); // L: 10997
											}
										}
									}
								}
							}

							if (var9.contentType == 1400) { // L: 11004
								ClientPacket.worldMap.method7283(var17, var18, var35 & var36, var35 & var21); // L: 11005
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && Players.method2383(class193.getWidgetFlags(var9))) { // L: 11007
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) { // L: 11008
								Client.field569 = true; // L: 11009
								Client.field760 = var26; // L: 11010
								Client.field669 = var11; // L: 11011
							}

							if (var9.hasListener) { // L: 11013
								ScriptEvent var37;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) { // L: 11014
									var37 = new ScriptEvent(); // L: 11015
									var37.isMouseInputEvent = true; // L: 11016
									var37.widget = var9; // L: 11017
									var37.mouseY = Client.mouseWheelRotation; // L: 11018
									var37.args = var9.onScroll; // L: 11019
									Client.scriptEvents.addFirst(var37); // L: 11020
								}

								if (Client.clickedWidget != null || class16.dragInventoryWidget != null || Client.isMenuOpen) { // L: 11022
									var21 = false; // L: 11023
									var36 = false; // L: 11024
									var35 = false; // L: 11025
								}

								if (!var9.isClicked && var21) { // L: 11027
									var9.isClicked = true; // L: 11028
									if (var9.onClick != null) { // L: 11029
										var37 = new ScriptEvent(); // L: 11030
										var37.isMouseInputEvent = true; // L: 11031
										var37.widget = var9; // L: 11032
										var37.mouseX = MouseHandler.MouseHandler_lastPressedX - var26; // L: 11033
										var37.mouseY = MouseHandler.MouseHandler_lastPressedY - var11; // L: 11034
										var37.args = var9.onClick; // L: 11035
										Client.scriptEvents.addFirst(var37); // L: 11036
									}
								}

								if (var9.isClicked && var36 && var9.onClickRepeat != null) { // L: 11039 11040
									var37 = new ScriptEvent(); // L: 11041
									var37.isMouseInputEvent = true; // L: 11042
									var37.widget = var9; // L: 11043
									var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11044
									var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11045
									var37.args = var9.onClickRepeat; // L: 11046
									Client.scriptEvents.addFirst(var37); // L: 11047
								}

								if (var9.isClicked && !var36) { // L: 11050
									var9.isClicked = false; // L: 11051
									if (var9.onRelease != null) { // L: 11052
										var37 = new ScriptEvent(); // L: 11053
										var37.isMouseInputEvent = true; // L: 11054
										var37.widget = var9; // L: 11055
										var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11056
										var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11057
										var37.args = var9.onRelease; // L: 11058
										Client.field528.addFirst(var37); // L: 11059
									}
								}

								if (var36 && var9.onHold != null) { // L: 11062 11063
									var37 = new ScriptEvent(); // L: 11064
									var37.isMouseInputEvent = true; // L: 11065
									var37.widget = var9; // L: 11066
									var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11067
									var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11068
									var37.args = var9.onHold; // L: 11069
									Client.scriptEvents.addFirst(var37); // L: 11070
								}

								if (!var9.containsMouse && var35) { // L: 11073
									var9.containsMouse = true; // L: 11074
									if (var9.onMouseOver != null) { // L: 11075
										var37 = new ScriptEvent(); // L: 11076
										var37.isMouseInputEvent = true; // L: 11077
										var37.widget = var9; // L: 11078
										var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11079
										var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11080
										var37.args = var9.onMouseOver; // L: 11081
										Client.scriptEvents.addFirst(var37); // L: 11082
									}
								}

								if (var9.containsMouse && var35 && var9.onMouseRepeat != null) { // L: 11085 11086
									var37 = new ScriptEvent(); // L: 11087
									var37.isMouseInputEvent = true; // L: 11088
									var37.widget = var9; // L: 11089
									var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11090
									var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11091
									var37.args = var9.onMouseRepeat; // L: 11092
									Client.scriptEvents.addFirst(var37); // L: 11093
								}

								if (var9.containsMouse && !var35) { // L: 11096
									var9.containsMouse = false; // L: 11097
									if (var9.onMouseLeave != null) { // L: 11098
										var37 = new ScriptEvent(); // L: 11099
										var37.isMouseInputEvent = true; // L: 11100
										var37.widget = var9; // L: 11101
										var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11102
										var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11103
										var37.args = var9.onMouseLeave; // L: 11104
										Client.field528.addFirst(var37); // L: 11105
									}
								}

								if (var9.onTimer != null) { // L: 11108
									var37 = new ScriptEvent(); // L: 11109
									var37.widget = var9; // L: 11110
									var37.args = var9.onTimer; // L: 11111
									Client.field693.addFirst(var37); // L: 11112
								}

								ScriptEvent var25;
								int var39;
								int var40;
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field3501) { // L: 11114
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field3501 <= 32) { // L: 11115
										label842:
										for (var40 = var9.field3501; var40 < Client.changedVarpCount; ++var40) { // L: 11122
											var29 = Client.changedVarps[var40 & 31]; // L: 11123

											for (var39 = 0; var39 < var9.varTransmitTriggers.length; ++var39) { // L: 11124
												if (var29 == var9.varTransmitTriggers[var39]) { // L: 11125
													var25 = new ScriptEvent(); // L: 11126
													var25.widget = var9; // L: 11127
													var25.args = var9.onVarTransmit; // L: 11128
													Client.scriptEvents.addFirst(var25); // L: 11129
													break label842; // L: 11130
												}
											}
										}
									} else {
										var37 = new ScriptEvent(); // L: 11116
										var37.widget = var9; // L: 11117
										var37.args = var9.onVarTransmit; // L: 11118
										Client.scriptEvents.addFirst(var37); // L: 11119
									}

									var9.field3501 = Client.changedVarpCount; // L: 11135
								}

								if (var9.onInvTransmit != null && Client.field678 > var9.field3502) { // L: 11137
									if (var9.invTransmitTriggers != null && Client.field678 - var9.field3502 <= 32) { // L: 11138
										label818:
										for (var40 = var9.field3502; var40 < Client.field678; ++var40) { // L: 11145
											var29 = Client.changedItemContainers[var40 & 31]; // L: 11146

											for (var39 = 0; var39 < var9.invTransmitTriggers.length; ++var39) { // L: 11147
												if (var29 == var9.invTransmitTriggers[var39]) { // L: 11148
													var25 = new ScriptEvent(); // L: 11149
													var25.widget = var9; // L: 11150
													var25.args = var9.onInvTransmit; // L: 11151
													Client.scriptEvents.addFirst(var25); // L: 11152
													break label818; // L: 11153
												}
											}
										}
									} else {
										var37 = new ScriptEvent(); // L: 11139
										var37.widget = var9; // L: 11140
										var37.args = var9.onInvTransmit; // L: 11141
										Client.scriptEvents.addFirst(var37); // L: 11142
									}

									var9.field3502 = Client.field678; // L: 11158
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field3503) { // L: 11160
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field3503 <= 32) { // L: 11161
										label794:
										for (var40 = var9.field3503; var40 < Client.changedSkillsCount; ++var40) { // L: 11168
											var29 = Client.changedSkills[var40 & 31]; // L: 11169

											for (var39 = 0; var39 < var9.statTransmitTriggers.length; ++var39) { // L: 11170
												if (var29 == var9.statTransmitTriggers[var39]) { // L: 11171
													var25 = new ScriptEvent(); // L: 11172
													var25.widget = var9; // L: 11173
													var25.args = var9.onStatTransmit; // L: 11174
													Client.scriptEvents.addFirst(var25); // L: 11175
													break label794; // L: 11176
												}
											}
										}
									} else {
										var37 = new ScriptEvent(); // L: 11162
										var37.widget = var9; // L: 11163
										var37.args = var9.onStatTransmit; // L: 11164
										Client.scriptEvents.addFirst(var37); // L: 11165
									}

									var9.field3503 = Client.changedSkillsCount; // L: 11181
								}

								if (Client.chatCycle > var9.field3500 && var9.onChatTransmit != null) { // L: 11183
									var37 = new ScriptEvent(); // L: 11184
									var37.widget = var9; // L: 11185
									var37.args = var9.onChatTransmit; // L: 11186
									Client.scriptEvents.addFirst(var37); // L: 11187
								}

								if (Client.field710 > var9.field3500 && var9.onFriendTransmit != null) { // L: 11189
									var37 = new ScriptEvent(); // L: 11190
									var37.widget = var9; // L: 11191
									var37.args = var9.onFriendTransmit; // L: 11192
									Client.scriptEvents.addFirst(var37); // L: 11193
								}

								if (Client.field685 > var9.field3500 && var9.onClanTransmit != null) { // L: 11195
									var37 = new ScriptEvent(); // L: 11196
									var37.widget = var9; // L: 11197
									var37.args = var9.onClanTransmit; // L: 11198
									Client.scriptEvents.addFirst(var37); // L: 11199
								}

								if (Client.field477 > var9.field3500 && var9.field3476 != null) { // L: 11201
									var37 = new ScriptEvent(); // L: 11202
									var37.widget = var9; // L: 11203
									var37.args = var9.field3476; // L: 11204
									Client.scriptEvents.addFirst(var37); // L: 11205
								}

								if (Client.field687 > var9.field3500 && var9.field3369 != null) { // L: 11207
									var37 = new ScriptEvent(); // L: 11208
									var37.widget = var9; // L: 11209
									var37.args = var9.field3369; // L: 11210
									Client.scriptEvents.addFirst(var37); // L: 11211
								}

								if (Client.field684 > var9.field3500 && var9.onStockTransmit != null) { // L: 11213
									var37 = new ScriptEvent(); // L: 11214
									var37.widget = var9; // L: 11215
									var37.args = var9.onStockTransmit; // L: 11216
									Client.scriptEvents.addFirst(var37); // L: 11217
								}

								if (Client.field689 > var9.field3500 && var9.field3441 != null) { // L: 11219
									var37 = new ScriptEvent(); // L: 11220
									var37.widget = var9; // L: 11221
									var37.args = var9.field3441; // L: 11222
									Client.scriptEvents.addFirst(var37); // L: 11223
								}

								if (Client.field690 > var9.field3500 && var9.onMiscTransmit != null) { // L: 11225
									var37 = new ScriptEvent(); // L: 11226
									var37.widget = var9; // L: 11227
									var37.args = var9.onMiscTransmit; // L: 11228
									Client.scriptEvents.addFirst(var37); // L: 11229
								}

								var9.field3500 = Client.cycleCntr; // L: 11231
								if (var9.onKey != null) { // L: 11232
									for (var40 = 0; var40 < Client.field714; ++var40) { // L: 11233
										ScriptEvent var38 = new ScriptEvent(); // L: 11234
										var38.widget = var9; // L: 11235
										var38.keyTyped = Client.field716[var40]; // L: 11236
										var38.keyPressed = Client.field577[var40]; // L: 11237
										var38.args = var9.onKey; // L: 11238
										Client.scriptEvents.addFirst(var38); // L: 11239
									}
								}

								ScriptEvent var32;
								if (var9.field3472 != null) { // L: 11242
									var22 = class341.method6185(); // L: 11243

									for (var29 = 0; var29 < var22.length; ++var29) { // L: 11244
										var32 = new ScriptEvent(); // L: 11245
										var32.widget = var9; // L: 11246
										var32.keyTyped = var22[var29]; // L: 11247
										var32.args = var9.field3472; // L: 11248
										Client.scriptEvents.addFirst(var32); // L: 11249
									}
								}

								if (var9.field3493 != null) { // L: 11252
									var22 = RouteStrategy.method3814(); // L: 11253

									for (var29 = 0; var29 < var22.length; ++var29) { // L: 11254
										var32 = new ScriptEvent(); // L: 11255
										var32.widget = var9; // L: 11256
										var32.keyTyped = var22[var29]; // L: 11257
										var32.args = var9.field3493; // L: 11258
										Client.scriptEvents.addFirst(var32); // L: 11259
									}
								}
							}
						}

						if (!var9.isIf3) { // L: 11264
							if (Client.clickedWidget != null || class16.dragInventoryWidget != null || Client.isMenuOpen) { // L: 11265
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11266
								if (var9.mouseOverRedirect >= 0) { // L: 11267
									class113.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									class113.mousedOverWidgetIf1 = var9; // L: 11268
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11270
								EnumComposition.field1890 = var9; // L: 11271
							}

							if (var9.scrollHeight > var9.height) { // L: 11273
								WorldMapRegion.method4607(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) { // L: 11275
							updateInterface(var0, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY); // L: 11276
							if (var9.children != null) { // L: 11277
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)var9.id); // L: 11278
							if (var30 != null) { // L: 11279
								if (var30.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) { // L: 11280
									for (ScriptEvent var31 = (ScriptEvent)Client.scriptEvents.last(); var31 != null; var31 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11281
										if (var31.isMouseInputEvent) { // L: 11282
											var31.remove(); // L: 11283
											var31.widget.containsMouse = false; // L: 11284
										}
									}

									if (NPCComposition.widgetDragDuration == 0) { // L: 11287
										Client.clickedWidget = null; // L: 11288
										Client.clickedWidgetParent = null; // L: 11289
									}

									if (!Client.isMenuOpen) { // L: 11291
										Ignored.addCancelMenuEntry(); // L: 11292
									}
								}

								GraphicsObject.updateRootInterface(var30.group, var12, var13, var14, var15, var26, var11); // L: 11295
							}
						}
					}
				}
			}
		}

	} // L: 11299
}
