import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cj")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1635688549
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 586041939
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("o")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -599736859
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 508020287
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1640401775
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -653734129
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 730739877
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -183413097
	)
	int field1185;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1745122201
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -385569285
	)
	int field1197;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 2027010021
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1785758561
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 335782101
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -888481785
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("s")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 365768385
	)
	@Export("team")
	int team;
	@ObfuscatedName("c")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1650147117
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1840333455
	)
	@Export("index")
	int index;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("ak")
	boolean field1201;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 5106261
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -769670651
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
		this.field1201 = false;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "1534249292"
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
					var8 = class250.ItemDefinition_get(var4[var5] - 512).team;
					if (var8 != 0) {
						this.team = var8;
					}
				}
			}
		}

		int[] var11 = new int[5];

		for (var6 = 0; var6 < 5; ++var6) {
			var7 = var1.readUnsignedByte();
			if (var7 < 0 || var7 >= class69.field568[var6].length) {
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), LoginScreenAnimation.loginType);
		this.clearIsFriend();
		this.clearIsInFriendsChat();
		this.method2213();
		if (this == class262.localPlayer) {
			Login.field1026 = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte();
		this.skillLevel = var1.readUnsignedShort();
		this.isHidden = var1.readUnsignedByte() == 1;
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) {
			this.isHidden = false;
		}

		class136[] var12 = null;
		boolean var13 = false;
		if (var1.offset < var1.array.length) {
			var8 = var1.readUnsignedShort();
			var13 = (var8 >> 15 & 1) == 1;
			if (var8 > 0 && var8 != 32768) {
				var12 = new class136[12];

				for (int var9 = 0; var9 < 12; ++var9) {
					int var10 = var8 >> 12 - var9 & 1;
					if (var10 == 1) {
						var12[var9] = MenuAction.method2027(var4[var9] - 512, var1);
					}
				}
			}
		}

		if (this.appearance == null) {
			this.appearance = new PlayerComposition();
		}

		this.appearance.method4837(var4, var12, var13, var11, var2 == 1, var3);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Lgd;",
		garbageValue = "326918784"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? WorldMapScaleHandler.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.movementSequence == super.idleSequence && var1 != null ? null : WorldMapScaleHandler.SequenceDefinition_get(super.movementSequence);
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				Model var4;
				Model[] var5;
				if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) {
					var4 = Tiles.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
					if (var4 != null) {
						var4.offsetBy(0, -super.field1263, 0);
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
						var4.offsetBy(this.field1185 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1197 * 4096 - super.y);
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

						var4.offsetBy(super.x - this.field1185 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1197 * 4096);
					}
				}

				var3.isSingleTile = true;
				return var3;
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1441448466"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) {
			this.checkIsFriend();
		}

		return this.isFriendTriBool == TriBool.TriBool_true;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-183277896"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1895738612"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = DevicePcmPlayerProvider.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "4663"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) {
			this.updateIsInFriendsChat();
		}

		return this.isInFriendsChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-956688368"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1656967848"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = class289.friendsChatManager != null && class289.friendsChatManager.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1811167187"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		this.isInClanChat = Client.currentClanSettings[0] != null && Client.currentClanSettings[0].method196(this.username.getName()) != -1 ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1587575970"
	)
	void method2213() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1972087508"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}

		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-254306857"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? class248.getNpcDefinition(this.appearance.npcTransformId).size : 1;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIBI)V",
		garbageValue = "-977769569"
	)
	final void method2217(int var1, int var2, byte var3) {
		if (super.sequence != -1 && WorldMapScaleHandler.SequenceDefinition_get(super.sequence).field1893 == 1) {
			super.sequence = -1;
		}

		super.field1280 = -1;
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var3 == 2) {
					Player var4 = this;
					int var5 = super.pathX[0];
					int var6 = super.pathY[0];
					int var7 = this.transformedSize();
					if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && var1 >= var7 && var1 < 104 - var7 && var2 >= var7 && var2 < 104 - var7) {
						int var9 = this.transformedSize();
						Client.field733.approxDestinationX = var1;
						Client.field733.approxDestinationY = var2;
						Client.field733.approxDestinationSizeX = 1;
						Client.field733.approxDestinationSizeY = 1;
						ApproximateRouteStrategy var10 = Client.field733;
						ApproximateRouteStrategy var11 = var10;
						CollisionMap var12 = Client.collisionMaps[this.plane];
						int[] var13 = Client.field739;
						int[] var14 = Client.field631;
						int var15 = 0;

						label412:
						while (true) {
							int var16;
							if (var15 >= 128) {
								int var17;
								int var18;
								byte var20;
								int var21;
								int var22;
								int var24;
								int var26;
								int var27;
								int var28;
								boolean var35;
								int var37;
								int var38;
								int var40;
								if (var9 == 1) {
									var35 = class126.method2595(var5, var6, var10, var12);
								} else if (var9 == 2) {
									var17 = var5;
									var18 = var6;
									byte var19 = 64;
									var20 = 64;
									var21 = var5 - var19;
									var22 = var6 - var20;
									class160.directions[var19][var20] = 99;
									class160.distances[var19][var20] = 0;
									byte var23 = 0;
									var24 = 0;
									class160.bufferX[var23] = var5;
									var40 = var23 + 1;
									class160.bufferY[var23] = var6;
									int[][] var25 = var12.flags;

									boolean var36;
									while (true) {
										if (var24 == var40) {
											Login.field1033 = var17;
											GrandExchangeOfferOwnWorldComparator.field608 = var18;
											var36 = false;
											break;
										}

										var17 = class160.bufferX[var24];
										var18 = class160.bufferY[var24];
										var24 = var24 + 1 & 4095;
										var37 = var17 - var21;
										var38 = var18 - var22;
										var26 = var17 - var12.xInset;
										var27 = var18 - var12.yInset;
										if (var11.hasArrived(2, var17, var18, var12)) {
											Login.field1033 = var17;
											GrandExchangeOfferOwnWorldComparator.field608 = var18;
											var36 = true;
											break;
										}

										var28 = class160.distances[var37][var38] + 1;
										if (var37 > 0 && class160.directions[var37 - 1][var38] == 0 && (var25[var26 - 1][var27] & 19136782) == 0 && (var25[var26 - 1][var27 + 1] & 19136824) == 0) {
											class160.bufferX[var40] = var17 - 1;
											class160.bufferY[var40] = var18;
											var40 = var40 + 1 & 4095;
											class160.directions[var37 - 1][var38] = 2;
											class160.distances[var37 - 1][var38] = var28;
										}

										if (var37 < 126 && class160.directions[var37 + 1][var38] == 0 && (var25[var26 + 2][var27] & 19136899) == 0 && (var25[var26 + 2][var27 + 1] & 19136992) == 0) {
											class160.bufferX[var40] = var17 + 1;
											class160.bufferY[var40] = var18;
											var40 = var40 + 1 & 4095;
											class160.directions[var37 + 1][var38] = 8;
											class160.distances[var37 + 1][var38] = var28;
										}

										if (var38 > 0 && class160.directions[var37][var38 - 1] == 0 && (var25[var26][var27 - 1] & 19136782) == 0 && (var25[var26 + 1][var27 - 1] & 19136899) == 0) {
											class160.bufferX[var40] = var17;
											class160.bufferY[var40] = var18 - 1;
											var40 = var40 + 1 & 4095;
											class160.directions[var37][var38 - 1] = 1;
											class160.distances[var37][var38 - 1] = var28;
										}

										if (var38 < 126 && class160.directions[var37][var38 + 1] == 0 && (var25[var26][var27 + 2] & 19136824) == 0 && (var25[var26 + 1][var27 + 2] & 19136992) == 0) {
											class160.bufferX[var40] = var17;
											class160.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class160.directions[var37][var38 + 1] = 4;
											class160.distances[var37][var38 + 1] = var28;
										}

										if (var37 > 0 && var38 > 0 && class160.directions[var37 - 1][var38 - 1] == 0 && (var25[var26 - 1][var27] & 19136830) == 0 && (var25[var26 - 1][var27 - 1] & 19136782) == 0 && (var25[var26][var27 - 1] & 19136911) == 0) {
											class160.bufferX[var40] = var17 - 1;
											class160.bufferY[var40] = var18 - 1;
											var40 = var40 + 1 & 4095;
											class160.directions[var37 - 1][var38 - 1] = 3;
											class160.distances[var37 - 1][var38 - 1] = var28;
										}

										if (var37 < 126 && var38 > 0 && class160.directions[var37 + 1][var38 - 1] == 0 && (var25[var26 + 1][var27 - 1] & 19136911) == 0 && (var25[var26 + 2][var27 - 1] & 19136899) == 0 && (var25[var26 + 2][var27] & 19136995) == 0) {
											class160.bufferX[var40] = var17 + 1;
											class160.bufferY[var40] = var18 - 1;
											var40 = var40 + 1 & 4095;
											class160.directions[var37 + 1][var38 - 1] = 9;
											class160.distances[var37 + 1][var38 - 1] = var28;
										}

										if (var37 > 0 && var38 < 126 && class160.directions[var37 - 1][var38 + 1] == 0 && (var25[var26 - 1][var27 + 1] & 19136830) == 0 && (var25[var26 - 1][var27 + 2] & 19136824) == 0 && (var25[var26][var27 + 2] & 19137016) == 0) {
											class160.bufferX[var40] = var17 - 1;
											class160.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class160.directions[var37 - 1][var38 + 1] = 6;
											class160.distances[var37 - 1][var38 + 1] = var28;
										}

										if (var37 < 126 && var38 < 126 && class160.directions[var37 + 1][var38 + 1] == 0 && (var25[var26 + 1][var27 + 2] & 19137016) == 0 && (var25[var26 + 2][var27 + 2] & 19136992) == 0 && (var25[var26 + 2][var27 + 1] & 19136995) == 0) {
											class160.bufferX[var40] = var17 + 1;
											class160.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class160.directions[var37 + 1][var38 + 1] = 12;
											class160.distances[var37 + 1][var38 + 1] = var28;
										}
									}

									var35 = var36;
								} else {
									var35 = KeyHandler.method475(var5, var6, var9, var10, var12);
								}

								int var8;
								label435: {
									var16 = var5 - 64;
									var17 = var6 - 64;
									var18 = Login.field1033;
									var37 = GrandExchangeOfferOwnWorldComparator.field608;
									if (!var35) {
										var38 = Integer.MAX_VALUE;
										var21 = Integer.MAX_VALUE;
										byte var39 = 10;
										var40 = var11.approxDestinationX;
										var24 = var11.approxDestinationY;
										int var34 = var11.approxDestinationSizeX;
										var26 = var11.approxDestinationSizeY;

										for (var27 = var40 - var39; var27 <= var39 + var40; ++var27) {
											for (var28 = var24 - var39; var28 <= var39 + var24; ++var28) {
												int var29 = var27 - var16;
												int var30 = var28 - var17;
												if (var29 >= 0 && var30 >= 0 && var29 < 128 && var30 < 128 && class160.distances[var29][var30] < 100) {
													int var31 = 0;
													if (var27 < var40) {
														var31 = var40 - var27;
													} else if (var27 > var34 + var40 - 1) {
														var31 = var27 - (var34 + var40 - 1);
													}

													int var32 = 0;
													if (var28 < var24) {
														var32 = var24 - var28;
													} else if (var28 > var26 + var24 - 1) {
														var32 = var28 - (var24 + var26 - 1);
													}

													int var33 = var31 * var31 + var32 * var32;
													if (var33 < var38 || var38 == var33 && class160.distances[var29][var30] < var21) {
														var38 = var33;
														var21 = class160.distances[var29][var30];
														var18 = var27;
														var37 = var28;
													}
												}
											}
										}

										if (var38 == Integer.MAX_VALUE) {
											var8 = -1;
											break label435;
										}
									}

									if (var18 == var5 && var6 == var37) {
										var8 = 0;
									} else {
										var20 = 0;
										class160.bufferX[var20] = var18;
										var38 = var20 + 1;
										class160.bufferY[var20] = var37;

										for (var21 = var22 = class160.directions[var18 - var16][var37 - var17]; var18 != var5 || var37 != var6; var21 = class160.directions[var18 - var16][var37 - var17]) {
											if (var21 != var22) {
												var22 = var21;
												class160.bufferX[var38] = var18;
												class160.bufferY[var38++] = var37;
											}

											if ((var21 & 2) != 0) {
												++var18;
											} else if ((var21 & 8) != 0) {
												--var18;
											}

											if ((var21 & 1) != 0) {
												++var37;
											} else if ((var21 & 4) != 0) {
												--var37;
											}
										}

										var40 = 0;

										while (var38-- > 0) {
											var13[var40] = class160.bufferX[var38];
											var14[var40++] = class160.bufferY[var38];
											if (var40 >= var13.length) {
												break;
											}
										}

										var8 = var40;
									}
								}

								var15 = var8;
								if (var8 < 1) {
									break;
								}

								var16 = 0;

								while (true) {
									if (var16 >= var15 - 1) {
										break label412;
									}

									var4.method2219(Client.field739[var16], Client.field631[var16], (byte)2);
									++var16;
								}
							}

							for (var16 = 0; var16 < 128; ++var16) {
								class160.directions[var15][var16] = 0;
								class160.distances[var15][var16] = 99999999;
							}

							++var15;
						}
					}
				}

				this.method2219(var1, var2, var3);
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1775377890"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0;
		super.field1281 = 0;
		super.field1242 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		int var3 = this.transformedSize();
		super.x = super.pathX[0] * 128 + var3 * 64;
		super.y = var3 * 64 + super.pathY[0] * 128;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIBI)V",
		garbageValue = "1698515856"
	)
	final void method2219(int var1, int var2, byte var3) {
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "3"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILgp;Lfl;I)V",
		garbageValue = "1848847926"
	)
	static final void method2258(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) {
			if (var0 < Tiles.Tiles_minPlane) {
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = Tiles.getObjectDefinition(var3);
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) {
				var9 = var8.sizeX;
				var10 = var8.sizeY;
			} else {
				var9 = var8.sizeY;
				var10 = var8.sizeX;
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) {
				var11 = (var9 >> 1) + var1;
				var12 = (var9 + 1 >> 1) + var1;
			} else {
				var11 = var1;
				var12 = var1 + 1;
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) {
				var13 = (var10 >> 1) + var2;
				var14 = var2 + (var10 + 1 >> 1);
			} else {
				var13 = var2;
				var14 = var2 + 1;
			}

			int[][] var15 = Tiles.Tiles_heights[var0];
			int var16 = var15[var11][var14] + var15[var11][var13] + var15[var12][var13] + var15[var12][var14] >> 2;
			int var17 = (var1 << 7) + (var9 << 6);
			int var18 = (var2 << 7) + (var10 << 6);
			long var19 = UserComparator3.calculateTag(var1, var2, 2, var8.int1 == 0, var3);
			int var21 = var5 + (var4 << 6);
			if (var8.int3 == 1) {
				var21 += 256;
			}

			if (var8.hasSound()) {
				class171.method3612(var0, var1, var2, var8, var4);
			}

			Object var29;
			if (var5 == 22) {
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var29 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.field1784, (Renderable)null);
					}

					var6.newFloorDecoration(var0, var1, var2, var16, (Renderable)var29, var19, var21);
					if (var8.interactType == 1 && var7 != null) {
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else {
				int var28;
				if (var5 != 10 && var5 != 11) {
					int[] var10000;
					if (var5 >= 12) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.field1784, (Renderable)null);
						}

						var6.method4046(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21);
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
							var10000 = Tiles.field1101[var0][var1];
							var10000[var2] |= 2340;
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

					} else if (var5 == 0) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var29 = var8.getEntity(0, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.field1784, (Renderable)null);
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1102[var4], 0, var19, var21);
						if (var4 == 0) {
							if (var8.clipped) {
								class43.field307[var0][var1][var2] = 50;
								class43.field307[var0][var1][var2 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = Tiles.field1101[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) {
							if (var8.clipped) {
								class43.field307[var0][var1][var2 + 1] = 50;
								class43.field307[var0][var1 + 1][var2 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = Tiles.field1101[var0][var1];
								var10000[var2 + 1] |= 1170;
							}
						} else if (var4 == 2) {
							if (var8.clipped) {
								class43.field307[var0][var1 + 1][var2] = 50;
								class43.field307[var0][var1 + 1][var2 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = Tiles.field1101[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) {
							if (var8.clipped) {
								class43.field307[var0][var1][var2] = 50;
								class43.field307[var0][var1 + 1][var2] = 50;
							}

							if (var8.modelClipped) {
								var10000 = Tiles.field1101[var0][var1];
								var10000[var2] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method3216(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) {
							var6.method4204(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 1) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var29 = var8.getEntity(1, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.field1784, (Renderable)null);
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1107[var4], 0, var19, var21);
						if (var8.clipped) {
							if (var4 == 0) {
								class43.field307[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) {
								class43.field307[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) {
								class43.field307[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) {
								class43.field307[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method3216(var1, var2, var5, var4, var8.boolean1);
						}

					} else {
						int var22;
						if (var5 == 2) {
							var22 = var4 + 1 & 3;
							Object var24;
							Object var30;
							if (var8.animationId == -1 && var8.transforms == null) {
								var30 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18);
								var24 = var8.getEntity(2, var22, var15, var17, var16, var18);
							} else {
								var30 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.field1784, (Renderable)null);
								var24 = new DynamicObject(var3, 2, var22, var0, var1, var2, var8.animationId, var8.field1784, (Renderable)null);
							}

							var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var30, (Renderable)var24, Tiles.field1102[var4], Tiles.field1102[var22], var19, var21);
							if (var8.modelClipped) {
								if (var4 == 0) {
									var10000 = Tiles.field1101[var0][var1];
									var10000[var2] |= 585;
									var10000 = Tiles.field1101[var0][var1];
									var10000[var2 + 1] |= 1170;
								} else if (var4 == 1) {
									var10000 = Tiles.field1101[var0][var1];
									var10000[var2 + 1] |= 1170;
									var10000 = Tiles.field1101[var0][var1 + 1];
									var10000[var2] |= 585;
								} else if (var4 == 2) {
									var10000 = Tiles.field1101[var0][var1 + 1];
									var10000[var2] |= 585;
									var10000 = Tiles.field1101[var0][var1];
									var10000[var2] |= 1170;
								} else if (var4 == 3) {
									var10000 = Tiles.field1101[var0][var1];
									var10000[var2] |= 1170;
									var10000 = Tiles.field1101[var0][var1];
									var10000[var2] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) {
								var7.method3216(var1, var2, var5, var4, var8.boolean1);
							}

							if (var8.int2 != 16) {
								var6.method4204(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 3) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var29 = var8.getEntity(3, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.field1784, (Renderable)null);
							}

							var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1107[var4], 0, var19, var21);
							if (var8.clipped) {
								if (var4 == 0) {
									class43.field307[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) {
									class43.field307[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) {
									class43.field307[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) {
									class43.field307[var0][var1][var2] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) {
								var7.method3216(var1, var2, var5, var4, var8.boolean1);
							}

						} else if (var5 == 9) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.field1784, (Renderable)null);
							}

							var6.method4046(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21);
							if (var8.interactType != 0 && var7 != null) {
								var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) {
								var6.method4204(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 4) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var29 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.field1784, (Renderable)null);
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1102[var4], 0, 0, 0, var19, var21);
						} else {
							long var23;
							Object var25;
							if (var5 == 5) {
								var22 = 16;
								var23 = var6.getBoundaryObjectTag(var0, var1, var2);
								if (var23 != 0L) {
									var22 = Tiles.getObjectDefinition(Message.Entity_unpackID(var23)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) {
									var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.field1784, (Renderable)null);
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field1102[var4], 0, var22 * Tiles.field1100[var4], var22 * Tiles.field1105[var4], var19, var21);
							} else if (var5 == 6) {
								var22 = 8;
								var23 = var6.getBoundaryObjectTag(var0, var1, var2);
								if (var23 != 0L) {
									var22 = Tiles.getObjectDefinition(Message.Entity_unpackID(var23)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) {
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.field1784, (Renderable)null);
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var22 * Tiles.field1106[var4], var22 * Tiles.field1097[var4], var19, var21);
							} else if (var5 == 7) {
								var28 = var4 + 2 & 3;
								if (var8.animationId == -1 && var8.transforms == null) {
									var29 = var8.getEntity(4, var28 + 4, var15, var17, var16, var18);
								} else {
									var29 = new DynamicObject(var3, 4, var28 + 4, var0, var1, var2, var8.animationId, var8.field1784, (Renderable)null);
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, 256, var28, 0, 0, var19, var21);
							} else if (var5 == 8) {
								var22 = 8;
								var23 = var6.getBoundaryObjectTag(var0, var1, var2);
								if (var23 != 0L) {
									var22 = Tiles.getObjectDefinition(Message.Entity_unpackID(var23)).int2 / 2;
								}

								int var27 = var4 + 2 & 3;
								Object var26;
								if (var8.animationId == -1 && var8.transforms == null) {
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
									var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.field1784, (Renderable)null);
									var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.field1784, (Renderable)null);
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var22 * Tiles.field1106[var4], var22 * Tiles.field1097[var4], var19, var21);
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) {
						var29 = var8.getEntity(10, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.field1784, (Renderable)null);
					}

					if (var29 != null && var6.method4046(var0, var1, var2, var16, var9, var10, (Renderable)var29, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) {
						var28 = 15;
						if (var29 instanceof Model) {
							var28 = ((Model)var29).method4331() / 4;
							if (var28 > 30) {
								var28 = 30;
							}
						}

						for (int var31 = 0; var31 <= var9; ++var31) {
							for (int var32 = 0; var32 <= var10; ++var32) {
								if (var28 > class43.field307[var0][var31 + var1][var32 + var2]) {
									class43.field307[var0][var31 + var1][var32 + var2] = (byte)var28;
								}
							}
						}
					}

					if (var8.interactType != 0 && var7 != null) {
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				}
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "879452665"
	)
	static int method2235(int var0, Script var1, boolean var2) {
		Widget var3 = WorldMapData_1.getWidget(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) {
			Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTRANSTOP) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTRANSBOT) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETFILLMODE) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else if (var0 != 2615 && var0 != 2616) {
			return 2;
		} else {
			++ChatChannel.Interpreter_intStackSize;
			return 1;
		}
	}
}
