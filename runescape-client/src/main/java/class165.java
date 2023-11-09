import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
public class class165 extends class177 {
	@ObfuscatedName("af")
	String field1796;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	final class166 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgy;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class165(class166 var1, String var2, String var3) {
		super(var1, var2); // L: 412
		this.this$0 = var1; // L: 411
		this.field1796 = var3; // L: 413
	} // L: 414

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-41"
	)
	public int vmethod3607() {
		return 1; // L: 417
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "88"
	)
	public String vmethod3616() {
		return this.field1796; // L: 422
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Lmq;",
		garbageValue = "5"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16; // L: 238
		int var2 = var0 & 65535; // L: 239
		if (VerticalAlignment.Widget_interfaceComponents[var1] == null || VerticalAlignment.Widget_interfaceComponents[var1][var2] == null) { // L: 240
			boolean var3 = SoundSystem.loadInterface(var1); // L: 241
			if (!var3) { // L: 242
				return null;
			}
		}

		return VerticalAlignment.Widget_interfaceComponents[var1][var2]; // L: 244
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1235100026"
	)
	public static void method3473() {
		ParamComposition.ParamComposition_cached.clear(); // L: 72
	} // L: 73

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILie;Lif;I)V",
		garbageValue = "-1255092021"
	)
	static final void method3480(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap var9) {
		ObjectComposition var10 = class144.getObjectDefinition(var4); // L: 1078
		int var11 = var7 >= 0 ? var7 : var10.animationId; // L: 1079
		int var12;
		int var13;
		if (var5 != 1 && var5 != 3) { // L: 1082
			var12 = var10.sizeX; // L: 1087
			var13 = var10.sizeY; // L: 1088
		} else {
			var12 = var10.sizeY; // L: 1083
			var13 = var10.sizeX; // L: 1084
		}

		int var14;
		int var15;
		if (var12 + var2 <= 104) { // L: 1094
			var14 = (var12 >> 1) + var2; // L: 1095
			var15 = var2 + (var12 + 1 >> 1); // L: 1096
		} else {
			var14 = var2; // L: 1099
			var15 = var2 + 1; // L: 1100
		}

		int var16;
		int var17;
		if (var3 + var13 <= 104) { // L: 1102
			var16 = var3 + (var13 >> 1); // L: 1103
			var17 = var3 + (var13 + 1 >> 1); // L: 1104
		} else {
			var16 = var3; // L: 1107
			var17 = var3 + 1; // L: 1108
		}

		int[][] var18 = Tiles.Tiles_heights[var1]; // L: 1110
		int var19 = var18[var14][var16] + var18[var15][var16] + var18[var14][var17] + var18[var15][var17] >> 2; // L: 1111
		int var20 = (var2 << 7) + (var12 << 6); // L: 1112
		int var21 = (var3 << 7) + (var13 << 6); // L: 1113
		long var22 = FaceNormal.calculateTag(var2, var3, 2, var10.int1 == 0, var4); // L: 1114
		int var24 = (var5 << 6) + var6; // L: 1115
		if (var10.int3 == 1) { // L: 1116
			var24 += 256;
		}

		Object var32;
		if (var6 == 22) { // L: 1117
			if (var11 == -1 && var10.transforms == null) { // L: 1119
				var32 = var10.getModel(22, var5, var18, var20, var19, var21);
			} else {
				var32 = new DynamicObject(var4, 22, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1120
			}

			var8.newGroundObject(var0, var2, var3, var19, (Renderable)var32, var22, var24); // L: 1121
			if (var10.interactType == 1) { // L: 1122
				var9.setBlockedByFloorDec(var2, var3);
			}

		} else if (var6 != 10 && var6 != 11) { // L: 1125
			if (var6 >= 12) { // L: 1133
				if (var11 == -1 && var10.transforms == null) { // L: 1135
					var32 = var10.getModel(var6, var5, var18, var20, var19, var21);
				} else {
					var32 = new DynamicObject(var4, var6, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1136
				}

				var8.method4687(var0, var2, var3, var19, 1, 1, (Renderable)var32, 0, var22, var24); // L: 1137
				if (var10.interactType != 0) { // L: 1138
					var9.addGameObject(var2, var3, var12, var13, var10.boolean1);
				}

			} else if (var6 == 0) { // L: 1141
				if (var11 == -1 && var10.transforms == null) { // L: 1143
					var32 = var10.getModel(0, var5, var18, var20, var19, var21);
				} else {
					var32 = new DynamicObject(var4, 0, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1144
				}

				var8.newWallObject(var0, var2, var3, var19, (Renderable)var32, (Renderable)null, Tiles.field995[var5], 0, var22, var24); // L: 1145
				if (var10.interactType != 0) { // L: 1146
					var9.method4247(var2, var3, var6, var5, var10.boolean1);
				}

			} else if (var6 == 1) { // L: 1149
				if (var11 == -1 && var10.transforms == null) { // L: 1151
					var32 = var10.getModel(1, var5, var18, var20, var19, var21);
				} else {
					var32 = new DynamicObject(var4, 1, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1152
				}

				var8.newWallObject(var0, var2, var3, var19, (Renderable)var32, (Renderable)null, Tiles.field1006[var5], 0, var22, var24); // L: 1153
				if (var10.interactType != 0) { // L: 1154
					var9.method4247(var2, var3, var6, var5, var10.boolean1);
				}

			} else {
				int var25;
				if (var6 == 2) { // L: 1157
					var25 = var5 + 1 & 3; // L: 1158
					Object var27;
					Object var33;
					if (var11 == -1 && var10.transforms == null) { // L: 1161
						var33 = var10.getModel(2, var5 + 4, var18, var20, var19, var21); // L: 1162
						var27 = var10.getModel(2, var25, var18, var20, var19, var21); // L: 1163
					} else {
						var33 = new DynamicObject(var4, 2, var5 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1166
						var27 = new DynamicObject(var4, 2, var25, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1167
					}

					var8.newWallObject(var0, var2, var3, var19, (Renderable)var33, (Renderable)var27, Tiles.field995[var5], Tiles.field995[var25], var22, var24); // L: 1169
					if (var10.interactType != 0) { // L: 1170
						var9.method4247(var2, var3, var6, var5, var10.boolean1);
					}

				} else if (var6 == 3) { // L: 1173
					if (var11 == -1 && var10.transforms == null) { // L: 1175
						var32 = var10.getModel(3, var5, var18, var20, var19, var21);
					} else {
						var32 = new DynamicObject(var4, 3, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1176
					}

					var8.newWallObject(var0, var2, var3, var19, (Renderable)var32, (Renderable)null, Tiles.field1006[var5], 0, var22, var24); // L: 1177
					if (var10.interactType != 0) { // L: 1178
						var9.method4247(var2, var3, var6, var5, var10.boolean1);
					}

				} else if (var6 == 9) { // L: 1181
					if (var11 == -1 && var10.transforms == null) { // L: 1183
						var32 = var10.getModel(var6, var5, var18, var20, var19, var21);
					} else {
						var32 = new DynamicObject(var4, var6, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1184
					}

					var8.method4687(var0, var2, var3, var19, 1, 1, (Renderable)var32, 0, var22, var24); // L: 1185
					if (var10.interactType != 0) { // L: 1186
						var9.addGameObject(var2, var3, var12, var13, var10.boolean1);
					}

				} else if (var6 == 4) { // L: 1189
					if (var11 == -1 && var10.transforms == null) { // L: 1191
						var32 = var10.getModel(4, var5, var18, var20, var19, var21);
					} else {
						var32 = new DynamicObject(var4, 4, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1192
					}

					var8.newDecorativeObject(var0, var2, var3, var19, (Renderable)var32, (Renderable)null, Tiles.field995[var5], 0, 0, 0, var22, var24); // L: 1193
				} else {
					long var26;
					Object var28;
					if (var6 == 5) { // L: 1196
						var25 = 16; // L: 1197
						var26 = var8.getWallObjectTag(var0, var2, var3); // L: 1198
						if (var26 != 0L) { // L: 1199
							var25 = class144.getObjectDefinition(InterfaceParent.Entity_unpackID(var26)).int2;
						}

						if (var11 == -1 && var10.transforms == null) { // L: 1201
							var28 = var10.getModel(4, var5, var18, var20, var19, var21);
						} else {
							var28 = new DynamicObject(var4, 4, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1202
						}

						var8.newDecorativeObject(var0, var2, var3, var19, (Renderable)var28, (Renderable)null, Tiles.field995[var5], 0, var25 * Tiles.field1007[var5], var25 * Tiles.field1003[var5], var22, var24); // L: 1203
					} else if (var6 == 6) { // L: 1206
						var25 = 8; // L: 1207
						var26 = var8.getWallObjectTag(var0, var2, var3); // L: 1208
						if (0L != var26) { // L: 1209
							var25 = class144.getObjectDefinition(InterfaceParent.Entity_unpackID(var26)).int2 / 2;
						}

						if (var11 == -1 && var10.transforms == null) { // L: 1211
							var28 = var10.getModel(4, var5 + 4, var18, var20, var19, var21);
						} else {
							var28 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1212
						}

						var8.newDecorativeObject(var0, var2, var3, var19, (Renderable)var28, (Renderable)null, 256, var5, var25 * Tiles.field1009[var5], var25 * Tiles.field1010[var5], var22, var24); // L: 1213
					} else if (var6 == 7) { // L: 1216
						int var31 = var5 + 2 & 3; // L: 1218
						if (var11 == -1 && var10.transforms == null) { // L: 1219
							var32 = var10.getModel(4, var31 + 4, var18, var20, var19, var21);
						} else {
							var32 = new DynamicObject(var4, 4, var31 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1220
						}

						var8.newDecorativeObject(var0, var2, var3, var19, (Renderable)var32, (Renderable)null, 256, var31, 0, 0, var22, var24); // L: 1221
					} else if (var6 == 8) { // L: 1224
						var25 = 8; // L: 1225
						var26 = var8.getWallObjectTag(var0, var2, var3); // L: 1226
						if (0L != var26) { // L: 1227
							var25 = class144.getObjectDefinition(InterfaceParent.Entity_unpackID(var26)).int2 / 2;
						}

						int var30 = var5 + 2 & 3; // L: 1230
						Object var29;
						if (var11 == -1 && var10.transforms == null) { // L: 1231
							var28 = var10.getModel(4, var5 + 4, var18, var20, var19, var21); // L: 1232
							var29 = var10.getModel(4, var30 + 4, var18, var20, var19, var21); // L: 1233
						} else {
							var28 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1236
							var29 = new DynamicObject(var4, 4, var30 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1237
						}

						var8.newDecorativeObject(var0, var2, var3, var19, (Renderable)var28, (Renderable)var29, 256, var5, var25 * Tiles.field1009[var5], var25 * Tiles.field1010[var5], var22, var24); // L: 1239
					}
				}
			}
		} else {
			if (var11 == -1 && var10.transforms == null) { // L: 1127
				var32 = var10.getModel(10, var5, var18, var20, var19, var21);
			} else {
				var32 = new DynamicObject(var4, 10, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1128
			}

			if (var32 != null) { // L: 1129
				var8.method4687(var0, var2, var3, var19, var12, var13, (Renderable)var32, var6 == 11 ? 256 : 0, var22, var24);
			}

			if (var10.interactType != 0) { // L: 1130
				var9.addGameObject(var2, var3, var12, var13, var10.boolean1);
			}

		}
	} // L: 1123 1131 1139 1147 1155 1171 1179 1187 1194 1204 1214 1222 1240 1242
}
