import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1916232129
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1539405081
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("w")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1575706031
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1555394005
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -664293957
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -42542205
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 2081519761
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 440498461
	)
	int field1095;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 595380943
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 637592907
	)
	int field1097;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 471204145
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1484832955
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1931117129
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1131943337
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("v")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1012399969
	)
	@Export("team")
	int team;
	@ObfuscatedName("e")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 634785561
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -957849491
	)
	@Export("index")
	int index;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("ar")
	boolean field1111;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1382361713
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 252189665
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "-1806202048"
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
					var3 = var1.readUnsignedShort(); // L: 73
					break;
				}

				if (var4[var5] >= 512) { // L: 76
					var8 = class258.ItemComposition_get(var4[var5] - 512).team; // L: 77
					if (var8 != 0) { // L: 78
						this.team = var8;
					}
				}
			}
		}

		int[] var24 = new int[5]; // L: 81

		for (var6 = 0; var6 < 5; ++var6) { // L: 82
			var7 = var1.readUnsignedByte(); // L: 83
			if (var7 < 0 || var7 >= DynamicObject.field986[var6].length) { // L: 84
				var7 = 0;
			}

			var24[var6] = var7; // L: 85
		}

		super.idleSequence = var1.readUnsignedShort(); // L: 87
		if (super.idleSequence == 65535) { // L: 88
			super.idleSequence = -1;
		}

		super.turnLeftSequence = var1.readUnsignedShort(); // L: 89
		if (super.turnLeftSequence == 65535) { // L: 90
			super.turnLeftSequence = -1;
		}

		super.turnRightSequence = super.turnLeftSequence; // L: 91
		super.walkSequence = var1.readUnsignedShort(); // L: 92
		if (super.walkSequence == 65535) { // L: 93
			super.walkSequence = -1;
		}

		super.walkBackSequence = var1.readUnsignedShort(); // L: 94
		if (super.walkBackSequence == 65535) { // L: 95
			super.walkBackSequence = -1;
		}

		super.walkLeftSequence = var1.readUnsignedShort(); // L: 96
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), class162.loginType); // L: 102
		this.clearIsFriend(); // L: 103
		this.clearIsInFriendsChat(); // L: 104
		this.method2215(); // L: 105
		if (this == class28.localPlayer) { // L: 106
			class392.localPlayerName = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte(); // L: 107
		this.skillLevel = var1.readUnsignedShort(); // L: 108
		this.isHidden = var1.readUnsignedByte() == 1; // L: 109
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) { // L: 110
			this.isHidden = false;
		}

		class167[] var25 = null; // L: 111
		boolean var26 = false; // L: 112
		var8 = var1.readUnsignedShort(); // L: 113
		var26 = (var8 >> 15 & 1) == 1; // L: 114
		int var9;
		if (var8 > 0 && var8 != 32768) { // L: 115
			var25 = new class167[12]; // L: 116

			for (var9 = 0; var9 < 12; ++var9) { // L: 117
				int var10 = var8 >> 12 - var9 & 1; // L: 118
				if (var10 == 1) { // L: 119
					int var14 = var4[var9] - 512; // L: 123
					int var15 = var1.readUnsignedByte(); // L: 125
					boolean var16 = (var15 & 1) != 0; // L: 126
					boolean var17 = (var15 & 2) != 0; // L: 127
					class167 var18 = new class167(var14); // L: 128
					int var19;
					int[] var20;
					boolean var21;
					int var22;
					short var23;
					if (var16) { // L: 129
						var19 = var1.readUnsignedByte(); // L: 130
						var20 = new int[]{var19 & 15, var19 >> 4 & 15}; // L: 131 132 133
						var21 = var18.field1802 != null && var20.length == var18.field1802.length; // L: 134

						for (var22 = 0; var22 < 2; ++var22) { // L: 135
							if (var20[var22] != 15) { // L: 136
								var23 = (short)var1.readUnsignedShort(); // L: 137
								if (var21) { // L: 138
									var18.field1802[var20[var22]] = var23; // L: 139
								}
							}
						}
					}

					if (var17) { // L: 144
						var19 = var1.readUnsignedByte(); // L: 145
						var20 = new int[]{var19 & 15, var19 >> 4 & 15}; // L: 146 147 148
						var21 = var18.field1805 != null && var20.length == var18.field1805.length; // L: 149

						for (var22 = 0; var22 < 2; ++var22) { // L: 150
							if (var20[var22] != 15) { // L: 151
								var23 = (short)var1.readUnsignedShort(); // L: 152
								if (var21) { // L: 153
									var18.field1805[var20[var22]] = var23; // L: 154
								}
							}
						}
					}

					var25[var9] = var18; // L: 161
				}
			}
		}

		if (var1.offset < var1.array.length) { // L: 165
			for (var9 = 0; var9 < 3; ++var9) { // L: 166
				this.actions[var9] = var1.readStringCp1252NullTerminated(); // L: 167
			}
		}

		if (this.appearance == null) { // L: 170
			this.appearance = new PlayerComposition();
		}

		this.appearance.method5572(var4, var25, var26, var24, var2 == 1, var3); // L: 171
	} // L: 172

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Lhd;",
		garbageValue = "-842208187"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) { // L: 235
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class14.SequenceDefinition_get(super.sequence) : null; // L: 236
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.idleSequence == super.movementSequence && var1 != null ? null : class14.SequenceDefinition_get(super.movementSequence); // L: 237
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 238
			if (var3 == null) { // L: 239
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 240
				super.defaultHeight = var3.height; // L: 241
				int var4 = var3.indicesCount; // L: 242
				Model var5;
				Model[] var6;
				if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 243
					var5 = class13.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 244
					if (var5 != null) { // L: 245
						var5.offsetBy(0, -super.field1128, 0); // L: 246
						var6 = new Model[]{var3, var5}; // L: 247
						var3 = new Model(var6, 2); // L: 248
					}
				}

				if (!this.isUnanimated && this.model0 != null) { // L: 251
					if (Client.cycle >= this.animationCycleEnd) { // L: 252
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) { // L: 253
						var5 = this.model0; // L: 254
						var5.offsetBy(this.field1095 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1097 * 4096 - super.y); // L: 255
						if (super.orientation == 512) { // L: 256
							var5.rotateY90Ccw(); // L: 257
							var5.rotateY90Ccw(); // L: 258
							var5.rotateY90Ccw(); // L: 259
						} else if (super.orientation == 1024) { // L: 261
							var5.rotateY90Ccw(); // L: 262
							var5.rotateY90Ccw(); // L: 263
						} else if (super.orientation == 1536) { // L: 265
							var5.rotateY90Ccw();
						}

						var6 = new Model[]{var3, var5}; // L: 266
						var3 = new Model(var6, 2); // L: 267
						if (super.orientation == 512) { // L: 268
							var5.rotateY90Ccw();
						} else if (super.orientation == 1024) { // L: 269
							var5.rotateY90Ccw(); // L: 270
							var5.rotateY90Ccw(); // L: 271
						} else if (super.orientation == 1536) { // L: 273
							var5.rotateY90Ccw(); // L: 274
							var5.rotateY90Ccw(); // L: 275
							var5.rotateY90Ccw(); // L: 276
						}

						var5.offsetBy(super.x - this.field1095 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1097 * 4096); // L: 278
					}
				}

				var3.isSingleTile = true; // L: 281
				if (super.field1184 != 0 && Client.cycle >= super.field1189 && Client.cycle < super.field1136) { // L: 282
					var3.overrideHue = super.field1191; // L: 283
					var3.overrideSaturation = super.field1168; // L: 284
					var3.overrideLuminance = super.field1193; // L: 285
					var3.overrideAmount = super.field1184; // L: 286
					var3.field2516 = (short)var4; // L: 287
				} else {
					var3.overrideAmount = 0; // L: 290
				}

				return var3; // L: 292
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) { // L: 175
			this.checkIsFriend(); // L: 176
		}

		return this.isFriendTriBool == TriBool.TriBool_true; // L: 178
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "64"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 182
	} // L: 183

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1883398531"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = MusicPatchPcmStream.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 186
	} // L: 187

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "524757055"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) { // L: 190
			this.updateIsInFriendsChat(); // L: 191
		}

		return this.isInFriendsChat == TriBool.TriBool_true; // L: 193
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-105974800"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown; // L: 197
	} // L: 198

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "1684"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = class13.friendsChatManager != null && class13.friendsChatManager.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 201
	} // L: 202

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-31"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) { // L: 205
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3042(this.username.getName()) != -1 && var1 != 2) { // L: 206 207
				this.isInClanChat = TriBool.TriBool_true; // L: 208
				return; // L: 209
			}
		}

		this.isInClanChat = TriBool.TriBool_false; // L: 213
	} // L: 214

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "472207822"
	)
	void method2215() {
		this.isInClanChat = TriBool.TriBool_unknown; // L: 217
	} // L: 218

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1520291256"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) { // L: 221
			this.updateIsInClanChat(); // L: 222
		}

		return this.isInClanChat == TriBool.TriBool_true; // L: 224
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-61"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? class125.getNpcDefinition(this.appearance.npcTransformId).size : 1; // L: 228 229 231
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IILgl;I)V",
		garbageValue = "-1350620380"
	)
	final void method2230(int var1, int var2, class192 var3) {
		if (super.sequence != -1 && class14.SequenceDefinition_get(super.sequence).field2156 == 1) { // L: 296
			super.sequence = -1;
		}

		super.field1164 = -1; // L: 297
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) { // L: 298
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) { // L: 299
				if (var3 == class192.field2197) { // L: 301
					Player var4 = this; // L: 302
					class192 var5 = class192.field2197; // L: 303
					int var6 = super.pathX[0]; // L: 305
					int var7 = super.pathY[0]; // L: 306
					int var8 = this.transformedSize(); // L: 307
					if (var6 >= var8 && var6 < 104 - var8 && var7 >= var8 && var7 < 104 - var8 && var1 >= var8 && var1 < 104 - var8 && var2 >= var8 && var2 < 104 - var8) { // L: 308 309
						int var10 = this.transformedSize(); // L: 311
						Client.field777.approxDestinationX = var1; // L: 314
						Client.field777.approxDestinationY = var2; // L: 315
						Client.field777.approxDestinationSizeX = 1; // L: 316
						Client.field777.approxDestinationSizeY = 1; // L: 317
						ApproximateRouteStrategy var11 = Client.field777; // L: 318
						ApproximateRouteStrategy var12 = var11; // L: 320
						CollisionMap var13 = Client.collisionMaps[this.plane]; // L: 321
						int[] var14 = Client.field778; // L: 322
						int[] var15 = Client.field779; // L: 323
						int var16 = 0;

						label720:
						while (true) {
							int var17;
							if (var16 >= 128) {
								int var18;
								int var19;
								byte var21;
								int var22;
								int var23;
								int var25;
								int var27;
								int var28;
								int var29;
								int var30;
								boolean var36;
								int var38;
								int var39;
								int var41;
								if (var10 == 1) { // L: 332
									var36 = class344.method6344(var6, var7, var11, var13);
								} else {
									byte var20;
									byte var24;
									int[][] var26;
									boolean var37;
									if (var10 == 2) { // L: 333
										var18 = var6; // L: 336
										var19 = var7; // L: 337
										var20 = 64; // L: 338
										var21 = 64; // L: 339
										var22 = var6 - var20; // L: 340
										var23 = var7 - var21; // L: 341
										class193.directions[var20][var21] = 99; // L: 342
										class193.distances[var20][var21] = 0; // L: 343
										var24 = 0; // L: 344
										var25 = 0; // L: 345
										class193.bufferX[var24] = var6; // L: 346
										var41 = var24 + 1;
										class193.bufferY[var24] = var7; // L: 347
										var26 = var13.flags; // L: 348

										while (true) {
											if (var41 == var25) { // L: 349
												class352.field4222 = var18; // L: 449
												DirectByteArrayCopier.field3302 = var19; // L: 450
												var37 = false; // L: 451
												break;
											}

											var18 = class193.bufferX[var25]; // L: 350
											var19 = class193.bufferY[var25]; // L: 351
											var25 = var25 + 1 & 4095; // L: 352
											var38 = var18 - var22; // L: 353
											var39 = var19 - var23; // L: 354
											var27 = var18 - var13.xInset; // L: 355
											var28 = var19 - var13.yInset; // L: 356
											if (var12.hasArrived(2, var18, var19, var13)) { // L: 357
												class352.field4222 = var18; // L: 358
												DirectByteArrayCopier.field3302 = var19; // L: 359
												var37 = true; // L: 360
												break;
											}

											var29 = class193.distances[var38][var39] + 1; // L: 363
											if (var38 > 0 && class193.directions[var38 - 1][var39] == 0 && (var26[var27 - 1][var28] & 19136782) == 0 && (var26[var27 - 1][var28 + 1] & 19136824) == 0) { // L: 364 365 366 367
												class193.bufferX[var41] = var18 - 1; // L: 368
												class193.bufferY[var41] = var19; // L: 369
												var41 = var41 + 1 & 4095; // L: 370
												class193.directions[var38 - 1][var39] = 2; // L: 371
												class193.distances[var38 - 1][var39] = var29; // L: 372
											}

											if (var38 < 126 && class193.directions[var38 + 1][var39] == 0 && (var26[var27 + 2][var28] & 19136899) == 0 && (var26[var27 + 2][var28 + 1] & 19136992) == 0) { // L: 374 375 376 377
												class193.bufferX[var41] = var18 + 1; // L: 378
												class193.bufferY[var41] = var19; // L: 379
												var41 = var41 + 1 & 4095; // L: 380
												class193.directions[var38 + 1][var39] = 8; // L: 381
												class193.distances[var38 + 1][var39] = var29; // L: 382
											}

											if (var39 > 0 && class193.directions[var38][var39 - 1] == 0 && (var26[var27][var28 - 1] & 19136782) == 0 && (var26[var27 + 1][var28 - 1] & 19136899) == 0) { // L: 384 385 386 387
												class193.bufferX[var41] = var18; // L: 388
												class193.bufferY[var41] = var19 - 1; // L: 389
												var41 = var41 + 1 & 4095; // L: 390
												class193.directions[var38][var39 - 1] = 1; // L: 391
												class193.distances[var38][var39 - 1] = var29; // L: 392
											}

											if (var39 < 126 && class193.directions[var38][var39 + 1] == 0 && (var26[var27][var28 + 2] & 19136824) == 0 && (var26[var27 + 1][var28 + 2] & 19136992) == 0) { // L: 394 395 396 397
												class193.bufferX[var41] = var18; // L: 398
												class193.bufferY[var41] = var19 + 1; // L: 399
												var41 = var41 + 1 & 4095; // L: 400
												class193.directions[var38][var39 + 1] = 4; // L: 401
												class193.distances[var38][var39 + 1] = var29; // L: 402
											}

											if (var38 > 0 && var39 > 0 && class193.directions[var38 - 1][var39 - 1] == 0 && (var26[var27 - 1][var28] & 19136830) == 0 && (var26[var27 - 1][var28 - 1] & 19136782) == 0 && (var26[var27][var28 - 1] & 19136911) == 0) { // L: 404 405 406 407 408
												class193.bufferX[var41] = var18 - 1; // L: 409
												class193.bufferY[var41] = var19 - 1; // L: 410
												var41 = var41 + 1 & 4095; // L: 411
												class193.directions[var38 - 1][var39 - 1] = 3; // L: 412
												class193.distances[var38 - 1][var39 - 1] = var29; // L: 413
											}

											if (var38 < 126 && var39 > 0 && class193.directions[var38 + 1][var39 - 1] == 0 && (var26[var27 + 1][var28 - 1] & 19136911) == 0 && (var26[var27 + 2][var28 - 1] & 19136899) == 0 && (var26[var27 + 2][var28] & 19136995) == 0) { // L: 415 416 417 418 419
												class193.bufferX[var41] = var18 + 1; // L: 420
												class193.bufferY[var41] = var19 - 1; // L: 421
												var41 = var41 + 1 & 4095; // L: 422
												class193.directions[var38 + 1][var39 - 1] = 9; // L: 423
												class193.distances[var38 + 1][var39 - 1] = var29; // L: 424
											}

											if (var38 > 0 && var39 < 126 && class193.directions[var38 - 1][var39 + 1] == 0 && (var26[var27 - 1][var28 + 1] & 19136830) == 0 && (var26[var27 - 1][var28 + 2] & 19136824) == 0 && (var26[var27][var28 + 2] & 19137016) == 0) { // L: 426 427 428 429 430
												class193.bufferX[var41] = var18 - 1; // L: 431
												class193.bufferY[var41] = var19 + 1; // L: 432
												var41 = var41 + 1 & 4095; // L: 433
												class193.directions[var38 - 1][var39 + 1] = 6; // L: 434
												class193.distances[var38 - 1][var39 + 1] = var29; // L: 435
											}

											if (var38 < 126 && var39 < 126 && class193.directions[var38 + 1][var39 + 1] == 0 && (var26[var27 + 1][var28 + 2] & 19137016) == 0 && (var26[var27 + 2][var28 + 2] & 19136992) == 0 && (var26[var27 + 2][var28 + 1] & 19136995) == 0) { // L: 437 438 439 440 441
												class193.bufferX[var41] = var18 + 1; // L: 442
												class193.bufferY[var41] = var19 + 1; // L: 443
												var41 = var41 + 1 & 4095; // L: 444
												class193.directions[var38 + 1][var39 + 1] = 12; // L: 445
												class193.distances[var38 + 1][var39 + 1] = var29; // L: 446
											}
										}

										var36 = var37; // L: 453
									} else {
										var18 = var6; // L: 458
										var19 = var7; // L: 459
										var20 = 64; // L: 460
										var21 = 64; // L: 461
										var22 = var6 - var20; // L: 462
										var23 = var7 - var21; // L: 463
										class193.directions[var20][var21] = 99; // L: 464
										class193.distances[var20][var21] = 0; // L: 465
										var24 = 0; // L: 466
										var25 = 0; // L: 467
										class193.bufferX[var24] = var6; // L: 468
										var41 = var24 + 1;
										class193.bufferY[var24] = var7; // L: 469
										var26 = var13.flags; // L: 470

										label706:
										while (true) {
											label704:
											while (true) {
												do {
													do {
														do {
															label681:
															do {
																if (var25 == var41) { // L: 471
																	class352.field4222 = var18; // L: 591
																	DirectByteArrayCopier.field3302 = var19; // L: 592
																	var37 = false; // L: 593
																	break label706;
																}

																var18 = class193.bufferX[var25]; // L: 472
																var19 = class193.bufferY[var25]; // L: 473
																var25 = var25 + 1 & 4095; // L: 474
																var38 = var18 - var22; // L: 475
																var39 = var19 - var23; // L: 476
																var27 = var18 - var13.xInset; // L: 477
																var28 = var19 - var13.yInset; // L: 478
																if (var12.hasArrived(var10, var18, var19, var13)) { // L: 479
																	class352.field4222 = var18; // L: 480
																	DirectByteArrayCopier.field3302 = var19; // L: 481
																	var37 = true; // L: 482
																	break label706;
																}

																var29 = class193.distances[var38][var39] + 1; // L: 485
																if (var38 > 0 && class193.directions[var38 - 1][var39] == 0 && (var26[var27 - 1][var28] & 19136782) == 0 && (var26[var27 - 1][var10 + var28 - 1] & 19136824) == 0) { // L: 486 487 488 489
																	var30 = 1;

																	while (true) {
																		if (var30 >= var10 - 1) {
																			class193.bufferX[var41] = var18 - 1; // L: 493
																			class193.bufferY[var41] = var19; // L: 494
																			var41 = var41 + 1 & 4095; // L: 495
																			class193.directions[var38 - 1][var39] = 2; // L: 496
																			class193.distances[var38 - 1][var39] = var29; // L: 497
																			break;
																		}

																		if ((var26[var27 - 1][var30 + var28] & 19136830) != 0) { // L: 491
																			break;
																		}

																		++var30; // L: 490
																	}
																}

																if (var38 < 128 - var10 && class193.directions[var38 + 1][var39] == 0 && (var26[var10 + var27][var28] & 19136899) == 0 && (var26[var10 + var27][var28 + var10 - 1] & 19136992) == 0) { // L: 499 500 501 502
																	var30 = 1;

																	while (true) {
																		if (var30 >= var10 - 1) {
																			class193.bufferX[var41] = var18 + 1; // L: 506
																			class193.bufferY[var41] = var19; // L: 507
																			var41 = var41 + 1 & 4095; // L: 508
																			class193.directions[var38 + 1][var39] = 8; // L: 509
																			class193.distances[var38 + 1][var39] = var29; // L: 510
																			break;
																		}

																		if ((var26[var10 + var27][var28 + var30] & 19136995) != 0) { // L: 504
																			break;
																		}

																		++var30; // L: 503
																	}
																}

																if (var39 > 0 && class193.directions[var38][var39 - 1] == 0 && (var26[var27][var28 - 1] & 19136782) == 0 && (var26[var27 + var10 - 1][var28 - 1] & 19136899) == 0) { // L: 512 513 514 515
																	var30 = 1;

																	while (true) {
																		if (var30 >= var10 - 1) {
																			class193.bufferX[var41] = var18; // L: 519
																			class193.bufferY[var41] = var19 - 1; // L: 520
																			var41 = var41 + 1 & 4095; // L: 521
																			class193.directions[var38][var39 - 1] = 1; // L: 522
																			class193.distances[var38][var39 - 1] = var29; // L: 523
																			break;
																		}

																		if ((var26[var30 + var27][var28 - 1] & 19136911) != 0) { // L: 517
																			break;
																		}

																		++var30; // L: 516
																	}
																}

																if (var39 < 128 - var10 && class193.directions[var38][var39 + 1] == 0 && (var26[var27][var10 + var28] & 19136824) == 0 && (var26[var10 + var27 - 1][var28 + var10] & 19136992) == 0) { // L: 525 526 527 528
																	var30 = 1;

																	while (true) {
																		if (var30 >= var10 - 1) {
																			class193.bufferX[var41] = var18; // L: 532
																			class193.bufferY[var41] = var19 + 1; // L: 533
																			var41 = var41 + 1 & 4095; // L: 534
																			class193.directions[var38][var39 + 1] = 4; // L: 535
																			class193.distances[var38][var39 + 1] = var29; // L: 536
																			break;
																		}

																		if ((var26[var30 + var27][var28 + var10] & 19137016) != 0) { // L: 530
																			break;
																		}

																		++var30; // L: 529
																	}
																}

																if (var38 > 0 && var39 > 0 && class193.directions[var38 - 1][var39 - 1] == 0 && (var26[var27 - 1][var28 - 1] & 19136782) == 0) { // L: 538 539 540
																	var30 = 1;

																	while (true) {
																		if (var30 >= var10) {
																			class193.bufferX[var41] = var18 - 1; // L: 545
																			class193.bufferY[var41] = var19 - 1; // L: 546
																			var41 = var41 + 1 & 4095; // L: 547
																			class193.directions[var38 - 1][var39 - 1] = 3; // L: 548
																			class193.distances[var38 - 1][var39 - 1] = var29; // L: 549
																			break;
																		}

																		if ((var26[var27 - 1][var30 + (var28 - 1)] & 19136830) != 0 || (var26[var30 + (var27 - 1)][var28 - 1] & 19136911) != 0) { // L: 542 543
																			break;
																		}

																		++var30; // L: 541
																	}
																}

																if (var38 < 128 - var10 && var39 > 0 && class193.directions[var38 + 1][var39 - 1] == 0 && (var26[var27 + var10][var28 - 1] & 19136899) == 0) { // L: 551 552 553
																	var30 = 1;

																	while (true) {
																		if (var30 >= var10) {
																			class193.bufferX[var41] = var18 + 1; // L: 558
																			class193.bufferY[var41] = var19 - 1; // L: 559
																			var41 = var41 + 1 & 4095; // L: 560
																			class193.directions[var38 + 1][var39 - 1] = 9; // L: 561
																			class193.distances[var38 + 1][var39 - 1] = var29; // L: 562
																			break;
																		}

																		if ((var26[var27 + var10][var30 + (var28 - 1)] & 19136995) != 0 || (var26[var30 + var27][var28 - 1] & 19136911) != 0) { // L: 555 556
																			break;
																		}

																		++var30; // L: 554
																	}
																}

																if (var38 > 0 && var39 < 128 - var10 && class193.directions[var38 - 1][var39 + 1] == 0 && (var26[var27 - 1][var28 + var10] & 19136824) == 0) { // L: 564 565 566
																	for (var30 = 1; var30 < var10; ++var30) { // L: 567
																		if ((var26[var27 - 1][var28 + var30] & 19136830) != 0 || (var26[var30 + (var27 - 1)][var10 + var28] & 19137016) != 0) { // L: 568 569
																			continue label681;
																		}
																	}

																	class193.bufferX[var41] = var18 - 1; // L: 571
																	class193.bufferY[var41] = var19 + 1; // L: 572
																	var41 = var41 + 1 & 4095; // L: 573
																	class193.directions[var38 - 1][var39 + 1] = 6; // L: 574
																	class193.distances[var38 - 1][var39 + 1] = var29; // L: 575
																}
															} while(var38 >= 128 - var10); // L: 577
														} while(var39 >= 128 - var10);
													} while(class193.directions[var38 + 1][var39 + 1] != 0); // L: 578
												} while((var26[var27 + var10][var10 + var28] & 19136992) != 0); // L: 579

												for (var30 = 1; var30 < var10; ++var30) { // L: 580
													if ((var26[var30 + var27][var28 + var10] & 19137016) != 0 || (var26[var10 + var27][var30 + var28] & 19136995) != 0) { // L: 581 582
														continue label704;
													}
												}

												class193.bufferX[var41] = var18 + 1; // L: 584
												class193.bufferY[var41] = var19 + 1; // L: 585
												var41 = var41 + 1 & 4095; // L: 586
												class193.directions[var38 + 1][var39 + 1] = 12; // L: 587
												class193.distances[var38 + 1][var39 + 1] = var29; // L: 588
											}
										}

										var36 = var37; // L: 595
									}
								}

								int var9;
								label761: {
									var17 = var6 - 64; // L: 597
									var18 = var7 - 64; // L: 598
									var19 = class352.field4222; // L: 599
									var38 = DirectByteArrayCopier.field3302; // L: 600
									if (!var36) { // L: 601
										var39 = Integer.MAX_VALUE; // L: 603
										var22 = Integer.MAX_VALUE; // L: 604
										byte var40 = 10; // L: 605
										var41 = var12.approxDestinationX; // L: 606
										var25 = var12.approxDestinationY; // L: 607
										int var35 = var12.approxDestinationSizeX; // L: 608
										var27 = var12.approxDestinationSizeY; // L: 609

										for (var28 = var41 - var40; var28 <= var41 + var40; ++var28) { // L: 610
											for (var29 = var25 - var40; var29 <= var40 + var25; ++var29) { // L: 611
												var30 = var28 - var17; // L: 612
												int var31 = var29 - var18; // L: 613
												if (var30 >= 0 && var31 >= 0 && var30 < 128 && var31 < 128 && class193.distances[var30][var31] < 100) { // L: 614 615
													int var32 = 0; // L: 616
													if (var28 < var41) { // L: 617
														var32 = var41 - var28;
													} else if (var28 > var35 + var41 - 1) { // L: 618
														var32 = var28 - (var35 + var41 - 1);
													}

													int var33 = 0; // L: 619
													if (var29 < var25) { // L: 620
														var33 = var25 - var29;
													} else if (var29 > var27 + var25 - 1) { // L: 621
														var33 = var29 - (var25 + var27 - 1);
													}

													int var34 = var33 * var33 + var32 * var32; // L: 622
													if (var34 < var39 || var34 == var39 && class193.distances[var30][var31] < var22) { // L: 623
														var39 = var34; // L: 624
														var22 = class193.distances[var30][var31]; // L: 625
														var19 = var28; // L: 626
														var38 = var29; // L: 627
													}
												}
											}
										}

										if (var39 == Integer.MAX_VALUE) { // L: 633
											var9 = -1; // L: 634
											break label761;
										}
									}

									if (var19 == var6 && var7 == var38) { // L: 643
										var14[0] = var19; // L: 644
										var15[0] = var38; // L: 645
										var9 = 0; // L: 646
									} else {
										var21 = 0; // L: 649
										class193.bufferX[var21] = var19; // L: 652
										var39 = var21 + 1;
										class193.bufferY[var21] = var38; // L: 653

										for (var22 = var23 = class193.directions[var19 - var17][var38 - var18]; var6 != var19 || var7 != var38; var22 = class193.directions[var19 - var17][var38 - var18]) { // L: 654 655 665
											if (var22 != var23) { // L: 656
												var23 = var22; // L: 657
												class193.bufferX[var39] = var19; // L: 658
												class193.bufferY[var39++] = var38; // L: 659
											}

											if ((var22 & 2) != 0) { // L: 661
												++var19;
											} else if ((var22 & 8) != 0) { // L: 662
												--var19;
											}

											if ((var22 & 1) != 0) { // L: 663
												++var38;
											} else if ((var22 & 4) != 0) { // L: 664
												--var38;
											}
										}

										var41 = 0; // L: 667

										while (var39-- > 0) { // L: 668
											var14[var41] = class193.bufferX[var39]; // L: 669
											var15[var41++] = class193.bufferY[var39]; // L: 670
											if (var41 >= var14.length) { // L: 671
												break;
											}
										}

										var9 = var41; // L: 673
									}
								}

								var16 = var9; // L: 675
								if (var9 < 1) { // L: 676
									break;
								}

								var17 = 0; // L: 677

								while (true) {
									if (var17 >= var16 - 1) {
										break label720;
									}

									var4.method2205(Client.field778[var17], Client.field779[var17], var5);
									++var17;
								}
							}

							for (var17 = 0; var17 < 128; ++var17) { // L: 326
								class193.directions[var16][var17] = 0; // L: 327
								class193.distances[var16][var17] = 99999999; // L: 328
							}

							++var16; // L: 325
						}
					}
				}

				this.method2205(var1, var2, var3); // L: 680
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	} // L: 682

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2061690773"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0; // L: 685
		super.field1203 = 0; // L: 686
		super.field1142 = 0; // L: 687
		super.pathX[0] = var1; // L: 688
		super.pathY[0] = var2; // L: 689
		int var3 = this.transformedSize(); // L: 690
		super.x = var3 * 64 + super.pathX[0] * 128; // L: 691
		super.y = super.pathY[0] * 128 + var3 * 64; // L: 692
	} // L: 693

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IILgl;I)V",
		garbageValue = "985982243"
	)
	final void method2205(int var1, int var2, class192 var3) {
		if (super.pathLength < 9) { // L: 696
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) { // L: 697
			super.pathX[var4] = super.pathX[var4 - 1]; // L: 698
			super.pathY[var4] = super.pathY[var4 - 1]; // L: 699
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1]; // L: 700
		}

		super.pathX[0] = var1; // L: 702
		super.pathY[0] = var2; // L: 703
		super.pathTraversed[0] = var3; // L: 704
	} // L: 705

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2042091468"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null; // L: 708
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-287248166"
	)
	static final int method2211() {
		return Client.menuOptionsCount - 1; // L: 9586
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "598283870"
	)
	static final void method2248(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 11827
		class260.clientPreferences.updateSoundEffectVolume(var0); // L: 11828
	} // L: 11829
}
