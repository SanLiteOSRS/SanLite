import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ag")
public class class16 implements ThreadFactory {
	@ObfuscatedName("au")
	final ThreadGroup field81;
	@ObfuscatedName("ae")
	final AtomicInteger field80;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lar;)V"
	)
	class16(class14 var1) {
		this.this$0 = var1; // L: 68
		this.field80 = new AtomicInteger(1); // L: 66
		SecurityManager var2 = System.getSecurityManager(); // L: 69
		this.field81 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup(); // L: 70
	} // L: 71

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field81, var1, this.this$0.field72 + "-rest-request-" + this.field80.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5); // L: 77
		return var2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-192145795"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0; // L: 73
		if (var0 < 0 || var0 >= 65536) { // L: 74
			var0 >>>= 16; // L: 75
			var1 += 16; // L: 76
		}

		if (var0 >= 256) { // L: 78
			var0 >>>= 8; // L: 79
			var1 += 8; // L: 80
		}

		if (var0 >= 16) { // L: 82
			var0 >>>= 4; // L: 83
			var1 += 4; // L: 84
		}

		if (var0 >= 4) { // L: 86
			var0 >>>= 2; // L: 87
			var1 += 2; // L: 88
		}

		if (var0 >= 1) { // L: 90
			var0 >>>= 1; // L: 91
			++var1; // L: 92
		}

		return var0 + var1; // L: 94
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZB)I",
		garbageValue = "2"
	)
	static int method206(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) { // L: 2884
			if (class299.friendSystem.field851 == 0) { // L: 2885
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -2;
			} else if (class299.friendSystem.field851 == 1) { // L: 2886
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class299.friendSystem.friendsList.getSize(); // L: 2887
			}

			return 1; // L: 2888
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 2891
				if (class299.friendSystem.method1855() && var3 >= 0 && var3 < class299.friendSystem.friendsList.getSize()) { // L: 2892
					Friend var8 = (Friend)class299.friendSystem.friendsList.get(var3); // L: 2893
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var8.getName(); // L: 2894
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var8.getPreviousName(); // L: 2895
				} else {
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 2898
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 2899
				}

				return 1; // L: 2901
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 2904
				if (class299.friendSystem.method1855() && var3 >= 0 && var3 < class299.friendSystem.friendsList.getSize()) { // L: 2905
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = ((Buddy)class299.friendSystem.friendsList.get(var3)).world; // L: 2906
				} else {
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 2908
				}

				return 1; // L: 2909
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 2912
				if (class299.friendSystem.method1855() && var3 >= 0 && var3 < class299.friendSystem.friendsList.getSize()) { // L: 2913
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = ((Buddy)class299.friendSystem.friendsList.get(var3)).rank; // L: 2914
				} else {
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 2916
				}

				return 1; // L: 2917
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 2920
					int var9 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 2921
					class161.method3289(var5, var9); // L: 2922
					return 1; // L: 2923
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 2926
					class299.friendSystem.addFriend(var5); // L: 2927
					return 1; // L: 2928
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 2931
					class299.friendSystem.removeFriend(var5); // L: 2932
					return 1; // L: 2933
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 2936
					class299.friendSystem.addIgnore(var5); // L: 2937
					return 1; // L: 2938
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 2941
					boolean var6 = true; // L: 2942
					class299.friendSystem.method1867(var5, var6); // L: 2943
					return 1; // L: 2944
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 2947
					var5 = class183.method3545(var5); // L: 2948
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class299.friendSystem.isFriended(new Username(var5, Language.loginType), false) ? 1 : 0; // L: 2949
					return 1; // L: 2950
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (ReflectionCheck.friendsChatManager != null) { // L: 2953
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ReflectionCheck.friendsChatManager.name; // L: 2954
					} else {
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 2956
					}

					return 1; // L: 2957
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (ReflectionCheck.friendsChatManager != null) { // L: 2960
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = ReflectionCheck.friendsChatManager.getSize(); // L: 2961
					} else {
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 2963
					}

					return 1; // L: 2964
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 2967
					if (ReflectionCheck.friendsChatManager != null && var3 < ReflectionCheck.friendsChatManager.getSize()) { // L: 2968
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ReflectionCheck.friendsChatManager.get(var3).getUsername().getName(); // L: 2969
					} else {
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 2971
					}

					return 1; // L: 2972
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 2975
					if (ReflectionCheck.friendsChatManager != null && var3 < ReflectionCheck.friendsChatManager.getSize()) { // L: 2976
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = ((Buddy)ReflectionCheck.friendsChatManager.get(var3)).getWorld(); // L: 2977
					} else {
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 2979
					}

					return 1; // L: 2980
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 2983
					if (ReflectionCheck.friendsChatManager != null && var3 < ReflectionCheck.friendsChatManager.getSize()) { // L: 2984
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = ((Buddy)ReflectionCheck.friendsChatManager.get(var3)).rank; // L: 2985
					} else {
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 2987
					}

					return 1; // L: 2988
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = ReflectionCheck.friendsChatManager != null ? ReflectionCheck.friendsChatManager.minKick : 0; // L: 2991
					return 1; // L: 2992
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 2995
					class131.clanKickUser(var5); // L: 2996
					return 1; // L: 2997
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = ReflectionCheck.friendsChatManager != null ? ReflectionCheck.friendsChatManager.rank : 0; // L: 3000
					return 1; // L: 3001
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 3004
					UrlRequester.Clan_joinChat(var5); // L: 3005
					return 1; // L: 3006
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					Player.Clan_leaveChat(); // L: 3009
					return 1; // L: 3010
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!class299.friendSystem.method1855()) { // L: 3013
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class299.friendSystem.ignoreList.getSize(); // L: 3014
					}

					return 1; // L: 3015
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3018
					if (class299.friendSystem.method1855() && var3 >= 0 && var3 < class299.friendSystem.ignoreList.getSize()) { // L: 3019
						Ignored var4 = (Ignored)class299.friendSystem.ignoreList.get(var3); // L: 3020
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var4.getName(); // L: 3021
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var4.getPreviousName(); // L: 3022
					} else {
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 3025
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 3026
					}

					return 1; // L: 3028
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 3031
					var5 = class183.method3545(var5); // L: 3032
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class299.friendSystem.isIgnored(new Username(var5, Language.loginType)) ? 1 : 0; // L: 3033
					return 1; // L: 3034
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3037
					if (ReflectionCheck.friendsChatManager != null && var3 < ReflectionCheck.friendsChatManager.getSize() && ReflectionCheck.friendsChatManager.get(var3).getUsername().equals(VarbitComposition.localPlayer.username)) { // L: 3038
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 1; // L: 3039
					} else {
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 3041
					}

					return 1; // L: 3042
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (ReflectionCheck.friendsChatManager != null && ReflectionCheck.friendsChatManager.owner != null) { // L: 3045
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ReflectionCheck.friendsChatManager.owner; // L: 3046
					} else {
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 3048
					}

					return 1; // L: 3049
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3052
					if (ReflectionCheck.friendsChatManager != null && var3 < ReflectionCheck.friendsChatManager.getSize() && ((FriendsChatMember)ReflectionCheck.friendsChatManager.get(var3)).isFriend()) { // L: 3053
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 1; // L: 3054
					} else {
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 3056
					}

					return 1; // L: 3057
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						class299.friendSystem.friendsList.removeComparator(); // L: 3068
						return 1; // L: 3069
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 3072
							class299.friendSystem.friendsList.addComparator(new UserComparator1(var7)); // L: 3073
							return 1; // L: 3074
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 3077
							class299.friendSystem.friendsList.addComparator(new UserComparator2(var7)); // L: 3078
							return 1; // L: 3079
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 3082
							class299.friendSystem.friendsList.addComparator(new UserComparator3(var7)); // L: 3083
							return 1; // L: 3084
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 3087
							class299.friendSystem.friendsList.addComparator(new UserComparator4(var7)); // L: 3088
							return 1; // L: 3089
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 3092
							class299.friendSystem.friendsList.addComparator(new UserComparator5(var7)); // L: 3093
							return 1; // L: 3094
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 3097
							class299.friendSystem.friendsList.addComparator(new UserComparator6(var7)); // L: 3098
							return 1; // L: 3099
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 3102
							class299.friendSystem.friendsList.addComparator(new UserComparator7(var7)); // L: 3103
							return 1; // L: 3104
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 3107
							class299.friendSystem.friendsList.addComparator(new UserComparator8(var7)); // L: 3108
							return 1; // L: 3109
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 3112
							class299.friendSystem.friendsList.addComparator(new UserComparator9(var7)); // L: 3113
							return 1; // L: 3114
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 3117
							class299.friendSystem.friendsList.addComparator(new UserComparator10(var7)); // L: 3118
							return 1; // L: 3119
						} else if (var0 == 3639) {
							class299.friendSystem.friendsList.sort(); // L: 3122
							return 1; // L: 3123
						} else if (var0 == 3640) {
							class299.friendSystem.ignoreList.removeComparator(); // L: 3126
							return 1; // L: 3127
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 3130
							class299.friendSystem.ignoreList.addComparator(new UserComparator1(var7)); // L: 3131
							return 1; // L: 3132
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 3135
							class299.friendSystem.ignoreList.addComparator(new UserComparator2(var7)); // L: 3136
							return 1; // L: 3137
						} else if (var0 == 3643) {
							class299.friendSystem.ignoreList.sort(); // L: 3140
							return 1; // L: 3141
						} else if (var0 == 3644) {
							if (ReflectionCheck.friendsChatManager != null) { // L: 3144
								ReflectionCheck.friendsChatManager.removeComparator(); // L: 3145
							}

							return 1; // L: 3147
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 3150
							if (ReflectionCheck.friendsChatManager != null) { // L: 3151
								ReflectionCheck.friendsChatManager.addComparator(new UserComparator1(var7)); // L: 3152
							}

							return 1; // L: 3154
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 3157
							if (ReflectionCheck.friendsChatManager != null) { // L: 3158
								ReflectionCheck.friendsChatManager.addComparator(new UserComparator2(var7)); // L: 3159
							}

							return 1; // L: 3161
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 3164
							if (ReflectionCheck.friendsChatManager != null) { // L: 3165
								ReflectionCheck.friendsChatManager.addComparator(new UserComparator3(var7)); // L: 3166
							}

							return 1; // L: 3168
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 3171
							if (ReflectionCheck.friendsChatManager != null) { // L: 3172
								ReflectionCheck.friendsChatManager.addComparator(new UserComparator4(var7)); // L: 3173
							}

							return 1; // L: 3175
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 3178
							if (ReflectionCheck.friendsChatManager != null) { // L: 3179
								ReflectionCheck.friendsChatManager.addComparator(new UserComparator5(var7)); // L: 3180
							}

							return 1; // L: 3182
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 3185
							if (ReflectionCheck.friendsChatManager != null) { // L: 3186
								ReflectionCheck.friendsChatManager.addComparator(new UserComparator6(var7)); // L: 3187
							}

							return 1; // L: 3189
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 3192
							if (ReflectionCheck.friendsChatManager != null) { // L: 3193
								ReflectionCheck.friendsChatManager.addComparator(new UserComparator7(var7)); // L: 3194
							}

							return 1; // L: 3196
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 3199
							if (ReflectionCheck.friendsChatManager != null) { // L: 3200
								ReflectionCheck.friendsChatManager.addComparator(new UserComparator8(var7)); // L: 3201
							}

							return 1; // L: 3203
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 3206
							if (ReflectionCheck.friendsChatManager != null) { // L: 3207
								ReflectionCheck.friendsChatManager.addComparator(new UserComparator9(var7)); // L: 3208
							}

							return 1; // L: 3210
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 3213
							if (ReflectionCheck.friendsChatManager != null) { // L: 3214
								ReflectionCheck.friendsChatManager.addComparator(new UserComparator10(var7)); // L: 3215
							}

							return 1; // L: 3217
						} else if (var0 == 3655) {
							if (ReflectionCheck.friendsChatManager != null) { // L: 3220
								ReflectionCheck.friendsChatManager.sort(); // L: 3221
							}

							return 1; // L: 3223
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 3226
							class299.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7)); // L: 3227
							return 1; // L: 3228
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 3231
							if (ReflectionCheck.friendsChatManager != null) { // L: 3232
								ReflectionCheck.friendsChatManager.addComparator(new BuddyRankComparator(var7)); // L: 3233
							}

							return 1; // L: 3235
						} else {
							return 2; // L: 3237
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3060
					if (ReflectionCheck.friendsChatManager != null && var3 < ReflectionCheck.friendsChatManager.getSize() && ((FriendsChatMember)ReflectionCheck.friendsChatManager.get(var3)).isIgnored()) { // L: 3061
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 1; // L: 3062
					} else {
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 3064
					}

					return 1; // L: 3065
				}
			}
		}
	}
}
