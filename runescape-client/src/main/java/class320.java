import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ls")
public class class320 {
	static {
		int var0 = 0; // L: 9
		int var1 = 0; // L: 10
		class316[] var2 = new class316[]{class316.field3724, class316.field3725}; // L: 14
		class316[] var3 = var2; // L: 16

		for (int var4 = 0; var4 < var3.length; ++var4) { // L: 17
			class316 var5 = var3[var4]; // L: 18
			if (var5.field3726 > var0) { // L: 20
				var0 = var5.field3726;
			}

			if (var5.field3727 > var1) { // L: 21
				var1 = var5.field3727;
			}
		}

	} // L: 25

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "1"
	)
	static final int method6262(int var0, int var1, int var2) {
		int var3 = var0 / var2; // L: 981
		int var4 = var0 & var2 - 1; // L: 982
		int var5 = var1 / var2; // L: 983
		int var6 = var1 & var2 - 1; // L: 984
		int var7 = class32.method470(var3, var5); // L: 985
		int var8 = class32.method470(var3 + 1, var5); // L: 986
		int var9 = class32.method470(var3, var5 + 1); // L: 987
		int var10 = class32.method470(var3 + 1, var5 + 1); // L: 988
		int var12 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1; // L: 991
		int var11 = ((65536 - var12) * var7 >> 16) + (var8 * var12 >> 16); // L: 992
		int var14 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1; // L: 997
		int var13 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16); // L: 998
		int var16 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var6 * 1024 / var2] >> 1; // L: 1003
		int var15 = ((65536 - var16) * var11 >> 16) + (var13 * var16 >> 16); // L: 1004
		return var15; // L: 1006
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-2087814048"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) { // L: 8085
			if (Client.isLowDetail && var0 != ApproximateRouteStrategy.Client_plane) { // L: 8086
				return;
			}

			long var7 = 0L; // L: 8087
			boolean var9 = true; // L: 8088
			boolean var10 = false; // L: 8089
			boolean var11 = false; // L: 8090
			if (var1 == 0) { // L: 8091
				var7 = class139.scene.getWallObjectTag(var0, var2, var3);
			}

			if (var1 == 1) { // L: 8092
				var7 = class139.scene.getDecorativeObjectTag(var0, var2, var3);
			}

			if (var1 == 2) { // L: 8093
				var7 = class139.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) { // L: 8094
				var7 = class139.scene.getGroundObjectTag(var0, var2, var3);
			}

			int var12;
			if (0L != var7) { // L: 8095
				var12 = class139.scene.getObjectFlags(var0, var2, var3, var7); // L: 8096
				int var38 = AttackOption.Entity_unpackID(var7); // L: 8097
				int var39 = var12 & 31; // L: 8098
				int var40 = var12 >> 6 & 3; // L: 8099
				ObjectComposition var13;
				if (var1 == 0) { // L: 8100
					class139.scene.removeWallObject(var0, var2, var3); // L: 8101
					var13 = InterfaceParent.getObjectDefinition(var38); // L: 8102
					if (var13.interactType != 0) { // L: 8103
						Client.collisionMaps[var0].method4025(var2, var3, var39, var40, var13.boolean1);
					}
				}

				if (var1 == 1) { // L: 8105
					class139.scene.removeDecorativeObject(var0, var2, var3);
				}

				if (var1 == 2) { // L: 8106
					class139.scene.removeGameObject(var0, var2, var3); // L: 8107
					var13 = InterfaceParent.getObjectDefinition(var38); // L: 8108
					if (var2 + var13.sizeX > 103 || var3 + var13.sizeX > 103 || var2 + var13.sizeY > 103 || var3 + var13.sizeY > 103) { // L: 8109
						return;
					}

					if (var13.interactType != 0) { // L: 8110
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var40, var13.boolean1);
					}
				}

				if (var1 == 3) { // L: 8112
					class139.scene.removeGroundObject(var0, var2, var3); // L: 8113
					var13 = InterfaceParent.getObjectDefinition(var38); // L: 8114
					if (var13.interactType == 1) { // L: 8115
						Client.collisionMaps[var0].method4009(var2, var3);
					}
				}
			}

			if (var4 >= 0) { // L: 8118
				var12 = var0; // L: 8119
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 8120
					var12 = var0 + 1;
				}

				Scene var41 = class139.scene; // L: 8121
				CollisionMap var14 = Client.collisionMaps[var0]; // L: 8122
				ObjectComposition var15 = InterfaceParent.getObjectDefinition(var4); // L: 8124
				int var16;
				int var17;
				if (var5 != 1 && var5 != 3) { // L: 8127
					var16 = var15.sizeX; // L: 8132
					var17 = var15.sizeY; // L: 8133
				} else {
					var16 = var15.sizeY; // L: 8128
					var17 = var15.sizeX; // L: 8129
				}

				int var18;
				int var19;
				if (var16 + var2 <= 104) { // L: 8139
					var18 = (var16 >> 1) + var2; // L: 8140
					var19 = var2 + (var16 + 1 >> 1); // L: 8141
				} else {
					var18 = var2; // L: 8144
					var19 = var2 + 1; // L: 8145
				}

				int var20;
				int var21;
				if (var3 + var17 <= 104) { // L: 8147
					var20 = var3 + (var17 >> 1); // L: 8148
					var21 = var3 + (var17 + 1 >> 1); // L: 8149
				} else {
					var20 = var3; // L: 8152
					var21 = var3 + 1; // L: 8153
				}

				int[][] var22 = Tiles.Tiles_heights[var12]; // L: 8155
				int var23 = var22[var19][var21] + var22[var18][var20] + var22[var19][var20] + var22[var18][var21] >> 2; // L: 8156
				int var24 = (var2 << 7) + (var16 << 6); // L: 8157
				int var25 = (var3 << 7) + (var17 << 6); // L: 8158
				long var26 = SpotAnimationDefinition.calculateTag(var2, var3, 2, var15.int1 == 0, var4); // L: 8159
				int var28 = (var5 << 6) + var6; // L: 8160
				if (var15.int3 == 1) { // L: 8161
					var28 += 256;
				}

				Object var36;
				if (var6 == 22) { // L: 8162
					if (var15.animationId == -1 && var15.transforms == null) { // L: 8164
						var36 = var15.getModel(22, var5, var22, var24, var23, var25);
					} else {
						var36 = new DynamicObject(var4, 22, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8165
					}

					var41.newGroundObject(var0, var2, var3, var23, (Renderable)var36, var26, var28); // L: 8166
					if (var15.interactType == 1) { // L: 8167
						var14.setBlockedByFloorDec(var2, var3);
					}
				} else if (var6 != 10 && var6 != 11) { // L: 8170
					if (var6 >= 12) { // L: 8178
						if (var15.animationId == -1 && var15.transforms == null) { // L: 8180
							var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8181
						}

						var41.method4315(var0, var2, var3, var23, 1, 1, (Renderable)var36, 0, var26, var28); // L: 8182
						if (var15.interactType != 0) { // L: 8183
							var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
						}
					} else if (var6 == 0) { // L: 8186
						if (var15.animationId == -1 && var15.transforms == null) { // L: 8188
							var36 = var15.getModel(0, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, 0, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8189
						}

						var41.newWallObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field999[var5], 0, var26, var28); // L: 8190
						if (var15.interactType != 0) { // L: 8191
							var14.method4002(var2, var3, var6, var5, var15.boolean1);
						}
					} else if (var6 == 1) { // L: 8194
						if (var15.animationId == -1 && var15.transforms == null) { // L: 8196
							var36 = var15.getModel(1, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, 1, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8197
						}

						var41.newWallObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field1000[var5], 0, var26, var28); // L: 8198
						if (var15.interactType != 0) { // L: 8199
							var14.method4002(var2, var3, var6, var5, var15.boolean1);
						}
					} else {
						int var29;
						if (var6 == 2) { // L: 8202
							var29 = var5 + 1 & 3; // L: 8203
							Object var31;
							Object var37;
							if (var15.animationId == -1 && var15.transforms == null) { // L: 8206
								var37 = var15.getModel(2, var5 + 4, var22, var24, var23, var25); // L: 8207
								var31 = var15.getModel(2, var29, var22, var24, var23, var25); // L: 8208
							} else {
								var37 = new DynamicObject(var4, 2, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8211
								var31 = new DynamicObject(var4, 2, var29, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8212
							}

							var41.newWallObject(var0, var2, var3, var23, (Renderable)var37, (Renderable)var31, Tiles.field999[var5], Tiles.field999[var29], var26, var28); // L: 8214
							if (var15.interactType != 0) { // L: 8215
								var14.method4002(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 3) { // L: 8218
							if (var15.animationId == -1 && var15.transforms == null) { // L: 8220
								var36 = var15.getModel(3, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, 3, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8221
							}

							var41.newWallObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field1000[var5], 0, var26, var28); // L: 8222
							if (var15.interactType != 0) { // L: 8223
								var14.method4002(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 9) { // L: 8226
							if (var15.animationId == -1 && var15.transforms == null) { // L: 8228
								var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8229
							}

							var41.method4315(var0, var2, var3, var23, 1, 1, (Renderable)var36, 0, var26, var28); // L: 8230
							if (var15.interactType != 0) { // L: 8231
								var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
							}
						} else if (var6 == 4) { // L: 8234
							if (var15.animationId == -1 && var15.transforms == null) { // L: 8236
								var36 = var15.getModel(4, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8237
							}

							var41.newDecorativeObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field999[var5], 0, 0, 0, var26, var28); // L: 8238
						} else {
							long var30;
							Object var32;
							if (var6 == 5) { // L: 8241
								var29 = 16; // L: 8242
								var30 = var41.getWallObjectTag(var0, var2, var3); // L: 8243
								if (var30 != 0L) { // L: 8244
									var29 = InterfaceParent.getObjectDefinition(AttackOption.Entity_unpackID(var30)).int2;
								}

								if (var15.animationId == -1 && var15.transforms == null) { // L: 8246
									var32 = var15.getModel(4, var5, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8247
								}

								var41.newDecorativeObject(var0, var2, var3, var23, (Renderable)var32, (Renderable)null, Tiles.field999[var5], 0, var29 * Tiles.field991[var5], var29 * Tiles.field1003[var5], var26, var28); // L: 8248
							} else if (var6 == 6) { // L: 8251
								var29 = 8; // L: 8252
								var30 = var41.getWallObjectTag(var0, var2, var3); // L: 8253
								if (0L != var30) { // L: 8254
									var29 = InterfaceParent.getObjectDefinition(AttackOption.Entity_unpackID(var30)).int2 / 2;
								}

								if (var15.animationId == -1 && var15.transforms == null) { // L: 8256
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8257
								}

								var41.newDecorativeObject(var0, var2, var3, var23, (Renderable)var32, (Renderable)null, 256, var5, var29 * Tiles.field993[var5], var29 * Tiles.field1004[var5], var26, var28); // L: 8258
							} else if (var6 == 7) { // L: 8261
								int var35 = var5 + 2 & 3; // L: 8263
								if (var15.animationId == -1 && var15.transforms == null) { // L: 8264
									var36 = var15.getModel(4, var35 + 4, var22, var24, var23, var25);
								} else {
									var36 = new DynamicObject(var4, 4, var35 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8265
								}

								var41.newDecorativeObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, 256, var35, 0, 0, var26, var28); // L: 8266
							} else if (var6 == 8) { // L: 8269
								var29 = 8; // L: 8270
								var30 = var41.getWallObjectTag(var0, var2, var3); // L: 8271
								if (var30 != 0L) { // L: 8272
									var29 = InterfaceParent.getObjectDefinition(AttackOption.Entity_unpackID(var30)).int2 / 2;
								}

								int var34 = var5 + 2 & 3; // L: 8275
								Object var33;
								if (var15.animationId == -1 && var15.transforms == null) { // L: 8276
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25); // L: 8277
									var33 = var15.getModel(4, var34 + 4, var22, var24, var23, var25); // L: 8278
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8281
									var33 = new DynamicObject(var4, 4, var34 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8282
								}

								var41.newDecorativeObject(var0, var2, var3, var23, (Renderable)var32, (Renderable)var33, 256, var5, var29 * Tiles.field993[var5], var29 * Tiles.field1004[var5], var26, var28); // L: 8284
							}
						}
					}
				} else {
					if (var15.animationId == -1 && var15.transforms == null) { // L: 8172
						var36 = var15.getModel(10, var5, var22, var24, var23, var25);
					} else {
						var36 = new DynamicObject(var4, 10, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8173
					}

					if (var36 != null) { // L: 8174
						var41.method4315(var0, var2, var3, var23, var16, var17, (Renderable)var36, var6 == 11 ? 256 : 0, var26, var28);
					}

					if (var15.interactType != 0) { // L: 8175
						var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
					}
				}
			}
		}

	} // L: 8289
}
