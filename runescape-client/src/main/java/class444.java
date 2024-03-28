import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rv")
public final class class444 implements Comparable {
	@ObfuscatedName("az")
	Object field4762;
	@ObfuscatedName("ah")
	Object field4761;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = -1978792705490221987L
	)
	long field4760;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = -4296732561949299543L
	)
	long field4763;

	class444(Object var1, Object var2) {
		this.field4762 = var1; // L: 10
		this.field4761 = var2; // L: 11
	} // L: 12

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lrv;I)I",
		garbageValue = "940302158"
	)
	int method8020(class444 var1) {
		if (this.field4763 < var1.field4763) { // L: 15
			return -1;
		} else {
			return this.field4763 > var1.field4763 ? 1 : 0; // L: 16 17
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class444) { // L: 22
			return this.field4761.equals(((class444)var1).field4761);
		} else {
			throw new IllegalArgumentException(); // L: 23
		}
	}

	public int hashCode() {
		return this.field4761.hashCode(); // L: 28
	}

	public int compareTo(Object var1) {
		return this.method8020((class444)var1); // L: 32
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "972835992"
	)
	static final void method8026() {
		UserComparator10.method2915(false); // L: 6100
		Client.field578 = 0; // L: 6101
		boolean var0 = true; // L: 6102

		int var1;
		for (var1 = 0; var1 < class73.field906.length; ++var1) { // L: 6103
			if (class390.field4507[var1] != -1 && class73.field906[var1] == null) { // L: 6104 6105
				class73.field906[var1] = class73.field909.takeFile(class390.field4507[var1], 0); // L: 6106
				if (class73.field906[var1] == null) { // L: 6107
					var0 = false; // L: 6108
					++Client.field578; // L: 6109
				}
			}

			if (Tile.field2599[var1] != -1 && class127.field1528[var1] == null) { // L: 6113 6114
				class127.field1528[var1] = class73.field909.takeFileEncrypted(Tile.field2599[var1], 0, MusicPatchPcmStream.field3569[var1]); // L: 6115
				if (class127.field1528[var1] == null) { // L: 6116
					var0 = false; // L: 6117
					++Client.field578; // L: 6118
				}
			}
		}

		if (!var0) { // L: 6123
			Client.field582 = 1; // L: 6124
		} else {
			Client.field727 = 0; // L: 6127
			var0 = true; // L: 6128

			int var3;
			int var4;
			for (var1 = 0; var1 < class73.field906.length; ++var1) { // L: 6129
				byte[] var17 = class127.field1528[var1]; // L: 6130
				if (var17 != null) { // L: 6131
					var3 = (PcmPlayer.field290[var1] >> 8) * 64 - GrandExchangeOfferOwnWorldComparator.baseX * 64; // L: 6132
					var4 = (PcmPlayer.field290[var1] & 255) * 64 - DevicePcmPlayerProvider.baseY * 64; // L: 6133
					if (Client.isInInstance) { // L: 6134
						var3 = 10; // L: 6135
						var4 = 10; // L: 6136
					}

					var0 &= class30.method426(var17, var3, var4); // L: 6138
				}
			}

			if (!var0) { // L: 6141
				Client.field582 = 2; // L: 6142
			} else {
				if (Client.field582 != 0) { // L: 6145
					WorldMapSectionType.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				class167.method3417(); // L: 6146
				LoginType.scene.clear(); // L: 6147

				for (var1 = 0; var1 < 4; ++var1) { // L: 6148
					Client.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) { // L: 6149
					for (var2 = 0; var2 < 104; ++var2) { // L: 6150
						for (var3 = 0; var3 < 104; ++var3) { // L: 6151
							Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 6152
						}
					}
				}

				class167.method3417(); // L: 6156
				ApproximateRouteStrategy.method1181(); // L: 6157
				var1 = class73.field906.length; // L: 6158
				Canvas.method294(); // L: 6159
				UserComparator10.method2915(true); // L: 6160
				int var5;
				if (!Client.isInInstance) { // L: 6161
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) { // L: 6162
						var3 = (PcmPlayer.field290[var2] >> 8) * 64 - GrandExchangeOfferOwnWorldComparator.baseX * 64; // L: 6163
						var4 = (PcmPlayer.field290[var2] & 255) * 64 - DevicePcmPlayerProvider.baseY * 64; // L: 6164
						var16 = class73.field906[var2]; // L: 6165
						if (var16 != null) { // L: 6166
							class167.method3417(); // L: 6167
							Language.method7192(var16, var3, var4, class19.field85 * 8 - 48, class9.field36 * 8 - 48, Client.collisionMaps); // L: 6168
						}
					}

					for (var2 = 0; var2 < var1; ++var2) { // L: 6171
						var3 = (PcmPlayer.field290[var2] >> 8) * 64 - GrandExchangeOfferOwnWorldComparator.baseX * 64; // L: 6172
						var4 = (PcmPlayer.field290[var2] & 255) * 64 - DevicePcmPlayerProvider.baseY * 64; // L: 6173
						var16 = class73.field906[var2]; // L: 6174
						if (var16 == null && class9.field36 < 800) { // L: 6175
							class167.method3417(); // L: 6176
							SpriteMask.method6248(var3, var4, 64, 64); // L: 6177
						}
					}

					UserComparator10.method2915(true); // L: 6180

					for (var2 = 0; var2 < var1; ++var2) { // L: 6181
						byte[] var15 = class127.field1528[var2]; // L: 6182
						if (var15 != null) { // L: 6183
							var4 = (PcmPlayer.field290[var2] >> 8) * 64 - GrandExchangeOfferOwnWorldComparator.baseX * 64; // L: 6184
							var5 = (PcmPlayer.field290[var2] & 255) * 64 - DevicePcmPlayerProvider.baseY * 64; // L: 6185
							class167.method3417(); // L: 6186
							class60.method1129(var15, var4, var5, LoginType.scene, Client.collisionMaps); // L: 6187
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.isInInstance) { // L: 6191
					int var9;
					int var10;
					int var11;
					for (var2 = 0; var2 < 4; ++var2) { // L: 6192
						class167.method3417(); // L: 6193

						for (var3 = 0; var3 < 13; ++var3) { // L: 6194
							for (var4 = 0; var4 < 13; ++var4) { // L: 6195
								boolean var18 = false; // L: 6196
								var6 = Client.field585[var2][var3][var4]; // L: 6197
								if (var6 != -1) { // L: 6198
									var7 = var6 >> 24 & 3; // L: 6199
									var8 = var6 >> 1 & 3; // L: 6200
									var9 = var6 >> 14 & 1023; // L: 6201
									var10 = var6 >> 3 & 2047; // L: 6202
									var11 = (var9 / 8 << 8) + var10 / 8; // L: 6203

									for (int var12 = 0; var12 < PcmPlayer.field290.length; ++var12) { // L: 6204
										if (PcmPlayer.field290[var12] == var11 && class73.field906[var12] != null) { // L: 6205
											int var13 = (var9 - var3) * 8; // L: 6206
											int var14 = (var10 - var4) * 8; // L: 6207
											class150.method3200(class73.field906[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14, Client.collisionMaps); // L: 6208
											var18 = true; // L: 6209
											break;
										}
									}
								}

								if (!var18) { // L: 6214
									class191.method3716(var2, var3 * 8, var4 * 8); // L: 6215
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) { // L: 6220
						for (var3 = 0; var3 < 13; ++var3) { // L: 6221
							var4 = Client.field585[0][var2][var3]; // L: 6222
							if (var4 == -1) { // L: 6223
								SpriteMask.method6248(var2 * 8, var3 * 8, 8, 8); // L: 6224
							}
						}
					}

					UserComparator10.method2915(true); // L: 6228

					for (var2 = 0; var2 < 4; ++var2) { // L: 6229
						class167.method3417(); // L: 6230

						for (var3 = 0; var3 < 13; ++var3) { // L: 6231
							for (var4 = 0; var4 < 13; ++var4) { // L: 6232
								var5 = Client.field585[var2][var3][var4]; // L: 6233
								if (var5 != -1) { // L: 6234
									var6 = var5 >> 24 & 3; // L: 6235
									var7 = var5 >> 1 & 3; // L: 6236
									var8 = var5 >> 14 & 1023; // L: 6237
									var9 = var5 >> 3 & 2047; // L: 6238
									var10 = (var8 / 8 << 8) + var9 / 8; // L: 6239

									for (var11 = 0; var11 < PcmPlayer.field290.length; ++var11) { // L: 6240
										if (PcmPlayer.field290[var11] == var10 && class127.field1528[var11] != null) { // L: 6241
											Tiles.method2260(class127.field1528[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, LoginType.scene, Client.collisionMaps); // L: 6242
											break; // L: 6243
										}
									}
								}
							}
						}
					}
				}

				UserComparator10.method2915(true); // L: 6251
				class167.method3417(); // L: 6252
				class10.method100(LoginType.scene, Client.collisionMaps); // L: 6253
				UserComparator10.method2915(true); // L: 6254
				var2 = Tiles.Tiles_minPlane; // L: 6255
				if (var2 > class172.Client_plane) { // L: 6256
					var2 = class172.Client_plane;
				}

				if (var2 < class172.Client_plane - 1) { // L: 6257
					var2 = class172.Client_plane - 1;
				}

				if (Client.isLowDetail) { // L: 6258
					LoginType.scene.init(Tiles.Tiles_minPlane);
				} else {
					LoginType.scene.init(0); // L: 6259
				}

				for (var3 = 0; var3 < 104; ++var3) { // L: 6260
					for (var4 = 0; var4 < 104; ++var4) { // L: 6261
						class477.method8529(class172.Client_plane, var3, var4); // L: 6262
					}
				}

				class167.method3417(); // L: 6265
				UserComparator10.method2927(); // L: 6266
				ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 6267
				PacketBufferNode var19;
				if (UrlRequest.client.hasFrame()) { // L: 6268
					var19 = class425.getPacketBufferNode(ClientPacket.field3211, Client.packetWriter.isaacCipher); // L: 6270
					var19.packetBuffer.writeIntME(1057001181); // L: 6271
					Client.packetWriter.addNode(var19); // L: 6272
				}

				if (!Client.isInInstance) { // L: 6274
					var3 = (class19.field85 - 6) / 8; // L: 6275
					var4 = (class19.field85 + 6) / 8; // L: 6276
					var5 = (class9.field36 - 6) / 8; // L: 6277
					var6 = (class9.field36 + 6) / 8; // L: 6278

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) { // L: 6279
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) { // L: 6280
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) { // L: 6281
								class73.field909.loadRegionFromName("m" + var7 + "_" + var8); // L: 6282
								class73.field909.loadRegionFromName("l" + var7 + "_" + var8); // L: 6283
							}
						}
					}
				}

				FaceNormal.method4886(30); // L: 6287
				class167.method3417(); // L: 6288
				class348.method6643(); // L: 6289
				var19 = class425.getPacketBufferNode(ClientPacket.field3255, Client.packetWriter.isaacCipher); // L: 6290
				Client.packetWriter.addNode(var19); // L: 6291
				class11.method103(); // L: 6292
			}
		}
	} // L: 6125 6143 6293
}
