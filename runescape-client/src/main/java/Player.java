import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dj")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("jz")
	static byte[][] field1163;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lvn;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 220135685
	)
	int field1135;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1824775655
	)
	int field1159;
	@ObfuscatedName("as")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 390481241
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -155352863
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1450972121
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1789956059
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -885798137
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1313065405
	)
	int field1144;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1316361177
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 500198341
	)
	int field1146;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1869927091
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 903529191
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -2073638373
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 642011955
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("ay")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -694155901
	)
	@Export("team")
	int team;
	@ObfuscatedName("ac")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -689360121
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1576791471
	)
	@Export("index")
	int index;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("bd")
	boolean field1147;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -711103877
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -736458179
	)
	@Export("tileY")
	int tileY;

	Player() {
		this.field1135 = -1; // L: 19
		this.field1159 = -1; // L: 20
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;B)V",
		garbageValue = "80"
	)
	@Export("read")
	final void read(Buffer var1) {
		var1.offset = 0; // L: 56
		byte var2 = var1.readByte(); // L: 57
		boolean var3 = true; // L: 58
		this.field1135 = var1.readByte(); // L: 59
		this.field1159 = var1.readByte(); // L: 60
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
					var9 = ArchiveDiskActionHandler.ItemComposition_get(var5[var6] - 512).field2223; // L: 77
					if (var9 != 0) { // L: 78
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
			if (var9 < 0 || var9 >= class407.field4547[var8].length) { // L: 94
				var9 = 0;
			}

			var27[var8] = var9; // L: 95
		}

		super.idleSequence = var1.readUnsignedShort(); // L: 97
		if (super.idleSequence == 65535) { // L: 98
			super.idleSequence = -1;
		}

		super.field1266 = var1.readUnsignedShort(); // L: 99
		if (super.field1266 == 65535) { // L: 100
			super.field1266 = -1;
		}

		super.field1213 = super.field1266; // L: 101
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), FriendLoginUpdate.loginType); // L: 112
		this.clearIsFriend(); // L: 113
		this.method2390(); // L: 114
		this.method2388(); // L: 115
		if (this == VarpDefinition.localPlayer) { // L: 116
			RunException.field5364 = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte(); // L: 117
		this.skillLevel = var1.readUnsignedShort(); // L: 118
		this.isHidden = var1.readUnsignedByte() == 1; // L: 119
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) { // L: 120
			this.isHidden = false;
		}

		class170[] var28 = null; // L: 121
		boolean var30 = false; // L: 122
		int var10 = var1.readUnsignedShort(); // L: 123
		var30 = (var10 >> 15 & 1) == 1; // L: 124
		int var11;
		if (var10 > 0 && var10 != 32768) { // L: 125
			var28 = new class170[12]; // L: 126

			for (var11 = 0; var11 < 12; ++var11) { // L: 127
				int var12 = var10 >> 12 - var11 & 1; // L: 128
				if (var12 == 1) { // L: 129
					int var16 = var5[var11] - 512; // L: 133
					int var17 = var1.readUnsignedByte(); // L: 135
					boolean var18 = (var17 & 1) != 0; // L: 136
					boolean var19 = (var17 & 2) != 0; // L: 137
					class170 var20 = new class170(var16); // L: 138
					int var21;
					int[] var22;
					boolean var23;
					int var24;
					short var25;
					if (var18) { // L: 139
						var21 = var1.readUnsignedByte(); // L: 140
						var22 = new int[]{var21 & 15, var21 >> 4 & 15}; // L: 141 142 143
						var23 = var20.field1834 != null && var22.length == var20.field1834.length; // L: 144

						for (var24 = 0; var24 < 2; ++var24) { // L: 145
							if (var22[var24] != 15) { // L: 146
								var25 = (short)var1.readUnsignedShort(); // L: 147
								if (var23) { // L: 148
									var20.field1834[var22[var24]] = var25; // L: 149
								}
							}
						}
					}

					if (var19) { // L: 154
						var21 = var1.readUnsignedByte(); // L: 155
						var22 = new int[]{var21 & 15, var21 >> 4 & 15}; // L: 156 157 158
						var23 = var20.field1835 != null && var22.length == var20.field1835.length; // L: 159

						for (var24 = 0; var24 < 2; ++var24) { // L: 160
							if (var22[var24] != 15) { // L: 161
								var25 = (short)var1.readUnsignedShort(); // L: 162
								if (var23) { // L: 163
									var20.field1835[var22[var24]] = var25; // L: 164
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

		this.appearance.method6467(var26, var5, var28, var30, var27, var2, var4, var29); // L: 180
	} // L: 181

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lkz;",
		garbageValue = "1036754463"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) { // L: 244
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? MilliClock.SequenceDefinition_get(super.sequence) : null; // L: 245
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.movementSequence == super.idleSequence && var1 != null ? null : MilliClock.SequenceDefinition_get(super.movementSequence); // L: 246
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 247
			if (var3 == null) { // L: 248
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 249
				super.defaultHeight = var3.height; // L: 250
				int var4 = var3.indicesCount; // L: 251
				if (!this.isUnanimated) { // L: 252
					var3 = this.method2469(var3); // L: 253
				}

				if (!this.isUnanimated && this.model0 != null) { // L: 255
					if (Client.cycle >= this.animationCycleEnd) { // L: 256
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) { // L: 257
						Model var5 = this.model0; // L: 258
						var5.offsetBy(this.field1144 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1146 * 4096 - super.y); // L: 259
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

						var5.offsetBy(super.x - this.field1144 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1146 * 4096); // L: 282
					}
				}

				var3.isSingleTile = true; // L: 285
				if (super.field1255 != 0 && Client.cycle >= super.field1262 && Client.cycle < super.field1278) { // L: 286
					var3.overrideHue = super.field1268; // L: 287
					var3.overrideSaturation = super.field1269; // L: 288
					var3.overrideLuminance = super.field1276; // L: 289
					var3.overrideAmount = super.field1255; // L: 290
					var3.field3059 = (short)var4; // L: 291
				} else {
					var3.overrideAmount = 0; // L: 294
				}

				return var3; // L: 296
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1732942306"
	)
	boolean method2386() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) { // L: 184
			this.checkIsFriend(); // L: 185
		}

		return this.isFriendTriBool == TriBool.TriBool_true; // L: 187
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1877485699"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 191
	} // L: 192

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2081922763"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = InterfaceParent.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 195
	} // L: 196

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1964405610"
	)
	boolean method2389() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) { // L: 199
			this.updateIsInFriendsChat(); // L: 200
		}

		return this.isInFriendsChat == TriBool.TriBool_true; // L: 202
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1461345651"
	)
	void method2390() {
		this.isInFriendsChat = TriBool.TriBool_unknown; // L: 206
	} // L: 207

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "862221179"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = Projectile.friendsChatManager != null && Projectile.friendsChatManager.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 210
	} // L: 211

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-2"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) { // L: 214
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3390(this.username.getName()) != -1 && var1 != 2) { // L: 215 216
				this.isInClanChat = TriBool.TriBool_true; // L: 217
				return; // L: 218
			}
		}

		this.isInClanChat = TriBool.TriBool_false; // L: 222
	} // L: 223

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-58"
	)
	void method2388() {
		this.isInClanChat = TriBool.TriBool_unknown; // L: 226
	} // L: 227

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1766189372"
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
		descriptor = "(B)I",
		garbageValue = "-26"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? VarcInt.getNpcDefinition(this.appearance.npcTransformId).size : 1; // L: 237 238 240
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IILip;I)V",
		garbageValue = "1011163909"
	)
	final void method2433(int var1, int var2, class233 var3) {
		if (super.sequence != -1 && MilliClock.SequenceDefinition_get(super.sequence).field2273 == 1) { // L: 300
			super.sequence = -1;
		}

		this.method2470(); // L: 301
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) { // L: 302
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) { // L: 303
				if (var3 == class233.field2472) { // L: 305
					Player var4 = this; // L: 306
					class233 var5 = class233.field2472; // L: 307
					int var6 = super.pathX[0]; // L: 309
					int var7 = super.pathY[0]; // L: 310
					int var8 = this.transformedSize(); // L: 311
					if (var6 >= var8 && var6 < 104 - var8 && var7 >= var8 && var7 < 104 - var8 && var1 >= var8 && var1 < 104 - var8 && var2 >= var8 && var2 < 104 - var8) { // L: 312 313
						int var9 = Client.field827.method4571(var6, var7, this.transformedSize(), ModeWhere.method7374(var1, var2), Client.collisionMaps[this.plane], true, Client.field747, Client.field833); // L: 314
						if (var9 >= 1) { // L: 315
							for (int var10 = 0; var10 < var9 - 1; ++var10) { // L: 316
								var4.method2435(Client.field747[var10], Client.field833[var10], var5);
							}
						}
					}
				}

				this.method2435(var1, var2, var3); // L: 319
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	} // L: 321

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-933652265"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0; // L: 324
		super.field1280 = 0; // L: 325
		super.field1279 = 0; // L: 326
		super.pathX[0] = var1; // L: 327
		super.pathY[0] = var2; // L: 328
		int var3 = this.transformedSize(); // L: 329
		super.x = super.pathX[0] * 128 + var3 * 64; // L: 330
		super.y = var3 * 64 + super.pathY[0] * 128; // L: 331
	} // L: 332

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IILip;I)V",
		garbageValue = "-609876944"
	)
	final void method2435(int var1, int var2, class233 var3) {
		if (super.pathLength < 9) { // L: 335
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) { // L: 336
			super.pathX[var4] = super.pathX[var4 - 1]; // L: 337
			super.pathY[var4] = super.pathY[var4 - 1]; // L: 338
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1]; // L: 339
		}

		super.pathX[0] = var1; // L: 341
		super.pathY[0] = var2; // L: 342
		super.pathTraversed[0] = var3; // L: 343
	} // L: 344

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "16409"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null; // L: 347
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "450825303"
	)
	public static int method2436(int var0, int var1) {
		return (var0 << 8) + var1; // L: 14
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-1936855348"
	)
	static int method2437(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 2704
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.cycle; // L: 2705
			return 1; // L: 2706
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 2708
				Interpreter.Interpreter_intStackSize -= 2; // L: 2709
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2710
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2711
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class218.method4260(var3, var4); // L: 2712
				return 1; // L: 2713
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 2715
				Interpreter.Interpreter_intStackSize -= 2; // L: 2716
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2717
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2718
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class223.ItemContainer_getCount(var3, var4); // L: 2719
				return 1; // L: 2720
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 2722
				Interpreter.Interpreter_intStackSize -= 2; // L: 2723
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2724
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2725
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class402.method7575(var3, var4); // L: 2726
				return 1; // L: 2727
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 2729
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2730
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class91.getInvDefinition(var3).size; // L: 2731
				return 1; // L: 2732
			} else if (var0 == ScriptOpcodes.STAT) { // L: 2734
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2735
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.currentLevels[var3]; // L: 2736
				return 1; // L: 2737
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 2739
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2740
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.levels[var3]; // L: 2741
				return 1; // L: 2742
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 2744
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2745
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.experience[var3]; // L: 2746
				return 1; // L: 2747
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 2749
					var3 = class473.Client_plane; // L: 2750
					var4 = Projectile.baseX * 64 + (VarpDefinition.localPlayer.x >> 7); // L: 2751
					var5 = GameEngine.baseY * 8 + (VarpDefinition.localPlayer.y >> 7); // L: 2752
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28); // L: 2753
					return 1; // L: 2754
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 2756
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2757
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 14 & 16383; // L: 2758
					return 1; // L: 2759
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 2761
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2762
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 28; // L: 2763
					return 1; // L: 2764
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 2766
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2767
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 & 16383; // L: 2768
					return 1; // L: 2769
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 2771
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0; // L: 2772
					return 1; // L: 2773
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 2775
					Interpreter.Interpreter_intStackSize -= 2; // L: 2776
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 2777
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2778
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class218.method4260(var3, var4); // L: 2779
					return 1; // L: 2780
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 2782
					Interpreter.Interpreter_intStackSize -= 2; // L: 2783
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 2784
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2785
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class223.ItemContainer_getCount(var3, var4); // L: 2786
					return 1; // L: 2787
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 2789
					Interpreter.Interpreter_intStackSize -= 2; // L: 2790
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 2791
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2792
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class402.method7575(var3, var4); // L: 2793
					return 1; // L: 2794
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 2796
					if (Client.staffModLevel >= 2) { // L: 2797
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2798
					}

					return 1; // L: 2799
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 2801
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rebootTimer; // L: 2802
					return 1; // L: 2803
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 2805
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldId; // L: 2806
					return 1; // L: 2807
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 2809
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field704 / 100; // L: 2810
					return 1; // L: 2811
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 2813
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.weight; // L: 2814
					return 1; // L: 2815
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 2817
					if (Client.playerMod) { // L: 2818
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2819
					}

					return 1; // L: 2820
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 2822
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldProperties; // L: 2823
					return 1; // L: 2824
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 2826
					Interpreter.Interpreter_intStackSize -= 4; // L: 2827
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2828
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2829
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2830
					int var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 2831
					var3 += var4 << 14; // L: 2832
					var3 += var5 << 28; // L: 2833
					var3 += var6; // L: 2834
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 2835
					return 1; // L: 2836
				} else if (var0 == 3326) { // L: 2838
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field557; // L: 2839
					return 1; // L: 2840
				} else if (var0 == 3327) { // L: 2842
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field697; // L: 2843
					return 1; // L: 2844
				} else if (var0 == 3331) { // L: 2846
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field704; // L: 2847
					return 1; // L: 2848
				} else if (var0 == 3332) { // L: 2850
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2851
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field672[var3]; // L: 2852
					return 1; // L: 2853
				} else {
					return 2; // L: 2855
				}
			}
		}
	}
}
