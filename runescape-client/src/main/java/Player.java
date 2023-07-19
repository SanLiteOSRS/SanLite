import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2067463355
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1967045621
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("ap")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 290276077
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 617206815
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1103371465
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1890343403
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -659362285
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -847055037
	)
	int field1118;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1490573629
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1604650675
	)
	int field1120;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1135265183
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1805464923
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -223923427
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1335522625
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("ae")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 127559855
	)
	@Export("team")
	int team;
	@ObfuscatedName("aq")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1140494033
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1275986061
	)
	@Export("index")
	int index;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("by")
	boolean field1138;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -140446059
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 879443365
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
		this.field1138 = false; // L: 49
	} // L: 53

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltl;B)V",
		garbageValue = "-108"
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
					var9 = class141.ItemComposition_get(var5[var6] - 512).team; // L: 77
					if (var9 != 0) { // L: 78
						this.team = var9;
					}
				}
			}
		}

		int[] var13 = null; // L: 81
		if (Client.field507 >= 213) { // L: 82
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
			if (var9 < 0 || var9 >= class339.field3795[var8].length) { // L: 97
				var9 = 0;
			}

			var14[var8] = var9; // L: 98
		}

		super.idleSequence = var1.readUnsignedShort(); // L: 100
		if (super.idleSequence == 65535) { // L: 101
			super.idleSequence = -1;
		}

		super.field1184 = var1.readUnsignedShort(); // L: 102
		if (super.field1184 == 65535) { // L: 103
			super.field1184 = -1;
		}

		super.field1185 = super.field1184; // L: 104
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), ObjectSound.loginType); // L: 115
		this.clearIsFriend(); // L: 116
		this.clearIsInFriendsChat(); // L: 117
		this.method2354(); // L: 118
		if (this == class27.localPlayer) { // L: 119
			RunException.field5234 = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte(); // L: 120
		this.skillLevel = var1.readUnsignedShort(); // L: 121
		this.isHidden = var1.readUnsignedByte() == 1; // L: 122
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) { // L: 123
			this.isHidden = false;
		}

		class184[] var15 = null; // L: 124
		boolean var17 = false;
		int var10 = var1.readUnsignedShort(); // L: 126
		var17 = (var10 >> 15 & 1) == 1; // L: 127
		int var11;
		if (var10 > 0 && var10 != 32768) { // L: 128
			var15 = new class184[12]; // L: 129

			for (var11 = 0; var11 < 12; ++var11) { // L: 130
				int var12 = var10 >> 12 - var11 & 1; // L: 131
				if (var12 == 1) { // L: 132
					var15[var11] = PacketWriter.method2870(var5[var11] - 512, var1); // L: 133
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

		this.appearance.method6127(var13, var5, var15, var17, var14, var2, var4, var16); // L: 142
	} // L: 143

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Ljr;",
		garbageValue = "63"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) { // L: 206
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class140.SequenceDefinition_get(super.sequence) : null; // L: 207
			SequenceDefinition var2 = super.movementSequence != -1 && !this.isUnanimated && (super.movementSequence != super.idleSequence || var1 == null) ? class140.SequenceDefinition_get(super.movementSequence) : null; // L: 208
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 209
			if (var3 == null) { // L: 210
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 211
				super.defaultHeight = var3.height; // L: 212
				int var4 = var3.indicesCount; // L: 213
				if (!this.isUnanimated) { // L: 214
					var3 = this.method2452(var3); // L: 215
				}

				if (!this.isUnanimated && this.model0 != null) { // L: 217
					if (Client.cycle >= this.animationCycleEnd) { // L: 218
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) { // L: 219
						Model var5 = this.model0; // L: 220
						var5.offsetBy(this.field1118 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1120 * 4096 - super.y); // L: 221
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

						var5.offsetBy(super.x - this.field1118 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1120 * 4096); // L: 244
					}
				}

				var3.isSingleTile = true; // L: 247
				if (super.field1243 != 0 && Client.cycle >= super.field1183 && Client.cycle < super.field1189) { // L: 248
					var3.overrideHue = super.field1240; // L: 249
					var3.overrideSaturation = super.field1247; // L: 250
					var3.overrideLuminance = super.field1190; // L: 251
					var3.overrideAmount = super.field1243; // L: 252
					var3.field2699 = (short)var4; // L: 253
				} else {
					var3.overrideAmount = 0; // L: 256
				}

				return var3; // L: 258
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "753286784"
	)
	boolean method2347() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) { // L: 146
			this.checkIsFriend(); // L: 147
		}

		return this.isFriendTriBool == TriBool.TriBool_true;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "694975078"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 153
	} // L: 154

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1066097835"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = class162.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 157
	} // L: 158

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2088224021"
	)
	boolean method2392() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) { // L: 161
			this.updateIsInFriendsChat(); // L: 162
		}

		return this.isInFriendsChat == TriBool.TriBool_true; // L: 164
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1838207327"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown; // L: 168
	} // L: 169

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "42"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = ObjectSound.friendsChatManager != null && ObjectSound.friendsChatManager.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 172
	} // L: 173

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2121954464"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) { // L: 176
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3289(this.username.getName()) != -1 && var1 != 2) { // L: 177 178
				this.isInClanChat = TriBool.TriBool_true; // L: 179
				return; // L: 180
			}
		}

		this.isInClanChat = TriBool.TriBool_false; // L: 184
	} // L: 185

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1959205692"
	)
	void method2354() {
		this.isInClanChat = TriBool.TriBool_unknown; // L: 188
	} // L: 189

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1965791510"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) { // L: 192
			this.updateIsInClanChat(); // L: 193
		}

		return this.isInClanChat == TriBool.TriBool_true; // L: 195
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1037136304"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? class144.getNpcDefinition(this.appearance.npcTransformId).size : 1; // L: 199 200 202
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IILia;I)V",
		garbageValue = "-1572944891"
	)
	final void method2358(int var1, int var2, class217 var3) {
		if (super.sequence != -1 && class140.SequenceDefinition_get(super.sequence).field2275 == 1) { // L: 262
			super.sequence = -1;
		}

		this.method2424(); // L: 263
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) { // L: 264
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) { // L: 265
				if (var3 == class217.field2395) { // L: 267
					Player var4 = this; // L: 268
					class217 var5 = class217.field2395; // L: 269
					int var6 = super.pathX[0]; // L: 271
					int var7 = super.pathY[0]; // L: 272
					int var8 = this.transformedSize(); // L: 273
					if (var6 >= var8 && var6 < 104 - var8 && var7 >= var8 && var7 < 104 - var8 && var1 >= var8 && var1 < 104 - var8 && var2 >= var8 && var2 < 104 - var8) { // L: 274 275
						int var10 = this.transformedSize(); // L: 277
						Client.field798.approxDestinationX = var1; // L: 280
						Client.field798.approxDestinationY = var2; // L: 281
						Client.field798.field2378 = 1; // L: 282
						Client.field798.field2380 = 1; // L: 283
						ApproximateRouteStrategy var11 = Client.field798; // L: 284
						ApproximateRouteStrategy var12 = var11; // L: 286
						CollisionMap var13 = Client.collisionMaps[this.plane]; // L: 287
						int[] var14 = Client.field799; // L: 288
						int[] var15 = Client.field800; // L: 289
						class216 var17 = class218.field2400[0]; // L: 292
						var17.method4352(); // L: 294
						int var18 = var17.method4344(); // L: 295
						int var19 = var17.method4340(); // L: 296
						int[][] var20 = var17.method4347(); // L: 297
						int[][] var21 = var17.method4339(); // L: 298
						int[] var22 = var17.method4348(); // L: 299
						int[] var23 = var17.method4349(); // L: 300
						boolean var24;
						int var26;
						int var27;
						int var32;
						int var33;
						int var34;
						int var35;
						int var36;
						int var37;
						int var38;
						int var40;
						int var42;
						int var52;
						if (var10 == 1) { // L: 302
							var26 = var17.method4344(); // L: 305
							var27 = var17.method4340(); // L: 306
							int[][] var28 = var17.method4347(); // L: 307
							int[][] var29 = var17.method4339(); // L: 308
							int[] var30 = var17.method4348(); // L: 309
							int[] var31 = var17.method4349(); // L: 310
							var32 = var17.method4350(); // L: 311
							var33 = var6; // L: 312
							var34 = var7; // L: 313
							var35 = var26 >> 1; // L: 314
							var36 = var27 >> 1; // L: 315
							var37 = var6 - var35; // L: 316
							var38 = var7 - var36; // L: 317
							var29[var35][var36] = 99; // L: 318
							var28[var35][var36] = 0; // L: 319
							byte var39 = 0; // L: 320
							var40 = 0; // L: 321
							var30[var39] = var6; // L: 322
							var52 = var39 + 1; // L: 323
							var31[var39] = var7;
							int[][] var41 = var13.flags; // L: 324

							boolean var25;
							while (true) {
								if (var40 == var52) { // L: 327
									var17.method4341(var33, var34); // L: 398
									var25 = false; // L: 399
									break;
								}

								var33 = var30[var40]; // L: 328
								var34 = var31[var40]; // L: 329
								var40 = var40 + 1 & var32; // L: 330
								var35 = var33 - var37; // L: 331
								var36 = var34 - var38; // L: 332
								var42 = var33 - var13.xInset; // L: 333
								int var43 = var34 - var13.yInset; // L: 334
								if (var12.hasArrived(1, var33, var34, var13)) { // L: 335
									var17.method4341(var33, var34); // L: 336
									var25 = true; // L: 337
									break;
								}

								int var44 = var28[var35][var36] + 1; // L: 340
								if (var35 > 0 && var29[var35 - 1][var36] == 0 && (var41[var42 - 1][var43] & 19136776) == 0) { // L: 341
									var30[var52] = var33 - 1; // L: 342
									var31[var52] = var34; // L: 343
									var52 = var52 + 1 & var32; // L: 344
									var29[var35 - 1][var36] = 2; // L: 345
									var28[var35 - 1][var36] = var44; // L: 346
								}

								if (var35 < var26 - 1 && var29[var35 + 1][var36] == 0 && (var41[var42 + 1][var43] & 19136896) == 0) { // L: 348
									var30[var52] = var33 + 1; // L: 349
									var31[var52] = var34; // L: 350
									var52 = var52 + 1 & var32; // L: 351
									var29[var35 + 1][var36] = 8; // L: 352
									var28[var35 + 1][var36] = var44; // L: 353
								}

								if (var36 > 0 && var29[var35][var36 - 1] == 0 && (var41[var42][var43 - 1] & 19136770) == 0) { // L: 355
									var30[var52] = var33; // L: 356
									var31[var52] = var34 - 1; // L: 357
									var52 = var52 + 1 & var32; // L: 358
									var29[var35][var36 - 1] = 1; // L: 359
									var28[var35][var36 - 1] = var44; // L: 360
								}

								if (var36 < var27 - 1 && var29[var35][var36 + 1] == 0 && (var41[var42][var43 + 1] & 19136800) == 0) { // L: 362
									var30[var52] = var33; // L: 363
									var31[var52] = var34 + 1; // L: 364
									var52 = var52 + 1 & var32; // L: 365
									var29[var35][var36 + 1] = 4; // L: 366
									var28[var35][var36 + 1] = var44; // L: 367
								}

								if (var35 > 0 && var36 > 0 && var29[var35 - 1][var36 - 1] == 0 && (var41[var42 - 1][var43 - 1] & 19136782) == 0 && (var41[var42 - 1][var43] & 19136776) == 0 && (var41[var42][var43 - 1] & 19136770) == 0) { // L: 369
									var30[var52] = var33 - 1; // L: 370
									var31[var52] = var34 - 1; // L: 371
									var52 = var52 + 1 & var32; // L: 372
									var29[var35 - 1][var36 - 1] = 3; // L: 373
									var28[var35 - 1][var36 - 1] = var44; // L: 374
								}

								if (var35 < var26 - 1 && var36 > 0 && var29[var35 + 1][var36 - 1] == 0 && (var41[var42 + 1][var43 - 1] & 19136899) == 0 && (var41[var42 + 1][var43] & 19136896) == 0 && (var41[var42][var43 - 1] & 19136770) == 0) { // L: 376
									var30[var52] = var33 + 1; // L: 377
									var31[var52] = var34 - 1; // L: 378
									var52 = var52 + 1 & var32; // L: 379
									var29[var35 + 1][var36 - 1] = 9; // L: 380
									var28[var35 + 1][var36 - 1] = var44; // L: 381
								}

								if (var35 > 0 && var36 < var27 - 1 && var29[var35 - 1][var36 + 1] == 0 && (var41[var42 - 1][var43 + 1] & 19136824) == 0 && (var41[var42 - 1][var43] & 19136776) == 0 && (var41[var42][var43 + 1] & 19136800) == 0) { // L: 383
									var30[var52] = var33 - 1; // L: 384
									var31[var52] = var34 + 1; // L: 385
									var52 = var52 + 1 & var32; // L: 386
									var29[var35 - 1][var36 + 1] = 6; // L: 387
									var28[var35 - 1][var36 + 1] = var44; // L: 388
								}

								if (var35 < var26 - 1 && var36 < var27 - 1 && var29[var35 + 1][var36 + 1] == 0 && (var41[var42 + 1][var43 + 1] & 19136992) == 0 && (var41[var42 + 1][var43] & 19136896) == 0 && (var41[var42][var43 + 1] & 19136800) == 0) { // L: 390
									var30[var52] = var33 + 1; // L: 391
									var31[var52] = var34 + 1; // L: 392
									var52 = var52 + 1 & var32; // L: 393
									var29[var35 + 1][var36 + 1] = 12; // L: 394
									var28[var35 + 1][var36 + 1] = var44; // L: 395
								}
							}

							var24 = var25; // L: 401
						} else if (var10 == 2) { // L: 403
							var24 = SecureRandomCallable.method2271(var6, var7, var11, var13, var17);
						} else {
							var24 = Skills.method6648(var6, var7, var10, var11, var13, var17); // L: 404
						}

						int var16;
						label370: {
							int var51 = var6 - (var18 >> 1); // L: 405
							var26 = var7 - (var19 >> 1); // L: 406
							var27 = var17.method4342(); // L: 407
							int var45 = var17.method4343(); // L: 408
							int var46;
							int var47;
							if (!var24) { // L: 409
								var46 = Integer.MAX_VALUE; // L: 411
								var47 = Integer.MAX_VALUE; // L: 412
								byte var48 = 10; // L: 413
								var32 = var12.approxDestinationX; // L: 414
								var33 = var12.approxDestinationY; // L: 415
								var34 = var12.field2378; // L: 416
								var35 = var12.field2380; // L: 417

								for (var36 = var32 - var48; var36 <= var48 + var32; ++var36) { // L: 418
									for (var37 = var33 - var48; var37 <= var33 + var48; ++var37) { // L: 419
										var38 = var36 - var51; // L: 420
										var52 = var37 - var26; // L: 421
										if (var38 >= 0 && var52 >= 0 && var38 < var18 && var52 < var19 && var20[var38][var52] < 100) { // L: 422 423
											var40 = 0; // L: 424
											if (var36 < var32) { // L: 425
												var40 = var32 - var36;
											} else if (var36 > var32 + var34 - 1) { // L: 426
												var40 = var36 - (var32 + var34 - 1);
											}

											int var50 = 0; // L: 427
											if (var37 < var33) { // L: 428
												var50 = var33 - var37;
											} else if (var37 > var35 + var33 - 1) { // L: 429
												var50 = var37 - (var33 + var35 - 1);
											}

											var42 = var40 * var40 + var50 * var50; // L: 430
											if (var42 < var46 || var42 == var46 && var20[var38][var52] < var47) { // L: 431
												var46 = var42; // L: 432
												var47 = var20[var38][var52]; // L: 433
												var27 = var36; // L: 434
												var45 = var37; // L: 435
											}
										}
									}
								}

								if (var46 == Integer.MAX_VALUE) { // L: 441
									var16 = -1; // L: 442
									break label370;
								}
							}

							if (var27 == var6 && var7 == var45) { // L: 451
								var14[0] = var27; // L: 452
								var15[0] = var45; // L: 453
								var16 = 0; // L: 454
							} else {
								byte var53 = 0; // L: 457
								var22[var53] = var27; // L: 460
								var46 = var53 + 1; // L: 461
								var23[var53] = var45;

								int var54;
								for (var47 = var54 = var21[var27 - var51][var45 - var26]; var27 != var6 || var7 != var45; var47 = var21[var27 - var51][var45 - var26]) { // L: 462 463 473
									if (var47 != var54) { // L: 464
										var54 = var47; // L: 465
										var22[var46] = var27; // L: 466
										var23[var46++] = var45; // L: 467
									}

									if ((var47 & 2) != 0) { // L: 469
										++var27;
									} else if ((var47 & 8) != 0) { // L: 470
										--var27;
									}

									if ((var47 & 1) != 0) { // L: 471
										++var45;
									} else if ((var47 & 4) != 0) { // L: 472
										--var45;
									}
								}

								var32 = 0; // L: 475

								while (var46-- > 0) { // L: 476
									var14[var32] = var22[var46]; // L: 477
									var15[var32++] = var23[var46]; // L: 478
									if (var32 >= var14.length) { // L: 479
										break;
									}
								}

								var16 = var32; // L: 481
							}
						}

						var16 = var16; // L: 485
						if (var16 >= 1) { // L: 486
							for (int var49 = 0; var49 < var16 - 1; ++var49) { // L: 487
								var4.method2360(Client.field799[var49], Client.field800[var49], var5);
							}
						}
					}
				}

				this.method2360(var1, var2, var3); // L: 490
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	} // L: 492

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-396430013"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0; // L: 495
		super.field1252 = 0; // L: 496
		super.field1251 = 0; // L: 497
		super.pathX[0] = var1; // L: 498
		super.pathY[0] = var2; // L: 499
		int var3 = this.transformedSize(); // L: 500
		super.x = super.pathX[0] * 128 + var3 * 64; // L: 501
		super.y = var3 * 64 + super.pathY[0] * 128; // L: 502
	} // L: 503

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IILia;B)V",
		garbageValue = "-51"
	)
	final void method2360(int var1, int var2, class217 var3) {
		if (super.pathLength < 9) { // L: 506
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) { // L: 507
			super.pathX[var4] = super.pathX[var4 - 1]; // L: 508
			super.pathY[var4] = super.pathY[var4 - 1]; // L: 509
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1]; // L: 510
		}

		super.pathX[0] = var1; // L: 512
		super.pathY[0] = var2; // L: 513
		super.pathTraversed[0] = var3; // L: 514
	} // L: 515

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "90"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null; // L: 518
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-2021649560"
	)
	public static int method2404(CharSequence var0) {
		int var1 = var0.length(); // L: 148
		int var2 = 0; // L: 149

		for (int var3 = 0; var3 < var1; ++var3) { // L: 150
			var2 = (var2 << 5) - var2 + var0.charAt(var3);
		}

		return var2; // L: 151
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-161682632"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1; // L: 125
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1559385031"
	)
	static final void method2402() {
		class332.method6585(false); // L: 5984
		Client.field566 = 0; // L: 5985
		boolean var0 = true; // L: 5986

		int var1;
		for (var1 = 0; var1 < BufferedNetSocket.regionLandArchives.length; ++var1) { // L: 5987
			if (class156.regionMapArchiveIds[var1] != -1 && BufferedNetSocket.regionLandArchives[var1] == null) { // L: 5988 5989
				BufferedNetSocket.regionLandArchives[var1] = Renderable.archive6.takeFile(class156.regionMapArchiveIds[var1], 0); // L: 5990
				if (BufferedNetSocket.regionLandArchives[var1] == null) { // L: 5991
					var0 = false; // L: 5992
					++Client.field566; // L: 5993
				}
			}

			if (class106.regionLandArchiveIds[var1] != -1 && class292.regionMapArchives[var1] == null) { // L: 5997 5998
				class292.regionMapArchives[var1] = Renderable.archive6.takeFileEncrypted(class106.regionLandArchiveIds[var1], 0, SpotAnimationDefinition.xteaKeys[var1]); // L: 5999
				if (class292.regionMapArchives[var1] == null) { // L: 6000
					var0 = false; // L: 6001
					++Client.field566; // L: 6002
				}
			}
		}

		if (!var0) { // L: 6007
			Client.field570 = 1; // L: 6008
		} else {
			Client.field568 = 0; // L: 6011
			var0 = true; // L: 6012

			int var3;
			int var4;
			for (var1 = 0; var1 < BufferedNetSocket.regionLandArchives.length; ++var1) { // L: 6013
				byte[] var17 = class292.regionMapArchives[var1]; // L: 6014
				if (var17 != null) { // L: 6015
					var3 = (SceneTilePaint.regions[var1] >> 8) * 64 - class166.baseX * 64; // L: 6016
					var4 = (SceneTilePaint.regions[var1] & 255) * 64 - class9.baseY * 64; // L: 6017
					if (Client.isInInstance) { // L: 6018
						var3 = 10; // L: 6019
						var4 = 10; // L: 6020
					}

					var0 &= SecureRandomFuture.method2174(var17, var3, var4); // L: 6022
				}
			}

			if (!var0) { // L: 6025
				Client.field570 = 2; // L: 6026
			} else {
				if (Client.field570 != 0) { // L: 6029
					FontName.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				class156.method3359(); // L: 6030
				class173.scene.clear(); // L: 6031

				for (var1 = 0; var1 < 4; ++var1) { // L: 6032
					Client.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) { // L: 6033
					for (var2 = 0; var2 < 104; ++var2) { // L: 6034
						for (var3 = 0; var3 < 104; ++var3) { // L: 6035
							Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 6036
						}
					}
				}

				class156.method3359(); // L: 6040
				FriendSystem.method1925(); // L: 6041
				var1 = BufferedNetSocket.regionLandArchives.length; // L: 6042
				class238.method4845(); // L: 6043
				class332.method6585(true); // L: 6044
				int var5;
				if (!Client.isInInstance) { // L: 6045
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) { // L: 6046
						var3 = (SceneTilePaint.regions[var2] >> 8) * 64 - class166.baseX * 64; // L: 6047
						var4 = (SceneTilePaint.regions[var2] & 255) * 64 - class9.baseY * 64; // L: 6048
						var16 = BufferedNetSocket.regionLandArchives[var2]; // L: 6049
						if (var16 != null) { // L: 6050
							class156.method3359(); // L: 6051
							class125.method2988(var16, var3, var4, class396.field4466 * 8 - 48, class343.field3847 * 8 - 48, Client.collisionMaps); // L: 6052
						}
					}

					for (var2 = 0; var2 < var1; ++var2) { // L: 6055
						var3 = (SceneTilePaint.regions[var2] >> 8) * 64 - class166.baseX * 64; // L: 6056
						var4 = (SceneTilePaint.regions[var2] & 255) * 64 - class9.baseY * 64; // L: 6057
						var16 = BufferedNetSocket.regionLandArchives[var2]; // L: 6058
						if (var16 == null && class343.field3847 < 800) { // L: 6059
							class156.method3359(); // L: 6060
							class106.method2748(var3, var4, 64, 64); // L: 6061
						}
					}

					class332.method6585(true); // L: 6064

					for (var2 = 0; var2 < var1; ++var2) { // L: 6065
						byte[] var15 = class292.regionMapArchives[var2]; // L: 6066
						if (var15 != null) { // L: 6067
							var4 = (SceneTilePaint.regions[var2] >> 8) * 64 - class166.baseX * 64; // L: 6068
							var5 = (SceneTilePaint.regions[var2] & 255) * 64 - class9.baseY * 64; // L: 6069
							class156.method3359(); // L: 6070
							class182.method3646(var15, var4, var5, class173.scene, Client.collisionMaps); // L: 6071
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.isInInstance) { // L: 6075
					int var9;
					int var10;
					int var11;
					for (var2 = 0; var2 < 4; ++var2) { // L: 6076
						class156.method3359(); // L: 6077

						for (var3 = 0; var3 < 13; ++var3) { // L: 6078
							for (var4 = 0; var4 < 13; ++var4) { // L: 6079
								boolean var18 = false; // L: 6080
								var6 = Client.field573[var2][var3][var4]; // L: 6081
								if (var6 != -1) { // L: 6082
									var7 = var6 >> 24 & 3; // L: 6083
									var8 = var6 >> 1 & 3; // L: 6084
									var9 = var6 >> 14 & 1023; // L: 6085
									var10 = var6 >> 3 & 2047; // L: 6086
									var11 = (var9 / 8 << 8) + var10 / 8; // L: 6087

									for (int var12 = 0; var12 < SceneTilePaint.regions.length; ++var12) { // L: 6088
										if (SceneTilePaint.regions[var12] == var11 && BufferedNetSocket.regionLandArchives[var12] != null) { // L: 6089
											int var13 = (var9 - var3) * 8; // L: 6090
											int var14 = (var10 - var4) * 8; // L: 6091
											GrandExchangeOfferUnitPriceComparator.method6973(BufferedNetSocket.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14, Client.collisionMaps); // L: 6092
											var18 = true; // L: 6093
											break;
										}
									}
								}

								if (!var18) { // L: 6098
									PacketBufferNode.method5746(var2, var3 * 8, var4 * 8); // L: 6099
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) { // L: 6104
						for (var3 = 0; var3 < 13; ++var3) { // L: 6105
							var4 = Client.field573[0][var2][var3]; // L: 6106
							if (var4 == -1) { // L: 6107
								class106.method2748(var2 * 8, var3 * 8, 8, 8); // L: 6108
							}
						}
					}

					class332.method6585(true); // L: 6112

					for (var2 = 0; var2 < 4; ++var2) { // L: 6113
						class156.method3359(); // L: 6114

						for (var3 = 0; var3 < 13; ++var3) { // L: 6115
							for (var4 = 0; var4 < 13; ++var4) { // L: 6116
								var5 = Client.field573[var2][var3][var4]; // L: 6117
								if (var5 != -1) { // L: 6118
									var6 = var5 >> 24 & 3; // L: 6119
									var7 = var5 >> 1 & 3; // L: 6120
									var8 = var5 >> 14 & 1023; // L: 6121
									var9 = var5 >> 3 & 2047; // L: 6122
									var10 = (var8 / 8 << 8) + var9 / 8; // L: 6123

									for (var11 = 0; var11 < SceneTilePaint.regions.length; ++var11) { // L: 6124
										if (SceneTilePaint.regions[var11] == var10 && class292.regionMapArchives[var11] != null) { // L: 6125
											Tiles.method2209(class292.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, class173.scene, Client.collisionMaps); // L: 6126
											break; // L: 6127
										}
									}
								}
							}
						}
					}
				}

				class332.method6585(true); // L: 6135
				class156.method3359(); // L: 6136
				InterfaceParent.method2302(class173.scene, Client.collisionMaps); // L: 6137
				class332.method6585(true); // L: 6138
				var2 = Tiles.Tiles_minPlane; // L: 6139
				if (var2 > BuddyRankComparator.Client_plane) { // L: 6140
					var2 = BuddyRankComparator.Client_plane;
				}

				if (var2 < BuddyRankComparator.Client_plane - 1) { // L: 6141
					var2 = BuddyRankComparator.Client_plane - 1;
				}

				if (Client.isLowDetail) { // L: 6142
					class173.scene.init(Tiles.Tiles_minPlane);
				} else {
					class173.scene.init(0); // L: 6143
				}

				for (var3 = 0; var3 < 104; ++var3) { // L: 6144
					for (var4 = 0; var4 < 104; ++var4) { // L: 6145
						class10.updateItemPile(var3, var4); // L: 6146
					}
				}

				class156.method3359(); // L: 6149
				class399.method7610(); // L: 6150
				ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 6151
				PacketBufferNode var19;
				if (class415.client.hasFrame()) { // L: 6152
					var19 = class217.getPacketBufferNode(ClientPacket.field3172, Client.packetWriter.isaacCipher); // L: 6154
					var19.packetBuffer.writeInt(1057001181); // L: 6155
					Client.packetWriter.addNode(var19); // L: 6156
				}

				if (!Client.isInInstance) { // L: 6158
					var3 = (class396.field4466 - 6) / 8; // L: 6159
					var4 = (class396.field4466 + 6) / 8; // L: 6160
					var5 = (class343.field3847 - 6) / 8; // L: 6161
					var6 = (class343.field3847 + 6) / 8; // L: 6162

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) { // L: 6163
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) { // L: 6164
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) { // L: 6165
								Renderable.archive6.loadRegionFromName("m" + var7 + "_" + var8); // L: 6166
								Renderable.archive6.loadRegionFromName("l" + var7 + "_" + var8); // L: 6167
							}
						}
					}
				}

				AttackOption.method2723(30); // L: 6171
				class156.method3359(); // L: 6172
				MidiPcmStream.method5959(); // L: 6173
				var19 = class217.getPacketBufferNode(ClientPacket.field3138, Client.packetWriter.isaacCipher); // L: 6174
				Client.packetWriter.addNode(var19); // L: 6175
				LoginPacket.method5767(); // L: 6176
			}
		}
	} // L: 6009 6027 6177
}
