import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lh")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive19")
	static Archive archive19;
	@ObfuscatedName("o")
	@Export("state")
	byte state;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2026185243
	)
	@Export("id")
	public int id;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1258297859
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1246758821
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1190136297
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1875537815
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	} // L: 13

	@ObfuscatedSignature(
		descriptor = "(Lqw;Z)V",
		garbageValue = "0"
	)
	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte(); // L: 16
		this.id = var1.readUnsignedShort(); // L: 17
		this.unitPrice = var1.readInt(); // L: 18
		this.totalQuantity = var1.readInt(); // L: 19
		this.currentQuantity = var1.readInt(); // L: 20
		this.currentPrice = var1.readInt(); // L: 21
	} // L: 22

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "64"
	)
	@Export("status")
	public int status() {
		return this.state & 7; // L: 50
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1180687899"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0; // L: 54
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1532037296"
	)
	void method6031(int var1) {
		this.state &= -8; // L: 58
		this.state = (byte)(this.state | var1 & 7); // L: 59
	} // L: 60

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "134349312"
	)
	void method6035(int var1) {
		this.state &= -9; // L: 63
		if (var1 == 1) {
			this.state = (byte)(this.state | 8); // L: 64
		}

	} // L: 65

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "15761617"
	)
	static final void method6027() {
		AbstractWorldMapData.method4959(false); // L: 5826
		Client.field613 = 0; // L: 5827
		boolean var0 = true; // L: 5828

		int var1;
		for (var1 = 0; var1 < class7.regionLandArchives.length; ++var1) { // L: 5829
			if (MidiPcmStream.regionMapArchiveIds[var1] != -1 && class7.regionLandArchives[var1] == null) { // L: 5830 5831
				class7.regionLandArchives[var1] = class21.archive9.takeFile(MidiPcmStream.regionMapArchiveIds[var1], 0); // L: 5832
				if (class7.regionLandArchives[var1] == null) { // L: 5833
					var0 = false; // L: 5834
					++Client.field613; // L: 5835
				}
			}

			if (class19.regionLandArchiveIds[var1] != -1 && PcmPlayer.regionMapArchives[var1] == null) { // L: 5839 5840
				PcmPlayer.regionMapArchives[var1] = class21.archive9.takeFileEncrypted(class19.regionLandArchiveIds[var1], 0, class131.xteaKeys[var1]); // L: 5841
				if (PcmPlayer.regionMapArchives[var1] == null) { // L: 5842
					var0 = false; // L: 5843
					++Client.field613; // L: 5844
				}
			}
		}

		if (!var0) { // L: 5849
			Client.field552 = 1; // L: 5850
		} else {
			Client.field609 = 0; // L: 5853
			var0 = true; // L: 5854

			int var3;
			int var4;
			for (var1 = 0; var1 < class7.regionLandArchives.length; ++var1) { // L: 5855
				byte[] var15 = PcmPlayer.regionMapArchives[var1]; // L: 5856
				if (var15 != null) { // L: 5857
					var3 = (FileSystem.regions[var1] >> 8) * 64 - class300.baseX * 64; // L: 5858
					var4 = (FileSystem.regions[var1] & 255) * 64 - Message.baseY * 64; // L: 5859
					if (Client.isInInstance) { // L: 5860
						var3 = 10; // L: 5861
						var4 = 10; // L: 5862
					}

					var0 &= SecureRandomFuture.method2022(var15, var3, var4); // L: 5864
				}
			}

			if (!var0) { // L: 5867
				Client.field552 = 2; // L: 5868
			} else {
				if (Client.field552 != 0) { // L: 5871
					class273.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				class12.playPcmPlayers(); // L: 5872
				Decimator.scene.clear(); // L: 5873

				for (var1 = 0; var1 < 4; ++var1) { // L: 5874
					Client.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) { // L: 5875
					for (var2 = 0; var2 < 104; ++var2) { // L: 5876
						for (var3 = 0; var3 < 104; ++var3) { // L: 5877
							Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 5878
						}
					}
				}

				class12.playPcmPlayers(); // L: 5882
				class116.method2767(); // L: 5883
				var1 = class7.regionLandArchives.length; // L: 5884
				ItemComposition.method3703(); // L: 5885
				AbstractWorldMapData.method4959(true); // L: 5886
				int var5;
				if (!Client.isInInstance) { // L: 5887
					byte[] var14;
					for (var2 = 0; var2 < var1; ++var2) { // L: 5888
						var3 = (FileSystem.regions[var2] >> 8) * 64 - class300.baseX * 64; // L: 5889
						var4 = (FileSystem.regions[var2] & 255) * 64 - Message.baseY * 64; // L: 5890
						var14 = class7.regionLandArchives[var2]; // L: 5891
						if (var14 != null) { // L: 5892
							class12.playPcmPlayers(); // L: 5893
							class433.method7605(var14, var3, var4, WorldMapCacheName.field2868 * 8 - 48, SoundSystem.field319 * 8 - 48, Client.collisionMaps); // L: 5894
						}
					}

					for (var2 = 0; var2 < var1; ++var2) { // L: 5897
						var3 = (FileSystem.regions[var2] >> 8) * 64 - class300.baseX * 64; // L: 5898
						var4 = (FileSystem.regions[var2] & 255) * 64 - Message.baseY * 64; // L: 5899
						var14 = class7.regionLandArchives[var2]; // L: 5900
						if (var14 == null && SoundSystem.field319 < 800) { // L: 5901
							class12.playPcmPlayers(); // L: 5902
							class155.method3235(var3, var4, 64, 64); // L: 5903
						}
					}

					AbstractWorldMapData.method4959(true); // L: 5906

					for (var2 = 0; var2 < var1; ++var2) { // L: 5907
						byte[] var13 = PcmPlayer.regionMapArchives[var2]; // L: 5908
						if (var13 != null) { // L: 5909
							var4 = (FileSystem.regions[var2] >> 8) * 64 - class300.baseX * 64; // L: 5910
							var5 = (FileSystem.regions[var2] & 255) * 64 - Message.baseY * 64; // L: 5911
							class12.playPcmPlayers(); // L: 5912
							Script.method2039(var13, var4, var5, Decimator.scene, Client.collisionMaps); // L: 5913
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.isInInstance) { // L: 5917
					int var9;
					int var10;
					int var11;
					for (var2 = 0; var2 < 4; ++var2) { // L: 5918
						class12.playPcmPlayers(); // L: 5919

						for (var3 = 0; var3 < 13; ++var3) { // L: 5920
							for (var4 = 0; var4 < 13; ++var4) { // L: 5921
								boolean var16 = false; // L: 5922
								var6 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 5923
								if (var6 != -1) { // L: 5924
									var7 = var6 >> 24 & 3; // L: 5925
									var8 = var6 >> 1 & 3; // L: 5926
									var9 = var6 >> 14 & 1023; // L: 5927
									var10 = var6 >> 3 & 2047; // L: 5928
									var11 = (var9 / 8 << 8) + var10 / 8; // L: 5929

									for (int var12 = 0; var12 < FileSystem.regions.length; ++var12) { // L: 5930
										if (FileSystem.regions[var12] == var11 && class7.regionLandArchives[var12] != null) { // L: 5931
											class136.method2954(class7.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, Client.collisionMaps); // L: 5932
											var16 = true; // L: 5933
											break;
										}
									}
								}

								if (!var16) { // L: 5938
									ChatChannel.method2056(var2, var3 * 8, var4 * 8); // L: 5939
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) { // L: 5944
						for (var3 = 0; var3 < 13; ++var3) { // L: 5945
							var4 = Client.instanceChunkTemplates[0][var2][var3]; // L: 5946
							if (var4 == -1) { // L: 5947
								class155.method3235(var2 * 8, var3 * 8, 8, 8); // L: 5948
							}
						}
					}

					AbstractWorldMapData.method4959(true); // L: 5952

					for (var2 = 0; var2 < 4; ++var2) { // L: 5953
						class12.playPcmPlayers(); // L: 5954

						for (var3 = 0; var3 < 13; ++var3) { // L: 5955
							for (var4 = 0; var4 < 13; ++var4) { // L: 5956
								var5 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 5957
								if (var5 != -1) { // L: 5958
									var6 = var5 >> 24 & 3; // L: 5959
									var7 = var5 >> 1 & 3; // L: 5960
									var8 = var5 >> 14 & 1023; // L: 5961
									var9 = var5 >> 3 & 2047; // L: 5962
									var10 = (var8 / 8 << 8) + var9 / 8; // L: 5963

									for (var11 = 0; var11 < FileSystem.regions.length; ++var11) { // L: 5964
										if (FileSystem.regions[var11] == var10 && PcmPlayer.regionMapArchives[var11] != null) { // L: 5965
											Tiles.method2104(PcmPlayer.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, Decimator.scene, Client.collisionMaps); // L: 5966
											break; // L: 5967
										}
									}
								}
							}
						}
					}
				}

				AbstractWorldMapData.method4959(true); // L: 5975
				class12.playPcmPlayers(); // L: 5976
				ClientPreferences.method2401(Decimator.scene, Client.collisionMaps); // L: 5977
				AbstractWorldMapData.method4959(true); // L: 5978
				var2 = Tiles.Tiles_minPlane; // L: 5979
				if (var2 > FriendSystem.Client_plane) { // L: 5980
					var2 = FriendSystem.Client_plane;
				}

				if (var2 < FriendSystem.Client_plane - 1) { // L: 5981
					var2 = FriendSystem.Client_plane - 1;
				}

				if (Client.isLowDetail) { // L: 5982
					Decimator.scene.init(Tiles.Tiles_minPlane);
				} else {
					Decimator.scene.init(0); // L: 5983
				}

				for (var3 = 0; var3 < 104; ++var3) { // L: 5984
					for (var4 = 0; var4 < 104; ++var4) { // L: 5985
						WorldMapManager.updateItemPile(var3, var4); // L: 5986
					}
				}

				class12.playPcmPlayers(); // L: 5989
				class129.method2904(); // L: 5990
				ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 5991
				PacketBufferNode var17;
				if (class329.client.hasFrame()) { // L: 5992
					var17 = class433.getPacketBufferNode(ClientPacket.field3006, Client.packetWriter.isaacCipher); // L: 5994
					var17.packetBuffer.writeInt(1057001181); // L: 5995
					Client.packetWriter.addNode(var17); // L: 5996
				}

				if (!Client.isInInstance) { // L: 5998
					var3 = (WorldMapCacheName.field2868 - 6) / 8; // L: 5999
					var4 = (WorldMapCacheName.field2868 + 6) / 8; // L: 6000
					var5 = (SoundSystem.field319 - 6) / 8; // L: 6001
					var6 = (SoundSystem.field319 + 6) / 8; // L: 6002

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) { // L: 6003
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) { // L: 6004
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) { // L: 6005
								class21.archive9.loadRegionFromName("m" + var7 + "_" + var8); // L: 6006
								class21.archive9.loadRegionFromName("l" + var7 + "_" + var8); // L: 6007
							}
						}
					}
				}

				class82.updateGameState(30); // L: 6011
				class12.playPcmPlayers(); // L: 6012
				class142.method3069(); // L: 6013
				var17 = class433.getPacketBufferNode(ClientPacket.field2993, Client.packetWriter.isaacCipher); // L: 6014
				Client.packetWriter.addNode(var17); // L: 6015
				FriendSystem.method1769(); // L: 6016
			}
		}
	} // L: 5851 5869 6017
}
