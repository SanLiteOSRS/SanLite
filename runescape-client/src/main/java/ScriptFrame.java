import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -364828753
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("f")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("y")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/io/File;",
		garbageValue = "-128953674"
	)
	@Export("getFile")
	public static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) {
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0);
			if (var1 != null) {
				return var1;
			} else {
				File var2 = new File(FileSystem.FileSystem_cacheDir, var0);
				RandomAccessFile var3 = null;

				try {
					File var4 = new File(var2.getParent());
					if (!var4.exists()) {
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw");
						int var5 = var3.read();
						var3.seek(0L);
						var3.write(var5);
						var3.seek(0L);
						var3.close();
						FileSystem.FileSystem_cacheFiles.put(var0, var2);
						return var2;
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) {
							var3.close();
							var3 = null;
						}
					} catch (Exception var7) {
					}

					throw new RuntimeException();
				}
			}
		}
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1213701936"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		if (class93.localPlayer.x >> 7 == Client.destinationX && class93.localPlayer.y >> 7 == Client.destinationY) {
			Client.destinationX = 0;
		}

		Decimator.method1068();
		GameObject.method4279();
		GrandExchangeOfferOwnWorldComparator.addNpcsToScene(true);
		class373.method6474();
		GrandExchangeOfferOwnWorldComparator.addNpcsToScene(false);

		int var6;
		for (Projectile var4 = (Projectile)Client.projectiles.last(); var4 != null; var4 = (Projectile)Client.projectiles.previous()) {
			if (var4.plane == class22.Client_plane && Client.cycle <= var4.cycleEnd) {
				if (Client.cycle >= var4.cycleStart) {
					if (var4.targetIndex > 0) {
						NPC var19 = Client.npcs[var4.targetIndex - 1];
						if (var19 != null && var19.x >= 0 && var19.x < 13312 && var19.y >= 0 && var19.y < 13312) {
							var4.setDestination(var19.x, var19.y, class105.getTileHeight(var19.x, var19.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					if (var4.targetIndex < 0) {
						var6 = -var4.targetIndex - 1;
						Player var22;
						if (var6 == Client.localPlayerIndex) {
							var22 = class93.localPlayer;
						} else {
							var22 = Client.players[var6];
						}

						if (var22 != null && var22.x >= 0 && var22.x < 13312 && var22.y >= 0 && var22.y < 13312) {
							var4.setDestination(var22.x, var22.y, class105.getTileHeight(var22.x, var22.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					var4.advance(Client.field913);
					AbstractSocket.scene.drawEntity(class22.Client_plane, (int)var4.x, (int)var4.y, (int)var4.z, 60, var4, var4.yaw, -1L, false);
				}
			} else {
				var4.remove();
			}
		}

		for (GraphicsObject var20 = (GraphicsObject)Client.graphicsObjects.last(); var20 != null; var20 = (GraphicsObject)Client.graphicsObjects.previous()) {
			if (var20.plane == class22.Client_plane && !var20.isFinished) {
				if (Client.cycle >= var20.cycleStart) {
					var20.advance(Client.field913);
					if (var20.isFinished) {
						var20.remove();
					} else {
						AbstractSocket.scene.drawEntity(var20.plane, var20.x, var20.y, var20.height, 60, var20, 0, -1L, false);
					}
				}
			} else {
				var20.remove();
			}
		}

		UrlRequester.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
		int var5;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		int var18;
		if (!Client.isCameraLocked) {
			var18 = Client.camAngleX;
			if (Client.field727 / 256 > var18) {
				var18 = Client.field727 / 256;
			}

			if (Client.field693[4] && Client.field891[4] + 128 > var18) {
				var18 = Client.field891[4] + 128;
			}

			var5 = Client.camAngleY & 2047;
			var6 = RouteStrategy.oculusOrbFocalPointX;
			var7 = class17.field148;
			var8 = ModelData0.oculusOrbFocalPointY;
			var9 = SecureRandomFuture.method1980(var18);
			var9 = WorldMapDecoration.method3627(var9, var3);
			var10 = 2048 - var18 & 2047;
			var11 = 2048 - var5 & 2047;
			var12 = 0;
			var13 = 0;
			var14 = var9;
			int var15;
			int var16;
			int var17;
			if (var10 != 0) {
				var15 = Rasterizer3D.Rasterizer3D_sine[var10];
				var16 = Rasterizer3D.Rasterizer3D_cosine[var10];
				var17 = var13 * var16 - var15 * var9 >> 16;
				var14 = var15 * var13 + var9 * var16 >> 16;
				var13 = var17;
			}

			if (var11 != 0) {
				var15 = Rasterizer3D.Rasterizer3D_sine[var11];
				var16 = Rasterizer3D.Rasterizer3D_cosine[var11];
				var17 = var12 * var16 + var14 * var15 >> 16;
				var14 = var14 * var16 - var12 * var15 >> 16;
				var12 = var17;
			}

			MouseHandler.cameraX = var6 - var12;
			SecureRandomCallable.cameraY = var7 - var13;
			class105.cameraZ = var8 - var14;
			SpotAnimationDefinition.cameraPitch = var18;
			class376.cameraYaw = var5;
			if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (RouteStrategy.oculusOrbFocalPointX >> 7 != class93.localPlayer.x >> 7 || ModelData0.oculusOrbFocalPointY >> 7 != class93.localPlayer.y >> 7)) {
				var15 = class93.localPlayer.plane;
				var16 = VertexNormal.baseX * 64 + (RouteStrategy.oculusOrbFocalPointX >> 7);
				var17 = SoundSystem.baseY * 64 + (ModelData0.oculusOrbFocalPointY >> 7);
				class4.method50(var16, var17, var15, true);
			}
		}

		if (!Client.isCameraLocked) {
			if (ObjectComposition.clientPreferences.roofsHidden) {
				var5 = class22.Client_plane;
			} else {
				label407: {
					var6 = 3;
					if (SpotAnimationDefinition.cameraPitch < 310) {
						label405: {
							if (Client.oculusOrbState == 1) {
								var7 = RouteStrategy.oculusOrbFocalPointX >> 7;
								var8 = ModelData0.oculusOrbFocalPointY >> 7;
							} else {
								var7 = class93.localPlayer.x >> 7;
								var8 = class93.localPlayer.y >> 7;
							}

							var9 = MouseHandler.cameraX >> 7;
							var10 = class105.cameraZ >> 7;
							if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) {
								if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
									if ((Tiles.Tiles_renderFlags[class22.Client_plane][var9][var10] & 4) != 0) {
										var6 = class22.Client_plane;
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

										while (true) {
											if (var7 == var9) {
												break label405;
											}

											if (var9 < var7) {
												++var9;
											} else if (var9 > var7) {
												--var9;
											}

											if ((Tiles.Tiles_renderFlags[class22.Client_plane][var9][var10] & 4) != 0) {
												var6 = class22.Client_plane;
											}

											var14 += var13;
											if (var14 >= 65536) {
												var14 -= 65536;
												if (var10 < var8) {
													++var10;
												} else if (var10 > var8) {
													--var10;
												}

												if ((Tiles.Tiles_renderFlags[class22.Client_plane][var9][var10] & 4) != 0) {
													var6 = class22.Client_plane;
												}
											}
										}
									} else {
										if (var12 > 0) {
											var13 = var11 * 65536 / var12;
											var14 = 32768;

											while (var10 != var8) {
												if (var10 < var8) {
													++var10;
												} else if (var10 > var8) {
													--var10;
												}

												if ((Tiles.Tiles_renderFlags[class22.Client_plane][var9][var10] & 4) != 0) {
													var6 = class22.Client_plane;
												}

												var14 += var13;
												if (var14 >= 65536) {
													var14 -= 65536;
													if (var9 < var7) {
														++var9;
													} else if (var9 > var7) {
														--var9;
													}

													if ((Tiles.Tiles_renderFlags[class22.Client_plane][var9][var10] & 4) != 0) {
														var6 = class22.Client_plane;
													}
												}
											}
										}
										break label405;
									}
								}

								var5 = class22.Client_plane;
								break label407;
							}

							var5 = class22.Client_plane;
							break label407;
						}
					}

					if (class93.localPlayer.x >= 0 && class93.localPlayer.y >= 0 && class93.localPlayer.x < 13312 && class93.localPlayer.y < 13312) {
						if ((Tiles.Tiles_renderFlags[class22.Client_plane][class93.localPlayer.x >> 7][class93.localPlayer.y >> 7] & 4) != 0) {
							var6 = class22.Client_plane;
						}

						var5 = var6;
					} else {
						var5 = class22.Client_plane;
					}
				}
			}

			var18 = var5;
		} else {
			var18 = class32.method305();
		}

		var5 = MouseHandler.cameraX;
		var6 = SecureRandomCallable.cameraY;
		var7 = class105.cameraZ;
		var8 = SpotAnimationDefinition.cameraPitch;
		var9 = class376.cameraYaw;

		for (var10 = 0; var10 < 5; ++var10) {
			if (Client.field693[var10]) {
				var11 = (int)(Math.random() * (double)(Client.field890[var10] * 2 + 1) - (double)Client.field890[var10] + Math.sin((double)Client.field893[var10] * ((double)Client.field892[var10] / 100.0D)) * (double)Client.field891[var10]);
				if (var10 == 0) {
					MouseHandler.cameraX += var11;
				}

				if (var10 == 1) {
					SecureRandomCallable.cameraY += var11;
				}

				if (var10 == 2) {
					class105.cameraZ += var11;
				}

				if (var10 == 3) {
					class376.cameraYaw = var11 + class376.cameraYaw & 2047;
				}

				if (var10 == 4) {
					SpotAnimationDefinition.cameraPitch += var11;
					if (SpotAnimationDefinition.cameraPitch < 128) {
						SpotAnimationDefinition.cameraPitch = 128;
					}

					if (SpotAnimationDefinition.cameraPitch > 383) {
						SpotAnimationDefinition.cameraPitch = 383;
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
			class135.method2599(var10 - var0, var11 - var1);
		} else {
			class80.method1906();
		}

		HealthBarUpdate.playPcmPlayers();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		HealthBarUpdate.playPcmPlayers();
		var12 = Rasterizer3D.Rasterizer3D_zoom;
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom;
		AbstractSocket.scene.draw(MouseHandler.cameraX, SecureRandomCallable.cameraY, class105.cameraZ, SpotAnimationDefinition.cameraPitch, class376.cameraYaw, var18);
		Rasterizer3D.Rasterizer3D_zoom = var12;
		HealthBarUpdate.playPcmPlayers();
		AbstractSocket.scene.clearTempGameObjects();
		NetCache.method5025(var0, var1, var2, var3);
		ChatChannel.method2014(var0, var1);
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field913);
		class27.method283(var0, var1, var2, var3);
		MouseHandler.cameraX = var5;
		SecureRandomCallable.cameraY = var6;
		class105.cameraZ = var7;
		SpotAnimationDefinition.cameraPitch = var8;
		class376.cameraYaw = var9;
		if (Client.isLoading) {
			byte var21 = 0;
			var14 = var21 + NetCache.NetCache_pendingPriorityWritesCount + NetCache.NetCache_pendingPriorityResponsesCount;
			if (var14 == 0) {
				Client.isLoading = false;
			}
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			DirectByteArrayCopier.drawLoadingMessage("Loading - please wait.", false);
		}

	}
}
