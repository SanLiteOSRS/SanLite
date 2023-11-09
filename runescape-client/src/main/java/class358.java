import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nx")
public class class358 extends DualNode {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	Archive field4272;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1172378273
	)
	int field4271;
	@ObfuscatedName("ar")
	byte field4270;

	class358() {
	} // L: 10

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "70"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 77
		if (var1 == null) { // L: 78
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count; // L: 79 80
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "0"
	)
	static int method6748(byte[] var0, int var1, int var2) {
		int var3 = -1; // L: 47

		for (int var4 = var1; var4 < var2; ++var4) { // L: 48
			var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255]; // L: 49
		}

		var3 = ~var3; // L: 51
		return var3; // L: 52
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(ZLtc;I)V",
		garbageValue = "-720645536"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field645 = 0; // L: 8735
		Client.field801 = 0; // L: 8736
		class53.method1105(var1); // L: 8737

		int var3;
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		while (true) {
			byte var2 = 16; // L: 8740
			var3 = 1 << var2; // L: 8741
			if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) < var2 + 12) { // L: 8742
				break;
			}

			int var4 = var1.readBits(var2); // L: 8743
			if (var4 == var3 - 1) { // L: 8744
				break;
			}

			boolean var5 = false; // L: 8745
			if (Client.npcs[var4] == null) { // L: 8746
				Client.npcs[var4] = new NPC(); // L: 8747
				var5 = true; // L: 8748
			}

			NPC var21 = Client.npcs[var4]; // L: 8750
			Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8751
			var21.npcCycle = Client.cycle; // L: 8752
			var10 = var1.readBits(1); // L: 8756
			if (var10 == 1) { // L: 8757
				Client.field587[++Client.field801 - 1] = var4;
			}

			var7 = var1.readBits(1); // L: 8758
			boolean var11 = var1.readBits(1) == 1; // L: 8759
			if (var11) { // L: 8760
				var1.readBits(32); // L: 8761
			}

			if (var0) { // L: 8763
				var9 = var1.readBits(8); // L: 8764
				if (var9 > 127) { // L: 8765
					var9 -= 256;
				}
			} else {
				var9 = var1.readBits(5); // L: 8768
				if (var9 > 15) { // L: 8769
					var9 -= 32;
				}
			}

			if (var0) { // L: 8771
				var8 = var1.readBits(8); // L: 8772
				if (var8 > 127) { // L: 8773
					var8 -= 256;
				}
			} else {
				var8 = var1.readBits(5); // L: 8776
				if (var8 > 15) { // L: 8777
					var8 -= 32;
				}
			}

			var21.definition = Tile.getNpcDefinition(var1.readBits(14)); // L: 8779
			var12 = Client.field704[var1.readBits(3)]; // L: 8780
			if (var5) { // L: 8781
				var21.orientation = var21.rotation = var12;
			}

			Client.method1623(var21); // L: 8782
			if (var21.field1251 == 0) { // L: 8783
				var21.rotation = 0;
			}

			var21.method2593(class136.localPlayer.pathX[0] + var8, class136.localPlayer.pathY[0] + var9, var7 == 1); // L: 8784
		}

		var1.exportIndex(); // L: 8786

		int var22;
		for (var22 = 0; var22 < Client.field801; ++var22) { // L: 8789
			var3 = Client.field587[var22]; // L: 8790
			NPC var14 = Client.npcs[var3]; // L: 8791
			int var23 = var1.readUnsignedByte(); // L: 8792
			int var6;
			if ((var23 & 32) != 0) { // L: 8793
				var6 = var1.readUnsignedByte(); // L: 8794
				var23 += var6 << 8; // L: 8795
			}

			if ((var23 & 1024) != 0) { // L: 8797
				var6 = var1.readUnsignedByte(); // L: 8798
				var23 += var6 << 16; // L: 8799
			}

			if ((var23 & 8) != 0) { // L: 8801
				var14.targetIndex = var1.readUnsignedShort(); // L: 8803
				var14.targetIndex += var1.readUnsignedByte() << 16; // L: 8804
				var6 = 16777215; // L: 8805
				if (var6 == var14.targetIndex) { // L: 8806
					var14.targetIndex = -1; // L: 8807
				}
			}

			if ((var23 & 1) != 0) { // L: 8810
				var14.definition = Tile.getNpcDefinition(var1.method9116()); // L: 8811
				Client.method1623(var14); // L: 8812
				var14.method2625(); // L: 8813
			}

			if ((var23 & 4) != 0) { // L: 8815
				var6 = var1.method9087(); // L: 8816
				if (var6 == 65535) { // L: 8817
					var6 = -1; // L: 8818
				}

				var7 = var1.method9089(); // L: 8820
				if (var6 == var14.sequence && var6 != -1) { // L: 8821
					var8 = class135.SequenceDefinition_get(var6).field2274; // L: 8822
					if (var8 == 1) { // L: 8823
						var14.sequenceFrame = 0; // L: 8824
						var14.sequenceFrameCycle = 0; // L: 8825
						var14.sequenceDelay = var7; // L: 8826
						var14.field1199 = 0; // L: 8827
					}

					if (var8 == 2) { // L: 8829
						var14.field1199 = 0; // L: 8830
					}
				} else if (var6 == -1 || var14.sequence == -1 || class135.SequenceDefinition_get(var6).field2258 >= class135.SequenceDefinition_get(var14.sequence).field2258) { // L: 8833
					var14.sequence = var6; // L: 8834
					var14.sequenceFrame = 0; // L: 8835
					var14.sequenceFrameCycle = 0; // L: 8836
					var14.sequenceDelay = var7; // L: 8837
					var14.field1199 = 0; // L: 8838
					var14.field1257 = var14.pathLength; // L: 8839
				}
			}

			if ((var23 & 64) != 0) { // L: 8843
				var1.method9087(); // L: 8844
				var1.readInt(); // L: 8845
			}

			int[] var15;
			short[] var16;
			short[] var17;
			long var18;
			int var24;
			boolean var25;
			if ((var23 & 512) != 0) { // L: 8847
				var6 = var1.method9089(); // L: 8848
				if ((var6 & 1) == 1) { // L: 8849
					var14.method2604(); // L: 8850
				} else {
					var15 = null; // L: 8853
					if ((var6 & 2) == 2) { // L: 8854
						var8 = var1.method9120(); // L: 8855
						var15 = new int[var8]; // L: 8856

						for (var9 = 0; var9 < var8; ++var9) { // L: 8857
							var10 = var1.readUnsignedShort(); // L: 8858
							var10 = var10 == 65535 ? -1 : var10; // L: 8859
							var15[var9] = var10; // L: 8860
						}
					}

					var16 = null; // L: 8863
					if ((var6 & 4) == 4) { // L: 8864
						var9 = 0; // L: 8865
						if (var14.definition.recolorTo != null) { // L: 8866
							var9 = var14.definition.recolorTo.length; // L: 8867
						}

						var16 = new short[var9]; // L: 8869

						for (var10 = 0; var10 < var9; ++var10) { // L: 8870
							var16[var10] = (short)var1.readUnsignedShort(); // L: 8871
						}
					}

					var17 = null; // L: 8874
					if ((var6 & 8) == 8) { // L: 8875
						var10 = 0; // L: 8876
						if (var14.definition.retextureTo != null) { // L: 8877
							var10 = var14.definition.retextureTo.length; // L: 8878
						}

						var17 = new short[var10]; // L: 8880

						for (var24 = 0; var24 < var10; ++var24) { // L: 8881
							var17[var24] = (short)var1.method9116(); // L: 8882
						}
					}

					var25 = false; // L: 8885
					if ((var6 & 16) != 0) { // L: 8886
						var25 = var1.readUnsignedByte() == 1; // L: 8887
					}

					var18 = (long)(++NPC.field1317 - 1); // L: 8889
					var14.method2605(new class194(var18, var15, var16, var17, var25)); // L: 8890
				}
			}

			if ((var23 & 256) != 0) { // L: 8893
				var6 = var1.method9089(); // L: 8894
				if ((var6 & 1) == 1) { // L: 8895
					var14.method2598(); // L: 8896
				} else {
					var15 = null; // L: 8899
					if ((var6 & 2) == 2) { // L: 8900
						var8 = var1.method9119(); // L: 8901
						var15 = new int[var8]; // L: 8902

						for (var9 = 0; var9 < var8; ++var9) { // L: 8903
							var10 = var1.readUnsignedShort(); // L: 8904
							var10 = var10 == 65535 ? -1 : var10; // L: 8905
							var15[var9] = var10; // L: 8906
						}
					}

					var16 = null; // L: 8909
					if ((var6 & 4) == 4) { // L: 8910
						var9 = 0; // L: 8911
						if (var14.definition.recolorTo != null) { // L: 8912
							var9 = var14.definition.recolorTo.length; // L: 8913
						}

						var16 = new short[var9]; // L: 8915

						for (var10 = 0; var10 < var9; ++var10) { // L: 8916
							var16[var10] = (short)var1.method9087(); // L: 8917
						}
					}

					var17 = null; // L: 8920
					if ((var6 & 8) == 8) { // L: 8921
						var10 = 0; // L: 8922
						if (var14.definition.retextureTo != null) { // L: 8923
							var10 = var14.definition.retextureTo.length; // L: 8924
						}

						var17 = new short[var10]; // L: 8926

						for (var24 = 0; var24 < var10; ++var24) { // L: 8927
							var17[var24] = (short)var1.method9087(); // L: 8928
						}
					}

					var25 = false; // L: 8931
					if ((var6 & 16) != 0) { // L: 8932
						var25 = var1.method9120() == 1; // L: 8933
					}

					var18 = (long)(++NPC.field1315 - 1); // L: 8935
					var14.method2603(new class194(var18, var15, var16, var17, var25)); // L: 8936
				}
			}

			if ((var23 & 262144) != 0) { // L: 8939
				var6 = var1.method9200(); // L: 8940
				var14.field1237 = (var6 & 1) != 0 ? var1.method9087() : var14.definition.turnLeftSequence; // L: 8941
				var14.field1190 = (var6 & 2) != 0 ? var1.readUnsignedShort() : var14.definition.turnRightSequence; // L: 8942
				var14.walkSequence = (var6 & 4) != 0 ? var1.readUnsignedShort() : var14.definition.walkSequence; // L: 8943
				var14.walkBackSequence = (var6 & 8) != 0 ? var1.method9087() : var14.definition.walkBackSequence; // L: 8944
				var14.walkLeftSequence = (var6 & 16) != 0 ? var1.method9130() : var14.definition.walkLeftSequence; // L: 8945
				var14.walkRightSequence = (var6 & 32) != 0 ? var1.method9116() : var14.definition.walkRightSequence; // L: 8946
				var14.runSequence = (var6 & 64) != 0 ? var1.method9116() : var14.definition.field1996; // L: 8947
				var14.field1194 = (var6 & 128) != 0 ? var1.readUnsignedShort() : var14.definition.field2013; // L: 8948
				var14.field1197 = (var6 & 256) != 0 ? var1.method9130() : var14.definition.field1998; // L: 8949
				var14.field1198 = (var6 & 512) != 0 ? var1.method9130() : var14.definition.field2015; // L: 8950
				var14.field1211 = (var6 & 1024) != 0 ? var1.method9087() : var14.definition.field2016; // L: 8951
				var14.field1200 = (var6 & 2048) != 0 ? var1.method9087() : var14.definition.field2017; // L: 8952
				var14.field1201 = (var6 & 4096) != 0 ? var1.method9130() : var14.definition.field2018; // L: 8953
				var14.field1202 = (var6 & 8192) != 0 ? var1.method9116() : var14.definition.field2024; // L: 8954
				var14.idleSequence = (var6 & 16384) != 0 ? var1.method9087() : var14.definition.idleSequence; // L: 8955
			}

			if ((var23 & 131072) != 0) { // L: 8957
				var6 = var1.method9120(); // L: 8958

				for (var7 = 0; var7 < var6; ++var7) { // L: 8959
					var8 = var1.method9120(); // L: 8960
					var9 = var1.readUnsignedShort(); // L: 8961
					var10 = var1.method9200(); // L: 8962
					var14.method2399(var8, var9, var10 >> 16, var10 & 65535); // L: 8963
				}
			}

			if ((var23 & 32768) != 0) { // L: 8966
				var14.field1234 = var1.method9124(); // L: 8967
				var14.field1236 = var1.method9122(); // L: 8968
				var14.field1196 = var1.readByte(); // L: 8969
				var14.field1224 = var1.readByte(); // L: 8970
				var14.spotAnimation = var1.readUnsignedShort() + Client.cycle; // L: 8971
				var14.field1239 = var1.method9087() + Client.cycle; // L: 8972
				var14.field1232 = var1.method9116(); // L: 8973
				var14.pathLength = 1; // L: 8974
				var14.field1257 = 0; // L: 8975
				var14.field1234 += var14.pathX[0]; // L: 8976
				var14.field1236 += var14.pathY[0]; // L: 8977
				var14.field1196 += var14.pathX[0]; // L: 8978
				var14.field1224 += var14.pathY[0]; // L: 8979
			}

			if ((var23 & 2) != 0) { // L: 8981
				var6 = var1.method9130(); // L: 8982
				var7 = var1.method9130(); // L: 8983
				var14.field1222 = var1.readUnsignedByte() == 1; // L: 8984
				if (Client.field525 >= 212) { // L: 8985
					var14.field1220 = var6; // L: 8986
					var14.field1221 = var7; // L: 8987
				} else {
					var8 = var14.x - (var6 - AbstractArchive.baseX * 64 - AbstractArchive.baseX * 64) * 64; // L: 8990
					var9 = var14.y - (var7 - class148.baseY * 64 - class148.baseY * 64) * 64; // L: 8991
					if (var8 != 0 || var9 != 0) { // L: 8992
						var24 = (int)(Math.atan2((double)var8, (double)var9) * 325.94932345220167D) & 2047; // L: 8996
						var14.field1219 = var24; // L: 8998
					}
				}
			}

			if ((var23 & 4096) != 0) { // L: 9002
				var14.field1183 = Client.cycle + var1.method9087(); // L: 9003
				var14.field1244 = Client.cycle + var1.readUnsignedShort(); // L: 9004
				var14.field1245 = var1.method9122(); // L: 9005
				var14.field1238 = var1.readByte(); // L: 9006
				var14.field1247 = var1.method9123(); // L: 9007
				var14.field1248 = (byte)var1.readUnsignedByte(); // L: 9008
			}

			if ((var23 & 16) != 0) { // L: 9010
				var6 = var1.readUnsignedByte(); // L: 9011
				if (var6 > 0) { // L: 9012
					for (var7 = 0; var7 < var6; ++var7) { // L: 9013
						var9 = -1; // L: 9015
						var10 = -1; // L: 9016
						var24 = -1; // L: 9017
						var8 = var1.readUShortSmart(); // L: 9018
						if (var8 == 32767) { // L: 9019
							var8 = var1.readUShortSmart(); // L: 9020
							var10 = var1.readUShortSmart(); // L: 9021
							var9 = var1.readUShortSmart(); // L: 9022
							var24 = var1.readUShortSmart(); // L: 9023
						} else if (var8 != 32766) { // L: 9025
							var10 = var1.readUShortSmart(); // L: 9026
						} else {
							var8 = -1; // L: 9028
						}

						var12 = var1.readUShortSmart(); // L: 9029
						var14.addHitSplat(var8, var10, var9, var24, Client.cycle, var12); // L: 9030
					}
				}

				var7 = var1.readUnsignedByte(); // L: 9033
				if (var7 > 0) { // L: 9034
					for (var8 = 0; var8 < var7; ++var8) { // L: 9035
						var9 = var1.readUShortSmart(); // L: 9036
						var10 = var1.readUShortSmart(); // L: 9037
						if (var10 != 32767) { // L: 9038
							var24 = var1.readUShortSmart(); // L: 9039
							var12 = var1.method9089(); // L: 9040
							int var13 = var10 > 0 ? var1.method9089() : var12; // L: 9041
							var14.addHealthBar(var9, Client.cycle, var10, var24, var12, var13); // L: 9042
						} else {
							var14.removeHealthBar(var9); // L: 9044
						}
					}
				}
			}

			if ((var23 & 8192) != 0) { // L: 9048
				var14.method2601(var1.method9120()); // L: 9049
			}

			if ((var23 & 16384) != 0) { // L: 9051
				var14.field1258 = var1.method9336(); // L: 9052
			}

			if ((var23 & 65536) != 0) { // L: 9054
				var6 = var1.method9119(); // L: 9055
				var15 = new int[8]; // L: 9056
				var16 = new short[8]; // L: 9057

				for (var9 = 0; var9 < 8; ++var9) { // L: 9058
					if ((var6 & 1 << var9) != 0) { // L: 9059
						var15[var9] = var1.method9152(); // L: 9060
						var16[var9] = (short)var1.method9261(); // L: 9061
					} else {
						var15[var9] = -1; // L: 9064
						var16[var9] = -1; // L: 9065
					}
				}

				var14.method2594(var15, var16); // L: 9068
			}

			if ((var23 & 2048) != 0) { // L: 9070
				var14.method2588(var1.readStringCp1252NullTerminated()); // L: 9071
			}

			if ((var23 & 128) != 0) { // L: 9073
				var14.field1213 = var1.readStringCp1252NullTerminated(); // L: 9074
				var14.field1182 = 100; // L: 9075
			}
		}

		for (var22 = 0; var22 < Client.field645; ++var22) { // L: 9079
			var3 = Client.field601[var22]; // L: 9080
			if (Client.npcs[var3].npcCycle != Client.cycle) { // L: 9081
				Client.npcs[var3].definition = null; // L: 9082
				Client.npcs[var3] = null; // L: 9083
			}
		}

		if (var1.offset != Client.packetWriter.serverPacketLength) { // L: 9086
			throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength); // L: 9087
		} else {
			for (var22 = 0; var22 < Client.npcCount; ++var22) { // L: 9089
				if (Client.npcs[Client.npcIndices[var22]] == null) { // L: 9090
					throw new RuntimeException(var22 + "," + Client.npcCount); // L: 9091
				}
			}

		}
	} // L: 9094
}
