import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("og")
public class class370 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	static final class370 field4370;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	static final class370 field4373;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	static final class370 field4369;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	static final class370 field4372;
	@ObfuscatedName("br")
	@Export("hasFocus")
	protected static boolean hasFocus;

	static {
		field4370 = new class370(); // L: 4
		field4373 = new class370(); // L: 5
		field4369 = new class370(); // L: 6
		field4372 = new class370(); // L: 7
	}

	class370() {
	} // L: 9

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2133764143"
	)
	static final void method6926() {
		class108.method2716(false); // L: 5917
		Client.field596 = 0; // L: 5918
		boolean var0 = true; // L: 5919

		int var1;
		for (var1 = 0; var1 < UserComparator5.regionLandArchives.length; ++var1) { // L: 5920
			if (class59.regionMapArchiveIds[var1] != -1 && UserComparator5.regionLandArchives[var1] == null) { // L: 5921 5922
				UserComparator5.regionLandArchives[var1] = class499.archive6.takeFile(class59.regionMapArchiveIds[var1], 0); // L: 5923
				if (UserComparator5.regionLandArchives[var1] == null) { // L: 5924
					var0 = false; // L: 5925
					++Client.field596; // L: 5926
				}
			}

			if (class183.regionLandArchiveIds[var1] != -1 && class197.regionMapArchives[var1] == null) { // L: 5930 5931
				class197.regionMapArchives[var1] = class499.archive6.takeFileEncrypted(class183.regionLandArchiveIds[var1], 0, RunException.xteaKeys[var1]); // L: 5932
				if (class197.regionMapArchives[var1] == null) { // L: 5933
					var0 = false; // L: 5934
					++Client.field596; // L: 5935
				}
			}
		}

		if (!var0) { // L: 5940
			Client.field600 = 1; // L: 5941
		} else {
			Client.field598 = 0; // L: 5944
			var0 = true; // L: 5945

			int var3;
			int var4;
			for (var1 = 0; var1 < UserComparator5.regionLandArchives.length; ++var1) { // L: 5946
				byte[] var17 = class197.regionMapArchives[var1]; // L: 5947
				if (var17 != null) { // L: 5948
					var3 = (class191.regions[var1] >> 8) * 64 - UrlRequester.baseX * 64; // L: 5949
					var4 = (class191.regions[var1] & 255) * 64 - class47.baseY * 64; // L: 5950
					if (Client.isInInstance) { // L: 5951
						var3 = 10; // L: 5952
						var4 = 10; // L: 5953
					}

					var0 &= class142.method3104(var17, var3, var4); // L: 5955
				}
			}

			if (!var0) { // L: 5958
				Client.field600 = 2; // L: 5959
			} else {
				if (Client.field600 != 0) { // L: 5962
					class405.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				class301.method5721(); // L: 5963
				class130.scene.clear(); // L: 5964

				for (var1 = 0; var1 < 4; ++var1) { // L: 5965
					Client.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) { // L: 5966
					for (var2 = 0; var2 < 104; ++var2) { // L: 5967
						for (var3 = 0; var3 < 104; ++var3) { // L: 5968
							Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 5969
						}
					}
				}

				class301.method5721(); // L: 5973
				Language.method6952(); // L: 5974
				var1 = UserComparator5.regionLandArchives.length; // L: 5975
				class388.method7220(); // L: 5976
				class108.method2716(true); // L: 5977
				int var5;
				if (!Client.isInInstance) { // L: 5978
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) { // L: 5979
						var3 = (class191.regions[var2] >> 8) * 64 - UrlRequester.baseX * 64; // L: 5980
						var4 = (class191.regions[var2] & 255) * 64 - class47.baseY * 64; // L: 5981
						var16 = UserComparator5.regionLandArchives[var2]; // L: 5982
						if (var16 != null) { // L: 5983
							class301.method5721(); // L: 5984
							class261.method5395(var16, var3, var4, Tiles.field1037 * 8 - 48, MouseRecorder.field1105 * 8 - 48, Client.collisionMaps); // L: 5985
						}
					}

					for (var2 = 0; var2 < var1; ++var2) { // L: 5988
						var3 = (class191.regions[var2] >> 8) * 64 - UrlRequester.baseX * 64; // L: 5989
						var4 = (class191.regions[var2] & 255) * 64 - class47.baseY * 64; // L: 5990
						var16 = UserComparator5.regionLandArchives[var2]; // L: 5991
						if (var16 == null && MouseRecorder.field1105 < 800) { // L: 5992
							class301.method5721(); // L: 5993
							class17.method265(var3, var4, 64, 64); // L: 5994
						}
					}

					class108.method2716(true); // L: 5997

					for (var2 = 0; var2 < var1; ++var2) { // L: 5998
						byte[] var15 = class197.regionMapArchives[var2]; // L: 5999
						if (var15 != null) { // L: 6000
							var4 = (class191.regions[var2] >> 8) * 64 - UrlRequester.baseX * 64; // L: 6001
							var5 = (class191.regions[var2] & 255) * 64 - class47.baseY * 64; // L: 6002
							class301.method5721(); // L: 6003
							FriendsChatManager.method7860(var15, var4, var5, class130.scene, Client.collisionMaps); // L: 6004
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.isInInstance) { // L: 6008
					int var9;
					int var10;
					int var11;
					for (var2 = 0; var2 < 4; ++var2) { // L: 6009
						class301.method5721(); // L: 6010

						for (var3 = 0; var3 < 13; ++var3) { // L: 6011
							for (var4 = 0; var4 < 13; ++var4) { // L: 6012
								boolean var18 = false; // L: 6013
								var6 = Client.field603[var2][var3][var4]; // L: 6014
								if (var6 != -1) { // L: 6015
									var7 = var6 >> 24 & 3; // L: 6016
									var8 = var6 >> 1 & 3; // L: 6017
									var9 = var6 >> 14 & 1023; // L: 6018
									var10 = var6 >> 3 & 2047; // L: 6019
									var11 = (var9 / 8 << 8) + var10 / 8; // L: 6020

									for (int var12 = 0; var12 < class191.regions.length; ++var12) { // L: 6021
										if (class191.regions[var12] == var11 && UserComparator5.regionLandArchives[var12] != null) { // L: 6022
											int var13 = (var9 - var3) * 8; // L: 6023
											int var14 = (var10 - var4) * 8; // L: 6024
											class132.method3038(UserComparator5.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14, Client.collisionMaps); // L: 6025
											var18 = true; // L: 6026
											break;
										}
									}
								}

								if (!var18) { // L: 6031
									class372.method6935(var2, var3 * 8, var4 * 8); // L: 6032
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) { // L: 6037
						for (var3 = 0; var3 < 13; ++var3) { // L: 6038
							var4 = Client.field603[0][var2][var3]; // L: 6039
							if (var4 == -1) { // L: 6040
								class17.method265(var2 * 8, var3 * 8, 8, 8); // L: 6041
							}
						}
					}

					class108.method2716(true); // L: 6045

					for (var2 = 0; var2 < 4; ++var2) { // L: 6046
						class301.method5721(); // L: 6047

						for (var3 = 0; var3 < 13; ++var3) { // L: 6048
							for (var4 = 0; var4 < 13; ++var4) { // L: 6049
								var5 = Client.field603[var2][var3][var4]; // L: 6050
								if (var5 != -1) { // L: 6051
									var6 = var5 >> 24 & 3; // L: 6052
									var7 = var5 >> 1 & 3; // L: 6053
									var8 = var5 >> 14 & 1023; // L: 6054
									var9 = var5 >> 3 & 2047; // L: 6055
									var10 = (var8 / 8 << 8) + var9 / 8; // L: 6056

									for (var11 = 0; var11 < class191.regions.length; ++var11) { // L: 6057
										if (class191.regions[var11] == var10 && class197.regionMapArchives[var11] != null) { // L: 6058
											Tiles.method2202(class197.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, class130.scene, Client.collisionMaps); // L: 6059
											break; // L: 6060
										}
									}
								}
							}
						}
					}
				}

				class108.method2716(true); // L: 6068
				class301.method5721(); // L: 6069
				class129.method2989(class130.scene, Client.collisionMaps); // L: 6070
				class108.method2716(true); // L: 6071
				var2 = Tiles.Tiles_minPlane; // L: 6072
				if (var2 > HealthBar.Client_plane) { // L: 6073
					var2 = HealthBar.Client_plane;
				}

				if (var2 < HealthBar.Client_plane - 1) { // L: 6074
					var2 = HealthBar.Client_plane - 1;
				}

				if (Client.isLowDetail) { // L: 6075
					class130.scene.init(Tiles.Tiles_minPlane);
				} else {
					class130.scene.init(0); // L: 6076
				}

				for (var3 = 0; var3 < 104; ++var3) { // L: 6077
					for (var4 = 0; var4 < 104; ++var4) { // L: 6078
						class135.updateItemPile(var3, var4); // L: 6079
					}
				}

				class301.method5721(); // L: 6082
				class165.method3325(); // L: 6083
				ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 6084
				PacketBufferNode var19;
				if (class219.client.hasFrame()) { // L: 6085
					var19 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3132, Client.packetWriter.isaacCipher); // L: 6087
					var19.packetBuffer.writeInt(1057001181); // L: 6088
					Client.packetWriter.addNode(var19); // L: 6089
				}

				if (!Client.isInInstance) { // L: 6091
					var3 = (Tiles.field1037 - 6) / 8; // L: 6092
					var4 = (Tiles.field1037 + 6) / 8; // L: 6093
					var5 = (MouseRecorder.field1105 - 6) / 8; // L: 6094
					var6 = (MouseRecorder.field1105 + 6) / 8; // L: 6095

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) { // L: 6096
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) { // L: 6097
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) { // L: 6098
								class499.archive6.loadRegionFromName("m" + var7 + "_" + var8); // L: 6099
								class499.archive6.loadRegionFromName("l" + var7 + "_" + var8); // L: 6100
							}
						}
					}
				}

				class317.method6014(30); // L: 6104
				class301.method5721(); // L: 6105
				ObjectSound.method1927(); // L: 6106
				var19 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3153, Client.packetWriter.isaacCipher); // L: 6107
				Client.packetWriter.addNode(var19); // L: 6108
				PacketWriter.method2798(); // L: 6109
			}
		}
	} // L: 5942 5960 6110
}
