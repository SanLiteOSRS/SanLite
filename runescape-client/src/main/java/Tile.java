import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 952681323
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -509167035
	)
	@Export("x")
	int x;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 950473561
	)
	@Export("y")
	int y;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1257822241
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lgo;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lgv;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1720897143
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Lhj;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("o")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1099123981
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 961427167
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("g")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("a")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("k")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1695083523
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1060231869
	)
	int field2254;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -726038297
	)
	int field2244;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1501732115
	)
	int field2235;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lgx;"
	)
	@Export("linkedBelowTile")
	Tile linkedBelowTile;

	Tile(int var1, int var2, int var3) {
		this.gameObjects = new GameObject[5];
		this.gameObjectEdgeMasks = new int[5];
		this.gameObjectsEdgeMask = 0;
		this.originalPlane = this.plane = var1;
		this.x = var2;
		this.y = var3;
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(Lha;I)V",
		garbageValue = "236848204"
	)
	static final void method3843(class225 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		if (class225.field2683 == var0) {
			var2 = var1.method6595();
			var3 = (var2 >> 4 & 7) + Occluder.field2387;
			var4 = (var2 & 7) + class69.field596;
			var5 = var1.method6595();
			var6 = var1.readUnsignedByte();
			var7 = var6 >> 4 & 15;
			var8 = var6 & 7;
			var9 = var1.method6603();
			if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
				var10 = var7 + 1;
				if (class93.localPlayer.pathX[0] >= var3 - var10 && class93.localPlayer.pathX[0] <= var3 + var10 && class93.localPlayer.pathY[0] >= var4 - var10 && class93.localPlayer.pathY[0] <= var10 + var4 && ObjectComposition.clientPreferences.areaSoundEffectsVolume != 0 && var8 > 0 && Client.soundEffectCount < 50) {
					Client.soundEffectIds[Client.soundEffectCount] = var9;
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8;
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = var5;
					Client.soundEffects[Client.soundEffectCount] = null;
					Client.soundLocations[Client.soundEffectCount] = var7 + (var4 << 8) + (var3 << 16);
					++Client.soundEffectCount;
				}
			}
		}

		if (class225.field2688 == var0) {
			var2 = var1.method6603();
			var3 = var1.method6549();
			var4 = var3 >> 2;
			var5 = var3 & 3;
			var6 = Client.field702[var4];
			var7 = var1.method6595();
			var8 = (var7 >> 4 & 7) + Occluder.field2387;
			var9 = (var7 & 7) + class69.field596;
			if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
				DevicePcmPlayerProvider.updatePendingSpawn(class22.Client_plane, var8, var9, var6, var2, var4, var5, 0, -1);
			}

		} else if (class225.field2680 == var0) {
			var2 = var1.method6603();
			var3 = var1.method6604();
			var4 = var1.method6603();
			var5 = var1.readUnsignedByte();
			var6 = (var5 >> 4 & 7) + Occluder.field2387;
			var7 = (var5 & 7) + class69.field596;
			if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
				NodeDeque var42 = Client.groundItems[class22.Client_plane][var6][var7];
				if (var42 != null) {
					for (TileItem var36 = (TileItem)var42.last(); var36 != null; var36 = (TileItem)var42.previous()) {
						if ((var4 & 32767) == var36.id && var3 == var36.quantity) {
							var36.quantity = var2;
							break;
						}
					}

					class11.updateItemPile(var6, var7);
				}
			}

		} else {
			int var11;
			if (class225.field2684 == var0) {
				var2 = var1.method6671();
				var3 = (var2 >> 4 & 7) + Occluder.field2387;
				var4 = (var2 & 7) + class69.field596;
				var5 = var1.method6605();
				var6 = var1.method6549();
				var7 = var6 >> 2;
				var8 = var6 & 3;
				var9 = Client.field702[var7];
				if (var3 >= 0 && var4 >= 0 && var3 < 103 && var4 < 103) {
					if (var9 == 0) {
						BoundaryObject var35 = AbstractSocket.scene.method4089(class22.Client_plane, var3, var4);
						if (var35 != null) {
							var11 = class93.Entity_unpackID(var35.tag);
							if (var7 == 2) {
								var35.renderable1 = new DynamicObject(var11, 2, var8 + 4, class22.Client_plane, var3, var4, var5, false, var35.renderable1);
								var35.renderable2 = new DynamicObject(var11, 2, var8 + 1 & 3, class22.Client_plane, var3, var4, var5, false, var35.renderable2);
							} else {
								var35.renderable1 = new DynamicObject(var11, var7, var8, class22.Client_plane, var3, var4, var5, false, var35.renderable1);
							}
						}
					}

					if (var9 == 1) {
						WallDecoration var43 = AbstractSocket.scene.method3948(class22.Client_plane, var3, var4);
						if (var43 != null) {
							var11 = class93.Entity_unpackID(var43.tag);
							if (var7 != 4 && var7 != 5) {
								if (var7 == 6) {
									var43.renderable1 = new DynamicObject(var11, 4, var8 + 4, class22.Client_plane, var3, var4, var5, false, var43.renderable1);
								} else if (var7 == 7) {
									var43.renderable1 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, class22.Client_plane, var3, var4, var5, false, var43.renderable1);
								} else if (var7 == 8) {
									var43.renderable1 = new DynamicObject(var11, 4, var8 + 4, class22.Client_plane, var3, var4, var5, false, var43.renderable1);
									var43.renderable2 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, class22.Client_plane, var3, var4, var5, false, var43.renderable2);
								}
							} else {
								var43.renderable1 = new DynamicObject(var11, 4, var8, class22.Client_plane, var3, var4, var5, false, var43.renderable1);
							}
						}
					}

					if (var9 == 2) {
						GameObject var44 = AbstractSocket.scene.method3926(class22.Client_plane, var3, var4);
						if (var7 == 11) {
							var7 = 10;
						}

						if (var44 != null) {
							var44.renderable = new DynamicObject(class93.Entity_unpackID(var44.tag), var7, var8, class22.Client_plane, var3, var4, var5, false, var44.renderable);
						}
					}

					if (var9 == 3) {
						FloorDecoration var45 = AbstractSocket.scene.getFloorDecoration(class22.Client_plane, var3, var4);
						if (var45 != null) {
							var45.renderable = new DynamicObject(class93.Entity_unpackID(var45.tag), 22, var8, class22.Client_plane, var3, var4, var5, false, var45.renderable);
						}
					}
				}

			} else if (class225.field2682 == var0) {
				var2 = var1.method6595();
				var3 = var2 >> 2;
				var4 = var2 & 3;
				var5 = Client.field702[var3];
				var6 = var1.method6595();
				var7 = (var6 >> 4 & 7) + Occluder.field2387;
				var8 = (var6 & 7) + class69.field596;
				if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
					DevicePcmPlayerProvider.updatePendingSpawn(class22.Client_plane, var7, var8, var5, -1, var3, var4, 0, -1);
				}

			} else {
				TileItem var32;
				if (class225.field2685 == var0) {
					var2 = var1.readUnsignedShort();
					var3 = var1.method6595();
					var4 = (var3 >> 4 & 7) + Occluder.field2387;
					var5 = (var3 & 7) + class69.field596;
					if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
						NodeDeque var34 = Client.groundItems[class22.Client_plane][var4][var5];
						if (var34 != null) {
							for (var32 = (TileItem)var34.last(); var32 != null; var32 = (TileItem)var34.previous()) {
								if ((var2 & 32767) == var32.id) {
									var32.remove();
									break;
								}
							}

							if (var34.last() == null) {
								Client.groundItems[class22.Client_plane][var4][var5] = null;
							}

							class11.updateItemPile(var4, var5);
						}
					}

				} else {
					int var12;
					int var13;
					int var14;
					if (class225.field2686 == var0) {
						var2 = var1.method6726();
						var3 = var1.method6595() * 4;
						byte var38 = var1.method6559();
						var5 = var1.method6671() * 4;
						var6 = var1.method6549();
						var7 = (var6 >> 4 & 7) + Occluder.field2387;
						var8 = (var6 & 7) + class69.field596;
						var9 = var1.method6549();
						var10 = var1.method6604();
						byte var41 = var1.method6559();
						var12 = var1.method6605();
						var13 = var1.readUnsignedShort();
						var14 = var1.method6595();
						var11 = var41 + var7;
						var4 = var38 + var8;
						if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var11 >= 0 && var4 >= 0 && var11 < 104 && var4 < 104 && var13 != 65535) {
							var7 = var7 * 128 + 64;
							var8 = var8 * 128 + 64;
							var11 = var11 * 128 + 64;
							var4 = var4 * 128 + 64;
							Projectile var33 = new Projectile(var13, class22.Client_plane, var7, var8, class105.getTileHeight(var7, var8, class22.Client_plane) - var3, var12 + Client.cycle, var10 + Client.cycle, var9, var14, var2, var5);
							var33.setDestination(var11, var4, class105.getTileHeight(var11, var4, class22.Client_plane) - var5, var12 + Client.cycle);
							Client.projectiles.addFirst(var33);
						}

					} else {
						if (class225.field2681 == var0) {
							byte var37 = var1.readByte();
							var3 = var1.method6604();
							var4 = var1.method6603();
							byte var39 = var1.method6597();
							var6 = var1.readUnsignedShort();
							var7 = var1.method6603();
							byte var40 = var1.method6593();
							var9 = var1.method6549();
							var10 = (var9 >> 4 & 7) + Occluder.field2387;
							var11 = (var9 & 7) + class69.field596;
							var12 = var1.method6595();
							var13 = var12 >> 2;
							var14 = var12 & 3;
							int var15 = Client.field702[var13];
							byte var16 = var1.readByte();
							Player var17;
							if (var6 == Client.localPlayerIndex) {
								var17 = class93.localPlayer;
							} else {
								var17 = Client.players[var6];
							}

							if (var17 != null) {
								ObjectComposition var18 = class23.getObjectDefinition(var3);
								int var19;
								int var20;
								if (var14 != 1 && var14 != 3) {
									var19 = var18.sizeX;
									var20 = var18.sizeY;
								} else {
									var19 = var18.sizeY;
									var20 = var18.sizeX;
								}

								int var21 = var10 + (var19 >> 1);
								int var22 = var10 + (var19 + 1 >> 1);
								int var23 = var11 + (var20 >> 1);
								int var24 = var11 + (var20 + 1 >> 1);
								int[][] var25 = Tiles.Tiles_heights[class22.Client_plane];
								int var26 = var25[var21][var23] + var25[var22][var23] + var25[var21][var24] + var25[var22][var24] >> 2;
								int var27 = (var10 << 7) + (var19 << 6);
								int var28 = (var11 << 7) + (var20 << 6);
								Model var29 = var18.getModel(var13, var14, var25, var27, var26, var28);
								if (var29 != null) {
									DevicePcmPlayerProvider.updatePendingSpawn(class22.Client_plane, var10, var11, var15, -1, 0, 0, var4 + 1, var7 + 1);
									var17.animationCycleStart = var4 + Client.cycle;
									var17.animationCycleEnd = var7 + Client.cycle;
									var17.model0 = var29;
									var17.field1202 = var10 * 128 + var19 * 64;
									var17.field1220 = var11 * 128 + var20 * 64;
									var17.tileHeight2 = var26;
									byte var30;
									if (var16 > var39) {
										var30 = var16;
										var16 = var39;
										var39 = var30;
									}

									if (var37 > var40) {
										var30 = var37;
										var37 = var40;
										var40 = var30;
									}

									var17.minX = var16 + var10;
									var17.maxX = var10 + var39;
									var17.minY = var11 + var37;
									var17.maxY = var11 + var40;
								}
							}
						}

						if (class225.field2687 == var0) {
							var2 = var1.method6605();
							var3 = var1.readUnsignedShort();
							var4 = var1.readUnsignedByte();
							var5 = (var4 >> 4 & 7) + Occluder.field2387;
							var6 = (var4 & 7) + class69.field596;
							if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
								var32 = new TileItem();
								var32.id = var3;
								var32.quantity = var2;
								if (Client.groundItems[class22.Client_plane][var5][var6] == null) {
									Client.groundItems[class22.Client_plane][var5][var6] = new NodeDeque();
								}

								Client.groundItems[class22.Client_plane][var5][var6].addFirst(var32);
								class11.updateItemPile(var5, var6);
							}

						} else if (class225.field2689 == var0) {
							var2 = var1.readUnsignedShort();
							var3 = var1.method6595();
							var4 = var1.method6595();
							var5 = (var4 >> 4 & 7) + Occluder.field2387;
							var6 = (var4 & 7) + class69.field596;
							var7 = var1.method6605();
							if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
								var5 = var5 * 128 + 64;
								var6 = var6 * 128 + 64;
								GraphicsObject var31 = new GraphicsObject(var2, class22.Client_plane, var5, var6, class105.getTileHeight(var5, var6, class22.Client_plane) - var3, var7, Client.cycle);
								Client.graphicsObjects.addFirst(var31);
							}

						}
					}
				}
			}
		}
	}
}
