import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1875167049
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1905401649
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("aq")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1302967875
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 761215505
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 561204023
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1402262375
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -935505685
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1793688517
	)
	int field1094;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1238902143
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 240546619
	)
	int field1098;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1793206457
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1107395863
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 54499173
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 806621699
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("aj")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -55850951
	)
	@Export("team")
	int team;
	@ObfuscatedName("az")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1900490645
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1232170701
	)
	@Export("index")
	int index;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("bi")
	boolean field1110;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 2039538205
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1584800161
	)
	@Export("tileY")
	int tileY;

	Player() {
		this.headIconPk = -1; // L: 19
		this.headIconPrayer = -1; // L: 20
		this.actions = new String[3]; // L: 22

		for (int var1 = 0; var1 < 3; ++var1) { // L: 25
			this.actions[var1] = "";
		}

		this.combatLevel = 0; // L: 28
		this.skillLevel = 0; // L: 29
		this.animationCycleStart = 0; // L: 31
		this.animationCycleEnd = 0; // L: 32
		this.isUnanimated = false; // L: 41
		this.team = 0; // L: 42
		this.isHidden = false; // L: 43
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 46
		this.isInFriendsChat = TriBool.TriBool_unknown; // L: 47
		this.isInClanChat = TriBool.TriBool_unknown; // L: 48
		this.field1110 = false; // L: 49
	} // L: 53

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)V",
		garbageValue = "-1448794473"
	)
	@Export("read")
	final void read(Buffer var1) {
		var1.offset = 0; // L: 56
		int var2 = var1.readUnsignedByte(); // L: 57
		boolean var3 = true; // L: 58
		this.headIconPk = var1.readByte(); // L: 59
		this.headIconPrayer = var1.readByte(); // L: 60
		int var4 = -1; // L: 61
		this.team = 0; // L: 62
		int[] var5 = new int[12]; // L: 63

		int var7;
		int var8;
		int var9;
		for (int var6 = 0; var6 < 12; ++var6) { // L: 64
			var7 = var1.readUnsignedByte(); // L: 65
			if (var7 == 0) { // L: 66
				var5[var6] = 0; // L: 67
			} else {
				var8 = var1.readUnsignedByte(); // L: 70
				var5[var6] = var8 + (var7 << 8); // L: 71
				if (var6 == 0 && var5[0] == 65535) { // L: 72
					var4 = var1.readUnsignedShort(); // L: 73
					break;
				}

				if (var5[var6] >= 512) { // L: 76
					var9 = HealthBarUpdate.ItemComposition_get(var5[var6] - 512).team; // L: 77
					if (var9 != 0) { // L: 78
						this.team = var9;
					}
				}
			}
		}

		int[] var13 = null; // L: 81
		if (Client.field497 >= 213) { // L: 82
			var13 = new int[12]; // L: 83

			for (var7 = 0; var7 < 12; ++var7) { // L: 84
				var8 = var1.readUnsignedByte(); // L: 85
				if (var8 == 0) { // L: 86
					var13[var7] = 0; // L: 87
				} else {
					var9 = var1.readUnsignedByte(); // L: 90
					var13[var7] = var9 + (var8 << 8); // L: 91
				}
			}
		}

		int[] var14 = new int[5]; // L: 94

		for (var8 = 0; var8 < 5; ++var8) { // L: 95
			var9 = var1.readUnsignedByte(); // L: 96
			if (var9 < 0 || var9 >= PlayerComposition.field3507[var8].length) { // L: 97
				var9 = 0;
			}

			var14[var8] = var9; // L: 98
		}

		super.idleSequence = var1.readUnsignedShort(); // L: 100
		if (super.idleSequence == 65535) { // L: 101
			super.idleSequence = -1;
		}

		super.field1136 = var1.readUnsignedShort(); // L: 102
		if (super.field1136 == 65535) { // L: 103
			super.field1136 = -1;
		}

		super.field1166 = super.field1136; // L: 104
		super.walkSequence = var1.readUnsignedShort(); // L: 105
		if (super.walkSequence == 65535) { // L: 106
			super.walkSequence = -1;
		}

		super.walkBackSequence = var1.readUnsignedShort(); // L: 107
		if (super.walkBackSequence == 65535) { // L: 108
			super.walkBackSequence = -1;
		}

		super.walkLeftSequence = var1.readUnsignedShort(); // L: 109
		if (super.walkLeftSequence == 65535) { // L: 110
			super.walkLeftSequence = -1;
		}

		super.walkRightSequence = var1.readUnsignedShort(); // L: 111
		if (super.walkRightSequence == 65535) { // L: 112
			super.walkRightSequence = -1;
		}

		super.runSequence = var1.readUnsignedShort(); // L: 113
		if (super.runSequence == 65535) { // L: 114
			super.runSequence = -1;
		}

		this.username = new Username(var1.readStringCp1252NullTerminated(), class70.loginType); // L: 115
		this.clearIsFriend(); // L: 116
		this.clearIsInFriendsChat(); // L: 117
		this.method2296(); // L: 118
		if (this == MusicPatchNode.localPlayer) { // L: 119
			RunException.field5158 = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte(); // L: 120
		this.skillLevel = var1.readUnsignedShort(); // L: 121
		this.isHidden = var1.readUnsignedByte() == 1; // L: 122
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) { // L: 123
			this.isHidden = false;
		}

		class179[] var15 = null; // L: 124
		boolean var17 = false; // L: 125
		int var10 = var1.readUnsignedShort(); // L: 126
		var17 = (var10 >> 15 & 1) == 1; // L: 127
		int var11;
		if (var10 > 0 && var10 != 32768) { // L: 128
			var15 = new class179[12]; // L: 129

			for (var11 = 0; var11 < 12; ++var11) { // L: 130
				int var12 = var10 >> 12 - var11 & 1; // L: 131
				if (var12 == 1) { // L: 132
					var15[var11] = Projectile.method2116(var5[var11] - 512, var1); // L: 133
				}
			}
		}

		for (var11 = 0; var11 < 3; ++var11) { // L: 137
			this.actions[var11] = var1.readStringCp1252NullTerminated(); // L: 138
		}

		int var16 = var1.readUnsignedByte(); // L: 140
		if (this.appearance == null) { // L: 141
			this.appearance = new PlayerComposition();
		}

		this.appearance.method6037(var13, var5, var15, var17, var14, var2, var4, var16); // L: 142
	} // L: 143

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Lit;",
		garbageValue = "-112"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) { // L: 206
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? ItemContainer.SequenceDefinition_get(super.sequence) : null; // L: 207
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.movementSequence == super.idleSequence && var1 != null ? null : ItemContainer.SequenceDefinition_get(super.movementSequence); // L: 208
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 209
			if (var3 == null) { // L: 210
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 211
				super.defaultHeight = var3.height; // L: 212
				int var4 = var3.indicesCount; // L: 213
				if (!this.isUnanimated) { // L: 214
					var3 = this.method2374(var3); // L: 215
				}

				if (!this.isUnanimated && this.model0 != null) { // L: 217
					if (Client.cycle >= this.animationCycleEnd) { // L: 218
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) { // L: 219
						Model var5 = this.model0; // L: 220
						var5.offsetBy(this.field1094 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1098 * 4096 - super.y); // L: 221
						if (super.orientation == 512) { // L: 222
							var5.rotateY90Ccw(); // L: 223
							var5.rotateY90Ccw(); // L: 224
							var5.rotateY90Ccw(); // L: 225
						} else if (super.orientation == 1024) { // L: 227
							var5.rotateY90Ccw(); // L: 228
							var5.rotateY90Ccw(); // L: 229
						} else if (super.orientation == 1536) { // L: 231
							var5.rotateY90Ccw();
						}

						Model[] var6 = new Model[]{var3, var5}; // L: 232
						var3 = new Model(var6, 2); // L: 233
						if (super.orientation == 512) { // L: 234
							var5.rotateY90Ccw();
						} else if (super.orientation == 1024) { // L: 235
							var5.rotateY90Ccw(); // L: 236
							var5.rotateY90Ccw(); // L: 237
						} else if (super.orientation == 1536) { // L: 239
							var5.rotateY90Ccw(); // L: 240
							var5.rotateY90Ccw(); // L: 241
							var5.rotateY90Ccw(); // L: 242
						}

						var5.offsetBy(super.x - this.field1094 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1098 * 4096); // L: 244
					}
				}

				var3.isSingleTile = true; // L: 247
				if (super.field1208 != 0 && Client.cycle >= super.field1168 && Client.cycle < super.field1156) { // L: 248
					var3.overrideHue = super.field1180; // L: 249
					var3.overrideSaturation = super.field1199; // L: 250
					var3.overrideLuminance = super.field1200; // L: 251
					var3.overrideAmount = super.field1208; // L: 252
					var3.field2755 = (short)var4; // L: 253
				} else {
					var3.overrideAmount = 0; // L: 256
				}

				return var3; // L: 258
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1214578435"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) { // L: 146
			this.checkIsFriend(); // L: 147
		}

		return this.isFriendTriBool == TriBool.TriBool_true; // L: 149
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 153
	} // L: 154

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "94"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = World.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 157
	} // L: 158

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-120"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) { // L: 161
			this.updateIsInFriendsChat(); // L: 162
		}

		return this.isInFriendsChat == TriBool.TriBool_true; // L: 164
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2091394919"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown; // L: 168
	} // L: 169

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "45"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = UserComparator5.friendsChatManager != null && UserComparator5.friendsChatManager.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 172
	} // L: 173

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-64"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) { // L: 176
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3302(this.username.getName()) != -1 && var1 != 2) { // L: 177 178
				this.isInClanChat = TriBool.TriBool_true; // L: 179
				return; // L: 180
			}
		}

		this.isInClanChat = TriBool.TriBool_false; // L: 184
	} // L: 185

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "453146982"
	)
	void method2296() {
		this.isInClanChat = TriBool.TriBool_unknown; // L: 188
	} // L: 189

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) { // L: 192
			this.updateIsInClanChat(); // L: 193
		}

		return this.isInClanChat == TriBool.TriBool_true; // L: 195
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-83"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? AbstractArchive.getNpcDefinition(this.appearance.npcTransformId).size : 1; // L: 199 200 202
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IILiu;B)V",
		garbageValue = "-1"
	)
	final void method2308(int var1, int var2, class210 var3) {
		if (super.sequence != -1 && ItemContainer.SequenceDefinition_get(super.sequence).field2313 == 1) { // L: 262
			super.sequence = -1;
		}

		this.method2370(); // L: 263
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) { // L: 264
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) { // L: 265
				if (var3 == class210.field2387) {
					Decimator.method1124(this, var1, var2, class210.field2387); // L: 267
				}

				this.method2302(var1, var2, var3); // L: 268
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	} // L: 270

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1060497849"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0;
		super.field1210 = 0;
		super.field1209 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		int var3 = this.transformedSize();
		super.x = var3 * 64 + super.pathX[0] * 128;
		super.y = super.pathY[0] * 128 + var3 * 64;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IILiu;I)V",
		garbageValue = "475560620"
	)
	final void method2302(int var1, int var2, class210 var3) {
		if (super.pathLength < 9) {
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) {
			super.pathX[var4] = super.pathX[var4 - 1];
			super.pathY[var4] = super.pathY[var4 - 1];
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1];
		}

		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.pathTraversed[0] = var3;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1666539507"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "0"
	)
	static int method2357(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 14
		if (var2 == null) { // L: 15
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1; // L: 16 17
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1198190304"
	)
	static void method2356() {
		if (class12.clearLoginScreen) { // L: 273
			Login.titleboxSprite = null; // L: 274
			class292.field3361 = null; // L: 275
			class396.field4533 = null; // L: 276
			class123.leftTitleSprite = null; // L: 277
			ParamComposition.rightTitleSprite = null; // L: 278
			Canvas.logoSprite = null; // L: 279
			class148.title_muteSprite = null; // L: 280
			Login.field892 = null; // L: 281
			class158.field1766 = null; // L: 282
			class476.worldSelectBackSprites = null; // L: 283
			class16.worldSelectFlagSprites = null; // L: 284
			DevicePcmPlayerProvider.worldSelectArrows = null; // L: 285
			World.worldSelectStars = null; // L: 286
			class319.field3726 = null; // L: 287
			class121.loginScreenRunesAnimation.method2442(); // L: 288
			class297.musicPlayerStatus = 1; // L: 290
			class297.musicTrackArchive = null; // L: 291
			class379.musicTrackGroupId = -1; // L: 292
			VarpDefinition.musicTrackFileId = -1; // L: 293
			class100.musicTrackVolume = 0; // L: 294
			class120.musicTrackBoolean = false; // L: 295
			class162.pcmSampleLength = 2; // L: 296
			class177.method3617(true); // L: 298
			class12.clearLoginScreen = false; // L: 299
		}
	} // L: 300
}
