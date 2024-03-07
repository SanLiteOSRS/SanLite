import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
@Implements("World")
public class World {
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -176509577
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2063683187
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("az")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("ao")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 386127255
	)
	@Export("id")
	int id;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1193821769
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 273964793
	)
	@Export("population")
	int population;
	@ObfuscatedName("af")
	@Export("host")
	String host;
	@ObfuscatedName("ax")
	@Export("activity")
	String activity;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -567876533
	)
	@Export("location")
	int location;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1858071637
	)
	@Export("index")
	int index;
	@ObfuscatedName("am")
	String field850;

	static {
		World_count = 0; // L: 14
		World_listCount = 0; // L: 15
		World_sortOption2 = new int[]{1, 1, 1, 1}; // L: 16
		World_sortOption1 = new int[]{0, 1, 2, 3}; // L: 17
	}

	World() {
	} // L: 28

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-103"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (class529.field5186.rsOrdinal() & this.properties) != 0; // L: 248
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-92"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (class529.field5174.rsOrdinal() & this.properties) != 0; // L: 252
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-1"
	)
	boolean method1814() {
		return (class529.field5177.rsOrdinal() & this.properties) != 0; // L: 256
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1754226121"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (class529.field5160.rsOrdinal() & this.properties) != 0; // L: 260
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1235435531"
	)
	boolean method1816() {
		return (class529.field5188.rsOrdinal() & this.properties) != 0; // L: 264
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1039182462"
	)
	boolean method1829() {
		return (class529.field5187.rsOrdinal() & this.properties) != 0; // L: 268
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-239511272"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (class529.field5183.rsOrdinal() & this.properties) != 0; // L: 272
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "54"
	)
	boolean method1819() {
		return (class529.field5158.rsOrdinal() & this.properties) != 0; // L: 276
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-325415547"
	)
	boolean method1820() {
		return (class529.field5169.rsOrdinal() & this.properties) != 0; // L: 280
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "29712"
	)
	boolean method1838() {
		return (class529.field5185.rsOrdinal() & this.properties) != 0; // L: 284
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILkq;Liz;I)V",
		garbageValue = "-2055164667"
	)
	static final void method1821(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap var9) {
		ObjectComposition var10 = class127.getObjectDefinition(var4); // L: 1037
		int var11 = var7 >= 0 ? var7 : var10.animationId; // L: 1038
		int var12;
		int var13;
		if (var5 != 1 && var5 != 3) { // L: 1041
			var12 = var10.sizeX; // L: 1046
			var13 = var10.sizeY; // L: 1047
		} else {
			var12 = var10.sizeY; // L: 1042
			var13 = var10.sizeX; // L: 1043
		}

		int var14;
		int var15;
		if (var12 + var2 <= 104) { // L: 1053
			var14 = (var12 >> 1) + var2; // L: 1054
			var15 = var2 + (var12 + 1 >> 1); // L: 1055
		} else {
			var14 = var2; // L: 1058
			var15 = var2 + 1; // L: 1059
		}

		int var16;
		int var17;
		if (var3 + var13 <= 104) { // L: 1061
			var16 = var3 + (var13 >> 1); // L: 1062
			var17 = var3 + (var13 + 1 >> 1); // L: 1063
		} else {
			var16 = var3; // L: 1066
			var17 = var3 + 1; // L: 1067
		}

		int[][] var18 = Tiles.Tiles_heights[var1]; // L: 1069
		int var19 = var18[var15][var16] + var18[var14][var16] + var18[var14][var17] + var18[var15][var17] >> 2; // L: 1070
		int var20 = (var2 << 7) + (var12 << 6); // L: 1071
		int var21 = (var3 << 7) + (var13 << 6); // L: 1072
		long var22 = class18.calculateTag(var2, var3, 2, var10.int1 == 0, var4); // L: 1073
		int var24 = (var5 << 6) + var6; // L: 1074
		if (var10.int3 == 1) { // L: 1075
			var24 += 256;
		}

		Object var32;
		if (var6 == 22) { // L: 1076
			if (var11 == -1 && var10.transforms == null) { // L: 1078
				var32 = var10.getModel(22, var5, var18, var20, var19, var21);
			} else {
				var32 = new DynamicObject(var4, 22, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1079
			}

			var8.newGroundObject(var0, var2, var3, var19, (Renderable)var32, var22, var24); // L: 1080
			if (var10.interactType == 1) { // L: 1081
				var9.setBlockedByFloorDec(var2, var3);
			}

		} else if (var6 != 10 && var6 != 11) { // L: 1084
			if (var6 >= 12) { // L: 1092
				if (var11 == -1 && var10.transforms == null) { // L: 1094
					var32 = var10.getModel(var6, var5, var18, var20, var19, var21);
				} else {
					var32 = new DynamicObject(var4, var6, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1095
				}

				var8.method5430(var0, var2, var3, var19, 1, 1, (Renderable)var32, 0, var22, var24); // L: 1096
				if (var10.interactType != 0) { // L: 1097
					var9.addGameObject(var2, var3, var12, var13, var10.boolean1);
				}

			} else if (var6 == 0) { // L: 1100
				if (var11 == -1 && var10.transforms == null) { // L: 1102
					var32 = var10.getModel(0, var5, var18, var20, var19, var21);
				} else {
					var32 = new DynamicObject(var4, 0, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1103
				}

				var8.newWallObject(var0, var2, var3, var19, (Renderable)var32, (Renderable)null, Tiles.field1060[var5], 0, var22, var24); // L: 1104
				if (var10.interactType != 0) { // L: 1105
					var9.method4504(var2, var3, var6, var5, var10.boolean1);
				}

			} else if (var6 == 1) { // L: 1108
				if (var11 == -1 && var10.transforms == null) { // L: 1110
					var32 = var10.getModel(1, var5, var18, var20, var19, var21);
				} else {
					var32 = new DynamicObject(var4, 1, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1111
				}

				var8.newWallObject(var0, var2, var3, var19, (Renderable)var32, (Renderable)null, Tiles.field1056[var5], 0, var22, var24); // L: 1112
				if (var10.interactType != 0) { // L: 1113
					var9.method4504(var2, var3, var6, var5, var10.boolean1);
				}

			} else {
				int var25;
				if (var6 == 2) { // L: 1116
					var25 = var5 + 1 & 3; // L: 1117
					Object var27;
					Object var33;
					if (var11 == -1 && var10.transforms == null) { // L: 1120
						var33 = var10.getModel(2, var5 + 4, var18, var20, var19, var21); // L: 1121
						var27 = var10.getModel(2, var25, var18, var20, var19, var21); // L: 1122
					} else {
						var33 = new DynamicObject(var4, 2, var5 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1125
						var27 = new DynamicObject(var4, 2, var25, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1126
					}

					var8.newWallObject(var0, var2, var3, var19, (Renderable)var33, (Renderable)var27, Tiles.field1060[var5], Tiles.field1060[var25], var22, var24); // L: 1128
					if (var10.interactType != 0) { // L: 1129
						var9.method4504(var2, var3, var6, var5, var10.boolean1);
					}

				} else if (var6 == 3) { // L: 1132
					if (var11 == -1 && var10.transforms == null) { // L: 1134
						var32 = var10.getModel(3, var5, var18, var20, var19, var21);
					} else {
						var32 = new DynamicObject(var4, 3, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1135
					}

					var8.newWallObject(var0, var2, var3, var19, (Renderable)var32, (Renderable)null, Tiles.field1056[var5], 0, var22, var24); // L: 1136
					if (var10.interactType != 0) { // L: 1137
						var9.method4504(var2, var3, var6, var5, var10.boolean1);
					}

				} else if (var6 == 9) { // L: 1140
					if (var11 == -1 && var10.transforms == null) { // L: 1142
						var32 = var10.getModel(var6, var5, var18, var20, var19, var21);
					} else {
						var32 = new DynamicObject(var4, var6, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1143
					}

					var8.method5430(var0, var2, var3, var19, 1, 1, (Renderable)var32, 0, var22, var24); // L: 1144
					if (var10.interactType != 0) { // L: 1145
						var9.addGameObject(var2, var3, var12, var13, var10.boolean1);
					}

				} else if (var6 == 4) { // L: 1148
					if (var11 == -1 && var10.transforms == null) { // L: 1150
						var32 = var10.getModel(4, var5, var18, var20, var19, var21);
					} else {
						var32 = new DynamicObject(var4, 4, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1151
					}

					var8.newDecorativeObject(var0, var2, var3, var19, (Renderable)var32, (Renderable)null, Tiles.field1060[var5], 0, 0, 0, var22, var24); // L: 1152
				} else {
					long var26;
					Object var28;
					if (var6 == 5) { // L: 1155
						var25 = 16; // L: 1156
						var26 = var8.getWallObjectTag(var0, var2, var3); // L: 1157
						if (0L != var26) { // L: 1158
							var25 = class127.getObjectDefinition(Message.Entity_unpackID(var26)).int2;
						}

						if (var11 == -1 && var10.transforms == null) { // L: 1160
							var28 = var10.getModel(4, var5, var18, var20, var19, var21);
						} else {
							var28 = new DynamicObject(var4, 4, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1161
						}

						var8.newDecorativeObject(var0, var2, var3, var19, (Renderable)var28, (Renderable)null, Tiles.field1060[var5], 0, var25 * Tiles.field1053[var5], var25 * Tiles.field1054[var5], var22, var24); // L: 1162
					} else if (var6 == 6) { // L: 1165
						var25 = 8; // L: 1166
						var26 = var8.getWallObjectTag(var0, var2, var3); // L: 1167
						if (0L != var26) { // L: 1168
							var25 = class127.getObjectDefinition(Message.Entity_unpackID(var26)).int2 / 2;
						}

						if (var11 == -1 && var10.transforms == null) { // L: 1170
							var28 = var10.getModel(4, var5 + 4, var18, var20, var19, var21);
						} else {
							var28 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1171
						}

						var8.newDecorativeObject(var0, var2, var3, var19, (Renderable)var28, (Renderable)null, 256, var5, var25 * Tiles.field1055[var5], var25 * Tiles.field1046[var5], var22, var24); // L: 1172
					} else if (var6 == 7) { // L: 1175
						int var31 = var5 + 2 & 3; // L: 1177
						if (var11 == -1 && var10.transforms == null) { // L: 1178
							var32 = var10.getModel(4, var31 + 4, var18, var20, var19, var21);
						} else {
							var32 = new DynamicObject(var4, 4, var31 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1179
						}

						var8.newDecorativeObject(var0, var2, var3, var19, (Renderable)var32, (Renderable)null, 256, var31, 0, 0, var22, var24); // L: 1180
					} else if (var6 == 8) { // L: 1183
						var25 = 8; // L: 1184
						var26 = var8.getWallObjectTag(var0, var2, var3); // L: 1185
						if (0L != var26) { // L: 1186
							var25 = class127.getObjectDefinition(Message.Entity_unpackID(var26)).int2 / 2;
						}

						int var30 = var5 + 2 & 3; // L: 1189
						Object var29;
						if (var11 == -1 && var10.transforms == null) { // L: 1190
							var28 = var10.getModel(4, var5 + 4, var18, var20, var19, var21); // L: 1191
							var29 = var10.getModel(4, var30 + 4, var18, var20, var19, var21); // L: 1192
						} else {
							var28 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1195
							var29 = new DynamicObject(var4, 4, var30 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1196
						}

						var8.newDecorativeObject(var0, var2, var3, var19, (Renderable)var28, (Renderable)var29, 256, var5, var25 * Tiles.field1055[var5], var25 * Tiles.field1046[var5], var22, var24); // L: 1198
					}
				}
			}
		} else {
			if (var11 == -1 && var10.transforms == null) { // L: 1086
				var32 = var10.getModel(10, var5, var18, var20, var19, var21);
			} else {
				var32 = new DynamicObject(var4, 10, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1087
			}

			if (var32 != null) { // L: 1088
				var8.method5430(var0, var2, var3, var19, var12, var13, (Renderable)var32, var6 == 11 ? 256 : 0, var22, var24);
			}

			if (var10.interactType != 0) { // L: 1089
				var9.addGameObject(var2, var3, var12, var13, var10.boolean1);
			}

		}
	} // L: 1082 1090 1098 1106 1114 1130 1138 1146 1153 1163 1173 1181 1199 1201
}
