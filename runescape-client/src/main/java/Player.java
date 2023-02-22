import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2037078899
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 653296485
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("j")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -157555241
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1466962979
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1300232975
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1214728595
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -2046316743
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1796681061
	)
	int field1117;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -530276087
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -688710947
	)
	int field1123;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -833394993
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -889860411
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1587498719
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -7429877
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("x")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -199112451
	)
	@Export("team")
	int team;
	@ObfuscatedName("q")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1187195037
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1268145805
	)
	@Export("index")
	int index;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("aa")
	boolean field1132;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1741092739
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1197474069
	)
	@Export("tileY")
	int tileY;

	Player() {
		this.headIconPk = -1;
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
		this.field1132 = false; // L: 50
	} // L: 54

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lrd;I)V",
		garbageValue = "1042470094"
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
					var9 = TileItem.ItemComposition_get(var5[var6] - 512).team; // L: 78
					if (var9 != 0) { // L: 79
						this.team = var9;
					}
				}
			}
		}

		int[] var12 = new int[5]; // L: 82

		for (var7 = 0; var7 < 5; ++var7) { // L: 83
			var8 = var1.readUnsignedByte(); // L: 84
			if (var8 < 0 || var8 >= UserComparator8.field1435[var7].length) { // L: 85
				var8 = 0;
			}

			var12[var7] = var8; // L: 86
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), WorldMapCacheName.loginType); // L: 103
		this.clearIsFriend(); // L: 104
		this.clearIsInFriendsChat(); // L: 105
		this.method2359(); // L: 106
		if (this == class387.localPlayer) { // L: 107
			RunException.localPlayerName = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte(); // L: 108
		this.skillLevel = var1.readUnsignedShort(); // L: 109
		this.isHidden = var1.readUnsignedByte() == 1; // L: 110
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) { // L: 111
			this.isHidden = false;
		}

		class179[] var13 = null; // L: 112
		boolean var14 = false; // L: 113
		var9 = var1.readUnsignedShort(); // L: 114
		var14 = (var9 >> 15 & 1) == 1; // L: 115
		int var10;
		if (var9 > 0 && var9 != 32768) { // L: 116
			var13 = new class179[12]; // L: 117

			for (var10 = 0; var10 < 12; ++var10) { // L: 118
				int var11 = var9 >> 12 - var10 & 1; // L: 119
				if (var11 == 1) { // L: 120
					var13[var10] = class194.method3810(var5[var10] - 512, var1); // L: 121
				}
			}
		}

		for (var10 = 0; var10 < 3; ++var10) { // L: 125
			this.actions[var10] = var1.readStringCp1252NullTerminated(); // L: 126
		}

		if (Client.field505 > 208) { // L: 128
			var3 = var1.readUnsignedByte(); // L: 129
		}

		if (this.appearance == null) { // L: 131
			this.appearance = new PlayerComposition();
		}

		this.appearance.method5886(var5, var13, var14, var12, var2, var4, var3); // L: 132
	} // L: 133

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Lhs;",
		garbageValue = "922199662"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) { // L: 196
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class85.SequenceDefinition_get(super.sequence) : null; // L: 197
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.movementSequence == super.idleSequence && var1 != null ? null : class85.SequenceDefinition_get(super.movementSequence); // L: 198
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 199
			if (var3 == null) { // L: 200
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 201
				super.defaultHeight = var3.height; // L: 202
				int var4 = var3.indicesCount; // L: 203
				Model var5;
				Model[] var6;
				if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 204
					var5 = MouseRecorder.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 205
					if (var5 != null) { // L: 206
						var5.offsetBy(0, -super.field1210, 0); // L: 207
						var6 = new Model[]{var3, var5}; // L: 208
						var3 = new Model(var6, 2); // L: 209
					}
				}

				if (!this.isUnanimated && this.model0 != null) { // L: 212
					if (Client.cycle >= this.animationCycleEnd) { // L: 213
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) { // L: 214
						var5 = this.model0; // L: 215
						var5.offsetBy(this.field1117 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1123 * 4096 - super.y); // L: 216
						if (super.orientation == 512) { // L: 217
							var5.rotateY90Ccw(); // L: 218
							var5.rotateY90Ccw(); // L: 219
							var5.rotateY90Ccw(); // L: 220
						} else if (super.orientation == 1024) { // L: 222
							var5.rotateY90Ccw(); // L: 223
							var5.rotateY90Ccw(); // L: 224
						} else if (super.orientation == 1536) { // L: 226
							var5.rotateY90Ccw();
						}

						var6 = new Model[]{var3, var5}; // L: 227
						var3 = new Model(var6, 2); // L: 228
						if (super.orientation == 512) { // L: 229
							var5.rotateY90Ccw();
						} else if (super.orientation == 1024) { // L: 230
							var5.rotateY90Ccw(); // L: 231
							var5.rotateY90Ccw(); // L: 232
						} else if (super.orientation == 1536) { // L: 234
							var5.rotateY90Ccw(); // L: 235
							var5.rotateY90Ccw(); // L: 236
							var5.rotateY90Ccw(); // L: 237
						}

						var5.offsetBy(super.x - this.field1117 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1123 * 4096); // L: 239
					}
				}

				var3.isSingleTile = true; // L: 242
				if (super.field1225 != 0 && Client.cycle >= super.field1176 && Client.cycle < super.field1221) { // L: 243
					var3.overrideHue = super.field1180; // L: 244
					var3.overrideSaturation = super.field1227; // L: 245
					var3.overrideLuminance = super.field1224; // L: 246
					var3.overrideAmount = super.field1225; // L: 247
					var3.field2743 = (short)var4; // L: 248
				} else {
					var3.overrideAmount = 0; // L: 251
				}

				return var3; // L: 253
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-82"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) { // L: 136
			this.checkIsFriend(); // L: 137
		}

		return this.isFriendTriBool == TriBool.TriBool_true; // L: 139
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1022662395"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 143
	} // L: 144

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2031372111"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = WorldMapElement.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 147
	} // L: 148

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1928367871"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) { // L: 151
			this.updateIsInFriendsChat(); // L: 152
		}

		return this.isInFriendsChat == TriBool.TriBool_true; // L: 154
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1261781469"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown; // L: 158
	} // L: 159

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = class463.friendsChatManager != null && class463.friendsChatManager.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 162
	} // L: 163

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-112748742"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) { // L: 166
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3281(this.username.getName()) != -1 && var1 != 2) { // L: 167 168
				this.isInClanChat = TriBool.TriBool_true; // L: 169
				return; // L: 170
			}
		}

		this.isInClanChat = TriBool.TriBool_false; // L: 174
	} // L: 175

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "533945573"
	)
	void method2359() {
		this.isInClanChat = TriBool.TriBool_unknown; // L: 178
	} // L: 179

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-13423"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) { // L: 182
			this.updateIsInClanChat(); // L: 183
		}

		return this.isInClanChat == TriBool.TriBool_true; // L: 185
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1966414464"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? class137.getNpcDefinition(this.appearance.npcTransformId).size : 1; // L: 189 190 192
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IILhz;I)V",
		garbageValue = "-1093803417"
	)
	final void method2361(int var1, int var2, class208 var3) {
		if (super.sequence != -1 && class85.SequenceDefinition_get(super.sequence).field2301 == 1) { // L: 257
			super.sequence = -1;
		}

		super.field1195 = -1; // L: 258
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) { // L: 259
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) { // L: 260
				if (var3 == class208.field2362) {
					GrandExchangeEvent.method6704(this, var1, var2, class208.field2362); // L: 262
				}

				this.method2390(var1, var2, var3); // L: 263
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	} // L: 265

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "575533768"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0; // L: 268
		super.field1230 = 0; // L: 269
		super.field1175 = 0; // L: 270
		super.pathX[0] = var1; // L: 271
		super.pathY[0] = var2; // L: 272
		int var3 = this.transformedSize(); // L: 273
		super.x = super.pathX[0] * 128 + var3 * 64; // L: 274
		super.y = super.pathY[0] * 128 + var3 * 64; // L: 275
	} // L: 276

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IILhz;I)V",
		garbageValue = "-25109221"
	)
	final void method2390(int var1, int var2, class208 var3) {
		if (super.pathLength < 9) { // L: 279
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) { // L: 280
			super.pathX[var4] = super.pathX[var4 - 1]; // L: 281
			super.pathY[var4] = super.pathY[var4 - 1]; // L: 282
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1]; // L: 283
		}

		super.pathX[0] = var1; // L: 285
		super.pathY[0] = var2; // L: 286
		super.pathTraversed[0] = var3; // L: 287
	} // L: 288

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1591490422"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null; // L: 291
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([BB)Liy;",
		garbageValue = "-51"
	)
	static WorldMapSprite method2353(byte[] var0) {
		return var0 == null ? new WorldMapSprite() : new WorldMapSprite(class266.method5471(var0).pixels); // L: 19 20
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1782678419"
	)
	static final void method2369(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255); // L: 12739
		if (var0 != PacketWriter.clientPreferences.method2495()) { // L: 12740
			if (PacketWriter.clientPreferences.method2495() == 0 && Client.currentTrackGroupId != -1) { // L: 12741
				class148.method3216(class153.archive6, Client.currentTrackGroupId, 0, var0, false); // L: 12742
				Client.playingJingle = false; // L: 12743
			} else if (var0 == 0) { // L: 12745
				class177.method3538(); // L: 12746
				Client.playingJingle = false; // L: 12747
			} else if (class290.musicPlayerStatus != 0) { // L: 12750
				class290.musicTrackVolume = var0;
			} else {
				class290.midiPcmStream.setPcmStreamVolume(var0); // L: 12751
			}

			PacketWriter.clientPreferences.method2533(var0); // L: 12753
		}

	} // L: 12755

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "855399495"
	)
	static final void method2365(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) { // L: 13164
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3359()) { // L: 13165
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 13166
				if (var2.rank == -1) { // L: 13167
					PacketBufferNode var3 = Renderable.getPacketBufferNode(ClientPacket.field3074, Client.packetWriter.isaacCipher); // L: 13168
					var3.packetBuffer.writeByte(3 + class96.stringCp1252NullTerminatedByteSize(var2.username.getName())); // L: 13169
					var3.packetBuffer.writeByte(var0); // L: 13170
					var3.packetBuffer.writeShort(var1); // L: 13171
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName()); // L: 13172
					Client.packetWriter.addNode(var3); // L: 13173
				}
			}
		}
	} // L: 13174
}
