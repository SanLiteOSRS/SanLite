import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aq")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("archive6")
	static Archive archive6;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 120058479
	)
	@Export("id")
	int id;
	@ObfuscatedName("f")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 599967177
	)
	@Export("size")
	int size;
	@ObfuscatedName("x")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("h")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("j")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("y")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("d")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgy;",
		garbageValue = "-39"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0); // L: 32
		if (var1 != null) { // L: 33
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0); // L: 34
			var1 = new SpotAnimationDefinition(); // L: 35
			var1.id = var0; // L: 36
			if (var2 != null) { // L: 37
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0); // L: 38
			return var1; // L: 39
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Llg;I)V",
		garbageValue = "1804403992"
	)
	public static void method716(AbstractArchive var0) {
		class357.InvDefinition_archive = var0; // L: 17
	} // L: 18

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "29"
	)
	static final void method714() {
		class323.method6271(false); // L: 5797
		Client.field557 = 0; // L: 5798
		boolean var0 = true; // L: 5799

		int var1;
		for (var1 = 0; var1 < GrandExchangeOfferOwnWorldComparator.regionLandArchives.length; ++var1) { // L: 5800
			if (class143.regionMapArchiveIds[var1] != -1 && GrandExchangeOfferOwnWorldComparator.regionLandArchives[var1] == null) { // L: 5801 5802
				GrandExchangeOfferOwnWorldComparator.regionLandArchives[var1] = SecureRandomFuture.archive9.takeFile(class143.regionMapArchiveIds[var1], 0); // L: 5803
				if (GrandExchangeOfferOwnWorldComparator.regionLandArchives[var1] == null) { // L: 5804
					var0 = false; // L: 5805
					++Client.field557; // L: 5806
				}
			}

			if (class13.regionLandArchiveIds[var1] != -1 && class9.regionMapArchives[var1] == null) { // L: 5810 5811
				class9.regionMapArchives[var1] = SecureRandomFuture.archive9.takeFileEncrypted(class13.regionLandArchiveIds[var1], 0, class26.xteaKeys[var1]); // L: 5812
				if (class9.regionMapArchives[var1] == null) { // L: 5813
					var0 = false; // L: 5814
					++Client.field557; // L: 5815
				}
			}
		}

		if (!var0) { // L: 5820
			Client.field582 = 1; // L: 5821
		} else {
			Client.field559 = 0; // L: 5824
			var0 = true; // L: 5825

			int var3;
			int var4;
			for (var1 = 0; var1 < GrandExchangeOfferOwnWorldComparator.regionLandArchives.length; ++var1) { // L: 5826
				byte[] var15 = class9.regionMapArchives[var1]; // L: 5827
				if (var15 != null) { // L: 5828
					var3 = (RouteStrategy.regions[var1] >> 8) * 64 - class26.baseX * 64; // L: 5829
					var4 = (RouteStrategy.regions[var1] & 255) * 64 - class158.baseY * 64; // L: 5830
					if (Client.isInInstance) { // L: 5831
						var3 = 10; // L: 5832
						var4 = 10; // L: 5833
					}

					var0 &= CollisionMap.method4036(var15, var3, var4); // L: 5835
				}
			}

			if (!var0) { // L: 5838
				Client.field582 = 2; // L: 5839
			} else {
				if (Client.field582 != 0) { // L: 5842
					class145.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				class355.playPcmPlayers(); // L: 5843
				class139.scene.clear(); // L: 5844

				for (var1 = 0; var1 < 4; ++var1) { // L: 5845
					Client.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) { // L: 5846
					for (var2 = 0; var2 < 104; ++var2) { // L: 5847
						for (var3 = 0; var3 < 104; ++var3) { // L: 5848
							Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 5849
						}
					}
				}

				class355.playPcmPlayers(); // L: 5853
				Script.method2120(); // L: 5854
				var1 = GrandExchangeOfferOwnWorldComparator.regionLandArchives.length; // L: 5855
				class87.method2257(); // L: 5856
				class323.method6271(true); // L: 5857
				int var5;
				if (!Client.isInInstance) { // L: 5858
					byte[] var14;
					for (var2 = 0; var2 < var1; ++var2) { // L: 5859
						var3 = (RouteStrategy.regions[var2] >> 8) * 64 - class26.baseX * 64; // L: 5860
						var4 = (RouteStrategy.regions[var2] & 255) * 64 - class158.baseY * 64; // L: 5861
						var14 = GrandExchangeOfferOwnWorldComparator.regionLandArchives[var2]; // L: 5862
						if (var14 != null) { // L: 5863
							class355.playPcmPlayers(); // L: 5864
							class21.method298(var14, var3, var4, class343.field4234 * 8 - 48, ServerPacket.field3133 * 8 - 48, Client.collisionMaps); // L: 5865
						}
					}

					for (var2 = 0; var2 < var1; ++var2) { // L: 5868
						var3 = (RouteStrategy.regions[var2] >> 8) * 64 - class26.baseX * 64; // L: 5869
						var4 = (RouteStrategy.regions[var2] & 255) * 64 - class158.baseY * 64; // L: 5870
						var14 = GrandExchangeOfferOwnWorldComparator.regionLandArchives[var2]; // L: 5871
						if (var14 == null && ServerPacket.field3133 < 800) { // L: 5872
							class355.playPcmPlayers(); // L: 5873
							WorldMapCacheName.method5228(var3, var4, 64, 64); // L: 5874
						}
					}

					class323.method6271(true); // L: 5877

					for (var2 = 0; var2 < var1; ++var2) { // L: 5878
						byte[] var13 = class9.regionMapArchives[var2]; // L: 5879
						if (var13 != null) { // L: 5880
							var4 = (RouteStrategy.regions[var2] >> 8) * 64 - class26.baseX * 64; // L: 5881
							var5 = (RouteStrategy.regions[var2] & 255) * 64 - class158.baseY * 64; // L: 5882
							class355.playPcmPlayers(); // L: 5883
							class361.method6839(var13, var4, var5, class139.scene, Client.collisionMaps); // L: 5884
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.isInInstance) { // L: 5888
					int var9;
					int var10;
					int var11;
					for (var2 = 0; var2 < 4; ++var2) { // L: 5889
						class355.playPcmPlayers(); // L: 5890

						for (var3 = 0; var3 < 13; ++var3) { // L: 5891
							for (var4 = 0; var4 < 13; ++var4) { // L: 5892
								boolean var16 = false; // L: 5893
								var6 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 5894
								if (var6 != -1) { // L: 5895
									var7 = var6 >> 24 & 3; // L: 5896
									var8 = var6 >> 1 & 3; // L: 5897
									var9 = var6 >> 14 & 1023; // L: 5898
									var10 = var6 >> 3 & 2047; // L: 5899
									var11 = (var9 / 8 << 8) + var10 / 8; // L: 5900

									for (int var12 = 0; var12 < RouteStrategy.regions.length; ++var12) { // L: 5901
										if (RouteStrategy.regions[var12] == var11 && GrandExchangeOfferOwnWorldComparator.regionLandArchives[var12] != null) { // L: 5902
											HitSplatDefinition.method3717(GrandExchangeOfferOwnWorldComparator.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, Client.collisionMaps); // L: 5903
											var16 = true; // L: 5904
											break;
										}
									}
								}

								if (!var16) { // L: 5909
									DynamicObject.method2131(var2, var3 * 8, var4 * 8); // L: 5910
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) { // L: 5915
						for (var3 = 0; var3 < 13; ++var3) { // L: 5916
							var4 = Client.instanceChunkTemplates[0][var2][var3]; // L: 5917
							if (var4 == -1) { // L: 5918
								WorldMapCacheName.method5228(var2 * 8, var3 * 8, 8, 8); // L: 5919
							}
						}
					}

					class323.method6271(true); // L: 5923

					for (var2 = 0; var2 < 4; ++var2) { // L: 5924
						class355.playPcmPlayers(); // L: 5925

						for (var3 = 0; var3 < 13; ++var3) { // L: 5926
							for (var4 = 0; var4 < 13; ++var4) { // L: 5927
								var5 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 5928
								if (var5 != -1) { // L: 5929
									var6 = var5 >> 24 & 3; // L: 5930
									var7 = var5 >> 1 & 3; // L: 5931
									var8 = var5 >> 14 & 1023; // L: 5932
									var9 = var5 >> 3 & 2047; // L: 5933
									var10 = (var8 / 8 << 8) + var9 / 8; // L: 5934

									for (var11 = 0; var11 < RouteStrategy.regions.length; ++var11) { // L: 5935
										if (RouteStrategy.regions[var11] == var10 && class9.regionMapArchives[var11] != null) { // L: 5936
											Tiles.method2170(class9.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, class139.scene, Client.collisionMaps); // L: 5937
											break; // L: 5938
										}
									}
								}
							}
						}
					}
				}

				class323.method6271(true); // L: 5946
				class355.playPcmPlayers(); // L: 5947
				class305.method6206(class139.scene, Client.collisionMaps); // L: 5948
				class323.method6271(true); // L: 5949
				var2 = Tiles.Tiles_minPlane; // L: 5950
				if (var2 > ApproximateRouteStrategy.Client_plane) { // L: 5951
					var2 = ApproximateRouteStrategy.Client_plane;
				}

				if (var2 < ApproximateRouteStrategy.Client_plane - 1) { // L: 5952
					var2 = ApproximateRouteStrategy.Client_plane - 1;
				}

				if (Client.isLowDetail) { // L: 5953
					class139.scene.init(Tiles.Tiles_minPlane);
				} else {
					class139.scene.init(0); // L: 5954
				}

				for (var3 = 0; var3 < 104; ++var3) { // L: 5955
					for (var4 = 0; var4 < 104; ++var4) { // L: 5956
						class162.updateItemPile(var3, var4); // L: 5957
					}
				}

				class355.playPcmPlayers(); // L: 5960
				Projectile.method2096(); // L: 5961
				ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 5962
				PacketBufferNode var17;
				if (ClanChannelMember.client.hasFrame()) { // L: 5963
					var17 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3008, Client.packetWriter.isaacCipher); // L: 5965
					var17.packetBuffer.writeInt(1057001181); // L: 5966
					Client.packetWriter.addNode(var17); // L: 5967
				}

				if (!Client.isInInstance) { // L: 5969
					var3 = (class343.field4234 - 6) / 8; // L: 5970
					var4 = (class343.field4234 + 6) / 8; // L: 5971
					var5 = (ServerPacket.field3133 - 6) / 8; // L: 5972
					var6 = (ServerPacket.field3133 + 6) / 8; // L: 5973

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) { // L: 5974
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) { // L: 5975
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) { // L: 5976
								SecureRandomFuture.archive9.loadRegionFromName("m" + var7 + "_" + var8); // L: 5977
								SecureRandomFuture.archive9.loadRegionFromName("l" + var7 + "_" + var8); // L: 5978
							}
						}
					}
				}

				class21.method305(30); // L: 5982
				class355.playPcmPlayers(); // L: 5983
				Interpreter.method2003(); // L: 5984
				var17 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3093, Client.packetWriter.isaacCipher); // L: 5985
				Client.packetWriter.addNode(var17); // L: 5986
				class354.method6768(); // L: 5987
			}
		}
	} // L: 5822 5840 5988

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-53"
	)
	static void method713(int var0) {
		if (var0 != Client.loginState) { // L: 12809
			Client.loginState = var0; // L: 12810
		}
	} // L: 12811
}
