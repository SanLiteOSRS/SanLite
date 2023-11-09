import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lrg;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -973671885
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1139374581
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("j")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -234814145
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 937780563
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -2062844103
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 129983789
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 216240057
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1094414963
	)
	int field1095;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1671151533
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -2074914179
	)
	int field1100;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 2099943415
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 706149609
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1787519731
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1894548591
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("m")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1544922815
	)
	@Export("team")
	int team;
	@ObfuscatedName("i")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -934524493
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -2016345547
	)
	@Export("index")
	int index;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("ah")
	boolean field1116;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1234582483
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 873216329
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
		this.field1116 = false; // L: 50
	} // L: 54

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "-27"
	)
	@Export("read")
	final void read(Buffer var1) {
		var1.offset = 0; // L: 57
		int var2 = var1.readUnsignedByte(); // L: 58
		int var3 = -1; // L: 59
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
					var9 = MidiPcmStream.ItemComposition_get(var5[var6] - 512).team; // L: 78
					if (var9 != 0) {
						this.team = var9; // L: 79
					}
				}
			}
		}

		int[] var25 = new int[5]; // L: 82

		for (var7 = 0; var7 < 5; ++var7) { // L: 83
			var8 = var1.readUnsignedByte(); // L: 84
			if (var8 < 0 || var8 >= class34.field193[var7].length) { // L: 85
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), ViewportMouse.loginType); // L: 103
		this.clearIsFriend(); // L: 104
		this.clearIsInFriendsChat(); // L: 105
		this.method2264(); // L: 106
		if (this == class296.localPlayer) { // L: 107
			RunException.localPlayerName = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte(); // L: 108
		this.skillLevel = var1.readUnsignedShort(); // L: 109
		this.isHidden = var1.readUnsignedByte() == 1; // L: 110
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) { // L: 111
			this.isHidden = false;
		}

		class174[] var26 = null; // L: 112
		boolean var27 = false; // L: 113
		var9 = var1.readUnsignedShort(); // L: 114
		var27 = (var9 >> 15 & 1) == 1; // L: 115
		int var10;
		if (var9 > 0 && var9 != 32768) { // L: 116
			var26 = new class174[12]; // L: 117

			for (var10 = 0; var10 < 12; ++var10) { // L: 118
				int var11 = var9 >> 12 - var10 & 1; // L: 119
				if (var11 == 1) { // L: 120
					int var15 = var5[var10] - 512; // L: 124
					int var16 = var1.readUnsignedByte(); // L: 126
					boolean var17 = (var16 & 1) != 0; // L: 127
					boolean var18 = (var16 & 2) != 0; // L: 128
					class174 var19 = new class174(var15); // L: 129
					int var20;
					int[] var21;
					boolean var22;
					int var23;
					short var24;
					if (var17) { // L: 130
						var20 = var1.readUnsignedByte(); // L: 131
						var21 = new int[]{var20 & 15, var20 >> 4 & 15}; // L: 132 133 134
						var22 = var19.field1858 != null && var21.length == var19.field1858.length; // L: 135

						for (var23 = 0; var23 < 2; ++var23) { // L: 136
							if (var21[var23] != 15) { // L: 137
								var24 = (short)var1.readUnsignedShort(); // L: 138
								if (var22) { // L: 139
									var19.field1858[var21[var23]] = var24; // L: 140
								}
							}
						}
					}

					if (var18) { // L: 145
						var20 = var1.readUnsignedByte(); // L: 146
						var21 = new int[]{var20 & 15, var20 >> 4 & 15}; // L: 147 148 149
						var22 = var19.field1855 != null && var21.length == var19.field1855.length; // L: 150

						for (var23 = 0; var23 < 2; ++var23) { // L: 151
							if (var21[var23] != 15) { // L: 152
								var24 = (short)var1.readUnsignedShort(); // L: 153
								if (var22) { // L: 154
									var19.field1855[var21[var23]] = var24; // L: 155
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

		if (Client.field789 > 208) { // L: 169
			var3 = var1.readUnsignedByte(); // L: 170
		}

		if (this.appearance == null) { // L: 172
			this.appearance = new PlayerComposition();
		}

		this.appearance.method5730(var5, var26, var27, var25, var2, var4, var3); // L: 173
	} // L: 174

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Lha;",
		garbageValue = "-157507070"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) { // L: 237
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? WorldMapElement.SequenceDefinition_get(super.sequence) : null; // L: 238
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.idleSequence == super.movementSequence && var1 != null ? null : WorldMapElement.SequenceDefinition_get(super.movementSequence); // L: 239
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
					var5 = ReflectionCheck.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 246
					if (var5 != null) { // L: 247
						var5.offsetBy(0, -super.field1159, 0); // L: 248
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
						var5.offsetBy(this.field1095 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1100 * 4096 - super.y); // L: 257
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

						var5.offsetBy(super.x - this.field1095 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1100 * 4096); // L: 280
					}
				}

				var3.isSingleTile = true; // L: 283
				if (super.field1202 != 0 && Client.cycle >= super.field1197 && Client.cycle < super.field1198) { // L: 284
					var3.overrideHue = super.field1199; // L: 285
					var3.overrideSaturation = super.field1200; // L: 286
					var3.overrideLuminance = super.field1185; // L: 287
					var3.overrideAmount = super.field1202; // L: 288
					var3.field2667 = (short)var4; // L: 289
				} else {
					var3.overrideAmount = 0; // L: 292
				}

				return var3; // L: 294
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-119"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) { // L: 177
			this.checkIsFriend(); // L: 178
		}

		return this.isFriendTriBool == TriBool.TriBool_true; // L: 180
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-76"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 184
	} // L: 185

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-315549965"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = DecorativeObject.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 188
	} // L: 189

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1712140055"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) { // L: 192
			this.updateIsInFriendsChat(); // L: 193
		}

		return this.isInFriendsChat == TriBool.TriBool_true; // L: 195
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-20159007"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown; // L: 199
	} // L: 200

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1623340343"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = MenuAction.friendsChatManager != null && MenuAction.friendsChatManager.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 203
	} // L: 204

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "262226571"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) { // L: 207
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3076(this.username.getName()) != -1 && var1 != 2) { // L: 208 209
				this.isInClanChat = TriBool.TriBool_true; // L: 210
				return; // L: 211
			}
		}

		this.isInClanChat = TriBool.TriBool_false; // L: 215
	} // L: 216

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method2264() {
		this.isInClanChat = TriBool.TriBool_unknown; // L: 219
	} // L: 220

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-163412579"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) { // L: 223
			this.updateIsInClanChat(); // L: 224
		}

		return this.isInClanChat == TriBool.TriBool_true; // L: 226
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "123"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? HealthBarDefinition.getNpcDefinition(this.appearance.npcTransformId).size : 1; // L: 230 231 233
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IILgo;I)V",
		garbageValue = "-2010845157"
	)
	final void method2291(int var1, int var2, class202 var3) {
		if (super.sequence != -1 && WorldMapElement.SequenceDefinition_get(super.sequence).field2211 == 1) { // L: 298
			super.sequence = -1;
		}

		super.field1203 = -1; // L: 299
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) { // L: 300
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) { // L: 301
				if (var3 == class202.field2284) { // L: 303
					Player var4 = this; // L: 304
					class202 var5 = class202.field2284; // L: 305
					int var6 = super.pathX[0]; // L: 307
					int var7 = super.pathY[0]; // L: 308
					int var8 = this.transformedSize(); // L: 309
					if (var6 >= var8 && var6 < 104 - var8 && var7 >= var8 && var7 < 104 - var8 && var1 >= var8 && var1 < 104 - var8 && var2 >= var8 && var2 < 104 - var8) { // L: 310 311
						int var10 = this.transformedSize(); // L: 313
						Client.field790.approxDestinationX = var1; // L: 316
						Client.field790.approxDestinationY = var2; // L: 317
						Client.field790.approxDestinationSizeX = 1; // L: 318
						Client.field790.approxDestinationSizeY = 1; // L: 319
						ApproximateRouteStrategy var11 = Client.field790; // L: 320
						ApproximateRouteStrategy var12 = var11; // L: 322
						CollisionMap var13 = Client.collisionMaps[this.plane]; // L: 323
						int[] var14 = Client.field693; // L: 324
						int[] var15 = Client.field792; // L: 325
						int var16 = 0;

						label550:
						while (true) {
							int var17;
							if (var16 >= 128) {
								int var18;
								int var19;
								byte var20;
								byte var21;
								int var22;
								int var23;
								byte var24;
								int var25;
								int[][] var26;
								int var27;
								int var28;
								int var29;
								boolean var36;
								boolean var37;
								int var38;
								int var39;
								int var41;
								if (var10 == 1) { // L: 334
									var18 = var6; // L: 337
									var19 = var7; // L: 338
									var20 = 64; // L: 339
									var21 = 64; // L: 340
									var22 = var6 - var20; // L: 341
									var23 = var7 - var21; // L: 342
									class203.directions[var20][var21] = 99; // L: 343
									class203.distances[var20][var21] = 0; // L: 344
									var24 = 0; // L: 345
									var25 = 0; // L: 346
									class203.bufferX[var24] = var6; // L: 347
									var41 = var24 + 1;
									class203.bufferY[var24] = var7; // L: 348
									var26 = var13.flags; // L: 349

									while (true) {
										if (var25 == var41) { // L: 352
											class203.field2291 = var18; // L: 424
											class203.field2294 = var19; // L: 425
											var37 = false; // L: 426
											break;
										}

										var18 = class203.bufferX[var25]; // L: 353
										var19 = class203.bufferY[var25]; // L: 354
										var25 = var25 + 1 & 4095; // L: 355
										var38 = var18 - var22; // L: 356
										var39 = var19 - var23; // L: 357
										var27 = var18 - var13.xInset; // L: 358
										var28 = var19 - var13.yInset; // L: 359
										if (var12.hasArrived(1, var18, var19, var13)) { // L: 360
											class203.field2291 = var18; // L: 361
											class203.field2294 = var19; // L: 362
											var37 = true; // L: 363
											break;
										}

										var29 = class203.distances[var38][var39] + 1; // L: 366
										if (var38 > 0 && class203.directions[var38 - 1][var39] == 0 && (var26[var27 - 1][var28] & 19136776) == 0) { // L: 367
											class203.bufferX[var41] = var18 - 1; // L: 368
											class203.bufferY[var41] = var19; // L: 369
											var41 = var41 + 1 & 4095; // L: 370
											class203.directions[var38 - 1][var39] = 2; // L: 371
											class203.distances[var38 - 1][var39] = var29; // L: 372
										}

										if (var38 < 127 && class203.directions[var38 + 1][var39] == 0 && (var26[var27 + 1][var28] & 19136896) == 0) { // L: 374
											class203.bufferX[var41] = var18 + 1; // L: 375
											class203.bufferY[var41] = var19; // L: 376
											var41 = var41 + 1 & 4095; // L: 377
											class203.directions[var38 + 1][var39] = 8; // L: 378
											class203.distances[var38 + 1][var39] = var29; // L: 379
										}

										if (var39 > 0 && class203.directions[var38][var39 - 1] == 0 && (var26[var27][var28 - 1] & 19136770) == 0) { // L: 381
											class203.bufferX[var41] = var18; // L: 382
											class203.bufferY[var41] = var19 - 1; // L: 383
											var41 = var41 + 1 & 4095; // L: 384
											class203.directions[var38][var39 - 1] = 1; // L: 385
											class203.distances[var38][var39 - 1] = var29; // L: 386
										}

										if (var39 < 127 && class203.directions[var38][var39 + 1] == 0 && (var26[var27][var28 + 1] & 19136800) == 0) { // L: 388
											class203.bufferX[var41] = var18; // L: 389
											class203.bufferY[var41] = var19 + 1; // L: 390
											var41 = var41 + 1 & 4095; // L: 391
											class203.directions[var38][var39 + 1] = 4; // L: 392
											class203.distances[var38][var39 + 1] = var29; // L: 393
										}

										if (var38 > 0 && var39 > 0 && class203.directions[var38 - 1][var39 - 1] == 0 && (var26[var27 - 1][var28 - 1] & 19136782) == 0 && (var26[var27 - 1][var28] & 19136776) == 0 && (var26[var27][var28 - 1] & 19136770) == 0) { // L: 395
											class203.bufferX[var41] = var18 - 1; // L: 396
											class203.bufferY[var41] = var19 - 1; // L: 397
											var41 = var41 + 1 & 4095; // L: 398
											class203.directions[var38 - 1][var39 - 1] = 3; // L: 399
											class203.distances[var38 - 1][var39 - 1] = var29; // L: 400
										}

										if (var38 < 127 && var39 > 0 && class203.directions[var38 + 1][var39 - 1] == 0 && (var26[var27 + 1][var28 - 1] & 19136899) == 0 && (var26[var27 + 1][var28] & 19136896) == 0 && (var26[var27][var28 - 1] & 19136770) == 0) { // L: 402
											class203.bufferX[var41] = var18 + 1; // L: 403
											class203.bufferY[var41] = var19 - 1; // L: 404
											var41 = var41 + 1 & 4095; // L: 405
											class203.directions[var38 + 1][var39 - 1] = 9; // L: 406
											class203.distances[var38 + 1][var39 - 1] = var29; // L: 407
										}

										if (var38 > 0 && var39 < 127 && class203.directions[var38 - 1][var39 + 1] == 0 && (var26[var27 - 1][var28 + 1] & 19136824) == 0 && (var26[var27 - 1][var28] & 19136776) == 0 && (var26[var27][var28 + 1] & 19136800) == 0) { // L: 409
											class203.bufferX[var41] = var18 - 1; // L: 410
											class203.bufferY[var41] = var19 + 1; // L: 411
											var41 = var41 + 1 & 4095; // L: 412
											class203.directions[var38 - 1][var39 + 1] = 6; // L: 413
											class203.distances[var38 - 1][var39 + 1] = var29; // L: 414
										}

										if (var38 < 127 && var39 < 127 && class203.directions[var38 + 1][var39 + 1] == 0 && (var26[var27 + 1][var28 + 1] & 19136992) == 0 && (var26[var27 + 1][var28] & 19136896) == 0 && (var26[var27][var28 + 1] & 19136800) == 0) { // L: 416
											class203.bufferX[var41] = var18 + 1; // L: 417
											class203.bufferY[var41] = var19 + 1; // L: 418
											var41 = var41 + 1 & 4095; // L: 419
											class203.directions[var38 + 1][var39 + 1] = 12; // L: 420
											class203.distances[var38 + 1][var39 + 1] = var29; // L: 421
										}
									}

									var36 = var37; // L: 428
								} else if (var10 == 2) { // L: 430
									var18 = var6; // L: 433
									var19 = var7; // L: 434
									var20 = 64; // L: 435
									var21 = 64; // L: 436
									var22 = var6 - var20; // L: 437
									var23 = var7 - var21; // L: 438
									class203.directions[var20][var21] = 99; // L: 439
									class203.distances[var20][var21] = 0; // L: 440
									var24 = 0; // L: 441
									var25 = 0; // L: 442
									class203.bufferX[var24] = var6; // L: 443
									var41 = var24 + 1;
									class203.bufferY[var24] = var7; // L: 444
									var26 = var13.flags; // L: 445

									while (true) {
										if (var41 == var25) { // L: 446
											class203.field2291 = var18; // L: 546
											class203.field2294 = var19; // L: 547
											var37 = false; // L: 548
											break;
										}

										var18 = class203.bufferX[var25]; // L: 447
										var19 = class203.bufferY[var25]; // L: 448
										var25 = var25 + 1 & 4095; // L: 449
										var38 = var18 - var22; // L: 450
										var39 = var19 - var23; // L: 451
										var27 = var18 - var13.xInset; // L: 452
										var28 = var19 - var13.yInset; // L: 453
										if (var12.hasArrived(2, var18, var19, var13)) { // L: 454
											class203.field2291 = var18; // L: 455
											class203.field2294 = var19; // L: 456
											var37 = true; // L: 457
											break;
										}

										var29 = class203.distances[var38][var39] + 1; // L: 460
										if (var38 > 0 && class203.directions[var38 - 1][var39] == 0 && (var26[var27 - 1][var28] & 19136782) == 0 && (var26[var27 - 1][var28 + 1] & 19136824) == 0) { // L: 461 462 463 464
											class203.bufferX[var41] = var18 - 1; // L: 465
											class203.bufferY[var41] = var19; // L: 466
											var41 = var41 + 1 & 4095; // L: 467
											class203.directions[var38 - 1][var39] = 2; // L: 468
											class203.distances[var38 - 1][var39] = var29; // L: 469
										}

										if (var38 < 126 && class203.directions[var38 + 1][var39] == 0 && (var26[var27 + 2][var28] & 19136899) == 0 && (var26[var27 + 2][var28 + 1] & 19136992) == 0) { // L: 471 472 473 474
											class203.bufferX[var41] = var18 + 1; // L: 475
											class203.bufferY[var41] = var19; // L: 476
											var41 = var41 + 1 & 4095; // L: 477
											class203.directions[var38 + 1][var39] = 8; // L: 478
											class203.distances[var38 + 1][var39] = var29; // L: 479
										}

										if (var39 > 0 && class203.directions[var38][var39 - 1] == 0 && (var26[var27][var28 - 1] & 19136782) == 0 && (var26[var27 + 1][var28 - 1] & 19136899) == 0) { // L: 481 482 483 484
											class203.bufferX[var41] = var18; // L: 485
											class203.bufferY[var41] = var19 - 1; // L: 486
											var41 = var41 + 1 & 4095; // L: 487
											class203.directions[var38][var39 - 1] = 1; // L: 488
											class203.distances[var38][var39 - 1] = var29; // L: 489
										}

										if (var39 < 126 && class203.directions[var38][var39 + 1] == 0 && (var26[var27][var28 + 2] & 19136824) == 0 && (var26[var27 + 1][var28 + 2] & 19136992) == 0) { // L: 491 492 493 494
											class203.bufferX[var41] = var18; // L: 495
											class203.bufferY[var41] = var19 + 1; // L: 496
											var41 = var41 + 1 & 4095; // L: 497
											class203.directions[var38][var39 + 1] = 4; // L: 498
											class203.distances[var38][var39 + 1] = var29; // L: 499
										}

										if (var38 > 0 && var39 > 0 && class203.directions[var38 - 1][var39 - 1] == 0 && (var26[var27 - 1][var28] & 19136830) == 0 && (var26[var27 - 1][var28 - 1] & 19136782) == 0 && (var26[var27][var28 - 1] & 19136911) == 0) { // L: 501 502 503 504 505
											class203.bufferX[var41] = var18 - 1; // L: 506
											class203.bufferY[var41] = var19 - 1; // L: 507
											var41 = var41 + 1 & 4095; // L: 508
											class203.directions[var38 - 1][var39 - 1] = 3; // L: 509
											class203.distances[var38 - 1][var39 - 1] = var29; // L: 510
										}

										if (var38 < 126 && var39 > 0 && class203.directions[var38 + 1][var39 - 1] == 0 && (var26[var27 + 1][var28 - 1] & 19136911) == 0 && (var26[var27 + 2][var28 - 1] & 19136899) == 0 && (var26[var27 + 2][var28] & 19136995) == 0) { // L: 512 513 514 515 516
											class203.bufferX[var41] = var18 + 1; // L: 517
											class203.bufferY[var41] = var19 - 1; // L: 518
											var41 = var41 + 1 & 4095; // L: 519
											class203.directions[var38 + 1][var39 - 1] = 9; // L: 520
											class203.distances[var38 + 1][var39 - 1] = var29; // L: 521
										}

										if (var38 > 0 && var39 < 126 && class203.directions[var38 - 1][var39 + 1] == 0 && (var26[var27 - 1][var28 + 1] & 19136830) == 0 && (var26[var27 - 1][var28 + 2] & 19136824) == 0 && (var26[var27][var28 + 2] & 19137016) == 0) { // L: 523 524 525 526 527
											class203.bufferX[var41] = var18 - 1; // L: 528
											class203.bufferY[var41] = var19 + 1; // L: 529
											var41 = var41 + 1 & 4095; // L: 530
											class203.directions[var38 - 1][var39 + 1] = 6; // L: 531
											class203.distances[var38 - 1][var39 + 1] = var29; // L: 532
										}

										if (var38 < 126 && var39 < 126 && class203.directions[var38 + 1][var39 + 1] == 0 && (var26[var27 + 1][var28 + 2] & 19137016) == 0 && (var26[var27 + 2][var28 + 2] & 19136992) == 0 && (var26[var27 + 2][var28 + 1] & 19136995) == 0) { // L: 534 535 536 537 538
											class203.bufferX[var41] = var18 + 1; // L: 539
											class203.bufferY[var41] = var19 + 1; // L: 540
											var41 = var41 + 1 & 4095; // L: 541
											class203.directions[var38 + 1][var39 + 1] = 12; // L: 542
											class203.distances[var38 + 1][var39 + 1] = var29; // L: 543
										}
									}

									var36 = var37; // L: 550
								} else {
									var36 = class34.method502(var6, var7, var10, var11, var13); // L: 552
								}

								int var9;
								label575: {
									var17 = var6 - 64; // L: 553
									var18 = var7 - 64; // L: 554
									var19 = class203.field2291; // L: 555
									var38 = class203.field2294; // L: 556
									if (!var36) { // L: 557
										var39 = Integer.MAX_VALUE; // L: 559
										var22 = Integer.MAX_VALUE; // L: 560
										byte var40 = 10; // L: 561
										var41 = var12.approxDestinationX; // L: 562
										var25 = var12.approxDestinationY; // L: 563
										int var35 = var12.approxDestinationSizeX; // L: 564
										var27 = var12.approxDestinationSizeY; // L: 565

										for (var28 = var41 - var40; var28 <= var40 + var41; ++var28) { // L: 566
											for (var29 = var25 - var40; var29 <= var40 + var25; ++var29) { // L: 567
												int var30 = var28 - var17; // L: 568
												int var31 = var29 - var18; // L: 569
												if (var30 >= 0 && var31 >= 0 && var30 < 128 && var31 < 128 && class203.distances[var30][var31] < 100) { // L: 570 571
													int var32 = 0; // L: 572
													if (var28 < var41) { // L: 573
														var32 = var41 - var28;
													} else if (var28 > var35 + var41 - 1) { // L: 574
														var32 = var28 - (var35 + var41 - 1);
													}

													int var33 = 0; // L: 575
													if (var29 < var25) { // L: 576
														var33 = var25 - var29;
													} else if (var29 > var27 + var25 - 1) { // L: 577
														var33 = var29 - (var27 + var25 - 1);
													}

													int var34 = var32 * var32 + var33 * var33; // L: 578
													if (var34 < var39 || var34 == var39 && class203.distances[var30][var31] < var22) { // L: 579
														var39 = var34; // L: 580
														var22 = class203.distances[var30][var31]; // L: 581
														var19 = var28; // L: 582
														var38 = var29; // L: 583
													}
												}
											}
										}

										if (var39 == Integer.MAX_VALUE) { // L: 589
											var9 = -1; // L: 590
											break label575;
										}
									}

									if (var6 == var19 && var38 == var7) { // L: 599
										var14[0] = var19; // L: 600
										var15[0] = var38; // L: 601
										var9 = 0; // L: 602
									} else {
										var21 = 0; // L: 605
										class203.bufferX[var21] = var19; // L: 608
										var39 = var21 + 1;
										class203.bufferY[var21] = var38; // L: 609

										for (var22 = var23 = class203.directions[var19 - var17][var38 - var18]; var6 != var19 || var38 != var7; var22 = class203.directions[var19 - var17][var38 - var18]) { // L: 610 611 621
											if (var23 != var22) { // L: 612
												var23 = var22; // L: 613
												class203.bufferX[var39] = var19; // L: 614
												class203.bufferY[var39++] = var38; // L: 615
											}

											if ((var22 & 2) != 0) { // L: 617
												++var19;
											} else if ((var22 & 8) != 0) { // L: 618
												--var19;
											}

											if ((var22 & 1) != 0) { // L: 619
												++var38;
											} else if ((var22 & 4) != 0) { // L: 620
												--var38;
											}
										}

										var41 = 0; // L: 623

										while (var39-- > 0) { // L: 624
											var14[var41] = class203.bufferX[var39]; // L: 625
											var15[var41++] = class203.bufferY[var39]; // L: 626
											if (var41 >= var14.length) { // L: 627
												break;
											}
										}

										var9 = var41; // L: 629
									}
								}

								var16 = var9; // L: 631
								if (var9 < 1) { // L: 632
									break;
								}

								var17 = 0; // L: 633

								while (true) {
									if (var17 >= var16 - 1) {
										break label550;
									}

									var4.method2267(Client.field693[var17], Client.field792[var17], var5);
									++var17;
								}
							}

							for (var17 = 0; var17 < 128; ++var17) { // L: 328
								class203.directions[var16][var17] = 0; // L: 329
								class203.distances[var16][var17] = 99999999; // L: 330
							}

							++var16; // L: 327
						}
					}
				}

				this.method2267(var1, var2, var3); // L: 636
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	} // L: 638

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1977889478"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0; // L: 641
		super.field1211 = 0; // L: 642
		super.field1172 = 0; // L: 643
		super.pathX[0] = var1; // L: 644
		super.pathY[0] = var2; // L: 645
		int var3 = this.transformedSize(); // L: 646
		super.x = var3 * 64 + super.pathX[0] * 128; // L: 647
		super.y = super.pathY[0] * 128 + var3 * 64; // L: 648
	} // L: 649

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IILgo;I)V",
		garbageValue = "2044223400"
	)
	final void method2267(int var1, int var2, class202 var3) {
		if (super.pathLength < 9) { // L: 652
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) { // L: 653
			super.pathX[var4] = super.pathX[var4 - 1]; // L: 654
			super.pathY[var4] = super.pathY[var4 - 1]; // L: 655
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1]; // L: 656
		}

		super.pathX[0] = var1; // L: 658
		super.pathY[0] = var2; // L: 659
		super.pathTraversed[0] = var3; // L: 660
	} // L: 661

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "246357037"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null; // L: 664
	}
}
