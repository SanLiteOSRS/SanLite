import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public class class151 extends class159 {
	@ObfuscatedName("bw")
	static String field1714;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1307725651
	)
	int field1712;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	final class160 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgg;)V"
	)
	class151(class160 var1) {
		this.this$0 = var1;
		this.field1712 = -1; // L: 84
	} // L: 86

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "1"
	)
	void vmethod3333(Buffer var1) {
		this.field1712 = var1.readUnsignedShort(); // L: 89
		var1.readUnsignedByte(); // L: 90
		if (var1.readUnsignedByte() != 255) { // L: 91
			--var1.offset; // L: 92
			var1.readLong(); // L: 93
		}

	} // L: 95

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgo;I)V",
		garbageValue = "831405774"
	)
	void vmethod3332(ClanChannel var1) {
		var1.removeMember(this.field1712); // L: 98
	} // L: 99

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(Lto;I)V",
		garbageValue = "-619616137"
	)
	static final void method3155(PacketBuffer var0) {
		for (int var1 = 0; var1 < Client.field640; ++var1) { // L: 8877
			int var2 = Client.field737[var1]; // L: 8878
			NPC var3 = Client.npcs[var2]; // L: 8879
			int var4 = var0.readUnsignedByte(); // L: 8880
			int var5;
			if ((var4 & 8) != 0) { // L: 8881
				var5 = var0.readUnsignedByte(); // L: 8882
				var4 += var5 << 8; // L: 8883
			}

			if ((var4 & 2048) != 0) { // L: 8885
				var5 = var0.readUnsignedByte(); // L: 8886
				var4 += var5 << 16; // L: 8887
			}

			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			if ((var4 & 128) != 0) { // L: 8889
				var5 = var0.method9256(); // L: 8890
				int var11;
				if (var5 > 0) { // L: 8891
					for (var6 = 0; var6 < var5; ++var6) { // L: 8892
						var8 = -1; // L: 8894
						var9 = -1; // L: 8895
						var10 = -1; // L: 8896
						var7 = var0.readUShortSmart(); // L: 8897
						if (var7 == 32767) { // L: 8898
							var7 = var0.readUShortSmart(); // L: 8899
							var9 = var0.readUShortSmart(); // L: 8900
							var8 = var0.readUShortSmart(); // L: 8901
							var10 = var0.readUShortSmart(); // L: 8902
						} else if (var7 != 32766) { // L: 8904
							var9 = var0.readUShortSmart(); // L: 8905
						} else {
							var7 = -1; // L: 8907
						}

						var11 = var0.readUShortSmart(); // L: 8908
						var3.addHitSplat(var7, var9, var8, var10, Client.cycle, var11); // L: 8909
					}
				}

				var6 = var0.method9093(); // L: 8912
				if (var6 > 0) { // L: 8913
					for (var7 = 0; var7 < var6; ++var7) { // L: 8914
						var8 = var0.readUShortSmart(); // L: 8915
						var9 = var0.readUShortSmart(); // L: 8916
						if (var9 != 32767) { // L: 8917
							var10 = var0.readUShortSmart(); // L: 8918
							var11 = var0.method9256(); // L: 8919
							int var12 = var9 > 0 ? var0.method9256() : var11; // L: 8920
							var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12); // L: 8921
						} else {
							var3.removeHealthBar(var8); // L: 8923
						}
					}
				}
			}

			int[] var13;
			short[] var14;
			short[] var15;
			long var16;
			boolean var19;
			if ((var4 & 512) != 0) { // L: 8927
				var5 = var0.readUnsignedByte(); // L: 8928
				if ((var5 & 1) == 1) { // L: 8929
					var3.method2582(); // L: 8930
				} else {
					var13 = null; // L: 8933
					if ((var5 & 2) == 2) { // L: 8934
						var7 = var0.method9091(); // L: 8935
						var13 = new int[var7]; // L: 8936

						for (var8 = 0; var8 < var7; ++var8) { // L: 8937
							var9 = var0.method9102(); // L: 8938
							var9 = var9 == 65535 ? -1 : var9; // L: 8939
							var13[var8] = var9; // L: 8940
						}
					}

					var14 = null; // L: 8943
					if ((var5 & 4) == 4) { // L: 8944
						var8 = 0; // L: 8945
						if (var3.definition.recolorTo != null) { // L: 8946
							var8 = var3.definition.recolorTo.length; // L: 8947
						}

						var14 = new short[var8]; // L: 8949

						for (var9 = 0; var9 < var8; ++var9) { // L: 8950
							var14[var9] = (short)var0.method9101(); // L: 8951
						}
					}

					var15 = null; // L: 8954
					if ((var5 & 8) == 8) { // L: 8955
						var9 = 0; // L: 8956
						if (var3.definition.retextureTo != null) { // L: 8957
							var9 = var3.definition.retextureTo.length; // L: 8958
						}

						var15 = new short[var9]; // L: 8960

						for (var10 = 0; var10 < var9; ++var10) { // L: 8961
							var15[var10] = (short)var0.method9101(); // L: 8962
						}
					}

					var19 = false; // L: 8965
					if ((var5 & 16) != 0) { // L: 8966
						var19 = var0.method9093() == 1; // L: 8967
					}

					var16 = (long)(++NPC.field1333 - 1); // L: 8969
					var3.method2608(new class194(var16, var13, var14, var15, var19)); // L: 8970
				}
			}

			if ((var4 & 32) != 0) { // L: 8973
				var5 = var0.method9101(); // L: 8974
				var6 = var0.readUnsignedShort(); // L: 8975
				var3.field1237 = var0.method9256() == 1; // L: 8976
				if (Client.field708 >= 212) { // L: 8977
					var3.field1235 = var5; // L: 8978
					var3.field1236 = var6; // L: 8979
				} else {
					var7 = var3.x - (var5 - UrlRequester.baseX * 64 - UrlRequester.baseX * 64) * 64; // L: 8982
					var8 = var3.y - (var6 - class47.baseY * 64 - class47.baseY * 64) * 64; // L: 8983
					if (var7 != 0 || var8 != 0) { // L: 8984
						var10 = (int)(Math.atan2((double)var7, (double)var8) * 325.94932345220167D) & 2047; // L: 8988
						var3.field1234 = var10; // L: 8990
					}
				}
			}

			if ((var4 & 64) != 0) { // L: 8994
				var5 = var0.readUnsignedShort(); // L: 8995
				if (var5 == 65535) { // L: 8996
					var5 = -1; // L: 8997
				}

				var6 = var0.method9093(); // L: 8999
				if (var5 == var3.sequence && var5 != -1) { // L: 9000
					var7 = EnumComposition.SequenceDefinition_get(var5).field2327; // L: 9001
					if (var7 == 1) { // L: 9002
						var3.sequenceFrame = 0; // L: 9003
						var3.sequenceFrameCycle = 0; // L: 9004
						var3.sequenceDelay = var6; // L: 9005
						var3.field1224 = 0; // L: 9006
					}

					if (var7 == 2) { // L: 9008
						var3.field1224 = 0; // L: 9009
					}
				} else if (var5 == -1 || var3.sequence == -1 || EnumComposition.SequenceDefinition_get(var5).field2320 >= EnumComposition.SequenceDefinition_get(var3.sequence).field2320) { // L: 9012
					var3.sequence = var5; // L: 9013
					var3.sequenceFrame = 0; // L: 9014
					var3.sequenceFrameCycle = 0; // L: 9015
					var3.sequenceDelay = var6; // L: 9016
					var3.field1224 = 0; // L: 9017
					var3.field1261 = var3.pathLength; // L: 9018
				}
			}

			if ((var4 & 131072) != 0) { // L: 9022
				var5 = var0.method9256(); // L: 9023

				for (var6 = 0; var6 < var5; ++var6) { // L: 9024
					var7 = var0.method9093(); // L: 9025
					var8 = var0.method9102(); // L: 9026
					var9 = var0.method9188(); // L: 9027
					var3.method2376(var7, var8, var9 >> 16, var9 & 65535); // L: 9028
				}
			}

			if ((var4 & 4) != 0) { // L: 9031
				var3.definition = class90.getNpcDefinition(var0.readUnsignedShort()); // L: 9032
				ItemLayer.method4266(var3); // L: 9033
				var3.method2581(); // L: 9034
			}

			if ((var4 & 16) != 0) { // L: 9036
				var3.targetIndex = var0.method9100(); // L: 9038
				var3.targetIndex += var0.method9093() << 16; // L: 9039
				var5 = 16777215; // L: 9040
				if (var5 == var3.targetIndex) { // L: 9041
					var3.targetIndex = -1; // L: 9042
				}
			}

			if ((var4 & 4096) != 0) { // L: 9045
				var3.field1249 = var0.method9096(); // L: 9046
				var3.field1251 = var0.method9096(); // L: 9047
				var3.field1247 = var0.method9095(); // L: 9048
				var3.field1217 = var0.method9078(); // L: 9049
				var3.spotAnimation = var0.method9100() + Client.cycle; // L: 9050
				var3.field1254 = var0.readUnsignedShort() + Client.cycle; // L: 9051
				var3.field1255 = var0.method9102(); // L: 9052
				var3.pathLength = 1; // L: 9053
				var3.field1261 = 0; // L: 9054
				var3.field1249 += var3.pathX[0]; // L: 9055
				var3.field1251 += var3.pathY[0]; // L: 9056
				var3.field1247 += var3.pathX[0]; // L: 9057
				var3.field1217 += var3.pathY[0]; // L: 9058
			}

			if ((var4 & 65536) != 0) { // L: 9060
				var5 = var0.method9115(); // L: 9061
				var3.field1204 = (var5 & 1) != 0 ? var0.method9102() : var3.definition.turnLeftSequence; // L: 9062
				var3.field1265 = (var5 & 2) != 0 ? var0.method9101() : var3.definition.turnRightSequence; // L: 9063
				var3.walkSequence = (var5 & 4) != 0 ? var0.method9100() : var3.definition.walkSequence; // L: 9064
				var3.walkBackSequence = (var5 & 8) != 0 ? var0.method9102() : var3.definition.walkBackSequence; // L: 9065
				var3.walkLeftSequence = (var5 & 16) != 0 ? var0.method9101() : var3.definition.walkLeftSequence; // L: 9066
				var3.walkRightSequence = (var5 & 32) != 0 ? var0.method9101() : var3.definition.walkRightSequence; // L: 9067
				var3.runSequence = (var5 & 64) != 0 ? var0.method9102() : var3.definition.field2047; // L: 9068
				var3.field1211 = (var5 & 128) != 0 ? var0.method9102() : var3.definition.field2048; // L: 9069
				var3.field1252 = (var5 & 256) != 0 ? var0.method9100() : var3.definition.field2049; // L: 9070
				var3.field1213 = (var5 & 512) != 0 ? var0.method9102() : var3.definition.field2075; // L: 9071
				var3.field1214 = (var5 & 1024) != 0 ? var0.method9100() : var3.definition.field2043; // L: 9072
				var3.field1215 = (var5 & 2048) != 0 ? var0.method9102() : var3.definition.field2052; // L: 9073
				var3.field1216 = (var5 & 4096) != 0 ? var0.method9100() : var3.definition.field2059; // L: 9074
				var3.field1246 = (var5 & 8192) != 0 ? var0.method9101() : var3.definition.field2076; // L: 9075
				var3.idleSequence = (var5 & 16384) != 0 ? var0.method9100() : var3.definition.idleSequence; // L: 9076
			}

			if ((var4 & 262144) != 0) { // L: 9078
				var5 = var0.readUnsignedByte(); // L: 9079
				var13 = new int[8]; // L: 9080
				var14 = new short[8]; // L: 9081

				for (var8 = 0; var8 < 8; ++var8) { // L: 9082
					if ((var5 & 1 << var8) != 0) { // L: 9083
						var13[var8] = var0.method9198(); // L: 9084
						var14[var8] = (short)var0.method9075(); // L: 9085
					} else {
						var13[var8] = -1; // L: 9088
						var14[var8] = -1; // L: 9089
					}
				}

				var3.method2580(var13, var14); // L: 9092
			}

			if ((var4 & 32768) != 0) { // L: 9094
				var3.method2569(var0.readStringCp1252NullTerminated()); // L: 9095
			}

			if ((var4 & 2) != 0) { // L: 9097
				var0.readUnsignedShort(); // L: 9098
				var0.readInt(); // L: 9099
			}

			if ((var4 & 1) != 0) { // L: 9101
				var3.overheadText = var0.readStringCp1252NullTerminated(); // L: 9102
				var3.overheadTextCyclesRemaining = 100; // L: 9103
			}

			if ((var4 & 8192) != 0) { // L: 9105
				var3.field1258 = Client.cycle + var0.readUnsignedShort(); // L: 9106
				var3.field1200 = Client.cycle + var0.readUnsignedShort(); // L: 9107
				var3.field1260 = var0.method9095(); // L: 9108
				var3.field1218 = var0.method9095(); // L: 9109
				var3.field1212 = var0.method9095(); // L: 9110
				var3.field1250 = (byte)var0.readUnsignedByte(); // L: 9111
			}

			if ((var4 & 256) != 0) { // L: 9113
				var5 = var0.method9091(); // L: 9114
				if ((var5 & 1) == 1) { // L: 9115
					var3.method2586(); // L: 9116
				} else {
					var13 = null; // L: 9119
					if ((var5 & 2) == 2) { // L: 9120
						var7 = var0.method9091(); // L: 9121
						var13 = new int[var7]; // L: 9122

						for (var8 = 0; var8 < var7; ++var8) { // L: 9123
							var9 = var0.method9101(); // L: 9124
							var9 = var9 == 65535 ? -1 : var9; // L: 9125
							var13[var8] = var9; // L: 9126
						}
					}

					var14 = null; // L: 9129
					if ((var5 & 4) == 4) { // L: 9130
						var8 = 0; // L: 9131
						if (var3.definition.recolorTo != null) { // L: 9132
							var8 = var3.definition.recolorTo.length; // L: 9133
						}

						var14 = new short[var8]; // L: 9135

						for (var9 = 0; var9 < var8; ++var9) { // L: 9136
							var14[var9] = (short)var0.method9101(); // L: 9137
						}
					}

					var15 = null; // L: 9140
					if ((var5 & 8) == 8) { // L: 9141
						var9 = 0; // L: 9142
						if (var3.definition.retextureTo != null) { // L: 9143
							var9 = var3.definition.retextureTo.length; // L: 9144
						}

						var15 = new short[var9]; // L: 9146

						for (var10 = 0; var10 < var9; ++var10) { // L: 9147
							var15[var10] = (short)var0.method9100(); // L: 9148
						}
					}

					var19 = false; // L: 9151
					if ((var5 & 16) != 0) { // L: 9152
						var19 = var0.method9093() == 1; // L: 9153
					}

					var16 = (long)(++NPC.field1325 - 1); // L: 9155
					var3.method2584(new class194(var16, var13, var14, var15, var19)); // L: 9156
				}
			}

			if ((var4 & 16384) != 0) { // L: 9159
				var3.method2570(var0.method9091()); // L: 9160
			}

			if ((var4 & 1024) != 0) { // L: 9162
				var3.field1273 = var0.readInt(); // L: 9163
			}
		}

	} // L: 9166
}
