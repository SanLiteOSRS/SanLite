import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dm")
public class class92 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static final class92 field1144;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static final class92 field1146;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static final class92 field1143;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static final class92 field1155;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static final class92 field1145;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static final class92 field1141;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static final class92 field1147;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static final class92 field1148;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static final class92 field1151;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static final class92 field1150;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static final class92 field1149;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static final class92 field1152;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static final class92 field1153;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static final class92 field1154;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static final class92 field1142;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static final class92 field1156;

	static {
		field1144 = new class92(); // L: 12972
		field1146 = new class92(); // L: 12973
		field1143 = new class92(); // L: 12974
		field1155 = new class92(); // L: 12975
		field1145 = new class92(); // L: 12976
		field1141 = new class92(); // L: 12977
		field1147 = new class92(); // L: 12978
		field1148 = new class92(); // L: 12979
		field1151 = new class92(); // L: 12980
		field1150 = new class92(); // L: 12981
		field1149 = new class92(); // L: 12982
		field1152 = new class92(); // L: 12983
		field1153 = new class92(); // L: 12984
		field1154 = new class92(); // L: 12985
		field1142 = new class92(); // L: 12986
		field1156 = new class92();
	} // L: 12987

	class92() {
	} // L: 12989

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-1773939440"
	)
	static int method2366(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) { // L: 2881
			if (class177.friendSystem.field843 == 0) { // L: 2882
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -2;
			} else if (class177.friendSystem.field843 == 1) { // L: 2883
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class177.friendSystem.friendsList.getSize(); // L: 2884
			}

			return 1; // L: 2885
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2888
				if (class177.friendSystem.method1904() && var3 >= 0 && var3 < class177.friendSystem.friendsList.getSize()) { // L: 2889
					Friend var8 = (Friend)class177.friendSystem.friendsList.get(var3); // L: 2890
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.getName(); // L: 2891
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.getPreviousName(); // L: 2892
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2895
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2896
				}

				return 1; // L: 2898
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2901
				if (class177.friendSystem.method1904() && var3 >= 0 && var3 < class177.friendSystem.friendsList.getSize()) { // L: 2902
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)class177.friendSystem.friendsList.get(var3)).world; // L: 2903
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2905
				}

				return 1; // L: 2906
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2909
				if (class177.friendSystem.method1904() && var3 >= 0 && var3 < class177.friendSystem.friendsList.getSize()) { // L: 2910
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)class177.friendSystem.friendsList.get(var3)).rank; // L: 2911
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2913
				}

				return 1; // L: 2914
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2917
					int var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2918
					WorldMapData_0.method5083(var5, var9); // L: 2919
					return 1; // L: 2920
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2923
					class177.friendSystem.addFriend(var5); // L: 2924
					return 1; // L: 2925
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2928
					class177.friendSystem.removeFriend(var5); // L: 2929
					return 1; // L: 2930
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2933
					class177.friendSystem.addIgnore(var5); // L: 2934
					return 1; // L: 2935
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2938
					boolean var6 = true; // L: 2939
					class177.friendSystem.method1867(var5, var6); // L: 2940
					return 1; // L: 2941
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2944
					var5 = FriendsChatMember.method7947(var5); // L: 2945
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class177.friendSystem.isFriended(new Username(var5, class457.loginType), false) ? 1 : 0; // L: 2946
					return 1; // L: 2947
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (Canvas.friendsChatManager != null) { // L: 2950
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Canvas.friendsChatManager.name; // L: 2951
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2953
					}

					return 1; // L: 2954
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (Canvas.friendsChatManager != null) { // L: 2957
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Canvas.friendsChatManager.getSize(); // L: 2958
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2960
					}

					return 1; // L: 2961
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2964
					if (Canvas.friendsChatManager != null && var3 < Canvas.friendsChatManager.getSize()) { // L: 2965
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Canvas.friendsChatManager.get(var3).getUsername().getName(); // L: 2966
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2968
					}

					return 1; // L: 2969
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2972
					if (Canvas.friendsChatManager != null && var3 < Canvas.friendsChatManager.getSize()) { // L: 2973
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)Canvas.friendsChatManager.get(var3)).getWorld(); // L: 2974
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2976
					}

					return 1; // L: 2977
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2980
					if (Canvas.friendsChatManager != null && var3 < Canvas.friendsChatManager.getSize()) { // L: 2981
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)Canvas.friendsChatManager.get(var3)).rank; // L: 2982
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2984
					}

					return 1; // L: 2985
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Canvas.friendsChatManager != null ? Canvas.friendsChatManager.minKick : 0; // L: 2988
					return 1; // L: 2989
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2992
					PacketBufferNode.clanKickUser(var5); // L: 2993
					return 1; // L: 2994
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Canvas.friendsChatManager != null ? Canvas.friendsChatManager.rank : 0; // L: 2997
					return 1; // L: 2998
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3001
					class152.Clan_joinChat(var5); // L: 3002
					return 1; // L: 3003
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					Skeleton.Clan_leaveChat(); // L: 3006
					return 1; // L: 3007
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!class177.friendSystem.method1904()) { // L: 3010
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class177.friendSystem.ignoreList.getSize(); // L: 3011
					}

					return 1; // L: 3012
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3015
					if (class177.friendSystem.method1904() && var3 >= 0 && var3 < class177.friendSystem.ignoreList.getSize()) { // L: 3016
						Ignored var4 = (Ignored)class177.friendSystem.ignoreList.get(var3); // L: 3017
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getName(); // L: 3018
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getPreviousName(); // L: 3019
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3022
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3023
					}

					return 1; // L: 3025
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3028
					var5 = FriendsChatMember.method7947(var5); // L: 3029
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class177.friendSystem.isIgnored(new Username(var5, class457.loginType)) ? 1 : 0; // L: 3030
					return 1; // L: 3031
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3034
					if (Canvas.friendsChatManager != null && var3 < Canvas.friendsChatManager.getSize() && Canvas.friendsChatManager.get(var3).getUsername().equals(class136.localPlayer.username)) { // L: 3035
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3036
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3038
					}

					return 1; // L: 3039
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (Canvas.friendsChatManager != null && Canvas.friendsChatManager.owner != null) { // L: 3042
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Canvas.friendsChatManager.owner; // L: 3043
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3045
					}

					return 1; // L: 3046
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3049
					if (Canvas.friendsChatManager != null && var3 < Canvas.friendsChatManager.getSize() && ((FriendsChatMember)Canvas.friendsChatManager.get(var3)).isFriend()) { // L: 3050
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3051
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3053
					}

					return 1; // L: 3054
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						class177.friendSystem.friendsList.removeComparator(); // L: 3065
						return 1; // L: 3066
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3069
							class177.friendSystem.friendsList.addComparator(new UserComparator1(var7)); // L: 3070
							return 1; // L: 3071
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3074
							class177.friendSystem.friendsList.addComparator(new UserComparator2(var7)); // L: 3075
							return 1; // L: 3076
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3079
							class177.friendSystem.friendsList.addComparator(new UserComparator3(var7)); // L: 3080
							return 1; // L: 3081
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3084
							class177.friendSystem.friendsList.addComparator(new UserComparator4(var7)); // L: 3085
							return 1; // L: 3086
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3089
							class177.friendSystem.friendsList.addComparator(new UserComparator5(var7)); // L: 3090
							return 1; // L: 3091
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3094
							class177.friendSystem.friendsList.addComparator(new UserComparator6(var7)); // L: 3095
							return 1; // L: 3096
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3099
							class177.friendSystem.friendsList.addComparator(new UserComparator7(var7)); // L: 3100
							return 1; // L: 3101
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3104
							class177.friendSystem.friendsList.addComparator(new UserComparator8(var7)); // L: 3105
							return 1; // L: 3106
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3109
							class177.friendSystem.friendsList.addComparator(new UserComparator9(var7)); // L: 3110
							return 1; // L: 3111
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3114
							class177.friendSystem.friendsList.addComparator(new UserComparator10(var7)); // L: 3115
							return 1; // L: 3116
						} else if (var0 == 3639) {
							class177.friendSystem.friendsList.sort(); // L: 3119
							return 1; // L: 3120
						} else if (var0 == 3640) {
							class177.friendSystem.ignoreList.removeComparator(); // L: 3123
							return 1; // L: 3124
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3127
							class177.friendSystem.ignoreList.addComparator(new UserComparator1(var7)); // L: 3128
							return 1; // L: 3129
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3132
							class177.friendSystem.ignoreList.addComparator(new UserComparator2(var7)); // L: 3133
							return 1; // L: 3134
						} else if (var0 == 3643) {
							class177.friendSystem.ignoreList.sort(); // L: 3137
							return 1; // L: 3138
						} else if (var0 == 3644) {
							if (Canvas.friendsChatManager != null) { // L: 3141
								Canvas.friendsChatManager.removeComparator(); // L: 3142
							}

							return 1; // L: 3144
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3147
							if (Canvas.friendsChatManager != null) { // L: 3148
								Canvas.friendsChatManager.addComparator(new UserComparator1(var7)); // L: 3149
							}

							return 1; // L: 3151
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3154
							if (Canvas.friendsChatManager != null) { // L: 3155
								Canvas.friendsChatManager.addComparator(new UserComparator2(var7)); // L: 3156
							}

							return 1; // L: 3158
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3161
							if (Canvas.friendsChatManager != null) { // L: 3162
								Canvas.friendsChatManager.addComparator(new UserComparator3(var7)); // L: 3163
							}

							return 1; // L: 3165
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3168
							if (Canvas.friendsChatManager != null) { // L: 3169
								Canvas.friendsChatManager.addComparator(new UserComparator4(var7)); // L: 3170
							}

							return 1; // L: 3172
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3175
							if (Canvas.friendsChatManager != null) { // L: 3176
								Canvas.friendsChatManager.addComparator(new UserComparator5(var7)); // L: 3177
							}

							return 1; // L: 3179
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3182
							if (Canvas.friendsChatManager != null) { // L: 3183
								Canvas.friendsChatManager.addComparator(new UserComparator6(var7)); // L: 3184
							}

							return 1; // L: 3186
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3189
							if (Canvas.friendsChatManager != null) { // L: 3190
								Canvas.friendsChatManager.addComparator(new UserComparator7(var7)); // L: 3191
							}

							return 1; // L: 3193
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3196
							if (Canvas.friendsChatManager != null) { // L: 3197
								Canvas.friendsChatManager.addComparator(new UserComparator8(var7)); // L: 3198
							}

							return 1; // L: 3200
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3203
							if (Canvas.friendsChatManager != null) { // L: 3204
								Canvas.friendsChatManager.addComparator(new UserComparator9(var7)); // L: 3205
							}

							return 1; // L: 3207
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3210
							if (Canvas.friendsChatManager != null) { // L: 3211
								Canvas.friendsChatManager.addComparator(new UserComparator10(var7)); // L: 3212
							}

							return 1; // L: 3214
						} else if (var0 == 3655) {
							if (Canvas.friendsChatManager != null) { // L: 3217
								Canvas.friendsChatManager.sort(); // L: 3218
							}

							return 1; // L: 3220
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3223
							class177.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7)); // L: 3224
							return 1; // L: 3225
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3228
							if (Canvas.friendsChatManager != null) { // L: 3229
								Canvas.friendsChatManager.addComparator(new BuddyRankComparator(var7)); // L: 3230
							}

							return 1; // L: 3232
						} else {
							return 2; // L: 3234
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3057
					if (Canvas.friendsChatManager != null && var3 < Canvas.friendsChatManager.getSize() && ((FriendsChatMember)Canvas.friendsChatManager.get(var3)).isIgnored()) { // L: 3058
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3059
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3061
					}

					return 1; // L: 3062
				}
			}
		}
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1477325147"
	)
	static final void method2368() {
		Scene.Scene_isLowDetail = false; // L: 917
		Client.isLowDetail = false; // L: 918
	} // L: 919

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1637635386"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (Login.loadInterface(var0)) { // L: 12157
			Widget[] var1 = ArchiveLoader.Widget_interfaceComponents[var0]; // L: 12158

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 12159
				Widget var3 = var1[var2]; // L: 12160
				if (var3 != null) { // L: 12161
					var3.modelFrame = 0; // L: 12162
					var3.modelFrameCycle = 0; // L: 12163
				}
			}

		}
	} // L: 12165
}
