import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ca")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("bj")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("jd")
	@ObfuscatedGetter(
		intValue = -502599913
	)
	static int field855;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 213423769
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1140450119
	)
	@Export("x")
	int x;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1180213293
	)
	@Export("y")
	int y;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 252565120
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -587827913
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1981734327
	)
	int field861;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 775499377
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lbn;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 96078857
	)
	int field867;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -448105717
	)
	int field865;
	@ObfuscatedName("aq")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 2064097821
	)
	int field875;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lbn;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque(); // L: 11
	}

	ObjectSound() {
	} // L: 27

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1805200159"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId; // L: 44
		ObjectComposition var2 = this.obj.transform(); // L: 45
		if (var2 != null) { // L: 46
			this.soundEffectId = var2.ambientSoundId; // L: 47
			this.field861 = var2.int7 * 128; // L: 48
			this.field867 = var2.int5; // L: 49
			this.field865 = var2.int6; // L: 50
			this.soundEffectIds = var2.soundEffectIds; // L: 51
		} else {
			this.soundEffectId = -1; // L: 54
			this.field861 = 0; // L: 55
			this.field867 = 0; // L: 56
			this.field865 = 0; // L: 57
			this.soundEffectIds = null; // L: 58
		}

		if (var1 != this.soundEffectId && this.stream1 != null) { // L: 60
			class162.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-42"
	)
	static void method1927() {
		Tiles.field1040 = null; // L: 61
		class227.field2543 = null; // L: 62
		class172.field1855 = null; // L: 63
		ModelData0.field2833 = null; // L: 64
		BufferedNetSocket.field4679 = null; // L: 65
		class217.field2409 = null; // L: 66
		class162.field1794 = null; // L: 67
		Fonts.Tiles_hue = null; // L: 68
		class466.Tiles_saturation = null; // L: 69
		Tiles.Tiles_lightness = null; // L: 70
		class128.Tiles_hueMultiplier = null; // L: 71
		Interpreter.field888 = null; // L: 72
	} // L: 73

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "449179665"
	)
	static int method1930(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) { // L: 3245
			if (Players.guestClanSettings != null) { // L: 3246
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 1; // L: 3247
				class466.field4802 = Players.guestClanSettings; // L: 3248
			} else {
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 3250
			}

			return 1; // L: 3251
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) { // L: 3253
				var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3254
				if (Client.currentClanSettings[var3] != null) { // L: 3255
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 1; // L: 3256
					class466.field4802 = Client.currentClanSettings[var3]; // L: 3257
				} else {
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 3259
				}

				return 1; // L: 3260
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) { // L: 3262
				Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = class466.field4802.name; // L: 3263
				return 1; // L: 3264
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) { // L: 3266
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class466.field4802.allowGuests ? 1 : 0; // L: 3267
				return 1; // L: 3268
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) { // L: 3270
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class466.field4802.field1746; // L: 3271
				return 1; // L: 3272
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) { // L: 3274
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class466.field4802.field1734; // L: 3275
				return 1; // L: 3276
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) { // L: 3278
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class466.field4802.field1735; // L: 3279
				return 1; // L: 3280
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) { // L: 3282
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class466.field4802.field1736; // L: 3283
				return 1; // L: 3284
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) { // L: 3286
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class466.field4802.memberCount; // L: 3287
				return 1; // L: 3288
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) { // L: 3290
				var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3291
				Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = class466.field4802.memberNames[var3]; // L: 3292
				return 1; // L: 3293
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) { // L: 3295
				var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3296
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class466.field4802.memberRanks[var3]; // L: 3297
				return 1; // L: 3298
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) { // L: 3300
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class466.field4802.bannedMemberCount; // L: 3301
				return 1; // L: 3302
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) { // L: 3304
				var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3305
				Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = class466.field4802.bannedMemberNames[var3]; // L: 3306
				return 1; // L: 3307
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) { // L: 3309
					SoundCache.Interpreter_intStackSize -= 3; // L: 3310
					var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 3311
					var6 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 3312
					var5 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2]; // L: 3313
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class466.field4802.method3191(var3, var6, var5); // L: 3314
					return 1; // L: 3315
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) { // L: 3317
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class466.field4802.currentOwner; // L: 3318
					return 1; // L: 3319
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) { // L: 3321
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class466.field4802.field1729; // L: 3322
					return 1; // L: 3323
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) { // L: 3325
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class466.field4802.method3189(Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]); // L: 3326
					return 1; // L: 3327
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) { // L: 3329
					Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1] = class466.field4802.getSortedMembers()[Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1]]; // L: 3330
					return 1; // L: 3331
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) { // L: 3333
					SoundCache.Interpreter_intStackSize -= 2; // L: 3334
					var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 3335
					var6 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 3336
					class386.method7205(var6, var3); // L: 3337
					return 1; // L: 3338
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) { // L: 3340
					var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3341
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class466.field4802.field1742[var3]; // L: 3342
					return 1; // L: 3343
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) { // L: 3345
						SoundCache.Interpreter_intStackSize -= 3; // L: 3346
						var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 3347
						boolean var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1] == 1; // L: 3348
						var5 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2]; // L: 3349
						SoundSystem.method870(var5, var3, var4); // L: 3350
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) { // L: 3352
						var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3353
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class466.field4802.field1743[var3] ? 1 : 0; // L: 3354
						return 1; // L: 3355
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) { // L: 3357
						if (VerticalAlignment.guestClanChannel != null) { // L: 3358
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 1; // L: 3359
							class396.field4477 = VerticalAlignment.guestClanChannel; // L: 3360
						} else {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 3362
						}

						return 1; // L: 3363
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) { // L: 3365
						var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3366
						if (Client.currentClanChannels[var3] != null) { // L: 3367
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 1; // L: 3368
							class396.field4477 = Client.currentClanChannels[var3]; // L: 3369
							class113.field1452 = var3; // L: 3370
						} else {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 3372
						}

						return 1; // L: 3373
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) { // L: 3375
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = class396.field4477.name; // L: 3376
						return 1; // L: 3377
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) { // L: 3379
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class396.field4477.field1804; // L: 3380
						return 1; // L: 3381
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) { // L: 3383
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class396.field4477.field1800; // L: 3384
						return 1; // L: 3385
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) { // L: 3387
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class396.field4477.method3301(); // L: 3388
						return 1; // L: 3389
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) { // L: 3391
						var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3392
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ((ClanChannelMember)class396.field4477.members.get(var3)).username.getName(); // L: 3393
						return 1; // L: 3394
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) { // L: 3396
						var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3397
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = ((ClanChannelMember)class396.field4477.members.get(var3)).rank; // L: 3398
						return 1; // L: 3399
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) { // L: 3401
						var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3402
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = ((ClanChannelMember)class396.field4477.members.get(var3)).world; // L: 3403
						return 1; // L: 3404
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) { // L: 3406
						var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3407
						UserComparator10.method2907(class113.field1452, var3); // L: 3408
						return 1; // L: 3409
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) { // L: 3411
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class396.field4477.method3302(Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]); // L: 3412
						return 1; // L: 3413
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) { // L: 3415
						Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1] = class396.field4477.getSortedMembers()[Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1]]; // L: 3416
						return 1; // L: 3417
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) { // L: 3419
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class139.field1654 != null ? 1 : 0; // L: 3420
						return 1; // L: 3421
					} else {
						return 2; // L: 3423
					}
				}
			}
		}
	}

	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-24646"
	)
	static void method1931() {
		Client.packetWriter.addNode(ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3182, Client.packetWriter.isaacCipher)); // L: 12838
		Client.oculusOrbState = 0; // L: 12839
	} // L: 12840
}
