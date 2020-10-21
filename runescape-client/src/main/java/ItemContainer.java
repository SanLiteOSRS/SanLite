import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		signature = "[Lht;"
	)
	static Widget[] field572;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Llp;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1891201755
	)
	static int field570;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -390637403
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("hu")
	@ObfuscatedGetter(
		intValue = -966847555
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("b")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("l")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32);
	}

	ItemContainer() {
		this.ids = new int[]{-1};
		this.quantities = new int[]{0};
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(III)Lht;",
		garbageValue = "-398427140"
	)
	@Export("getWidgetChild")
	public static Widget getWidgetChild(int var0, int var1) {
		Widget var2 = UserComparator4.getWidget(var0);
		if (var1 == -1) {
			return var2;
		} else {
			return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null;
		}
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		signature = "(IIIII)V",
		garbageValue = "535558525"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		class200.method3804();
		if (Client.renderSelf) {
			ArchiveLoader.addPlayerToScene(PlayerType.localPlayer, false);
		}

		Projectile.method2226();
		GrandExchangeOfferNameComparator.addNpcsToScene(true);
		MusicPatchNode.method3973();
		GrandExchangeOfferNameComparator.addNpcsToScene(false);
		Login.method2200();
		MouseRecorder.method1285();
		Coord.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
		int var4;
		int var5;
		if (!Client.isCameraLocked) {
			var4 = Client.camAngleX;
			if (Client.field810 / 256 > var4) {
				var4 = Client.field810 / 256;
			}

			if (Client.field926[4] && Client.field928[4] + 128 > var4) {
				var4 = Client.field928[4] + 128;
			}

			var5 = Client.camAngleY & 2047;
			class7.method112(TileItem.oculusOrbFocalPointX, Tiles.field542, Interpreter.oculusOrbFocalPointY, var4, var5, MilliClock.method3587(var4), var3);
		}

		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		if (!Client.isCameraLocked) {
			if (GrandExchangeOfferAgeComparator.clientPreferences.roofsHidden) {
				var5 = GrandExchangeOfferUnitPriceComparator.Client_plane;
			} else {
				label555: {
					var6 = 3;
					if (World.cameraPitch < 310) {
						if (Client.oculusOrbState == 1) {
							var7 = TileItem.oculusOrbFocalPointX >> 7;
							var8 = Interpreter.oculusOrbFocalPointY >> 7;
						} else {
							var7 = PlayerType.localPlayer.x >> 7;
							var8 = PlayerType.localPlayer.y >> 7;
						}

						var9 = cameraX >> 7;
						var10 = WorldMapManager.cameraZ >> 7;
						if (var9 < 0 || var10 < 0 || var9 >= 104 || var10 >= 104) {
							var5 = GrandExchangeOfferUnitPriceComparator.Client_plane;
							break label555;
						}

						if (var7 < 0 || var8 < 0 || var7 >= 104 || var8 >= 104) {
							var5 = GrandExchangeOfferUnitPriceComparator.Client_plane;
							break label555;
						}

						if ((Tiles.Tiles_renderFlags[GrandExchangeOfferUnitPriceComparator.Client_plane][var9][var10] & 4) != 0) {
							var6 = GrandExchangeOfferUnitPriceComparator.Client_plane;
						}

						if (var7 > var9) {
							var11 = var7 - var9;
						} else {
							var11 = var9 - var7;
						}

						if (var8 > var10) {
							var12 = var8 - var10;
						} else {
							var12 = var10 - var8;
						}

						if (var11 > var12) {
							var13 = var12 * 65536 / var11;
							var14 = 32768;

							while (var7 != var9) {
								if (var9 < var7) {
									++var9;
								} else if (var9 > var7) {
									--var9;
								}

								if ((Tiles.Tiles_renderFlags[GrandExchangeOfferUnitPriceComparator.Client_plane][var9][var10] & 4) != 0) {
									var6 = GrandExchangeOfferUnitPriceComparator.Client_plane;
								}

								var14 += var13;
								if (var14 >= 65536) {
									var14 -= 65536;
									if (var10 < var8) {
										++var10;
									} else if (var10 > var8) {
										--var10;
									}

									if ((Tiles.Tiles_renderFlags[GrandExchangeOfferUnitPriceComparator.Client_plane][var9][var10] & 4) != 0) {
										var6 = GrandExchangeOfferUnitPriceComparator.Client_plane;
									}
								}
							}
						} else if (var12 > 0) {
							var13 = var11 * 65536 / var12;
							var14 = 32768;

							while (var8 != var10) {
								if (var10 < var8) {
									++var10;
								} else if (var10 > var8) {
									--var10;
								}

								if ((Tiles.Tiles_renderFlags[GrandExchangeOfferUnitPriceComparator.Client_plane][var9][var10] & 4) != 0) {
									var6 = GrandExchangeOfferUnitPriceComparator.Client_plane;
								}

								var14 += var13;
								if (var14 >= 65536) {
									var14 -= 65536;
									if (var9 < var7) {
										++var9;
									} else if (var9 > var7) {
										--var9;
									}

									if ((Tiles.Tiles_renderFlags[GrandExchangeOfferUnitPriceComparator.Client_plane][var9][var10] & 4) != 0) {
										var6 = GrandExchangeOfferUnitPriceComparator.Client_plane;
									}
								}
							}
						}
					}

					if (PlayerType.localPlayer.x >= 0 && PlayerType.localPlayer.y >= 0 && PlayerType.localPlayer.x < 13312 && PlayerType.localPlayer.y < 13312) {
						if ((Tiles.Tiles_renderFlags[GrandExchangeOfferUnitPriceComparator.Client_plane][PlayerType.localPlayer.x >> 7][PlayerType.localPlayer.y >> 7] & 4) != 0) {
							var6 = GrandExchangeOfferUnitPriceComparator.Client_plane;
						}

						var5 = var6;
					} else {
						var5 = GrandExchangeOfferUnitPriceComparator.Client_plane;
					}
				}
			}

			var4 = var5;
		} else {
			if (GrandExchangeOfferAgeComparator.clientPreferences.roofsHidden) {
				var5 = GrandExchangeOfferUnitPriceComparator.Client_plane;
			} else {
				var6 = GrandExchangeOfferWorldComparator.getTileHeight(cameraX, WorldMapManager.cameraZ, GrandExchangeOfferUnitPriceComparator.Client_plane);
				if (var6 - ChatChannel.cameraY < 800 && (Tiles.Tiles_renderFlags[GrandExchangeOfferUnitPriceComparator.Client_plane][cameraX >> 7][WorldMapManager.cameraZ >> 7] & 4) != 0) {
					var5 = GrandExchangeOfferUnitPriceComparator.Client_plane;
				} else {
					var5 = 3;
				}
			}

			var4 = var5;
		}

		var5 = cameraX;
		var6 = ChatChannel.cameraY;
		var7 = WorldMapManager.cameraZ;
		var8 = World.cameraPitch;
		var9 = ViewportMouse.cameraYaw;

		for (var10 = 0; var10 < 5; ++var10) {
			if (Client.field926[var10]) {
				var11 = (int)(Math.random() * (double)(Client.field927[var10] * 2 + 1) - (double)Client.field927[var10] + Math.sin((double)Client.field918[var10] * ((double)Client.field898[var10] / 100.0D)) * (double)Client.field928[var10]);
				if (var10 == 0) {
					cameraX += var11;
				}

				if (var10 == 1) {
					ChatChannel.cameraY += var11;
				}

				if (var10 == 2) {
					WorldMapManager.cameraZ += var11;
				}

				if (var10 == 3) {
					ViewportMouse.cameraYaw = var11 + ViewportMouse.cameraYaw & 2047;
				}

				if (var10 == 4) {
					World.cameraPitch += var11;
					if (World.cameraPitch < 128) {
						World.cameraPitch = 128;
					}

					if (World.cameraPitch > 383) {
						World.cameraPitch = 383;
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
			var12 = var10 - var0;
			var13 = var11 - var1;
			ViewportMouse.ViewportMouse_x = var12;
			ViewportMouse.ViewportMouse_y = var13;
			ViewportMouse.ViewportMouse_isInViewport = true;
			ViewportMouse.ViewportMouse_entityCount = 0;
			ViewportMouse.ViewportMouse_false0 = false;
		} else {
			class23.method252();
		}

		FriendSystem.playPcmPlayers();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		FriendSystem.playPcmPlayers();
		var12 = Rasterizer3D.Rasterizer3D_zoom;
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom;
		ModeWhere.scene.draw(cameraX, ChatChannel.cameraY, WorldMapManager.cameraZ, World.cameraPitch, ViewportMouse.cameraYaw, var4);
		Rasterizer3D.Rasterizer3D_zoom = var12;
		FriendSystem.playPcmPlayers();
		ModeWhere.scene.clearTempGameObjects();
		Client.overheadTextCount = 0;
		boolean var30 = false;
		var14 = -1;
		int var15 = -1;
		int var16 = Players.Players_count;
		int[] var17 = Players.Players_indices;

		int var18;
		for (var18 = 0; var18 < var16 + Client.npcCount; ++var18) {
			Object var19;
			if (var18 < var16) {
				var19 = Client.players[var17[var18]];
				if (var17[var18] == Client.combatTargetPlayerIndex) {
					var30 = true;
					var14 = var18;
					continue;
				}

				if (var19 == PlayerType.localPlayer) {
					var15 = var18;
					continue;
				}
			} else {
				var19 = Client.npcs[Client.npcIndices[var18 - var16]];
			}

			class1.drawActor2d((Actor)var19, var18, var0, var1, var2, var3);
		}

		if (Client.renderSelf && var15 != -1) {
			class1.drawActor2d(PlayerType.localPlayer, var15, var0, var1, var2, var3);
		}

		if (var30) {
			class1.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var14, var0, var1, var2, var3);
		}

		for (var18 = 0; var18 < Client.overheadTextCount; ++var18) {
			int var28 = Client.overheadTextXs[var18];
			int var20 = Client.overheadTextYs[var18];
			int var21 = Client.overheadTextXOffsets[var18];
			int var22 = Client.overheadTextAscents[var18];
			boolean var23 = true;

			while (var23) {
				var23 = false;

				for (int var24 = 0; var24 < var18; ++var24) {
					if (var20 + 2 > Client.overheadTextYs[var24] - Client.overheadTextAscents[var24] && var20 - var22 < Client.overheadTextYs[var24] + 2 && var28 - var21 < Client.overheadTextXOffsets[var24] + Client.overheadTextXs[var24] && var28 + var21 > Client.overheadTextXs[var24] - Client.overheadTextXOffsets[var24] && Client.overheadTextYs[var24] - Client.overheadTextAscents[var24] < var20) {
						var20 = Client.overheadTextYs[var24] - Client.overheadTextAscents[var24];
						var23 = true;
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var18];
			Client.viewportTempY = Client.overheadTextYs[var18] = var20;
			String var29 = Client.overheadText[var18];
			if (Client.chatEffects == 0) {
				int var25 = 16776960;
				if (Client.overheadTextColors[var18] < 6) {
					var25 = Client.field896[Client.overheadTextColors[var18]];
				}

				if (Client.overheadTextColors[var18] == 6) {
					var25 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var18] == 7) {
					var25 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var18] == 8) {
					var25 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var26;
				if (Client.overheadTextColors[var18] == 9) {
					var26 = 150 - Client.overheadTextCyclesRemaining[var18];
					if (var26 < 50) {
						var25 = var26 * 1280 + 16711680;
					} else if (var26 < 100) {
						var25 = 16776960 - (var26 - 50) * 327680;
					} else if (var26 < 150) {
						var25 = (var26 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var18] == 10) {
					var26 = 150 - Client.overheadTextCyclesRemaining[var18];
					if (var26 < 50) {
						var25 = var26 * 5 + 16711680;
					} else if (var26 < 100) {
						var25 = 16711935 - (var26 - 50) * 327680;
					} else if (var26 < 150) {
						var25 = (var26 - 100) * 327680 + 255 - (var26 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var18] == 11) {
					var26 = 150 - Client.overheadTextCyclesRemaining[var18];
					if (var26 < 50) {
						var25 = 16777215 - var26 * 327685;
					} else if (var26 < 100) {
						var25 = (var26 - 50) * 327685 + 65280;
					} else if (var26 < 150) {
						var25 = 16777215 - (var26 - 100) * 327680;
					}
				}

				if (Client.overheadTextEffects[var18] == 0) {
					ReflectionCheck.fontBold12.drawCentered(var29, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0);
				}

				if (Client.overheadTextEffects[var18] == 1) {
					ReflectionCheck.fontBold12.drawCenteredWave(var29, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var18] == 2) {
					ReflectionCheck.fontBold12.drawCenteredWave2(var29, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var18] == 3) {
					ReflectionCheck.fontBold12.drawCenteredShake(var29, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var18]);
				}

				if (Client.overheadTextEffects[var18] == 4) {
					var26 = (150 - Client.overheadTextCyclesRemaining[var18]) * (ReflectionCheck.fontBold12.stringWidth(var29) + 100) / 150;
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1);
					ReflectionCheck.fontBold12.draw(var29, var0 + Client.viewportTempX + 50 - var26, Client.viewportTempY + var1, var25, 0);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}

				if (Client.overheadTextEffects[var18] == 5) {
					var26 = 150 - Client.overheadTextCyclesRemaining[var18];
					int var27 = 0;
					if (var26 < 25) {
						var27 = var26 - 25;
					} else if (var26 > 125) {
						var27 = var26 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - ReflectionCheck.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5);
					ReflectionCheck.fontBold12.drawCentered(var29, var0 + Client.viewportTempX, var27 + Client.viewportTempY + var1, var25, 0);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}
			} else {
				ReflectionCheck.fontBold12.drawCentered(var29, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0);
			}
		}

		if (Client.hintArrowType == 2) {
			class13.worldToScreen(Client.hintArrowSubX * 64 + (Client.hintArrowX - FloorDecoration.baseX * 64 << 7), Client.hintArrowSubY * 64 + (Client.hintArrowY - WorldMapData_0.baseY * 64 << 7), Client.hintArrowHeight * 2);
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
				class337.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field743);
		WorldMapScaleHandler.method864(var0, var1, var2, var3);
		cameraX = var5;
		ChatChannel.cameraY = var6;
		WorldMapManager.cameraZ = var7;
		World.cameraPitch = var8;
		ViewportMouse.cameraYaw = var9;
		if (Client.isLoading) {
			byte var31 = 0;
			var14 = var31 + NetCache.NetCache_pendingPriorityWritesCount + NetCache.NetCache_pendingPriorityResponsesCount;
			if (var14 == 0) {
				Client.isLoading = false;
			}
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			AbstractWorldMapData.drawLoadingMessage("Loading - please wait.", false);
		}

	}
}
