import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("ay")
	@Export("text")
	String text;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1609490399
	)
	@Export("width")
	int width;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1939796907
	)
	@Export("height")
	int height;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILjn;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1; // L: 10
		this.width = var2; // L: 11
		this.height = var3; // L: 12
		this.size = var4; // L: 13
	} // L: 14

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "198280585"
	)
	static final void method5494() {
		ClientPacket.method5722(false); // L: 5946
		Client.field716 = 0; // L: 5947
		boolean var0 = true; // L: 5948

		int var1;
		for (var1 = 0; var1 < InterfaceParent.regionLandArchives.length; ++var1) { // L: 5949
			if (class7.regionMapArchiveIds[var1] != -1 && InterfaceParent.regionLandArchives[var1] == null) { // L: 5950 5951
				InterfaceParent.regionLandArchives[var1] = ModelData0.archive9.takeFile(class7.regionMapArchiveIds[var1], 0); // L: 5952
				if (InterfaceParent.regionLandArchives[var1] == null) { // L: 5953
					var0 = false; // L: 5954
					++Client.field716; // L: 5955
				}
			}

			if (WorldMapIcon_1.regionLandArchiveIds[var1] != -1 && PlayerType.regionMapArchives[var1] == null) { // L: 5959 5960
				PlayerType.regionMapArchives[var1] = ModelData0.archive9.takeFileEncrypted(WorldMapIcon_1.regionLandArchiveIds[var1], 0, class25.xteaKeys[var1]); // L: 5961
				if (PlayerType.regionMapArchives[var1] == null) { // L: 5962
					var0 = false; // L: 5963
					++Client.field716; // L: 5964
				}
			}
		}

		if (!var0) { // L: 5969
			Client.field553 = 1; // L: 5970
		} else {
			Client.field624 = 0; // L: 5973
			var0 = true; // L: 5974

			int var3;
			int var4;
			for (var1 = 0; var1 < InterfaceParent.regionLandArchives.length; ++var1) { // L: 5975
				byte[] var17 = PlayerType.regionMapArchives[var1]; // L: 5976
				if (var17 != null) { // L: 5977
					var3 = (class304.regions[var1] >> 8) * 64 - class147.baseX * 64; // L: 5978
					var4 = (class304.regions[var1] & 255) * 64 - ModeWhere.baseY * 64; // L: 5979
					if (Client.isInInstance) { // L: 5980
						var3 = 10; // L: 5981
						var4 = 10; // L: 5982
					}

					var0 &= class323.method6092(var17, var3, var4); // L: 5984
				}
			}

			if (!var0) { // L: 5987
				Client.field553 = 2; // L: 5988
			} else {
				if (Client.field553 != 0) { // L: 5991
					AbstractWorldMapIcon.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				class85.playPcmPlayers(); // L: 5992
				UserComparator4.scene.clear(); // L: 5993

				for (var1 = 0; var1 < 4; ++var1) { // L: 5994
					Client.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) { // L: 5995
					for (var2 = 0; var2 < 104; ++var2) { // L: 5996
						for (var3 = 0; var3 < 104; ++var3) { // L: 5997
							Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 5998
						}
					}
				}

				class85.playPcmPlayers(); // L: 6002
				class72.method2047(); // L: 6003
				var1 = InterfaceParent.regionLandArchives.length; // L: 6004
				class299.method5757(); // L: 6005
				ClientPacket.method5722(true); // L: 6006
				int var5;
				if (!Client.isInInstance) { // L: 6007
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) { // L: 6008
						var3 = (class304.regions[var2] >> 8) * 64 - class147.baseX * 64; // L: 6009
						var4 = (class304.regions[var2] & 255) * 64 - ModeWhere.baseY * 64; // L: 6010
						var16 = InterfaceParent.regionLandArchives[var2]; // L: 6011
						if (var16 != null) { // L: 6012
							class85.playPcmPlayers(); // L: 6013
							HealthBarUpdate.method2391(var16, var3, var4, VertexNormal.field2776 * 8 - 48, class488.field4967 * 8 - 48, Client.collisionMaps); // L: 6014
						}
					}

					for (var2 = 0; var2 < var1; ++var2) { // L: 6017
						var3 = (class304.regions[var2] >> 8) * 64 - class147.baseX * 64; // L: 6018
						var4 = (class304.regions[var2] & 255) * 64 - ModeWhere.baseY * 64; // L: 6019
						var16 = InterfaceParent.regionLandArchives[var2]; // L: 6020
						if (var16 == null && class488.field4967 < 800) { // L: 6021
							class85.playPcmPlayers(); // L: 6022
							GameEngine.method478(var3, var4, 64, 64); // L: 6023
						}
					}

					ClientPacket.method5722(true); // L: 6026

					for (var2 = 0; var2 < var1; ++var2) { // L: 6027
						byte[] var15 = PlayerType.regionMapArchives[var2]; // L: 6028
						if (var15 != null) { // L: 6029
							var4 = (class304.regions[var2] >> 8) * 64 - class147.baseX * 64; // L: 6030
							var5 = (class304.regions[var2] & 255) * 64 - ModeWhere.baseY * 64; // L: 6031
							class85.playPcmPlayers(); // L: 6032
							MouseRecorder.method2250(var15, var4, var5, UserComparator4.scene, Client.collisionMaps); // L: 6033
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.isInInstance) { // L: 6037
					int var9;
					int var10;
					int var11;
					for (var2 = 0; var2 < 4; ++var2) { // L: 6038
						class85.playPcmPlayers(); // L: 6039

						for (var3 = 0; var3 < 13; ++var3) { // L: 6040
							for (var4 = 0; var4 < 13; ++var4) { // L: 6041
								boolean var18 = false; // L: 6042
								var6 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 6043
								if (var6 != -1) { // L: 6044
									var7 = var6 >> 24 & 3; // L: 6045
									var8 = var6 >> 1 & 3; // L: 6046
									var9 = var6 >> 14 & 1023; // L: 6047
									var10 = var6 >> 3 & 2047; // L: 6048
									var11 = (var9 / 8 << 8) + var10 / 8; // L: 6049

									for (int var12 = 0; var12 < class304.regions.length; ++var12) { // L: 6050
										if (class304.regions[var12] == var11 && InterfaceParent.regionLandArchives[var12] != null) { // L: 6051
											int var13 = (var9 - var3) * 8; // L: 6052
											int var14 = (var10 - var4) * 8; // L: 6053
											class13.method167(InterfaceParent.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14, Client.collisionMaps); // L: 6054
											var18 = true; // L: 6055
											break;
										}
									}
								}

								if (!var18) { // L: 6060
									class4.method17(var2, var3 * 8, var4 * 8); // L: 6061
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) { // L: 6066
						for (var3 = 0; var3 < 13; ++var3) { // L: 6067
							var4 = Client.instanceChunkTemplates[0][var2][var3]; // L: 6068
							if (var4 == -1) { // L: 6069
								GameEngine.method478(var2 * 8, var3 * 8, 8, 8); // L: 6070
							}
						}
					}

					ClientPacket.method5722(true); // L: 6074

					for (var2 = 0; var2 < 4; ++var2) { // L: 6075
						class85.playPcmPlayers(); // L: 6076

						for (var3 = 0; var3 < 13; ++var3) { // L: 6077
							for (var4 = 0; var4 < 13; ++var4) { // L: 6078
								var5 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 6079
								if (var5 != -1) { // L: 6080
									var6 = var5 >> 24 & 3; // L: 6081
									var7 = var5 >> 1 & 3; // L: 6082
									var8 = var5 >> 14 & 1023; // L: 6083
									var9 = var5 >> 3 & 2047; // L: 6084
									var10 = (var8 / 8 << 8) + var9 / 8; // L: 6085

									for (var11 = 0; var11 < class304.regions.length; ++var11) { // L: 6086
										if (class304.regions[var11] == var10 && PlayerType.regionMapArchives[var11] != null) { // L: 6087
											Tiles.method2149(PlayerType.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, UserComparator4.scene, Client.collisionMaps); // L: 6088
											break; // L: 6089
										}
									}
								}
							}
						}
					}
				}

				ClientPacket.method5722(true); // L: 6097
				class85.playPcmPlayers(); // L: 6098
				Canvas.method307(UserComparator4.scene, Client.collisionMaps); // L: 6099
				ClientPacket.method5722(true); // L: 6100
				var2 = Tiles.Tiles_minPlane; // L: 6101
				if (var2 > NetFileRequest.Client_plane) { // L: 6102
					var2 = NetFileRequest.Client_plane;
				}

				if (var2 < NetFileRequest.Client_plane - 1) { // L: 6103
					var2 = NetFileRequest.Client_plane - 1;
				}

				if (Client.isLowDetail) { // L: 6104
					UserComparator4.scene.init(Tiles.Tiles_minPlane);
				} else {
					UserComparator4.scene.init(0); // L: 6105
				}

				for (var3 = 0; var3 < 104; ++var3) { // L: 6106
					for (var4 = 0; var4 < 104; ++var4) { // L: 6107
						class14.updateItemPile(var3, var4); // L: 6108
					}
				}

				class85.playPcmPlayers(); // L: 6111
				class17.method249(); // L: 6112
				ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 6113
				PacketBufferNode var19;
				if (class439.client.hasFrame()) { // L: 6114
					var19 = class251.getPacketBufferNode(ClientPacket.field3126, Client.packetWriter.isaacCipher); // L: 6116
					var19.packetBuffer.writeIntME(1057001181); // L: 6117
					Client.packetWriter.addNode(var19); // L: 6118
				}

				if (!Client.isInInstance) { // L: 6120
					var3 = (VertexNormal.field2776 - 6) / 8; // L: 6121
					var4 = (VertexNormal.field2776 + 6) / 8; // L: 6122
					var5 = (class488.field4967 - 6) / 8; // L: 6123
					var6 = (class488.field4967 + 6) / 8; // L: 6124

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) { // L: 6125
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) { // L: 6126
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) { // L: 6127
								ModelData0.archive9.loadRegionFromName("m" + var7 + "_" + var8); // L: 6128
								ModelData0.archive9.loadRegionFromName("l" + var7 + "_" + var8); // L: 6129
							}
						}
					}
				}

				class47.method867(30); // L: 6133
				class85.playPcmPlayers(); // L: 6134
				class181.method3512(); // L: 6135
				var19 = class251.getPacketBufferNode(ClientPacket.field3131, Client.packetWriter.isaacCipher); // L: 6136
				Client.packetWriter.addNode(var19); // L: 6137
				class90.method2273(); // L: 6138
			}
		}
	} // L: 5971 5989 6139
}
