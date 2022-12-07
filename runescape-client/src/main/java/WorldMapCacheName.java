import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ic")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	public static final WorldMapCacheName field3010;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	public static final WorldMapCacheName field3005;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	public static final WorldMapCacheName field3009;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static final WorldMapCacheName field3007;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	public static final WorldMapCacheName field3004;
	@ObfuscatedName("q")
	@Export("name")
	public final String name;

	static {
		field3010 = new WorldMapCacheName("details"); // L: 4
		field3005 = new WorldMapCacheName("compositemap"); // L: 5
		field3009 = new WorldMapCacheName("compositetexture"); // L: 6
		field3007 = new WorldMapCacheName("area"); // L: 7
		field3004 = new WorldMapCacheName("labels"); // L: 8
	}

	WorldMapCacheName(String var1) {
		this.name = var1; // L: 12
	} // L: 13

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZI)I",
		garbageValue = "1974028758"
	)
	static int method5339(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) { // L: 2721
			if (DefaultsGroup.friendSystem.field833 == 0) { // L: 2722
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -2;
			} else if (DefaultsGroup.friendSystem.field833 == 1) { // L: 2723
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = DefaultsGroup.friendSystem.friendsList.getSize(); // L: 2724
			}

			return 1; // L: 2725
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 2728
				if (DefaultsGroup.friendSystem.method1827() && var3 >= 0 && var3 < DefaultsGroup.friendSystem.friendsList.getSize()) { // L: 2729
					Friend var8 = (Friend)DefaultsGroup.friendSystem.friendsList.get(var3); // L: 2730
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.getName(); // L: 2731
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.getPreviousName(); // L: 2732
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2735
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2736
				}

				return 1; // L: 2738
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 2741
				if (DefaultsGroup.friendSystem.method1827() && var3 >= 0 && var3 < DefaultsGroup.friendSystem.friendsList.getSize()) { // L: 2742
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = ((Buddy)DefaultsGroup.friendSystem.friendsList.get(var3)).world; // L: 2743
				} else {
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 2745
				}

				return 1; // L: 2746
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 2749
				if (DefaultsGroup.friendSystem.method1827() && var3 >= 0 && var3 < DefaultsGroup.friendSystem.friendsList.getSize()) { // L: 2750
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = ((Buddy)DefaultsGroup.friendSystem.friendsList.get(var3)).rank; // L: 2751
				} else {
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 2753
				}

				return 1; // L: 2754
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2757
					int var6 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 2758
					class159.method3339(var5, var6); // L: 2759
					return 1; // L: 2760
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2763
					DefaultsGroup.friendSystem.addFriend(var5); // L: 2764
					return 1; // L: 2765
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2768
					DefaultsGroup.friendSystem.removeFriend(var5); // L: 2769
					return 1; // L: 2770
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2773
					DefaultsGroup.friendSystem.addIgnore(var5); // L: 2774
					return 1; // L: 2775
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2778
					DefaultsGroup.friendSystem.removeIgnore(var5); // L: 2779
					return 1; // L: 2780
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2783
					var5 = class282.method5507(var5); // L: 2784
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = DefaultsGroup.friendSystem.isFriended(new Username(var5, SecureRandomFuture.loginType), false) ? 1 : 0; // L: 2785
					return 1; // L: 2786
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (class281.friendsChatManager != null) { // L: 2789
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class281.friendsChatManager.name; // L: 2790
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2792
					}

					return 1; // L: 2793
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (class281.friendsChatManager != null) { // L: 2796
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class281.friendsChatManager.getSize(); // L: 2797
					} else {
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 2799
					}

					return 1; // L: 2800
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 2803
					if (class281.friendsChatManager != null && var3 < class281.friendsChatManager.getSize()) { // L: 2804
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class281.friendsChatManager.get(var3).getUsername().getName(); // L: 2805
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2807
					}

					return 1; // L: 2808
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 2811
					if (class281.friendsChatManager != null && var3 < class281.friendsChatManager.getSize()) { // L: 2812
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = ((Buddy)class281.friendsChatManager.get(var3)).getWorld(); // L: 2813
					} else {
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 2815
					}

					return 1; // L: 2816
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 2819
					if (class281.friendsChatManager != null && var3 < class281.friendsChatManager.getSize()) { // L: 2820
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = ((Buddy)class281.friendsChatManager.get(var3)).rank; // L: 2821
					} else {
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 2823
					}

					return 1; // L: 2824
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class281.friendsChatManager != null ? class281.friendsChatManager.minKick : 0; // L: 2827
					return 1; // L: 2828
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2831
					ReflectionCheck.clanKickUser(var5); // L: 2832
					return 1; // L: 2833
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class281.friendsChatManager != null ? class281.friendsChatManager.rank : 0; // L: 2836
					return 1; // L: 2837
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2840
					Friend.Clan_joinChat(var5); // L: 2841
					return 1; // L: 2842
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					class7.Clan_leaveChat(); // L: 2845
					return 1; // L: 2846
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!DefaultsGroup.friendSystem.method1827()) { // L: 2849
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = DefaultsGroup.friendSystem.ignoreList.getSize(); // L: 2850
					}

					return 1; // L: 2851
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 2854
					if (DefaultsGroup.friendSystem.method1827() && var3 >= 0 && var3 < DefaultsGroup.friendSystem.ignoreList.getSize()) { // L: 2855
						Ignored var4 = (Ignored)DefaultsGroup.friendSystem.ignoreList.get(var3); // L: 2856
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getName(); // L: 2857
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getPreviousName(); // L: 2858
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2861
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2862
					}

					return 1; // L: 2864
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2867
					var5 = class282.method5507(var5); // L: 2868
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = DefaultsGroup.friendSystem.isIgnored(new Username(var5, SecureRandomFuture.loginType)) ? 1 : 0; // L: 2869
					return 1; // L: 2870
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 2873
					if (class281.friendsChatManager != null && var3 < class281.friendsChatManager.getSize() && class281.friendsChatManager.get(var3).getUsername().equals(class155.localPlayer.username)) { // L: 2874
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 1; // L: 2875
					} else {
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 2877
					}

					return 1; // L: 2878
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (class281.friendsChatManager != null && class281.friendsChatManager.owner != null) { // L: 2881
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class281.friendsChatManager.owner; // L: 2882
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2884
					}

					return 1; // L: 2885
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 2888
					if (class281.friendsChatManager != null && var3 < class281.friendsChatManager.getSize() && ((FriendsChatMember)class281.friendsChatManager.get(var3)).isFriend()) { // L: 2889
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 1; // L: 2890
					} else {
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 2892
					}

					return 1; // L: 2893
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						DefaultsGroup.friendSystem.friendsList.removeComparator(); // L: 2904
						return 1; // L: 2905
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 2908
							DefaultsGroup.friendSystem.friendsList.addComparator(new UserComparator1(var7)); // L: 2909
							return 1; // L: 2910
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 2913
							DefaultsGroup.friendSystem.friendsList.addComparator(new UserComparator2(var7)); // L: 2914
							return 1; // L: 2915
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 2918
							DefaultsGroup.friendSystem.friendsList.addComparator(new UserComparator3(var7)); // L: 2919
							return 1; // L: 2920
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 2923
							DefaultsGroup.friendSystem.friendsList.addComparator(new UserComparator4(var7)); // L: 2924
							return 1; // L: 2925
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 2928
							DefaultsGroup.friendSystem.friendsList.addComparator(new UserComparator5(var7)); // L: 2929
							return 1; // L: 2930
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 2933
							DefaultsGroup.friendSystem.friendsList.addComparator(new UserComparator6(var7)); // L: 2934
							return 1; // L: 2935
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 2938
							DefaultsGroup.friendSystem.friendsList.addComparator(new UserComparator7(var7)); // L: 2939
							return 1; // L: 2940
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 2943
							DefaultsGroup.friendSystem.friendsList.addComparator(new UserComparator8(var7)); // L: 2944
							return 1; // L: 2945
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 2948
							DefaultsGroup.friendSystem.friendsList.addComparator(new UserComparator9(var7)); // L: 2949
							return 1; // L: 2950
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 2953
							DefaultsGroup.friendSystem.friendsList.addComparator(new UserComparator10(var7)); // L: 2954
							return 1; // L: 2955
						} else if (var0 == 3639) {
							DefaultsGroup.friendSystem.friendsList.sort(); // L: 2958
							return 1; // L: 2959
						} else if (var0 == 3640) {
							DefaultsGroup.friendSystem.ignoreList.removeComparator(); // L: 2962
							return 1; // L: 2963
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 2966
							DefaultsGroup.friendSystem.ignoreList.addComparator(new UserComparator1(var7)); // L: 2967
							return 1; // L: 2968
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 2971
							DefaultsGroup.friendSystem.ignoreList.addComparator(new UserComparator2(var7)); // L: 2972
							return 1; // L: 2973
						} else if (var0 == 3643) {
							DefaultsGroup.friendSystem.ignoreList.sort(); // L: 2976
							return 1; // L: 2977
						} else if (var0 == 3644) {
							if (class281.friendsChatManager != null) { // L: 2980
								class281.friendsChatManager.removeComparator(); // L: 2981
							}

							return 1; // L: 2983
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 2986
							if (class281.friendsChatManager != null) { // L: 2987
								class281.friendsChatManager.addComparator(new UserComparator1(var7)); // L: 2988
							}

							return 1; // L: 2990
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 2993
							if (class281.friendsChatManager != null) { // L: 2994
								class281.friendsChatManager.addComparator(new UserComparator2(var7)); // L: 2995
							}

							return 1; // L: 2997
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 3000
							if (class281.friendsChatManager != null) { // L: 3001
								class281.friendsChatManager.addComparator(new UserComparator3(var7)); // L: 3002
							}

							return 1; // L: 3004
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 3007
							if (class281.friendsChatManager != null) { // L: 3008
								class281.friendsChatManager.addComparator(new UserComparator4(var7)); // L: 3009
							}

							return 1; // L: 3011
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 3014
							if (class281.friendsChatManager != null) { // L: 3015
								class281.friendsChatManager.addComparator(new UserComparator5(var7)); // L: 3016
							}

							return 1; // L: 3018
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 3021
							if (class281.friendsChatManager != null) { // L: 3022
								class281.friendsChatManager.addComparator(new UserComparator6(var7)); // L: 3023
							}

							return 1; // L: 3025
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 3028
							if (class281.friendsChatManager != null) { // L: 3029
								class281.friendsChatManager.addComparator(new UserComparator7(var7)); // L: 3030
							}

							return 1; // L: 3032
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 3035
							if (class281.friendsChatManager != null) { // L: 3036
								class281.friendsChatManager.addComparator(new UserComparator8(var7)); // L: 3037
							}

							return 1; // L: 3039
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 3042
							if (class281.friendsChatManager != null) { // L: 3043
								class281.friendsChatManager.addComparator(new UserComparator9(var7)); // L: 3044
							}

							return 1; // L: 3046
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 3049
							if (class281.friendsChatManager != null) { // L: 3050
								class281.friendsChatManager.addComparator(new UserComparator10(var7)); // L: 3051
							}

							return 1; // L: 3053
						} else if (var0 == 3655) {
							if (class281.friendsChatManager != null) { // L: 3056
								class281.friendsChatManager.sort(); // L: 3057
							}

							return 1; // L: 3059
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 3062
							DefaultsGroup.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7)); // L: 3063
							return 1; // L: 3064
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 3067
							if (class281.friendsChatManager != null) { // L: 3068
								class281.friendsChatManager.addComparator(new BuddyRankComparator(var7)); // L: 3069
							}

							return 1; // L: 3071
						} else {
							return 2; // L: 3073
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 2896
					if (class281.friendsChatManager != null && var3 < class281.friendsChatManager.getSize() && ((FriendsChatMember)class281.friendsChatManager.get(var3)).isIgnored()) { // L: 2897
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 1; // L: 2898
					} else {
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 2900
					}

					return 1; // L: 2901
				}
			}
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "-606090063"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 406
		int var2 = var1.readUnsignedByte(); // L: 407
		int var3 = var1.readInt(); // L: 408
		if (var3 < 0 || AbstractArchive.field4213 != 0 && var3 > AbstractArchive.field4213) { // L: 409
			throw new RuntimeException(); // L: 410
		} else if (var2 == 0) { // L: 412
			byte[] var6 = new byte[var3]; // L: 413
			var1.readBytes(var6, 0, var3); // L: 414
			return var6; // L: 415
		} else {
			int var4 = var1.readInt(); // L: 418
			if (var4 >= 0 && (AbstractArchive.field4213 == 0 || var4 <= AbstractArchive.field4213)) { // L: 419
				byte[] var5 = new byte[var4]; // L: 422
				if (var2 == 1) { // L: 423
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5); // L: 424
				}

				return var5; // L: 425
			} else {
				throw new RuntimeException(); // L: 420
			}
		}
	}
}
