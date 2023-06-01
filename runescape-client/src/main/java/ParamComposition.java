import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("he")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("ParamDefinition_archive")
	static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("ParamComposition_cached")
	public static EvictingDualNodeHashTable ParamComposition_cached;
	@ObfuscatedName("ar")
	@Export("type")
	char type;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -720888109
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("at")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("ax")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamComposition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	ParamComposition() {
		this.autoDisable = true; // L: 16
	} // L: 18

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "17"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 35

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)V",
		garbageValue = "64"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 39
			if (var2 == 0) { // L: 40
				return; // L: 43
			}

			this.decodeNext(var1, var2); // L: 41
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltc;II)V",
		garbageValue = "-1094131260"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 46
			byte var4 = var1.readByte(); // L: 48
			int var5 = var4 & 255; // L: 50
			if (var5 == 0) { // L: 51
				throw new IllegalArgumentException("" + Integer.toString(var5, 16));
			}

			if (var5 >= 128 && var5 < 160) { // L: 52
				char var6 = class382.cp1252AsciiExtension[var5 - 128]; // L: 53
				if (var6 == 0) { // L: 54
					var6 = '?';
				}

				var5 = var6; // L: 55
			}

			char var3 = (char)var5; // L: 57
			this.type = var3; // L: 59
		} else if (var2 == 2) { // L: 61
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) { // L: 62
			this.autoDisable = false;
		} else if (var2 == 5) { // L: 63
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	} // L: 65

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "39"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's'; // L: 68
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lni;S)V",
		garbageValue = "3642"
	)
	public static void method3796(AbstractArchive var0) {
		ParamDefinition_archive = var0; // L: 21
	} // L: 22

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZB)I",
		garbageValue = "72"
	)
	static int method3785(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) { // L: 3203
			if (InterfaceParent.guestClanSettings != null) { // L: 3204
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 1; // L: 3205
				class409.field4563 = InterfaceParent.guestClanSettings; // L: 3206
			} else {
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 3208
			}

			return 1; // L: 3209
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) { // L: 3211
				var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3212
				if (Client.currentClanSettings[var3] != null) { // L: 3213
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 1; // L: 3214
					class409.field4563 = Client.currentClanSettings[var3]; // L: 3215
				} else {
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 3217
				}

				return 1; // L: 3218
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) { // L: 3220
				Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = class409.field4563.name; // L: 3221
				return 1; // L: 3222
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) { // L: 3224
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class409.field4563.allowGuests ? 1 : 0; // L: 3225
				return 1; // L: 3226
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) { // L: 3228
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class409.field4563.field1698; // L: 3229
				return 1; // L: 3230
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) { // L: 3232
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class409.field4563.field1699; // L: 3233
				return 1; // L: 3234
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) { // L: 3236
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class409.field4563.field1700; // L: 3237
				return 1; // L: 3238
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) { // L: 3240
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class409.field4563.field1701; // L: 3241
				return 1; // L: 3242
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) { // L: 3244
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class409.field4563.memberCount; // L: 3245
				return 1; // L: 3246
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) { // L: 3248
				var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3249
				Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = class409.field4563.memberNames[var3]; // L: 3250
				return 1; // L: 3251
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) { // L: 3253
				var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3254
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class409.field4563.memberRanks[var3]; // L: 3255
				return 1; // L: 3256
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) { // L: 3258
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class409.field4563.bannedMemberCount; // L: 3259
				return 1; // L: 3260
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) { // L: 3262
				var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3263
				Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = class409.field4563.bannedMemberNames[var3]; // L: 3264
				return 1; // L: 3265
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) { // L: 3267
					class336.Interpreter_intStackSize -= 3; // L: 3268
					var3 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 3269
					var6 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 3270
					var5 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 2]; // L: 3271
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class409.field4563.method3193(var3, var6, var5); // L: 3272
					return 1; // L: 3273
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) { // L: 3275
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class409.field4563.currentOwner; // L: 3276
					return 1; // L: 3277
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) { // L: 3279
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class409.field4563.field1690; // L: 3280
					return 1; // L: 3281
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) { // L: 3283
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class409.field4563.method3230(Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]); // L: 3284
					return 1; // L: 3285
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) { // L: 3287
					Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize - 1] = class409.field4563.getSortedMembers()[Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize - 1]]; // L: 3288
					return 1; // L: 3289
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) { // L: 3291
					class336.Interpreter_intStackSize -= 2; // L: 3292
					var3 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 3293
					var6 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 3294
					DevicePcmPlayerProvider.method296(var6, var3); // L: 3295
					return 1; // L: 3296
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) { // L: 3298
					var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3299
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class409.field4563.field1694[var3]; // L: 3300
					return 1; // L: 3301
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) { // L: 3303
						class336.Interpreter_intStackSize -= 3; // L: 3304
						var3 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 3305
						boolean var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1] == 1; // L: 3306
						var5 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 2]; // L: 3307
						ModeWhere.method6947(var5, var3, var4); // L: 3308
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) { // L: 3310
						var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3311
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class409.field4563.field1707[var3] ? 1 : 0; // L: 3312
						return 1; // L: 3313
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) { // L: 3315
						if (UserComparator4.guestClanChannel != null) { // L: 3316
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 1; // L: 3317
							class190.field1975 = UserComparator4.guestClanChannel; // L: 3318
						} else {
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 3320
						}

						return 1; // L: 3321
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) { // L: 3323
						var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3324
						if (Client.currentClanChannels[var3] != null) { // L: 3325
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 1; // L: 3326
							class190.field1975 = Client.currentClanChannels[var3]; // L: 3327
							SpotAnimationDefinition.field2083 = var3; // L: 3328
						} else {
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 3330
						}

						return 1; // L: 3331
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) { // L: 3333
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = class190.field1975.name; // L: 3334
						return 1; // L: 3335
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) { // L: 3337
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class190.field1975.field1768; // L: 3338
						return 1; // L: 3339
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) { // L: 3341
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class190.field1975.field1762; // L: 3342
						return 1; // L: 3343
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) { // L: 3345
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class190.field1975.method3316(); // L: 3346
						return 1; // L: 3347
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) { // L: 3349
						var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3350
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ((ClanChannelMember)class190.field1975.members.get(var3)).username.getName(); // L: 3351
						return 1; // L: 3352
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) { // L: 3354
						var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3355
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = ((ClanChannelMember)class190.field1975.members.get(var3)).rank; // L: 3356
						return 1; // L: 3357
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) { // L: 3359
						var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3360
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = ((ClanChannelMember)class190.field1975.members.get(var3)).world; // L: 3361
						return 1; // L: 3362
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) { // L: 3364
						var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3365
						Projectile.method2098(SpotAnimationDefinition.field2083, var3); // L: 3366
						return 1; // L: 3367
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) { // L: 3369
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class190.field1975.method3317(Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]); // L: 3370
						return 1; // L: 3371
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) { // L: 3373
						Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize - 1] = class190.field1975.getSortedMembers()[Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize - 1]]; // L: 3374
						return 1; // L: 3375
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) { // L: 3377
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class300.field3364 != null ? 1 : 0; // L: 3378
						return 1; // L: 3379
					} else {
						return 2; // L: 3381
					}
				}
			}
		}
	}
}
