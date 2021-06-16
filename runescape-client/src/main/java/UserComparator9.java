import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1946098059
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("f")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lly;Lly;B)I",
		garbageValue = "6"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lns;II)V",
		garbageValue = "798107312"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset;
		Players.Players_pendingUpdateCount = 0;
		AbstractArchive.method5160(var0);

		for (int var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) {
			int var4 = Players.Players_pendingUpdateIndices[var3];
			Player var5 = Client.players[var4];
			int var6 = var0.readUnsignedByte();
			if ((var6 & 128) != 0) {
				var6 += var0.readUnsignedByte() << 8;
			}

			method2561(var0, var4, var5, var6);
		}

		if (var0.offset - var2 != var1) {
			throw new RuntimeException(var0.offset - var2 + " " + var1);
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lns;ILcj;II)V",
		garbageValue = "1472974577"
	)
	static final void method2561(PacketBuffer var0, int var1, Player var2, int var3) {
		byte var4 = -1;
		int var5;
		if ((var3 & 4) != 0) {
			var5 = var0.readUnsignedByte();
			byte[] var6 = new byte[var5];
			Buffer var7 = new Buffer(var6);
			var0.method6821(var6, 0, var5);
			Players.field1362[var1] = var7;
			var2.read(var7);
		}

		int var8;
		int var9;
		int var12;
		int var13;
		if ((var3 & 2) != 0) {
			var5 = var0.readUnsignedByte();
			int var10;
			int var14;
			int var15;
			if (var5 > 0) {
				for (var13 = 0; var13 < var5; ++var13) {
					var8 = -1;
					var9 = -1;
					var10 = -1;
					var14 = var0.readUShortSmart();
					if (var14 == 32767) {
						var14 = var0.readUShortSmart();
						var9 = var0.readUShortSmart();
						var8 = var0.readUShortSmart();
						var10 = var0.readUShortSmart();
					} else if (var14 != 32766) {
						var9 = var0.readUShortSmart();
					} else {
						var14 = -1;
					}

					var15 = var0.readUShortSmart();
					var2.addHitSplat(var14, var9, var8, var10, Client.cycle, var15);
				}
			}

			var13 = var0.method6643();
			if (var13 > 0) {
				for (var14 = 0; var14 < var13; ++var14) {
					var8 = var0.readUShortSmart();
					var9 = var0.readUShortSmart();
					if (var9 != 32767) {
						var10 = var0.readUShortSmart();
						var15 = var0.method6643();
						var12 = var9 > 0 ? var0.readUnsignedByte() : var15;
						var2.addHealthBar(var8, Client.cycle, var9, var10, var15, var12);
					} else {
						var2.removeHealthBar(var8);
					}
				}
			}
		}

		if ((var3 & 2048) != 0) {
			for (var5 = 0; var5 < 3; ++var5) {
				var2.actions[var5] = var0.readStringCp1252NullTerminated();
			}
		}

		if ((var3 & 512) != 0) {
			var2.spotAnimation = var0.readUnsignedShort();
			var5 = var0.method6675();
			var2.field1263 = var5 >> 16;
			var2.field1262 = (var5 & 65535) + Client.cycle;
			var2.spotAnimationFrame = 0;
			var2.spotAnimationFrameCycle = 0;
			if (var2.field1262 > Client.cycle) {
				var2.spotAnimationFrame = -1;
			}

			if (var2.spotAnimation == 65535) {
				var2.spotAnimation = -1;
			}
		}

		if ((var3 & 8) != 0) {
			var2.overheadText = var0.readStringCp1252NullTerminated();
			if (var2.overheadText.charAt(0) == '~') {
				var2.overheadText = var2.overheadText.substring(1);
				UserComparator10.addGameMessage(2, var2.username.getName(), var2.overheadText);
			} else if (var2 == class262.localPlayer) {
				UserComparator10.addGameMessage(2, var2.username.getName(), var2.overheadText);
			}

			var2.isAutoChatting = false;
			var2.overheadTextColor = 0;
			var2.overheadTextEffect = 0;
			var2.overheadTextCyclesRemaining = 150;
		}

		if ((var3 & 64) != 0) {
			var5 = var0.method6653();
			PlayerType var16 = (PlayerType)Clock.findEnumerated(class106.PlayerType_values(), var0.method6644());
			boolean var19 = var0.method6644() == 1;
			var8 = var0.method6644();
			var9 = var0.offset;
			if (var2.username != null && var2.appearance != null) {
				boolean var18 = false;
				if (var16.isUser && DevicePcmPlayerProvider.friendSystem.isIgnored(var2.username)) {
					var18 = true;
				}

				if (!var18 && Client.field629 == 0 && !var2.isHidden) {
					Players.field1373.offset = 0;
					var0.method6821(Players.field1373.array, 0, var8);
					Players.field1373.offset = 0;
					String var11 = AbstractFont.escapeBrackets(GrandExchangeEvents.method5182(WorldMapIcon_1.method3304(Players.field1373)));
					var2.overheadText = var11.trim();
					var2.overheadTextColor = var5 >> 8;
					var2.overheadTextEffect = var5 & 255;
					var2.overheadTextCyclesRemaining = 150;
					var2.isAutoChatting = var19;
					var2.field1253 = var2 != class262.localPlayer && var16.isUser && "" != Client.field642 && var11.toLowerCase().indexOf(Client.field642) == -1;
					if (var16.isPrivileged) {
						var12 = var19 ? 91 : 1;
					} else {
						var12 = var19 ? 90 : 2;
					}

					if (var16.modIcon != -1) {
						UserComparator10.addGameMessage(var12, MusicPatchPcmStream.method4743(var16.modIcon) + var2.username.getName(), var11);
					} else {
						UserComparator10.addGameMessage(var12, var2.username.getName(), var11);
					}
				}
			}

			var0.offset = var8 + var9;
		}

		if ((var3 & 16) != 0) {
			var2.targetIndex = var0.method6652();
			if (var2.targetIndex == 65535) {
				var2.targetIndex = -1;
			}
		}

		if ((var3 & 4096) != 0) {
			Players.field1361[var1] = var0.method6619();
		}

		if ((var3 & 32) != 0) {
			var5 = var0.method6651();
			if (var5 == 65535) {
				var5 = -1;
			}

			var13 = var0.readUnsignedByte();
			World.performPlayerAnimation(var2, var5, var13);
		}

		if ((var3 & 8192) != 0) {
			var2.field1264 = var0.readByte();
			var2.field1268 = var0.method6682();
			var2.field1265 = var0.readByte();
			var2.field1267 = var0.method6682();
			var2.field1276 = var0.method6653() + Client.cycle;
			var2.field1269 = var0.method6652() + Client.cycle;
			var2.field1270 = var0.method6653();
			if (var2.field1201) {
				var2.field1264 += var2.tileX;
				var2.field1268 += var2.tileY;
				var2.field1265 += var2.tileX;
				var2.field1267 += var2.tileY;
				var2.pathLength = 0;
			} else {
				var2.field1264 += var2.pathX[0];
				var2.field1268 += var2.pathY[0];
				var2.field1265 += var2.pathX[0];
				var2.field1267 += var2.pathY[0];
				var2.pathLength = 1;
			}

			var2.field1281 = 0;
		}

		if ((var3 & 256) != 0) {
			var4 = var0.method6619();
		}

		if ((var3 & 1) != 0) {
			var2.field1280 = var0.method6652();
			if (var2.pathLength == 0) {
				var2.orientation = var2.field1280;
				var2.field1280 = -1;
			}
		}

		if (var2.field1201) {
			if (var4 == 127) {
				var2.resetPath(var2.tileX, var2.tileY);
			} else {
				byte var17;
				if (var4 != -1) {
					var17 = var4;
				} else {
					var17 = Players.field1361[var1];
				}

				var2.method2217(var2.tileX, var2.tileY, var17);
			}
		}

	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1473289711"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		if (class262.localPlayer.x >> 7 == Client.destinationX && class262.localPlayer.y >> 7 == Client.destinationY) {
			Client.destinationX = 0;
		}

		class15.method238();
		MouseHandler.method741();
		DevicePcmPlayerProvider.addNpcsToScene(true);
		int var4 = Players.Players_count;
		int[] var5 = Players.Players_indices;

		int var6;
		for (var6 = 0; var6 < var4; ++var6) {
			if (var5[var6] != Client.combatTargetPlayerIndex && var5[var6] != Client.localPlayerIndex) {
				class160.addPlayerToScene(Client.players[var5[var6]], true);
			}
		}

		DevicePcmPlayerProvider.addNpcsToScene(false);
		MusicPatchPcmStream.method4762();

		for (GraphicsObject var15 = (GraphicsObject)Client.graphicsObjects.last(); var15 != null; var15 = (GraphicsObject)Client.graphicsObjects.previous()) {
			if (var15.plane == SoundSystem.Client_plane && !var15.isFinished) {
				if (Client.cycle >= var15.cycleStart) {
					var15.advance(Client.field683);
					if (var15.isFinished) {
						var15.remove();
					} else {
						DevicePcmPlayerProvider.scene.drawEntity(var15.plane, var15.x, var15.y, var15.height, 60, var15, 0, -1L, false);
					}
				}
			} else {
				var15.remove();
			}
		}

		Interpreter.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
		int var16;
		if (!Client.isCameraLocked) {
			var4 = Client.camAngleX;
			if (Client.field708 / 256 > var4) {
				var4 = Client.field708 / 256;
			}

			if (Client.field871[4] && Client.field873[4] + 128 > var4) {
				var4 = Client.field873[4] + 128;
			}

			var16 = Client.camAngleY & 2047;
			VerticalAlignment.method2889(FriendSystem.oculusOrbFocalPointX, class14.field124, VarbitComposition.oculusOrbFocalPointY, var4, var16, NetSocket.method2676(var4), var3);
		}

		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		if (!Client.isCameraLocked) {
			if (class4.clientPreferences.roofsHidden) {
				var16 = SoundSystem.Client_plane;
			} else {
				label342: {
					var6 = 3;
					if (class69.cameraPitch < 310) {
						label340: {
							if (Client.oculusOrbState == 1) {
								var7 = FriendSystem.oculusOrbFocalPointX >> 7;
								var8 = VarbitComposition.oculusOrbFocalPointY >> 7;
							} else {
								var7 = class262.localPlayer.x >> 7;
								var8 = class262.localPlayer.y >> 7;
							}

							var9 = ObjectSound.cameraX >> 7;
							var10 = Canvas.cameraZ >> 7;
							if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) {
								if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
									if ((Tiles.Tiles_renderFlags[SoundSystem.Client_plane][var9][var10] & 4) != 0) {
										var6 = SoundSystem.Client_plane;
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

									int var13;
									int var14;
									if (var11 > var12) {
										var13 = var12 * 65536 / var11;
										var14 = 32768;

										while (true) {
											if (var7 == var9) {
												break label340;
											}

											if (var9 < var7) {
												++var9;
											} else if (var9 > var7) {
												--var9;
											}

											if ((Tiles.Tiles_renderFlags[SoundSystem.Client_plane][var9][var10] & 4) != 0) {
												var6 = SoundSystem.Client_plane;
											}

											var14 += var13;
											if (var14 >= 65536) {
												var14 -= 65536;
												if (var10 < var8) {
													++var10;
												} else if (var10 > var8) {
													--var10;
												}

												if ((Tiles.Tiles_renderFlags[SoundSystem.Client_plane][var9][var10] & 4) != 0) {
													var6 = SoundSystem.Client_plane;
												}
											}
										}
									} else {
										if (var12 > 0) {
											var13 = var11 * 65536 / var12;
											var14 = 32768;

											while (var8 != var10) {
												if (var10 < var8) {
													++var10;
												} else if (var10 > var8) {
													--var10;
												}

												if ((Tiles.Tiles_renderFlags[SoundSystem.Client_plane][var9][var10] & 4) != 0) {
													var6 = SoundSystem.Client_plane;
												}

												var14 += var13;
												if (var14 >= 65536) {
													var14 -= 65536;
													if (var9 < var7) {
														++var9;
													} else if (var9 > var7) {
														--var9;
													}

													if ((Tiles.Tiles_renderFlags[SoundSystem.Client_plane][var9][var10] & 4) != 0) {
														var6 = SoundSystem.Client_plane;
													}
												}
											}
										}
										break label340;
									}
								}

								var16 = SoundSystem.Client_plane;
								break label342;
							}

							var16 = SoundSystem.Client_plane;
							break label342;
						}
					}

					if (class262.localPlayer.x >= 0 && class262.localPlayer.y >= 0 && class262.localPlayer.x < 13312 && class262.localPlayer.y < 13312) {
						if ((Tiles.Tiles_renderFlags[SoundSystem.Client_plane][class262.localPlayer.x >> 7][class262.localPlayer.y >> 7] & 4) != 0) {
							var6 = SoundSystem.Client_plane;
						}

						var16 = var6;
					} else {
						var16 = SoundSystem.Client_plane;
					}
				}
			}

			var4 = var16;
		} else {
			var4 = class106.method2372();
		}

		var16 = ObjectSound.cameraX;
		var6 = class160.cameraY;
		var7 = Canvas.cameraZ;
		var8 = class69.cameraPitch;
		var9 = class32.cameraYaw;

		for (var10 = 0; var10 < 5; ++var10) {
			if (Client.field871[var10]) {
				var11 = (int)(Math.random() * (double)(Client.field872[var10] * 2 + 1) - (double)Client.field872[var10] + Math.sin((double)Client.field875[var10] * ((double)Client.field867[var10] / 100.0D)) * (double)Client.field873[var10]);
				if (var10 == 0) {
					ObjectSound.cameraX += var11;
				}

				if (var10 == 1) {
					class160.cameraY += var11;
				}

				if (var10 == 2) {
					Canvas.cameraZ += var11;
				}

				if (var10 == 3) {
					class32.cameraYaw = var11 + class32.cameraYaw & 2047;
				}

				if (var10 == 4) {
					class69.cameraPitch += var11;
					if (class69.cameraPitch < 128) {
						class69.cameraPitch = 128;
					}

					if (class69.cameraPitch > 383) {
						class69.cameraPitch = 383;
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
			class25.method339(var10 - var0, var11 - var1);
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false;
			ViewportMouse.ViewportMouse_entityCount = 0;
		}

		class233.playPcmPlayers();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		class233.playPcmPlayers();
		var12 = Rasterizer3D.Rasterizer3D_zoom;
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom;
		DevicePcmPlayerProvider.scene.draw(ObjectSound.cameraX, class160.cameraY, Canvas.cameraZ, class69.cameraPitch, class32.cameraYaw, var4);
		Rasterizer3D.Rasterizer3D_zoom = var12;
		class233.playPcmPlayers();
		DevicePcmPlayerProvider.scene.clearTempGameObjects();
		WorldMapDecoration.method3710(var0, var1, var2, var3);
		if (Client.hintArrowType == 2) {
			ClanChannel.worldToScreen(Client.hintArrowSubX * 64 + (Client.hintArrowX - class15.baseX * 64 << 7), Client.hintArrowSubY * 64 + (Client.hintArrowY - WorldMapSprite.baseY * 64 << 7), Client.hintArrowHeight * 4);
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
				Skills.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field683);
		Buddy.method5892();
		ObjectSound.cameraX = var16;
		class160.cameraY = var6;
		Canvas.cameraZ = var7;
		class69.cameraPitch = var8;
		class32.cameraYaw = var9;
		if (Client.isLoading && Archive.method5061(true, false) == 0) {
			Client.isLoading = false;
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			class143.drawLoadingMessage("Loading - please wait.", false);
		}

	}
}
