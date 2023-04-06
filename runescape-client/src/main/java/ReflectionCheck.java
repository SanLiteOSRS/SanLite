import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bq")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = 722921933
	)
	static int field257;
	@ObfuscatedName("lv")
	@ObfuscatedGetter(
		intValue = -162942915
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;
	@ObfuscatedName("sb")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("friendsChatManager")
	static FriendsChatManager friendsChatManager;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1735261113
	)
	@Export("id")
	int id;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 944398989
	)
	@Export("size")
	int size;
	@ObfuscatedName("ac")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("ab")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("an")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("ao")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("av")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("aq")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	} // L: 17

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1961992517"
	)
	public static boolean method680(char var0) {
		if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) { // L: 61
			return true;
		} else {
			if (var0 != 0) { // L: 62
				char[] var1 = class365.cp1252AsciiExtension; // L: 64

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 65
					char var3 = var1[var2]; // L: 66
					if (var0 == var3) { // L: 68
						return true; // L: 69
					}
				}
			}

			return false; // L: 75
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-983265887"
	)
	static void method678() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 362
			Login.currentLoginField = 1; // L: 363
		} else {
			Login.currentLoginField = 0; // L: 366
		}

	} // L: 368

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZB)I",
		garbageValue = "-80"
	)
	static int method679(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) { // L: 3178
			if (WorldMapCacheName.guestClanSettings != null) { // L: 3179
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3180
				class366.field4338 = WorldMapCacheName.guestClanSettings; // L: 3181
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3183
			}

			return 1; // L: 3184
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) { // L: 3186
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3187
				if (Client.currentClanSettings[var3] != null) { // L: 3188
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3189
					class366.field4338 = Client.currentClanSettings[var3]; // L: 3190
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3192
				}

				return 1; // L: 3193
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) { // L: 3195
				Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = class366.field4338.name; // L: 3196
				return 1; // L: 3197
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) { // L: 3199
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class366.field4338.allowGuests ? 1 : 0; // L: 3200
				return 1; // L: 3201
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) { // L: 3203
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class366.field4338.field1692; // L: 3204
				return 1; // L: 3205
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) { // L: 3207
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class366.field4338.field1697; // L: 3208
				return 1; // L: 3209
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) { // L: 3211
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class366.field4338.field1694; // L: 3212
				return 1; // L: 3213
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) { // L: 3215
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class366.field4338.field1695; // L: 3216
				return 1; // L: 3217
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) { // L: 3219
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class366.field4338.memberCount; // L: 3220
				return 1; // L: 3221
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) { // L: 3223
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3224
				Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = class366.field4338.memberNames[var3]; // L: 3225
				return 1; // L: 3226
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) { // L: 3228
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3229
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class366.field4338.memberRanks[var3]; // L: 3230
				return 1; // L: 3231
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) { // L: 3233
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class366.field4338.bannedMemberCount; // L: 3234
				return 1; // L: 3235
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) { // L: 3237
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3238
				Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = class366.field4338.bannedMemberNames[var3]; // L: 3239
				return 1; // L: 3240
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) { // L: 3242
					Interpreter.Interpreter_intStackSize -= 3; // L: 3243
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3244
					var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3245
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3246
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class366.field4338.method3196(var3, var6, var5); // L: 3247
					return 1; // L: 3248
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) { // L: 3250
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class366.field4338.currentOwner; // L: 3251
					return 1; // L: 3252
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) { // L: 3254
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class366.field4338.field1704; // L: 3255
					return 1; // L: 3256
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) { // L: 3258
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class366.field4338.method3255(Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]); // L: 3259
					return 1; // L: 3260
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) { // L: 3262
					Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = class366.field4338.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]]; // L: 3263
					return 1; // L: 3264
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) { // L: 3266
					Interpreter.Interpreter_intStackSize -= 2; // L: 3267
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3268
					var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3269
					class199.method3798(var6, var3); // L: 3270
					return 1; // L: 3271
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) { // L: 3273
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3274
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class366.field4338.field1701[var3]; // L: 3275
					return 1; // L: 3276
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) { // L: 3278
						Interpreter.Interpreter_intStackSize -= 3; // L: 3279
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3280
						boolean var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 3281
						var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3282
						WorldMapArea.method4919(var5, var3, var4); // L: 3283
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) { // L: 3285
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3286
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class366.field4338.field1702[var3] ? 1 : 0; // L: 3287
						return 1; // L: 3288
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) { // L: 3290
						if (class19.guestClanChannel != null) { // L: 3291
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3292
							class19.field107 = class19.guestClanChannel; // L: 3293
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3295
						}

						return 1; // L: 3296
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) { // L: 3298
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3299
						if (Client.currentClanChannels[var3] != null) { // L: 3300
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3301
							class19.field107 = Client.currentClanChannels[var3]; // L: 3302
							class208.field2302 = var3; // L: 3303
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3305
						}

						return 1; // L: 3306
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) { // L: 3308
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = class19.field107.name; // L: 3309
						return 1; // L: 3310
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) { // L: 3312
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class19.field107.field1761; // L: 3313
						return 1; // L: 3314
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) { // L: 3316
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class19.field107.field1758; // L: 3317
						return 1; // L: 3318
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) { // L: 3320
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class19.field107.method3329(); // L: 3321
						return 1; // L: 3322
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) { // L: 3324
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3325
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ((ClanChannelMember)class19.field107.members.get(var3)).username.getName(); // L: 3326
						return 1; // L: 3327
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) { // L: 3329
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3330
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((ClanChannelMember)class19.field107.members.get(var3)).rank; // L: 3331
						return 1; // L: 3332
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) { // L: 3334
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3335
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((ClanChannelMember)class19.field107.members.get(var3)).world; // L: 3336
						return 1; // L: 3337
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) { // L: 3339
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3340
						class20.method291(class208.field2302, var3); // L: 3341
						return 1; // L: 3342
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) { // L: 3344
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class19.field107.method3337(Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]); // L: 3345
						return 1; // L: 3346
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) { // L: 3348
						Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = class19.field107.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]]; // L: 3349
						return 1; // L: 3350
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) { // L: 3352
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class188.field1958 != null ? 1 : 0; // L: 3353
						return 1; // L: 3354
					} else {
						return 2; // L: 3356
					}
				}
			}
		}
	}
}
