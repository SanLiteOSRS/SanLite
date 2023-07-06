import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ik")
public class class213 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	static final class213 field2377;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	static final class213 field2376;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public static final class213 field2367;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	static final class213 field2370;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	static final class213 field2371;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	static final class213 field2372;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	static final class213 field2373;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lik;"
	)
	static final class213[] field2368;
	@ObfuscatedName("iu")
	@ObfuscatedGetter(
		intValue = 263986803
	)
	@Export("baseX")
	static int baseX;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1423619973
	)
	final int field2374;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1861818857
	)
	public final int field2375;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 420608925
	)
	public final int field2369;

	static {
		field2377 = new class213(5, 8, 8); // L: 8
		field2376 = new class213(1, 16, 16); // L: 9
		field2367 = new class213(6, 32, 32); // L: 10
		field2370 = new class213(0, 48, 48); // L: 11
		field2371 = new class213(4, 64, 64); // L: 12
		field2372 = new class213(3, 96, 96); // L: 13
		field2373 = new class213(2, 128, 128); // L: 14
		field2368 = class126.method2956(); // L: 18
		Arrays.sort(field2368, new class218()); // L: 21
	} // L: 22

	class213(int var1, int var2, int var3) {
		this.field2374 = var1; // L: 29
		this.field2375 = var2; // L: 30
		this.field2369 = var3; // L: 31
	} // L: 32

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-893955126"
	)
	int method4207() {
		return this.field2375 * this.field2369; // L: 35
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "-80"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length(); // L: 136
		int var2 = 0; // L: 137

		for (int var3 = 0; var3 < var1; ++var3) { // L: 138
			var2 = (var2 << 5) - var2 + WorldMapArea.charToByteCp1252(var0.charAt(var3));
		}

		return var2; // L: 139
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-1090149153"
	)
	static int method4210(int var0, Script var1, boolean var2) {
		Widget var3 = FriendSystem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1632
		if (var0 == ScriptOpcodes.IF_GETX) { // L: 1633
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x; // L: 1634
			return 1; // L: 1635
		} else if (var0 == ScriptOpcodes.IF_GETY) { // L: 1637
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y; // L: 1638
			return 1; // L: 1639
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) { // L: 1641
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width; // L: 1642
			return 1; // L: 1643
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) { // L: 1645
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height; // L: 1646
			return 1; // L: 1647
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) { // L: 1649
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1650
			return 1; // L: 1651
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) { // L: 1653
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId; // L: 1654
			return 1; // L: 1655
		} else {
			return 2; // L: 1657
		}
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Llj;I)V",
		garbageValue = "1609784587"
	)
	static final void method4211(class294 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 8002
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		if (class294.field3207 == var0) { // L: 8003
			var2 = var1.method8942(); // L: 8004
			var3 = (var2 >> 4 & 7) + WorldMapIcon_0.field2950; // L: 8005
			var4 = (var2 & 7) + Archive.field4231; // L: 8006
			var5 = var1.method8943(); // L: 8007
			var6 = var5 >> 4 & 15; // L: 8008
			var7 = var5 & 7; // L: 8009
			var8 = var1.method8950(); // L: 8010
			var9 = var1.method8941(); // L: 8011
			if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 8012
				var10 = var6 + 1; // L: 8013
				if (Projectile.localPlayer.pathX[0] >= var3 - var10 && Projectile.localPlayer.pathX[0] <= var3 + var10 && Projectile.localPlayer.pathY[0] >= var4 - var10 && Projectile.localPlayer.pathY[0] <= var10 + var4 && class10.clientPreferences.method2450() != 0 && var7 > 0 && Client.soundEffectCount < 50) { // L: 8014 8015
					Client.soundEffectIds[Client.soundEffectCount] = var8; // L: 8016
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var7; // L: 8017
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = var9; // L: 8018
					Client.soundEffects[Client.soundEffectCount] = null; // L: 8019
					Client.soundLocations[Client.soundEffectCount] = var6 + (var4 << 8) + (var3 << 16); // L: 8020
					++Client.soundEffectCount; // L: 8021
				}
			}
		}

		int var11;
		int var13;
		int var14;
		byte var36;
		if (class294.field3201 == var0) { // L: 8026
			var2 = var1.method8952(); // L: 8027
			var36 = var1.method8971(); // L: 8028
			byte var38 = var1.readByte(); // L: 8029
			byte var39 = var1.method8971(); // L: 8030
			var6 = var1.method9030(); // L: 8031
			var7 = var1.method8943(); // L: 8032
			var8 = var7 >> 2; // L: 8033
			var9 = var7 & 3; // L: 8034
			var10 = Client.field570[var8]; // L: 8035
			var11 = var1.method8950(); // L: 8036
			byte var12 = var1.method9022(); // L: 8037
			var13 = var1.method8943(); // L: 8038
			var14 = (var13 >> 4 & 7) + WorldMapIcon_0.field2950; // L: 8039
			int var15 = (var13 & 7) + Archive.field4231; // L: 8040
			int var16 = var1.readUnsignedShort(); // L: 8041
			Player var17;
			if (var16 == Client.localPlayerIndex) { // L: 8043
				var17 = Projectile.localPlayer;
			} else {
				var17 = Client.players[var16]; // L: 8044
			}

			if (var17 != null) { // L: 8045
				ObjectComposition var18 = class175.getObjectDefinition(var6); // L: 8046
				int var19;
				int var20;
				if (var9 != 1 && var9 != 3) { // L: 8049
					var19 = var18.sizeX; // L: 8054
					var20 = var18.sizeY; // L: 8055
				} else {
					var19 = var18.sizeY; // L: 8050
					var20 = var18.sizeX; // L: 8051
				}

				int var21 = var14 + (var19 >> 1); // L: 8057
				int var22 = var14 + (var19 + 1 >> 1); // L: 8058
				int var23 = var15 + (var20 >> 1); // L: 8059
				int var24 = var15 + (var20 + 1 >> 1); // L: 8060
				int[][] var25 = Tiles.Tiles_heights[Clock.Client_plane]; // L: 8061
				int var26 = var25[var22][var24] + var25[var22][var23] + var25[var21][var23] + var25[var21][var24] >> 2; // L: 8062
				int var27 = (var14 << 7) + (var19 << 6); // L: 8063
				int var28 = (var15 << 7) + (var20 << 6); // L: 8064
				Model var29 = var18.getModel(var8, var9, var25, var27, var26, var28); // L: 8065
				if (var29 != null) { // L: 8066
					WallObject.method5026(Clock.Client_plane, var14, var15, var10, -1, 0, 0, 31, var2 + 1, var11 + 1); // L: 8067
					var17.animationCycleStart = var2 + Client.cycle; // L: 8068
					var17.animationCycleEnd = var11 + Client.cycle; // L: 8069
					var17.model0 = var29; // L: 8070
					var17.field1107 = var14 * 128 + var19 * 64; // L: 8071
					var17.field1122 = var15 * 128 + var20 * 64; // L: 8072
					var17.tileHeight2 = var26; // L: 8073
					byte var30;
					if (var39 > var36) { // L: 8074
						var30 = var39; // L: 8075
						var39 = var36; // L: 8076
						var36 = var30; // L: 8077
					}

					if (var38 > var12) { // L: 8079
						var30 = var38; // L: 8080
						var38 = var12; // L: 8081
						var12 = var30; // L: 8082
					}

					var17.minX = var39 + var14; // L: 8084
					var17.maxX = var14 + var36; // L: 8085
					var17.minY = var15 + var38; // L: 8086
					var17.maxY = var12 + var15; // L: 8087
				}
			}
		}

		if (class294.field3205 == var0) { // L: 8091
			var2 = var1.method8943(); // L: 8092
			var3 = var1.readUnsignedByte(); // L: 8093
			var4 = var3 >> 2; // L: 8094
			var5 = var3 & 3; // L: 8095
			var6 = Client.field570[var4]; // L: 8096
			var7 = var1.method8952(); // L: 8097
			var8 = var1.readUnsignedByte(); // L: 8098
			var9 = (var8 >> 4 & 7) + WorldMapIcon_0.field2950; // L: 8099
			var10 = (var8 & 7) + Archive.field4231; // L: 8100
			if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) { // L: 8101
				WallObject.method5026(Clock.Client_plane, var9, var10, var6, var7, var4, var5, var2, 0, -1); // L: 8102
			}

		} else if (class294.field3203 == var0) { // L: 8106
			var2 = var1.method9030(); // L: 8107
			var3 = var1.method8942(); // L: 8108
			var4 = (var3 >> 4 & 7) + WorldMapIcon_0.field2950; // L: 8109
			var5 = (var3 & 7) + Archive.field4231; // L: 8110
			var6 = var1.method8941(); // L: 8111
			var7 = var6 >> 2; // L: 8112
			var8 = var6 & 3; // L: 8113
			var9 = Client.field570[var7]; // L: 8114
			if (var4 >= 0 && var5 >= 0 && var4 < 103 && var5 < 103) { // L: 8115
				if (var9 == 0) { // L: 8116
					WallObject var35 = class36.scene.method4534(Clock.Client_plane, var4, var5); // L: 8117
					if (var35 != null) { // L: 8118
						var11 = class215.Entity_unpackID(var35.tag); // L: 8119
						if (var7 == 2) { // L: 8120
							var35.renderable1 = new DynamicObject(var11, 2, var8 + 4, Clock.Client_plane, var4, var5, var2, false, var35.renderable1); // L: 8121
							var35.renderable2 = new DynamicObject(var11, 2, var8 + 1 & 3, Clock.Client_plane, var4, var5, var2, false, var35.renderable2); // L: 8122
						} else {
							var35.renderable1 = new DynamicObject(var11, var7, var8, Clock.Client_plane, var4, var5, var2, false, var35.renderable1); // L: 8124
						}

						return; // L: 8125
					}
				}

				if (var9 == 1) { // L: 8128
					DecorativeObject var43 = class36.scene.method4535(Clock.Client_plane, var4, var5); // L: 8129
					if (var43 != null) { // L: 8130
						var11 = class215.Entity_unpackID(var43.tag); // L: 8131
						if (var7 != 4 && var7 != 5) { // L: 8132
							if (var7 == 6) { // L: 8133
								var43.renderable1 = new DynamicObject(var11, 4, var8 + 4, Clock.Client_plane, var4, var5, var2, false, var43.renderable1);
							} else if (var7 == 7) { // L: 8134
								var43.renderable1 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, Clock.Client_plane, var4, var5, var2, false, var43.renderable1);
							} else if (var7 == 8) { // L: 8135
								var43.renderable1 = new DynamicObject(var11, 4, var8 + 4, Clock.Client_plane, var4, var5, var2, false, var43.renderable1); // L: 8136
								var43.renderable2 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, Clock.Client_plane, var4, var5, var2, false, var43.renderable2); // L: 8137
							}
						} else {
							var43.renderable1 = new DynamicObject(var11, 4, var8, Clock.Client_plane, var4, var5, var2, false, var43.renderable1);
						}

						return; // L: 8139
					}
				}

				if (var9 == 2) { // L: 8142
					GameObject var44 = class36.scene.getGameObject(Clock.Client_plane, var4, var5); // L: 8143
					if (var7 == 11) { // L: 8144
						var7 = 10;
					}

					if (var44 != null) { // L: 8145
						var44.renderable = new DynamicObject(class215.Entity_unpackID(var44.tag), var7, var8, Clock.Client_plane, var4, var5, var2, false, var44.renderable); // L: 8146
						return; // L: 8147
					}
				}

				if (var9 == 3) { // L: 8150
					GroundObject var45 = class36.scene.getGroundObject(Clock.Client_plane, var4, var5); // L: 8151
					if (var45 != null) { // L: 8152
						var45.renderable = new DynamicObject(class215.Entity_unpackID(var45.tag), 22, var8, Clock.Client_plane, var4, var5, var2, false, var45.renderable); // L: 8153
						return; // L: 8154
					}
				}

				Message.method1172(Clock.Client_plane, var4, var5, var9, var2); // L: 8157
			}

		} else if (class294.field3202 == var0) { // L: 8161
			var2 = var1.readUnsignedByte(); // L: 8162
			var3 = (var2 >> 4 & 7) + WorldMapIcon_0.field2950; // L: 8163
			var4 = (var2 & 7) + Archive.field4231; // L: 8164
			var5 = var1.method8941(); // L: 8165
			var6 = var5 >> 2; // L: 8166
			var7 = var5 & 3; // L: 8167
			var8 = Client.field570[var6]; // L: 8168
			if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 8169
				WallObject.method5026(Clock.Client_plane, var3, var4, var8, -1, var6, var7, 31, 0, -1); // L: 8170
			}

		} else {
			NodeDeque var34;
			TileItem var41;
			if (class294.field3206 == var0) { // L: 8174
				var2 = var1.readUnsignedShort(); // L: 8175
				var3 = var1.method8943(); // L: 8176
				var4 = var1.method8941(); // L: 8177
				var5 = (var4 >> 4 & 7) + WorldMapIcon_0.field2950; // L: 8178
				var6 = (var4 & 7) + Archive.field4231; // L: 8179
				if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) { // L: 8180
					var34 = Client.groundItems[Clock.Client_plane][var5][var6]; // L: 8181
					if (var34 != null) { // L: 8182
						for (var41 = (TileItem)var34.last(); var41 != null; var41 = (TileItem)var34.previous()) { // L: 8183 8184 8189
							if ((var2 & 32767) == var41.id) { // L: 8185
								var41.method2651(var3); // L: 8186
								break;
							}
						}
					}
				}

			} else if (class294.field3208 == var0) { // L: 8195
				var2 = var1.readInt(); // L: 8196
				var3 = var1.readUnsignedByte(); // L: 8197
				var4 = (var3 >> 4 & 7) + WorldMapIcon_0.field2950; // L: 8198
				var5 = (var3 & 7) + Archive.field4231; // L: 8199
				var6 = var1.method8950(); // L: 8200
				if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 8201
					var34 = Client.groundItems[Clock.Client_plane][var4][var5]; // L: 8202
					if (var34 != null) { // L: 8203
						for (var41 = (TileItem)var34.last(); var41 != null; var41 = (TileItem)var34.previous()) { // L: 8204 8205 8210
							if ((var6 & 32767) == var41.id && var2 == var41.quantity) { // L: 8206
								var41.remove(); // L: 8207
								break;
							}
						}

						if (var34.last() == null) { // L: 8212
							Client.groundItems[Clock.Client_plane][var4][var5] = null;
						}

						class128.updateItemPile(var4, var5); // L: 8213
					}
				}

			} else if (class294.field3198 == var0) { // L: 8218
				byte var37 = var1.readByte(); // L: 8219
				var36 = var1.method9022(); // L: 8220
				var4 = var1.method8942(); // L: 8221
				var5 = var1.readUnsignedByte() * 4; // L: 8222
				var6 = var1.method9030(); // L: 8223
				var7 = var1.method8943() * 4; // L: 8224
				var8 = var1.method9030(); // L: 8225
				var9 = var1.method8959(); // L: 8226
				var10 = var1.method8943(); // L: 8227
				var11 = (var10 >> 4 & 7) + WorldMapIcon_0.field2950; // L: 8228
				int var40 = (var10 & 7) + Archive.field4231; // L: 8229
				var13 = var1.method8952(); // L: 8230
				var14 = var1.method8943(); // L: 8231
				var2 = var37 + var11; // L: 8232
				var3 = var36 + var40; // L: 8233
				if (var11 >= 0 && var40 >= 0 && var11 < 104 && var40 < 104 && var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104 && var6 != 65535) { // L: 8234
					var11 = var11 * 128 + 64; // L: 8235
					var40 = var40 * 128 + 64; // L: 8236
					var2 = var2 * 128 + 64; // L: 8237
					var3 = var3 * 128 + 64; // L: 8238
					Projectile var33 = new Projectile(var6, Clock.Client_plane, var11, var40, Renderable.getTileHeight(var11, var40, Clock.Client_plane) - var5, var13 + Client.cycle, var8 + Client.cycle, var14, var4, var9, var7); // L: 8239
					var33.setDestination(var2, var3, Renderable.getTileHeight(var2, var3, Clock.Client_plane) - var7, var13 + Client.cycle); // L: 8240
					Client.projectiles.addFirst(var33); // L: 8241
				}

			} else if (class294.field3199 != var0) { // L: 8245
				if (class294.field3200 == var0) { // L: 8268
					var2 = var1.readUnsignedByte(); // L: 8269
					var3 = (var2 >> 4 & 7) + WorldMapIcon_0.field2950; // L: 8270
					var4 = (var2 & 7) + Archive.field4231; // L: 8271
					var5 = var1.method8950(); // L: 8272
					var6 = var1.method8943(); // L: 8273
					var7 = var1.readUnsignedShort(); // L: 8274
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 8275
						var3 = var3 * 128 + 64; // L: 8276
						var4 = var4 * 128 + 64; // L: 8277
						GraphicsObject var42 = new GraphicsObject(var7, Clock.Client_plane, var3, var4, Renderable.getTileHeight(var3, var4, Clock.Client_plane) - var6, var5, Client.cycle); // L: 8278
						Client.graphicsObjects.addFirst(var42); // L: 8279
					}

				} else if (class294.field3204 == var0) { // L: 8283
					var2 = var1.method8942(); // L: 8284
					var3 = (var2 >> 4 & 7) + WorldMapIcon_0.field2950; // L: 8285
					var4 = (var2 & 7) + Archive.field4231; // L: 8286
					var1.method8942(); // L: 8287
					var5 = var1.method8964(); // L: 8288
					var1.method8950(); // L: 8289
					var6 = var1.method8952(); // L: 8290
					var1.method8941(); // L: 8291
					var1.method8950(); // L: 8292
					var7 = var1.readUnsignedByte(); // L: 8293
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 8294
						var41 = new TileItem(); // L: 8295
						var41.id = var6; // L: 8296
						var41.quantity = var5; // L: 8297
						var41.method2651(var7); // L: 8298
						if (Client.groundItems[Clock.Client_plane][var3][var4] == null) { // L: 8299
							Client.groundItems[Clock.Client_plane][var3][var4] = new NodeDeque(); // L: 8300
						}

						Client.groundItems[Clock.Client_plane][var3][var4].addFirst(var41); // L: 8302
						class128.updateItemPile(var3, var4); // L: 8303
					}

				}
			} else {
				var2 = var1.method8941(); // L: 8246
				var3 = (var2 >> 4 & 7) + WorldMapIcon_0.field2950; // L: 8247
				var4 = (var2 & 7) + Archive.field4231; // L: 8248
				var5 = var1.method8964(); // L: 8249
				var6 = var1.method8950(); // L: 8250
				var7 = var1.readInt(); // L: 8251
				if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 8252
					NodeDeque var31 = Client.groundItems[Clock.Client_plane][var3][var4]; // L: 8253
					if (var31 != null) { // L: 8254
						for (TileItem var32 = (TileItem)var31.last(); var32 != null; var32 = (TileItem)var31.previous()) { // L: 8255 8256 8261
							if ((var6 & 32767) == var32.id && var5 == var32.quantity) { // L: 8257
								var32.quantity = var7; // L: 8258
								break;
							}
						}

						class128.updateItemPile(var3, var4); // L: 8263
					}
				}

			}
		}
	} // L: 8104 8159 8172 8193 8216 8243 8266 8281 8305 8307

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "([Lmb;II)V",
		garbageValue = "-913429608"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 12135
			Widget var3 = var0[var2]; // L: 12136
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !UserComparator9.isComponentHidden(var3))) { // L: 12137 12138 12139
				int var5;
				if (var3.type == 0) { // L: 12140
					if (!var3.isIf3 && UserComparator9.isComponentHidden(var3) && var3 != ClanChannel.mousedOverWidgetIf1) { // L: 12141
						continue;
					}

					drawModelComponents(var0, var3.id); // L: 12142
					if (var3.children != null) { // L: 12143
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 12144
					if (var4 != null) { // L: 12145
						var5 = var4.group; // L: 12146
						if (Client.loadInterface(var5)) { // L: 12148
							drawModelComponents(class16.Widget_interfaceComponents[var5], -1); // L: 12149
						}
					}
				}

				if (var3.type == 6) { // L: 12153
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) { // L: 12154
						boolean var8 = ItemComposition.runCs1(var3); // L: 12155
						if (var8) { // L: 12157
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId; // L: 12158
						}

						if (var5 != -1) { // L: 12159
							SequenceDefinition var6 = WorldMapLabelSize.SequenceDefinition_get(var5); // L: 12160
							if (!var6.isCachedModelIdSet()) { // L: 12161
								for (var3.modelFrameCycle += Client.field733; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; Messages.invalidateWidget(var3)) { // L: 12162 12163 12170
									var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame]; // L: 12164
									++var3.modelFrame; // L: 12165
									if (var3.modelFrame >= var6.frameIds.length) { // L: 12166
										var3.modelFrame -= var6.frameCount; // L: 12167
										if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) { // L: 12168
											var3.modelFrame = 0;
										}
									}
								}
							} else {
								var3.modelFrame += Client.field733; // L: 12174
								int var7 = var6.method4084(); // L: 12175
								if (var3.modelFrame >= var7) { // L: 12176
									var3.modelFrame -= var6.frameCount; // L: 12177
									if (var3.modelFrame < 0 || var3.modelFrame >= var7) { // L: 12178
										var3.modelFrame = 0;
									}
								}

								Messages.invalidateWidget(var3); // L: 12180
							}
						}
					}

					if (var3.field3659 != 0 && !var3.isIf3) { // L: 12184
						int var9 = var3.field3659 >> 16; // L: 12185
						var5 = var3.field3659 << 16 >> 16; // L: 12186
						var9 *= Client.field733; // L: 12187
						var5 *= Client.field733; // L: 12188
						var3.modelAngleX = var9 + var3.modelAngleX & 2047; // L: 12189
						var3.modelAngleY = var5 + var3.modelAngleY & 2047; // L: 12190
						Messages.invalidateWidget(var3); // L: 12191
					}
				}
			}
		}

	} // L: 12195
}
