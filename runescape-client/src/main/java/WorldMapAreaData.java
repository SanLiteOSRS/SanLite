import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("gx")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("o")
	@Export("worldMapData0Set")
	HashSet worldMapData0Set;
	@ObfuscatedName("c")
	@Export("worldMapData1Set")
	HashSet worldMapData1Set;
	@ObfuscatedName("e")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Lnd;IZI)V",
		garbageValue = "1129445653"
	)
	@Export("init")
	void init(Buffer var1, Buffer var2, int var3, boolean var4) {
		this.read(var1, var3);
		int var5 = var2.readUnsignedShort();
		this.worldMapData0Set = new HashSet(var5);

		int var6;
		for (var6 = 0; var6 < var5; ++var6) {
			WorldMapData_0 var7 = new WorldMapData_0();

			try {
				var7.init(var2);
			} catch (IllegalStateException var12) {
				continue;
			}

			this.worldMapData0Set.add(var7);
		}

		var6 = var2.readUnsignedShort();
		this.worldMapData1Set = new HashSet(var6);

		for (int var10 = 0; var10 < var6; ++var10) {
			WorldMapData_1 var8 = new WorldMapData_1();

			try {
				var8.init(var2);
			} catch (IllegalStateException var11) {
				continue;
			}

			this.worldMapData1Set.add(var8);
		}

		this.initIconsList(var2, var4);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lnd;ZI)V",
		garbageValue = "1182006206"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList();
		int var3 = var1.readUnsignedShort();

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = var1.method6583();
			Coord var6 = new Coord(var1.readInt());
			boolean var7 = var1.readUnsignedByte() == 1;
			if (var2 || !var7) {
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null));
			}
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lnd;IIIIIIB)V",
		garbageValue = "-20"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0;

			while (true) {
				var7 = var0.readUnsignedByte();
				if (var7 == 0) {
					if (var1 == 0) {
						int[] var14 = Tiles.Tiles_heights[0][var2];
						int var11 = var2 + var4 + 932731;
						int var12 = var3 + var5 + 556238;
						int var13 = Skeleton.method3920(var11 + 45365, var12 + 91923, 4) - 128 + (Skeleton.method3920(10294 + var11, 37821 + var12, 2) - 128 >> 1) + (Skeleton.method3920(var11, var12, 1) - 128 >> 2);
						var13 = (int)((double)var13 * 0.3D) + 35;
						if (var13 < 10) {
							var13 = 10;
						} else if (var13 > 60) {
							var13 = 60;
						}

						var14[var3] = -var13 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240;
					}
					break;
				}

				if (var7 == 1) {
					int var8 = var0.readUnsignedByte();
					if (var8 == 1) {
						var8 = 0;
					}

					if (var1 == 0) {
						Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8;
					}
					break;
				}

				if (var7 <= 49) {
					class253.field3130[var1][var2][var3] = var0.readByte();
					class20.field182[var1][var2][var3] = (byte)((var7 - 2) / 4);
					DirectByteArrayCopier.field3128[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3);
				} else if (var7 <= 81) {
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49);
				} else {
					Tiles.field1120[var1][var2][var3] = (byte)(var7 - 81);
				}
			}
		} else {
			while (true) {
				var7 = var0.readUnsignedByte();
				if (var7 == 0) {
					break;
				}

				if (var7 == 1) {
					var0.readUnsignedByte();
					break;
				}

				if (var7 <= 49) {
					var0.readUnsignedByte();
				}
			}
		}

	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static final void method3708() {
		TextureProvider.method4142(false);
		Client.field694 = 0;
		boolean var0 = true;

		int var1;
		for (var1 = 0; var1 < class18.regionLandArchives.length; ++var1) {
			if (class16.regionMapArchiveIds[var1] != -1 && class18.regionLandArchives[var1] == null) {
				class18.regionLandArchives[var1] = class247.archive7.takeFile(class16.regionMapArchiveIds[var1], 0);
				if (class18.regionLandArchives[var1] == null) {
					var0 = false;
					++Client.field694;
				}
			}

			if (class24.regionLandArchiveIds[var1] != -1 && class82.regionMapArchives[var1] == null) {
				class82.regionMapArchives[var1] = class247.archive7.takeFileEncrypted(class24.regionLandArchiveIds[var1], 0, xteaKeys[var1]);
				if (class82.regionMapArchives[var1] == null) {
					var0 = false;
					++Client.field694;
				}
			}
		}

		if (!var0) {
			Client.field698 = 1;
		} else {
			Client.field696 = 0;
			var0 = true;

			int var3;
			int var4;
			int var9;
			int var10;
			int var11;
			int var14;
			int var15;
			int var16;
			int var17;
			Buffer var34;
			int var35;
			int var36;
			for (var1 = 0; var1 < class18.regionLandArchives.length; ++var1) {
				byte[] var39 = class82.regionMapArchives[var1];
				if (var39 != null) {
					var3 = (PlayerComposition.regions[var1] >> 8) * 64 - VertexNormal.baseX * 64;
					var4 = (PlayerComposition.regions[var1] & 255) * 64 - SoundSystem.baseY * 64;
					if (Client.isInInstance) {
						var3 = 10;
						var4 = 10;
					}

					boolean var7 = true;
					var34 = new Buffer(var39);
					var9 = -1;

					label594:
					while (true) {
						var10 = var34.method6560();
						if (var10 == 0) {
							var0 &= var7;
							break;
						}

						var9 += var10;
						var11 = 0;
						boolean var12 = false;

						while (true) {
							while (!var12) {
								var35 = var34.readUShortSmart();
								if (var35 == 0) {
									continue label594;
								}

								var11 += var35 - 1;
								var14 = var11 & 63;
								var15 = var11 >> 6 & 63;
								var16 = var34.readUnsignedByte() >> 2;
								var17 = var15 + var3;
								var36 = var4 + var14;
								if (var17 > 0 && var36 > 0 && var17 < 103 && var36 < 103) {
									ObjectComposition var31 = class23.getObjectDefinition(var9);
									if (var16 != 22 || !Client.isLowDetail || var31.int1 != 0 || var31.interactType == 1 || var31.boolean2) {
										if (!var31.needsModelFiles()) {
											++Client.field696;
											var7 = false;
										}

										var12 = true;
									}
								}
							}

							var35 = var34.readUShortSmart();
							if (var35 == 0) {
								break;
							}

							var34.readUnsignedByte();
						}
					}
				}
			}

			if (!var0) {
				Client.field698 = 2;
			} else {
				if (Client.field698 != 0) {
					DirectByteArrayCopier.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				HealthBarUpdate.playPcmPlayers();
				AbstractSocket.scene.clear();

				for (var1 = 0; var1 < 4; ++var1) {
					Client.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) {
					for (var2 = 0; var2 < 104; ++var2) {
						for (var3 = 0; var3 < 104; ++var3) {
							Tiles.Tiles_renderFlags[var1][var2][var3] = 0;
						}
					}
				}

				HealthBarUpdate.playPcmPlayers();
				class34.method327();
				var1 = class18.regionLandArchives.length;
				WorldMapSprite.method3631();
				TextureProvider.method4142(true);
				int var5;
				int var19;
				int var20;
				int var21;
				int var42;
				if (!Client.isInInstance) {
					byte[] var38;
					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (PlayerComposition.regions[var2] >> 8) * 64 - VertexNormal.baseX * 64;
						var4 = (PlayerComposition.regions[var2] & 255) * 64 - SoundSystem.baseY * 64;
						var38 = class18.regionLandArchives[var2];
						if (var38 != null) {
							HealthBarUpdate.playPcmPlayers();
							WorldMapLabel.method3632(var38, var3, var4, GrandExchangeOfferOwnWorldComparator.field632 * 8 - 48, UserComparator4.field1427 * 8 - 48, Client.collisionMaps);
						}
					}

					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (PlayerComposition.regions[var2] >> 8) * 64 - VertexNormal.baseX * 64;
						var4 = (PlayerComposition.regions[var2] & 255) * 64 - SoundSystem.baseY * 64;
						var38 = class18.regionLandArchives[var2];
						if (var38 == null && UserComparator4.field1427 < 800) {
							HealthBarUpdate.playPcmPlayers();
							ItemComposition.method3085(var3, var4, 64, 64);
						}
					}

					TextureProvider.method4142(true);

					for (var2 = 0; var2 < var1; ++var2) {
						byte[] var30 = class82.regionMapArchives[var2];
						if (var30 != null) {
							var4 = (PlayerComposition.regions[var2] >> 8) * 64 - VertexNormal.baseX * 64;
							var5 = (PlayerComposition.regions[var2] & 255) * 64 - SoundSystem.baseY * 64;
							HealthBarUpdate.playPcmPlayers();
							Scene var32 = AbstractSocket.scene;
							CollisionMap[] var33 = Client.collisionMaps;
							var34 = new Buffer(var30);
							var9 = -1;

							while (true) {
								var10 = var34.method6560();
								if (var10 == 0) {
									break;
								}

								var9 += var10;
								var11 = 0;

								while (true) {
									var42 = var34.readUShortSmart();
									if (var42 == 0) {
										break;
									}

									var11 += var42 - 1;
									var35 = var11 & 63;
									var14 = var11 >> 6 & 63;
									var15 = var11 >> 12;
									var16 = var34.readUnsignedByte();
									var17 = var16 >> 2;
									var36 = var16 & 3;
									var19 = var4 + var14;
									var20 = var5 + var35;
									if (var19 > 0 && var20 > 0 && var19 < 103 && var20 < 103) {
										var21 = var15;
										if ((Tiles.Tiles_renderFlags[1][var19][var20] & 2) == 2) {
											var21 = var15 - 1;
										}

										CollisionMap var37 = null;
										if (var21 >= 0) {
											var37 = var33[var21];
										}

										class9.method89(var15, var19, var20, var9, var36, var17, var32, var37);
									}
								}
							}
						}
					}
				}

				int var6;
				int var8;
				int var41;
				if (Client.isInInstance) {
					for (var2 = 0; var2 < 4; ++var2) {
						HealthBarUpdate.playPcmPlayers();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								boolean var40 = false;
								var6 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var6 != -1) {
									var41 = var6 >> 24 & 3;
									var8 = var6 >> 1 & 3;
									var9 = var6 >> 14 & 1023;
									var10 = var6 >> 3 & 2047;
									var11 = (var9 / 8 << 8) + var10 / 8;

									for (var42 = 0; var42 < PlayerComposition.regions.length; ++var42) {
										if (PlayerComposition.regions[var42] == var11 && class18.regionLandArchives[var42] != null) {
											byte[] var13 = class18.regionLandArchives[var42];
											var14 = var3 * 8;
											var15 = var4 * 8;
											var16 = (var9 & 7) * 8;
											var17 = (var10 & 7) * 8;
											CollisionMap[] var18 = Client.collisionMaps;

											for (var19 = 0; var19 < 8; ++var19) {
												for (var20 = 0; var20 < 8; ++var20) {
													if (var14 + var19 > 0 && var14 + var19 < 103 && var15 + var20 > 0 && var20 + var15 < 103) {
														int[] var10000 = var18[var2].flags[var19 + var14];
														var10000[var20 + var15] &= -16777217;
													}
												}
											}

											Buffer var45 = new Buffer(var13);

											for (var20 = 0; var20 < 4; ++var20) {
												for (var21 = 0; var21 < 64; ++var21) {
													for (int var22 = 0; var22 < 64; ++var22) {
														if (var41 == var20 && var21 >= var16 && var21 < var16 + 8 && var22 >= var17 && var22 < var17 + 8) {
															int var27 = var21 & 7;
															int var28 = var22 & 7;
															int var29 = var8 & 3;
															int var26;
															if (var29 == 0) {
																var26 = var27;
															} else if (var29 == 1) {
																var26 = var28;
															} else if (var29 == 2) {
																var26 = 7 - var27;
															} else {
																var26 = 7 - var28;
															}

															loadTerrain(var45, var2, var26 + var14, var15 + class9.method86(var21 & 7, var22 & 7, var8), 0, 0, var8);
														} else {
															loadTerrain(var45, 0, -1, -1, 0, 0, 0);
														}
													}
												}
											}

											var40 = true;
											break;
										}
									}
								}

								if (!var40) {
									MouseRecorder.method2099(var2, var3 * 8, var4 * 8);
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) {
						for (var3 = 0; var3 < 13; ++var3) {
							var4 = Client.instanceChunkTemplates[0][var2][var3];
							if (var4 == -1) {
								ItemComposition.method3085(var2 * 8, var3 * 8, 8, 8);
							}
						}
					}

					TextureProvider.method4142(true);

					for (var2 = 0; var2 < 4; ++var2) {
						HealthBarUpdate.playPcmPlayers();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								var5 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var5 != -1) {
									var6 = var5 >> 24 & 3;
									var41 = var5 >> 1 & 3;
									var8 = var5 >> 14 & 1023;
									var9 = var5 >> 3 & 2047;
									var10 = (var8 / 8 << 8) + var9 / 8;

									for (var11 = 0; var11 < PlayerComposition.regions.length; ++var11) {
										if (PlayerComposition.regions[var11] == var10 && class82.regionMapArchives[var11] != null) {
											FontName.method6296(class82.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var41, AbstractSocket.scene, Client.collisionMaps);
											break;
										}
									}
								}
							}
						}
					}
				}

				TextureProvider.method4142(true);
				HealthBarUpdate.playPcmPlayers();
				class17.method210(AbstractSocket.scene, Client.collisionMaps);
				TextureProvider.method4142(true);
				var2 = Tiles.Tiles_minPlane;
				if (var2 > class22.Client_plane) {
					var2 = class22.Client_plane;
				}

				if (var2 < class22.Client_plane - 1) {
					var2 = class22.Client_plane - 1;
				}

				if (Client.isLowDetail) {
					AbstractSocket.scene.init(Tiles.Tiles_minPlane);
				} else {
					AbstractSocket.scene.init(0);
				}

				for (var3 = 0; var3 < 104; ++var3) {
					for (var4 = 0; var4 < 104; ++var4) {
						class11.updateItemPile(var3, var4);
					}
				}

				HealthBarUpdate.playPcmPlayers();

				for (PendingSpawn var43 = (PendingSpawn)Client.pendingSpawns.last(); var43 != null; var43 = (PendingSpawn)Client.pendingSpawns.previous()) {
					if (var43.hitpoints == -1) {
						var43.delay = 0;
						UserComparator5.method2448(var43);
					} else {
						var43.remove();
					}
				}

				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				PacketBufferNode var44;
				if (class23.client.hasFrame()) {
					var44 = class21.getPacketBufferNode(ClientPacket.field2583, Client.packetWriter.isaacCipher);
					var44.packetBuffer.writeInt(1057001181);
					Client.packetWriter.addNode(var44);
				}

				if (!Client.isInInstance) {
					var3 = (GrandExchangeOfferOwnWorldComparator.field632 - 6) / 8;
					var4 = (GrandExchangeOfferOwnWorldComparator.field632 + 6) / 8;
					var5 = (UserComparator4.field1427 - 6) / 8;
					var6 = (UserComparator4.field1427 + 6) / 8;

					for (var41 = var3 - 1; var41 <= var4 + 1; ++var41) {
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) {
							if (var41 < var3 || var41 > var4 || var8 < var5 || var8 > var6) {
								class247.archive7.loadRegionFromName("m" + var41 + "_" + var8);
								class247.archive7.loadRegionFromName("l" + var41 + "_" + var8);
							}
						}
					}
				}

				class12.updateGameState(30);
				HealthBarUpdate.playPcmPlayers();
				class34.method328();
				var44 = class21.getPacketBufferNode(ClientPacket.field2669, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var44);
				GameEngine.clock.mark();

				for (var4 = 0; var4 < 32; ++var4) {
					GameEngine.graphicsTickTimes[var4] = 0L;
				}

				for (var4 = 0; var4 < 32; ++var4) {
					GameEngine.clientTickTimes[var4] = 0L;
				}

				class260.gameCyclesToDo = 0;
			}
		}
	}
}
