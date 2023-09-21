import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 155436271
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -140487037
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1444741107
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1939662075
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1536780987
	)
	@Export("type")
	int type;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1816592861
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 111975105
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1231135201
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1514526569
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -868912655
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1093592635
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 556028659
	)
	int field2680;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -288941295
	)
	int field2669;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 882122285
	)
	int field2685;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2140217143
	)
	int field2683;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2040444371
	)
	int field2684;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 164362021
	)
	int field2678;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 272946227
	)
	int field2686;

	Occluder() {
	} // L: 23

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-104"
	)
	static int method4859(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 109
			var1 /= 2;
		}

		if (var2 > 192) { // L: 110
			var1 /= 2;
		}

		if (var2 > 217) { // L: 111
			var1 /= 2;
		}

		if (var2 > 243) { // L: 112
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 113
		return var3; // L: 114
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1093816432"
	)
	static final void method4858() {
		class193.method3644(false); // L: 6103
		Client.field588 = 0; // L: 6104
		boolean var0 = true; // L: 6105

		int var1;
		for (var1 = 0; var1 < class345.regionLandArchives.length; ++var1) { // L: 6106
			if (HorizontalAlignment.regionMapArchiveIds[var1] != -1 && class345.regionLandArchives[var1] == null) { // L: 6107 6108
				class345.regionLandArchives[var1] = class198.archive9.takeFile(HorizontalAlignment.regionMapArchiveIds[var1], 0); // L: 6109
				if (class345.regionLandArchives[var1] == null) { // L: 6110
					var0 = false; // L: 6111
					++Client.field588; // L: 6112
				}
			}

			if (WorldMapIcon_0.regionLandArchiveIds[var1] != -1 && class201.regionMapArchives[var1] == null) { // L: 6116 6117
				class201.regionMapArchives[var1] = class198.archive9.takeFileEncrypted(WorldMapIcon_0.regionLandArchiveIds[var1], 0, class178.xteaKeys[var1]); // L: 6118
				if (class201.regionMapArchives[var1] == null) { // L: 6119
					var0 = false; // L: 6120
					++Client.field588; // L: 6121
				}
			}
		}

		if (!var0) { // L: 6126
			Client.field545 = 1; // L: 6127
		} else {
			Client.field590 = 0; // L: 6130
			var0 = true; // L: 6131

			int var3;
			int var4;
			for (var1 = 0; var1 < class345.regionLandArchives.length; ++var1) { // L: 6132
				byte[] var17 = class201.regionMapArchives[var1]; // L: 6133
				if (var17 != null) { // L: 6134
					var3 = (class152.regions[var1] >> 8) * 64 - class20.baseX * 64; // L: 6135
					var4 = (class152.regions[var1] & 255) * 64 - class19.baseY * 64; // L: 6136
					if (Client.isInInstance) { // L: 6137
						var3 = 10; // L: 6138
						var4 = 10; // L: 6139
					}

					var0 &= class208.method3846(var17, var3, var4); // L: 6141
				}
			}

			if (!var0) { // L: 6144
				Client.field545 = 2; // L: 6145
			} else {
				if (Client.field545 != 0) { // L: 6148
					class427.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				class313.method5891(); // L: 6149
				class10.scene.clear(); // L: 6150

				for (var1 = 0; var1 < 4; ++var1) { // L: 6151
					Client.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) { // L: 6152
					for (var2 = 0; var2 < 104; ++var2) { // L: 6153
						for (var3 = 0; var3 < 104; ++var3) { // L: 6154
							Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 6155
						}
					}
				}

				class313.method5891(); // L: 6159
				class185.method3598(); // L: 6160
				var1 = class345.regionLandArchives.length; // L: 6161
				SoundCache.method866(); // L: 6162
				class193.method3644(true); // L: 6163
				int var5;
				if (!Client.isInInstance) { // L: 6164
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) { // L: 6165
						var3 = (class152.regions[var2] >> 8) * 64 - class20.baseX * 64; // L: 6166
						var4 = (class152.regions[var2] & 255) * 64 - class19.baseY * 64; // L: 6167
						var16 = class345.regionLandArchives[var2]; // L: 6168
						if (var16 != null) { // L: 6169
							class313.method5891(); // L: 6170
							BufferedSource.method8232(var16, var3, var4, class94.field1150 * 8 - 48, class365.field3943 * 8 - 48, Client.collisionMaps); // L: 6171
						}
					}

					for (var2 = 0; var2 < var1; ++var2) { // L: 6174
						var3 = (class152.regions[var2] >> 8) * 64 - class20.baseX * 64; // L: 6175
						var4 = (class152.regions[var2] & 255) * 64 - class19.baseY * 64; // L: 6176
						var16 = class345.regionLandArchives[var2]; // L: 6177
						if (var16 == null && class365.field3943 < 800) { // L: 6178
							class313.method5891(); // L: 6179
							Decimator.method1132(var3, var4, 64, 64); // L: 6180
						}
					}

					class193.method3644(true); // L: 6183

					for (var2 = 0; var2 < var1; ++var2) { // L: 6184
						byte[] var15 = class201.regionMapArchives[var2]; // L: 6185
						if (var15 != null) { // L: 6186
							var4 = (class152.regions[var2] >> 8) * 64 - class20.baseX * 64; // L: 6187
							var5 = (class152.regions[var2] & 255) * 64 - class19.baseY * 64; // L: 6188
							class313.method5891(); // L: 6189
							PacketBuffer.method9143(var15, var4, var5, class10.scene, Client.collisionMaps); // L: 6190
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.isInInstance) { // L: 6194
					int var9;
					int var10;
					int var11;
					for (var2 = 0; var2 < 4; ++var2) { // L: 6195
						class313.method5891(); // L: 6196

						for (var3 = 0; var3 < 13; ++var3) { // L: 6197
							for (var4 = 0; var4 < 13; ++var4) { // L: 6198
								boolean var18 = false; // L: 6199
								var6 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 6200
								if (var6 != -1) { // L: 6201
									var7 = var6 >> 24 & 3; // L: 6202
									var8 = var6 >> 1 & 3; // L: 6203
									var9 = var6 >> 14 & 1023; // L: 6204
									var10 = var6 >> 3 & 2047; // L: 6205
									var11 = (var9 / 8 << 8) + var10 / 8; // L: 6206

									for (int var12 = 0; var12 < class152.regions.length; ++var12) { // L: 6207
										if (class152.regions[var12] == var11 && class345.regionLandArchives[var12] != null) { // L: 6208
											int var13 = (var9 - var3) * 8; // L: 6209
											int var14 = (var10 - var4) * 8; // L: 6210
											UserComparator5.method2902(class345.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14, Client.collisionMaps); // L: 6211
											var18 = true; // L: 6212
											break;
										}
									}
								}

								if (!var18) { // L: 6217
									class4.method16(var2, var3 * 8, var4 * 8); // L: 6218
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) { // L: 6223
						for (var3 = 0; var3 < 13; ++var3) { // L: 6224
							var4 = Client.instanceChunkTemplates[0][var2][var3]; // L: 6225
							if (var4 == -1) { // L: 6226
								Decimator.method1132(var2 * 8, var3 * 8, 8, 8); // L: 6227
							}
						}
					}

					class193.method3644(true); // L: 6231

					for (var2 = 0; var2 < 4; ++var2) { // L: 6232
						class313.method5891(); // L: 6233

						for (var3 = 0; var3 < 13; ++var3) { // L: 6234
							for (var4 = 0; var4 < 13; ++var4) { // L: 6235
								var5 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 6236
								if (var5 != -1) { // L: 6237
									var6 = var5 >> 24 & 3; // L: 6238
									var7 = var5 >> 1 & 3; // L: 6239
									var8 = var5 >> 14 & 1023; // L: 6240
									var9 = var5 >> 3 & 2047; // L: 6241
									var10 = (var8 / 8 << 8) + var9 / 8; // L: 6242

									for (var11 = 0; var11 < class152.regions.length; ++var11) { // L: 6243
										if (class152.regions[var11] == var10 && class201.regionMapArchives[var11] != null) { // L: 6244
											Tiles.method2231(class201.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, class10.scene, Client.collisionMaps); // L: 6245
											break; // L: 6246
										}
									}
								}
							}
						}
					}
				}

				class193.method3644(true); // L: 6254
				class313.method5891(); // L: 6255
				class481.method8542(class10.scene, Client.collisionMaps); // L: 6256
				class193.method3644(true); // L: 6257
				var2 = Tiles.Tiles_minPlane; // L: 6258
				if (var2 > class87.Client_plane) { // L: 6259
					var2 = class87.Client_plane;
				}

				if (var2 < class87.Client_plane - 1) { // L: 6260
					var2 = class87.Client_plane - 1;
				}

				if (Client.isLowDetail) { // L: 6261
					class10.scene.init(Tiles.Tiles_minPlane);
				} else {
					class10.scene.init(0); // L: 6262
				}

				for (var3 = 0; var3 < 104; ++var3) { // L: 6263
					for (var4 = 0; var4 < 104; ++var4) { // L: 6264
						class30.updateItemPile(var3, var4); // L: 6265
					}
				}

				class313.method5891(); // L: 6268
				WorldMapDecoration.method5650(); // L: 6269
				ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 6270
				PacketBufferNode var19;
				if (class159.client.hasFrame()) { // L: 6271
					var19 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3213, Client.packetWriter.isaacCipher); // L: 6273
					var19.packetBuffer.writeInt(1057001181); // L: 6274
					Client.packetWriter.addNode(var19); // L: 6275
				}

				if (!Client.isInInstance) { // L: 6277
					var3 = (class94.field1150 - 6) / 8; // L: 6278
					var4 = (class94.field1150 + 6) / 8; // L: 6279
					var5 = (class365.field3943 - 6) / 8; // L: 6280
					var6 = (class365.field3943 + 6) / 8; // L: 6281

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) { // L: 6282
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) { // L: 6283
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) { // L: 6284
								class198.archive9.loadRegionFromName("m" + var7 + "_" + var8); // L: 6285
								class198.archive9.loadRegionFromName("l" + var7 + "_" + var8); // L: 6286
							}
						}
					}
				}

				DefaultsGroup.method8263(30); // L: 6290
				class313.method5891(); // L: 6291
				BuddyRankComparator.method2933(); // L: 6292
				var19 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3174, Client.packetWriter.isaacCipher); // L: 6293
				Client.packetWriter.addNode(var19); // L: 6294
				class19.method283(); // L: 6295
			}
		}
	} // L: 6128 6146 6296
}
