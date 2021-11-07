import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bi")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	static AbstractSocket field915;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -2098760211
	)
	@Export("id")
	int id;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -391632779
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 764309531
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -586694521
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1961022753
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -787475925
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 196209817
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 321994179
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 178012727
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -736390091
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1511364615
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("y")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("k")
	@Export("x")
	double x;
	@ObfuscatedName("t")
	@Export("y")
	double y;
	@ObfuscatedName("l")
	@Export("z")
	double z;
	@ObfuscatedName("u")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("n")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("z")
	@Export("speed")
	double speed;
	@ObfuscatedName("q")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("d")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1310821215
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1676153713
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1216775707
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1200268787
	)
	@Export("frameCycle")
	int frameCycle;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.isMoving = false;
		this.frame = 0;
		this.frameCycle = 0;
		this.id = var1;
		this.plane = var2;
		this.sourceX = var3;
		this.sourceY = var4;
		this.sourceZ = var5;
		this.cycleStart = var6;
		this.cycleEnd = var7;
		this.slope = var8;
		this.startHeight = var9;
		this.targetIndex = var10;
		this.endHeight = var11;
		this.isMoving = false;
		int var12 = BZip2State.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = MouseHandler.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "2083342033"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) {
			var5 = (double)(var1 - this.sourceX);
			double var7 = (double)(var2 - this.sourceY);
			double var9 = Math.sqrt(var7 * var7 + var5 * var5);
			this.x = (double)this.sourceX + var5 * (double)this.startHeight / var9;
			this.y = (double)this.sourceY + (double)this.startHeight * var7 / var9;
			this.z = (double)this.sourceZ;
		}

		var5 = (double)(this.cycleEnd + 1 - var4);
		this.speedX = ((double)var1 - this.x) / var5;
		this.speedY = ((double)var2 - this.y) / var5;
		this.speed = Math.sqrt(this.speedX * this.speedX + this.speedY * this.speedY);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan(0.02454369D * (double)this.slope);
		}

		this.accelerationZ = ((double)var3 - this.z - var5 * this.speedZ) * 2.0D / (var5 * var5);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Lhl;",
		garbageValue = "461766541"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = BZip2State.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1939244665"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += this.speedX * (double)var1;
		this.y += (double)var1 * this.speedY;
		this.z += (double)var1 * this.accelerationZ * 0.5D * (double)var1 + (double)var1 * this.speedZ;
		this.speedZ += this.accelerationZ * (double)var1;
		this.yaw = (int)(Math.atan2(this.speedX, this.speedY) * 325.949D) + 1024 & 2047;
		this.pitch = (int)(Math.atan2(this.speedZ, this.speed) * 325.949D) & 2047;
		if (this.sequenceDefinition != null) {
			this.frameCycle += var1;

			while (true) {
				do {
					do {
						if (this.frameCycle <= this.sequenceDefinition.frameLengths[this.frame]) {
							return;
						}

						this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
						++this.frame;
					} while(this.frame < this.sequenceDefinition.frameIds.length);

					this.frame -= this.sequenceDefinition.frameCount;
				} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

				this.frame = 0;
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Loj;II)V",
		garbageValue = "1062614166"
	)
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1;
		if (var2) {
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}

		int var3 = var0.readBits(2);
		Player var4 = Client.players[var1];
		if (var3 == 0) {
			if (var2) {
				var4.field1067 = false;
			} else if (Client.localPlayerIndex == var1) {
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (class19.baseX * 64 + var4.pathX[0] >> 13 << 14) + (DefaultsGroup.baseY * 64 + var4.pathY[0] >> 13);
				if (var4.field1112 != -1) {
					Players.Players_orientations[var1] = var4.field1112;
				} else {
					Players.Players_orientations[var1] = var4.orientation;
				}

				Players.Players_targetIndices[var1] = var4.targetIndex;
				Client.players[var1] = null;
				if (var0.readBits(1) != 0) {
					WorldMapData_0.updateExternalPlayer(var0, var1);
				}

			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) {
				var5 = var0.readBits(3);
				var6 = var4.pathX[0];
				var7 = var4.pathY[0];
				if (var5 == 0) {
					--var6;
					--var7;
				} else if (var5 == 1) {
					--var7;
				} else if (var5 == 2) {
					++var6;
					--var7;
				} else if (var5 == 3) {
					--var6;
				} else if (var5 == 4) {
					++var6;
				} else if (var5 == 5) {
					--var6;
					++var7;
				} else if (var5 == 6) {
					++var7;
				} else if (var5 == 7) {
					++var6;
					++var7;
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
					var4.resetPath(var6, var7);
					var4.field1067 = false;
				} else if (var2) {
					var4.field1067 = true;
					var4.tileX = var6;
					var4.tileY = var7;
				} else {
					var4.field1067 = false;
					var4.method2109(var6, var7, Players.field1241[var1]);
				}

			} else if (var3 == 2) {
				var5 = var0.readBits(4);
				var6 = var4.pathX[0];
				var7 = var4.pathY[0];
				if (var5 == 0) {
					var6 -= 2;
					var7 -= 2;
				} else if (var5 == 1) {
					--var6;
					var7 -= 2;
				} else if (var5 == 2) {
					var7 -= 2;
				} else if (var5 == 3) {
					++var6;
					var7 -= 2;
				} else if (var5 == 4) {
					var6 += 2;
					var7 -= 2;
				} else if (var5 == 5) {
					var6 -= 2;
					--var7;
				} else if (var5 == 6) {
					var6 += 2;
					--var7;
				} else if (var5 == 7) {
					var6 -= 2;
				} else if (var5 == 8) {
					var6 += 2;
				} else if (var5 == 9) {
					var6 -= 2;
					++var7;
				} else if (var5 == 10) {
					var6 += 2;
					++var7;
				} else if (var5 == 11) {
					var6 -= 2;
					var7 += 2;
				} else if (var5 == 12) {
					--var6;
					var7 += 2;
				} else if (var5 == 13) {
					var7 += 2;
				} else if (var5 == 14) {
					++var6;
					var7 += 2;
				} else if (var5 == 15) {
					var6 += 2;
					var7 += 2;
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
					var4.resetPath(var6, var7);
					var4.field1067 = false;
				} else if (var2) {
					var4.field1067 = true;
					var4.tileX = var6;
					var4.tileY = var7;
				} else {
					var4.field1067 = false;
					var4.method2109(var6, var7, Players.field1241[var1]);
				}

			} else {
				var5 = var0.readBits(1);
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) {
					var6 = var0.readBits(12);
					var7 = var6 >> 10;
					var8 = var6 >> 5 & 31;
					if (var8 > 15) {
						var8 -= 32;
					}

					var9 = var6 & 31;
					if (var9 > 15) {
						var9 -= 32;
					}

					var10 = var8 + var4.pathX[0];
					var11 = var9 + var4.pathY[0];
					if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) {
						if (var2) {
							var4.field1067 = true;
							var4.tileX = var10;
							var4.tileY = var11;
						} else {
							var4.field1067 = false;
							var4.method2109(var10, var11, Players.field1241[var1]);
						}
					} else {
						var4.resetPath(var10, var11);
						var4.field1067 = false;
					}

					var4.plane = (byte)(var7 + var4.plane & 3);
					if (Client.localPlayerIndex == var1) {
						GrandExchangeOfferTotalQuantityComparator.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30);
					var7 = var6 >> 28;
					var8 = var6 >> 14 & 16383;
					var9 = var6 & 16383;
					var10 = (class19.baseX * 64 + var8 + var4.pathX[0] & 16383) - class19.baseX * 64;
					var11 = (DefaultsGroup.baseY * 64 + var9 + var4.pathY[0] & 16383) - DefaultsGroup.baseY * 64;
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
						var4.resetPath(var10, var11);
						var4.field1067 = false;
					} else if (var2) {
						var4.field1067 = true;
						var4.tileX = var10;
						var4.tileY = var11;
					} else {
						var4.field1067 = false;
						var4.method2109(var10, var11, Players.field1241[var1]);
					}

					var4.plane = (byte)(var7 + var4.plane & 3);
					if (Client.localPlayerIndex == var1) {
						GrandExchangeOfferTotalQuantityComparator.Client_plane = var4.plane;
					}

				}
			}
		}
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1509830378"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		if (HealthBarDefinition.localPlayer.x >> 7 == Client.destinationX && HealthBarDefinition.localPlayer.y >> 7 == Client.destinationY) {
			Client.destinationX = 0;
		}

		VerticalAlignment.method3157();
		VertexNormal.method4623();
		ClanSettings.addNpcsToScene(true);
		BuddyRankComparator.method2500();
		ClanSettings.addNpcsToScene(false);

		int var6;
		for (Projectile var4 = (Projectile)Client.projectiles.last(); var4 != null; var4 = (Projectile)Client.projectiles.previous()) {
			if (var4.plane == GrandExchangeOfferTotalQuantityComparator.Client_plane && Client.cycle <= var4.cycleEnd) {
				if (Client.cycle >= var4.cycleStart) {
					if (var4.targetIndex > 0) {
						NPC var31 = Client.npcs[var4.targetIndex - 1];
						if (var31 != null && var31.x >= 0 && var31.x < 13312 && var31.y >= 0 && var31.y < 13312) {
							var4.setDestination(var31.x, var31.y, class392.getTileHeight(var31.x, var31.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					if (var4.targetIndex < 0) {
						var6 = -var4.targetIndex - 1;
						Player var34;
						if (var6 == Client.localPlayerIndex) {
							var34 = HealthBarDefinition.localPlayer;
						} else {
							var34 = Client.players[var6];
						}

						if (var34 != null && var34.x >= 0 && var34.x < 13312 && var34.y >= 0 && var34.y < 13312) {
							var4.setDestination(var34.x, var34.y, class392.getTileHeight(var34.x, var34.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					var4.advance(Client.field531);
					GameBuild.scene.drawEntity(GrandExchangeOfferTotalQuantityComparator.Client_plane, (int)var4.x, (int)var4.y, (int)var4.z, 60, var4, var4.yaw, -1L, false);
				}
			} else {
				var4.remove();
			}
		}

		VarpDefinition.method3004();
		SpriteMask.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
		int var5;
		int var7;
		int var8;
		int var11;
		int var28;
		if (!Client.isCameraLocked) {
			var28 = Client.camAngleX;
			if (Client.field556 / 256 > var28) {
				var28 = Client.field556 / 256;
			}

			if (Client.field718[4] && Client.field598[4] + 128 > var28) {
				var28 = Client.field598[4] + 128;
			}

			var5 = Client.camAngleY & 2047;
			var6 = class320.oculusOrbFocalPointX;
			var7 = DynamicObject.field942;
			var8 = class18.oculusOrbFocalPointY;
			var11 = var28 * 3 + 600;
			method1957(var6, var7, var8, var28, var5, var11, var3);
		}

		int var9;
		int var10;
		int var12;
		int var14;
		if (!Client.isCameraLocked) {
			if (class408.clientPreferences.roofsHidden) {
				var5 = GrandExchangeOfferTotalQuantityComparator.Client_plane;
			} else {
				label596: {
					var6 = 3;
					if (class121.cameraPitch < 310) {
						if (Client.oculusOrbState == 1) {
							var7 = class320.oculusOrbFocalPointX >> 7;
							var8 = class18.oculusOrbFocalPointY >> 7;
						} else {
							var7 = HealthBarDefinition.localPlayer.x >> 7;
							var8 = HealthBarDefinition.localPlayer.y >> 7;
						}

						var9 = WorldMapSectionType.cameraX >> 7;
						var10 = class65.cameraZ >> 7;
						if (var9 < 0 || var10 < 0 || var9 >= 104 || var10 >= 104) {
							var5 = GrandExchangeOfferTotalQuantityComparator.Client_plane;
							break label596;
						}

						if (var7 < 0 || var8 < 0 || var7 >= 104 || var8 >= 104) {
							var5 = GrandExchangeOfferTotalQuantityComparator.Client_plane;
							break label596;
						}

						if ((Tiles.Tiles_renderFlags[GrandExchangeOfferTotalQuantityComparator.Client_plane][var9][var10] & 4) != 0) {
							var6 = GrandExchangeOfferTotalQuantityComparator.Client_plane;
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
						if (var11 > var12) {
							var13 = var12 * 65536 / var11;
							var14 = 32768;

							while (var9 != var7) {
								if (var9 < var7) {
									++var9;
								} else if (var9 > var7) {
									--var9;
								}

								if ((Tiles.Tiles_renderFlags[GrandExchangeOfferTotalQuantityComparator.Client_plane][var9][var10] & 4) != 0) {
									var6 = GrandExchangeOfferTotalQuantityComparator.Client_plane;
								}

								var14 += var13;
								if (var14 >= 65536) {
									var14 -= 65536;
									if (var10 < var8) {
										++var10;
									} else if (var10 > var8) {
										--var10;
									}

									if ((Tiles.Tiles_renderFlags[GrandExchangeOfferTotalQuantityComparator.Client_plane][var9][var10] & 4) != 0) {
										var6 = GrandExchangeOfferTotalQuantityComparator.Client_plane;
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

								if ((Tiles.Tiles_renderFlags[GrandExchangeOfferTotalQuantityComparator.Client_plane][var9][var10] & 4) != 0) {
									var6 = GrandExchangeOfferTotalQuantityComparator.Client_plane;
								}

								var14 += var13;
								if (var14 >= 65536) {
									var14 -= 65536;
									if (var9 < var7) {
										++var9;
									} else if (var9 > var7) {
										--var9;
									}

									if ((Tiles.Tiles_renderFlags[GrandExchangeOfferTotalQuantityComparator.Client_plane][var9][var10] & 4) != 0) {
										var6 = GrandExchangeOfferTotalQuantityComparator.Client_plane;
									}
								}
							}
						}
					}

					if (HealthBarDefinition.localPlayer.x >= 0 && HealthBarDefinition.localPlayer.y >= 0 && HealthBarDefinition.localPlayer.x < 13312 && HealthBarDefinition.localPlayer.y < 13312) {
						if ((Tiles.Tiles_renderFlags[GrandExchangeOfferTotalQuantityComparator.Client_plane][HealthBarDefinition.localPlayer.x >> 7][HealthBarDefinition.localPlayer.y >> 7] & 4) != 0) {
							var6 = GrandExchangeOfferTotalQuantityComparator.Client_plane;
						}

						var5 = var6;
					} else {
						var5 = GrandExchangeOfferTotalQuantityComparator.Client_plane;
					}
				}
			}

			var28 = var5;
		} else {
			var28 = class28.method404();
		}

		var5 = WorldMapSectionType.cameraX;
		var6 = class174.cameraY;
		var7 = class65.cameraZ;
		var8 = class121.cameraPitch;
		var9 = WorldMapRegion.cameraYaw;

		for (var10 = 0; var10 < 5; ++var10) {
			if (Client.field718[var10]) {
				var11 = (int)(Math.random() * (double)(Client.field719[var10] * 2 + 1) - (double)Client.field719[var10] + Math.sin((double)Client.field721[var10] / 100.0D * (double)Client.field722[var10]) * (double)Client.field598[var10]);
				if (var10 == 0) {
					WorldMapSectionType.cameraX += var11;
				}

				if (var10 == 1) {
					class174.cameraY += var11;
				}

				if (var10 == 2) {
					class65.cameraZ += var11;
				}

				if (var10 == 3) {
					WorldMapRegion.cameraYaw = var11 + WorldMapRegion.cameraYaw & 2047;
				}

				if (var10 == 4) {
					class121.cameraPitch += var11;
					if (class121.cameraPitch < 128) {
						class121.cameraPitch = 128;
					}

					if (class121.cameraPitch > 383) {
						class121.cameraPitch = 383;
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
			class185.method3872(var10 - var0, var11 - var1);
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false;
			ViewportMouse.ViewportMouse_entityCount = 0;
		}

		class14.playPcmPlayers();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		class14.playPcmPlayers();
		var12 = Rasterizer3D.Rasterizer3D_zoom;
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom;
		GameBuild.scene.draw(WorldMapSectionType.cameraX, class174.cameraY, class65.cameraZ, class121.cameraPitch, WorldMapRegion.cameraYaw, var28);
		Rasterizer3D.Rasterizer3D_zoom = var12;
		class14.playPcmPlayers();
		GameBuild.scene.clearTempGameObjects();
		Client.overheadTextCount = 0;
		boolean var32 = false;
		var14 = -1;
		int var15 = -1;
		int var16 = Players.Players_count;
		int[] var17 = Players.Players_indices;

		int var18;
		for (var18 = 0; var18 < var16 + Client.npcCount; ++var18) {
			Object var30;
			if (var18 < var16) {
				var30 = Client.players[var17[var18]];
				if (var17[var18] == Client.combatTargetPlayerIndex) {
					var32 = true;
					var14 = var18;
					continue;
				}

				if (var30 == HealthBarDefinition.localPlayer) {
					var15 = var18;
					continue;
				}
			} else {
				var30 = Client.npcs[Client.npcIndices[var18 - var16]];
			}

			LoginType.drawActor2d((Actor)var30, var18, var0, var1, var2, var3);
		}

		if (Client.renderSelf && var15 != -1) {
			LoginType.drawActor2d(HealthBarDefinition.localPlayer, var15, var0, var1, var2, var3);
		}

		if (var32) {
			LoginType.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var14, var0, var1, var2, var3);
		}

		for (var18 = 0; var18 < Client.overheadTextCount; ++var18) {
			int var19 = Client.overheadTextXs[var18];
			int var20 = Client.overheadTextYs[var18];
			int var21 = Client.overheadTextXOffsets[var18];
			int var22 = Client.overheadTextAscents[var18];
			boolean var23 = true;

			while (var23) {
				var23 = false;

				for (int var29 = 0; var29 < var18; ++var29) {
					if (var20 + 2 > Client.overheadTextYs[var29] - Client.overheadTextAscents[var29] && var20 - var22 < Client.overheadTextYs[var29] + 2 && var19 - var21 < Client.overheadTextXOffsets[var29] + Client.overheadTextXs[var29] && var21 + var19 > Client.overheadTextXs[var29] - Client.overheadTextXOffsets[var29] && Client.overheadTextYs[var29] - Client.overheadTextAscents[var29] < var20) {
						var20 = Client.overheadTextYs[var29] - Client.overheadTextAscents[var29];
						var23 = true;
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var18];
			Client.viewportTempY = Client.overheadTextYs[var18] = var20;
			String var24 = Client.overheadText[var18];
			if (Client.chatEffects == 0) {
				int var25 = 16776960;
				if (Client.overheadTextColors[var18] < 6) {
					var25 = Client.field689[Client.overheadTextColors[var18]];
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
					Login.fontBold12.drawCentered(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0);
				}

				if (Client.overheadTextEffects[var18] == 1) {
					Login.fontBold12.drawCenteredWave(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var18] == 2) {
					Login.fontBold12.drawCenteredWave2(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var18] == 3) {
					Login.fontBold12.drawCenteredShake(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var18]);
				}

				if (Client.overheadTextEffects[var18] == 4) {
					var26 = (150 - Client.overheadTextCyclesRemaining[var18]) * (Login.fontBold12.stringWidth(var24) + 100) / 150;
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1);
					Login.fontBold12.draw(var24, var0 + Client.viewportTempX + 50 - var26, Client.viewportTempY + var1, var25, 0);
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

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - Login.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5);
					Login.fontBold12.drawCentered(var24, var0 + Client.viewportTempX, var27 + Client.viewportTempY + var1, var25, 0);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}
			} else {
				Login.fontBold12.drawCentered(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0);
			}
		}

		if (Client.hintArrowType == 2) {
			DefaultsGroup.worldToScreen(Client.hintArrowSubX * 64 + (Client.hintArrowX - class19.baseX * 64 << 7), Client.hintArrowSubY * 64 + (Client.hintArrowY - DefaultsGroup.baseY * 64 << 7), Client.hintArrowHeight * 2);
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
				DevicePcmPlayerProvider.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field531);
		class393.method6885(var0, var1, var2, var3);
		WorldMapSectionType.cameraX = var5;
		class174.cameraY = var6;
		class65.cameraZ = var7;
		class121.cameraPitch = var8;
		WorldMapRegion.cameraYaw = var9;
		if (Client.isLoading) {
			byte var33 = 0;
			var14 = var33 + NetCache.NetCache_pendingPriorityWritesCount + NetCache.NetCache_pendingPriorityResponsesCount;
			if (var14 == 0) {
				Client.isLoading = false;
			}
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			class91.drawLoadingMessage("Loading - please wait.", false);
		}

	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "2132181355"
	)
	static final void method1957(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		var5 = class150.method2971(var5, var6);
		int var7 = 2048 - var3 & 2047;
		int var8 = 2048 - var4 & 2047;
		int var9 = 0;
		int var10 = 0;
		int var11 = var5;
		int var12;
		int var13;
		int var14;
		if (var7 != 0) {
			var12 = Rasterizer3D.Rasterizer3D_sine[var7];
			var13 = Rasterizer3D.Rasterizer3D_cosine[var7];
			var14 = var13 * var10 - var12 * var5 >> 16;
			var11 = var12 * var10 + var5 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			var12 = Rasterizer3D.Rasterizer3D_sine[var8];
			var13 = Rasterizer3D.Rasterizer3D_cosine[var8];
			var14 = var9 * var13 + var12 * var11 >> 16;
			var11 = var13 * var11 - var12 * var9 >> 16;
			var9 = var14;
		}

		WorldMapSectionType.cameraX = var0 - var9;
		class174.cameraY = var1 - var10;
		class65.cameraZ = var2 - var11;
		class121.cameraPitch = var3;
		WorldMapRegion.cameraYaw = var4;
		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (class320.oculusOrbFocalPointX >> 7 != HealthBarDefinition.localPlayer.x >> 7 || class18.oculusOrbFocalPointY >> 7 != HealthBarDefinition.localPlayer.y >> 7)) {
			var12 = HealthBarDefinition.localPlayer.plane;
			var13 = class19.baseX * 64 + (class320.oculusOrbFocalPointX >> 7);
			var14 = DefaultsGroup.baseY * 64 + (class18.oculusOrbFocalPointY >> 7);
			InvDefinition.method2986(var13, var14, var12, true);
		}

	}
}
