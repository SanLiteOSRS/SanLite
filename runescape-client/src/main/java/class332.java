import java.util.BitSet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
public class class332 extends Node {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -705162889
	)
	int field3555;
	@ObfuscatedName("al")
	BitSet field3554;

	class332(int var1) {
		this.field3555 = var1; // L: 11
		this.field3554 = new BitSet(128); // L: 12
	} // L: 13

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(ZLuy;I)V",
		garbageValue = "2118721779"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field650 = 0; // L: 8818
		Client.field581 = 0; // L: 8819
		var1.importIndex(); // L: 8821
		int var2 = var1.readBits(8); // L: 8822
		int var3;
		if (var2 < Client.npcCount) { // L: 8823
			for (var3 = var2; var3 < Client.npcCount; ++var3) { // L: 8824
				Client.field651[++Client.field650 - 1] = Client.npcIndices[var3];
			}
		}

		if (var2 > Client.npcCount) { // L: 8826
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0; // L: 8827

			int var6;
			int var7;
			int var8;
			int var9;
			for (var3 = 0; var3 < var2; ++var3) { // L: 8828
				int var20 = Client.npcIndices[var3]; // L: 8829
				NPC var21 = Client.npcs[var20]; // L: 8830
				var6 = var1.readBits(1); // L: 8831
				if (var6 == 0) { // L: 8832
					Client.npcIndices[++Client.npcCount - 1] = var20; // L: 8833
					var21.npcCycle = Client.cycle; // L: 8834
				} else {
					var7 = var1.readBits(2); // L: 8837
					if (var7 == 0) { // L: 8838
						Client.npcIndices[++Client.npcCount - 1] = var20; // L: 8839
						var21.npcCycle = Client.cycle; // L: 8840
						Client.field533[++Client.field581 - 1] = var20; // L: 8841
					} else if (var7 == 1) { // L: 8844
						Client.npcIndices[++Client.npcCount - 1] = var20; // L: 8845
						var21.npcCycle = Client.cycle; // L: 8846
						var8 = var1.readBits(3); // L: 8847
						var21.method2625(var8, class231.field2428); // L: 8848
						var9 = var1.readBits(1); // L: 8849
						if (var9 == 1) { // L: 8850
							Client.field533[++Client.field581 - 1] = var20;
						}
					} else if (var7 == 2) { // L: 8853
						Client.npcIndices[++Client.npcCount - 1] = var20; // L: 8854
						var21.npcCycle = Client.cycle; // L: 8855
						if (var1.readBits(1) == 1) { // L: 8856
							var8 = var1.readBits(3); // L: 8857
							var21.method2625(var8, class231.field2427); // L: 8858
							var9 = var1.readBits(3); // L: 8859
							var21.method2625(var9, class231.field2427); // L: 8860
						} else {
							var8 = var1.readBits(3); // L: 8863
							var21.method2625(var8, class231.field2426); // L: 8864
						}

						var8 = var1.readBits(1); // L: 8866
						if (var8 == 1) { // L: 8867
							Client.field533[++Client.field581 - 1] = var20;
						}
					} else if (var7 == 3) { // L: 8870
						Client.field651[++Client.field650 - 1] = var20; // L: 8871
					}
				}
			}

			class13.method169(var0, var1); // L: 8876

			for (var2 = 0; var2 < Client.field581; ++var2) { // L: 8878
				var3 = Client.field533[var2]; // L: 8879
				NPC var4 = Client.npcs[var3]; // L: 8880
				int var5 = var1.readUnsignedByte(); // L: 8881
				if ((var5 & 64) != 0) { // L: 8882
					var6 = var1.readUnsignedByte(); // L: 8883
					var5 += var6 << 8; // L: 8884
				}

				if ((var5 & 2048) != 0) { // L: 8886
					var6 = var1.readUnsignedByte(); // L: 8887
					var5 += var6 << 16; // L: 8888
				}

				if ((var5 & 128) != 0) { // L: 8890
					var6 = var1.method9184(); // L: 8891
					if (var6 == 65535) { // L: 8892
						var6 = -1; // L: 8893
					}

					var7 = var1.readUnsignedByte(); // L: 8895
					if (var6 == var4.sequence && var6 != -1) { // L: 8896
						var8 = class36.SequenceDefinition_get(var6).field2340; // L: 8897
						if (var8 == 1) { // L: 8898
							var4.sequenceFrame = 0; // L: 8899
							var4.sequenceFrameCycle = 0; // L: 8900
							var4.sequenceDelay = var7; // L: 8901
							var4.field1235 = 0; // L: 8902
						}

						if (var8 == 2) { // L: 8904
							var4.field1235 = 0; // L: 8905
						}
					} else if (var6 == -1 || var4.sequence == -1 || class36.SequenceDefinition_get(var6).field2333 >= class36.SequenceDefinition_get(var4.sequence).field2333) { // L: 8908
						var4.sequence = var6; // L: 8909
						var4.sequenceFrame = 0; // L: 8910
						var4.sequenceFrameCycle = 0; // L: 8911
						var4.sequenceDelay = var7; // L: 8912
						var4.field1235 = 0; // L: 8913
						var4.field1261 = var4.pathLength; // L: 8914
					}
				}

				if ((var5 & 2) != 0) { // L: 8918
					var4.definition = class190.getNpcDefinition(var1.method9245()); // L: 8919
					WorldMapLabel.method5655(var4); // L: 8920
					var4.method2633(); // L: 8921
				}

				if ((var5 & 32768) != 0) { // L: 8923
					var4.field1238 = var1.method9239(); // L: 8924
					var4.field1185 = var1.readByte(); // L: 8925
					var4.field1239 = var1.readByte(); // L: 8926
					var4.field1204 = var1.method9241(); // L: 8927
					var4.spotAnimation = var1.method9245() + Client.cycle; // L: 8928
					var4.field1243 = var1.readUnsignedShort() + Client.cycle; // L: 8929
					var4.field1254 = var1.method9184(); // L: 8930
					var4.pathLength = 1; // L: 8931
					var4.field1261 = 0; // L: 8932
					var4.field1238 += var4.pathX[0]; // L: 8933
					var4.field1185 += var4.pathY[0]; // L: 8934
					var4.field1239 += var4.pathX[0]; // L: 8935
					var4.field1204 += var4.pathY[0]; // L: 8936
				}

				if ((var5 & 8) != 0) { // L: 8938
					var1.readUnsignedShort(); // L: 8939
					var1.readInt(); // L: 8940
				}

				int var10;
				int var11;
				int[] var14;
				short[] var15;
				short[] var16;
				long var17;
				boolean var22;
				if ((var5 & 16384) != 0) { // L: 8942
					var6 = var1.readUnsignedByte(); // L: 8943
					if ((var6 & 1) == 1) { // L: 8944
						var4.method2637(); // L: 8945
					} else {
						var14 = null; // L: 8948
						if ((var6 & 2) == 2) { // L: 8949
							var8 = var1.method9236(); // L: 8950
							var14 = new int[var8]; // L: 8951

							for (var9 = 0; var9 < var8; ++var9) { // L: 8952
								var10 = var1.method9184(); // L: 8953
								var10 = var10 == 65535 ? -1 : var10; // L: 8954
								var14[var9] = var10; // L: 8955
							}
						}

						var15 = null; // L: 8958
						if ((var6 & 4) == 4) { // L: 8959
							var9 = 0; // L: 8960
							if (var4.definition.recolorTo != null) { // L: 8961
								var9 = var4.definition.recolorTo.length; // L: 8962
							}

							var15 = new short[var9]; // L: 8964

							for (var10 = 0; var10 < var9; ++var10) { // L: 8965
								var15[var10] = (short)var1.method9184(); // L: 8966
							}
						}

						var16 = null; // L: 8969
						if ((var6 & 8) == 8) { // L: 8970
							var10 = 0; // L: 8971
							if (var4.definition.retextureTo != null) { // L: 8972
								var10 = var4.definition.retextureTo.length; // L: 8973
							}

							var16 = new short[var10]; // L: 8975

							for (var11 = 0; var11 < var10; ++var11) { // L: 8976
								var16[var11] = (short)var1.readUnsignedShort(); // L: 8977
							}
						}

						var22 = false; // L: 8980
						if ((var6 & 16) != 0) { // L: 8981
							var22 = var1.method9237() == 1; // L: 8982
						}

						var17 = (long)(++NPC.field1326 - 1); // L: 8984
						var4.method2634(new class204(var17, var14, var15, var16, var22)); // L: 8985
					}
				}

				if ((var5 & 512) != 0) { // L: 8988
					var4.method2621(var1.readStringCp1252NullTerminated()); // L: 8989
				}

				if ((var5 & 4096) != 0) { // L: 8991
					var6 = var1.method9236(); // L: 8992
					if ((var6 & 1) == 1) { // L: 8993
						var4.method2638(); // L: 8994
					} else {
						var14 = null; // L: 8997
						if ((var6 & 2) == 2) { // L: 8998
							var8 = var1.readUnsignedByte(); // L: 8999
							var14 = new int[var8]; // L: 9000

							for (var9 = 0; var9 < var8; ++var9) { // L: 9001
								var10 = var1.method9245(); // L: 9002
								var10 = var10 == 65535 ? -1 : var10; // L: 9003
								var14[var9] = var10; // L: 9004
							}
						}

						var15 = null; // L: 9007
						if ((var6 & 4) == 4) { // L: 9008
							var9 = 0; // L: 9009
							if (var4.definition.recolorTo != null) { // L: 9010
								var9 = var4.definition.recolorTo.length; // L: 9011
							}

							var15 = new short[var9]; // L: 9013

							for (var10 = 0; var10 < var9; ++var10) { // L: 9014
								var15[var10] = (short)var1.method9245(); // L: 9015
							}
						}

						var16 = null; // L: 9018
						if ((var6 & 8) == 8) { // L: 9019
							var10 = 0; // L: 9020
							if (var4.definition.retextureTo != null) { // L: 9021
								var10 = var4.definition.retextureTo.length; // L: 9022
							}

							var16 = new short[var10]; // L: 9024

							for (var11 = 0; var11 < var10; ++var11) { // L: 9025
								var16[var11] = (short)var1.method9184(); // L: 9026
							}
						}

						var22 = false; // L: 9029
						if ((var6 & 16) != 0) { // L: 9030
							var22 = var1.readUnsignedByte() == 1; // L: 9031
						}

						var17 = (long)(++NPC.field1324 - 1); // L: 9033
						var4.method2636(new class204(var17, var14, var15, var16, var22)); // L: 9034
					}
				}

				if ((var5 & 262144) != 0) { // L: 9037
					var6 = var1.readInt(); // L: 9038
					var4.field1192 = (var6 & 1) != 0 ? var1.method9183() : var4.definition.turnLeftSequence; // L: 9039
					var4.field1193 = (var6 & 2) != 0 ? var1.method9183() : var4.definition.turnRightSequence; // L: 9040
					var4.walkSequence = (var6 & 4) != 0 ? var1.method9184() : var4.definition.walkSequence; // L: 9041
					var4.walkBackSequence = (var6 & 8) != 0 ? var1.method9183() : var4.definition.walkBackSequence; // L: 9042
					var4.walkLeftSequence = (var6 & 16) != 0 ? var1.readUnsignedShort() : var4.definition.walkLeftSequence; // L: 9043
					var4.walkRightSequence = (var6 & 32) != 0 ? var1.method9245() : var4.definition.walkRightSequence; // L: 9044
					var4.runSequence = (var6 & 64) != 0 ? var1.method9183() : var4.definition.field2059; // L: 9045
					var4.field1217 = (var6 & 128) != 0 ? var1.method9184() : var4.definition.field2060; // L: 9046
					var4.field1202 = (var6 & 256) != 0 ? var1.method9245() : var4.definition.field2061; // L: 9047
					var4.field1201 = (var6 & 512) != 0 ? var1.readUnsignedShort() : var4.definition.field2088; // L: 9048
					var4.field1196 = (var6 & 1024) != 0 ? var1.readUnsignedShort() : var4.definition.field2063; // L: 9049
					var4.field1203 = (var6 & 2048) != 0 ? var1.readUnsignedShort() : var4.definition.field2064; // L: 9050
					var4.field1219 = (var6 & 4096) != 0 ? var1.method9245() : var4.definition.field2065; // L: 9051
					var4.field1205 = (var6 & 8192) != 0 ? var1.method9184() : var4.definition.field2074; // L: 9052
					var4.idleSequence = (var6 & 16384) != 0 ? var1.method9183() : var4.definition.idleSequence; // L: 9053
				}

				if ((var5 & 131072) != 0) { // L: 9055
					var6 = var1.method9236(); // L: 9056

					for (var7 = 0; var7 < var6; ++var7) { // L: 9057
						var8 = var1.method9238(); // L: 9058
						var9 = var1.method9183(); // L: 9059
						var10 = var1.method9261(); // L: 9060
						var4.method2426(var8, var9, var10 >> 16, var10 & 65535); // L: 9061
					}
				}

				if ((var5 & 8192) != 0) { // L: 9064
					var4.method2622(var1.method9238()); // L: 9065
				}

				if ((var5 & 32) != 0) { // L: 9067
					var4.overheadText = var1.readStringCp1252NullTerminated(); // L: 9068
					var4.overheadTextCyclesRemaining = 100; // L: 9069
				}

				if ((var5 & 16) != 0) { // L: 9071
					var6 = var1.readUnsignedShort(); // L: 9072
					var7 = var1.method9245(); // L: 9073
					var4.field1240 = var1.method9236() == 1; // L: 9074
					if (Client.field527 >= 212) { // L: 9075
						var4.field1224 = var6; // L: 9076
						var4.field1225 = var7; // L: 9077
					} else {
						var8 = var4.x - (var6 - class20.baseX * 64 - class20.baseX * 64) * 64; // L: 9080
						var9 = var4.y - (var7 - class19.baseY * 64 - class19.baseY * 64) * 64; // L: 9081
						if (var8 != 0 || var9 != 0) { // L: 9082
							var11 = (int)(Math.atan2((double)var8, (double)var9) * 325.94932345220167D) & 2047; // L: 9086
							var4.field1223 = var11; // L: 9088
						}
					}
				}

				if ((var5 & 256) != 0) { // L: 9092
					var4.field1262 = var1.method9259(); // L: 9093
				}

				if ((var5 & 4) != 0) { // L: 9095
					var4.targetIndex = var1.method9245(); // L: 9097
					var4.targetIndex += var1.readUnsignedByte() << 16; // L: 9098
					var6 = 16777215; // L: 9099
					if (var6 == var4.targetIndex) { // L: 9100
						var4.targetIndex = -1; // L: 9101
					}
				}

				if ((var5 & 1) != 0) { // L: 9104
					var6 = var1.readUnsignedByte(); // L: 9105
					int var12;
					if (var6 > 0) { // L: 9106
						for (var7 = 0; var7 < var6; ++var7) { // L: 9107
							var9 = -1; // L: 9109
							var10 = -1; // L: 9110
							var11 = -1; // L: 9111
							var8 = var1.readUShortSmart(); // L: 9112
							if (var8 == 32767) { // L: 9113
								var8 = var1.readUShortSmart(); // L: 9114
								var10 = var1.readUShortSmart(); // L: 9115
								var9 = var1.readUShortSmart(); // L: 9116
								var11 = var1.readUShortSmart(); // L: 9117
							} else if (var8 != 32766) { // L: 9119
								var10 = var1.readUShortSmart(); // L: 9120
							} else {
								var8 = -1; // L: 9122
							}

							var12 = var1.readUShortSmart(); // L: 9123
							var4.addHitSplat(var8, var10, var9, var11, Client.cycle, var12); // L: 9124
						}
					}

					var7 = var1.method9236(); // L: 9127
					if (var7 > 0) { // L: 9128
						for (var8 = 0; var8 < var7; ++var8) { // L: 9129
							var9 = var1.readUShortSmart(); // L: 9130
							var10 = var1.readUShortSmart(); // L: 9131
							if (var10 != 32767) { // L: 9132
								var11 = var1.readUShortSmart(); // L: 9133
								var12 = var1.readUnsignedByte(); // L: 9134
								int var13 = var10 > 0 ? var1.method9237() : var12; // L: 9135
								var4.addHealthBar(var9, Client.cycle, var10, var11, var12, var13); // L: 9136
							} else {
								var4.removeHealthBar(var9); // L: 9138
							}
						}
					}
				}

				if ((var5 & 1024) != 0) { // L: 9142
					var4.field1247 = Client.cycle + var1.readUnsignedShort(); // L: 9143
					var4.field1248 = Client.cycle + var1.method9183(); // L: 9144
					var4.field1249 = var1.method9241(); // L: 9145
					var4.field1250 = var1.readByte(); // L: 9146
					var4.field1251 = var1.method9240(); // L: 9147
					var4.field1252 = (byte)var1.readUnsignedByte(); // L: 9148
				}

				if ((var5 & 65536) != 0) { // L: 9150
					var6 = var1.method9237(); // L: 9151
					var14 = new int[8]; // L: 9152
					var15 = new short[8]; // L: 9153

					for (var9 = 0; var9 < 8; ++var9) { // L: 9154
						if ((var6 & 1 << var9) != 0) { // L: 9155
							var14[var9] = var1.method9223(); // L: 9156
							var15[var9] = (short)var1.method9220(); // L: 9157
						} else {
							var14[var9] = -1; // L: 9160
							var15[var9] = -1; // L: 9161
						}
					}

					var4.method2653(var14, var15); // L: 9164
				}
			}

			for (var2 = 0; var2 < Client.field650; ++var2) { // L: 9168
				var3 = Client.field651[var2]; // L: 9169
				if (Client.npcs[var3].npcCycle != Client.cycle) { // L: 9170
					Client.npcs[var3].definition = null; // L: 9171
					Client.npcs[var3] = null; // L: 9172
				}
			}

			if (var1.offset != Client.packetWriter.serverPacketLength) { // L: 9175
				throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength); // L: 9176
			} else {
				for (var2 = 0; var2 < Client.npcCount; ++var2) { // L: 9178
					if (Client.npcs[Client.npcIndices[var2]] == null) { // L: 9179
						throw new RuntimeException(var2 + "," + Client.npcCount); // L: 9180
					}
				}

			}
		}
	} // L: 9183
}
