import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("ab")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lox;Lox;B)I",
		garbageValue = "-84"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.getOfferName().compareTo(var2.getOfferName()); // L: 56
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 60
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 64
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(Llb;I)V",
		garbageValue = "1232954279"
	)
	static final void method6925(class295 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 8011
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var11;
		int var36;
		if (class295.field3208 == var0) { // L: 8012
			var36 = var1.method9099(); // L: 8013
			var3 = var1.readUnsignedByte(); // L: 8014
			var4 = (var3 >> 4 & 7) + class108.field1394; // L: 8015
			var5 = (var3 & 7) + class403.field4504; // L: 8016
			var6 = var1.method9258(); // L: 8017
			var7 = var6 >> 2; // L: 8018
			var8 = var6 & 3; // L: 8019
			var9 = Client.field713[var7]; // L: 8020
			if (var4 >= 0 && var5 >= 0 && var4 < 103 && var5 < 103) { // L: 8021
				if (var9 == 0) { // L: 8022
					WallObject var35 = class173.scene.method4636(BuddyRankComparator.Client_plane, var4, var5); // L: 8023
					if (var35 != null) { // L: 8024
						var11 = class318.Entity_unpackID(var35.tag); // L: 8025
						if (var7 == 2) { // L: 8026
							var35.renderable1 = new DynamicObject(var11, 2, var8 + 4, BuddyRankComparator.Client_plane, var4, var5, var36, false, var35.renderable1); // L: 8027
							var35.renderable2 = new DynamicObject(var11, 2, var8 + 1 & 3, BuddyRankComparator.Client_plane, var4, var5, var36, false, var35.renderable2); // L: 8028
						} else {
							var35.renderable1 = new DynamicObject(var11, var7, var8, BuddyRankComparator.Client_plane, var4, var5, var36, false, var35.renderable1); // L: 8030
						}

						return; // L: 8031
					}
				}

				if (var9 == 1) { // L: 8034
					DecorativeObject var42 = class173.scene.method4637(BuddyRankComparator.Client_plane, var4, var5); // L: 8035
					if (var42 != null) { // L: 8036
						var11 = class318.Entity_unpackID(var42.tag); // L: 8037
						if (var7 != 4 && var7 != 5) { // L: 8038
							if (var7 == 6) { // L: 8039
								var42.renderable1 = new DynamicObject(var11, 4, var8 + 4, BuddyRankComparator.Client_plane, var4, var5, var36, false, var42.renderable1);
							} else if (var7 == 7) { // L: 8040
								var42.renderable1 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, BuddyRankComparator.Client_plane, var4, var5, var36, false, var42.renderable1);
							} else if (var7 == 8) { // L: 8041
								var42.renderable1 = new DynamicObject(var11, 4, var8 + 4, BuddyRankComparator.Client_plane, var4, var5, var36, false, var42.renderable1); // L: 8042
								var42.renderable2 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, BuddyRankComparator.Client_plane, var4, var5, var36, false, var42.renderable2); // L: 8043
							}
						} else {
							var42.renderable1 = new DynamicObject(var11, 4, var8, BuddyRankComparator.Client_plane, var4, var5, var36, false, var42.renderable1);
						}

						return; // L: 8045
					}
				}

				if (var9 == 2) { // L: 8048
					GameObject var43 = class173.scene.getGameObject(BuddyRankComparator.Client_plane, var4, var5); // L: 8049
					if (var7 == 11) { // L: 8050
						var7 = 10;
					}

					if (var43 != null) { // L: 8051
						var43.renderable = new DynamicObject(class318.Entity_unpackID(var43.tag), var7, var8, BuddyRankComparator.Client_plane, var4, var5, var36, false, var43.renderable); // L: 8052
						return; // L: 8053
					}
				}

				if (var9 == 3) { // L: 8056
					GroundObject var44 = class173.scene.getGroundObject(BuddyRankComparator.Client_plane, var4, var5); // L: 8057
					if (var44 != null) { // L: 8058
						var44.renderable = new DynamicObject(class318.Entity_unpackID(var44.tag), 22, var8, BuddyRankComparator.Client_plane, var4, var5, var36, false, var44.renderable); // L: 8059
						return; // L: 8060
					}
				}

				class137.method3136(BuddyRankComparator.Client_plane, var4, var5, var9, var36); // L: 8063
			}

		} else {
			int var38;
			if (class295.field3212 == var0) { // L: 8067
				var36 = var1.method9258(); // L: 8068
				var3 = (var36 >> 4 & 7) + class108.field1394; // L: 8069
				var4 = (var36 & 7) + class403.field4504; // L: 8070
				var5 = var1.method9226(); // L: 8071
				var6 = var1.method9099(); // L: 8072
				var7 = var1.readUnsignedByte(); // L: 8073
				var8 = var7 >> 2; // L: 8074
				var9 = var7 & 3; // L: 8075
				var38 = Client.field713[var8]; // L: 8076
				if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 8077
					ReflectionCheck.method702(BuddyRankComparator.Client_plane, var3, var4, var38, var6, var8, var9, var5, 0, -1); // L: 8078
				}

			} else {
				TileItem var31;
				NodeDeque var32;
				if (class295.field3218 == var0) { // L: 8082
					var36 = var1.method9111(); // L: 8083
					var3 = var1.readUnsignedShort(); // L: 8084
					var4 = var1.method9130(); // L: 8085
					var5 = (var4 >> 4 & 7) + class108.field1394; // L: 8086
					var6 = (var4 & 7) + class403.field4504; // L: 8087
					if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) { // L: 8088
						var32 = Client.groundItems[BuddyRankComparator.Client_plane][var5][var6]; // L: 8089
						if (var32 != null) { // L: 8090
							for (var31 = (TileItem)var32.last(); var31 != null; var31 = (TileItem)var32.previous()) { // L: 8091 8092 8097
								if ((var3 & 32767) == var31.id && var36 == var31.quantity) { // L: 8093
									var31.remove(); // L: 8094
									break;
								}
							}

							if (var32.last() == null) { // L: 8099
								Client.groundItems[BuddyRankComparator.Client_plane][var5][var6] = null;
							}

							class10.updateItemPile(var5, var6); // L: 8100
						}
					}

				} else if (class295.field3210 == var0) { // L: 8105
					var36 = var1.method9226(); // L: 8106
					var3 = (var36 >> 4 & 7) + class108.field1394; // L: 8107
					var4 = (var36 & 7) + class403.field4504; // L: 8108
					var5 = var1.readUnsignedShort(); // L: 8109
					var6 = var1.method9113(); // L: 8110
					var7 = var1.method9113(); // L: 8111
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 8112
						NodeDeque var41 = Client.groundItems[BuddyRankComparator.Client_plane][var3][var4]; // L: 8113
						if (var41 != null) { // L: 8114
							for (TileItem var34 = (TileItem)var41.last(); var34 != null; var34 = (TileItem)var41.previous()) { // L: 8115 8116 8121
								if ((var5 & 32767) == var34.id && var6 == var34.quantity) { // L: 8117
									var34.quantity = var7; // L: 8118
									break;
								}
							}

							class10.updateItemPile(var3, var4); // L: 8123
						}
					}

				} else {
					int var12;
					int var13;
					int var14;
					if (class295.field3215 == var0) { // L: 8128
						var36 = var1.readUnsignedShort(); // L: 8129
						var3 = var1.method9107(); // L: 8130
						var4 = var1.method9130(); // L: 8131
						byte var37 = var1.method9059(); // L: 8132
						var6 = var1.method9130(); // L: 8133
						var7 = (var6 >> 4 & 7) + class108.field1394; // L: 8134
						var8 = (var6 & 7) + class403.field4504; // L: 8135
						var9 = var1.method9226(); // L: 8136
						var38 = var1.method9100(); // L: 8137
						var11 = var1.method9100(); // L: 8138
						byte var39 = var1.method9121(); // L: 8139
						var13 = var1.method9226() * 4; // L: 8140
						var14 = var1.method9130() * 4; // L: 8141
						var5 = var37 + var7; // L: 8142
						var12 = var39 + var8; // L: 8143
						if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var5 >= 0 && var12 >= 0 && var5 < 104 && var12 < 104 && var11 != 65535) { // L: 8144
							var7 = var7 * 128 + 64; // L: 8145
							var8 = var8 * 128 + 64; // L: 8146
							var5 = var5 * 128 + 64; // L: 8147
							var12 = var12 * 128 + 64; // L: 8148
							Projectile var33 = new Projectile(var11, BuddyRankComparator.Client_plane, var7, var8, class291.getTileHeight(var7, var8, BuddyRankComparator.Client_plane) - var14, var36 + Client.cycle, var38 + Client.cycle, var9, var4, var3, var13); // L: 8149
							var33.setDestination(var5, var12, class291.getTileHeight(var5, var12, BuddyRankComparator.Client_plane) - var13, var36 + Client.cycle); // L: 8150
							Client.projectiles.addFirst(var33); // L: 8151
						}

					} else if (class295.field3214 == var0) { // L: 8155
						var36 = var1.readUnsignedByte(); // L: 8156
						var3 = var1.readUnsignedByte(); // L: 8157
						var4 = (var3 >> 4 & 7) + class108.field1394; // L: 8158
						var5 = (var3 & 7) + class403.field4504; // L: 8159
						var6 = var1.readUnsignedShort(); // L: 8160
						if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 8161
							var32 = Client.groundItems[BuddyRankComparator.Client_plane][var4][var5]; // L: 8162
							if (var32 != null) { // L: 8163
								for (var31 = (TileItem)var32.last(); var31 != null; var31 = (TileItem)var32.previous()) { // L: 8164 8165 8170
									if ((var6 & 32767) == var31.id) { // L: 8166
										var31.method2725(var36); // L: 8167
										break;
									}
								}
							}
						}

					} else if (class295.field3211 == var0) { // L: 8176
						var36 = var1.method9258(); // L: 8177
						var3 = (var36 >> 4 & 7) + class108.field1394; // L: 8178
						var4 = (var36 & 7) + class403.field4504; // L: 8179
						var5 = var1.readUnsignedByte(); // L: 8180
						var6 = var5 >> 2; // L: 8181
						var7 = var5 & 3; // L: 8182
						var8 = Client.field713[var6]; // L: 8183
						if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 8184
							ReflectionCheck.method702(BuddyRankComparator.Client_plane, var3, var4, var8, -1, var6, var7, 31, 0, -1); // L: 8185
						}

					} else if (class295.field3213 == var0) { // L: 8189
						var36 = var1.method9258(); // L: 8190
						var3 = var1.readUnsignedByte(); // L: 8191
						var4 = (var3 >> 4 & 7) + class108.field1394; // L: 8192
						var5 = (var3 & 7) + class403.field4504; // L: 8193
						var6 = var1.readUnsignedShort(); // L: 8194
						var7 = var1.method9100(); // L: 8195
						if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 8196
							var4 = var4 * 128 + 64; // L: 8197
							var5 = var5 * 128 + 64; // L: 8198
							GraphicsObject var40 = new GraphicsObject(var6, BuddyRankComparator.Client_plane, var4, var5, class291.getTileHeight(var4, var5, BuddyRankComparator.Client_plane) - var36, var7, Client.cycle); // L: 8199
							Client.graphicsObjects.addFirst(var40); // L: 8200
						}

					} else {
						if (class295.field3217 == var0) { // L: 8204
							byte var2 = var1.method9121(); // L: 8205
							var3 = var1.method9226(); // L: 8206
							var4 = (var3 >> 4 & 7) + class108.field1394; // L: 8207
							var5 = (var3 & 7) + class403.field4504; // L: 8208
							var6 = var1.method9100(); // L: 8209
							var7 = var1.method9099(); // L: 8210
							var8 = var1.readUnsignedShort(); // L: 8211
							var9 = var1.method9100(); // L: 8212
							byte var10 = var1.readByte(); // L: 8213
							var11 = var1.readUnsignedByte(); // L: 8214
							var12 = var11 >> 2; // L: 8215
							var13 = var11 & 3; // L: 8216
							var14 = Client.field713[var12]; // L: 8217
							byte var15 = var1.method9121(); // L: 8218
							byte var16 = var1.readByte(); // L: 8219
							Player var17;
							if (var6 == Client.localPlayerIndex) { // L: 8221
								var17 = class27.localPlayer;
							} else {
								var17 = Client.players[var6]; // L: 8222
							}

							if (var17 != null) { // L: 8223
								ObjectComposition var18 = Language.getObjectDefinition(var7); // L: 8224
								int var19;
								int var20;
								if (var13 != 1 && var13 != 3) { // L: 8227
									var19 = var18.sizeX; // L: 8232
									var20 = var18.sizeY; // L: 8233
								} else {
									var19 = var18.sizeY; // L: 8228
									var20 = var18.sizeX; // L: 8229
								}

								int var21 = var4 + (var19 >> 1); // L: 8235
								int var22 = var4 + (var19 + 1 >> 1); // L: 8236
								int var23 = var5 + (var20 >> 1); // L: 8237
								int var24 = var5 + (var20 + 1 >> 1); // L: 8238
								int[][] var25 = Tiles.Tiles_heights[BuddyRankComparator.Client_plane]; // L: 8239
								int var26 = var25[var22][var24] + var25[var21][var24] + var25[var21][var23] + var25[var22][var23] >> 2; // L: 8240
								int var27 = (var4 << 7) + (var19 << 6); // L: 8241
								int var28 = (var5 << 7) + (var20 << 6); // L: 8242
								Model var29 = var18.getModel(var12, var13, var25, var27, var26, var28); // L: 8243
								if (var29 != null) { // L: 8244
									ReflectionCheck.method702(BuddyRankComparator.Client_plane, var4, var5, var14, -1, 0, 0, 31, var9 + 1, var8 + 1); // L: 8245
									var17.animationCycleStart = var9 + Client.cycle; // L: 8246
									var17.animationCycleEnd = var8 + Client.cycle; // L: 8247
									var17.model0 = var29; // L: 8248
									var17.field1118 = var4 * 128 + var19 * 64; // L: 8249
									var17.field1120 = var5 * 128 + var20 * 64; // L: 8250
									var17.tileHeight2 = var26; // L: 8251
									byte var30;
									if (var2 > var16) { // L: 8252
										var30 = var2; // L: 8253
										var2 = var16; // L: 8254
										var16 = var30; // L: 8255
									}

									if (var10 > var15) { // L: 8257
										var30 = var10; // L: 8258
										var10 = var15; // L: 8259
										var15 = var30; // L: 8260
									}

									var17.minX = var2 + var4; // L: 8262
									var17.maxX = var16 + var4; // L: 8263
									var17.minY = var10 + var5; // L: 8264
									var17.maxY = var15 + var5; // L: 8265
								}
							}
						}

						if (class295.field3206 == var0) { // L: 8269
							var36 = var1.method9111(); // L: 8270
							var3 = var1.method9258(); // L: 8271
							var1.readUnsignedShort(); // L: 8272
							var1.method9130(); // L: 8273
							var4 = var1.readUnsignedShort(); // L: 8274
							var5 = var1.readUnsignedByte(); // L: 8275
							var6 = (var5 >> 4 & 7) + class108.field1394; // L: 8276
							var7 = (var5 & 7) + class403.field4504; // L: 8277
							var1.readUnsignedByte(); // L: 8278
							var1.method9100(); // L: 8279
							if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) { // L: 8280
								var31 = new TileItem(); // L: 8281
								var31.id = var4; // L: 8282
								var31.quantity = var36; // L: 8283
								var31.method2725(var3); // L: 8284
								if (Client.groundItems[BuddyRankComparator.Client_plane][var6][var7] == null) { // L: 8285
									Client.groundItems[BuddyRankComparator.Client_plane][var6][var7] = new NodeDeque(); // L: 8286
								}

								Client.groundItems[BuddyRankComparator.Client_plane][var6][var7].addFirst(var31); // L: 8288
								class10.updateItemPile(var6, var7); // L: 8289
							}

						} else {
							if (class295.field3207 == var0) { // L: 8293
								var36 = var1.method9130(); // L: 8294
								var3 = var36 >> 4 & 15; // L: 8295
								var4 = var36 & 7; // L: 8296
								var5 = var1.method9226(); // L: 8297
								var6 = var1.method9258(); // L: 8298
								var7 = (var6 >> 4 & 7) + class108.field1394; // L: 8299
								var8 = (var6 & 7) + class403.field4504; // L: 8300
								var9 = var1.method9099(); // L: 8301
								if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) { // L: 8302
									var38 = var3 + 1; // L: 8303
									if (class27.localPlayer.pathX[0] >= var7 - var38 && class27.localPlayer.pathX[0] <= var7 + var38 && class27.localPlayer.pathY[0] >= var8 - var38 && class27.localPlayer.pathY[0] <= var38 + var8 && ScriptFrame.clientPreferences.method2571() != 0 && var4 > 0 && Client.soundEffectCount < 50) { // L: 8304 8305
										Client.soundEffectIds[Client.soundEffectCount] = var9; // L: 8306
										Client.queuedSoundEffectLoops[Client.soundEffectCount] = var4; // L: 8307
										Client.queuedSoundEffectDelays[Client.soundEffectCount] = var5; // L: 8308
										Client.soundEffects[Client.soundEffectCount] = null; // L: 8309
										Client.soundLocations[Client.soundEffectCount] = var3 + (var8 << 8) + (var7 << 16); // L: 8310
										++Client.soundEffectCount; // L: 8311
									}
								}
							}

						}
					}
				}
			}
		}
	} // L: 8065 8080 8103 8126 8153 8174 8187 8202 8291 8316
}
