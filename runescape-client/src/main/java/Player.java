import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1696994265
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -2126802757
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("g")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -937184137
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1332697309
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 337451977
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1425054189
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1458184293
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 288875039
	)
	int field1042;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 332788461
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 13115945
	)
	int field1052;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1775444559
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1238271901
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1266032001
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1322091437
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("d")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -928304435
	)
	@Export("team")
	int team;
	@ObfuscatedName("m")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1357016489
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 416153075
	)
	@Export("index")
	int index;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("ae")
	boolean field1067;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -308953969
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -699519147
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-1757625786"
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
					var8 = TaskHandler.ItemDefinition_get(var4[var5] - 512).team;
					if (var8 != 0) {
						this.team = var8;
					}
				}
			}
		}

		int[] var11 = new int[5];

		for (var6 = 0; var6 < 5; ++var6) {
			var7 = var1.readUnsignedByte();
			if (var7 < 0 || var7 >= class137.field1519[var6].length) {
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), GrandExchangeOfferUnitPriceComparator.loginType);
		this.clearIsFriend();
		this.clearIsInFriendsChat();
		this.method2105();
		if (this == HealthBarDefinition.localPlayer) {
			RunException.localPlayerName = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte();
		this.skillLevel = var1.readUnsignedShort();
		this.isHidden = var1.readUnsignedByte() == 1;
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) {
			this.isHidden = false;
		}

		class150[] var12 = null;
		boolean var13 = false;
		if (var1.offset < var1.array.length) {
			var8 = var1.readUnsignedShort();
			var13 = (var8 >> 15 & 1) == 1;
			if (var8 > 0 && var8 != 32768) {
				var12 = new class150[12];

				for (int var9 = 0; var9 < 12; ++var9) {
					int var10 = var8 >> 12 - var9 & 1;
					if (var10 == 1) {
						var12[var9] = NPCComposition.method3152(var4[var9] - 512, var1);
					}
				}
			}
		}

		if (this.appearance == null) {
			this.appearance = new PlayerComposition();
		}

		this.appearance.method5062(var4, var12, var13, var11, var2 == 1, var3);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Lhl;",
		garbageValue = "461766541"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? MouseHandler.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.idleSequence == super.movementSequence && var1 != null ? null : MouseHandler.SequenceDefinition_get(super.movementSequence);
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				Model var4;
				Model[] var5;
				if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) {
					var4 = BZip2State.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
					if (var4 != null) {
						var4.offsetBy(0, -super.field1126, 0);
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
						var4.offsetBy(this.field1042 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1052 * 4096 - super.y);
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

						var4.offsetBy(super.x - this.field1042 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1052 * 4096);
					}
				}

				var3.isSingleTile = true;
				return var3;
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "45"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) {
			this.checkIsFriend();
		}

		return this.isFriendTriBool == TriBool.TriBool_true;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "426200775"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "942612760"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = class112.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "220303243"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) {
			this.updateIsInFriendsChat();
		}

		return this.isInFriendsChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "579888047"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = AbstractArchive.friendsChatManager != null && AbstractArchive.friendsChatManager.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-396296136"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 2; ++var1) {
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method2649(this.username.getName()) != -1) {
				this.isInClanChat = TriBool.TriBool_true;
				return;
			}
		}

		this.isInClanChat = TriBool.TriBool_false;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "25"
	)
	void method2105() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}

		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "82"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? ScriptFrame.getNpcDefinition(this.appearance.npcTransformId).size : 1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIBI)V",
		garbageValue = "-1013246003"
	)
	final void method2109(int var1, int var2, byte var3) {
		if (super.sequence != -1 && MouseHandler.SequenceDefinition_get(super.sequence).field1956 == 1) {
			super.sequence = -1;
		}

		super.field1112 = -1;
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var3 == 2) {
					Player var4 = this;
					int var5 = super.pathX[0];
					int var6 = super.pathY[0];
					int var7 = this.transformedSize();
					if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && var1 >= var7 && var1 < 104 - var7 && var2 >= var7 && var2 < 104 - var7) {
						int var9 = this.transformedSize();
						Client.field743.approxDestinationX = var1;
						Client.field743.approxDestinationY = var2;
						Client.field743.approxDestinationSizeX = 1;
						Client.field743.approxDestinationSizeY = 1;
						ApproximateRouteStrategy var10 = Client.field743;
						ApproximateRouteStrategy var11 = var10;
						CollisionMap var12 = Client.collisionMaps[this.plane];
						int[] var13 = Client.field538;
						int[] var14 = Client.field748;
						int var15 = 0;

						label381:
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
									var17 = var5;
									var18 = var6;
									byte var19 = 64;
									var20 = 64;
									var21 = var5 - var19;
									var22 = var6 - var20;
									class174.directions[var19][var20] = 99;
									class174.distances[var19][var20] = 0;
									byte var23 = 0;
									var24 = 0;
									class174.bufferX[var23] = var5;
									var40 = var23 + 1;
									class174.bufferY[var23] = var6;
									int[][] var25 = var12.flags;

									boolean var36;
									while (true) {
										if (var24 == var40) {
											RouteStrategy.field1979 = var17;
											class67.field845 = var18;
											var36 = false;
											break;
										}

										var17 = class174.bufferX[var24];
										var18 = class174.bufferY[var24];
										var24 = var24 + 1 & 4095;
										var37 = var17 - var21;
										var38 = var18 - var22;
										var26 = var17 - var12.xInset;
										var27 = var18 - var12.yInset;
										if (var11.hasArrived(1, var17, var18, var12)) {
											RouteStrategy.field1979 = var17;
											class67.field845 = var18;
											var36 = true;
											break;
										}

										var28 = class174.distances[var37][var38] + 1;
										if (var37 > 0 && class174.directions[var37 - 1][var38] == 0 && (var25[var26 - 1][var27] & 19136776) == 0) {
											class174.bufferX[var40] = var17 - 1;
											class174.bufferY[var40] = var18;
											var40 = var40 + 1 & 4095;
											class174.directions[var37 - 1][var38] = 2;
											class174.distances[var37 - 1][var38] = var28;
										}

										if (var37 < 127 && class174.directions[var37 + 1][var38] == 0 && (var25[var26 + 1][var27] & 19136896) == 0) {
											class174.bufferX[var40] = var17 + 1;
											class174.bufferY[var40] = var18;
											var40 = var40 + 1 & 4095;
											class174.directions[var37 + 1][var38] = 8;
											class174.distances[var37 + 1][var38] = var28;
										}

										if (var38 > 0 && class174.directions[var37][var38 - 1] == 0 && (var25[var26][var27 - 1] & 19136770) == 0) {
											class174.bufferX[var40] = var17;
											class174.bufferY[var40] = var18 - 1;
											var40 = var40 + 1 & 4095;
											class174.directions[var37][var38 - 1] = 1;
											class174.distances[var37][var38 - 1] = var28;
										}

										if (var38 < 127 && class174.directions[var37][var38 + 1] == 0 && (var25[var26][var27 + 1] & 19136800) == 0) {
											class174.bufferX[var40] = var17;
											class174.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class174.directions[var37][var38 + 1] = 4;
											class174.distances[var37][var38 + 1] = var28;
										}

										if (var37 > 0 && var38 > 0 && class174.directions[var37 - 1][var38 - 1] == 0 && (var25[var26 - 1][var27 - 1] & 19136782) == 0 && (var25[var26 - 1][var27] & 19136776) == 0 && (var25[var26][var27 - 1] & 19136770) == 0) {
											class174.bufferX[var40] = var17 - 1;
											class174.bufferY[var40] = var18 - 1;
											var40 = var40 + 1 & 4095;
											class174.directions[var37 - 1][var38 - 1] = 3;
											class174.distances[var37 - 1][var38 - 1] = var28;
										}

										if (var37 < 127 && var38 > 0 && class174.directions[var37 + 1][var38 - 1] == 0 && (var25[var26 + 1][var27 - 1] & 19136899) == 0 && (var25[var26 + 1][var27] & 19136896) == 0 && (var25[var26][var27 - 1] & 19136770) == 0) {
											class174.bufferX[var40] = var17 + 1;
											class174.bufferY[var40] = var18 - 1;
											var40 = var40 + 1 & 4095;
											class174.directions[var37 + 1][var38 - 1] = 9;
											class174.distances[var37 + 1][var38 - 1] = var28;
										}

										if (var37 > 0 && var38 < 127 && class174.directions[var37 - 1][var38 + 1] == 0 && (var25[var26 - 1][var27 + 1] & 19136824) == 0 && (var25[var26 - 1][var27] & 19136776) == 0 && (var25[var26][var27 + 1] & 19136800) == 0) {
											class174.bufferX[var40] = var17 - 1;
											class174.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class174.directions[var37 - 1][var38 + 1] = 6;
											class174.distances[var37 - 1][var38 + 1] = var28;
										}

										if (var37 < 127 && var38 < 127 && class174.directions[var37 + 1][var38 + 1] == 0 && (var25[var26 + 1][var27 + 1] & 19136992) == 0 && (var25[var26 + 1][var27] & 19136896) == 0 && (var25[var26][var27 + 1] & 19136800) == 0) {
											class174.bufferX[var40] = var17 + 1;
											class174.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class174.directions[var37 + 1][var38 + 1] = 12;
											class174.distances[var37 + 1][var38 + 1] = var28;
										}
									}

									var35 = var36;
								} else if (var9 == 2) {
									var35 = WorldMapRectangle.method3959(var5, var6, var10, var12);
								} else {
									var35 = class318.method5874(var5, var6, var9, var10, var12);
								}

								int var8;
								label404: {
									var16 = var5 - 64;
									var17 = var6 - 64;
									var18 = RouteStrategy.field1979;
									var37 = class67.field845;
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
												if (var29 >= 0 && var30 >= 0 && var29 < 128 && var30 < 128 && class174.distances[var29][var30] < 100) {
													int var31 = 0;
													if (var27 < var40) {
														var31 = var40 - var27;
													} else if (var27 > var40 + var34 - 1) {
														var31 = var27 - (var40 + var34 - 1);
													}

													int var32 = 0;
													if (var28 < var24) {
														var32 = var24 - var28;
													} else if (var28 > var26 + var24 - 1) {
														var32 = var28 - (var24 + var26 - 1);
													}

													int var33 = var31 * var31 + var32 * var32;
													if (var33 < var38 || var38 == var33 && class174.distances[var29][var30] < var21) {
														var38 = var33;
														var21 = class174.distances[var29][var30];
														var18 = var27;
														var37 = var28;
													}
												}
											}
										}

										if (var38 == Integer.MAX_VALUE) {
											var8 = -1;
											break label404;
										}
									}

									if (var18 == var5 && var37 == var6) {
										var8 = 0;
									} else {
										var20 = 0;
										class174.bufferX[var20] = var18;
										var38 = var20 + 1;
										class174.bufferY[var20] = var37;

										for (var21 = var22 = class174.directions[var18 - var16][var37 - var17]; var18 != var5 || var37 != var6; var21 = class174.directions[var18 - var16][var37 - var17]) {
											if (var22 != var21) {
												var22 = var21;
												class174.bufferX[var38] = var18;
												class174.bufferY[var38++] = var37;
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
											var13[var40] = class174.bufferX[var38];
											var14[var40++] = class174.bufferY[var38];
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
										break label381;
									}

									var4.method2111(Client.field538[var16], Client.field748[var16], (byte)2);
									++var16;
								}
							}

							for (var16 = 0; var16 < 128; ++var16) {
								class174.directions[var15][var16] = 0;
								class174.distances[var15][var16] = 99999999;
							}

							++var15;
						}
					}
				}

				this.method2111(var1, var2, var3);
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "107443252"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0;
		super.field1144 = 0;
		super.field1085 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		int var3 = this.transformedSize();
		super.x = var3 * 64 + super.pathX[0] * 128;
		super.y = super.pathY[0] * 128 + var3 * 64;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIBI)V",
		garbageValue = "1234210425"
	)
	final void method2111(int var1, int var2, byte var3) {
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
		garbageValue = "-532391824"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)J",
		garbageValue = "-665498236"
	)
	public static long method2159(int var0) {
		return ViewportMouse.ViewportMouse_entityTags[var0];
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-763445745"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (class174.loadInterface(var0)) {
			Widget[] var1 = WorldMapSection1.Widget_interfaceComponents[var0];

			for (int var2 = 0; var2 < var1.length; ++var2) {
				Widget var3 = var1[var2];
				if (var3 != null) {
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
				}
			}

		}
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "55"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (AbstractArchive.friendsChatManager != null) {
			PacketBufferNode var1 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2766, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(Client.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
