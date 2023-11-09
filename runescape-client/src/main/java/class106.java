import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
final class class106 implements class334 {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1891344101
	)
	static int field1352;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lnn;)V"
	)
	class106(Widget var1) {
		this.val$cc = var1; // L: 516
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "5"
	)
	public void vmethod6278() {
		if (this.val$cc != null && this.val$cc.method6767().field3591 != null) { // L: 518
			ScriptEvent var1 = new ScriptEvent(); // L: 519
			var1.method2357(this.val$cc); // L: 520
			var1.setArgs(this.val$cc.method6767().field3591); // L: 521
			FileSystem.method4225().addFirst(var1); // L: 522
		}

	} // L: 524

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1624666505"
	)
	static void method2778(int var0) {
		if (var0 != -1) { // L: 5323
			if (HealthBarDefinition.field1877.method6282(var0)) { // L: 5324
				Widget[] var1 = HealthBarDefinition.field1877.field3568[var0]; // L: 5325

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 5326
					Widget var3 = var1[var2]; // L: 5327
					if (var3.onLoad != null) { // L: 5328
						ScriptEvent var4 = new ScriptEvent(); // L: 5329
						var4.widget = var3; // L: 5330
						var4.args = var3.onLoad; // L: 5331
						class323.runScript(var4, 5000000, 0); // L: 5332
					}
				}

			}
		}
	} // L: 5335

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(Lly;B)V",
		garbageValue = "1"
	)
	static final void method2777(class306 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 8075
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		if (class306.field3233 == var0) { // L: 8076
			var2 = var1.method9302(); // L: 8077
			var3 = var1.method9294(); // L: 8078
			var4 = (var3 >> 4 & 7) + class18.field85; // L: 8079
			var5 = (var3 & 7) + class6.field14; // L: 8080
			var6 = var1.method9294(); // L: 8081
			var7 = var1.method9294(); // L: 8082
			var8 = var7 >> 2; // L: 8083
			var9 = var7 & 3; // L: 8084
			var10 = Client.field563[var8]; // L: 8085
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 8086
				TileItem.method2766(ItemLayer.Client_plane, var4, var5, var10, var2, var8, var9, var6, 0, -1); // L: 8087
			}

		} else {
			TileItem var32;
			if (class306.field3231 == var0) { // L: 8091
				var2 = var1.readUnsignedByte(); // L: 8092
				var3 = (var2 >> 4 & 7) + class18.field85; // L: 8093
				var4 = (var2 & 7) + class6.field14; // L: 8094
				var5 = var1.method9496(); // L: 8095
				var6 = var1.method9304(); // L: 8096
				var1.method9303(); // L: 8097
				var1.method9295(); // L: 8098
				var7 = var1.readInt(); // L: 8099
				var1.method9294(); // L: 8100
				var1.method9303(); // L: 8101
				if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 8102
					var32 = new TileItem(); // L: 8103
					var32.id = var6; // L: 8104
					var32.quantity = var7; // L: 8105
					var32.method2754(var5); // L: 8106
					if (Client.groundItems[ItemLayer.Client_plane][var3][var4] == null) { // L: 8107
						Client.groundItems[ItemLayer.Client_plane][var3][var4] = new NodeDeque(); // L: 8108
					}

					Client.groundItems[ItemLayer.Client_plane][var3][var4].addFirst(var32); // L: 8110
					ClanSettings.updateItemPile(var3, var4); // L: 8111
				}

			} else {
				if (class306.field3226 == var0) { // L: 8115
					var2 = var1.readUnsignedByte(); // L: 8116
					var3 = var2 >> 4 & 15; // L: 8117
					var4 = var2 & 7; // L: 8118
					var5 = var1.method9294(); // L: 8119
					var6 = var1.method9303(); // L: 8120
					var7 = var1.method9294(); // L: 8121
					var8 = (var7 >> 4 & 7) + class18.field85; // L: 8122
					var9 = (var7 & 7) + class6.field14; // L: 8123
					if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) { // L: 8124
						var10 = var3 + 1; // L: 8125
						if (class229.localPlayer.pathX[0] >= var8 - var10 && class229.localPlayer.pathX[0] <= var10 + var8 && class229.localPlayer.pathY[0] >= var9 - var10 && class229.localPlayer.pathY[0] <= var9 + var10 && WorldMapIcon_1.clientPreferences.method2605() != 0 && var4 > 0 && Client.soundEffectCount < 50) { // L: 8126 8127
							Client.soundEffectIds[Client.soundEffectCount] = var6; // L: 8128
							Client.queuedSoundEffectLoops[Client.soundEffectCount] = var4; // L: 8129
							Client.queuedSoundEffectDelays[Client.soundEffectCount] = var5; // L: 8130
							Client.soundEffects[Client.soundEffectCount] = null; // L: 8131
							Client.soundLocations[Client.soundEffectCount] = var3 + (var9 << 8) + (var8 << 16); // L: 8132
							++Client.soundEffectCount; // L: 8133
						}
					}
				}

				if (class306.field3236 == var0) { // L: 8138
					var2 = var1.method9302(); // L: 8139
					var3 = var1.method9317(); // L: 8140
					var4 = var1.method9294(); // L: 8141
					var5 = (var4 >> 4 & 7) + class18.field85; // L: 8142
					var6 = (var4 & 7) + class6.field14; // L: 8143
					var7 = var1.readInt(); // L: 8144
					if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) { // L: 8145
						NodeDeque var48 = Client.groundItems[ItemLayer.Client_plane][var5][var6]; // L: 8146
						if (var48 != null) { // L: 8147
							for (TileItem var36 = (TileItem)var48.last(); var36 != null; var36 = (TileItem)var48.previous()) { // L: 8148 8149 8154
								if ((var2 & 32767) == var36.id && var3 == var36.quantity) { // L: 8150
									var36.quantity = var7; // L: 8151
									break;
								}
							}

							ClanSettings.updateItemPile(var5, var6); // L: 8156
						}
					}

				} else {
					int var11;
					int var12;
					int var13;
					int var14;
					int var15;
					Projectile var35;
					byte var38;
					if (class306.field3235 == var0) { // L: 8161
						var2 = var1.method9295(); // L: 8162
						var38 = var1.method9296(); // L: 8163
						var4 = var1.method9303(); // L: 8164
						var5 = var1.method9294(); // L: 8165
						var6 = var1.method9294() * 4; // L: 8166
						var7 = var1.readUnsignedByte(); // L: 8167
						var8 = (var7 >> 4 & 7) + class18.field85; // L: 8168
						var9 = (var7 & 7) + class6.field14; // L: 8169
						var10 = var1.method9302(); // L: 8170
						var11 = var1.method9489(); // L: 8171
						var12 = var1.method9249(); // L: 8172
						byte var44 = var1.method9297(); // L: 8173
						var14 = var1.method9294() * 4; // L: 8174
						var15 = var1.method9302(); // L: 8175
						var13 = var44 + var8; // L: 8176
						var3 = var38 + var9; // L: 8177
						if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104 && var13 >= 0 && var3 >= 0 && var13 < 104 && var3 < 104 && var10 != 65535) { // L: 8178
							var8 = var8 * 128 + 64; // L: 8179
							var9 = var9 * 128 + 64; // L: 8180
							var13 = var13 * 128 + 64; // L: 8181
							var3 = var3 * 128 + 64; // L: 8182
							var35 = new Projectile(var10, ItemLayer.Client_plane, var8, var9, WorldMapDecorationType.getTileHeight(var8, var9, ItemLayer.Client_plane) - var14, var15 + Client.cycle, var4 + Client.cycle, var2, var5, var11, var12, var6); // L: 8183
							var35.setDestination(var13, var3, WorldMapDecorationType.getTileHeight(var13, var3, ItemLayer.Client_plane) - var6, var15 + Client.cycle); // L: 8184
							Client.projectiles.addFirst(var35); // L: 8185
						}

					} else {
						NodeDeque var31;
						if (class306.field3232 == var0) { // L: 8189
							var2 = var1.method9496(); // L: 8190
							var3 = (var2 >> 4 & 7) + class18.field85; // L: 8191
							var4 = (var2 & 7) + class6.field14; // L: 8192
							var5 = var1.method9302(); // L: 8193
							var6 = var1.method9496(); // L: 8194
							if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 8195
								var31 = Client.groundItems[ItemLayer.Client_plane][var3][var4]; // L: 8196
								if (var31 != null) { // L: 8197
									for (var32 = (TileItem)var31.last(); var32 != null; var32 = (TileItem)var31.previous()) { // L: 8198 8199 8204
										if ((var5 & 32767) == var32.id) { // L: 8200
											var32.method2754(var6); // L: 8201
											break;
										}
									}
								}
							}

						} else {
							if (class306.field3227 == var0) { // L: 8210
								byte var37 = var1.method9296(); // L: 8211
								var38 = var1.method9296(); // L: 8212
								byte var39 = var1.method9297(); // L: 8213
								var5 = var1.method9304(); // L: 8214
								byte var40 = var1.readByte(); // L: 8215
								var7 = var1.method9295(); // L: 8216
								var8 = (var7 >> 4 & 7) + class18.field85; // L: 8217
								var9 = (var7 & 7) + class6.field14; // L: 8218
								var10 = var1.method9303(); // L: 8219
								var11 = var1.method9304(); // L: 8220
								var12 = var1.method9496(); // L: 8221
								var13 = var12 >> 2; // L: 8222
								var14 = var12 & 3; // L: 8223
								var15 = Client.field563[var13]; // L: 8224
								int var16 = var1.method9304(); // L: 8225
								Player var17;
								if (var16 == Client.localPlayerIndex) { // L: 8227
									var17 = class229.localPlayer;
								} else {
									var17 = Client.players[var16]; // L: 8228
								}

								if (var17 != null) { // L: 8229
									ObjectComposition var18 = WorldMapSection2.getObjectDefinition(var10); // L: 8230
									int var19;
									int var20;
									if (var14 != 1 && var14 != 3) { // L: 8233
										var19 = var18.sizeX; // L: 8238
										var20 = var18.sizeY; // L: 8239
									} else {
										var19 = var18.sizeY; // L: 8234
										var20 = var18.sizeX; // L: 8235
									}

									int var21 = var8 + (var19 >> 1); // L: 8241
									int var22 = var8 + (var19 + 1 >> 1); // L: 8242
									int var23 = var9 + (var20 >> 1); // L: 8243
									int var24 = var9 + (var20 + 1 >> 1); // L: 8244
									int[][] var25 = Tiles.Tiles_heights[ItemLayer.Client_plane]; // L: 8245
									int var26 = var25[var22][var24] + var25[var21][var24] + var25[var21][var23] + var25[var22][var23] >> 2; // L: 8246
									int var27 = (var8 << 7) + (var19 << 6); // L: 8247
									int var28 = (var9 << 7) + (var20 << 6); // L: 8248
									Model var29 = var18.getModel(var13, var14, var25, var27, var26, var28); // L: 8249
									if (var29 != null) { // L: 8250
										TileItem.method2766(ItemLayer.Client_plane, var8, var9, var15, -1, 0, 0, 31, var11 + 1, var5 + 1); // L: 8251
										var17.animationCycleStart = var11 + Client.cycle; // L: 8252
										var17.animationCycleEnd = var5 + Client.cycle; // L: 8253
										var17.model0 = var29; // L: 8254
										var17.field1106 = var8 * 128 + var19 * 64; // L: 8255
										var17.field1108 = var9 * 128 + var20 * 64; // L: 8256
										var17.tileHeight2 = var26; // L: 8257
										byte var30;
										if (var39 > var37) { // L: 8258
											var30 = var39; // L: 8259
											var39 = var37; // L: 8260
											var37 = var30; // L: 8261
										}

										if (var40 > var38) { // L: 8263
											var30 = var40; // L: 8264
											var40 = var38; // L: 8265
											var38 = var30; // L: 8266
										}

										var17.minX = var39 + var8; // L: 8268
										var17.maxX = var37 + var8; // L: 8269
										var17.minY = var9 + var40; // L: 8270
										var17.maxY = var9 + var38; // L: 8271
									}
								}
							}

							if (class306.field3237 == var0) { // L: 8275
								var2 = var1.method9496(); // L: 8276
								var3 = (var2 >> 4 & 7) + class18.field85; // L: 8277
								var4 = (var2 & 7) + class6.field14; // L: 8278
								var5 = var1.method9496(); // L: 8279
								var6 = var5 >> 2; // L: 8280
								var7 = var5 & 3; // L: 8281
								var8 = Client.field563[var6]; // L: 8282
								if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 8283
									TileItem.method2766(ItemLayer.Client_plane, var3, var4, var8, -1, var6, var7, 31, 0, -1); // L: 8284
								}

							} else if (class306.field3228 == var0) { // L: 8288
								var2 = var1.method9302(); // L: 8289
								var3 = var1.readUnsignedByte(); // L: 8290
								var4 = (var3 >> 4 & 7) + class18.field85; // L: 8291
								var5 = (var3 & 7) + class6.field14; // L: 8292
								var6 = var1.readUnsignedShort(); // L: 8293
								var7 = var1.method9496() * 4; // L: 8294
								byte var41 = var1.method9298(); // L: 8295
								var9 = var1.method9295(); // L: 8296
								var10 = var1.method9295() * 4; // L: 8297
								var11 = var1.method9304(); // L: 8298
								var12 = var1.method9489(); // L: 8299
								var13 = var1.method9302(); // L: 8300
								var14 = var1.method9251(); // L: 8301
								byte var45 = var1.method9296(); // L: 8302
								var15 = var45 + var4; // L: 8303
								var8 = var41 + var5; // L: 8304
								if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var15 >= 0 && var8 >= 0 && var15 < 104 && var8 < 104 && var11 != 65535) { // L: 8305
									var4 = var4 * 128 + 64; // L: 8306
									var5 = var5 * 128 + 64; // L: 8307
									var15 = var15 * 128 + 64; // L: 8308
									var8 = var8 * 128 + 64; // L: 8309
									var35 = new Projectile(var11, ItemLayer.Client_plane, var4, var5, WorldMapDecorationType.getTileHeight(var4, var5, ItemLayer.Client_plane) - var7, var13 + Client.cycle, var2 + Client.cycle, var9, var6, var12, var14, var10); // L: 8310
									var35.setDestination(var15, var8, WorldMapDecorationType.getTileHeight(var15, var8, ItemLayer.Client_plane) - var10, var13 + Client.cycle); // L: 8311
									Client.projectiles.addFirst(var35); // L: 8312
								}

							} else if (class306.field3225 == var0) { // L: 8316
								var2 = var1.method9489(); // L: 8317
								var3 = var1.method9304(); // L: 8318
								var4 = var1.readUnsignedByte(); // L: 8319
								var5 = var1.method9496(); // L: 8320
								var6 = (var5 >> 4 & 7) + class18.field85; // L: 8321
								var7 = (var5 & 7) + class6.field14; // L: 8322
								var8 = var1.readUnsignedByte() * 4; // L: 8323
								var9 = var1.readUnsignedShort(); // L: 8324
								var10 = var1.method9302(); // L: 8325
								byte var42 = var1.method9296(); // L: 8326
								byte var43 = var1.method9297(); // L: 8327
								var13 = var1.method9294(); // L: 8328
								var14 = var1.method9496() * 4; // L: 8329
								var11 = var42 + var6; // L: 8330
								var12 = var43 + var7; // L: 8331
								if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104 && var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104 && var10 != 65535) { // L: 8332
									var6 = var6 * 128 + 64; // L: 8333
									var7 = var7 * 128 + 64; // L: 8334
									var11 = var11 * 128 + 64; // L: 8335
									var12 = var12 * 128 + 64; // L: 8336
									Projectile var34 = new Projectile(var10, ItemLayer.Client_plane, var6, var7, WorldMapDecorationType.getTileHeight(var6, var7, ItemLayer.Client_plane) - var8, var9 + Client.cycle, var3 + Client.cycle, var13, var4, var2, var14); // L: 8337
									var34.setDestination(var11, var12, WorldMapDecorationType.getTileHeight(var11, var12, ItemLayer.Client_plane) - var14, var9 + Client.cycle); // L: 8338
									Client.projectiles.addFirst(var34); // L: 8339
								}

							} else if (class306.field3230 == var0) { // L: 8343
								var2 = var1.readUnsignedByte(); // L: 8344
								var3 = var2 >> 2; // L: 8345
								var4 = var2 & 3; // L: 8346
								var5 = Client.field563[var3]; // L: 8347
								var6 = var1.method9303(); // L: 8348
								var7 = var1.method9294(); // L: 8349
								var8 = (var7 >> 4 & 7) + class18.field85; // L: 8350
								var9 = (var7 & 7) + class6.field14; // L: 8351
								if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) { // L: 8352
									if (var5 == 0) { // L: 8353
										WallObject var33 = class36.scene.method5346(ItemLayer.Client_plane, var8, var9); // L: 8354
										if (var33 != null) { // L: 8355
											var11 = class232.Entity_unpackID(var33.tag); // L: 8356
											if (var3 == 2) { // L: 8357
												var33.renderable1 = new DynamicObject(var11, 2, var4 + 4, ItemLayer.Client_plane, var8, var9, var6, false, var33.renderable1); // L: 8358
												var33.renderable2 = new DynamicObject(var11, 2, var4 + 1 & 3, ItemLayer.Client_plane, var8, var9, var6, false, var33.renderable2); // L: 8359
											} else {
												var33.renderable1 = new DynamicObject(var11, var3, var4, ItemLayer.Client_plane, var8, var9, var6, false, var33.renderable1); // L: 8361
											}

											return; // L: 8362
										}
									}

									if (var5 == 1) { // L: 8365
										DecorativeObject var47 = class36.scene.method5347(ItemLayer.Client_plane, var8, var9); // L: 8366
										if (var47 != null) { // L: 8367
											var11 = class232.Entity_unpackID(var47.tag); // L: 8368
											if (var3 != 4 && var3 != 5) { // L: 8369
												if (var3 == 6) { // L: 8370
													var47.renderable1 = new DynamicObject(var11, 4, var4 + 4, ItemLayer.Client_plane, var8, var9, var6, false, var47.renderable1);
												} else if (var3 == 7) { // L: 8371
													var47.renderable1 = new DynamicObject(var11, 4, (var4 + 2 & 3) + 4, ItemLayer.Client_plane, var8, var9, var6, false, var47.renderable1);
												} else if (var3 == 8) { // L: 8372
													var47.renderable1 = new DynamicObject(var11, 4, var4 + 4, ItemLayer.Client_plane, var8, var9, var6, false, var47.renderable1); // L: 8373
													var47.renderable2 = new DynamicObject(var11, 4, (var4 + 2 & 3) + 4, ItemLayer.Client_plane, var8, var9, var6, false, var47.renderable2); // L: 8374
												}
											} else {
												var47.renderable1 = new DynamicObject(var11, 4, var4, ItemLayer.Client_plane, var8, var9, var6, false, var47.renderable1);
											}

											return; // L: 8376
										}
									}

									if (var5 == 2) { // L: 8379
										GameObject var49 = class36.scene.getGameObject(ItemLayer.Client_plane, var8, var9); // L: 8380
										if (var3 == 11) { // L: 8381
											var3 = 10;
										}

										if (var49 != null) { // L: 8382
											var49.renderable = new DynamicObject(class232.Entity_unpackID(var49.tag), var3, var4, ItemLayer.Client_plane, var8, var9, var6, false, var49.renderable); // L: 8383
											return; // L: 8384
										}
									}

									if (var5 == 3) { // L: 8387
										GroundObject var50 = class36.scene.getGroundObject(ItemLayer.Client_plane, var8, var9); // L: 8388
										if (var50 != null) { // L: 8389
											var50.renderable = new DynamicObject(class232.Entity_unpackID(var50.tag), 22, var4, ItemLayer.Client_plane, var8, var9, var6, false, var50.renderable); // L: 8390
											return; // L: 8391
										}
									}

									TaskHandler.method4201(ItemLayer.Client_plane, var8, var9, var5, var6); // L: 8394
								}

							} else if (class306.field3234 == var0) { // L: 8398
								var2 = var1.readUnsignedShort(); // L: 8399
								var3 = var1.method9294(); // L: 8400
								var4 = var1.method9303(); // L: 8401
								var5 = var1.method9294(); // L: 8402
								var6 = (var5 >> 4 & 7) + class18.field85; // L: 8403
								var7 = (var5 & 7) + class6.field14; // L: 8404
								if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) { // L: 8405
									var6 = var6 * 128 + 64; // L: 8406
									var7 = var7 * 128 + 64; // L: 8407
									GraphicsObject var46 = new GraphicsObject(var4, ItemLayer.Client_plane, var6, var7, WorldMapDecorationType.getTileHeight(var6, var7, ItemLayer.Client_plane) - var3, var2, Client.cycle); // L: 8408
									Client.graphicsObjects.addFirst(var46); // L: 8409
								}

							} else if (class306.field3229 == var0) { // L: 8413
								var2 = var1.method9318(); // L: 8414
								var3 = var1.readUnsignedByte(); // L: 8415
								var4 = (var3 >> 4 & 7) + class18.field85; // L: 8416
								var5 = (var3 & 7) + class6.field14; // L: 8417
								var6 = var1.method9302(); // L: 8418
								if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 8419
									var31 = Client.groundItems[ItemLayer.Client_plane][var4][var5]; // L: 8420
									if (var31 != null) { // L: 8421
										for (var32 = (TileItem)var31.last(); var32 != null; var32 = (TileItem)var31.previous()) { // L: 8422 8423 8428
											if ((var6 & 32767) == var32.id && var2 == var32.quantity) { // L: 8424
												var32.remove(); // L: 8425
												break;
											}
										}

										if (var31.last() == null) { // L: 8430
											Client.groundItems[ItemLayer.Client_plane][var4][var5] = null;
										}

										ClanSettings.updateItemPile(var4, var5); // L: 8431
									}
								}

							}
						}
					}
				}
			}
		}
	} // L: 8089 8113 8159 8187 8208 8286 8314 8341 8396 8411 8434 8436
}
