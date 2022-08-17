import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gi")
public class class193 {
	@ObfuscatedName("f")
	@Export("directions")
	public static int[][] directions;
	@ObfuscatedName("u")
	@Export("distances")
	public static int[][] distances;
	@ObfuscatedName("j")
	@Export("bufferX")
	public static int[] bufferX;
	@ObfuscatedName("h")
	@Export("bufferY")
	public static int[] bufferY;

	static {
		directions = new int[128][128]; // L: 6
		distances = new int[128][128]; // L: 7
		bufferX = new int[4096]; // L: 11
		bufferY = new int[4096]; // L: 12
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-829025129"
	)
	public static boolean method3908(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field137[var0] : false; // L: 244 245
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZI)I",
		garbageValue = "470828910"
	)
	static int method3906(int var0, Script var1, boolean var2) {
		String var3;
		int var9;
		if (var0 == ScriptOpcodes.APPEND_NUM) { // L: 3277
			var3 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 3278
			var9 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3279
			Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var3 + var9; // L: 3280
			return 1; // L: 3281
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) { // L: 3283
				GrandExchangeOfferAgeComparator.Interpreter_stringStackSize -= 2; // L: 3284
				var3 = Interpreter.Interpreter_stringStack[GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 3285
				var4 = Interpreter.Interpreter_stringStack[GrandExchangeOfferAgeComparator.Interpreter_stringStackSize + 1]; // L: 3286
				Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var3 + var4; // L: 3287
				return 1; // L: 3288
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) { // L: 3290
				var3 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 3291
				var9 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3292
				Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var3 + ModeWhere.intToString(var9, true); // L: 3293
				return 1; // L: 3294
			} else if (var0 == ScriptOpcodes.LOWERCASE) { // L: 3296
				var3 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 3297
				Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var3.toLowerCase(); // L: 3298
				return 1; // L: 3299
			} else {
				int var6;
				int var10;
				if (var0 == ScriptOpcodes.FROMDATE) { // L: 3301
					var10 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3302
					long var13 = (11745L + (long)var10) * 86400000L; // L: 3303
					Interpreter.Interpreter_calendar.setTime(new Date(var13)); // L: 3304
					var6 = Interpreter.Interpreter_calendar.get(5); // L: 3305
					int var17 = Interpreter.Interpreter_calendar.get(2); // L: 3306
					int var8 = Interpreter.Interpreter_calendar.get(1); // L: 3307
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8; // L: 3308
					return 1; // L: 3309
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) { // L: 3311
					if (var0 == ScriptOpcodes.TOSTRING) { // L: 3319
						var10 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3320
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = Integer.toString(var10); // L: 3321
						return 1; // L: 3322
					} else if (var0 == ScriptOpcodes.COMPARE) { // L: 3324
						GrandExchangeOfferAgeComparator.Interpreter_stringStackSize -= 2; // L: 3325
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapArchiveLoader.method7221(class238.compareStrings(Interpreter.Interpreter_stringStack[GrandExchangeOfferAgeComparator.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[GrandExchangeOfferAgeComparator.Interpreter_stringStackSize + 1], class21.clientLanguage)); // L: 3326
						return 1; // L: 3327
					} else {
						int var5;
						byte[] var11;
						Font var12;
						if (var0 == ScriptOpcodes.PARAHEIGHT) { // L: 3329
							var3 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 3330
							TaskHandler.Interpreter_intStackSize -= 2; // L: 3331
							var9 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3332
							var5 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 3333
							var11 = class1.archive13.takeFile(var5, 0); // L: 3334
							var12 = new Font(var11); // L: 3335
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var12.lineCount(var3, var9); // L: 3336
							return 1; // L: 3337
						} else if (var0 == ScriptOpcodes.PARAWIDTH) { // L: 3339
							var3 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 3340
							TaskHandler.Interpreter_intStackSize -= 2; // L: 3341
							var9 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3342
							var5 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 3343
							var11 = class1.archive13.takeFile(var5, 0); // L: 3344
							var12 = new Font(var11); // L: 3345
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var12.lineWidth(var3, var9); // L: 3346
							return 1; // L: 3347
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) { // L: 3349
							GrandExchangeOfferAgeComparator.Interpreter_stringStackSize -= 2; // L: 3350
							var3 = Interpreter.Interpreter_stringStack[GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 3351
							var4 = Interpreter.Interpreter_stringStack[GrandExchangeOfferAgeComparator.Interpreter_stringStackSize + 1]; // L: 3352
							if (Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1) { // L: 3353
								Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var4; // L: 3354
							}

							return 1; // L: 3355
						} else if (var0 == ScriptOpcodes.ESCAPE) { // L: 3357
							var3 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 3358
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3); // L: 3359
							return 1; // L: 3360
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) { // L: 3362
							var3 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 3363
							var9 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3364
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var3 + (char)var9; // L: 3365
							return 1; // L: 3366
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) { // L: 3368
							var10 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3369
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = KeyHandler.isCharPrintable((char)var10) ? 1 : 0; // L: 3370
							return 1; // L: 3371
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) { // L: 3373
							var10 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3374
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = UrlRequest.isAlphaNumeric((char)var10) ? 1 : 0; // L: 3375
							return 1; // L: 3376
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) { // L: 3378
							var10 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3379
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class147.isCharAlphabetic((char)var10) ? 1 : 0; // L: 3380
							return 1; // L: 3381
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) { // L: 3383
							var10 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3384
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = GameObject.isDigit((char)var10) ? 1 : 0; // L: 3385
							return 1; // L: 3386
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) { // L: 3388
							var3 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 3389
							if (var3 != null) { // L: 3390
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 3391
							}

							return 1; // L: 3392
						} else if (var0 == ScriptOpcodes.SUBSTRING) { // L: 3394
							var3 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 3395
							TaskHandler.Interpreter_intStackSize -= 2; // L: 3396
							var9 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3397
							var5 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 3398
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var3.substring(var9, var5); // L: 3399
							return 1; // L: 3400
						} else if (var0 == ScriptOpcodes.REMOVETAGS) { // L: 3402
							var3 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 3403
							StringBuilder var15 = new StringBuilder(var3.length()); // L: 3404
							boolean var16 = false; // L: 3405

							for (var6 = 0; var6 < var3.length(); ++var6) { // L: 3406
								char var7 = var3.charAt(var6); // L: 3407
								if (var7 == '<') { // L: 3408
									var16 = true;
								} else if (var7 == '>') { // L: 3409
									var16 = false;
								} else if (!var16) { // L: 3410
									var15.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var15.toString(); // L: 3412
							return 1; // L: 3413
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) { // L: 3415
							var3 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 3416
							var9 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3417
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.indexOf(var9); // L: 3418
							return 1; // L: 3419
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) { // L: 3421
							GrandExchangeOfferAgeComparator.Interpreter_stringStackSize -= 2; // L: 3422
							var3 = Interpreter.Interpreter_stringStack[GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 3423
							var4 = Interpreter.Interpreter_stringStack[GrandExchangeOfferAgeComparator.Interpreter_stringStackSize + 1]; // L: 3424
							var5 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3425
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.indexOf(var4, var5); // L: 3426
							return 1; // L: 3427
						} else if (var0 == 4122) { // L: 3429
							var3 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 3430
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var3.toUpperCase(); // L: 3431
							return 1; // L: 3432
						} else {
							return 2; // L: 3434
						}
					}
				} else {
					GrandExchangeOfferAgeComparator.Interpreter_stringStackSize -= 2; // L: 3312
					var3 = Interpreter.Interpreter_stringStack[GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 3313
					var4 = Interpreter.Interpreter_stringStack[GrandExchangeOfferAgeComparator.Interpreter_stringStackSize + 1]; // L: 3314
					if (class28.localPlayer.appearance != null && class28.localPlayer.appearance.isFemale) { // L: 3315
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var3; // L: 3316
					}

					return 1; // L: 3317
				}
			}
		}
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(Lcs;I)V",
		garbageValue = "-1647783699"
	)
	static final void method3909(Actor var0) {
		if (var0.field1197 != 0) { // L: 4223
			if (var0.targetIndex != -1) { // L: 4224
				Object var1 = null; // L: 4225
				if (var0.targetIndex < 32768) { // L: 4226
					var1 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= 32768) { // L: 4227
					var1 = Client.players[var0.targetIndex - 32768];
				}

				if (var1 != null) { // L: 4228
					int var2 = var0.x - ((Actor)var1).x; // L: 4229
					int var3 = var0.y - ((Actor)var1).y; // L: 4230
					if (var2 != 0 || var3 != 0) { // L: 4231
						var0.orientation = (int)(Math.atan2((double)var2, (double)var3) * 325.949D) & 2047;
					}
				} else if (var0.false0) { // L: 4233
					var0.targetIndex = -1; // L: 4234
					var0.false0 = false; // L: 4235
				}
			}

			if (var0.field1164 != -1 && (var0.pathLength == 0 || var0.field1142 > 0)) { // L: 4238
				var0.orientation = var0.field1164; // L: 4239
				var0.field1164 = -1; // L: 4240
			}

			int var4 = var0.orientation - var0.rotation & 2047; // L: 4242
			if (var4 == 0 && var0.false0) { // L: 4243
				var0.targetIndex = -1; // L: 4244
				var0.false0 = false; // L: 4245
			}

			if (var4 != 0) { // L: 4247
				++var0.field1196; // L: 4248
				boolean var6;
				if (var4 > 1024) { // L: 4249
					var0.rotation -= var0.field1152 ? var4 : var0.field1197; // L: 4250
					var6 = true; // L: 4251
					if (var4 < var0.field1197 || var4 > 2048 - var0.field1197) { // L: 4252
						var0.rotation = var0.orientation; // L: 4253
						var6 = false; // L: 4254
					}

					if (!var0.field1152 && var0.movementSequence == var0.idleSequence && (var0.field1196 > 25 || var6)) { // L: 4256
						if (var0.turnLeftSequence != -1) { // L: 4257
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 4258
						}
					}
				} else {
					var0.rotation += var0.field1152 ? var4 : var0.field1197; // L: 4262
					var6 = true; // L: 4263
					if (var4 < var0.field1197 || var4 > 2048 - var0.field1197) { // L: 4264
						var0.rotation = var0.orientation; // L: 4265
						var6 = false; // L: 4266
					}

					if (!var0.field1152 && var0.idleSequence == var0.movementSequence && (var0.field1196 > 25 || var6)) { // L: 4268
						if (var0.turnRightSequence != -1) { // L: 4269
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 4270
						}
					}
				}

				var0.rotation &= 2047; // L: 4274
				var0.field1152 = false; // L: 4275
			} else {
				var0.field1196 = 0; // L: 4277
			}

		}
	} // L: 4278

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "1768018543"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase(); // L: 12335
		short[] var2 = new short[16]; // L: 12336
		int var3 = 0; // L: 12337

		for (int var4 = 0; var4 < Buddy.ItemComposition_fileCount; ++var4) { // L: 12338
			ItemComposition var9 = class258.ItemComposition_get(var4); // L: 12339
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) { // L: 12340 12341 12342
				if (var3 >= 250) { // L: 12343
					class127.foundItemIdCount = -1; // L: 12344
					WorldMapData_1.foundItemIds = null; // L: 12345
					return; // L: 12346
				}

				if (var3 >= var2.length) { // L: 12348
					short[] var6 = new short[var2.length * 2]; // L: 12349

					for (int var7 = 0; var7 < var3; ++var7) { // L: 12350
						var6[var7] = var2[var7];
					}

					var2 = var6; // L: 12351
				}

				var2[var3++] = (short)var4; // L: 12353
			}
		}

		WorldMapData_1.foundItemIds = var2; // L: 12355
		WorldMapSection2.foundItemIndex = 0; // L: 12356
		class127.foundItemIdCount = var3; // L: 12357
		String[] var8 = new String[class127.foundItemIdCount]; // L: 12358

		for (int var5 = 0; var5 < class127.foundItemIdCount; ++var5) { // L: 12359
			var8[var5] = class258.ItemComposition_get(var2[var5]).name;
		}

		short[] var10 = WorldMapData_1.foundItemIds; // L: 12360
		WorldMapID.sortItemsByName(var8, var10, 0, var8.length - 1); // L: 12362
	} // L: 12364
}
