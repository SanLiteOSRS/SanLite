import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
public class class150 extends class128 {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 182134033
	)
	static int field1677;
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = -241255257
	)
	@Export("selectedItemWidget")
	static int selectedItemWidget;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		longValue = -4544622703293666003L
	)
	long field1685;
	@ObfuscatedName("h")
	String field1678;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lei;)V"
	)
	class150(class131 var1) {
		this.this$0 = var1;
		this.field1685 = -1L; // L: 194
		this.field1678 = null; // L: 195
	} // L: 197

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-885940784"
	)
	void vmethod3087(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 200
			--var1.offset; // L: 201
			this.field1685 = var1.readLong(); // L: 202
		}

		this.field1678 = var1.readStringCp1252NullTerminatedOrNull(); // L: 204
	} // L: 205

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Leh;B)V",
		garbageValue = "0"
	)
	void vmethod3084(ClanSettings var1) {
		var1.method2908(this.field1685, this.field1678); // L: 208
	} // L: 209

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lls;Ljava/lang/String;Ljava/lang/String;I)Lqe;",
		garbageValue = "-1617212274"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1); // L: 143
		int var4 = var0.getFileId(var3, var2); // L: 144
		return Clock.method3260(var0, var3, var4); // L: 145
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "137192030"
	)
	static final void method3071() {
		class6.method45(false); // L: 5648
		Client.field670 = 0; // L: 5649
		boolean var0 = true; // L: 5650

		int var1;
		for (var1 = 0; var1 < TaskHandler.regionLandArchives.length; ++var1) { // L: 5651
			if (Archive.regionMapArchiveIds[var1] != -1 && TaskHandler.regionLandArchives[var1] == null) { // L: 5652 5653
				TaskHandler.regionLandArchives[var1] = class120.archive9.takeFile(Archive.regionMapArchiveIds[var1], 0); // L: 5654
				if (TaskHandler.regionLandArchives[var1] == null) { // L: 5655
					var0 = false; // L: 5656
					++Client.field670; // L: 5657
				}
			}

			if (NetFileRequest.regionLandArchiveIds[var1] != -1 && Varcs.regionMapArchives[var1] == null) { // L: 5661 5662
				Varcs.regionMapArchives[var1] = class120.archive9.takeFileEncrypted(NetFileRequest.regionLandArchiveIds[var1], 0, class220.xteaKeys[var1]); // L: 5663
				if (Varcs.regionMapArchives[var1] == null) { // L: 5664
					var0 = false; // L: 5665
					++Client.field670; // L: 5666
				}
			}
		}

		if (!var0) { // L: 5671
			Client.field539 = 1; // L: 5672
		} else {
			Client.field644 = 0; // L: 5675
			var0 = true; // L: 5676

			int var3;
			int var4;
			for (var1 = 0; var1 < TaskHandler.regionLandArchives.length; ++var1) { // L: 5677
				byte[] var15 = Varcs.regionMapArchives[var1]; // L: 5678
				if (var15 != null) { // L: 5679
					var3 = (class394.regions[var1] >> 8) * 64 - Decimator.baseX * 64; // L: 5680
					var4 = (class394.regions[var1] & 255) * 64 - class7.baseY * 64; // L: 5681
					if (Client.isInInstance) { // L: 5682
						var3 = 10; // L: 5683
						var4 = 10; // L: 5684
					}

					var0 &= class140.method2968(var15, var3, var4); // L: 5686
				}
			}

			if (!var0) { // L: 5689
				Client.field539 = 2; // L: 5690
			} else {
				if (Client.field539 != 0) { // L: 5693
					class20.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				class83.playPcmPlayers(); // L: 5694
				class12.scene.clear(); // L: 5695

				for (var1 = 0; var1 < 4; ++var1) { // L: 5696
					Client.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) { // L: 5697
					for (var2 = 0; var2 < 104; ++var2) { // L: 5698
						for (var3 = 0; var3 < 104; ++var3) { // L: 5699
							Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 5700
						}
					}
				}

				class83.playPcmPlayers(); // L: 5704
				class19.method284(); // L: 5705
				var1 = TaskHandler.regionLandArchives.length; // L: 5706
				class83.method2085(); // L: 5707
				class6.method45(true); // L: 5708
				int var5;
				if (!Client.isInInstance) { // L: 5709
					byte[] var14;
					for (var2 = 0; var2 < var1; ++var2) { // L: 5710
						var3 = (class394.regions[var2] >> 8) * 64 - Decimator.baseX * 64; // L: 5711
						var4 = (class394.regions[var2] & 255) * 64 - class7.baseY * 64; // L: 5712
						var14 = TaskHandler.regionLandArchives[var2]; // L: 5713
						if (var14 != null) { // L: 5714
							class83.playPcmPlayers(); // L: 5715
							Script.method1948(var14, var3, var4, class352.field4196 * 8 - 48, class20.field105 * 8 - 48, Client.collisionMaps); // L: 5716
						}
					}

					for (var2 = 0; var2 < var1; ++var2) { // L: 5719
						var3 = (class394.regions[var2] >> 8) * 64 - Decimator.baseX * 64; // L: 5720
						var4 = (class394.regions[var2] & 255) * 64 - class7.baseY * 64; // L: 5721
						var14 = TaskHandler.regionLandArchives[var2]; // L: 5722
						if (var14 == null && class20.field105 < 800) { // L: 5723
							class83.playPcmPlayers(); // L: 5724
							class125.method2776(var3, var4, 64, 64); // L: 5725
						}
					}

					class6.method45(true); // L: 5728

					for (var2 = 0; var2 < var1; ++var2) { // L: 5729
						byte[] var13 = Varcs.regionMapArchives[var2]; // L: 5730
						if (var13 != null) { // L: 5731
							var4 = (class394.regions[var2] >> 8) * 64 - Decimator.baseX * 64; // L: 5732
							var5 = (class394.regions[var2] & 255) * 64 - class7.baseY * 64; // L: 5733
							class83.playPcmPlayers(); // L: 5734
							class12.method157(var13, var4, var5, class12.scene, Client.collisionMaps); // L: 5735
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.isInInstance) { // L: 5739
					int var9;
					int var10;
					int var11;
					for (var2 = 0; var2 < 4; ++var2) { // L: 5740
						class83.playPcmPlayers(); // L: 5741

						for (var3 = 0; var3 < 13; ++var3) { // L: 5742
							for (var4 = 0; var4 < 13; ++var4) { // L: 5743
								boolean var16 = false; // L: 5744
								var6 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 5745
								if (var6 != -1) { // L: 5746
									var7 = var6 >> 24 & 3; // L: 5747
									var8 = var6 >> 1 & 3; // L: 5748
									var9 = var6 >> 14 & 1023; // L: 5749
									var10 = var6 >> 3 & 2047; // L: 5750
									var11 = (var9 / 8 << 8) + var10 / 8; // L: 5751

									for (int var12 = 0; var12 < class394.regions.length; ++var12) { // L: 5752
										if (class394.regions[var12] == var11 && TaskHandler.regionLandArchives[var12] != null) { // L: 5753
											ItemComposition.method3657(TaskHandler.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, Client.collisionMaps); // L: 5754
											var16 = true; // L: 5755
											break;
										}
									}
								}

								if (!var16) { // L: 5760
									ArchiveDisk.method6835(var2, var3 * 8, var4 * 8); // L: 5761
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) { // L: 5766
						for (var3 = 0; var3 < 13; ++var3) { // L: 5767
							var4 = Client.instanceChunkTemplates[0][var2][var3]; // L: 5768
							if (var4 == -1) { // L: 5769
								class125.method2776(var2 * 8, var3 * 8, 8, 8); // L: 5770
							}
						}
					}

					class6.method45(true); // L: 5774

					for (var2 = 0; var2 < 4; ++var2) { // L: 5775
						class83.playPcmPlayers(); // L: 5776

						for (var3 = 0; var3 < 13; ++var3) { // L: 5777
							for (var4 = 0; var4 < 13; ++var4) { // L: 5778
								var5 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 5779
								if (var5 != -1) { // L: 5780
									var6 = var5 >> 24 & 3; // L: 5781
									var7 = var5 >> 1 & 3; // L: 5782
									var8 = var5 >> 14 & 1023; // L: 5783
									var9 = var5 >> 3 & 2047; // L: 5784
									var10 = (var8 / 8 << 8) + var9 / 8; // L: 5785

									for (var11 = 0; var11 < class394.regions.length; ++var11) { // L: 5786
										if (class394.regions[var11] == var10 && Varcs.regionMapArchives[var11] != null) { // L: 5787
											Tiles.method2011(Varcs.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, class12.scene, Client.collisionMaps); // L: 5788
											break; // L: 5789
										}
									}
								}
							}
						}
					}
				}

				class6.method45(true); // L: 5797
				class83.playPcmPlayers(); // L: 5798
				Nameable.method6633(class12.scene, Client.collisionMaps); // L: 5799
				class6.method45(true); // L: 5800
				var2 = Tiles.Tiles_minPlane; // L: 5801
				if (var2 > class268.Client_plane) { // L: 5802
					var2 = class268.Client_plane;
				}

				if (var2 < class268.Client_plane - 1) { // L: 5803
					var2 = class268.Client_plane - 1;
				}

				if (Client.isLowDetail) { // L: 5804
					class12.scene.init(Tiles.Tiles_minPlane);
				} else {
					class12.scene.init(0); // L: 5805
				}

				for (var3 = 0; var3 < 104; ++var3) { // L: 5806
					for (var4 = 0; var4 < 104; ++var4) { // L: 5807
						class360.updateItemPile(var3, var4); // L: 5808
					}
				}

				class83.playPcmPlayers(); // L: 5811
				MouseRecorder.method2070(); // L: 5812
				ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 5813
				PacketBufferNode var17;
				if (AbstractByteArrayCopier.client.hasFrame()) { // L: 5814
					var17 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3012, Client.packetWriter.isaacCipher); // L: 5816
					var17.packetBuffer.writeInt(1057001181); // L: 5817
					Client.packetWriter.addNode(var17); // L: 5818
				}

				if (!Client.isInInstance) { // L: 5820
					var3 = (class352.field4196 - 6) / 8; // L: 5821
					var4 = (class352.field4196 + 6) / 8; // L: 5822
					var5 = (class20.field105 - 6) / 8; // L: 5823
					var6 = (class20.field105 + 6) / 8; // L: 5824

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) { // L: 5825
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) { // L: 5826
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) { // L: 5827
								class120.archive9.loadRegionFromName("m" + var7 + "_" + var8); // L: 5828
								class120.archive9.loadRegionFromName("l" + var7 + "_" + var8); // L: 5829
							}
						}
					}
				}

				class4.updateGameState(30); // L: 5833
				class83.playPcmPlayers(); // L: 5834
				class144.method3011(); // L: 5835
				var17 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2948, Client.packetWriter.isaacCipher); // L: 5836
				Client.packetWriter.addNode(var17); // L: 5837
				class82.method2078(); // L: 5838
			}
		}
	} // L: 5673 5691 5839
}
