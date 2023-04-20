import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
@Implements("KitDefinition")
public class KitDefinition extends DualNode {
	@ObfuscatedName("ur")
	@ObfuscatedGetter(
		intValue = -760417651
	)
	static int field1957;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("KitDefinition_archive")
	static AbstractArchive KitDefinition_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("KitDefinition_modelsArchive")
	static AbstractArchive KitDefinition_modelsArchive;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 743589639
	)
	@Export("KitDefinition_fileCount")
	public static int KitDefinition_fileCount;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("KitDefinition_cached")
	static EvictingDualNodeHashTable KitDefinition_cached;
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "[Ltq;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1015855167
	)
	@Export("bodypartID")
	public int bodypartID;
	@ObfuscatedName("ab")
	@Export("models2")
	int[] models2;
	@ObfuscatedName("aq")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("al")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("at")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("aa")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("ay")
	@Export("models")
	int[] models;
	@ObfuscatedName("ao")
	@Export("nonSelectable")
	public boolean nonSelectable;

	static {
		KitDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
	}

	KitDefinition() {
		this.bodypartID = -1; // L: 15
		this.models = new int[]{-1, -1, -1, -1, -1}; // L: 21
		this.nonSelectable = false; // L: 22
	} // L: 26

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)V",
		garbageValue = "-1026746832"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 46
			if (var2 == 0) { // L: 47
				return; // L: 50
			}

			this.decodeNext(var1, var2); // L: 48
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsg;IB)V",
		garbageValue = "33"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 53
			this.bodypartID = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 2) { // L: 54
				var3 = var1.readUnsignedByte(); // L: 55
				this.models2 = new int[var3]; // L: 56

				for (var4 = 0; var4 < var3; ++var4) { // L: 57
					this.models2[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 3) { // L: 59
				this.nonSelectable = true;
			} else if (var2 == 40) { // L: 60
				var3 = var1.readUnsignedByte(); // L: 61
				this.recolorFrom = new short[var3]; // L: 62
				this.recolorTo = new short[var3]; // L: 63

				for (var4 = 0; var4 < var3; ++var4) { // L: 64
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 65
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 66
				}
			} else if (var2 == 41) { // L: 69
				var3 = var1.readUnsignedByte(); // L: 70
				this.retextureFrom = new short[var3]; // L: 71
				this.retextureTo = new short[var3]; // L: 72

				for (var4 = 0; var4 < var3; ++var4) { // L: 73
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 74
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 75
				}
			} else if (var2 >= 60 && var2 < 70) { // L: 78
				this.models[var2 - 60] = var1.readUnsignedShort();
			}
		}

	} // L: 80

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1647976754"
	)
	@Export("ready")
	public boolean ready() {
		if (this.models2 == null) { // L: 83
			return true;
		} else {
			boolean var1 = true; // L: 84

			for (int var2 = 0; var2 < this.models2.length; ++var2) { // L: 85
				if (!KitDefinition_modelsArchive.tryLoadFile(this.models2[var2], 0)) {
					var1 = false;
				}
			}

			return var1; // L: 86
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Liz;",
		garbageValue = "-240292107"
	)
	@Export("getModelData")
	public ModelData getModelData() {
		if (this.models2 == null) { // L: 90
			return null;
		} else {
			ModelData[] var1 = new ModelData[this.models2.length]; // L: 91

			for (int var2 = 0; var2 < this.models2.length; ++var2) { // L: 92
				var1[var2] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models2[var2], 0);
			}

			ModelData var4;
			if (var1.length == 1) { // L: 94
				var4 = var1[0];
			} else {
				var4 = new ModelData(var1, var1.length); // L: 95
			}

			int var3;
			if (this.recolorFrom != null) { // L: 96
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 97
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 98
				}
			}

			if (this.retextureFrom != null) { // L: 101
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) {
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 103
				}
			}

			return var4; // L: 106
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "10"
	)
	public boolean method3689() {
		boolean var1 = true; // L: 110

		for (int var2 = 0; var2 < 5; ++var2) {
			if (this.models[var2] != -1 && !KitDefinition_modelsArchive.tryLoadFile(this.models[var2], 0)) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Liz;",
		garbageValue = "-37"
	)
	@Export("getKitDefinitionModels")
	public ModelData getKitDefinitionModels() {
		ModelData[] var1 = new ModelData[5];
		int var2 = 0;

		for (int var3 = 0; var3 < 5; ++var3) {
			if (this.models[var3] != -1) {
				var1[var2++] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models[var3], 0);
			}
		}

		ModelData var5 = new ModelData(var1, var2);
		int var4;
		if (this.recolorFrom != null) {
			for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 125
				var5.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
			}
		}

		if (this.retextureFrom != null) { // L: 129
			for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 130
				var5.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 131
			}
		}

		return var5; // L: 134
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIILia;Lif;I)Z",
		garbageValue = "1036507043"
	)
	static final boolean method3698(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4) {
		int var5 = var0; // L: 315
		int var6 = var1; // L: 316
		byte var7 = 64; // L: 317
		byte var8 = 64; // L: 318
		int var9 = var0 - var7; // L: 319
		int var10 = var1 - var8; // L: 320
		class211.directions[var7][var8] = 99; // L: 321
		class211.distances[var7][var8] = 0; // L: 322
		byte var11 = 0; // L: 323
		int var12 = 0; // L: 324
		class211.bufferX[var11] = var0; // L: 325
		int var20 = var11 + 1;
		class211.bufferY[var11] = var1; // L: 326
		int[][] var13 = var4.flags; // L: 327

		while (true) {
			label309:
			while (true) {
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				do {
					do {
						do {
							label286:
							do {
								if (var20 == var12) { // L: 328
									class18.field94 = var5; // L: 447
									class397.field4534 = var6; // L: 448
									return false; // L: 449
								}

								var5 = class211.bufferX[var12]; // L: 329
								var6 = class211.bufferY[var12]; // L: 330
								var12 = var12 + 1 & 4095; // L: 331
								var18 = var5 - var9; // L: 332
								var19 = var6 - var10; // L: 333
								var14 = var5 - var4.xInset; // L: 334
								var15 = var6 - var4.yInset; // L: 335
								if (var3.hasArrived(var2, var5, var6, var4)) { // L: 336
									class18.field94 = var5; // L: 337
									class397.field4534 = var6; // L: 338
									return true; // L: 339
								}

								var16 = class211.distances[var18][var19] + 1; // L: 341
								if (var18 > 0 && class211.directions[var18 - 1][var19] == 0 && (var13[var14 - 1][var15] & 19136782) == 0 && (var13[var14 - 1][var15 + var2 - 1] & 19136824) == 0) { // L: 342 343 344 345
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class211.bufferX[var20] = var5 - 1; // L: 349
											class211.bufferY[var20] = var6; // L: 350
											var20 = var20 + 1 & 4095; // L: 351
											class211.directions[var18 - 1][var19] = 2; // L: 352
											class211.distances[var18 - 1][var19] = var16; // L: 353
											break;
										}

										if ((var13[var14 - 1][var17 + var15] & 19136830) != 0) { // L: 347
											break;
										}

										++var17; // L: 346
									}
								}

								if (var18 < 128 - var2 && class211.directions[var18 + 1][var19] == 0 && (var13[var14 + var2][var15] & 19136899) == 0 && (var13[var14 + var2][var15 + var2 - 1] & 19136992) == 0) { // L: 355 356 357 358
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class211.bufferX[var20] = var5 + 1; // L: 362
											class211.bufferY[var20] = var6; // L: 363
											var20 = var20 + 1 & 4095; // L: 364
											class211.directions[var18 + 1][var19] = 8; // L: 365
											class211.distances[var18 + 1][var19] = var16; // L: 366
											break;
										}

										if ((var13[var14 + var2][var17 + var15] & 19136995) != 0) { // L: 360
											break;
										}

										++var17; // L: 359
									}
								}

								if (var19 > 0 && class211.directions[var18][var19 - 1] == 0 && (var13[var14][var15 - 1] & 19136782) == 0 && (var13[var14 + var2 - 1][var15 - 1] & 19136899) == 0) { // L: 368 369 370 371
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class211.bufferX[var20] = var5; // L: 375
											class211.bufferY[var20] = var6 - 1; // L: 376
											var20 = var20 + 1 & 4095; // L: 377
											class211.directions[var18][var19 - 1] = 1; // L: 378
											class211.distances[var18][var19 - 1] = var16; // L: 379
											break;
										}

										if ((var13[var14 + var17][var15 - 1] & 19136911) != 0) { // L: 373
											break;
										}

										++var17; // L: 372
									}
								}

								if (var19 < 128 - var2 && class211.directions[var18][var19 + 1] == 0 && (var13[var14][var15 + var2] & 19136824) == 0 && (var13[var14 + var2 - 1][var15 + var2] & 19136992) == 0) { // L: 381 382 383 384
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class211.bufferX[var20] = var5; // L: 388
											class211.bufferY[var20] = var6 + 1; // L: 389
											var20 = var20 + 1 & 4095; // L: 390
											class211.directions[var18][var19 + 1] = 4; // L: 391
											class211.distances[var18][var19 + 1] = var16; // L: 392
											break;
										}

										if ((var13[var17 + var14][var15 + var2] & 19137016) != 0) { // L: 386
											break;
										}

										++var17; // L: 385
									}
								}

								if (var18 > 0 && var19 > 0 && class211.directions[var18 - 1][var19 - 1] == 0 && (var13[var14 - 1][var15 - 1] & 19136782) == 0) { // L: 394 395 396
									var17 = 1;

									while (true) {
										if (var17 >= var2) {
											class211.bufferX[var20] = var5 - 1; // L: 401
											class211.bufferY[var20] = var6 - 1; // L: 402
											var20 = var20 + 1 & 4095; // L: 403
											class211.directions[var18 - 1][var19 - 1] = 3; // L: 404
											class211.distances[var18 - 1][var19 - 1] = var16; // L: 405
											break;
										}

										if ((var13[var14 - 1][var17 + (var15 - 1)] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var15 - 1] & 19136911) != 0) { // L: 398 399
											break;
										}

										++var17; // L: 397
									}
								}

								if (var18 < 128 - var2 && var19 > 0 && class211.directions[var18 + 1][var19 - 1] == 0 && (var13[var14 + var2][var15 - 1] & 19136899) == 0) { // L: 407 408 409
									var17 = 1;

									while (true) {
										if (var17 >= var2) {
											class211.bufferX[var20] = var5 + 1; // L: 414
											class211.bufferY[var20] = var6 - 1; // L: 415
											var20 = var20 + 1 & 4095; // L: 416
											class211.directions[var18 + 1][var19 - 1] = 9; // L: 417
											class211.distances[var18 + 1][var19 - 1] = var16; // L: 418
											break;
										}

										if ((var13[var14 + var2][var17 + (var15 - 1)] & 19136995) != 0 || (var13[var17 + var14][var15 - 1] & 19136911) != 0) { // L: 411 412
											break;
										}

										++var17; // L: 410
									}
								}

								if (var18 > 0 && var19 < 128 - var2 && class211.directions[var18 - 1][var19 + 1] == 0 && (var13[var14 - 1][var15 + var2] & 19136824) == 0) { // L: 420 421 422
									for (var17 = 1; var17 < var2; ++var17) { // L: 423
										if ((var13[var14 - 1][var17 + var15] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var15 + var2] & 19137016) != 0) { // L: 424 425
											continue label286;
										}
									}

									class211.bufferX[var20] = var5 - 1; // L: 427
									class211.bufferY[var20] = var6 + 1; // L: 428
									var20 = var20 + 1 & 4095; // L: 429
									class211.directions[var18 - 1][var19 + 1] = 6; // L: 430
									class211.distances[var18 - 1][var19 + 1] = var16; // L: 431
								}
							} while(var18 >= 128 - var2); // L: 433
						} while(var19 >= 128 - var2);
					} while(class211.directions[var18 + 1][var19 + 1] != 0); // L: 434
				} while((var13[var14 + var2][var15 + var2] & 19136992) != 0); // L: 435

				for (var17 = 1; var17 < var2; ++var17) { // L: 436
					if ((var13[var14 + var17][var15 + var2] & 19137016) != 0 || (var13[var14 + var2][var15 + var17] & 19136995) != 0) { // L: 437 438
						continue label309;
					}
				}

				class211.bufferX[var20] = var5 + 1; // L: 440
				class211.bufferY[var20] = var6 + 1; // L: 441
				var20 = var20 + 1 & 4095; // L: 442
				class211.directions[var18 + 1][var19 + 1] = 12; // L: 443
				class211.distances[var18 + 1][var19 + 1] = var16; // L: 444
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IZB)Ljava/lang/String;",
		garbageValue = "16"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		if (var1 && var0 >= 0) { // L: 102
			int var3 = var0; // L: 104
			String var2;
			if (var1 && var0 >= 0) { // L: 107
				int var4 = 2; // L: 111

				for (int var5 = var0 / 10; var5 != 0; ++var4) { // L: 112 113 115
					var5 /= 10; // L: 114
				}

				char[] var6 = new char[var4]; // L: 117
				var6[0] = '+'; // L: 118

				for (int var7 = var4 - 1; var7 > 0; --var7) { // L: 119
					int var8 = var3; // L: 120
					var3 /= 10; // L: 121
					int var9 = var8 - var3 * 10; // L: 122
					if (var9 >= 10) { // L: 123
						var6[var7] = (char)(var9 + 87);
					} else {
						var6[var7] = (char)(var9 + 48); // L: 124
					}
				}

				var2 = new String(var6); // L: 126
			} else {
				var2 = Integer.toString(var0, 10); // L: 108
			}

			return var2; // L: 128
		} else {
			return Integer.toString(var0);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([BIII)Z",
		garbageValue = "-1749443577"
	)
	static final boolean method3685(byte[] var0, int var1, int var2) {
		boolean var3 = true; // L: 232
		Buffer var4 = new Buffer(var0); // L: 233
		int var5 = -1; // L: 234

		label66:
		while (true) {
			int var6 = var4.method9178(); // L: 236
			if (var6 == 0) { // L: 237
				return var3; // L: 268
			}

			var5 += var6; // L: 238
			int var7 = 0; // L: 239
			boolean var8 = false; // L: 240

			while (true) {
				int var9;
				while (!var8) { // L: 242
					var9 = var4.readUShortSmart(); // L: 248
					if (var9 == 0) { // L: 249
						continue label66;
					}

					var7 += var9 - 1; // L: 250
					int var10 = var7 & 63; // L: 251
					int var11 = var7 >> 6 & 63; // L: 252
					int var12 = var4.readUnsignedByte() >> 2; // L: 253
					int var13 = var11 + var1; // L: 254
					int var14 = var10 + var2; // L: 255
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) { // L: 256
						ObjectComposition var15 = class144.getObjectDefinition(var5); // L: 257
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) { // L: 258
							if (!var15.needsModelFiles()) { // L: 259
								++Client.field557; // L: 260
								var3 = false; // L: 261
							}

							var8 = true; // L: 263
						}
					}
				}

				var9 = var4.readUShortSmart(); // L: 243
				if (var9 == 0) { // L: 244
					break;
				}

				var4.readUnsignedByte(); // L: 245
			}
		}
	}
}
