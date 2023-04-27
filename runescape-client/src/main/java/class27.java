import java.awt.FontMetrics;
import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
public class class27 {
	@ObfuscatedName("bi")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("aq")
	int[] field140;
	@ObfuscatedName("al")
	int[] field146;

	public class27() {
		this.field140 = new int[112]; // L: 12
		this.field146 = new int[192]; // L: 13
		Arrays.fill(this.field140, 3); // L: 16
		Arrays.fill(this.field146, 3); // L: 17
	} // L: 18

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	public void method407(int var1, int var2) {
		if (this.method414(var1) && this.method427(var2)) { // L: 21
			this.field140[var1] = var2; // L: 22
		}

	} // L: 24

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CII)V",
		garbageValue = "48495477"
	)
	public void method408(char var1, int var2) {
		if (this.method446(var1) && this.method427(var2)) { // L: 27
			this.field146[var1] = var2; // L: 28
		}

	} // L: 30

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-428082252"
	)
	public int method409(int var1) {
		return this.method414(var1) ? this.field140[var1] : 0; // L: 33 34 36
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(CB)I",
		garbageValue = "32"
	)
	public int method410(char var1) {
		return this.method446(var1) ? this.field146[var1] : 0; // L: 40 41 43
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1749930084"
	)
	public boolean method411(int var1) {
		return this.method414(var1) && (this.field140[var1] == 1 || this.field140[var1] == 3); // L: 47
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-528043848"
	)
	public boolean method412(char var1) {
		return this.method446(var1) && (this.field146[var1] == 1 || this.field146[var1] == 3); // L: 51
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1380991347"
	)
	public boolean method413(int var1) {
		return this.method414(var1) && (this.field140[var1] == 2 || this.field140[var1] == 3); // L: 55
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1152812714"
	)
	public boolean method441(char var1) {
		return this.method446(var1) && (this.field146[var1] == 2 || this.field146[var1] == 3); // L: 59
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2137123671"
	)
	boolean method414(int var1) {
		if (var1 >= 0 && var1 < 112) { // L: 63
			return true; // L: 67
		} else {
			System.out.println("Invalid keycode: " + var1); // L: 64
			return false; // L: 65
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1305668583"
	)
	boolean method446(char var1) {
		if (var1 >= 0 && var1 < 192) { // L: 71
			return true; // L: 75
		} else {
			System.out.println("Invalid keychar: " + var1); // L: 72
			return false; // L: 73
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1805766557"
	)
	boolean method427(int var1) {
		if (var1 >= 0 && var1 < 4) { // L: 79
			return true; // L: 83
		} else {
			System.out.println("Invalid mode: " + var1); // L: 80
			return false; // L: 81
		}
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-52"
	)
	static final void method418() {
		Language.method6931(false); // L: 5693
		Client.field559 = 0; // L: 5694
		boolean var0 = true; // L: 5695

		int var1;
		for (var1 = 0; var1 < class4.regionLandArchives.length; ++var1) { // L: 5696
			if (FontName.regionMapArchiveIds[var1] != -1 && class4.regionLandArchives[var1] == null) { // L: 5697 5698
				class4.regionLandArchives[var1] = GrandExchangeOfferTotalQuantityComparator.archive9.takeFile(FontName.regionMapArchiveIds[var1], 0); // L: 5699
				if (class4.regionLandArchives[var1] == null) { // L: 5700
					var0 = false; // L: 5701
					++Client.field559; // L: 5702
				}
			}

			if (Archive.regionLandArchiveIds[var1] != -1 && ObjectSound.regionMapArchives[var1] == null) { // L: 5706 5707
				ObjectSound.regionMapArchives[var1] = GrandExchangeOfferTotalQuantityComparator.archive9.takeFileEncrypted(Archive.regionLandArchiveIds[var1], 0, GameObject.xteaKeys[var1]); // L: 5708
				if (ObjectSound.regionMapArchives[var1] == null) { // L: 5709
					var0 = false; // L: 5710
					++Client.field559; // L: 5711
				}
			}
		}

		if (!var0) { // L: 5716
			Client.field621 = 1; // L: 5717
		} else {
			Client.field557 = 0; // L: 5720
			var0 = true; // L: 5721

			int var3;
			int var4;
			for (var1 = 0; var1 < class4.regionLandArchives.length; ++var1) { // L: 5722
				byte[] var17 = ObjectSound.regionMapArchives[var1]; // L: 5723
				if (var17 != null) { // L: 5724
					var3 = (WorldMapAreaData.regions[var1] >> 8) * 64 - WorldMapData_0.baseX * 64; // L: 5725
					var4 = (WorldMapAreaData.regions[var1] & 255) * 64 - GameObject.baseY * 64; // L: 5726
					if (Client.isInInstance) { // L: 5727
						var3 = 10; // L: 5728
						var4 = 10; // L: 5729
					}

					var0 &= KitDefinition.method3685(var17, var3, var4); // L: 5731
				}
			}

			if (!var0) { // L: 5734
				Client.field621 = 2; // L: 5735
			} else {
				if (Client.field621 != 0) { // L: 5738
					WorldMapDecoration.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				class323.playPcmPlayers(); // L: 5739
				class31.scene.clear(); // L: 5740

				for (var1 = 0; var1 < 4; ++var1) { // L: 5741
					Client.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) { // L: 5742
					for (var2 = 0; var2 < 104; ++var2) { // L: 5743
						for (var3 = 0; var3 < 104; ++var3) { // L: 5744
							Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 5745
						}
					}
				}

				class323.playPcmPlayers(); // L: 5749
				class137.method3197(); // L: 5750
				var1 = class4.regionLandArchives.length; // L: 5751
				StructComposition.method3926(); // L: 5752
				Language.method6931(true); // L: 5753
				int var5;
				if (!Client.isInInstance) { // L: 5754
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) { // L: 5755
						var3 = (WorldMapAreaData.regions[var2] >> 8) * 64 - WorldMapData_0.baseX * 64; // L: 5756
						var4 = (WorldMapAreaData.regions[var2] & 255) * 64 - GameObject.baseY * 64; // L: 5757
						var16 = class4.regionLandArchives[var2]; // L: 5758
						if (var16 != null) { // L: 5759
							class323.playPcmPlayers(); // L: 5760
							DecorativeObject.method5024(var16, var3, var4, KeyHandler.field164 * 8 - 48, class425.field4671 * 8 - 48, Client.collisionMaps); // L: 5761
						}
					}

					for (var2 = 0; var2 < var1; ++var2) { // L: 5764
						var3 = (WorldMapAreaData.regions[var2] >> 8) * 64 - WorldMapData_0.baseX * 64; // L: 5765
						var4 = (WorldMapAreaData.regions[var2] & 255) * 64 - GameObject.baseY * 64; // L: 5766
						var16 = class4.regionLandArchives[var2]; // L: 5767
						if (var16 == null && class425.field4671 < 800) { // L: 5768
							class323.playPcmPlayers(); // L: 5769
							class122.method3044(var3, var4, 64, 64); // L: 5770
						}
					}

					Language.method6931(true); // L: 5773

					for (var2 = 0; var2 < var1; ++var2) { // L: 5774
						byte[] var15 = ObjectSound.regionMapArchives[var2]; // L: 5775
						if (var15 != null) { // L: 5776
							var4 = (WorldMapAreaData.regions[var2] >> 8) * 64 - WorldMapData_0.baseX * 64; // L: 5777
							var5 = (WorldMapAreaData.regions[var2] & 255) * 64 - GameObject.baseY * 64; // L: 5778
							class323.playPcmPlayers(); // L: 5779
							class147.method3277(var15, var4, var5, class31.scene, Client.collisionMaps); // L: 5780
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.isInInstance) { // L: 5784
					int var9;
					int var10;
					int var11;
					for (var2 = 0; var2 < 4; ++var2) { // L: 5785
						class323.playPcmPlayers(); // L: 5786

						for (var3 = 0; var3 < 13; ++var3) { // L: 5787
							for (var4 = 0; var4 < 13; ++var4) { // L: 5788
								boolean var18 = false; // L: 5789
								var6 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 5790
								if (var6 != -1) { // L: 5791
									var7 = var6 >> 24 & 3; // L: 5792
									var8 = var6 >> 1 & 3; // L: 5793
									var9 = var6 >> 14 & 1023; // L: 5794
									var10 = var6 >> 3 & 2047; // L: 5795
									var11 = (var9 / 8 << 8) + var10 / 8; // L: 5796

									for (int var12 = 0; var12 < WorldMapAreaData.regions.length; ++var12) { // L: 5797
										if (WorldMapAreaData.regions[var12] == var11 && class4.regionLandArchives[var12] != null) { // L: 5798
											int var13 = (var9 - var3) * 8; // L: 5799
											int var14 = (var10 - var4) * 8; // L: 5800
											class19.method294(class4.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14, Client.collisionMaps); // L: 5801
											var18 = true; // L: 5802
											break;
										}
									}
								}

								if (!var18) { // L: 5807
									TextureProvider.method4737(var2, var3 * 8, var4 * 8); // L: 5808
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) { // L: 5813
						for (var3 = 0; var3 < 13; ++var3) { // L: 5814
							var4 = Client.instanceChunkTemplates[0][var2][var3]; // L: 5815
							if (var4 == -1) { // L: 5816
								class122.method3044(var2 * 8, var3 * 8, 8, 8); // L: 5817
							}
						}
					}

					Language.method6931(true); // L: 5821

					for (var2 = 0; var2 < 4; ++var2) { // L: 5822
						class323.playPcmPlayers(); // L: 5823

						for (var3 = 0; var3 < 13; ++var3) { // L: 5824
							for (var4 = 0; var4 < 13; ++var4) { // L: 5825
								var5 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 5826
								if (var5 != -1) { // L: 5827
									var6 = var5 >> 24 & 3; // L: 5828
									var7 = var5 >> 1 & 3; // L: 5829
									var8 = var5 >> 14 & 1023; // L: 5830
									var9 = var5 >> 3 & 2047; // L: 5831
									var10 = (var8 / 8 << 8) + var9 / 8; // L: 5832

									for (var11 = 0; var11 < WorldMapAreaData.regions.length; ++var11) { // L: 5833
										if (WorldMapAreaData.regions[var11] == var10 && ObjectSound.regionMapArchives[var11] != null) { // L: 5834
											Tiles.method2166(ObjectSound.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, class31.scene, Client.collisionMaps); // L: 5835
											break; // L: 5836
										}
									}
								}
							}
						}
					}
				}

				Language.method6931(true); // L: 5844
				class323.playPcmPlayers(); // L: 5845
				class10.method98(class31.scene, Client.collisionMaps); // L: 5846
				Language.method6931(true); // L: 5847
				var2 = Tiles.Tiles_minPlane; // L: 5848
				if (var2 > GameEngine.Client_plane) { // L: 5849
					var2 = GameEngine.Client_plane;
				}

				if (var2 < GameEngine.Client_plane - 1) { // L: 5850
					var2 = GameEngine.Client_plane - 1;
				}

				if (Client.isLowDetail) { // L: 5851
					class31.scene.init(Tiles.Tiles_minPlane);
				} else {
					class31.scene.init(0); // L: 5852
				}

				for (var3 = 0; var3 < 104; ++var3) { // L: 5853
					for (var4 = 0; var4 < 104; ++var4) { // L: 5854
						class121.updateItemPile(var3, var4); // L: 5855
					}
				}

				class323.playPcmPlayers(); // L: 5858
				class25.method379(); // L: 5859
				ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 5860
				PacketBufferNode var19;
				if (ScriptFrame.client.hasFrame()) { // L: 5861
					var19 = class330.getPacketBufferNode(ClientPacket.field3134, Client.packetWriter.isaacCipher); // L: 5863
					var19.packetBuffer.writeInt(1057001181); // L: 5864
					Client.packetWriter.addNode(var19); // L: 5865
				}

				if (!Client.isInInstance) { // L: 5867
					var3 = (KeyHandler.field164 - 6) / 8; // L: 5868
					var4 = (KeyHandler.field164 + 6) / 8; // L: 5869
					var5 = (class425.field4671 - 6) / 8; // L: 5870
					var6 = (class425.field4671 + 6) / 8; // L: 5871

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) { // L: 5872
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) { // L: 5873
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) { // L: 5874
								GrandExchangeOfferTotalQuantityComparator.archive9.loadRegionFromName("m" + var7 + "_" + var8); // L: 5875
								GrandExchangeOfferTotalQuantityComparator.archive9.loadRegionFromName("l" + var7 + "_" + var8); // L: 5876
							}
						}
					}
				}

				class138.method3208(30); // L: 5880
				class323.playPcmPlayers(); // L: 5881
				Renderable.method4701(); // L: 5882
				var19 = class330.getPacketBufferNode(ClientPacket.field3172, Client.packetWriter.isaacCipher); // L: 5883
				Client.packetWriter.addNode(var19); // L: 5884
				NPC.method2628(); // L: 5885
			}
		}
	} // L: 5718 5736 5886
}
