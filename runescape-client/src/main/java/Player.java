import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dj")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 705058777
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -655208045
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("ah")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 717357905
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1475633805
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1230774301
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1211807355
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1205139423
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1265071943
	)
	int field1128;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 427522145
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1144913977
	)
	int field1120;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 792641499
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1281314063
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1291269797
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1864918055
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("aw")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2081171671
	)
	@Export("team")
	int team;
	@ObfuscatedName("az")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 76401299
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1863872583
	)
	@Export("index")
	int index;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("by")
	boolean field1124;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1065834017
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -435330525
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;B)V",
		garbageValue = "16"
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
					var9 = class214.ItemComposition_get(var5[var6] - 512).team; // L: 77
					if (var9 != 0) { // L: 78
						this.team = var9;
					}
				}
			}
		}

		int[] var26 = null; // L: 81
		if (Client.field527 >= 213) { // L: 82
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
			if (var9 < 0 || var9 >= class104.field1342[var8].length) { // L: 97
				var9 = 0;
			}

			var27[var8] = var9; // L: 98
		}

		super.idleSequence = var1.readUnsignedShort(); // L: 100
		if (super.idleSequence == 65535) { // L: 101
			super.idleSequence = -1;
		}

		super.field1192 = var1.readUnsignedShort(); // L: 102
		if (super.field1192 == 65535) { // L: 103
			super.field1192 = -1;
		}

		super.field1193 = super.field1192; // L: 104
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), class166.loginType); // L: 115
		this.clearIsFriend(); // L: 116
		this.clearIsInFriendsChat(); // L: 117
		this.method2396(); // L: 118
		if (this == TextureProvider.localPlayer) { // L: 119
			RunException.field5296 = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte(); // L: 120
		this.skillLevel = var1.readUnsignedShort(); // L: 121
		this.isHidden = var1.readUnsignedByte() == 1; // L: 122
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) { // L: 123
			this.isHidden = false;
		}

		class185[] var28 = null; // L: 124
		boolean var30 = false; // L: 125
		int var10 = var1.readUnsignedShort(); // L: 126
		var30 = (var10 >> 15 & 1) == 1; // L: 127
		int var11;
		if (var10 > 0 && var10 != 32768) { // L: 128
			var28 = new class185[12]; // L: 129

			for (var11 = 0; var11 < 12; ++var11) { // L: 130
				int var12 = var10 >> 12 - var11 & 1; // L: 131
				if (var12 == 1) { // L: 132
					int var16 = var5[var11] - 512; // L: 136
					int var17 = var1.readUnsignedByte(); // L: 138
					boolean var18 = (var17 & 1) != 0; // L: 139
					boolean var19 = (var17 & 2) != 0; // L: 140
					class185 var20 = new class185(var16); // L: 141
					int var21;
					int[] var22;
					boolean var23;
					int var24;
					short var25;
					if (var18) { // L: 142
						var21 = var1.readUnsignedByte(); // L: 143
						var22 = new int[]{var21 & 15, var21 >> 4 & 15}; // L: 144 145 146
						var23 = var20.field1894 != null && var22.length == var20.field1894.length; // L: 147

						for (var24 = 0; var24 < 2; ++var24) { // L: 148
							if (var22[var24] != 15) { // L: 149
								var25 = (short)var1.readUnsignedShort(); // L: 150
								if (var23) { // L: 151
									var20.field1894[var22[var24]] = var25; // L: 152
								}
							}
						}
					}

					if (var19) { // L: 157
						var21 = var1.readUnsignedByte(); // L: 158
						var22 = new int[]{var21 & 15, var21 >> 4 & 15}; // L: 159 160 161
						var23 = var20.field1893 != null && var22.length == var20.field1893.length; // L: 162

						for (var24 = 0; var24 < 2; ++var24) { // L: 163
							if (var22[var24] != 15) { // L: 164
								var25 = (short)var1.readUnsignedShort(); // L: 165
								if (var23) { // L: 166
									var20.field1893[var22[var24]] = var25; // L: 167
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

		this.appearance.method6266(var26, var5, var28, var30, var27, var2, var4, var29); // L: 183
	} // L: 184

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Ljn;",
		garbageValue = "0"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) { // L: 247
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class36.SequenceDefinition_get(super.sequence) : null; // L: 248
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.idleSequence == super.movementSequence && var1 != null ? null : class36.SequenceDefinition_get(super.movementSequence); // L: 249
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 250
			if (var3 == null) { // L: 251
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 252
				super.defaultHeight = var3.height; // L: 253
				int var4 = var3.indicesCount; // L: 254
				if (!this.isUnanimated) { // L: 255
					var3 = this.method2448(var3); // L: 256
				}

				if (!this.isUnanimated && this.model0 != null) { // L: 258
					if (Client.cycle >= this.animationCycleEnd) { // L: 259
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) { // L: 260
						Model var5 = this.model0; // L: 261
						var5.offsetBy(this.field1128 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1120 * 4096 - super.y); // L: 262
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

						var5.offsetBy(super.x - this.field1128 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1120 * 4096); // L: 285
					}
				}

				var3.isSingleTile = true; // L: 288
				if (super.field1252 != 0 && Client.cycle >= super.field1247 && Client.cycle < super.field1248) { // L: 289
					var3.overrideHue = super.field1249; // L: 290
					var3.overrideSaturation = super.field1250; // L: 291
					var3.overrideLuminance = super.field1251; // L: 292
					var3.overrideAmount = super.field1252; // L: 293
					var3.field2801 = (short)var4; // L: 294
				} else {
					var3.overrideAmount = 0; // L: 297
				}

				return var3; // L: 299
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1468374152"
	)
	boolean method2363() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) { // L: 187
			this.checkIsFriend(); // L: 188
		}

		return this.isFriendTriBool == TriBool.TriBool_true; // L: 190
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-7"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 194
	} // L: 195

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-16283"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = InvDefinition.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 198
	} // L: 199

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	boolean method2366() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) { // L: 202
			this.updateIsInFriendsChat(); // L: 203
		}

		return this.isInFriendsChat == TriBool.TriBool_true; // L: 205
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "58"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown; // L: 209
	} // L: 210

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "180"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = class358.friendsChatManager != null && class358.friendsChatManager.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 213
	} // L: 214

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1325607421"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) { // L: 217
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3235(this.username.getName()) != -1 && var1 != 2) { // L: 218 219
				this.isInClanChat = TriBool.TriBool_true; // L: 220
				return; // L: 221
			}
		}

		this.isInClanChat = TriBool.TriBool_false; // L: 225
	} // L: 226

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "62"
	)
	void method2396() {
		this.isInClanChat = TriBool.TriBool_unknown; // L: 229
	} // L: 230

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "28"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) { // L: 233
			this.updateIsInClanChat(); // L: 234
		}

		return this.isInClanChat == TriBool.TriBool_true; // L: 236
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-149597751"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? class190.getNpcDefinition(this.appearance.npcTransformId).size : 1; // L: 240 241 243
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IILip;I)V",
		garbageValue = "877591570"
	)
	final void method2374(int var1, int var2, class231 var3) {
		if (super.sequence != -1 && class36.SequenceDefinition_get(super.sequence).field2339 == 1) { // L: 303
			super.sequence = -1;
		}

		this.method2430(); // L: 304
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) { // L: 305
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) { // L: 306
				if (var3 == class231.field2427) {
					class180.method3559(this, var1, var2, class231.field2427); // L: 308
				}

				this.method2376(var1, var2, var3); // L: 309
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	} // L: 311

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-57"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0; // L: 314
		super.field1261 = 0; // L: 315
		super.field1233 = 0; // L: 316
		super.pathX[0] = var1; // L: 317
		super.pathY[0] = var2; // L: 318
		int var3 = this.transformedSize(); // L: 319
		super.x = super.pathX[0] * 128 + var3 * 64; // L: 320
		super.y = super.pathY[0] * 128 + var3 * 64; // L: 321
	} // L: 322

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IILip;B)V",
		garbageValue = "-120"
	)
	final void method2376(int var1, int var2, class231 var3) {
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "4"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null; // L: 337
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1479868908"
	)
	static int method2411(int var0, int var1, int var2) {
		return var0 << 28 | var1 << 14 | var2; // L: 34
	}
}
