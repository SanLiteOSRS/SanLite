import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kk")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("jj")
	@Export("regions")
	static int[] regions;
	@ObfuscatedName("ax")
	@Export("worldMapData0Set")
	HashSet worldMapData0Set;
	@ObfuscatedName("ai")
	@Export("worldMapData1Set")
	HashSet worldMapData1Set;
	@ObfuscatedName("ag")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	} // L: 14

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(Lsg;Lsg;IZB)V",
		garbageValue = "-7"
	)
	@Export("init")
	void init(Buffer var1, Buffer var2, int var3, boolean var4) {
		this.read(var1, var3); // L: 17
		int var5 = var2.readUnsignedShort(); // L: 18
		this.worldMapData0Set = new HashSet(var5); // L: 19

		int var6;
		for (var6 = 0; var6 < var5; ++var6) { // L: 20
			WorldMapData_0 var7 = new WorldMapData_0(); // L: 21

			try {
				var7.init(var2); // L: 23
			} catch (IllegalStateException var12) { // L: 25
				continue; // L: 26
			}

			this.worldMapData0Set.add(var7); // L: 28
		}

		var6 = var2.readUnsignedShort(); // L: 30
		this.worldMapData1Set = new HashSet(var6); // L: 31

		for (int var10 = 0; var10 < var6; ++var10) { // L: 32
			WorldMapData_1 var8 = new WorldMapData_1(); // L: 33

			try {
				var8.init(var2); // L: 35
			} catch (IllegalStateException var11) { // L: 37
				continue; // L: 38
			}

			this.worldMapData1Set.add(var8); // L: 40
		}

		this.initIconsList(var2, var4); // L: 42
	} // L: 43

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Lsg;ZI)V",
		garbageValue = "1022421975"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList(); // L: 46
		int var3 = var1.readUnsignedShort(); // L: 47

		for (int var4 = 0; var4 < var3; ++var4) { // L: 48
			int var5 = var1.method9108(); // L: 49
			Coord var6 = new Coord(var1.readInt()); // L: 50
			boolean var7 = var1.readUnsignedByte() == 1; // L: 51
			if (var2 || !var7) { // L: 52
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null)); // L: 53
			}
		}

	} // L: 56

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZI)I",
		garbageValue = "1038224910"
	)
	static int method5566(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) { // L: 2838
			if (World.friendSystem.field812 == 0) { // L: 2839
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -2;
			} else if (World.friendSystem.field812 == 1) { // L: 2840
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = World.friendSystem.friendsList.getSize(); // L: 2841
			}

			return 1; // L: 2842
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2845
				if (World.friendSystem.method1845() && var3 >= 0 && var3 < World.friendSystem.friendsList.getSize()) { // L: 2846
					Friend var8 = (Friend)World.friendSystem.friendsList.get(var3); // L: 2847
					Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var8.getName(); // L: 2848
					Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var8.getPreviousName(); // L: 2849
				} else {
					Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 2852
					Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 2853
				}

				return 1; // L: 2855
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2858
				if (World.friendSystem.method1845() && var3 >= 0 && var3 < World.friendSystem.friendsList.getSize()) { // L: 2859
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)World.friendSystem.friendsList.get(var3)).world; // L: 2860
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2862
				}

				return 1; // L: 2863
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2866
				if (World.friendSystem.method1845() && var3 >= 0 && var3 < World.friendSystem.friendsList.getSize()) { // L: 2867
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)World.friendSystem.friendsList.get(var3)).rank; // L: 2868
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2870
				}

				return 1; // L: 2871
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 2874
					int var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2875
					LoginScreenAnimation.method2441(var5, var9); // L: 2876
					return 1; // L: 2877
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 2880
					World.friendSystem.addFriend(var5); // L: 2881
					return 1; // L: 2882
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 2885
					World.friendSystem.removeFriend(var5); // L: 2886
					return 1; // L: 2887
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 2890
					World.friendSystem.addIgnore(var5); // L: 2891
					return 1; // L: 2892
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 2895
					boolean var6 = true; // L: 2896
					World.friendSystem.method1843(var5, var6); // L: 2897
					return 1; // L: 2898
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 2901
					var5 = ModeWhere.method6952(var5); // L: 2902
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = World.friendSystem.isFriended(new Username(var5, class70.loginType), false) ? 1 : 0; // L: 2903
					return 1; // L: 2904
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (UserComparator5.friendsChatManager != null) { // L: 2907
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = UserComparator5.friendsChatManager.name; // L: 2908
					} else {
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 2910
					}

					return 1; // L: 2911
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (UserComparator5.friendsChatManager != null) { // L: 2914
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator5.friendsChatManager.getSize(); // L: 2915
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2917
					}

					return 1; // L: 2918
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2921
					if (UserComparator5.friendsChatManager != null && var3 < UserComparator5.friendsChatManager.getSize()) { // L: 2922
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = UserComparator5.friendsChatManager.get(var3).getUsername().getName(); // L: 2923
					} else {
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 2925
					}

					return 1; // L: 2926
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2929
					if (UserComparator5.friendsChatManager != null && var3 < UserComparator5.friendsChatManager.getSize()) { // L: 2930
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)UserComparator5.friendsChatManager.get(var3)).getWorld(); // L: 2931
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2933
					}

					return 1; // L: 2934
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2937
					if (UserComparator5.friendsChatManager != null && var3 < UserComparator5.friendsChatManager.getSize()) { // L: 2938
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)UserComparator5.friendsChatManager.get(var3)).rank; // L: 2939
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2941
					}

					return 1; // L: 2942
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator5.friendsChatManager != null ? UserComparator5.friendsChatManager.minKick : 0; // L: 2945
					return 1; // L: 2946
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 2949
					class478.clanKickUser(var5); // L: 2950
					return 1; // L: 2951
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator5.friendsChatManager != null ? UserComparator5.friendsChatManager.rank : 0; // L: 2954
					return 1; // L: 2955
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 2958
					class379.Clan_joinChat(var5); // L: 2959
					return 1; // L: 2960
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					WorldMapData_0.Clan_leaveChat(); // L: 2963
					return 1; // L: 2964
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!World.friendSystem.method1845()) { // L: 2967
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = World.friendSystem.ignoreList.getSize(); // L: 2968
					}

					return 1; // L: 2969
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2972
					if (World.friendSystem.method1845() && var3 >= 0 && var3 < World.friendSystem.ignoreList.getSize()) { // L: 2973
						Ignored var4 = (Ignored)World.friendSystem.ignoreList.get(var3); // L: 2974
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var4.getName(); // L: 2975
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var4.getPreviousName(); // L: 2976
					} else {
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 2979
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 2980
					}

					return 1; // L: 2982
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 2985
					var5 = ModeWhere.method6952(var5); // L: 2986
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = World.friendSystem.isIgnored(new Username(var5, class70.loginType)) ? 1 : 0; // L: 2987
					return 1; // L: 2988
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2991
					if (UserComparator5.friendsChatManager != null && var3 < UserComparator5.friendsChatManager.getSize() && UserComparator5.friendsChatManager.get(var3).getUsername().equals(MusicPatchNode.localPlayer.username)) { // L: 2992
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 2993
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2995
					}

					return 1; // L: 2996
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (UserComparator5.friendsChatManager != null && UserComparator5.friendsChatManager.owner != null) { // L: 2999
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = UserComparator5.friendsChatManager.owner; // L: 3000
					} else {
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 3002
					}

					return 1; // L: 3003
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3006
					if (UserComparator5.friendsChatManager != null && var3 < UserComparator5.friendsChatManager.getSize() && ((FriendsChatMember)UserComparator5.friendsChatManager.get(var3)).isFriend()) { // L: 3007
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3008
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3010
					}

					return 1; // L: 3011
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						World.friendSystem.friendsList.removeComparator(); // L: 3022
						return 1; // L: 3023
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3026
							World.friendSystem.friendsList.addComparator(new UserComparator1(var7)); // L: 3027
							return 1; // L: 3028
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3031
							World.friendSystem.friendsList.addComparator(new UserComparator2(var7)); // L: 3032
							return 1; // L: 3033
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3036
							World.friendSystem.friendsList.addComparator(new UserComparator3(var7)); // L: 3037
							return 1; // L: 3038
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3041
							World.friendSystem.friendsList.addComparator(new UserComparator4(var7)); // L: 3042
							return 1; // L: 3043
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3046
							World.friendSystem.friendsList.addComparator(new UserComparator5(var7)); // L: 3047
							return 1; // L: 3048
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3051
							World.friendSystem.friendsList.addComparator(new UserComparator6(var7)); // L: 3052
							return 1; // L: 3053
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3056
							World.friendSystem.friendsList.addComparator(new UserComparator7(var7)); // L: 3057
							return 1; // L: 3058
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3061
							World.friendSystem.friendsList.addComparator(new UserComparator8(var7)); // L: 3062
							return 1; // L: 3063
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3066
							World.friendSystem.friendsList.addComparator(new UserComparator9(var7)); // L: 3067
							return 1; // L: 3068
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3071
							World.friendSystem.friendsList.addComparator(new UserComparator10(var7)); // L: 3072
							return 1; // L: 3073
						} else if (var0 == 3639) {
							World.friendSystem.friendsList.sort(); // L: 3076
							return 1; // L: 3077
						} else if (var0 == 3640) {
							World.friendSystem.ignoreList.removeComparator(); // L: 3080
							return 1; // L: 3081
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3084
							World.friendSystem.ignoreList.addComparator(new UserComparator1(var7)); // L: 3085
							return 1; // L: 3086
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3089
							World.friendSystem.ignoreList.addComparator(new UserComparator2(var7)); // L: 3090
							return 1; // L: 3091
						} else if (var0 == 3643) {
							World.friendSystem.ignoreList.sort(); // L: 3094
							return 1; // L: 3095
						} else if (var0 == 3644) {
							if (UserComparator5.friendsChatManager != null) { // L: 3098
								UserComparator5.friendsChatManager.removeComparator(); // L: 3099
							}

							return 1; // L: 3101
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3104
							if (UserComparator5.friendsChatManager != null) { // L: 3105
								UserComparator5.friendsChatManager.addComparator(new UserComparator1(var7)); // L: 3106
							}

							return 1; // L: 3108
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3111
							if (UserComparator5.friendsChatManager != null) { // L: 3112
								UserComparator5.friendsChatManager.addComparator(new UserComparator2(var7)); // L: 3113
							}

							return 1; // L: 3115
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3118
							if (UserComparator5.friendsChatManager != null) { // L: 3119
								UserComparator5.friendsChatManager.addComparator(new UserComparator3(var7)); // L: 3120
							}

							return 1; // L: 3122
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3125
							if (UserComparator5.friendsChatManager != null) { // L: 3126
								UserComparator5.friendsChatManager.addComparator(new UserComparator4(var7)); // L: 3127
							}

							return 1; // L: 3129
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3132
							if (UserComparator5.friendsChatManager != null) { // L: 3133
								UserComparator5.friendsChatManager.addComparator(new UserComparator5(var7)); // L: 3134
							}

							return 1; // L: 3136
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3139
							if (UserComparator5.friendsChatManager != null) { // L: 3140
								UserComparator5.friendsChatManager.addComparator(new UserComparator6(var7)); // L: 3141
							}

							return 1; // L: 3143
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3146
							if (UserComparator5.friendsChatManager != null) { // L: 3147
								UserComparator5.friendsChatManager.addComparator(new UserComparator7(var7)); // L: 3148
							}

							return 1; // L: 3150
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3153
							if (UserComparator5.friendsChatManager != null) { // L: 3154
								UserComparator5.friendsChatManager.addComparator(new UserComparator8(var7)); // L: 3155
							}

							return 1; // L: 3157
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3160
							if (UserComparator5.friendsChatManager != null) { // L: 3161
								UserComparator5.friendsChatManager.addComparator(new UserComparator9(var7)); // L: 3162
							}

							return 1; // L: 3164
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3167
							if (UserComparator5.friendsChatManager != null) { // L: 3168
								UserComparator5.friendsChatManager.addComparator(new UserComparator10(var7)); // L: 3169
							}

							return 1; // L: 3171
						} else if (var0 == 3655) {
							if (UserComparator5.friendsChatManager != null) { // L: 3174
								UserComparator5.friendsChatManager.sort(); // L: 3175
							}

							return 1; // L: 3177
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3180
							World.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7)); // L: 3181
							return 1; // L: 3182
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3185
							if (UserComparator5.friendsChatManager != null) { // L: 3186
								UserComparator5.friendsChatManager.addComparator(new BuddyRankComparator(var7)); // L: 3187
							}

							return 1; // L: 3189
						} else {
							return 2; // L: 3191
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3014
					if (UserComparator5.friendsChatManager != null && var3 < UserComparator5.friendsChatManager.getSize() && ((FriendsChatMember)UserComparator5.friendsChatManager.get(var3)).isIgnored()) { // L: 3015
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3016
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3018
					}

					return 1; // L: 3019
				}
			}
		}
	}
}
