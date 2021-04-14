import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("u")
public class class2 {
	@ObfuscatedName("rt")
	@ObfuscatedGetter(
		intValue = -2123526983
	)
	static int field15;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = -96545822097112055L
	)
	long field24;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -480209285
	)
	int field17;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Ljc;"
	)
	IterableNodeDeque field22;

	@ObfuscatedSignature(
		signature = "(Lnu;)V"
	)
	public class2(Buffer var1) {
		this.field17 = -1;
		this.field22 = new IterableNodeDeque();
		this.method28(var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "-1544288881"
	)
	void method28(Buffer var1) {
		this.field24 = var1.readLong();
		this.field17 = var1.readInt();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 3) {
				var3 = new class13(this);
			} else if (var2 == 1) {
				var3 = new class8(this);
			} else if (var2 == 13) {
				var3 = new class26(this);
			} else if (var2 == 4) {
				var3 = new class17(this);
			} else if (var2 == 6) {
				var3 = new class10(this);
			} else if (var2 == 5) {
				var3 = new class22(this);
			} else if (var2 == 2) {
				var3 = new class23(this);
			} else if (var2 == 7) {
				var3 = new class21(this);
			} else if (var2 == 14) {
				var3 = new class18(this);
			} else if (var2 == 8) {
				var3 = new class6(this);
			} else if (var2 == 9) {
				var3 = new class0(this);
			} else if (var2 == 10) {
				var3 = new class4(this);
			} else if (var2 == 11) {
				var3 = new class1(this);
			} else if (var2 == 12) {
				var3 = new class15(this);
			} else {
				if (var2 != 15) {
					throw new RuntimeException("");
				}

				var3 = new class27(this);
			}

			((class14)var3).vmethod371(var1);
			this.field22.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lm;I)V",
		garbageValue = "248854957"
	)
	public void method29(class11 var1) {
		if (var1.field79 == this.field24 && this.field17 == var1.field80) {
			for (class14 var2 = (class14)this.field22.last(); var2 != null; var2 = (class14)this.field22.previous()) {
				var2.vmethod376(var1);
			}

			++var1.field80;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(IB)I",
		garbageValue = "1"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var2 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
		VarbitComposition var1;
		if (var2 != null) {
			var1 = var2;
		} else {
			byte[] var7 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
			var2 = new VarbitComposition();
			if (var7 != null) {
				var2.decode(new Buffer(var7));
			}

			VarbitComposition.VarbitDefinition_cached.put(var2, (long)var0);
			var1 = var2;
		}

		int var3 = var1.baseVar;
		int var4 = var1.startBit;
		int var5 = var1.endBit;
		int var6 = Varps.Varps_masks[var5 - var4];
		return Varps.Varps_main[var3] >> var4 & var6;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lnu;Ljava/lang/String;I)I",
		garbageValue = "1745041839"
	)
	public static int method34(Buffer var0, String var1) {
		int var2 = var0.offset;
		int var4 = var1.length();
		byte[] var5 = new byte[var4];

		for (int var6 = 0; var6 < var4; ++var6) {
			char var7 = var1.charAt(var6);
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) {
				var5[var6] = (byte)var7;
			} else if (var7 == 8364) {
				var5[var6] = -128;
			} else if (var7 == 8218) {
				var5[var6] = -126;
			} else if (var7 == 402) {
				var5[var6] = -125;
			} else if (var7 == 8222) {
				var5[var6] = -124;
			} else if (var7 == 8230) {
				var5[var6] = -123;
			} else if (var7 == 8224) {
				var5[var6] = -122;
			} else if (var7 == 8225) {
				var5[var6] = -121;
			} else if (var7 == 710) {
				var5[var6] = -120;
			} else if (var7 == 8240) {
				var5[var6] = -119;
			} else if (var7 == 352) {
				var5[var6] = -118;
			} else if (var7 == 8249) {
				var5[var6] = -117;
			} else if (var7 == 338) {
				var5[var6] = -116;
			} else if (var7 == 381) {
				var5[var6] = -114;
			} else if (var7 == 8216) {
				var5[var6] = -111;
			} else if (var7 == 8217) {
				var5[var6] = -110;
			} else if (var7 == 8220) {
				var5[var6] = -109;
			} else if (var7 == 8221) {
				var5[var6] = -108;
			} else if (var7 == 8226) {
				var5[var6] = -107;
			} else if (var7 == 8211) {
				var5[var6] = -106;
			} else if (var7 == 8212) {
				var5[var6] = -105;
			} else if (var7 == 732) {
				var5[var6] = -104;
			} else if (var7 == 8482) {
				var5[var6] = -103;
			} else if (var7 == 353) {
				var5[var6] = -102;
			} else if (var7 == 8250) {
				var5[var6] = -101;
			} else if (var7 == 339) {
				var5[var6] = -100;
			} else if (var7 == 382) {
				var5[var6] = -98;
			} else if (var7 == 376) {
				var5[var6] = -97;
			} else {
				var5[var6] = 63;
			}
		}

		var0.writeSmartByteShort(var5.length);
		var0.offset += class227.huffman.compress(var5, 0, var5.length, var0.array, var0.offset);
		return var0.offset - var2;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "-878871415"
	)
	public static boolean method39(int var0) {
		return (var0 >> 28 & 1) != 0;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(Lhu;IIII)V",
		garbageValue = "835982981"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field2701 == null) {
			throw new RuntimeException();
		} else {
			var0.field2701[var1] = var2;
			var0.field2692[var1] = var3;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		signature = "(ILhk;ZI)V",
		garbageValue = "-2112750284"
	)
	static void method37(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = Actor.getWorldMap().getMapArea(var0);
		int var4 = Varcs.localPlayer.plane;
		int var5 = ItemLayer.baseX * 64 + (Varcs.localPlayer.x >> 7);
		int var6 = Tile.baseY * 64 + (Varcs.localPlayer.y >> 7);
		Coord var7 = new Coord(var4, var5, var6);
		Actor.getWorldMap().method6264(var3, var7, var1, var2);
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;ZI)V",
		garbageValue = "1663877987"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) {
			byte var2 = 4;
			int var3 = var2 + 6;
			int var4 = var2 + 6;
			int var5 = class14.fontPlain12.lineWidth(var0, 250);
			int var6 = class14.fontPlain12.lineCount(var0, 250) * 13;
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var6 + var2 + var2, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var2 + var6, 16777215);
			class14.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
			int var7 = var3 - var2;
			int var8 = var4 - var2;
			int var9 = var2 + var5 + var2;
			int var10 = var6 + var2 + var2;

			for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) {
				if (Client.rootWidgetXs[var11] + Client.rootWidgetWidths[var11] > var7 && Client.rootWidgetXs[var11] < var7 + var9 && Client.rootWidgetYs[var11] + Client.rootWidgetHeights[var11] > var8 && Client.rootWidgetYs[var11] < var8 + var10) {
					Client.field811[var11] = true;
				}
			}

			if (var1) {
				GameEngine.rasterProvider.drawFull(0, 0);
			} else {
				LoginScreenAnimation.method2198(var3, var4, var5, var6);
			}

		}
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-841281323"
	)
	static final int method36() {
		if (Login.clientPreferences.roofsHidden) {
			return class26.Client_plane;
		} else {
			int var0 = 3;
			if (WorldMapArea.cameraPitch < 310) {
				int var1;
				int var2;
				if (Client.oculusOrbState == 1) {
					var1 = class6.oculusOrbFocalPointX >> 7;
					var2 = Players.oculusOrbFocalPointY >> 7;
				} else {
					var1 = Varcs.localPlayer.x >> 7;
					var2 = Varcs.localPlayer.y >> 7;
				}

				int var3 = ModeWhere.cameraX >> 7;
				int var4 = ReflectionCheck.cameraZ >> 7;
				if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
					return class26.Client_plane;
				}

				if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
					return class26.Client_plane;
				}

				if ((Tiles.Tiles_renderFlags[class26.Client_plane][var3][var4] & 4) != 0) {
					var0 = class26.Client_plane;
				}

				int var5;
				if (var1 > var3) {
					var5 = var1 - var3;
				} else {
					var5 = var3 - var1;
				}

				int var6;
				if (var2 > var4) {
					var6 = var2 - var4;
				} else {
					var6 = var4 - var2;
				}

				int var7;
				int var8;
				if (var5 > var6) {
					var7 = var6 * 65536 / var5;
					var8 = 32768;

					while (var1 != var3) {
						if (var3 < var1) {
							++var3;
						} else if (var3 > var1) {
							--var3;
						}

						if ((Tiles.Tiles_renderFlags[class26.Client_plane][var3][var4] & 4) != 0) {
							var0 = class26.Client_plane;
						}

						var8 += var7;
						if (var8 >= 65536) {
							var8 -= 65536;
							if (var4 < var2) {
								++var4;
							} else if (var4 > var2) {
								--var4;
							}

							if ((Tiles.Tiles_renderFlags[class26.Client_plane][var3][var4] & 4) != 0) {
								var0 = class26.Client_plane;
							}
						}
					}
				} else if (var6 > 0) {
					var7 = var5 * 65536 / var6;
					var8 = 32768;

					while (var2 != var4) {
						if (var4 < var2) {
							++var4;
						} else if (var4 > var2) {
							--var4;
						}

						if ((Tiles.Tiles_renderFlags[class26.Client_plane][var3][var4] & 4) != 0) {
							var0 = class26.Client_plane;
						}

						var8 += var7;
						if (var8 >= 65536) {
							var8 -= 65536;
							if (var3 < var1) {
								++var3;
							} else if (var3 > var1) {
								--var3;
							}

							if ((Tiles.Tiles_renderFlags[class26.Client_plane][var3][var4] & 4) != 0) {
								var0 = class26.Client_plane;
							}
						}
					}
				}
			}

			if (Varcs.localPlayer.x >= 0 && Varcs.localPlayer.y >= 0 && Varcs.localPlayer.x < 13312 && Varcs.localPlayer.y < 13312) {
				if ((Tiles.Tiles_renderFlags[class26.Client_plane][Varcs.localPlayer.x >> 7][Varcs.localPlayer.y >> 7] & 4) != 0) {
					var0 = class26.Client_plane;
				}

				return var0;
			} else {
				return class26.Client_plane;
			}
		}
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		signature = "([Lhu;IIIIIIIII)V",
		garbageValue = "1743057501"
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
				if (!var10.isIf3 || !WorldMapArea.isComponentHidden(var10)) {
					if (var10.contentType > 0) {
						ChatChannel.method2017(var10);
					}

					int var12 = var10.x + var6;
					int var13 = var7 + var10.y;
					int var14 = var10.transparencyTop;
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) {
						if (var1 != -1412584499 && !var10.isScrollBar) {
							WallDecoration.field2179 = var0;
							class11.field106 = var6;
							class235.field2843 = var7;
							continue;
						}

						if (Client.isDraggingWidget && Client.field780) {
							var15 = MouseHandler.MouseHandler_x;
							var16 = MouseHandler.MouseHandler_y;
							var15 -= Client.widgetClickX;
							var16 -= Client.widgetClickY;
							if (var15 < Client.field727) {
								var15 = Client.field727;
							}

							if (var15 + var10.width > Client.field727 + Client.clickedWidgetParent.width) {
								var15 = Client.field727 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field782) {
								var16 = Client.field782;
							}

							if (var16 + var10.height > Client.field782 + Client.clickedWidgetParent.height) {
								var16 = Client.field782 + Client.clickedWidgetParent.height - var10.height;
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
					int var20;
					int var21;
					int var22;
					int var30;
					if (var10.type == 2) {
						var15 = var2;
						var16 = var3;
						var17 = var4;
						var18 = var5;
					} else if (var10.type == 9) {
						var30 = var12;
						var20 = var13;
						var21 = var12 + var10.width;
						var22 = var13 + var10.height;
						if (var21 < var12) {
							var30 = var21;
							var21 = var12;
						}

						if (var22 < var13) {
							var20 = var22;
							var22 = var13;
						}

						++var21;
						++var22;
						var15 = var30 > var2 ? var30 : var2;
						var16 = var20 > var3 ? var20 : var3;
						var17 = var21 < var4 ? var21 : var4;
						var18 = var22 < var5 ? var22 : var5;
					} else {
						var30 = var12 + var10.width;
						var20 = var13 + var10.height;
						var15 = var12 > var2 ? var12 : var2;
						var16 = var13 > var3 ? var13 : var3;
						var17 = var30 < var4 ? var30 : var4;
						var18 = var20 < var5 ? var20 : var5;
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) {
						if (var10.contentType != 0) {
							if (var10.contentType == 1336) {
								if (Client.displayFps) {
									var13 += 15;
									class14.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1);
									var13 += 15;
									Runtime var38 = Runtime.getRuntime();
									var20 = (int)((var38.totalMemory() - var38.freeMemory()) / 1024L);
									var21 = 16776960;
									if (var20 > 327680 && !Client.isLowDetail) {
										var21 = 16711680;
									}

									class14.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1);
									var13 += 15;
								}
								continue;
							}

							if (var10.contentType == 1337) {
								Client.viewportX = var12;
								Client.viewportY = var13;
								class24.drawEntities(var12, var13, var10.width, var10.height);
								Client.field811[var10.rootIndex] = true;
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType == 1338) {
								class21.drawMinimap(var10, var12, var13, var11);
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType == 1339) {
								class373.drawCompass(var10, var12, var13, var11);
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType == 1400) {
								UserComparator4.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle);
							}

							if (var10.contentType == 1401) {
								UserComparator4.worldMap.drawOverview(var12, var13, var10.width, var10.height);
							}

							if (var10.contentType == 1402) {
								Login.loginScreenRunesAnimation.draw(var12, Client.cycle);
							}
						}

						if (var10.type == 0) {
							if (!var10.isIf3 && WorldMapArea.isComponentHidden(var10) && var10 != Varps.mousedOverWidgetIf1) {
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

							InterfaceParent var19 = (InterfaceParent)Client.interfaceParents.get((long)var10.id);
							if (var19 != null) {
								Skeleton.drawWidgets(var19.group, var15, var16, var17, var18, var12, var13, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
						}

						if (Client.isResizable || Client.field704[var11] || Client.gameDrawingMode > 1) {
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) {
								class303.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) {
								int var23;
								int var24;
								int var25;
								int var26;
								if (var10.type == 2) {
									var30 = 0;

									for (var20 = 0; var20 < var10.rawHeight; ++var20) {
										for (var21 = 0; var21 < var10.rawWidth; ++var21) {
											var22 = var21 * (var10.paddingX + 32) + var12;
											var23 = var13 + var20 * (var10.paddingY + 32);
											if (var30 < 20) {
												var22 += var10.inventoryXOffsets[var30];
												var23 += var10.inventoryYOffsets[var30];
											}

											if (var10.itemIds[var30] <= 0) {
												if (var10.inventorySprites != null && var30 < 20) {
													SpritePixels var42 = var10.getInventorySprite(var30);
													if (var42 != null) {
														var42.drawTransBgAt(var22, var23);
													} else if (Widget.field2622) {
														class29.invalidateWidget(var10);
													}
												}
											} else {
												boolean var39 = false;
												boolean var40 = false;
												var26 = var10.itemIds[var30] - 1;
												if (var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == ClientPacket.dragInventoryWidget && var30 == Client.dragItemSlotSource) {
													SpritePixels var27;
													if (Client.isItemSelected == 1 && var30 == class208.selectedItemSlot && var10.id == UserComparator6.selectedItemWidget) {
														var27 = WorldMapManager.getItemSprite(var26, var10.itemQuantities[var30], 2, 0, 2, false);
													} else {
														var27 = WorldMapManager.getItemSprite(var26, var10.itemQuantities[var30], 1, 3153952, 2, false);
													}

													if (var27 != null) {
														if (var10 == ClientPacket.dragInventoryWidget && var30 == Client.dragItemSlotSource) {
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

															var27.drawTransAt(var22 + var24, var25 + var23, 128);
															if (var1 != -1) {
																Widget var28 = var0[var1 & 65535];
																int var29;
																if (var25 + var23 < Rasterizer2D.Rasterizer2D_yClipStart && var28.scrollY > 0) {
																	var29 = (Rasterizer2D.Rasterizer2D_yClipStart - var23 - var25) * Client.field799 / 3;
																	if (var29 > Client.field799 * 10) {
																		var29 = Client.field799 * 10;
																	}

																	if (var29 > var28.scrollY) {
																		var29 = var28.scrollY;
																	}

																	var28.scrollY -= var29;
																	Client.draggedWidgetY += var29;
																	class29.invalidateWidget(var28);
																}

																if (var25 + var23 + 32 > Rasterizer2D.Rasterizer2D_yClipEnd && var28.scrollY < var28.scrollHeight - var28.height) {
																	var29 = (var25 + var23 + 32 - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.field799 / 3;
																	if (var29 > Client.field799 * 10) {
																		var29 = Client.field799 * 10;
																	}

																	if (var29 > var28.scrollHeight - var28.height - var28.scrollY) {
																		var29 = var28.scrollHeight - var28.height - var28.scrollY;
																	}

																	var28.scrollY += var29;
																	Client.draggedWidgetY -= var29;
																	class29.invalidateWidget(var28);
																}
															}
														} else if (var10 == PacketWriter.field1394 && var30 == Client.field709) {
															var27.drawTransAt(var22, var23, 128);
														} else {
															var27.drawTransBgAt(var22, var23);
														}
													} else {
														class29.invalidateWidget(var10);
													}
												}
											}

											++var30;
										}
									}
								} else if (var10.type == 3) {
									if (class159.runCs1(var10)) {
										var30 = var10.color2;
										if (var10 == Varps.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) {
											var30 = var10.mouseOverColor2;
										}
									} else {
										var30 = var10.color;
										if (var10 == Varps.mousedOverWidgetIf1 && var10.mouseOverColor != 0) {
											var30 = var10.mouseOverColor;
										}
									}

									if (var10.fill) {
										switch(var10.fillMode.field4232) {
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2);
											break;
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255));
											break;
										default:
											if (var14 == 0) {
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var30);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var30, 256 - (var14 & 255));
											}
										}
									} else if (var14 == 0) {
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var30);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var30, 256 - (var14 & 255));
									}
								} else {
									Font var36;
									if (var10.type == 4) {
										var36 = var10.getFont();
										if (var36 == null) {
											if (Widget.field2622) {
												class29.invalidateWidget(var10);
											}
										} else {
											String var45 = var10.text;
											if (class159.runCs1(var10)) {
												var20 = var10.color2;
												if (var10 == Varps.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) {
													var20 = var10.mouseOverColor2;
												}

												if (var10.text2.length() > 0) {
													var45 = var10.text2;
												}
											} else {
												var20 = var10.color;
												if (var10 == Varps.mousedOverWidgetIf1 && var10.mouseOverColor != 0) {
													var20 = var10.mouseOverColor;
												}
											}

											if (var10.isIf3 && var10.itemId != -1) {
												ItemComposition var47 = class23.ItemDefinition_get(var10.itemId);
												var45 = var47.name;
												if (var45 == null) {
													var45 = "null";
												}

												if ((var47.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) {
													var45 = DefaultsGroup.colorStartTag(16748608) + var45 + "</col>" + " " + 'x' + UserComparator5.formatItemStacks(var10.itemQuantity);
												}
											}

											if (var10 == Client.meslayerContinueWidget) {
												var45 = "Please wait...";
												var20 = var10.color;
											}

											if (!var10.isIf3) {
												var45 = class232.method4363(var45, var10);
											}

											var36.drawLines(var45, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight);
										}
									} else if (var10.type == 5) {
										SpritePixels var37;
										if (!var10.isIf3) {
											var37 = var10.getSprite(class159.runCs1(var10));
											if (var37 != null) {
												var37.drawTransBgAt(var12, var13);
											} else if (Widget.field2622) {
												class29.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) {
												var37 = WorldMapManager.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var37 = var10.getSprite(false);
											}

											if (var37 == null) {
												if (Widget.field2622) {
													class29.invalidateWidget(var10);
												}
											} else {
												var20 = var37.width;
												var21 = var37.height;
												if (!var10.spriteTiling) {
													var22 = var10.width * 4096 / var20;
													if (var10.spriteAngle != 0) {
														var37.method7000(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) {
														var37.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) {
														var37.drawTransBgAt(var12, var13);
													} else {
														var37.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height);
													var22 = (var20 - 1 + var10.width) / var20;
													var23 = (var21 - 1 + var10.height) / var21;

													for (var24 = 0; var24 < var22; ++var24) {
														for (var25 = 0; var25 < var23; ++var25) {
															if (var10.spriteAngle != 0) {
																var37.method7000(var20 / 2 + var12 + var20 * var24, var21 / 2 + var13 + var21 * var25, var10.spriteAngle, 4096);
															} else if (var14 != 0) {
																var37.drawTransAt(var12 + var24 * var20, var13 + var21 * var25, 256 - (var14 & 255));
															} else {
																var37.drawTransBgAt(var12 + var20 * var24, var13 + var25 * var21);
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
											boolean var44 = class159.runCs1(var10);
											if (var44) {
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId;
											}

											Model var41 = null;
											var22 = 0;
											if (var10.itemId != -1) {
												var33 = class23.ItemDefinition_get(var10.itemId);
												if (var33 != null) {
													var33 = var33.getCountObj(var10.itemQuantity);
													var41 = var33.getModel(1);
													if (var41 != null) {
														var41.calculateBoundsCylinder();
														var22 = var41.height / 2;
													} else {
														class29.invalidateWidget(var10);
													}
												}
											} else if (var10.modelType == 5) {
												if (var10.modelId == 0) {
													var41 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var41 = Varcs.localPlayer.getModel();
												}
											} else if (var20 == -1) {
												var41 = var10.getModel((SequenceDefinition)null, -1, var44, Varcs.localPlayer.appearance);
												if (var41 == null && Widget.field2622) {
													class29.invalidateWidget(var10);
												}
											} else {
												SequenceDefinition var46 = class225.SequenceDefinition_get(var20);
												var41 = var10.getModel(var46, var10.modelFrame, var44, Varcs.localPlayer.appearance);
												if (var41 == null && Widget.field2622) {
													class29.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method3411(var10.width / 2 + var12, var10.height / 2 + var13);
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16;
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16;
											if (var41 != null) {
												if (!var10.isIf3) {
													var41.method3692(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var41.calculateBoundsCylinder();
													if (var10.modelOrthog) {
														var41.method3693(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var41.method3692(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY);
													}
												}
											}

											Rasterizer3D.Rasterizer3D_method3();
										} else {
											if (var10.type == 7) {
												var36 = var10.getFont();
												if (var36 == null) {
													if (Widget.field2622) {
														class29.invalidateWidget(var10);
													}
													continue;
												}

												var20 = 0;

												for (var21 = 0; var21 < var10.rawHeight; ++var21) {
													for (var22 = 0; var22 < var10.rawWidth; ++var22) {
														if (var10.itemIds[var20] > 0) {
															var33 = class23.ItemDefinition_get(var10.itemIds[var20] - 1);
															String var31;
															if (var33.isStackable != 1 && var10.itemQuantities[var20] == 1) {
																var31 = DefaultsGroup.colorStartTag(16748608) + var33.name + "</col>";
															} else {
																var31 = DefaultsGroup.colorStartTag(16748608) + var33.name + "</col>" + " " + 'x' + UserComparator5.formatItemStacks(var10.itemQuantities[var20]);
															}

															var25 = var12 + var22 * (var10.paddingX + 115);
															var26 = var21 * (var10.paddingY + 12) + var13;
															if (var10.textXAlignment == 0) {
																var36.draw(var31, var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else if (var10.textXAlignment == 1) {
																var36.drawCentered(var31, var10.width / 2 + var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else {
																var36.drawRightAligned(var31, var25 + var10.width - 1, var26, var10.color, var10.textShadowed ? 0 : -1);
															}
														}

														++var20;
													}
												}
											}

											if (var10.type == 8 && var10 == Player.field1192 && Client.field753 == Client.field696) {
												var30 = 0;
												var20 = 0;
												Font var32 = class14.fontPlain12;
												String var34 = var10.text;

												String var43;
												for (var34 = class232.method4363(var34, var10); var34.length() > 0; var20 = var20 + var32.ascent + 1) {
													var24 = var34.indexOf("<br>");
													if (var24 != -1) {
														var43 = var34.substring(0, var24);
														var34 = var34.substring(var24 + 4);
													} else {
														var43 = var34;
														var34 = "";
													}

													var25 = var32.stringWidth(var43);
													if (var25 > var30) {
														var30 = var25;
													}
												}

												var30 += 6;
												var20 += 7;
												var24 = var12 + var10.width - 5 - var30;
												var25 = var13 + var10.height + 5;
												if (var24 < var12 + 5) {
													var24 = var12 + 5;
												}

												if (var24 + var30 > var4) {
													var24 = var4 - var30;
												}

												if (var25 + var20 > var5) {
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var30, var20, 16777120);
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var30, var20, 0);
												var34 = var10.text;
												var26 = var25 + var32.ascent + 2;

												for (var34 = class232.method4363(var34, var10); var34.length() > 0; var26 = var26 + var32.ascent + 1) {
													int var35 = var34.indexOf("<br>");
													if (var35 != -1) {
														var43 = var34.substring(0, var35);
														var34 = var34.substring(var35 + 4);
													} else {
														var43 = var34;
														var34 = "";
													}

													var32.draw(var43, var24 + 3, var26, 0, -1);
												}
											}

											if (var10.type == 9) {
												if (var10.field2727) {
													var30 = var12;
													var20 = var13 + var10.height;
													var21 = var12 + var10.width;
													var22 = var13;
												} else {
													var30 = var12;
													var20 = var13;
													var21 = var12 + var10.width;
													var22 = var13 + var10.height;
												}

												if (var10.lineWid == 1) {
													Rasterizer2D.Rasterizer2D_drawLine(var30, var20, var21, var22, var10.color);
												} else {
													ByteArrayPool.method5575(var30, var20, var21, var22, var10.color, var10.lineWid);
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
