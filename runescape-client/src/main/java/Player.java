import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("rq")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -339690919
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1767225387
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("q")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 295884031
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 412407165
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -705296317
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1109822011
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 544334885
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1362904281
	)
	int field1093;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 2036186281
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -472748625
	)
	int field1097;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1915037801
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 2110454417
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -447071197
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1319610801
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("e")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1985723861
	)
	@Export("team")
	int team;
	@ObfuscatedName("x")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1670935727
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1637139185
	)
	@Export("index")
	int index;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("aq")
	boolean field1111;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1622070341
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1343320041
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-1877482907"
	)
	@Export("read")
	final void read(Buffer var1) {
		var1.offset = 0; // L: 57
		int var2 = var1.readUnsignedByte(); // L: 58
		this.headIconPk = var1.readByte(); // L: 59
		this.headIconPrayer = var1.readByte(); // L: 60
		int var3 = -1; // L: 61
		this.team = 0; // L: 62
		int[] var4 = new int[12]; // L: 63

		int var6;
		int var7;
		int var8;
		for (int var5 = 0; var5 < 12; ++var5) { // L: 64
			var6 = var1.readUnsignedByte(); // L: 65
			if (var6 == 0) { // L: 66
				var4[var5] = 0; // L: 67
			} else {
				var7 = var1.readUnsignedByte(); // L: 70
				var4[var5] = var7 + (var6 << 8); // L: 71
				if (var5 == 0 && var4[0] == 65535) { // L: 72
					var3 = var1.readUnsignedShort();
					break;
				}

				if (var4[var5] >= 512) {
					var8 = AttackOption.ItemComposition_get(var4[var5] - 512).team;
					if (var8 != 0) {
						this.team = var8;
					}
				}
			}
		}

		int[] var11 = new int[5];

		for (var6 = 0; var6 < 5; ++var6) { // L: 82
			var7 = var1.readUnsignedByte();
			if (var7 < 0 || var7 >= GroundObject.field2275[var6].length) {
				var7 = 0;
			}

			var11[var6] = var7;
		}

		super.idleSequence = var1.readUnsignedShort();
		if (super.idleSequence == 65535) {
			super.idleSequence = -1;
		}

		super.turnLeftSequence = var1.readUnsignedShort();
		if (super.turnLeftSequence == 65535) {
			super.turnLeftSequence = -1;
		}

		super.turnRightSequence = super.turnLeftSequence;
		super.walkSequence = var1.readUnsignedShort();
		if (super.walkSequence == 65535) { // L: 93
			super.walkSequence = -1;
		}

		super.walkBackSequence = var1.readUnsignedShort();
		if (super.walkBackSequence == 65535) {
			super.walkBackSequence = -1;
		}

		super.walkLeftSequence = var1.readUnsignedShort();
		if (super.walkLeftSequence == 65535) { // L: 97
			super.walkLeftSequence = -1;
		}

		super.walkRightSequence = var1.readUnsignedShort(); // L: 98
		if (super.walkRightSequence == 65535) { // L: 99
			super.walkRightSequence = -1;
		}

		super.runSequence = var1.readUnsignedShort(); // L: 100
		if (super.runSequence == 65535) { // L: 101
			super.runSequence = -1;
		}

		this.username = new Username(var1.readStringCp1252NullTerminated(), StructComposition.loginType); // L: 102
		this.clearIsFriend(); // L: 103
		this.clearIsInFriendsChat(); // L: 104
		this.method2134(); // L: 105
		if (this == ScriptFrame.localPlayer) { // L: 106
			RunException.localPlayerName = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte(); // L: 107
		this.skillLevel = var1.readUnsignedShort(); // L: 108
		this.isHidden = var1.readUnsignedByte() == 1; // L: 109
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) { // L: 110
			this.isHidden = false;
		}

		class167[] var12 = null; // L: 111
		boolean var13 = false; // L: 112
		var8 = var1.readUnsignedShort(); // L: 113
		var13 = (var8 >> 15 & 1) == 1; // L: 114
		int var9;
		if (var8 > 0 && var8 != 32768) { // L: 115
			var12 = new class167[12]; // L: 116

			for (var9 = 0; var9 < 12; ++var9) { // L: 117
				int var10 = var8 >> 12 - var9 & 1; // L: 118
				if (var10 == 1) { // L: 119
					var12[var9] = UserComparator8.method2551(var4[var9] - 512, var1); // L: 120
				}
			}
		}

		if (var1.offset < var1.array.length) { // L: 124
			for (var9 = 0; var9 < 3; ++var9) { // L: 125
				this.actions[var9] = var1.readStringCp1252NullTerminated(); // L: 126
			}
		}

		if (this.appearance == null) { // L: 129
			this.appearance = new PlayerComposition();
		}

		this.appearance.method5494(var4, var12, var13, var11, var2 == 1, var3); // L: 130
	} // L: 131

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Lhp;",
		garbageValue = "4"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) { // L: 194
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? ByteArrayPool.SequenceDefinition_get(super.sequence) : null; // L: 195
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.idleSequence == super.movementSequence && var1 != null ? null : ByteArrayPool.SequenceDefinition_get(super.movementSequence); // L: 196
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
					var5 = ArchiveDisk.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 203
					if (var5 != null) { // L: 204
						var5.offsetBy(0, -super.field1195, 0); // L: 205
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
						var5.offsetBy(this.field1093 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1097 * 4096 - super.y); // L: 214
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

						var5.offsetBy(super.x - this.field1093 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1097 * 4096); // L: 237
					}
				}

				var3.isSingleTile = true; // L: 240
				if (super.field1192 != 0 && Client.cycle >= super.field1187 && Client.cycle < super.field1188) { // L: 241
					var3.overrideHue = super.field1189; // L: 242
					var3.overrideSaturation = super.field1131; // L: 243
					var3.overrideLuminance = super.field1191; // L: 244
					var3.overrideAmount = super.field1192; // L: 245
					var3.field2527 = (short)var4; // L: 246
				} else {
					var3.overrideAmount = 0; // L: 249
				}

				return var3; // L: 251
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) { // L: 134
			this.checkIsFriend(); // L: 135
		}

		return this.isFriendTriBool == TriBool.TriBool_true; // L: 137
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "19668"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 141
	} // L: 142

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "689286"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = class321.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 145
	} // L: 146

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "365465151"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) { // L: 149
			this.updateIsInFriendsChat(); // L: 150
		}

		return this.isInFriendsChat == TriBool.TriBool_true; // L: 152
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2010863403"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown; // L: 156
	} // L: 157

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "122"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = class19.friendsChatManager != null && class19.friendsChatManager.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 160
	} // L: 161

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-154264181"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) { // L: 164
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method2901(this.username.getName()) != -1 && var1 != 2) { // L: 165 166
				this.isInClanChat = TriBool.TriBool_true; // L: 167
				return; // L: 168
			}
		}

		this.isInClanChat = TriBool.TriBool_false; // L: 172
	} // L: 173

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-309302132"
	)
	void method2134() {
		this.isInClanChat = TriBool.TriBool_unknown; // L: 176
	} // L: 177

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-268947223"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) { // L: 180
			this.updateIsInClanChat(); // L: 181
		}

		return this.isInClanChat == TriBool.TriBool_true; // L: 183
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-83725541"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? class119.getNpcDefinition(this.appearance.npcTransformId).size : 1; // L: 187 188 190
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IILgi;I)V",
		garbageValue = "646320028"
	)
	final void method2131(int var1, int var2, class192 var3) {
		if (super.sequence != -1 && ByteArrayPool.SequenceDefinition_get(super.sequence).field2180 == 1) { // L: 255
			super.sequence = -1;
		}

		super.field1162 = -1; // L: 256
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) { // L: 257
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) { // L: 258
				if (var3 == class192.field2207) { // L: 260
					Player var4 = this; // L: 261
					class192 var5 = class192.field2207; // L: 262
					int var6 = super.pathX[0]; // L: 264
					int var7 = super.pathY[0]; // L: 265
					int var8 = this.transformedSize(); // L: 266
					if (var6 >= var8 && var6 < 104 - var8 && var7 >= var8 && var7 < 104 - var8 && var1 >= var8 && var1 < 104 - var8 && var2 >= var8 && var2 < 104 - var8) { // L: 267 268
						int var10 = this.transformedSize(); // L: 270
						RouteStrategy var11 = class13.method164(var1, var2); // L: 271
						CollisionMap var12 = Client.collisionMaps[this.plane]; // L: 272
						int[] var13 = Client.field547; // L: 273
						int[] var14 = Client.field771; // L: 274
						int var15 = 0;

						label863:
						while (true) {
							int var16;
							if (var15 >= 128) {
								int var17;
								int var18;
								byte var19;
								byte var20;
								int var21;
								int var22;
								byte var23;
								int var24;
								int[][] var25;
								int var26;
								int var27;
								int var28;
								int var29;
								boolean var35;
								boolean var36;
								int var37;
								int var38;
								int var40;
								if (var10 == 1) { // L: 283
									var17 = var6; // L: 286
									var18 = var7; // L: 287
									var19 = 64; // L: 288
									var20 = 64; // L: 289
									var21 = var6 - var19; // L: 290
									var22 = var7 - var20; // L: 291
									class193.directions[var19][var20] = 99; // L: 292
									class193.distances[var19][var20] = 0; // L: 293
									var23 = 0; // L: 294
									var24 = 0; // L: 295
									class193.bufferX[var23] = var6; // L: 296
									var40 = var23 + 1;
									class193.bufferY[var23] = var7; // L: 297
									var25 = var12.flags; // L: 298

									while (true) {
										if (var24 == var40) { // L: 301
											Huffman.field3288 = var17; // L: 373
											class193.field2212 = var18; // L: 374
											var36 = false; // L: 375
											break;
										}

										var17 = class193.bufferX[var24]; // L: 302
										var18 = class193.bufferY[var24]; // L: 303
										var24 = var24 + 1 & 4095; // L: 304
										var37 = var17 - var21; // L: 305
										var38 = var18 - var22; // L: 306
										var26 = var17 - var12.xInset; // L: 307
										var27 = var18 - var12.yInset; // L: 308
										if (var11.hasArrived(1, var17, var18, var12)) { // L: 309
											Huffman.field3288 = var17; // L: 310
											class193.field2212 = var18; // L: 311
											var36 = true; // L: 312
											break;
										}

										var28 = class193.distances[var37][var38] + 1; // L: 315
										if (var37 > 0 && class193.directions[var37 - 1][var38] == 0 && (var25[var26 - 1][var27] & 19136776) == 0) { // L: 316
											class193.bufferX[var40] = var17 - 1; // L: 317
											class193.bufferY[var40] = var18; // L: 318
											var40 = var40 + 1 & 4095; // L: 319
											class193.directions[var37 - 1][var38] = 2; // L: 320
											class193.distances[var37 - 1][var38] = var28; // L: 321
										}

										if (var37 < 127 && class193.directions[var37 + 1][var38] == 0 && (var25[var26 + 1][var27] & 19136896) == 0) { // L: 323
											class193.bufferX[var40] = var17 + 1; // L: 324
											class193.bufferY[var40] = var18; // L: 325
											var40 = var40 + 1 & 4095; // L: 326
											class193.directions[var37 + 1][var38] = 8; // L: 327
											class193.distances[var37 + 1][var38] = var28; // L: 328
										}

										if (var38 > 0 && class193.directions[var37][var38 - 1] == 0 && (var25[var26][var27 - 1] & 19136770) == 0) { // L: 330
											class193.bufferX[var40] = var17; // L: 331
											class193.bufferY[var40] = var18 - 1; // L: 332
											var40 = var40 + 1 & 4095; // L: 333
											class193.directions[var37][var38 - 1] = 1; // L: 334
											class193.distances[var37][var38 - 1] = var28; // L: 335
										}

										if (var38 < 127 && class193.directions[var37][var38 + 1] == 0 && (var25[var26][var27 + 1] & 19136800) == 0) { // L: 337
											class193.bufferX[var40] = var17; // L: 338
											class193.bufferY[var40] = var18 + 1; // L: 339
											var40 = var40 + 1 & 4095; // L: 340
											class193.directions[var37][var38 + 1] = 4; // L: 341
											class193.distances[var37][var38 + 1] = var28; // L: 342
										}

										if (var37 > 0 && var38 > 0 && class193.directions[var37 - 1][var38 - 1] == 0 && (var25[var26 - 1][var27 - 1] & 19136782) == 0 && (var25[var26 - 1][var27] & 19136776) == 0 && (var25[var26][var27 - 1] & 19136770) == 0) { // L: 344
											class193.bufferX[var40] = var17 - 1; // L: 345
											class193.bufferY[var40] = var18 - 1; // L: 346
											var40 = var40 + 1 & 4095; // L: 347
											class193.directions[var37 - 1][var38 - 1] = 3; // L: 348
											class193.distances[var37 - 1][var38 - 1] = var28; // L: 349
										}

										if (var37 < 127 && var38 > 0 && class193.directions[var37 + 1][var38 - 1] == 0 && (var25[var26 + 1][var27 - 1] & 19136899) == 0 && (var25[var26 + 1][var27] & 19136896) == 0 && (var25[var26][var27 - 1] & 19136770) == 0) { // L: 351
											class193.bufferX[var40] = var17 + 1; // L: 352
											class193.bufferY[var40] = var18 - 1; // L: 353
											var40 = var40 + 1 & 4095; // L: 354
											class193.directions[var37 + 1][var38 - 1] = 9; // L: 355
											class193.distances[var37 + 1][var38 - 1] = var28; // L: 356
										}

										if (var37 > 0 && var38 < 127 && class193.directions[var37 - 1][var38 + 1] == 0 && (var25[var26 - 1][var27 + 1] & 19136824) == 0 && (var25[var26 - 1][var27] & 19136776) == 0 && (var25[var26][var27 + 1] & 19136800) == 0) { // L: 358
											class193.bufferX[var40] = var17 - 1; // L: 359
											class193.bufferY[var40] = var18 + 1; // L: 360
											var40 = var40 + 1 & 4095; // L: 361
											class193.directions[var37 - 1][var38 + 1] = 6; // L: 362
											class193.distances[var37 - 1][var38 + 1] = var28; // L: 363
										}

										if (var37 < 127 && var38 < 127 && class193.directions[var37 + 1][var38 + 1] == 0 && (var25[var26 + 1][var27 + 1] & 19136992) == 0 && (var25[var26 + 1][var27] & 19136896) == 0 && (var25[var26][var27 + 1] & 19136800) == 0) { // L: 365
											class193.bufferX[var40] = var17 + 1; // L: 366
											class193.bufferY[var40] = var18 + 1; // L: 367
											var40 = var40 + 1 & 4095; // L: 368
											class193.directions[var37 + 1][var38 + 1] = 12; // L: 369
											class193.distances[var37 + 1][var38 + 1] = var28; // L: 370
										}
									}

									var35 = var36; // L: 377
								} else if (var10 == 2) { // L: 379
									var17 = var6; // L: 382
									var18 = var7; // L: 383
									var19 = 64; // L: 384
									var20 = 64; // L: 385
									var21 = var6 - var19; // L: 386
									var22 = var7 - var20; // L: 387
									class193.directions[var19][var20] = 99; // L: 388
									class193.distances[var19][var20] = 0; // L: 389
									var23 = 0; // L: 390
									var24 = 0; // L: 391
									class193.bufferX[var23] = var6; // L: 392
									var40 = var23 + 1;
									class193.bufferY[var23] = var7; // L: 393
									var25 = var12.flags; // L: 394

									while (true) {
										if (var40 == var24) { // L: 395
											Huffman.field3288 = var17; // L: 495
											class193.field2212 = var18; // L: 496
											var36 = false; // L: 497
											break;
										}

										var17 = class193.bufferX[var24]; // L: 396
										var18 = class193.bufferY[var24]; // L: 397
										var24 = var24 + 1 & 4095; // L: 398
										var37 = var17 - var21; // L: 399
										var38 = var18 - var22; // L: 400
										var26 = var17 - var12.xInset; // L: 401
										var27 = var18 - var12.yInset; // L: 402
										if (var11.hasArrived(2, var17, var18, var12)) { // L: 403
											Huffman.field3288 = var17; // L: 404
											class193.field2212 = var18; // L: 405
											var36 = true; // L: 406
											break;
										}

										var28 = class193.distances[var37][var38] + 1; // L: 409
										if (var37 > 0 && class193.directions[var37 - 1][var38] == 0 && (var25[var26 - 1][var27] & 19136782) == 0 && (var25[var26 - 1][var27 + 1] & 19136824) == 0) { // L: 410 411 412 413
											class193.bufferX[var40] = var17 - 1; // L: 414
											class193.bufferY[var40] = var18; // L: 415
											var40 = var40 + 1 & 4095; // L: 416
											class193.directions[var37 - 1][var38] = 2; // L: 417
											class193.distances[var37 - 1][var38] = var28; // L: 418
										}

										if (var37 < 126 && class193.directions[var37 + 1][var38] == 0 && (var25[var26 + 2][var27] & 19136899) == 0 && (var25[var26 + 2][var27 + 1] & 19136992) == 0) { // L: 420 421 422 423
											class193.bufferX[var40] = var17 + 1; // L: 424
											class193.bufferY[var40] = var18; // L: 425
											var40 = var40 + 1 & 4095; // L: 426
											class193.directions[var37 + 1][var38] = 8; // L: 427
											class193.distances[var37 + 1][var38] = var28; // L: 428
										}

										if (var38 > 0 && class193.directions[var37][var38 - 1] == 0 && (var25[var26][var27 - 1] & 19136782) == 0 && (var25[var26 + 1][var27 - 1] & 19136899) == 0) { // L: 430 431 432 433
											class193.bufferX[var40] = var17; // L: 434
											class193.bufferY[var40] = var18 - 1; // L: 435
											var40 = var40 + 1 & 4095; // L: 436
											class193.directions[var37][var38 - 1] = 1; // L: 437
											class193.distances[var37][var38 - 1] = var28; // L: 438
										}

										if (var38 < 126 && class193.directions[var37][var38 + 1] == 0 && (var25[var26][var27 + 2] & 19136824) == 0 && (var25[var26 + 1][var27 + 2] & 19136992) == 0) { // L: 440 441 442 443
											class193.bufferX[var40] = var17; // L: 444
											class193.bufferY[var40] = var18 + 1; // L: 445
											var40 = var40 + 1 & 4095; // L: 446
											class193.directions[var37][var38 + 1] = 4; // L: 447
											class193.distances[var37][var38 + 1] = var28; // L: 448
										}

										if (var37 > 0 && var38 > 0 && class193.directions[var37 - 1][var38 - 1] == 0 && (var25[var26 - 1][var27] & 19136830) == 0 && (var25[var26 - 1][var27 - 1] & 19136782) == 0 && (var25[var26][var27 - 1] & 19136911) == 0) { // L: 450 451 452 453 454
											class193.bufferX[var40] = var17 - 1; // L: 455
											class193.bufferY[var40] = var18 - 1; // L: 456
											var40 = var40 + 1 & 4095; // L: 457
											class193.directions[var37 - 1][var38 - 1] = 3; // L: 458
											class193.distances[var37 - 1][var38 - 1] = var28; // L: 459
										}

										if (var37 < 126 && var38 > 0 && class193.directions[var37 + 1][var38 - 1] == 0 && (var25[var26 + 1][var27 - 1] & 19136911) == 0 && (var25[var26 + 2][var27 - 1] & 19136899) == 0 && (var25[var26 + 2][var27] & 19136995) == 0) { // L: 461 462 463 464 465
											class193.bufferX[var40] = var17 + 1; // L: 466
											class193.bufferY[var40] = var18 - 1; // L: 467
											var40 = var40 + 1 & 4095; // L: 468
											class193.directions[var37 + 1][var38 - 1] = 9; // L: 469
											class193.distances[var37 + 1][var38 - 1] = var28; // L: 470
										}

										if (var37 > 0 && var38 < 126 && class193.directions[var37 - 1][var38 + 1] == 0 && (var25[var26 - 1][var27 + 1] & 19136830) == 0 && (var25[var26 - 1][var27 + 2] & 19136824) == 0 && (var25[var26][var27 + 2] & 19137016) == 0) { // L: 472 473 474 475 476
											class193.bufferX[var40] = var17 - 1; // L: 477
											class193.bufferY[var40] = var18 + 1; // L: 478
											var40 = var40 + 1 & 4095; // L: 479
											class193.directions[var37 - 1][var38 + 1] = 6; // L: 480
											class193.distances[var37 - 1][var38 + 1] = var28; // L: 481
										}

										if (var37 < 126 && var38 < 126 && class193.directions[var37 + 1][var38 + 1] == 0 && (var25[var26 + 1][var27 + 2] & 19137016) == 0 && (var25[var26 + 2][var27 + 2] & 19136992) == 0 && (var25[var26 + 2][var27 + 1] & 19136995) == 0) { // L: 483 484 485 486 487
											class193.bufferX[var40] = var17 + 1; // L: 488
											class193.bufferY[var40] = var18 + 1; // L: 489
											var40 = var40 + 1 & 4095; // L: 490
											class193.directions[var37 + 1][var38 + 1] = 12; // L: 491
											class193.distances[var37 + 1][var38 + 1] = var28; // L: 492
										}
									}

									var35 = var36; // L: 499
								} else {
									var17 = var6; // L: 504
									var18 = var7; // L: 505
									var19 = 64; // L: 506
									var20 = 64; // L: 507
									var21 = var6 - var19; // L: 508
									var22 = var7 - var20; // L: 509
									class193.directions[var19][var20] = 99; // L: 510
									class193.distances[var19][var20] = 0; // L: 511
									var23 = 0; // L: 512
									var24 = 0; // L: 513
									class193.bufferX[var23] = var6; // L: 514
									var40 = var23 + 1;
									class193.bufferY[var23] = var7; // L: 515
									var25 = var12.flags; // L: 516

									label849:
									while (true) {
										label847:
										while (true) {
											do {
												do {
													do {
														label824:
														do {
															if (var40 == var24) { // L: 517
																Huffman.field3288 = var17; // L: 637
																class193.field2212 = var18; // L: 638
																var36 = false; // L: 639
																break label849;
															}

															var17 = class193.bufferX[var24]; // L: 518
															var18 = class193.bufferY[var24]; // L: 519
															var24 = var24 + 1 & 4095; // L: 520
															var37 = var17 - var21; // L: 521
															var38 = var18 - var22; // L: 522
															var26 = var17 - var12.xInset; // L: 523
															var27 = var18 - var12.yInset; // L: 524
															if (var11.hasArrived(var10, var17, var18, var12)) { // L: 525
																Huffman.field3288 = var17; // L: 526
																class193.field2212 = var18; // L: 527
																var36 = true; // L: 528
																break label849;
															}

															var28 = class193.distances[var37][var38] + 1; // L: 531
															if (var37 > 0 && class193.directions[var37 - 1][var38] == 0 && (var25[var26 - 1][var27] & 19136782) == 0 && (var25[var26 - 1][var10 + var27 - 1] & 19136824) == 0) { // L: 532 533 534 535
																var29 = 1;

																while (true) {
																	if (var29 >= var10 - 1) {
																		class193.bufferX[var40] = var17 - 1; // L: 539
																		class193.bufferY[var40] = var18; // L: 540
																		var40 = var40 + 1 & 4095; // L: 541
																		class193.directions[var37 - 1][var38] = 2; // L: 542
																		class193.distances[var37 - 1][var38] = var28; // L: 543
																		break;
																	}

																	if ((var25[var26 - 1][var29 + var27] & 19136830) != 0) { // L: 537
																		break;
																	}

																	++var29; // L: 536
																}
															}

															if (var37 < 128 - var10 && class193.directions[var37 + 1][var38] == 0 && (var25[var10 + var26][var27] & 19136899) == 0 && (var25[var10 + var26][var10 + var27 - 1] & 19136992) == 0) { // L: 545 546 547 548
																var29 = 1;

																while (true) {
																	if (var29 >= var10 - 1) {
																		class193.bufferX[var40] = var17 + 1; // L: 552
																		class193.bufferY[var40] = var18; // L: 553
																		var40 = var40 + 1 & 4095; // L: 554
																		class193.directions[var37 + 1][var38] = 8; // L: 555
																		class193.distances[var37 + 1][var38] = var28; // L: 556
																		break;
																	}

																	if ((var25[var10 + var26][var27 + var29] & 19136995) != 0) { // L: 550
																		break;
																	}

																	++var29; // L: 549
																}
															}

															if (var38 > 0 && class193.directions[var37][var38 - 1] == 0 && (var25[var26][var27 - 1] & 19136782) == 0 && (var25[var10 + var26 - 1][var27 - 1] & 19136899) == 0) { // L: 558 559 560 561
																var29 = 1;

																while (true) {
																	if (var29 >= var10 - 1) {
																		class193.bufferX[var40] = var17; // L: 565
																		class193.bufferY[var40] = var18 - 1; // L: 566
																		var40 = var40 + 1 & 4095; // L: 567
																		class193.directions[var37][var38 - 1] = 1; // L: 568
																		class193.distances[var37][var38 - 1] = var28; // L: 569
																		break;
																	}

																	if ((var25[var29 + var26][var27 - 1] & 19136911) != 0) { // L: 563
																		break;
																	}

																	++var29; // L: 562
																}
															}

															if (var38 < 128 - var10 && class193.directions[var37][var38 + 1] == 0 && (var25[var26][var10 + var27] & 19136824) == 0 && (var25[var26 + var10 - 1][var10 + var27] & 19136992) == 0) { // L: 571 572 573 574
																var29 = 1;

																while (true) {
																	if (var29 >= var10 - 1) {
																		class193.bufferX[var40] = var17; // L: 578
																		class193.bufferY[var40] = var18 + 1; // L: 579
																		var40 = var40 + 1 & 4095; // L: 580
																		class193.directions[var37][var38 + 1] = 4; // L: 581
																		class193.distances[var37][var38 + 1] = var28; // L: 582
																		break;
																	}

																	if ((var25[var29 + var26][var10 + var27] & 19137016) != 0) { // L: 576
																		break;
																	}

																	++var29; // L: 575
																}
															}

															if (var37 > 0 && var38 > 0 && class193.directions[var37 - 1][var38 - 1] == 0 && (var25[var26 - 1][var27 - 1] & 19136782) == 0) { // L: 584 585 586
																var29 = 1;

																while (true) {
																	if (var29 >= var10) {
																		class193.bufferX[var40] = var17 - 1; // L: 591
																		class193.bufferY[var40] = var18 - 1; // L: 592
																		var40 = var40 + 1 & 4095; // L: 593
																		class193.directions[var37 - 1][var38 - 1] = 3; // L: 594
																		class193.distances[var37 - 1][var38 - 1] = var28; // L: 595
																		break;
																	}

																	if ((var25[var26 - 1][var29 + (var27 - 1)] & 19136830) != 0 || (var25[var29 + (var26 - 1)][var27 - 1] & 19136911) != 0) { // L: 588 589
																		break;
																	}

																	++var29; // L: 587
																}
															}

															if (var37 < 128 - var10 && var38 > 0 && class193.directions[var37 + 1][var38 - 1] == 0 && (var25[var26 + var10][var27 - 1] & 19136899) == 0) { // L: 597 598 599
																var29 = 1;

																while (true) {
																	if (var29 >= var10) {
																		class193.bufferX[var40] = var17 + 1; // L: 604
																		class193.bufferY[var40] = var18 - 1; // L: 605
																		var40 = var40 + 1 & 4095; // L: 606
																		class193.directions[var37 + 1][var38 - 1] = 9; // L: 607
																		class193.distances[var37 + 1][var38 - 1] = var28; // L: 608
																		break;
																	}

																	if ((var25[var26 + var10][var29 + (var27 - 1)] & 19136995) != 0 || (var25[var29 + var26][var27 - 1] & 19136911) != 0) { // L: 601 602
																		break;
																	}

																	++var29; // L: 600
																}
															}

															if (var37 > 0 && var38 < 128 - var10 && class193.directions[var37 - 1][var38 + 1] == 0 && (var25[var26 - 1][var10 + var27] & 19136824) == 0) { // L: 610 611 612
																for (var29 = 1; var29 < var10; ++var29) { // L: 613
																	if ((var25[var26 - 1][var27 + var29] & 19136830) != 0 || (var25[var29 + (var26 - 1)][var10 + var27] & 19137016) != 0) { // L: 614 615
																		continue label824;
																	}
																}

																class193.bufferX[var40] = var17 - 1; // L: 617
																class193.bufferY[var40] = var18 + 1; // L: 618
																var40 = var40 + 1 & 4095; // L: 619
																class193.directions[var37 - 1][var38 + 1] = 6; // L: 620
																class193.distances[var37 - 1][var38 + 1] = var28; // L: 621
															}
														} while(var37 >= 128 - var10); // L: 623
													} while(var38 >= 128 - var10);
												} while(class193.directions[var37 + 1][var38 + 1] != 0); // L: 624
											} while((var25[var26 + var10][var10 + var27] & 19136992) != 0); // L: 625

											for (var29 = 1; var29 < var10; ++var29) { // L: 626
												if ((var25[var29 + var26][var10 + var27] & 19137016) != 0 || (var25[var26 + var10][var29 + var27] & 19136995) != 0) { // L: 627 628
													continue label847;
												}
											}

											class193.bufferX[var40] = var17 + 1; // L: 630
											class193.bufferY[var40] = var18 + 1; // L: 631
											var40 = var40 + 1 & 4095; // L: 632
											class193.directions[var37 + 1][var38 + 1] = 12; // L: 633
											class193.distances[var37 + 1][var38 + 1] = var28; // L: 634
										}
									}

									var35 = var36; // L: 641
								}

								int var9;
								label906: {
									var16 = var6 - 64; // L: 643
									var17 = var7 - 64; // L: 644
									var18 = Huffman.field3288; // L: 645
									var37 = class193.field2212; // L: 646
									if (!var35) { // L: 647
										var38 = Integer.MAX_VALUE; // L: 649
										var21 = Integer.MAX_VALUE; // L: 650
										byte var39 = 10; // L: 651
										var40 = var11.approxDestinationX; // L: 652
										var24 = var11.approxDestinationY; // L: 653
										int var34 = var11.approxDestinationSizeX; // L: 654
										var26 = var11.approxDestinationSizeY; // L: 655

										for (var27 = var40 - var39; var27 <= var40 + var39; ++var27) { // L: 656
											for (var28 = var24 - var39; var28 <= var39 + var24; ++var28) { // L: 657
												var29 = var27 - var16; // L: 658
												int var30 = var28 - var17; // L: 659
												if (var29 >= 0 && var30 >= 0 && var29 < 128 && var30 < 128 && class193.distances[var29][var30] < 100) { // L: 660 661
													int var31 = 0; // L: 662
													if (var27 < var40) { // L: 663
														var31 = var40 - var27;
													} else if (var27 > var40 + var34 - 1) { // L: 664
														var31 = var27 - (var40 + var34 - 1);
													}

													int var32 = 0; // L: 665
													if (var28 < var24) { // L: 666
														var32 = var24 - var28;
													} else if (var28 > var26 + var24 - 1) { // L: 667
														var32 = var28 - (var26 + var24 - 1);
													}

													int var33 = var32 * var32 + var31 * var31; // L: 668
													if (var33 < var38 || var38 == var33 && class193.distances[var29][var30] < var21) { // L: 669
														var38 = var33; // L: 670
														var21 = class193.distances[var29][var30]; // L: 671
														var18 = var27; // L: 672
														var37 = var28; // L: 673
													}
												}
											}
										}

										if (var38 == Integer.MAX_VALUE) { // L: 679
											var9 = -1; // L: 680
											break label906;
										}
									}

									if (var18 == var6 && var7 == var37) { // L: 689
										var13[0] = var18; // L: 690
										var14[0] = var37; // L: 691
										var9 = 0; // L: 692
									} else {
										var20 = 0; // L: 695
										class193.bufferX[var20] = var18; // L: 698
										var38 = var20 + 1;
										class193.bufferY[var20] = var37; // L: 699

										for (var21 = var22 = class193.directions[var18 - var16][var37 - var17]; var18 != var6 || var37 != var7; var21 = class193.directions[var18 - var16][var37 - var17]) { // L: 700 701 711
											if (var21 != var22) { // L: 702
												var22 = var21; // L: 703
												class193.bufferX[var38] = var18; // L: 704
												class193.bufferY[var38++] = var37; // L: 705
											}

											if ((var21 & 2) != 0) { // L: 707
												++var18;
											} else if ((var21 & 8) != 0) { // L: 708
												--var18;
											}

											if ((var21 & 1) != 0) { // L: 709
												++var37;
											} else if ((var21 & 4) != 0) { // L: 710
												--var37;
											}
										}

										var40 = 0; // L: 713

										while (var38-- > 0) { // L: 714
											var13[var40] = class193.bufferX[var38]; // L: 715
											var14[var40++] = class193.bufferY[var38]; // L: 716
											if (var40 >= var13.length) { // L: 717
												break;
											}
										}

										var9 = var40; // L: 719
									}
								}

								var15 = var9; // L: 721
								if (var9 < 1) { // L: 722
									break;
								}

								var16 = 0; // L: 723

								while (true) {
									if (var16 >= var15 - 1) {
										break label863;
									}

									var4.method2106(Client.field547[var16], Client.field771[var16], var5);
									++var16;
								}
							}

							for (var16 = 0; var16 < 128; ++var16) { // L: 277
								class193.directions[var15][var16] = 0; // L: 278
								class193.distances[var15][var16] = 99999999; // L: 279
							}

							++var15; // L: 276
						}
					}
				}

				this.method2106(var1, var2, var3); // L: 726
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	} // L: 728

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1321665391"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0; // L: 731
		super.field1201 = 0; // L: 732
		super.field1200 = 0; // L: 733
		super.pathX[0] = var1; // L: 734
		super.pathY[0] = var2; // L: 735
		int var3 = this.transformedSize(); // L: 736
		super.x = super.pathX[0] * 128 + var3 * 64; // L: 737
		super.y = var3 * 64 + super.pathY[0] * 128; // L: 738
	} // L: 739

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IILgi;B)V",
		garbageValue = "1"
	)
	final void method2106(int var1, int var2, class192 var3) {
		if (super.pathLength < 9) { // L: 742
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) { // L: 743
			super.pathX[var4] = super.pathX[var4 - 1]; // L: 744
			super.pathY[var4] = super.pathY[var4 - 1]; // L: 745
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1]; // L: 746
		}

		super.pathX[0] = var1; // L: 748
		super.pathY[0] = var2; // L: 749
		super.pathTraversed[0] = var3; // L: 750
	} // L: 751

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-18"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null; // L: 754
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIILgc;II)V",
		garbageValue = "1711611133"
	)
	static void method2147(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound(); // L: 73
		var5.plane = var0; // L: 74
		var5.x = var1 * 16384; // L: 75
		var5.y = var2 * 128; // L: 76
		int var6 = var3.sizeX; // L: 77
		int var7 = var3.sizeY; // L: 78
		if (var4 == 1 || var4 == 3) { // L: 79
			var6 = var3.sizeY; // L: 80
			var7 = var3.sizeX; // L: 81
		}

		var5.maxX = (var6 + var1) * 128; // L: 83
		var5.maxY = (var7 + var2) * 16384; // L: 84
		var5.soundEffectId = var3.ambientSoundId; // L: 85
		var5.field812 = var3.int7 * 128; // L: 86
		var5.field807 = var3.int5; // L: 87
		var5.field811 = var3.int6; // L: 88
		var5.soundEffectIds = var3.soundEffectIds; // L: 89
		if (var3.transforms != null) { // L: 90
			var5.obj = var3; // L: 91
			var5.set(); // L: 92
		}

		ObjectSound.objectSounds.addFirst(var5); // L: 94
		if (var5.soundEffectIds != null) { // L: 95
			var5.field815 = var5.field807 + (int)(Math.random() * (double)(var5.field811 - var5.field807));
		}

	} // L: 96
}
