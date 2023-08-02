import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
public class class126 {
	@ObfuscatedName("am")
	public static final float field1494;
	@ObfuscatedName("as")
	public static final float field1496;
	@ObfuscatedName("aj")
	static float[] field1492;
	@ObfuscatedName("ag")
	static float[] field1497;
	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive12")
	static Archive archive12;

	static {
		field1494 = Math.ulp(1.0F); // L: 10
		field1496 = 2.0F * field1494; // L: 11
		field1492 = new float[4]; // L: 12
		field1497 = new float[5]; // L: 13
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lda;",
		garbageValue = "-1786451104"
	)
	static ClientPreferences method2941() {
		AccessFile var0 = null; // L: 117
		ClientPreferences var1 = new ClientPreferences(); // L: 118

		try {
			var0 = Decimator.getPreferencesFile("", class25.field138.name, false); // L: 120
			byte[] var2 = new byte[(int)var0.length()]; // L: 121

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 122 123 126
				var4 = var0.read(var2, var3, var2.length - var3); // L: 124
				if (var4 == -1) {
					throw new IOException(); // L: 125
				}
			}

			var1 = new ClientPreferences(new Buffer(var2)); // L: 128
		} catch (Exception var6) { // L: 130
		}

		try {
			if (var0 != null) { // L: 132
				var0.close(); // L: 133
			}
		} catch (Exception var5) { // L: 136
		}

		return var1; // L: 137
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1080653526"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 150
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static final void method2939() {
		CollisionMap.method4214(false); // L: 6010
		Client.field730 = 0; // L: 6011
		boolean var0 = true; // L: 6012

		int var1;
		for (var1 = 0; var1 < class155.regionLandArchives.length; ++var1) { // L: 6013
			if (UserComparator4.regionMapArchiveIds[var1] != -1 && class155.regionLandArchives[var1] == null) { // L: 6014 6015
				class155.regionLandArchives[var1] = Canvas.archive6.takeFile(UserComparator4.regionMapArchiveIds[var1], 0); // L: 6016
				if (class155.regionLandArchives[var1] == null) { // L: 6017
					var0 = false; // L: 6018
					++Client.field730; // L: 6019
				}
			}

			if (class170.regionLandArchiveIds[var1] != -1 && class389.regionMapArchives[var1] == null) { // L: 6023 6024
				class389.regionMapArchives[var1] = Canvas.archive6.takeFileEncrypted(class170.regionLandArchiveIds[var1], 0, class18.xteaKeys[var1]); // L: 6025
				if (class389.regionMapArchives[var1] == null) { // L: 6026
					var0 = false; // L: 6027
					++Client.field730; // L: 6028
				}
			}
		}

		if (!var0) { // L: 6033
			Client.field537 = 1; // L: 6034
		} else {
			Client.field679 = 0; // L: 6037
			var0 = true; // L: 6038

			int var3;
			int var4;
			for (var1 = 0; var1 < class155.regionLandArchives.length; ++var1) { // L: 6039
				byte[] var17 = class389.regionMapArchives[var1]; // L: 6040
				if (var17 != null) { // L: 6041
					var3 = (MusicPatch.regions[var1] >> 8) * 64 - AbstractArchive.baseX * 64; // L: 6042
					var4 = (MusicPatch.regions[var1] & 255) * 64 - class148.baseY * 64; // L: 6043
					if (Client.isInInstance) { // L: 6044
						var3 = 10; // L: 6045
						var4 = 10; // L: 6046
					}

					var0 &= class303.method5753(var17, var3, var4); // L: 6048
				}
			}

			if (!var0) { // L: 6051
				Client.field537 = 2; // L: 6052
			} else {
				if (Client.field537 != 0) { // L: 6055
					Actor.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				class105.method2684(); // L: 6056
				UserComparator5.scene.clear(); // L: 6057

				for (var1 = 0; var1 < 4; ++var1) { // L: 6058
					Client.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) { // L: 6059
					for (var2 = 0; var2 < 104; ++var2) { // L: 6060
						for (var3 = 0; var3 < 104; ++var3) { // L: 6061
							Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 6062
						}
					}
				}

				class105.method2684(); // L: 6066
				class325.method6104(); // L: 6067
				var1 = class155.regionLandArchives.length; // L: 6068
				class133.method3041(); // L: 6069
				CollisionMap.method4214(true); // L: 6070
				int var5;
				if (!Client.isInInstance) { // L: 6071
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) { // L: 6072
						var3 = (MusicPatch.regions[var2] >> 8) * 64 - AbstractArchive.baseX * 64; // L: 6073
						var4 = (MusicPatch.regions[var2] & 255) * 64 - class148.baseY * 64; // L: 6074
						var16 = class155.regionLandArchives[var2]; // L: 6075
						if (var16 != null) { // L: 6076
							class105.method2684(); // L: 6077
							World.method1862(var16, var3, var4, class309.field3456 * 8 - 48, class140.field1640 * 8 - 48, Client.collisionMaps); // L: 6078
						}
					}

					for (var2 = 0; var2 < var1; ++var2) { // L: 6081
						var3 = (MusicPatch.regions[var2] >> 8) * 64 - AbstractArchive.baseX * 64; // L: 6082
						var4 = (MusicPatch.regions[var2] & 255) * 64 - class148.baseY * 64; // L: 6083
						var16 = class155.regionLandArchives[var2]; // L: 6084
						if (var16 == null && class140.field1640 < 800) { // L: 6085
							class105.method2684(); // L: 6086
							class203.method3851(var3, var4, 64, 64); // L: 6087
						}
					}

					CollisionMap.method4214(true); // L: 6090

					for (var2 = 0; var2 < var1; ++var2) { // L: 6091
						byte[] var15 = class389.regionMapArchives[var2]; // L: 6092
						if (var15 != null) { // L: 6093
							var4 = (MusicPatch.regions[var2] >> 8) * 64 - AbstractArchive.baseX * 64; // L: 6094
							var5 = (MusicPatch.regions[var2] & 255) * 64 - class148.baseY * 64; // L: 6095
							class105.method2684(); // L: 6096
							class19.method282(var15, var4, var5, UserComparator5.scene, Client.collisionMaps); // L: 6097
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.isInInstance) { // L: 6101
					int var9;
					int var10;
					int var11;
					for (var2 = 0; var2 < 4; ++var2) { // L: 6102
						class105.method2684(); // L: 6103

						for (var3 = 0; var3 < 13; ++var3) { // L: 6104
							for (var4 = 0; var4 < 13; ++var4) { // L: 6105
								boolean var18 = false; // L: 6106
								var6 = Client.field590[var2][var3][var4]; // L: 6107
								if (var6 != -1) { // L: 6108
									var7 = var6 >> 24 & 3; // L: 6109
									var8 = var6 >> 1 & 3; // L: 6110
									var9 = var6 >> 14 & 1023; // L: 6111
									var10 = var6 >> 3 & 2047; // L: 6112
									var11 = (var9 / 8 << 8) + var10 / 8; // L: 6113

									for (int var12 = 0; var12 < MusicPatch.regions.length; ++var12) { // L: 6114
										if (MusicPatch.regions[var12] == var11 && class155.regionLandArchives[var12] != null) { // L: 6115
											int var13 = (var9 - var3) * 8; // L: 6116
											int var14 = (var10 - var4) * 8; // L: 6117
											class177.method3543(class155.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14, Client.collisionMaps); // L: 6118
											var18 = true; // L: 6119
											break;
										}
									}
								}

								if (!var18) { // L: 6124
									class74.method2087(var2, var3 * 8, var4 * 8); // L: 6125
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) { // L: 6130
						for (var3 = 0; var3 < 13; ++var3) { // L: 6131
							var4 = Client.field590[0][var2][var3]; // L: 6132
							if (var4 == -1) { // L: 6133
								class203.method3851(var2 * 8, var3 * 8, 8, 8); // L: 6134
							}
						}
					}

					CollisionMap.method4214(true); // L: 6138

					for (var2 = 0; var2 < 4; ++var2) { // L: 6139
						class105.method2684(); // L: 6140

						for (var3 = 0; var3 < 13; ++var3) { // L: 6141
							for (var4 = 0; var4 < 13; ++var4) { // L: 6142
								var5 = Client.field590[var2][var3][var4]; // L: 6143
								if (var5 != -1) { // L: 6144
									var6 = var5 >> 24 & 3; // L: 6145
									var7 = var5 >> 1 & 3; // L: 6146
									var8 = var5 >> 14 & 1023; // L: 6147
									var9 = var5 >> 3 & 2047; // L: 6148
									var10 = (var8 / 8 << 8) + var9 / 8; // L: 6149

									for (var11 = 0; var11 < MusicPatch.regions.length; ++var11) { // L: 6150
										if (MusicPatch.regions[var11] == var10 && class389.regionMapArchives[var11] != null) { // L: 6151
											Tiles.method2192(class389.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, UserComparator5.scene, Client.collisionMaps); // L: 6152
											break; // L: 6153
										}
									}
								}
							}
						}
					}
				}

				CollisionMap.method4214(true); // L: 6161
				class105.method2684(); // L: 6162
				AbstractUserComparator.method7982(UserComparator5.scene, Client.collisionMaps); // L: 6163
				CollisionMap.method4214(true); // L: 6164
				var2 = Tiles.Tiles_minPlane; // L: 6165
				if (var2 > class36.Client_plane) { // L: 6166
					var2 = class36.Client_plane;
				}

				if (var2 < class36.Client_plane - 1) { // L: 6167
					var2 = class36.Client_plane - 1;
				}

				if (Client.isLowDetail) { // L: 6168
					UserComparator5.scene.init(Tiles.Tiles_minPlane);
				} else {
					UserComparator5.scene.init(0); // L: 6169
				}

				for (var3 = 0; var3 < 104; ++var3) { // L: 6170
					for (var4 = 0; var4 < 104; ++var4) { // L: 6171
						class344.updateItemPile(var3, var4); // L: 6172
					}
				}

				class105.method2684(); // L: 6175
				ScriptFrame.method1208(); // L: 6176
				ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 6177
				PacketBufferNode var19;
				if (TileItem.client.hasFrame()) { // L: 6178
					var19 = class503.getPacketBufferNode(ClientPacket.field3160, Client.packetWriter.isaacCipher); // L: 6180
					var19.packetBuffer.writeInt(1057001181); // L: 6181
					Client.packetWriter.addNode(var19); // L: 6182
				}

				if (!Client.isInInstance) { // L: 6184
					var3 = (class309.field3456 - 6) / 8; // L: 6185
					var4 = (class309.field3456 + 6) / 8; // L: 6186
					var5 = (class140.field1640 - 6) / 8; // L: 6187
					var6 = (class140.field1640 + 6) / 8; // L: 6188

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) { // L: 6189
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) { // L: 6190
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) { // L: 6191
								Canvas.archive6.loadRegionFromName("m" + var7 + "_" + var8); // L: 6192
								Canvas.archive6.loadRegionFromName("l" + var7 + "_" + var8); // L: 6193
							}
						}
					}
				}

				class129.method2989(30); // L: 6197
				class105.method2684(); // L: 6198
				class164.method3394(); // L: 6199
				var19 = class503.getPacketBufferNode(ClientPacket.field3173, Client.packetWriter.isaacCipher); // L: 6200
				Client.packetWriter.addNode(var19); // L: 6201
				HealthBarDefinition.method3672(); // L: 6202
			}
		}
	} // L: 6035 6053 6203
}
