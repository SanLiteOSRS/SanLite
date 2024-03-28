import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("sd")
	@Export("FriendsChatManager_inFriendsChat")
	static boolean FriendsChatManager_inFriendsChat;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lvx;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 46156721
	)
	int field1123;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 332926417
	)
	int field1124;
	@ObfuscatedName("ab")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 855640211
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 425547539
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -334031367
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 776784083
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1197034193
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1206390989
	)
	int field1140;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 859475615
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1152903659
	)
	int field1137;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 2040749959
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -236006143
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1348847329
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 444465337
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("aa")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -847135969
	)
	@Export("team")
	int team;
	@ObfuscatedName("am")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -722233805
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1363721471
	)
	@Export("index")
	int index;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("bc")
	boolean field1147;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1258938525
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 47364053
	)
	@Export("tileY")
	int tileY;

	Player() {
		this.field1123 = -1; // L: 19
		this.field1124 = -1; // L: 20
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
		this.field1147 = false; // L: 49
	} // L: 53

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "1406213924"
	)
	@Export("read")
	final void read(Buffer var1) {
		var1.offset = 0;
		byte var2 = var1.readByte();
		boolean var3 = true; // L: 58
		this.field1123 = var1.readByte(); // L: 59
		this.field1124 = var1.readByte();
		int var4 = -1;
		this.team = 0; // L: 62
		int[] var5 = new int[12];

		int var7;
		int var8;
		int var9;
		for (int var6 = 0; var6 < 12; ++var6) {
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
					var9 = class10.ItemComposition_get(var5[var6] - 512).field2352; // L: 77
					if (var9 != 0) {
						this.team = var9;
					}
				}
			}
		}

		int[] var26 = new int[12]; // L: 81

		for (var7 = 0; var7 < 12; ++var7) { // L: 82
			var8 = var1.readUnsignedByte(); // L: 83
			if (var8 == 0) { // L: 84
				var26[var7] = 0; // L: 85
			} else {
				var9 = var1.readUnsignedByte(); // L: 88
				var26[var7] = var9 + (var8 << 8); // L: 89
			}
		}

		int[] var27 = new int[5]; // L: 91

		for (var8 = 0; var8 < 5; ++var8) { // L: 92
			var9 = var1.readUnsignedByte(); // L: 93
			if (var9 < 0 || var9 >= UrlRequester.field1454[var8].length) { // L: 94
				var9 = 0;
			}

			var27[var8] = var9; // L: 95
		}

		super.idleSequence = var1.readUnsignedShort(); // L: 97
		if (super.idleSequence == 65535) { // L: 98
			super.idleSequence = -1;
		}

		super.field1206 = var1.readUnsignedShort(); // L: 99
		if (super.field1206 == 65535) { // L: 100
			super.field1206 = -1;
		}

		super.field1207 = super.field1206; // L: 101
		super.walkSequence = var1.readUnsignedShort(); // L: 102
		if (super.walkSequence == 65535) { // L: 103
			super.walkSequence = -1;
		}

		super.walkBackSequence = var1.readUnsignedShort(); // L: 104
		if (super.walkBackSequence == 65535) { // L: 105
			super.walkBackSequence = -1;
		}

		super.walkLeftSequence = var1.readUnsignedShort(); // L: 106
		if (super.walkLeftSequence == 65535) { // L: 107
			super.walkLeftSequence = -1;
		}

		super.walkRightSequence = var1.readUnsignedShort(); // L: 108
		if (super.walkRightSequence == 65535) { // L: 109
			super.walkRightSequence = -1;
		}

		super.runSequence = var1.readUnsignedShort(); // L: 110
		if (super.runSequence == 65535) { // L: 111
			super.runSequence = -1;
		}

		this.username = new Username(var1.readStringCp1252NullTerminated(), class127.loginType); // L: 112
		this.clearIsFriend(); // L: 113
		this.method2335(); // L: 114
		this.method2338(); // L: 115
		if (this == class133.localPlayer) { // L: 116
			RunException.field5389 = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte(); // L: 117
		this.skillLevel = var1.readUnsignedShort(); // L: 118
		this.isHidden = var1.readUnsignedByte() == 1; // L: 119
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) { // L: 120
			this.isHidden = false;
		}

		class187[] var28 = null; // L: 121
		boolean var30 = false; // L: 122
		int var10 = var1.readUnsignedShort(); // L: 123
		var30 = (var10 >> 15 & 1) == 1; // L: 124
		int var11;
		if (var10 > 0 && var10 != 32768) { // L: 125
			var28 = new class187[12]; // L: 126

			for (var11 = 0; var11 < 12; ++var11) { // L: 127
				int var12 = var10 >> 12 - var11 & 1; // L: 128
				if (var12 == 1) { // L: 129
					int var16 = var5[var11] - 512; // L: 133
					int var17 = var1.readUnsignedByte(); // L: 135
					boolean var18 = (var17 & 1) != 0; // L: 136
					boolean var19 = (var17 & 2) != 0; // L: 137
					class187 var20 = new class187(var16); // L: 138
					int var21;
					int[] var22;
					boolean var23;
					int var24;
					short var25;
					if (var18) { // L: 139
						var21 = var1.readUnsignedByte(); // L: 140
						var22 = new int[]{var21 & 15, var21 >> 4 & 15}; // L: 141 142 143
						var23 = var20.field1959 != null && var22.length == var20.field1959.length; // L: 144

						for (var24 = 0; var24 < 2; ++var24) { // L: 145
							if (var22[var24] != 15) { // L: 146
								var25 = (short)var1.readUnsignedShort(); // L: 147
								if (var23) { // L: 148
									var20.field1959[var22[var24]] = var25; // L: 149
								}
							}
						}
					}

					if (var19) { // L: 154
						var21 = var1.readUnsignedByte(); // L: 155
						var22 = new int[]{var21 & 15, var21 >> 4 & 15}; // L: 156 157 158
						var23 = var20.field1961 != null && var22.length == var20.field1961.length; // L: 159

						for (var24 = 0; var24 < 2; ++var24) { // L: 160
							if (var22[var24] != 15) { // L: 161
								var25 = (short)var1.readUnsignedShort(); // L: 162
								if (var23) { // L: 163
									var20.field1961[var22[var24]] = var25; // L: 164
								}
							}
						}
					}

					var28[var11] = var20; // L: 171
				}
			}
		}

		for (var11 = 0; var11 < 3; ++var11) { // L: 175
			this.actions[var11] = var1.readStringCp1252NullTerminated(); // L: 176
		}

		byte var29 = var1.readByte(); // L: 178
		if (this.appearance == null) { // L: 179
			this.appearance = new PlayerComposition();
		}

		this.appearance.method6321(var26, var5, var28, var30, var27, var2, var4, var29); // L: 180
	} // L: 181

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljn;",
		garbageValue = "1157175232"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) { // L: 244
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? DevicePcmPlayerProvider.SequenceDefinition_get(super.sequence) : null; // L: 245
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.movementSequence == super.idleSequence && var1 != null ? null : DevicePcmPlayerProvider.SequenceDefinition_get(super.movementSequence); // L: 246
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 247
			if (var3 == null) { // L: 248
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 249
				super.defaultHeight = var3.height; // L: 250
				int var4 = var3.indicesCount; // L: 251
				if (!this.isUnanimated) { // L: 252
					var3 = this.method2401(var3); // L: 253
				}

				if (!this.isUnanimated && this.model0 != null) { // L: 255
					if (Client.cycle >= this.animationCycleEnd) { // L: 256
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) { // L: 257
						Model var5 = this.model0; // L: 258
						var5.offsetBy(this.field1140 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1137 * 4096 - super.y); // L: 259
						if (super.orientation == 512) { // L: 260
							var5.rotateY90Ccw(); // L: 261
							var5.rotateY90Ccw(); // L: 262
							var5.rotateY90Ccw(); // L: 263
						} else if (super.orientation == 1024) { // L: 265
							var5.rotateY90Ccw(); // L: 266
							var5.rotateY90Ccw(); // L: 267
						} else if (super.orientation == 1536) { // L: 269
							var5.rotateY90Ccw();
						}

						Model[] var6 = new Model[]{var3, var5}; // L: 270
						var3 = new Model(var6, 2); // L: 271
						if (super.orientation == 512) { // L: 272
							var5.rotateY90Ccw();
						} else if (super.orientation == 1024) { // L: 273
							var5.rotateY90Ccw(); // L: 274
							var5.rotateY90Ccw(); // L: 275
						} else if (super.orientation == 1536) { // L: 277
							var5.rotateY90Ccw(); // L: 278
							var5.rotateY90Ccw(); // L: 279
							var5.rotateY90Ccw(); // L: 280
						}

						var5.offsetBy(super.x - this.field1140 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1137 * 4096); // L: 282
					}
				}

				var3.isSingleTile = true; // L: 285
				if (super.field1265 != 0 && Client.cycle >= super.field1260 && Client.cycle < super.field1236) { // L: 286
					var3.overrideHue = super.field1261; // L: 287
					var3.overrideSaturation = super.field1263; // L: 288
					var3.overrideLuminance = super.field1235; // L: 289
					var3.overrideAmount = super.field1265; // L: 290
					var3.field2784 = (short)var4; // L: 291
				} else {
					var3.overrideAmount = 0; // L: 294
				}

				return var3; // L: 296
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "94"
	)
	boolean method2331() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) { // L: 184
			this.checkIsFriend(); // L: 185
		}

		return this.isFriendTriBool == TriBool.TriBool_true; // L: 187
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-326732208"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 191
	} // L: 192

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1103762697"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = class334.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 195
	} // L: 196

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1463803481"
	)
	boolean method2366() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) { // L: 199
			this.updateIsInFriendsChat(); // L: 200
		}

		return this.isInFriendsChat == TriBool.TriBool_true; // L: 202
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1706967366"
	)
	void method2335() {
		this.isInFriendsChat = TriBool.TriBool_unknown; // L: 206
	} // L: 207

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "17"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = class143.friendsChatManager != null && class143.friendsChatManager.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 210
	} // L: 211

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) { // L: 214
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3242(this.username.getName()) != -1 && var1 != 2) { // L: 215 216
				this.isInClanChat = TriBool.TriBool_true; // L: 217
				return; // L: 218
			}
		}

		this.isInClanChat = TriBool.TriBool_false; // L: 222
	} // L: 223

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-580824656"
	)
	void method2338() {
		this.isInClanChat = TriBool.TriBool_unknown; // L: 226
	} // L: 227

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "33"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) { // L: 230
			this.updateIsInClanChat(); // L: 231
		}

		return this.isInClanChat == TriBool.TriBool_true; // L: 233
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1724182257"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? UserComparator10.getNpcDefinition(this.appearance.npcTransformId).size : 1; // L: 237 238 240
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IILiu;B)V",
		garbageValue = "39"
	)
	final void method2342(int var1, int var2, class233 var3) {
		if (super.sequence != -1 && DevicePcmPlayerProvider.SequenceDefinition_get(super.sequence).field2399 == 1) { // L: 300
			super.sequence = -1;
		}

		this.method2419(); // L: 301
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) { // L: 302
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) { // L: 303
				if (var3 == class233.field2485) {
					class1.method11(this, var1, var2, class233.field2485); // L: 305
				}

				this.method2344(var1, var2, var3); // L: 306
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	} // L: 308

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "70706499"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0; // L: 311
		super.field1274 = 0; // L: 312
		super.field1257 = 0; // L: 313
		super.pathX[0] = var1; // L: 314
		super.pathY[0] = var2; // L: 315
		int var3 = this.transformedSize(); // L: 316
		super.x = var3 * 64 + super.pathX[0] * 128; // L: 317
		super.y = super.pathY[0] * 128 + var3 * 64; // L: 318
	} // L: 319

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IILiu;I)V",
		garbageValue = "468458923"
	)
	final void method2344(int var1, int var2, class233 var3) {
		if (super.pathLength < 9) { // L: 322
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) {
			super.pathX[var4] = super.pathX[var4 - 1]; // L: 324
			super.pathY[var4] = super.pathY[var4 - 1];
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1];
		}

		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.pathTraversed[0] = var3; // L: 330
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "951800784"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Loc;IIB)[Lvg;",
		garbageValue = "30"
	)
	public static SpritePixels[] method2379(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 55
		boolean var3;
		if (var4 == null) { // L: 56
			var3 = false; // L: 57
		} else {
			class483.SpriteBuffer_decode(var4); // L: 60
			var3 = true; // L: 61
		}

		return !var3 ? null : TextureProvider.method4930(); // L: 63 64
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "201430276"
	)
	public static byte[] method2330() {
		byte[] var0 = new byte[24]; // L: 323

		try {
			JagexCache.JagexCache_randomDat.seek(0L); // L: 325
			JagexCache.JagexCache_randomDat.readFully(var0); // L: 326

			int var1;
			for (var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) { // L: 327 328 329
			}

			if (var1 >= 24) {
				throw new IOException(); // L: 331
			}
		} catch (Exception var4) {
			for (int var2 = 0; var2 < 24; ++var2) { // L: 334
				var0[var2] = -1;
			}
		}

		return var0; // L: 336
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	static final boolean method2361() {
		return ViewportMouse.ViewportMouse_isInViewport; // L: 78
	}
}
