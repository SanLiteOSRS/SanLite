import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mz")
public final class class361 {
	@ObfuscatedName("vl")
	@ObfuscatedGetter(
		longValue = -8822464736967125627L
	)
	static long field4359;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -457211441
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2129750678"
	)
	static void method6967() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 314
			Login.currentLoginField = 1; // L: 315
		} else {
			Login.currentLoginField = 0; // L: 318
		}

	} // L: 320

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-116"
	)
	static final void method6965() {
		Projectile.method2173(false); // L: 5984
		Client.field565 = 0; // L: 5985
		boolean var0 = true; // L: 5986

		int var1;
		for (var1 = 0; var1 < class4.regionLandArchives.length; ++var1) { // L: 5987
			if (Renderable.regionMapArchiveIds[var1] != -1 && class4.regionLandArchives[var1] == null) { // L: 5988 5989
				class4.regionLandArchives[var1] = NetCache.field4260.takeFile(Renderable.regionMapArchiveIds[var1], 0); // L: 5990
				if (class4.regionLandArchives[var1] == null) { // L: 5991
					var0 = false; // L: 5992
					++Client.field565; // L: 5993
				}
			}

			if (class217.regionLandArchiveIds[var1] != -1 && class323.regionMapArchives[var1] == null) { // L: 5997 5998
				class323.regionMapArchives[var1] = NetCache.field4260.takeFileEncrypted(class217.regionLandArchiveIds[var1], 0, GrandExchangeOffer.xteaKeys[var1]); // L: 5999
				if (class323.regionMapArchives[var1] == null) { // L: 6000
					var0 = false; // L: 6001
					++Client.field565; // L: 6002
				}
			}
		}

		if (!var0) { // L: 6007
			Client.field744 = 1; // L: 6008
		} else {
			Client.field567 = 0; // L: 6011
			var0 = true; // L: 6012

			int var3;
			int var4;
			for (var1 = 0; var1 < class4.regionLandArchives.length; ++var1) { // L: 6013
				byte[] var17 = class323.regionMapArchives[var1]; // L: 6014
				if (var17 != null) { // L: 6015
					var3 = (MusicPatch.regions[var1] >> 8) * 64 - ParamComposition.baseX * 64; // L: 6016
					var4 = (MusicPatch.regions[var1] & 255) * 64 - Client.baseY * 64; // L: 6017
					if (Client.isInInstance) { // L: 6018
						var3 = 10; // L: 6019
						var4 = 10; // L: 6020
					}

					var0 &= NetFileRequest.method6516(var17, var3, var4); // L: 6022
				}
			}

			if (!var0) { // L: 6025
				Client.field744 = 2; // L: 6026
			} else {
				if (Client.field744 != 0) { // L: 6029
					class165.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				HorizontalAlignment.playPcmPlayers(); // L: 6030
				WorldMapAreaData.scene.clear(); // L: 6031

				for (var1 = 0; var1 < 4; ++var1) { // L: 6032
					Client.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) { // L: 6033
					for (var2 = 0; var2 < 104; ++var2) { // L: 6034
						for (var3 = 0; var3 < 104; ++var3) { // L: 6035
							Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 6036
						}
					}
				}

				HorizontalAlignment.playPcmPlayers(); // L: 6040
				HorizontalAlignment.method3715(); // L: 6041
				var1 = class4.regionLandArchives.length; // L: 6042
				UserComparator4.method2902(); // L: 6043
				Projectile.method2173(true); // L: 6044
				int var5;
				if (!Client.isInInstance) { // L: 6045
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) { // L: 6046
						var3 = (MusicPatch.regions[var2] >> 8) * 64 - ParamComposition.baseX * 64; // L: 6047
						var4 = (MusicPatch.regions[var2] & 255) * 64 - Client.baseY * 64; // L: 6048
						var16 = class4.regionLandArchives[var2]; // L: 6049
						if (var16 != null) { // L: 6050
							HorizontalAlignment.playPcmPlayers(); // L: 6051
							class121.method2992(var16, var3, var4, class303.field3472 * 8 - 48, ScriptFrame.field467 * 8 - 48, Client.collisionMaps); // L: 6052
						}
					}

					for (var2 = 0; var2 < var1; ++var2) { // L: 6055
						var3 = (MusicPatch.regions[var2] >> 8) * 64 - ParamComposition.baseX * 64; // L: 6056
						var4 = (MusicPatch.regions[var2] & 255) * 64 - Client.baseY * 64; // L: 6057
						var16 = class4.regionLandArchives[var2]; // L: 6058
						if (var16 == null && ScriptFrame.field467 < 800) { // L: 6059
							HorizontalAlignment.playPcmPlayers(); // L: 6060
							class14.method182(var3, var4, 64, 64); // L: 6061
						}
					}

					Projectile.method2173(true); // L: 6064

					for (var2 = 0; var2 < var1; ++var2) { // L: 6065
						byte[] var15 = class323.regionMapArchives[var2]; // L: 6066
						if (var15 != null) { // L: 6067
							var4 = (MusicPatch.regions[var2] >> 8) * 64 - ParamComposition.baseX * 64; // L: 6068
							var5 = (MusicPatch.regions[var2] & 255) * 64 - Client.baseY * 64; // L: 6069
							HorizontalAlignment.playPcmPlayers(); // L: 6070
							NetFileRequest.method6517(var15, var4, var5, WorldMapAreaData.scene, Client.collisionMaps); // L: 6071
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.isInInstance) { // L: 6075
					int var9;
					int var10;
					int var11;
					for (var2 = 0; var2 < 4; ++var2) { // L: 6076
						HorizontalAlignment.playPcmPlayers(); // L: 6077

						for (var3 = 0; var3 < 13; ++var3) { // L: 6078
							for (var4 = 0; var4 < 13; ++var4) { // L: 6079
								boolean var18 = false; // L: 6080
								var6 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 6081
								if (var6 != -1) { // L: 6082
									var7 = var6 >> 24 & 3; // L: 6083
									var8 = var6 >> 1 & 3; // L: 6084
									var9 = var6 >> 14 & 1023; // L: 6085
									var10 = var6 >> 3 & 2047; // L: 6086
									var11 = (var9 / 8 << 8) + var10 / 8; // L: 6087

									for (int var12 = 0; var12 < MusicPatch.regions.length; ++var12) { // L: 6088
										if (MusicPatch.regions[var12] == var11 && class4.regionLandArchives[var12] != null) { // L: 6089
											int var13 = (var9 - var3) * 8; // L: 6090
											int var14 = (var10 - var4) * 8; // L: 6091
											class142.method3172(class4.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14, Client.collisionMaps); // L: 6092
											var18 = true; // L: 6093
											break;
										}
									}
								}

								if (!var18) { // L: 6098
									class237.method4885(var2, var3 * 8, var4 * 8); // L: 6099
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) { // L: 6104
						for (var3 = 0; var3 < 13; ++var3) { // L: 6105
							var4 = Client.instanceChunkTemplates[0][var2][var3]; // L: 6106
							if (var4 == -1) { // L: 6107
								class14.method182(var2 * 8, var3 * 8, 8, 8); // L: 6108
							}
						}
					}

					Projectile.method2173(true); // L: 6112

					for (var2 = 0; var2 < 4; ++var2) { // L: 6113
						HorizontalAlignment.playPcmPlayers(); // L: 6114

						for (var3 = 0; var3 < 13; ++var3) { // L: 6115
							for (var4 = 0; var4 < 13; ++var4) { // L: 6116
								var5 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 6117
								if (var5 != -1) { // L: 6118
									var6 = var5 >> 24 & 3; // L: 6119
									var7 = var5 >> 1 & 3; // L: 6120
									var8 = var5 >> 14 & 1023; // L: 6121
									var9 = var5 >> 3 & 2047; // L: 6122
									var10 = (var8 / 8 << 8) + var9 / 8; // L: 6123

									for (var11 = 0; var11 < MusicPatch.regions.length; ++var11) { // L: 6124
										if (MusicPatch.regions[var11] == var10 && class323.regionMapArchives[var11] != null) { // L: 6125
											Tiles.method2274(class323.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, WorldMapAreaData.scene, Client.collisionMaps); // L: 6126
											break; // L: 6127
										}
									}
								}
							}
						}
					}
				}

				Projectile.method2173(true); // L: 6135
				HorizontalAlignment.playPcmPlayers(); // L: 6136
				FontName.method8315(WorldMapAreaData.scene, Client.collisionMaps); // L: 6137
				Projectile.method2173(true); // L: 6138
				var2 = Tiles.Tiles_minPlane; // L: 6139
				if (var2 > class103.Client_plane) { // L: 6140
					var2 = class103.Client_plane;
				}

				if (var2 < class103.Client_plane - 1) { // L: 6141
					var2 = class103.Client_plane - 1;
				}

				if (Client.isLowDetail) { // L: 6142
					WorldMapAreaData.scene.init(Tiles.Tiles_minPlane);
				} else {
					WorldMapAreaData.scene.init(0); // L: 6143
				}

				for (var3 = 0; var3 < 104; ++var3) { // L: 6144
					for (var4 = 0; var4 < 104; ++var4) { // L: 6145
						ClientPacket.updateItemPile(var3, var4); // L: 6146
					}
				}

				HorizontalAlignment.playPcmPlayers(); // L: 6149
				Language.method6782(); // L: 6150
				ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 6151
				PacketBufferNode var19;
				if (Decimator.client.hasFrame()) { // L: 6152
					var19 = Renderable.getPacketBufferNode(ClientPacket.field3096, Client.packetWriter.isaacCipher); // L: 6154
					var19.packetBuffer.writeInt(1057001181); // L: 6155
					Client.packetWriter.addNode(var19); // L: 6156
				}

				if (!Client.isInInstance) { // L: 6158
					var3 = (class303.field3472 - 6) / 8; // L: 6159
					var4 = (class303.field3472 + 6) / 8; // L: 6160
					var5 = (ScriptFrame.field467 - 6) / 8; // L: 6161
					var6 = (ScriptFrame.field467 + 6) / 8; // L: 6162

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) { // L: 6163
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) { // L: 6164
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) { // L: 6165
								NetCache.field4260.loadRegionFromName("m" + var7 + "_" + var8); // L: 6166
								NetCache.field4260.loadRegionFromName("l" + var7 + "_" + var8); // L: 6167
							}
						}
					}
				}

				class246.method5251(30); // L: 6171
				HorizontalAlignment.playPcmPlayers(); // L: 6172
				Timer.method7404(); // L: 6173
				var19 = Renderable.getPacketBufferNode(ClientPacket.field3135, Client.packetWriter.isaacCipher); // L: 6174
				Client.packetWriter.addNode(var19); // L: 6175
				class204.method4130(); // L: 6176
			}
		}
	} // L: 6009 6027 6177

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(IIIILrs;Lkb;I)V",
		garbageValue = "-2078813902"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2; // L: 13060
		if (var6 > 4225 && var6 < 90000) { // L: 13061
			int var7 = Client.camAngleY & 2047; // L: 13062
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 13063
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 13064
			int var10 = var3 * var8 + var9 * var2 >> 16; // L: 13065
			int var11 = var3 * var9 - var8 * var2 >> 16; // L: 13066
			double var12 = Math.atan2((double)var10, (double)var11); // L: 13067
			int var14 = var5.width / 2 - 25; // L: 13068
			int var15 = (int)(Math.sin(var12) * (double)var14); // L: 13069
			int var16 = (int)(Math.cos(var12) * (double)var14); // L: 13070
			byte var17 = 20; // L: 13071
			PacketBufferNode.redHintArrowSprite.method9117(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256); // L: 13072
		} else {
			class31.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5); // L: 13074
		}

	} // L: 13075
}
