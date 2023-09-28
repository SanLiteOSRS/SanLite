import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bt")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 905477761
	)
	@Export("id")
	int id;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 654707761
	)
	@Export("size")
	int size;
	@ObfuscatedName("ak")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("ax")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("ao")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("ah")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("ar")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("ab")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	} // L: 17

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "215917133"
	)
	static int method698(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) { // L: 2895
			if (InvDefinition.friendSystem.field849 == 0) { // L: 2896
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -2;
			} else if (InvDefinition.friendSystem.field849 == 1) { // L: 2897
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = InvDefinition.friendSystem.friendsList.getSize(); // L: 2898
			}

			return 1; // L: 2899
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2902
				if (InvDefinition.friendSystem.method1896() && var3 >= 0 && var3 < InvDefinition.friendSystem.friendsList.getSize()) { // L: 2903
					Friend var8 = (Friend)InvDefinition.friendSystem.friendsList.get(var3); // L: 2904
					Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var8.getName(); // L: 2905
					Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var8.getPreviousName(); // L: 2906
				} else {
					Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 2909
					Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 2910
				}

				return 1; // L: 2912
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2915
				if (InvDefinition.friendSystem.method1896() && var3 >= 0 && var3 < InvDefinition.friendSystem.friendsList.getSize()) { // L: 2916
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)InvDefinition.friendSystem.friendsList.get(var3)).world; // L: 2917
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2919
				}

				return 1; // L: 2920
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2923
				if (InvDefinition.friendSystem.method1896() && var3 >= 0 && var3 < InvDefinition.friendSystem.friendsList.getSize()) { // L: 2924
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)InvDefinition.friendSystem.friendsList.get(var3)).rank; // L: 2925
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2927
				}

				return 1; // L: 2928
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 2931
					int var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2932
					class148.method3179(var5, var9); // L: 2933
					return 1; // L: 2934
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 2937
					InvDefinition.friendSystem.addFriend(var5); // L: 2938
					return 1; // L: 2939
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 2942
					InvDefinition.friendSystem.removeFriend(var5); // L: 2943
					return 1; // L: 2944
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 2947
					InvDefinition.friendSystem.addIgnore(var5); // L: 2948
					return 1; // L: 2949
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 2952
					boolean var6 = true; // L: 2953
					InvDefinition.friendSystem.method1901(var5, var6); // L: 2954
					return 1; // L: 2955
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 2958
					var5 = InterfaceParent.method2312(var5); // L: 2959
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = InvDefinition.friendSystem.isFriended(new Username(var5, class166.loginType), false) ? 1 : 0; // L: 2960
					return 1; // L: 2961
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (class358.friendsChatManager != null) { // L: 2964
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = class358.friendsChatManager.name; // L: 2965
					} else {
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 2967
					}

					return 1; // L: 2968
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (class358.friendsChatManager != null) { // L: 2971
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class358.friendsChatManager.getSize(); // L: 2972
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2974
					}

					return 1; // L: 2975
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2978
					if (class358.friendsChatManager != null && var3 < class358.friendsChatManager.getSize()) { // L: 2979
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = class358.friendsChatManager.get(var3).getUsername().getName(); // L: 2980
					} else {
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 2982
					}

					return 1; // L: 2983
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2986
					if (class358.friendsChatManager != null && var3 < class358.friendsChatManager.getSize()) { // L: 2987
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)class358.friendsChatManager.get(var3)).getWorld(); // L: 2988
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2990
					}

					return 1; // L: 2991
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2994
					if (class358.friendsChatManager != null && var3 < class358.friendsChatManager.getSize()) { // L: 2995
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)class358.friendsChatManager.get(var3)).rank; // L: 2996
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2998
					}

					return 1; // L: 2999
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class358.friendsChatManager != null ? class358.friendsChatManager.minKick : 0; // L: 3002
					return 1; // L: 3003
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 3006
					class14.clanKickUser(var5); // L: 3007
					return 1; // L: 3008
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class358.friendsChatManager != null ? class358.friendsChatManager.rank : 0; // L: 3011
					return 1; // L: 3012
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 3015
					class216.Clan_joinChat(var5); // L: 3016
					return 1; // L: 3017
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					WorldMapSection0.Clan_leaveChat(); // L: 3020
					return 1; // L: 3021
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!InvDefinition.friendSystem.method1896()) { // L: 3024
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = InvDefinition.friendSystem.ignoreList.getSize(); // L: 3025
					}

					return 1; // L: 3026
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3029
					if (InvDefinition.friendSystem.method1896() && var3 >= 0 && var3 < InvDefinition.friendSystem.ignoreList.getSize()) { // L: 3030
						Ignored var4 = (Ignored)InvDefinition.friendSystem.ignoreList.get(var3); // L: 3031
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var4.getName(); // L: 3032
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var4.getPreviousName(); // L: 3033
					} else {
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 3036
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 3037
					}

					return 1; // L: 3039
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 3042
					var5 = InterfaceParent.method2312(var5); // L: 3043
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = InvDefinition.friendSystem.isIgnored(new Username(var5, class166.loginType)) ? 1 : 0; // L: 3044
					return 1; // L: 3045
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3048
					if (class358.friendsChatManager != null && var3 < class358.friendsChatManager.getSize() && class358.friendsChatManager.get(var3).getUsername().equals(TextureProvider.localPlayer.username)) { // L: 3049
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3050
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3052
					}

					return 1; // L: 3053
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (class358.friendsChatManager != null && class358.friendsChatManager.owner != null) { // L: 3056
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = class358.friendsChatManager.owner; // L: 3057
					} else {
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 3059
					}

					return 1; // L: 3060
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3063
					if (class358.friendsChatManager != null && var3 < class358.friendsChatManager.getSize() && ((FriendsChatMember)class358.friendsChatManager.get(var3)).isFriend()) { // L: 3064
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3065
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3067
					}

					return 1; // L: 3068
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						InvDefinition.friendSystem.friendsList.removeComparator(); // L: 3079
						return 1; // L: 3080
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3083
							InvDefinition.friendSystem.friendsList.addComparator(new UserComparator1(var7)); // L: 3084
							return 1; // L: 3085
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3088
							InvDefinition.friendSystem.friendsList.addComparator(new UserComparator2(var7)); // L: 3089
							return 1; // L: 3090
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3093
							InvDefinition.friendSystem.friendsList.addComparator(new UserComparator3(var7)); // L: 3094
							return 1; // L: 3095
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3098
							InvDefinition.friendSystem.friendsList.addComparator(new UserComparator4(var7)); // L: 3099
							return 1; // L: 3100
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3103
							InvDefinition.friendSystem.friendsList.addComparator(new UserComparator5(var7)); // L: 3104
							return 1; // L: 3105
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3108
							InvDefinition.friendSystem.friendsList.addComparator(new UserComparator6(var7)); // L: 3109
							return 1; // L: 3110
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3113
							InvDefinition.friendSystem.friendsList.addComparator(new UserComparator7(var7)); // L: 3114
							return 1; // L: 3115
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3118
							InvDefinition.friendSystem.friendsList.addComparator(new UserComparator8(var7)); // L: 3119
							return 1; // L: 3120
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3123
							InvDefinition.friendSystem.friendsList.addComparator(new UserComparator9(var7)); // L: 3124
							return 1; // L: 3125
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3128
							InvDefinition.friendSystem.friendsList.addComparator(new UserComparator10(var7)); // L: 3129
							return 1; // L: 3130
						} else if (var0 == 3639) {
							InvDefinition.friendSystem.friendsList.sort(); // L: 3133
							return 1; // L: 3134
						} else if (var0 == 3640) {
							InvDefinition.friendSystem.ignoreList.removeComparator(); // L: 3137
							return 1; // L: 3138
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3141
							InvDefinition.friendSystem.ignoreList.addComparator(new UserComparator1(var7)); // L: 3142
							return 1; // L: 3143
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3146
							InvDefinition.friendSystem.ignoreList.addComparator(new UserComparator2(var7)); // L: 3147
							return 1; // L: 3148
						} else if (var0 == 3643) {
							InvDefinition.friendSystem.ignoreList.sort(); // L: 3151
							return 1; // L: 3152
						} else if (var0 == 3644) {
							if (class358.friendsChatManager != null) { // L: 3155
								class358.friendsChatManager.removeComparator(); // L: 3156
							}

							return 1; // L: 3158
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3161
							if (class358.friendsChatManager != null) { // L: 3162
								class358.friendsChatManager.addComparator(new UserComparator1(var7)); // L: 3163
							}

							return 1; // L: 3165
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3168
							if (class358.friendsChatManager != null) { // L: 3169
								class358.friendsChatManager.addComparator(new UserComparator2(var7)); // L: 3170
							}

							return 1; // L: 3172
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3175
							if (class358.friendsChatManager != null) { // L: 3176
								class358.friendsChatManager.addComparator(new UserComparator3(var7)); // L: 3177
							}

							return 1; // L: 3179
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3182
							if (class358.friendsChatManager != null) { // L: 3183
								class358.friendsChatManager.addComparator(new UserComparator4(var7)); // L: 3184
							}

							return 1; // L: 3186
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3189
							if (class358.friendsChatManager != null) { // L: 3190
								class358.friendsChatManager.addComparator(new UserComparator5(var7)); // L: 3191
							}

							return 1; // L: 3193
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3196
							if (class358.friendsChatManager != null) { // L: 3197
								class358.friendsChatManager.addComparator(new UserComparator6(var7)); // L: 3198
							}

							return 1; // L: 3200
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3203
							if (class358.friendsChatManager != null) { // L: 3204
								class358.friendsChatManager.addComparator(new UserComparator7(var7)); // L: 3205
							}

							return 1; // L: 3207
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3210
							if (class358.friendsChatManager != null) { // L: 3211
								class358.friendsChatManager.addComparator(new UserComparator8(var7)); // L: 3212
							}

							return 1; // L: 3214
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3217
							if (class358.friendsChatManager != null) { // L: 3218
								class358.friendsChatManager.addComparator(new UserComparator9(var7)); // L: 3219
							}

							return 1; // L: 3221
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3224
							if (class358.friendsChatManager != null) { // L: 3225
								class358.friendsChatManager.addComparator(new UserComparator10(var7)); // L: 3226
							}

							return 1; // L: 3228
						} else if (var0 == 3655) {
							if (class358.friendsChatManager != null) { // L: 3231
								class358.friendsChatManager.sort(); // L: 3232
							}

							return 1; // L: 3234
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3237
							InvDefinition.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7)); // L: 3238
							return 1; // L: 3239
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3242
							if (class358.friendsChatManager != null) { // L: 3243
								class358.friendsChatManager.addComparator(new BuddyRankComparator(var7)); // L: 3244
							}

							return 1; // L: 3246
						} else {
							return 2; // L: 3248
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3071
					if (class358.friendsChatManager != null && var3 < class358.friendsChatManager.getSize() && ((FriendsChatMember)class358.friendsChatManager.get(var3)).isIgnored()) { // L: 3072
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3073
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3075
					}

					return 1; // L: 3076
				}
			}
		}
	}
}
