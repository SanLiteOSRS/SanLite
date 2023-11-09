import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("as")
public class class37 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("e")
	@Export("userHomeDirectory")
	public static String userHomeDirectory;

	static {
		reflectionChecks = new IterableNodeDeque(); // L: 17
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-21"
	)
	public static int method712(int var0) {
		--var0; // L: 63
		var0 |= var0 >>> 1; // L: 64
		var0 |= var0 >>> 2; // L: 65
		var0 |= var0 >>> 4; // L: 66
		var0 |= var0 >>> 8; // L: 67
		var0 |= var0 >>> 16; // L: 68
		return var0 + 1; // L: 69
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-1657073365"
	)
	static int method711(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) { // L: 3085
			if (class121.guestClanSettings != null) { // L: 3086
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 1; // L: 3087
				class10.field56 = class121.guestClanSettings; // L: 3088
			} else {
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 3090
			}

			return 1; // L: 3091
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) { // L: 3093
				var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3094
				if (Client.currentClanSettings[var3] != null) { // L: 3095
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 1; // L: 3096
					class10.field56 = Client.currentClanSettings[var3]; // L: 3097
				} else {
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 3099
				}

				return 1; // L: 3100
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) { // L: 3102
				Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = class10.field56.name; // L: 3103
				return 1; // L: 3104
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) { // L: 3106
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class10.field56.allowGuests ? 1 : 0; // L: 3107
				return 1; // L: 3108
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) { // L: 3110
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class10.field56.field1670; // L: 3111
				return 1; // L: 3112
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) { // L: 3114
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class10.field56.field1660; // L: 3115
				return 1; // L: 3116
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) { // L: 3118
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class10.field56.field1680; // L: 3119
				return 1; // L: 3120
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) { // L: 3122
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class10.field56.field1671; // L: 3123
				return 1; // L: 3124
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) { // L: 3126
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class10.field56.memberCount; // L: 3127
				return 1; // L: 3128
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) { // L: 3130
				var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3131
				Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = class10.field56.memberNames[var3]; // L: 3132
				return 1; // L: 3133
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) { // L: 3135
				var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3136
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class10.field56.memberRanks[var3]; // L: 3137
				return 1; // L: 3138
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) { // L: 3140
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class10.field56.bannedMemberCount; // L: 3141
				return 1; // L: 3142
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) { // L: 3144
				var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3145
				Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = class10.field56.bannedMemberNames[var3]; // L: 3146
				return 1; // L: 3147
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) { // L: 3149
					class379.Interpreter_intStackSize -= 3; // L: 3150
					var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 3151
					var6 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 3152
					var5 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2]; // L: 3153
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class10.field56.method3113(var3, var6, var5); // L: 3154
					return 1; // L: 3155
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) { // L: 3157
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class10.field56.currentOwner; // L: 3158
					return 1; // L: 3159
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) { // L: 3161
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class10.field56.field1673; // L: 3162
					return 1; // L: 3163
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) { // L: 3165
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class10.field56.method3076(Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]); // L: 3166
					return 1; // L: 3167
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) { // L: 3169
					Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize - 1] = class10.field56.getSortedMembers()[Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize - 1]]; // L: 3170
					return 1; // L: 3171
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) { // L: 3173
					class379.Interpreter_intStackSize -= 2; // L: 3174
					var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 3175
					var6 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 3176
					class197.method3914(var6, var3); // L: 3177
					return 1; // L: 3178
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) { // L: 3180
					var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3181
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class10.field56.field1677[var3]; // L: 3182
					return 1; // L: 3183
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) { // L: 3185
						class379.Interpreter_intStackSize -= 3; // L: 3186
						var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 3187
						boolean var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1] == 1; // L: 3188
						var5 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2]; // L: 3189
						class355.method6770(var5, var3, var4); // L: 3190
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) { // L: 3192
						var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3193
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class10.field56.field1678[var3] ? 1 : 0; // L: 3194
						return 1; // L: 3195
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) { // L: 3197
						if (class198.guestClanChannel != null) { // L: 3198
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 1; // L: 3199
							FontName.field4758 = class198.guestClanChannel; // L: 3200
						} else {
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 3202
						}

						return 1; // L: 3203
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) { // L: 3205
						var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3206
						if (Client.currentClanChannels[var3] != null) { // L: 3207
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 1; // L: 3208
							FontName.field4758 = Client.currentClanChannels[var3]; // L: 3209
							UrlRequester.field1389 = var3; // L: 3210
						} else {
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 3212
						}

						return 1; // L: 3213
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) { // L: 3215
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = FontName.field4758.name; // L: 3216
						return 1; // L: 3217
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) { // L: 3219
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = FontName.field4758.field1731; // L: 3220
						return 1; // L: 3221
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) { // L: 3223
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = FontName.field4758.field1725; // L: 3224
						return 1; // L: 3225
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) { // L: 3227
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = FontName.field4758.method3215(); // L: 3228
						return 1; // L: 3229
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) { // L: 3231
						var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3232
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ((ClanChannelMember)FontName.field4758.members.get(var3)).username.getName(); // L: 3233
						return 1; // L: 3234
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) { // L: 3236
						var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3237
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = ((ClanChannelMember)FontName.field4758.members.get(var3)).rank; // L: 3238
						return 1; // L: 3239
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) { // L: 3241
						var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3242
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = ((ClanChannelMember)FontName.field4758.members.get(var3)).world; // L: 3243
						return 1; // L: 3244
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) { // L: 3246
						var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3247
						class408.method7728(UrlRequester.field1389, var3); // L: 3248
						return 1; // L: 3249
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) { // L: 3251
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = FontName.field4758.method3208(Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]); // L: 3252
						return 1; // L: 3253
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) { // L: 3255
						Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize - 1] = FontName.field4758.getSortedMembers()[Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize - 1]]; // L: 3256
						return 1; // L: 3257
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) { // L: 3259
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class157.field1745 != null ? 1 : 0; // L: 3260
						return 1; // L: 3261
					} else {
						return 2; // L: 3263
					}
				}
			}
		}
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "948350883"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.playingJingle) { // L: 3870
			class283.midiPcmStream.clear(); // L: 3872
			class283.musicPlayerStatus = 1; // L: 3873
			DevicePcmPlayerProvider.musicTrackArchive = null; // L: 3874
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && BufferedSink.clientPreferences.method2391() != 0 && !Client.playingJingle) { // L: 3877
			Archive var1 = ReflectionCheck.archive6; // L: 3878
			int var2 = BufferedSink.clientPreferences.method2391(); // L: 3879
			class283.musicPlayerStatus = 1; // L: 3881
			DevicePcmPlayerProvider.musicTrackArchive = var1; // L: 3882
			class283.musicTrackGroupId = var0; // L: 3883
			class283.musicTrackFileId = 0; // L: 3884
			Messages.musicTrackVolume = var2; // L: 3885
			GrandExchangeEvents.musicTrackBoolean = false; // L: 3886
			class19.pcmSampleLength = 2; // L: 3887
		}

		Client.currentTrackGroupId = var0; // L: 3890
	} // L: 3891

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "86"
	)
	static final boolean method710(int var0) {
		if (var0 < 0) { // L: 8877
			return false;
		} else {
			int var1 = Client.menuOpcodes[var0]; // L: 8878
			if (var1 >= 2000) { // L: 8879
				var1 -= 2000;
			}

			return var1 == 1007; // L: 8880
		}
	}
}
