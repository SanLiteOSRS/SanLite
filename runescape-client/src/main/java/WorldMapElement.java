import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hg")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	@Export("WorldMapElement_archive")
	static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lhg;"
	)
	@Export("WorldMapElement_cached")
	static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 177645729
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("WorldMapElement_cachedSprites")
	public static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("nw")
	@ObfuscatedGetter(
		intValue = -449323691
	)
	@Export("menuY")
	static int menuY;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 839127727
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1899976093
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -562514839
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("an")
	@Export("name")
	public String name;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -336139237
	)
	public int field1940;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1429003369
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("ao")
	public boolean field1929;
	@ObfuscatedName("as")
	public boolean field1925;
	@ObfuscatedName("am")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("ag")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("aa")
	int[] field1933;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 788571275
	)
	int field1934;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1664906919
	)
	int field1935;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -241453719
	)
	int field1936;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -2038047409
	)
	int field1937;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("aq")
	int[] field1939;
	@ObfuscatedName("ah")
	byte[] field1941;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 216018767
	)
	@Export("category")
	public int category;

	static {
		WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256); // L: 16
	}

	WorldMapElement(int var1) {
		this.sprite1 = -1; // L: 18
		this.sprite2 = -1; // L: 19
		this.textSize = 0; // L: 22
		this.field1929 = true; // L: 24
		this.field1925 = false; // L: 25
		this.menuActions = new String[5]; // L: 26
		this.field1934 = Integer.MAX_VALUE; // L: 29
		this.field1935 = Integer.MAX_VALUE; // L: 30
		this.field1936 = Integer.MIN_VALUE; // L: 31
		this.field1937 = Integer.MIN_VALUE; // L: 32
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered; // L: 33
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1; // L: 37
		this.objectId = var1; // L: 40
	} // L: 41

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ltl;B)V",
		garbageValue = "-128"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 70
			if (var2 == 0) { // L: 71
				return; // L: 74
			}

			this.decodeNext(var1, var2); // L: 72
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ltl;II)V",
		garbageValue = "1742493020"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 77
			this.sprite1 = var1.method9077();
		} else if (var2 == 2) { // L: 78
			this.sprite2 = var1.method9077();
		} else if (var2 == 3) { // L: 79
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 80
			this.field1940 = var1.readMedium();
		} else if (var2 == 5) { // L: 81
			var1.readMedium(); // L: 82
		} else if (var2 == 6) { // L: 84
			this.textSize = var1.readUnsignedByte();
		} else {
			int var3;
			if (var2 == 7) { // L: 85
				var3 = var1.readUnsignedByte(); // L: 86
				if ((var3 & 1) == 0) { // L: 87
					this.field1929 = false;
				}

				if ((var3 & 2) == 2) { // L: 88
					this.field1925 = true;
				}
			} else if (var2 == 8) { // L: 90
				var1.readUnsignedByte(); // L: 91
			} else if (var2 >= 10 && var2 <= 14) { // L: 93
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) { // L: 94
				var3 = var1.readUnsignedByte(); // L: 95
				this.field1933 = new int[var3 * 2]; // L: 96

				int var4;
				for (var4 = 0; var4 < var3 * 2; ++var4) { // L: 97
					this.field1933[var4] = var1.readShort();
				}

				var1.readInt(); // L: 98
				var4 = var1.readUnsignedByte(); // L: 99
				this.field1939 = new int[var4]; // L: 100

				int var5;
				for (var5 = 0; var5 < this.field1939.length; ++var5) { // L: 101
					this.field1939[var5] = var1.readInt();
				}

				this.field1941 = new byte[var3]; // L: 102

				for (var5 = 0; var5 < var3; ++var5) { // L: 103
					this.field1941[var5] = var1.readByte();
				}
			} else if (var2 != 16) { // L: 105
				if (var2 == 17) { // L: 106
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) { // L: 107
					var1.method9077(); // L: 108
				} else if (var2 == 19) { // L: 110
					this.category = var1.readUnsignedShort();
				} else if (var2 == 21) { // L: 111
					var1.readInt(); // L: 112
				} else if (var2 == 22) { // L: 114
					var1.readInt(); // L: 115
				} else if (var2 == 23) { // L: 117
					var1.readUnsignedByte(); // L: 118
					var1.readUnsignedByte(); // L: 119
					var1.readUnsignedByte(); // L: 120
				} else if (var2 == 24) { // L: 122
					var1.readShort(); // L: 123
					var1.readShort(); // L: 124
				} else if (var2 == 25) { // L: 126
					var1.method9077(); // L: 127
				} else if (var2 == 28) { // L: 129
					var1.readUnsignedByte(); // L: 130
				} else if (var2 == 29) { // L: 132
					this.horizontalAlignment = (HorizontalAlignment)class93.findEnumerated(GrandExchangeOffer.method6970(), var1.readUnsignedByte()); // L: 133
				} else if (var2 == 30) { // L: 135
					this.verticalAlignment = (VerticalAlignment)class93.findEnumerated(WorldMapAreaData.method5634(), var1.readUnsignedByte()); // L: 136
				}
			}
		}

	} // L: 139

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-746128998"
	)
	void method3704() {
		if (this.field1933 != null) { // L: 142
			for (int var1 = 0; var1 < this.field1933.length; var1 += 2) { // L: 143
				if (this.field1933[var1] < this.field1934) { // L: 144
					this.field1934 = this.field1933[var1];
				} else if (this.field1933[var1] > this.field1936) {
					this.field1936 = this.field1933[var1]; // L: 145
				}

				if (this.field1933[var1 + 1] < this.field1935) { // L: 146
					this.field1935 = this.field1933[var1 + 1];
				} else if (this.field1933[var1 + 1] > this.field1937) {
					this.field1937 = this.field1933[var1 + 1]; // L: 147
				}
			}
		}

	} // L: 150

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ZI)Luq;",
		garbageValue = "-349707559"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1; // L: 153
		return this.getSprite(var2); // L: 154
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Luq;",
		garbageValue = "1880350287"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) { // L: 158
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)WorldMapElement_cachedSprites.get((long)var1); // L: 159
			if (var2 != null) { // L: 160
				return var2;
			} else {
				var2 = LoginType.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0); // L: 161
				if (var2 != null) { // L: 162
					WorldMapElement_cachedSprites.put(var2, (long)var1); // L: 163
				}

				return var2; // L: 165
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-41"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId; // L: 169
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-544149136"
	)
	static int method3691(int var0, int var1, int var2) {
		return var0 << 28 | var1 << 14 | var2; // L: 34
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZI)I",
		garbageValue = "216770488"
	)
	static int method3719(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) { // L: 2881
			if (class162.friendSystem.field824 == 0) { // L: 2882
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -2;
			} else if (class162.friendSystem.field824 == 1) { // L: 2883
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class162.friendSystem.friendsList.getSize(); // L: 2884
			}

			return 1; // L: 2885
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2888
				if (class162.friendSystem.method1868() && var3 >= 0 && var3 < class162.friendSystem.friendsList.getSize()) { // L: 2889
					Friend var8 = (Friend)class162.friendSystem.friendsList.get(var3); // L: 2890
					Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var8.getName(); // L: 2891
					Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var8.getPreviousName(); // L: 2892
				} else {
					Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 2895
					Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 2896
				}

				return 1; // L: 2898
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2901
				if (class162.friendSystem.method1868() && var3 >= 0 && var3 < class162.friendSystem.friendsList.getSize()) { // L: 2902
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)class162.friendSystem.friendsList.get(var3)).world; // L: 2903
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2905
				}

				return 1; // L: 2906
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2909
				if (class162.friendSystem.method1868() && var3 >= 0 && var3 < class162.friendSystem.friendsList.getSize()) { // L: 2910
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)class162.friendSystem.friendsList.get(var3)).rank; // L: 2911
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2913
				}

				return 1; // L: 2914
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 2917
					int var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2918
					class447.method8166(var5, var9); // L: 2919
					return 1; // L: 2920
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 2923
					class162.friendSystem.addFriend(var5); // L: 2924
					return 1; // L: 2925
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 2928
					class162.friendSystem.removeFriend(var5); // L: 2929
					return 1; // L: 2930
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 2933
					class162.friendSystem.addIgnore(var5); // L: 2934
					return 1; // L: 2935
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 2938
					boolean var6 = true; // L: 2939
					class162.friendSystem.method1880(var5, var6); // L: 2940
					return 1; // L: 2941
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 2944
					var5 = Language.method7016(var5); // L: 2945
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class162.friendSystem.isFriended(new Username(var5, ObjectSound.loginType), false) ? 1 : 0; // L: 2946
					return 1; // L: 2947
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (ObjectSound.friendsChatManager != null) { // L: 2950
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ObjectSound.friendsChatManager.name; // L: 2951
					} else {
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 2953
					}

					return 1; // L: 2954
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (ObjectSound.friendsChatManager != null) { // L: 2957
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ObjectSound.friendsChatManager.getSize(); // L: 2958
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2960
					}

					return 1; // L: 2961
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2964
					if (ObjectSound.friendsChatManager != null && var3 < ObjectSound.friendsChatManager.getSize()) { // L: 2965
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ObjectSound.friendsChatManager.get(var3).getUsername().getName(); // L: 2966
					} else {
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 2968
					}

					return 1; // L: 2969
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2972
					if (ObjectSound.friendsChatManager != null && var3 < ObjectSound.friendsChatManager.getSize()) { // L: 2973
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)ObjectSound.friendsChatManager.get(var3)).getWorld(); // L: 2974
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2976
					}

					return 1; // L: 2977
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2980
					if (ObjectSound.friendsChatManager != null && var3 < ObjectSound.friendsChatManager.getSize()) { // L: 2981
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)ObjectSound.friendsChatManager.get(var3)).rank; // L: 2982
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2984
					}

					return 1; // L: 2985
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ObjectSound.friendsChatManager != null ? ObjectSound.friendsChatManager.minKick : 0; // L: 2988
					return 1; // L: 2989
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 2992
					class25.clanKickUser(var5); // L: 2993
					return 1; // L: 2994
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ObjectSound.friendsChatManager != null ? ObjectSound.friendsChatManager.rank : 0; // L: 2997
					return 1; // L: 2998
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 3001
					KitDefinition.Clan_joinChat(var5); // L: 3002
					return 1; // L: 3003
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					class102.Clan_leaveChat(); // L: 3006
					return 1; // L: 3007
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!class162.friendSystem.method1868()) { // L: 3010
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class162.friendSystem.ignoreList.getSize(); // L: 3011
					}

					return 1; // L: 3012
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3015
					if (class162.friendSystem.method1868() && var3 >= 0 && var3 < class162.friendSystem.ignoreList.getSize()) { // L: 3016
						Ignored var4 = (Ignored)class162.friendSystem.ignoreList.get(var3); // L: 3017
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var4.getName(); // L: 3018
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var4.getPreviousName(); // L: 3019
					} else {
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 3022
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 3023
					}

					return 1; // L: 3025
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 3028
					var5 = Language.method7016(var5); // L: 3029
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class162.friendSystem.isIgnored(new Username(var5, ObjectSound.loginType)) ? 1 : 0; // L: 3030
					return 1; // L: 3031
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3034
					if (ObjectSound.friendsChatManager != null && var3 < ObjectSound.friendsChatManager.getSize() && ObjectSound.friendsChatManager.get(var3).getUsername().equals(class27.localPlayer.username)) { // L: 3035
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3036
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3038
					}

					return 1; // L: 3039
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (ObjectSound.friendsChatManager != null && ObjectSound.friendsChatManager.owner != null) { // L: 3042
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ObjectSound.friendsChatManager.owner; // L: 3043
					} else {
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 3045
					}

					return 1; // L: 3046
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3049
					if (ObjectSound.friendsChatManager != null && var3 < ObjectSound.friendsChatManager.getSize() && ((FriendsChatMember)ObjectSound.friendsChatManager.get(var3)).isFriend()) { // L: 3050
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3051
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3053
					}

					return 1; // L: 3054
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						class162.friendSystem.friendsList.removeComparator(); // L: 3065
						return 1; // L: 3066
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3069
							class162.friendSystem.friendsList.addComparator(new UserComparator1(var7)); // L: 3070
							return 1; // L: 3071
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3074
							class162.friendSystem.friendsList.addComparator(new UserComparator2(var7)); // L: 3075
							return 1; // L: 3076
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3079
							class162.friendSystem.friendsList.addComparator(new UserComparator3(var7)); // L: 3080
							return 1; // L: 3081
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3084
							class162.friendSystem.friendsList.addComparator(new UserComparator4(var7)); // L: 3085
							return 1; // L: 3086
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3089
							class162.friendSystem.friendsList.addComparator(new UserComparator5(var7)); // L: 3090
							return 1; // L: 3091
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3094
							class162.friendSystem.friendsList.addComparator(new UserComparator6(var7)); // L: 3095
							return 1; // L: 3096
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3099
							class162.friendSystem.friendsList.addComparator(new UserComparator7(var7)); // L: 3100
							return 1; // L: 3101
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3104
							class162.friendSystem.friendsList.addComparator(new UserComparator8(var7)); // L: 3105
							return 1; // L: 3106
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3109
							class162.friendSystem.friendsList.addComparator(new UserComparator9(var7)); // L: 3110
							return 1; // L: 3111
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3114
							class162.friendSystem.friendsList.addComparator(new UserComparator10(var7)); // L: 3115
							return 1; // L: 3116
						} else if (var0 == 3639) {
							class162.friendSystem.friendsList.sort(); // L: 3119
							return 1; // L: 3120
						} else if (var0 == 3640) {
							class162.friendSystem.ignoreList.removeComparator(); // L: 3123
							return 1; // L: 3124
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3127
							class162.friendSystem.ignoreList.addComparator(new UserComparator1(var7)); // L: 3128
							return 1; // L: 3129
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3132
							class162.friendSystem.ignoreList.addComparator(new UserComparator2(var7)); // L: 3133
							return 1; // L: 3134
						} else if (var0 == 3643) {
							class162.friendSystem.ignoreList.sort(); // L: 3137
							return 1; // L: 3138
						} else if (var0 == 3644) {
							if (ObjectSound.friendsChatManager != null) { // L: 3141
								ObjectSound.friendsChatManager.removeComparator(); // L: 3142
							}

							return 1; // L: 3144
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3147
							if (ObjectSound.friendsChatManager != null) { // L: 3148
								ObjectSound.friendsChatManager.addComparator(new UserComparator1(var7)); // L: 3149
							}

							return 1; // L: 3151
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3154
							if (ObjectSound.friendsChatManager != null) { // L: 3155
								ObjectSound.friendsChatManager.addComparator(new UserComparator2(var7)); // L: 3156
							}

							return 1; // L: 3158
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3161
							if (ObjectSound.friendsChatManager != null) { // L: 3162
								ObjectSound.friendsChatManager.addComparator(new UserComparator3(var7)); // L: 3163
							}

							return 1; // L: 3165
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3168
							if (ObjectSound.friendsChatManager != null) { // L: 3169
								ObjectSound.friendsChatManager.addComparator(new UserComparator4(var7)); // L: 3170
							}

							return 1; // L: 3172
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3175
							if (ObjectSound.friendsChatManager != null) { // L: 3176
								ObjectSound.friendsChatManager.addComparator(new UserComparator5(var7)); // L: 3177
							}

							return 1; // L: 3179
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3182
							if (ObjectSound.friendsChatManager != null) { // L: 3183
								ObjectSound.friendsChatManager.addComparator(new UserComparator6(var7)); // L: 3184
							}

							return 1; // L: 3186
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3189
							if (ObjectSound.friendsChatManager != null) { // L: 3190
								ObjectSound.friendsChatManager.addComparator(new UserComparator7(var7)); // L: 3191
							}

							return 1; // L: 3193
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3196
							if (ObjectSound.friendsChatManager != null) { // L: 3197
								ObjectSound.friendsChatManager.addComparator(new UserComparator8(var7)); // L: 3198
							}

							return 1; // L: 3200
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3203
							if (ObjectSound.friendsChatManager != null) { // L: 3204
								ObjectSound.friendsChatManager.addComparator(new UserComparator9(var7)); // L: 3205
							}

							return 1; // L: 3207
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3210
							if (ObjectSound.friendsChatManager != null) { // L: 3211
								ObjectSound.friendsChatManager.addComparator(new UserComparator10(var7)); // L: 3212
							}

							return 1; // L: 3214
						} else if (var0 == 3655) {
							if (ObjectSound.friendsChatManager != null) { // L: 3217
								ObjectSound.friendsChatManager.sort(); // L: 3218
							}

							return 1; // L: 3220
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3223
							class162.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7)); // L: 3224
							return 1; // L: 3225
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3228
							if (ObjectSound.friendsChatManager != null) { // L: 3229
								ObjectSound.friendsChatManager.addComparator(new BuddyRankComparator(var7)); // L: 3230
							}

							return 1; // L: 3232
						} else {
							return 2; // L: 3234
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3057
					if (ObjectSound.friendsChatManager != null && var3 < ObjectSound.friendsChatManager.getSize() && ((FriendsChatMember)ObjectSound.friendsChatManager.get(var3)).isIgnored()) { // L: 3058
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3059
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3061
					}

					return 1; // L: 3062
				}
			}
		}
	}
}
