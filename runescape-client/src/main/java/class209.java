import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("if")
public class class209 extends class224 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1096130633
	)
	int field2294;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	final class221 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lit;Ljava/lang/String;I)V"
	)
	class209(class221 var1, String var2, int var3) {
		super(var1, var2); // L: 296
		this.this$0 = var1; // L: 295
		this.field2294 = var3; // L: 297
	} // L: 298

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2105911105"
	)
	public int vmethod4366() {
		return 0; // L: 301
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-8310"
	)
	public int vmethod4368() {
		return this.field2294; // L: 306
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1019572333"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		Message.addChatMessage(var0, var1, var2, (String)null); // L: 23
	} // L: 24

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;B)Z",
		garbageValue = "-91"
	)
	static boolean method4123(Date var0) {
		java.util.Calendar var1 = java.util.Calendar.getInstance(); // L: 1215
		var1.set(1, var1.get(1) - 13); // L: 1216
		var1.set(5, var1.get(5) + 1); // L: 1217
		var1.set(11, 0); // L: 1218
		var1.set(12, 0); // L: 1219
		var1.set(13, 0); // L: 1220
		var1.set(14, 0); // L: 1221
		Date var2 = var1.getTime(); // L: 1222
		return var0.before(var2); // L: 1223
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "33"
	)
	static int method4124(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) { // L: 2930
			if (InterfaceParent.friendSystem.field857 == 0) { // L: 2931
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -2;
			} else if (InterfaceParent.friendSystem.field857 == 1) { // L: 2932
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = InterfaceParent.friendSystem.friendsList.getSize(); // L: 2933
			}

			return 1; // L: 2934
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2937
				if (InterfaceParent.friendSystem.method1942() && var3 >= 0 && var3 < InterfaceParent.friendSystem.friendsList.getSize()) { // L: 2938
					Friend var8 = (Friend)InterfaceParent.friendSystem.friendsList.get(var3); // L: 2939
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var8.getName(); // L: 2940
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var8.getPreviousName(); // L: 2941
				} else {
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ""; // L: 2944
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ""; // L: 2945
				}

				return 1; // L: 2947
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2950
				if (InterfaceParent.friendSystem.method1942() && var3 >= 0 && var3 < InterfaceParent.friendSystem.friendsList.getSize()) { // L: 2951
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)InterfaceParent.friendSystem.friendsList.get(var3)).world; // L: 2952
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2954
				}

				return 1; // L: 2955
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2958
				if (InterfaceParent.friendSystem.method1942() && var3 >= 0 && var3 < InterfaceParent.friendSystem.friendsList.getSize()) { // L: 2959
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)InterfaceParent.friendSystem.friendsList.get(var3)).rank; // L: 2960
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2962
				}

				return 1; // L: 2963
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 2966
					int var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2967
					class10.method88(var5, var9); // L: 2968
					return 1; // L: 2969
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 2972
					InterfaceParent.friendSystem.addFriend(var5); // L: 2973
					return 1; // L: 2974
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 2977
					InterfaceParent.friendSystem.removeFriend(var5); // L: 2978
					return 1; // L: 2979
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 2982
					InterfaceParent.friendSystem.addIgnore(var5); // L: 2983
					return 1; // L: 2984
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 2987
					boolean var6 = true; // L: 2988
					InterfaceParent.friendSystem.method1880(var5, var6); // L: 2989
					return 1; // L: 2990
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 2993
					var5 = class433.method8127(var5); // L: 2994
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = InterfaceParent.friendSystem.isFriended(new Username(var5, FriendLoginUpdate.loginType), false) ? 1 : 0; // L: 2995
					return 1; // L: 2996
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (Projectile.friendsChatManager != null) { // L: 2999
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = Projectile.friendsChatManager.name; // L: 3000
					} else {
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ""; // L: 3002
					}

					return 1; // L: 3003
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (Projectile.friendsChatManager != null) { // L: 3006
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Projectile.friendsChatManager.getSize(); // L: 3007
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3009
					}

					return 1; // L: 3010
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3013
					if (Projectile.friendsChatManager != null && var3 < Projectile.friendsChatManager.getSize()) { // L: 3014
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = Projectile.friendsChatManager.get(var3).getUsername().getName(); // L: 3015
					} else {
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ""; // L: 3017
					}

					return 1; // L: 3018
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3021
					if (Projectile.friendsChatManager != null && var3 < Projectile.friendsChatManager.getSize()) { // L: 3022
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)Projectile.friendsChatManager.get(var3)).getWorld(); // L: 3023
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3025
					}

					return 1; // L: 3026
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3029
					if (Projectile.friendsChatManager != null && var3 < Projectile.friendsChatManager.getSize()) { // L: 3030
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)Projectile.friendsChatManager.get(var3)).rank; // L: 3031
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3033
					}

					return 1; // L: 3034
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Projectile.friendsChatManager != null ? Projectile.friendsChatManager.minKick : 0; // L: 3037
					return 1; // L: 3038
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 3041
					UserComparator8.clanKickUser(var5); // L: 3042
					return 1; // L: 3043
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Projectile.friendsChatManager != null ? Projectile.friendsChatManager.rank : 0; // L: 3046
					return 1; // L: 3047
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 3050
					ApproximateRouteStrategy.Clan_joinChat(var5); // L: 3051
					return 1; // L: 3052
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					class102.Clan_leaveChat(); // L: 3055
					return 1; // L: 3056
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!InterfaceParent.friendSystem.method1942()) { // L: 3059
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = InterfaceParent.friendSystem.ignoreList.getSize(); // L: 3060
					}

					return 1; // L: 3061
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3064
					if (InterfaceParent.friendSystem.method1942() && var3 >= 0 && var3 < InterfaceParent.friendSystem.ignoreList.getSize()) { // L: 3065
						Ignored var4 = (Ignored)InterfaceParent.friendSystem.ignoreList.get(var3); // L: 3066
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var4.getName(); // L: 3067
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var4.getPreviousName(); // L: 3068
					} else {
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ""; // L: 3071
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ""; // L: 3072
					}

					return 1; // L: 3074
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 3077
					var5 = class433.method8127(var5); // L: 3078
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = InterfaceParent.friendSystem.isIgnored(new Username(var5, FriendLoginUpdate.loginType)) ? 1 : 0; // L: 3079
					return 1; // L: 3080
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3083
					if (Projectile.friendsChatManager != null && var3 < Projectile.friendsChatManager.getSize() && Projectile.friendsChatManager.get(var3).getUsername().equals(VarpDefinition.localPlayer.username)) { // L: 3084
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3085
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3087
					}

					return 1; // L: 3088
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (Projectile.friendsChatManager != null && Projectile.friendsChatManager.owner != null) { // L: 3091
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = Projectile.friendsChatManager.owner; // L: 3092
					} else {
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ""; // L: 3094
					}

					return 1; // L: 3095
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3098
					if (Projectile.friendsChatManager != null && var3 < Projectile.friendsChatManager.getSize() && ((FriendsChatMember)Projectile.friendsChatManager.get(var3)).isFriend()) { // L: 3099
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3100
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3102
					}

					return 1; // L: 3103
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						InterfaceParent.friendSystem.friendsList.removeComparator(); // L: 3114
						return 1; // L: 3115
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3118
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator1(var7)); // L: 3119
							return 1; // L: 3120
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3123
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator2(var7)); // L: 3124
							return 1; // L: 3125
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3128
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator3(var7)); // L: 3129
							return 1; // L: 3130
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3133
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator4(var7)); // L: 3134
							return 1; // L: 3135
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3138
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator5(var7)); // L: 3139
							return 1; // L: 3140
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3143
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator6(var7)); // L: 3144
							return 1; // L: 3145
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3148
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator7(var7)); // L: 3149
							return 1; // L: 3150
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3153
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator8(var7)); // L: 3154
							return 1; // L: 3155
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3158
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator9(var7)); // L: 3159
							return 1; // L: 3160
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3163
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator10(var7)); // L: 3164
							return 1; // L: 3165
						} else if (var0 == 3639) {
							InterfaceParent.friendSystem.friendsList.sort(); // L: 3168
							return 1; // L: 3169
						} else if (var0 == 3640) {
							InterfaceParent.friendSystem.ignoreList.removeComparator(); // L: 3172
							return 1; // L: 3173
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3176
							InterfaceParent.friendSystem.ignoreList.addComparator(new UserComparator1(var7)); // L: 3177
							return 1; // L: 3178
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3181
							InterfaceParent.friendSystem.ignoreList.addComparator(new UserComparator2(var7)); // L: 3182
							return 1; // L: 3183
						} else if (var0 == 3643) {
							InterfaceParent.friendSystem.ignoreList.sort(); // L: 3186
							return 1; // L: 3187
						} else if (var0 == 3644) {
							if (Projectile.friendsChatManager != null) { // L: 3190
								Projectile.friendsChatManager.removeComparator(); // L: 3191
							}

							return 1; // L: 3193
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3196
							if (Projectile.friendsChatManager != null) { // L: 3197
								Projectile.friendsChatManager.addComparator(new UserComparator1(var7)); // L: 3198
							}

							return 1; // L: 3200
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3203
							if (Projectile.friendsChatManager != null) { // L: 3204
								Projectile.friendsChatManager.addComparator(new UserComparator2(var7)); // L: 3205
							}

							return 1; // L: 3207
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3210
							if (Projectile.friendsChatManager != null) { // L: 3211
								Projectile.friendsChatManager.addComparator(new UserComparator3(var7)); // L: 3212
							}

							return 1; // L: 3214
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3217
							if (Projectile.friendsChatManager != null) { // L: 3218
								Projectile.friendsChatManager.addComparator(new UserComparator4(var7)); // L: 3219
							}

							return 1; // L: 3221
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3224
							if (Projectile.friendsChatManager != null) { // L: 3225
								Projectile.friendsChatManager.addComparator(new UserComparator5(var7)); // L: 3226
							}

							return 1; // L: 3228
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3231
							if (Projectile.friendsChatManager != null) { // L: 3232
								Projectile.friendsChatManager.addComparator(new UserComparator6(var7)); // L: 3233
							}

							return 1; // L: 3235
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3238
							if (Projectile.friendsChatManager != null) { // L: 3239
								Projectile.friendsChatManager.addComparator(new UserComparator7(var7)); // L: 3240
							}

							return 1; // L: 3242
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3245
							if (Projectile.friendsChatManager != null) { // L: 3246
								Projectile.friendsChatManager.addComparator(new UserComparator8(var7)); // L: 3247
							}

							return 1; // L: 3249
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3252
							if (Projectile.friendsChatManager != null) { // L: 3253
								Projectile.friendsChatManager.addComparator(new UserComparator9(var7)); // L: 3254
							}

							return 1; // L: 3256
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3259
							if (Projectile.friendsChatManager != null) { // L: 3260
								Projectile.friendsChatManager.addComparator(new UserComparator10(var7)); // L: 3261
							}

							return 1; // L: 3263
						} else if (var0 == 3655) {
							if (Projectile.friendsChatManager != null) { // L: 3266
								Projectile.friendsChatManager.sort(); // L: 3267
							}

							return 1; // L: 3269
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3272
							InterfaceParent.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7)); // L: 3273
							return 1; // L: 3274
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3277
							if (Projectile.friendsChatManager != null) { // L: 3278
								Projectile.friendsChatManager.addComparator(new BuddyRankComparator(var7)); // L: 3279
							}

							return 1; // L: 3281
						} else {
							return 2; // L: 3283
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3106
					if (Projectile.friendsChatManager != null && var3 < Projectile.friendsChatManager.getSize() && ((FriendsChatMember)Projectile.friendsChatManager.get(var3)).isIgnored()) { // L: 3107
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3108
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3110
					}

					return 1; // L: 3111
				}
			}
		}
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(Ldy;I)V",
		garbageValue = "-1240244412"
	)
	static final void method4126(PendingSpawn var0) {
		long var1 = 0L; // L: 8629
		int var3 = -1; // L: 8630
		int var4 = 0; // L: 8631
		int var5 = 0; // L: 8632
		if (var0.type == 0) { // L: 8633
			var1 = Actor.scene.getWallObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) { // L: 8634
			var1 = Actor.scene.getDecorativeObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) { // L: 8635
			var1 = Actor.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) { // L: 8636
			var1 = Actor.scene.getGroundObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var1 != 0L) { // L: 8637
			int var6 = Actor.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1); // L: 8638
			var3 = Message.Entity_unpackID(var1); // L: 8639
			var4 = var6 & 31; // L: 8640
			var5 = var6 >> 6 & 3; // L: 8641
		}

		var0.objectId = var3; // L: 8643
		var0.field1196 = var4; // L: 8644
		var0.field1197 = var5; // L: 8645
	} // L: 8646
}
