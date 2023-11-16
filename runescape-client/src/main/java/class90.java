import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
public enum class90 implements class383 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ldr;"
	)
	field1092(0, -1),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ldr;"
	)
	field1084(1, 2),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ldr;"
	)
	field1085(2, 3),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ldr;"
	)
	field1091(3, 4),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldr;"
	)
	field1087(4, 5),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ldr;"
	)
	field1086(5, 6);

	@ObfuscatedName("av")
	public static short[][] field1094;
	@ObfuscatedName("ae")
	static String field1088;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1259061193
	)
	final int field1089;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -447285435
	)
	final int field1090;

	class90(int var3, int var4) {
		this.field1089 = var3; // L: 21
		this.field1090 = var4; // L: 22
	} // L: 23

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1090; // L: 27
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-9"
	)
	static boolean method2382(int var0, int var1) {
		return var0 != 4 || var1 < 8; // L: 26
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(CLof;B)I",
		garbageValue = "53"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4; // L: 143
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) { // L: 144
			var0 = Character.toLowerCase(var0); // L: 145
			var2 = (var0 << 4) + 1; // L: 146
		}

		if (var0 == 241 && var1 == Language.Language_ES) { // L: 148
			var2 = 1762;
		}

		return var2; // L: 149
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "892396745"
	)
	static final void method2384() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8484 8485 8491
			if (var0.hitpoints == -1) { // L: 8486
				var0.delay = 0; // L: 8487
				ScriptFrame.method1212(var0); // L: 8488
			} else {
				var0.remove(); // L: 8490
			}
		}

	} // L: 8493

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(ZLuo;I)V",
		garbageValue = "2029902605"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field617 = 0; // L: 8805
		Client.field637 = 0; // L: 8806
		class472.method8565(var1); // L: 8807

		int var3;
		int var8;
		int var9;
		int var10;
		int var12;
		int var19;
		while (true) {
			byte var2 = 16; // L: 8810
			var3 = 1 << var2; // L: 8811
			if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) < var2 + 12) { // L: 8812
				break;
			}

			int var4 = var1.readBits(var2); // L: 8813
			if (var4 == var3 - 1) { // L: 8814
				break;
			}

			boolean var5 = false; // L: 8815
			if (Client.npcs[var4] == null) { // L: 8816
				Client.npcs[var4] = new NPC(); // L: 8817
				var5 = true; // L: 8818
			}

			NPC var20 = Client.npcs[var4]; // L: 8820
			Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8821
			var20.npcCycle = Client.cycle; // L: 8822
			var19 = var1.readBits(1); // L: 8826
			var10 = Client.field622[var1.readBits(3)]; // L: 8827
			if (var5) { // L: 8828
				var20.orientation = var20.rotation = var10;
			}

			if (var0) { // L: 8829
				var8 = var1.readBits(8); // L: 8830
				if (var8 > 127) { // L: 8831
					var8 -= 256;
				}
			} else {
				var8 = var1.readBits(5); // L: 8834
				if (var8 > 15) { // L: 8835
					var8 -= 32;
				}
			}

			boolean var11 = var1.readBits(1) == 1; // L: 8837
			if (var11) { // L: 8838
				var1.readBits(32); // L: 8839
			}

			var12 = var1.readBits(1); // L: 8841
			if (var12 == 1) { // L: 8842
				Client.field549[++Client.field637 - 1] = var4;
			}

			if (var0) { // L: 8843
				var9 = var1.readBits(8); // L: 8844
				if (var9 > 127) { // L: 8845
					var9 -= 256;
				}
			} else {
				var9 = var1.readBits(5); // L: 8848
				if (var9 > 15) { // L: 8849
					var9 -= 32;
				}
			}

			var20.definition = VerticalAlignment.getNpcDefinition(var1.readBits(14)); // L: 8851
			class33.method495(var20); // L: 8852
			if (var20.field1240 == 0) { // L: 8853
				var20.rotation = 0;
			}

			var20.method2702(class229.localPlayer.pathX[0] + var8, class229.localPlayer.pathY[0] + var9, var19 == 1); // L: 8854
		}

		var1.exportIndex(); // L: 8856

		int var21;
		for (var21 = 0; var21 < Client.field637; ++var21) { // L: 8859
			var3 = Client.field549[var21]; // L: 8860
			NPC var14 = Client.npcs[var3]; // L: 8861
			int var22 = var1.readUnsignedByte(); // L: 8862
			int var6;
			if ((var22 & 16) != 0) { // L: 8863
				var6 = var1.readUnsignedByte(); // L: 8864
				var22 += var6 << 8; // L: 8865
			}

			if ((var22 & 256) != 0) { // L: 8867
				var6 = var1.readUnsignedByte(); // L: 8868
				var22 += var6 << 16; // L: 8869
			}

			int[] var7;
			short[] var15;
			short[] var16;
			long var17;
			int var23;
			boolean var24;
			if ((var22 & 4096) != 0) { // L: 8871
				var6 = var1.method9496(); // L: 8872
				if ((var6 & 1) == 1) { // L: 8873
					var14.method2675(); // L: 8874
				} else {
					var7 = null; // L: 8877
					if ((var6 & 2) == 2) { // L: 8878
						var8 = var1.method9294(); // L: 8879
						var7 = new int[var8]; // L: 8880

						for (var9 = 0; var9 < var8; ++var9) { // L: 8881
							var10 = var1.method9302(); // L: 8882
							var10 = var10 == 65535 ? -1 : var10; // L: 8883
							var7[var9] = var10; // L: 8884
						}
					}

					var15 = null; // L: 8887
					if ((var6 & 4) == 4) { // L: 8888
						var9 = 0; // L: 8889
						if (var14.definition.recolorTo != null) { // L: 8890
							var9 = var14.definition.recolorTo.length; // L: 8891
						}

						var15 = new short[var9]; // L: 8893

						for (var10 = 0; var10 < var9; ++var10) { // L: 8894
							var15[var10] = (short)var1.method9302(); // L: 8895
						}
					}

					var16 = null; // L: 8898
					if ((var6 & 8) == 8) { // L: 8899
						var10 = 0; // L: 8900
						if (var14.definition.retextureTo != null) { // L: 8901
							var10 = var14.definition.retextureTo.length; // L: 8902
						}

						var16 = new short[var10]; // L: 8904

						for (var23 = 0; var23 < var10; ++var23) { // L: 8905
							var16[var23] = (short)var1.method9303(); // L: 8906
						}
					}

					var24 = false; // L: 8909
					if ((var6 & 16) != 0) { // L: 8910
						var24 = var1.method9496() == 1; // L: 8911
					}

					var17 = (long)(++NPC.field1311 - 1); // L: 8913
					var14.method2673(new class187(var17, var7, var15, var16, var24)); // L: 8914
				}
			}

			if ((var22 & 65536) != 0) { // L: 8917
				var6 = var1.readUnsignedByte(); // L: 8918
				var7 = new int[8]; // L: 8919
				var15 = new short[8]; // L: 8920

				for (var9 = 0; var9 < 8; ++var9) { // L: 8921
					if ((var6 & 1 << var9) != 0) { // L: 8922
						var7[var9] = var1.method9280(); // L: 8923
						var15[var9] = (short)var1.method9277(); // L: 8924
					} else {
						var7[var9] = -1; // L: 8927
						var15[var9] = -1; // L: 8928
					}
				}

				var14.method2669(var7, var15); // L: 8931
			}

			if ((var22 & 262144) != 0) { // L: 8933
				var6 = var1.method9319(); // L: 8934
				var14.field1191 = (var6 & 1) != 0 ? var1.readUnsignedShort() : var14.definition.turnLeftSequence; // L: 8935
				var14.field1207 = (var6 & 2) != 0 ? var1.method9303() : var14.definition.turnRightSequence; // L: 8936
				var14.walkSequence = (var6 & 4) != 0 ? var1.method9304() : var14.definition.walkSequence; // L: 8937
				var14.walkBackSequence = (var6 & 8) != 0 ? var1.method9303() : var14.definition.walkBackSequence; // L: 8938
				var14.walkLeftSequence = (var6 & 16) != 0 ? var1.method9304() : var14.definition.walkLeftSequence; // L: 8939
				var14.walkRightSequence = (var6 & 32) != 0 ? var1.method9303() : var14.definition.walkRightSequence; // L: 8940
				var14.runSequence = (var6 & 64) != 0 ? var1.method9302() : var14.definition.field1931; // L: 8941
				var14.field1185 = (var6 & 128) != 0 ? var1.method9304() : var14.definition.field1937; // L: 8942
				var14.field1186 = (var6 & 256) != 0 ? var1.method9303() : var14.definition.field1954; // L: 8943
				var14.field1233 = (var6 & 512) != 0 ? var1.readUnsignedShort() : var14.definition.field1962; // L: 8944
				var14.field1188 = (var6 & 1024) != 0 ? var1.method9303() : var14.definition.field1961; // L: 8945
				var14.field1189 = (var6 & 2048) != 0 ? var1.readUnsignedShort() : var14.definition.field1941; // L: 8946
				var14.field1190 = (var6 & 4096) != 0 ? var1.method9303() : var14.definition.field1958; // L: 8947
				var14.field1239 = (var6 & 8192) != 0 ? var1.method9303() : var14.definition.field1945; // L: 8948
				var14.idleSequence = (var6 & 16384) != 0 ? var1.method9304() : var14.definition.idleSequence; // L: 8949
			}

			if ((var22 & 1) != 0) { // L: 8951
				var6 = var1.method9302(); // L: 8952
				if (var6 == 65535) { // L: 8953
					var6 = -1; // L: 8954
				}

				var19 = var1.readUnsignedByte(); // L: 8956
				if (var6 == var14.sequence && var6 != -1) { // L: 8957
					var8 = DynamicObject.SequenceDefinition_get(var6).field2230; // L: 8958
					if (var8 == 1) { // L: 8959
						var14.sequenceFrame = 0; // L: 8960
						var14.sequenceFrameCycle = 0; // L: 8961
						var14.sequenceDelay = var19; // L: 8962
						var14.field1199 = 0; // L: 8963
					}

					if (var8 == 2) { // L: 8965
						var14.field1199 = 0; // L: 8966
					}
				} else if (var6 == -1 || var14.sequence == -1 || DynamicObject.SequenceDefinition_get(var6).field2223 >= DynamicObject.SequenceDefinition_get(var14.sequence).field2223) { // L: 8969
					var14.sequence = var6; // L: 8970
					var14.sequenceFrame = 0; // L: 8971
					var14.sequenceFrameCycle = 0; // L: 8972
					var14.sequenceDelay = var19; // L: 8973
					var14.field1199 = 0; // L: 8974
					var14.field1220 = var14.pathLength; // L: 8975
				}
			}

			if ((var22 & 1024) != 0) { // L: 8979
				var14.field1209 = var1.method9296(); // L: 8980
				var14.field1194 = var1.method9297(); // L: 8981
				var14.field1224 = var1.method9296(); // L: 8982
				var14.field1203 = var1.method9297(); // L: 8983
				var14.spotAnimation = var1.method9304() + Client.cycle; // L: 8984
				var14.field1187 = var1.method9304() + Client.cycle; // L: 8985
				var14.field1229 = var1.method9304(); // L: 8986
				var14.pathLength = 1; // L: 8987
				var14.field1220 = 0; // L: 8988
				var14.field1209 += var14.pathX[0]; // L: 8989
				var14.field1194 += var14.pathY[0]; // L: 8990
				var14.field1224 += var14.pathX[0]; // L: 8991
				var14.field1203 += var14.pathY[0]; // L: 8992
			}

			if ((var22 & 8192) != 0) { // L: 8994
				var14.field1247 = var1.method9318(); // L: 8995
			}

			if ((var22 & 32) != 0) { // L: 8997
				var6 = var1.readUnsignedShort(); // L: 8998
				var19 = var1.method9302(); // L: 8999
				var14.field1211 = var1.method9294() == 1; // L: 9000
				if (Client.field492 >= 212) { // L: 9001
					var14.field1178 = var6; // L: 9002
					var14.field1210 = var19; // L: 9003
				} else {
					var8 = var14.x - (var6 - class187.baseX * 64 - class187.baseX * 64) * 64; // L: 9006
					var9 = var14.y - (var19 - class101.baseY * 64 - class101.baseY * 64) * 64; // L: 9007
					if (var8 != 0 || var9 != 0) { // L: 9008
						var14.field1208 = SequenceDefinition.method4094(var8, var9);
					}
				}
			}

			if ((var22 & 128) != 0) { // L: 9011
				var14.targetIndex = var1.readUnsignedShort(); // L: 9013
				var14.targetIndex += var1.method9294() << 16; // L: 9014
				var6 = 16777215; // L: 9015
				if (var6 == var14.targetIndex) { // L: 9016
					var14.targetIndex = -1; // L: 9017
				}
			}

			if ((var22 & 2) != 0) { // L: 9020
				var6 = var1.method9496(); // L: 9021
				if (var6 > 0) { // L: 9022
					for (var19 = 0; var19 < var6; ++var19) { // L: 9023
						var9 = -1; // L: 9025
						var10 = -1; // L: 9026
						var23 = -1; // L: 9027
						var8 = var1.readUShortSmart(); // L: 9028
						if (var8 == 32767) { // L: 9029
							var8 = var1.readUShortSmart(); // L: 9030
							var10 = var1.readUShortSmart(); // L: 9031
							var9 = var1.readUShortSmart(); // L: 9032
							var23 = var1.readUShortSmart(); // L: 9033
						} else if (var8 != 32766) { // L: 9035
							var10 = var1.readUShortSmart(); // L: 9036
						} else {
							var8 = -1; // L: 9038
						}

						var12 = var1.readUShortSmart(); // L: 9039
						var14.addHitSplat(var8, var10, var9, var23, Client.cycle, var12); // L: 9040
					}
				}

				var19 = var1.method9295(); // L: 9043
				if (var19 > 0) { // L: 9044
					for (var8 = 0; var8 < var19; ++var8) { // L: 9045
						var9 = var1.readUShortSmart(); // L: 9046
						var10 = var1.readUShortSmart(); // L: 9047
						if (var10 != 32767) { // L: 9048
							var23 = var1.readUShortSmart(); // L: 9049
							var12 = var1.readUnsignedByte(); // L: 9050
							int var13 = var10 > 0 ? var1.readUnsignedByte() : var12; // L: 9051
							var14.addHealthBar(var9, Client.cycle, var10, var23, var12, var13); // L: 9052
						} else {
							var14.removeHealthBar(var9); // L: 9054
						}
					}
				}
			}

			if ((var22 & 16384) != 0) { // L: 9058
				var14.method2713(var1.readStringCp1252NullTerminated()); // L: 9059
			}

			if ((var22 & 32768) != 0) { // L: 9061
				var14.method2660(var1.method9294()); // L: 9062
			}

			if ((var22 & 131072) != 0) { // L: 9064
				var6 = var1.readUnsignedByte(); // L: 9065

				for (var19 = 0; var19 < var6; ++var19) { // L: 9066
					var8 = var1.readUnsignedByte(); // L: 9067
					var9 = var1.readUnsignedShort(); // L: 9068
					var10 = var1.method9318(); // L: 9069
					var14.method2466(var8, var9, var10 >> 16, var10 & 65535); // L: 9070
				}
			}

			if ((var22 & 2048) != 0) { // L: 9073
				var14.field1232 = Client.cycle + var1.method9302(); // L: 9074
				var14.field1215 = Client.cycle + var1.method9304(); // L: 9075
				var14.field1234 = var1.method9296(); // L: 9076
				var14.field1235 = var1.method9297(); // L: 9077
				var14.field1171 = var1.method9296(); // L: 9078
				var14.field1237 = (byte)var1.method9295(); // L: 9079
			}

			if ((var22 & 512) != 0) { // L: 9081
				var6 = var1.method9294(); // L: 9082
				if ((var6 & 1) == 1) { // L: 9083
					var14.method2674(); // L: 9084
				} else {
					var7 = null; // L: 9087
					if ((var6 & 2) == 2) { // L: 9088
						var8 = var1.method9294(); // L: 9089
						var7 = new int[var8]; // L: 9090

						for (var9 = 0; var9 < var8; ++var9) { // L: 9091
							var10 = var1.readUnsignedShort(); // L: 9092
							var10 = var10 == 65535 ? -1 : var10; // L: 9093
							var7[var9] = var10; // L: 9094
						}
					}

					var15 = null; // L: 9097
					if ((var6 & 4) == 4) { // L: 9098
						var9 = 0; // L: 9099
						if (var14.definition.recolorTo != null) { // L: 9100
							var9 = var14.definition.recolorTo.length; // L: 9101
						}

						var15 = new short[var9]; // L: 9103

						for (var10 = 0; var10 < var9; ++var10) { // L: 9104
							var15[var10] = (short)var1.readUnsignedShort(); // L: 9105
						}
					}

					var16 = null; // L: 9108
					if ((var6 & 8) == 8) { // L: 9109
						var10 = 0; // L: 9110
						if (var14.definition.retextureTo != null) { // L: 9111
							var10 = var14.definition.retextureTo.length; // L: 9112
						}

						var16 = new short[var10]; // L: 9114

						for (var23 = 0; var23 < var10; ++var23) { // L: 9115
							var16[var23] = (short)var1.method9303(); // L: 9116
						}
					}

					var24 = false; // L: 9119
					if ((var6 & 16) != 0) { // L: 9120
						var24 = var1.method9496() == 1; // L: 9121
					}

					var17 = (long)(++NPC.field1305 - 1); // L: 9123
					var14.method2671(new class187(var17, var7, var15, var16, var24)); // L: 9124
				}
			}

			if ((var22 & 8) != 0) { // L: 9127
				var14.definition = VerticalAlignment.getNpcDefinition(var1.method9302()); // L: 9128
				class33.method495(var14); // L: 9129
				var14.method2670(); // L: 9130
			}

			if ((var22 & 4) != 0) { // L: 9132
				var14.field1225 = var1.readStringCp1252NullTerminated(); // L: 9133
				var14.field1195 = 100; // L: 9134
			}

			if ((var22 & 64) != 0) { // L: 9136
				var1.method9303(); // L: 9137
				var1.method9319(); // L: 9138
			}
		}

		for (var21 = 0; var21 < Client.field617; ++var21) { // L: 9142
			var3 = Client.field618[var21]; // L: 9143
			if (Client.npcs[var3].npcCycle != Client.cycle) { // L: 9144
				Client.npcs[var3].definition = null; // L: 9145
				Client.npcs[var3] = null; // L: 9146
			}
		}

		if (var1.offset != Client.packetWriter.serverPacketLength) { // L: 9149
			throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength); // L: 9150
		} else {
			for (var21 = 0; var21 < Client.npcCount; ++var21) { // L: 9152
				if (Client.npcs[Client.npcIndices[var21]] == null) { // L: 9153
					throw new RuntimeException(var21 + "," + Client.npcCount); // L: 9154
				}
			}

		}
	} // L: 9157
}
