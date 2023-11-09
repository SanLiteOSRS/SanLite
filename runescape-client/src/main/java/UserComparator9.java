import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eg")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("aj")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lpt;Lpt;I)I",
		garbageValue = "-364074758"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) { // L: 15
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 16
		} else {
			return this.compareUser(var1, var2); // L: 18
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 22
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lkb;Ltk;B)Lkp;",
		garbageValue = "-55"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2;
		if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) { // L: 24
			var2 = new PacketBufferNode(); // L: 25
		} else {
			var2 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 28
		}

		var2.clientPacket = var0; // L: 31
		var2.clientPacketLength = var0.length; // L: 32
		if (var2.clientPacketLength == -1) {
			var2.packetBuffer = new PacketBuffer(260); // L: 33
		} else if (var2.clientPacketLength == -2) { // L: 34
			var2.packetBuffer = new PacketBuffer(10000);
		} else if (var2.clientPacketLength <= 18) {
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) {
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260);
		}

		var2.packetBuffer.setIsaacCipher(var1); // L: 38
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id); // L: 39
		var2.index = 0; // L: 40
		return var2; // L: 41
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Leu;",
		garbageValue = "367893193"
	)
	static class128 method2874(int var0) {
		class128 var1 = (class128)SpriteMask.findEnumerated(class133.method3040(), var0); // L: 35
		if (var1 == null) {
			var1 = class128.field1523; // L: 36
		}

		return var1; // L: 37
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZI)I",
		garbageValue = "-1029034306"
	)
	static int method2876(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) { // L: 2817
			if (class6.friendSystem.field799 == 0) { // L: 2818
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -2;
			} else if (class6.friendSystem.field799 == 1) { // L: 2819
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class6.friendSystem.friendsList.getSize(); // L: 2820
			}

			return 1; // L: 2821
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2824
				if (class6.friendSystem.method1888() && var3 >= 0 && var3 < class6.friendSystem.friendsList.getSize()) { // L: 2825
					Friend var8 = (Friend)class6.friendSystem.friendsList.get(var3); // L: 2826
					Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var8.getName(); // L: 2827
					Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var8.getPreviousName(); // L: 2828
				} else {
					Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 2831
					Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 2832
				}

				return 1; // L: 2834
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2837
				if (class6.friendSystem.method1888() && var3 >= 0 && var3 < class6.friendSystem.friendsList.getSize()) { // L: 2838
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)class6.friendSystem.friendsList.get(var3)).world; // L: 2839
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2841
				}

				return 1; // L: 2842
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2845
				if (class6.friendSystem.method1888() && var3 >= 0 && var3 < class6.friendSystem.friendsList.getSize()) { // L: 2846
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)class6.friendSystem.friendsList.get(var3)).rank; // L: 2847
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2849
				}

				return 1; // L: 2850
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 2853
					int var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2854
					VarbitComposition.method3766(var5, var9); // L: 2855
					return 1; // L: 2856
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 2859
					class6.friendSystem.addFriend(var5); // L: 2860
					return 1; // L: 2861
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 2864
					class6.friendSystem.removeFriend(var5); // L: 2865
					return 1; // L: 2866
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 2869
					class6.friendSystem.addIgnore(var5); // L: 2870
					return 1; // L: 2871
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 2874
					boolean var6 = true; // L: 2875
					class6.friendSystem.method1896(var5, var6); // L: 2876
					return 1; // L: 2877
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 2880
					var5 = ItemComposition.method3982(var5); // L: 2881
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class6.friendSystem.isFriended(new Username(var5, Occluder.loginType), false) ? 1 : 0; // L: 2882
					return 1; // L: 2883
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (ReflectionCheck.friendsChatManager != null) { // L: 2886
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ReflectionCheck.friendsChatManager.name; // L: 2887
					} else {
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 2889
					}

					return 1; // L: 2890
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (ReflectionCheck.friendsChatManager != null) { // L: 2893
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ReflectionCheck.friendsChatManager.getSize(); // L: 2894
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2896
					}

					return 1; // L: 2897
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2900
					if (ReflectionCheck.friendsChatManager != null && var3 < ReflectionCheck.friendsChatManager.getSize()) { // L: 2901
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ReflectionCheck.friendsChatManager.get(var3).getUsername().getName(); // L: 2902
					} else {
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 2904
					}

					return 1; // L: 2905
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2908
					if (ReflectionCheck.friendsChatManager != null && var3 < ReflectionCheck.friendsChatManager.getSize()) { // L: 2909
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)ReflectionCheck.friendsChatManager.get(var3)).getWorld(); // L: 2910
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2912
					}

					return 1; // L: 2913
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2916
					if (ReflectionCheck.friendsChatManager != null && var3 < ReflectionCheck.friendsChatManager.getSize()) { // L: 2917
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)ReflectionCheck.friendsChatManager.get(var3)).rank; // L: 2918
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2920
					}

					return 1; // L: 2921
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ReflectionCheck.friendsChatManager != null ? ReflectionCheck.friendsChatManager.minKick : 0; // L: 2924
					return 1; // L: 2925
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 2928
					SoundCache.clanKickUser(var5); // L: 2929
					return 1; // L: 2930
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ReflectionCheck.friendsChatManager != null ? ReflectionCheck.friendsChatManager.rank : 0; // L: 2933
					return 1; // L: 2934
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 2937
					class72.Clan_joinChat(var5); // L: 2938
					return 1; // L: 2939
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					ClanChannelMember.Clan_leaveChat(); // L: 2942
					return 1; // L: 2943
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!class6.friendSystem.method1888()) { // L: 2946
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class6.friendSystem.ignoreList.getSize(); // L: 2947
					}

					return 1; // L: 2948
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2951
					if (class6.friendSystem.method1888() && var3 >= 0 && var3 < class6.friendSystem.ignoreList.getSize()) { // L: 2952
						Ignored var4 = (Ignored)class6.friendSystem.ignoreList.get(var3); // L: 2953
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var4.getName(); // L: 2954
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var4.getPreviousName(); // L: 2955
					} else {
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 2958
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 2959
					}

					return 1; // L: 2961
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 2964
					var5 = ItemComposition.method3982(var5); // L: 2965
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class6.friendSystem.isIgnored(new Username(var5, Occluder.loginType)) ? 1 : 0; // L: 2966
					return 1; // L: 2967
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2970
					if (ReflectionCheck.friendsChatManager != null && var3 < ReflectionCheck.friendsChatManager.getSize() && ReflectionCheck.friendsChatManager.get(var3).getUsername().equals(BuddyRankComparator.localPlayer.username)) { // L: 2971
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 2972
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2974
					}

					return 1; // L: 2975
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (ReflectionCheck.friendsChatManager != null && ReflectionCheck.friendsChatManager.owner != null) { // L: 2978
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ReflectionCheck.friendsChatManager.owner; // L: 2979
					} else {
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 2981
					}

					return 1; // L: 2982
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2985
					if (ReflectionCheck.friendsChatManager != null && var3 < ReflectionCheck.friendsChatManager.getSize() && ((FriendsChatMember)ReflectionCheck.friendsChatManager.get(var3)).isFriend()) { // L: 2986
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 2987
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2989
					}

					return 1; // L: 2990
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						class6.friendSystem.friendsList.removeComparator(); // L: 3001
						return 1; // L: 3002
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3005
							class6.friendSystem.friendsList.addComparator(new UserComparator1(var7)); // L: 3006
							return 1; // L: 3007
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3010
							class6.friendSystem.friendsList.addComparator(new UserComparator2(var7)); // L: 3011
							return 1; // L: 3012
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3015
							class6.friendSystem.friendsList.addComparator(new UserComparator3(var7)); // L: 3016
							return 1; // L: 3017
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3020
							class6.friendSystem.friendsList.addComparator(new UserComparator4(var7)); // L: 3021
							return 1; // L: 3022
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3025
							class6.friendSystem.friendsList.addComparator(new UserComparator5(var7)); // L: 3026
							return 1; // L: 3027
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3030
							class6.friendSystem.friendsList.addComparator(new UserComparator6(var7)); // L: 3031
							return 1; // L: 3032
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3035
							class6.friendSystem.friendsList.addComparator(new UserComparator7(var7)); // L: 3036
							return 1; // L: 3037
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3040
							class6.friendSystem.friendsList.addComparator(new UserComparator8(var7)); // L: 3041
							return 1; // L: 3042
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3045
							class6.friendSystem.friendsList.addComparator(new UserComparator9(var7)); // L: 3046
							return 1; // L: 3047
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3050
							class6.friendSystem.friendsList.addComparator(new UserComparator10(var7)); // L: 3051
							return 1; // L: 3052
						} else if (var0 == 3639) {
							class6.friendSystem.friendsList.sort(); // L: 3055
							return 1; // L: 3056
						} else if (var0 == 3640) {
							class6.friendSystem.ignoreList.removeComparator(); // L: 3059
							return 1; // L: 3060
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3063
							class6.friendSystem.ignoreList.addComparator(new UserComparator1(var7)); // L: 3064
							return 1; // L: 3065
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3068
							class6.friendSystem.ignoreList.addComparator(new UserComparator2(var7)); // L: 3069
							return 1; // L: 3070
						} else if (var0 == 3643) {
							class6.friendSystem.ignoreList.sort(); // L: 3073
							return 1; // L: 3074
						} else if (var0 == 3644) {
							if (ReflectionCheck.friendsChatManager != null) { // L: 3077
								ReflectionCheck.friendsChatManager.removeComparator(); // L: 3078
							}

							return 1; // L: 3080
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3083
							if (ReflectionCheck.friendsChatManager != null) { // L: 3084
								ReflectionCheck.friendsChatManager.addComparator(new UserComparator1(var7)); // L: 3085
							}

							return 1; // L: 3087
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3090
							if (ReflectionCheck.friendsChatManager != null) { // L: 3091
								ReflectionCheck.friendsChatManager.addComparator(new UserComparator2(var7)); // L: 3092
							}

							return 1; // L: 3094
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3097
							if (ReflectionCheck.friendsChatManager != null) { // L: 3098
								ReflectionCheck.friendsChatManager.addComparator(new UserComparator3(var7)); // L: 3099
							}

							return 1; // L: 3101
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3104
							if (ReflectionCheck.friendsChatManager != null) { // L: 3105
								ReflectionCheck.friendsChatManager.addComparator(new UserComparator4(var7)); // L: 3106
							}

							return 1; // L: 3108
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3111
							if (ReflectionCheck.friendsChatManager != null) { // L: 3112
								ReflectionCheck.friendsChatManager.addComparator(new UserComparator5(var7)); // L: 3113
							}

							return 1; // L: 3115
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3118
							if (ReflectionCheck.friendsChatManager != null) { // L: 3119
								ReflectionCheck.friendsChatManager.addComparator(new UserComparator6(var7)); // L: 3120
							}

							return 1; // L: 3122
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3125
							if (ReflectionCheck.friendsChatManager != null) { // L: 3126
								ReflectionCheck.friendsChatManager.addComparator(new UserComparator7(var7)); // L: 3127
							}

							return 1; // L: 3129
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3132
							if (ReflectionCheck.friendsChatManager != null) { // L: 3133
								ReflectionCheck.friendsChatManager.addComparator(new UserComparator8(var7)); // L: 3134
							}

							return 1; // L: 3136
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3139
							if (ReflectionCheck.friendsChatManager != null) { // L: 3140
								ReflectionCheck.friendsChatManager.addComparator(new UserComparator9(var7)); // L: 3141
							}

							return 1; // L: 3143
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3146
							if (ReflectionCheck.friendsChatManager != null) { // L: 3147
								ReflectionCheck.friendsChatManager.addComparator(new UserComparator10(var7)); // L: 3148
							}

							return 1; // L: 3150
						} else if (var0 == 3655) {
							if (ReflectionCheck.friendsChatManager != null) { // L: 3153
								ReflectionCheck.friendsChatManager.sort(); // L: 3154
							}

							return 1; // L: 3156
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3159
							class6.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7)); // L: 3160
							return 1; // L: 3161
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3164
							if (ReflectionCheck.friendsChatManager != null) { // L: 3165
								ReflectionCheck.friendsChatManager.addComparator(new BuddyRankComparator(var7)); // L: 3166
							}

							return 1; // L: 3168
						} else {
							return 2; // L: 3170
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2993
					if (ReflectionCheck.friendsChatManager != null && var3 < ReflectionCheck.friendsChatManager.getSize() && ((FriendsChatMember)ReflectionCheck.friendsChatManager.get(var3)).isIgnored()) { // L: 2994
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 2995
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2997
					}

					return 1; // L: 2998
				}
			}
		}
	}
}
