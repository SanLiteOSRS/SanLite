import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2040143941
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1934942031
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("al")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1994738117
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1931136561
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1002460807
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 243970777
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1718058527
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 776303887
	)
	int field1087;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1147981193
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -916641245
	)
	int field1100;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1352131617
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1642937285
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 2035530057
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 965885687
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("aq")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1627366923
	)
	@Export("team")
	int team;
	@ObfuscatedName("ak")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 50188651
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -478833079
	)
	@Export("index")
	int index;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("bq")
	boolean field1107;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1554787715
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1672989509
	)
	@Export("tileY")
	int tileY;

	Player() {
		this.headIconPk = -1;
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
		this.field1107 = false; // L: 49
	} // L: 53

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)V",
		garbageValue = "-4"
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
					var9 = class230.ItemComposition_get(var5[var6] - 512).team; // L: 77
					if (var9 != 0) { // L: 78
						this.team = var9;
					}
				}
			}
		}

		int[] var26 = null; // L: 81
		if (Client.field657 >= 213) { // L: 82
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
			if (var9 < 0 || var9 >= class130.field1531[var8].length) { // L: 97
				var9 = 0;
			}

			var27[var8] = var9; // L: 98
		}

		super.idleSequence = var1.readUnsignedShort(); // L: 100
		if (super.idleSequence == 65535) { // L: 101
			super.idleSequence = -1;
		}

		super.field1146 = var1.readUnsignedShort(); // L: 102
		if (super.field1146 == 65535) {
			super.field1146 = -1;
		}

		super.field1171 = super.field1146;
		super.walkSequence = var1.readUnsignedShort();
		if (super.walkSequence == 65535) {
			super.walkSequence = -1;
		}

		super.walkBackSequence = var1.readUnsignedShort();
		if (super.walkBackSequence == 65535) {
			super.walkBackSequence = -1;
		}

		super.walkLeftSequence = var1.readUnsignedShort();
		if (super.walkLeftSequence == 65535) { // L: 110
			super.walkLeftSequence = -1;
		}

		super.walkRightSequence = var1.readUnsignedShort();
		if (super.walkRightSequence == 65535) {
			super.walkRightSequence = -1;
		}

		super.runSequence = var1.readUnsignedShort();
		if (super.runSequence == 65535) {
			super.runSequence = -1;
		}

		this.username = new Username(var1.readStringCp1252NullTerminated(), class31.loginType);
		this.clearIsFriend();
		this.clearIsInFriendsChat();
		this.method2305(); // L: 118
		if (this == HitSplatDefinition.localPlayer) {
			class434.field4676 = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte();
		this.skillLevel = var1.readUnsignedShort();
		this.isHidden = var1.readUnsignedByte() == 1; // L: 122
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) {
			this.isHidden = false;
		}

		class183[] var28 = null;
		boolean var30 = false; // L: 125
		int var10 = var1.readUnsignedShort();
		var30 = (var10 >> 15 & 1) == 1; // L: 127
		int var11;
		if (var10 > 0 && var10 != 32768) { // L: 128
			var28 = new class183[12]; // L: 129

			for (var11 = 0; var11 < 12; ++var11) {
				int var12 = var10 >> 12 - var11 & 1;
				if (var12 == 1) { // L: 132
					int var16 = var5[var11] - 512;
					int var17 = var1.readUnsignedByte();
					boolean var18 = (var17 & 1) != 0;
					boolean var19 = (var17 & 2) != 0;
					class183 var20 = new class183(var16); // L: 141
					int var21;
					int[] var22;
					boolean var23;
					int var24;
					short var25;
					if (var18) {
						var21 = var1.readUnsignedByte(); // L: 143
						var22 = new int[]{var21 & 15, var21 >> 4 & 15}; // L: 144 145 146
						var23 = var20.field1898 != null && var22.length == var20.field1898.length; // L: 147

						for (var24 = 0; var24 < 2; ++var24) { // L: 148
							if (var22[var24] != 15) { // L: 149
								var25 = (short)var1.readUnsignedShort(); // L: 150
								if (var23) { // L: 151
									var20.field1898[var22[var24]] = var25; // L: 152
								}
							}
						}
					}

					if (var19) { // L: 157
						var21 = var1.readUnsignedByte(); // L: 158
						var22 = new int[]{var21 & 15, var21 >> 4 & 15}; // L: 159 160 161
						var23 = var20.field1902 != null && var22.length == var20.field1902.length; // L: 162

						for (var24 = 0; var24 < 2; ++var24) { // L: 163
							if (var22[var24] != 15) { // L: 164
								var25 = (short)var1.readUnsignedShort(); // L: 165
								if (var23) { // L: 166
									var20.field1902[var22[var24]] = var25; // L: 167
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

		this.appearance.method6131(var26, var5, var28, var30, var27, var2, var4, var29); // L: 183
	} // L: 184

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Ljh;",
		garbageValue = "4"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) { // L: 247
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class149.SequenceDefinition_get(super.sequence) : null; // L: 248
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.movementSequence == super.idleSequence && var1 != null ? null : class149.SequenceDefinition_get(super.movementSequence); // L: 249
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 250
			if (var3 == null) { // L: 251
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 252
				super.defaultHeight = var3.height; // L: 253
				int var4 = var3.indicesCount; // L: 254
				if (!this.isUnanimated) { // L: 255
					var3 = this.method2361(var3); // L: 256
				}

				if (!this.isUnanimated && this.model0 != null) { // L: 258
					if (Client.cycle >= this.animationCycleEnd) { // L: 259
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) { // L: 260
						Model var5 = this.model0; // L: 261
						var5.offsetBy(this.field1087 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1100 * 4096 - super.y); // L: 262
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

						var5.offsetBy(super.x - this.field1087 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1100 * 4096); // L: 285
					}
				}

				var3.isSingleTile = true; // L: 288
				if (super.field1205 != 0 && Client.cycle >= super.field1200 && Client.cycle < super.field1201) { // L: 289
					var3.overrideHue = super.field1175; // L: 290
					var3.overrideSaturation = super.field1203; // L: 291
					var3.overrideLuminance = super.field1153; // L: 292
					var3.overrideAmount = super.field1205; // L: 293
					var3.field2760 = (short)var4; // L: 294
				} else {
					var3.overrideAmount = 0; // L: 297
				}

				return var3; // L: 299
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-672258678"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) { // L: 187
			this.checkIsFriend(); // L: 188
		}

		return this.isFriendTriBool == TriBool.TriBool_true; // L: 190
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1172815213"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 194
	} // L: 195

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-70"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = ReflectionCheck.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 198
	} // L: 199

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1781833889"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) { // L: 202
			this.updateIsInFriendsChat(); // L: 203
		}

		return this.isInFriendsChat == TriBool.TriBool_true; // L: 205
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "868459190"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown; // L: 209
	} // L: 210

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1003214625"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = BZip2State.friendsChatManager != null && BZip2State.friendsChatManager.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 213
	} // L: 214

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1724114668"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) { // L: 217
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3230(this.username.getName()) != -1 && var1 != 2) { // L: 218 219
				this.isInClanChat = TriBool.TriBool_true; // L: 220
				return; // L: 221
			}
		}

		this.isInClanChat = TriBool.TriBool_false; // L: 225
	} // L: 226

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "109"
	)
	void method2305() {
		this.isInClanChat = TriBool.TriBool_unknown; // L: 229
	} // L: 230

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-81"
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
		garbageValue = "1999931921"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? class407.getNpcDefinition(this.appearance.npcTransformId).size : 1; // L: 240 241 243
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IILip;I)V",
		garbageValue = "-2105536774"
	)
	final void method2287(int var1, int var2, class216 var3) {
		if (super.sequence != -1 && class149.SequenceDefinition_get(super.sequence).field2291 == 1) { // L: 303
			super.sequence = -1;
		}

		this.method2380(); // L: 304
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) { // L: 305
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) { // L: 306
				if (var3 == class216.field2384) {
					class1.method5(this, var1, var2, class216.field2384); // L: 308
				}

				this.method2289(var1, var2, var3); // L: 309
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
		garbageValue = "85"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0; // L: 314
		super.field1214 = 0; // L: 315
		super.field1213 = 0; // L: 316
		super.pathX[0] = var1; // L: 317
		super.pathY[0] = var2; // L: 318
		int var3 = this.transformedSize(); // L: 319
		super.x = super.pathX[0] * 128 + var3 * 64; // L: 320
		super.y = super.pathY[0] * 128 + var3 * 64; // L: 321
	} // L: 322

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IILip;B)V",
		garbageValue = "111"
	)
	final void method2289(int var1, int var2, class216 var3) {
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-964531656"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null; // L: 337
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-18"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17; // L: 19
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "128"
	)
	public static void method2318() {
		try {
			int var0;
			if (class304.musicPlayerStatus == 1) { // L: 103
				var0 = class304.midiPcmStream.method5892(); // L: 104
				if (var0 > 0 && class304.midiPcmStream.isReady()) { // L: 105
					var0 -= class128.pcmSampleLength; // L: 106
					if (var0 < 0) { // L: 107
						var0 = 0;
					}

					class304.midiPcmStream.setPcmStreamVolume(var0); // L: 108
					return; // L: 109
				}

				class304.midiPcmStream.clear(); // L: 111
				class304.midiPcmStream.removeAll(); // L: 112
				class304.midiPcmStream.field3422.clear(); // L: 113
				if (HealthBar.musicTrackArchive != null) { // L: 114
					class304.musicPlayerStatus = 2;
				} else {
					class304.musicPlayerStatus = 0; // L: 115
				}

				HealthBarUpdate.musicTrack = null; // L: 116
				UserComparator4.soundCache = null; // L: 117
			}

			if (class304.field3391 > -1 && !class304.midiPcmStream.isReady()) { // L: 119
				var0 = class304.field3391; // L: 120
				int var1 = class304.field3394; // L: 121
				Iterator var2 = class304.field3393.iterator(); // L: 123

				while (var2.hasNext()) {
					class312 var3 = (class312)var2.next(); // L: 124
					var3.vmethod6013(var0, var1); // L: 126
				}

				class304.field3391 = -1; // L: 130
				class304.field3394 = -1; // L: 131
			}
		} catch (Exception var5) { // L: 134
			var5.printStackTrace(); // L: 135
			class304.midiPcmStream.clear(); // L: 136
			class304.musicPlayerStatus = 0; // L: 137
			HealthBarUpdate.musicTrack = null; // L: 138
			UserComparator4.soundCache = null; // L: 139
			HealthBar.musicTrackArchive = null; // L: 140
		}

	} // L: 142
}
