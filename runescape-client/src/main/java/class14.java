import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("l")
public class class14 {
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1479003827
	)
	final int field73;
	@ObfuscatedName("h")
	final String field78;
	@ObfuscatedName("w")
	final ThreadFactory field74;
	@ObfuscatedName("v")
	final ThreadPoolExecutor field79;

	public class14(String var1, int var2, int var3) {
		this.field78 = var1; // L: 15
		this.field73 = var2; // L: 16
		this.field74 = new class16(this); // L: 17
		this.field79 = this.method167(var3); // L: 18
	} // L: 19

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "-292986916"
	)
	final ThreadPoolExecutor method167(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field73), this.field74); // L: 22
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ld;B)Le;",
		garbageValue = "0"
	)
	public class19 method168(class10 var1) {
		if (this.field79.getQueue().remainingCapacity() <= 0) { // L: 26
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field79.getCorePoolSize() + " Queue capacity " + this.field73); // L: 27
			return new class19("Queue full"); // L: 28
		} else {
			class19 var2 = new class19(this.field79.submit(new class20(this, var1))); // L: 30
			return var2; // L: 31
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1529317027"
	)
	public final void method169() {
		try {
			this.field79.shutdown(); // L: 36
		} catch (Exception var2) {
			System.err.println("Error shutting down RestRequestService\r\n" + var2); // L: 39
		}

	} // L: 41

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "929025169"
	)
	public static int method171(int var0) {
		return class271.field3185[var0]; // L: 38
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "1797095087"
	)
	static int method170(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 829
			var0 -= 1000; // L: 830
			var3 = HitSplatDefinition.getWidget(Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]); // L: 831
		} else {
			var3 = var2 ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget; // L: 833
		}

		class125.invalidateWidget(var3); // L: 834
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 835
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 855
				var3.modelType = 2; // L: 856
				var3.modelId = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 857
				return 1; // L: 858
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 860
				var3.modelType = 3; // L: 861
				var3.modelId = ScriptFrame.localPlayer.appearance.getChatHeadId(); // L: 862
				return 1; // L: 863
			} else {
				return 2; // L: 865
			}
		} else {
			Nameable.Interpreter_intStackSize -= 2; // L: 836
			int var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 837
			int var5 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 838
			var3.itemId = var4; // L: 839
			var3.itemQuantity = var5; // L: 840
			ItemComposition var6 = AttackOption.ItemComposition_get(var4); // L: 841
			var3.modelAngleX = var6.xan2d; // L: 842
			var3.modelAngleY = var6.yan2d; // L: 843
			var3.modelAngleZ = var6.zan2d; // L: 844
			var3.modelOffsetX = var6.offsetX2d; // L: 845
			var3.modelOffsetY = var6.offsetY2d; // L: 846
			var3.modelZoom = var6.zoom2d; // L: 847
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) { // L: 848
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.isStackable) { // L: 849
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2; // L: 850
			}

			if (var3.field3413 > 0) { // L: 851
				var3.modelZoom = var3.modelZoom * 32 / var3.field3413;
			} else if (var3.rawWidth > 0) { // L: 852
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1; // L: 853
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIILgy;Lgl;B)V",
		garbageValue = "0"
	)
	static final void method174(int var0, int var1, int var2, int var3, int var4, int var5, int var6, Scene var7, CollisionMap var8) {
		ObjectComposition var9 = FileSystem.getObjectDefinition(var4); // L: 1066
		int var10;
		int var11;
		if (var5 != 1 && var5 != 3) { // L: 1069
			var10 = var9.sizeX; // L: 1074
			var11 = var9.sizeY; // L: 1075
		} else {
			var10 = var9.sizeY; // L: 1070
			var11 = var9.sizeX; // L: 1071
		}

		int var12;
		int var13;
		if (var10 + var2 <= 104) { // L: 1081
			var12 = (var10 >> 1) + var2; // L: 1082
			var13 = var2 + (var10 + 1 >> 1); // L: 1083
		} else {
			var12 = var2; // L: 1086
			var13 = var2 + 1; // L: 1087
		}

		int var14;
		int var15;
		if (var3 + var11 <= 104) { // L: 1089
			var14 = var3 + (var11 >> 1); // L: 1090
			var15 = var3 + (var11 + 1 >> 1); // L: 1091
		} else {
			var14 = var3; // L: 1094
			var15 = var3 + 1; // L: 1095
		}

		int[][] var16 = Tiles.Tiles_heights[var1]; // L: 1097
		int var17 = var16[var13][var15] + var16[var12][var14] + var16[var13][var14] + var16[var12][var15] >> 2; // L: 1098
		int var18 = (var2 << 7) + (var10 << 6); // L: 1099
		int var19 = (var3 << 7) + (var11 << 6); // L: 1100
		long var20 = GroundObject.calculateTag(var2, var3, 2, var9.int1 == 0, var4); // L: 1101
		int var22 = (var5 << 6) + var6; // L: 1102
		if (var9.int3 == 1) { // L: 1103
			var22 += 256;
		}

		Object var30;
		if (var6 == 22) { // L: 1104
			if (var9.animationId == -1 && var9.transforms == null) { // L: 1106
				var30 = var9.getModel(22, var5, var16, var18, var17, var19);
			} else {
				var30 = new DynamicObject(var4, 22, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1107
			}

			var7.newGroundObject(var0, var2, var3, var17, (Renderable)var30, var20, var22); // L: 1108
			if (var9.interactType == 1) { // L: 1109
				var8.setBlockedByFloorDec(var2, var3);
			}

		} else if (var6 != 10 && var6 != 11) { // L: 1112
			if (var6 >= 12) { // L: 1120
				if (var9.animationId == -1 && var9.transforms == null) { // L: 1122
					var30 = var9.getModel(var6, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, var6, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1123
				}

				var7.method4061(var0, var2, var3, var17, 1, 1, (Renderable)var30, 0, var20, var22); // L: 1124
				if (var9.interactType != 0) { // L: 1125
					var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
				}

			} else if (var6 == 0) { // L: 1128
				if (var9.animationId == -1 && var9.transforms == null) { // L: 1130
					var30 = var9.getModel(0, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, 0, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1131
				}

				var7.newWallObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field977[var5], 0, var20, var22); // L: 1132
				if (var9.interactType != 0) { // L: 1133
					var8.method3795(var2, var3, var6, var5, var9.boolean1);
				}

			} else if (var6 == 1) { // L: 1136
				if (var9.animationId == -1 && var9.transforms == null) { // L: 1138
					var30 = var9.getModel(1, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, 1, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1139
				}

				var7.newWallObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field978[var5], 0, var20, var22); // L: 1140
				if (var9.interactType != 0) { // L: 1141
					var8.method3795(var2, var3, var6, var5, var9.boolean1);
				}

			} else {
				int var23;
				if (var6 == 2) { // L: 1144
					var23 = var5 + 1 & 3; // L: 1145
					Object var25;
					Object var31;
					if (var9.animationId == -1 && var9.transforms == null) { // L: 1148
						var31 = var9.getModel(2, var5 + 4, var16, var18, var17, var19); // L: 1149
						var25 = var9.getModel(2, var23, var16, var18, var17, var19); // L: 1150
					} else {
						var31 = new DynamicObject(var4, 2, var5 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1153
						var25 = new DynamicObject(var4, 2, var23, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1154
					}

					var7.newWallObject(var0, var2, var3, var17, (Renderable)var31, (Renderable)var25, Tiles.field977[var5], Tiles.field977[var23], var20, var22); // L: 1156
					if (var9.interactType != 0) { // L: 1157
						var8.method3795(var2, var3, var6, var5, var9.boolean1);
					}

				} else if (var6 == 3) { // L: 1160
					if (var9.animationId == -1 && var9.transforms == null) { // L: 1162
						var30 = var9.getModel(3, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, 3, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1163
					}

					var7.newWallObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field978[var5], 0, var20, var22); // L: 1164
					if (var9.interactType != 0) { // L: 1165
						var8.method3795(var2, var3, var6, var5, var9.boolean1);
					}

				} else if (var6 == 9) { // L: 1168
					if (var9.animationId == -1 && var9.transforms == null) { // L: 1170
						var30 = var9.getModel(var6, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, var6, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1171
					}

					var7.method4061(var0, var2, var3, var17, 1, 1, (Renderable)var30, 0, var20, var22); // L: 1172
					if (var9.interactType != 0) { // L: 1173
						var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
					}

				} else if (var6 == 4) { // L: 1176
					if (var9.animationId == -1 && var9.transforms == null) { // L: 1178
						var30 = var9.getModel(4, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, 4, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1179
					}

					var7.newDecorativeObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field977[var5], 0, 0, 0, var20, var22); // L: 1180
				} else {
					long var24;
					Object var26;
					if (var6 == 5) { // L: 1183
						var23 = 16; // L: 1184
						var24 = var7.getWallObjectTag(var0, var2, var3); // L: 1185
						if (0L != var24) { // L: 1186
							var23 = FileSystem.getObjectDefinition(WorldMapSection2.Entity_unpackID(var24)).int2;
						}

						if (var9.animationId == -1 && var9.transforms == null) { // L: 1188
							var26 = var9.getModel(4, var5, var16, var18, var17, var19);
						} else {
							var26 = new DynamicObject(var4, 4, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1189
						}

						var7.newDecorativeObject(var0, var2, var3, var17, (Renderable)var26, (Renderable)null, Tiles.field977[var5], 0, var23 * Tiles.field979[var5], var23 * Tiles.field982[var5], var20, var22); // L: 1190
					} else if (var6 == 6) { // L: 1193
						var23 = 8; // L: 1194
						var24 = var7.getWallObjectTag(var0, var2, var3); // L: 1195
						if (var24 != 0L) { // L: 1196
							var23 = FileSystem.getObjectDefinition(WorldMapSection2.Entity_unpackID(var24)).int2 / 2;
						}

						if (var9.animationId == -1 && var9.transforms == null) { // L: 1198
							var26 = var9.getModel(4, var5 + 4, var16, var18, var17, var19);
						} else {
							var26 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1199
						}

						var7.newDecorativeObject(var0, var2, var3, var17, (Renderable)var26, (Renderable)null, 256, var5, var23 * Tiles.field981[var5], var23 * Tiles.field970[var5], var20, var22); // L: 1200
					} else if (var6 == 7) { // L: 1203
						int var29 = var5 + 2 & 3; // L: 1205
						if (var9.animationId == -1 && var9.transforms == null) { // L: 1206
							var30 = var9.getModel(4, var29 + 4, var16, var18, var17, var19);
						} else {
							var30 = new DynamicObject(var4, 4, var29 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1207
						}

						var7.newDecorativeObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, 256, var29, 0, 0, var20, var22); // L: 1208
					} else if (var6 == 8) { // L: 1211
						var23 = 8; // L: 1212
						var24 = var7.getWallObjectTag(var0, var2, var3); // L: 1213
						if (var24 != 0L) { // L: 1214
							var23 = FileSystem.getObjectDefinition(WorldMapSection2.Entity_unpackID(var24)).int2 / 2;
						}

						int var28 = var5 + 2 & 3; // L: 1217
						Object var27;
						if (var9.animationId == -1 && var9.transforms == null) { // L: 1218
							var26 = var9.getModel(4, var5 + 4, var16, var18, var17, var19); // L: 1219
							var27 = var9.getModel(4, var28 + 4, var16, var18, var17, var19); // L: 1220
						} else {
							var26 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1223
							var27 = new DynamicObject(var4, 4, var28 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1224
						}

						var7.newDecorativeObject(var0, var2, var3, var17, (Renderable)var26, (Renderable)var27, 256, var5, var23 * Tiles.field981[var5], var23 * Tiles.field970[var5], var20, var22); // L: 1226
					}
				}
			}
		} else {
			if (var9.animationId == -1 && var9.transforms == null) { // L: 1114
				var30 = var9.getModel(10, var5, var16, var18, var17, var19);
			} else {
				var30 = new DynamicObject(var4, 10, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1115
			}

			if (var30 != null) { // L: 1116
				var7.method4061(var0, var2, var3, var17, var10, var11, (Renderable)var30, var6 == 11 ? 256 : 0, var20, var22);
			}

			if (var9.interactType != 0) {
				var8.addGameObject(var2, var3, var10, var11, var9.boolean1); // L: 1117
			}

		}
	} // L: 1110 1118 1126 1134 1142 1158 1166 1174 1181 1191 1201 1209 1227 1229

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "909908456"
	)
	static int method179(int var0, Script var1, boolean var2) {
		Widget var3 = HitSplatDefinition.getWidget(Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]); // L: 1460
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) { // L: 1461
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = ModeWhere.Widget_unpackTargetMask(class193.getWidgetFlags(var3)); // L: 1462
			return 1; // L: 1463
		} else if (var0 != ScriptOpcodes.IF_GETOP) { // L: 1465
			if (var0 == ScriptOpcodes.IF_GETOPBASE) { // L: 1472
				if (var3.dataText == null) { // L: 1473
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1474
				}

				return 1; // L: 1475
			} else {
				return 2; // L: 1477
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 1466
			--var4; // L: 1467
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1468
				Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1469
			} else {
				Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1470
		}
	}
}
