import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("aq")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("aw")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor(); // L: 10
		this.future = this.executor.submit(new SecureRandomCallable()); // L: 14
	} // L: 15

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-29566"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown(); // L: 18
		this.executor = null; // L: 19
	} // L: 20

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "255"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone(); // L: 23
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "-124866990"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get(); // L: 28
		} catch (Exception var4) { // L: 30
			SecureRandom var3 = new SecureRandom(); // L: 33
			var3.nextInt(); // L: 34
			return var3; // L: 37
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1715856735"
	)
	public static int method2228() {
		return ViewportMouse.ViewportMouse_entityCount; // L: 44
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(ZLun;B)V",
		garbageValue = "-96"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field658 = 0; // L: 8799
		Client.field634 = 0; // L: 8800
		var1.importIndex(); // L: 8802
		int var2 = var1.readBits(8); // L: 8803
		int var3;
		if (var2 < Client.npcCount) { // L: 8804
			for (var3 = var2; var3 < Client.npcCount; ++var3) { // L: 8805
				Client.field659[++Client.field658 - 1] = Client.npcIndices[var3];
			}
		}

		if (var2 > Client.npcCount) { // L: 8807
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0; // L: 8808

			int var4;
			int var6;
			int var8;
			int var9;
			int var19;
			for (var3 = 0; var3 < var2; ++var3) { // L: 8809
				var4 = Client.npcIndices[var3]; // L: 8810
				NPC var21 = Client.npcs[var4]; // L: 8811
				var6 = var1.readBits(1); // L: 8812
				if (var6 == 0) { // L: 8813
					Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8814
					var21.npcCycle = Client.cycle; // L: 8815
				} else {
					var19 = var1.readBits(2); // L: 8818
					if (var19 == 0) { // L: 8819
						Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8820
						var21.npcCycle = Client.cycle; // L: 8821
						Client.field588[++Client.field634 - 1] = var4; // L: 8822
					} else if (var19 == 1) { // L: 8825
						Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8826
						var21.npcCycle = Client.cycle; // L: 8827
						var8 = var1.readBits(3); // L: 8828
						var21.method2659(var8, class233.field2470); // L: 8829
						var9 = var1.readBits(1); // L: 8830
						if (var9 == 1) { // L: 8831
							Client.field588[++Client.field634 - 1] = var4;
						}
					} else if (var19 == 2) { // L: 8834
						Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8835
						var21.npcCycle = Client.cycle; // L: 8836
						if (var1.readBits(1) == 1) { // L: 8837
							var8 = var1.readBits(3); // L: 8838
							var21.method2659(var8, class233.field2472); // L: 8839
							var9 = var1.readBits(3); // L: 8840
							var21.method2659(var9, class233.field2472); // L: 8841
						} else {
							var8 = var1.readBits(3); // L: 8844
							var21.method2659(var8, class233.field2469); // L: 8845
						}

						var8 = var1.readBits(1); // L: 8847
						if (var8 == 1) { // L: 8848
							Client.field588[++Client.field634 - 1] = var4;
						}
					} else if (var19 == 3) { // L: 8851
						Client.field659[++Client.field658 - 1] = var4; // L: 8852
					}
				}
			}

			int var10;
			int var12;
			while (true) {
				byte var22 = 16; // L: 8859
				var3 = 1 << var22; // L: 8860
				if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) < var22 + 12) { // L: 8861
					break;
				}

				var4 = var1.readBits(var22); // L: 8862
				if (var4 == var3 - 1) { // L: 8863
					break;
				}

				boolean var5 = false; // L: 8864
				if (Client.npcs[var4] == null) { // L: 8865
					Client.npcs[var4] = new NPC(); // L: 8866
					var5 = true; // L: 8867
				}

				NPC var20 = Client.npcs[var4]; // L: 8869
				Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8870
				var20.npcCycle = Client.cycle; // L: 8871
				var10 = var1.readBits(1); // L: 8875
				if (var10 == 1) { // L: 8876
					Client.field588[++Client.field634 - 1] = var4;
				}

				boolean var11 = var1.readBits(1) == 1; // L: 8877
				if (var11) { // L: 8878
					var1.readBits(32); // L: 8879
				}

				if (var0) { // L: 8881
					var8 = var1.readBits(8); // L: 8882
					if (var8 > 127) { // L: 8883
						var8 -= 256;
					}
				} else {
					var8 = var1.readBits(5); // L: 8886
					if (var8 > 15) { // L: 8887
						var8 -= 32;
					}
				}

				var20.definition = VarcInt.getNpcDefinition(var1.readBits(14)); // L: 8889
				var19 = var1.readBits(1); // L: 8890
				var12 = Client.field663[var1.readBits(3)]; // L: 8891
				if (var5) { // L: 8892
					var20.orientation = var20.rotation = var12;
				}

				if (var0) { // L: 8893
					var9 = var1.readBits(8); // L: 8894
					if (var9 > 127) { // L: 8895
						var9 -= 256;
					}
				} else {
					var9 = var1.readBits(5); // L: 8898
					if (var9 > 15) { // L: 8899
						var9 -= 32;
					}
				}

				class143.method3207(var20); // L: 8901
				if (var20.field1249 == 0) { // L: 8902
					var20.rotation = 0;
				}

				var20.method2654(VarpDefinition.localPlayer.pathX[0] + var8, VarpDefinition.localPlayer.pathY[0] + var9, var19 == 1); // L: 8903
			}

			var1.exportIndex(); // L: 8905

			for (var2 = 0; var2 < Client.field634; ++var2) { // L: 8908
				var3 = Client.field588[var2]; // L: 8909
				NPC var14 = Client.npcs[var3]; // L: 8910
				int var23 = var1.readUnsignedByte(); // L: 8911
				if ((var23 & 8) != 0) { // L: 8912
					var6 = var1.readUnsignedByte(); // L: 8913
					var23 += var6 << 8; // L: 8914
				}

				if ((var23 & 256) != 0) { // L: 8916
					var6 = var1.readUnsignedByte(); // L: 8917
					var23 += var6 << 16; // L: 8918
				}

				if ((var23 & 32) != 0) { // L: 8920
					var14.overheadText = var1.readStringCp1252NullTerminated(); // L: 8921
					var14.overheadTextCyclesRemaining = 100; // L: 8922
				}

				if ((var23 & 16384) != 0) { // L: 8924
					var14.field1257 = var1.method9511(); // L: 8925
					var14.field1259 = var1.method9510(); // L: 8926
					var14.field1258 = var1.readByte(); // L: 8927
					var14.field1248 = var1.readByte(); // L: 8928
					var14.spotAnimation = var1.method9492() + Client.cycle; // L: 8929
					var14.field1271 = var1.method9492() + Client.cycle; // L: 8930
					var14.field1223 = var1.method9636(); // L: 8931
					var14.pathLength = 1; // L: 8932
					var14.field1280 = 0; // L: 8933
					var14.field1257 += var14.pathX[0]; // L: 8934
					var14.field1259 += var14.pathY[0]; // L: 8935
					var14.field1258 += var14.pathX[0]; // L: 8936
					var14.field1248 += var14.pathY[0]; // L: 8937
				}

				if ((var23 & 131072) != 0) { // L: 8939
					var6 = var1.method9530(); // L: 8940
					var14.field1266 = (var6 & 1) != 0 ? var1.method9703() : var14.definition.turnLeftSequence; // L: 8941
					var14.field1213 = (var6 & 2) != 0 ? var1.method9703() : var14.definition.turnRightSequence; // L: 8942
					var14.walkSequence = (var6 & 4) != 0 ? var1.method9636() : var14.definition.walkSequence; // L: 8943
					var14.walkBackSequence = (var6 & 8) != 0 ? var1.method9492() : var14.definition.walkBackSequence; // L: 8944
					var14.walkLeftSequence = (var6 & 16) != 0 ? var1.readUnsignedShort() : var14.definition.walkLeftSequence; // L: 8945
					var14.walkRightSequence = (var6 & 32) != 0 ? var1.method9636() : var14.definition.walkRightSequence; // L: 8946
					var14.runSequence = (var6 & 64) != 0 ? var1.method9703() : var14.definition.field1979; // L: 8947
					var14.field1219 = (var6 & 128) != 0 ? var1.method9636() : var14.definition.field1980; // L: 8948
					var14.field1220 = (var6 & 256) != 0 ? var1.method9492() : var14.definition.field1987; // L: 8949
					var14.field1221 = (var6 & 512) != 0 ? var1.readUnsignedShort() : var14.definition.field1982; // L: 8950
					var14.field1222 = (var6 & 1024) != 0 ? var1.method9492() : var14.definition.field1983; // L: 8951
					var14.field1216 = (var6 & 2048) != 0 ? var1.readUnsignedShort() : var14.definition.field1966; // L: 8952
					var14.field1224 = (var6 & 4096) != 0 ? var1.method9703() : var14.definition.field1984; // L: 8953
					var14.field1225 = (var6 & 8192) != 0 ? var1.readUnsignedShort() : var14.definition.field1986; // L: 8954
					var14.idleSequence = (var6 & 16384) != 0 ? var1.method9703() : var14.definition.idleSequence; // L: 8955
				}

				int[] var7;
				short[] var15;
				short[] var16;
				long var17;
				int var24;
				boolean var25;
				if ((var23 & 32768) != 0) { // L: 8957
					var6 = var1.readUnsignedByte(); // L: 8958
					if ((var6 & 1) == 1) { // L: 8959
						var14.method2672(); // L: 8960
					} else {
						var7 = null; // L: 8963
						if ((var6 & 2) == 2) { // L: 8964
							var8 = var1.method9605(); // L: 8965
							var7 = new int[var8]; // L: 8966

							for (var9 = 0; var9 < var8; ++var9) { // L: 8967
								var10 = var1.method9492(); // L: 8968
								var10 = var10 == 65535 ? -1 : var10; // L: 8969
								var7[var9] = var10; // L: 8970
							}
						}

						var15 = null; // L: 8973
						if ((var6 & 4) == 4) { // L: 8974
							var9 = 0; // L: 8975
							if (var14.definition.recolorTo != null) { // L: 8976
								var9 = var14.definition.recolorTo.length; // L: 8977
							}

							var15 = new short[var9]; // L: 8979

							for (var10 = 0; var10 < var9; ++var10) { // L: 8980
								var15[var10] = (short)var1.method9636(); // L: 8981
							}
						}

						var16 = null; // L: 8984
						if ((var6 & 8) == 8) { // L: 8985
							var10 = 0; // L: 8986
							if (var14.definition.retextureTo != null) { // L: 8987
								var10 = var14.definition.retextureTo.length; // L: 8988
							}

							var16 = new short[var10]; // L: 8990

							for (var24 = 0; var24 < var10; ++var24) { // L: 8991
								var16[var24] = (short)var1.method9703(); // L: 8992
							}
						}

						var25 = false; // L: 8995
						if ((var6 & 16) != 0) { // L: 8996
							var25 = var1.method9506() == 1; // L: 8997
						}

						var17 = (long)(++NPC.field1336 - 1); // L: 8999
						var14.method2703(new class188(var17, var7, var15, var16, var25)); // L: 9000
					}
				}

				if ((var23 & 128) != 0) { // L: 9003
					var6 = var1.method9492(); // L: 9004
					if (var6 == 65535) { // L: 9005
						var6 = -1; // L: 9006
					}

					var19 = var1.method9579(); // L: 9008
					if (var6 == var14.sequence && var6 != -1) { // L: 9009
						var8 = MilliClock.SequenceDefinition_get(var6).field2272; // L: 9010
						if (var8 == 1) { // L: 9011
							var14.sequenceFrame = 0; // L: 9012
							var14.sequenceFrameCycle = 0; // L: 9013
							var14.sequenceDelay = var19; // L: 9014
							var14.field1254 = 0; // L: 9015
						}

						if (var8 == 2) { // L: 9017
							var14.field1254 = 0; // L: 9018
						}
					} else if (var6 == -1 || var14.sequence == -1 || MilliClock.SequenceDefinition_get(var6).field2266 >= MilliClock.SequenceDefinition_get(var14.sequence).field2266) { // L: 9021
						var14.sequence = var6; // L: 9022
						var14.sequenceFrame = 0; // L: 9023
						var14.sequenceFrameCycle = 0; // L: 9024
						var14.sequenceDelay = var19; // L: 9025
						var14.field1254 = 0; // L: 9026
						var14.field1280 = var14.pathLength; // L: 9027
					}
				}

				if ((var23 & 16) != 0) { // L: 9031
					var6 = var1.method9636(); // L: 9032
					var19 = var1.readUnsignedShort(); // L: 9033
					var14.field1245 = var1.method9605() == 1; // L: 9034
					var14.field1243 = var6; // L: 9035
					var14.field1244 = var19; // L: 9036
				}

				if ((var23 & 2) != 0) { // L: 9038
					var14.targetIndex = var1.method9703(); // L: 9040
					var14.targetIndex += var1.method9579() << 16; // L: 9041
					var6 = 16777215; // L: 9042
					if (var6 == var14.targetIndex) { // L: 9043
						var14.targetIndex = -1; // L: 9044
					}
				}

				if ((var23 & 1024) != 0) { // L: 9047
					var14.method2655(var1.readStringCp1252NullTerminated()); // L: 9048
				}

				if ((var23 & 4096) != 0) { // L: 9050
					var14.field1270 = var1.method9530(); // L: 9051
				}

				if ((var23 & 64) != 0) { // L: 9053
					var6 = var1.method9506(); // L: 9054
					if (var6 > 0) { // L: 9055
						for (var19 = 0; var19 < var6; ++var19) { // L: 9056
							var9 = -1; // L: 9058
							var10 = -1; // L: 9059
							var24 = -1; // L: 9060
							var8 = var1.readUShortSmart(); // L: 9061
							if (var8 == 32767) { // L: 9062
								var8 = var1.readUShortSmart(); // L: 9063
								var10 = var1.readUShortSmart(); // L: 9064
								var9 = var1.readUShortSmart(); // L: 9065
								var24 = var1.readUShortSmart(); // L: 9066
							} else if (var8 != 32766) { // L: 9068
								var10 = var1.readUShortSmart(); // L: 9069
							} else {
								var8 = -1; // L: 9071
							}

							var12 = var1.readUShortSmart(); // L: 9072
							var14.addHitSplat(var8, var10, var9, var24, Client.cycle, var12); // L: 9073
						}
					}

					var19 = var1.method9579(); // L: 9076
					if (var19 > 0) { // L: 9077
						for (var8 = 0; var8 < var19; ++var8) { // L: 9078
							var9 = var1.readUShortSmart(); // L: 9079
							var10 = var1.readUShortSmart(); // L: 9080
							if (var10 != 32767) { // L: 9081
								var24 = var1.readUShortSmart(); // L: 9082
								var12 = var1.readUnsignedByte(); // L: 9083
								int var13 = var10 > 0 ? var1.method9506() : var12; // L: 9084
								var14.addHealthBar(var9, Client.cycle, var10, var24, var12, var13); // L: 9085
							} else {
								var14.removeHealthBar(var9); // L: 9087
							}
						}
					}
				}

				if ((var23 & 65536) != 0) { // L: 9091
					var6 = var1.method9605(); // L: 9092

					for (var19 = 0; var19 < var6; ++var19) { // L: 9093
						var8 = var1.readUnsignedByte(); // L: 9094
						var9 = var1.method9703(); // L: 9095
						var10 = var1.method9529(); // L: 9096
						var14.method2466(var8, var9, var10 >> 16, var10 & 65535); // L: 9097
					}
				}

				if ((var23 & 262144) != 0) { // L: 9100
					var6 = var1.method9506(); // L: 9101
					var7 = new int[8]; // L: 9102
					var15 = new short[8]; // L: 9103

					for (var9 = 0; var9 < 8; ++var9) { // L: 9104
						if ((var6 & 1 << var9) != 0) { // L: 9105
							var7[var9] = var1.method9693(); // L: 9106
							var15[var9] = (short)var1.method9490(); // L: 9107
						} else {
							var7[var9] = -1; // L: 9110
							var15[var9] = -1; // L: 9111
						}
					}

					var14.method2666(var7, var15); // L: 9114
				}

				if ((var23 & 512) != 0) { // L: 9116
					var6 = var1.method9605(); // L: 9117
					if ((var6 & 1) == 1) { // L: 9118
						var14.method2671(); // L: 9119
					} else {
						var7 = null; // L: 9122
						if ((var6 & 2) == 2) { // L: 9123
							var8 = var1.method9506(); // L: 9124
							var7 = new int[var8]; // L: 9125

							for (var9 = 0; var9 < var8; ++var9) { // L: 9126
								var10 = var1.readUnsignedShort(); // L: 9127
								var10 = var10 == 65535 ? -1 : var10; // L: 9128
								var7[var9] = var10; // L: 9129
							}
						}

						var15 = null; // L: 9132
						if ((var6 & 4) == 4) { // L: 9133
							var9 = 0; // L: 9134
							if (var14.definition.recolorTo != null) { // L: 9135
								var9 = var14.definition.recolorTo.length; // L: 9136
							}

							var15 = new short[var9]; // L: 9138

							for (var10 = 0; var10 < var9; ++var10) { // L: 9139
								var15[var10] = (short)var1.readUnsignedShort(); // L: 9140
							}
						}

						var16 = null; // L: 9143
						if ((var6 & 8) == 8) { // L: 9144
							var10 = 0; // L: 9145
							if (var14.definition.retextureTo != null) { // L: 9146
								var10 = var14.definition.retextureTo.length; // L: 9147
							}

							var16 = new short[var10]; // L: 9149

							for (var24 = 0; var24 < var10; ++var24) { // L: 9150
								var16[var24] = (short)var1.method9636(); // L: 9151
							}
						}

						var25 = false; // L: 9154
						if ((var6 & 16) != 0) { // L: 9155
							var25 = var1.method9506() == 1; // L: 9156
						}

						var17 = (long)(++NPC.field1338 - 1); // L: 9158
						var14.method2713(new class188(var17, var7, var15, var16, var25)); // L: 9159
					}
				}

				if ((var23 & 8192) != 0) { // L: 9162
					var14.method2656(var1.method9579()); // L: 9163
				}

				if ((var23 & 4) != 0) { // L: 9165
					var14.definition = VarcInt.getNpcDefinition(var1.readUnsignedShort()); // L: 9166
					class143.method3207(var14); // L: 9167
					var14.method2667(); // L: 9168
				}

				if ((var23 & 2048) != 0) { // L: 9170
					var14.field1262 = Client.cycle + var1.method9492(); // L: 9171
					var14.field1278 = Client.cycle + var1.method9636(); // L: 9172
					var14.field1268 = var1.readByte(); // L: 9173
					var14.field1269 = var1.method9511(); // L: 9174
					var14.field1276 = var1.method9510(); // L: 9175
					var14.field1255 = (byte)var1.method9579(); // L: 9176
				}

				if ((var23 & 1) != 0) { // L: 9178
					var1.method9636(); // L: 9179
					var1.readInt(); // L: 9180
				}
			}

			for (var2 = 0; var2 < Client.field658; ++var2) { // L: 9184
				var3 = Client.field659[var2]; // L: 9185
				if (Client.npcs[var3].npcCycle != Client.cycle) { // L: 9186
					Client.npcs[var3].definition = null; // L: 9187
					Client.npcs[var3] = null; // L: 9188
				}
			}

			if (var1.offset != Client.packetWriter.serverPacketLength) { // L: 9191
				throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength); // L: 9192
			} else {
				for (var2 = 0; var2 < Client.npcCount; ++var2) { // L: 9194
					if (Client.npcs[Client.npcIndices[var2]] == null) { // L: 9195
						throw new RuntimeException(var2 + "," + Client.npcCount); // L: 9196
					}
				}

			}
		}
	} // L: 9199

	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "(Ldm;ZI)V",
		garbageValue = "1781553248"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group; // L: 12528
		int var3 = (int)var0.key; // L: 12529
		var0.remove(); // L: 12530
		if (var1) { // L: 12531
			ArchiveLoader.field1070.method6434(var2);
		}

		KeyHandler.method398(var2); // L: 12532
		Widget var4 = ArchiveLoader.field1070.method6431(var3); // L: 12533
		if (var4 != null) { // L: 12534
			UserComparator5.invalidateWidget(var4);
		}

		if (Client.rootInterface != -1) { // L: 12535
			Canvas.method292(Client.rootInterface, 1);
		}

	} // L: 12536
}
