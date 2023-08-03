import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ns")
public class class345 {
	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "[Lud;"
	)
	static SpritePixels[] field3858;

	static {
		Math.sqrt(8192.0D); // L: 9
	} // L: 10

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([BI)Ljava/lang/String;",
		garbageValue = "-536830617"
	)
	public static String method6646(byte[] var0) {
		int var2 = var0.length; // L: 59
		StringBuilder var3 = new StringBuilder(); // L: 61

		for (int var4 = 0; var4 < var2 + 0; var4 += 3) { // L: 62
			int var5 = var0[var4] & 255; // L: 63
			var3.append(class386.field4431[var5 >>> 2]); // L: 64
			if (var4 < var2 - 1) { // L: 65
				int var6 = var0[var4 + 1] & 255; // L: 66
				var3.append(class386.field4431[(var5 & 3) << 4 | var6 >>> 4]); // L: 67
				if (var4 < var2 - 2) { // L: 68
					int var7 = var0[var4 + 2] & 255; // L: 69
					var3.append(class386.field4431[(var6 & 15) << 2 | var7 >>> 6]).append(class386.field4431[var7 & 63]); // L: 70
				} else {
					var3.append(class386.field4431[(var6 & 15) << 2]).append("="); // L: 72
				}
			} else {
				var3.append(class386.field4431[(var5 & 3) << 4]).append("=="); // L: 74
			}
		}

		String var1 = var3.toString(); // L: 76
		return var1; // L: 78
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-115"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17; // L: 19
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lby;I)V",
		garbageValue = "1549991189"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false; // L: 241
		if (var0.sound != null) { // L: 242
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1); // L: 243
		}

	} // L: 244

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "1256277707"
	)
	static int method6645(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) { // L: 3242
			if (class11.guestClanSettings != null) { // L: 3243
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3244
				PacketBufferNode.field3212 = class11.guestClanSettings; // L: 3245
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3247
			}

			return 1; // L: 3248
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) { // L: 3250
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3251
				if (Client.currentClanSettings[var3] != null) { // L: 3252
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3253
					PacketBufferNode.field3212 = Client.currentClanSettings[var3]; // L: 3254
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3256
				}

				return 1; // L: 3257
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) { // L: 3259
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = PacketBufferNode.field3212.name; // L: 3260
				return 1; // L: 3261
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) { // L: 3263
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = PacketBufferNode.field3212.allowGuests ? 1 : 0; // L: 3264
				return 1; // L: 3265
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) { // L: 3267
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = PacketBufferNode.field3212.field1712; // L: 3268
				return 1; // L: 3269
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) { // L: 3271
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = PacketBufferNode.field3212.field1706; // L: 3272
				return 1; // L: 3273
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) { // L: 3275
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = PacketBufferNode.field3212.field1713; // L: 3276
				return 1; // L: 3277
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) { // L: 3279
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = PacketBufferNode.field3212.field1714; // L: 3280
				return 1; // L: 3281
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) { // L: 3283
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = PacketBufferNode.field3212.memberCount; // L: 3284
				return 1; // L: 3285
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) { // L: 3287
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3288
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = PacketBufferNode.field3212.memberNames[var3]; // L: 3289
				return 1; // L: 3290
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) { // L: 3292
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3293
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = PacketBufferNode.field3212.memberRanks[var3]; // L: 3294
				return 1; // L: 3295
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) { // L: 3297
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = PacketBufferNode.field3212.bannedMemberCount; // L: 3298
				return 1; // L: 3299
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) { // L: 3301
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3302
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = PacketBufferNode.field3212.bannedMemberNames[var3]; // L: 3303
				return 1; // L: 3304
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) { // L: 3306
					Interpreter.Interpreter_intStackSize -= 3; // L: 3307
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3308
					var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3309
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3310
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = PacketBufferNode.field3212.method3270(var3, var6, var5); // L: 3311
					return 1; // L: 3312
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) { // L: 3314
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = PacketBufferNode.field3212.currentOwner; // L: 3315
					return 1; // L: 3316
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) { // L: 3318
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = PacketBufferNode.field3212.field1725; // L: 3319
					return 1; // L: 3320
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) { // L: 3322
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = PacketBufferNode.field3212.method3241(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]); // L: 3323
					return 1; // L: 3324
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) { // L: 3326
					Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = PacketBufferNode.field3212.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]]; // L: 3327
					return 1; // L: 3328
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) { // L: 3330
					Interpreter.Interpreter_intStackSize -= 2; // L: 3331
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3332
					var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3333
					class504.method8957(var6, var3); // L: 3334
					return 1; // L: 3335
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) { // L: 3337
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3338
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = PacketBufferNode.field3212.field1720[var3]; // L: 3339
					return 1; // L: 3340
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) { // L: 3342
						Interpreter.Interpreter_intStackSize -= 3; // L: 3343
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3344
						boolean var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 3345
						var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3346
						class150.method3196(var5, var3, var4); // L: 3347
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) { // L: 3349
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3350
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = PacketBufferNode.field3212.field1721[var3] ? 1 : 0; // L: 3351
						return 1; // L: 3352
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) { // L: 3354
						if (WorldMapLabelSize.guestClanChannel != null) { // L: 3355
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3356
							class89.field1092 = WorldMapLabelSize.guestClanChannel; // L: 3357
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3359
						}

						return 1; // L: 3360
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) { // L: 3362
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3363
						if (Client.currentClanChannels[var3] != null) { // L: 3364
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3365
							class89.field1092 = Client.currentClanChannels[var3]; // L: 3366
							class344.field3842 = var3; // L: 3367
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3369
						}

						return 1; // L: 3370
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) { // L: 3372
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class89.field1092.name; // L: 3373
						return 1; // L: 3374
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) { // L: 3376
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class89.field1092.field1780; // L: 3377
						return 1; // L: 3378
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) { // L: 3380
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class89.field1092.field1778; // L: 3381
						return 1; // L: 3382
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) { // L: 3384
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class89.field1092.method3383(); // L: 3385
						return 1; // L: 3386
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) { // L: 3388
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3389
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ((ClanChannelMember)class89.field1092.members.get(var3)).username.getName(); // L: 3390
						return 1; // L: 3391
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) { // L: 3393
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3394
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((ClanChannelMember)class89.field1092.members.get(var3)).rank; // L: 3395
						return 1; // L: 3396
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) { // L: 3398
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3399
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((ClanChannelMember)class89.field1092.members.get(var3)).world; // L: 3400
						return 1; // L: 3401
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) { // L: 3403
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3404
						Client.method1806(class344.field3842, var3); // L: 3405
						return 1; // L: 3406
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) { // L: 3408
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class89.field1092.method3370(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]); // L: 3409
						return 1; // L: 3410
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) { // L: 3412
						Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = class89.field1092.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]]; // L: 3413
						return 1; // L: 3414
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) { // L: 3416
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class135.field1600 != null ? 1 : 0; // L: 3417
						return 1; // L: 3418
					} else {
						return 2; // L: 3420
					}
				}
			}
		}
	}
}
