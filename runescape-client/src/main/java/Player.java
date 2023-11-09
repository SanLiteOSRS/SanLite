import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("df")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -2104548197
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1375534921
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("aj")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -999165743
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1966682193
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -566952483
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 203922471
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -580118693
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 183976771
	)
	int field1122;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1127549267
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1117420991
	)
	int field1119;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ljo;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -935852549
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 754181055
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1714870655
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -979015665
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("ao")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1817208461
	)
	@Export("team")
	int team;
	@ObfuscatedName("ak")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1468828985
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1280098939
	)
	@Export("index")
	int index;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("bn")
	boolean field1118;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1555341635
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -702438017
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
		this.field1118 = false; // L: 49
	} // L: 53

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
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
					var9 = class125.ItemComposition_get(var5[var6] - 512).team; // L: 77
					if (var9 != 0) { // L: 78
						this.team = var9;
					}
				}
			}
		}

		int[] var26 = null; // L: 81
		if (Client.field525 >= 213) { // L: 82
			var26 = new int[12]; // L: 83

			for (var7 = 0; var7 < 12; ++var7) { // L: 84
				var8 = var1.readUnsignedByte(); // L: 85
				if (var8 == 0) { // L: 86
					var26[var7] = 0; // L: 87
				} else {
					var9 = var1.readUnsignedByte(); // L: 90
					var26[var7] = var9 + (var8 << 8); // L: 91
				}
			}
		}

		int[] var27 = new int[5]; // L: 94

		for (var8 = 0; var8 < 5; ++var8) { // L: 95
			var9 = var1.readUnsignedByte(); // L: 96
			if (var9 < 0 || var9 >= ClanChannel.field1776[var8].length) { // L: 97
				var9 = 0;
			}

			var27[var8] = var9; // L: 98
		}

		super.idleSequence = var1.readUnsignedShort(); // L: 100
		if (super.idleSequence == 65535) { // L: 101
			super.idleSequence = -1;
		}

		super.field1237 = var1.readUnsignedShort(); // L: 102
		if (super.field1237 == 65535) { // L: 103
			super.field1237 = -1;
		}

		super.field1190 = super.field1237; // L: 104
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), class457.loginType); // L: 115
		this.clearIsFriend(); // L: 116
		this.method2325(); // L: 117
		this.method2345(); // L: 118
		if (this == class136.localPlayer) { // L: 119
			RunException.field5234 = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte(); // L: 120
		this.skillLevel = var1.readUnsignedShort(); // L: 121
		this.isHidden = var1.readUnsignedByte() == 1; // L: 122
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) { // L: 123
			this.isHidden = false;
		}

		class183[] var28 = null; // L: 124
		boolean var30 = false; // L: 125
		int var10 = var1.readUnsignedShort(); // L: 126
		var30 = (var10 >> 15 & 1) == 1; // L: 127
		int var11;
		if (var10 > 0 && var10 != 32768) { // L: 128
			var28 = new class183[12]; // L: 129

			for (var11 = 0; var11 < 12; ++var11) { // L: 130
				int var12 = var10 >> 12 - var11 & 1; // L: 131
				if (var12 == 1) { // L: 132
					int var16 = var5[var11] - 512; // L: 136
					int var17 = var1.readUnsignedByte(); // L: 138
					boolean var18 = (var17 & 1) != 0; // L: 139
					boolean var19 = (var17 & 2) != 0; // L: 140
					class183 var20 = new class183(var16); // L: 141
					int var21;
					int[] var22;
					boolean var23;
					int var24;
					short var25;
					if (var18) { // L: 142
						var21 = var1.readUnsignedByte(); // L: 143
						var22 = new int[]{var21 & 15, var21 >> 4 & 15}; // L: 144 145 146
						var23 = var20.field1888 != null && var22.length == var20.field1888.length; // L: 147

						for (var24 = 0; var24 < 2; ++var24) { // L: 148
							if (var22[var24] != 15) { // L: 149
								var25 = (short)var1.readUnsignedShort(); // L: 150
								if (var23) { // L: 151
									var20.field1888[var22[var24]] = var25; // L: 152
								}
							}
						}
					}

					if (var19) { // L: 157
						var21 = var1.readUnsignedByte(); // L: 158
						var22 = new int[]{var21 & 15, var21 >> 4 & 15}; // L: 159 160 161
						var23 = var20.field1891 != null && var22.length == var20.field1891.length; // L: 162

						for (var24 = 0; var24 < 2; ++var24) { // L: 163
							if (var22[var24] != 15) { // L: 164
								var25 = (short)var1.readUnsignedShort(); // L: 165
								if (var23) { // L: 166
									var20.field1891[var22[var24]] = var25; // L: 167
								}
							}
						}
					}

					var28[var11] = var20; // L: 174
				}
			}
		}

		for (var11 = 0; var11 < 3; ++var11) { // L: 178
			this.actions[var11] = var1.readStringCp1252NullTerminated(); // L: 179
		}

		int var29 = var1.readUnsignedByte(); // L: 181
		if (this.appearance == null) { // L: 182
			this.appearance = new PlayerComposition();
		}

		this.appearance.method6118(var26, var5, var28, var30, var27, var2, var4, var29); // L: 183
	} // L: 184

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljo;",
		garbageValue = "-983173466"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) { // L: 247
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class135.SequenceDefinition_get(super.sequence) : null; // L: 248
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.idleSequence == super.movementSequence && var1 != null ? null : class135.SequenceDefinition_get(super.movementSequence); // L: 249
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 250
			if (var3 == null) { // L: 251
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 252
				super.defaultHeight = var3.height; // L: 253
				int var4 = var3.indicesCount; // L: 254
				if (!this.isUnanimated) { // L: 255
					var3 = this.method2391(var3); // L: 256
				}

				if (!this.isUnanimated && this.model0 != null) { // L: 258
					if (Client.cycle >= this.animationCycleEnd) { // L: 259
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) { // L: 260
						Model var5 = this.model0; // L: 261
						var5.offsetBy(this.field1122 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1119 * 4096 - super.y); // L: 262
						if (super.orientation == 512) { // L: 263
							var5.rotateY90Ccw(); // L: 264
							var5.rotateY90Ccw(); // L: 265
							var5.rotateY90Ccw(); // L: 266
						} else if (super.orientation == 1024) { // L: 268
							var5.rotateY90Ccw(); // L: 269
							var5.rotateY90Ccw(); // L: 270
						} else if (super.orientation == 1536) { // L: 272
							var5.rotateY90Ccw();
						}

						Model[] var6 = new Model[]{var3, var5}; // L: 273
						var3 = new Model(var6, 2); // L: 274
						if (super.orientation == 512) { // L: 275
							var5.rotateY90Ccw();
						} else if (super.orientation == 1024) { // L: 276
							var5.rotateY90Ccw(); // L: 277
							var5.rotateY90Ccw(); // L: 278
						} else if (super.orientation == 1536) { // L: 280
							var5.rotateY90Ccw(); // L: 281
							var5.rotateY90Ccw(); // L: 282
							var5.rotateY90Ccw(); // L: 283
						}

						var5.offsetBy(super.x - this.field1122 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1119 * 4096); // L: 285
					}
				}

				var3.isSingleTile = true; // L: 288
				if (super.field1248 != 0 && Client.cycle >= super.field1183 && Client.cycle < super.field1244) { // L: 289
					var3.overrideHue = super.field1245; // L: 290
					var3.overrideSaturation = super.field1238; // L: 291
					var3.overrideLuminance = super.field1247; // L: 292
					var3.overrideAmount = super.field1248; // L: 293
					var3.field2684 = (short)var4; // L: 294
				} else {
					var3.overrideAmount = 0; // L: 297
				}

				return var3; // L: 299
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-21914"
	)
	boolean method2319() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) { // L: 187
			this.checkIsFriend(); // L: 188
		}

		return this.isFriendTriBool == TriBool.TriBool_true; // L: 190
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-96"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 194
	} // L: 195

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-37"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = class177.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 198
	} // L: 199

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-57"
	)
	boolean method2330() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) { // L: 202
			this.updateIsInFriendsChat(); // L: 203
		}

		return this.isInFriendsChat == TriBool.TriBool_true; // L: 205
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1960093479"
	)
	void method2325() {
		this.isInFriendsChat = TriBool.TriBool_unknown; // L: 209
	} // L: 210

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-90872532"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = Canvas.friendsChatManager != null && Canvas.friendsChatManager.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 213
	} // L: 214

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2049718150"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) { // L: 217
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3241(this.username.getName()) != -1 && var1 != 2) { // L: 218 219
				this.isInClanChat = TriBool.TriBool_true; // L: 220
				return; // L: 221
			}
		}

		this.isInClanChat = TriBool.TriBool_false; // L: 225
	} // L: 226

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-973154491"
	)
	void method2345() {
		this.isInClanChat = TriBool.TriBool_unknown; // L: 229
	} // L: 230

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1722956510"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) { // L: 233
			this.updateIsInClanChat(); // L: 234
		}

		return this.isInClanChat == TriBool.TriBool_true; // L: 236
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1861536704"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? Tile.getNpcDefinition(this.appearance.npcTransformId).size : 1; // L: 240 241 243
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IILio;I)V",
		garbageValue = "-1313304376"
	)
	final void method2326(int var1, int var2, class218 var3) {
		if (super.sequence != -1 && class135.SequenceDefinition_get(super.sequence).field2284 == 1) { // L: 303
			super.sequence = -1;
		}

		this.method2392(); // L: 304
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) { // L: 305
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) { // L: 306
				if (var3 == class218.field2377) {
					World.method1860(this, var1, var2, class218.field2377); // L: 308
				}

				this.method2332(var1, var2, var3); // L: 309
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	} // L: 311

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "110"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0; // L: 314
		super.field1257 = 0; // L: 315
		super.field1256 = 0; // L: 316
		super.pathX[0] = var1; // L: 317
		super.pathY[0] = var2; // L: 318
		int var3 = this.transformedSize(); // L: 319
		super.x = var3 * 64 + super.pathX[0] * 128; // L: 320
		super.y = super.pathY[0] * 128 + var3 * 64; // L: 321
	} // L: 322

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IILio;I)V",
		garbageValue = "2146337033"
	)
	final void method2332(int var1, int var2, class218 var3) {
		if (super.pathLength < 9) { // L: 325
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) { // L: 326
			super.pathX[var4] = super.pathX[var4 - 1]; // L: 327
			super.pathY[var4] = super.pathY[var4 - 1]; // L: 328
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1]; // L: 329
		}

		super.pathX[0] = var1; // L: 331
		super.pathY[0] = var2; // L: 332
		super.pathTraversed[0] = var3; // L: 333
	} // L: 334

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null; // L: 337
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "2090788951"
	)
	static int method2365(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class36.scriptDotWidget : class351.field3896; // L: 1520
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) { // L: 1521
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId; // L: 1522
			return 1; // L: 1523
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) { // L: 1525
			if (var3.itemId != -1) { // L: 1526
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1527
			}

			return 1; // L: 1528
		} else if (var0 == ScriptOpcodes.CC_GETID) { // L: 1530
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.childIndex; // L: 1531
			return 1; // L: 1532
		} else if (var0 == 1707) { // L: 1534
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method6459() ? 1 : 0; // L: 1535
			return 1; // L: 1536
		} else if (var0 == 1708) { // L: 1538
			return class74.method2089(var3); // L: 1539
		} else {
			return var0 == 1709 ? class133.method3040(var3) : 2; // L: 1541 1542 1544
		}
	}
}
