import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
public class class149 extends class140 {
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = 1713776453
	)
	static int field1677;
	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "Lsn;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("aj")
	String field1674;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	final class143 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfo;)V"
	)
	class149(class143 var1) {
		this.this$0 = var1; // L: 229
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "-1979280996"
	)
	void vmethod3361(Buffer var1) {
		this.field1674 = var1.readStringCp1252NullTerminated(); // L: 232
		var1.readInt(); // L: 233
	} // L: 234

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lfi;B)V",
		garbageValue = "29"
	)
	void vmethod3362(ClanSettings var1) {
		var1.name = this.field1674; // L: 237
	} // L: 238

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-740848087"
	)
	static final void method3179(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) { // L: 7976
			if (Client.isLowDetail && var0 != TaskHandler.Client_plane) { // L: 7977
				return;
			}

			long var8 = 0L; // L: 7978
			boolean var10 = true; // L: 7979
			boolean var11 = false; // L: 7980
			boolean var12 = false; // L: 7981
			if (var1 == 0) { // L: 7982
				var8 = class1.scene.getWallObjectTag(var0, var2, var3);
			}

			if (var1 == 1) { // L: 7983
				var8 = class1.scene.getDecorativeObjectTag(var0, var2, var3);
			}

			if (var1 == 2) { // L: 7984
				var8 = class1.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) { // L: 7985
				var8 = class1.scene.getGroundObjectTag(var0, var2, var3);
			}

			int var13;
			if (var8 != 0L) { // L: 7986
				var13 = class1.scene.getObjectFlags(var0, var2, var3, var8); // L: 7987
				int var40 = class279.Entity_unpackID(var8); // L: 7988
				int var41 = var13 & 31; // L: 7989
				int var42 = var13 >> 6 & 3; // L: 7990
				ObjectComposition var14;
				if (var1 == 0) { // L: 7991
					class1.scene.method4414(var0, var2, var3); // L: 7992
					var14 = DecorativeObject.getObjectDefinition(var40); // L: 7993
					if (var14.interactType != 0) { // L: 7994
						Client.collisionMaps[var0].method4136(var2, var3, var41, var42, var14.boolean1);
					}
				}

				if (var1 == 1) { // L: 7996
					class1.scene.method4404(var0, var2, var3);
				}

				if (var1 == 2) { // L: 7997
					class1.scene.removeGameObject(var0, var2, var3); // L: 7998
					var14 = DecorativeObject.getObjectDefinition(var40); // L: 7999
					if (var2 + var14.sizeX > 103 || var3 + var14.sizeX > 103 || var2 + var14.sizeY > 103 || var3 + var14.sizeY > 103) { // L: 8000
						return;
					}

					if (var14.interactType != 0) { // L: 8001
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var14.sizeX, var14.sizeY, var42, var14.boolean1);
					}
				}

				if (var1 == 3) { // L: 8003
					class1.scene.method4406(var0, var2, var3); // L: 8004
					var14 = DecorativeObject.getObjectDefinition(var40); // L: 8005
					if (var14.interactType == 1) { // L: 8006
						Client.collisionMaps[var0].method4120(var2, var3);
					}
				}
			}

			if (var4 >= 0) { // L: 8009
				var13 = var0; // L: 8010
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 8011
					var13 = var0 + 1;
				}

				Scene var43 = class1.scene; // L: 8012
				CollisionMap var15 = Client.collisionMaps[var0]; // L: 8013
				ObjectComposition var16 = DecorativeObject.getObjectDefinition(var4); // L: 8015
				int var17 = var7 >= 0 ? var7 : var16.animationId; // L: 8016
				int var18;
				int var19;
				if (var5 != 1 && var5 != 3) { // L: 8019
					var18 = var16.sizeX; // L: 8024
					var19 = var16.sizeY; // L: 8025
				} else {
					var18 = var16.sizeY; // L: 8020
					var19 = var16.sizeX; // L: 8021
				}

				int var20;
				int var21;
				if (var18 + var2 <= 104) { // L: 8031
					var20 = (var18 >> 1) + var2; // L: 8032
					var21 = var2 + (var18 + 1 >> 1); // L: 8033
				} else {
					var20 = var2; // L: 8036
					var21 = var2 + 1; // L: 8037
				}

				int var22;
				int var23;
				if (var3 + var19 <= 104) { // L: 8039
					var22 = var3 + (var19 >> 1); // L: 8040
					var23 = var3 + (var19 + 1 >> 1); // L: 8041
				} else {
					var22 = var3; // L: 8044
					var23 = var3 + 1; // L: 8045
				}

				int[][] var24 = Tiles.Tiles_heights[var13]; // L: 8047
				int var25 = var24[var20][var22] + var24[var21][var22] + var24[var20][var23] + var24[var21][var23] >> 2; // L: 8048
				int var26 = (var2 << 7) + (var18 << 6); // L: 8049
				int var27 = (var3 << 7) + (var19 << 6); // L: 8050
				long var28 = class103.calculateTag(var2, var3, 2, var16.int1 == 0, var4); // L: 8051
				int var30 = (var5 << 6) + var6; // L: 8052
				if (var16.int3 == 1) { // L: 8053
					var30 += 256;
				}

				Object var38;
				if (var6 == 22) { // L: 8054
					if (var17 == -1 && var16.transforms == null) { // L: 8056
						var38 = var16.getModel(22, var5, var24, var26, var25, var27);
					} else {
						var38 = new DynamicObject(var4, 22, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8057
					}

					var43.newGroundObject(var0, var2, var3, var25, (Renderable)var38, var28, var30); // L: 8058
					if (var16.interactType == 1) { // L: 8059
						var15.setBlockedByFloorDec(var2, var3);
					}
				} else if (var6 != 10 && var6 != 11) { // L: 8062
					if (var6 >= 12) { // L: 8070
						if (var17 == -1 && var16.transforms == null) { // L: 8072
							var38 = var16.getModel(var6, var5, var24, var26, var25, var27);
						} else {
							var38 = new DynamicObject(var4, var6, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8073
						}

						var43.method4532(var0, var2, var3, var25, 1, 1, (Renderable)var38, 0, var28, var30); // L: 8074
						if (var16.interactType != 0) { // L: 8075
							var15.addGameObject(var2, var3, var18, var19, var16.boolean1);
						}
					} else if (var6 == 0) { // L: 8078
						if (var17 == -1 && var16.transforms == null) { // L: 8080
							var38 = var16.getModel(0, var5, var24, var26, var25, var27);
						} else {
							var38 = new DynamicObject(var4, 0, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8081
						}

						var43.newWallObject(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, Tiles.field998[var5], 0, var28, var30); // L: 8082
						if (var16.interactType != 0) { // L: 8083
							var15.method4114(var2, var3, var6, var5, var16.boolean1);
						}
					} else if (var6 == 1) { // L: 8086
						if (var17 == -1 && var16.transforms == null) { // L: 8088
							var38 = var16.getModel(1, var5, var24, var26, var25, var27);
						} else {
							var38 = new DynamicObject(var4, 1, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8089
						}

						var43.newWallObject(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, Tiles.field1006[var5], 0, var28, var30); // L: 8090
						if (var16.interactType != 0) { // L: 8091
							var15.method4114(var2, var3, var6, var5, var16.boolean1);
						}
					} else {
						int var31;
						if (var6 == 2) { // L: 8094
							var31 = var5 + 1 & 3; // L: 8095
							Object var33;
							Object var39;
							if (var17 == -1 && var16.transforms == null) { // L: 8098
								var39 = var16.getModel(2, var5 + 4, var24, var26, var25, var27); // L: 8099
								var33 = var16.getModel(2, var31, var24, var26, var25, var27); // L: 8100
							} else {
								var39 = new DynamicObject(var4, 2, var5 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8103
								var33 = new DynamicObject(var4, 2, var31, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8104
							}

							var43.newWallObject(var0, var2, var3, var25, (Renderable)var39, (Renderable)var33, Tiles.field998[var5], Tiles.field998[var31], var28, var30); // L: 8106
							if (var16.interactType != 0) { // L: 8107
								var15.method4114(var2, var3, var6, var5, var16.boolean1);
							}
						} else if (var6 == 3) { // L: 8110
							if (var17 == -1 && var16.transforms == null) { // L: 8112
								var38 = var16.getModel(3, var5, var24, var26, var25, var27);
							} else {
								var38 = new DynamicObject(var4, 3, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8113
							}

							var43.newWallObject(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, Tiles.field1006[var5], 0, var28, var30); // L: 8114
							if (var16.interactType != 0) { // L: 8115
								var15.method4114(var2, var3, var6, var5, var16.boolean1);
							}
						} else if (var6 == 9) { // L: 8118
							if (var17 == -1 && var16.transforms == null) { // L: 8120
								var38 = var16.getModel(var6, var5, var24, var26, var25, var27);
							} else {
								var38 = new DynamicObject(var4, var6, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8121
							}

							var43.method4532(var0, var2, var3, var25, 1, 1, (Renderable)var38, 0, var28, var30); // L: 8122
							if (var16.interactType != 0) { // L: 8123
								var15.addGameObject(var2, var3, var18, var19, var16.boolean1);
							}
						} else if (var6 == 4) { // L: 8126
							if (var17 == -1 && var16.transforms == null) { // L: 8128
								var38 = var16.getModel(4, var5, var24, var26, var25, var27);
							} else {
								var38 = new DynamicObject(var4, 4, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8129
							}

							var43.newDecorativeObject(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, Tiles.field998[var5], 0, 0, 0, var28, var30); // L: 8130
						} else {
							long var32;
							Object var34;
							if (var6 == 5) { // L: 8133
								var31 = 16; // L: 8134
								var32 = var43.getWallObjectTag(var0, var2, var3); // L: 8135
								if (0L != var32) { // L: 8136
									var31 = DecorativeObject.getObjectDefinition(class279.Entity_unpackID(var32)).int2;
								}

								if (var17 == -1 && var16.transforms == null) { // L: 8138
									var34 = var16.getModel(4, var5, var24, var26, var25, var27);
								} else {
									var34 = new DynamicObject(var4, 4, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8139
								}

								var43.newDecorativeObject(var0, var2, var3, var25, (Renderable)var34, (Renderable)null, Tiles.field998[var5], 0, var31 * Tiles.field1000[var5], var31 * Tiles.field1002[var5], var28, var30); // L: 8140
							} else if (var6 == 6) { // L: 8143
								var31 = 8; // L: 8144
								var32 = var43.getWallObjectTag(var0, var2, var3); // L: 8145
								if (0L != var32) { // L: 8146
									var31 = DecorativeObject.getObjectDefinition(class279.Entity_unpackID(var32)).int2 / 2;
								}

								if (var17 == -1 && var16.transforms == null) { // L: 8148
									var34 = var16.getModel(4, var5 + 4, var24, var26, var25, var27);
								} else {
									var34 = new DynamicObject(var4, 4, var5 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8149
								}

								var43.newDecorativeObject(var0, var2, var3, var25, (Renderable)var34, (Renderable)null, 256, var5, var31 * Tiles.field1003[var5], var31 * Tiles.field1004[var5], var28, var30); // L: 8150
							} else if (var6 == 7) { // L: 8153
								int var37 = var5 + 2 & 3; // L: 8155
								if (var17 == -1 && var16.transforms == null) { // L: 8156
									var38 = var16.getModel(4, var37 + 4, var24, var26, var25, var27);
								} else {
									var38 = new DynamicObject(var4, 4, var37 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8157
								}

								var43.newDecorativeObject(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, 256, var37, 0, 0, var28, var30); // L: 8158
							} else if (var6 == 8) { // L: 8161
								var31 = 8; // L: 8162
								var32 = var43.getWallObjectTag(var0, var2, var3); // L: 8163
								if (0L != var32) { // L: 8164
									var31 = DecorativeObject.getObjectDefinition(class279.Entity_unpackID(var32)).int2 / 2;
								}

								int var36 = var5 + 2 & 3; // L: 8167
								Object var35;
								if (var17 == -1 && var16.transforms == null) { // L: 8168
									var34 = var16.getModel(4, var5 + 4, var24, var26, var25, var27); // L: 8169
									var35 = var16.getModel(4, var36 + 4, var24, var26, var25, var27); // L: 8170
								} else {
									var34 = new DynamicObject(var4, 4, var5 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8173
									var35 = new DynamicObject(var4, 4, var36 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8174
								}

								var43.newDecorativeObject(var0, var2, var3, var25, (Renderable)var34, (Renderable)var35, 256, var5, var31 * Tiles.field1003[var5], var31 * Tiles.field1004[var5], var28, var30); // L: 8176
							}
						}
					}
				} else {
					if (var17 == -1 && var16.transforms == null) { // L: 8064
						var38 = var16.getModel(10, var5, var24, var26, var25, var27);
					} else {
						var38 = new DynamicObject(var4, 10, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8065
					}

					if (var38 != null) { // L: 8066
						var43.method4532(var0, var2, var3, var25, var18, var19, (Renderable)var38, var6 == 11 ? 256 : 0, var28, var30);
					}

					if (var16.interactType != 0) { // L: 8067
						var15.addGameObject(var2, var3, var18, var19, var16.boolean1);
					}
				}
			}
		}

	} // L: 8181

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "(IIIILsn;Llx;I)V",
		garbageValue = "1105906577"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) { // L: 11954
			int var6 = Client.camAngleY & 2047; // L: 11955
			int var7 = var3 * var3 + var2 * var2; // L: 11956
			if (var7 <= 6400) { // L: 11957
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 11958
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 11959
				int var10 = var9 * var2 + var3 * var8 >> 16; // L: 11960
				int var11 = var3 * var9 - var8 * var2 >> 16; // L: 11961
				if (var7 > 2500) {
					var4.method9076(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths); // L: 11962
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2); // L: 11963
				}

			}
		}
	} // L: 11964
}
