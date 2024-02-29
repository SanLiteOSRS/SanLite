import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("oi")
public enum class371 implements class390 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4333(0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4332(1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4329(2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4330(3);

	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1315094487
	)
	public final int field4331;

	class371(int var3) {
		this.field4331 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4331; // L: 20
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([BI)Ljava/lang/String;",
		garbageValue = "1597878920"
	)
	public static String method7022(byte[] var0) {
		int var2 = var0.length; // L: 59
		StringBuilder var3 = new StringBuilder(); // L: 61

		for (int var4 = 0; var4 < var2 + 0; var4 += 3) { // L: 62
			int var5 = var0[var4] & 255; // L: 63
			var3.append(class404.field4534[var5 >>> 2]); // L: 64
			if (var4 < var2 - 1) { // L: 65
				int var6 = var0[var4 + 1] & 255; // L: 66
				var3.append(class404.field4534[(var5 & 3) << 4 | var6 >>> 4]); // L: 67
				if (var4 < var2 - 2) { // L: 68
					int var7 = var0[var4 + 2] & 255; // L: 69
					var3.append(class404.field4534[(var6 & 15) << 2 | var7 >>> 6]).append(class404.field4534[var7 & 63]); // L: 70
				} else {
					var3.append(class404.field4534[(var6 & 15) << 2]).append("="); // L: 72
				}
			} else {
				var3.append(class404.field4534[(var5 & 3) << 4]).append("=="); // L: 74
			}
		}

		String var1 = var3.toString(); // L: 76
		return var1; // L: 78
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lng;B)I",
		garbageValue = "8"
	)
	static int method7024(Widget var0) {
		if (var0.type != 11) { // L: 1603
			Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize - 1] = ""; // L: 1604
			return 1; // L: 1605
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 1607
			Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var0.method6814(var1); // L: 1608
			return 1; // L: 1609
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "519993372"
	)
	static int method7019(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) { // L: 3291
			if (class223.guestClanSettings != null) { // L: 3292
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3293
				class53.field363 = class223.guestClanSettings; // L: 3294
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3296
			}

			return 1; // L: 3297
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) { // L: 3299
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3300
				if (Client.currentClanSettings[var3] != null) { // L: 3301
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3302
					class53.field363 = Client.currentClanSettings[var3]; // L: 3303
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3305
				}

				return 1; // L: 3306
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) { // L: 3308
				Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = class53.field363.name; // L: 3309
				return 1; // L: 3310
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) { // L: 3312
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field363.allowGuests ? 1 : 0; // L: 3313
				return 1; // L: 3314
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) { // L: 3316
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field363.field1746; // L: 3317
				return 1; // L: 3318
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) { // L: 3320
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field363.field1748; // L: 3321
				return 1; // L: 3322
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) { // L: 3324
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field363.field1743; // L: 3325
				return 1; // L: 3326
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) { // L: 3328
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field363.field1742; // L: 3329
				return 1; // L: 3330
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) { // L: 3332
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field363.memberCount; // L: 3333
				return 1; // L: 3334
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) { // L: 3336
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3337
				Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = class53.field363.memberNames[var3]; // L: 3338
				return 1; // L: 3339
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) { // L: 3341
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3342
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field363.memberRanks[var3]; // L: 3343
				return 1; // L: 3344
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) { // L: 3346
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field363.bannedMemberCount; // L: 3347
				return 1; // L: 3348
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) { // L: 3350
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3351
				Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = class53.field363.bannedMemberNames[var3]; // L: 3352
				return 1; // L: 3353
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) { // L: 3355
					Interpreter.Interpreter_intStackSize -= 3; // L: 3356
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3357
					var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3358
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3359
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field363.method3381(var3, var6, var5); // L: 3360
					return 1; // L: 3361
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) { // L: 3363
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field363.currentOwner; // L: 3364
					return 1; // L: 3365
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) { // L: 3367
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field363.field1753; // L: 3368
					return 1; // L: 3369
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) { // L: 3371
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field363.method3390(Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]); // L: 3372
					return 1; // L: 3373
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) { // L: 3375
					Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = class53.field363.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]]; // L: 3376
					return 1; // L: 3377
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) { // L: 3379
					Interpreter.Interpreter_intStackSize -= 2; // L: 3380
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3381
					var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3382
					class133.method3113(var6, var3); // L: 3383
					return 1; // L: 3384
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) { // L: 3386
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3387
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field363.field1750[var3]; // L: 3388
					return 1; // L: 3389
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) { // L: 3391
						Interpreter.Interpreter_intStackSize -= 3; // L: 3392
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3393
						boolean var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 3394
						var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3395
						HealthBar.method2653(var5, var3, var4); // L: 3396
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) { // L: 3398
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3399
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field363.field1751[var3] ? 1 : 0; // L: 3400
						return 1; // L: 3401
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) { // L: 3403
						if (class316.guestClanChannel != null) { // L: 3404
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3405
							class12.field53 = class316.guestClanChannel; // L: 3406
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3408
						}

						return 1; // L: 3409
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) { // L: 3411
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3412
						if (Client.currentClanChannels[var3] != null) { // L: 3413
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3414
							class12.field53 = Client.currentClanChannels[var3]; // L: 3415
							Interpreter.field884 = var3; // L: 3416
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3418
						}

						return 1; // L: 3419
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) { // L: 3421
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = class12.field53.name; // L: 3422
						return 1; // L: 3423
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) { // L: 3425
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class12.field53.field1801; // L: 3426
						return 1; // L: 3427
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) { // L: 3429
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class12.field53.field1806; // L: 3430
						return 1; // L: 3431
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) { // L: 3433
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class12.field53.method3481(); // L: 3434
						return 1; // L: 3435
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) { // L: 3437
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3438
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ((ClanChannelMember)class12.field53.members.get(var3)).username.getName(); // L: 3439
						return 1; // L: 3440
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) { // L: 3442
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3443
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((ClanChannelMember)class12.field53.members.get(var3)).rank; // L: 3444
						return 1; // L: 3445
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) { // L: 3447
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3448
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((ClanChannelMember)class12.field53.members.get(var3)).world; // L: 3449
						return 1; // L: 3450
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) { // L: 3452
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3453
						class93.method2442(Interpreter.field884, var3); // L: 3454
						return 1; // L: 3455
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) { // L: 3457
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class12.field53.method3487(Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]); // L: 3458
						return 1; // L: 3459
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) { // L: 3461
						Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = class12.field53.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]]; // L: 3462
						return 1; // L: 3463
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) { // L: 3465
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class73.field920 != null ? 1 : 0; // L: 3466
						return 1; // L: 3467
					} else {
						return 2; // L: 3469
					}
				}
			}
		}
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1764737119"
	)
	static void method7026() {
		Client.field718 = true; // L: 1266
		if (ScriptFrame.varcs != null && ScriptFrame.varcs.method2809()) { // L: 1267
			ScriptFrame.varcs.write();
		}

		class9.method80(); // L: 1268
		Message.method1173(); // L: 1269
		if (ByteArrayPool.mouseRecorder != null) { // L: 1270
			ByteArrayPool.mouseRecorder.isRunning = false;
		}

		ByteArrayPool.mouseRecorder = null; // L: 1271
		Client.packetWriter.close(); // L: 1272
		if (GameEngine.taskHandler != null) { // L: 1273
			try {
				GameEngine.taskHandler.close(); // L: 1275
			} catch (Exception var3) { // L: 1277
			}
		}

		GameEngine.taskHandler = null; // L: 1279
		class133.method3119(); // L: 1280
		class143.method3200(); // L: 1281
		if (Actor.scene != null) { // L: 1282
			Actor.scene.clear();
		}

		for (int var1 = 0; var1 < Client.collisionMaps.length; ++var1) { // L: 1283
			if (Client.collisionMaps[var1] != null) {
				Client.collisionMaps[var1].clear();
			}
		}

		Tiles.worldMap = null; // L: 1284
		class169.method3521(0, 0); // L: 1285
		GrandExchangeOfferOwnWorldComparator.method1192(); // L: 1286
		Client.playingJingle = false; // L: 1287
		InterfaceParent.method2350(); // L: 1288
		if (class125.pcmPlayer1 != null) { // L: 1289
			class125.pcmPlayer1.shutdown();
		}

		class356.field3897.method7213(); // L: 1290
		class193.method3781(); // L: 1291
		if (InvDefinition.urlRequester != null) { // L: 1292
			InvDefinition.urlRequester.close(); // L: 1293
		}

		class94.method2451(); // L: 1295
		JagexCache.JagexCache_dat2File = null; // L: 1296
		JagexCache.JagexCache_idx255File = null; // L: 1297
		class173.JagexCache_idxFiles = null; // L: 1298
		class136.method3140(); // L: 1299
		class155.field1730 = null; // L: 1300
		Client.archiveLoaders.clear(); // L: 1301
		Client.field786 = 0; // L: 1302
		class356.field3897 = new class378(); // L: 1303
		InvDefinition.urlRequester = new class114(class193.client.field617, 220); // L: 1304

		try {
			class30.method422("oldschool", KeyHandler.field152, class129.field1536.name, 0, 23); // L: 1306
		} catch (IOException var2) { // L: 1308
			throw new RuntimeException(var2); // L: 1309
		}

		class155.field1730 = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 1311
		GameEngine.taskHandler = new TaskHandler(); // L: 1312
		class193.client.method490(); // L: 1313
		WorldMapDecoration.method5033(class93.field1165); // L: 1314
		Interpreter.method2106(0); // L: 1315
	} // L: 1316
}
