import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("sh")
public class class478 implements class356 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lsh;"
	)
	public static final class478 field4948;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lsh;"
	)
	public static final class478 field4947;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsh;"
	)
	public static final class478 field4946;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -22191699
	)
	public final int field4949;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 454796803
	)
	public final int field4950;
	@ObfuscatedName("ab")
	public final Class field4951;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lss;"
	)
	final class474 field4952;

	static {
		field4948 = new class478(1, 0, Integer.class, new class475()); // L: 10
		field4947 = new class478(0, 1, Long.class, new class477()); // L: 24
		field4946 = new class478(2, 2, String.class, new class479()); // L: 38
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Lss;)V"
	)
	class478(int var1, int var2, Class var3, class474 var4) {
		this.field4949 = var1; // L: 62
		this.field4950 = var2; // L: 63
		this.field4951 = var3; // L: 64
		this.field4952 = var4; // L: 65
	} // L: 66

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "741942848"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4950; // L: 96
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)Ljava/lang/Object;",
		garbageValue = "-1183771146"
	)
	public Object method8895(Buffer var1) {
		return this.field4952.vmethod8913(var1); // L: 100
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Ljava/lang/String;Ljava/lang/String;IZI)V",
		garbageValue = "435790040"
	)
	public static void method8904(AbstractArchive var0, String var1, String var2, int var3, boolean var4) {
		if (var0.isValidFileName(var1, var2)) { // L: 34
			int var5 = var0.getGroupId(var1); // L: 35
			int var6 = var0.getFileId(var5, var2); // L: 36
			Message.method1201(var0, var5, var6, var3, var4); // L: 37
		}

	} // L: 39

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)Llg;",
		garbageValue = "-11844"
	)
	public static PacketBufferNode method8886() {
		PacketBufferNode var0 = SpotAnimationDefinition.method3844(); // L: 42
		var0.clientPacket = null; // L: 43
		var0.clientPacketLength = 0; // L: 44
		var0.packetBuffer = new PacketBuffer(5000); // L: 45
		return var0; // L: 46
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[Lsh;",
		garbageValue = "-1831694021"
	)
	public static class478[] method8889() {
		return new class478[]{field4948, field4947, field4946}; // L: 58
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;S)Lsh;",
		garbageValue = "-16288"
	)
	public static class478 method8888(Class var0) {
		class478[] var1 = method8889(); // L: 70

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 71
			class478 var3 = var1[var2]; // L: 72
			if (var3.field4951 == var0) {
				return var3; // L: 74
			}
		}

		return null; // L: 78
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lsg;I)V",
		garbageValue = "779443646"
	)
	public static void method8906(Object var0, Buffer var1) {
		class474 var2 = method8890(var0.getClass()); // L: 83
		var2.vmethod8910(var0, var1); // L: 84
	} // L: 85

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Lss;",
		garbageValue = "-1458293291"
	)
	static class474 method8890(Class var0) {
		class478 var1 = method8888(var0); // L: 89
		if (var1 == null) {
			throw new IllegalArgumentException(); // L: 90
		} else {
			return var1.field4952; // L: 91
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "0"
	)
	static final int method8903(int var0, int var1) {
		if (var0 == -2) { // L: 1049
			return 12345678;
		} else if (var0 == -1) { // L: 1050
			if (var1 < 2) {
				var1 = 2; // L: 1051
			} else if (var1 > 126) { // L: 1052
				var1 = 126;
			}

			return var1; // L: 1053
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 1055
			if (var1 < 2) { // L: 1056
				var1 = 2;
			} else if (var1 > 126) { // L: 1057
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 1058
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZB)I",
		garbageValue = "0"
	)
	static int method8902(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) { // L: 3199
			if (ItemComposition.guestClanSettings != null) { // L: 3200
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3201
				class133.field1597 = ItemComposition.guestClanSettings; // L: 3202
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3204
			}

			return 1; // L: 3205
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) { // L: 3207
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3208
				if (Client.currentClanSettings[var3] != null) { // L: 3209
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3210
					class133.field1597 = Client.currentClanSettings[var3]; // L: 3211
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3213
				}

				return 1; // L: 3214
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) { // L: 3216
				Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = class133.field1597.name; // L: 3217
				return 1; // L: 3218
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) { // L: 3220
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class133.field1597.allowGuests ? 1 : 0; // L: 3221
				return 1; // L: 3222
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) { // L: 3224
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class133.field1597.field1728; // L: 3225
				return 1; // L: 3226
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) { // L: 3228
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class133.field1597.field1717; // L: 3229
				return 1; // L: 3230
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) { // L: 3232
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class133.field1597.field1718; // L: 3233
				return 1; // L: 3234
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) { // L: 3236
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class133.field1597.field1709; // L: 3237
				return 1; // L: 3238
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) { // L: 3240
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class133.field1597.memberCount; // L: 3241
				return 1; // L: 3242
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) { // L: 3244
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3245
				Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = class133.field1597.memberNames[var3]; // L: 3246
				return 1; // L: 3247
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) { // L: 3249
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3250
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class133.field1597.memberRanks[var3]; // L: 3251
				return 1; // L: 3252
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) { // L: 3254
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class133.field1597.bannedMemberCount; // L: 3255
				return 1; // L: 3256
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) { // L: 3258
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3259
				Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = class133.field1597.bannedMemberNames[var3]; // L: 3260
				return 1; // L: 3261
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) { // L: 3263
					Interpreter.Interpreter_intStackSize -= 3; // L: 3264
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3265
					var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3266
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3267
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class133.field1597.method3303(var3, var6, var5); // L: 3268
					return 1; // L: 3269
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) { // L: 3271
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class133.field1597.currentOwner; // L: 3272
					return 1; // L: 3273
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) { // L: 3275
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class133.field1597.field1733; // L: 3276
					return 1; // L: 3277
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) { // L: 3279
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class133.field1597.method3302(Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]); // L: 3280
					return 1; // L: 3281
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) { // L: 3283
					Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = class133.field1597.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]]; // L: 3284
					return 1; // L: 3285
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) { // L: 3287
					Interpreter.Interpreter_intStackSize -= 2; // L: 3288
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3289
					var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3290
					WorldMapScaleHandler.method5589(var6, var3); // L: 3291
					return 1; // L: 3292
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) { // L: 3294
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3295
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class133.field1597.field1725[var3]; // L: 3296
					return 1; // L: 3297
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) { // L: 3299
						Interpreter.Interpreter_intStackSize -= 3; // L: 3300
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3301
						boolean var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 3302
						var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3303
						Clock.method3627(var5, var3, var4); // L: 3304
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) { // L: 3306
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3307
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class133.field1597.field1734[var3] ? 1 : 0; // L: 3308
						return 1; // L: 3309
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) { // L: 3311
						if (MouseHandler.guestClanChannel != null) { // L: 3312
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3313
							class147.field1694 = MouseHandler.guestClanChannel; // L: 3314
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3316
						}

						return 1; // L: 3317
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) { // L: 3319
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3320
						if (Client.currentClanChannels[var3] != null) { // L: 3321
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3322
							class147.field1694 = Client.currentClanChannels[var3]; // L: 3323
							Login.field927 = var3; // L: 3324
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3326
						}

						return 1; // L: 3327
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) { // L: 3329
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = class147.field1694.name; // L: 3330
						return 1; // L: 3331
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) { // L: 3333
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class147.field1694.field1774; // L: 3334
						return 1; // L: 3335
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) { // L: 3337
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class147.field1694.field1768; // L: 3338
						return 1; // L: 3339
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) { // L: 3341
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class147.field1694.method3416(); // L: 3342
						return 1; // L: 3343
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) { // L: 3345
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3346
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ((ClanChannelMember)class147.field1694.members.get(var3)).username.getName(); // L: 3347
						return 1; // L: 3348
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) { // L: 3350
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3351
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((ClanChannelMember)class147.field1694.members.get(var3)).rank; // L: 3352
						return 1; // L: 3353
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) { // L: 3355
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3356
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((ClanChannelMember)class147.field1694.members.get(var3)).world; // L: 3357
						return 1; // L: 3358
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) { // L: 3360
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3361
						class151.method3363(Login.field927, var3); // L: 3362
						return 1; // L: 3363
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) { // L: 3365
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class147.field1694.method3415(Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]); // L: 3366
						return 1; // L: 3367
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) { // L: 3369
						Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = class147.field1694.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]]; // L: 3370
						return 1; // L: 3371
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) { // L: 3373
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Players.field1339 != null ? 1 : 0; // L: 3374
						return 1; // L: 3375
					} else {
						return 2; // L: 3377
					}
				}
			}
		}
	}

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "90"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (UserComparator5.friendsChatManager != null) { // L: 11998
			PacketBufferNode var1 = class330.getPacketBufferNode(ClientPacket.field3184, Client.packetWriter.isaacCipher); // L: 11999
			var1.packetBuffer.writeByte(DynamicObject.stringCp1252NullTerminatedByteSize(var0)); // L: 12000
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 12001
			Client.packetWriter.addNode(var1); // L: 12002
		}
	} // L: 12003
}
