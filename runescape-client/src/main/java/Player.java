import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("ap")
	static byte[][][] field1127;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1366672705
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1008836279
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("ab")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1188560567
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2012563941
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 248170849
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 716052611
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1825194637
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1980359243
	)
	int field1107;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1434270451
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1332745825
	)
	int field1122;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1142394889
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1217084697
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 169941669
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -902424909
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("ai")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -642589407
	)
	@Export("team")
	int team;
	@ObfuscatedName("aw")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1141765425
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1822002451
	)
	@Export("index")
	int index;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("bj")
	boolean field1124;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1070117953
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1834042161
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
		this.field1124 = false; // L: 49
	} // L: 53

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)V",
		garbageValue = "0"
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
					var9 = class300.ItemComposition_get(var5[var6] - 512).team; // L: 77
					if (var9 != 0) { // L: 78
						this.team = var9;
					}
				}
			}
		}

		int[] var13 = null; // L: 81
		if (Client.field512 >= 213) { // L: 82
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
			if (var9 < 0 || var9 >= class13.field65[var8].length) { // L: 97
				var9 = 0;
			}

			var14[var8] = var9; // L: 98
		}

		super.idleSequence = var1.readUnsignedShort(); // L: 100
		if (super.idleSequence == 65535) { // L: 101
			super.idleSequence = -1;
		}

		super.field1199 = var1.readUnsignedShort(); // L: 102
		if (super.field1199 == 65535) { // L: 103
			super.field1199 = -1;
		}

		super.field1159 = super.field1199; // L: 104
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), WorldMapScaleHandler.loginType); // L: 115
		this.clearIsFriend(); // L: 116
		this.clearIsInFriendsChat(); // L: 117
		this.method2290(); // L: 118
		if (this == Projectile.localPlayer) { // L: 119
			RunException.field5176 = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte(); // L: 120
		this.skillLevel = var1.readUnsignedShort(); // L: 121
		this.isHidden = var1.readUnsignedByte() == 1; // L: 122
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) { // L: 123
			this.isHidden = false;
		}

		class182[] var15 = null; // L: 124
		boolean var17 = false; // L: 125
		int var10 = var1.readUnsignedShort(); // L: 126
		var17 = (var10 >> 15 & 1) == 1; // L: 127
		int var11;
		if (var10 > 0 && var10 != 32768) { // L: 128
			var15 = new class182[12]; // L: 129

			for (var11 = 0; var11 < 12; ++var11) { // L: 130
				int var12 = var10 >> 12 - var11 & 1; // L: 131
				if (var12 == 1) { // L: 132
					var15[var11] = class161.method3332(var5[var11] - 512, var1); // L: 133
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

		this.appearance.method6010(var13, var5, var15, var17, var14, var2, var4, var16); // L: 142
	} // L: 143

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljd;",
		garbageValue = "-1953039490"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) { // L: 206
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? WorldMapLabelSize.SequenceDefinition_get(super.sequence) : null; // L: 207
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.idleSequence == super.movementSequence && var1 != null ? null : WorldMapLabelSize.SequenceDefinition_get(super.movementSequence); // L: 208
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 209
			if (var3 == null) { // L: 210
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 211
				super.defaultHeight = var3.height; // L: 212
				int var4 = var3.indicesCount; // L: 213
				if (!this.isUnanimated) { // L: 214
					var3 = this.method2366(var3); // L: 215
				}

				if (!this.isUnanimated && this.model0 != null) { // L: 217
					if (Client.cycle >= this.animationCycleEnd) { // L: 218
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) { // L: 219
						Model var5 = this.model0; // L: 220
						var5.offsetBy(this.field1107 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1122 * 4096 - super.y); // L: 221
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

						var5.offsetBy(super.x - this.field1107 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1122 * 4096); // L: 244
					}
				}

				var3.isSingleTile = true; // L: 247
				if (super.field1217 != 0 && Client.cycle >= super.field1170 && Client.cycle < super.field1213) { // L: 248
					var3.overrideHue = super.field1164; // L: 249
					var3.overrideSaturation = super.field1215; // L: 250
					var3.overrideLuminance = super.field1196; // L: 251
					var3.overrideAmount = super.field1217; // L: 252
					var3.field2761 = (short)var4; // L: 253
				} else {
					var3.overrideAmount = 0; // L: 256
				}

				return var3; // L: 258
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "62243914"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) { // L: 146
			this.checkIsFriend(); // L: 147
		}

		return this.isFriendTriBool == TriBool.TriBool_true; // L: 149
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1446447522"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 153
	} // L: 154

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = ApproximateRouteStrategy.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 157
	} // L: 158

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "15"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) { // L: 161
			this.updateIsInFriendsChat(); // L: 162
		}

		return this.isInFriendsChat == TriBool.TriBool_true; // L: 164
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-28"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown; // L: 168
	} // L: 169

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "88"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = class406.friendsChatManager != null && class406.friendsChatManager.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 172
	} // L: 173

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "260673707"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) { // L: 176
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3200(this.username.getName()) != -1 && var1 != 2) { // L: 177 178
				this.isInClanChat = TriBool.TriBool_true; // L: 179
				return; // L: 180
			}
		}

		this.isInClanChat = TriBool.TriBool_false; // L: 184
	} // L: 185

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1545837402"
	)
	void method2290() {
		this.isInClanChat = TriBool.TriBool_unknown; // L: 188
	} // L: 189

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-124"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) { // L: 192
			this.updateIsInClanChat(); // L: 193
		}

		return this.isInClanChat == TriBool.TriBool_true; // L: 195
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-52698941"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? Bounds.getNpcDefinition(this.appearance.npcTransformId).size : 1; // L: 199 200 202
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IILie;I)V",
		garbageValue = "2094470882"
	)
	final void method2301(int var1, int var2, class216 var3) {
		if (super.sequence != -1 && WorldMapLabelSize.SequenceDefinition_get(super.sequence).field2274 == 1) { // L: 262
			super.sequence = -1;
		}

		this.method2375(); // L: 263
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) { // L: 264
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) { // L: 265
				if (var3 == class216.field2396) {
					PlayerComposition.method6009(this, var1, var2, class216.field2396); // L: 267
				}

				this.method2296(var1, var2, var3); // L: 268
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
		garbageValue = "1799040998"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0; // L: 273
		super.field1226 = 0; // L: 274
		super.field1225 = 0; // L: 275
		super.pathX[0] = var1; // L: 276
		super.pathY[0] = var2; // L: 277
		int var3 = this.transformedSize(); // L: 278
		super.x = super.pathX[0] * 128 + var3 * 64; // L: 279
		super.y = super.pathY[0] * 128 + var3 * 64; // L: 280
	} // L: 281

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IILie;I)V",
		garbageValue = "-1805329488"
	)
	final void method2296(int var1, int var2, class216 var3) {
		if (super.pathLength < 9) { // L: 284
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) { // L: 285
			super.pathX[var4] = super.pathX[var4 - 1]; // L: 286
			super.pathY[var4] = super.pathY[var4 - 1]; // L: 287
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1]; // L: 288
		}

		super.pathX[0] = var1; // L: 290
		super.pathY[0] = var2; // L: 291
		super.pathTraversed[0] = var3; // L: 292
	} // L: 293

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "11"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null; // L: 296
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1085648107"
	)
	static void method2340() {
		Client.menuOptionsCount = 0; // L: 9097
		Client.isMenuOpen = false; // L: 9098
	} // L: 9099

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1840896945"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		PendingSpawn.method2353(); // L: 12540
		if (class406.friendsChatManager != null) { // L: 12541
			class406.friendsChatManager.invalidateIgnoreds(); // L: 12542
		}

	} // L: 12544
}
