import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("ac")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	public static Client client;
	@ObfuscatedName("h")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Loa;Loa;B)I",
		garbageValue = "2"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) { // L: 14
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "-96"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) { // L: 8030
			if (Client.isLowDetail && var0 != class383.Client_plane) { // L: 8031
				return;
			}

			long var7 = 0L; // L: 8032
			boolean var9 = true; // L: 8033
			boolean var10 = false; // L: 8034
			boolean var11 = false; // L: 8035
			if (var1 == 0) { // L: 8036
				var7 = ReflectionCheck.scene.getWallObjectTag(var0, var2, var3);
			}

			if (var1 == 1) { // L: 8037
				var7 = ReflectionCheck.scene.getDecorativeObjectTag(var0, var2, var3);
			}

			if (var1 == 2) { // L: 8038
				var7 = ReflectionCheck.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) { // L: 8039
				var7 = ReflectionCheck.scene.getGroundObjectTag(var0, var2, var3);
			}

			int var12;
			if (0L != var7) { // L: 8040
				var12 = ReflectionCheck.scene.getObjectFlags(var0, var2, var3, var7); // L: 8041
				int var38 = Occluder.Entity_unpackID(var7); // L: 8042
				int var39 = var12 & 31; // L: 8043
				int var40 = var12 >> 6 & 3; // L: 8044
				ObjectComposition var13;
				if (var1 == 0) { // L: 8045
					ReflectionCheck.scene.removeWallObject(var0, var2, var3); // L: 8046
					var13 = VarpDefinition.getObjectDefinition(var38); // L: 8047
					if (var13.interactType != 0) { // L: 8048
						Client.collisionMaps[var0].method4147(var2, var3, var39, var40, var13.boolean1);
					}
				}

				if (var1 == 1) { // L: 8050
					ReflectionCheck.scene.removeDecorativeObject(var0, var2, var3);
				}

				if (var1 == 2) { // L: 8051
					ReflectionCheck.scene.removeGameObject(var0, var2, var3); // L: 8052
					var13 = VarpDefinition.getObjectDefinition(var38); // L: 8053
					if (var2 + var13.sizeX > 103 || var3 + var13.sizeX > 103 || var2 + var13.sizeY > 103 || var3 + var13.sizeY > 103) { // L: 8054
						return;
					}

					if (var13.interactType != 0) { // L: 8055
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var40, var13.boolean1);
					}
				}

				if (var1 == 3) { // L: 8057
					ReflectionCheck.scene.removeGroundObject(var0, var2, var3); // L: 8058
					var13 = VarpDefinition.getObjectDefinition(var38); // L: 8059
					if (var13.interactType == 1) { // L: 8060
						Client.collisionMaps[var0].method4174(var2, var3);
					}
				}
			}

			if (var4 >= 0) { // L: 8063
				var12 = var0; // L: 8064
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 8065
					var12 = var0 + 1;
				}

				Scene var41 = ReflectionCheck.scene; // L: 8066
				CollisionMap var14 = Client.collisionMaps[var0]; // L: 8067
				ObjectComposition var15 = VarpDefinition.getObjectDefinition(var4); // L: 8069
				int var16;
				int var17;
				if (var5 != 1 && var5 != 3) { // L: 8072
					var16 = var15.sizeX; // L: 8077
					var17 = var15.sizeY; // L: 8078
				} else {
					var16 = var15.sizeY; // L: 8073
					var17 = var15.sizeX; // L: 8074
				}

				int var18;
				int var19;
				if (var16 + var2 <= 104) { // L: 8084
					var18 = (var16 >> 1) + var2; // L: 8085
					var19 = var2 + (var16 + 1 >> 1); // L: 8086
				} else {
					var18 = var2; // L: 8089
					var19 = var2 + 1; // L: 8090
				}

				int var20;
				int var21;
				if (var3 + var17 <= 104) { // L: 8092
					var20 = var3 + (var17 >> 1); // L: 8093
					var21 = var3 + (var17 + 1 >> 1); // L: 8094
				} else {
					var20 = var3; // L: 8097
					var21 = var3 + 1; // L: 8098
				}

				int[][] var22 = Tiles.Tiles_heights[var12]; // L: 8100
				int var23 = var22[var19][var21] + var22[var18][var20] + var22[var19][var20] + var22[var18][var21] >> 2; // L: 8101
				int var24 = (var2 << 7) + (var16 << 6); // L: 8102
				int var25 = (var3 << 7) + (var17 << 6); // L: 8103
				long var26 = GameEngine.calculateTag(var2, var3, 2, var15.int1 == 0, var4); // L: 8104
				int var28 = (var5 << 6) + var6; // L: 8105
				if (var15.int3 == 1) { // L: 8106
					var28 += 256;
				}

				Object var36;
				if (var6 == 22) { // L: 8107
					if (var15.animationId == -1 && var15.transforms == null) { // L: 8109
						var36 = var15.getModel(22, var5, var22, var24, var23, var25);
					} else {
						var36 = new DynamicObject(var4, 22, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8110
					}

					var41.newGroundObject(var0, var2, var3, var23, (Renderable)var36, var26, var28); // L: 8111
					if (var15.interactType == 1) { // L: 8112
						var14.setBlockedByFloorDec(var2, var3);
					}
				} else if (var6 != 10 && var6 != 11) { // L: 8115
					if (var6 >= 12) { // L: 8123
						if (var15.animationId == -1 && var15.transforms == null) { // L: 8125
							var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8126
						}

						var41.method4440(var0, var2, var3, var23, 1, 1, (Renderable)var36, 0, var26, var28); // L: 8127
						if (var15.interactType != 0) { // L: 8128
							var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
						}
					} else if (var6 == 0) { // L: 8131
						if (var15.animationId == -1 && var15.transforms == null) { // L: 8133
							var36 = var15.getModel(0, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, 0, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8134
						}

						var41.newWallObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field1032[var5], 0, var26, var28); // L: 8135
						if (var15.interactType != 0) { // L: 8136
							var14.method4142(var2, var3, var6, var5, var15.boolean1);
						}
					} else if (var6 == 1) { // L: 8139
						if (var15.animationId == -1 && var15.transforms == null) { // L: 8141
							var36 = var15.getModel(1, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, 1, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8142
						}

						var41.newWallObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field1036[var5], 0, var26, var28); // L: 8143
						if (var15.interactType != 0) { // L: 8144
							var14.method4142(var2, var3, var6, var5, var15.boolean1);
						}
					} else {
						int var29;
						if (var6 == 2) { // L: 8147
							var29 = var5 + 1 & 3; // L: 8148
							Object var31;
							Object var37;
							if (var15.animationId == -1 && var15.transforms == null) { // L: 8151
								var37 = var15.getModel(2, var5 + 4, var22, var24, var23, var25); // L: 8152
								var31 = var15.getModel(2, var29, var22, var24, var23, var25); // L: 8153
							} else {
								var37 = new DynamicObject(var4, 2, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8156
								var31 = new DynamicObject(var4, 2, var29, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8157
							}

							var41.newWallObject(var0, var2, var3, var23, (Renderable)var37, (Renderable)var31, Tiles.field1032[var5], Tiles.field1032[var29], var26, var28); // L: 8159
							if (var15.interactType != 0) { // L: 8160
								var14.method4142(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 3) { // L: 8163
							if (var15.animationId == -1 && var15.transforms == null) { // L: 8165
								var36 = var15.getModel(3, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, 3, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8166
							}

							var41.newWallObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field1036[var5], 0, var26, var28); // L: 8167
							if (var15.interactType != 0) { // L: 8168
								var14.method4142(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 9) { // L: 8171
							if (var15.animationId == -1 && var15.transforms == null) { // L: 8173
								var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8174
							}

							var41.method4440(var0, var2, var3, var23, 1, 1, (Renderable)var36, 0, var26, var28); // L: 8175
							if (var15.interactType != 0) { // L: 8176
								var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
							}
						} else if (var6 == 4) { // L: 8179
							if (var15.animationId == -1 && var15.transforms == null) { // L: 8181
								var36 = var15.getModel(4, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8182
							}

							var41.newDecorativeObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field1032[var5], 0, 0, 0, var26, var28); // L: 8183
						} else {
							long var30;
							Object var32;
							if (var6 == 5) { // L: 8186
								var29 = 16; // L: 8187
								var30 = var41.getWallObjectTag(var0, var2, var3); // L: 8188
								if (var30 != 0L) { // L: 8189
									var29 = VarpDefinition.getObjectDefinition(Occluder.Entity_unpackID(var30)).int2;
								}

								if (var15.animationId == -1 && var15.transforms == null) { // L: 8191
									var32 = var15.getModel(4, var5, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8192
								}

								var41.newDecorativeObject(var0, var2, var3, var23, (Renderable)var32, (Renderable)null, Tiles.field1032[var5], 0, var29 * Tiles.field1035[var5], var29 * Tiles.field1029[var5], var26, var28); // L: 8193
							} else if (var6 == 6) { // L: 8196
								var29 = 8; // L: 8197
								var30 = var41.getWallObjectTag(var0, var2, var3); // L: 8198
								if (var30 != 0L) { // L: 8199
									var29 = VarpDefinition.getObjectDefinition(Occluder.Entity_unpackID(var30)).int2 / 2;
								}

								if (var15.animationId == -1 && var15.transforms == null) { // L: 8201
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8202
								}

								var41.newDecorativeObject(var0, var2, var3, var23, (Renderable)var32, (Renderable)null, 256, var5, var29 * Tiles.field1037[var5], var29 * Tiles.field1025[var5], var26, var28); // L: 8203
							} else if (var6 == 7) { // L: 8206
								int var35 = var5 + 2 & 3; // L: 8208
								if (var15.animationId == -1 && var15.transforms == null) { // L: 8209
									var36 = var15.getModel(4, var35 + 4, var22, var24, var23, var25);
								} else {
									var36 = new DynamicObject(var4, 4, var35 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8210
								}

								var41.newDecorativeObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, 256, var35, 0, 0, var26, var28); // L: 8211
							} else if (var6 == 8) { // L: 8214
								var29 = 8; // L: 8215
								var30 = var41.getWallObjectTag(var0, var2, var3); // L: 8216
								if (0L != var30) { // L: 8217
									var29 = VarpDefinition.getObjectDefinition(Occluder.Entity_unpackID(var30)).int2 / 2;
								}

								int var34 = var5 + 2 & 3; // L: 8220
								Object var33;
								if (var15.animationId == -1 && var15.transforms == null) { // L: 8221
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25); // L: 8222
									var33 = var15.getModel(4, var34 + 4, var22, var24, var23, var25); // L: 8223
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8226
									var33 = new DynamicObject(var4, 4, var34 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8227
								}

								var41.newDecorativeObject(var0, var2, var3, var23, (Renderable)var32, (Renderable)var33, 256, var5, var29 * Tiles.field1037[var5], var29 * Tiles.field1025[var5], var26, var28); // L: 8229
							}
						}
					}
				} else {
					if (var15.animationId == -1 && var15.transforms == null) { // L: 8117
						var36 = var15.getModel(10, var5, var22, var24, var23, var25);
					} else {
						var36 = new DynamicObject(var4, 10, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8118
					}

					if (var36 != null) { // L: 8119
						var41.method4440(var0, var2, var3, var23, var16, var17, (Renderable)var36, var6 == 11 ? 256 : 0, var26, var28);
					}

					if (var15.interactType != 0) { // L: 8120
						var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
					}
				}
			}
		}

	} // L: 8234
}
