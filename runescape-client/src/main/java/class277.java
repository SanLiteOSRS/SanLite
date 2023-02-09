import java.util.concurrent.ThreadPoolExecutor;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
public class class277 {
	@ObfuscatedName("n")
	static ThreadPoolExecutor field3059;

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "1"
	)
	@Export("ByteArrayPool_release")
	public static synchronized void ByteArrayPool_release(byte[] var0) {
		if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4450) { // L: 98
			ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0; // L: 99
		} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4455) { // L: 102
			ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0; // L: 103
		} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4456) { // L: 106
			ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0; // L: 107
		} else if (var0.length == 30000 && ByteArrayPool.field4449 < ByteArrayPool.field4452) { // L: 110
			ByteArrayPool.field4453[++ByteArrayPool.field4449 - 1] = var0; // L: 111
		} else {
			if (class9.ByteArrayPool_arrays != null) { // L: 114
				for (int var1 = 0; var1 < class172.ByteArrayPool_alternativeSizes.length; ++var1) { // L: 115
					if (var0.length == class172.ByteArrayPool_alternativeSizes[var1] && class132.ByteArrayPool_altSizeArrayCounts[var1] < class9.ByteArrayPool_arrays[var1].length) { // L: 116
						class9.ByteArrayPool_arrays[var1][class132.ByteArrayPool_altSizeArrayCounts[var1]++] = var0; // L: 117
						return; // L: 118
					}
				}
			}

		}
	} // L: 100 104 108 112 122

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(ZLru;I)V",
		garbageValue = "-422348078"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0; // L: 5793
		int var2;
		int var4;
		int var5;
		int var6;
		int var7;
		if (!Client.isInInstance) { // L: 5794
			var2 = var1.method8714(); // L: 5795
			int var3 = var1.method8719(); // L: 5796
			var4 = var1.readUnsignedShort(); // L: 5797
			GrandExchangeOffer.xteaKeys = new int[var4][4]; // L: 5798

			for (var5 = 0; var5 < var4; ++var5) { // L: 5799
				for (var6 = 0; var6 < 4; ++var6) { // L: 5800
					GrandExchangeOffer.xteaKeys[var5][var6] = var1.readInt(); // L: 5801
				}
			}

			MusicPatch.regions = new int[var4]; // L: 5804
			Renderable.regionMapArchiveIds = new int[var4]; // L: 5805
			class217.regionLandArchiveIds = new int[var4]; // L: 5806
			class4.regionLandArchives = new byte[var4][]; // L: 5807
			class323.regionMapArchives = new byte[var4][]; // L: 5808
			var4 = 0; // L: 5809

			for (var5 = (var3 - 6) / 8; var5 <= (var3 + 6) / 8; ++var5) { // L: 5810
				for (var6 = (var2 - 6) / 8; var6 <= (var2 + 6) / 8; ++var6) { // L: 5811
					var7 = var6 + (var5 << 8); // L: 5812
					MusicPatch.regions[var4] = var7; // L: 5813
					Renderable.regionMapArchiveIds[var4] = NetCache.field4260.getGroupId("m" + var5 + "_" + var6); // L: 5814
					class217.regionLandArchiveIds[var4] = NetCache.field4260.getGroupId("l" + var5 + "_" + var6); // L: 5815
					++var4; // L: 5816
				}
			}

			KeyHandler.method432(var3, var2, true); // L: 5819
		} else {
			var2 = var1.method8714(); // L: 5822
			boolean var15 = var1.readUnsignedByte() == 1; // L: 5823
			var4 = var1.readUnsignedShort(); // L: 5824
			var5 = var1.readUnsignedShort(); // L: 5825
			var1.importIndex(); // L: 5826

			int var8;
			int var9;
			for (var6 = 0; var6 < 4; ++var6) { // L: 5827
				for (var7 = 0; var7 < 13; ++var7) { // L: 5828
					for (var8 = 0; var8 < 13; ++var8) { // L: 5829
						var9 = var1.readBits(1); // L: 5830
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26); // L: 5831
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1; // L: 5832
						}
					}
				}
			}

			var1.exportIndex(); // L: 5836
			GrandExchangeOffer.xteaKeys = new int[var5][4]; // L: 5837

			for (var6 = 0; var6 < var5; ++var6) { // L: 5838
				for (var7 = 0; var7 < 4; ++var7) { // L: 5839
					GrandExchangeOffer.xteaKeys[var6][var7] = var1.readInt(); // L: 5840
				}
			}

			MusicPatch.regions = new int[var5]; // L: 5843
			Renderable.regionMapArchiveIds = new int[var5]; // L: 5844
			class217.regionLandArchiveIds = new int[var5]; // L: 5845
			class4.regionLandArchives = new byte[var5][]; // L: 5846
			class323.regionMapArchives = new byte[var5][]; // L: 5847
			var5 = 0; // L: 5848

			for (var6 = 0; var6 < 4; ++var6) { // L: 5849
				for (var7 = 0; var7 < 13; ++var7) { // L: 5850
					for (var8 = 0; var8 < 13; ++var8) { // L: 5851
						var9 = Client.instanceChunkTemplates[var6][var7][var8]; // L: 5852
						if (var9 != -1) { // L: 5853
							int var10 = var9 >> 14 & 1023; // L: 5854
							int var11 = var9 >> 3 & 2047; // L: 5855
							int var12 = (var10 / 8 << 8) + var11 / 8; // L: 5856

							int var13;
							for (var13 = 0; var13 < var5; ++var13) { // L: 5857
								if (MusicPatch.regions[var13] == var12) {
									var12 = -1; // L: 5858
									break; // L: 5859
								}
							}

							if (var12 != -1) { // L: 5861
								MusicPatch.regions[var5] = var12; // L: 5862
								var13 = var12 >> 8 & 255; // L: 5863
								int var14 = var12 & 255; // L: 5864
								Renderable.regionMapArchiveIds[var5] = NetCache.field4260.getGroupId("m" + var13 + "_" + var14); // L: 5865
								class217.regionLandArchiveIds[var5] = NetCache.field4260.getGroupId("l" + var13 + "_" + var14); // L: 5866
								++var5; // L: 5867
							}
						}
					}
				}
			}

			KeyHandler.method432(var4, var2, !var15); // L: 5873
		}

	} // L: 5875
}
