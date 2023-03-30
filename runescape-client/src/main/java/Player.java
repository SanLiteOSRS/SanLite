import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ltj;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2104357805
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -713795725
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("av")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1834899421
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1617887063
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 707796129
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1038824357
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -829831383
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -907378149
	)
	int field1095;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1410495185
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -130242965
	)
	int field1097;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 875369639
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1267650567
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -331432963
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1286990151
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("af")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 410341295
	)
	@Export("team")
	int team;
	@ObfuscatedName("aw")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 805568963
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -582895361
	)
	@Export("index")
	int index;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("bo")
	boolean field1111;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -471155365
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -991852499
	)
	@Export("tileY")
	int tileY;

	Player() {
		this.headIconPk = -1; // L: 20
		this.headIconPrayer = -1; // L: 21
		this.actions = new String[3]; // L: 23

		for (int var1 = 0; var1 < 3; ++var1) { // L: 26
			this.actions[var1] = "";
		}

		this.combatLevel = 0; // L: 29
		this.skillLevel = 0; // L: 30
		this.animationCycleStart = 0; // L: 32
		this.animationCycleEnd = 0; // L: 33
		this.isUnanimated = false; // L: 42
		this.team = 0; // L: 43
		this.isHidden = false; // L: 44
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 47
		this.isInFriendsChat = TriBool.TriBool_unknown; // L: 48
		this.isInClanChat = TriBool.TriBool_unknown; // L: 49
		this.field1111 = false; // L: 50
	} // L: 54

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "1240368093"
	)
	@Export("read")
	final void read(Buffer var1) {
		var1.offset = 0; // L: 57
		int var2 = var1.readUnsignedByte(); // L: 58
		boolean var3 = true; // L: 59
		this.headIconPk = var1.readByte(); // L: 60
		this.headIconPrayer = var1.readByte(); // L: 61
		int var4 = -1; // L: 62
		this.team = 0; // L: 63
		int[] var5 = new int[12]; // L: 64

		int var7;
		int var8;
		int var9;
		for (int var6 = 0; var6 < 12; ++var6) { // L: 65
			var7 = var1.readUnsignedByte(); // L: 66
			if (var7 == 0) { // L: 67
				var5[var6] = 0; // L: 68
			} else {
				var8 = var1.readUnsignedByte(); // L: 71
				var5[var6] = var8 + (var7 << 8); // L: 72
				if (var6 == 0 && var5[0] == 65535) { // L: 73
					var4 = var1.readUnsignedShort(); // L: 74
					break;
				}

				if (var5[var6] >= 512) { // L: 77
					var9 = ParamComposition.ItemComposition_get(var5[var6] - 512).team; // L: 78
					if (var9 != 0) { // L: 79
						this.team = var9;
					}
				}
			}
		}

		int[] var12 = new int[5]; // L: 82

		for (var7 = 0; var7 < 5; ++var7) { // L: 83
			var8 = var1.readUnsignedByte(); // L: 84
			if (var8 < 0 || var8 >= CollisionMap.field2315[var7].length) { // L: 85
				var8 = 0;
			}

			var12[var7] = var8; // L: 86
		}

		super.idleSequence = var1.readUnsignedShort(); // L: 88
		if (super.idleSequence == 65535) { // L: 89
			super.idleSequence = -1;
		}

		super.turnLeftSequence = var1.readUnsignedShort(); // L: 90
		if (super.turnLeftSequence == 65535) { // L: 91
			super.turnLeftSequence = -1;
		}

		super.turnRightSequence = super.turnLeftSequence; // L: 92
		super.walkSequence = var1.readUnsignedShort(); // L: 93
		if (super.walkSequence == 65535) { // L: 94
			super.walkSequence = -1;
		}

		super.walkBackSequence = var1.readUnsignedShort(); // L: 95
		if (super.walkBackSequence == 65535) { // L: 96
			super.walkBackSequence = -1;
		}

		super.walkLeftSequence = var1.readUnsignedShort(); // L: 97
		if (super.walkLeftSequence == 65535) { // L: 98
			super.walkLeftSequence = -1;
		}

		super.walkRightSequence = var1.readUnsignedShort(); // L: 99
		if (super.walkRightSequence == 65535) { // L: 100
			super.walkRightSequence = -1;
		}

		super.runSequence = var1.readUnsignedShort(); // L: 101
		if (super.runSequence == 65535) { // L: 102
			super.runSequence = -1;
		}

		this.username = new Username(var1.readStringCp1252NullTerminated(), Occluder.loginType); // L: 103
		this.clearIsFriend(); // L: 104
		this.clearIsInFriendsChat(); // L: 105
		this.method2305(); // L: 106
		if (this == BuddyRankComparator.localPlayer) { // L: 107
			RunException.localPlayerName = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte(); // L: 108
		this.skillLevel = var1.readUnsignedShort(); // L: 109
		this.isHidden = var1.readUnsignedByte() == 1; // L: 110
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) { // L: 111
			this.isHidden = false;
		}

		class180[] var13 = null; // L: 112
		boolean var15 = false; // L: 113
		var9 = var1.readUnsignedShort(); // L: 114
		var15 = (var9 >> 15 & 1) == 1; // L: 115
		int var10;
		if (var9 > 0 && var9 != 32768) { // L: 116
			var13 = new class180[12]; // L: 117

			for (var10 = 0; var10 < 12; ++var10) { // L: 118
				int var11 = var9 >> 12 - var10 & 1; // L: 119
				if (var11 == 1) { // L: 120
					var13[var10] = PlayerComposition.method5812(var5[var10] - 512, var1); // L: 121
				}
			}
		}

		for (var10 = 0; var10 < 3; ++var10) { // L: 125
			this.actions[var10] = var1.readStringCp1252NullTerminated(); // L: 126
		}

		int var14 = var1.readUnsignedByte(); // L: 128
		if (this.appearance == null) { // L: 129
			this.appearance = new PlayerComposition();
		}

		this.appearance.method5792(var5, var13, var15, var12, var2, var4, var14); // L: 130
	} // L: 131

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lix;",
		garbageValue = "-1998422213"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) { // L: 194
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? Coord.SequenceDefinition_get(super.sequence) : null; // L: 195
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.movementSequence == super.idleSequence && var1 != null ? null : Coord.SequenceDefinition_get(super.movementSequence); // L: 196
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 197
			if (var3 == null) { // L: 198
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 199
				super.defaultHeight = var3.height; // L: 200
				int var4 = var3.indicesCount; // L: 201
				Model var5;
				Model[] var6;
				if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 202
					var5 = DevicePcmPlayerProvider.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 203
					if (var5 != null) { // L: 204
						var5.offsetBy(0, -super.field1191, 0); // L: 205
						var6 = new Model[]{var3, var5}; // L: 206
						var3 = new Model(var6, 2); // L: 207
					}
				}

				if (!this.isUnanimated && this.model0 != null) { // L: 210
					if (Client.cycle >= this.animationCycleEnd) { // L: 211
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) { // L: 212
						var5 = this.model0; // L: 213
						var5.offsetBy(this.field1095 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1097 * 4096 - super.y); // L: 214
						if (super.orientation == 512) { // L: 215
							var5.rotateY90Ccw(); // L: 216
							var5.rotateY90Ccw(); // L: 217
							var5.rotateY90Ccw(); // L: 218
						} else if (super.orientation == 1024) { // L: 220
							var5.rotateY90Ccw(); // L: 221
							var5.rotateY90Ccw(); // L: 222
						} else if (super.orientation == 1536) { // L: 224
							var5.rotateY90Ccw();
						}

						var6 = new Model[]{var3, var5}; // L: 225
						var3 = new Model(var6, 2); // L: 226
						if (super.orientation == 512) { // L: 227
							var5.rotateY90Ccw();
						} else if (super.orientation == 1024) { // L: 228
							var5.rotateY90Ccw(); // L: 229
							var5.rotateY90Ccw(); // L: 230
						} else if (super.orientation == 1536) { // L: 232
							var5.rotateY90Ccw(); // L: 233
							var5.rotateY90Ccw(); // L: 234
							var5.rotateY90Ccw(); // L: 235
						}

						var5.offsetBy(super.x - this.field1095 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1097 * 4096); // L: 237
					}
				}

				var3.isSingleTile = true; // L: 240
				if (super.field1206 != 0 && Client.cycle >= super.field1201 && Client.cycle < super.field1159) { // L: 241
					var3.overrideHue = super.field1203; // L: 242
					var3.overrideSaturation = super.field1185; // L: 243
					var3.overrideLuminance = super.field1165; // L: 244
					var3.overrideAmount = super.field1206; // L: 245
					var3.field2725 = (short)var4; // L: 246
				} else {
					var3.overrideAmount = 0; // L: 249
				}

				return var3; // L: 251
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "86"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) { // L: 134
			this.checkIsFriend(); // L: 135
		}

		return this.isFriendTriBool == TriBool.TriBool_true; // L: 137
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "95"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 141
	} // L: 142

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = class6.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 145
	} // L: 146

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-124834401"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) { // L: 149
			this.updateIsInFriendsChat(); // L: 150
		}

		return this.isInFriendsChat == TriBool.TriBool_true; // L: 152
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1990954496"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown; // L: 156
	} // L: 157

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "935675147"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = ReflectionCheck.friendsChatManager != null && ReflectionCheck.friendsChatManager.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 160
	} // L: 161

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "16307"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) { // L: 164
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3255(this.username.getName()) != -1 && var1 != 2) { // L: 165 166
				this.isInClanChat = TriBool.TriBool_true; // L: 167
				return; // L: 168
			}
		}

		this.isInClanChat = TriBool.TriBool_false; // L: 172
	} // L: 173

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1603914179"
	)
	void method2305() {
		this.isInClanChat = TriBool.TriBool_unknown; // L: 176
	} // L: 177

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1596852971"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) { // L: 180
			this.updateIsInClanChat(); // L: 181
		}

		return this.isInClanChat == TriBool.TriBool_true; // L: 183
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "89"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? class188.getNpcDefinition(this.appearance.npcTransformId).size : 1; // L: 187 188 190
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IILis;I)V",
		garbageValue = "467719152"
	)
	final void method2336(int var1, int var2, class211 var3) {
		if (super.sequence != -1 && Coord.SequenceDefinition_get(super.sequence).field2255 == 1) { // L: 255
			super.sequence = -1;
		}

		this.method2362(); // L: 256
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) { // L: 257
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) { // L: 258
				if (var3 == class211.field2335) {
					class269.method5379(this, var1, var2, class211.field2335); // L: 260
				}

				this.method2309(var1, var2, var3); // L: 261
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	} // L: 263

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-90"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0; // L: 266
		super.field1215 = 0; // L: 267
		super.field1214 = 0; // L: 268
		super.pathX[0] = var1; // L: 269
		super.pathY[0] = var2; // L: 270
		int var3 = this.transformedSize(); // L: 271
		super.x = var3 * 64 + super.pathX[0] * 128; // L: 272
		super.y = super.pathY[0] * 128 + var3 * 64; // L: 273
	} // L: 274

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IILis;S)V",
		garbageValue = "-3935"
	)
	final void method2309(int var1, int var2, class211 var3) {
		if (super.pathLength < 9) { // L: 277
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) { // L: 278
			super.pathX[var4] = super.pathX[var4 - 1]; // L: 279
			super.pathY[var4] = super.pathY[var4 - 1]; // L: 280
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1]; // L: 281
		}

		super.pathX[0] = var1; // L: 283
		super.pathY[0] = var2; // L: 284
		super.pathTraversed[0] = var3; // L: 285
	} // L: 286

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1187706422"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null; // L: 289
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1116085058"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		class278.logOut(); // L: 2967
		switch(var0) { // L: 2968
		case 1:
			class14.method173(24); // L: 2980
			Tile.setLoginResponseString("", "You were disconnected from the server.", ""); // L: 2981
			break;
		case 2:
			class14.method173(24); // L: 2972
			Tile.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", ""); // L: 2973
		}

	} // L: 2986

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lmy;I)Ljava/lang/String;",
		garbageValue = "-1754511416"
	)
	static String method2340(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) { // L: 10482
			for (int var2 = 1; var2 <= 5; ++var2) { // L: 10483
				while (true) {
					int var3 = var0.indexOf("%" + var2); // L: 10485
					if (var3 == -1) { // L: 10486
						break;
					}

					String var4 = var0.substring(0, var3); // L: 10487
					int var6 = Language.method6661(var1, var2 - 1); // L: 10489
					String var5;
					if (var6 < 999999999) { // L: 10491
						var5 = Integer.toString(var6); // L: 10492
					} else {
						var5 = "*"; // L: 10495
					}

					var0 = var4 + var5 + var0.substring(var3 + 2); // L: 10497
				}
			}
		}

		return var0; // L: 10501
	}
}
