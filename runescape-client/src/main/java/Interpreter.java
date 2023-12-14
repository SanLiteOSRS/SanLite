import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("ao")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("ab")
	static short[][][] field833;
	@ObfuscatedName("au")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("aa")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("ac")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("az")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1870568525
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Lcs;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("aq")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("ai")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("ae")
	static boolean field846;
	@ObfuscatedName("an")
	static boolean field842;
	@ObfuscatedName("ag")
	static ArrayList field847;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1157651787
	)
	static int field849;
	@ObfuscatedName("bl")
	static final double field852;
	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;

	static {
		Interpreter_arrayLengths = new int[5];
		Interpreter_arrays = new int[5][5000];
		Interpreter_intStack = new int[1000]; // L: 75
		Interpreter_stringStack = new String[1000];
		Interpreter_frameDepth = 0;
		Interpreter_frames = new ScriptFrame[50];
		Interpreter_calendar = java.util.Calendar.getInstance(); // L: 86
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; // L: 89
		field846 = false;
		field842 = false; // L: 93
		field847 = new ArrayList();
		field849 = 0; // L: 95
		field852 = Math.log(2.0D);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Luo;II)V",
		garbageValue = "593247130"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset; // L: 72
		Players.Players_pendingUpdateCount = 0; // L: 73
		class221.method4304(var0); // L: 74

		for (int var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) { // L: 76
			int var4 = Players.Players_pendingUpdateIndices[var3]; // L: 77
			Player var5 = Client.players[var4]; // L: 78
			int var6 = var0.readUnsignedByte(); // L: 79
			if ((var6 & 128) != 0) { // L: 80
				var6 += var0.readUnsignedByte() << 8;
			}

			if ((var6 & 16384) != 0) { // L: 81
				var6 += var0.readUnsignedByte() << 16;
			}

			byte var7 = class228.field2412.field2414; // L: 83
			if ((var6 & 512) != 0) { // L: 84
				var7 = var0.method9298(); // L: 85
			}

			if ((var6 & 1024) != 0) { // L: 87
				class228[] var8 = Players.field1356; // L: 88
				class228[] var10 = new class228[]{class228.field2409, class228.field2412, class228.field2408, class228.field2410}; // L: 92
				var8[var4] = (class228)class12.findEnumerated(var10, var0.method9297()); // L: 94
			}

			if ((var6 & 4) != 0) { // L: 96
				var5.field1208 = var0.readUnsignedShort(); // L: 97
				if (var5.pathLength == 0) { // L: 98
					var5.orientation = var5.field1208; // L: 99
					var5.method2480(); // L: 100
				}
			}

			if ((var6 & 4096) != 0) { // L: 103
				var5.field1209 = var0.method9297(); // L: 104
				var5.field1194 = var0.method9297(); // L: 105
				var5.field1224 = var0.readByte(); // L: 106
				var5.field1203 = var0.method9297(); // L: 107
				var5.spotAnimation = var0.readUnsignedShort() + Client.cycle; // L: 108
				var5.field1187 = var0.readUnsignedShort() + Client.cycle; // L: 109
				var5.field1229 = var0.readUnsignedShort(); // L: 110
				if (var5.field1122) { // L: 111
					var5.field1209 += var5.tileX; // L: 112
					var5.field1194 += var5.tileY; // L: 113
					var5.field1224 += var5.tileX; // L: 114
					var5.field1203 += var5.tileY; // L: 115
					var5.pathLength = 0; // L: 116
				} else {
					var5.field1209 += var5.pathX[0]; // L: 119
					var5.field1194 += var5.pathY[0]; // L: 120
					var5.field1224 += var5.pathX[0]; // L: 121
					var5.field1203 += var5.pathY[0]; // L: 122
					var5.pathLength = 1; // L: 123
				}

				var5.field1220 = 0; // L: 125
			}

			int var23;
			if ((var6 & 8192) != 0) { // L: 127
				for (var23 = 0; var23 < 3; ++var23) { // L: 128
					var5.actions[var23] = var0.readStringCp1252NullTerminated();
				}
			}

			int var9;
			int var13;
			int var14;
			int var24;
			if ((var6 & 2048) != 0) { // L: 130
				var23 = var0.method9304(); // L: 131
				var9 = var23 >> 8; // L: 132
				var24 = var9 >= 13 && var9 <= 20 ? var9 - 12 : 0; // L: 133
				PlayerType var11 = (PlayerType)class12.findEnumerated(class320.PlayerType_values(), var0.method9496()); // L: 134
				boolean var12 = var0.readUnsignedByte() == 1; // L: 135
				var13 = var0.readUnsignedByte(); // L: 136
				var14 = var0.offset; // L: 137
				if (var5.username != null && var5.appearance != null) { // L: 138
					boolean var15 = false; // L: 139
					if (var11.isUser && class12.friendSystem.isIgnored(var5.username)) { // L: 140 141
						var15 = true;
					}

					if (!var15 && Client.field736 == 0 && !var5.isHidden) { // L: 143
						Players.field1367.offset = 0; // L: 144
						var0.method9321(Players.field1367.array, 0, var13); // L: 145
						Players.field1367.offset = 0; // L: 146
						String var16 = AbstractFont.escapeBrackets(class20.method303(class128.method3076(Players.field1367))); // L: 147
						var5.field1225 = var16.trim(); // L: 148
						var5.field1196 = var23 >> 8; // L: 149
						var5.field1197 = var23 & 255; // L: 150
						var5.field1195 = 150; // L: 151
						byte[] var17 = null; // L: 152
						if (var24 > 0 && var24 <= 8) { // L: 153
							var17 = new byte[var24]; // L: 154

							for (int var18 = 0; var18 < var24; ++var18) { // L: 155
								var17[var18] = var0.readByte(); // L: 156
							}
						}

						byte[] var20 = var17; // L: 161
						int[] var19;
						if (var17 != null && var17.length != 0 && var17.length <= 8) { // L: 163
							int[] var21 = new int[var17.length]; // L: 167
							int var22 = 0;

							while (true) {
								if (var22 >= var20.length) {
									var19 = var21; // L: 175
									break;
								}

								if (var20[var22] < 0 || var20[var22] > class550.field5294.length) { // L: 169
									var19 = null; // L: 170
									break; // L: 171
								}

								var21[var22] = class550.field5294[var20[var22]]; // L: 173
								++var22; // L: 168
							}
						} else {
							var19 = null; // L: 164
						}

						var5.field1236 = var19; // L: 177
						var5.field1206 = var12; // L: 178
						var5.field1174 = var5 != class229.localPlayer && var11.isUser && !Client.field694.isEmpty() && var16.toLowerCase().indexOf(Client.field694) == -1; // L: 179
						int var26;
						if (var11.isPrivileged) { // L: 181
							var26 = var12 ? 91 : 1;
						} else {
							var26 = var12 ? 90 : 2; // L: 182
						}

						if (var11.modIcon != -1) { // L: 183
							GrandExchangeOfferUnitPriceComparator.addGameMessage(var26, FloorUnderlayDefinition.method3799(var11.modIcon) + var5.username.getName(), var16);
						} else {
							GrandExchangeOfferUnitPriceComparator.addGameMessage(var26, var5.username.getName(), var16); // L: 184
						}
					}
				}

				var0.offset = var24 + var13 + var14; // L: 187
			}

			int var28;
			int var32;
			if ((var6 & 65536) != 0) { // L: 189
				var23 = var0.method9295(); // L: 190

				for (var9 = 0; var9 < var23; ++var9) { // L: 191
					var24 = var0.method9294(); // L: 192
					var28 = var0.readUnsignedShort(); // L: 193
					var32 = var0.method9318(); // L: 194
					var5.method2466(var24, var28, var32 >> 16, var32 & 65535); // L: 195
				}
			}

			if ((var6 & 32) != 0) { // L: 198
				var5.field1225 = var0.readStringCp1252NullTerminated(); // L: 199
				if (var5.field1225.charAt(0) == '~') { // L: 200
					var5.field1225 = var5.field1225.substring(1); // L: 201
					GrandExchangeOfferUnitPriceComparator.addGameMessage(2, var5.username.getName(), var5.field1225); // L: 202
				} else if (var5 == class229.localPlayer) { // L: 204
					GrandExchangeOfferUnitPriceComparator.addGameMessage(2, var5.username.getName(), var5.field1225); // L: 205
				}

				var5.field1206 = false; // L: 207
				var5.field1196 = 0; // L: 208
				var5.field1197 = 0; // L: 209
				var5.field1195 = 150; // L: 210
			}

			int var34;
			if ((var6 & 16) != 0) { // L: 212
				var23 = var0.method9496(); // L: 213
				if (var23 > 0) { // L: 214
					for (var9 = 0; var9 < var23; ++var9) { // L: 215
						var28 = -1; // L: 217
						var32 = -1; // L: 218
						var13 = -1; // L: 219
						var24 = var0.readUShortSmart(); // L: 220
						if (var24 == 32767) { // L: 221
							var24 = var0.readUShortSmart(); // L: 222
							var32 = var0.readUShortSmart(); // L: 223
							var28 = var0.readUShortSmart(); // L: 224
							var13 = var0.readUShortSmart(); // L: 225
						} else if (var24 != 32766) { // L: 227
							var32 = var0.readUShortSmart(); // L: 228
						} else {
							var24 = -1; // L: 230
						}

						var14 = var0.readUShortSmart(); // L: 231
						var5.addHitSplat(var24, var32, var28, var13, Client.cycle, var14); // L: 232
					}
				}

				var9 = var0.readUnsignedByte(); // L: 235
				if (var9 > 0) { // L: 236
					for (var24 = 0; var24 < var9; ++var24) { // L: 237
						var28 = var0.readUShortSmart(); // L: 238
						var32 = var0.readUShortSmart(); // L: 239
						if (var32 != 32767) { // L: 240
							var13 = var0.readUShortSmart(); // L: 241
							var14 = var0.method9496(); // L: 242
							var34 = var32 > 0 ? var0.method9295() : var14; // L: 243
							var5.addHealthBar(var28, Client.cycle, var32, var13, var14, var34); // L: 244
						} else {
							var5.removeHealthBar(var28); // L: 246
						}
					}
				}
			}

			if ((var6 & 2) != 0) { // L: 250
				var23 = var0.method9496(); // L: 251
				byte[] var27 = new byte[var23]; // L: 252
				Buffer var31 = new Buffer(var27); // L: 253
				var0.method9375(var27, 0, var23); // L: 254
				Players.field1357[var4] = var31; // L: 255
				var5.read(var31); // L: 256
			}

			if ((var6 & 1) != 0) { // L: 258
				var23 = var0.method9304(); // L: 259
				if (var23 == 65535) { // L: 260
					var23 = -1;
				}

				var9 = var0.method9294(); // L: 261
				WorldMapLabelSize.performPlayerAnimation(var5, var23, var9); // L: 262
			}

			if ((var6 & 64) != 0) { // L: 264
				var5.targetIndex = var0.readUnsignedShort(); // L: 266
				var5.targetIndex += var0.method9295() << 16; // L: 267
				var23 = 16777215; // L: 268
				if (var23 == var5.targetIndex) { // L: 269
					var5.targetIndex = -1; // L: 270
				}
			}

			if ((var6 & 8) != 0) { // L: 273
				var23 = var0.method9302(); // L: 274
				PlayerType var36 = (PlayerType)class12.findEnumerated(class320.PlayerType_values(), var0.method9294()); // L: 275
				boolean var35 = var0.method9496() == 1; // L: 276
				var28 = var0.readUnsignedByte(); // L: 277
				var32 = var0.offset; // L: 278
				if (var5.username != null && var5.appearance != null) { // L: 279
					boolean var33 = false; // L: 280
					if (var36.isUser && class12.friendSystem.isIgnored(var5.username)) { // L: 281 282
						var33 = true;
					}

					if (!var33 && Client.field736 == 0 && !var5.isHidden) { // L: 284
						Players.field1367.offset = 0; // L: 285
						var0.readBytes(Players.field1367.array, 0, var28); // L: 286
						Players.field1367.offset = 0; // L: 287
						String var29 = AbstractFont.escapeBrackets(class20.method303(class128.method3076(Players.field1367))); // L: 288
						var5.field1225 = var29.trim(); // L: 289
						var5.field1196 = var23 >> 8; // L: 290
						var5.field1197 = var23 & 255; // L: 291
						var5.field1195 = 150; // L: 292
						var5.field1236 = null; // L: 293
						var5.field1206 = var35; // L: 294
						var5.field1174 = var5 != class229.localPlayer && var36.isUser && !Client.field694.isEmpty() && var29.toLowerCase().indexOf(Client.field694) == -1; // L: 295
						if (var36.isPrivileged) { // L: 297
							var34 = var35 ? 91 : 1;
						} else {
							var34 = var35 ? 90 : 2; // L: 298
						}

						if (var36.modIcon != -1) { // L: 299
							GrandExchangeOfferUnitPriceComparator.addGameMessage(var34, FloorUnderlayDefinition.method3799(var36.modIcon) + var5.username.getName(), var29);
						} else {
							GrandExchangeOfferUnitPriceComparator.addGameMessage(var34, var5.username.getName(), var29); // L: 300
						}
					}
				}

				var0.offset = var28 + var32; // L: 303
			}

			if ((var6 & 256) != 0) { // L: 305
				var5.field1232 = Client.cycle + var0.method9302(); // L: 306
				var5.field1215 = Client.cycle + var0.method9304(); // L: 307
				var5.field1234 = var0.method9296(); // L: 308
				var5.field1235 = var0.method9297(); // L: 309
				var5.field1171 = var0.method9298(); // L: 310
				var5.field1237 = (byte)var0.method9295(); // L: 311
			}

			if (var5.field1122) { // L: 313
				if (var7 == 127) { // L: 314
					var5.resetPath(var5.tileX, var5.tileY);
				} else {
					class228 var30;
					if (var7 != class228.field2412.field2414) { // L: 317
						class228[] var37 = new class228[]{class228.field2409, class228.field2412, class228.field2408, class228.field2410}; // L: 320
						var30 = (class228)class12.findEnumerated(var37, var7); // L: 322
					} else {
						var30 = Players.field1356[var4]; // L: 324
					}

					var5.method2398(var5.tileX, var5.tileY, var30); // L: 325
				}
			}
		}

		if (var0.offset - var2 != var1) { // L: 332
			throw new RuntimeException(var0.offset - var2 + " " + var1); // L: 333
		}
	} // L: 335

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILkf;Liw;B)V",
		garbageValue = "-60"
	)
	@Export("addObjects")
	static final void addObjects(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) { // L: 376 377 378
			if (var0 < Tiles.Tiles_minPlane) { // L: 381
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = WorldMapSection2.getObjectDefinition(var3); // L: 382
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) { // L: 385
				var9 = var8.sizeX; // L: 390
				var10 = var8.sizeY; // L: 391
			} else {
				var9 = var8.sizeY; // L: 386
				var10 = var8.sizeX; // L: 387
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) { // L: 397
				var11 = (var9 >> 1) + var1; // L: 398
				var12 = (var9 + 1 >> 1) + var1; // L: 399
			} else {
				var11 = var1; // L: 402
				var12 = var1 + 1; // L: 403
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) { // L: 405
				var13 = (var10 >> 1) + var2; // L: 406
				var14 = var2 + (var10 + 1 >> 1); // L: 407
			} else {
				var13 = var2; // L: 410
				var14 = var2 + 1; // L: 411
			}

			int[][] var15 = Tiles.Tiles_heights[var0]; // L: 413
			int var16 = var15[var12][var14] + var15[var11][var13] + var15[var12][var13] + var15[var11][var14] >> 2; // L: 414
			int var17 = (var1 << 7) + (var9 << 6); // L: 415
			int var18 = (var2 << 7) + (var10 << 6); // L: 416
			long var19 = Player.calculateTag(var1, var2, 2, var8.int1 == 0, var3); // L: 417
			int var21 = var5 + (var4 << 6); // L: 418
			if (var8.int3 == 1) { // L: 419
				var21 += 256;
			}

			if (var8.hasSound()) { // L: 420
				UrlRequester.method2900(var0, var1, var2, var8, var4);
			}

			Object var29;
			if (var5 == 22) { // L: 421
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) { // L: 422
					if (var8.animationId == -1 && var8.transforms == null) { // L: 424
						var29 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 425
					}

					var6.newGroundObject(var0, var1, var2, var16, (Renderable)var29, var19, var21); // L: 426
					if (var8.interactType == 1 && var7 != null) { // L: 427
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else {
				int var28;
				if (var5 != 10 && var5 != 11) { // L: 430
					int[] var10000;
					if (var5 >= 12) { // L: 451
						if (var8.animationId == -1 && var8.transforms == null) { // L: 453
							var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 454
						}

						var6.method5334(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 455
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) { // L: 456
							var10000 = class344.field3814[var0][var1];
							var10000[var2] |= 2340;
						}

						if (var8.interactType != 0 && var7 != null) { // L: 457
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

					} else if (var5 == 0) { // L: 460
						if (var8.animationId == -1 && var8.transforms == null) { // L: 462
							var29 = var8.getEntity(0, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 463
						}

						var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1006[var4], 0, var19, var21); // L: 464
						if (var4 == 0) { // L: 465
							if (var8.clipped) { // L: 466
								class93.field1150[var0][var1][var2] = 50; // L: 467
								class93.field1150[var0][var1][var2 + 1] = 50; // L: 468
							}

							if (var8.modelClipped) { // L: 470
								var10000 = class344.field3814[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) { // L: 472
							if (var8.clipped) { // L: 473
								class93.field1150[var0][var1][var2 + 1] = 50; // L: 474
								class93.field1150[var0][var1 + 1][var2 + 1] = 50; // L: 475
							}

							if (var8.modelClipped) { // L: 477
								var10000 = class344.field3814[var0][var1];
								var10000[1 + var2] |= 1170;
							}
						} else if (var4 == 2) { // L: 479
							if (var8.clipped) { // L: 480
								class93.field1150[var0][var1 + 1][var2] = 50; // L: 481
								class93.field1150[var0][var1 + 1][var2 + 1] = 50; // L: 482
							}

							if (var8.modelClipped) { // L: 484
								var10000 = class344.field3814[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) { // L: 486
							if (var8.clipped) { // L: 487
								class93.field1150[var0][var1][var2] = 50; // L: 488
								class93.field1150[var0][var1 + 1][var2] = 50; // L: 489
							}

							if (var8.modelClipped) { // L: 491
								var10000 = class344.field3814[var0][var1];
								var10000[var2] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 493
							var7.method4349(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 494
							var6.method5340(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 1) { // L: 497
						if (var8.animationId == -1 && var8.transforms == null) { // L: 499
							var29 = var8.getEntity(1, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 500
						}

						var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1005[var4], 0, var19, var21); // L: 501
						if (var8.clipped) { // L: 502
							if (var4 == 0) { // L: 503
								class93.field1150[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) { // L: 504
								class93.field1150[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) { // L: 505
								class93.field1150[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) { // L: 506
								class93.field1150[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 508
							var7.method4349(var1, var2, var5, var4, var8.boolean1);
						}

					} else {
						int var22;
						if (var5 == 2) { // L: 511
							var22 = var4 + 1 & 3; // L: 512
							Object var24;
							Object var30;
							if (var8.animationId == -1 && var8.transforms == null) { // L: 515
								var30 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18); // L: 516
								var24 = var8.getEntity(2, var22, var15, var17, var16, var18); // L: 517
							} else {
								var30 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 520
								var24 = new DynamicObject(var3, 2, var22, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 521
							}

							var6.newWallObject(var0, var1, var2, var16, (Renderable)var30, (Renderable)var24, Tiles.field1006[var4], Tiles.field1006[var22], var19, var21); // L: 523
							if (var8.modelClipped) { // L: 524
								if (var4 == 0) { // L: 525
									var10000 = class344.field3814[var0][var1]; // L: 526
									var10000[var2] |= 585;
									var10000 = class344.field3814[var0][var1]; // L: 527
									var10000[var2 + 1] |= 1170;
								} else if (var4 == 1) { // L: 529
									var10000 = class344.field3814[var0][var1]; // L: 530
									var10000[1 + var2] |= 1170;
									var10000 = class344.field3814[var0][var1 + 1]; // L: 531
									var10000[var2] |= 585;
								} else if (var4 == 2) { // L: 533
									var10000 = class344.field3814[var0][var1 + 1]; // L: 534
									var10000[var2] |= 585;
									var10000 = class344.field3814[var0][var1]; // L: 535
									var10000[var2] |= 1170;
								} else if (var4 == 3) { // L: 537
									var10000 = class344.field3814[var0][var1]; // L: 538
									var10000[var2] |= 1170;
									var10000 = class344.field3814[var0][var1]; // L: 539
									var10000[var2] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 542
								var7.method4349(var1, var2, var5, var4, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 543
								var6.method5340(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 3) { // L: 546
							if (var8.animationId == -1 && var8.transforms == null) { // L: 548
								var29 = var8.getEntity(3, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 549
							}

							var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1005[var4], 0, var19, var21); // L: 550
							if (var8.clipped) { // L: 551
								if (var4 == 0) { // L: 552
									class93.field1150[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) { // L: 553
									class93.field1150[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) { // L: 554
									class93.field1150[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) { // L: 555
									class93.field1150[var0][var1][var2] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 557
								var7.method4349(var1, var2, var5, var4, var8.boolean1);
							}

						} else if (var5 == 9) { // L: 560
							if (var8.animationId == -1 && var8.transforms == null) { // L: 562
								var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 563
							}

							var6.method5334(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 564
							if (var8.interactType != 0 && var7 != null) { // L: 565
								var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 566
								var6.method5340(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 4) { // L: 569
							if (var8.animationId == -1 && var8.transforms == null) { // L: 571
								var29 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 572
							}

							var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1006[var4], 0, 0, 0, var19, var21); // L: 573
						} else {
							long var23;
							Object var25;
							if (var5 == 5) { // L: 576
								var22 = 16; // L: 577
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 578
								if (0L != var23) { // L: 579
									var22 = WorldMapSection2.getObjectDefinition(class232.Entity_unpackID(var23)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 581
									var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 582
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field1006[var4], 0, var22 * Tiles.field1010[var4], var22 * Tiles.field1007[var4], var19, var21); // L: 583
							} else if (var5 == 6) { // L: 586
								var22 = 8; // L: 587
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 588
								if (var23 != 0L) { // L: 589
									var22 = WorldMapSection2.getObjectDefinition(class232.Entity_unpackID(var23)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 591
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 592
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var22 * Tiles.field1008[var4], var22 * Tiles.field1009[var4], var19, var21); // L: 593
							} else if (var5 == 7) { // L: 596
								var28 = var4 + 2 & 3; // L: 598
								if (var8.animationId == -1 && var8.transforms == null) { // L: 599
									var29 = var8.getEntity(4, var28 + 4, var15, var17, var16, var18);
								} else {
									var29 = new DynamicObject(var3, 4, var28 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 600
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, 256, var28, 0, 0, var19, var21); // L: 601
							} else if (var5 == 8) { // L: 604
								var22 = 8; // L: 605
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 606
								if (var23 != 0L) { // L: 607
									var22 = WorldMapSection2.getObjectDefinition(class232.Entity_unpackID(var23)).int2 / 2;
								}

								int var27 = var4 + 2 & 3; // L: 610
								Object var26;
								if (var8.animationId == -1 && var8.transforms == null) { // L: 611
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18); // L: 612
									var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18); // L: 613
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 616
									var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 617
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var22 * Tiles.field1008[var4], var22 * Tiles.field1009[var4], var19, var21); // L: 619
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) { // L: 432
						var29 = var8.getEntity(10, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 433
					}

					if (var29 != null && var6.method5334(var0, var1, var2, var16, var9, var10, (Renderable)var29, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) { // L: 434 435
						var28 = 15; // L: 436
						if (var29 instanceof Model) { // L: 437
							var28 = ((Model)var29).method5569() / 4; // L: 438
							if (var28 > 30) { // L: 439
								var28 = 30;
							}
						}

						for (int var31 = 0; var31 <= var9; ++var31) { // L: 441
							for (int var32 = 0; var32 <= var10; ++var32) { // L: 442
								if (var28 > class93.field1150[var0][var31 + var1][var32 + var2]) { // L: 443
									class93.field1150[var0][var31 + var1][var32 + var2] = (byte)var28;
								}
							}
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 448
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				}
			}
		}
	} // L: 428 449 458 495 509 544 558 567 574 584 594 602 620 622
}
