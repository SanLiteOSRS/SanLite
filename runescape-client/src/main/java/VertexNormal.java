import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jx")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1399236901
	)
	@Export("x")
	int x;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -817517075
	)
	@Export("y")
	int y;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -760419501
	)
	@Export("z")
	int z;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -180792829
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	}

	@ObfuscatedSignature(
		descriptor = "(Ljx;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x; // L: 12
		this.y = var1.y; // L: 13
		this.z = var1.z; // L: 14
		this.magnitude = var1.magnitude; // L: 15
	} // L: 16

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(DDIS)[D",
		garbageValue = "512"
	)
	public static double[] method4921(double var0, double var2, int var4) {
		int var5 = var4 * 2 + 1; // L: 9
		double[] var6 = new double[var5]; // L: 10
		int var7 = -var4;

		for (int var8 = 0; var7 <= var4; ++var8) {
			double var15 = ((double)var7 - var0) / var2; // L: 17
			double var13 = Math.exp(-var15 * var15 / 2.0D) / Math.sqrt(6.283185307179586D); // L: 19
			double var11 = var13 / var2; // L: 21
			var6[var8] = var11; // L: 23
			++var7; // L: 11
		}

		return var6; // L: 25
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1596696575"
	)
	static final int method4920() {
		return ViewportMouse.ViewportMouse_x; // L: 96
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "1251567358"
	)
	static int method4922(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) { // L: 3203
			if (class389.guestClanSettings != null) { // L: 3204
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3205
				class309.field3452 = class389.guestClanSettings; // L: 3206
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3208
			}

			return 1; // L: 3209
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) { // L: 3211
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3212
				if (Client.currentClanSettings[var3] != null) { // L: 3213
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3214
					class309.field3452 = Client.currentClanSettings[var3]; // L: 3215
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3217
				}

				return 1; // L: 3218
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) { // L: 3220
				Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = class309.field3452.name; // L: 3221
				return 1; // L: 3222
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) { // L: 3224
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field3452.allowGuests ? 1 : 0; // L: 3225
				return 1; // L: 3226
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) { // L: 3228
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field3452.field1694; // L: 3229
				return 1; // L: 3230
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) { // L: 3232
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field3452.field1695; // L: 3233
				return 1; // L: 3234
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) { // L: 3236
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field3452.field1709; // L: 3237
				return 1; // L: 3238
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) { // L: 3240
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field3452.field1697; // L: 3241
				return 1; // L: 3242
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) { // L: 3244
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field3452.memberCount; // L: 3245
				return 1; // L: 3246
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) { // L: 3248
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3249
				Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = class309.field3452.memberNames[var3]; // L: 3250
				return 1; // L: 3251
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) { // L: 3253
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3254
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field3452.memberRanks[var3]; // L: 3255
				return 1; // L: 3256
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) { // L: 3258
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field3452.bannedMemberCount; // L: 3259
				return 1; // L: 3260
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) { // L: 3262
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3263
				Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = class309.field3452.bannedMemberNames[var3]; // L: 3264
				return 1; // L: 3265
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) { // L: 3267
					Interpreter.Interpreter_intStackSize -= 3; // L: 3268
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3269
					var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3270
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3271
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field3452.method3266(var3, var6, var5); // L: 3272
					return 1; // L: 3273
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) { // L: 3275
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field3452.currentOwner; // L: 3276
					return 1; // L: 3277
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) { // L: 3279
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field3452.field1706; // L: 3280
					return 1; // L: 3281
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) { // L: 3283
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field3452.method3200(Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]); // L: 3284
					return 1; // L: 3285
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) { // L: 3287
					Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = class309.field3452.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]]; // L: 3288
					return 1; // L: 3289
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) { // L: 3291
					Interpreter.Interpreter_intStackSize -= 2; // L: 3292
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3293
					var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3294
					ChatChannel.method2157(var6, var3); // L: 3295
					return 1; // L: 3296
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) { // L: 3298
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3299
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field3452.field1703[var3]; // L: 3300
					return 1; // L: 3301
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) { // L: 3303
						Interpreter.Interpreter_intStackSize -= 3; // L: 3304
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3305
						boolean var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 3306
						var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3307
						GrandExchangeOfferOwnWorldComparator.method1194(var5, var3, var4); // L: 3308
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) { // L: 3310
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3311
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field3452.field1704[var3] ? 1 : 0; // L: 3312
						return 1; // L: 3313
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) { // L: 3315
						if (VerticalAlignment.guestClanChannel != null) { // L: 3316
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3317
							Interpreter.field872 = VerticalAlignment.guestClanChannel; // L: 3318
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3320
						}

						return 1; // L: 3321
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) { // L: 3323
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3324
						if (Client.currentClanChannels[var3] != null) { // L: 3325
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3326
							Interpreter.field872 = Client.currentClanChannels[var3]; // L: 3327
							Interpreter.field865 = var3; // L: 3328
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3330
						}

						return 1; // L: 3331
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) { // L: 3333
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = Interpreter.field872.name; // L: 3334
						return 1; // L: 3335
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) { // L: 3337
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.field872.field1767; // L: 3338
						return 1; // L: 3339
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) { // L: 3341
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.field872.field1766; // L: 3342
						return 1; // L: 3343
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) { // L: 3345
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.field872.method3346(); // L: 3346
						return 1; // L: 3347
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) { // L: 3349
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3350
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ((ClanChannelMember)Interpreter.field872.members.get(var3)).username.getName(); // L: 3351
						return 1; // L: 3352
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) { // L: 3354
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3355
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((ClanChannelMember)Interpreter.field872.members.get(var3)).rank; // L: 3356
						return 1; // L: 3357
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) { // L: 3359
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3360
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((ClanChannelMember)Interpreter.field872.members.get(var3)).world; // L: 3361
						return 1; // L: 3362
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) { // L: 3364
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3365
						class300.method5688(Interpreter.field865, var3); // L: 3366
						return 1; // L: 3367
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) { // L: 3369
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.field872.method3338(Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]); // L: 3370
						return 1; // L: 3371
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) { // L: 3373
						Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = Interpreter.field872.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]]; // L: 3374
						return 1; // L: 3375
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) { // L: 3377
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class127.field1495 != null ? 1 : 0; // L: 3378
						return 1; // L: 3379
					} else {
						return 2; // L: 3381
					}
				}
			}
		}
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2021351329"
	)
	static final void method4919() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8355 8356 8362
			if (var0.hitpoints == -1) { // L: 8357
				var0.delay = 0; // L: 8358
				DirectByteArrayCopier.method6568(var0); // L: 8359
			} else {
				var0.remove(); // L: 8361
			}
		}

	} // L: 8364
}
