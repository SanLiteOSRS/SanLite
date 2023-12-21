import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ny")
public class class350 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	@Export("huffman")
	static Huffman huffman;

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "-857536144"
	)
	static int method6850(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) { // L: 2899
			if (class12.friendSystem.field816 == 0) { // L: 2900
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -2;
			} else if (class12.friendSystem.field816 == 1) { // L: 2901
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class12.friendSystem.friendsList.getSize(); // L: 2902
			}

			return 1; // L: 2903
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 2906
				if (class12.friendSystem.method1902() && var3 >= 0 && var3 < class12.friendSystem.friendsList.getSize()) { // L: 2907
					Friend var8 = (Friend)class12.friendSystem.friendsList.get(var3); // L: 2908
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var8.getName(); // L: 2909
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var8.getPreviousName(); // L: 2910
				} else {
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 2913
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 2914
				}

				return 1; // L: 2916
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 2919
				if (class12.friendSystem.method1902() && var3 >= 0 && var3 < class12.friendSystem.friendsList.getSize()) { // L: 2920
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = ((Buddy)class12.friendSystem.friendsList.get(var3)).world; // L: 2921
				} else {
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 2923
				}

				return 1; // L: 2924
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 2927
				if (class12.friendSystem.method1902() && var3 >= 0 && var3 < class12.friendSystem.friendsList.getSize()) { // L: 2928
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = ((Buddy)class12.friendSystem.friendsList.get(var3)).rank; // L: 2929
				} else {
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 2931
				}

				return 1; // L: 2932
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 2935
					int var9 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 2936
					class12.method167(var5, var9); // L: 2937
					return 1; // L: 2938
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 2941
					class12.friendSystem.addFriend(var5); // L: 2942
					return 1; // L: 2943
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 2946
					class12.friendSystem.removeFriend(var5); // L: 2947
					return 1; // L: 2948
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 2951
					class12.friendSystem.addIgnore(var5); // L: 2952
					return 1; // L: 2953
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 2956
					boolean var6 = true; // L: 2957
					class12.friendSystem.method1914(var5, var6); // L: 2958
					return 1; // L: 2959
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 2962
					var5 = UserComparator7.method2959(var5); // L: 2963
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class12.friendSystem.isFriended(new Username(var5, class89.loginType), false) ? 1 : 0; // L: 2964
					return 1; // L: 2965
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (class20.friendsChatManager != null) { // L: 2968
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = class20.friendsChatManager.name; // L: 2969
					} else {
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 2971
					}

					return 1; // L: 2972
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (class20.friendsChatManager != null) { // L: 2975
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class20.friendsChatManager.getSize(); // L: 2976
					} else {
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 2978
					}

					return 1; // L: 2979
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 2982
					if (class20.friendsChatManager != null && var3 < class20.friendsChatManager.getSize()) { // L: 2983
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = class20.friendsChatManager.get(var3).getUsername().getName(); // L: 2984
					} else {
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 2986
					}

					return 1; // L: 2987
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 2990
					if (class20.friendsChatManager != null && var3 < class20.friendsChatManager.getSize()) { // L: 2991
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = ((Buddy)class20.friendsChatManager.get(var3)).getWorld(); // L: 2992
					} else {
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 2994
					}

					return 1; // L: 2995
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 2998
					if (class20.friendsChatManager != null && var3 < class20.friendsChatManager.getSize()) { // L: 2999
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = ((Buddy)class20.friendsChatManager.get(var3)).rank; // L: 3000
					} else {
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 3002
					}

					return 1; // L: 3003
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class20.friendsChatManager != null ? class20.friendsChatManager.minKick : 0; // L: 3006
					return 1; // L: 3007
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 3010
					InvDefinition.clanKickUser(var5); // L: 3011
					return 1; // L: 3012
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class20.friendsChatManager != null ? class20.friendsChatManager.rank : 0; // L: 3015
					return 1; // L: 3016
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 3019
					class138.Clan_joinChat(var5); // L: 3020
					return 1; // L: 3021
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					WorldMapSectionType.Clan_leaveChat(); // L: 3024
					return 1; // L: 3025
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!class12.friendSystem.method1902()) { // L: 3028
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class12.friendSystem.ignoreList.getSize(); // L: 3029
					}

					return 1; // L: 3030
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3033
					if (class12.friendSystem.method1902() && var3 >= 0 && var3 < class12.friendSystem.ignoreList.getSize()) { // L: 3034
						Ignored var4 = (Ignored)class12.friendSystem.ignoreList.get(var3); // L: 3035
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var4.getName(); // L: 3036
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var4.getPreviousName(); // L: 3037
					} else {
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 3040
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 3041
					}

					return 1; // L: 3043
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 3046
					var5 = UserComparator7.method2959(var5); // L: 3047
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class12.friendSystem.isIgnored(new Username(var5, class89.loginType)) ? 1 : 0; // L: 3048
					return 1; // L: 3049
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3052
					if (class20.friendsChatManager != null && var3 < class20.friendsChatManager.getSize() && class20.friendsChatManager.get(var3).getUsername().equals(class229.localPlayer.username)) { // L: 3053
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 1; // L: 3054
					} else {
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 3056
					}

					return 1; // L: 3057
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (class20.friendsChatManager != null && class20.friendsChatManager.owner != null) { // L: 3060
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = class20.friendsChatManager.owner; // L: 3061
					} else {
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 3063
					}

					return 1; // L: 3064
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3067
					if (class20.friendsChatManager != null && var3 < class20.friendsChatManager.getSize() && ((FriendsChatMember)class20.friendsChatManager.get(var3)).isFriend()) { // L: 3068
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 1; // L: 3069
					} else {
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 3071
					}

					return 1; // L: 3072
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						class12.friendSystem.friendsList.removeComparator(); // L: 3083
						return 1; // L: 3084
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 3087
							class12.friendSystem.friendsList.addComparator(new UserComparator1(var7)); // L: 3088
							return 1; // L: 3089
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 3092
							class12.friendSystem.friendsList.addComparator(new UserComparator2(var7)); // L: 3093
							return 1; // L: 3094
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 3097
							class12.friendSystem.friendsList.addComparator(new UserComparator3(var7)); // L: 3098
							return 1; // L: 3099
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 3102
							class12.friendSystem.friendsList.addComparator(new UserComparator4(var7)); // L: 3103
							return 1; // L: 3104
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 3107
							class12.friendSystem.friendsList.addComparator(new UserComparator5(var7)); // L: 3108
							return 1; // L: 3109
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 3112
							class12.friendSystem.friendsList.addComparator(new UserComparator6(var7)); // L: 3113
							return 1; // L: 3114
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 3117
							class12.friendSystem.friendsList.addComparator(new UserComparator7(var7)); // L: 3118
							return 1; // L: 3119
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 3122
							class12.friendSystem.friendsList.addComparator(new UserComparator8(var7)); // L: 3123
							return 1; // L: 3124
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 3127
							class12.friendSystem.friendsList.addComparator(new UserComparator9(var7)); // L: 3128
							return 1; // L: 3129
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 3132
							class12.friendSystem.friendsList.addComparator(new UserComparator10(var7)); // L: 3133
							return 1; // L: 3134
						} else if (var0 == 3639) {
							class12.friendSystem.friendsList.sort(); // L: 3137
							return 1; // L: 3138
						} else if (var0 == 3640) {
							class12.friendSystem.ignoreList.removeComparator(); // L: 3141
							return 1; // L: 3142
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 3145
							class12.friendSystem.ignoreList.addComparator(new UserComparator1(var7)); // L: 3146
							return 1; // L: 3147
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 3150
							class12.friendSystem.ignoreList.addComparator(new UserComparator2(var7)); // L: 3151
							return 1; // L: 3152
						} else if (var0 == 3643) {
							class12.friendSystem.ignoreList.sort(); // L: 3155
							return 1; // L: 3156
						} else if (var0 == 3644) {
							if (class20.friendsChatManager != null) { // L: 3159
								class20.friendsChatManager.removeComparator(); // L: 3160
							}

							return 1; // L: 3162
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 3165
							if (class20.friendsChatManager != null) { // L: 3166
								class20.friendsChatManager.addComparator(new UserComparator1(var7)); // L: 3167
							}

							return 1; // L: 3169
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 3172
							if (class20.friendsChatManager != null) { // L: 3173
								class20.friendsChatManager.addComparator(new UserComparator2(var7)); // L: 3174
							}

							return 1; // L: 3176
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 3179
							if (class20.friendsChatManager != null) { // L: 3180
								class20.friendsChatManager.addComparator(new UserComparator3(var7)); // L: 3181
							}

							return 1; // L: 3183
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 3186
							if (class20.friendsChatManager != null) { // L: 3187
								class20.friendsChatManager.addComparator(new UserComparator4(var7)); // L: 3188
							}

							return 1; // L: 3190
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 3193
							if (class20.friendsChatManager != null) { // L: 3194
								class20.friendsChatManager.addComparator(new UserComparator5(var7)); // L: 3195
							}

							return 1; // L: 3197
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 3200
							if (class20.friendsChatManager != null) { // L: 3201
								class20.friendsChatManager.addComparator(new UserComparator6(var7)); // L: 3202
							}

							return 1; // L: 3204
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 3207
							if (class20.friendsChatManager != null) { // L: 3208
								class20.friendsChatManager.addComparator(new UserComparator7(var7)); // L: 3209
							}

							return 1; // L: 3211
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 3214
							if (class20.friendsChatManager != null) { // L: 3215
								class20.friendsChatManager.addComparator(new UserComparator8(var7)); // L: 3216
							}

							return 1; // L: 3218
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 3221
							if (class20.friendsChatManager != null) { // L: 3222
								class20.friendsChatManager.addComparator(new UserComparator9(var7)); // L: 3223
							}

							return 1; // L: 3225
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 3228
							if (class20.friendsChatManager != null) { // L: 3229
								class20.friendsChatManager.addComparator(new UserComparator10(var7)); // L: 3230
							}

							return 1; // L: 3232
						} else if (var0 == 3655) {
							if (class20.friendsChatManager != null) { // L: 3235
								class20.friendsChatManager.sort(); // L: 3236
							}

							return 1; // L: 3238
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 3241
							class12.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7)); // L: 3242
							return 1; // L: 3243
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 3246
							if (class20.friendsChatManager != null) { // L: 3247
								class20.friendsChatManager.addComparator(new BuddyRankComparator(var7)); // L: 3248
							}

							return 1; // L: 3250
						} else {
							return 2; // L: 3252
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3075
					if (class20.friendsChatManager != null && var3 < class20.friendsChatManager.getSize() && ((FriendsChatMember)class20.friendsChatManager.get(var3)).isIgnored()) { // L: 3076
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 1; // L: 3077
					} else {
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 3079
					}

					return 1; // L: 3080
				}
			}
		}
	}
}
