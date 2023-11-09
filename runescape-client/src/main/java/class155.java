import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
public abstract class class155 extends Node {
	class155() {
	} // L: 49

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lrd;B)V",
		garbageValue = "-123"
	)
	abstract void vmethod3387(Buffer var1);

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lfm;I)V",
		garbageValue = "127147356"
	)
	abstract void vmethod3388(ClanChannel var1);

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lln;II)Lkk;",
		garbageValue = "-2058266111"
	)
	static MusicPatch method3333(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1); // L: 21
		return var2 == null ? null : new MusicPatch(var2); // L: 22
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1342248980"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 155
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIILhn;Lgv;I)V",
		garbageValue = "-380355051"
	)
	static final void method3331(int var0, int var1, int var2, int var3, int var4, int var5, int var6, Scene var7, CollisionMap var8) {
		ObjectComposition var9 = class463.getObjectDefinition(var4); // L: 1031
		int var10;
		int var11;
		if (var5 != 1 && var5 != 3) { // L: 1034
			var10 = var9.sizeX; // L: 1039
			var11 = var9.sizeY; // L: 1040
		} else {
			var10 = var9.sizeY; // L: 1035
			var11 = var9.sizeX; // L: 1036
		}

		int var12;
		int var13;
		if (var10 + var2 <= 104) { // L: 1046
			var12 = (var10 >> 1) + var2; // L: 1047
			var13 = var2 + (var10 + 1 >> 1); // L: 1048
		} else {
			var12 = var2; // L: 1051
			var13 = var2 + 1; // L: 1052
		}

		int var14;
		int var15;
		if (var3 + var11 <= 104) { // L: 1054
			var14 = var3 + (var11 >> 1); // L: 1055
			var15 = var3 + (var11 + 1 >> 1); // L: 1056
		} else {
			var14 = var3; // L: 1059
			var15 = var3 + 1; // L: 1060
		}

		int[][] var16 = Tiles.Tiles_heights[var1]; // L: 1062
		int var17 = var16[var13][var15] + var16[var13][var14] + var16[var12][var14] + var16[var12][var15] >> 2; // L: 1063
		int var18 = (var2 << 7) + (var10 << 6); // L: 1064
		int var19 = (var3 << 7) + (var11 << 6); // L: 1065
		long var20 = ItemLayer.calculateTag(var2, var3, 2, var9.int1 == 0, var4); // L: 1066
		int var22 = (var5 << 6) + var6; // L: 1067
		if (var9.int3 == 1) { // L: 1068
			var22 += 256;
		}

		Object var30;
		if (var6 == 22) { // L: 1069
			if (var9.animationId == -1 && var9.transforms == null) { // L: 1071
				var30 = var9.getModel(22, var5, var16, var18, var17, var19);
			} else {
				var30 = new DynamicObject(var4, 22, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1072
			}

			var7.newGroundObject(var0, var2, var3, var17, (Renderable)var30, var20, var22); // L: 1073
			if (var9.interactType == 1) { // L: 1074
				var8.setBlockedByFloorDec(var2, var3);
			}

		} else if (var6 != 10 && var6 != 11) { // L: 1077
			if (var6 >= 12) { // L: 1085
				if (var9.animationId == -1 && var9.transforms == null) { // L: 1087
					var30 = var9.getModel(var6, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, var6, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1088
				}

				var7.method4466(var0, var2, var3, var17, 1, 1, (Renderable)var30, 0, var20, var22); // L: 1089
				if (var9.interactType != 0) { // L: 1090
					var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
				}

			} else if (var6 == 0) { // L: 1093
				if (var9.animationId == -1 && var9.transforms == null) { // L: 1095
					var30 = var9.getModel(0, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, 0, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1096
				}

				var7.newWallObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field1015[var5], 0, var20, var22); // L: 1097
				if (var9.interactType != 0) { // L: 1098
					var8.method4184(var2, var3, var6, var5, var9.boolean1);
				}

			} else if (var6 == 1) { // L: 1101
				if (var9.animationId == -1 && var9.transforms == null) { // L: 1103
					var30 = var9.getModel(1, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, 1, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1104
				}

				var7.newWallObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field1016[var5], 0, var20, var22); // L: 1105
				if (var9.interactType != 0) { // L: 1106
					var8.method4184(var2, var3, var6, var5, var9.boolean1);
				}

			} else {
				int var23;
				if (var6 == 2) { // L: 1109
					var23 = var5 + 1 & 3; // L: 1110
					Object var25;
					Object var31;
					if (var9.animationId == -1 && var9.transforms == null) { // L: 1113
						var31 = var9.getModel(2, var5 + 4, var16, var18, var17, var19); // L: 1114
						var25 = var9.getModel(2, var23, var16, var18, var17, var19); // L: 1115
					} else {
						var31 = new DynamicObject(var4, 2, var5 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1118
						var25 = new DynamicObject(var4, 2, var23, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1119
					}

					var7.newWallObject(var0, var2, var3, var17, (Renderable)var31, (Renderable)var25, Tiles.field1015[var5], Tiles.field1015[var23], var20, var22); // L: 1121
					if (var9.interactType != 0) { // L: 1122
						var8.method4184(var2, var3, var6, var5, var9.boolean1);
					}

				} else if (var6 == 3) { // L: 1125
					if (var9.animationId == -1 && var9.transforms == null) { // L: 1127
						var30 = var9.getModel(3, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, 3, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1128
					}

					var7.newWallObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field1016[var5], 0, var20, var22); // L: 1129
					if (var9.interactType != 0) { // L: 1130
						var8.method4184(var2, var3, var6, var5, var9.boolean1);
					}

				} else if (var6 == 9) { // L: 1133
					if (var9.animationId == -1 && var9.transforms == null) { // L: 1135
						var30 = var9.getModel(var6, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, var6, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1136
					}

					var7.method4466(var0, var2, var3, var17, 1, 1, (Renderable)var30, 0, var20, var22); // L: 1137
					if (var9.interactType != 0) { // L: 1138
						var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
					}

				} else if (var6 == 4) { // L: 1141
					if (var9.animationId == -1 && var9.transforms == null) { // L: 1143
						var30 = var9.getModel(4, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, 4, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1144
					}

					var7.newDecorativeObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field1015[var5], 0, 0, 0, var20, var22); // L: 1145
				} else {
					long var24;
					Object var26;
					if (var6 == 5) { // L: 1148
						var23 = 16; // L: 1149
						var24 = var7.getWallObjectTag(var0, var2, var3); // L: 1150
						if (var24 != 0L) { // L: 1151
							var23 = class463.getObjectDefinition(class124.Entity_unpackID(var24)).int2;
						}

						if (var9.animationId == -1 && var9.transforms == null) { // L: 1153
							var26 = var9.getModel(4, var5, var16, var18, var17, var19);
						} else {
							var26 = new DynamicObject(var4, 4, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1154
						}

						var7.newDecorativeObject(var0, var2, var3, var17, (Renderable)var26, (Renderable)null, Tiles.field1015[var5], 0, var23 * Tiles.field1017[var5], var23 * Tiles.field1007[var5], var20, var22); // L: 1155
					} else if (var6 == 6) { // L: 1158
						var23 = 8; // L: 1159
						var24 = var7.getWallObjectTag(var0, var2, var3); // L: 1160
						if (var24 != 0L) { // L: 1161
							var23 = class463.getObjectDefinition(class124.Entity_unpackID(var24)).int2 / 2;
						}

						if (var9.animationId == -1 && var9.transforms == null) { // L: 1163
							var26 = var9.getModel(4, var5 + 4, var16, var18, var17, var19);
						} else {
							var26 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1164
						}

						var7.newDecorativeObject(var0, var2, var3, var17, (Renderable)var26, (Renderable)null, 256, var5, var23 * Tiles.field1019[var5], var23 * Tiles.field1020[var5], var20, var22); // L: 1165
					} else if (var6 == 7) { // L: 1168
						int var29 = var5 + 2 & 3; // L: 1170
						if (var9.animationId == -1 && var9.transforms == null) { // L: 1171
							var30 = var9.getModel(4, var29 + 4, var16, var18, var17, var19);
						} else {
							var30 = new DynamicObject(var4, 4, var29 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1172
						}

						var7.newDecorativeObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, 256, var29, 0, 0, var20, var22); // L: 1173
					} else if (var6 == 8) { // L: 1176
						var23 = 8; // L: 1177
						var24 = var7.getWallObjectTag(var0, var2, var3); // L: 1178
						if (0L != var24) { // L: 1179
							var23 = class463.getObjectDefinition(class124.Entity_unpackID(var24)).int2 / 2;
						}

						int var28 = var5 + 2 & 3; // L: 1182
						Object var27;
						if (var9.animationId == -1 && var9.transforms == null) { // L: 1183
							var26 = var9.getModel(4, var5 + 4, var16, var18, var17, var19); // L: 1184
							var27 = var9.getModel(4, var28 + 4, var16, var18, var17, var19); // L: 1185
						} else {
							var26 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1188
							var27 = new DynamicObject(var4, 4, var28 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1189
						}

						var7.newDecorativeObject(var0, var2, var3, var17, (Renderable)var26, (Renderable)var27, 256, var5, var23 * Tiles.field1019[var5], var23 * Tiles.field1020[var5], var20, var22); // L: 1191
					}
				}
			}
		} else {
			if (var9.animationId == -1 && var9.transforms == null) { // L: 1079
				var30 = var9.getModel(10, var5, var16, var18, var17, var19);
			} else {
				var30 = new DynamicObject(var4, 10, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1080
			}

			if (var30 != null) { // L: 1081
				var7.method4466(var0, var2, var3, var17, var10, var11, (Renderable)var30, var6 == 11 ? 256 : 0, var20, var22);
			}

			if (var9.interactType != 0) {
				var8.addGameObject(var2, var3, var10, var11, var9.boolean1); // L: 1082
			}

		}
	} // L: 1075 1083 1091 1099 1107 1123 1131 1139 1146 1156 1166 1174 1192 1194

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "25"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (class153.loadInterface(var0)) { // L: 12637
			Widget[] var1 = WorldMapLabel.Widget_interfaceComponents[var0]; // L: 12638

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 12639
				Widget var3 = var1[var2]; // L: 12640
				if (var3 != null) { // L: 12641
					var3.modelFrame = 0; // L: 12642
					var3.modelFrameCycle = 0; // L: 12643
				}
			}

		}
	} // L: 12645
}
