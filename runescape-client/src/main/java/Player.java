import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ljo;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1229040637
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 378877663
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("o")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1196180537
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 2144897369
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1790396467
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 5972609
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -451757955
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1679747591
	)
	int field1075;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1673748563
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1458594827
	)
	int field1077;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -64519035
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1116523143
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 145100775
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 894137499
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("j")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1965287033
	)
	@Export("team")
	int team;
	@ObfuscatedName("g")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 56842439
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1237565359
	)
	@Export("index")
	int index;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("af")
	boolean field1067;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 2024062865
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1738196589
	)
	@Export("tileY")
	int tileY;

	Player() {
		this.headIconPk = -1;
		this.headIconPrayer = -1;
		this.actions = new String[3];

		for (int var1 = 0; var1 < 3; ++var1) {
			this.actions[var1] = "";
		}

		this.combatLevel = 0;
		this.skillLevel = 0;
		this.animationCycleStart = 0;
		this.animationCycleEnd = 0;
		this.isUnanimated = false;
		this.team = 0;
		this.isHidden = false;
		this.isFriendTriBool = TriBool.TriBool_unknown;
		this.isInFriendsChat = TriBool.TriBool_unknown;
		this.isInClanChat = TriBool.TriBool_unknown;
		this.field1067 = false;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-1567808519"
	)
	@Export("read")
	final void read(Buffer var1) {
		var1.offset = 0;
		int var2 = var1.readUnsignedByte();
		this.headIconPk = var1.readByte();
		this.headIconPrayer = var1.readByte();
		int var3 = -1;
		this.team = 0;
		int[] var4 = new int[12];

		int var6;
		int var7;
		int var8;
		for (int var5 = 0; var5 < 12; ++var5) {
			var6 = var1.readUnsignedByte();
			if (var6 == 0) {
				var4[var5] = 0;
			} else {
				var7 = var1.readUnsignedByte();
				var4[var5] = var7 + (var6 << 8);
				if (var5 == 0 && var4[0] == 65535) {
					var3 = var1.readUnsignedShort();
					break;
				}

				if (var4[var5] >= 512) {
					var8 = Client.ItemComposition_get(var4[var5] - 512).team;
					if (var8 != 0) {
						this.team = var8;
					}
				}
			}
		}

		int[] var11 = new int[5];

		for (var6 = 0; var6 < 5; ++var6) {
			var7 = var1.readUnsignedByte();
			if (var7 < 0 || var7 >= class1.field8[var6].length) {
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
		if (super.walkSequence == 65535) {
			super.walkSequence = -1;
		}

		super.walkBackSequence = var1.readUnsignedShort();
		if (super.walkBackSequence == 65535) {
			super.walkBackSequence = -1;
		}

		super.walkLeftSequence = var1.readUnsignedShort();
		if (super.walkLeftSequence == 65535) {
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), VarcInt.loginType);
		this.clearIsFriend();
		this.clearIsInFriendsChat();
		this.method2105();
		if (this == WorldMapSprite.localPlayer) {
			RunException.localPlayerName = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte();
		this.skillLevel = var1.readUnsignedShort();
		this.isHidden = var1.readUnsignedByte() == 1;
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) {
			this.isHidden = false;
		}

		class160[] var12 = null;
		boolean var13 = false;
		if (var1.offset < var1.array.length) {
			var8 = var1.readUnsignedShort();
			var13 = (var8 >> 15 & 1) == 1;
			if (var8 > 0 && var8 != 32768) {
				var12 = new class160[12];

				for (int var9 = 0; var9 < 12; ++var9) {
					int var10 = var8 >> 12 - var9 & 1;
					if (var10 == 1) {
						var12[var9] = PcmPlayer.method744(var4[var9] - 512, var1);
					}
				}
			}
		}

		if (this.appearance == null) {
			this.appearance = new PlayerComposition();
		}

		this.appearance.method5361(var4, var12, var13, var11, var2 == 1, var3);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Lgf;",
		garbageValue = "39"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class78.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.movementSequence == super.idleSequence && var1 != null ? null : class78.SequenceDefinition_get(super.movementSequence);
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				Model var4;
				Model[] var5;
				if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) {
					var4 = Widget.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
					if (var4 != null) {
						var4.offsetBy(0, -super.spotAnimationHeight, 0);
						var5 = new Model[]{var3, var4};
						var3 = new Model(var5, 2);
					}
				}

				if (!this.isUnanimated && this.model0 != null) {
					if (Client.cycle >= this.animationCycleEnd) {
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) {
						var4 = this.model0;
						var4.offsetBy(this.field1075 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1077 * 4096 - super.y);
						if (super.orientation == 512) {
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
						} else if (super.orientation == 1024) {
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
						} else if (super.orientation == 1536) {
							var4.rotateY90Ccw();
						}

						var5 = new Model[]{var3, var4};
						var3 = new Model(var5, 2);
						if (super.orientation == 512) {
							var4.rotateY90Ccw();
						} else if (super.orientation == 1024) {
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
						} else if (super.orientation == 1536) {
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
						}

						var4.offsetBy(super.x - this.field1075 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1077 * 4096);
					}
				}

				var3.isSingleTile = true;
				if (super.field1167 != 0 && Client.cycle >= super.field1162 && Client.cycle < super.field1163) {
					var3.overrideHue = super.field1164;
					var3.overrideSaturation = super.field1155;
					var3.overrideLuminance = super.field1166;
					var3.overrideAmount = super.field1167;
				} else {
					var3.overrideAmount = 0;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-716281640"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) {
			this.checkIsFriend();
		}

		return this.isFriendTriBool == TriBool.TriBool_true;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2053260559"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "179876428"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = ClanSettings.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1426624736"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) {
			this.updateIsInFriendsChat();
		}

		return this.isInFriendsChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "79"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1638628990"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = class67.friendsChatManager != null && class67.friendsChatManager.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1606395580"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 2; ++var1) {
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method2848(this.username.getName()) != -1) {
				this.isInClanChat = TriBool.TriBool_true;
				return;
			}
		}

		this.isInClanChat = TriBool.TriBool_false;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "162856621"
	)
	void method2105() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1292882175"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}

		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "89"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? UserComparator10.getNpcDefinition(this.appearance.npcTransformId).size : 1;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IILgl;I)V",
		garbageValue = "-726114570"
	)
	final void method2122(int var1, int var2, class185 var3) {
		if (super.sequence != -1 && class78.SequenceDefinition_get(super.sequence).field2099 == 1) {
			super.sequence = -1;
		}

		super.field1138 = -1;
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var3 == class185.field2132) {
					class125.method2742(this, var1, var2, class185.field2132);
				}

				this.method2116(var1, var2, var3);
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-80"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0;
		super.field1176 = 0;
		super.field1175 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		int var3 = this.transformedSize();
		super.x = super.pathX[0] * 128 + var3 * 64;
		super.y = super.pathY[0] * 128 + var3 * 64;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IILgl;B)V",
		garbageValue = "-51"
	)
	final void method2116(int var1, int var2, class185 var3) {
		if (super.pathLength < 9) {
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) {
			super.pathX[var4] = super.pathX[var4 - 1];
			super.pathY[var4] = super.pathY[var4 - 1];
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1];
		}

		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.pathTraversed[0] = var3;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1570210948"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-103"
	)
	static void method2159(int var0) {
		if (var0 != Login.loginIndex) {
			Login.loginIndex = var0;
		}
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "([Ljz;II)V",
		garbageValue = "-1598355358"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !class260.isComponentHidden(var3))) {
				int var5;
				if (var3.type == 0) {
					if (!var3.isIf3 && class260.isComponentHidden(var3) && var3 != class242.mousedOverWidgetIf1) {
						continue;
					}

					drawModelComponents(var0, var3.id);
					if (var3.children != null) {
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						var5 = var4.group;
						if (class13.loadInterface(var5)) {
							drawModelComponents(Widget.Widget_interfaceComponents[var5], -1);
						}
					}
				}

				if (var3.type == 6) {
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) {
						boolean var7 = SceneTilePaint.runCs1(var3);
						if (var7) {
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId;
						}

						if (var5 != -1) {
							SequenceDefinition var6 = class78.SequenceDefinition_get(var5);

							for (var3.modelFrameCycle += Client.field566; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; class112.invalidateWidget(var3)) {
								var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame];
								++var3.modelFrame;
								if (var3.modelFrame >= var6.frameIds.length) {
									var3.modelFrame -= var6.frameCount;
									if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) {
										var3.modelFrame = 0;
									}
								}
							}
						}
					}

					if (var3.field3320 != 0 && !var3.isIf3) {
						int var8 = var3.field3320 >> 16;
						var5 = var3.field3320 << 16 >> 16;
						var8 *= Client.field566;
						var5 *= Client.field566;
						var3.modelAngleX = var8 + var3.modelAngleX & 2047;
						var3.modelAngleY = var5 + var3.modelAngleY & 2047;
						class112.invalidateWidget(var3);
					}
				}
			}
		}

	}
}
