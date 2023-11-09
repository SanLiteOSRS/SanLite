import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
public class class126 extends class128 {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		longValue = -4861736174354117555L
	)
	long field1532;
	@ObfuscatedName("h")
	String field1533;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lei;)V"
	)
	class126(class131 var1) {
		this.this$0 = var1;
		this.field1532 = -1L; // L: 74
		this.field1533 = null; // L: 75
	} // L: 77

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-885940784"
	)
	void vmethod3087(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 80
			--var1.offset; // L: 81
			this.field1532 = var1.readLong(); // L: 82
		}

		this.field1533 = var1.readStringCp1252NullTerminatedOrNull(); // L: 84
	} // L: 85

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Leh;B)V",
		garbageValue = "0"
	)
	void vmethod3084(ClanSettings var1) {
		var1.method2955(this.field1532, this.field1533, 0); // L: 88
	} // L: 89

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqz;I)V",
		garbageValue = "507766968"
	)
	static final void method2789(PacketBuffer var0) {
		for (int var1 = 0; var1 < Players.Players_pendingUpdateCount; ++var1) { // L: 443
			int var2 = Players.Players_pendingUpdateIndices[var1]; // L: 444
			Player var3 = Client.players[var2]; // L: 445
			int var4 = var0.readUnsignedByte(); // L: 446
			if ((var4 & 32) != 0) { // L: 447
				var4 += var0.readUnsignedByte() << 8;
			}

			FriendLoginUpdate.method6596(var0, var2, var3, var4); // L: 448
		}

	} // L: 450

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(ZLqz;I)V",
		garbageValue = "346209419"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field495 = 0; // L: 7868
		Client.field533 = 0; // L: 7869
		PacketBuffer var2 = Client.packetWriter.packetBuffer; // L: 7871
		var2.importIndex(); // L: 7872
		int var3 = var2.readBits(8); // L: 7873
		int var4;
		if (var3 < Client.npcCount) { // L: 7874
			for (var4 = var3; var4 < Client.npcCount; ++var4) { // L: 7875
				Client.field584[++Client.field495 - 1] = Client.npcIndices[var4];
			}
		}

		if (var3 > Client.npcCount) { // L: 7877
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0; // L: 7878

			int var5;
			int var7;
			int var8;
			int var9;
			int var10;
			for (var4 = 0; var4 < var3; ++var4) { // L: 7879
				var5 = Client.npcIndices[var4]; // L: 7880
				NPC var16 = Client.npcs[var5]; // L: 7881
				var7 = var2.readBits(1); // L: 7882
				if (var7 == 0) { // L: 7883
					Client.npcIndices[++Client.npcCount - 1] = var5; // L: 7884
					var16.npcCycle = Client.cycle; // L: 7885
				} else {
					var8 = var2.readBits(2); // L: 7888
					if (var8 == 0) { // L: 7889
						Client.npcIndices[++Client.npcCount - 1] = var5; // L: 7890
						var16.npcCycle = Client.cycle; // L: 7891
						Client.field534[++Client.field533 - 1] = var5; // L: 7892
					} else if (var8 == 1) { // L: 7895
						Client.npcIndices[++Client.npcCount - 1] = var5; // L: 7896
						var16.npcCycle = Client.cycle; // L: 7897
						var9 = var2.readBits(3); // L: 7898
						var16.method2315(var9, class192.field2206); // L: 7899
						var10 = var2.readBits(1); // L: 7900
						if (var10 == 1) { // L: 7901
							Client.field534[++Client.field533 - 1] = var5;
						}
					} else if (var8 == 2) { // L: 7904
						Client.npcIndices[++Client.npcCount - 1] = var5; // L: 7905
						var16.npcCycle = Client.cycle; // L: 7906
						if (var2.readBits(1) == 1) { // L: 7907
							var9 = var2.readBits(3); // L: 7908
							var16.method2315(var9, class192.field2207); // L: 7909
							var10 = var2.readBits(3); // L: 7910
							var16.method2315(var10, class192.field2207); // L: 7911
						} else {
							var9 = var2.readBits(3); // L: 7914
							var16.method2315(var9, class192.field2209); // L: 7915
						}

						var9 = var2.readBits(1); // L: 7917
						if (var9 == 1) { // L: 7918
							Client.field534[++Client.field533 - 1] = var5;
						}
					} else if (var8 == 3) { // L: 7921
						Client.field584[++Client.field495 - 1] = var5; // L: 7922
					}
				}
			}

			int var6;
			int var14;
			NPC var15;
			while (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) { // L: 7929
				var14 = var1.readBits(15); // L: 7930
				if (var14 == 32767) { // L: 7931
					break;
				}

				boolean var17 = false; // L: 7932
				if (Client.npcs[var14] == null) { // L: 7933
					Client.npcs[var14] = new NPC(); // L: 7934
					var17 = true; // L: 7935
				}

				var15 = Client.npcs[var14]; // L: 7937
				Client.npcIndices[++Client.npcCount - 1] = var14; // L: 7938
				var15.npcCycle = Client.cycle; // L: 7939
				if (class309.field3942) { // L: 7943
					if (var0) { // L: 7944
						var7 = var1.readBits(8); // L: 7945
						if (var7 > 127) { // L: 7946
							var7 -= 256;
						}
					} else {
						var7 = var1.readBits(5); // L: 7949
						if (var7 > 15) { // L: 7950
							var7 -= 32;
						}
					}

					if (var0) { // L: 7952
						var6 = var1.readBits(8); // L: 7953
						if (var6 > 127) { // L: 7954
							var6 -= 256;
						}
					} else {
						var6 = var1.readBits(5); // L: 7957
						if (var6 > 15) { // L: 7958
							var6 -= 32;
						}
					}

					var5 = var1.readBits(1); // L: 7960
					boolean var18 = var1.readBits(1) == 1; // L: 7961
					if (var18) { // L: 7962
						var1.readBits(32); // L: 7963
					}

					var15.definition = class119.getNpcDefinition(var1.readBits(14)); // L: 7965
					var9 = Client.defaultRotations[var1.readBits(3)]; // L: 7966
					if (var17) { // L: 7967
						var15.orientation = var15.rotation = var9;
					}

					var10 = var1.readBits(1); // L: 7968
					if (var10 == 1) { // L: 7969
						Client.field534[++Client.field533 - 1] = var14;
					}
				} else {
					var15.definition = class119.getNpcDefinition(var1.readBits(14)); // L: 7972
					var8 = var1.readBits(1); // L: 7973
					if (var8 == 1) { // L: 7974
						Client.field534[++Client.field533 - 1] = var14;
					}

					if (var0) { // L: 7975
						var7 = var1.readBits(8); // L: 7976
						if (var7 > 127) { // L: 7977
							var7 -= 256;
						}
					} else {
						var7 = var1.readBits(5); // L: 7980
						if (var7 > 15) { // L: 7981
							var7 -= 32;
						}
					}

					boolean var19 = var1.readBits(1) == 1; // L: 7983
					if (var19) { // L: 7984
						var1.readBits(32); // L: 7985
					}

					var5 = var1.readBits(1); // L: 7987
					var10 = Client.defaultRotations[var1.readBits(3)]; // L: 7988
					if (var17) { // L: 7989
						var15.orientation = var15.rotation = var10;
					}

					if (var0) { // L: 7990
						var6 = var1.readBits(8); // L: 7991
						if (var6 > 127) { // L: 7992
							var6 -= 256;
						}
					} else {
						var6 = var1.readBits(5); // L: 7995
						if (var6 > 15) { // L: 7996
							var6 -= 32;
						}
					}
				}

				var15.field1190 = var15.definition.size * 1554324293; // L: 7999
				var15.field1180 = var15.definition.rotation; // L: 8000
				if (var15.field1180 == 0) { // L: 8001
					var15.rotation = 0;
				}

				var15.walkSequence = var15.definition.walkSequence; // L: 8002
				var15.walkBackSequence = var15.definition.walkBackSequence; // L: 8003
				var15.walkLeftSequence = var15.definition.walkLeftSequence; // L: 8004
				var15.walkRightSequence = var15.definition.walkRightSequence; // L: 8005
				var15.idleSequence = var15.definition.idleSequence; // L: 8006
				var15.turnLeftSequence = var15.definition.turnLeftSequence; // L: 8007
				var15.turnRightSequence = var15.definition.turnRightSequence; // L: 8008
				var15.runSequence = var15.definition.field1914; // L: 8009
				var15.field1140 = var15.definition.field1919; // L: 8010
				var15.field1141 = var15.definition.field1918; // L: 8011
				var15.field1149 = var15.definition.field1938; // L: 8012
				var15.field1143 = var15.definition.field1920; // L: 8013
				var15.field1170 = var15.definition.field1933; // L: 8014
				var15.field1145 = var15.definition.field1922; // L: 8015
				var15.field1150 = var15.definition.field1923; // L: 8016
				var15.method2316(ScriptFrame.localPlayer.pathX[0] + var6, ScriptFrame.localPlayer.pathY[0] + var7, var5 == 1); // L: 8017
			}

			var1.exportIndex(); // L: 8019

			for (var14 = 0; var14 < Client.field533; ++var14) { // L: 8022
				var3 = Client.field534[var14]; // L: 8023
				var15 = Client.npcs[var3]; // L: 8024
				var5 = var1.readUnsignedByte(); // L: 8025
				if (class309.field3942 && (var5 & 2) != 0) { // L: 8026
					var6 = var1.readUnsignedByte(); // L: 8027
					var5 += var6 << 8; // L: 8028
				}

				if ((var5 & 64) != 0) { // L: 8030
					var15.targetIndex = var1.readUnsignedShort(); // L: 8031
					if (var15.targetIndex == 65535) { // L: 8032
						var15.targetIndex = -1;
					}
				}

				if ((var5 & 256) != 0) { // L: 8034
					var15.method2333(var1.readStringCp1252NullTerminated()); // L: 8035
				}

				if ((var5 & 8) != 0) { // L: 8037
					var6 = var1.method7640(); // L: 8038
					if (var6 == 65535) { // L: 8039
						var6 = -1; // L: 8040
					}

					var7 = var1.method7708(); // L: 8042
					if (var6 == var15.sequence && var6 != -1) { // L: 8043
						var8 = ByteArrayPool.SequenceDefinition_get(var6).field2181; // L: 8044
						if (var8 == 1) { // L: 8045
							var15.sequenceFrame = 0; // L: 8046
							var15.sequenceFrameCycle = 0; // L: 8047
							var15.sequenceDelay = var7; // L: 8048
							var15.field1172 = 0; // L: 8049
						}

						if (var8 == 2) { // L: 8051
							var15.field1172 = 0; // L: 8052
						}
					} else if (var6 == -1 || var15.sequence == -1 || ByteArrayPool.SequenceDefinition_get(var6).field2157 >= ByteArrayPool.SequenceDefinition_get(var15.sequence).field2157) { // L: 8055
						var15.sequence = var6; // L: 8056
						var15.sequenceFrame = 0; // L: 8057
						var15.sequenceFrameCycle = 0; // L: 8058
						var15.sequenceDelay = var7; // L: 8059
						var15.field1172 = 0; // L: 8060
						var15.field1201 = var15.pathLength; // L: 8061
					}
				}

				if ((var5 & 16) != 0) { // L: 8065
					var15.definition = class119.getNpcDefinition(var1.method7654()); // L: 8066
					var15.field1190 = var15.definition.size * 1554324293; // L: 8067
					var15.field1180 = var15.definition.rotation; // L: 8068
					var15.walkSequence = var15.definition.walkSequence; // L: 8069
					var15.walkBackSequence = var15.definition.walkBackSequence; // L: 8070
					var15.walkLeftSequence = var15.definition.walkLeftSequence; // L: 8071
					var15.walkRightSequence = var15.definition.walkRightSequence; // L: 8072
					var15.idleSequence = var15.definition.idleSequence; // L: 8073
					var15.turnLeftSequence = var15.definition.turnLeftSequence; // L: 8074
					var15.turnRightSequence = var15.definition.turnRightSequence; // L: 8075
				}

				if ((var5 & 32) != 0) { // L: 8077
					var15.overheadText = var1.readStringCp1252NullTerminated(); // L: 8078
					var15.overheadTextCyclesRemaining = 100; // L: 8079
				}

				if ((var5 & 4) != 0) { // L: 8081
					var6 = var1.method7677(); // L: 8082
					var7 = var1.method7677(); // L: 8083
					if (class309.field3942) { // L: 8084
						var15.field1163 = var1.readUnsignedByte() == 1; // L: 8085
					}

					var8 = var15.x - (var6 - Decimator.baseX * 64 - Decimator.baseX * 64) * 64; // L: 8087
					var9 = var15.y - (var7 - class7.baseY * 64 - class7.baseY * 64) * 64; // L: 8088
					if (var8 != 0 || var9 != 0) { // L: 8089
						var15.field1162 = (int)(Math.atan2((double)var8, (double)var9) * 325.949D) & 2047;
					}
				}

				if ((var5 & 128) != 0) { // L: 8091
					var6 = var1.method7786(); // L: 8092
					int var11;
					int var12;
					if (var6 > 0) { // L: 8093
						for (var7 = 0; var7 < var6; ++var7) { // L: 8094
							var9 = -1; // L: 8096
							var10 = -1; // L: 8097
							var11 = -1; // L: 8098
							var8 = var1.readUShortSmart(); // L: 8099
							if (var8 == 32767) { // L: 8100
								var8 = var1.readUShortSmart(); // L: 8101
								var10 = var1.readUShortSmart(); // L: 8102
								var9 = var1.readUShortSmart(); // L: 8103
								var11 = var1.readUShortSmart(); // L: 8104
							} else if (var8 != 32766) { // L: 8106
								var10 = var1.readUShortSmart(); // L: 8107
							} else {
								var8 = -1; // L: 8109
							}

							var12 = var1.readUShortSmart(); // L: 8110
							var15.addHitSplat(var8, var10, var9, var11, Client.cycle, var12); // L: 8111
						}
					}

					var7 = var1.readUnsignedByte(); // L: 8114
					if (var7 > 0) { // L: 8115
						for (var8 = 0; var8 < var7; ++var8) { // L: 8116
							var9 = var1.readUShortSmart(); // L: 8117
							var10 = var1.readUShortSmart(); // L: 8118
							if (var10 != 32767) { // L: 8119
								var11 = var1.readUShortSmart(); // L: 8120
								var12 = var1.method7708(); // L: 8121
								int var13 = var10 > 0 ? var1.method7786() : var12; // L: 8122
								var15.addHealthBar(var9, Client.cycle, var10, var11, var12, var13); // L: 8123
							} else {
								var15.removeHealthBar(var9); // L: 8125
							}
						}
					}
				}

				if ((var5 & 1) != 0) { // L: 8129
					var15.spotAnimation = var1.method7677(); // L: 8130
					var6 = var1.method7690(); // L: 8131
					var15.field1195 = var6 >> 16; // L: 8132
					var15.field1176 = (var6 & 65535) + Client.cycle; // L: 8133
					var15.spotAnimationFrame = 0; // L: 8134
					var15.field1175 = 0; // L: 8135
					if (var15.field1176 > Client.cycle) { // L: 8136
						var15.spotAnimationFrame = -1;
					}

					if (var15.spotAnimation == 65535) { // L: 8137
						var15.spotAnimation = -1;
					}
				}

				if ((var5 & 1024) != 0) { // L: 8139
					var15.field1187 = Client.cycle + var1.method7677(); // L: 8140
					var15.field1188 = Client.cycle + var1.readUnsignedShort(); // L: 8141
					var15.field1189 = var1.method7671(); // L: 8142
					var15.field1131 = var1.readByte(); // L: 8143
					var15.field1191 = var1.readByte(); // L: 8144
					var15.field1192 = (byte)var1.method7786(); // L: 8145
				}

				if (class309.field3942 && (var5 & 512) != 0 || !class309.field3942 && (var5 & 2) != 0) { // L: 8147
					var15.field1178 = var1.method7672(); // L: 8148
					var15.field1127 = var1.method7658(); // L: 8149
					var15.field1179 = var1.method7672(); // L: 8150
					var15.field1181 = var1.readByte(); // L: 8151
					var15.field1182 = var1.method7654() + Client.cycle; // L: 8152
					var15.field1183 = var1.method7654() + Client.cycle; // L: 8153
					var15.field1136 = var1.method7654(); // L: 8154
					var15.pathLength = 1; // L: 8155
					var15.field1201 = 0; // L: 8156
					var15.field1178 += var15.pathX[0]; // L: 8157
					var15.field1127 += var15.pathY[0]; // L: 8158
					var15.field1179 += var15.pathX[0]; // L: 8159
					var15.field1181 += var15.pathY[0]; // L: 8160
				}

				if ((var5 & 2048) != 0) { // L: 8162
					var15.field1202 = var1.method7690(); // L: 8163
				}
			}

			for (var14 = 0; var14 < Client.field495; ++var14) { // L: 8167
				var3 = Client.field584[var14]; // L: 8168
				if (Client.npcs[var3].npcCycle != Client.cycle) { // L: 8169
					Client.npcs[var3].definition = null; // L: 8170
					Client.npcs[var3] = null; // L: 8171
				}
			}

			if (var1.offset != Client.packetWriter.serverPacketLength) { // L: 8174
				throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
			} else {
				for (var14 = 0; var14 < Client.npcCount; ++var14) { // L: 8175
					if (Client.npcs[Client.npcIndices[var14]] == null) { // L: 8176
						throw new RuntimeException(var14 + "," + Client.npcCount); // L: 8177
					}
				}

			}
		}
	} // L: 8180
}
