import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("ac")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("al")
	@Export("lock")
	Object lock;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -53380647
	)
	@Export("index")
	int index;
	@ObfuscatedName("ax")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("ao")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("ah")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true; // L: 7
		this.lock = new Object(); // L: 8
		this.index = 0; // L: 9
		this.xs = new int[500]; // L: 10
		this.ys = new int[500]; // L: 11
		this.millis = new long[500]; // L: 12
	} // L: 14

	public void run() {
		for (; this.isRunning; Players.method2741(50L)) { // L: 18 27
			synchronized(this.lock) { // L: 19
				if (this.index < 500) { // L: 20
					this.xs[this.index] = MouseHandler.MouseHandler_x; // L: 21
					this.ys[this.index] = MouseHandler.MouseHandler_y; // L: 22
					this.millis[this.index] = MouseHandler.MouseHandler_millis; // L: 23
					++this.index; // L: 24
				}
			}
		}

	} // L: 29

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "894923929"
	)
	static int method2337(int var0) {
		return KeyHandler.KeyHandler_keyCodes[var0]; // L: 130
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "258753092"
	)
	static int method2336(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 50
		if (var1 == null) { // L: 51
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count; // L: 52 53
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILjt;Lih;I)V",
		garbageValue = "-737190520"
	)
	static final void method2332(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap var9) {
		ObjectComposition var10 = class91.getObjectDefinition(var4); // L: 1006
		int var11 = var7 >= 0 ? var7 : var10.animationId; // L: 1007
		int var12;
		int var13;
		if (var5 != 1 && var5 != 3) { // L: 1010
			var12 = var10.sizeX; // L: 1015
			var13 = var10.sizeY; // L: 1016
		} else {
			var12 = var10.sizeY; // L: 1011
			var13 = var10.sizeX; // L: 1012
		}

		int var14;
		int var15;
		if (var12 + var2 <= 104) { // L: 1022
			var14 = (var12 >> 1) + var2; // L: 1023
			var15 = var2 + (var12 + 1 >> 1); // L: 1024
		} else {
			var14 = var2; // L: 1027
			var15 = var2 + 1; // L: 1028
		}

		int var16;
		int var17;
		if (var3 + var13 <= 104) { // L: 1030
			var16 = var3 + (var13 >> 1); // L: 1031
			var17 = var3 + (var13 + 1 >> 1); // L: 1032
		} else {
			var16 = var3; // L: 1035
			var17 = var3 + 1; // L: 1036
		}

		int[][] var18 = Tiles.Tiles_heights[var1]; // L: 1038
		int var19 = var18[var15][var17] + var18[var14][var16] + var18[var15][var16] + var18[var14][var17] >> 2; // L: 1039
		int var20 = (var2 << 7) + (var12 << 6); // L: 1040
		int var21 = (var3 << 7) + (var13 << 6); // L: 1041
		long var22 = GrandExchangeOfferAgeComparator.calculateTag(var2, var3, 2, var10.int1 == 0, var4); // L: 1042
		int var24 = (var5 << 6) + var6; // L: 1043
		if (var10.int3 == 1) { // L: 1044
			var24 += 256;
		}

		Object var32;
		if (var6 == 22) { // L: 1045
			if (var11 == -1 && var10.transforms == null) {
				var32 = var10.getModel(22, var5, var18, var20, var19, var21); // L: 1047
			} else {
				var32 = new DynamicObject(var4, 22, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1048
			}

			var8.newGroundObject(var0, var2, var3, var19, (Renderable)var32, var22, var24); // L: 1049
			if (var10.interactType == 1) { // L: 1050
				var9.setBlockedByFloorDec(var2, var3);
			}

		} else if (var6 != 10 && var6 != 11) { // L: 1053
			if (var6 >= 12) { // L: 1061
				if (var11 == -1 && var10.transforms == null) { // L: 1063
					var32 = var10.getModel(var6, var5, var18, var20, var19, var21);
				} else {
					var32 = new DynamicObject(var4, var6, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1064
				}

				var8.method4716(var0, var2, var3, var19, 1, 1, (Renderable)var32, 0, var22, var24); // L: 1065
				if (var10.interactType != 0) { // L: 1066
					var9.addGameObject(var2, var3, var12, var13, var10.boolean1);
				}

			} else if (var6 == 0) { // L: 1069
				if (var11 == -1 && var10.transforms == null) { // L: 1071
					var32 = var10.getModel(0, var5, var18, var20, var19, var21);
				} else {
					var32 = new DynamicObject(var4, 0, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1072
				}

				var8.newWallObject(var0, var2, var3, var19, (Renderable)var32, (Renderable)null, Tiles.field1036[var5], 0, var22, var24); // L: 1073
				if (var10.interactType != 0) { // L: 1074
					var9.method4331(var2, var3, var6, var5, var10.boolean1);
				}

			} else if (var6 == 1) { // L: 1077
				if (var11 == -1 && var10.transforms == null) { // L: 1079
					var32 = var10.getModel(1, var5, var18, var20, var19, var21);
				} else {
					var32 = new DynamicObject(var4, 1, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1080
				}

				var8.newWallObject(var0, var2, var3, var19, (Renderable)var32, (Renderable)null, Tiles.field1037[var5], 0, var22, var24); // L: 1081
				if (var10.interactType != 0) { // L: 1082
					var9.method4331(var2, var3, var6, var5, var10.boolean1);
				}

			} else {
				int var25;
				if (var6 == 2) { // L: 1085
					var25 = var5 + 1 & 3; // L: 1086
					Object var27;
					Object var33;
					if (var11 == -1 && var10.transforms == null) { // L: 1089
						var33 = var10.getModel(2, var5 + 4, var18, var20, var19, var21); // L: 1090
						var27 = var10.getModel(2, var25, var18, var20, var19, var21); // L: 1091
					} else {
						var33 = new DynamicObject(var4, 2, var5 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1094
						var27 = new DynamicObject(var4, 2, var25, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1095
					}

					var8.newWallObject(var0, var2, var3, var19, (Renderable)var33, (Renderable)var27, Tiles.field1036[var5], Tiles.field1036[var25], var22, var24); // L: 1097
					if (var10.interactType != 0) { // L: 1098
						var9.method4331(var2, var3, var6, var5, var10.boolean1);
					}

				} else if (var6 == 3) { // L: 1101
					if (var11 == -1 && var10.transforms == null) { // L: 1103
						var32 = var10.getModel(3, var5, var18, var20, var19, var21);
					} else {
						var32 = new DynamicObject(var4, 3, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1104
					}

					var8.newWallObject(var0, var2, var3, var19, (Renderable)var32, (Renderable)null, Tiles.field1037[var5], 0, var22, var24); // L: 1105
					if (var10.interactType != 0) { // L: 1106
						var9.method4331(var2, var3, var6, var5, var10.boolean1);
					}

				} else if (var6 == 9) { // L: 1109
					if (var11 == -1 && var10.transforms == null) { // L: 1111
						var32 = var10.getModel(var6, var5, var18, var20, var19, var21);
					} else {
						var32 = new DynamicObject(var4, var6, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1112
					}

					var8.method4716(var0, var2, var3, var19, 1, 1, (Renderable)var32, 0, var22, var24); // L: 1113
					if (var10.interactType != 0) { // L: 1114
						var9.addGameObject(var2, var3, var12, var13, var10.boolean1);
					}

				} else if (var6 == 4) { // L: 1117
					if (var11 == -1 && var10.transforms == null) { // L: 1119
						var32 = var10.getModel(4, var5, var18, var20, var19, var21);
					} else {
						var32 = new DynamicObject(var4, 4, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1120
					}

					var8.newDecorativeObject(var0, var2, var3, var19, (Renderable)var32, (Renderable)null, Tiles.field1036[var5], 0, 0, 0, var22, var24); // L: 1121
				} else {
					long var26;
					Object var28;
					if (var6 == 5) { // L: 1124
						var25 = 16; // L: 1125
						var26 = var8.getWallObjectTag(var0, var2, var3); // L: 1126
						if (0L != var26) { // L: 1127
							var25 = class91.getObjectDefinition(SecureRandomFuture.Entity_unpackID(var26)).int2;
						}

						if (var11 == -1 && var10.transforms == null) { // L: 1129
							var28 = var10.getModel(4, var5, var18, var20, var19, var21);
						} else {
							var28 = new DynamicObject(var4, 4, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1130
						}

						var8.newDecorativeObject(var0, var2, var3, var19, (Renderable)var28, (Renderable)null, Tiles.field1036[var5], 0, var25 * Tiles.field1038[var5], var25 * Tiles.field1033[var5], var22, var24); // L: 1131
					} else if (var6 == 6) { // L: 1134
						var25 = 8; // L: 1135
						var26 = var8.getWallObjectTag(var0, var2, var3); // L: 1136
						if (0L != var26) { // L: 1137
							var25 = class91.getObjectDefinition(SecureRandomFuture.Entity_unpackID(var26)).int2 / 2;
						}

						if (var11 == -1 && var10.transforms == null) { // L: 1139
							var28 = var10.getModel(4, var5 + 4, var18, var20, var19, var21);
						} else {
							var28 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1140
						}

						var8.newDecorativeObject(var0, var2, var3, var19, (Renderable)var28, (Renderable)null, 256, var5, var25 * Tiles.field1040[var5], var25 * Tiles.field1042[var5], var22, var24); // L: 1141
					} else if (var6 == 7) { // L: 1144
						int var31 = var5 + 2 & 3; // L: 1146
						if (var11 == -1 && var10.transforms == null) { // L: 1147
							var32 = var10.getModel(4, var31 + 4, var18, var20, var19, var21);
						} else {
							var32 = new DynamicObject(var4, 4, var31 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1148
						}

						var8.newDecorativeObject(var0, var2, var3, var19, (Renderable)var32, (Renderable)null, 256, var31, 0, 0, var22, var24); // L: 1149
					} else if (var6 == 8) { // L: 1152
						var25 = 8; // L: 1153
						var26 = var8.getWallObjectTag(var0, var2, var3); // L: 1154
						if (0L != var26) { // L: 1155
							var25 = class91.getObjectDefinition(SecureRandomFuture.Entity_unpackID(var26)).int2 / 2;
						}

						int var30 = var5 + 2 & 3; // L: 1158
						Object var29;
						if (var11 == -1 && var10.transforms == null) { // L: 1159
							var28 = var10.getModel(4, var5 + 4, var18, var20, var19, var21); // L: 1160
							var29 = var10.getModel(4, var30 + 4, var18, var20, var19, var21); // L: 1161
						} else {
							var28 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1164
							var29 = new DynamicObject(var4, 4, var30 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1165
						}

						var8.newDecorativeObject(var0, var2, var3, var19, (Renderable)var28, (Renderable)var29, 256, var5, var25 * Tiles.field1040[var5], var25 * Tiles.field1042[var5], var22, var24); // L: 1167
					}
				}
			}
		} else {
			if (var11 == -1 && var10.transforms == null) { // L: 1055
				var32 = var10.getModel(10, var5, var18, var20, var19, var21);
			} else {
				var32 = new DynamicObject(var4, 10, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null); // L: 1056
			}

			if (var32 != null) { // L: 1057
				var8.method4716(var0, var2, var3, var19, var12, var13, (Renderable)var32, var6 == 11 ? 256 : 0, var22, var24);
			}

			if (var10.interactType != 0) { // L: 1058
				var9.addGameObject(var2, var3, var12, var13, var10.boolean1);
			}

		}
	} // L: 1051 1059 1067 1075 1083 1099 1107 1115 1122 1132 1142 1150 1168 1170

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-1742769560"
	)
	static final void method2335(int var0, int var1, boolean var2) {
		if (!var2 || var0 != class94.field1150 || class365.field3943 != var1) { // L: 5997
			class94.field1150 = var0; // L: 6000
			class365.field3943 = var1; // L: 6001
			DefaultsGroup.method8263(25); // L: 6002
			class427.drawLoadingMessage("Loading - please wait.", true); // L: 6003
			int var3 = class20.baseX * 64; // L: 6004
			int var4 = class19.baseY * 64; // L: 6005
			class20.baseX = (var0 - 6) * 8; // L: 6006
			class19.baseY = (var1 - 6) * 8; // L: 6007
			int var5 = class20.baseX * 64 - var3; // L: 6008
			int var6 = class19.baseY * 64 - var4; // L: 6009
			var3 = class20.baseX * 64; // L: 6010
			var4 = class19.baseY * 64; // L: 6011

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 65536; ++var7) { // L: 6012
				NPC var19 = Client.npcs[var7]; // L: 6013
				if (var19 != null) { // L: 6014
					for (var9 = 0; var9 < 10; ++var9) { // L: 6015
						var10000 = var19.pathX; // L: 6016
						var10000[var9] -= var5;
						var10000 = var19.pathY; // L: 6017
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128; // L: 6019
					var19.y -= var6 * 128; // L: 6020
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 6023
				Player var22 = Client.players[var7]; // L: 6024
				if (var22 != null) { // L: 6025
					for (var9 = 0; var9 < 10; ++var9) { // L: 6026
						var10000 = var22.pathX; // L: 6027
						var10000[var9] -= var5;
						var10000 = var22.pathY; // L: 6028
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128; // L: 6030
					var22.y -= var6 * 128; // L: 6031
				}
			}

			byte var20 = 0; // L: 6034
			byte var8 = 104; // L: 6035
			byte var21 = 1; // L: 6036
			if (var5 < 0) { // L: 6037
				var20 = 103; // L: 6038
				var8 = -1; // L: 6039
				var21 = -1; // L: 6040
			}

			byte var10 = 0; // L: 6042
			byte var11 = 104; // L: 6043
			byte var12 = 1; // L: 6044
			if (var6 < 0) { // L: 6045
				var10 = 103; // L: 6046
				var11 = -1; // L: 6047
				var12 = -1; // L: 6048
			}

			int var14;
			for (int var13 = var20; var8 != var13; var13 += var21) { // L: 6050
				for (var14 = var10; var14 != var11; var14 += var12) { // L: 6051
					int var15 = var5 + var13; // L: 6052
					int var16 = var6 + var14; // L: 6053

					for (int var17 = 0; var17 < 4; ++var17) { // L: 6054
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) { // L: 6055
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
						} else {
							Client.groundItems[var17][var13][var14] = null; // L: 6056
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 6060 6061 6065
				var18.x -= var5; // L: 6062
				var18.y -= var6; // L: 6063
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) { // L: 6064
					var18.remove();
				}
			}

			if (Client.destinationX != 0) { // L: 6067
				Client.destinationX -= var5; // L: 6068
				Client.destinationY -= var6; // L: 6069
			}

			Client.soundEffectCount = 0; // L: 6071
			Client.isCameraLocked = false; // L: 6072
			Client.cameraX -= var5 << 7; // L: 6073
			WorldMapArea.cameraZ -= var6 << 7; // L: 6074
			ChatChannel.oculusOrbFocalPointX -= var5 << 7; // L: 6075
			AbstractWorldMapData.oculusOrbFocalPointY -= var6 << 7; // L: 6076
			Client.field763 = -1; // L: 6077
			Client.graphicsObjects.clear(); // L: 6078
			Client.projectiles.clear(); // L: 6079

			for (var14 = 0; var14 < 4; ++var14) { // L: 6080
				Client.collisionMaps[var14].clear();
			}

		}
	} // L: 5998 6081

	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I)I",
		garbageValue = "-1186602538"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get((long)var0.childIndex + ((long)var0.id << 32)); // L: 12687
		return var1 != null ? var1.integer : var0.flags; // L: 12688 12689
	}
}
