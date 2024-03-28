import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cp")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	static Archive field479;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("ic")
	@ObfuscatedGetter(
		intValue = 1754165711
	)
	@Export("baseX")
	static int baseX;
	@ObfuscatedName("az")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	} // L: 13126

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Log;Log;B)I",
		garbageValue = "-58"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) { // L: 13129
			return 0;
		} else {
			if (this.filterWorlds) { // L: 13130
				if (Client.worldId == var1.world) { // L: 13131
					return -1;
				}

				if (var2.world == Client.worldId) { // L: 13132
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1; // L: 13134
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 13138
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 13142
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZB)I",
		garbageValue = "3"
	)
	static int method1192(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) { // L: 3293
			if (class511.guestClanSettings != null) { // L: 3294
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 1; // L: 3295
				class19.field84 = class511.guestClanSettings; // L: 3296
			} else {
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 3298
			}

			return 1; // L: 3299
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) { // L: 3301
				var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 3302
				if (Client.currentClanSettings[var3] != null) { // L: 3303
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 1; // L: 3304
					class19.field84 = Client.currentClanSettings[var3]; // L: 3305
				} else {
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 3307
				}

				return 1; // L: 3308
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) { // L: 3310
				Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = class19.field84.name; // L: 3311
				return 1; // L: 3312
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) { // L: 3314
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class19.field84.allowGuests ? 1 : 0; // L: 3315
				return 1; // L: 3316
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) { // L: 3318
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class19.field84.field1752; // L: 3319
				return 1; // L: 3320
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) { // L: 3322
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class19.field84.field1740; // L: 3323
				return 1; // L: 3324
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) { // L: 3326
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class19.field84.field1749; // L: 3327
				return 1; // L: 3328
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) { // L: 3330
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class19.field84.field1741; // L: 3331
				return 1; // L: 3332
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) { // L: 3334
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class19.field84.memberCount; // L: 3335
				return 1; // L: 3336
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) { // L: 3338
				var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 3339
				Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = class19.field84.memberNames[var3]; // L: 3340
				return 1; // L: 3341
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) { // L: 3343
				var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 3344
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class19.field84.memberRanks[var3]; // L: 3345
				return 1; // L: 3346
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) { // L: 3348
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class19.field84.bannedMemberCount; // L: 3349
				return 1; // L: 3350
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) { // L: 3352
				var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 3353
				Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = class19.field84.bannedMemberNames[var3]; // L: 3354
				return 1; // L: 3355
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) { // L: 3357
					class19.Interpreter_intStackSize -= 3; // L: 3358
					var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 3359
					var6 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 3360
					var5 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 2]; // L: 3361
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class19.field84.method3243(var3, var6, var5); // L: 3362
					return 1; // L: 3363
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) { // L: 3365
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class19.field84.currentOwner; // L: 3366
					return 1; // L: 3367
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) { // L: 3369
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class19.field84.field1751; // L: 3370
					return 1; // L: 3371
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) { // L: 3373
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class19.field84.method3242(Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]); // L: 3374
					return 1; // L: 3375
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) { // L: 3377
					Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize - 1] = class19.field84.getSortedMembers()[Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize - 1]]; // L: 3378
					return 1; // L: 3379
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) { // L: 3381
					class19.Interpreter_intStackSize -= 2; // L: 3382
					var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 3383
					var6 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 3384
					class423.method7813(var6, var3); // L: 3385
					return 1; // L: 3386
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) { // L: 3388
					var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 3389
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class19.field84.field1748[var3]; // L: 3390
					return 1; // L: 3391
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) { // L: 3393
						class19.Interpreter_intStackSize -= 3; // L: 3394
						var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 3395
						boolean var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1] == 1; // L: 3396
						var5 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 2]; // L: 3397
						Client.method1565(var5, var3, var4); // L: 3398
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) { // L: 3400
						var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 3401
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class19.field84.field1736[var3] ? 1 : 0; // L: 3402
						return 1; // L: 3403
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) { // L: 3405
						if (class19.guestClanChannel != null) { // L: 3406
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 1; // L: 3407
							class126.field1513 = class19.guestClanChannel; // L: 3408
						} else {
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 3410
						}

						return 1; // L: 3411
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) { // L: 3413
						var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 3414
						if (Client.currentClanChannels[var3] != null) { // L: 3415
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 1; // L: 3416
							class126.field1513 = Client.currentClanChannels[var3]; // L: 3417
							GrandExchangeOfferAgeComparator.field4472 = var3; // L: 3418
						} else {
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 3420
						}

						return 1; // L: 3421
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) { // L: 3423
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = class126.field1513.name; // L: 3424
						return 1; // L: 3425
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) { // L: 3427
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class126.field1513.field1799; // L: 3428
						return 1; // L: 3429
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) { // L: 3431
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class126.field1513.field1801; // L: 3432
						return 1; // L: 3433
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) { // L: 3435
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class126.field1513.method3394(); // L: 3436
						return 1; // L: 3437
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) { // L: 3439
						var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 3440
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ((ClanChannelMember)class126.field1513.members.get(var3)).username.getName(); // L: 3441
						return 1; // L: 3442
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) { // L: 3444
						var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 3445
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = ((ClanChannelMember)class126.field1513.members.get(var3)).rank; // L: 3446
						return 1; // L: 3447
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) { // L: 3449
						var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 3450
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = ((ClanChannelMember)class126.field1513.members.get(var3)).world; // L: 3451
						return 1; // L: 3452
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) { // L: 3454
						var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 3455
						class134.method3073(GrandExchangeOfferAgeComparator.field4472, var3); // L: 3456
						return 1; // L: 3457
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) { // L: 3459
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class126.field1513.method3383(Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]); // L: 3460
						return 1; // L: 3461
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) { // L: 3463
						Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize - 1] = class126.field1513.getSortedMembers()[Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize - 1]]; // L: 3464
						return 1; // L: 3465
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) { // L: 3467
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = PendingSpawn.field1189 != null ? 1 : 0; // L: 3468
						return 1; // L: 3469
					} else {
						return 2; // L: 3471
					}
				}
			}
		}
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-985921876"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = LoginType.scene.getWallObjectTag(var0, var1, var2); // L: 6296
		int var7;
		int var8;
		int var9;
		int var10;
		int var13;
		int var14;
		if (0L != var5) { // L: 6297
			var7 = LoginType.scene.getObjectFlags(var0, var1, var2, var5); // L: 6298
			var8 = var7 >> 6 & 3; // L: 6299
			var9 = var7 & 31; // L: 6300
			var10 = var3; // L: 6301
			boolean var11 = var5 != 0L && !class152.method3219(var5); // L: 6304
			if (var11) { // L: 6306
				var10 = var4;
			}

			int[] var12 = Interpreter.field877.pixels; // L: 6307
			var13 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 6308
			var14 = class206.Entity_unpackID(var5); // L: 6309
			ObjectComposition var15 = MouseRecorder.getObjectDefinition(var14); // L: 6310
			if (var15.mapSceneId != -1) { // L: 6311
				IndexedSprite var16 = CollisionMap.mapSceneSprites[var15.mapSceneId]; // L: 6312
				if (var16 != null) { // L: 6313
					int var17 = (var15.sizeX * 4 - var16.subWidth) / 2; // L: 6314
					int var18 = (var15.sizeY * 4 - var16.subHeight * 61063424) / 2; // L: 6315
					var16.drawAt(var1 * 4 + var17 + 48, (104 - var2 - var15.sizeY) * 4 + var18 + 48); // L: 6316
				}
			} else {
				if (var9 == 0 || var9 == 2) { // L: 6320
					if (var8 == 0) { // L: 6321
						var12[var13] = var10; // L: 6322
						var12[var13 + 512] = var10; // L: 6323
						var12[var13 + 1024] = var10; // L: 6324
						var12[var13 + 1536] = var10; // L: 6325
					} else if (var8 == 1) { // L: 6327
						var12[var13] = var10; // L: 6328
						var12[var13 + 1] = var10; // L: 6329
						var12[var13 + 2] = var10; // L: 6330
						var12[var13 + 3] = var10; // L: 6331
					} else if (var8 == 2) { // L: 6333
						var12[var13 + 3] = var10; // L: 6334
						var12[var13 + 512 + 3] = var10; // L: 6335
						var12[var13 + 1024 + 3] = var10; // L: 6336
						var12[var13 + 1536 + 3] = var10; // L: 6337
					} else if (var8 == 3) { // L: 6339
						var12[var13 + 1536] = var10; // L: 6340
						var12[var13 + 1536 + 1] = var10; // L: 6341
						var12[var13 + 1536 + 2] = var10; // L: 6342
						var12[var13 + 1536 + 3] = var10; // L: 6343
					}
				}

				if (var9 == 3) { // L: 6346
					if (var8 == 0) { // L: 6347
						var12[var13] = var10;
					} else if (var8 == 1) { // L: 6348
						var12[var13 + 3] = var10;
					} else if (var8 == 2) { // L: 6349
						var12[var13 + 1536 + 3] = var10;
					} else if (var8 == 3) { // L: 6350
						var12[var13 + 1536] = var10;
					}
				}

				if (var9 == 2) { // L: 6352
					if (var8 == 3) { // L: 6353
						var12[var13] = var10; // L: 6354
						var12[var13 + 512] = var10; // L: 6355
						var12[var13 + 1024] = var10; // L: 6356
						var12[var13 + 1536] = var10; // L: 6357
					} else if (var8 == 0) { // L: 6359
						var12[var13] = var10; // L: 6360
						var12[var13 + 1] = var10; // L: 6361
						var12[var13 + 2] = var10; // L: 6362
						var12[var13 + 3] = var10; // L: 6363
					} else if (var8 == 1) { // L: 6365
						var12[var13 + 3] = var10; // L: 6366
						var12[var13 + 512 + 3] = var10; // L: 6367
						var12[var13 + 1024 + 3] = var10; // L: 6368
						var12[var13 + 1536 + 3] = var10; // L: 6369
					} else if (var8 == 2) { // L: 6371
						var12[var13 + 1536] = var10; // L: 6372
						var12[var13 + 1536 + 1] = var10; // L: 6373
						var12[var13 + 1536 + 2] = var10; // L: 6374
						var12[var13 + 1536 + 3] = var10; // L: 6375
					}
				}
			}
		}

		var5 = LoginType.scene.getGameObjectTag(var0, var1, var2); // L: 6380
		if (0L != var5) { // L: 6381
			var7 = LoginType.scene.getObjectFlags(var0, var1, var2, var5); // L: 6382
			var8 = var7 >> 6 & 3; // L: 6383
			var9 = var7 & 31; // L: 6384
			var10 = class206.Entity_unpackID(var5); // L: 6385
			ObjectComposition var19 = MouseRecorder.getObjectDefinition(var10); // L: 6386
			if (var19.mapSceneId != -1) { // L: 6387
				IndexedSprite var26 = CollisionMap.mapSceneSprites[var19.mapSceneId]; // L: 6388
				if (var26 != null) { // L: 6389
					var13 = (var19.sizeX * 4 - var26.subWidth) / 2; // L: 6390
					var14 = (var19.sizeY * 4 - var26.subHeight * 61063424) / 2; // L: 6391
					var26.drawAt(var13 + var1 * 4 + 48, var14 + (104 - var2 - var19.sizeY) * 4 + 48); // L: 6392
				}
			} else if (var9 == 9) { // L: 6395
				int var20 = 15658734; // L: 6396
				boolean var27 = 0L != var5 && !class152.method3219(var5); // L: 6399
				if (var27) { // L: 6401
					var20 = 15597568;
				}

				int[] var21 = Interpreter.field877.pixels; // L: 6402
				int var22 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 6403
				if (var8 != 0 && var8 != 2) { // L: 6404
					var21[var22] = var20; // L: 6411
					var21[var22 + 1 + 512] = var20; // L: 6412
					var21[var22 + 1024 + 2] = var20; // L: 6413
					var21[var22 + 1536 + 3] = var20; // L: 6414
				} else {
					var21[var22 + 1536] = var20; // L: 6405
					var21[var22 + 1 + 1024] = var20; // L: 6406
					var21[var22 + 512 + 2] = var20; // L: 6407
					var21[var22 + 3] = var20; // L: 6408
				}
			}
		}

		var5 = LoginType.scene.getGroundObjectTag(var0, var1, var2); // L: 6418
		if (var5 != 0L) { // L: 6419
			var7 = class206.Entity_unpackID(var5); // L: 6420
			ObjectComposition var23 = MouseRecorder.getObjectDefinition(var7); // L: 6421
			if (var23.mapSceneId != -1) { // L: 6422
				IndexedSprite var24 = CollisionMap.mapSceneSprites[var23.mapSceneId]; // L: 6423
				if (var24 != null) { // L: 6424
					var10 = (var23.sizeX * 4 - var24.subWidth) / 2; // L: 6425
					int var25 = (var23.sizeY * 4 - var24.subHeight * 61063424) / 2; // L: 6426
					var24.drawAt(var10 + var1 * 4 + 48, (104 - var2 - var23.sizeY) * 4 + var25 + 48); // L: 6427
				}
			}
		}

	} // L: 6431

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "990596758"
	)
	static void method1199() {
		if (class135.field1621 != null) { // L: 12962
			Client.field808 = Client.cycle; // L: 12963
			class135.field1621.method7162(); // L: 12964

			for (int var0 = 0; var0 < Client.players.length; ++var0) { // L: 12965
				if (Client.players[var0] != null) { // L: 12966
					class135.field1621.method7164(baseX * 64 + (Client.players[var0].x >> 7), DevicePcmPlayerProvider.baseY * 64 + (Client.players[var0].y >> 7)); // L: 12967
				}
			}
		}

	} // L: 12971
}
