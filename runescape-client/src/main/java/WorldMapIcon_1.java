import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("nt")
	@ObfuscatedGetter(
		intValue = 92186385
	)
	static int field218;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -197408887
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Las;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1040980621
	)
	@Export("element")
	int element;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Laa;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1242494149
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1347635285
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		signature = "(Lhd;Lhd;ILas;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4;
		this.init();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "7"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "(S)Laa;",
		garbageValue = "31041"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-413607837"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1875187157"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-551497433"
	)
	@Export("init")
	void init() {
		this.element = WorldMapAreaData.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(InvDefinition.WorldMapElement_get(this.element));
		WorldMapElement var1 = InvDefinition.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)[Le;",
		garbageValue = "-2092634459"
	)
	public static class7[] method376() {
		return new class7[]{class7.field41};
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "1961749617"
	)
	public static void method377(int var0, int var1) {
		VarbitComposition var2 = Tiles.method1219(var0);
		int var3 = var2.baseVar;
		int var4 = var2.startBit;
		int var5 = var2.endBit;
		int var6 = Varps.Varps_masks[var5 - var4];
		if (var1 < 0 || var1 > var6) {
			var1 = 0;
		}

		var6 <<= var4;
		Varps.Varps_main[var3] = Varps.Varps_main[var3] & ~var6 | var1 << var4 & var6;
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;ZI)V",
		garbageValue = "1521238081"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) {
			byte var2 = 4;
			int var3 = var2 + 6;
			int var4 = var2 + 6;
			int var5 = Login.fontPlain12.lineWidth(var0, 250);
			int var6 = Login.fontPlain12.lineCount(var0, 250) * 13;
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var6 + var2 + var2, 16777215);
			Login.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
			Projectile.method2262(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6);
			if (var1) {
				FileSystem.rasterProvider.drawFull(0, 0);
			} else {
				int var7 = var3;
				int var8 = var4;
				int var9 = var5;
				int var10 = var6;

				for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) {
					if (Client.rootWidgetXs[var11] + Client.rootWidgetWidths[var11] > var7 && Client.rootWidgetXs[var11] < var9 + var7 && Client.rootWidgetYs[var11] + Client.rootWidgetHeights[var11] > var8 && Client.rootWidgetYs[var11] < var10 + var8) {
						Client.field827[var11] = true;
					}
				}
			}

		}
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1982809553"
	)
	static final void method375() {
		HealthBar.method2166(false);
		Client.field785 = 0;
		boolean var0 = true;

		int var1;
		for (var1 = 0; var1 < class2.regionLandArchives.length; ++var1) {
			if (class92.regionMapArchiveIds[var1] != -1 && class2.regionLandArchives[var1] == null) {
				class2.regionLandArchives[var1] = class8.archive5.takeFile(class92.regionMapArchiveIds[var1], 0);
				if (class2.regionLandArchives[var1] == null) {
					var0 = false;
					++Client.field785;
				}
			}

			if (MusicPatchNode2.regionLandArchiveIds[var1] != -1 && Interpreter.regionMapArchives[var1] == null) {
				Interpreter.regionMapArchives[var1] = class8.archive5.takeFileEncrypted(MusicPatchNode2.regionLandArchiveIds[var1], 0, Bounds.xteaKeys[var1]);
				if (Interpreter.regionMapArchives[var1] == null) {
					var0 = false;
					++Client.field785;
				}
			}
		}

		if (!var0) {
			Client.field720 = 1;
		} else {
			Client.field718 = 0;
			var0 = true;

			int var3;
			int var4;
			Buffer var8;
			int var9;
			int var10;
			int var11;
			int var13;
			int var14;
			int var15;
			int var16;
			int var17;
			int var18;
			for (var1 = 0; var1 < class2.regionLandArchives.length; ++var1) {
				byte[] var2 = Interpreter.regionMapArchives[var1];
				if (var2 != null) {
					var3 = (class238.regions[var1] >> 8) * 64 - GrandExchangeOfferNameComparator.baseX * 64;
					var4 = (class238.regions[var1] & 255) * 64 - NetCache.baseY * 64;
					if (Client.isInInstance) {
						var3 = 10;
						var4 = 10;
					}

					boolean var7 = true;
					var8 = new Buffer(var2);
					var9 = -1;

					label1300:
					while (true) {
						var10 = var8.method5704();
						if (var10 == 0) {
							var0 &= var7;
							break;
						}

						var9 += var10;
						var11 = 0;
						boolean var12 = false;

						while (true) {
							while (!var12) {
								var13 = var8.readUShortSmart();
								if (var13 == 0) {
									continue label1300;
								}

								var11 += var13 - 1;
								var14 = var11 & 63;
								var15 = var11 >> 6 & 63;
								var16 = var8.readUnsignedByte() >> 2;
								var17 = var3 + var15;
								var18 = var4 + var14;
								if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
									ObjectComposition var19 = WorldMapAreaData.getObjectDefinition(var9);
									if (var16 != 22 || !Client.isLowDetail || var19.int1 != 0 || var19.interactType == 1 || var19.boolean2) {
										if (!var19.needsModelFiles()) {
											++Client.field718;
											var7 = false;
										}

										var12 = true;
									}
								}
							}

							var13 = var8.readUShortSmart();
							if (var13 == 0) {
								break;
							}

							var8.readUnsignedByte();
						}
					}
				}
			}

			if (!var0) {
				Client.field720 = 2;
			} else {
				if (Client.field720 != 0) {
					drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				UserComparator5.playPcmPlayers();
				MilliClock.scene.clear();

				for (var1 = 0; var1 < 4; ++var1) {
					Client.collisionMaps[var1].clear();
				}

				int var44;
				for (var1 = 0; var1 < 4; ++var1) {
					for (var44 = 0; var44 < 104; ++var44) {
						for (var3 = 0; var3 < 104; ++var3) {
							Tiles.Tiles_renderFlags[var1][var44][var3] = 0;
						}
					}
				}

				UserComparator5.playPcmPlayers();
				class58.method939();
				var1 = class2.regionLandArchives.length;

				for (ObjectSound var54 = (ObjectSound)ObjectSound.objectSounds.last(); var54 != null; var54 = (ObjectSound)ObjectSound.objectSounds.previous()) {
					if (var54.stream1 != null) {
						VarbitComposition.pcmStreamMixer.removeSubStream(var54.stream1);
						var54.stream1 = null;
					}

					if (var54.stream2 != null) {
						VarbitComposition.pcmStreamMixer.removeSubStream(var54.stream2);
						var54.stream2 = null;
					}
				}

				ObjectSound.objectSounds.clear();
				HealthBar.method2166(true);
				int var5;
				int var20;
				int var21;
				int var50;
				int var58;
				if (!Client.isInInstance) {
					byte[] var45;
					for (var44 = 0; var44 < var1; ++var44) {
						var3 = (class238.regions[var44] >> 8) * 64 - GrandExchangeOfferNameComparator.baseX * 64;
						var4 = (class238.regions[var44] & 255) * 64 - NetCache.baseY * 64;
						var45 = class2.regionLandArchives[var44];
						if (var45 != null) {
							UserComparator5.playPcmPlayers();
							ModelData0.method3411(var45, var3, var4, class3.field24 * 8 - 48, class39.field284 * 8 - 48, Client.collisionMaps);
						}
					}

					for (var44 = 0; var44 < var1; ++var44) {
						var3 = (class238.regions[var44] >> 8) * 64 - GrandExchangeOfferNameComparator.baseX * 64;
						var4 = (class238.regions[var44] & 255) * 64 - NetCache.baseY * 64;
						var45 = class2.regionLandArchives[var44];
						if (var45 == null && class39.field284 < 800) {
							UserComparator5.playPcmPlayers();
							class4.method55(var3, var4, 64, 64);
						}
					}

					HealthBar.method2166(true);

					for (var44 = 0; var44 < var1; ++var44) {
						byte[] var47 = Interpreter.regionMapArchives[var44];
						if (var47 != null) {
							var4 = (class238.regions[var44] >> 8) * 64 - GrandExchangeOfferNameComparator.baseX * 64;
							var5 = (class238.regions[var44] & 255) * 64 - NetCache.baseY * 64;
							UserComparator5.playPcmPlayers();
							Scene var48 = MilliClock.scene;
							CollisionMap[] var49 = Client.collisionMaps;
							var8 = new Buffer(var47);
							var9 = -1;

							while (true) {
								var10 = var8.method5704();
								if (var10 == 0) {
									break;
								}

								var9 += var10;
								var11 = 0;

								while (true) {
									var58 = var8.readUShortSmart();
									if (var58 == 0) {
										break;
									}

									var11 += var58 - 1;
									var13 = var11 & 63;
									var14 = var11 >> 6 & 63;
									var15 = var11 >> 12;
									var16 = var8.readUnsignedByte();
									var17 = var16 >> 2;
									var18 = var16 & 3;
									var50 = var4 + var14;
									var20 = var13 + var5;
									if (var50 > 0 && var20 > 0 && var50 < 103 && var20 < 103) {
										var21 = var15;
										if ((Tiles.Tiles_renderFlags[1][var50][var20] & 2) == 2) {
											var21 = var15 - 1;
										}

										CollisionMap var22 = null;
										if (var21 >= 0) {
											var22 = var49[var21];
										}

										GameEngine.method1134(var15, var50, var20, var9, var18, var17, var48, var22);
									}
								}
							}
						}
					}
				}

				int var6;
				int var46;
				int var57;
				if (Client.isInInstance) {
					for (var44 = 0; var44 < 4; ++var44) {
						UserComparator5.playPcmPlayers();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								boolean var56 = false;
								var6 = Client.instanceChunkTemplates[var44][var3][var4];
								if (var6 != -1) {
									var57 = var6 >> 24 & 3;
									var46 = var6 >> 1 & 3;
									var9 = var6 >> 14 & 1023;
									var10 = var6 >> 3 & 2047;
									var11 = (var9 / 8 << 8) + var10 / 8;

									for (var58 = 0; var58 < class238.regions.length; ++var58) {
										if (class238.regions[var58] == var11 && class2.regionLandArchives[var58] != null) {
											WorldMapManager.method749(class2.regionLandArchives[var58], var44, var3 * 8, var4 * 8, var57, (var9 & 7) * 8, (var10 & 7) * 8, var46, Client.collisionMaps);
											var56 = true;
											break;
										}
									}
								}

								if (!var56) {
									var57 = var44;
									var46 = var3 * 8;
									var9 = var4 * 8;

									for (var10 = 0; var10 < 8; ++var10) {
										for (var11 = 0; var11 < 8; ++var11) {
											Tiles.Tiles_heights[var57][var10 + var46][var11 + var9] = 0;
										}
									}

									if (var46 > 0) {
										for (var10 = 1; var10 < 8; ++var10) {
											Tiles.Tiles_heights[var57][var46][var10 + var9] = Tiles.Tiles_heights[var57][var46 - 1][var10 + var9];
										}
									}

									if (var9 > 0) {
										for (var10 = 1; var10 < 8; ++var10) {
											Tiles.Tiles_heights[var57][var10 + var46][var9] = Tiles.Tiles_heights[var57][var10 + var46][var9 - 1];
										}
									}

									if (var46 > 0 && Tiles.Tiles_heights[var57][var46 - 1][var9] != 0) {
										Tiles.Tiles_heights[var57][var46][var9] = Tiles.Tiles_heights[var57][var46 - 1][var9];
									} else if (var9 > 0 && Tiles.Tiles_heights[var57][var46][var9 - 1] != 0) {
										Tiles.Tiles_heights[var57][var46][var9] = Tiles.Tiles_heights[var57][var46][var9 - 1];
									} else if (var46 > 0 && var9 > 0 && Tiles.Tiles_heights[var57][var46 - 1][var9 - 1] != 0) {
										Tiles.Tiles_heights[var57][var46][var9] = Tiles.Tiles_heights[var57][var46 - 1][var9 - 1];
									}
								}
							}
						}
					}

					for (var44 = 0; var44 < 13; ++var44) {
						for (var3 = 0; var3 < 13; ++var3) {
							var4 = Client.instanceChunkTemplates[0][var44][var3];
							if (var4 == -1) {
								class4.method55(var44 * 8, var3 * 8, 8, 8);
							}
						}
					}

					HealthBar.method2166(true);

					for (var44 = 0; var44 < 4; ++var44) {
						UserComparator5.playPcmPlayers();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								var5 = Client.instanceChunkTemplates[var44][var3][var4];
								if (var5 != -1) {
									var6 = var5 >> 24 & 3;
									var57 = var5 >> 1 & 3;
									var46 = var5 >> 14 & 1023;
									var9 = var5 >> 3 & 2047;
									var10 = (var46 / 8 << 8) + var9 / 8;

									for (var11 = 0; var11 < class238.regions.length; ++var11) {
										if (class238.regions[var11] == var10 && Interpreter.regionMapArchives[var11] != null) {
											WorldMapSection0.method310(Interpreter.regionMapArchives[var11], var44, var3 * 8, var4 * 8, var6, (var46 & 7) * 8, (var9 & 7) * 8, var57, MilliClock.scene, Client.collisionMaps);
											break;
										}
									}
								}
							}
						}
					}
				}

				HealthBar.method2166(true);
				UserComparator5.playPcmPlayers();
				Scene var55 = MilliClock.scene;
				CollisionMap[] var65 = Client.collisionMaps;

				for (var4 = 0; var4 < 4; ++var4) {
					for (var5 = 0; var5 < 104; ++var5) {
						for (var6 = 0; var6 < 104; ++var6) {
							if ((Tiles.Tiles_renderFlags[var4][var5][var6] & 1) == 1) {
								var57 = var4;
								if ((Tiles.Tiles_renderFlags[1][var5][var6] & 2) == 2) {
									var57 = var4 - 1;
								}

								if (var57 >= 0) {
									var65[var57].setBlockedByFloor(var5, var6);
								}
							}
						}
					}
				}

				Tiles.field518 += (int)(Math.random() * 5.0D) - 2;
				if (Tiles.field518 < -8) {
					Tiles.field518 = -8;
				}

				if (Tiles.field518 > 8) {
					Tiles.field518 = 8;
				}

				Tiles.field528 += (int)(Math.random() * 5.0D) - 2;
				if (Tiles.field528 < -16) {
					Tiles.field528 = -16;
				}

				if (Tiles.field528 > 16) {
					Tiles.field528 = 16;
				}

				int[] var10000;
				for (var4 = 0; var4 < 4; ++var4) {
					byte[][] var62 = TaskHandler.field2045[var4];
					var11 = (int)Math.sqrt(5100.0D);
					var58 = var11 * 768 >> 8;

					int var51;
					for (var13 = 1; var13 < 103; ++var13) {
						for (var14 = 1; var14 < 103; ++var14) {
							var15 = Tiles.Tiles_heights[var4][var14 + 1][var13] - Tiles.Tiles_heights[var4][var14 - 1][var13];
							var16 = Tiles.Tiles_heights[var4][var14][var13 + 1] - Tiles.Tiles_heights[var4][var14][var13 - 1];
							var17 = (int)Math.sqrt((double)(var16 * var16 + var15 * var15 + 65536));
							var18 = (var15 << 8) / var17;
							var50 = 65536 / var17;
							var20 = (var16 << 8) / var17;
							var21 = (var18 * -50 + var20 * -50 + var50 * -10) / var58 + 96;
							var51 = (var62[var14 - 1][var13] >> 2) + (var62[var14][var13 - 1] >> 2) + (var62[var14 + 1][var13] >> 3) + (var62[var14][var13 + 1] >> 3) + (var62[var14][var13] >> 1);
							WorldMapSprite.field257[var14][var13] = var21 - var51;
						}
					}

					for (var13 = 0; var13 < 104; ++var13) {
						GrandExchangeOfferAgeComparator.Tiles_hue[var13] = 0;
						Tiles.Tiles_saturation[var13] = 0;
						WorldMapLabel.Tiles_lightness[var13] = 0;
						TaskHandler.Tiles_hueMultiplier[var13] = 0;
						WorldMapID.field292[var13] = 0;
					}

					for (var13 = -5; var13 < 109; ++var13) {
						for (var14 = 0; var14 < 104; ++var14) {
							var15 = var13 + 5;
							int var10002;
							if (var15 >= 0 && var15 < 104) {
								var16 = Tiles.field517[var4][var15][var14] & 255;
								if (var16 > 0) {
									FloorUnderlayDefinition var52 = class51.method876(var16 - 1);
									var10000 = GrandExchangeOfferAgeComparator.Tiles_hue;
									var10000[var14] += var52.hue;
									var10000 = Tiles.Tiles_saturation;
									var10000[var14] += var52.saturation;
									var10000 = WorldMapLabel.Tiles_lightness;
									var10000[var14] += var52.lightness;
									var10000 = TaskHandler.Tiles_hueMultiplier;
									var10000[var14] += var52.hueMultiplier;
									var10002 = WorldMapID.field292[var14]++;
								}
							}

							var16 = var13 - 5;
							if (var16 >= 0 && var16 < 104) {
								var17 = Tiles.field517[var4][var16][var14] & 255;
								if (var17 > 0) {
									FloorUnderlayDefinition var53 = class51.method876(var17 - 1);
									var10000 = GrandExchangeOfferAgeComparator.Tiles_hue;
									var10000[var14] -= var53.hue;
									var10000 = Tiles.Tiles_saturation;
									var10000[var14] -= var53.saturation;
									var10000 = WorldMapLabel.Tiles_lightness;
									var10000[var14] -= var53.lightness;
									var10000 = TaskHandler.Tiles_hueMultiplier;
									var10000[var14] -= var53.hueMultiplier;
									var10002 = WorldMapID.field292[var14]--;
								}
							}
						}

						if (var13 >= 1 && var13 < 103) {
							var14 = 0;
							var15 = 0;
							var16 = 0;
							var17 = 0;
							var18 = 0;

							for (var50 = -5; var50 < 109; ++var50) {
								var20 = var50 + 5;
								if (var20 >= 0 && var20 < 104) {
									var14 += GrandExchangeOfferAgeComparator.Tiles_hue[var20];
									var15 += Tiles.Tiles_saturation[var20];
									var16 += WorldMapLabel.Tiles_lightness[var20];
									var17 += TaskHandler.Tiles_hueMultiplier[var20];
									var18 += WorldMapID.field292[var20];
								}

								var21 = var50 - 5;
								if (var21 >= 0 && var21 < 104) {
									var14 -= GrandExchangeOfferAgeComparator.Tiles_hue[var21];
									var15 -= Tiles.Tiles_saturation[var21];
									var16 -= WorldMapLabel.Tiles_lightness[var21];
									var17 -= TaskHandler.Tiles_hueMultiplier[var21];
									var18 -= WorldMapID.field292[var21];
								}

								if (var50 >= 1 && var50 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var13][var50] & 2) != 0 || (Tiles.Tiles_renderFlags[var4][var13][var50] & 16) == 0)) {
									if (var4 < Tiles.Tiles_minPlane) {
										Tiles.Tiles_minPlane = var4;
									}

									var51 = Tiles.field517[var4][var13][var50] & 255;
									int var23 = class200.field2399[var4][var13][var50] & 255;
									if (var51 > 0 || var23 > 0) {
										int var24 = Tiles.Tiles_heights[var4][var13][var50];
										int var25 = Tiles.Tiles_heights[var4][var13 + 1][var50];
										int var26 = Tiles.Tiles_heights[var4][var13 + 1][var50 + 1];
										int var27 = Tiles.Tiles_heights[var4][var13][var50 + 1];
										int var28 = WorldMapSprite.field257[var13][var50];
										int var29 = WorldMapSprite.field257[var13 + 1][var50];
										int var30 = WorldMapSprite.field257[var13 + 1][var50 + 1];
										int var31 = WorldMapSprite.field257[var13][var50 + 1];
										int var32 = -1;
										int var33 = -1;
										int var34;
										int var35;
										if (var51 > 0) {
											var34 = var14 * 256 / var17;
											var35 = var15 / var18;
											int var36 = var16 / var18;
											var32 = Interpreter.hslToRgb(var34, var35, var36);
											var34 = var34 + Tiles.field518 & 255;
											var36 += Tiles.field528;
											if (var36 < 0) {
												var36 = 0;
											} else if (var36 > 255) {
												var36 = 255;
											}

											var33 = Interpreter.hslToRgb(var34, var35, var36);
										}

										if (var4 > 0) {
											boolean var60 = true;
											if (var51 == 0 && Tiles.field530[var4][var13][var50] != 0) {
												var60 = false;
											}

											if (var23 > 0 && !WallDecoration.method3449(var23 - 1).hideUnderlay) {
												var60 = false;
											}

											if (var60 && var24 == var25 && var24 == var26 && var27 == var24) {
												var10000 = class2.field12[var4][var13];
												var10000[var50] |= 2340;
											}
										}

										var34 = 0;
										if (var33 != -1) {
											var34 = Rasterizer3D.Rasterizer3D_colorPalette[GameObject.method3451(var33, 96)];
										}

										if (var23 == 0) {
											var55.addTile(var4, var13, var50, 0, 0, -1, var24, var25, var26, var27, GameObject.method3451(var32, var28), GameObject.method3451(var32, var29), GameObject.method3451(var32, var30), GameObject.method3451(var32, var31), 0, 0, 0, 0, var34, 0);
										} else {
											var35 = Tiles.field530[var4][var13][var50] + 1;
											byte var61 = class1.field1[var4][var13][var50];
											FloorOverlayDefinition var37 = WallDecoration.method3449(var23 - 1);
											int var38 = var37.texture;
											int var39;
											int var40;
											int var41;
											int var42;
											if (var38 >= 0) {
												var40 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var38);
												var39 = -1;
											} else if (var37.primaryRgb == 16711935) {
												var39 = -2;
												var38 = -1;
												var40 = -2;
											} else {
												var39 = Interpreter.hslToRgb(var37.hue, var37.saturation, var37.lightness);
												var41 = var37.hue + Tiles.field518 & 255;
												var42 = var37.lightness + Tiles.field528;
												if (var42 < 0) {
													var42 = 0;
												} else if (var42 > 255) {
													var42 = 255;
												}

												var40 = Interpreter.hslToRgb(var41, var37.saturation, var42);
											}

											var41 = 0;
											if (var40 != -2) {
												var41 = Rasterizer3D.Rasterizer3D_colorPalette[SecureRandomCallable.method1226(var40, 96)];
											}

											if (var37.secondaryRgb != -1) {
												var42 = var37.secondaryHue + Tiles.field518 & 255;
												int var43 = var37.secondaryLightness + Tiles.field528;
												if (var43 < 0) {
													var43 = 0;
												} else if (var43 > 255) {
													var43 = 255;
												}

												var40 = Interpreter.hslToRgb(var42, var37.secondarySaturation, var43);
												var41 = Rasterizer3D.Rasterizer3D_colorPalette[SecureRandomCallable.method1226(var40, 96)];
											}

											var55.addTile(var4, var13, var50, var35, var61, var38, var24, var25, var26, var27, GameObject.method3451(var32, var28), GameObject.method3451(var32, var29), GameObject.method3451(var32, var30), GameObject.method3451(var32, var31), SecureRandomCallable.method1226(var39, var28), SecureRandomCallable.method1226(var39, var29), SecureRandomCallable.method1226(var39, var30), SecureRandomCallable.method1226(var39, var31), var34, var41);
										}
									}
								}
							}
						}
					}

					for (var13 = 1; var13 < 103; ++var13) {
						for (var14 = 1; var14 < 103; ++var14) {
							var55.setTileMinPlane(var4, var14, var13, WorldMapData_0.method250(var4, var14, var13));
						}
					}

					Tiles.field517[var4] = null;
					class200.field2399[var4] = null;
					Tiles.field530[var4] = null;
					class1.field1[var4] = null;
					TaskHandler.field2045[var4] = null;
				}

				var55.method3263(-50, -10, -50);

				for (var4 = 0; var4 < 104; ++var4) {
					for (var5 = 0; var5 < 104; ++var5) {
						if ((Tiles.Tiles_renderFlags[1][var4][var5] & 2) == 2) {
							var55.setLinkBelow(var4, var5);
						}
					}
				}

				var4 = 1;
				var5 = 2;
				var6 = 4;

				for (var57 = 0; var57 < 4; ++var57) {
					if (var57 > 0) {
						var4 <<= 3;
						var5 <<= 3;
						var6 <<= 3;
					}

					for (var46 = 0; var46 <= var57; ++var46) {
						for (var9 = 0; var9 <= 104; ++var9) {
							for (var10 = 0; var10 <= 104; ++var10) {
								short var59;
								if ((class2.field12[var46][var10][var9] & var4) != 0) {
									var11 = var9;
									var58 = var9;
									var13 = var46;

									for (var14 = var46; var11 > 0 && (class2.field12[var46][var10][var11 - 1] & var4) != 0; --var11) {
									}

									while (var58 < 104 && (class2.field12[var46][var10][var58 + 1] & var4) != 0) {
										++var58;
									}

									label866:
									while (var13 > 0) {
										for (var15 = var11; var15 <= var58; ++var15) {
											if ((class2.field12[var13 - 1][var10][var15] & var4) == 0) {
												break label866;
											}
										}

										--var13;
									}

									label855:
									while (var14 < var57) {
										for (var15 = var11; var15 <= var58; ++var15) {
											if ((class2.field12[var14 + 1][var10][var15] & var4) == 0) {
												break label855;
											}
										}

										++var14;
									}

									var15 = (var14 + 1 - var13) * (var58 - var11 + 1);
									if (var15 >= 8) {
										var59 = 240;
										var17 = Tiles.Tiles_heights[var14][var10][var11] - var59;
										var18 = Tiles.Tiles_heights[var13][var10][var11];
										Scene.Scene_addOccluder(var57, 1, var10 * 128, var10 * 128, var11 * 128, var58 * 128 + 128, var17, var18);

										for (var50 = var13; var50 <= var14; ++var50) {
											for (var20 = var11; var20 <= var58; ++var20) {
												var10000 = class2.field12[var50][var10];
												var10000[var20] &= ~var4;
											}
										}
									}
								}

								if ((class2.field12[var46][var10][var9] & var5) != 0) {
									var11 = var10;
									var58 = var10;
									var13 = var46;

									for (var14 = var46; var11 > 0 && (class2.field12[var46][var11 - 1][var9] & var5) != 0; --var11) {
									}

									while (var58 < 104 && (class2.field12[var46][var58 + 1][var9] & var5) != 0) {
										++var58;
									}

									label919:
									while (var13 > 0) {
										for (var15 = var11; var15 <= var58; ++var15) {
											if ((class2.field12[var13 - 1][var15][var9] & var5) == 0) {
												break label919;
											}
										}

										--var13;
									}

									label908:
									while (var14 < var57) {
										for (var15 = var11; var15 <= var58; ++var15) {
											if ((class2.field12[var14 + 1][var15][var9] & var5) == 0) {
												break label908;
											}
										}

										++var14;
									}

									var15 = (var58 - var11 + 1) * (var14 + 1 - var13);
									if (var15 >= 8) {
										var59 = 240;
										var17 = Tiles.Tiles_heights[var14][var11][var9] - var59;
										var18 = Tiles.Tiles_heights[var13][var11][var9];
										Scene.Scene_addOccluder(var57, 2, var11 * 128, var58 * 128 + 128, var9 * 128, var9 * 128, var17, var18);

										for (var50 = var13; var50 <= var14; ++var50) {
											for (var20 = var11; var20 <= var58; ++var20) {
												var10000 = class2.field12[var50][var20];
												var10000[var9] &= ~var5;
											}
										}
									}
								}

								if ((class2.field12[var46][var10][var9] & var6) != 0) {
									var11 = var10;
									var58 = var10;
									var13 = var9;

									for (var14 = var9; var13 > 0 && (class2.field12[var46][var10][var13 - 1] & var6) != 0; --var13) {
									}

									while (var14 < 104 && (class2.field12[var46][var10][var14 + 1] & var6) != 0) {
										++var14;
									}

									label972:
									while (var11 > 0) {
										for (var15 = var13; var15 <= var14; ++var15) {
											if ((class2.field12[var46][var11 - 1][var15] & var6) == 0) {
												break label972;
											}
										}

										--var11;
									}

									label961:
									while (var58 < 104) {
										for (var15 = var13; var15 <= var14; ++var15) {
											if ((class2.field12[var46][var58 + 1][var15] & var6) == 0) {
												break label961;
											}
										}

										++var58;
									}

									if ((var14 - var13 + 1) * (var58 - var11 + 1) >= 4) {
										var15 = Tiles.Tiles_heights[var46][var11][var13];
										Scene.Scene_addOccluder(var57, 4, var11 * 128, var58 * 128 + 128, var13 * 128, var14 * 128 + 128, var15, var15);

										for (var16 = var11; var16 <= var58; ++var16) {
											for (var17 = var13; var17 <= var14; ++var17) {
												var10000 = class2.field12[var46][var16];
												var10000[var17] &= ~var6;
											}
										}
									}
								}
							}
						}
					}
				}

				HealthBar.method2166(true);
				var4 = Tiles.Tiles_minPlane;
				if (var4 > class90.Client_plane) {
					var4 = class90.Client_plane;
				}

				if (var4 < class90.Client_plane - 1) {
					var4 = class90.Client_plane - 1;
				}

				if (Client.isLowDetail) {
					MilliClock.scene.init(Tiles.Tiles_minPlane);
				} else {
					MilliClock.scene.init(0);
				}

				for (var5 = 0; var5 < 104; ++var5) {
					for (var6 = 0; var6 < 104; ++var6) {
						HitSplatDefinition.updateItemPile(var5, var6);
					}
				}

				UserComparator5.playPcmPlayers();

				for (PendingSpawn var63 = (PendingSpawn)Client.pendingSpawns.last(); var63 != null; var63 = (PendingSpawn)Client.pendingSpawns.previous()) {
					if (var63.hitpoints == -1) {
						var63.delay = 0;
						WorldMapElement.method4592(var63);
					} else {
						var63.remove();
					}
				}

				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				PacketBufferNode var64;
				if (class1.client.hasFrame()) {
					var64 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2295, Client.packetWriter.isaacCipher);
					var64.packetBuffer.writeInt(1057001181);
					Client.packetWriter.addNode(var64);
				}

				if (!Client.isInInstance) {
					var5 = (class3.field24 - 6) / 8;
					var6 = (class3.field24 + 6) / 8;
					var57 = (class39.field284 - 6) / 8;
					var46 = (class39.field284 + 6) / 8;

					for (var9 = var5 - 1; var9 <= var6 + 1; ++var9) {
						for (var10 = var57 - 1; var10 <= var46 + 1; ++var10) {
							if (var9 < var5 || var9 > var6 || var10 < var57 || var10 > var46) {
								class8.archive5.loadRegionFromName("m" + var9 + "_" + var10);
								class8.archive5.loadRegionFromName("l" + var9 + "_" + var10);
							}
						}
					}
				}

				ItemContainer.updateGameState(30);
				UserComparator5.playPcmPlayers();
				class23.method232();
				var64 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2277, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var64);
				WorldMapSprite.clock.mark();

				for (var6 = 0; var6 < 32; ++var6) {
					GameEngine.graphicsTickTimes[var6] = 0L;
				}

				for (var6 = 0; var6 < 32; ++var6) {
					GameEngine.clientTickTimes[var6] = 0L;
				}

				VertexNormal.gameCyclesToDo = 0;
			}
		}
	}
}
