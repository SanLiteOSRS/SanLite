import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class169 {
	@ObfuscatedName("al")
	static final void method3466(long var0) {
		try {
			Thread.sleep(var0); // L: 20
		} catch (InterruptedException var3) { // L: 22
		}

	} // L: 23

	@ObfuscatedName("ax")
	static final void method3464(long var0) {
		ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var0; // L: 99
	} // L: 100

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "([Lmy;IIIIIIII)V",
		garbageValue = "-2079694951"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) { // L: 10841
			Widget var9 = var0[var8]; // L: 10842
			if (var9 != null && var9.parentId == var1 && (var9.method6100() || ParamComposition.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) { // L: 10843 10844 10845
				if (var9.isIf3) { // L: 10846
					if (DecorativeObject.isComponentHidden(var9)) { // L: 10847
						continue;
					}
				} else if (var9.type == 0 && var9 != InvDefinition.mousedOverWidgetIf1 && DecorativeObject.isComponentHidden(var9)) { // L: 10850
					continue;
				}

				if (var9.type == 11) { // L: 10852
					if (var9.method6115(class345.urlRequester)) { // L: 10853
						if (var9.method6191()) { // L: 10854
							class69.invalidateWidget(var9); // L: 10855
							class278.revalidateWidgetScroll(var9.children, var9, true); // L: 10856
						}

						if (var9.field3648 != null) { // L: 10858
							ScriptEvent var10 = new ScriptEvent(); // L: 10859
							var10.widget = var9; // L: 10860
							var10.args = var9.field3648; // L: 10861
							Client.scriptEvents.addFirst(var10); // L: 10862
						}
					}
				} else if (var9.type == 12 && var9.method6123()) { // L: 10866 10867
					class69.invalidateWidget(var9); // L: 10868
				}

				int var26 = var9.x + var6; // L: 10871
				int var11 = var7 + var9.y; // L: 10872
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				if (var9.type == 9) { // L: 10877
					var16 = var26; // L: 10878
					var17 = var11; // L: 10879
					var18 = var26 + var9.width; // L: 10880
					int var19 = var11 + var9.height; // L: 10881
					if (var18 < var26) { // L: 10882
						var16 = var18; // L: 10884
						var18 = var26; // L: 10885
					}

					if (var19 < var11) { // L: 10887
						var17 = var19; // L: 10889
						var19 = var11; // L: 10890
					}

					++var18; // L: 10892
					++var19; // L: 10893
					var12 = var16 > var2 ? var16 : var2; // L: 10894
					var13 = var17 > var3 ? var17 : var3; // L: 10895
					var14 = var18 < var4 ? var18 : var4; // L: 10896
					var15 = var19 < var5 ? var19 : var5; // L: 10897
				} else {
					var16 = var26 + var9.width; // L: 10900
					var17 = var11 + var9.height; // L: 10901
					var12 = var26 > var2 ? var26 : var2; // L: 10902
					var13 = var11 > var3 ? var11 : var3; // L: 10903
					var14 = var16 < var4 ? var16 : var4; // L: 10904
					var15 = var17 < var5 ? var17 : var5; // L: 10905
				}

				if (var9 == Client.clickedWidget) { // L: 10907
					Client.field771 = true; // L: 10908
					Client.field572 = var26; // L: 10909
					Client.field668 = var11; // L: 10910
				}

				boolean var34 = false; // L: 10912
				if (var9.field3599) { // L: 10913
					switch(Client.field648) { // L: 10914
					case 0:
						var34 = true; // L: 10921
					case 1:
					default:
						break;
					case 2:
						if (Client.field763 == var9.id >>> 16) { // L: 10924
							var34 = true; // L: 10925
						}
						break;
					case 3:
						if (var9.id == Client.field763) { // L: 10916
							var34 = true; // L: 10917
						}
					}
				}

				if (var34 || !var9.isIf3 || var12 < var14 && var13 < var15) { // L: 10930
					if (var9.isIf3) { // L: 10931
						ScriptEvent var27;
						if (var9.noClickThrough) { // L: 10932
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10933
								for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10934
									if (var27.field1046) { // L: 10935
										var27.remove(); // L: 10936
										var27.widget.field3662 = false; // L: 10937
									}
								}

								class123.method2923(); // L: 10940
								if (class371.widgetDragDuration == 0) { // L: 10941
									Client.clickedWidget = null; // L: 10942
									Client.clickedWidgetParent = null; // L: 10943
								}

								if (!Client.isMenuOpen) { // L: 10945
									FriendsChatMember.addCancelMenuEntry(); // L: 10946
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10950 10951
							for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10952
								if (var27.field1046 && var27.widget.onScroll == var27.args) { // L: 10953
									var27.remove(); // L: 10954
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x; // L: 10960
					var18 = MouseHandler.MouseHandler_y; // L: 10961
					if (MouseHandler.MouseHandler_lastButton != 0) { // L: 10962
						var17 = MouseHandler.MouseHandler_lastPressedX; // L: 10963
						var18 = MouseHandler.MouseHandler_lastPressedY; // L: 10964
					}

					boolean var35 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15; // L: 10966
					if (var9.contentType == 1337) { // L: 10967
						if (!Client.isLoading && !Client.isMenuOpen && var35) { // L: 10968
							TextureProvider.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) { // L: 10971
						class110.checkIfMinimapClicked(var9, var26, var11); // L: 10972
					} else {
						if (var9.contentType == 1400) { // L: 10975
							WorldMapData_1.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height); // L: 10976
						}

						if (!Client.isMenuOpen && var35) { // L: 10978
							if (var9.contentType == 1400) { // L: 10979
								WorldMapData_1.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18); // L: 10980
							} else {
								Client.method1272(var9); // L: 10983
							}
						}

						boolean var21;
						int var23;
						if (var34) { // L: 10986
							for (int var20 = 0; var20 < var9.field3575.length; ++var20) { // L: 10987
								var21 = false; // L: 10988
								boolean var28 = false; // L: 10989
								if (!var21 && var9.field3575[var20] != null) { // L: 10990
									for (var23 = 0; var23 < var9.field3575[var20].length; ++var23) { // L: 10991
										boolean var24 = false; // L: 10992
										if (var9.field3670 != null) { // L: 10993
											var24 = Client.field712.method4074(var9.field3575[var20][var23]); // L: 10994
										}

										if (class150.method3190(var9.field3575[var20][var23]) || var24) { // L: 10996
											var21 = true; // L: 10997
											if (var9.field3670 != null && var9.field3670[var20] > Client.cycle) { // L: 10998
												break;
											}

											byte var33 = var9.field3601[var20][var23]; // L: 10999
											if (var33 == 0 || ((var33 & 8) == 0 || !Client.field712.method4074(86) && !Client.field712.method4074(82) && !Client.field712.method4074(81)) && ((var33 & 2) == 0 || Client.field712.method4074(86)) && ((var33 & 1) == 0 || Client.field712.method4074(82)) && ((var33 & 4) == 0 || Client.field712.method4074(81))) { // L: 11000 11001 11002 11003 11004
												var28 = true; // L: 11006
												break;
											}
										}
									}
								}

								if (var28) { // L: 11012
									if (var20 < 10) { // L: 11013
										class333.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) { // L: 11014
										GameEngine.Widget_runOnTargetLeave(); // L: 11015
										TaskHandler.selectSpell(var9.id, var9.childIndex, WorldMapDecorationType.Widget_unpackTargetMask(ParamComposition.getWidgetFlags(var9)), var9.itemId); // L: 11016
										Client.field711 = Archive.Widget_getSpellActionName(var9); // L: 11017
										if (Client.field711 == null) { // L: 11018
											Client.field711 = "null";
										}

										Client.field645 = var9.dataText + Canvas.colorStartTag(16777215); // L: 11019
									}

									var23 = var9.field3583[var20]; // L: 11021
									if (var9.field3670 == null) { // L: 11022
										var9.field3670 = new int[var9.field3575.length];
									}

									if (var9.field3603 == null) { // L: 11023
										var9.field3603 = new int[var9.field3575.length];
									}

									if (var23 != 0) { // L: 11024
										if (var9.field3670[var20] == 0) { // L: 11025
											var9.field3670[var20] = var23 + Client.cycle + var9.field3603[var20];
										} else {
											var9.field3670[var20] = var23 + Client.cycle; // L: 11026
										}
									} else {
										var9.field3670[var20] = Integer.MAX_VALUE; // L: 11028
									}
								}

								if (!var21 && var9.field3670 != null) { // L: 11030 11031
									var9.field3670[var20] = 0;
								}
							}
						}

						if (var9.isIf3) { // L: 11035
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11036
								var35 = true;
							} else {
								var35 = false; // L: 11037
							}

							boolean var36 = false; // L: 11038
							if ((MouseHandler.MouseHandler_currentButton == 1 || !class319.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) { // L: 11039
								var36 = true;
							}

							var21 = false; // L: 11040
							if ((MouseHandler.MouseHandler_lastButton == 1 || !class319.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) { // L: 11041
								var21 = true;
							}

							if (var21) { // L: 11042
								AbstractWorldMapData.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11); // L: 11043
							}

							if (var9.method6101()) { // L: 11045
								if (var21) { // L: 11046
									Client.field692.addFirst(new class207(0, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9)); // L: 11047
								}

								if (var36) { // L: 11049
									Client.field692.addFirst(new class207(1, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9)); // L: 11050
								}
							}

							if (var9.contentType == 1400) { // L: 11053
								WorldMapData_1.worldMap.method8070(var17, var18, var35 & var36, var35 & var21); // L: 11054
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && class283.method5455(ParamComposition.getWidgetFlags(var9))) { // L: 11056
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) { // L: 11057
								Client.field663 = true; // L: 11058
								Client.field664 = var26; // L: 11059
								Client.field597 = var11; // L: 11060
							}

							if (var9.hasListener) { // L: 11062
								ScriptEvent var22;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) { // L: 11063
									var22 = new ScriptEvent(); // L: 11064
									var22.field1046 = true; // L: 11065
									var22.widget = var9; // L: 11066
									var22.mouseY = Client.mouseWheelRotation; // L: 11067
									var22.args = var9.onScroll; // L: 11068
									Client.scriptEvents.addFirst(var22); // L: 11069
								}

								if (Client.clickedWidget != null || Client.isMenuOpen) { // L: 11071
									var21 = false; // L: 11072
									var36 = false; // L: 11073
									var35 = false; // L: 11074
								}

								if (!var9.field3663 && var21) { // L: 11076
									var9.field3663 = true; // L: 11077
									if (var9.onClick != null) { // L: 11078
										var22 = new ScriptEvent(); // L: 11079
										var22.field1046 = true; // L: 11080
										var22.widget = var9; // L: 11081
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var26; // L: 11082
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11; // L: 11083
										var22.args = var9.onClick; // L: 11084
										Client.scriptEvents.addFirst(var22); // L: 11085
									}
								}

								if (var9.field3663 && var36 && var9.onClickRepeat != null) { // L: 11088 11089
									var22 = new ScriptEvent(); // L: 11090
									var22.field1046 = true; // L: 11091
									var22.widget = var9; // L: 11092
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11093
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11094
									var22.args = var9.onClickRepeat; // L: 11095
									Client.scriptEvents.addFirst(var22); // L: 11096
								}

								if (var9.field3663 && !var36) { // L: 11099
									var9.field3663 = false; // L: 11100
									if (var9.onRelease != null) { // L: 11101
										var22 = new ScriptEvent(); // L: 11102
										var22.field1046 = true; // L: 11103
										var22.widget = var9; // L: 11104
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11105
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11106
										var22.args = var9.onRelease; // L: 11107
										Client.field529.addFirst(var22); // L: 11108
									}
								}

								if (var36 && var9.onHold != null) { // L: 11111 11112
									var22 = new ScriptEvent(); // L: 11113
									var22.field1046 = true; // L: 11114
									var22.widget = var9; // L: 11115
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11116
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11117
									var22.args = var9.onHold; // L: 11118
									Client.scriptEvents.addFirst(var22); // L: 11119
								}

								if (!var9.field3662 && var35) { // L: 11122
									var9.field3662 = true; // L: 11123
									if (var9.onMouseOver != null) { // L: 11124
										var22 = new ScriptEvent(); // L: 11125
										var22.field1046 = true; // L: 11126
										var22.widget = var9; // L: 11127
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11128
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11129
										var22.args = var9.onMouseOver; // L: 11130
										Client.scriptEvents.addFirst(var22); // L: 11131
									}
								}

								if (var9.field3662 && var35 && var9.onMouseRepeat != null) { // L: 11134 11135
									var22 = new ScriptEvent(); // L: 11136
									var22.field1046 = true; // L: 11137
									var22.widget = var9; // L: 11138
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11139
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11140
									var22.args = var9.onMouseRepeat; // L: 11141
									Client.scriptEvents.addFirst(var22); // L: 11142
								}

								if (var9.field3662 && !var35) { // L: 11145
									var9.field3662 = false; // L: 11146
									if (var9.onMouseLeave != null) { // L: 11147
										var22 = new ScriptEvent(); // L: 11148
										var22.field1046 = true; // L: 11149
										var22.widget = var9; // L: 11150
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11151
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11152
										var22.args = var9.onMouseLeave; // L: 11153
										Client.field529.addFirst(var22); // L: 11154
									}
								}

								if (var9.onTimer != null) { // L: 11157
									var22 = new ScriptEvent(); // L: 11158
									var22.widget = var9; // L: 11159
									var22.args = var9.onTimer; // L: 11160
									Client.field690.addFirst(var22); // L: 11161
								}

								ScriptEvent var25;
								int var37;
								int var39;
								if (var9.onVarTransmit != null && Client.field672 > var9.field3546) { // L: 11163
									if (var9.varTransmitTriggers != null && Client.field672 - var9.field3546 <= 32) { // L: 11164
										label821:
										for (var39 = var9.field3546; var39 < Client.field672; ++var39) { // L: 11171
											var23 = Client.field579[var39 & 31]; // L: 11172

											for (var37 = 0; var37 < var9.varTransmitTriggers.length; ++var37) { // L: 11173
												if (var23 == var9.varTransmitTriggers[var37]) { // L: 11174
													var25 = new ScriptEvent(); // L: 11175
													var25.widget = var9; // L: 11176
													var25.args = var9.onVarTransmit; // L: 11177
													Client.scriptEvents.addFirst(var25); // L: 11178
													break label821; // L: 11179
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11165
										var22.widget = var9; // L: 11166
										var22.args = var9.onVarTransmit; // L: 11167
										Client.scriptEvents.addFirst(var22); // L: 11168
									}

									var9.field3546 = Client.field672; // L: 11184
								}

								if (var9.onInvTransmit != null && Client.field666 > var9.field3666) { // L: 11186
									if (var9.invTransmitTriggers != null && Client.field666 - var9.field3666 <= 32) { // L: 11187
										label797:
										for (var39 = var9.field3666; var39 < Client.field666; ++var39) { // L: 11194
											var23 = Client.changedItemContainers[var39 & 31]; // L: 11195

											for (var37 = 0; var37 < var9.invTransmitTriggers.length; ++var37) { // L: 11196
												if (var23 == var9.invTransmitTriggers[var37]) { // L: 11197
													var25 = new ScriptEvent(); // L: 11198
													var25.widget = var9; // L: 11199
													var25.args = var9.onInvTransmit; // L: 11200
													Client.scriptEvents.addFirst(var25); // L: 11201
													break label797; // L: 11202
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11188
										var22.widget = var9; // L: 11189
										var22.args = var9.onInvTransmit; // L: 11190
										Client.scriptEvents.addFirst(var22); // L: 11191
									}

									var9.field3666 = Client.field666; // L: 11207
								}

								if (var9.onStatTransmit != null && Client.field676 > var9.field3594) { // L: 11209
									if (var9.statTransmitTriggers != null && Client.field676 - var9.field3594 <= 32) { // L: 11210
										label773:
										for (var39 = var9.field3594; var39 < Client.field676; ++var39) { // L: 11217
											var23 = Client.field675[var39 & 31]; // L: 11218

											for (var37 = 0; var37 < var9.statTransmitTriggers.length; ++var37) { // L: 11219
												if (var23 == var9.statTransmitTriggers[var37]) { // L: 11220
													var25 = new ScriptEvent(); // L: 11221
													var25.widget = var9; // L: 11222
													var25.args = var9.onStatTransmit; // L: 11223
													Client.scriptEvents.addFirst(var25); // L: 11224
													break label773; // L: 11225
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11211
										var22.widget = var9; // L: 11212
										var22.args = var9.onStatTransmit; // L: 11213
										Client.scriptEvents.addFirst(var22); // L: 11214
									}

									var9.field3594 = Client.field676; // L: 11230
								}

								if (Client.chatCycle > var9.field3623 && var9.onChatTransmit != null) { // L: 11232
									var22 = new ScriptEvent(); // L: 11233
									var22.widget = var9; // L: 11234
									var22.args = var9.onChatTransmit; // L: 11235
									Client.scriptEvents.addFirst(var22); // L: 11236
								}

								if (Client.field701 > var9.field3623 && var9.onFriendTransmit != null) { // L: 11238
									var22 = new ScriptEvent(); // L: 11239
									var22.widget = var9; // L: 11240
									var22.args = var9.onFriendTransmit; // L: 11241
									Client.scriptEvents.addFirst(var22); // L: 11242
								}

								if (Client.field525 > var9.field3623 && var9.onClanTransmit != null) { // L: 11244
									var22 = new ScriptEvent(); // L: 11245
									var22.widget = var9; // L: 11246
									var22.args = var9.onClanTransmit; // L: 11247
									Client.scriptEvents.addFirst(var22); // L: 11248
								}

								if (Client.field682 > var9.field3623 && var9.field3640 != null) { // L: 11250
									var22 = new ScriptEvent(); // L: 11251
									var22.widget = var9; // L: 11252
									var22.args = var9.field3640; // L: 11253
									Client.scriptEvents.addFirst(var22); // L: 11254
								}

								if (Client.field482 > var9.field3623 && var9.field3641 != null) { // L: 11256
									var22 = new ScriptEvent(); // L: 11257
									var22.widget = var9; // L: 11258
									var22.args = var9.field3641; // L: 11259
									Client.scriptEvents.addFirst(var22); // L: 11260
								}

								if (Client.field643 > var9.field3623 && var9.onStockTransmit != null) { // L: 11262
									var22 = new ScriptEvent(); // L: 11263
									var22.widget = var9; // L: 11264
									var22.args = var9.onStockTransmit; // L: 11265
									Client.scriptEvents.addFirst(var22); // L: 11266
								}

								if (Client.field685 > var9.field3623 && var9.field3647 != null) { // L: 11268
									var22 = new ScriptEvent(); // L: 11269
									var22.widget = var9; // L: 11270
									var22.args = var9.field3647; // L: 11271
									Client.scriptEvents.addFirst(var22); // L: 11272
								}

								if (Client.field686 > var9.field3623 && var9.onMiscTransmit != null) { // L: 11274
									var22 = new ScriptEvent(); // L: 11275
									var22.widget = var9; // L: 11276
									var22.args = var9.onMiscTransmit; // L: 11277
									Client.scriptEvents.addFirst(var22); // L: 11278
								}

								var9.field3623 = Client.cycleCntr; // L: 11280
								if (var9.onKey != null) { // L: 11281
									for (var39 = 0; var39 < Client.field714; ++var39) { // L: 11282
										ScriptEvent var32 = new ScriptEvent(); // L: 11283
										var32.widget = var9; // L: 11284
										var32.keyTyped = Client.field716[var39]; // L: 11285
										var32.keyPressed = Client.field641[var39]; // L: 11286
										var32.args = var9.onKey; // L: 11287
										Client.scriptEvents.addFirst(var32); // L: 11288
									}
								}

								ScriptEvent var31;
								int[] var38;
								if (var9.field3636 != null) { // L: 11291
									var38 = Client.field712.method4109(); // L: 11292

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 11293
										var31 = new ScriptEvent(); // L: 11294
										var31.widget = var9; // L: 11295
										var31.keyTyped = var38[var23]; // L: 11296
										var31.args = var9.field3636; // L: 11297
										Client.scriptEvents.addFirst(var31); // L: 11298
									}
								}

								if (var9.field3541 != null) { // L: 11301
									var38 = Client.field712.method4088(); // L: 11302

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 11303
										var31 = new ScriptEvent(); // L: 11304
										var31.widget = var9; // L: 11305
										var31.keyTyped = var38[var23]; // L: 11306
										var31.args = var9.field3541; // L: 11307
										Client.scriptEvents.addFirst(var31); // L: 11308
									}
								}
							}
						}

						if (!var9.isIf3) { // L: 11313
							if (Client.clickedWidget != null || Client.isMenuOpen) { // L: 11314
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11315
								if (var9.mouseOverRedirect >= 0) { // L: 11316
									InvDefinition.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									InvDefinition.mousedOverWidgetIf1 = var9; // L: 11317
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11319
								Script.field975 = var9; // L: 11320
							}

							if (var9.scrollHeight > var9.height) { // L: 11322
								InterfaceParent.method2255(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) { // L: 11324
							updateInterface(var0, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY); // L: 11325
							if (var9.children != null) { // L: 11326
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var29 = (InterfaceParent)Client.interfaceParents.get((long)var9.id); // L: 11327
							if (var29 != null) { // L: 11328
								if (var29.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) { // L: 11329
									for (ScriptEvent var30 = (ScriptEvent)Client.scriptEvents.last(); var30 != null; var30 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11330
										if (var30.field1046) { // L: 11331
											var30.remove(); // L: 11332
											var30.widget.field3662 = false; // L: 11333
										}
									}

									if (class371.widgetDragDuration == 0) { // L: 11336
										Client.clickedWidget = null; // L: 11337
										Client.clickedWidgetParent = null; // L: 11338
									}

									if (!Client.isMenuOpen) { // L: 11340
										FriendsChatMember.addCancelMenuEntry(); // L: 11341
									}
								}

								AbstractWorldMapData.updateRootInterface(var29.group, var12, var13, var14, var15, var26, var11); // L: 11344
							}
						}
					}
				}
			}
		}

	} // L: 11348

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1184231221"
	)
	static final void method3465() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 11974
			Player var1 = Client.players[Players.Players_indices[var0]]; // L: 11975
			var1.clearIsInFriendsChat(); // L: 11976
		}

	} // L: 11978
}
