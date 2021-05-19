import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ac")
public class class44 {
	@ObfuscatedName("h")
	@Export("applet")
	public static Applet applet;
	@ObfuscatedName("c")
	public static String field305;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 43770267
	)
	static int field310;

	static {
		applet = null;
		field305 = "";
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-508196625"
	)
	public static void method494() {
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-916574148"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0;
		Login.Login_response2 = var1;
		Login.Login_response3 = var2;
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1732436079"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		UserComparator9.method2478();
		if (Client.renderSelf) {
			class32.addPlayerToScene(class35.localPlayer, false);
		}

		class32.method367();
		WorldMapLabel.addNpcsToScene(true);
		int var4 = Players.Players_count;
		int[] var5 = Players.Players_indices;

		int var6;
		for (var6 = 0; var6 < var4; ++var6) {
			if (var5[var6] != Client.combatTargetPlayerIndex && var5[var6] != Client.localPlayerIndex) {
				class32.addPlayerToScene(Client.players[var5[var6]], true);
			}
		}

		WorldMapLabel.addNpcsToScene(false);
		class302.method5372();
		Tiles.method2046();
		VarbitComposition.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var14;
		int var18;
		if (!Client.isCameraLocked) {
			var4 = Client.camAngleX;
			if (Client.field702 / 256 > var4) {
				var4 = Client.field702 / 256;
			}

			if (Client.field846[4] && Client.field868[4] + 128 > var4) {
				var4 = Client.field868[4] + 128;
			}

			var18 = Client.camAngleY & 2047;
			var6 = HorizontalAlignment.oculusOrbFocalPointX;
			var7 = Decimator.field523;
			var8 = class280.oculusOrbFocalPointY;
			var9 = class21.method281(var4);
			var9 = PlayerComposition.method4640(var9, var3);
			var10 = 2048 - var4 & 2047;
			var11 = 2048 - var18 & 2047;
			var12 = 0;
			int var13 = 0;
			var14 = var9;
			int var15;
			int var16;
			int var17;
			if (var10 != 0) {
				var15 = Rasterizer3D.Rasterizer3D_sine[var10];
				var16 = Rasterizer3D.Rasterizer3D_cosine[var10];
				var17 = var16 * var13 - var15 * var9 >> 16;
				var14 = var16 * var9 + var13 * var15 >> 16;
				var13 = var17;
			}

			if (var11 != 0) {
				var15 = Rasterizer3D.Rasterizer3D_sine[var11];
				var16 = Rasterizer3D.Rasterizer3D_cosine[var11];
				var17 = var16 * var12 + var14 * var15 >> 16;
				var14 = var16 * var14 - var15 * var12 >> 16;
				var12 = var17;
			}

			class20.cameraX = var6 - var12;
			Skeleton.cameraY = var7 - var13;
			WorldMapDecoration.cameraZ = var8 - var14;
			class1.cameraPitch = var4;
			HealthBarDefinition.cameraYaw = var18;
			if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (HorizontalAlignment.oculusOrbFocalPointX >> 7 != class35.localPlayer.x >> 7 || class280.oculusOrbFocalPointY >> 7 != class35.localPlayer.y >> 7)) {
				var15 = class35.localPlayer.plane;
				var16 = JagexCache.baseX * 64 + (HorizontalAlignment.oculusOrbFocalPointX >> 7);
				var17 = Messages.baseY * 64 + (class280.oculusOrbFocalPointY >> 7);
				ClientPreferences.method2239(var16, var17, var15, true);
			}
		}

		if (!Client.isCameraLocked) {
			var4 = Message.method1174();
		} else {
			var4 = FontName.method6161();
		}

		var18 = class20.cameraX;
		var6 = Skeleton.cameraY;
		var7 = WorldMapDecoration.cameraZ;
		var8 = class1.cameraPitch;
		var9 = HealthBarDefinition.cameraYaw;

		for (var10 = 0; var10 < 5; ++var10) {
			if (Client.field846[var10]) {
				var11 = (int)(Math.random() * (double)(Client.field744[var10] * 2 + 1) - (double)Client.field744[var10] + Math.sin((double)Client.field870[var10] * ((double)Client.field869[var10] / 100.0D)) * (double)Client.field868[var10]);
				if (var10 == 0) {
					class20.cameraX += var11;
				}

				if (var10 == 1) {
					Skeleton.cameraY += var11;
				}

				if (var10 == 2) {
					WorldMapDecoration.cameraZ += var11;
				}

				if (var10 == 3) {
					HealthBarDefinition.cameraYaw = var11 + HealthBarDefinition.cameraYaw & 2047;
				}

				if (var10 == 4) {
					class1.cameraPitch += var11;
					if (class1.cameraPitch < 128) {
						class1.cameraPitch = 128;
					}

					if (class1.cameraPitch > 383) {
						class1.cameraPitch = 383;
					}
				}
			}
		}

		var10 = MouseHandler.MouseHandler_x;
		var11 = MouseHandler.MouseHandler_y;
		if (MouseHandler.MouseHandler_lastButton != 0) {
			var10 = MouseHandler.MouseHandler_lastPressedX;
			var11 = MouseHandler.MouseHandler_lastPressedY;
		}

		if (var10 >= var0 && var10 < var0 + var2 && var11 >= var1 && var11 < var3 + var1) {
			Messages.method2374(var10 - var0, var11 - var1);
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false;
			ViewportMouse.ViewportMouse_entityCount = 0;
		}

		WorldMapIcon_1.playPcmPlayers();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		WorldMapIcon_1.playPcmPlayers();
		var12 = Rasterizer3D.Rasterizer3D_zoom;
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom;
		class5.scene.draw(class20.cameraX, Skeleton.cameraY, WorldMapDecoration.cameraZ, class1.cameraPitch, HealthBarDefinition.cameraYaw, var4);
		Rasterizer3D.Rasterizer3D_zoom = var12;
		WorldMapIcon_1.playPcmPlayers();
		class5.scene.clearTempGameObjects();
		class20.method272(var0, var1, var2, var3);
		Tile.method3813(var0, var1);
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field768);
		InvDefinition.method2615(var0, var1, var2, var3);
		class20.cameraX = var18;
		Skeleton.cameraY = var6;
		WorldMapDecoration.cameraZ = var7;
		class1.cameraPitch = var8;
		HealthBarDefinition.cameraYaw = var9;
		if (Client.isLoading) {
			byte var19 = 0;
			var14 = var19 + NetCache.NetCache_pendingPriorityWritesCount + NetCache.NetCache_pendingPriorityResponsesCount;
			if (var14 == 0) {
				Client.isLoading = false;
			}
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			class7.drawLoadingMessage("Loading - please wait.", false);
		}

	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-893753206"
	)
	static boolean method499(int var0) {
		return var0 == 57 || var0 == 58 || var0 == 1007 || var0 == 25 || var0 == 30;
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "([Liv;IIIIIIIIS)V",
		garbageValue = "27179"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();

		for (int var9 = 0; var9 < var0.length; ++var9) {
			Widget var10 = var0[var9];
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) {
				int var11;
				if (var8 == -1) {
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6;
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y;
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width;
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height;
					var11 = ++Client.rootWidgetCount - 1;
				} else {
					var11 = var8;
				}

				var10.rootIndex = var11;
				var10.cycle = Client.cycle;
				if (!var10.isIf3 || !class11.isComponentHidden(var10)) {
					if (var10.contentType > 0) {
						VarcInt.method2656(var10);
					}

					int var12 = var10.x + var6;
					int var13 = var7 + var10.y;
					int var14 = var10.transparencyTop;
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) {
						if (var1 != -1412584499 && !var10.isScrollBar) {
							Ignored.field3859 = var0;
							VarcInt.field1576 = var6;
							class230.field2812 = var7;
							continue;
						}

						if (Client.isDraggingWidget && Client.field794) {
							var15 = MouseHandler.MouseHandler_x;
							var16 = MouseHandler.MouseHandler_y;
							var15 -= Client.widgetClickX;
							var16 -= Client.widgetClickY;
							if (var15 < Client.field795) {
								var15 = Client.field795;
							}

							if (var15 + var10.width > Client.field795 + Client.clickedWidgetParent.width) {
								var15 = Client.field795 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field785) {
								var16 = Client.field785;
							}

							if (var16 + var10.height > Client.field785 + Client.clickedWidgetParent.height) {
								var16 = Client.field785 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15;
							var13 = var16;
						}

						if (!var10.isScrollBar) {
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 2) {
						var15 = var2;
						var16 = var3;
						var17 = var4;
						var18 = var5;
					} else if (var10.type == 9) {
						var19 = var12;
						var20 = var13;
						var21 = var12 + var10.width;
						var22 = var13 + var10.height;
						if (var21 < var12) {
							var19 = var21;
							var21 = var12;
						}

						if (var22 < var13) {
							var20 = var22;
							var22 = var13;
						}

						++var21;
						++var22;
						var15 = var19 > var2 ? var19 : var2;
						var16 = var20 > var3 ? var20 : var3;
						var17 = var21 < var4 ? var21 : var4;
						var18 = var22 < var5 ? var22 : var5;
					} else {
						var19 = var12 + var10.width;
						var20 = var13 + var10.height;
						var15 = var12 > var2 ? var12 : var2;
						var16 = var13 > var3 ? var13 : var3;
						var17 = var19 < var4 ? var19 : var4;
						var18 = var20 < var5 ? var20 : var5;
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) {
						if (var10.contentType != 0) {
							if (var10.contentType == 1336) {
								if (Client.displayFps) {
									var13 += 15;
									Message.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1);
									var13 += 15;
									Runtime var42 = Runtime.getRuntime();
									var20 = (int)((var42.totalMemory() - var42.freeMemory()) / 1024L);
									var21 = 16776960;
									if (var20 > 327680 && !Client.isLowDetail) {
										var21 = 16711680;
									}

									Message.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1);
									var13 += 15;
								}
								continue;
							}

							if (var10.contentType == 1337) {
								Client.viewportX = var12;
								Client.viewportY = var13;
								drawEntities(var12, var13, var10.width, var10.height);
								Client.field825[var10.rootIndex] = true;
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType == 1338) {
								PacketBufferNode.drawMinimap(var10, var12, var13, var11);
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType == 1339) {
								WorldMapData_1.drawCompass(var10, var12, var13, var11);
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType == 1400) {
								NetSocket.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle);
							}

							if (var10.contentType == 1401) {
								NetSocket.worldMap.drawOverview(var12, var13, var10.width, var10.height);
							}

							if (var10.contentType == 1402) {
								AttackOption.loginScreenRunesAnimation.draw(var12, Client.cycle);
							}
						}

						if (var10.type == 0) {
							if (!var10.isIf3 && class11.isComponentHidden(var10) && var10 != SpriteMask.mousedOverWidgetIf1) {
								continue;
							}

							if (!var10.isIf3) {
								if (var10.scrollY > var10.scrollHeight - var10.height) {
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) {
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							if (var10.children != null) {
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)var10.id);
							if (var30 != null) {
								ModeWhere.drawWidgets(var30.group, var15, var16, var17, var18, var12, var13, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
						}

						if (Client.isResizable || Client.field636[var11] || Client.gameDrawingMode > 1) {
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) {
								WorldMapRectangle.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) {
								int var23;
								int var24;
								int var25;
								int var26;
								if (var10.type == 2) {
									var19 = 0;

									for (var20 = 0; var20 < var10.rawHeight; ++var20) {
										for (var21 = 0; var21 < var10.rawWidth; ++var21) {
											var22 = var12 + var21 * (var10.paddingX + 32);
											var23 = var13 + var20 * (var10.paddingY + 32);
											if (var19 < 20) {
												var22 += var10.inventoryXOffsets[var19];
												var23 += var10.inventoryYOffsets[var19];
											}

											if (var10.itemIds[var19] <= 0) {
												if (var10.inventorySprites != null && var19 < 20) {
													SpritePixels var46 = var10.getInventorySprite(var19);
													if (var46 != null) {
														var46.drawTransBgAt(var22, var23);
													} else if (Widget.field2962) {
														VerticalAlignment.invalidateWidget(var10);
													}
												}
											} else {
												boolean var37 = false;
												boolean var38 = false;
												var26 = var10.itemIds[var19] - 1;
												if (var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == class34.dragInventoryWidget && var19 == Client.dragItemSlotSource) {
													SpritePixels var35;
													if (Client.isItemSelected == 1 && var19 == UserComparator8.selectedItemSlot && var10.id == class35.selectedItemWidget) {
														var35 = SecureRandomFuture.getItemSprite(var26, var10.itemQuantities[var19], 2, 0, 2, false);
													} else {
														var35 = SecureRandomFuture.getItemSprite(var26, var10.itemQuantities[var19], 1, 3153952, 2, false);
													}

													if (var35 != null) {
														if (var10 == class34.dragInventoryWidget && var19 == Client.dragItemSlotSource) {
															var24 = MouseHandler.MouseHandler_x - Client.draggedWidgetX;
															var25 = MouseHandler.MouseHandler_y - Client.draggedWidgetY;
															if (var24 < 5 && var24 > -5) {
																var24 = 0;
															}

															if (var25 < 5 && var25 > -5) {
																var25 = 0;
															}

															if (Client.itemDragDuration < 5) {
																var24 = 0;
																var25 = 0;
															}

															var35.drawTransAt(var24 + var22, var25 + var23, 128);
															if (var1 != -1) {
																Widget var28 = var0[var1 & 65535];
																int var29;
																if (var23 + var25 < Rasterizer2D.Rasterizer2D_yClipStart && var28.scrollY > 0) {
																	var29 = (Rasterizer2D.Rasterizer2D_yClipStart - var23 - var25) * Client.field768 / 3;
																	if (var29 > Client.field768 * 10) {
																		var29 = Client.field768 * 10;
																	}

																	if (var29 > var28.scrollY) {
																		var29 = var28.scrollY;
																	}

																	var28.scrollY -= var29;
																	Client.draggedWidgetY += var29;
																	VerticalAlignment.invalidateWidget(var28);
																}

																if (var23 + var25 + 32 > Rasterizer2D.Rasterizer2D_yClipEnd && var28.scrollY < var28.scrollHeight - var28.height) {
																	var29 = (var25 + var23 + 32 - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.field768 / 3;
																	if (var29 > Client.field768 * 10) {
																		var29 = Client.field768 * 10;
																	}

																	if (var29 > var28.scrollHeight - var28.height - var28.scrollY) {
																		var29 = var28.scrollHeight - var28.height - var28.scrollY;
																	}

																	var28.scrollY += var29;
																	Client.draggedWidgetY -= var29;
																	VerticalAlignment.invalidateWidget(var28);
																}
															}
														} else if (var10 == Projectile.field1039 && var19 == Client.field633) {
															var35.drawTransAt(var22, var23, 128);
														} else {
															var35.drawTransBgAt(var22, var23);
														}
													} else {
														VerticalAlignment.invalidateWidget(var10);
													}
												}
											}

											++var19;
										}
									}
								} else if (var10.type == 3) {
									if (class373.runCs1(var10)) {
										var19 = var10.color2;
										if (var10 == SpriteMask.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) {
											var19 = var10.mouseOverColor2;
										}
									} else {
										var19 = var10.color;
										if (var10 == SpriteMask.mousedOverWidgetIf1 && var10.mouseOverColor != 0) {
											var19 = var10.mouseOverColor;
										}
									}

									if (var10.fill) {
										switch(var10.fillMode.field4236) {
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2);
											break;
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255));
											break;
										default:
											if (var14 == 0) {
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255));
											}
										}
									} else if (var14 == 0) {
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255));
									}
								} else {
									Font var39;
									if (var10.type == 4) {
										var39 = var10.getFont();
										if (var39 == null) {
											if (Widget.field2962) {
												VerticalAlignment.invalidateWidget(var10);
											}
										} else {
											String var44 = var10.text;
											if (class373.runCs1(var10)) {
												var20 = var10.color2;
												if (var10 == SpriteMask.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) {
													var20 = var10.mouseOverColor2;
												}

												if (var10.text2.length() > 0) {
													var44 = var10.text2;
												}
											} else {
												var20 = var10.color;
												if (var10 == SpriteMask.mousedOverWidgetIf1 && var10.mouseOverColor != 0) {
													var20 = var10.mouseOverColor;
												}
											}

											if (var10.isIf3 && var10.itemId != -1) {
												ItemComposition var45 = Strings.ItemDefinition_get(var10.itemId);
												var44 = var45.name;
												if (var44 == null) {
													var44 = "null";
												}

												if ((var45.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) {
													var44 = HorizontalAlignment.colorStartTag(16748608) + var44 + "</col>" + " " + 'x' + Messages.formatItemStacks(var10.itemQuantity);
												}
											}

											if (var10 == Client.meslayerContinueWidget) {
												var44 = "Please wait...";
												var20 = var10.color;
											}

											if (!var10.isIf3) {
												var44 = GrandExchangeOfferTotalQuantityComparator.method4979(var44, var10);
											}

											var39.drawLines(var44, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight);
										}
									} else if (var10.type == 5) {
										SpritePixels var40;
										if (!var10.isIf3) {
											var40 = var10.getSprite(class373.runCs1(var10));
											if (var40 != null) {
												var40.drawTransBgAt(var12, var13);
											} else if (Widget.field2962) {
												VerticalAlignment.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) {
												var40 = SecureRandomFuture.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var40 = var10.getSprite(false);
											}

											if (var40 == null) {
												if (Widget.field2962) {
													VerticalAlignment.invalidateWidget(var10);
												}
											} else {
												var20 = var40.width;
												var21 = var40.height;
												if (!var10.spriteTiling) {
													var22 = var10.width * 4096 / var20;
													if (var10.spriteAngle != 0) {
														var40.method6894(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) {
														var40.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) {
														var40.drawTransBgAt(var12, var13);
													} else {
														var40.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height);
													var22 = (var20 - 1 + var10.width) / var20;
													var23 = (var21 - 1 + var10.height) / var21;

													for (var24 = 0; var24 < var22; ++var24) {
														for (var25 = 0; var25 < var23; ++var25) {
															if (var10.spriteAngle != 0) {
																var40.method6894(var20 / 2 + var12 + var24 * var20, var21 / 2 + var13 + var25 * var21, var10.spriteAngle, 4096);
															} else if (var14 != 0) {
																var40.drawTransAt(var12 + var24 * var20, var13 + var21 * var25, 256 - (var14 & 255));
															} else {
																var40.drawTransBgAt(var12 + var20 * var24, var13 + var21 * var25);
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
												}
											}
										}
									} else {
										ItemComposition var33;
										if (var10.type == 6) {
											boolean var36 = class373.runCs1(var10);
											if (var36) {
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId;
											}

											Model var41 = null;
											var22 = 0;
											if (var10.itemId != -1) {
												var33 = Strings.ItemDefinition_get(var10.itemId);
												if (var33 != null) {
													var33 = var33.getCountObj(var10.itemQuantity);
													var41 = var33.getModel(1);
													if (var41 != null) {
														var41.calculateBoundsCylinder();
														var22 = var41.height / 2;
													} else {
														VerticalAlignment.invalidateWidget(var10);
													}
												}
											} else if (var10.modelType == 5) {
												if (var10.modelId == 0) {
													var41 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var41 = class35.localPlayer.getModel();
												}
											} else if (var20 == -1) {
												var41 = var10.getModel((SequenceDefinition)null, -1, var36, class35.localPlayer.appearance);
												if (var41 == null && Widget.field2962) {
													VerticalAlignment.invalidateWidget(var10);
												}
											} else {
												SequenceDefinition var47 = Player.SequenceDefinition_get(var20);
												var41 = var10.getModel(var47, var10.modelFrame, var36, class35.localPlayer.appearance);
												if (var41 == null && Widget.field2962) {
													VerticalAlignment.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method3818(var10.width / 2 + var12, var10.height / 2 + var13);
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16;
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16;
											if (var41 != null) {
												if (!var10.isIf3) {
													var41.method4136(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var41.calculateBoundsCylinder();
													if (var10.modelOrthog) {
														var41.method4137(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var41.method4136(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY);
													}
												}
											}

											Rasterizer3D.Rasterizer3D_method3();
										} else {
											if (var10.type == 7) {
												var39 = var10.getFont();
												if (var39 == null) {
													if (Widget.field2962) {
														VerticalAlignment.invalidateWidget(var10);
													}
													continue;
												}

												var20 = 0;

												for (var21 = 0; var21 < var10.rawHeight; ++var21) {
													for (var22 = 0; var22 < var10.rawWidth; ++var22) {
														if (var10.itemIds[var20] > 0) {
															var33 = Strings.ItemDefinition_get(var10.itemIds[var20] - 1);
															String var34;
															if (var33.isStackable != 1 && var10.itemQuantities[var20] == 1) {
																var34 = HorizontalAlignment.colorStartTag(16748608) + var33.name + "</col>";
															} else {
																var34 = HorizontalAlignment.colorStartTag(16748608) + var33.name + "</col>" + " " + 'x' + Messages.formatItemStacks(var10.itemQuantities[var20]);
															}

															var25 = var22 * (var10.paddingX + 115) + var12;
															var26 = var21 * (var10.paddingY + 12) + var13;
															if (var10.textXAlignment == 0) {
																var39.draw(var34, var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else if (var10.textXAlignment == 1) {
																var39.drawCentered(var34, var10.width / 2 + var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else {
																var39.drawRightAligned(var34, var25 + var10.width - 1, var26, var10.color, var10.textShadowed ? 0 : -1);
															}
														}

														++var20;
													}
												}
											}

											if (var10.type == 8 && var10 == class34.field241 && Client.field741 == Client.field811) {
												var19 = 0;
												var20 = 0;
												Font var31 = Message.fontPlain12;
												String var32 = var10.text;

												String var43;
												for (var32 = GrandExchangeOfferTotalQuantityComparator.method4979(var32, var10); var32.length() > 0; var20 = var20 + var31.ascent + 1) {
													var24 = var32.indexOf("<br>");
													if (var24 != -1) {
														var43 = var32.substring(0, var24);
														var32 = var32.substring(var24 + 4);
													} else {
														var43 = var32;
														var32 = "";
													}

													var25 = var31.stringWidth(var43);
													if (var25 > var19) {
														var19 = var25;
													}
												}

												var19 += 6;
												var20 += 7;
												var24 = var12 + var10.width - 5 - var19;
												var25 = var13 + var10.height + 5;
												if (var24 < var12 + 5) {
													var24 = var12 + 5;
												}

												if (var24 + var19 > var4) {
													var24 = var4 - var19;
												}

												if (var20 + var25 > var5) {
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120);
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0);
												var32 = var10.text;
												var26 = var25 + var31.ascent + 2;

												for (var32 = GrandExchangeOfferTotalQuantityComparator.method4979(var32, var10); var32.length() > 0; var26 = var26 + var31.ascent + 1) {
													int var27 = var32.indexOf("<br>");
													if (var27 != -1) {
														var43 = var32.substring(0, var27);
														var32 = var32.substring(var27 + 4);
													} else {
														var43 = var32;
														var32 = "";
													}

													var31.draw(var43, var24 + 3, var26, 0, -1);
												}
											}

											if (var10.type == 9) {
												if (var10.field2998) {
													var19 = var12;
													var20 = var13 + var10.height;
													var21 = var12 + var10.width;
													var22 = var13;
												} else {
													var19 = var12;
													var20 = var13;
													var21 = var12 + var10.width;
													var22 = var13 + var10.height;
												}

												if (var10.lineWid == 1) {
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color);
												} else {
													Messages.method2378(var19, var20, var21, var22, var10.color, var10.lineWid);
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

	}
}
