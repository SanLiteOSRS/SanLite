import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("World")
public class World {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -962516855
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 2009368915
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("ap")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("aa")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -5014477
	)
	@Export("id")
	int id;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -734076159
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -272827429
	)
	@Export("population")
	int population;
	@ObfuscatedName("an")
	@Export("host")
	String host;
	@ObfuscatedName("ar")
	@Export("activity")
	String activity;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1366935941
	)
	@Export("location")
	int location;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1816726787
	)
	@Export("index")
	int index;
	@ObfuscatedName("am")
	String field847;

	static {
		World_count = 0; // L: 14
		World_listCount = 0; // L: 15
		World_sortOption2 = new int[]{1, 1, 1, 1}; // L: 16
		World_sortOption1 = new int[]{0, 1, 2, 3}; // L: 17
	}

	World() {
	} // L: 28

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (class510.field5087.rsOrdinal() & this.properties) != 0; // L: 248
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1342373424"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (class510.field5077.rsOrdinal() & this.properties) != 0; // L: 252
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1471748283"
	)
	boolean method1805() {
		return (class510.field5062.rsOrdinal() & this.properties) != 0; // L: 256
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-87"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (class510.field5071.rsOrdinal() & this.properties) != 0; // L: 260
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1678180347"
	)
	boolean method1817() {
		return (class510.field5075.rsOrdinal() & this.properties) != 0; // L: 264
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1233565973"
	)
	boolean method1808() {
		return (class510.field5090.rsOrdinal() & this.properties) != 0; // L: 268
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "879753429"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (class510.field5086.rsOrdinal() & this.properties) != 0; // L: 272
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-6"
	)
	boolean method1809() {
		return (class510.field5091.rsOrdinal() & this.properties) != 0; // L: 276
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	boolean method1843() {
		return (class510.field5069.rsOrdinal() & this.properties) != 0; // L: 280
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "8"
	)
	boolean method1811() {
		return (class510.field5088.rsOrdinal() & this.properties) != 0; // L: 284
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-2141322867"
	)
	public static String method1830(String var0) {
		int var1 = var0.length(); // L: 191
		char[] var2 = new char[var1]; // L: 192
		byte var3 = 2; // L: 193

		for (int var4 = 0; var4 < var1; ++var4) { // L: 194
			char var5 = var0.charAt(var4); // L: 195
			if (var3 == 0) { // L: 196
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) { // L: 197
				var5 = SceneTilePaint.method4921(var5);
			}

			if (Character.isLetter(var5)) { // L: 198
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') { // L: 199
				if (Character.isSpaceChar(var5)) { // L: 200
					if (var3 != 2) { // L: 201
						var3 = 1;
					}
				} else {
					var3 = 1; // L: 203
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5; // L: 204
		}

		return new String(var2); // L: 206
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(Lls;I)V",
		garbageValue = "681545140"
	)
	static final void method1806(class295 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 8038
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		if (class295.field3212 == var0) { // L: 8039
			var2 = var1.method9114(); // L: 8040
			var3 = var1.method9115(); // L: 8041
			var4 = var1.readUnsignedByte(); // L: 8042
			var5 = (var4 >> 4 & 7) + ObjectSound.field855; // L: 8043
			var6 = (var4 & 7) + class125.field1499; // L: 8044
			var7 = var1.method9101(); // L: 8045
			if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) { // L: 8046
				NodeDeque var45 = Client.groundItems[HealthBar.Client_plane][var5][var6]; // L: 8047
				if (var45 != null) { // L: 8048
					for (TileItem var36 = (TileItem)var45.last(); var36 != null; var36 = (TileItem)var45.previous()) { // L: 8049 8050 8055
						if ((var7 & 32767) == var36.id && var3 == var36.quantity) { // L: 8051
							var36.quantity = var2; // L: 8052
							break;
						}
					}

					class135.updateItemPile(var5, var6); // L: 8057
				}
			}

		} else {
			int var8;
			int var9;
			byte var10;
			int var12;
			int var13;
			if (class295.field3215 == var0) { // L: 8062
				var2 = var1.method9091(); // L: 8063
				var3 = var2 >> 2; // L: 8064
				var4 = var2 & 3; // L: 8065
				var5 = Client.field711[var3]; // L: 8066
				var6 = var1.method9256(); // L: 8067
				var7 = (var6 >> 4 & 7) + ObjectSound.field855; // L: 8068
				var8 = (var6 & 7) + class125.field1499; // L: 8069
				var9 = var1.method9102(); // L: 8070
				var10 = var1.method9078(); // L: 8071
				byte var11 = var1.method9095(); // L: 8072
				var12 = var1.method9100(); // L: 8073
				var13 = var1.method9100(); // L: 8074
				byte var14 = var1.method9096(); // L: 8075
				byte var15 = var1.readByte(); // L: 8076
				int var16 = var1.method9102(); // L: 8077
				Player var17;
				if (var9 == Client.localPlayerIndex) { // L: 8079
					var17 = VarbitComposition.localPlayer;
				} else {
					var17 = Client.players[var9]; // L: 8080
				}

				if (var17 != null) { // L: 8081
					ObjectComposition var18 = WorldMapElement.getObjectDefinition(var13); // L: 8082
					int var19;
					int var20;
					if (var4 != 1 && var4 != 3) { // L: 8085
						var19 = var18.sizeX; // L: 8090
						var20 = var18.sizeY; // L: 8091
					} else {
						var19 = var18.sizeY; // L: 8086
						var20 = var18.sizeX; // L: 8087
					}

					int var21 = var7 + (var19 >> 1); // L: 8093
					int var22 = var7 + (var19 + 1 >> 1); // L: 8094
					int var23 = var8 + (var20 >> 1); // L: 8095
					int var24 = var8 + (var20 + 1 >> 1); // L: 8096
					int[][] var25 = Tiles.Tiles_heights[HealthBar.Client_plane]; // L: 8097
					int var26 = var25[var22][var24] + var25[var21][var24] + var25[var22][var23] + var25[var21][var23] >> 2; // L: 8098
					int var27 = (var7 << 7) + (var19 << 6); // L: 8099
					int var28 = (var8 << 7) + (var20 << 6); // L: 8100
					Model var29 = var18.getModel(var3, var4, var25, var27, var26, var28); // L: 8101
					if (var29 != null) { // L: 8102
						ClientPreferences.method2475(HealthBar.Client_plane, var7, var8, var5, -1, 0, 0, 31, var12 + 1, var16 + 1); // L: 8103
						var17.animationCycleStart = var12 + Client.cycle; // L: 8104
						var17.animationCycleEnd = var16 + Client.cycle; // L: 8105
						var17.model0 = var29; // L: 8106
						var17.field1138 = var7 * 128 + var19 * 64; // L: 8107
						var17.field1140 = var8 * 128 + var20 * 64; // L: 8108
						var17.tileHeight2 = var26; // L: 8109
						byte var30;
						if (var14 > var10) { // L: 8110
							var30 = var14; // L: 8111
							var14 = var10; // L: 8112
							var10 = var30; // L: 8113
						}

						if (var11 > var15) { // L: 8115
							var30 = var11; // L: 8116
							var11 = var15; // L: 8117
							var15 = var30; // L: 8118
						}

						var17.minX = var7 + var14; // L: 8120
						var17.maxX = var10 + var7; // L: 8121
						var17.minY = var11 + var8; // L: 8122
						var17.maxY = var15 + var8; // L: 8123
					}
				}
			}

			if (class295.field3208 == var0) { // L: 8127
				var2 = var1.method9256(); // L: 8128
				var3 = (var2 >> 4 & 7) + ObjectSound.field855; // L: 8129
				var4 = (var2 & 7) + class125.field1499; // L: 8130
				var5 = var1.readUnsignedShort(); // L: 8131
				var6 = var1.method9256(); // L: 8132
				var7 = var1.method9101(); // L: 8133
				if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 8134
					var3 = var3 * 128 + 64; // L: 8135
					var4 = var4 * 128 + 64; // L: 8136
					GraphicsObject var44 = new GraphicsObject(var7, HealthBar.Client_plane, var3, var4, class18.getTileHeight(var3, var4, HealthBar.Client_plane) - var6, var5, Client.cycle); // L: 8137
					Client.graphicsObjects.addFirst(var44); // L: 8138
				}

			} else {
				int var40;
				if (class295.field3216 == var0) { // L: 8142
					var2 = var1.method9091(); // L: 8143
					var3 = var1.method9256(); // L: 8144
					var4 = var3 >> 2; // L: 8145
					var5 = var3 & 3; // L: 8146
					var6 = Client.field711[var4]; // L: 8147
					var7 = var1.method9102(); // L: 8148
					var8 = var1.method9093(); // L: 8149
					var9 = (var8 >> 4 & 7) + ObjectSound.field855; // L: 8150
					var40 = (var8 & 7) + class125.field1499; // L: 8151
					if (var9 >= 0 && var40 >= 0 && var9 < 104 && var40 < 104) { // L: 8152
						ClientPreferences.method2475(HealthBar.Client_plane, var9, var40, var6, var7, var4, var5, var2, 0, -1); // L: 8153
					}

				} else {
					int var41;
					if (class295.field3209 == var0) { // L: 8157
						var2 = var1.method9256(); // L: 8158
						var3 = var2 >> 2; // L: 8159
						var4 = var2 & 3; // L: 8160
						var5 = Client.field711[var3]; // L: 8161
						var6 = var1.method9100(); // L: 8162
						var7 = var1.method9256(); // L: 8163
						var8 = (var7 >> 4 & 7) + ObjectSound.field855; // L: 8164
						var9 = (var7 & 7) + class125.field1499; // L: 8165
						if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) { // L: 8166
							if (var5 == 0) { // L: 8167
								WallObject var35 = class130.scene.method4547(HealthBar.Client_plane, var8, var9); // L: 8168
								if (var35 != null) { // L: 8169
									var41 = InvDefinition.Entity_unpackID(var35.tag); // L: 8170
									if (var3 == 2) { // L: 8171
										var35.renderable1 = new DynamicObject(var41, 2, var4 + 4, HealthBar.Client_plane, var8, var9, var6, false, var35.renderable1); // L: 8172
										var35.renderable2 = new DynamicObject(var41, 2, var4 + 1 & 3, HealthBar.Client_plane, var8, var9, var6, false, var35.renderable2); // L: 8173
									} else {
										var35.renderable1 = new DynamicObject(var41, var3, var4, HealthBar.Client_plane, var8, var9, var6, false, var35.renderable1); // L: 8175
									}

									return; // L: 8176
								}
							}

							if (var5 == 1) { // L: 8179
								DecorativeObject var46 = class130.scene.method4548(HealthBar.Client_plane, var8, var9); // L: 8180
								if (var46 != null) { // L: 8181
									var41 = InvDefinition.Entity_unpackID(var46.tag); // L: 8182
									if (var3 != 4 && var3 != 5) { // L: 8183
										if (var3 == 6) { // L: 8184
											var46.renderable1 = new DynamicObject(var41, 4, var4 + 4, HealthBar.Client_plane, var8, var9, var6, false, var46.renderable1);
										} else if (var3 == 7) { // L: 8185
											var46.renderable1 = new DynamicObject(var41, 4, (var4 + 2 & 3) + 4, HealthBar.Client_plane, var8, var9, var6, false, var46.renderable1);
										} else if (var3 == 8) { // L: 8186
											var46.renderable1 = new DynamicObject(var41, 4, var4 + 4, HealthBar.Client_plane, var8, var9, var6, false, var46.renderable1); // L: 8187
											var46.renderable2 = new DynamicObject(var41, 4, (var4 + 2 & 3) + 4, HealthBar.Client_plane, var8, var9, var6, false, var46.renderable2); // L: 8188
										}
									} else {
										var46.renderable1 = new DynamicObject(var41, 4, var4, HealthBar.Client_plane, var8, var9, var6, false, var46.renderable1);
									}

									return; // L: 8190
								}
							}

							if (var5 == 2) { // L: 8193
								GameObject var47 = class130.scene.getGameObject(HealthBar.Client_plane, var8, var9); // L: 8194
								if (var3 == 11) { // L: 8195
									var3 = 10;
								}

								if (var47 != null) { // L: 8196
									var47.renderable = new DynamicObject(InvDefinition.Entity_unpackID(var47.tag), var3, var4, HealthBar.Client_plane, var8, var9, var6, false, var47.renderable); // L: 8197
									return; // L: 8198
								}
							}

							if (var5 == 3) { // L: 8201
								GroundObject var48 = class130.scene.getGroundObject(HealthBar.Client_plane, var8, var9); // L: 8202
								if (var48 != null) { // L: 8203
									var48.renderable = new DynamicObject(InvDefinition.Entity_unpackID(var48.tag), 22, var4, HealthBar.Client_plane, var8, var9, var6, false, var48.renderable); // L: 8204
									return; // L: 8205
								}
							}

							class460.method8320(HealthBar.Client_plane, var8, var9, var5, var6); // L: 8208
						}

					} else {
						TileItem var32;
						if (class295.field3213 == var0) { // L: 8212
							var1.method9091(); // L: 8213
							var2 = var1.method9091(); // L: 8214
							var3 = (var2 >> 4 & 7) + ObjectSound.field855; // L: 8215
							var4 = (var2 & 7) + class125.field1499; // L: 8216
							var5 = var1.readUnsignedByte(); // L: 8217
							var6 = var1.readInt(); // L: 8218
							var1.method9102(); // L: 8219
							var1.method9100(); // L: 8220
							var1.method9091(); // L: 8221
							var7 = var1.readUnsignedShort(); // L: 8222
							if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 8223
								var32 = new TileItem(); // L: 8224
								var32.id = var7; // L: 8225
								var32.quantity = var6; // L: 8226
								var32.method2674(var5); // L: 8227
								if (Client.groundItems[HealthBar.Client_plane][var3][var4] == null) { // L: 8228
									Client.groundItems[HealthBar.Client_plane][var3][var4] = new NodeDeque(); // L: 8229
								}

								Client.groundItems[HealthBar.Client_plane][var3][var4].addFirst(var32); // L: 8231
								class135.updateItemPile(var3, var4); // L: 8232
							}

						} else if (class295.field3218 == var0) { // L: 8236
							var2 = var1.readUnsignedByte(); // L: 8237
							var3 = (var2 >> 4 & 7) + ObjectSound.field855; // L: 8238
							var4 = (var2 & 7) + class125.field1499; // L: 8239
							var5 = var1.method9256(); // L: 8240
							var6 = var5 >> 2; // L: 8241
							var7 = var5 & 3; // L: 8242
							var8 = Client.field711[var6]; // L: 8243
							if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 8244
								ClientPreferences.method2475(HealthBar.Client_plane, var3, var4, var8, -1, var6, var7, 31, 0, -1); // L: 8245
							}

						} else {
							NodeDeque var31;
							if (class295.field3217 == var0) { // L: 8249
								var2 = var1.method9102(); // L: 8250
								var3 = var1.method9114(); // L: 8251
								var4 = var1.readUnsignedByte(); // L: 8252
								var5 = (var4 >> 4 & 7) + ObjectSound.field855; // L: 8253
								var6 = (var4 & 7) + class125.field1499; // L: 8254
								if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) { // L: 8255
									var31 = Client.groundItems[HealthBar.Client_plane][var5][var6]; // L: 8256
									if (var31 != null) { // L: 8257
										for (var32 = (TileItem)var31.last(); var32 != null; var32 = (TileItem)var31.previous()) { // L: 8258 8259 8264
											if ((var2 & 32767) == var32.id && var3 == var32.quantity) { // L: 8260
												var32.remove(); // L: 8261
												break;
											}
										}

										if (var31.last() == null) { // L: 8266
											Client.groundItems[HealthBar.Client_plane][var5][var6] = null;
										}

										class135.updateItemPile(var5, var6); // L: 8267
									}
								}

							} else {
								if (class295.field3214 == var0) { // L: 8272
									var2 = var1.method9091(); // L: 8273
									var3 = (var2 >> 4 & 7) + ObjectSound.field855; // L: 8274
									var4 = (var2 & 7) + class125.field1499; // L: 8275
									var5 = var1.method9093(); // L: 8276
									var6 = var5 >> 4 & 15; // L: 8277
									var7 = var5 & 7; // L: 8278
									var8 = var1.readUnsignedByte(); // L: 8279
									var9 = var1.method9102(); // L: 8280
									if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 8281
										var40 = var6 + 1; // L: 8282
										if (VarbitComposition.localPlayer.pathX[0] >= var3 - var40 && VarbitComposition.localPlayer.pathX[0] <= var40 + var3 && VarbitComposition.localPlayer.pathY[0] >= var4 - var40 && VarbitComposition.localPlayer.pathY[0] <= var40 + var4 && class449.clientPreferences.method2554() != 0 && var7 > 0 && Client.soundEffectCount < 50) { // L: 8283 8284
											Client.soundEffectIds[Client.soundEffectCount] = var9; // L: 8285
											Client.queuedSoundEffectLoops[Client.soundEffectCount] = var7; // L: 8286
											Client.queuedSoundEffectDelays[Client.soundEffectCount] = var8; // L: 8287
											Client.soundEffects[Client.soundEffectCount] = null; // L: 8288
											Client.soundLocations[Client.soundEffectCount] = var6 + (var4 << 8) + (var3 << 16); // L: 8289
											++Client.soundEffectCount; // L: 8290
										}
									}
								}

								int var42;
								if (class295.field3211 == var0) { // L: 8295
									var2 = var1.method9101(); // L: 8296
									var3 = var1.readUnsignedShort(); // L: 8297
									byte var37 = var1.method9096(); // L: 8298
									var5 = var1.method9256(); // L: 8299
									var6 = var1.method9108(); // L: 8300
									byte var39 = var1.readByte(); // L: 8301
									var8 = var1.method9091() * 4; // L: 8302
									var9 = var1.method9256(); // L: 8303
									var40 = var1.method9093() * 4; // L: 8304
									var41 = var1.method9109(); // L: 8305
									var12 = var1.readUnsignedByte(); // L: 8306
									var13 = (var12 >> 4 & 7) + ObjectSound.field855; // L: 8307
									var42 = (var12 & 7) + class125.field1499; // L: 8308
									int var43 = var1.method9102(); // L: 8309
									var4 = var37 + var13; // L: 8310
									var7 = var39 + var42; // L: 8311
									if (var13 >= 0 && var42 >= 0 && var13 < 104 && var42 < 104 && var4 >= 0 && var7 >= 0 && var4 < 104 && var7 < 104 && var43 != 65535) { // L: 8312
										var13 = var13 * 128 + 64; // L: 8313
										var42 = var42 * 128 + 64; // L: 8314
										var4 = var4 * 128 + 64; // L: 8315
										var7 = var7 * 128 + 64; // L: 8316
										Projectile var34 = new Projectile(var43, HealthBar.Client_plane, var13, var42, class18.getTileHeight(var13, var42, HealthBar.Client_plane) - var8, var2 + Client.cycle, var3 + Client.cycle, var5, var9, var41, var6, var40); // L: 8317
										var34.setDestination(var4, var7, class18.getTileHeight(var4, var7, HealthBar.Client_plane) - var40, var2 + Client.cycle); // L: 8318
										Client.projectiles.addFirst(var34); // L: 8319
									}

								} else if (class295.field3207 == var0) { // L: 8323
									var2 = var1.method9100(); // L: 8324
									var3 = var1.method9091(); // L: 8325
									var4 = (var3 >> 4 & 7) + ObjectSound.field855; // L: 8326
									var5 = (var3 & 7) + class125.field1499; // L: 8327
									byte var38 = var1.method9096(); // L: 8328
									var7 = var1.method9109(); // L: 8329
									var8 = var1.method9091(); // L: 8330
									var9 = var1.method9102(); // L: 8331
									var10 = var1.method9078(); // L: 8332
									var41 = var1.method9256() * 4; // L: 8333
									var12 = var1.method9091(); // L: 8334
									var13 = var1.method9091() * 4; // L: 8335
									var42 = var1.readUnsignedShort(); // L: 8336
									var40 = var10 + var4; // L: 8337
									var6 = var38 + var5; // L: 8338
									if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var40 >= 0 && var6 >= 0 && var40 < 104 && var6 < 104 && var2 != 65535) { // L: 8339
										var4 = var4 * 128 + 64; // L: 8340
										var5 = var5 * 128 + 64; // L: 8341
										var40 = var40 * 128 + 64; // L: 8342
										var6 = var6 * 128 + 64; // L: 8343
										Projectile var33 = new Projectile(var2, HealthBar.Client_plane, var4, var5, class18.getTileHeight(var4, var5, HealthBar.Client_plane) - var13, var42 + Client.cycle, var9 + Client.cycle, var8, var12, var7, var41); // L: 8344
										var33.setDestination(var40, var6, class18.getTileHeight(var40, var6, HealthBar.Client_plane) - var41, var42 + Client.cycle); // L: 8345
										Client.projectiles.addFirst(var33); // L: 8346
									}

								} else if (class295.field3210 == var0) { // L: 8350
									var2 = var1.readUnsignedByte(); // L: 8351
									var3 = (var2 >> 4 & 7) + ObjectSound.field855; // L: 8352
									var4 = (var2 & 7) + class125.field1499; // L: 8353
									var5 = var1.method9093(); // L: 8354
									var6 = var1.method9100(); // L: 8355
									if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 8356
										var31 = Client.groundItems[HealthBar.Client_plane][var3][var4]; // L: 8357
										if (var31 != null) { // L: 8358
											for (var32 = (TileItem)var31.last(); var32 != null; var32 = (TileItem)var31.previous()) { // L: 8359 8360 8365
												if ((var6 & 32767) == var32.id) { // L: 8361
													var32.method2674(var5); // L: 8362
													break;
												}
											}
										}
									}

								}
							}
						}
					}
				}
			}
		}
	} // L: 8060 8140 8155 8210 8234 8247 8270 8321 8348 8369 8371
}
