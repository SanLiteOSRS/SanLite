import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
public class class145 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = 9041886089643987619L
	)
	long field1665;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = -1333958306072738991L
	)
	long field1660;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	IterableNodeDeque field1659;

	@ObfuscatedSignature(
		descriptor = "(Lqw;)V"
	)
	public class145(Buffer var1) {
		this.field1660 = -1L; // L: 10
		this.field1659 = new IterableNodeDeque(); // L: 11
		this.method3093(var1); // L: 19
	} // L: 20

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "-1296229775"
	)
	void method3093(Buffer var1) {
		this.field1665 = var1.readLong(); // L: 23
		this.field1660 = var1.readLong(); // L: 24

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 25 26 36
			Object var3;
			if (var2 == 1) { // L: 28
				var3 = new class140(this);
			} else if (var2 == 4) { // L: 29
				var3 = new class151(this);
			} else if (var2 == 3) { // L: 30
				var3 = new class136(this);
			} else if (var2 == 2) { // L: 31
				var3 = new class134(this);
			} else {
				if (var2 != 5) { // L: 32
					throw new RuntimeException(""); // L: 33
				}

				var3 = new class141(this);
			}

			((class144)var3).vmethod3146(var1); // L: 34
			this.field1659.addFirst((Node)var3); // L: 35
		}

	} // L: 38

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ley;I)V",
		garbageValue = "-2118805754"
	)
	public void method3095(ClanChannel var1) {
		if (var1.key == this.field1665 && this.field1660 == var1.field1674) { // L: 41
			for (class144 var2 = (class144)this.field1659.last(); var2 != null; var2 = (class144)this.field1659.previous()) { // L: 42
				var2.vmethod3145(var1); // L: 43
			}

			++var1.field1674; // L: 45
		} else {
			throw new RuntimeException("");
		}
	} // L: 46

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1311566170"
	)
	public static void method3087() {
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear(); // L: 122
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear(); // L: 123
	} // L: 124

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(ZLqy;B)V",
		garbageValue = "-37"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field617 = 0; // L: 8000
		Client.field541 = 0; // L: 8001
		PacketBuffer var2 = Client.packetWriter.packetBuffer; // L: 8003
		var2.importIndex(); // L: 8004
		int var3 = var2.readBits(8); // L: 8005
		int var4;
		if (var3 < Client.npcCount) { // L: 8006
			for (var4 = var3; var4 < Client.npcCount; ++var4) { // L: 8007
				Client.field636[++Client.field617 - 1] = Client.npcIndices[var4];
			}
		}

		if (var3 > Client.npcCount) { // L: 8009
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0; // L: 8010

			int var5;
			int var7;
			int var8;
			int var9;
			int var10;
			for (var4 = 0; var4 < var3; ++var4) { // L: 8011
				var5 = Client.npcIndices[var4]; // L: 8012
				NPC var13 = Client.npcs[var5]; // L: 8013
				var7 = var2.readBits(1); // L: 8014
				if (var7 == 0) { // L: 8015
					Client.npcIndices[++Client.npcCount - 1] = var5; // L: 8016
					var13.npcCycle = Client.cycle; // L: 8017
				} else {
					var8 = var2.readBits(2); // L: 8020
					if (var8 == 0) { // L: 8021
						Client.npcIndices[++Client.npcCount - 1] = var5; // L: 8022
						var13.npcCycle = Client.cycle; // L: 8023
						Client.field729[++Client.field541 - 1] = var5; // L: 8024
					} else if (var8 == 1) { // L: 8027
						Client.npcIndices[++Client.npcCount - 1] = var5; // L: 8028
						var13.npcCycle = Client.cycle; // L: 8029
						var9 = var2.readBits(3); // L: 8030
						var13.method2414(var9, class192.field2194); // L: 8031
						var10 = var2.readBits(1); // L: 8032
						if (var10 == 1) { // L: 8033
							Client.field729[++Client.field541 - 1] = var5;
						}
					} else if (var8 == 2) { // L: 8036
						Client.npcIndices[++Client.npcCount - 1] = var5; // L: 8037
						var13.npcCycle = Client.cycle; // L: 8038
						if (var2.readBits(1) == 1) { // L: 8039
							var9 = var2.readBits(3); // L: 8040
							var13.method2414(var9, class192.field2197); // L: 8041
							var10 = var2.readBits(3); // L: 8042
							var13.method2414(var10, class192.field2197); // L: 8043
						} else {
							var9 = var2.readBits(3); // L: 8046
							var13.method2414(var9, class192.field2195); // L: 8047
						}

						var9 = var2.readBits(1); // L: 8049
						if (var9 == 1) { // L: 8050
							Client.field729[++Client.field541 - 1] = var5;
						}
					} else if (var8 == 3) { // L: 8053
						Client.field636[++Client.field617 - 1] = var5; // L: 8054
					}
				}
			}

			int var11;
			while (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) { // L: 8061
				var11 = var1.readBits(15); // L: 8062
				if (var11 == 32767) { // L: 8063
					break;
				}

				boolean var14 = false; // L: 8064
				if (Client.npcs[var11] == null) { // L: 8065
					Client.npcs[var11] = new NPC(); // L: 8066
					var14 = true; // L: 8067
				}

				NPC var12 = Client.npcs[var11]; // L: 8069
				Client.npcIndices[++Client.npcCount - 1] = var11; // L: 8070
				var12.npcCycle = Client.cycle; // L: 8071
				int var6;
				if (ScriptFrame.field462) { // L: 8075
					if (var0) { // L: 8076
						var7 = var1.readBits(8); // L: 8077
						if (var7 > 127) { // L: 8078
							var7 -= 256;
						}
					} else {
						var7 = var1.readBits(5); // L: 8081
						if (var7 > 15) { // L: 8082
							var7 -= 32;
						}
					}

					if (var0) { // L: 8084
						var6 = var1.readBits(8); // L: 8085
						if (var6 > 127) { // L: 8086
							var6 -= 256;
						}
					} else {
						var6 = var1.readBits(5); // L: 8089
						if (var6 > 15) { // L: 8090
							var6 -= 32;
						}
					}

					var5 = var1.readBits(1); // L: 8092
					boolean var15 = var1.readBits(1) == 1; // L: 8093
					if (var15) { // L: 8094
						var1.readBits(32); // L: 8095
					}

					var12.definition = class125.getNpcDefinition(var1.readBits(14)); // L: 8097
					var9 = Client.defaultRotations[var1.readBits(3)]; // L: 8098
					if (var14) { // L: 8099
						var12.orientation = var12.rotation = var9;
					}

					var10 = var1.readBits(1); // L: 8100
					if (var10 == 1) { // L: 8101
						Client.field729[++Client.field541 - 1] = var11;
					}
				} else {
					var12.definition = class125.getNpcDefinition(var1.readBits(14)); // L: 8104
					var8 = var1.readBits(1); // L: 8105
					if (var8 == 1) { // L: 8106
						Client.field729[++Client.field541 - 1] = var11;
					}

					if (var0) { // L: 8107
						var7 = var1.readBits(8); // L: 8108
						if (var7 > 127) { // L: 8109
							var7 -= 256;
						}
					} else {
						var7 = var1.readBits(5); // L: 8112
						if (var7 > 15) { // L: 8113
							var7 -= 32;
						}
					}

					boolean var16 = var1.readBits(1) == 1; // L: 8115
					if (var16) { // L: 8116
						var1.readBits(32); // L: 8117
					}

					var5 = var1.readBits(1); // L: 8119
					var10 = Client.defaultRotations[var1.readBits(3)]; // L: 8120
					if (var14) { // L: 8121
						var12.orientation = var12.rotation = var10;
					}

					if (var0) { // L: 8122
						var6 = var1.readBits(8); // L: 8123
						if (var6 > 127) { // L: 8124
							var6 -= 256;
						}
					} else {
						var6 = var1.readBits(5); // L: 8127
						if (var6 > 15) { // L: 8128
							var6 -= 32;
						}
					}
				}

				var12.field1202 = var12.definition.size; // L: 8131
				var12.field1197 = var12.definition.rotation; // L: 8132
				if (var12.field1197 == 0) { // L: 8133
					var12.rotation = 0;
				}

				var12.walkSequence = var12.definition.walkSequence; // L: 8134
				var12.walkBackSequence = var12.definition.walkBackSequence; // L: 8135
				var12.walkLeftSequence = var12.definition.walkLeftSequence; // L: 8136
				var12.walkRightSequence = var12.definition.walkRightSequence; // L: 8137
				var12.idleSequence = var12.definition.idleSequence; // L: 8138
				var12.turnLeftSequence = var12.definition.turnLeftSequence; // L: 8139
				var12.turnRightSequence = var12.definition.turnRightSequence; // L: 8140
				var12.runSequence = var12.definition.field1920; // L: 8141
				var12.field1199 = var12.definition.field1946; // L: 8142
				var12.field1143 = var12.definition.field1922; // L: 8143
				var12.field1144 = var12.definition.field1923; // L: 8144
				var12.field1145 = var12.definition.field1924; // L: 8145
				var12.field1146 = var12.definition.field1904; // L: 8146
				var12.field1147 = var12.definition.field1926; // L: 8147
				var12.field1148 = var12.definition.field1910; // L: 8148
				var12.method2415(class28.localPlayer.pathX[0] + var6, class28.localPlayer.pathY[0] + var7, var5 == 1); // L: 8149
			}

			var1.exportIndex(); // L: 8151
			PcmPlayer.method751(var1); // L: 8153

			for (var11 = 0; var11 < Client.field617; ++var11) { // L: 8154
				var3 = Client.field636[var11]; // L: 8155
				if (Client.npcs[var3].npcCycle != Client.cycle) { // L: 8156
					Client.npcs[var3].definition = null; // L: 8157
					Client.npcs[var3] = null; // L: 8158
				}
			}

			if (var1.offset != Client.packetWriter.serverPacketLength) { // L: 8161
				throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
			} else {
				for (var11 = 0; var11 < Client.npcCount; ++var11) { // L: 8162
					if (Client.npcs[Client.npcIndices[var11]] == null) { // L: 8163
						throw new RuntimeException(var11 + "," + Client.npcCount); // L: 8164
					}
				}

			}
		}
	} // L: 8167
}
