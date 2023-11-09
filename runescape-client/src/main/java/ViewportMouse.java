import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("af")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 2139535413
	)
	@Export("ViewportMouse_x")
	public static int ViewportMouse_x;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 148198745
	)
	@Export("ViewportMouse_y")
	public static int ViewportMouse_y;
	@ObfuscatedName("ac")
	@Export("ViewportMouse_false0")
	public static boolean ViewportMouse_false0;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1874962943
	)
	static int field2767;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1672023491
	)
	static int field2768;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1677061457
	)
	static int field2769;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1926934503
	)
	static int field2771;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1048050201
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("ag")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;
	@ObfuscatedName("hv")
	static String field2774;

	static {
		ViewportMouse_isInViewport = false; // L: 4
		ViewportMouse_x = 0; // L: 5
		ViewportMouse_y = 0; // L: 6
		ViewportMouse_false0 = false; // L: 7
		ViewportMouse_entityCount = 0; // L: 17
		ViewportMouse_entityTags = new long[1000]; // L: 18
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-119"
	)
	static int method4908(int var0) {
		return KeyHandler.KeyHandler_keyCodes[var0]; // L: 130
	}

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "([Lmq;IIIIIIII)V",
		garbageValue = "1611526345"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) { // L: 10814
			Widget var9 = var0[var8]; // L: 10815
			if (var9 != null && var9.parentId == var1 && (var9.method6374() || class25.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) { // L: 10816 10817 10818
				if (var9.isIf3) { // L: 10819
					if (class393.isComponentHidden(var9)) { // L: 10820
						continue;
					}
				} else if (var9.type == 0 && var9 != MidiPcmStream.mousedOverWidgetIf1 && class393.isComponentHidden(var9)) { // L: 10823
					continue;
				}

				if (var9.type == 11) { // L: 10825
					if (var9.method6415(class14.urlRequester)) { // L: 10826
						if (var9.method6382()) { // L: 10827
							class144.invalidateWidget(var9); // L: 10828
							DecorativeObject.revalidateWidgetScroll(var9.children, var9, true); // L: 10829
						}

						if (var9.field3653 != null) { // L: 10831
							ScriptEvent var10 = new ScriptEvent(); // L: 10832
							var10.widget = var9; // L: 10833
							var10.args = var9.field3653; // L: 10834
							Client.scriptEvents.addFirst(var10); // L: 10835
						}
					}
				} else if (var9.type == 12 && var9.method6440()) { // L: 10839 10840
					class144.invalidateWidget(var9); // L: 10841
				}

				int var26 = var9.x + var6; // L: 10844
				int var11 = var7 + var9.y; // L: 10845
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				if (var9.type == 9) { // L: 10850
					var16 = var26; // L: 10851
					var17 = var11; // L: 10852
					var18 = var26 + var9.width; // L: 10853
					int var19 = var11 + var9.height; // L: 10854
					if (var18 < var26) { // L: 10855
						var16 = var18; // L: 10857
						var18 = var26; // L: 10858
					}

					if (var19 < var11) { // L: 10860
						var17 = var19; // L: 10862
						var19 = var11; // L: 10863
					}

					++var18; // L: 10865
					++var19; // L: 10866
					var12 = var16 > var2 ? var16 : var2; // L: 10867
					var13 = var17 > var3 ? var17 : var3; // L: 10868
					var14 = var18 < var4 ? var18 : var4; // L: 10869
					var15 = var19 < var5 ? var19 : var5; // L: 10870
				} else {
					var16 = var26 + var9.width; // L: 10873
					var17 = var11 + var9.height; // L: 10874
					var12 = var26 > var2 ? var26 : var2; // L: 10875
					var13 = var11 > var3 ? var11 : var3; // L: 10876
					var14 = var16 < var4 ? var16 : var4; // L: 10877
					var15 = var17 < var5 ? var17 : var5; // L: 10878
				}

				if (var9 == Client.clickedWidget) { // L: 10880
					Client.field755 = true; // L: 10881
					Client.field676 = var26; // L: 10882
					Client.field677 = var11; // L: 10883
				}

				boolean var34 = false; // L: 10885
				if (var9.field3581) { // L: 10886
					switch(Client.field595) { // L: 10887
					case 0:
						var34 = true; // L: 10899
					case 1:
					default:
						break;
					case 2:
						if (Client.field658 == var9.id >>> 16) { // L: 10894
							var34 = true; // L: 10895
						}
						break;
					case 3:
						if (var9.id == Client.field658) { // L: 10889
							var34 = true; // L: 10890
						}
					}
				}

				if (var34 || !var9.isIf3 || var12 < var14 && var13 < var15) { // L: 10903
					if (var9.isIf3) { // L: 10904
						ScriptEvent var27;
						if (var9.noClickThrough) { // L: 10905
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10906
								for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10907
									if (var27.field1039) { // L: 10908
										var27.remove(); // L: 10909
										var27.widget.field3671 = false; // L: 10910
									}
								}

								WorldMapData_1.method5345(); // L: 10913
								if (class96.widgetDragDuration == 0) { // L: 10914
									Client.clickedWidget = null; // L: 10915
									Client.clickedWidgetParent = null; // L: 10916
								}

								if (!Client.isMenuOpen) { // L: 10918
									class156.addCancelMenuEntry(); // L: 10919
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10923 10924
							for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10925
								if (var27.field1039 && var27.widget.onScroll == var27.args) { // L: 10926
									var27.remove(); // L: 10927
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x; // L: 10933
					var18 = MouseHandler.MouseHandler_y; // L: 10934
					if (MouseHandler.MouseHandler_lastButton != 0) { // L: 10935
						var17 = MouseHandler.MouseHandler_lastPressedX; // L: 10936
						var18 = MouseHandler.MouseHandler_lastPressedY; // L: 10937
					}

					boolean var35 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15; // L: 10939
					if (var9.contentType == 1337) { // L: 10940
						if (!Client.field499 && !Client.isMenuOpen && var35) { // L: 10941
							ScriptFrame.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) { // L: 10944
						MusicPatchNode.checkIfMinimapClicked(var9, var26, var11); // L: 10945
					} else {
						if (var9.contentType == 1400) { // L: 10948
							class126.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height); // L: 10949
						}

						if (!Client.isMenuOpen && var35) { // L: 10951
							if (var9.contentType == 1400) { // L: 10952
								class126.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18); // L: 10953
							} else {
								class335.method6599(var9); // L: 10956
							}
						}

						boolean var21;
						int var23;
						if (var34) { // L: 10959
							for (int var20 = 0; var20 < var9.field3645.length; ++var20) { // L: 10960
								var21 = false; // L: 10961
								boolean var28 = false; // L: 10962
								if (!var21 && var9.field3645[var20] != null) { // L: 10963
									for (var23 = 0; var23 < var9.field3645[var20].length; ++var23) { // L: 10964
										boolean var24 = false; // L: 10965
										if (var9.field3643 != null) { // L: 10966
											var24 = Client.field721.method4229(var9.field3645[var20][var23]); // L: 10967
										}

										if (class81.method2249(var9.field3645[var20][var23]) || var24) { // L: 10969
											var21 = true; // L: 10970
											if (var9.field3643 != null && var9.field3643[var20] > Client.cycle) { // L: 10971
												break;
											}

											byte var33 = var9.field3646[var20][var23]; // L: 10972
											if (var33 == 0 || ((var33 & 8) == 0 || !Client.field721.method4229(86) && !Client.field721.method4229(82) && !Client.field721.method4229(81)) && ((var33 & 2) == 0 || Client.field721.method4229(86)) && ((var33 & 1) == 0 || Client.field721.method4229(82)) && ((var33 & 4) == 0 || Client.field721.method4229(81))) { // L: 10973 10974 10975 10976 10977
												var28 = true; // L: 10979
												break;
											}
										}
									}
								}

								if (var28) { // L: 10985
									if (var20 < 10) { // L: 10986
										Message.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) { // L: 10987
										class166.Widget_runOnTargetLeave(); // L: 10988
										class18.selectSpell(var9.id, var9.childIndex, class195.Widget_unpackTargetMask(class25.getWidgetFlags(var9)), var9.itemId); // L: 10989
										Client.selectedSpellActionName = MusicPatchNode.Widget_getSpellActionName(var9); // L: 10990
										if (Client.selectedSpellActionName == null) { // L: 10991
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + class383.colorStartTag(16777215); // L: 10992
									}

									var23 = var9.field3627[var20]; // L: 10994
									if (var9.field3643 == null) { // L: 10995
										var9.field3643 = new int[var9.field3645.length];
									}

									if (var9.field3670 == null) { // L: 10996
										var9.field3670 = new int[var9.field3645.length];
									}

									if (var23 != 0) { // L: 10997
										if (var9.field3643[var20] == 0) { // L: 10998
											var9.field3643[var20] = var23 + Client.cycle + var9.field3670[var20];
										} else {
											var9.field3643[var20] = var23 + Client.cycle; // L: 10999
										}
									} else {
										var9.field3643[var20] = Integer.MAX_VALUE; // L: 11001
									}
								}

								if (!var21 && var9.field3643 != null) { // L: 11003 11004
									var9.field3643[var20] = 0;
								}
							}
						}

						if (var9.isIf3) { // L: 11008
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11009
								var35 = true;
							} else {
								var35 = false; // L: 11010
							}

							boolean var36 = false; // L: 11011
							if ((MouseHandler.MouseHandler_currentButton == 1 || !class473.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) { // L: 11012
								var36 = true;
							}

							var21 = false; // L: 11013
							if ((MouseHandler.MouseHandler_lastButton == 1 || !class473.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) { // L: 11014
								var21 = true;
							}

							if (var21) { // L: 11015
								class370.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11); // L: 11016
							}

							if (var9.method6383()) { // L: 11018
								if (var21) { // L: 11019
									Client.field701.addFirst(new class206(0, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9)); // L: 11020
								}

								if (var36) { // L: 11022
									Client.field701.addFirst(new class206(1, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9)); // L: 11023
								}
							}

							if (var9.contentType == 1400) { // L: 11026
								class126.worldMap.method8473(var17, var18, var35 & var36, var35 & var21); // L: 11027
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && MusicPatchNode.method5983(class25.getWidgetFlags(var9))) { // L: 11029
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) { // L: 11030
								Client.field672 = true; // L: 11031
								Client.field627 = var26; // L: 11032
								Client.field674 = var11; // L: 11033
							}

							if (var9.hasListener) { // L: 11035
								ScriptEvent var22;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) { // L: 11036
									var22 = new ScriptEvent(); // L: 11037
									var22.field1039 = true; // L: 11038
									var22.widget = var9; // L: 11039
									var22.mouseY = Client.mouseWheelRotation; // L: 11040
									var22.args = var9.onScroll; // L: 11041
									Client.scriptEvents.addFirst(var22); // L: 11042
								}

								if (Client.clickedWidget != null || Client.isMenuOpen) { // L: 11044
									var21 = false; // L: 11045
									var36 = false; // L: 11046
									var35 = false; // L: 11047
								}

								if (!var9.field3662 && var21) { // L: 11049
									var9.field3662 = true; // L: 11050
									if (var9.onClick != null) { // L: 11051
										var22 = new ScriptEvent(); // L: 11052
										var22.field1039 = true; // L: 11053
										var22.widget = var9; // L: 11054
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var26; // L: 11055
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11; // L: 11056
										var22.args = var9.onClick; // L: 11057
										Client.scriptEvents.addFirst(var22); // L: 11058
									}
								}

								if (var9.field3662 && var36 && var9.onClickRepeat != null) { // L: 11061 11062
									var22 = new ScriptEvent(); // L: 11063
									var22.field1039 = true; // L: 11064
									var22.widget = var9; // L: 11065
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11066
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11067
									var22.args = var9.onClickRepeat; // L: 11068
									Client.scriptEvents.addFirst(var22); // L: 11069
								}

								if (var9.field3662 && !var36) { // L: 11072
									var9.field3662 = false; // L: 11073
									if (var9.onRelease != null) { // L: 11074
										var22 = new ScriptEvent(); // L: 11075
										var22.field1039 = true; // L: 11076
										var22.widget = var9; // L: 11077
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11078
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11079
										var22.args = var9.onRelease; // L: 11080
										Client.field700.addFirst(var22); // L: 11081
									}
								}

								if (var36 && var9.onHold != null) { // L: 11084 11085
									var22 = new ScriptEvent(); // L: 11086
									var22.field1039 = true; // L: 11087
									var22.widget = var9; // L: 11088
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11089
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11090
									var22.args = var9.onHold; // L: 11091
									Client.scriptEvents.addFirst(var22); // L: 11092
								}

								if (!var9.field3671 && var35) { // L: 11095
									var9.field3671 = true; // L: 11096
									if (var9.onMouseOver != null) { // L: 11097
										var22 = new ScriptEvent(); // L: 11098
										var22.field1039 = true; // L: 11099
										var22.widget = var9; // L: 11100
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11101
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11102
										var22.args = var9.onMouseOver; // L: 11103
										Client.scriptEvents.addFirst(var22); // L: 11104
									}
								}

								if (var9.field3671 && var35 && var9.onMouseRepeat != null) { // L: 11107 11108
									var22 = new ScriptEvent(); // L: 11109
									var22.field1039 = true; // L: 11110
									var22.widget = var9; // L: 11111
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11112
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11113
									var22.args = var9.onMouseRepeat; // L: 11114
									Client.scriptEvents.addFirst(var22); // L: 11115
								}

								if (var9.field3671 && !var35) { // L: 11118
									var9.field3671 = false; // L: 11119
									if (var9.onMouseLeave != null) { // L: 11120
										var22 = new ScriptEvent(); // L: 11121
										var22.field1039 = true; // L: 11122
										var22.widget = var9; // L: 11123
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11124
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11125
										var22.args = var9.onMouseLeave; // L: 11126
										Client.field700.addFirst(var22); // L: 11127
									}
								}

								if (var9.onTimer != null) { // L: 11130
									var22 = new ScriptEvent(); // L: 11131
									var22.widget = var9; // L: 11132
									var22.args = var9.onTimer; // L: 11133
									Client.field699.addFirst(var22); // L: 11134
								}

								ScriptEvent var25;
								int var37;
								int var39;
								if (var9.onVarTransmit != null && Client.field513 > var9.field3560) { // L: 11136
									if (var9.varTransmitTriggers != null && Client.field513 - var9.field3560 <= 32) { // L: 11137
										label829:
										for (var39 = var9.field3560; var39 < Client.field513; ++var39) { // L: 11144
											var23 = Client.field739[var39 & 31]; // L: 11145

											for (var37 = 0; var37 < var9.varTransmitTriggers.length; ++var37) { // L: 11146
												if (var23 == var9.varTransmitTriggers[var37]) { // L: 11147
													var25 = new ScriptEvent(); // L: 11148
													var25.widget = var9; // L: 11149
													var25.args = var9.onVarTransmit; // L: 11150
													Client.scriptEvents.addFirst(var25); // L: 11151
													break label829; // L: 11152
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11138
										var22.widget = var9; // L: 11139
										var22.args = var9.onVarTransmit; // L: 11140
										Client.scriptEvents.addFirst(var22); // L: 11141
									}

									var9.field3560 = Client.field513; // L: 11157
								}

								if (var9.onInvTransmit != null && Client.field683 > var9.field3711) { // L: 11159
									if (var9.invTransmitTriggers != null && Client.field683 - var9.field3711 <= 32) { // L: 11160
										label805:
										for (var39 = var9.field3711; var39 < Client.field683; ++var39) { // L: 11167
											var23 = Client.field719[var39 & 31]; // L: 11168

											for (var37 = 0; var37 < var9.invTransmitTriggers.length; ++var37) { // L: 11169
												if (var23 == var9.invTransmitTriggers[var37]) { // L: 11170
													var25 = new ScriptEvent(); // L: 11171
													var25.widget = var9; // L: 11172
													var25.args = var9.onInvTransmit; // L: 11173
													Client.scriptEvents.addFirst(var25); // L: 11174
													break label805; // L: 11175
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11161
										var22.widget = var9; // L: 11162
										var22.args = var9.onInvTransmit; // L: 11163
										Client.scriptEvents.addFirst(var22); // L: 11164
									}

									var9.field3711 = Client.field683; // L: 11180
								}

								if (var9.onStatTransmit != null && Client.field685 > var9.field3700) { // L: 11182
									if (var9.statTransmitTriggers != null && Client.field685 - var9.field3700 <= 32) { // L: 11183
										label781:
										for (var39 = var9.field3700; var39 < Client.field685; ++var39) { // L: 11190
											var23 = Client.field684[var39 & 31]; // L: 11191

											for (var37 = 0; var37 < var9.statTransmitTriggers.length; ++var37) { // L: 11192
												if (var23 == var9.statTransmitTriggers[var37]) { // L: 11193
													var25 = new ScriptEvent(); // L: 11194
													var25.widget = var9; // L: 11195
													var25.args = var9.onStatTransmit; // L: 11196
													Client.scriptEvents.addFirst(var25); // L: 11197
													break label781; // L: 11198
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11184
										var22.widget = var9; // L: 11185
										var22.args = var9.onStatTransmit; // L: 11186
										Client.scriptEvents.addFirst(var22); // L: 11187
									}

									var9.field3700 = Client.field685; // L: 11203
								}

								if (Client.chatCycle > var9.field3709 && var9.onChatTransmit != null) { // L: 11205
									var22 = new ScriptEvent(); // L: 11206
									var22.widget = var9; // L: 11207
									var22.args = var9.onChatTransmit; // L: 11208
									Client.scriptEvents.addFirst(var22); // L: 11209
								}

								if (Client.field689 > var9.field3709 && var9.onFriendTransmit != null) { // L: 11211
									var22 = new ScriptEvent(); // L: 11212
									var22.widget = var9; // L: 11213
									var22.args = var9.onFriendTransmit; // L: 11214
									Client.scriptEvents.addFirst(var22); // L: 11215
								}

								if (Client.field690 > var9.field3709 && var9.onClanTransmit != null) { // L: 11217
									var22 = new ScriptEvent(); // L: 11218
									var22.widget = var9; // L: 11219
									var22.args = var9.onClanTransmit; // L: 11220
									Client.scriptEvents.addFirst(var22); // L: 11221
								}

								if (Client.field691 > var9.field3709 && var9.field3637 != null) { // L: 11223
									var22 = new ScriptEvent(); // L: 11224
									var22.widget = var9; // L: 11225
									var22.args = var9.field3637; // L: 11226
									Client.scriptEvents.addFirst(var22); // L: 11227
								}

								if (Client.field692 > var9.field3709 && var9.field3566 != null) { // L: 11229
									var22 = new ScriptEvent(); // L: 11230
									var22.widget = var9; // L: 11231
									var22.args = var9.field3566; // L: 11232
									Client.scriptEvents.addFirst(var22); // L: 11233
								}

								if (Client.field762 > var9.field3709 && var9.onStockTransmit != null) { // L: 11235
									var22 = new ScriptEvent(); // L: 11236
									var22.widget = var9; // L: 11237
									var22.args = var9.onStockTransmit; // L: 11238
									Client.scriptEvents.addFirst(var22); // L: 11239
								}

								if (Client.field768 > var9.field3709 && var9.field3692 != null) { // L: 11241
									var22 = new ScriptEvent(); // L: 11242
									var22.widget = var9; // L: 11243
									var22.args = var9.field3692; // L: 11244
									Client.scriptEvents.addFirst(var22); // L: 11245
								}

								if (Client.field565 > var9.field3709 && var9.onMiscTransmit != null) { // L: 11247
									var22 = new ScriptEvent(); // L: 11248
									var22.widget = var9; // L: 11249
									var22.args = var9.onMiscTransmit; // L: 11250
									Client.scriptEvents.addFirst(var22); // L: 11251
								}

								var9.field3709 = Client.cycleCntr; // L: 11253
								if (var9.onKey != null) { // L: 11254
									for (var39 = 0; var39 < Client.field487; ++var39) { // L: 11255
										ScriptEvent var32 = new ScriptEvent(); // L: 11256
										var32.widget = var9; // L: 11257
										var32.keyTyped = Client.field556[var39]; // L: 11258
										var32.keyPressed = Client.field724[var39]; // L: 11259
										var32.args = var9.onKey; // L: 11260
										Client.scriptEvents.addFirst(var32); // L: 11261
									}
								}

								ScriptEvent var31;
								int[] var38;
								if (var9.field3681 != null) { // L: 11264
									var38 = Client.field721.method4216(); // L: 11265

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 11266
										var31 = new ScriptEvent(); // L: 11267
										var31.widget = var9; // L: 11268
										var31.keyTyped = var38[var23]; // L: 11269
										var31.args = var9.field3681; // L: 11270
										Client.scriptEvents.addFirst(var31); // L: 11271
									}
								}

								if (var9.field3582 != null) { // L: 11274
									var38 = Client.field721.method4213(); // L: 11275

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 11276
										var31 = new ScriptEvent(); // L: 11277
										var31.widget = var9; // L: 11278
										var31.keyTyped = var38[var23]; // L: 11279
										var31.args = var9.field3582; // L: 11280
										Client.scriptEvents.addFirst(var31); // L: 11281
									}
								}
							}
						}

						if (!var9.isIf3) { // L: 11286
							if (Client.clickedWidget != null || Client.isMenuOpen) { // L: 11287
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.field3596 != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11288
								if (var9.mouseOverRedirect >= 0) { // L: 11289
									MidiPcmStream.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									MidiPcmStream.mousedOverWidgetIf1 = var9; // L: 11290
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11292
								class130.field1574 = var9; // L: 11293
							}

							if (var9.scrollHeight > var9.height) { // L: 11295
								class166.method3547(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) { // L: 11297
							updateInterface(var0, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY); // L: 11298
							if (var9.children != null) { // L: 11299
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var29 = (InterfaceParent)Client.interfaceParents.get((long)var9.id); // L: 11300
							if (var29 != null) { // L: 11301
								if (var29.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) { // L: 11302
									for (ScriptEvent var30 = (ScriptEvent)Client.scriptEvents.last(); var30 != null; var30 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11303
										if (var30.field1039) { // L: 11304
											var30.remove(); // L: 11305
											var30.widget.field3671 = false; // L: 11306
										}
									}

									if (class96.widgetDragDuration == 0) { // L: 11309
										Client.clickedWidget = null; // L: 11310
										Client.clickedWidgetParent = null; // L: 11311
									}

									if (!Client.isMenuOpen) { // L: 11313
										class156.addCancelMenuEntry(); // L: 11314
									}
								}

								ReflectionCheck.updateRootInterface(var29.group, var12, var13, var14, var15, var26, var11); // L: 11317
							}
						}
					}
				}
			}
		}

	} // L: 11321
}
