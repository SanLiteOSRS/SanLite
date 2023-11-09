import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ah")
public class class28 {
	@ObfuscatedName("y")
	int[] field147;
	@ObfuscatedName("d")
	int[] field150;

	public class28() {
		this.field147 = new int[112]; // L: 12
		this.field150 = new int[192]; // L: 13
		Arrays.fill(this.field147, 3); // L: 16
		Arrays.fill(this.field150, 3); // L: 17
	} // L: 18

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1269143537"
	)
	public void method406(int var1, int var2) {
		if (this.method414(var1) && this.method416(var2)) { // L: 21
			this.field147[var1] = var2; // L: 22
		}

	} // L: 24

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(CIB)V",
		garbageValue = "0"
	)
	public void method407(char var1, int var2) {
		if (this.method415(var1) && this.method416(var2)) {
			this.field150[var1] = var2;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "972993186"
	)
	public int method408(int var1) {
		return this.method414(var1) ? this.field147[var1] : 0; // L: 33 36
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(CI)I",
		garbageValue = "1124483937"
	)
	public int method409(char var1) {
		return this.method415(var1) ? this.field150[var1] : 0; // L: 40 41 43
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "116"
	)
	public boolean method410(int var1) {
		return this.method414(var1) && (this.field147[var1] == 1 || this.field147[var1] == 3); // L: 47
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-180910111"
	)
	public boolean method411(char var1) {
		return this.method415(var1) && (this.field150[var1] == 1 || this.field150[var1] == 3);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "24"
	)
	public boolean method429(int var1) {
		return this.method414(var1) && (this.field147[var1] == 2 || this.field147[var1] == 3); // L: 55
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-81"
	)
	public boolean method426(char var1) {
		return this.method415(var1) && (this.field150[var1] == 2 || this.field150[var1] == 3); // L: 59
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1950313002"
	)
	boolean method414(int var1) {
		if (var1 >= 0 && var1 < 112) { // L: 63
			return true; // L: 67
		} else {
			System.out.println("Invalid keycode: " + var1); // L: 64
			return false; // L: 65
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1876294645"
	)
	boolean method415(char var1) {
		if (var1 >= 0 && var1 < 192) { // L: 71
			return true; // L: 75
		} else {
			System.out.println("Invalid keychar: " + var1); // L: 72
			return false; // L: 73
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-932884797"
	)
	boolean method416(int var1) {
		if (var1 >= 0 && var1 < 4) { // L: 79
			return true; // L: 83
		} else {
			System.out.println("Invalid mode: " + var1); // L: 80
			return false; // L: 81
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)Ljava/lang/String;",
		garbageValue = "-1762701914"
	)
	static String method435(Buffer var0, int var1) {
		try {
			int var2 = var0.readUShortSmart(); // L: 27
			if (var2 > var1) { // L: 28
				var2 = var1;
			}

			byte[] var3 = new byte[var2]; // L: 29
			var0.offset += class305.huffman.decompress(var0.array, var0.offset, var3, 0, var2); // L: 30
			String var4 = class125.decodeStringCp1252(var3, 0, var2); // L: 31
			return var4; // L: 32
		} catch (Exception var6) { // L: 34
			return "Cabbage"; // L: 35
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "302513748"
	)
	public static int method442(int var0, int var1, int var2) {
		int var3 = Archive.method6338(var2 - var1 + 1); // L: 50
		var3 <<= var1; // L: 51
		return var0 & ~var3; // L: 52
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "588461440"
	)
	static int method412(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) { // L: 2725
			if (DecorativeObject.friendSystem.field814 == 0) { // L: 2726
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -2;
			} else if (DecorativeObject.friendSystem.field814 == 1) { // L: 2727
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = DecorativeObject.friendSystem.friendsList.getSize(); // L: 2728
			}

			return 1; // L: 2729
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 2732
				if (DecorativeObject.friendSystem.method1818() && var3 >= 0 && var3 < DecorativeObject.friendSystem.friendsList.getSize()) { // L: 2733
					Friend var8 = (Friend)DecorativeObject.friendSystem.friendsList.get(var3); // L: 2734
					Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var8.getName(); // L: 2735
					Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var8.getPreviousName(); // L: 2736
				} else {
					Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 2739
					Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 2740
				}

				return 1; // L: 2742
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 2745
				if (DecorativeObject.friendSystem.method1818() && var3 >= 0 && var3 < DecorativeObject.friendSystem.friendsList.getSize()) { // L: 2746
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = ((Buddy)DecorativeObject.friendSystem.friendsList.get(var3)).world; // L: 2747
				} else {
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 2749
				}

				return 1; // L: 2750
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 2753
				if (DecorativeObject.friendSystem.method1818() && var3 >= 0 && var3 < DecorativeObject.friendSystem.friendsList.getSize()) { // L: 2754
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = ((Buddy)DecorativeObject.friendSystem.friendsList.get(var3)).rank; // L: 2755
				} else {
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 2757
				}

				return 1; // L: 2758
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 2761
					int var6 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 2762
					KitDefinition.method3475(var5, var6); // L: 2763
					return 1; // L: 2764
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 2767
					DecorativeObject.friendSystem.addFriend(var5); // L: 2768
					return 1; // L: 2769
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 2772
					DecorativeObject.friendSystem.removeFriend(var5); // L: 2773
					return 1; // L: 2774
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 2777
					DecorativeObject.friendSystem.addIgnore(var5); // L: 2778
					return 1; // L: 2779
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 2782
					DecorativeObject.friendSystem.removeIgnore(var5); // L: 2783
					return 1; // L: 2784
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 2787
					var5 = ItemLayer.method4055(var5); // L: 2788
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = DecorativeObject.friendSystem.isFriended(new Username(var5, ViewportMouse.loginType), false) ? 1 : 0; // L: 2789
					return 1; // L: 2790
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (MenuAction.friendsChatManager != null) { // L: 2793
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = MenuAction.friendsChatManager.name; // L: 2794
					} else {
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 2796
					}

					return 1; // L: 2797
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (MenuAction.friendsChatManager != null) { // L: 2800
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = MenuAction.friendsChatManager.getSize(); // L: 2801
					} else {
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 2803
					}

					return 1; // L: 2804
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 2807
					if (MenuAction.friendsChatManager != null && var3 < MenuAction.friendsChatManager.getSize()) { // L: 2808
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = MenuAction.friendsChatManager.get(var3).getUsername().getName(); // L: 2809
					} else {
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 2811
					}

					return 1; // L: 2812
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 2815
					if (MenuAction.friendsChatManager != null && var3 < MenuAction.friendsChatManager.getSize()) { // L: 2816
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = ((Buddy)MenuAction.friendsChatManager.get(var3)).getWorld(); // L: 2817
					} else {
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 2819
					}

					return 1; // L: 2820
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 2823
					if (MenuAction.friendsChatManager != null && var3 < MenuAction.friendsChatManager.getSize()) { // L: 2824
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = ((Buddy)MenuAction.friendsChatManager.get(var3)).rank; // L: 2825
					} else {
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 2827
					}

					return 1; // L: 2828
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = MenuAction.friendsChatManager != null ? MenuAction.friendsChatManager.minKick : 0; // L: 2831
					return 1; // L: 2832
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 2835
					DevicePcmPlayerProvider.clanKickUser(var5); // L: 2836
					return 1; // L: 2837
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = MenuAction.friendsChatManager != null ? MenuAction.friendsChatManager.rank : 0; // L: 2840
					return 1; // L: 2841
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 2844
					class197.Clan_joinChat(var5); // L: 2845
					return 1; // L: 2846
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					class130.Clan_leaveChat(); // L: 2849
					return 1; // L: 2850
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!DecorativeObject.friendSystem.method1818()) { // L: 2853
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = DecorativeObject.friendSystem.ignoreList.getSize(); // L: 2854
					}

					return 1; // L: 2855
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 2858
					if (DecorativeObject.friendSystem.method1818() && var3 >= 0 && var3 < DecorativeObject.friendSystem.ignoreList.getSize()) { // L: 2859
						Ignored var4 = (Ignored)DecorativeObject.friendSystem.ignoreList.get(var3); // L: 2860
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var4.getName(); // L: 2861
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var4.getPreviousName(); // L: 2862
					} else {
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 2865
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 2866
					}

					return 1; // L: 2868
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 2871
					var5 = ItemLayer.method4055(var5); // L: 2872
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = DecorativeObject.friendSystem.isIgnored(new Username(var5, ViewportMouse.loginType)) ? 1 : 0; // L: 2873
					return 1; // L: 2874
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 2877
					if (MenuAction.friendsChatManager != null && var3 < MenuAction.friendsChatManager.getSize() && MenuAction.friendsChatManager.get(var3).getUsername().equals(class296.localPlayer.username)) { // L: 2878
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 1; // L: 2879
					} else {
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 2881
					}

					return 1; // L: 2882
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (MenuAction.friendsChatManager != null && MenuAction.friendsChatManager.owner != null) { // L: 2885
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = MenuAction.friendsChatManager.owner; // L: 2886
					} else {
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 2888
					}

					return 1; // L: 2889
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 2892
					if (MenuAction.friendsChatManager != null && var3 < MenuAction.friendsChatManager.getSize() && ((FriendsChatMember)MenuAction.friendsChatManager.get(var3)).isFriend()) { // L: 2893
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 1; // L: 2894
					} else {
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 2896
					}

					return 1; // L: 2897
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						DecorativeObject.friendSystem.friendsList.removeComparator(); // L: 2908
						return 1; // L: 2909
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 2912
							DecorativeObject.friendSystem.friendsList.addComparator(new UserComparator1(var7)); // L: 2913
							return 1; // L: 2914
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 2917
							DecorativeObject.friendSystem.friendsList.addComparator(new UserComparator2(var7)); // L: 2918
							return 1; // L: 2919
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 2922
							DecorativeObject.friendSystem.friendsList.addComparator(new UserComparator3(var7)); // L: 2923
							return 1; // L: 2924
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 2927
							DecorativeObject.friendSystem.friendsList.addComparator(new UserComparator4(var7)); // L: 2928
							return 1; // L: 2929
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 2932
							DecorativeObject.friendSystem.friendsList.addComparator(new UserComparator5(var7)); // L: 2933
							return 1; // L: 2934
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 2937
							DecorativeObject.friendSystem.friendsList.addComparator(new UserComparator6(var7)); // L: 2938
							return 1; // L: 2939
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 2942
							DecorativeObject.friendSystem.friendsList.addComparator(new UserComparator7(var7)); // L: 2943
							return 1; // L: 2944
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 2947
							DecorativeObject.friendSystem.friendsList.addComparator(new UserComparator8(var7)); // L: 2948
							return 1; // L: 2949
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 2952
							DecorativeObject.friendSystem.friendsList.addComparator(new UserComparator9(var7)); // L: 2953
							return 1; // L: 2954
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 2957
							DecorativeObject.friendSystem.friendsList.addComparator(new UserComparator10(var7)); // L: 2958
							return 1; // L: 2959
						} else if (var0 == 3639) {
							DecorativeObject.friendSystem.friendsList.sort(); // L: 2962
							return 1; // L: 2963
						} else if (var0 == 3640) {
							DecorativeObject.friendSystem.ignoreList.removeComparator(); // L: 2966
							return 1; // L: 2967
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 2970
							DecorativeObject.friendSystem.ignoreList.addComparator(new UserComparator1(var7)); // L: 2971
							return 1; // L: 2972
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 2975
							DecorativeObject.friendSystem.ignoreList.addComparator(new UserComparator2(var7)); // L: 2976
							return 1; // L: 2977
						} else if (var0 == 3643) {
							DecorativeObject.friendSystem.ignoreList.sort(); // L: 2980
							return 1; // L: 2981
						} else if (var0 == 3644) {
							if (MenuAction.friendsChatManager != null) { // L: 2984
								MenuAction.friendsChatManager.removeComparator(); // L: 2985
							}

							return 1; // L: 2987
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 2990
							if (MenuAction.friendsChatManager != null) { // L: 2991
								MenuAction.friendsChatManager.addComparator(new UserComparator1(var7)); // L: 2992
							}

							return 1; // L: 2994
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 2997
							if (MenuAction.friendsChatManager != null) { // L: 2998
								MenuAction.friendsChatManager.addComparator(new UserComparator2(var7)); // L: 2999
							}

							return 1; // L: 3001
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 3004
							if (MenuAction.friendsChatManager != null) { // L: 3005
								MenuAction.friendsChatManager.addComparator(new UserComparator3(var7)); // L: 3006
							}

							return 1; // L: 3008
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 3011
							if (MenuAction.friendsChatManager != null) { // L: 3012
								MenuAction.friendsChatManager.addComparator(new UserComparator4(var7)); // L: 3013
							}

							return 1; // L: 3015
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 3018
							if (MenuAction.friendsChatManager != null) { // L: 3019
								MenuAction.friendsChatManager.addComparator(new UserComparator5(var7)); // L: 3020
							}

							return 1; // L: 3022
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 3025
							if (MenuAction.friendsChatManager != null) { // L: 3026
								MenuAction.friendsChatManager.addComparator(new UserComparator6(var7)); // L: 3027
							}

							return 1; // L: 3029
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 3032
							if (MenuAction.friendsChatManager != null) { // L: 3033
								MenuAction.friendsChatManager.addComparator(new UserComparator7(var7)); // L: 3034
							}

							return 1; // L: 3036
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 3039
							if (MenuAction.friendsChatManager != null) { // L: 3040
								MenuAction.friendsChatManager.addComparator(new UserComparator8(var7)); // L: 3041
							}

							return 1; // L: 3043
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 3046
							if (MenuAction.friendsChatManager != null) { // L: 3047
								MenuAction.friendsChatManager.addComparator(new UserComparator9(var7)); // L: 3048
							}

							return 1; // L: 3050
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 3053
							if (MenuAction.friendsChatManager != null) { // L: 3054
								MenuAction.friendsChatManager.addComparator(new UserComparator10(var7)); // L: 3055
							}

							return 1; // L: 3057
						} else if (var0 == 3655) {
							if (MenuAction.friendsChatManager != null) { // L: 3060
								MenuAction.friendsChatManager.sort(); // L: 3061
							}

							return 1; // L: 3063
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 3066
							DecorativeObject.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7)); // L: 3067
							return 1; // L: 3068
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 3071
							if (MenuAction.friendsChatManager != null) { // L: 3072
								MenuAction.friendsChatManager.addComparator(new BuddyRankComparator(var7)); // L: 3073
							}

							return 1; // L: 3075
						} else {
							return 2; // L: 3077
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 2900
					if (MenuAction.friendsChatManager != null && var3 < MenuAction.friendsChatManager.getSize() && ((FriendsChatMember)MenuAction.friendsChatManager.get(var3)).isIgnored()) { // L: 2901
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 1; // L: 2902
					} else {
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 2904
					}

					return 1; // L: 2905
				}
			}
		}
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1989988479"
	)
	@Export("load")
	static void load() {
		int var29;
		if (Client.titleLoadingStage == 0) { // L: 1663
			class139.scene = new Scene(4, 104, 104, Tiles.Tiles_heights); // L: 1664

			for (var29 = 0; var29 < 4; ++var29) { // L: 1665
				Client.collisionMaps[var29] = new CollisionMap(104, 104);
			}

			Calendar.sceneMinimapSprite = new SpritePixels(512, 512); // L: 1666
			Login.Login_loadingText = "Starting game engine..."; // L: 1667
			Login.Login_loadingPercent = 5; // L: 1668
			Client.titleLoadingStage = 20; // L: 1669
		} else if (Client.titleLoadingStage == 20) { // L: 1672
			Login.Login_loadingText = "Prepared visibility map"; // L: 1673
			Login.Login_loadingPercent = 10; // L: 1674
			Client.titleLoadingStage = 30; // L: 1675
		} else if (Client.titleLoadingStage == 30) { // L: 1678
			class150.archive5 = Varps.newArchive(0, false, true, true, false); // L: 1679
			MouseHandler.field251 = Varps.newArchive(1, false, true, true, false); // L: 1680
			class157.archive2 = Varps.newArchive(2, true, false, true, false); // L: 1681
			PlayerType.archive7 = Varps.newArchive(3, false, true, true, false); // L: 1682
			Canvas.archive4 = Varps.newArchive(4, false, true, true, false); // L: 1683
			SecureRandomFuture.archive9 = Varps.newArchive(5, true, true, true, false); // L: 1684
			ReflectionCheck.archive6 = Varps.newArchive(6, true, true, true, false); // L: 1685
			WorldMapSectionType.archive11 = Varps.newArchive(7, false, true, true, false); // L: 1686
			class142.archive8 = Varps.newArchive(8, false, true, true, false); // L: 1687
			Client.field522 = Varps.newArchive(9, false, true, true, false); // L: 1688
			WorldMapRegion.archive10 = Varps.newArchive(10, false, true, true, false); // L: 1689
			class7.field32 = Varps.newArchive(11, false, true, true, false); // L: 1690
			class188.archive12 = Varps.newArchive(12, false, true, true, false); // L: 1691
			class143.archive13 = Varps.newArchive(13, true, false, true, false); // L: 1692
			ChatChannel.archive14 = Varps.newArchive(14, false, true, true, false); // L: 1693
			ClanChannel.archive15 = Varps.newArchive(15, false, true, true, false); // L: 1694
			class382.archive17 = Varps.newArchive(17, true, true, true, false); // L: 1695
			NetCache.archive18 = Varps.newArchive(18, false, true, true, false); // L: 1696
			class310.archive19 = Varps.newArchive(19, false, true, true, false); // L: 1697
			class139.archive20 = Varps.newArchive(20, false, true, true, false); // L: 1698
			class250.field2930 = Varps.newArchive(21, false, true, true, true); // L: 1699
			Login.Login_loadingText = "Connecting to update server"; // L: 1700
			Login.Login_loadingPercent = 20; // L: 1701
			Client.titleLoadingStage = 40; // L: 1702
		} else if (Client.titleLoadingStage == 40) { // L: 1705
			byte var39 = 0; // L: 1706
			var29 = var39 + class150.archive5.percentage() * 4 / 100; // L: 1707
			var29 += MouseHandler.field251.percentage() * 4 / 100; // L: 1708
			var29 += class157.archive2.percentage() * 2 / 100; // L: 1709
			var29 += PlayerType.archive7.percentage() * 2 / 100; // L: 1710
			var29 += Canvas.archive4.percentage() * 6 / 100; // L: 1711
			var29 += SecureRandomFuture.archive9.percentage() * 4 / 100; // L: 1712
			var29 += ReflectionCheck.archive6.percentage() * 2 / 100; // L: 1713
			var29 += WorldMapSectionType.archive11.percentage() * 55 / 100; // L: 1714
			var29 += class142.archive8.percentage() * 2 / 100; // L: 1715
			var29 += Client.field522.percentage() * 2 / 100; // L: 1716
			var29 += WorldMapRegion.archive10.percentage() * 2 / 100; // L: 1717
			var29 += class7.field32.percentage() * 2 / 100; // L: 1718
			var29 += class188.archive12.percentage() * 2 / 100; // L: 1719
			var29 += class143.archive13.percentage() * 2 / 100; // L: 1720
			var29 += ChatChannel.archive14.percentage() * 2 / 100; // L: 1721
			var29 += ClanChannel.archive15.percentage() * 2 / 100; // L: 1722
			var29 += class310.archive19.percentage() / 100; // L: 1723
			var29 += NetCache.archive18.percentage() / 100; // L: 1724
			var29 += class139.archive20.percentage() / 100; // L: 1725
			var29 += class250.field2930.percentage() / 100; // L: 1726
			var29 += class382.archive17.method6294() && class382.archive17.isFullyLoaded() ? 1 : 0; // L: 1727
			if (var29 != 100) { // L: 1728
				if (var29 != 0) { // L: 1729
					Login.Login_loadingText = "Checking for updates - " + var29 + "%";
				}

				Login.Login_loadingPercent = 30; // L: 1730
			} else {
				WorldMapID.method5166(class150.archive5, "Animations"); // L: 1733
				WorldMapID.method5166(MouseHandler.field251, "Skeletons"); // L: 1734
				WorldMapID.method5166(Canvas.archive4, "Sound FX"); // L: 1735
				WorldMapID.method5166(SecureRandomFuture.archive9, "Maps"); // L: 1736
				WorldMapID.method5166(ReflectionCheck.archive6, "Music Tracks"); // L: 1737
				WorldMapID.method5166(WorldMapSectionType.archive11, "Models"); // L: 1738
				WorldMapID.method5166(class142.archive8, "Sprites"); // L: 1739
				WorldMapID.method5166(class7.field32, "Music Jingles"); // L: 1740
				WorldMapID.method5166(ChatChannel.archive14, "Music Samples"); // L: 1741
				WorldMapID.method5166(ClanChannel.archive15, "Music Patches"); // L: 1742
				WorldMapID.method5166(class310.archive19, "World Map"); // L: 1743
				WorldMapID.method5166(NetCache.archive18, "World Map Geography"); // L: 1744
				WorldMapID.method5166(class139.archive20, "World Map Ground"); // L: 1745
				class174.spriteIds = new GraphicsDefaults(); // L: 1746
				class174.spriteIds.decode(class382.archive17); // L: 1747
				Login.Login_loadingText = "Loaded update list"; // L: 1748
				Login.Login_loadingPercent = 30; // L: 1749
				Client.titleLoadingStage = 45; // L: 1750
			}
		} else if (Client.titleLoadingStage == 45) { // L: 1753
			class157.method3235(22050, !Client.isLowDetail, 2); // L: 1754
			MidiPcmStream var36 = new MidiPcmStream(); // L: 1755
			var36.method5480(9, 128); // L: 1756
			HealthBar.pcmPlayer0 = TextureProvider.method4500(GameEngine.taskHandler, 0, 22050); // L: 1757
			HealthBar.pcmPlayer0.setStream(var36); // L: 1758
			class248.method5161(ClanChannel.archive15, ChatChannel.archive14, Canvas.archive4, var36); // L: 1759
			class86.pcmPlayer1 = TextureProvider.method4500(GameEngine.taskHandler, 1, 2048); // L: 1760
			class453.pcmStreamMixer = new PcmStreamMixer(); // L: 1761
			class86.pcmPlayer1.setStream(class453.pcmStreamMixer); // L: 1762
			FaceNormal.decimator = new Decimator(22050, SoundCache.field337); // L: 1763
			Login.Login_loadingText = "Prepared sound engine"; // L: 1764
			Login.Login_loadingPercent = 35; // L: 1765
			Client.titleLoadingStage = 50; // L: 1766
			class87.WorldMapElement_fonts = new Fonts(class142.archive8, class143.archive13); // L: 1767
		} else if (Client.titleLoadingStage == 50) { // L: 1770
			var29 = FontName.method8076().length; // L: 1771
			Client.fontsMap = class87.WorldMapElement_fonts.createMap(FontName.method8076()); // L: 1772
			if (Client.fontsMap.size() < var29) { // L: 1773
				Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var29 + "%"; // L: 1774
				Login.Login_loadingPercent = 40; // L: 1775
			} else {
				ModeWhere.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11); // L: 1778
				Language.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12); // L: 1779
				UserComparator3.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12); // L: 1780
				class202.platformInfo = Client.platformInfoProvider.get(); // L: 1781
				Login.Login_loadingText = "Loaded fonts"; // L: 1782
				Login.Login_loadingPercent = 40; // L: 1783
				Client.titleLoadingStage = 60; // L: 1784
			}
		} else {
			int var3;
			Archive var30;
			Archive var31;
			int var37;
			if (Client.titleLoadingStage == 60) { // L: 1787
				var30 = WorldMapRegion.archive10; // L: 1789
				var31 = class142.archive8; // L: 1790
				var3 = 0; // L: 1792
				String[] var33 = Login.field928; // L: 1794

				int var34;
				String var38;
				for (var34 = 0; var34 < var33.length; ++var34) { // L: 1795
					var38 = var33[var34]; // L: 1796
					if (var30.tryLoadFileByNames(var38, "")) { // L: 1798
						++var3;
					}
				}

				var33 = Login.field911; // L: 1803

				for (var34 = 0; var34 < var33.length; ++var34) { // L: 1804
					var38 = var33[var34]; // L: 1805
					if (var31.tryLoadFileByNames(var38, "")) { // L: 1807
						++var3;
					}
				}

				var37 = Login.field911.length + Login.field928.length; // L: 1816
				if (var3 < var37) { // L: 1819
					Login.Login_loadingText = "Loading title screen - " + var3 * 100 / var37 + "%"; // L: 1820
					Login.Login_loadingPercent = 50; // L: 1821
				} else {
					Login.Login_loadingText = "Loaded title screen"; // L: 1824
					Login.Login_loadingPercent = 50; // L: 1825
					class21.method305(5); // L: 1826
					Client.titleLoadingStage = 70; // L: 1827
				}
			} else if (Client.titleLoadingStage != 70) { // L: 1830
				if (Client.titleLoadingStage == 80) { // L: 1953
					var29 = 0; // L: 1954
					if (BuddyRankComparator.compass == null) { // L: 1955
						BuddyRankComparator.compass = FriendsList.SpriteBuffer_getSprite(class142.archive8, class174.spriteIds.compass, 0);
					} else {
						++var29; // L: 1956
					}

					if (class150.redHintArrowSprite == null) { // L: 1957
						class150.redHintArrowSprite = FriendsList.SpriteBuffer_getSprite(class142.archive8, class174.spriteIds.field4536, 0);
					} else {
						++var29; // L: 1958
					}

					if (HealthBar.mapSceneSprites == null) { // L: 1959
						HealthBar.mapSceneSprites = class147.method3146(class142.archive8, class174.spriteIds.mapScenes, 0);
					} else {
						++var29; // L: 1960
					}

					if (Renderable.headIconPkSprites == null) { // L: 1961
						Renderable.headIconPkSprites = BufferedSource.method7532(class142.archive8, class174.spriteIds.headIconsPk, 0);
					} else {
						++var29; // L: 1962
					}

					if (class278.headIconPrayerSprites == null) { // L: 1963
						class278.headIconPrayerSprites = BufferedSource.method7532(class142.archive8, class174.spriteIds.field4538, 0);
					} else {
						++var29; // L: 1964
					}

					if (class162.headIconHintSprites == null) { // L: 1965
						class162.headIconHintSprites = BufferedSource.method7532(class142.archive8, class174.spriteIds.field4539, 0);
					} else {
						++var29; // L: 1966
					}

					if (WorldMapLabelSize.mapMarkerSprites == null) { // L: 1967
						WorldMapLabelSize.mapMarkerSprites = BufferedSource.method7532(class142.archive8, class174.spriteIds.field4540, 0);
					} else {
						++var29; // L: 1968
					}

					if (class199.crossSprites == null) { // L: 1969
						class199.crossSprites = BufferedSource.method7532(class142.archive8, class174.spriteIds.field4541, 0);
					} else {
						++var29; // L: 1970
					}

					if (Decimator.mapDotSprites == null) { // L: 1971
						Decimator.mapDotSprites = BufferedSource.method7532(class142.archive8, class174.spriteIds.field4542, 0);
					} else {
						++var29; // L: 1972
					}

					if (WorldMap.scrollBarSprites == null) { // L: 1973
						WorldMap.scrollBarSprites = class147.method3146(class142.archive8, class174.spriteIds.field4543, 0);
					} else {
						++var29; // L: 1974
					}

					if (UserComparator4.modIconSprites == null) { // L: 1975
						UserComparator4.modIconSprites = class147.method3146(class142.archive8, class174.spriteIds.field4544, 0);
					} else {
						++var29; // L: 1976
					}

					if (var29 < 11) { // L: 1977
						Login.Login_loadingText = "Loading sprites - " + var29 * 100 / 12 + "%"; // L: 1978
						Login.Login_loadingPercent = 70; // L: 1979
					} else {
						AbstractFont.AbstractFont_modIconSprites = UserComparator4.modIconSprites; // L: 1982
						class150.redHintArrowSprite.normalize(); // L: 1983
						int var1 = (int)(Math.random() * 21.0D) - 10; // L: 1984
						int var2 = (int)(Math.random() * 21.0D) - 10; // L: 1985
						var3 = (int)(Math.random() * 21.0D) - 10; // L: 1986
						var37 = (int)(Math.random() * 41.0D) - 20; // L: 1987
						HealthBar.mapSceneSprites[0].shiftColors(var1 + var37, var2 + var37, var37 + var3); // L: 1988
						Login.Login_loadingText = "Loaded sprites"; // L: 1989
						Login.Login_loadingPercent = 70; // L: 1990
						Client.titleLoadingStage = 90; // L: 1991
					}
				} else if (Client.titleLoadingStage == 90) { // L: 1994
					if (!Client.field522.isFullyLoaded()) { // L: 1995
						Login.Login_loadingText = "Loading textures - " + "0%"; // L: 1996
						Login.Login_loadingPercent = 90; // L: 1997
					} else {
						class6.textureProvider = new TextureProvider(Client.field522, class142.archive8, 20, BufferedSink.clientPreferences.method2392(), Client.isLowDetail ? 64 : 128); // L: 2000
						Rasterizer3D.Rasterizer3D_setTextureLoader(class6.textureProvider); // L: 2001
						Rasterizer3D.Rasterizer3D_setBrightness(BufferedSink.clientPreferences.method2392()); // L: 2002
						Client.titleLoadingStage = 100; // L: 2003
					}
				} else if (Client.titleLoadingStage == 100) { // L: 2006
					var29 = class6.textureProvider.getLoadedPercentage(); // L: 2007
					if (var29 < 100) { // L: 2008
						Login.Login_loadingText = "Loading textures - " + var29 + "%"; // L: 2009
						Login.Login_loadingPercent = 90; // L: 2010
					} else {
						Login.Login_loadingText = "Loaded textures"; // L: 2013
						Login.Login_loadingPercent = 90; // L: 2014
						Client.titleLoadingStage = 110; // L: 2015
					}
				} else if (Client.titleLoadingStage == 110) { // L: 2018
					GrandExchangeOfferOwnWorldComparator.mouseRecorder = new MouseRecorder(); // L: 2019
					GameEngine.taskHandler.newThreadTask(GrandExchangeOfferOwnWorldComparator.mouseRecorder, 10); // L: 2020
					Login.Login_loadingText = "Loaded input handler"; // L: 2021
					Login.Login_loadingPercent = 92; // L: 2022
					Client.titleLoadingStage = 120; // L: 2023
				} else if (Client.titleLoadingStage == 120) { // L: 2026
					if (!WorldMapRegion.archive10.tryLoadFileByNames("huffman", "")) { // L: 2027
						Login.Login_loadingText = "Loading wordpack - " + 0 + "%"; // L: 2028
						Login.Login_loadingPercent = 94; // L: 2029
					} else {
						Huffman var35 = new Huffman(WorldMapRegion.archive10.takeFileByNames("huffman", "")); // L: 2032
						class305.huffman = var35; // L: 2034
						Login.Login_loadingText = "Loaded wordpack"; // L: 2036
						Login.Login_loadingPercent = 94; // L: 2037
						Client.titleLoadingStage = 130; // L: 2038
					}
				} else if (Client.titleLoadingStage == 130) { // L: 2041
					if (!PlayerType.archive7.isFullyLoaded()) { // L: 2042
						Login.Login_loadingText = "Loading interfaces - " + PlayerType.archive7.loadPercent() * 4 / 5 + "%"; // L: 2043
						Login.Login_loadingPercent = 96; // L: 2044
					} else if (!class188.archive12.isFullyLoaded()) { // L: 2047
						Login.Login_loadingText = "Loading interfaces - " + (80 + class188.archive12.loadPercent() / 6) + "%"; // L: 2048
						Login.Login_loadingPercent = 96; // L: 2049
					} else if (!class143.archive13.isFullyLoaded()) { // L: 2052
						Login.Login_loadingText = "Loading interfaces - " + (96 + class143.archive13.loadPercent() / 50) + "%"; // L: 2053
						Login.Login_loadingPercent = 96; // L: 2054
					} else {
						Login.Login_loadingText = "Loaded interfaces"; // L: 2057
						Login.Login_loadingPercent = 98; // L: 2058
						Client.titleLoadingStage = 140; // L: 2059
					}
				} else if (Client.titleLoadingStage == 140) { // L: 2062
					Login.Login_loadingPercent = 100; // L: 2063
					if (!class310.archive19.tryLoadGroupByName(WorldMapCacheName.field2954.name)) { // L: 2064
						Login.Login_loadingText = "Loading world map - " + class310.archive19.groupLoadPercentByName(WorldMapCacheName.field2954.name) / 10 + "%"; // L: 2065
					} else {
						if (class7.worldMap == null) { // L: 2068
							class7.worldMap = new WorldMap(); // L: 2069
							class7.worldMap.init(class310.archive19, NetCache.archive18, class139.archive20, UserComparator3.fontBold12, Client.fontsMap, HealthBar.mapSceneSprites); // L: 2070
						}

						Login.Login_loadingText = "Loaded world map"; // L: 2072
						Client.titleLoadingStage = 150; // L: 2073
					}
				} else if (Client.titleLoadingStage == 150) { // L: 2076
					class21.method305(10); // L: 2077
				}
			} else if (!class157.archive2.isFullyLoaded()) { // L: 1831
				Login.Login_loadingText = "Loading config - " + class157.archive2.loadPercent() + "%"; // L: 1832
				Login.Login_loadingPercent = 60; // L: 1833
			} else if (!class250.field2930.isFullyLoaded()) { // L: 1836
				Login.Login_loadingText = "Loading config - " + (80 + class188.archive12.loadPercent() / 6) + "%"; // L: 1837
				Login.Login_loadingPercent = 60; // L: 1838
			} else {
				WorldMapIcon_0.method5070(class157.archive2); // L: 1841
				class270.method5370(class157.archive2); // L: 1842
				Archive var0 = class157.archive2; // L: 1843
				var30 = WorldMapSectionType.archive11; // L: 1844
				KitDefinition.KitDefinition_archive = var0; // L: 1846
				KitDefinition.KitDefinition_modelsArchive = var30; // L: 1847
				KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3); // L: 1848
				var31 = class157.archive2; // L: 1850
				Archive var32 = WorldMapSectionType.archive11; // L: 1851
				boolean var4 = Client.isLowDetail; // L: 1852
				ObjectComposition.ObjectDefinition_archive = var31; // L: 1854
				ObjectComposition.ObjectDefinition_modelsArchive = var32; // L: 1855
				ObjectComposition.ObjectDefinition_isLowDetail = var4; // L: 1856
				Archive var5 = class157.archive2; // L: 1858
				Archive var6 = WorldMapSectionType.archive11; // L: 1859
				NPCComposition.NpcDefinition_archive = var5; // L: 1861
				NPCComposition.NpcDefinition_modelArchive = var6; // L: 1862
				Archive var7 = class157.archive2; // L: 1864
				StructComposition.StructDefinition_archive = var7; // L: 1866
				Archive var8 = class157.archive2; // L: 1868
				Archive var9 = WorldMapSectionType.archive11; // L: 1869
				boolean var10 = Client.isMembersWorld; // L: 1870
				Font var11 = ModeWhere.fontPlain11; // L: 1871
				SpriteMask.ItemComposition_archive = var8; // L: 1873
				ItemComposition.ItemComposition_modelArchive = var9; // L: 1874
				class1.ItemComposition_inMembersWorld = var10; // L: 1875
				WorldMapArchiveLoader.ItemComposition_fileCount = SpriteMask.ItemComposition_archive.getGroupFileCount(10); // L: 1876
				class139.ItemComposition_fontPlain11 = var11; // L: 1877
				Archive var12 = class157.archive2; // L: 1879
				Archive var13 = class150.archive5; // L: 1880
				Archive var14 = MouseHandler.field251; // L: 1881
				SequenceDefinition.SequenceDefinition_archive = var12; // L: 1883
				class34.SequenceDefinition_animationsArchive = var13; // L: 1884
				SequenceDefinition.SequenceDefinition_skeletonsArchive = var14; // L: 1885
				Archive var15 = class157.archive2; // L: 1887
				Archive var16 = WorldMapSectionType.archive11; // L: 1888
				SpotAnimationDefinition.SpotAnimationDefinition_archive = var15; // L: 1890
				SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var16; // L: 1891
				Players.method2587(class157.archive2); // L: 1893
				Archive var17 = class157.archive2; // L: 1894
				VarpDefinition.VarpDefinition_archive = var17; // L: 1896
				VarpDefinition.field1866 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16); // L: 1897
				Archive var18 = PlayerType.archive7; // L: 1899
				Archive var19 = WorldMapSectionType.archive11; // L: 1900
				Archive var20 = class142.archive8; // L: 1901
				Archive var21 = class143.archive13; // L: 1902
				UserComparator8.Widget_archive = var18; // L: 1904
				class188.Widget_modelsArchive = var19; // L: 1905
				MusicPatchPcmStream.Widget_spritesArchive = var20; // L: 1906
				WorldMapManager.Widget_fontsArchive = var21; // L: 1907
				Widget.Widget_interfaceComponents = new Widget[UserComparator8.Widget_archive.getGroupCount()][]; // L: 1908
				MusicPatchPcmStream.Widget_loadedInterfaces = new boolean[UserComparator8.Widget_archive.getGroupCount()]; // L: 1909
				ReflectionCheck.method716(class157.archive2); // L: 1911
				Archive var22 = class157.archive2; // L: 1912
				EnumComposition.EnumDefinition_archive = var22; // L: 1914
				class17.method228(class157.archive2); // L: 1916
				Archive var23 = class157.archive2; // L: 1917
				class277.method5401(class157.archive2); // L: 1919
				Archive var24 = class157.archive2; // L: 1920
				class456.field4841 = var24; // L: 1922
				Friend.method7303(class157.archive2); // L: 1924
				PcmPlayer.HitSplatDefinition_cachedSprites = new class448(class376.field4411, 54, class103.clientLanguage, class157.archive2); // L: 1925
				class203.Ignored_cached = new class448(class376.field4411, 47, class103.clientLanguage, class157.archive2); // L: 1926
				Projectile.varcs = new Varcs(); // L: 1927
				class141.method3036(class157.archive2, class142.archive8, class143.archive13); // L: 1928
				ScriptFrame.method1134(class157.archive2, class142.archive8); // L: 1929
				Archive var25 = class157.archive2; // L: 1930
				Archive var26 = class142.archive8; // L: 1931
				WorldMapElement.WorldMapElement_archive = var26; // L: 1933
				if (var25.isFullyLoaded()) { // L: 1934
					WorldMapElement.WorldMapElement_count = var25.getGroupFileCount(35); // L: 1937
					WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count]; // L: 1938

					for (int var27 = 0; var27 < WorldMapElement.WorldMapElement_count; ++var27) { // L: 1939
						byte[] var28 = var25.takeFile(35, var27); // L: 1940
						WorldMapElement.WorldMapElement_cached[var27] = new WorldMapElement(var27); // L: 1941
						if (var28 != null) { // L: 1942
							WorldMapElement.WorldMapElement_cached[var27].decode(new Buffer(var28)); // L: 1943
							WorldMapElement.WorldMapElement_cached[var27].method3436(); // L: 1944
						}
					}
				}

				Login.Login_loadingText = "Loaded config"; // L: 1948
				Login.Login_loadingPercent = 60; // L: 1949
				Client.titleLoadingStage = 80; // L: 1950
			}
		}
	} // L: 1670 1676 1703 1731 1751 1768 1776 1785 1822 1828 1834 1839 1951 1980 1992 1998 2004 2011 2016 2024 2030 2039 2045 2050 2055 2060 2066 2074 2078 2080

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "92"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0); // L: 10837

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) { // L: 10838
			var1 = var1.substring(0, var2) + "," + var1.substring(var2); // L: 10839
		}

		if (var1.length() > 9) { // L: 10841
			return " " + GameObject.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + GameObject.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + GameObject.colorStartTag(16776960) + var1 + "</col>"; // L: 10842 10843
		}
	}
}
