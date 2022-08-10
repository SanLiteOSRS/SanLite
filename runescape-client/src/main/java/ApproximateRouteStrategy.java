import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bf")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	ApproximateRouteStrategy() {
	} // L: 12534

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIILgr;I)Z",
		garbageValue = "309597362"
	)
	@Export("hasArrived")
	public boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY; // L: 12538
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-882304244"
	)
	static final void method1088(String var0) {
		PacketBufferNode var1 = class433.getPacketBufferNode(ClientPacket.field2959, Client.packetWriter.isaacCipher); // L: 113
		var1.packetBuffer.writeByte(class92.stringCp1252NullTerminatedByteSize(var0)); // L: 114
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 115
		Client.packetWriter.addNode(var1); // L: 116
	} // L: 117

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZB)I",
		garbageValue = "21"
	)
	static int method1093(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 2134
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.cycle; // L: 2135
			return 1; // L: 2136
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 2138
				TaskHandler.Interpreter_intStackSize -= 2; // L: 2139
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 2140
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 2141
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class119.method2817(var3, var4); // L: 2142
				return 1; // L: 2143
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 2145
				TaskHandler.Interpreter_intStackSize -= 2; // L: 2146
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 2147
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 2148
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapElement.ItemContainer_getCount(var3, var4); // L: 2149
				return 1; // L: 2150
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 2152
				TaskHandler.Interpreter_intStackSize -= 2; // L: 2153
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 2154
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 2155
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class20.method294(var3, var4); // L: 2156
				return 1; // L: 2157
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 2159
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2160
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = ModelData0.getInvDefinition(var3).size; // L: 2161
				return 1; // L: 2162
			} else if (var0 == ScriptOpcodes.STAT) { // L: 2164
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2165
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.currentLevels[var3]; // L: 2166
				return 1; // L: 2167
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 2169
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2170
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.levels[var3]; // L: 2171
				return 1; // L: 2172
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 2174
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2175
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.experience[var3]; // L: 2176
				return 1; // L: 2177
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 2179
					var3 = FriendSystem.Client_plane; // L: 2180
					var4 = class300.baseX * 64 + (class28.localPlayer.x >> 7); // L: 2181
					var5 = Message.baseY * 64 + (class28.localPlayer.y >> 7); // L: 2182
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28); // L: 2183
					return 1; // L: 2184
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 2186
					var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2187
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3 >> 14 & 16383; // L: 2188
					return 1; // L: 2189
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 2191
					var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2192
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3 >> 28; // L: 2193
					return 1; // L: 2194
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 2196
					var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2197
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3 & 16383; // L: 2198
					return 1; // L: 2199
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 2201
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0; // L: 2202
					return 1; // L: 2203
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 2205
					TaskHandler.Interpreter_intStackSize -= 2; // L: 2206
					var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize] + 32768; // L: 2207
					var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 2208
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class119.method2817(var3, var4); // L: 2209
					return 1; // L: 2210
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 2212
					TaskHandler.Interpreter_intStackSize -= 2; // L: 2213
					var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize] + 32768; // L: 2214
					var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 2215
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapElement.ItemContainer_getCount(var3, var4); // L: 2216
					return 1; // L: 2217
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 2219
					TaskHandler.Interpreter_intStackSize -= 2; // L: 2220
					var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize] + 32768; // L: 2221
					var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 2222
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class20.method294(var3, var4); // L: 2223
					return 1; // L: 2224
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 2226
					if (Client.staffModLevel >= 2) { // L: 2227
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 2228
					}

					return 1; // L: 2229
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 2231
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.rebootTimer; // L: 2232
					return 1; // L: 2233
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 2235
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.worldId; // L: 2236
					return 1; // L: 2237
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 2239
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.runEnergy; // L: 2240
					return 1; // L: 2241
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 2243
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.weight; // L: 2244
					return 1; // L: 2245
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 2247
					if (Client.playerMod) { // L: 2248
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 2249
					}

					return 1; // L: 2250
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 2252
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.worldProperties; // L: 2253
					return 1; // L: 2254
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 2256
					TaskHandler.Interpreter_intStackSize -= 4; // L: 2257
					var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 2258
					var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 2259
					var5 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2]; // L: 2260
					int var6 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 3]; // L: 2261
					var3 += var4 << 14; // L: 2262
					var3 += var5 << 28; // L: 2263
					var3 += var6; // L: 2264
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3; // L: 2265
					return 1; // L: 2266
				} else if (var0 == 3326) { // L: 2268
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.field548; // L: 2269
					return 1; // L: 2270
				} else if (var0 == 3327) { // L: 2272
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.field497; // L: 2273
					return 1; // L: 2274
				} else {
					return 2; // L: 2276
				}
			}
		}
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "([Lku;IIIIIIIII)V",
		garbageValue = "1724919268"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9956
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 9957

		for (int var9 = 0; var9 < var0.length; ++var9) { // L: 9958
			Widget var10 = var0[var9]; // L: 9959
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) { // L: 9960 9961
				int var11;
				if (var8 == -1) { // L: 9963
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6; // L: 9964
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y; // L: 9965
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width; // L: 9966
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height; // L: 9967
					var11 = ++Client.rootWidgetCount - 1; // L: 9968
				} else {
					var11 = var8; // L: 9970
				}

				var10.rootIndex = var11; // L: 9971
				var10.cycle = Client.cycle; // L: 9972
				if (!var10.isIf3 || !ModeWhere.isComponentHidden(var10)) { // L: 9973
					if (var10.contentType > 0) { // L: 9974
						MouseHandler.method598(var10);
					}

					int var12 = var10.x + var6; // L: 9975
					int var13 = var7 + var10.y; // L: 9976
					int var14 = var10.transparencyTop; // L: 9977
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) { // L: 9978
						if (var1 != -1412584499 && !var10.isScrollBar) { // L: 9979
							class120.field1486 = var0; // L: 9980
							class124.field1525 = var6; // L: 9981
							WorldMapLabelSize.field2667 = var7; // L: 9982
							continue;
						}

						if (Client.isDraggingWidget && Client.field675) { // L: 9985
							var15 = MouseHandler.MouseHandler_x; // L: 9986
							var16 = MouseHandler.MouseHandler_y; // L: 9987
							var15 -= Client.widgetClickX; // L: 9988
							var16 -= Client.widgetClickY; // L: 9989
							if (var15 < Client.field676) { // L: 9990
								var15 = Client.field676;
							}

							if (var15 + var10.width > Client.field676 + Client.clickedWidgetParent.width) { // L: 9991
								var15 = Client.field676 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field751) { // L: 9992
								var16 = Client.field751;
							}

							if (var16 + var10.height > Client.field751 + Client.clickedWidgetParent.height) { // L: 9993
								var16 = Client.field751 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15; // L: 9994
							var13 = var16; // L: 9995
						}

						if (!var10.isScrollBar) { // L: 9997
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 2) { // L: 10003
						var15 = var2; // L: 10004
						var16 = var3; // L: 10005
						var17 = var4; // L: 10006
						var18 = var5; // L: 10007
					} else if (var10.type == 9) { // L: 10009
						var19 = var12; // L: 10010
						var20 = var13; // L: 10011
						var21 = var12 + var10.width; // L: 10012
						var22 = var13 + var10.height; // L: 10013
						if (var21 < var12) { // L: 10014
							var19 = var21; // L: 10016
							var21 = var12; // L: 10017
						}

						if (var22 < var13) { // L: 10019
							var20 = var22; // L: 10021
							var22 = var13; // L: 10022
						}

						++var21; // L: 10024
						++var22; // L: 10025
						var15 = var19 > var2 ? var19 : var2; // L: 10026
						var16 = var20 > var3 ? var20 : var3; // L: 10027
						var17 = var21 < var4 ? var21 : var4; // L: 10028
						var18 = var22 < var5 ? var22 : var5; // L: 10029
					} else {
						var19 = var12 + var10.width; // L: 10032
						var20 = var13 + var10.height; // L: 10033
						var15 = var12 > var2 ? var12 : var2; // L: 10034
						var16 = var13 > var3 ? var13 : var3; // L: 10035
						var17 = var19 < var4 ? var19 : var4; // L: 10036
						var18 = var20 < var5 ? var20 : var5; // L: 10037
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) { // L: 10039
						if (var10.contentType != 0) { // L: 10040
							if (var10.contentType == 1336) { // L: 10041
								if (class260.clientPreferences.method2339()) { // L: 10042
									var13 += 15; // L: 10043
									class149.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1); // L: 10044
									var13 += 15; // L: 10045
									Runtime var42 = Runtime.getRuntime(); // L: 10046
									var20 = (int)((var42.totalMemory() - var42.freeMemory()) / 1024L); // L: 10047
									var21 = 16776960; // L: 10048
									if (var20 > 327680 && !Client.isLowDetail) { // L: 10049
										var21 = 16711680;
									}

									class149.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1); // L: 10050
									var13 += 15; // L: 10051
								}
								continue;
							}

							if (var10.contentType == 1337) { // L: 10055
								Client.viewportX = var12; // L: 10056
								Client.viewportY = var13; // L: 10057
								ReflectionCheck.drawEntities(var12, var13, var10.width, var10.height); // L: 10058
								Client.field610[var10.rootIndex] = true; // L: 10059
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10060
								continue; // L: 10061
							}

							if (var10.contentType == 1338) { // L: 10063
								ViewportMouse.drawMinimap(var10, var12, var13, var11); // L: 10064
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10065
								continue; // L: 10066
							}

							if (var10.contentType == 1339) { // L: 10068
								class348.drawCompass(var10, var12, var13, var11); // L: 10069
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10070
								continue; // L: 10071
							}

							if (var10.contentType == 1400) { // L: 10073
								class344.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle); // L: 10074
							}

							if (var10.contentType == 1401) { // L: 10076
								class344.worldMap.drawOverview(var12, var13, var10.width, var10.height); // L: 10077
							}

							if (var10.contentType == 1402) { // L: 10079
								RouteStrategy.loginScreenRunesAnimation.draw(var12, Client.cycle); // L: 10080
							}
						}

						if (var10.type == 0) { // L: 10083
							if (!var10.isIf3 && ModeWhere.isComponentHidden(var10) && var10 != FontName.mousedOverWidgetIf1) { // L: 10084
								continue;
							}

							if (!var10.isIf3) { // L: 10085
								if (var10.scrollY > var10.scrollHeight - var10.height) { // L: 10086
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) { // L: 10087
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11); // L: 10089
							if (var10.children != null) { // L: 10090
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)var10.id); // L: 10091
							if (var30 != null) { // L: 10092
								WorldMapSection0.drawWidgets(var30.group, var15, var16, var17, var18, var12, var13, var11); // L: 10093
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10095
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 10096
						} else if (var10.type == 11) { // L: 10098
							if (ModeWhere.isComponentHidden(var10) && var10 != FontName.mousedOverWidgetIf1) { // L: 10099
								continue;
							}

							if (var10.children != null) { // L: 10100
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10101
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 10102
						}

						if (Client.isResizable || Client.field550[var11] || Client.gameDrawingMode > 1) { // L: 10104
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) { // L: 10105 10106
								VerticalAlignment.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) { // L: 10108
								int var23;
								int var24;
								int var25;
								int var26;
								if (var10.type == 2) { // L: 10111
									var19 = 0; // L: 10112

									for (var20 = 0; var20 < var10.rawHeight; ++var20) { // L: 10113
										for (var21 = 0; var21 < var10.rawWidth; ++var21) { // L: 10114
											var22 = var21 * (var10.paddingX + 32) + var12; // L: 10115
											var23 = var20 * (var10.paddingY + 32) + var13; // L: 10116
											if (var19 < 20) { // L: 10117
												var22 += var10.inventoryXOffsets[var19]; // L: 10118
												var23 += var10.inventoryYOffsets[var19]; // L: 10119
											}

											if (var10.itemIds[var19] <= 0) { // L: 10121
												if (var10.inventorySprites != null && var19 < 20) { // L: 10166
													SpritePixels var46 = var10.getInventorySprite(var19); // L: 10167
													if (var46 != null) { // L: 10168
														var46.drawTransBgAt(var22, var23);
													} else if (Widget.field3363) { // L: 10169
														class220.invalidateWidget(var10);
													}
												}
											} else {
												boolean var37 = false; // L: 10122
												boolean var38 = false; // L: 10123
												var26 = var10.itemIds[var19] - 1; // L: 10124
												if (var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == class115.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 10125
													SpritePixels var35;
													if (Client.isItemSelected == 1 && var19 == GrandExchangeOfferOwnWorldComparator.selectedItemSlot && var10.id == GraphicsObject.selectedItemWidget) { // L: 10127
														var35 = VarbitComposition.getItemSprite(var26, var10.itemQuantities[var19], 2, 0, 2, false);
													} else {
														var35 = VarbitComposition.getItemSprite(var26, var10.itemQuantities[var19], 1, 3153952, 2, false); // L: 10128
													}

													if (var35 != null) { // L: 10129
														if (var10 == class115.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 10130
															var24 = MouseHandler.MouseHandler_x - Client.draggedWidgetX; // L: 10131
															var25 = MouseHandler.MouseHandler_y - Client.draggedWidgetY; // L: 10132
															if (var24 < 5 && var24 > -5) { // L: 10133
																var24 = 0;
															}

															if (var25 < 5 && var25 > -5) { // L: 10134
																var25 = 0;
															}

															if (Client.itemDragDuration < 5) { // L: 10135
																var24 = 0; // L: 10136
																var25 = 0; // L: 10137
															}

															var35.drawTransAt(var24 + var22, var23 + var25, 128); // L: 10139
															if (var1 != -1) { // L: 10140
																Widget var28 = var0[var1 & 65535]; // L: 10141
																int var29;
																if (var23 + var25 < Rasterizer2D.Rasterizer2D_yClipStart && var28.scrollY > 0) { // L: 10142
																	var29 = (Rasterizer2D.Rasterizer2D_yClipStart - var23 - var25) * Client.field744 / 3; // L: 10143
																	if (var29 > Client.field744 * 10) { // L: 10144
																		var29 = Client.field744 * 10;
																	}

																	if (var29 > var28.scrollY) { // L: 10145
																		var29 = var28.scrollY;
																	}

																	var28.scrollY -= var29; // L: 10146
																	Client.draggedWidgetY += var29; // L: 10147
																	class220.invalidateWidget(var28); // L: 10148
																}

																if (var25 + var23 + 32 > Rasterizer2D.Rasterizer2D_yClipEnd && var28.scrollY < var28.scrollHeight - var28.height) { // L: 10150
																	var29 = (var25 + var23 + 32 - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.field744 / 3; // L: 10151
																	if (var29 > Client.field744 * 10) { // L: 10152
																		var29 = Client.field744 * 10;
																	}

																	if (var29 > var28.scrollHeight - var28.height - var28.scrollY) { // L: 10153
																		var29 = var28.scrollHeight - var28.height - var28.scrollY;
																	}

																	var28.scrollY += var29; // L: 10154
																	Client.draggedWidgetY -= var29; // L: 10155
																	class220.invalidateWidget(var28); // L: 10156
																}
															}
														} else if (var10 == class121.field1488 && var19 == Client.field602) { // L: 10160
															var35.drawTransAt(var22, var23, 128);
														} else {
															var35.drawTransBgAt(var22, var23); // L: 10161
														}
													} else {
														class220.invalidateWidget(var10); // L: 10163
													}
												}
											}

											++var19; // L: 10171
										}
									}
								} else if (var10.type == 3) { // L: 10176
									if (FriendSystem.runCs1(var10)) { // L: 10178
										var19 = var10.color2; // L: 10179
										if (var10 == FontName.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 10180
											var19 = var10.mouseOverColor2;
										}
									} else {
										var19 = var10.color; // L: 10183
										if (var10 == FontName.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 10184
											var19 = var10.mouseOverColor;
										}
									}

									if (var10.fill) { // L: 10186
										switch(var10.fillMode.field4786) { // L: 10187
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2); // L: 10193
											break; // L: 10194
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255)); // L: 10196
											break; // L: 10197
										default:
											if (var14 == 0) { // L: 10189
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10190
											}
										}
									} else if (var14 == 0) { // L: 10201
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10202
									}
								} else {
									Font var39;
									if (var10.type == 4) { // L: 10206
										var39 = var10.getFont(); // L: 10207
										if (var39 == null) { // L: 10208
											if (Widget.field3363) { // L: 10209
												class220.invalidateWidget(var10);
											}
										} else {
											String var44 = var10.text; // L: 10213
											if (FriendSystem.runCs1(var10)) { // L: 10214
												var20 = var10.color2; // L: 10215
												if (var10 == FontName.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 10216
													var20 = var10.mouseOverColor2;
												}

												if (var10.text2.length() > 0) { // L: 10217
													var44 = var10.text2;
												}
											} else {
												var20 = var10.color; // L: 10220
												if (var10 == FontName.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 10221
													var20 = var10.mouseOverColor;
												}
											}

											if (var10.isIf3 && var10.itemId != -1) { // L: 10223
												ItemComposition var45 = class258.ItemComposition_get(var10.itemId); // L: 10224
												var44 = var45.name; // L: 10225
												if (var44 == null) { // L: 10226
													var44 = "null";
												}

												if ((var45.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) { // L: 10227
													var44 = class82.colorStartTag(16748608) + var44 + "</col>" + " " + 'x' + class348.formatItemStacks(var10.itemQuantity);
												}
											}

											if (var10 == Client.meslayerContinueWidget) { // L: 10229
												var44 = "Please wait..."; // L: 10230
												var20 = var10.color; // L: 10231
											}

											if (!var10.isIf3) { // L: 10233
												var44 = ParamComposition.method3572(var44, var10);
											}

											var39.drawLines(var44, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight); // L: 10234
										}
									} else if (var10.type == 5) { // L: 10237
										SpritePixels var40;
										if (!var10.isIf3) { // L: 10238
											var40 = var10.getSprite(FriendSystem.runCs1(var10), class152.urlRequester); // L: 10239
											if (var40 != null) { // L: 10240
												var40.drawTransBgAt(var12, var13);
											} else if (Widget.field3363) { // L: 10241
												class220.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) { // L: 10245
												var40 = VarbitComposition.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var40 = var10.getSprite(false, class152.urlRequester); // L: 10246
											}

											if (var40 == null) { // L: 10247
												if (Widget.field3363) { // L: 10271
													class220.invalidateWidget(var10);
												}
											} else {
												var20 = var40.width; // L: 10248
												var21 = var40.height; // L: 10249
												if (!var10.spriteTiling) { // L: 10250
													var22 = var10.width * 4096 / var20; // L: 10264
													if (var10.spriteAngle != 0) { // L: 10265
														var40.method8199(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) { // L: 10266
														var40.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) { // L: 10267
														var40.drawTransBgAt(var12, var13); // L: 10268
													} else {
														var40.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height); // L: 10251
													var22 = (var20 - 1 + var10.width) / var20; // L: 10252
													var23 = (var21 - 1 + var10.height) / var21; // L: 10253

													for (var24 = 0; var24 < var22; ++var24) { // L: 10254
														for (var25 = 0; var25 < var23; ++var25) { // L: 10255
															if (var10.spriteAngle != 0) { // L: 10256
																var40.method8199(var20 / 2 + var12 + var24 * var20, var21 / 2 + var13 + var21 * var25, var10.spriteAngle, 4096);
															} else if (var14 != 0) { // L: 10257
																var40.drawTransAt(var12 + var24 * var20, var13 + var21 * var25, 256 - (var14 & 255));
															} else {
																var40.drawTransBgAt(var12 + var20 * var24, var13 + var21 * var25); // L: 10258
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10261
												}
											}
										}
									} else {
										ItemComposition var33;
										if (var10.type == 6) { // L: 10275
											boolean var36 = FriendSystem.runCs1(var10); // L: 10276
											if (var36) { // L: 10278
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId; // L: 10279
											}

											Model var41 = null; // L: 10280
											var22 = 0; // L: 10281
											if (var10.itemId != -1) { // L: 10282
												var33 = class258.ItemComposition_get(var10.itemId); // L: 10283
												if (var33 != null) { // L: 10284
													var33 = var33.getCountObj(var10.itemQuantity); // L: 10285
													var41 = var33.getModel(1); // L: 10286
													if (var41 != null) { // L: 10287
														var41.calculateBoundsCylinder(); // L: 10288
														var22 = var41.height / 2; // L: 10289
													} else {
														class220.invalidateWidget(var10); // L: 10291
													}
												}
											} else if (var10.modelType == 5) { // L: 10294
												if (var10.modelId == 0) { // L: 10295
													var41 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var41 = class28.localPlayer.getModel(); // L: 10296
												}
											} else if (var20 == -1) { // L: 10298
												var41 = var10.getModel((SequenceDefinition)null, -1, var36, class28.localPlayer.appearance); // L: 10299
												if (var41 == null && Widget.field3363) { // L: 10300
													class220.invalidateWidget(var10);
												}
											} else {
												SequenceDefinition var47 = class14.SequenceDefinition_get(var20); // L: 10303
												var41 = var10.getModel(var47, var10.modelFrame, var36, class28.localPlayer.appearance); // L: 10304
												if (var41 == null && Widget.field3363) { // L: 10305
													class220.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method4043(var10.width / 2 + var12, var10.height / 2 + var13); // L: 10307
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10308
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10309
											if (var41 != null) { // L: 10310
												if (!var10.isIf3) { // L: 10311
													var41.method4366(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var41.calculateBoundsCylinder(); // L: 10313
													if (var10.modelOrthog) { // L: 10314
														var41.method4367(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var41.method4366(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY); // L: 10315
													}
												}
											}

											Rasterizer3D.Rasterizer3D_method3(); // L: 10318
										} else {
											if (var10.type == 7) { // L: 10321
												var39 = var10.getFont(); // L: 10322
												if (var39 == null) { // L: 10323
													if (Widget.field3363) { // L: 10324
														class220.invalidateWidget(var10);
													}
													continue;
												}

												var20 = 0; // L: 10327

												for (var21 = 0; var21 < var10.rawHeight; ++var21) { // L: 10328
													for (var22 = 0; var22 < var10.rawWidth; ++var22) { // L: 10329
														if (var10.itemIds[var20] > 0) { // L: 10330
															var33 = class258.ItemComposition_get(var10.itemIds[var20] - 1); // L: 10331
															String var34;
															if (var33.isStackable != 1 && var10.itemQuantities[var20] == 1) { // L: 10333
																var34 = class82.colorStartTag(16748608) + var33.name + "</col>"; // L: 10334
															} else {
																var34 = class82.colorStartTag(16748608) + var33.name + "</col>" + " " + 'x' + class348.formatItemStacks(var10.itemQuantities[var20]);
															}

															var25 = var12 + var22 * (var10.paddingX + 115); // L: 10335
															var26 = var21 * (var10.paddingY + 12) + var13; // L: 10336
															if (var10.textXAlignment == 0) { // L: 10337
																var39.draw(var34, var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else if (var10.textXAlignment == 1) { // L: 10338
																var39.drawCentered(var34, var10.width / 2 + var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else {
																var39.drawRightAligned(var34, var25 + var10.width - 1, var26, var10.color, var10.textShadowed ? 0 : -1); // L: 10339
															}
														}

														++var20; // L: 10341
													}
												}
											}

											if (var10.type == 8 && var10 == class10.field59 && Client.field535 == Client.field631) { // L: 10345 10346
												var19 = 0; // L: 10347
												var20 = 0; // L: 10348
												Font var31 = class149.fontPlain12; // L: 10349
												String var32 = var10.text; // L: 10350

												String var43;
												for (var32 = ParamComposition.method3572(var32, var10); var32.length() > 0; var20 = var20 + var31.ascent + 1) { // L: 10352 10353 10365
													var24 = var32.indexOf("<br>"); // L: 10354
													if (var24 != -1) { // L: 10355
														var43 = var32.substring(0, var24); // L: 10356
														var32 = var32.substring(var24 + 4); // L: 10357
													} else {
														var43 = var32; // L: 10360
														var32 = ""; // L: 10361
													}

													var25 = var31.stringWidth(var43); // L: 10363
													if (var25 > var19) { // L: 10364
														var19 = var25;
													}
												}

												var19 += 6; // L: 10367
												var20 += 7; // L: 10368
												var24 = var12 + var10.width - 5 - var19; // L: 10369
												var25 = var13 + var10.height + 5; // L: 10370
												if (var24 < var12 + 5) { // L: 10371
													var24 = var12 + 5;
												}

												if (var19 + var24 > var4) { // L: 10372
													var24 = var4 - var19;
												}

												if (var20 + var25 > var5) { // L: 10373
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120); // L: 10374
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0); // L: 10375
												var32 = var10.text; // L: 10376
												var26 = var25 + var31.ascent + 2; // L: 10377

												for (var32 = ParamComposition.method3572(var32, var10); var32.length() > 0; var26 = var26 + var31.ascent + 1) { // L: 10378 10379 10390
													int var27 = var32.indexOf("<br>"); // L: 10380
													if (var27 != -1) { // L: 10381
														var43 = var32.substring(0, var27); // L: 10382
														var32 = var32.substring(var27 + 4); // L: 10383
													} else {
														var43 = var32; // L: 10386
														var32 = ""; // L: 10387
													}

													var31.draw(var43, var24 + 3, var26, 0, -1); // L: 10389
												}
											}

											if (var10.type == 9) { // L: 10394
												if (var10.field3399) { // L: 10399
													var19 = var12; // L: 10400
													var20 = var13 + var10.height; // L: 10401
													var21 = var12 + var10.width; // L: 10402
													var22 = var13; // L: 10403
												} else {
													var19 = var12; // L: 10406
													var20 = var13; // L: 10407
													var21 = var12 + var10.width; // L: 10408
													var22 = var13 + var10.height; // L: 10409
												}

												if (var10.lineWid == 1) { // L: 10411
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color); // L: 10412
												} else {
													LoginScreenAnimation.method2304(var19, var20, var21, var22, var10.color, var10.lineWid); // L: 10415
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 10420
}
