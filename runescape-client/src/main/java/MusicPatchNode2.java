import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
	@ObfuscatedName("i")
	byte[] field2916;
	@ObfuscatedName("w")
	byte[] field2914;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1643718021
	)
	int field2913;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 470925631
	)
	int field2918;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1577880969
	)
	int field2915;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1887609341
	)
	int field2912;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1787645677
	)
	int field2917;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -311548265
	)
	int field2911;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1107256975
	)
	int field2919;

	MusicPatchNode2() {
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IZI)Ljava/lang/String;",
		garbageValue = "2086723943"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		return var1 && var0 >= 0 ? GrandExchangeEvent.method5448(var0, 10, var1) : Integer.toString(var0);
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-1147573372"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
			if (Client.isLowDetail && var0 != GrandExchangeOfferTotalQuantityComparator.Client_plane) {
				return;
			}

			long var7 = 0L;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;
			if (var1 == 0) {
				var7 = GameBuild.scene.getBoundaryObjectTag(var0, var2, var3);
			}

			if (var1 == 1) {
				var7 = GameBuild.scene.getWallDecorationTag(var0, var2, var3);
			}

			if (var1 == 2) {
				var7 = GameBuild.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) {
				var7 = GameBuild.scene.getFloorDecorationTag(var0, var2, var3);
			}

			int var12;
			if (0L != var7) {
				var12 = GameBuild.scene.getObjectFlags(var0, var2, var3, var7);
				int var38 = class21.Entity_unpackID(var7);
				int var39 = var12 & 31;
				int var40 = var12 >> 6 & 3;
				ObjectComposition var13;
				if (var1 == 0) {
					GameBuild.scene.removeBoundaryObject(var0, var2, var3);
					var13 = KitDefinition.getObjectDefinition(var38);
					if (var13.interactType != 0) {
						Client.collisionMaps[var0].method3470(var2, var3, var39, var40, var13.boolean1);
					}
				}

				if (var1 == 1) {
					GameBuild.scene.removeWallDecoration(var0, var2, var3);
				}

				if (var1 == 2) {
					GameBuild.scene.removeGameObject(var0, var2, var3);
					var13 = KitDefinition.getObjectDefinition(var38);
					if (var2 + var13.sizeX > 103 || var3 + var13.sizeX > 103 || var2 + var13.sizeY > 103 || var3 + var13.sizeY > 103) {
						return;
					}

					if (var13.interactType != 0) {
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var40, var13.boolean1);
					}
				}

				if (var1 == 3) {
					GameBuild.scene.removeFloorDecoration(var0, var2, var3);
					var13 = KitDefinition.getObjectDefinition(var38);
					if (var13.interactType == 1) {
						Client.collisionMaps[var0].method3479(var2, var3);
					}
				}
			}

			if (var4 >= 0) {
				var12 = var0;
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) {
					var12 = var0 + 1;
				}

				Scene var41 = GameBuild.scene;
				CollisionMap var14 = Client.collisionMaps[var0];
				ObjectComposition var15 = KitDefinition.getObjectDefinition(var4);
				int var16;
				int var17;
				if (var5 != 1 && var5 != 3) {
					var16 = var15.sizeX;
					var17 = var15.sizeY;
				} else {
					var16 = var15.sizeY;
					var17 = var15.sizeX;
				}

				int var18;
				int var19;
				if (var16 + var2 <= 104) {
					var18 = (var16 >> 1) + var2;
					var19 = var2 + (var16 + 1 >> 1);
				} else {
					var18 = var2;
					var19 = var2 + 1;
				}

				int var20;
				int var21;
				if (var3 + var17 <= 104) {
					var20 = var3 + (var17 >> 1);
					var21 = var3 + (var17 + 1 >> 1);
				} else {
					var20 = var3;
					var21 = var3 + 1;
				}

				int[][] var22 = Tiles.Tiles_heights[var12];
				int var23 = var22[var19][var21] + var22[var18][var20] + var22[var19][var20] + var22[var18][var21] >> 2;
				int var24 = (var2 << 7) + (var16 << 6);
				int var25 = (var3 << 7) + (var17 << 6);
				long var26 = PacketBuffer.calculateTag(var2, var3, 2, var15.int1 == 0, var4);
				int var28 = (var5 << 6) + var6;
				if (var15.int3 == 1) {
					var28 += 256;
				}

				Object var36;
				if (var6 == 22) {
					if (var15.animationId == -1 && var15.transforms == null) {
						var36 = var15.getModel(22, var5, var22, var24, var23, var25);
					} else {
						var36 = new DynamicObject(var4, 22, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null);
					}

					var41.newFloorDecoration(var0, var2, var3, var23, (Renderable)var36, var26, var28);
					if (var15.interactType == 1) {
						var14.setBlockedByFloorDec(var2, var3);
					}
				} else if (var6 != 10 && var6 != 11) {
					if (var6 >= 12) {
						if (var15.animationId == -1 && var15.transforms == null) {
							var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null);
						}

						var41.method4289(var0, var2, var3, var23, 1, 1, (Renderable)var36, 0, var26, var28);
						if (var15.interactType != 0) {
							var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
						}
					} else if (var6 == 0) {
						if (var15.animationId == -1 && var15.transforms == null) {
							var36 = var15.getModel(0, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, 0, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null);
						}

						var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field964[var5], 0, var26, var28);
						if (var15.interactType != 0) {
							var14.method3465(var2, var3, var6, var5, var15.boolean1);
						}
					} else if (var6 == 1) {
						if (var15.animationId == -1 && var15.transforms == null) {
							var36 = var15.getModel(1, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, 1, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null);
						}

						var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field967[var5], 0, var26, var28);
						if (var15.interactType != 0) {
							var14.method3465(var2, var3, var6, var5, var15.boolean1);
						}
					} else {
						int var29;
						if (var6 == 2) {
							var29 = var5 + 1 & 3;
							Object var31;
							Object var37;
							if (var15.animationId == -1 && var15.transforms == null) {
								var37 = var15.getModel(2, var5 + 4, var22, var24, var23, var25);
								var31 = var15.getModel(2, var29, var22, var24, var23, var25);
							} else {
								var37 = new DynamicObject(var4, 2, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null);
								var31 = new DynamicObject(var4, 2, var29, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null);
							}

							var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var37, (Renderable)var31, Tiles.field964[var5], Tiles.field964[var29], var26, var28);
							if (var15.interactType != 0) {
								var14.method3465(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 3) {
							if (var15.animationId == -1 && var15.transforms == null) {
								var36 = var15.getModel(3, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, 3, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null);
							}

							var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field967[var5], 0, var26, var28);
							if (var15.interactType != 0) {
								var14.method3465(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 9) {
							if (var15.animationId == -1 && var15.transforms == null) {
								var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null);
							}

							var41.method4289(var0, var2, var3, var23, 1, 1, (Renderable)var36, 0, var26, var28);
							if (var15.interactType != 0) {
								var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
							}
						} else if (var6 == 4) {
							if (var15.animationId == -1 && var15.transforms == null) {
								var36 = var15.getModel(4, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null);
							}

							var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field964[var5], 0, 0, 0, var26, var28);
						} else {
							long var30;
							Object var32;
							if (var6 == 5) {
								var29 = 16;
								var30 = var41.getBoundaryObjectTag(var0, var2, var3);
								if (0L != var30) {
									var29 = KitDefinition.getObjectDefinition(class21.Entity_unpackID(var30)).int2;
								}

								if (var15.animationId == -1 && var15.transforms == null) {
									var32 = var15.getModel(4, var5, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null);
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)null, Tiles.field964[var5], 0, var29 * Tiles.field966[var5], var29 * Tiles.field960[var5], var26, var28);
							} else if (var6 == 6) {
								var29 = 8;
								var30 = var41.getBoundaryObjectTag(var0, var2, var3);
								if (0L != var30) {
									var29 = KitDefinition.getObjectDefinition(class21.Entity_unpackID(var30)).int2 / 2;
								}

								if (var15.animationId == -1 && var15.transforms == null) {
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null);
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)null, 256, var5, var29 * Tiles.field957[var5], var29 * Tiles.field970[var5], var26, var28);
							} else if (var6 == 7) {
								int var35 = var5 + 2 & 3;
								if (var15.animationId == -1 && var15.transforms == null) {
									var36 = var15.getModel(4, var35 + 4, var22, var24, var23, var25);
								} else {
									var36 = new DynamicObject(var4, 4, var35 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null);
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, 256, var35, 0, 0, var26, var28);
							} else if (var6 == 8) {
								var29 = 8;
								var30 = var41.getBoundaryObjectTag(var0, var2, var3);
								if (var30 != 0L) {
									var29 = KitDefinition.getObjectDefinition(class21.Entity_unpackID(var30)).int2 / 2;
								}

								int var34 = var5 + 2 & 3;
								Object var33;
								if (var15.animationId == -1 && var15.transforms == null) {
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25);
									var33 = var15.getModel(4, var34 + 4, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null);
									var33 = new DynamicObject(var4, 4, var34 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null);
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)var33, 256, var5, var29 * Tiles.field957[var5], var29 * Tiles.field970[var5], var26, var28);
							}
						}
					}
				} else {
					if (var15.animationId == -1 && var15.transforms == null) {
						var36 = var15.getModel(10, var5, var22, var24, var23, var25);
					} else {
						var36 = new DynamicObject(var4, 10, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null);
					}

					if (var36 != null) {
						var41.method4289(var0, var2, var3, var23, var16, var17, (Renderable)var36, var6 == 11 ? 256 : 0, var26, var28);
					}

					if (var15.interactType != 0) {
						var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
					}
				}
			}
		}

	}
}
