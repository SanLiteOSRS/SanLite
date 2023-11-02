import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("ac")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("al")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1568637397
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("ab")
	static byte[][][] field1045;
	@ObfuscatedName("aa")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("ai")
	static final int[] field1036;
	@ObfuscatedName("ae")
	static final int[] field1037;
	@ObfuscatedName("aw")
	static final int[] field1038;
	@ObfuscatedName("aq")
	static final int[] field1033;
	@ObfuscatedName("az")
	static final int[] field1040;
	@ObfuscatedName("at")
	static final int[] field1042;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 823363237
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 418849099
	)
	@Export("rndLightness")
	static int rndLightness;
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = -1731271633
	)
	static int field1039;

	static {
		Tiles_heights = new int[4][105][105]; // L: 13
		Tiles_renderFlags = new byte[4][104][104]; // L: 14
		Tiles_minPlane = 99; // L: 15
		field1036 = new int[]{1, 2, 4, 8}; // L: 31
		field1037 = new int[]{16, 32, 64, 128}; // L: 32
		field1038 = new int[]{1, 0, -1, 0}; // L: 33
		field1033 = new int[]{0, -1, 0, 1}; // L: 34
		field1040 = new int[]{1, -1, -1, 1}; // L: 35
		field1042 = new int[]{-1, -1, 1, 1}; // L: 36
		rndHue = (int)(Math.random() * 17.0D) - 8;
		rndLightness = (int)(Math.random() * 33.0D) - 16;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-1109073895"
	)
	static void method2281(Component var0) {
		var0.addMouseListener(MouseHandler.MouseHandler_instance); // L: 37
		var0.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 38
		var0.addFocusListener(MouseHandler.MouseHandler_instance); // L: 39
	} // L: 40

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luy;II)V",
		garbageValue = "90907201"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset; // L: 72
		Players.Players_pendingUpdateCount = 0; // L: 73
		GrandExchangeOfferTotalQuantityComparator.method7048(var0); // L: 74

		for (int var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) { // L: 76
			int var4 = Players.Players_pendingUpdateIndices[var3]; // L: 77
			Player var5 = Client.players[var4]; // L: 78
			int var6 = var0.readUnsignedByte(); // L: 79
			if ((var6 & 1) != 0) { // L: 80
				var6 += var0.readUnsignedByte() << 8;
			}

			if ((var6 & 4096) != 0) { // L: 81
				var6 += var0.readUnsignedByte() << 16;
			}

			byte var7 = class231.field2429.field2430; // L: 83
			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var13;
			int var15;
			int var27;
			if ((var6 & 128) != 0) { // L: 84
				var8 = var0.method9236(); // L: 85
				if (var8 > 0) { // L: 86
					for (var9 = 0; var9 < var8; ++var9) { // L: 87
						var11 = -1; // L: 89
						var12 = -1; // L: 90
						var13 = -1; // L: 91
						var10 = var0.readUShortSmart(); // L: 92
						if (var10 == 32767) { // L: 93
							var10 = var0.readUShortSmart(); // L: 94
							var12 = var0.readUShortSmart(); // L: 95
							var11 = var0.readUShortSmart(); // L: 96
							var13 = var0.readUShortSmart(); // L: 97
						} else if (var10 != 32766) { // L: 99
							var12 = var0.readUShortSmart(); // L: 100
						} else {
							var10 = -1; // L: 102
						}

						var27 = var0.readUShortSmart(); // L: 103
						var5.addHitSplat(var10, var12, var11, var13, Client.cycle, var27); // L: 104
					}
				}

				var9 = var0.readUnsignedByte(); // L: 107
				if (var9 > 0) { // L: 108
					for (var10 = 0; var10 < var9; ++var10) { // L: 109
						var11 = var0.readUShortSmart(); // L: 110
						var12 = var0.readUShortSmart(); // L: 111
						if (var12 != 32767) { // L: 112
							var13 = var0.readUShortSmart(); // L: 113
							var27 = var0.readUnsignedByte(); // L: 114
							var15 = var12 > 0 ? var0.method9237() : var27; // L: 115
							var5.addHealthBar(var11, Client.cycle, var12, var13, var27, var15); // L: 116
						} else {
							var5.removeHealthBar(var11); // L: 118
						}
					}
				}
			}

			if ((var6 & 65536) != 0) { // L: 122
				var8 = var0.method9236(); // L: 123

				for (var9 = 0; var9 < var8; ++var9) { // L: 124
					var10 = var0.readUnsignedByte(); // L: 125
					var11 = var0.method9245(); // L: 126
					var12 = var0.method9259(); // L: 127
					var5.method2426(var10, var11, var12 >> 16, var12 & 65535); // L: 128
				}
			}

			if ((var6 & 16) != 0) { // L: 131
				var5.targetIndex = var0.method9184(); // L: 133
				var5.targetIndex += var0.method9237() << 16; // L: 134
				var8 = 16777215; // L: 135
				if (var8 == var5.targetIndex) { // L: 136
					var5.targetIndex = -1; // L: 137
				}
			}

			if ((var6 & 1024) != 0) { // L: 140
				class231[] var23 = Players.field1370; // L: 141
				class231[] var24 = new class231[]{class231.field2426, class231.field2429, class231.field2428, class231.field2427}; // L: 145
				var23[var4] = (class231)SequenceDefinition.findEnumerated(var24, var0.readByte()); // L: 147
			}

			if ((var6 & 256) != 0) { // L: 149
				var5.field1247 = Client.cycle + var0.method9245(); // L: 150
				var5.field1248 = Client.cycle + var0.method9184(); // L: 151
				var5.field1249 = var0.method9240(); // L: 152
				var5.field1250 = var0.method9239(); // L: 153
				var5.field1251 = var0.method9241(); // L: 154
				var5.field1252 = (byte)var0.method9237(); // L: 155
			}

			if ((var6 & 2) != 0) { // L: 157
				var5.overheadText = var0.readStringCp1252NullTerminated(); // L: 158
				if (var5.overheadText.charAt(0) == '~') { // L: 159
					var5.overheadText = var5.overheadText.substring(1); // L: 160
					class411.addGameMessage(2, var5.username.getName(), var5.overheadText); // L: 161
				} else if (var5 == TextureProvider.localPlayer) { // L: 163
					class411.addGameMessage(2, var5.username.getName(), var5.overheadText); // L: 164
				}

				var5.isAutoChatting = false; // L: 166
				var5.overheadTextColor = 0; // L: 167
				var5.overheadTextEffect = 0; // L: 168
				var5.overheadTextCyclesRemaining = 150; // L: 169
			}

			if ((var6 & 16384) != 0) { // L: 171
				var5.field1238 = var0.method9239(); // L: 172
				var5.field1185 = var0.method9241(); // L: 173
				var5.field1239 = var0.readByte(); // L: 174
				var5.field1204 = var0.method9239(); // L: 175
				var5.spotAnimation = var0.method9245() + Client.cycle; // L: 176
				var5.field1243 = var0.readUnsignedShort() + Client.cycle; // L: 177
				var5.field1254 = var0.method9184(); // L: 178
				if (var5.field1124) { // L: 179
					var5.field1238 += var5.tileX; // L: 180
					var5.field1185 += var5.tileY; // L: 181
					var5.field1239 += var5.tileX; // L: 182
					var5.field1204 += var5.tileY; // L: 183
					var5.pathLength = 0; // L: 184
				} else {
					var5.field1238 += var5.pathX[0]; // L: 187
					var5.field1185 += var5.pathY[0]; // L: 188
					var5.field1239 += var5.pathX[0]; // L: 189
					var5.field1204 += var5.pathY[0]; // L: 190
					var5.pathLength = 1; // L: 191
				}

				var5.field1261 = 0; // L: 193
			}

			if ((var6 & 4) != 0) { // L: 195
				var8 = var0.method9184(); // L: 196
				if (var8 == 65535) { // L: 197
					var8 = -1;
				}

				var9 = var0.method9236(); // L: 198
				WorldMapEvent.performPlayerAnimation(var5, var8, var9); // L: 199
			}

			if ((var6 & 2048) != 0) { // L: 201
				for (var8 = 0; var8 < 3; ++var8) { // L: 202
					var5.actions[var8] = var0.readStringCp1252NullTerminated();
				}
			}

			if ((var6 & 32) != 0) { // L: 204
				var5.field1223 = var0.method9183(); // L: 205
				if (var5.pathLength == 0) { // L: 206
					var5.orientation = var5.field1223; // L: 207
					var5.method2430(); // L: 208
				}
			}

			if ((var6 & 8) != 0) { // L: 211
				var8 = var0.method9183(); // L: 212
				PlayerType var25 = (PlayerType)SequenceDefinition.findEnumerated(class183.PlayerType_values(), var0.readUnsignedByte()); // L: 213
				boolean var30 = var0.method9238() == 1; // L: 214
				var11 = var0.method9237(); // L: 215
				var12 = var0.offset; // L: 216
				if (var5.username != null && var5.appearance != null) { // L: 217
					boolean var31 = false; // L: 218
					if (var25.isUser && InvDefinition.friendSystem.isIgnored(var5.username)) { // L: 219 220
						var31 = true;
					}

					if (!var31 && Client.field790 == 0 && !var5.isHidden) { // L: 222
						Players.field1371.offset = 0; // L: 223
						var0.method9263(Players.field1371.array, 0, var11); // L: 224
						Players.field1371.offset = 0; // L: 225
						String var14 = AbstractFont.escapeBrackets(HealthBarUpdate.method2462(class172.method3430(Players.field1371))); // L: 226
						var5.overheadText = var14.trim(); // L: 227
						var5.overheadTextColor = var8 >> 8; // L: 228
						var5.overheadTextEffect = var8 & 255; // L: 229
						var5.overheadTextCyclesRemaining = 150; // L: 230
						var5.field1194 = null; // L: 231
						var5.isAutoChatting = var30; // L: 232
						var5.field1246 = var5 != TextureProvider.localPlayer && var25.isUser && !Client.field752.isEmpty() && var14.toLowerCase().indexOf(Client.field752) == -1; // L: 233
						if (var25.isPrivileged) { // L: 235
							var15 = var30 ? 91 : 1;
						} else {
							var15 = var30 ? 90 : 2; // L: 236
						}

						if (var25.modIcon != -1) { // L: 237
							class411.addGameMessage(var15, class436.method7916(var25.modIcon) + var5.username.getName(), var14);
						} else {
							class411.addGameMessage(var15, var5.username.getName(), var14); // L: 238
						}
					}
				}

				var0.offset = var11 + var12; // L: 241
			}

			if ((var6 & 512) != 0) { // L: 243
				var8 = var0.method9184(); // L: 244
				var9 = var8 >> 8; // L: 245
				var10 = var9 >= 13 && var9 <= 20 ? var9 - 12 : 0; // L: 246
				PlayerType var26 = (PlayerType)SequenceDefinition.findEnumerated(class183.PlayerType_values(), var0.readUnsignedByte()); // L: 247
				boolean var32 = var0.method9238() == 1; // L: 248
				var13 = var0.readUnsignedByte(); // L: 249
				var27 = var0.offset; // L: 250
				if (var5.username != null && var5.appearance != null) { // L: 251
					boolean var33 = false; // L: 252
					if (var26.isUser && InvDefinition.friendSystem.isIgnored(var5.username)) { // L: 253 254
						var33 = true;
					}

					if (!var33 && Client.field790 == 0 && !var5.isHidden) { // L: 256
						Players.field1371.offset = 0; // L: 257
						var0.readBytes(Players.field1371.array, 0, var13); // L: 258
						Players.field1371.offset = 0; // L: 259
						String var16 = AbstractFont.escapeBrackets(HealthBarUpdate.method2462(class172.method3430(Players.field1371))); // L: 260
						var5.overheadText = var16.trim(); // L: 261
						var5.overheadTextColor = var8 >> 8; // L: 262
						var5.overheadTextEffect = var8 & 255; // L: 263
						var5.overheadTextCyclesRemaining = 150; // L: 264
						byte[] var17 = null; // L: 265
						if (var10 > 0 && var10 <= 8) { // L: 266
							var17 = new byte[var10]; // L: 267

							for (int var18 = 0; var18 < var10; ++var18) { // L: 268
								var17[var18] = var0.method9239(); // L: 269
							}
						}

						byte[] var20 = var17; // L: 274
						int[] var19;
						if (var17 != null && var17.length != 0 && var17.length <= 8) { // L: 276
							int[] var21 = new int[var17.length]; // L: 280
							int var22 = 0;

							while (true) {
								if (var22 >= var20.length) {
									var19 = var21; // L: 288
									break;
								}

								if (var20[var22] < 0 || var20[var22] > class553.field5289.length) { // L: 282
									var19 = null; // L: 283
									break; // L: 284
								}

								var21[var22] = class553.field5289[var20[var22]]; // L: 286
								++var22; // L: 281
							}
						} else {
							var19 = null; // L: 277
						}

						var5.field1194 = var19;
						var5.isAutoChatting = var32;
						var5.field1246 = var5 != TextureProvider.localPlayer && var26.isUser && !Client.field752.isEmpty() && var16.toLowerCase().indexOf(Client.field752) == -1; // L: 292
						int var29;
						if (var26.isPrivileged) {
							var29 = var32 ? 91 : 1;
						} else {
							var29 = var32 ? 90 : 2;
						}

						if (var26.modIcon != -1) {
							class411.addGameMessage(var29, class436.method7916(var26.modIcon) + var5.username.getName(), var16);
						} else {
							class411.addGameMessage(var29, var5.username.getName(), var16); // L: 297
						}
					}
				}

				var0.offset = var13 + var27 + var10;
			}

			if ((var6 & 64) != 0) {
				var8 = var0.method9237();
				byte[] var36 = new byte[var8];
				Buffer var35 = new Buffer(var36);
				var0.method9326(var36, 0, var8);
				Players.field1373[var4] = var35;
				var5.read(var35);
			}

			if ((var6 & 8192) != 0) { // L: 310
				var7 = var0.readByte(); // L: 311
			}

			if (var5.field1124) {
				if (var7 == 127) { // L: 314
					var5.resetPath(var5.tileX, var5.tileY);
				} else {
					class231 var34;
					if (var7 != class231.field2429.field2430) { // L: 317
						class231[] var37 = new class231[]{class231.field2426, class231.field2429, class231.field2428, class231.field2427};
						var34 = (class231)SequenceDefinition.findEnumerated(var37, var7); // L: 322
					} else {
						var34 = Players.field1370[var4];
					}

					var5.method2374(var5.tileX, var5.tileY, var34);
				}
			}
		}

		if (var0.offset - var2 != var1) {
			throw new RuntimeException(var0.offset - var2 + " " + var1);
		}
	} // L: 335

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIILjt;[Lih;)V"
	)
	static final void method2231(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
		Buffer var10 = new Buffer(var0); // L: 290
		int var11 = -1; // L: 291

		while (true) {
			int var12 = var10.method9296(); // L: 293
			if (var12 == 0) { // L: 294
				return; // L: 349
			}

			var11 += var12; // L: 295
			int var13 = 0; // L: 296

			while (true) {
				int var14 = var10.readUShortSmart(); // L: 298
				if (var14 == 0) { // L: 299
					break;
				}

				var13 += var14 - 1; // L: 300
				int var15 = var13 & 63; // L: 301
				int var16 = var13 >> 6 & 63; // L: 302
				int var17 = var13 >> 12; // L: 303
				int var18 = var10.readUnsignedByte(); // L: 304
				int var19 = var18 >> 2; // L: 305
				int var20 = var18 & 3; // L: 306
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) { // L: 307
					ObjectComposition var21 = class91.getObjectDefinition(var11); // L: 308
					int var22 = var2 + class153.method3220(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20); // L: 309
					int var25 = var16 & 7; // L: 312
					int var26 = var15 & 7; // L: 313
					int var28 = var21.sizeX; // L: 315
					int var29 = var21.sizeY; // L: 316
					int var30;
					if ((var20 & 1) == 1) { // L: 318
						var30 = var28; // L: 319
						var28 = var29; // L: 320
						var29 = var30; // L: 321
					}

					int var27 = var7 & 3; // L: 323
					int var24;
					if (var27 == 0) { // L: 324
						var24 = var26; // L: 325
					} else if (var27 == 1) { // L: 328
						var24 = 7 - var25 - (var28 - 1); // L: 329
					} else if (var27 == 2) { // L: 332
						var24 = 7 - var26 - (var29 - 1); // L: 333
					} else {
						var24 = var25; // L: 336
					}

					var30 = var24 + var3; // L: 338
					if (var22 > 0 && var30 > 0 && var22 < 103 && var30 < 103) { // L: 339
						int var31 = var1; // L: 340
						if ((Tiles_renderFlags[1][var22][var30] & 2) == 2) { // L: 341
							var31 = var1 - 1;
						}

						CollisionMap var32 = null; // L: 342
						if (var31 >= 0) { // L: 343
							var32 = var9[var31];
						}

						class314.addObjects(var1, var22, var30, var11, var20 + var7 & 3, var19, var8, var32); // L: 344
					}
				}
			}
		}
	}
}
