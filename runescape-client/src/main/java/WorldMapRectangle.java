import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jy")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("au")
	@Export("PcmPlayer_stereo")
	public static boolean PcmPlayer_stereo;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2037941321
	)
	@Export("width")
	int width;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -2109095357
	)
	@Export("height")
	int height;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1073757591
	)
	@Export("x")
	int x;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2096364291
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	final WorldMapManager this$0;

	@ObfuscatedSignature(
		descriptor = "(Ljf;)V"
	)
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1; // L: 311
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1725155859"
	)
	static int method4927() {
		return KeyHandler.KeyHandler_keyCodes.length; // L: 99
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "-373966383"
	)
	static int method4925(int var0, Script var1, boolean var2) {
		boolean var3 = true; // L: 1085
		Widget var4;
		if (var0 >= 2000) { // L: 1087
			var0 -= 1000; // L: 1088
			var4 = HealthBarDefinition.field1877.method6285(Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]); // L: 1089
			var3 = false; // L: 1090
		} else {
			var4 = var2 ? Interpreter.scriptDotWidget : HealthBar.field1302; // L: 1092
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 1093
			var11 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] - 1; // L: 1094
			if (var11 >= 0 && var11 <= 9) { // L: 1095
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]); // L: 1099
				return 1; // L: 1100
			} else {
				--class127.Interpreter_stringStackSize; // L: 1096
				return 1; // L: 1097
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 1102
				class517.Interpreter_intStackSize -= 2; // L: 1103
				var11 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 1104
				var6 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 1105
				var4.parent = HealthBarDefinition.field1877.method6279(var11, var6); // L: 1106
				return 1; // L: 1107
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 1109
				var4.isScrollBar = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 1110
				return 1; // L: 1111
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 1113
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 1114
				return 1; // L: 1115
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 1117
				var4.dragThreshold = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 1118
				return 1; // L: 1119
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 1121
				var4.dataText = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 1122
				return 1; // L: 1123
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 1125
				var4.spellActionName = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 1126
				return 1; // L: 1127
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 1129
				var4.actions = null; // L: 1130
				return 1; // L: 1131
			} else if (var0 == 1308) { // L: 1133
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 1134
				return 1; // L: 1135
			} else if (var0 == 1309) { // L: 1137
				--class517.Interpreter_intStackSize; // L: 1138
				return 1; // L: 1139
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 1141
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 1171
						class517.Interpreter_intStackSize -= 2; // L: 1172
						var5 = 10; // L: 1173
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]}; // L: 1174
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]}; // L: 1175
						class176.Widget_setKey(var4, var5, var8, var9); // L: 1176
						return 1; // L: 1177
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 1179
						class517.Interpreter_intStackSize -= 3; // L: 1180
						var11 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize] - 1; // L: 1181
						var6 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 1182
						var7 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 2]; // L: 1183
						if (var11 >= 0 && var11 <= 9) { // L: 1184
							WorldMapAreaData.Widget_setKeyRate(var4, var11, var6, var7); // L: 1187
							return 1; // L: 1188
						} else {
							throw new RuntimeException(); // L: 1185
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 1190
						var5 = 10; // L: 1191
						var6 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 1192
						var7 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 1193
						WorldMapAreaData.Widget_setKeyRate(var4, var5, var6, var7); // L: 1194
						return 1; // L: 1195
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 1197
						--class517.Interpreter_intStackSize; // L: 1198
						var11 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize] - 1; // L: 1199
						if (var11 >= 0 && var11 <= 9) { // L: 1200
							class137.Widget_setKeyIgnoreHeld(var4, var11); // L: 1203
							return 1; // L: 1204
						} else {
							throw new RuntimeException(); // L: 1201
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 1206
						var5 = 10; // L: 1207
						class137.Widget_setKeyIgnoreHeld(var4, var5); // L: 1208
						return 1; // L: 1209
					} else {
						return 2; // L: 1211
					}
				} else {
					byte[] var10 = null; // L: 1142
					var8 = null; // L: 1143
					if (var3) { // L: 1144
						class517.Interpreter_intStackSize -= 10; // L: 1145

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + class517.Interpreter_intStackSize] >= 0; var7 += 2) { // L: 1147 1148
						}

						if (var7 > 0) { // L: 1150
							var10 = new byte[var7 / 2]; // L: 1151
							var8 = new byte[var7 / 2]; // L: 1152

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 1153
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class517.Interpreter_intStackSize]; // L: 1154
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class517.Interpreter_intStackSize + 1]; // L: 1155
							}
						}
					} else {
						class517.Interpreter_intStackSize -= 2; // L: 1160
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]}; // L: 1161
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]}; // L: 1162
					}

					var7 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] - 1; // L: 1164
					if (var7 >= 0 && var7 <= 9) { // L: 1165
						class176.Widget_setKey(var4, var7, var10, var8); // L: 1168
						return 1; // L: 1169
					} else {
						throw new RuntimeException(); // L: 1166
					}
				}
			}
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "-1752890787"
	)
	static int method4926(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) { // L: 3260
			if (class478.guestClanSettings != null) { // L: 3261
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 1; // L: 3262
				Timer.field4599 = class478.guestClanSettings; // L: 3263
			} else {
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 3265
			}

			return 1; // L: 3266
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) { // L: 3268
				var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3269
				if (Client.currentClanSettings[var3] != null) { // L: 3270
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 1; // L: 3271
					Timer.field4599 = Client.currentClanSettings[var3]; // L: 3272
				} else {
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 3274
				}

				return 1; // L: 3275
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) { // L: 3277
				Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = Timer.field4599.name; // L: 3278
				return 1; // L: 3279
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) { // L: 3281
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Timer.field4599.allowGuests ? 1 : 0; // L: 3282
				return 1; // L: 3283
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) { // L: 3285
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Timer.field4599.field1705; // L: 3286
				return 1; // L: 3287
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) { // L: 3289
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Timer.field4599.field1706; // L: 3290
				return 1; // L: 3291
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) { // L: 3293
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Timer.field4599.field1707; // L: 3294
				return 1; // L: 3295
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) { // L: 3297
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Timer.field4599.field1708; // L: 3298
				return 1; // L: 3299
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) { // L: 3301
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Timer.field4599.memberCount; // L: 3302
				return 1; // L: 3303
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) { // L: 3305
				var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3306
				Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = Timer.field4599.memberNames[var3]; // L: 3307
				return 1; // L: 3308
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) { // L: 3310
				var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3311
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Timer.field4599.memberRanks[var3]; // L: 3312
				return 1; // L: 3313
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) { // L: 3315
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Timer.field4599.bannedMemberCount; // L: 3316
				return 1; // L: 3317
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) { // L: 3319
				var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3320
				Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = Timer.field4599.bannedMemberNames[var3]; // L: 3321
				return 1; // L: 3322
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) { // L: 3324
					class517.Interpreter_intStackSize -= 3; // L: 3325
					var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 3326
					var6 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 3327
					var5 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 2]; // L: 3328
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Timer.field4599.method3341(var3, var6, var5); // L: 3329
					return 1; // L: 3330
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) { // L: 3332
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Timer.field4599.currentOwner; // L: 3333
					return 1; // L: 3334
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) { // L: 3336
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Timer.field4599.field1717; // L: 3337
					return 1; // L: 3338
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) { // L: 3340
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Timer.field4599.method3323(Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]); // L: 3341
					return 1; // L: 3342
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) { // L: 3344
					Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize - 1] = Timer.field4599.getSortedMembers()[Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize - 1]]; // L: 3345
					return 1; // L: 3346
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) { // L: 3348
					class517.Interpreter_intStackSize -= 2; // L: 3349
					var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 3350
					var6 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 3351
					UserComparator4.method2936(var6, var3); // L: 3352
					return 1; // L: 3353
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) { // L: 3355
					var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3356
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Timer.field4599.field1723[var3]; // L: 3357
					return 1; // L: 3358
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) { // L: 3360
						class517.Interpreter_intStackSize -= 3; // L: 3361
						var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 3362
						boolean var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1] == 1; // L: 3363
						var5 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 2]; // L: 3364
						class4.method19(var5, var3, var4); // L: 3365
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) { // L: 3367
						var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3368
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Timer.field4599.field1698[var3] ? 1 : 0; // L: 3369
						return 1; // L: 3370
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) { // L: 3372
						if (ItemContainer.guestClanChannel != null) { // L: 3373
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 1; // L: 3374
							VarcInt.field1851 = ItemContainer.guestClanChannel; // L: 3375
						} else {
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 3377
						}

						return 1; // L: 3378
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) { // L: 3380
						var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3381
						if (Client.currentClanChannels[var3] != null) { // L: 3382
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 1; // L: 3383
							VarcInt.field1851 = Client.currentClanChannels[var3]; // L: 3384
							class395.field4450 = var3; // L: 3385
						} else {
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 3387
						}

						return 1; // L: 3388
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) { // L: 3390
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = VarcInt.field1851.name; // L: 3391
						return 1; // L: 3392
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) { // L: 3394
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = VarcInt.field1851.field1771; // L: 3395
						return 1; // L: 3396
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) { // L: 3398
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = VarcInt.field1851.field1766; // L: 3399
						return 1; // L: 3400
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) { // L: 3402
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = VarcInt.field1851.method3479(); // L: 3403
						return 1; // L: 3404
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) { // L: 3406
						var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3407
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ((ClanChannelMember)VarcInt.field1851.members.get(var3)).username.getName(); // L: 3408
						return 1; // L: 3409
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) { // L: 3411
						var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3412
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = ((ClanChannelMember)VarcInt.field1851.members.get(var3)).rank; // L: 3413
						return 1; // L: 3414
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) { // L: 3416
						var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3417
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = ((ClanChannelMember)VarcInt.field1851.members.get(var3)).world; // L: 3418
						return 1; // L: 3419
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) { // L: 3421
						var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3422
						class30.method465(class395.field4450, var3); // L: 3423
						return 1; // L: 3424
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) { // L: 3426
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = VarcInt.field1851.method3484(Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]); // L: 3427
						return 1; // L: 3428
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) { // L: 3430
						Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize - 1] = VarcInt.field1851.getSortedMembers()[Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize - 1]]; // L: 3431
						return 1; // L: 3432
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) { // L: 3434
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.field677 != null ? 1 : 0; // L: 3435
						return 1; // L: 3436
					} else {
						return 2; // L: 3438
					}
				}
			}
		}
	}
}
