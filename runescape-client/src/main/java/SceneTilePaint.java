import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hj")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("l")
	@Export("ByteArrayPool_arrays")
	public static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("db")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 15870629
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1110971815
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -489464065
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -542131165
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -813926199
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("q")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -235347683
	)
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true; // L: 9
		this.swColor = var1; // L: 13
		this.seColor = var2; // L: 14
		this.neColor = var3; // L: 15
		this.nwColor = var4; // L: 16
		this.texture = var5; // L: 17
		this.rgb = var6;
		this.isFlat = var7; // L: 19
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lrt;",
		garbageValue = "631994565"
	)
	public static PrivateChatMode method4808(int var0) {
		PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field5048, PrivateChatMode.field5052, PrivateChatMode.field5047}; // L: 18
		PrivateChatMode[] var2 = var1; // L: 20

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 21
			PrivateChatMode var4 = var2[var3]; // L: 22
			if (var0 == var4.field5050) { // L: 24
				return var4;
			}
		}

		return null; // L: 28
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZB)I",
		garbageValue = "-3"
	)
	static int method4807(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) { // L: 3081
			if (class20.guestClanSettings != null) { // L: 3082
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 1; // L: 3083
				class126.field1573 = class20.guestClanSettings; // L: 3084
			} else {
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 3086
			}

			return 1; // L: 3087
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) { // L: 3089
				var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3090
				if (Client.currentClanSettings[var3] != null) { // L: 3091
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 1; // L: 3092
					class126.field1573 = Client.currentClanSettings[var3]; // L: 3093
				} else {
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 3095
				}

				return 1; // L: 3096
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) { // L: 3098
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class126.field1573.name; // L: 3099
				return 1; // L: 3100
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) { // L: 3102
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class126.field1573.allowGuests ? 1 : 0; // L: 3103
				return 1; // L: 3104
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) { // L: 3106
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class126.field1573.field1728; // L: 3107
				return 1; // L: 3108
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) { // L: 3110
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class126.field1573.field1729; // L: 3111
				return 1; // L: 3112
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) { // L: 3114
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class126.field1573.field1734; // L: 3115
				return 1; // L: 3116
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) { // L: 3118
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class126.field1573.field1731; // L: 3119
				return 1; // L: 3120
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) { // L: 3122
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class126.field1573.memberCount; // L: 3123
				return 1; // L: 3124
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) { // L: 3126
				var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3127
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class126.field1573.memberNames[var3]; // L: 3128
				return 1; // L: 3129
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) { // L: 3131
				var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3132
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class126.field1573.memberRanks[var3]; // L: 3133
				return 1; // L: 3134
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) { // L: 3136
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class126.field1573.bannedMemberCount; // L: 3137
				return 1; // L: 3138
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) { // L: 3140
				var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3141
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class126.field1573.bannedMemberNames[var3]; // L: 3142
				return 1; // L: 3143
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) { // L: 3145
					class87.Interpreter_intStackSize -= 3; // L: 3146
					var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 3147
					var6 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 3148
					var5 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2]; // L: 3149
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class126.field1573.method3167(var3, var6, var5); // L: 3150
					return 1; // L: 3151
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) { // L: 3153
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class126.field1573.currentOwner; // L: 3154
					return 1; // L: 3155
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) { // L: 3157
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class126.field1573.field1740; // L: 3158
					return 1; // L: 3159
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) { // L: 3161
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class126.field1573.method3164(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]); // L: 3162
					return 1; // L: 3163
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) { // L: 3165
					Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1] = class126.field1573.getSortedMembers()[Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1]]; // L: 3166
					return 1; // L: 3167
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) { // L: 3169
					class87.Interpreter_intStackSize -= 2; // L: 3170
					var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 3171
					var6 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 3172
					Archive.method6455(var6, var3); // L: 3173
					return 1; // L: 3174
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) { // L: 3176
					var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3177
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class126.field1573.field1720[var3]; // L: 3178
					return 1; // L: 3179
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) { // L: 3181
						class87.Interpreter_intStackSize -= 3; // L: 3182
						var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 3183
						boolean var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1] == 1; // L: 3184
						var5 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2]; // L: 3185
						FaceNormal.method4620(var5, var3, var4); // L: 3186
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) { // L: 3188
						var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3189
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class126.field1573.field1724[var3] ? 1 : 0; // L: 3190
						return 1; // L: 3191
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) { // L: 3193
						if (VarcInt.guestClanChannel != null) { // L: 3194
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 1; // L: 3195
							VarcInt.field1956 = VarcInt.guestClanChannel; // L: 3196
						} else {
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 3198
						}

						return 1; // L: 3199
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) { // L: 3201
						var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3202
						if (Client.currentClanChannels[var3] != null) { // L: 3203
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 1; // L: 3204
							VarcInt.field1956 = Client.currentClanChannels[var3]; // L: 3205
							class13.field78 = var3; // L: 3206
						} else {
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 3208
						}

						return 1; // L: 3209
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) { // L: 3211
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = VarcInt.field1956.name; // L: 3212
						return 1; // L: 3213
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) { // L: 3215
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = VarcInt.field1956.field1799; // L: 3216
						return 1; // L: 3217
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) { // L: 3219
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = VarcInt.field1956.field1796; // L: 3220
						return 1; // L: 3221
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) { // L: 3223
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = VarcInt.field1956.method3312(); // L: 3224
						return 1; // L: 3225
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) { // L: 3227
						var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3228
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ((ClanChannelMember)VarcInt.field1956.members.get(var3)).username.getName(); // L: 3229
						return 1; // L: 3230
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) { // L: 3232
						var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3233
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = ((ClanChannelMember)VarcInt.field1956.members.get(var3)).rank; // L: 3234
						return 1; // L: 3235
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) { // L: 3237
						var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3238
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = ((ClanChannelMember)VarcInt.field1956.members.get(var3)).world; // L: 3239
						return 1; // L: 3240
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) { // L: 3242
						var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3243
						ScriptFrame.method1171(class13.field78, var3); // L: 3244
						return 1; // L: 3245
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) { // L: 3247
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = VarcInt.field1956.method3313(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]); // L: 3248
						return 1; // L: 3249
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) { // L: 3251
						Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1] = VarcInt.field1956.getSortedMembers()[Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1]]; // L: 3252
						return 1; // L: 3253
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) { // L: 3255
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = LoginScreenAnimation.field1286 != null ? 1 : 0; // L: 3256
						return 1; // L: 3257
					} else {
						return 2; // L: 3259
					}
				}
			}
		}
	}
}
