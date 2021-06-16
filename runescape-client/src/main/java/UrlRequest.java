import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("gf")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("f")
	@Export("url")
	final URL url;
	@ObfuscatedName("e")
	@Export("isDone0")
	volatile boolean isDone0;
	@ObfuscatedName("v")
	@Export("response0")
	volatile byte[] response0;

	UrlRequest(URL var1) {
		this.url = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.isDone0;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "669779460"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "841550711"
	)
	static final void method2520(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) {
			for (int var5 = var0; var5 <= var0 + var2; ++var5) {
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
					class43.field307[0][var5][var4] = 127;
					if (var0 == var5 && var5 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var5 == var0 + var2 && var5 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var4 == var3 + var1 && var4 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)J",
		garbageValue = "1235169435"
	)
	public static long method2516(int var0) {
		return ViewportMouse.ViewportMouse_entityTags[var0];
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-79"
	)
	static void method2519(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) {
				int var5 = 0;
				if (var1 > var4.field937 * 16384) {
					var5 += var1 - var4.field937 * 16384;
				} else if (var1 < var4.x * 16384) {
					var5 += var4.x * 16384 - var1;
				}

				if (var2 > var4.field944 * 16384) {
					var5 += var2 - var4.field944 * 16384;
				} else if (var2 < var4.y * 16384) {
					var5 += var4.y * 16384 - var2;
				}

				if (var5 - 64 <= var4.field939 && class4.clientPreferences.areaSoundEffectsVolume != 0 && var0 == var4.plane) {
					var5 -= 64;
					if (var5 < 0) {
						var5 = 0;
					}

					int var6 = (var4.field939 - var5) * class4.clientPreferences.areaSoundEffectsVolume / var4.field939;
					if (var4.stream1 == null) {
						if (var4.soundEffectId >= 0) {
							SoundEffect var7 = SoundEffect.readSoundEffect(class26.field211, var4.soundEffectId, 0);
							if (var7 != null) {
								RawSound var8 = var7.toRawSound().resample(WorldMapAreaData.decimator);
								RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6);
								var9.setNumLoops(-1);
								UserComparator7.pcmStreamMixer.addSubStream(var9);
								var4.stream1 = var9;
							}
						}
					} else {
						var4.stream1.method936(var6);
					}

					if (var4.stream2 == null) {
						if (var4.soundEffectIds != null && (var4.field945 -= var3) <= 0) {
							int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length);
							SoundEffect var12 = SoundEffect.readSoundEffect(class26.field211, var4.soundEffectIds[var11], 0);
							if (var12 != null) {
								RawSound var13 = var12.toRawSound().resample(WorldMapAreaData.decimator);
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6);
								var10.setNumLoops(0);
								UserComparator7.pcmStreamMixer.addSubStream(var10);
								var4.stream2 = var10;
								var4.field945 = var4.field941 + (int)(Math.random() * (double)(var4.field943 - var4.field941));
							}
						}
					} else {
						var4.stream2.method936(var6);
						if (!var4.stream2.hasNext()) {
							var4.stream2 = null;
						}
					}
				} else {
					if (var4.stream1 != null) {
						UserComparator7.pcmStreamMixer.removeSubStream(var4.stream1);
						var4.stream1 = null;
					}

					if (var4.stream2 != null) {
						UserComparator7.pcmStreamMixer.removeSubStream(var4.stream2);
						var4.stream2 = null;
					}
				}
			}
		}

	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(IZZZS)Ljf;",
		garbageValue = "-28511"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3) {
		ArchiveDisk var4 = null;
		if (JagexCache.JagexCache_dat2File != null) {
			var4 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, class369.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var4, WorldMapID.masterDisk, var0, var1, var2, var3);
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(Lhj;I)V",
		garbageValue = "1535496544"
	)
	static final void method2511(class226 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		TileItem var35;
		if (class226.field2687 == var0) {
			var2 = var1.method6643();
			var3 = (var2 >> 4 & 7) + WorldMapSection0.field2047;
			var4 = (var2 & 7) + class15.field128;
			var5 = var1.method6653();
			var6 = var1.method6652();
			if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
				var35 = new TileItem();
				var35.id = var5;
				var35.quantity = var6;
				if (Client.groundItems[SoundSystem.Client_plane][var3][var4] == null) {
					Client.groundItems[SoundSystem.Client_plane][var3][var4] = new NodeDeque();
				}

				Client.groundItems[SoundSystem.Client_plane][var3][var4].addFirst(var35);
				class26.updateItemPile(var3, var4);
			}

		} else {
			int var7;
			if (class226.field2693 == var0) {
				var2 = var1.readUnsignedShort();
				var3 = var1.method6652();
				var4 = var1.method6653();
				var5 = var1.method6643();
				var6 = (var5 >> 4 & 7) + WorldMapSection0.field2047;
				var7 = (var5 & 7) + class15.field128;
				if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
					NodeDeque var42 = Client.groundItems[SoundSystem.Client_plane][var6][var7];
					if (var42 != null) {
						for (TileItem var36 = (TileItem)var42.last(); var36 != null; var36 = (TileItem)var42.previous()) {
							if ((var4 & 32767) == var36.id && var2 == var36.quantity) {
								var36.quantity = var3;
								break;
							}
						}

						class26.updateItemPile(var6, var7);
					}
				}

			} else {
				int var8;
				int var9;
				if (class226.field2683 == var0) {
					var2 = var1.method6642();
					var3 = (var2 >> 4 & 7) + WorldMapSection0.field2047;
					var4 = (var2 & 7) + class15.field128;
					var5 = var1.method6651();
					var6 = var1.method6643();
					var7 = var6 >> 2;
					var8 = var6 & 3;
					var9 = Client.field682[var7];
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
						class375.updatePendingSpawn(SoundSystem.Client_plane, var3, var4, var9, var5, var7, var8, 0, -1);
					}

				} else if (class226.field2684 == var0) {
					var2 = var1.method6642();
					var3 = (var2 >> 4 & 7) + WorldMapSection0.field2047;
					var4 = (var2 & 7) + class15.field128;
					var5 = var1.method6653();
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
						NodeDeque var34 = Client.groundItems[SoundSystem.Client_plane][var3][var4];
						if (var34 != null) {
							for (var35 = (TileItem)var34.last(); var35 != null; var35 = (TileItem)var34.previous()) {
								if ((var5 & 32767) == var35.id) {
									var35.remove();
									break;
								}
							}

							if (var34.last() == null) {
								Client.groundItems[SoundSystem.Client_plane][var3][var4] = null;
							}

							class26.updateItemPile(var3, var4);
						}
					}

				} else {
					int var11;
					if (class226.field2686 == var0) {
						var2 = var1.method6643();
						var3 = (var2 >> 4 & 7) + WorldMapSection0.field2047;
						var4 = (var2 & 7) + class15.field128;
						var5 = var1.readUnsignedByte();
						var6 = var5 >> 2;
						var7 = var5 & 3;
						var8 = Client.field682[var6];
						var9 = var1.method6652();
						if (var3 >= 0 && var4 >= 0 && var3 < 103 && var4 < 103) {
							if (var8 == 0) {
								BoundaryObject var33 = DevicePcmPlayerProvider.scene.method4058(SoundSystem.Client_plane, var3, var4);
								if (var33 != null) {
									var11 = Message.Entity_unpackID(var33.tag);
									if (var6 == 2) {
										var33.renderable1 = new DynamicObject(var11, 2, var7 + 4, SoundSystem.Client_plane, var3, var4, var9, false, var33.renderable1);
										var33.renderable2 = new DynamicObject(var11, 2, var7 + 1 & 3, SoundSystem.Client_plane, var3, var4, var9, false, var33.renderable2);
									} else {
										var33.renderable1 = new DynamicObject(var11, var6, var7, SoundSystem.Client_plane, var3, var4, var9, false, var33.renderable1);
									}
								}
							}

							if (var8 == 1) {
								WallDecoration var43 = DevicePcmPlayerProvider.scene.method4059(SoundSystem.Client_plane, var3, var4);
								if (var43 != null) {
									var11 = Message.Entity_unpackID(var43.tag);
									if (var6 != 4 && var6 != 5) {
										if (var6 == 6) {
											var43.renderable1 = new DynamicObject(var11, 4, var7 + 4, SoundSystem.Client_plane, var3, var4, var9, false, var43.renderable1);
										} else if (var6 == 7) {
											var43.renderable1 = new DynamicObject(var11, 4, (var7 + 2 & 3) + 4, SoundSystem.Client_plane, var3, var4, var9, false, var43.renderable1);
										} else if (var6 == 8) {
											var43.renderable1 = new DynamicObject(var11, 4, var7 + 4, SoundSystem.Client_plane, var3, var4, var9, false, var43.renderable1);
											var43.renderable2 = new DynamicObject(var11, 4, (var7 + 2 & 3) + 4, SoundSystem.Client_plane, var3, var4, var9, false, var43.renderable2);
										}
									} else {
										var43.renderable1 = new DynamicObject(var11, 4, var7, SoundSystem.Client_plane, var3, var4, var9, false, var43.renderable1);
									}
								}
							}

							if (var8 == 2) {
								GameObject var44 = DevicePcmPlayerProvider.scene.method4094(SoundSystem.Client_plane, var3, var4);
								if (var6 == 11) {
									var6 = 10;
								}

								if (var44 != null) {
									var44.renderable = new DynamicObject(Message.Entity_unpackID(var44.tag), var6, var7, SoundSystem.Client_plane, var3, var4, var9, false, var44.renderable);
								}
							}

							if (var8 == 3) {
								FloorDecoration var45 = DevicePcmPlayerProvider.scene.getFloorDecoration(SoundSystem.Client_plane, var3, var4);
								if (var45 != null) {
									var45.renderable = new DynamicObject(Message.Entity_unpackID(var45.tag), 22, var7, SoundSystem.Client_plane, var3, var4, var9, false, var45.renderable);
								}
							}
						}

					} else {
						int var10;
						if (class226.field2688 == var0) {
							var2 = var1.method6642();
							var3 = var1.readUnsignedByte();
							var4 = (var3 >> 4 & 7) + WorldMapSection0.field2047;
							var5 = (var3 & 7) + class15.field128;
							var6 = var1.readUnsignedShort();
							var7 = var1.method6643();
							var8 = var7 >> 4 & 15;
							var9 = var7 & 7;
							if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
								var10 = var8 + 1;
								if (class262.localPlayer.pathX[0] >= var4 - var10 && class262.localPlayer.pathX[0] <= var4 + var10 && class262.localPlayer.pathY[0] >= var5 - var10 && class262.localPlayer.pathY[0] <= var10 + var5 && class4.clientPreferences.areaSoundEffectsVolume != 0 && var9 > 0 && Client.soundEffectCount < 50) {
									Client.soundEffectIds[Client.soundEffectCount] = var6;
									Client.queuedSoundEffectLoops[Client.soundEffectCount] = var9;
									Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
									Client.soundEffects[Client.soundEffectCount] = null;
									Client.soundLocations[Client.soundEffectCount] = var8 + (var5 << 8) + (var4 << 16);
									++Client.soundEffectCount;
								}
							}
						}

						if (class226.field2690 == var0) {
							var2 = var1.method6643();
							var3 = (var2 >> 4 & 7) + WorldMapSection0.field2047;
							var4 = (var2 & 7) + class15.field128;
							var5 = var1.readUnsignedByte();
							var6 = var5 >> 2;
							var7 = var5 & 3;
							var8 = Client.field682[var6];
							if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
								class375.updatePendingSpawn(SoundSystem.Client_plane, var3, var4, var8, -1, var6, var7, 0, -1);
							}

						} else {
							int var12;
							int var14;
							if (class226.field2691 == var0) {
								var2 = var1.readUnsignedShort();
								var3 = var1.readUnsignedShort();
								var4 = var1.method6642();
								var5 = (var4 >> 4 & 7) + WorldMapSection0.field2047;
								var6 = (var4 & 7) + class15.field128;
								byte var38 = var1.method6750();
								byte var39 = var1.method6750();
								var9 = var1.method6642();
								var10 = var9 >> 2;
								var11 = var9 & 3;
								var12 = Client.field682[var10];
								byte var13 = var1.readByte();
								var14 = var1.method6653();
								byte var15 = var1.readByte();
								int var16 = var1.method6651();
								Player var17;
								if (var3 == Client.localPlayerIndex) {
									var17 = class262.localPlayer;
								} else {
									var17 = Client.players[var3];
								}

								if (var17 != null) {
									ObjectComposition var18 = Tiles.getObjectDefinition(var2);
									int var19;
									int var20;
									if (var11 != 1 && var11 != 3) {
										var19 = var18.sizeX;
										var20 = var18.sizeY;
									} else {
										var19 = var18.sizeY;
										var20 = var18.sizeX;
									}

									int var21 = var5 + (var19 >> 1);
									int var22 = var5 + (var19 + 1 >> 1);
									int var23 = var6 + (var20 >> 1);
									int var24 = var6 + (var20 + 1 >> 1);
									int[][] var25 = Tiles.Tiles_heights[SoundSystem.Client_plane];
									int var26 = var25[var22][var24] + var25[var22][var23] + var25[var21][var23] + var25[var21][var24] >> 2;
									int var27 = (var5 << 7) + (var19 << 6);
									int var28 = (var6 << 7) + (var20 << 6);
									Model var29 = var18.getModel(var10, var11, var25, var27, var26, var28);
									if (var29 != null) {
										class375.updatePendingSpawn(SoundSystem.Client_plane, var5, var6, var12, -1, 0, 0, var14 + 1, var16 + 1);
										var17.animationCycleStart = var14 + Client.cycle;
										var17.animationCycleEnd = var16 + Client.cycle;
										var17.model0 = var29;
										var17.field1185 = var5 * 128 + var19 * 64;
										var17.field1197 = var6 * 128 + var20 * 64;
										var17.tileHeight2 = var26;
										byte var30;
										if (var13 > var15) {
											var30 = var13;
											var13 = var15;
											var15 = var30;
										}

										if (var39 > var38) {
											var30 = var39;
											var39 = var38;
											var38 = var30;
										}

										var17.minX = var13 + var5;
										var17.maxX = var15 + var5;
										var17.minY = var6 + var39;
										var17.maxY = var6 + var38;
									}
								}
							}

							if (class226.field2689 == var0) {
								var2 = var1.method6757();
								byte var37 = var1.method6619();
								var4 = var1.method6651();
								var5 = var1.method6653();
								var6 = var1.method6644();
								var7 = var1.method6652();
								var8 = var1.readUnsignedByte();
								var9 = (var8 >> 4 & 7) + WorldMapSection0.field2047;
								var10 = (var8 & 7) + class15.field128;
								var11 = var1.method6643();
								byte var40 = var1.readByte();
								int var41 = var1.method6644() * 4;
								var14 = var1.method6643() * 4;
								var3 = var37 + var9;
								var12 = var40 + var10;
								if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var3 >= 0 && var12 >= 0 && var3 < 104 && var12 < 104 && var7 != 65535) {
									var9 = var9 * 128 + 64;
									var10 = var10 * 128 + 64;
									var3 = var3 * 128 + 64;
									var12 = var12 * 128 + 64;
									Projectile var32 = new Projectile(var7, SoundSystem.Client_plane, var9, var10, ItemContainer.getTileHeight(var9, var10, SoundSystem.Client_plane) - var14, var4 + Client.cycle, var5 + Client.cycle, var6, var11, var2, var41);
									var32.setDestination(var3, var12, ItemContainer.getTileHeight(var3, var12, SoundSystem.Client_plane) - var41, var4 + Client.cycle);
									Client.projectiles.addFirst(var32);
								}

							} else if (class226.field2692 == var0) {
								var2 = var1.method6651();
								var3 = var1.method6642();
								var4 = (var3 >> 4 & 7) + WorldMapSection0.field2047;
								var5 = (var3 & 7) + class15.field128;
								var6 = var1.method6643();
								var7 = var1.method6652();
								if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
									var4 = var4 * 128 + 64;
									var5 = var5 * 128 + 64;
									GraphicsObject var31 = new GraphicsObject(var7, SoundSystem.Client_plane, var4, var5, ItemContainer.getTileHeight(var4, var5, SoundSystem.Client_plane) - var6, var2, Client.cycle);
									Client.graphicsObjects.addFirst(var31);
								}

							}
						}
					}
				}
			}
		}
	}
}
