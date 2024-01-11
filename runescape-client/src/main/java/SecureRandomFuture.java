import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ca")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("am")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("ap")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor(); // L: 10
		this.future = this.executor.submit(new SecureRandomCallable()); // L: 14
	} // L: 15

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "83199324"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown(); // L: 18
		this.executor = null; // L: 19
	} // L: 20

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1515985736"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "2034582915"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get(); // L: 28
		} catch (Exception var4) { // L: 30
			SecureRandom var3 = new SecureRandom(); // L: 33
			var3.nextInt(); // L: 34
			return var3; // L: 37
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Llr;",
		garbageValue = "84"
	)
	public static PacketBufferNode method2234() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 22 23
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Low;II)V",
		garbageValue = "-1283853833"
	)
	static void method2235(AbstractArchive var0, int var1) {
		if ((var1 & class526.field5163.rsOrdinal()) != 0) { // L: 276
			GrandExchangeEvents.logoSprite = VarcInt.SpriteBuffer_getIndexedSpriteByName(var0, "logo_deadman_mode", ""); // L: 277
		} else if ((var1 & class526.field5164.rsOrdinal()) != 0) { // L: 279
			GrandExchangeEvents.logoSprite = VarcInt.SpriteBuffer_getIndexedSpriteByName(var0, "logo_seasonal_mode", ""); // L: 280
		} else if ((var1 & class526.field5142.rsOrdinal()) != 0) { // L: 282
			GrandExchangeEvents.logoSprite = VarcInt.SpriteBuffer_getIndexedSpriteByName(var0, "logo_speedrunning", ""); // L: 283
		} else {
			GrandExchangeEvents.logoSprite = VarcInt.SpriteBuffer_getIndexedSpriteByName(var0, "logo", ""); // L: 286
		}

	} // L: 288

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-1830795903"
	)
	static int method2233(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) { // L: 2930
			if (class332.friendSystem.field828 == 0) { // L: 2931
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -2;
			} else if (class332.friendSystem.field828 == 1) { // L: 2932
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class332.friendSystem.friendsList.getSize(); // L: 2933
			}

			return 1; // L: 2934
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 2937
				if (class332.friendSystem.method1900() && var3 >= 0 && var3 < class332.friendSystem.friendsList.getSize()) { // L: 2938
					Friend var8 = (Friend)class332.friendSystem.friendsList.get(var3); // L: 2939
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var8.getName(); // L: 2940
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var8.getPreviousName(); // L: 2941
				} else {
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 2944
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 2945
				}

				return 1; // L: 2947
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 2950
				if (class332.friendSystem.method1900() && var3 >= 0 && var3 < class332.friendSystem.friendsList.getSize()) { // L: 2951
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = ((Buddy)class332.friendSystem.friendsList.get(var3)).world; // L: 2952
				} else {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 2954
				}

				return 1; // L: 2955
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 2958
				if (class332.friendSystem.method1900() && var3 >= 0 && var3 < class332.friendSystem.friendsList.getSize()) { // L: 2959
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = ((Buddy)class332.friendSystem.friendsList.get(var3)).rank; // L: 2960
				} else {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 2962
				}

				return 1; // L: 2963
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 2966
					int var9 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 2967
					class353.method6914(var5, var9); // L: 2968
					return 1; // L: 2969
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 2972
					class332.friendSystem.addFriend(var5); // L: 2973
					return 1; // L: 2974
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 2977
					class332.friendSystem.removeFriend(var5); // L: 2978
					return 1; // L: 2979
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 2982
					class332.friendSystem.addIgnore(var5); // L: 2983
					return 1; // L: 2984
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 2987
					boolean var6 = true; // L: 2988
					class332.friendSystem.method1968(var5, var6); // L: 2989
					return 1; // L: 2990
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 2993
					var5 = class332.method6310(var5); // L: 2994
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class332.friendSystem.isFriended(new Username(var5, UserComparator10.loginType), false) ? 1 : 0; // L: 2995
					return 1; // L: 2996
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (ClientPreferences.friendsChatManager != null) { // L: 2999
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ClientPreferences.friendsChatManager.name; // L: 3000
					} else {
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 3002
					}

					return 1; // L: 3003
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (ClientPreferences.friendsChatManager != null) { // L: 3006
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = ClientPreferences.friendsChatManager.getSize(); // L: 3007
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 3009
					}

					return 1; // L: 3010
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3013
					if (ClientPreferences.friendsChatManager != null && var3 < ClientPreferences.friendsChatManager.getSize()) { // L: 3014
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ClientPreferences.friendsChatManager.get(var3).getUsername().getName(); // L: 3015
					} else {
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 3017
					}

					return 1; // L: 3018
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3021
					if (ClientPreferences.friendsChatManager != null && var3 < ClientPreferences.friendsChatManager.getSize()) { // L: 3022
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = ((Buddy)ClientPreferences.friendsChatManager.get(var3)).getWorld(); // L: 3023
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 3025
					}

					return 1; // L: 3026
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3029
					if (ClientPreferences.friendsChatManager != null && var3 < ClientPreferences.friendsChatManager.getSize()) { // L: 3030
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = ((Buddy)ClientPreferences.friendsChatManager.get(var3)).rank; // L: 3031
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 3033
					}

					return 1; // L: 3034
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = ClientPreferences.friendsChatManager != null ? ClientPreferences.friendsChatManager.minKick : 0; // L: 3037
					return 1; // L: 3038
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 3041
					class165.clanKickUser(var5); // L: 3042
					return 1; // L: 3043
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = ClientPreferences.friendsChatManager != null ? ClientPreferences.friendsChatManager.rank : 0; // L: 3046
					return 1; // L: 3047
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 3050
					class9.Clan_joinChat(var5); // L: 3051
					return 1; // L: 3052
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					Client.Clan_leaveChat(); // L: 3055
					return 1; // L: 3056
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!class332.friendSystem.method1900()) { // L: 3059
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class332.friendSystem.ignoreList.getSize(); // L: 3060
					}

					return 1; // L: 3061
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3064
					if (class332.friendSystem.method1900() && var3 >= 0 && var3 < class332.friendSystem.ignoreList.getSize()) { // L: 3065
						Ignored var4 = (Ignored)class332.friendSystem.ignoreList.get(var3); // L: 3066
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var4.getName(); // L: 3067
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var4.getPreviousName(); // L: 3068
					} else {
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 3071
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 3072
					}

					return 1; // L: 3074
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 3077
					var5 = class332.method6310(var5); // L: 3078
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class332.friendSystem.isIgnored(new Username(var5, UserComparator10.loginType)) ? 1 : 0; // L: 3079
					return 1; // L: 3080
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3083
					if (ClientPreferences.friendsChatManager != null && var3 < ClientPreferences.friendsChatManager.getSize() && ClientPreferences.friendsChatManager.get(var3).getUsername().equals(class25.localPlayer.username)) { // L: 3084
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 1; // L: 3085
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 3087
					}

					return 1; // L: 3088
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (ClientPreferences.friendsChatManager != null && ClientPreferences.friendsChatManager.owner != null) { // L: 3091
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ClientPreferences.friendsChatManager.owner; // L: 3092
					} else {
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 3094
					}

					return 1; // L: 3095
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3098
					if (ClientPreferences.friendsChatManager != null && var3 < ClientPreferences.friendsChatManager.getSize() && ((FriendsChatMember)ClientPreferences.friendsChatManager.get(var3)).isFriend()) { // L: 3099
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 1; // L: 3100
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 3102
					}

					return 1; // L: 3103
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						class332.friendSystem.friendsList.removeComparator(); // L: 3114
						return 1; // L: 3115
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 3118
							class332.friendSystem.friendsList.addComparator(new UserComparator1(var7)); // L: 3119
							return 1; // L: 3120
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 3123
							class332.friendSystem.friendsList.addComparator(new UserComparator2(var7)); // L: 3124
							return 1; // L: 3125
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 3128
							class332.friendSystem.friendsList.addComparator(new UserComparator3(var7)); // L: 3129
							return 1; // L: 3130
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 3133
							class332.friendSystem.friendsList.addComparator(new UserComparator4(var7)); // L: 3134
							return 1; // L: 3135
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 3138
							class332.friendSystem.friendsList.addComparator(new UserComparator5(var7)); // L: 3139
							return 1; // L: 3140
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 3143
							class332.friendSystem.friendsList.addComparator(new UserComparator6(var7)); // L: 3144
							return 1; // L: 3145
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 3148
							class332.friendSystem.friendsList.addComparator(new UserComparator7(var7)); // L: 3149
							return 1; // L: 3150
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 3153
							class332.friendSystem.friendsList.addComparator(new UserComparator8(var7)); // L: 3154
							return 1; // L: 3155
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 3158
							class332.friendSystem.friendsList.addComparator(new UserComparator9(var7)); // L: 3159
							return 1; // L: 3160
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 3163
							class332.friendSystem.friendsList.addComparator(new UserComparator10(var7)); // L: 3164
							return 1; // L: 3165
						} else if (var0 == 3639) {
							class332.friendSystem.friendsList.sort(); // L: 3168
							return 1; // L: 3169
						} else if (var0 == 3640) {
							class332.friendSystem.ignoreList.removeComparator(); // L: 3172
							return 1; // L: 3173
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 3176
							class332.friendSystem.ignoreList.addComparator(new UserComparator1(var7)); // L: 3177
							return 1; // L: 3178
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 3181
							class332.friendSystem.ignoreList.addComparator(new UserComparator2(var7)); // L: 3182
							return 1; // L: 3183
						} else if (var0 == 3643) {
							class332.friendSystem.ignoreList.sort(); // L: 3186
							return 1; // L: 3187
						} else if (var0 == 3644) {
							if (ClientPreferences.friendsChatManager != null) { // L: 3190
								ClientPreferences.friendsChatManager.removeComparator(); // L: 3191
							}

							return 1; // L: 3193
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 3196
							if (ClientPreferences.friendsChatManager != null) { // L: 3197
								ClientPreferences.friendsChatManager.addComparator(new UserComparator1(var7)); // L: 3198
							}

							return 1; // L: 3200
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 3203
							if (ClientPreferences.friendsChatManager != null) { // L: 3204
								ClientPreferences.friendsChatManager.addComparator(new UserComparator2(var7)); // L: 3205
							}

							return 1; // L: 3207
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 3210
							if (ClientPreferences.friendsChatManager != null) { // L: 3211
								ClientPreferences.friendsChatManager.addComparator(new UserComparator3(var7)); // L: 3212
							}

							return 1; // L: 3214
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 3217
							if (ClientPreferences.friendsChatManager != null) { // L: 3218
								ClientPreferences.friendsChatManager.addComparator(new UserComparator4(var7)); // L: 3219
							}

							return 1; // L: 3221
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 3224
							if (ClientPreferences.friendsChatManager != null) { // L: 3225
								ClientPreferences.friendsChatManager.addComparator(new UserComparator5(var7)); // L: 3226
							}

							return 1; // L: 3228
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 3231
							if (ClientPreferences.friendsChatManager != null) { // L: 3232
								ClientPreferences.friendsChatManager.addComparator(new UserComparator6(var7)); // L: 3233
							}

							return 1; // L: 3235
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 3238
							if (ClientPreferences.friendsChatManager != null) { // L: 3239
								ClientPreferences.friendsChatManager.addComparator(new UserComparator7(var7)); // L: 3240
							}

							return 1; // L: 3242
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 3245
							if (ClientPreferences.friendsChatManager != null) { // L: 3246
								ClientPreferences.friendsChatManager.addComparator(new UserComparator8(var7)); // L: 3247
							}

							return 1; // L: 3249
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 3252
							if (ClientPreferences.friendsChatManager != null) { // L: 3253
								ClientPreferences.friendsChatManager.addComparator(new UserComparator9(var7)); // L: 3254
							}

							return 1; // L: 3256
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 3259
							if (ClientPreferences.friendsChatManager != null) { // L: 3260
								ClientPreferences.friendsChatManager.addComparator(new UserComparator10(var7)); // L: 3261
							}

							return 1; // L: 3263
						} else if (var0 == 3655) {
							if (ClientPreferences.friendsChatManager != null) { // L: 3266
								ClientPreferences.friendsChatManager.sort(); // L: 3267
							}

							return 1; // L: 3269
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 3272
							class332.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7)); // L: 3273
							return 1; // L: 3274
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 3277
							if (ClientPreferences.friendsChatManager != null) { // L: 3278
								ClientPreferences.friendsChatManager.addComparator(new BuddyRankComparator(var7)); // L: 3279
							}

							return 1; // L: 3281
						} else {
							return 2; // L: 3283
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3106
					if (ClientPreferences.friendsChatManager != null && var3 < ClientPreferences.friendsChatManager.getSize() && ((FriendsChatMember)ClientPreferences.friendsChatManager.get(var3)).isIgnored()) { // L: 3107
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 1; // L: 3108
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 3110
					}

					return 1; // L: 3111
				}
			}
		}
	}
}
