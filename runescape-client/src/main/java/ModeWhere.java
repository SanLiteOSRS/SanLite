import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ok")
@Implements("ModeWhere")
public enum ModeWhere implements class383 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4417("", 0, new class382[]{class382.field4393, class382.field4392}),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4414("", 1, new class382[]{class382.field4390, class382.field4393, class382.field4392}),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4415("", 2, new class382[]{class382.field4390, class382.field4391, class382.field4393}),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4416("", 3, new class382[]{class382.field4390}),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4419("", 4),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4424("", 5, new class382[]{class382.field4390, class382.field4393}),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4431("", 6, new class382[]{class382.field4393}),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4420("", 8, new class382[]{class382.field4390, class382.field4393}),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4421("", 9, new class382[]{class382.field4390, class382.field4391}),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4422("", 10, new class382[]{class382.field4390}),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4423("", 11, new class382[]{class382.field4390}),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4428("", 12, new class382[]{class382.field4390, class382.field4393}),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4413("", 13, new class382[]{class382.field4390});

	@ObfuscatedName("bk")
	static String field4426;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -55608669
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ay")
	final Set field4427;

	static {
		method7209(); // L: 26
	} // L: 27

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lot;)V"
	)
	ModeWhere(String var3, int var4, class382[] var5) {
		this.field4427 = new HashSet();
		this.id = var4;
		class382[] var6 = var5; // L: 43

		for (int var7 = 0; var7 < var6.length; ++var7) { // L: 44
			class382 var8 = var6[var7];
			this.field4427.add(var8); // L: 46
		}

	}

	ModeWhere(String var3, int var4) {
		this.field4427 = new HashSet(); // L: 30
		this.id = var4; // L: 37
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 53
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Lok;",
		garbageValue = "435699803"
	)
	static ModeWhere[] method7209() {
		return new ModeWhere[]{field4421, field4413, field4428, field4420, field4419, field4415, field4417, field4423, field4424, field4414, field4431, field4422, field4416}; // L: 33
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldt;",
		garbageValue = "-1608087816"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = class10.method109(var1, var0); // L: 38
		Script var4 = WorldMapData_1.method4789(var3, var0); // L: 39
		if (var4 != null) { // L: 40
			return var4; // L: 41
		} else {
			int var5 = (-3 - var2 << 8) + var0; // L: 45
			var4 = WorldMapData_1.method4789(var5, var0); // L: 48
			if (var4 != null) { // L: 49
				return var4; // L: 50
			} else {
				int var6 = var0 + -512; // L: 54
				var4 = WorldMapData_1.method4789(var6, var0); // L: 57
				return var4 != null ? var4 : null; // L: 58
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "277734474"
	)
	public static void method7211() {
		ParamComposition.ParamComposition_cached.clear(); // L: 60
	} // L: 61

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-46"
	)
	static final void method7205() {
		LoginScreenAnimation.method2513(false); // L: 5905
		Client.field555 = 0; // L: 5906
		boolean var0 = true; // L: 5907

		int var1;
		for (var1 = 0; var1 < WorldMapData_1.field2511.length; ++var1) { // L: 5908
			if (UserComparator7.field1444[var1] != -1 && WorldMapData_1.field2511[var1] == null) { // L: 5909 5910
				WorldMapData_1.field2511[var1] = WorldMapSection0.field2532.takeFile(UserComparator7.field1444[var1], 0); // L: 5911
				if (WorldMapData_1.field2511[var1] == null) { // L: 5912
					var0 = false; // L: 5913
					++Client.field555; // L: 5914
				}
			}

			if (UserComparator3.field1448[var1] != -1 && GrandExchangeEvent.field4369[var1] == null) { // L: 5918 5919
				GrandExchangeEvent.field4369[var1] = WorldMapSection0.field2532.takeFileEncrypted(UserComparator3.field1448[var1], 0, Varcs.field1394[var1]); // L: 5920
				if (GrandExchangeEvent.field4369[var1] == null) { // L: 5921
					var0 = false; // L: 5922
					++Client.field555; // L: 5923
				}
			}
		}

		if (!var0) { // L: 5928
			Client.field559 = 1; // L: 5929
		} else {
			Client.field521 = 0; // L: 5932
			var0 = true; // L: 5933

			int var3;
			int var4;
			for (var1 = 0; var1 < WorldMapData_1.field2511.length; ++var1) { // L: 5934
				byte[] var17 = GrandExchangeEvent.field4369[var1]; // L: 5935
				if (var17 != null) { // L: 5936
					var3 = (KitDefinition.field1864[var1] >> 8) * 64 - class187.baseX * 64; // L: 5937
					var4 = (KitDefinition.field1864[var1] & 255) * 64 - class101.baseY * 64; // L: 5938
					if (Client.field595) { // L: 5939
						var3 = 10; // L: 5940
						var4 = 10; // L: 5941
					}

					var0 &= class150.method3283(var17, var3, var4); // L: 5943
				}
			}

			if (!var0) { // L: 5946
				Client.field559 = 2; // L: 5947
			} else {
				if (Client.field559 != 0) { // L: 5950
					LoginPacket.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				class102.method2728(); // L: 5951
				class36.scene.clear(); // L: 5952

				for (var1 = 0; var1 < 4; ++var1) { // L: 5953
					Client.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) { // L: 5954
					for (var2 = 0; var2 < 104; ++var2) { // L: 5955
						for (var3 = 0; var3 < 104; ++var3) { // L: 5956
							Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 5957
						}
					}
				}

				class102.method2728(); // L: 5961
				MidiPcmStream.method6133(); // L: 5962
				var1 = WorldMapData_1.field2511.length; // L: 5963
				WorldMapSectionType.method4888(); // L: 5964
				LoginScreenAnimation.method2513(true); // L: 5965
				int var5;
				if (!Client.field595) { // L: 5966
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) { // L: 5967
						var3 = (KitDefinition.field1864[var2] >> 8) * 64 - class187.baseX * 64; // L: 5968
						var4 = (KitDefinition.field1864[var2] & 255) * 64 - class101.baseY * 64; // L: 5969
						var16 = WorldMapData_1.field2511[var2]; // L: 5970
						if (var16 != null) { // L: 5971
							class102.method2728(); // L: 5972
							class427.method7947(var16, var3, var4, DefaultsGroup.field4740 * 8 - 48, class223.field2367 * 8 - 48, Client.collisionMaps); // L: 5973
						}
					}

					for (var2 = 0; var2 < var1; ++var2) { // L: 5976
						var3 = (KitDefinition.field1864[var2] >> 8) * 64 - class187.baseX * 64; // L: 5977
						var4 = (KitDefinition.field1864[var2] & 255) * 64 - class101.baseY * 64; // L: 5978
						var16 = WorldMapData_1.field2511[var2]; // L: 5979
						if (var16 == null && class223.field2367 < 800) { // L: 5980
							class102.method2728(); // L: 5981
							MouseHandler.method670(var3, var4, 64, 64); // L: 5982
						}
					}

					LoginScreenAnimation.method2513(true); // L: 5985

					for (var2 = 0; var2 < var1; ++var2) { // L: 5986
						byte[] var15 = GrandExchangeEvent.field4369[var2]; // L: 5987
						if (var15 != null) { // L: 5988
							var4 = (KitDefinition.field1864[var2] >> 8) * 64 - class187.baseX * 64; // L: 5989
							var5 = (KitDefinition.field1864[var2] & 255) * 64 - class101.baseY * 64; // L: 5990
							class102.method2728(); // L: 5991
							class250.method4934(var15, var4, var5, class36.scene, Client.collisionMaps); // L: 5992
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.field595) { // L: 5996
					int var9;
					int var10;
					int var11;
					for (var2 = 0; var2 < 4; ++var2) { // L: 5997
						class102.method2728(); // L: 5998

						for (var3 = 0; var3 < 13; ++var3) { // L: 5999
							for (var4 = 0; var4 < 13; ++var4) { // L: 6000
								boolean var18 = false; // L: 6001
								var6 = Client.field562[var2][var3][var4]; // L: 6002
								if (var6 != -1) { // L: 6003
									var7 = var6 >> 24 & 3; // L: 6004
									var8 = var6 >> 1 & 3; // L: 6005
									var9 = var6 >> 14 & 1023; // L: 6006
									var10 = var6 >> 3 & 2047; // L: 6007
									var11 = (var9 / 8 << 8) + var10 / 8; // L: 6008

									for (int var12 = 0; var12 < KitDefinition.field1864.length; ++var12) { // L: 6009
										if (KitDefinition.field1864[var12] == var11 && WorldMapData_1.field2511[var12] != null) { // L: 6010
											int var13 = (var9 - var3) * 8; // L: 6011
											int var14 = (var10 - var4) * 8; // L: 6012
											GameEngine.method544(WorldMapData_1.field2511[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14, Client.collisionMaps); // L: 6013
											var18 = true; // L: 6014
											break;
										}
									}
								}

								if (!var18) { // L: 6019
									class230.method4458(var2, var3 * 8, var4 * 8); // L: 6020
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) { // L: 6025
						for (var3 = 0; var3 < 13; ++var3) { // L: 6026
							var4 = Client.field562[0][var2][var3]; // L: 6027
							if (var4 == -1) { // L: 6028
								MouseHandler.method670(var2 * 8, var3 * 8, 8, 8); // L: 6029
							}
						}
					}

					LoginScreenAnimation.method2513(true); // L: 6033

					for (var2 = 0; var2 < 4; ++var2) { // L: 6034
						class102.method2728(); // L: 6035

						for (var3 = 0; var3 < 13; ++var3) { // L: 6036
							for (var4 = 0; var4 < 13; ++var4) { // L: 6037
								var5 = Client.field562[var2][var3][var4]; // L: 6038
								if (var5 != -1) { // L: 6039
									var6 = var5 >> 24 & 3; // L: 6040
									var7 = var5 >> 1 & 3; // L: 6041
									var8 = var5 >> 14 & 1023; // L: 6042
									var9 = var5 >> 3 & 2047; // L: 6043
									var10 = (var8 / 8 << 8) + var9 / 8; // L: 6044

									for (var11 = 0; var11 < KitDefinition.field1864.length; ++var11) { // L: 6045
										if (KitDefinition.field1864[var11] == var10 && GrandExchangeEvent.field4369[var11] != null) { // L: 6046
											Tiles.method2294(GrandExchangeEvent.field4369[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, class36.scene, Client.collisionMaps); // L: 6047
											break; // L: 6048
										}
									}
								}
							}
						}
					}
				}

				LoginScreenAnimation.method2513(true); // L: 6056
				class102.method2728(); // L: 6057
				class156.method3394(class36.scene, Client.collisionMaps); // L: 6058
				LoginScreenAnimation.method2513(true); // L: 6059
				var2 = Tiles.Tiles_minPlane; // L: 6060
				if (var2 > ItemLayer.Client_plane) { // L: 6061
					var2 = ItemLayer.Client_plane;
				}

				if (var2 < ItemLayer.Client_plane - 1) { // L: 6062
					var2 = ItemLayer.Client_plane - 1;
				}

				if (Client.isLowDetail) { // L: 6063
					class36.scene.init(Tiles.Tiles_minPlane);
				} else {
					class36.scene.init(0); // L: 6064
				}

				for (var3 = 0; var3 < 104; ++var3) { // L: 6065
					for (var4 = 0; var4 < 104; ++var4) { // L: 6066
						ClanSettings.updateItemPile(var3, var4); // L: 6067
					}
				}

				class102.method2728(); // L: 6070
				class90.method2384(); // L: 6071
				ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 6072
				PacketBufferNode var19;
				if (SpriteMask.client.hasFrame()) { // L: 6073
					var19 = class113.getPacketBufferNode(ClientPacket.field3134, Client.packetWriter.isaacCipher); // L: 6075
					var19.packetBuffer.writeInt(1057001181); // L: 6076
					Client.packetWriter.addNode(var19); // L: 6077
				}

				if (!Client.field595) { // L: 6079
					var3 = (DefaultsGroup.field4740 - 6) / 8; // L: 6080
					var4 = (DefaultsGroup.field4740 + 6) / 8; // L: 6081
					var5 = (class223.field2367 - 6) / 8; // L: 6082
					var6 = (class223.field2367 + 6) / 8; // L: 6083

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) { // L: 6084
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) { // L: 6085
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) { // L: 6086
								WorldMapSection0.field2532.loadRegionFromName("m" + var7 + "_" + var8); // L: 6087
								WorldMapSection0.field2532.loadRegionFromName("l" + var7 + "_" + var8); // L: 6088
							}
						}
					}
				}

				WorldMapSection2.method4516(30); // L: 6092
				class102.method2728(); // L: 6093
				class320.method6187(); // L: 6094
				var19 = class113.getPacketBufferNode(ClientPacket.field3198, Client.packetWriter.isaacCipher); // L: 6095
				Client.packetWriter.addNode(var19); // L: 6096
				WorldMapManager.method4746(); // L: 6097
			}
		}
	} // L: 5930 5948 6098
}
