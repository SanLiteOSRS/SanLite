import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
public class class149 extends class144 {
	@ObfuscatedName("vm")
	static Iterator field1705;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -2001320945
	)
	int field1703;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 846715435
	)
	int field1707;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 561447973
	)
	int field1702;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -425673859
	)
	int field1704;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class149(class147 var1) {
		this.this$0 = var1; // L: 289
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "1253598633"
	)
	void vmethod3420(Buffer var1) {
		this.field1703 = var1.readInt(); // L: 292
		this.field1704 = var1.readInt(); // L: 293
		this.field1707 = var1.readUnsignedByte(); // L: 294
		this.field1702 = var1.readUnsignedByte(); // L: 295
	} // L: 296

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfp;B)V",
		garbageValue = "-123"
	)
	void vmethod3419(ClanSettings var1) {
		var1.method3252(this.field1703, this.field1704, this.field1707, this.field1702); // L: 299
	} // L: 300

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZB)I",
		garbageValue = "16"
	)
	static int method3186(int var0, Script var1, boolean var2) {
		if (var0 < 1000) { // L: 431
			return class225.method4273(var0, var1, var2);
		} else if (var0 < 1100) { // L: 432
			return class109.method2718(var0, var1, var2);
		} else if (var0 < 1200) { // L: 433
			return TextureProvider.method4931(var0, var1, var2);
		} else if (var0 < 1300) { // L: 434
			return UrlRequester.method2833(var0, var1, var2);
		} else if (var0 < 1400) { // L: 435
			return class414.method7646(var0, var1, var2);
		} else if (var0 < 1500) { // L: 436
			return class324.method6176(var0, var1, var2);
		} else if (var0 < 1600) { // L: 437
			return class141.method3122(var0, var1, var2);
		} else if (var0 < 1700) { // L: 438
			return class154.method3238(var0, var1, var2);
		} else if (var0 < 1800) { // L: 439
			return WorldMapLabelSize.method5243(var0, var1, var2);
		} else if (var0 < 1900) { // L: 440
			return class333.method6238(var0, var1, var2);
		} else if (var0 < 2000) { // L: 441
			return ScriptFrame.method1147(var0, var1, var2);
		} else if (var0 < 2100) { // L: 442
			return class109.method2718(var0, var1, var2);
		} else if (var0 < 2200) { // L: 443
			return TextureProvider.method4931(var0, var1, var2);
		} else if (var0 < 2300) { // L: 444
			return UrlRequester.method2833(var0, var1, var2);
		} else if (var0 < 2400) { // L: 445
			return class414.method7646(var0, var1, var2);
		} else if (var0 < 2500) { // L: 446
			return class324.method6176(var0, var1, var2);
		} else if (var0 < 2600) { // L: 447
			return class20.method271(var0, var1, var2);
		} else if (var0 < 2700) { // L: 448
			return DevicePcmPlayerProvider.method291(var0, var1, var2);
		} else if (var0 < 2800) { // L: 449
			return class472.method8485(var0, var1, var2);
		} else if (var0 < 2900) { // L: 450
			return FontName.method8923(var0, var1, var2);
		} else if (var0 < 3000) { // L: 451
			return ScriptFrame.method1147(var0, var1, var2);
		} else if (var0 < 3200) { // L: 452
			return Varcs.method2747(var0, var1, var2);
		} else if (var0 < 3300) { // L: 453
			return class152.method3220(var0, var1, var2);
		} else if (var0 < 3400) { // L: 454
			return class316.method5941(var0, var1, var2);
		} else if (var0 < 3500) { // L: 455
			return class134.method3072(var0, var1, var2);
		} else if (var0 < 3600) { // L: 456
			return UrlRequester.method2831(var0, var1, var2);
		} else if (var0 < 3700) { // L: 457
			return class135.method3078(var0, var1, var2);
		} else if (var0 < 3800) { // L: 458
			return class93.method2380(var0, var1, var2);
		} else if (var0 < 3900) { // L: 459
			return GrandExchangeOfferOwnWorldComparator.method1192(var0, var1, var2);
		} else if (var0 < 4000) { // L: 460
			return Canvas.method297(var0, var1, var2);
		} else if (var0 < 4100) { // L: 461
			return class191.method3713(var0, var1, var2);
		} else if (var0 < 4200) {
			return class93.method2382(var0, var1, var2); // L: 462
		} else if (var0 < 4300) { // L: 463
			return StructComposition.method4031(var0, var1, var2);
		} else if (var0 < 5100) { // L: 464
			return class107.method2700(var0, var1, var2);
		} else if (var0 < 5400) { // L: 465
			return ClanChannel.method3397(var0, var1, var2);
		} else if (var0 < 5600) { // L: 466
			return RouteStrategy.method4399(var0, var1, var2);
		} else if (var0 < 5700) { // L: 467
			return DevicePcmPlayerProvider.method293(var0, var1, var2);
		} else if (var0 < 6300) { // L: 468
			return class442.method8004(var0, var1, var2);
		} else if (var0 < 6600) { // L: 469
			return Projectile.method2176(var0, var1, var2);
		} else if (var0 < 6700) { // L: 470
			return class347.method6642(var0, var1, var2);
		} else if (var0 < 6800) { // L: 471
			return FloorUnderlayDefinition.method3965(var0, var1, var2);
		} else if (var0 < 6900) { // L: 472
			return WorldMapIcon_1.method5262(var0, var1, var2);
		} else if (var0 < 7000) { // L: 473
			return class185.method3669(var0, var1, var2);
		} else if (var0 < 7100) { // L: 474
			return SceneTilePaint.method5103(var0, var1, var2);
		} else if (var0 < 7200) { // L: 475
			return RouteStrategy.method4397(var0, var1, var2);
		} else if (var0 < 7300) { // L: 476
			return class276.method5577(var0, var1, var2);
		} else if (var0 < 7500) { // L: 477
			return GameEngine.method620(var0, var1, var2);
		} else if (var0 < 7600) { // L: 478
			return class19.method270(var0, var1, var2);
		} else if (var0 < 7700) { // L: 479
			return UserComparator3.method2906(var0, var1, var2);
		} else {
			return var0 < 8100 ? class227.method4309(var0, var1, var2) : 2; // L: 480 481
		}
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(ZLun;I)V",
		garbageValue = "-1924647945"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0; // L: 5905
		int var2;
		int var3;
		int var5;
		int var6;
		int var7;
		if (!Client.isInInstance) { // L: 5906
			var2 = var1.method9318(); // L: 5910
			var3 = var1.method9318(); // L: 5911
			var1.method9308(); // L: 5912
			int var4 = var1.readUnsignedShort(); // L: 5913
			MusicPatchPcmStream.field3569 = new int[var4][4]; // L: 5914

			for (var5 = 0; var5 < var4; ++var5) { // L: 5915
				for (var6 = 0; var6 < 4; ++var6) { // L: 5916
					MusicPatchPcmStream.field3569[var5][var6] = var1.readInt(); // L: 5917
				}
			}

			PcmPlayer.field290 = new int[var4]; // L: 5920
			class390.field4507 = new int[var4]; // L: 5921
			Tile.field2599 = new int[var4]; // L: 5922
			class73.field906 = new byte[var4][]; // L: 5923
			class127.field1528 = new byte[var4][]; // L: 5924
			var4 = 0; // L: 5925

			for (var5 = (var2 - 6) / 8; var5 <= (var2 + 6) / 8; ++var5) { // L: 5926
				for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) { // L: 5927
					var7 = var6 + (var5 << 8); // L: 5928
					PcmPlayer.field290[var4] = var7; // L: 5929
					class390.field4507[var4] = class73.field909.getGroupId("m" + var5 + "_" + var6); // L: 5930
					Tile.field2599[var4] = class73.field909.getGroupId("l" + var5 + "_" + var6); // L: 5931
					++var4; // L: 5932
				}
			}

			InvDefinition.method3708(var2, var3, true); // L: 5935
		} else {
			var2 = var1.readUnsignedShort(); // L: 5938
			var3 = var1.method9321(); // L: 5939
			boolean var15 = var1.method9462() == 1; // L: 5940
			var5 = var1.readUnsignedShort(); // L: 5941
			var1.importIndex(); // L: 5942

			int var8;
			int var9;
			for (var6 = 0; var6 < 4; ++var6) { // L: 5943
				for (var7 = 0; var7 < 13; ++var7) { // L: 5944
					for (var8 = 0; var8 < 13; ++var8) { // L: 5945
						var9 = var1.readBits(1); // L: 5946
						if (var9 == 1) {
							Client.field585[var6][var7][var8] = var1.readBits(26); // L: 5947
						} else {
							Client.field585[var6][var7][var8] = -1; // L: 5948
						}
					}
				}
			}

			var1.exportIndex(); // L: 5952
			MusicPatchPcmStream.field3569 = new int[var5][4]; // L: 5953

			for (var6 = 0; var6 < var5; ++var6) { // L: 5954
				for (var7 = 0; var7 < 4; ++var7) { // L: 5955
					MusicPatchPcmStream.field3569[var6][var7] = var1.readInt(); // L: 5956
				}
			}

			PcmPlayer.field290 = new int[var5]; // L: 5959
			class390.field4507 = new int[var5]; // L: 5960
			Tile.field2599 = new int[var5]; // L: 5961
			class73.field906 = new byte[var5][]; // L: 5962
			class127.field1528 = new byte[var5][]; // L: 5963
			var5 = 0; // L: 5964

			for (var6 = 0; var6 < 4; ++var6) { // L: 5965
				for (var7 = 0; var7 < 13; ++var7) { // L: 5966
					for (var8 = 0; var8 < 13; ++var8) { // L: 5967
						var9 = Client.field585[var6][var7][var8]; // L: 5968
						if (var9 != -1) { // L: 5969
							int var10 = var9 >> 14 & 1023; // L: 5970
							int var11 = var9 >> 3 & 2047; // L: 5971
							int var12 = (var10 / 8 << 8) + var11 / 8; // L: 5972

							int var13;
							for (var13 = 0; var13 < var5; ++var13) { // L: 5973
								if (PcmPlayer.field290[var13] == var12) {
									var12 = -1; // L: 5974
									break; // L: 5975
								}
							}

							if (var12 != -1) { // L: 5977
								PcmPlayer.field290[var5] = var12; // L: 5978
								var13 = var12 >> 8 & 255; // L: 5979
								int var14 = var12 & 255; // L: 5980
								class390.field4507[var5] = class73.field909.getGroupId("m" + var13 + "_" + var14); // L: 5981
								Tile.field2599[var5] = class73.field909.getGroupId("l" + var13 + "_" + var14); // L: 5982
								++var5; // L: 5983
							}
						}
					}
				}
			}

			InvDefinition.method3708(var2, var3, !var15); // L: 5989
		}

	} // L: 5991
}
