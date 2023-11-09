import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("df")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 321608603
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1489130693
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("ai")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 424288465
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1660001619
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1063419341
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1376743455
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1488834411
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1242529467
	)
	int field1138;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1140943337
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 595673657
	)
	int field1140;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -574807483
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -104687849
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1122170757
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -508076645
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("as")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1345089973
	)
	@Export("team")
	int team;
	@ObfuscatedName("aj")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -593127175
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1857589841
	)
	@Export("index")
	int index;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("bk")
	boolean field1154;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -742725475
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1653662435
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
		this.field1154 = false; // L: 49
	} // L: 53

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "-1203582421"
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
					var9 = InvDefinition.ItemComposition_get(var5[var6] - 512).team; // L: 77
					if (var9 != 0) { // L: 78
						this.team = var9;
					}
				}
			}
		}

		int[] var26 = null; // L: 81
		if (Client.field708 >= 213) { // L: 82
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
			if (var9 < 0 || var9 >= class140.field1659[var8].length) { // L: 97
				var9 = 0;
			}

			var27[var8] = var9; // L: 98
		}

		super.idleSequence = var1.readUnsignedShort(); // L: 100
		if (super.idleSequence == 65535) { // L: 101
			super.idleSequence = -1;
		}

		super.field1204 = var1.readUnsignedShort(); // L: 102
		if (super.field1204 == 65535) { // L: 103
			super.field1204 = -1;
		}

		super.field1265 = super.field1204; // L: 104
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), Language.loginType); // L: 115
		this.clearIsFriend(); // L: 116
		this.method2309(); // L: 117
		this.method2353(); // L: 118
		if (this == VarbitComposition.localPlayer) { // L: 119
			RunException.field5263 = this.username.getName();
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
						var23 = var20.field1918 != null && var22.length == var20.field1918.length; // L: 147

						for (var24 = 0; var24 < 2; ++var24) { // L: 148
							if (var22[var24] != 15) { // L: 149
								var25 = (short)var1.readUnsignedShort(); // L: 150
								if (var23) { // L: 151
									var20.field1918[var22[var24]] = var25; // L: 152
								}
							}
						}
					}

					if (var19) { // L: 157
						var21 = var1.readUnsignedByte(); // L: 158
						var22 = new int[]{var21 & 15, var21 >> 4 & 15}; // L: 159 160 161
						var23 = var20.field1919 != null && var22.length == var20.field1919.length; // L: 162

						for (var24 = 0; var24 < 2; ++var24) { // L: 163
							if (var22[var24] != 15) { // L: 164
								var25 = (short)var1.readUnsignedShort(); // L: 165
								if (var23) { // L: 166
									var20.field1919[var22[var24]] = var25; // L: 167
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

		this.appearance.method6061(var26, var5, var28, var30, var27, var2, var4, var29); // L: 183
	} // L: 184

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ljr;",
		garbageValue = "798227647"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) { // L: 247
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? EnumComposition.SequenceDefinition_get(super.sequence) : null; // L: 248
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.idleSequence == super.movementSequence && var1 != null ? null : EnumComposition.SequenceDefinition_get(super.movementSequence); // L: 249
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 250
			if (var3 == null) { // L: 251
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 252
				super.defaultHeight = var3.height; // L: 253
				int var4 = var3.indicesCount; // L: 254
				if (!this.isUnanimated) { // L: 255
					var3 = this.method2379(var3); // L: 256
				}

				if (!this.isUnanimated && this.model0 != null) { // L: 258
					if (Client.cycle >= this.animationCycleEnd) { // L: 259
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) { // L: 260
						Model var5 = this.model0; // L: 261
						var5.offsetBy(this.field1138 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1140 * 4096 - super.y); // L: 262
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

						var5.offsetBy(super.x - this.field1138 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1140 * 4096); // L: 285
					}
				}

				var3.isSingleTile = true; // L: 288
				if (super.field1250 != 0 && Client.cycle >= super.field1258 && Client.cycle < super.field1200) { // L: 289
					var3.overrideHue = super.field1260; // L: 290
					var3.overrideSaturation = super.field1218; // L: 291
					var3.overrideLuminance = super.field1212; // L: 292
					var3.overrideAmount = super.field1250; // L: 293
					var3.field2778 = (short)var4; // L: 294
				} else {
					var3.overrideAmount = 0; // L: 297
				}

				return var3; // L: 299
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-458663829"
	)
	boolean method2305() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) { // L: 187
			this.checkIsFriend(); // L: 188
		}

		return this.isFriendTriBool == TriBool.TriBool_true; // L: 190
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1612741711"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 194
	} // L: 195

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1885104280"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = class299.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 198
	} // L: 199

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-563231680"
	)
	boolean method2308() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) { // L: 202
			this.updateIsInFriendsChat(); // L: 203
		}

		return this.isInFriendsChat == TriBool.TriBool_true; // L: 205
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2081555377"
	)
	void method2309() {
		this.isInFriendsChat = TriBool.TriBool_unknown; // L: 209
	} // L: 210

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-690843287"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = ReflectionCheck.friendsChatManager != null && ReflectionCheck.friendsChatManager.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 213
	} // L: 214

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "816626450"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) { // L: 217
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3189(this.username.getName()) != -1 && var1 != 2) { // L: 218 219
				this.isInClanChat = TriBool.TriBool_true; // L: 220
				return; // L: 221
			}
		}

		this.isInClanChat = TriBool.TriBool_false; // L: 225
	} // L: 226

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1097598998"
	)
	void method2353() {
		this.isInClanChat = TriBool.TriBool_unknown; // L: 229
	} // L: 230

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1383064946"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) { // L: 233
			this.updateIsInClanChat(); // L: 234
		}

		return this.isInClanChat == TriBool.TriBool_true; // L: 236
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1884466033"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? class90.getNpcDefinition(this.appearance.npcTransformId).size : 1; // L: 240 241 243
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IILin;I)V",
		garbageValue = "-1206182432"
	)
	final void method2345(int var1, int var2, class217 var3) {
		if (super.sequence != -1 && EnumComposition.SequenceDefinition_get(super.sequence).field2326 == 1) { // L: 303
			super.sequence = -1;
		}

		this.method2393(); // L: 304
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) { // L: 305
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) { // L: 306
				if (var3 == class217.field2407) { // L: 308
					Player var4 = this; // L: 309
					class217 var5 = class217.field2407; // L: 310
					int var6 = super.pathX[0]; // L: 312
					int var7 = super.pathY[0]; // L: 313
					int var8 = this.transformedSize(); // L: 314
					if (var6 >= var8 && var6 < 104 - var8 && var7 >= var8 && var7 < 104 - var8 && var1 >= var8 && var1 < 104 - var8 && var2 >= var8 && var2 < 104 - var8) { // L: 315 316
						int var10 = this.transformedSize(); // L: 318
						RouteStrategy var11 = class299.method5715(var1, var2); // L: 319
						CollisionMap var12 = Client.collisionMaps[this.plane]; // L: 320
						int[] var13 = Client.field829; // L: 321
						int[] var14 = Client.field830; // L: 322
						int var9 = class4.method13(var6, var7, var10, var11, var12, true, var13, var14, class218.field2412[0]); // L: 324
						int var15 = var9; // L: 326
						if (var9 >= 1) { // L: 327
							for (int var16 = 0; var16 < var15 - 1; ++var16) { // L: 328
								var4.method2334(Client.field829[var16], Client.field830[var16], var5);
							}
						}
					}
				}

				this.method2334(var1, var2, var3); // L: 331
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	} // L: 333

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1786168705"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0; // L: 336
		super.field1261 = 0; // L: 337
		super.field1271 = 0; // L: 338
		super.pathX[0] = var1; // L: 339
		super.pathY[0] = var2; // L: 340
		int var3 = this.transformedSize(); // L: 341
		super.x = var3 * 64 + super.pathX[0] * 128; // L: 342
		super.y = super.pathY[0] * 128 + var3 * 64; // L: 343
	} // L: 344

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IILin;I)V",
		garbageValue = "112065194"
	)
	final void method2334(int var1, int var2, class217 var3) {
		if (super.pathLength < 9) { // L: 347
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) { // L: 348
			super.pathX[var4] = super.pathX[var4 - 1]; // L: 349
			super.pathY[var4] = super.pathY[var4 - 1]; // L: 350
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1]; // L: 351
		}

		super.pathX[0] = var1; // L: 353
		super.pathY[0] = var2; // L: 354
		super.pathTraversed[0] = var3; // L: 355
	} // L: 356

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "381940201"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null; // L: 359
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "-1849336655"
	)
	static int method2354(int var0, Script var1, boolean var2) {
		Widget var3 = class92.getWidget(Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]); // L: 1861
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) { // L: 1862
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = HealthBarDefinition.Widget_unpackTargetMask(class194.getWidgetFlags(var3)); // L: 1863
			return 1; // L: 1864
		} else if (var0 != ScriptOpcodes.IF_GETOP) { // L: 1866
			if (var0 == ScriptOpcodes.IF_GETOPBASE) { // L: 1873
				if (var3.dataText == null) { // L: 1874
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1875
				}

				return 1; // L: 1876
			} else {
				return 2; // L: 1878
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 1867
			--var4; // L: 1868
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1869
				Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1870
			} else {
				Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1871
		}
	}

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1159741420"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3174, Client.packetWriter.isaacCipher); // L: 12624
		var0.packetBuffer.writeByte(0); // L: 12625
		Client.packetWriter.addNode(var0); // L: 12626
	} // L: 12627
}
