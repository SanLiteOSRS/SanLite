import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fc")
public class class148 extends class143 {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 156285675
	)
	static int field1662;
	@ObfuscatedName("cx")
	@Export("otp")
	static String otp;
	@ObfuscatedName("hf")
	static String field1665;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -66437073
	)
	int field1661;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -319512785
	)
	int field1660;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 896547871
	)
	int field1659;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1054144465
	)
	int field1664;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfm;)V"
	)
	class148(class146 var1) {
		this.this$0 = var1; // L: 289
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-411371469"
	)
	void vmethod3531(Buffer var1) {
		this.field1661 = var1.readInt(); // L: 292
		this.field1664 = var1.readInt(); // L: 293
		this.field1660 = var1.readUnsignedByte(); // L: 294
		this.field1659 = var1.readUnsignedByte(); // L: 295
	} // L: 296

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "1048713263"
	)
	void vmethod3529(ClanSettings var1) {
		var1.method3353(this.field1661, this.field1664, this.field1660, this.field1659); // L: 299
	} // L: 300

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-117"
	)
	static void method3273() {
		Tiles.field1021 = null; // L: 61
		Tiles.field1011 = null; // L: 62
		class141.field1628 = null; // L: 63
		class208.field2278 = null; // L: 64
		Tiles.field1012 = null; // L: 65
		AbstractRasterProvider.field5260 = null; // L: 66
		class420.field4590 = null; // L: 67
		GrandExchangeOfferWorldComparator.Tiles_hue = null; // L: 68
		class341.Tiles_saturation = null; // L: 69
		class515.Tiles_lightness = null; // L: 70
		class309.Tiles_hueMultiplier = null; // L: 71
		class228.field2427 = null; // L: 72
	} // L: 73

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Ljava/io/File;I)V",
		garbageValue = "755843871"
	)
	static void method3280(File var0, File var1) {
		try {
			AccessFile var2 = new AccessFile(class317.JagexCache_locationFile, "rw", 10000L); // L: 273
			Buffer var3 = new Buffer(500); // L: 274
			var3.writeByte(3); // L: 275
			var3.writeByte(var1 != null ? 1 : 0); // L: 276
			var3.writeCESU8(var0.getPath()); // L: 277
			if (var1 != null) {
				var3.writeCESU8(""); // L: 278
			}

			var2.write(var3.array, 0, var3.offset); // L: 279
			var2.close(); // L: 280
		} catch (IOException var4) { // L: 282
			var4.printStackTrace(); // L: 283
		}

	} // L: 285

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "-85"
	)
	static int method3276(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) { // L: 3291
			if (class113.guestClanSettings != null) { // L: 3292
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 1; // L: 3293
				GrandExchangeOfferUnitPriceComparator.field4432 = class113.guestClanSettings; // L: 3294
			} else {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 3296
			}

			return 1; // L: 3297
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) { // L: 3299
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3300
				if (Client.currentClanSettings[var3] != null) { // L: 3301
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 1; // L: 3302
					GrandExchangeOfferUnitPriceComparator.field4432 = Client.currentClanSettings[var3]; // L: 3303
				} else {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 3305
				}

				return 1; // L: 3306
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) { // L: 3308
				Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.name; // L: 3309
				return 1; // L: 3310
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) { // L: 3312
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.allowGuests ? 1 : 0; // L: 3313
				return 1; // L: 3314
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) { // L: 3316
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.field1699; // L: 3317
				return 1; // L: 3318
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) { // L: 3320
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.field1707; // L: 3321
				return 1; // L: 3322
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) { // L: 3324
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.field1696; // L: 3325
				return 1; // L: 3326
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) { // L: 3328
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.field1702; // L: 3329
				return 1; // L: 3330
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) { // L: 3332
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.memberCount; // L: 3333
				return 1; // L: 3334
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) { // L: 3336
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3337
				Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.memberNames[var3]; // L: 3338
				return 1; // L: 3339
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) { // L: 3341
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3342
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.memberRanks[var3]; // L: 3343
				return 1; // L: 3344
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) { // L: 3346
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.bannedMemberCount; // L: 3347
				return 1; // L: 3348
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) { // L: 3350
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3351
				Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.bannedMemberNames[var3]; // L: 3352
				return 1; // L: 3353
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) { // L: 3355
					UserComparator6.Interpreter_intStackSize -= 3; // L: 3356
					var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 3357
					var6 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 3358
					var5 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2]; // L: 3359
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.method3400(var3, var6, var5); // L: 3360
					return 1; // L: 3361
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) { // L: 3363
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.currentOwner; // L: 3364
					return 1; // L: 3365
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) { // L: 3367
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.field1711; // L: 3368
					return 1; // L: 3369
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) { // L: 3371
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.method3389(Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]); // L: 3372
					return 1; // L: 3373
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) { // L: 3375
					Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.getSortedMembers()[Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1]]; // L: 3376
					return 1; // L: 3377
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) { // L: 3379
					UserComparator6.Interpreter_intStackSize -= 2; // L: 3380
					var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 3381
					var6 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 3382
					class518.method9255(var6, var3); // L: 3383
					return 1; // L: 3384
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) { // L: 3386
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3387
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.field1701[var3]; // L: 3388
					return 1; // L: 3389
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) { // L: 3391
						UserComparator6.Interpreter_intStackSize -= 3; // L: 3392
						var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 3393
						boolean var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1] == 1; // L: 3394
						var5 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2]; // L: 3395
						class9.method69(var5, var3, var4); // L: 3396
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) { // L: 3398
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3399
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.field1700[var3] ? 1 : 0; // L: 3400
						return 1; // L: 3401
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) { // L: 3403
						if (UserComparator4.guestClanChannel != null) { // L: 3404
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 1; // L: 3405
							class13.field54 = UserComparator4.guestClanChannel; // L: 3406
						} else {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 3408
						}

						return 1; // L: 3409
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) { // L: 3411
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3412
						if (Client.currentClanChannels[var3] != null) { // L: 3413
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 1; // L: 3414
							class13.field54 = Client.currentClanChannels[var3]; // L: 3415
							class108.field1381 = var3; // L: 3416
						} else {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 3418
						}

						return 1; // L: 3419
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) { // L: 3421
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = class13.field54.name; // L: 3422
						return 1; // L: 3423
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) { // L: 3425
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class13.field54.field1767; // L: 3426
						return 1; // L: 3427
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) { // L: 3429
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class13.field54.field1758; // L: 3430
						return 1; // L: 3431
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) { // L: 3433
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class13.field54.method3492(); // L: 3434
						return 1; // L: 3435
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) { // L: 3437
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3438
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ((ClanChannelMember)class13.field54.members.get(var3)).username.getName(); // L: 3439
						return 1; // L: 3440
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) { // L: 3442
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3443
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = ((ClanChannelMember)class13.field54.members.get(var3)).rank; // L: 3444
						return 1; // L: 3445
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) { // L: 3447
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3448
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = ((ClanChannelMember)class13.field54.members.get(var3)).world; // L: 3449
						return 1; // L: 3450
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) { // L: 3452
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3453
						MilliClock.method4268(class108.field1381, var3); // L: 3454
						return 1; // L: 3455
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) { // L: 3457
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class13.field54.method3495(Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]); // L: 3458
						return 1; // L: 3459
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) { // L: 3461
						Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1] = class13.field54.getSortedMembers()[Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1]]; // L: 3462
						return 1; // L: 3463
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) { // L: 3465
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class407.field4517 != null ? 1 : 0; // L: 3466
						return 1; // L: 3467
					} else {
						return 2; // L: 3469
					}
				}
			}
		}
	}
}
