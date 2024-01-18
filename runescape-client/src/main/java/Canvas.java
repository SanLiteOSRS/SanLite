import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ac")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("bf")
	protected static String field120;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("am")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1; // L: 11
	} // L: 12

	public final void update(Graphics var1) {
		this.component.update(var1); // L: 15
	} // L: 16

	public final void paint(Graphics var1) {
		this.component.paint(var1); // L: 19
	} // L: 20

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1288797139"
	)
	static final void method334(String var0) {
		GrandExchangeEvents.addGameMessage(30, "", var0); // L: 108
	} // L: 109

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "73"
	)
	static final void method333(String var0) {
		method334("Please remove " + var0 + " from your ignore list first"); // L: 112
	} // L: 113

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILkn;Lii;I)V",
		garbageValue = "-470023103"
	)
	static final void method332(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap var9) {
		ObjectComposition var10 = class137.getObjectDefinition(var4); // L: 1058
		int var11 = var7 >= 0 ? var7 : var10.animationId; // L: 1059
		int var12;
		int var13;
		if (var5 != 1 && var5 != 3) { // L: 1062
			var12 = var10.sizeX; // L: 1067
			var13 = var10.sizeY; // L: 1068
		} else {
			var12 = var10.sizeY; // L: 1063
			var13 = var10.sizeX; // L: 1064
		}

		int var14;
		int var15;
		if (var12 + var2 <= 104) { // L: 1074
			var14 = (var12 >> 1) + var2; // L: 1075
			var15 = var2 + (var12 + 1 >> 1); // L: 1076
		} else {
			var14 = var2; // L: 1079
			var15 = var2 + 1; // L: 1080
		}

		int var16;
		int var17;
		if (var3 + var13 <= 104) { // L: 1082
			var16 = var3 + (var13 >> 1); // L: 1083
			var17 = var3 + (var13 + 1 >> 1); // L: 1084
		} else {
			var16 = var3; // L: 1087
			var17 = var3 + 1; // L: 1088
		}

		int[][] var18 = Tiles.Tiles_heights[var1]; // L: 1090
		int var19 = var18[var15][var17] + var18[var15][var16] + var18[var14][var16] + var18[var14][var17] >> 2; // L: 1091
		int var20 = (var2 << 7) + (var12 << 6); // L: 1092
		int var21 = (var3 << 7) + (var13 << 6); // L: 1093
		long var22 = DynamicObject.calculateTag(var2, var3, 2, var10.int1 == 0, var4); // L: 1094
		int var24 = (var5 << 6) + var6; // L: 1095
		if (var10.int3 == 1) { // L: 1096
			var24 += 256;
		}

		Object var32;
		if (var6 == 22) { // L: 1097
			if (var11 == -1 && var10.transforms == null) { // L: 1099
				var32 = var10.getModel(22, var5, var18, var20, var19, var21);
			} else {
				var32 = new DynamicObject(var4, 22, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1100
			}

			var8.newGroundObject(var0, var2, var3, var19, (Renderable)var32, var22, var24); // L: 1101
			if (var10.interactType == 1) { // L: 1102
				var9.setBlockedByFloorDec(var2, var3);
			}

		} else if (var6 != 10 && var6 != 11) { // L: 1105
			if (var6 >= 12) { // L: 1113
				if (var11 == -1 && var10.transforms == null) { // L: 1115
					var32 = var10.getModel(var6, var5, var18, var20, var19, var21);
				} else {
					var32 = new DynamicObject(var4, var6, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1116
				}

				var8.method5521(var0, var2, var3, var19, 1, 1, (Renderable)var32, 0, var22, var24); // L: 1117
				if (var10.interactType != 0) { // L: 1118
					var9.addGameObject(var2, var3, var12, var13, var10.boolean1);
				}

			} else if (var6 == 0) { // L: 1121
				if (var11 == -1 && var10.transforms == null) { // L: 1123
					var32 = var10.getModel(0, var5, var18, var20, var19, var21);
				} else {
					var32 = new DynamicObject(var4, 0, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1124
				}

				var8.newWallObject(var0, var2, var3, var19, (Renderable)var32, (Renderable)null, Tiles.field1014[var5], 0, var22, var24); // L: 1125
				if (var10.interactType != 0) { // L: 1126
					var9.method4466(var2, var3, var6, var5, var10.boolean1);
				}

			} else if (var6 == 1) { // L: 1129
				if (var11 == -1 && var10.transforms == null) { // L: 1131
					var32 = var10.getModel(1, var5, var18, var20, var19, var21);
				} else {
					var32 = new DynamicObject(var4, 1, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1132
				}

				var8.newWallObject(var0, var2, var3, var19, (Renderable)var32, (Renderable)null, Tiles.field1015[var5], 0, var22, var24); // L: 1133
				if (var10.interactType != 0) { // L: 1134
					var9.method4466(var2, var3, var6, var5, var10.boolean1);
				}

			} else {
				int var25;
				if (var6 == 2) { // L: 1137
					var25 = var5 + 1 & 3; // L: 1138
					Object var27;
					Object var33;
					if (var11 == -1 && var10.transforms == null) { // L: 1141
						var33 = var10.getModel(2, var5 + 4, var18, var20, var19, var21); // L: 1142
						var27 = var10.getModel(2, var25, var18, var20, var19, var21); // L: 1143
					} else {
						var33 = new DynamicObject(var4, 2, var5 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1146
						var27 = new DynamicObject(var4, 2, var25, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1147
					}

					var8.newWallObject(var0, var2, var3, var19, (Renderable)var33, (Renderable)var27, Tiles.field1014[var5], Tiles.field1014[var25], var22, var24); // L: 1149
					if (var10.interactType != 0) { // L: 1150
						var9.method4466(var2, var3, var6, var5, var10.boolean1);
					}

				} else if (var6 == 3) { // L: 1153
					if (var11 == -1 && var10.transforms == null) { // L: 1155
						var32 = var10.getModel(3, var5, var18, var20, var19, var21);
					} else {
						var32 = new DynamicObject(var4, 3, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1156
					}

					var8.newWallObject(var0, var2, var3, var19, (Renderable)var32, (Renderable)null, Tiles.field1015[var5], 0, var22, var24); // L: 1157
					if (var10.interactType != 0) { // L: 1158
						var9.method4466(var2, var3, var6, var5, var10.boolean1);
					}

				} else if (var6 == 9) { // L: 1161
					if (var11 == -1 && var10.transforms == null) { // L: 1163
						var32 = var10.getModel(var6, var5, var18, var20, var19, var21);
					} else {
						var32 = new DynamicObject(var4, var6, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1164
					}

					var8.method5521(var0, var2, var3, var19, 1, 1, (Renderable)var32, 0, var22, var24); // L: 1165
					if (var10.interactType != 0) { // L: 1166
						var9.addGameObject(var2, var3, var12, var13, var10.boolean1);
					}

				} else if (var6 == 4) { // L: 1169
					if (var11 == -1 && var10.transforms == null) { // L: 1171
						var32 = var10.getModel(4, var5, var18, var20, var19, var21);
					} else {
						var32 = new DynamicObject(var4, 4, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1172
					}

					var8.newDecorativeObject(var0, var2, var3, var19, (Renderable)var32, (Renderable)null, Tiles.field1014[var5], 0, 0, 0, var22, var24); // L: 1173
				} else {
					long var26;
					Object var28;
					if (var6 == 5) { // L: 1176
						var25 = 16; // L: 1177
						var26 = var8.getWallObjectTag(var0, var2, var3); // L: 1178
						if (var26 != 0L) { // L: 1179
							var25 = class137.getObjectDefinition(class167.Entity_unpackID(var26)).int2;
						}

						if (var11 == -1 && var10.transforms == null) { // L: 1181
							var28 = var10.getModel(4, var5, var18, var20, var19, var21);
						} else {
							var28 = new DynamicObject(var4, 4, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1182
						}

						var8.newDecorativeObject(var0, var2, var3, var19, (Renderable)var28, (Renderable)null, Tiles.field1014[var5], 0, var25 * Tiles.field1018[var5], var25 * Tiles.field1017[var5], var22, var24); // L: 1183
					} else if (var6 == 6) { // L: 1186
						var25 = 8; // L: 1187
						var26 = var8.getWallObjectTag(var0, var2, var3); // L: 1188
						if (0L != var26) { // L: 1189
							var25 = class137.getObjectDefinition(class167.Entity_unpackID(var26)).int2 / 2;
						}

						if (var11 == -1 && var10.transforms == null) { // L: 1191
							var28 = var10.getModel(4, var5 + 4, var18, var20, var19, var21);
						} else {
							var28 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1192
						}

						var8.newDecorativeObject(var0, var2, var3, var19, (Renderable)var28, (Renderable)null, 256, var5, var25 * Tiles.field1010[var5], var25 * Tiles.field1007[var5], var22, var24); // L: 1193
					} else if (var6 == 7) { // L: 1196
						int var31 = var5 + 2 & 3; // L: 1198
						if (var11 == -1 && var10.transforms == null) { // L: 1199
							var32 = var10.getModel(4, var31 + 4, var18, var20, var19, var21);
						} else {
							var32 = new DynamicObject(var4, 4, var31 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1200
						}

						var8.newDecorativeObject(var0, var2, var3, var19, (Renderable)var32, (Renderable)null, 256, var31, 0, 0, var22, var24); // L: 1201
					} else if (var6 == 8) { // L: 1204
						var25 = 8; // L: 1205
						var26 = var8.getWallObjectTag(var0, var2, var3); // L: 1206
						if (0L != var26) { // L: 1207
							var25 = class137.getObjectDefinition(class167.Entity_unpackID(var26)).int2 / 2;
						}

						int var30 = var5 + 2 & 3; // L: 1210
						Object var29;
						if (var11 == -1 && var10.transforms == null) { // L: 1211
							var28 = var10.getModel(4, var5 + 4, var18, var20, var19, var21); // L: 1212
							var29 = var10.getModel(4, var30 + 4, var18, var20, var19, var21); // L: 1213
						} else {
							var28 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1216
							var29 = new DynamicObject(var4, 4, var30 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1217
						}

						var8.newDecorativeObject(var0, var2, var3, var19, (Renderable)var28, (Renderable)var29, 256, var5, var25 * Tiles.field1010[var5], var25 * Tiles.field1007[var5], var22, var24); // L: 1219
					}
				}
			}
		} else {
			if (var11 == -1 && var10.transforms == null) { // L: 1107
				var32 = var10.getModel(10, var5, var18, var20, var19, var21);
			} else {
				var32 = new DynamicObject(var4, 10, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1108
			}

			if (var32 != null) { // L: 1109
				var8.method5521(var0, var2, var3, var19, var12, var13, (Renderable)var32, var6 == 11 ? 256 : 0, var22, var24);
			}

			if (var10.interactType != 0) { // L: 1110
				var9.addGameObject(var2, var3, var12, var13, var10.boolean1);
			}

		}
	} // L: 1103 1111 1119 1127 1135 1151 1159 1167 1174 1184 1194 1202 1220 1222

	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-830137151"
	)
	static final void method327(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 12155
		class93.clientPreferences.updateSoundEffectVolume(var0); // L: 12156
	} // L: 12157
}
