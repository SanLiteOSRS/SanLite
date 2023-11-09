import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("oq")
class class390 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	final class391 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lok;)V"
	)
	class390(class391 var1) {
		this.this$0 = var1; // L: 7
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Loh;Loh;I)I",
		garbageValue = "-653612573"
	)
	int method7480(class392 var1, class392 var2) {
		if (var1.field4530 > var2.field4530) {
			return 1; // L: 9
		} else {
			return var1.field4530 < var2.field4530 ? -1 : 0; // L: 10 11
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method7480((class392)var1, (class392)var2); // L: 15
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 19
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I",
		garbageValue = "1626793735"
	)
	static int method7472(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) { // L: 2718
			if (WorldMapElement.friendSystem.field824 == 0) { // L: 2719
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -2;
			} else if (WorldMapElement.friendSystem.field824 == 1) { // L: 2720
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapElement.friendSystem.friendsList.getSize(); // L: 2721
			}

			return 1; // L: 2722
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 2725
				if (WorldMapElement.friendSystem.method1907() && var3 >= 0 && var3 < WorldMapElement.friendSystem.friendsList.getSize()) { // L: 2726
					Friend var8 = (Friend)WorldMapElement.friendSystem.friendsList.get(var3); // L: 2727
					Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var8.getName(); // L: 2728
					Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var8.getPreviousName(); // L: 2729
				} else {
					Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 2732
					Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 2733
				}

				return 1; // L: 2735
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 2738
				if (WorldMapElement.friendSystem.method1907() && var3 >= 0 && var3 < WorldMapElement.friendSystem.friendsList.getSize()) { // L: 2739
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = ((Buddy)WorldMapElement.friendSystem.friendsList.get(var3)).world; // L: 2740
				} else {
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 2742
				}

				return 1; // L: 2743
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 2746
				if (WorldMapElement.friendSystem.method1907() && var3 >= 0 && var3 < WorldMapElement.friendSystem.friendsList.getSize()) { // L: 2747
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = ((Buddy)WorldMapElement.friendSystem.friendsList.get(var3)).rank; // L: 2748
				} else {
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 2750
				}

				return 1; // L: 2751
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 2754
					int var6 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 2755
					class385.method7407(var5, var6); // L: 2756
					return 1; // L: 2757
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 2760
					WorldMapElement.friendSystem.addFriend(var5); // L: 2761
					return 1; // L: 2762
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 2765
					WorldMapElement.friendSystem.removeFriend(var5); // L: 2766
					return 1; // L: 2767
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 2770
					WorldMapElement.friendSystem.addIgnore(var5); // L: 2771
					return 1; // L: 2772
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 2775
					WorldMapElement.friendSystem.removeIgnore(var5); // L: 2776
					return 1; // L: 2777
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 2780
					var5 = class6.method48(var5); // L: 2781
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapElement.friendSystem.isFriended(new Username(var5, WorldMapCacheName.loginType), false) ? 1 : 0; // L: 2782
					return 1; // L: 2783
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (class463.friendsChatManager != null) { // L: 2786
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = class463.friendsChatManager.name; // L: 2787
					} else {
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 2789
					}

					return 1; // L: 2790
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (class463.friendsChatManager != null) { // L: 2793
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class463.friendsChatManager.getSize(); // L: 2794
					} else {
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 2796
					}

					return 1; // L: 2797
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 2800
					if (class463.friendsChatManager != null && var3 < class463.friendsChatManager.getSize()) { // L: 2801
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = class463.friendsChatManager.get(var3).getUsername().getName(); // L: 2802
					} else {
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 2804
					}

					return 1; // L: 2805
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 2808
					if (class463.friendsChatManager != null && var3 < class463.friendsChatManager.getSize()) { // L: 2809
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = ((Buddy)class463.friendsChatManager.get(var3)).getWorld(); // L: 2810
					} else {
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 2812
					}

					return 1; // L: 2813
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 2816
					if (class463.friendsChatManager != null && var3 < class463.friendsChatManager.getSize()) { // L: 2817
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = ((Buddy)class463.friendsChatManager.get(var3)).rank; // L: 2818
					} else {
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 2820
					}

					return 1; // L: 2821
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class463.friendsChatManager != null ? class463.friendsChatManager.minKick : 0; // L: 2824
					return 1; // L: 2825
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 2828
					class160.clanKickUser(var5); // L: 2829
					return 1; // L: 2830
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class463.friendsChatManager != null ? class463.friendsChatManager.rank : 0; // L: 2833
					return 1; // L: 2834
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 2837
					ClanSettings.Clan_joinChat(var5); // L: 2838
					return 1; // L: 2839
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					GrandExchangeOffer.Clan_leaveChat(); // L: 2842
					return 1; // L: 2843
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!WorldMapElement.friendSystem.method1907()) { // L: 2846
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapElement.friendSystem.ignoreList.getSize(); // L: 2847
					}

					return 1; // L: 2848
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 2851
					if (WorldMapElement.friendSystem.method1907() && var3 >= 0 && var3 < WorldMapElement.friendSystem.ignoreList.getSize()) { // L: 2852
						Ignored var4 = (Ignored)WorldMapElement.friendSystem.ignoreList.get(var3); // L: 2853
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var4.getName(); // L: 2854
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var4.getPreviousName(); // L: 2855
					} else {
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 2858
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 2859
					}

					return 1; // L: 2861
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 2864
					var5 = class6.method48(var5); // L: 2865
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapElement.friendSystem.isIgnored(new Username(var5, WorldMapCacheName.loginType)) ? 1 : 0; // L: 2866
					return 1; // L: 2867
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 2870
					if (class463.friendsChatManager != null && var3 < class463.friendsChatManager.getSize() && class463.friendsChatManager.get(var3).getUsername().equals(class387.localPlayer.username)) { // L: 2871
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 1; // L: 2872
					} else {
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 2874
					}

					return 1; // L: 2875
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (class463.friendsChatManager != null && class463.friendsChatManager.owner != null) { // L: 2878
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = class463.friendsChatManager.owner; // L: 2879
					} else {
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 2881
					}

					return 1; // L: 2882
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 2885
					if (class463.friendsChatManager != null && var3 < class463.friendsChatManager.getSize() && ((FriendsChatMember)class463.friendsChatManager.get(var3)).isFriend()) { // L: 2886
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 1; // L: 2887
					} else {
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 2889
					}

					return 1; // L: 2890
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						WorldMapElement.friendSystem.friendsList.removeComparator(); // L: 2901
						return 1; // L: 2902
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 2905
							WorldMapElement.friendSystem.friendsList.addComparator(new UserComparator1(var7)); // L: 2906
							return 1; // L: 2907
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 2910
							WorldMapElement.friendSystem.friendsList.addComparator(new UserComparator2(var7)); // L: 2911
							return 1; // L: 2912
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 2915
							WorldMapElement.friendSystem.friendsList.addComparator(new UserComparator3(var7)); // L: 2916
							return 1; // L: 2917
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 2920
							WorldMapElement.friendSystem.friendsList.addComparator(new UserComparator4(var7)); // L: 2921
							return 1; // L: 2922
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 2925
							WorldMapElement.friendSystem.friendsList.addComparator(new UserComparator5(var7)); // L: 2926
							return 1; // L: 2927
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 2930
							WorldMapElement.friendSystem.friendsList.addComparator(new UserComparator6(var7)); // L: 2931
							return 1; // L: 2932
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 2935
							WorldMapElement.friendSystem.friendsList.addComparator(new UserComparator7(var7)); // L: 2936
							return 1; // L: 2937
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 2940
							WorldMapElement.friendSystem.friendsList.addComparator(new UserComparator8(var7)); // L: 2941
							return 1; // L: 2942
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 2945
							WorldMapElement.friendSystem.friendsList.addComparator(new UserComparator9(var7)); // L: 2946
							return 1; // L: 2947
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 2950
							WorldMapElement.friendSystem.friendsList.addComparator(new UserComparator10(var7)); // L: 2951
							return 1; // L: 2952
						} else if (var0 == 3639) {
							WorldMapElement.friendSystem.friendsList.sort(); // L: 2955
							return 1; // L: 2956
						} else if (var0 == 3640) {
							WorldMapElement.friendSystem.ignoreList.removeComparator(); // L: 2959
							return 1; // L: 2960
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 2963
							WorldMapElement.friendSystem.ignoreList.addComparator(new UserComparator1(var7)); // L: 2964
							return 1; // L: 2965
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 2968
							WorldMapElement.friendSystem.ignoreList.addComparator(new UserComparator2(var7)); // L: 2969
							return 1; // L: 2970
						} else if (var0 == 3643) {
							WorldMapElement.friendSystem.ignoreList.sort(); // L: 2973
							return 1; // L: 2974
						} else if (var0 == 3644) {
							if (class463.friendsChatManager != null) { // L: 2977
								class463.friendsChatManager.removeComparator(); // L: 2978
							}

							return 1; // L: 2980
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 2983
							if (class463.friendsChatManager != null) { // L: 2984
								class463.friendsChatManager.addComparator(new UserComparator1(var7)); // L: 2985
							}

							return 1; // L: 2987
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 2990
							if (class463.friendsChatManager != null) { // L: 2991
								class463.friendsChatManager.addComparator(new UserComparator2(var7)); // L: 2992
							}

							return 1; // L: 2994
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 2997
							if (class463.friendsChatManager != null) { // L: 2998
								class463.friendsChatManager.addComparator(new UserComparator3(var7)); // L: 2999
							}

							return 1; // L: 3001
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 3004
							if (class463.friendsChatManager != null) { // L: 3005
								class463.friendsChatManager.addComparator(new UserComparator4(var7)); // L: 3006
							}

							return 1; // L: 3008
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 3011
							if (class463.friendsChatManager != null) { // L: 3012
								class463.friendsChatManager.addComparator(new UserComparator5(var7)); // L: 3013
							}

							return 1; // L: 3015
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 3018
							if (class463.friendsChatManager != null) { // L: 3019
								class463.friendsChatManager.addComparator(new UserComparator6(var7)); // L: 3020
							}

							return 1; // L: 3022
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 3025
							if (class463.friendsChatManager != null) { // L: 3026
								class463.friendsChatManager.addComparator(new UserComparator7(var7)); // L: 3027
							}

							return 1; // L: 3029
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 3032
							if (class463.friendsChatManager != null) { // L: 3033
								class463.friendsChatManager.addComparator(new UserComparator8(var7)); // L: 3034
							}

							return 1; // L: 3036
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 3039
							if (class463.friendsChatManager != null) { // L: 3040
								class463.friendsChatManager.addComparator(new UserComparator9(var7)); // L: 3041
							}

							return 1; // L: 3043
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 3046
							if (class463.friendsChatManager != null) { // L: 3047
								class463.friendsChatManager.addComparator(new UserComparator10(var7)); // L: 3048
							}

							return 1; // L: 3050
						} else if (var0 == 3655) {
							if (class463.friendsChatManager != null) { // L: 3053
								class463.friendsChatManager.sort(); // L: 3054
							}

							return 1; // L: 3056
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 3059
							WorldMapElement.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7)); // L: 3060
							return 1; // L: 3061
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 3064
							if (class463.friendsChatManager != null) { // L: 3065
								class463.friendsChatManager.addComparator(new BuddyRankComparator(var7)); // L: 3066
							}

							return 1; // L: 3068
						} else {
							return 2; // L: 3070
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 2893
					if (class463.friendsChatManager != null && var3 < class463.friendsChatManager.getSize() && ((FriendsChatMember)class463.friendsChatManager.get(var3)).isIgnored()) { // L: 2894
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 1; // L: 2895
					} else {
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 2897
					}

					return 1; // L: 2898
				}
			}
		}
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "([Lkz;II)V",
		garbageValue = "-133105136"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 12648
			Widget var3 = var0[var2]; // L: 12649
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !class160.isComponentHidden(var3))) { // L: 12650 12651 12652
				int var5;
				if (var3.type == 0) { // L: 12653
					if (!var3.isIf3 && class160.isComponentHidden(var3) && var3 != class25.mousedOverWidgetIf1) { // L: 12654
						continue;
					}

					drawModelComponents(var0, var3.id); // L: 12655
					if (var3.children != null) { // L: 12656
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 12657
					if (var4 != null) { // L: 12658
						var5 = var4.group; // L: 12659
						if (class153.loadInterface(var5)) { // L: 12661
							drawModelComponents(WorldMapLabel.Widget_interfaceComponents[var5], -1); // L: 12662
						}
					}
				}

				if (var3.type == 6) { // L: 12666
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) { // L: 12667
						boolean var8 = UserComparator5.runCs1(var3); // L: 12668
						if (var8) { // L: 12670
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId; // L: 12671
						}

						if (var5 != -1) { // L: 12672
							SequenceDefinition var6 = class85.SequenceDefinition_get(var5); // L: 12673
							if (!var6.isCachedModelIdSet()) { // L: 12674
								for (var3.modelFrameCycle += Client.field574; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; LoginScreenAnimation.invalidateWidget(var3)) { // L: 12675 12676 12683
									var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame]; // L: 12677
									++var3.modelFrame; // L: 12678
									if (var3.modelFrame >= var6.frameIds.length) { // L: 12679
										var3.modelFrame -= var6.frameCount; // L: 12680
										if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) { // L: 12681
											var3.modelFrame = 0;
										}
									}
								}
							} else {
								var3.modelFrame += Client.field574; // L: 12687
								int var7 = var6.method4055(); // L: 12688
								if (var3.modelFrame >= var7) { // L: 12689
									var3.modelFrame -= var6.frameCount; // L: 12690
									if (var3.modelFrame < 0 || var3.modelFrame >= var7) { // L: 12691
										var3.modelFrame = 0;
									}
								}

								LoginScreenAnimation.invalidateWidget(var3); // L: 12693
							}
						}
					}

					if (var3.field3585 != 0 && !var3.isIf3) { // L: 12697
						int var9 = var3.field3585 >> 16; // L: 12698
						var5 = var3.field3585 << 16 >> 16; // L: 12699
						var9 *= Client.field574; // L: 12700
						var5 *= Client.field574; // L: 12701
						var3.modelAngleX = var9 + var3.modelAngleX & 2047; // L: 12702
						var3.modelAngleY = var5 + var3.modelAngleY & 2047; // L: 12703
						LoginScreenAnimation.invalidateWidget(var3); // L: 12704
					}
				}
			}
		}

	} // L: 12708
}
