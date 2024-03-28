import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
public class class102 {
	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(Lun;I)V",
		garbageValue = "-1720385947"
	)
	static final void method2657(PacketBuffer var0) {
		for (int var1 = 0; var1 < Client.field571; ++var1) { // L: 8923
			int var2 = Client.field742[var1]; // L: 8924
			NPC var3 = Client.npcs[var2]; // L: 8925
			int var4 = var0.readUnsignedByte(); // L: 8926
			int var5;
			if ((var4 & 2) != 0) { // L: 8927
				var5 = var0.readUnsignedByte(); // L: 8928
				var4 += var5 << 8; // L: 8929
			}

			if ((var4 & 256) != 0) { // L: 8931
				var5 = var0.readUnsignedByte(); // L: 8932
				var4 += var5 << 16; // L: 8933
			}

			if ((var4 & 64) != 0) { // L: 8935
				var0.method9321(); // L: 8936
				var0.method9335(); // L: 8937
			}

			int var6;
			int var7;
			int var8;
			int var9;
			if ((var4 & 65536) != 0) { // L: 8939
				var5 = var0.method9298(); // L: 8940

				for (var6 = 0; var6 < var5; ++var6) { // L: 8941
					var7 = var0.method9462(); // L: 8942
					var8 = var0.method9318(); // L: 8943
					var9 = var0.readInt(); // L: 8944
					var3.method2414(var7, var8, var9 >> 16, var9 & 65535); // L: 8945
				}
			}

			if ((var4 & 1) != 0) { // L: 8948
				var3.overheadText = var0.readStringCp1252NullTerminated(); // L: 8949
				var3.overheadTextCyclesRemaining = 100; // L: 8950
			}

			if ((var4 & 16384) != 0) { // L: 8952
				var3.method2582(var0.method9300()); // L: 8953
			}

			if ((var4 & 8192) != 0) { // L: 8955
				var3.field1251 = var0.method9302(); // L: 8956
				var3.field1238 = var0.method9316(); // L: 8957
				var3.field1258 = var0.method9301(); // L: 8958
				var3.field1253 = var0.method9301(); // L: 8959
				var3.spotAnimation = var0.readUnsignedShort() + Client.cycle; // L: 8960
				var3.field1256 = var0.method9318() + Client.cycle; // L: 8961
				var3.field1203 = var0.method9380(); // L: 8962
				var3.pathLength = 1; // L: 8963
				var3.field1274 = 0; // L: 8964
				var3.field1251 += var3.pathX[0]; // L: 8965
				var3.field1238 += var3.pathY[0]; // L: 8966
				var3.field1258 += var3.pathX[0]; // L: 8967
				var3.field1253 += var3.pathY[0]; // L: 8968
			}

			if ((var4 & 32) != 0) { // L: 8970
				var5 = var0.method9318(); // L: 8971
				if (var5 == 65535) { // L: 8972
					var5 = -1; // L: 8973
				}

				var6 = var0.readUnsignedByte(); // L: 8975
				if (var5 == var3.sequence && var5 != -1) { // L: 8976
					var7 = DevicePcmPlayerProvider.SequenceDefinition_get(var5).field2396; // L: 8977
					if (var7 == 1) { // L: 8978
						var3.sequenceFrame = 0; // L: 8979
						var3.sequenceFrameCycle = 0; // L: 8980
						var3.sequenceDelay = var6; // L: 8981
						var3.field1248 = 0; // L: 8982
					}

					if (var7 == 2) { // L: 8984
						var3.field1248 = 0; // L: 8985
					}
				} else if (var5 == -1 || var3.sequence == -1 || DevicePcmPlayerProvider.SequenceDefinition_get(var5).field2393 >= DevicePcmPlayerProvider.SequenceDefinition_get(var3.sequence).field2393) { // L: 8988
					var3.sequence = var5; // L: 8989
					var3.sequenceFrame = 0; // L: 8990
					var3.sequenceFrameCycle = 0; // L: 8991
					var3.sequenceDelay = var6; // L: 8992
					var3.field1248 = 0; // L: 8993
					var3.field1274 = var3.pathLength; // L: 8994
				}
			}

			if ((var4 & 4096) != 0) { // L: 8998
				var3.field1260 = Client.cycle + var0.readUnsignedShort(); // L: 8999
				var3.field1236 = Client.cycle + var0.method9318(); // L: 9000
				var3.field1261 = var0.method9301(); // L: 9001
				var3.field1263 = var0.readByte(); // L: 9002
				var3.field1235 = var0.method9316(); // L: 9003
				var3.field1265 = (byte)var0.method9298(); // L: 9004
			}

			int[] var13;
			short[] var14;
			if ((var4 & 131072) != 0) { // L: 9006
				var5 = var0.method9300(); // L: 9007
				var13 = new int[8]; // L: 9008
				var14 = new short[8]; // L: 9009

				for (var8 = 0; var8 < 8; ++var8) { // L: 9010
					if ((var5 & 1 << var8) != 0) { // L: 9011
						var13[var8] = var0.method9436(); // L: 9012
						var14[var8] = (short)var0.method9282(); // L: 9013
					} else {
						var13[var8] = -1; // L: 9016
						var14[var8] = -1; // L: 9017
					}
				}

				var3.method2591(var13, var14); // L: 9020
			}

			if ((var4 & 32768) != 0) { // L: 9022
				var3.method2626(var0.readStringCp1252NullTerminated()); // L: 9023
			}

			int var10;
			short[] var15;
			long var16;
			boolean var18;
			if ((var4 & 1024) != 0) { // L: 9025
				var5 = var0.method9462(); // L: 9026
				if ((var5 & 1) == 1) { // L: 9027
					var3.method2625(); // L: 9028
				} else {
					var13 = null; // L: 9031
					if ((var5 & 2) == 2) { // L: 9032
						var7 = var0.method9462(); // L: 9033
						var13 = new int[var7]; // L: 9034

						for (var8 = 0; var8 < var7; ++var8) { // L: 9035
							var9 = var0.method9321(); // L: 9036
							var9 = var9 == 65535 ? -1 : var9; // L: 9037
							var13[var8] = var9; // L: 9038
						}
					}

					var14 = null; // L: 9041
					if ((var5 & 4) == 4) { // L: 9042
						var8 = 0; // L: 9043
						if (var3.definition.recolorTo != null) { // L: 9044
							var8 = var3.definition.recolorTo.length; // L: 9045
						}

						var14 = new short[var8]; // L: 9047

						for (var9 = 0; var9 < var8; ++var9) { // L: 9048
							var14[var9] = (short)var0.method9321(); // L: 9049
						}
					}

					var15 = null; // L: 9052
					if ((var5 & 8) == 8) { // L: 9053
						var9 = 0; // L: 9054
						if (var3.definition.retextureTo != null) { // L: 9055
							var9 = var3.definition.retextureTo.length; // L: 9056
						}

						var15 = new short[var9]; // L: 9058

						for (var10 = 0; var10 < var9; ++var10) { // L: 9059
							var15[var10] = (short)var0.method9321(); // L: 9060
						}
					}

					var18 = false; // L: 9063
					if ((var5 & 16) != 0) { // L: 9064
						var18 = var0.method9298() == 1; // L: 9065
					}

					var16 = (long)(++NPC.field1337 - 1); // L: 9067
					var3.method2593(new class206(var16, var13, var14, var15, var18)); // L: 9068
				}
			}

			if ((var4 & 512) != 0) { // L: 9071
				var5 = var0.method9462(); // L: 9072
				if ((var5 & 1) == 1) { // L: 9073
					var3.method2597(); // L: 9074
				} else {
					var13 = null; // L: 9077
					if ((var5 & 2) == 2) { // L: 9078
						var7 = var0.readUnsignedByte(); // L: 9079
						var13 = new int[var7]; // L: 9080

						for (var8 = 0; var8 < var7; ++var8) { // L: 9081
							var9 = var0.method9321(); // L: 9082
							var9 = var9 == 65535 ? -1 : var9; // L: 9083
							var13[var8] = var9; // L: 9084
						}
					}

					var14 = null; // L: 9087
					if ((var5 & 4) == 4) { // L: 9088
						var8 = 0; // L: 9089
						if (var3.definition.recolorTo != null) { // L: 9090
							var8 = var3.definition.recolorTo.length; // L: 9091
						}

						var14 = new short[var8]; // L: 9093

						for (var9 = 0; var9 < var8; ++var9) { // L: 9094
							var14[var9] = (short)var0.readUnsignedShort(); // L: 9095
						}
					}

					var15 = null; // L: 9098
					if ((var5 & 8) == 8) { // L: 9099
						var9 = 0; // L: 9100
						if (var3.definition.retextureTo != null) { // L: 9101
							var9 = var3.definition.retextureTo.length; // L: 9102
						}

						var15 = new short[var9]; // L: 9104

						for (var10 = 0; var10 < var9; ++var10) { // L: 9105
							var15[var10] = (short)var0.method9380(); // L: 9106
						}
					}

					var18 = false; // L: 9109
					if ((var5 & 16) != 0) { // L: 9110
						var18 = var0.readUnsignedByte() == 1; // L: 9111
					}

					var16 = (long)(++NPC.field1338 - 1); // L: 9113
					var3.method2586(new class206(var16, var13, var14, var15, var18)); // L: 9114
				}
			}

			if ((var4 & 16) != 0) { // L: 9117
				var3.definition = UserComparator10.getNpcDefinition(var0.method9380()); // L: 9118
				SoundCache.method843(var3); // L: 9119
				var3.method2590(); // L: 9120
			}

			if ((var4 & 2048) != 0) { // L: 9122
				var3.field1275 = var0.method9335(); // L: 9123
			}

			if ((var4 & 4) != 0) { // L: 9125
				var5 = var0.readUnsignedByte(); // L: 9126
				int var11;
				if (var5 > 0) { // L: 9127
					for (var6 = 0; var6 < var5; ++var6) { // L: 9128
						var8 = -1; // L: 9130
						var9 = -1; // L: 9131
						var10 = -1; // L: 9132
						var7 = var0.readUShortSmart(); // L: 9133
						if (var7 == 32767) { // L: 9134
							var7 = var0.readUShortSmart(); // L: 9135
							var9 = var0.readUShortSmart(); // L: 9136
							var8 = var0.readUShortSmart(); // L: 9137
							var10 = var0.readUShortSmart(); // L: 9138
						} else if (var7 != 32766) { // L: 9140
							var9 = var0.readUShortSmart(); // L: 9141
						} else {
							var7 = -1; // L: 9143
						}

						var11 = var0.readUShortSmart(); // L: 9144
						var3.addHitSplat(var7, var9, var8, var10, Client.cycle, var11); // L: 9145
					}
				}

				var6 = var0.readUnsignedByte(); // L: 9148
				if (var6 > 0) { // L: 9149
					for (var7 = 0; var7 < var6; ++var7) { // L: 9150
						var8 = var0.readUShortSmart(); // L: 9151
						var9 = var0.readUShortSmart(); // L: 9152
						if (var9 != 32767) { // L: 9153
							var10 = var0.readUShortSmart(); // L: 9154
							var11 = var0.readUnsignedByte(); // L: 9155
							int var12 = var9 > 0 ? var0.method9298() : var11; // L: 9156
							var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12); // L: 9157
						} else {
							var3.removeHealthBar(var8); // L: 9159
						}
					}
				}
			}

			if ((var4 & 8) != 0) { // L: 9163
				var5 = var0.method9318(); // L: 9164
				var6 = var0.method9318(); // L: 9165
				var3.field1239 = var0.readUnsignedByte() == 1; // L: 9166
				var3.field1237 = var5; // L: 9167
				var3.field1216 = var6; // L: 9168
			}

			if ((var4 & 128) != 0) { // L: 9170
				var3.targetIndex = var0.method9318(); // L: 9172
				var3.targetIndex += var0.readUnsignedByte() << 16; // L: 9173
				var5 = 16777215; // L: 9174
				if (var5 == var3.targetIndex) { // L: 9175
					var3.targetIndex = -1; // L: 9176
				}
			}

			if ((var4 & 262144) != 0) { // L: 9179
				var5 = var0.method9335(); // L: 9180
				var3.field1206 = (var5 & 1) != 0 ? var0.readUnsignedShort() : var3.definition.turnLeftSequence; // L: 9181
				var3.field1207 = (var5 & 2) != 0 ? var0.method9380() : var3.definition.turnRightSequence; // L: 9182
				var3.walkSequence = (var5 & 4) != 0 ? var0.readUnsignedShort() : var3.definition.walkSequence; // L: 9183
				var3.walkBackSequence = (var5 & 8) != 0 ? var0.readUnsignedShort() : var3.definition.walkBackSequence; // L: 9184
				var3.walkLeftSequence = (var5 & 16) != 0 ? var0.method9380() : var3.definition.walkLeftSequence; // L: 9185
				var3.walkRightSequence = (var5 & 32) != 0 ? var0.method9318() : var3.definition.walkRightSequence; // L: 9186
				var3.runSequence = (var5 & 64) != 0 ? var0.method9321() : var3.definition.field2117; // L: 9187
				var3.field1213 = (var5 & 128) != 0 ? var0.method9321() : var3.definition.field2105; // L: 9188
				var3.field1214 = (var5 & 256) != 0 ? var0.method9321() : var3.definition.field2119; // L: 9189
				var3.field1215 = (var5 & 512) != 0 ? var0.method9318() : var3.definition.field2111; // L: 9190
				var3.field1264 = (var5 & 1024) != 0 ? var0.method9321() : var3.definition.field2121; // L: 9191
				var3.field1269 = (var5 & 2048) != 0 ? var0.method9318() : var3.definition.field2122; // L: 9192
				var3.field1218 = (var5 & 4096) != 0 ? var0.method9380() : var3.definition.field2123; // L: 9193
				var3.field1226 = (var5 & 8192) != 0 ? var0.method9318() : var3.definition.field2124; // L: 9194
				var3.idleSequence = (var5 & 16384) != 0 ? var0.readUnsignedShort() : var3.definition.idleSequence; // L: 9195
			}
		}

	} // L: 9198

	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "(Lcu;I)V",
		garbageValue = "94460787"
	)
	static void method2651(class67 var0) {
		if (GraphicsObject.field894 != var0) { // L: 12978
			GraphicsObject.field894 = var0; // L: 12979
		}
	} // L: 12980
}
