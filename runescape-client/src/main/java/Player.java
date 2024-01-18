import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lvs;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -921814889
	)
	int field1099;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1481513959
	)
	int field1100;
	@ObfuscatedName("ar")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1935891595
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1126279289
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1058938029
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2071788451
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1490413641
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 851961207
	)
	int field1108;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 135135043
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -671106327
	)
	int field1120;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1153009523
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -786714259
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1457659035
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 863174019
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("ab")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 178945067
	)
	@Export("team")
	int team;
	@ObfuscatedName("ai")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -48389209
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1689585943
	)
	@Export("index")
	int index;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("bg")
	boolean field1124;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1160516255
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1099359221
	)
	@Export("tileY")
	int tileY;

	Player() {
		this.field1099 = -1; // L: 19
		this.field1100 = -1; // L: 20
		this.actions = new String[3]; // L: 22

		for (int var1 = 0; var1 < 3; ++var1) { // L: 25
			this.actions[var1] = "";
		}

		this.combatLevel = 0; // L: 28
		this.skillLevel = 0; // L: 29
		this.animationCycleStart = 0; // L: 31
		this.animationCycleEnd = 0; // L: 32
		this.isUnanimated = false;
		this.team = 0;
		this.isHidden = false;
		this.isFriendTriBool = TriBool.TriBool_unknown;
		this.isInFriendsChat = TriBool.TriBool_unknown;
		this.isInClanChat = TriBool.TriBool_unknown;
		this.field1124 = false;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-605345143"
	)
	@Export("read")
	final void read(Buffer var1) {
		var1.offset = 0; // L: 56
		byte var2 = var1.readByte(); // L: 57
		boolean var3 = true; // L: 58
		this.field1099 = var1.readByte();
		this.field1100 = var1.readByte();
		int var4 = -1;
		this.team = 0;
		int[] var5 = new int[12];

		int var7;
		int var8;
		int var9;
		for (int var6 = 0; var6 < 12; ++var6) {
			var7 = var1.readUnsignedByte(); // L: 65
			if (var7 == 0) {
				var5[var6] = 0; // L: 67
			} else {
				var8 = var1.readUnsignedByte(); // L: 70
				var5[var6] = var8 + (var7 << 8); // L: 71
				if (var6 == 0 && var5[0] == 65535) { // L: 72
					var4 = var1.readUnsignedShort(); // L: 73
					break;
				}

				if (var5[var6] >= 512) { // L: 76
					var9 = class341.ItemComposition_get(var5[var6] - 512).field2157; // L: 77
					if (var9 != 0) { // L: 78
						this.team = var9;
					}
				}
			}
		}

		int[] var13 = new int[12]; // L: 81

		for (var7 = 0; var7 < 12; ++var7) { // L: 82
			var8 = var1.readUnsignedByte(); // L: 83
			if (var8 == 0) { // L: 84
				var13[var7] = 0; // L: 85
			} else {
				var9 = var1.readUnsignedByte(); // L: 88
				var13[var7] = var9 + (var8 << 8); // L: 89
			}
		}

		int[] var14 = new int[5]; // L: 91

		for (var8 = 0; var8 < 5; ++var8) { // L: 92
			var9 = var1.readUnsignedByte(); // L: 93
			if (var9 < 0 || var9 >= PlayerComposition.field3646[var8].length) { // L: 94
				var9 = 0;
			}

			var14[var8] = var9; // L: 95
		}

		super.idleSequence = var1.readUnsignedShort(); // L: 97
		if (super.idleSequence == 65535) { // L: 98
			super.idleSequence = -1;
		}

		super.field1236 = var1.readUnsignedShort(); // L: 99
		if (super.field1236 == 65535) { // L: 100
			super.field1236 = -1;
		}

		super.field1179 = super.field1236; // L: 101
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), UserComparator10.loginType); // L: 112
		this.clearIsFriend(); // L: 113
		this.method2392(); // L: 114
		this.method2395(); // L: 115
		if (this == class25.localPlayer) { // L: 116
			RunException.field5335 = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte(); // L: 117
		this.skillLevel = var1.readUnsignedShort(); // L: 118
		this.isHidden = var1.readUnsignedByte() == 1; // L: 119
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) { // L: 120
			this.isHidden = false;
		}

		class168[] var15 = null; // L: 121
		boolean var17 = false;
		int var10 = var1.readUnsignedShort();
		var17 = (var10 >> 15 & 1) == 1; // L: 124
		int var11;
		if (var10 > 0 && var10 != 32768) { // L: 125
			var15 = new class168[12]; // L: 126

			for (var11 = 0; var11 < 12; ++var11) { // L: 127
				int var12 = var10 >> 12 - var11 & 1; // L: 128
				if (var12 == 1) { // L: 129
					var15[var11] = class399.method7487(var5[var11] - 512, var1); // L: 130
				}
			}
		}

		for (var11 = 0; var11 < 3; ++var11) { // L: 134
			this.actions[var11] = var1.readStringCp1252NullTerminated(); // L: 135
		}

		byte var16 = var1.readByte(); // L: 137
		if (this.appearance == null) { // L: 138
			this.appearance = new PlayerComposition();
		}

		this.appearance.method6372(var13, var5, var15, var17, var14, var2, var4, var16); // L: 139
	} // L: 140

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lko;",
		garbageValue = "-714420560"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) { // L: 203
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class9.SequenceDefinition_get(super.sequence) : null; // L: 204
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.movementSequence == super.idleSequence && var1 != null ? null : class9.SequenceDefinition_get(super.movementSequence); // L: 205
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 206
			if (var3 == null) { // L: 207
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 208
				super.defaultHeight = var3.height; // L: 209
				int var4 = var3.indicesCount; // L: 210
				if (!this.isUnanimated) { // L: 211
					var3 = this.method2486(var3); // L: 212
				}

				if (!this.isUnanimated && this.model0 != null) { // L: 214
					if (Client.cycle >= this.animationCycleEnd) { // L: 215
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) { // L: 216
						Model var5 = this.model0; // L: 217
						var5.offsetBy(this.field1108 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1120 * 4096 - super.y); // L: 218
						if (super.orientation == 512) { // L: 219
							var5.rotateY90Ccw(); // L: 220
							var5.rotateY90Ccw(); // L: 221
							var5.rotateY90Ccw(); // L: 222
						} else if (super.orientation == 1024) { // L: 224
							var5.rotateY90Ccw(); // L: 225
							var5.rotateY90Ccw(); // L: 226
						} else if (super.orientation == 1536) { // L: 228
							var5.rotateY90Ccw();
						}

						Model[] var6 = new Model[]{var3, var5}; // L: 229
						var3 = new Model(var6, 2); // L: 230
						if (super.orientation == 512) { // L: 231
							var5.rotateY90Ccw();
						} else if (super.orientation == 1024) { // L: 232
							var5.rotateY90Ccw(); // L: 233
							var5.rotateY90Ccw(); // L: 234
						} else if (super.orientation == 1536) { // L: 236
							var5.rotateY90Ccw(); // L: 237
							var5.rotateY90Ccw(); // L: 238
							var5.rotateY90Ccw(); // L: 239
						}

						var5.offsetBy(super.x - this.field1108 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1120 * 4096); // L: 241
					}
				}

				var3.isSingleTile = true; // L: 244
				if (super.field1237 != 0 && Client.cycle >= super.field1180 && Client.cycle < super.field1233) { // L: 245
					var3.overrideHue = super.field1234; // L: 246
					var3.overrideSaturation = super.field1193; // L: 247
					var3.overrideLuminance = super.field1204; // L: 248
					var3.overrideAmount = super.field1237; // L: 249
					var3.field2995 = (short)var4; // L: 250
				} else {
					var3.overrideAmount = 0; // L: 253
				}

				return var3; // L: 255
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-19048"
	)
	boolean method2388() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) { // L: 143
			this.checkIsFriend(); // L: 144
		}

		return this.isFriendTriBool == TriBool.TriBool_true; // L: 146
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "914914524"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 150
	} // L: 151

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-724517082"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = class332.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 154
	} // L: 155

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1011953784"
	)
	boolean method2391() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) { // L: 158
			this.updateIsInFriendsChat(); // L: 159
		}

		return this.isInFriendsChat == TriBool.TriBool_true; // L: 161
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "48"
	)
	void method2392() {
		this.isInFriendsChat = TriBool.TriBool_unknown; // L: 165
	} // L: 166

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-629118534"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = ClientPreferences.friendsChatManager != null && ClientPreferences.friendsChatManager.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 169
	} // L: 170

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-83"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) { // L: 173
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3389(this.username.getName()) != -1 && var1 != 2) { // L: 174 175
				this.isInClanChat = TriBool.TriBool_true; // L: 176
				return; // L: 177
			}
		}

		this.isInClanChat = TriBool.TriBool_false; // L: 181
	} // L: 182

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "116"
	)
	void method2395() {
		this.isInClanChat = TriBool.TriBool_unknown; // L: 185
	} // L: 186

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1687985056"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) { // L: 189
			this.updateIsInClanChat(); // L: 190
		}

		return this.isInClanChat == TriBool.TriBool_true; // L: 192
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2013630593"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? Script.getNpcDefinition(this.appearance.npcTransformId).size : 1; // L: 196 197 199
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IILir;I)V",
		garbageValue = "1528416684"
	)
	final void method2429(int var1, int var2, class231 var3) {
		if (super.sequence != -1 && class9.SequenceDefinition_get(super.sequence).field2226 == 1) { // L: 259
			super.sequence = -1;
		}

		this.method2460(); // L: 260
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) { // L: 261
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) { // L: 262
				if (var3 == class231.field2459) {
					GraphicsObject.method2132(this, var1, var2, class231.field2459); // L: 264
				}

				this.method2415(var1, var2, var3); // L: 265
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	} // L: 267

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "118"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0; // L: 270
		super.field1215 = 0; // L: 271
		super.field1245 = 0; // L: 272
		super.pathX[0] = var1; // L: 273
		super.pathY[0] = var2; // L: 274
		int var3 = this.transformedSize(); // L: 275
		super.x = super.pathX[0] * 128 + var3 * 64; // L: 276
		super.y = var3 * 64 + super.pathY[0] * 128; // L: 277
	} // L: 278

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IILir;B)V",
		garbageValue = "-36"
	)
	final void method2415(int var1, int var2, class231 var3) {
		if (super.pathLength < 9) { // L: 281
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) { // L: 282
			super.pathX[var4] = super.pathX[var4 - 1]; // L: 283
			super.pathY[var4] = super.pathY[var4 - 1]; // L: 284
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1]; // L: 285
		}

		super.pathX[0] = var1; // L: 287
		super.pathY[0] = var2; // L: 288
		super.pathTraversed[0] = var3; // L: 289
	} // L: 290

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-4"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null; // L: 293
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIIB)V",
		garbageValue = "-47"
	)
	public static void method2422(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 39
			int var4 = (var3 + var2) / 2; // L: 40
			int var5 = var2; // L: 41
			String var6 = var0[var4]; // L: 42
			var0[var4] = var0[var3]; // L: 43
			var0[var3] = var6; // L: 44
			int var7 = var1[var4]; // L: 45
			var1[var4] = var1[var3]; // L: 46
			var1[var3] = var7; // L: 47

			for (int var8 = var2; var8 < var3; ++var8) { // L: 48
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) { // L: 49
					String var9 = var0[var8]; // L: 50
					var0[var8] = var0[var5]; // L: 51
					var0[var5] = var9; // L: 52
					int var10 = var1[var8]; // L: 53
					var1[var8] = var1[var5]; // L: 54
					var1[var5++] = var10; // L: 55
				}
			}

			var0[var3] = var0[var5]; // L: 59
			var0[var5] = var6; // L: 60
			var1[var3] = var1[var5]; // L: 61
			var1[var5] = var7; // L: 62
			method2422(var0, var1, var2, var5 - 1); // L: 63
			method2422(var0, var1, var5 + 1, var3); // L: 64
		}

	} // L: 66

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Low;II)Lut;",
		garbageValue = "149210421"
	)
	public static IndexedSprite method2438(AbstractArchive var0, int var1) {
		return !class542.method9805(var0, var1) ? null : class464.method8511(); // L: 122 123
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1886102075"
	)
	static void method2436() {
		DecorativeObject.field3121 = null; // L: 1308
		class149.redHintArrowSprite = null; // L: 1309
		WorldMapLabelSize.mapSceneSprites = null; // L: 1310
		Actor.field1248 = null; // L: 1311
		class13.field52 = null; // L: 1312
		GrandExchangeOfferOwnWorldComparator.field495 = null; // L: 1313
		class365.field3973 = null; // L: 1314
		Players.field1346 = null; // L: 1315
		class142.field1634 = null; // L: 1316
		class359.scrollBarSprites = null; // L: 1317
		class20.field104 = null; // L: 1318
	} // L: 1319
}
