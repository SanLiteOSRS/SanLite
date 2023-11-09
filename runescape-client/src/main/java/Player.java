import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lrp;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 350410091
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1022197567
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("q")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1148721401
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1210481355
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1958672175
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 2102416537
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1311880171
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 521941447
	)
	int field1131;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1198433051
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1577608411
	)
	int field1137;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 153078199
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -377360991
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 863829929
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -396339561
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("t")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -416492285
	)
	@Export("team")
	int team;
	@ObfuscatedName("p")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 942287759
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -205134613
	)
	@Export("index")
	int index;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("ad")
	boolean field1133;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -749429563
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1775689415
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
		this.isHidden = false;
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 47
		this.isInFriendsChat = TriBool.TriBool_unknown; // L: 48
		this.isInClanChat = TriBool.TriBool_unknown; // L: 49
		this.field1133 = false; // L: 50
	} // L: 54

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqy;B)V",
		garbageValue = "-126"
	)
	@Export("read")
	final void read(Buffer var1) {
		var1.offset = 0; // L: 57
		int var2 = var1.readUnsignedByte(); // L: 58
		int var3 = -1; // L: 59
		this.headIconPk = var1.readByte(); // L: 60
		this.headIconPrayer = var1.readByte(); // L: 61
		int var4 = -1;
		this.team = 0;
		int[] var5 = new int[12];

		int var7;
		int var8;
		int var9;
		for (int var6 = 0; var6 < 12; ++var6) {
			var7 = var1.readUnsignedByte(); // L: 66
			if (var7 == 0) {
				var5[var6] = 0;
			} else {
				var8 = var1.readUnsignedByte();
				var5[var6] = var8 + (var7 << 8);
				if (var6 == 0 && var5[0] == 65535) {
					var4 = var1.readUnsignedShort(); // L: 74
					break;
				}

				if (var5[var6] >= 512) {
					var9 = NPCComposition.ItemComposition_get(var5[var6] - 512).team; // L: 78
					if (var9 != 0) {
						this.team = var9;
					}
				}
			}
		}

		int[] var25 = new int[5]; // L: 82

		for (var7 = 0; var7 < 5; ++var7) {
			var8 = var1.readUnsignedByte(); // L: 84
			if (var8 < 0 || var8 >= TriBool.field4548[var7].length) { // L: 85
				var8 = 0;
			}

			var25[var7] = var8; // L: 86
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), SecureRandomFuture.loginType); // L: 103
		this.clearIsFriend(); // L: 104
		this.clearIsInFriendsChat(); // L: 105
		this.method2294(); // L: 106
		if (this == class155.localPlayer) { // L: 107
			RunException.localPlayerName = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte(); // L: 108
		this.skillLevel = var1.readUnsignedShort(); // L: 109
		this.isHidden = var1.readUnsignedByte() == 1; // L: 110
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) { // L: 111
			this.isHidden = false;
		}

		class175[] var26 = null; // L: 112
		boolean var27 = false; // L: 113
		var9 = var1.readUnsignedShort(); // L: 114
		var27 = (var9 >> 15 & 1) == 1; // L: 115
		int var10;
		if (var9 > 0 && var9 != 32768) { // L: 116
			var26 = new class175[12]; // L: 117

			for (var10 = 0; var10 < 12; ++var10) { // L: 118
				int var11 = var9 >> 12 - var10 & 1; // L: 119
				if (var11 == 1) { // L: 120
					int var15 = var5[var10] - 512; // L: 124
					int var16 = var1.readUnsignedByte(); // L: 126
					boolean var17 = (var16 & 1) != 0; // L: 127
					boolean var18 = (var16 & 2) != 0; // L: 128
					class175 var19 = new class175(var15); // L: 129
					int var20;
					int[] var21;
					boolean var22;
					int var23;
					short var24;
					if (var17) { // L: 130
						var20 = var1.readUnsignedByte(); // L: 131
						var21 = new int[]{var20 & 15, var20 >> 4 & 15}; // L: 132 133 134
						var22 = var19.field1913 != null && var21.length == var19.field1913.length; // L: 135

						for (var23 = 0; var23 < 2; ++var23) { // L: 136
							if (var21[var23] != 15) { // L: 137
								var24 = (short)var1.readUnsignedShort(); // L: 138
								if (var22) { // L: 139
									var19.field1913[var21[var23]] = var24; // L: 140
								}
							}
						}
					}

					if (var18) { // L: 145
						var20 = var1.readUnsignedByte(); // L: 146
						var21 = new int[]{var20 & 15, var20 >> 4 & 15}; // L: 147 148 149
						var22 = var19.field1914 != null && var21.length == var19.field1914.length; // L: 150

						for (var23 = 0; var23 < 2; ++var23) { // L: 151
							if (var21[var23] != 15) { // L: 152
								var24 = (short)var1.readUnsignedShort(); // L: 153
								if (var22) { // L: 154
									var19.field1914[var21[var23]] = var24; // L: 155
								}
							}
						}
					}

					var26[var10] = var19; // L: 162
				}
			}
		}

		for (var10 = 0; var10 < 3; ++var10) { // L: 166
			this.actions[var10] = var1.readStringCp1252NullTerminated(); // L: 167
		}

		if (Client.field515 > 208) { // L: 169
			var3 = var1.readUnsignedByte(); // L: 170
		}

		if (this.appearance == null) { // L: 172
			this.appearance = new PlayerComposition();
		}

		this.appearance.method5867(var5, var26, var27, var25, var2, var4, var3); // L: 173
	} // L: 174

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Lhh;",
		garbageValue = "-1279733976"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) { // L: 237
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class216.SequenceDefinition_get(super.sequence) : null; // L: 238
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.idleSequence == super.movementSequence && var1 != null ? null : class216.SequenceDefinition_get(super.movementSequence); // L: 239
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 240
			if (var3 == null) { // L: 241
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 242
				super.defaultHeight = var3.height; // L: 243
				int var4 = var3.indicesCount; // L: 244
				Model var5;
				Model[] var6;
				if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 245
					var5 = ClanSettings.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 246
					if (var5 != null) { // L: 247
						var5.offsetBy(0, -super.spotAnimationHeight, 0); // L: 248
						var6 = new Model[]{var3, var5}; // L: 249
						var3 = new Model(var6, 2); // L: 250
					}
				}

				if (!this.isUnanimated && this.model0 != null) { // L: 253
					if (Client.cycle >= this.animationCycleEnd) { // L: 254
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) { // L: 255
						var5 = this.model0; // L: 256
						var5.offsetBy(this.field1131 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1137 * 4096 - super.y); // L: 257
						if (super.orientation == 512) { // L: 258
							var5.rotateY90Ccw(); // L: 259
							var5.rotateY90Ccw(); // L: 260
							var5.rotateY90Ccw(); // L: 261
						} else if (super.orientation == 1024) { // L: 263
							var5.rotateY90Ccw(); // L: 264
							var5.rotateY90Ccw(); // L: 265
						} else if (super.orientation == 1536) { // L: 267
							var5.rotateY90Ccw();
						}

						var6 = new Model[]{var3, var5}; // L: 268
						var3 = new Model(var6, 2); // L: 269
						if (super.orientation == 512) { // L: 270
							var5.rotateY90Ccw();
						} else if (super.orientation == 1024) { // L: 271
							var5.rotateY90Ccw(); // L: 272
							var5.rotateY90Ccw(); // L: 273
						} else if (super.orientation == 1536) { // L: 275
							var5.rotateY90Ccw(); // L: 276
							var5.rotateY90Ccw(); // L: 277
							var5.rotateY90Ccw(); // L: 278
						}

						var5.offsetBy(super.x - this.field1131 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1137 * 4096); // L: 280
					}
				}

				var3.isSingleTile = true; // L: 283
				if (super.field1243 != 0 && Client.cycle >= super.field1238 && Client.cycle < super.field1200) { // L: 284
					var3.overrideHue = super.field1240; // L: 285
					var3.overrideSaturation = super.field1220; // L: 286
					var3.overrideLuminance = super.field1232; // L: 287
					var3.overrideAmount = super.field1243; // L: 288
					var3.field2741 = (short)var4; // L: 289
				} else {
					var3.overrideAmount = 0; // L: 292
				}

				return var3; // L: 294
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1926444781"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) { // L: 177
			this.checkIsFriend(); // L: 178
		}

		return this.isFriendTriBool == TriBool.TriBool_true; // L: 180
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2039939693"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 184
	} // L: 185

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1595665678"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = DefaultsGroup.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 188
	} // L: 189

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2081819034"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) { // L: 192
			this.updateIsInFriendsChat(); // L: 193
		}

		return this.isInFriendsChat == TriBool.TriBool_true; // L: 195
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-569605526"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown; // L: 199
	} // L: 200

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-347308341"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = class281.friendsChatManager != null && class281.friendsChatManager.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 203
	} // L: 204

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1510805877"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) { // L: 207
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3164(this.username.getName()) != -1 && var1 != 2) { // L: 208 209
				this.isInClanChat = TriBool.TriBool_true; // L: 210
				return; // L: 211
			}
		}

		this.isInClanChat = TriBool.TriBool_false; // L: 215
	} // L: 216

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	void method2294() {
		this.isInClanChat = TriBool.TriBool_unknown; // L: 219
	} // L: 220

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1874201876"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) { // L: 223
			this.updateIsInClanChat(); // L: 224
		}

		return this.isInClanChat == TriBool.TriBool_true; // L: 226
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-97"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? class129.getNpcDefinition(this.appearance.npcTransformId).size : 1; // L: 230 231 233
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IILgs;B)V",
		garbageValue = "72"
	)
	final void method2298(int var1, int var2, class204 var3) {
		if (super.sequence != -1 && class216.SequenceDefinition_get(super.sequence).field2284 == 1) { // L: 298
			super.sequence = -1;
		}

		super.field1190 = -1; // L: 299
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) { // L: 300
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) { // L: 301
				if (var3 == class204.field2357) { // L: 303
					Player var4 = this; // L: 304
					class204 var5 = class204.field2357; // L: 305
					int var6 = super.pathX[0]; // L: 307
					int var7 = super.pathY[0]; // L: 308
					int var8 = this.transformedSize(); // L: 309
					if (var6 >= var8 && var6 < 104 - var8 && var7 >= var8 && var7 < 104 - var8 && var1 >= var8 && var1 < 104 - var8 && var2 >= var8 && var2 < 104 - var8) { // L: 310 311
						int var9 = Clock.method3520(var6, var7, this.transformedSize(), GroundObject.method4298(var1, var2), Client.collisionMaps[this.plane], true, Client.field806, Client.field785); // L: 312
						if (var9 >= 1) { // L: 313
							for (int var10 = 0; var10 < var9 - 1; ++var10) { // L: 314
								var4.method2300(Client.field806[var10], Client.field785[var10], var5);
							}
						}
					}
				}

				this.method2300(var1, var2, var3); // L: 317
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	} // L: 319

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "1"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0; // L: 322
		super.field1252 = 0; // L: 323
		super.field1239 = 0; // L: 324
		super.pathX[0] = var1; // L: 325
		super.pathY[0] = var2; // L: 326
		int var3 = this.transformedSize(); // L: 327
		super.x = var3 * 64 + super.pathX[0] * 128; // L: 328
		super.y = var3 * 64 + super.pathY[0] * 128; // L: 329
	} // L: 330

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IILgs;I)V",
		garbageValue = "-1656318959"
	)
	final void method2300(int var1, int var2, class204 var3) {
		if (super.pathLength < 9) { // L: 333
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) { // L: 334
			super.pathX[var4] = super.pathX[var4 - 1]; // L: 335
			super.pathY[var4] = super.pathY[var4 - 1]; // L: 336
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1]; // L: 337
		}

		super.pathX[0] = var1; // L: 339
		super.pathY[0] = var2; // L: 340
		super.pathTraversed[0] = var3; // L: 341
	} // L: 342

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-200769249"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null; // L: 345
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1940154294"
	)
	public static void method2333(int var0) {
		MouseHandler.MouseHandler_idleCycles = var0; // L: 44
	} // L: 45

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "127"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0; // L: 62
		if (var0 < 0 || var0 >= 65536) { // L: 63
			var0 >>>= 16; // L: 64
			var1 += 16; // L: 65
		}

		if (var0 >= 256) { // L: 67
			var0 >>>= 8; // L: 68
			var1 += 8; // L: 69
		}

		if (var0 >= 16) { // L: 71
			var0 >>>= 4; // L: 72
			var1 += 4; // L: 73
		}

		if (var0 >= 4) { // L: 75
			var0 >>>= 2; // L: 76
			var1 += 2; // L: 77
		}

		if (var0 >= 1) { // L: 79
			var0 >>>= 1; // L: 80
			++var1; // L: 81
		}

		return var0 + var1; // L: 83
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "-113"
	)
	static void method2329(String var0, String var1, String var2) {
		class12.method155(7); // L: 1609
		TaskHandler.setLoginResponseString(var0, var1, var2); // L: 1610
	} // L: 1611

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZI)I",
		garbageValue = "1541200375"
	)
	static int method2334(int var0, Script var1, boolean var2) {
		if (var0 == 7108) { // L: 4906
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = FloorUnderlayDefinition.method3767() ? 1 : 0; // L: 4907
			return 1; // L: 4908
		} else {
			return 2; // L: 4910
		}
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2090346069"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close(); // L: 2684
		ModeWhere.method6699(); // L: 2685
		ReflectionCheck.scene.clear(); // L: 2686

		for (int var0 = 0; var0 < 4; ++var0) { // L: 2687
			Client.collisionMaps[var0].clear();
		}

		Client.field572.method4068(); // L: 2688
		System.gc(); // L: 2689
		class384.method7370(2); // L: 2690
		Client.currentTrackGroupId = -1; // L: 2691
		Client.playingJingle = false; // L: 2692
		UrlRequester.method2769(); // L: 2693
		class140.method3102(10); // L: 2694
	} // L: 2695

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(Lkd;IIZI)V",
		garbageValue = "-1694823923"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width; // L: 10934
		int var5 = var0.height; // L: 10935
		if (var0.widthAlignment == 0) { // L: 10936
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) { // L: 10937
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) { // L: 10938
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) { // L: 10939
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) { // L: 10940
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) { // L: 10941
			var0.height = var2 * var0.rawHeight >> 14;
		}

		if (var0.widthAlignment == 4) { // L: 10942
			var0.width = var0.height * var0.field3661 / var0.field3559;
		}

		if (var0.heightAlignment == 4) { // L: 10943
			var0.height = var0.field3559 * var0.width / var0.field3661;
		}

		if (var0.contentType == 1337) { // L: 10944
			Client.viewportWidget = var0;
		}

		if (var0.type == 12) { // L: 10945
			var0.method6167().method5885(var0.width, var0.height); // L: 10946
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) { // L: 10948
			ScriptEvent var6 = new ScriptEvent(); // L: 10949
			var6.widget = var0; // L: 10950
			var6.args = var0.onResize; // L: 10951
			Client.scriptEvents.addFirst(var6); // L: 10952
		}

	} // L: 10954

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "(Lkd;IIII)V",
		garbageValue = "1708267953"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		Client.playPcmPlayers(); // L: 12370
		SpriteMask var4 = var0.getSpriteMask(false); // L: 12371
		if (var4 != null) { // L: 12372
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height); // L: 12373
			if (Client.minimapState != 2 && Client.minimapState != 5) { // L: 12374
				int var5 = Client.camAngleY & 2047; // L: 12375
				int var6 = class155.localPlayer.x / 32 + 48; // L: 12376
				int var7 = 464 - class155.localPlayer.y / 32; // L: 12377
				GameObject.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths); // L: 12378

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) { // L: 12379
					var16 = Client.mapIconXs[var8] * 4 + 2 - class155.localPlayer.x / 32; // L: 12380
					var10 = Client.mapIconYs[var8] * 4 + 2 - class155.localPlayer.y / 32; // L: 12381
					class282.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4); // L: 12382
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) { // L: 12384
					for (var16 = 0; var16 < 104; ++var16) { // L: 12385
						NodeDeque var14 = Client.groundItems[class383.Client_plane][var8][var16]; // L: 12386
						if (var14 != null) { // L: 12387
							var11 = var8 * 4 + 2 - class155.localPlayer.x / 32; // L: 12388
							var12 = var16 * 4 + 2 - class155.localPlayer.y / 32; // L: 12389
							class282.drawSpriteOnMinimap(var1, var2, var11, var12, class281.mapDotSprites[0], var4); // L: 12390
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) { // L: 12394
					NPC var9 = Client.npcs[Client.npcIndices[var8]]; // L: 12395
					if (var9 != null && var9.isVisible()) { // L: 12396
						NPCComposition var18 = var9.definition; // L: 12397
						if (var18 != null && var18.transforms != null) { // L: 12398
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) { // L: 12399
							var11 = var9.x / 32 - class155.localPlayer.x / 32; // L: 12400
							var12 = var9.y / 32 - class155.localPlayer.y / 32; // L: 12401
							class282.drawSpriteOnMinimap(var1, var2, var11, var12, class281.mapDotSprites[1], var4); // L: 12402
						}
					}
				}

				var8 = Players.Players_count; // L: 12406
				int[] var17 = Players.Players_indices; // L: 12407

				for (var10 = 0; var10 < var8; ++var10) { // L: 12408
					Player var15 = Client.players[var17[var10]]; // L: 12409
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != class155.localPlayer) { // L: 12410
						var12 = var15.x / 32 - class155.localPlayer.x / 32; // L: 12411
						int var13 = var15.y / 32 - class155.localPlayer.y / 32; // L: 12412
						if (var15.isFriend()) { // L: 12413
							class282.drawSpriteOnMinimap(var1, var2, var12, var13, class281.mapDotSprites[3], var4);
						} else if (class155.localPlayer.team != 0 && var15.team != 0 && var15.team == class155.localPlayer.team) { // L: 12414
							class282.drawSpriteOnMinimap(var1, var2, var12, var13, class281.mapDotSprites[4], var4);
						} else if (var15.isFriendsChatMember()) { // L: 12415
							class282.drawSpriteOnMinimap(var1, var2, var12, var13, class281.mapDotSprites[5], var4);
						} else if (var15.isClanMember()) { // L: 12416
							class282.drawSpriteOnMinimap(var1, var2, var12, var13, class281.mapDotSprites[6], var4);
						} else {
							class282.drawSpriteOnMinimap(var1, var2, var12, var13, class281.mapDotSprites[2], var4); // L: 12417
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) { // L: 12420
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) { // L: 12421
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex]; // L: 12422
						if (var19 != null) { // L: 12423
							var11 = var19.x / 32 - class155.localPlayer.x / 32; // L: 12424
							var12 = var19.y / 32 - class155.localPlayer.y / 32; // L: 12425
							GameEngine.worldToMinimap(var1, var2, var11, var12, class144.mapMarkerSprites[1], var4); // L: 12426
						}
					}

					if (Client.hintArrowType == 2) { // L: 12429
						var10 = Client.hintArrowX * 4 - class154.baseX * 256 + 2 - class155.localPlayer.x / 32; // L: 12430
						var11 = Client.hintArrowY * 4 - class365.baseY * 256 + 2 - class155.localPlayer.y / 32; // L: 12431
						GameEngine.worldToMinimap(var1, var2, var10, var11, class144.mapMarkerSprites[1], var4); // L: 12432
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) { // L: 12434
						Player var20 = Client.players[Client.hintArrowPlayerIndex]; // L: 12435
						if (var20 != null) { // L: 12436
							var11 = var20.x / 32 - class155.localPlayer.x / 32; // L: 12437
							var12 = var20.y / 32 - class155.localPlayer.y / 32; // L: 12438
							GameEngine.worldToMinimap(var1, var2, var11, var12, class144.mapMarkerSprites[1], var4); // L: 12439
						}
					}
				}

				if (Client.destinationX != 0) { // L: 12443
					var10 = Client.destinationX * 4 + 2 - class155.localPlayer.x / 32; // L: 12444
					var11 = Client.destinationY * 4 + 2 - class155.localPlayer.y / 32; // L: 12445
					class282.drawSpriteOnMinimap(var1, var2, var10, var11, class144.mapMarkerSprites[0], var4); // L: 12446
				}

				if (!class155.localPlayer.isHidden) { // L: 12448
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 12450
			}

			Client.field732[var3] = true; // L: 12451
		}
	} // L: 12452
}
