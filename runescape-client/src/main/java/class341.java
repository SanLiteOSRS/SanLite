import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
public class class341 {
	@ObfuscatedName("o")
	@Export("cp1252AsciiExtension")
	public static final char[] cp1252AsciiExtension;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("ItemComposition_fontPlain11")
	public static Font ItemComposition_fontPlain11;

	static {
		cp1252AsciiExtension = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'}; // L: 4
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIILgo;Lgr;S)V",
		garbageValue = "12071"
	)
	static final void method6300(int var0, int var1, int var2, int var3, int var4, int var5, int var6, Scene var7, CollisionMap var8) {
		ObjectComposition var9 = WorldMapDecoration.getObjectDefinition(var4); // L: 1001
		int var10;
		int var11;
		if (var5 != 1 && var5 != 3) { // L: 1004
			var10 = var9.sizeX; // L: 1009
			var11 = var9.sizeY; // L: 1010
		} else {
			var10 = var9.sizeY; // L: 1005
			var11 = var9.sizeX; // L: 1006
		}

		int var12;
		int var13;
		if (var10 + var2 <= 104) { // L: 1016
			var12 = (var10 >> 1) + var2; // L: 1017
			var13 = var2 + (var10 + 1 >> 1); // L: 1018
		} else {
			var12 = var2; // L: 1021
			var13 = var2 + 1; // L: 1022
		}

		int var14;
		int var15;
		if (var3 + var11 <= 104) { // L: 1024
			var14 = var3 + (var11 >> 1); // L: 1025
			var15 = var3 + (var11 + 1 >> 1); // L: 1026
		} else {
			var14 = var3; // L: 1029
			var15 = var3 + 1; // L: 1030
		}

		int[][] var16 = Tiles.Tiles_heights[var1]; // L: 1032
		int var17 = var16[var13][var15] + var16[var12][var14] + var16[var13][var14] + var16[var12][var15] >> 2; // L: 1033
		int var18 = (var2 << 7) + (var10 << 6); // L: 1034
		int var19 = (var3 << 7) + (var11 << 6); // L: 1035
		long var20 = class394.calculateTag(var2, var3, 2, var9.int1 == 0, var4); // L: 1036
		int var22 = (var5 << 6) + var6; // L: 1037
		if (var9.int3 == 1) { // L: 1038
			var22 += 256;
		}

		Object var30;
		if (var6 == 22) { // L: 1039
			if (var9.animationId == -1 && var9.transforms == null) { // L: 1041
				var30 = var9.getModel(22, var5, var16, var18, var17, var19);
			} else {
				var30 = new DynamicObject(var4, 22, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1042
			}

			var7.newGroundObject(var0, var2, var3, var17, (Renderable)var30, var20, var22); // L: 1043
			if (var9.interactType == 1) { // L: 1044
				var8.setBlockedByFloorDec(var2, var3);
			}

		} else if (var6 != 10 && var6 != 11) { // L: 1047
			if (var6 >= 12) { // L: 1055
				if (var9.animationId == -1 && var9.transforms == null) { // L: 1057
					var30 = var9.getModel(var6, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, var6, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1058
				}

				var7.method4118(var0, var2, var3, var17, 1, 1, (Renderable)var30, 0, var20, var22); // L: 1059
				if (var9.interactType != 0) { // L: 1060
					var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
				}

			} else if (var6 == 0) { // L: 1063
				if (var9.animationId == -1 && var9.transforms == null) { // L: 1065
					var30 = var9.getModel(0, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, 0, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1066
				}

				var7.newWallObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field1001[var5], 0, var20, var22); // L: 1067
				if (var9.interactType != 0) { // L: 1068
					var8.method3878(var2, var3, var6, var5, var9.boolean1);
				}

			} else if (var6 == 1) { // L: 1071
				if (var9.animationId == -1 && var9.transforms == null) { // L: 1073
					var30 = var9.getModel(1, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, 1, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1074
				}

				var7.newWallObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field1002[var5], 0, var20, var22); // L: 1075
				if (var9.interactType != 0) { // L: 1076
					var8.method3878(var2, var3, var6, var5, var9.boolean1);
				}

			} else {
				int var23;
				if (var6 == 2) { // L: 1079
					var23 = var5 + 1 & 3; // L: 1080
					Object var25;
					Object var31;
					if (var9.animationId == -1 && var9.transforms == null) { // L: 1083
						var31 = var9.getModel(2, var5 + 4, var16, var18, var17, var19); // L: 1084
						var25 = var9.getModel(2, var23, var16, var18, var17, var19); // L: 1085
					} else {
						var31 = new DynamicObject(var4, 2, var5 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1088
						var25 = new DynamicObject(var4, 2, var23, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1089
					}

					var7.newWallObject(var0, var2, var3, var17, (Renderable)var31, (Renderable)var25, Tiles.field1001[var5], Tiles.field1001[var23], var20, var22); // L: 1091
					if (var9.interactType != 0) { // L: 1092
						var8.method3878(var2, var3, var6, var5, var9.boolean1);
					}

				} else if (var6 == 3) { // L: 1095
					if (var9.animationId == -1 && var9.transforms == null) { // L: 1097
						var30 = var9.getModel(3, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, 3, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1098
					}

					var7.newWallObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field1002[var5], 0, var20, var22); // L: 1099
					if (var9.interactType != 0) { // L: 1100
						var8.method3878(var2, var3, var6, var5, var9.boolean1);
					}

				} else if (var6 == 9) { // L: 1103
					if (var9.animationId == -1 && var9.transforms == null) { // L: 1105
						var30 = var9.getModel(var6, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, var6, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1106
					}

					var7.method4118(var0, var2, var3, var17, 1, 1, (Renderable)var30, 0, var20, var22); // L: 1107
					if (var9.interactType != 0) { // L: 1108
						var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
					}

				} else if (var6 == 4) { // L: 1111
					if (var9.animationId == -1 && var9.transforms == null) { // L: 1113
						var30 = var9.getModel(4, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, 4, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1114
					}

					var7.newDecorativeObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field1001[var5], 0, 0, 0, var20, var22); // L: 1115
				} else {
					long var24;
					Object var26;
					if (var6 == 5) { // L: 1118
						var23 = 16; // L: 1119
						var24 = var7.getWallObjectTag(var0, var2, var3); // L: 1120
						if (var24 != 0L) { // L: 1121
							var23 = WorldMapDecoration.getObjectDefinition(class141.Entity_unpackID(var24)).int2;
						}

						if (var9.animationId == -1 && var9.transforms == null) { // L: 1123
							var26 = var9.getModel(4, var5, var16, var18, var17, var19);
						} else {
							var26 = new DynamicObject(var4, 4, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1124
						}

						var7.newDecorativeObject(var0, var2, var3, var17, (Renderable)var26, (Renderable)null, Tiles.field1001[var5], 0, var23 * Tiles.field1008[var5], var23 * Tiles.field1009[var5], var20, var22); // L: 1125
					} else if (var6 == 6) { // L: 1128
						var23 = 8; // L: 1129
						var24 = var7.getWallObjectTag(var0, var2, var3); // L: 1130
						if (0L != var24) { // L: 1131
							var23 = WorldMapDecoration.getObjectDefinition(class141.Entity_unpackID(var24)).int2 / 2;
						}

						if (var9.animationId == -1 && var9.transforms == null) { // L: 1133
							var26 = var9.getModel(4, var5 + 4, var16, var18, var17, var19);
						} else {
							var26 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1134
						}

						var7.newDecorativeObject(var0, var2, var3, var17, (Renderable)var26, (Renderable)null, 256, var5, var23 * Tiles.field1005[var5], var23 * Tiles.field1006[var5], var20, var22); // L: 1135
					} else if (var6 == 7) { // L: 1138
						int var29 = var5 + 2 & 3; // L: 1140
						if (var9.animationId == -1 && var9.transforms == null) { // L: 1141
							var30 = var9.getModel(4, var29 + 4, var16, var18, var17, var19);
						} else {
							var30 = new DynamicObject(var4, 4, var29 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1142
						}

						var7.newDecorativeObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, 256, var29, 0, 0, var20, var22); // L: 1143
					} else if (var6 == 8) { // L: 1146
						var23 = 8; // L: 1147
						var24 = var7.getWallObjectTag(var0, var2, var3); // L: 1148
						if (var24 != 0L) { // L: 1149
							var23 = WorldMapDecoration.getObjectDefinition(class141.Entity_unpackID(var24)).int2 / 2;
						}

						int var28 = var5 + 2 & 3; // L: 1152
						Object var27;
						if (var9.animationId == -1 && var9.transforms == null) { // L: 1153
							var26 = var9.getModel(4, var5 + 4, var16, var18, var17, var19); // L: 1154
							var27 = var9.getModel(4, var28 + 4, var16, var18, var17, var19); // L: 1155
						} else {
							var26 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1158
							var27 = new DynamicObject(var4, 4, var28 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1159
						}

						var7.newDecorativeObject(var0, var2, var3, var17, (Renderable)var26, (Renderable)var27, 256, var5, var23 * Tiles.field1005[var5], var23 * Tiles.field1006[var5], var20, var22); // L: 1161
					}
				}
			}
		} else {
			if (var9.animationId == -1 && var9.transforms == null) { // L: 1049
				var30 = var9.getModel(10, var5, var16, var18, var17, var19);
			} else {
				var30 = new DynamicObject(var4, 10, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1050
			}

			if (var30 != null) { // L: 1051
				var7.method4118(var0, var2, var3, var17, var10, var11, (Renderable)var30, var6 == 11 ? 256 : 0, var20, var22);
			}

			if (var9.interactType != 0) {
				var8.addGameObject(var2, var3, var10, var11, var9.boolean1); // L: 1052
			}

		}
	} // L: 1045 1053 1061 1069 1077 1093 1101 1109 1116 1126 1136 1144 1162 1164

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "1"
	)
	static final void method6285(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) { // L: 12236
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3117()) { // L: 12237
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 12238
				if (var2.rank == -1) { // L: 12239
					PacketBufferNode var3 = class433.getPacketBufferNode(ClientPacket.field2976, Client.packetWriter.isaacCipher); // L: 12240
					var3.packetBuffer.writeByte(3 + class92.stringCp1252NullTerminatedByteSize(var2.username.getName())); // L: 12241
					var3.packetBuffer.writeByte(var0); // L: 12242
					var3.packetBuffer.writeShort(var1); // L: 12243
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName()); // L: 12244
					Client.packetWriter.addNode(var3); // L: 12245
				}
			}
		}
	} // L: 12246
}
