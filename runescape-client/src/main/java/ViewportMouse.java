import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jc")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("ay")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1902334287
	)
	@Export("ViewportMouse_x")
	static int ViewportMouse_x;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1904587191
	)
	@Export("ViewportMouse_y")
	static int ViewportMouse_y;
	@ObfuscatedName("ab")
	@Export("ViewportMouse_false0")
	static boolean ViewportMouse_false0;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1063341809
	)
	static int field2765;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2079680683
	)
	static int field2764;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 421648261
	)
	static int field2768;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -265488535
	)
	static int field2761;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -84349349
	)
	static int field2769;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -443242597
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("ap")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;
	@ObfuscatedName("ru")
	@ObfuscatedSignature(
		descriptor = "Lse;"
	)
	@Export("Ignored_cached")
	static class485 Ignored_cached;

	static {
		ViewportMouse_isInViewport = false; // L: 4
		ViewportMouse_x = 0; // L: 5
		ViewportMouse_y = 0; // L: 6
		ViewportMouse_false0 = false; // L: 7
		ViewportMouse_entityCount = 0; // L: 17
		ViewportMouse_entityTags = new long[1000];
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1732431497"
	)
	static String method4904(int var0) {
		return "<img=" + var0 + ">"; // L: 18
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "78"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 195
		var1.offset = var0.length - 2; // L: 196
		class515.SpriteBuffer_spriteCount = var1.readUnsignedShort(); // L: 197
		class515.SpriteBuffer_xOffsets = new int[class515.SpriteBuffer_spriteCount]; // L: 198
		class515.SpriteBuffer_yOffsets = new int[class515.SpriteBuffer_spriteCount]; // L: 199
		SecureRandomCallable.SpriteBuffer_spriteWidths = new int[class515.SpriteBuffer_spriteCount]; // L: 200
		SecureRandomCallable.SpriteBuffer_spriteHeights = new int[class515.SpriteBuffer_spriteCount]; // L: 201
		WorldMapDecoration.SpriteBuffer_pixels = new byte[class515.SpriteBuffer_spriteCount][]; // L: 202
		var1.offset = var0.length - 7 - class515.SpriteBuffer_spriteCount * 8; // L: 203
		class515.SpriteBuffer_spriteWidth = var1.readUnsignedShort(); // L: 204
		class515.SpriteBuffer_spriteHeight = var1.readUnsignedShort(); // L: 205
		int var2 = (var1.readUnsignedByte() & 255) + 1; // L: 206

		int var3;
		for (var3 = 0; var3 < class515.SpriteBuffer_spriteCount; ++var3) { // L: 207
			class515.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class515.SpriteBuffer_spriteCount; ++var3) { // L: 208
			class515.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class515.SpriteBuffer_spriteCount; ++var3) { // L: 209
			SecureRandomCallable.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class515.SpriteBuffer_spriteCount; ++var3) { // L: 210
			SecureRandomCallable.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class515.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3; // L: 211
		class515.SpriteBuffer_spritePalette = new int[var2]; // L: 212

		for (var3 = 1; var3 < var2; ++var3) { // L: 213
			class515.SpriteBuffer_spritePalette[var3] = var1.readMedium(); // L: 214
			if (class515.SpriteBuffer_spritePalette[var3] == 0) { // L: 215
				class515.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0; // L: 217

		for (var3 = 0; var3 < class515.SpriteBuffer_spriteCount; ++var3) { // L: 218
			int var4 = SecureRandomCallable.SpriteBuffer_spriteWidths[var3]; // L: 219
			int var5 = SecureRandomCallable.SpriteBuffer_spriteHeights[var3]; // L: 220
			int var6 = var5 * var4; // L: 221
			byte[] var7 = new byte[var6]; // L: 222
			WorldMapDecoration.SpriteBuffer_pixels[var3] = var7; // L: 223
			int var8 = var1.readUnsignedByte(); // L: 224
			int var9;
			if (var8 == 0) { // L: 225
				for (var9 = 0; var9 < var6; ++var9) { // L: 226
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) { // L: 228
				for (var9 = 0; var9 < var4; ++var9) { // L: 229
					for (int var10 = 0; var10 < var5; ++var10) { // L: 230
						var7[var9 + var10 * var4] = var1.readByte(); // L: 231
					}
				}
			}
		}

	} // L: 236

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZI)I",
		garbageValue = "-1757927830"
	)
	static int method4905(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) { // L: 2842
			if (ReflectionCheck.friendSystem.field808 == 0) { // L: 2843
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = -2;
			} else if (ReflectionCheck.friendSystem.field808 == 1) { // L: 2844
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = ReflectionCheck.friendSystem.friendsList.getSize(); // L: 2845
			}

			return 1; // L: 2846
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 2849
				if (ReflectionCheck.friendSystem.method1829() && var3 >= 0 && var3 < ReflectionCheck.friendSystem.friendsList.getSize()) { // L: 2850
					Friend var8 = (Friend)ReflectionCheck.friendSystem.friendsList.get(var3); // L: 2851
					Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var8.getName(); // L: 2852
					Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var8.getPreviousName(); // L: 2853
				} else {
					Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 2856
					Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 2857
				}

				return 1; // L: 2859
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 2862
				if (ReflectionCheck.friendSystem.method1829() && var3 >= 0 && var3 < ReflectionCheck.friendSystem.friendsList.getSize()) { // L: 2863
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = ((Buddy)ReflectionCheck.friendSystem.friendsList.get(var3)).world; // L: 2864
				} else {
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 2866
				}

				return 1; // L: 2867
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 2870
				if (ReflectionCheck.friendSystem.method1829() && var3 >= 0 && var3 < ReflectionCheck.friendSystem.friendsList.getSize()) { // L: 2871
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = ((Buddy)ReflectionCheck.friendSystem.friendsList.get(var3)).rank; // L: 2872
				} else {
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 2874
				}

				return 1; // L: 2875
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 2878
					int var9 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 2879
					ScriptFrame.method1162(var5, var9); // L: 2880
					return 1; // L: 2881
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 2884
					ReflectionCheck.friendSystem.addFriend(var5); // L: 2885
					return 1; // L: 2886
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 2889
					ReflectionCheck.friendSystem.removeFriend(var5); // L: 2890
					return 1; // L: 2891
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 2894
					ReflectionCheck.friendSystem.addIgnore(var5); // L: 2895
					return 1; // L: 2896
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 2899
					boolean var6 = true; // L: 2900
					ReflectionCheck.friendSystem.method1876(var5, var6); // L: 2901
					return 1; // L: 2902
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 2905
					var5 = WorldMapSection0.method5430(var5); // L: 2906
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = ReflectionCheck.friendSystem.isFriended(new Username(var5, class31.loginType), false) ? 1 : 0; // L: 2907
					return 1; // L: 2908
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (BZip2State.friendsChatManager != null) { // L: 2911
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = BZip2State.friendsChatManager.name; // L: 2912
					} else {
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 2914
					}

					return 1; // L: 2915
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (BZip2State.friendsChatManager != null) { // L: 2918
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = BZip2State.friendsChatManager.getSize(); // L: 2919
					} else {
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 2921
					}

					return 1; // L: 2922
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 2925
					if (BZip2State.friendsChatManager != null && var3 < BZip2State.friendsChatManager.getSize()) { // L: 2926
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = BZip2State.friendsChatManager.get(var3).getUsername().getName(); // L: 2927
					} else {
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 2929
					}

					return 1; // L: 2930
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 2933
					if (BZip2State.friendsChatManager != null && var3 < BZip2State.friendsChatManager.getSize()) { // L: 2934
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = ((Buddy)BZip2State.friendsChatManager.get(var3)).getWorld(); // L: 2935
					} else {
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 2937
					}

					return 1; // L: 2938
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 2941
					if (BZip2State.friendsChatManager != null && var3 < BZip2State.friendsChatManager.getSize()) { // L: 2942
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = ((Buddy)BZip2State.friendsChatManager.get(var3)).rank; // L: 2943
					} else {
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 2945
					}

					return 1; // L: 2946
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = BZip2State.friendsChatManager != null ? BZip2State.friendsChatManager.minKick : 0; // L: 2949
					return 1; // L: 2950
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 2953
					Projectile.clanKickUser(var5); // L: 2954
					return 1; // L: 2955
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = BZip2State.friendsChatManager != null ? BZip2State.friendsChatManager.rank : 0; // L: 2958
					return 1; // L: 2959
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 2962
					TaskHandler.Clan_joinChat(var5); // L: 2963
					return 1; // L: 2964
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					FriendLoginUpdate.Clan_leaveChat(); // L: 2967
					return 1; // L: 2968
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!ReflectionCheck.friendSystem.method1829()) { // L: 2971
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = ReflectionCheck.friendSystem.ignoreList.getSize(); // L: 2972
					}

					return 1; // L: 2973
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 2976
					if (ReflectionCheck.friendSystem.method1829() && var3 >= 0 && var3 < ReflectionCheck.friendSystem.ignoreList.getSize()) { // L: 2977
						Ignored var4 = (Ignored)ReflectionCheck.friendSystem.ignoreList.get(var3); // L: 2978
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var4.getName(); // L: 2979
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var4.getPreviousName(); // L: 2980
					} else {
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 2983
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 2984
					}

					return 1; // L: 2986
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 2989
					var5 = WorldMapSection0.method5430(var5); // L: 2990
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = ReflectionCheck.friendSystem.isIgnored(new Username(var5, class31.loginType)) ? 1 : 0; // L: 2991
					return 1; // L: 2992
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 2995
					if (BZip2State.friendsChatManager != null && var3 < BZip2State.friendsChatManager.getSize() && BZip2State.friendsChatManager.get(var3).getUsername().equals(HitSplatDefinition.localPlayer.username)) { // L: 2996
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 1; // L: 2997
					} else {
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 2999
					}

					return 1; // L: 3000
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (BZip2State.friendsChatManager != null && BZip2State.friendsChatManager.owner != null) { // L: 3003
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = BZip2State.friendsChatManager.owner; // L: 3004
					} else {
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 3006
					}

					return 1; // L: 3007
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3010
					if (BZip2State.friendsChatManager != null && var3 < BZip2State.friendsChatManager.getSize() && ((FriendsChatMember)BZip2State.friendsChatManager.get(var3)).isFriend()) { // L: 3011
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 1; // L: 3012
					} else {
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 3014
					}

					return 1; // L: 3015
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						ReflectionCheck.friendSystem.friendsList.removeComparator(); // L: 3026
						return 1; // L: 3027
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 3030
							ReflectionCheck.friendSystem.friendsList.addComparator(new UserComparator1(var7)); // L: 3031
							return 1; // L: 3032
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 3035
							ReflectionCheck.friendSystem.friendsList.addComparator(new UserComparator2(var7)); // L: 3036
							return 1; // L: 3037
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 3040
							ReflectionCheck.friendSystem.friendsList.addComparator(new UserComparator3(var7)); // L: 3041
							return 1; // L: 3042
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 3045
							ReflectionCheck.friendSystem.friendsList.addComparator(new UserComparator4(var7)); // L: 3046
							return 1; // L: 3047
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 3050
							ReflectionCheck.friendSystem.friendsList.addComparator(new UserComparator5(var7)); // L: 3051
							return 1; // L: 3052
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 3055
							ReflectionCheck.friendSystem.friendsList.addComparator(new UserComparator6(var7)); // L: 3056
							return 1; // L: 3057
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 3060
							ReflectionCheck.friendSystem.friendsList.addComparator(new UserComparator7(var7)); // L: 3061
							return 1; // L: 3062
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 3065
							ReflectionCheck.friendSystem.friendsList.addComparator(new UserComparator8(var7)); // L: 3066
							return 1; // L: 3067
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 3070
							ReflectionCheck.friendSystem.friendsList.addComparator(new UserComparator9(var7)); // L: 3071
							return 1; // L: 3072
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 3075
							ReflectionCheck.friendSystem.friendsList.addComparator(new UserComparator10(var7)); // L: 3076
							return 1; // L: 3077
						} else if (var0 == 3639) {
							ReflectionCheck.friendSystem.friendsList.sort(); // L: 3080
							return 1; // L: 3081
						} else if (var0 == 3640) {
							ReflectionCheck.friendSystem.ignoreList.removeComparator(); // L: 3084
							return 1; // L: 3085
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 3088
							ReflectionCheck.friendSystem.ignoreList.addComparator(new UserComparator1(var7)); // L: 3089
							return 1; // L: 3090
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 3093
							ReflectionCheck.friendSystem.ignoreList.addComparator(new UserComparator2(var7)); // L: 3094
							return 1; // L: 3095
						} else if (var0 == 3643) {
							ReflectionCheck.friendSystem.ignoreList.sort(); // L: 3098
							return 1; // L: 3099
						} else if (var0 == 3644) {
							if (BZip2State.friendsChatManager != null) { // L: 3102
								BZip2State.friendsChatManager.removeComparator(); // L: 3103
							}

							return 1; // L: 3105
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 3108
							if (BZip2State.friendsChatManager != null) { // L: 3109
								BZip2State.friendsChatManager.addComparator(new UserComparator1(var7)); // L: 3110
							}

							return 1; // L: 3112
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 3115
							if (BZip2State.friendsChatManager != null) { // L: 3116
								BZip2State.friendsChatManager.addComparator(new UserComparator2(var7)); // L: 3117
							}

							return 1; // L: 3119
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 3122
							if (BZip2State.friendsChatManager != null) { // L: 3123
								BZip2State.friendsChatManager.addComparator(new UserComparator3(var7)); // L: 3124
							}

							return 1; // L: 3126
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 3129
							if (BZip2State.friendsChatManager != null) { // L: 3130
								BZip2State.friendsChatManager.addComparator(new UserComparator4(var7)); // L: 3131
							}

							return 1; // L: 3133
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 3136
							if (BZip2State.friendsChatManager != null) { // L: 3137
								BZip2State.friendsChatManager.addComparator(new UserComparator5(var7)); // L: 3138
							}

							return 1; // L: 3140
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 3143
							if (BZip2State.friendsChatManager != null) { // L: 3144
								BZip2State.friendsChatManager.addComparator(new UserComparator6(var7)); // L: 3145
							}

							return 1; // L: 3147
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 3150
							if (BZip2State.friendsChatManager != null) { // L: 3151
								BZip2State.friendsChatManager.addComparator(new UserComparator7(var7)); // L: 3152
							}

							return 1; // L: 3154
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 3157
							if (BZip2State.friendsChatManager != null) { // L: 3158
								BZip2State.friendsChatManager.addComparator(new UserComparator8(var7)); // L: 3159
							}

							return 1; // L: 3161
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 3164
							if (BZip2State.friendsChatManager != null) { // L: 3165
								BZip2State.friendsChatManager.addComparator(new UserComparator9(var7)); // L: 3166
							}

							return 1; // L: 3168
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 3171
							if (BZip2State.friendsChatManager != null) { // L: 3172
								BZip2State.friendsChatManager.addComparator(new UserComparator10(var7)); // L: 3173
							}

							return 1; // L: 3175
						} else if (var0 == 3655) {
							if (BZip2State.friendsChatManager != null) { // L: 3178
								BZip2State.friendsChatManager.sort(); // L: 3179
							}

							return 1; // L: 3181
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 3184
							ReflectionCheck.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7)); // L: 3185
							return 1; // L: 3186
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 3189
							if (BZip2State.friendsChatManager != null) { // L: 3190
								BZip2State.friendsChatManager.addComparator(new BuddyRankComparator(var7)); // L: 3191
							}

							return 1; // L: 3193
						} else {
							return 2; // L: 3195
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3018
					if (BZip2State.friendsChatManager != null && var3 < BZip2State.friendsChatManager.getSize() && ((FriendsChatMember)BZip2State.friendsChatManager.get(var3)).isIgnored()) { // L: 3019
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 1; // L: 3020
					} else {
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 3022
					}

					return 1; // L: 3023
				}
			}
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "212"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0; // L: 613
		if (PendingSpawn.garbageCollector == null || !PendingSpawn.garbageCollector.isValid()) { // L: 614
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator(); // L: 616

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next(); // L: 617
					if (var2.isValid()) { // L: 619
						PendingSpawn.garbageCollector = var2; // L: 620
						GameEngine.garbageCollectorLastCheckTimeMs = -1L; // L: 621
						GameEngine.garbageCollectorLastCollectionTime = -1L; // L: 622
					}
				}
			} catch (Throwable var11) { // L: 627
			}
		}

		if (PendingSpawn.garbageCollector != null) { // L: 629
			long var9 = Canvas.method310(); // L: 630
			long var3 = PendingSpawn.garbageCollector.getCollectionTime(); // L: 631
			if (GameEngine.garbageCollectorLastCollectionTime != -1L) { // L: 632
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime; // L: 633
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs; // L: 634
				if (0L != var7) { // L: 635
					var0 = (int)(var5 * 100L / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3; // L: 637
			GameEngine.garbageCollectorLastCheckTimeMs = var9; // L: 638
		}

		return var0; // L: 640
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		class25.method368(); // L: 8883
		Client.menuActions[0] = "Cancel"; // L: 8884
		Client.menuTargets[0] = ""; // L: 8885
		Client.menuOpcodes[0] = 1006; // L: 8886
		Client.menuShiftClick[0] = false; // L: 8887
		Client.menuOptionsCount = 1; // L: 8888
	} // L: 8889
}
