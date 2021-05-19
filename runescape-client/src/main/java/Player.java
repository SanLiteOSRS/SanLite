import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cg")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 972215407
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 786520397
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("z")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 177544021
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 439955349
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1996153449
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -470171859
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -2092287543
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1153336923
	)
	int field1174;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 607445449
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -705770457
	)
	int field1172;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1470022945
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1450627593
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 410410317
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -662783103
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("m")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 515461967
	)
	@Export("team")
	int team;
	@ObfuscatedName("f")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -276233463
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -319055031
	)
	@Export("index")
	int index;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	TriBool field1170;
	@ObfuscatedName("ae")
	boolean field1186;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 139064121
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1808848513
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
		this.isInClanChat = TriBool.TriBool_unknown;
		this.field1170 = TriBool.TriBool_unknown;
		this.field1186 = false;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;B)V",
		garbageValue = "100"
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
					var8 = Strings.ItemDefinition_get(var4[var5] - 512).team;
					if (var8 != 0) {
						this.team = var8;
					}
				}
			}
		}

		int[] var11 = new int[5];

		for (var6 = 0; var6 < 5; ++var6) {
			var7 = var1.readUnsignedByte();
			if (var7 < 0 || var7 >= Canvas.field295[var6].length) {
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), ModeWhere.loginType);
		this.clearIsFriend();
		this.clearIsInClanChat();
		this.method2130();
		if (this == class35.localPlayer) {
			RunException.field4292 = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte();
		this.skillLevel = var1.readUnsignedShort();
		this.isHidden = var1.readUnsignedByte() == 1;
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) {
			this.isHidden = false;
		}

		class135[] var12 = null;
		boolean var13 = false;
		if (var1.offset < var1.array.length) {
			var8 = var1.readUnsignedShort();
			var13 = (var8 >> 15 & 1) == 1;
			if (var8 > 0 && var8 != 32768) {
				var12 = new class135[12];

				for (int var9 = 0; var9 < 12; ++var9) {
					int var10 = var8 >> 12 - var9 & 1;
					if (var10 == 1) {
						var12[var9] = class23.method310(var4[var9] - 512, var1);
					}
				}
			}
		}

		if (this.appearance == null) {
			this.appearance = new PlayerComposition();
		}

		this.appearance.method4614(var4, var12, var13, var11, var2 == 1, var3);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Lgj;",
		garbageValue = "-220627570"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.idleSequence == super.movementSequence && var1 != null ? null : SequenceDefinition_get(super.movementSequence);
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				Model var4;
				Model[] var5;
				if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) {
					var4 = Friend.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
					if (var4 != null) {
						var4.offsetBy(0, -super.field1224, 0);
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
						var4.offsetBy(this.field1174 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1172 * 4096 - super.y);
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

						var4.offsetBy(super.x - this.field1174 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1172 * 4096);
					}
				}

				var3.isSingleTile = true;
				return var3;
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1577174246"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) {
			this.checkIsFriend();
		}

		return this.isFriendTriBool == TriBool.TriBool_true;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "63"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2054012929"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = GrandExchangeOfferUnitPriceComparator.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1144773320"
	)
	boolean method2149() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}

		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1529344254"
	)
	@Export("clearIsInClanChat")
	void clearIsInClanChat() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "28293"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		this.isInClanChat = class25.clanChat != null && class25.clanChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-925189639"
	)
	void method2177() {
		this.field1170 = Client.field678[0] != null && Client.field678[0].method113(this.username.getName()) != -1 ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "31443"
	)
	void method2130() {
		this.field1170 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "22"
	)
	boolean method2137() {
		if (this.field1170 == TriBool.TriBool_unknown) {
			this.method2177();
		}

		return this.field1170 == TriBool.TriBool_true;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-796021521"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? class8.getNpcDefinition(this.appearance.npcTransformId).size : 1;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIBI)V",
		garbageValue = "166145793"
	)
	final void method2140(int var1, int var2, byte var3) {
		if (super.sequence != -1 && SequenceDefinition_get(super.sequence).field1882 == 1) {
			super.sequence = -1;
		}

		super.field1247 = -1;
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var3 == 2) {
					Player var4 = this;
					int var5 = super.pathX[0];
					int var6 = super.pathY[0];
					int var7 = this.transformedSize();
					if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && var1 >= var7 && var1 < 104 - var7 && var2 >= var7 && var2 < 104 - var7) {
						int var9 = this.transformedSize();
						Client.field894.approxDestinationX = var1;
						Client.field894.approxDestinationY = var2;
						Client.field894.approxDestinationSizeX = 1;
						Client.field894.approxDestinationSizeY = 1;
						ApproximateRouteStrategy var10 = Client.field894;
						ApproximateRouteStrategy var11 = var10;
						CollisionMap var12 = Client.collisionMaps[this.plane];
						int[] var13 = Client.field828;
						int[] var14 = Client.field896;
						int var15 = 0;

						label853:
						while (true) {
							int var16;
							if (var15 >= 128) {
								int var17;
								int var18;
								byte var19;
								byte var20;
								int var21;
								int var22;
								byte var23;
								int var24;
								int[][] var25;
								int var26;
								int var27;
								int var28;
								int var29;
								boolean var35;
								boolean var36;
								int var37;
								int var38;
								int var40;
								if (var9 == 1) {
									var17 = var5;
									var18 = var6;
									var19 = 64;
									var20 = 64;
									var21 = var5 - var19;
									var22 = var6 - var20;
									class159.directions[var19][var20] = 99;
									class159.distances[var19][var20] = 0;
									var23 = 0;
									var24 = 0;
									class159.bufferX[var23] = var5;
									var40 = var23 + 1;
									class159.bufferY[var23] = var6;
									var25 = var12.flags;

									while (true) {
										if (var24 == var40) {
											class159.field1920 = var17;
											class159.field1924 = var18;
											var36 = false;
											break;
										}

										var17 = class159.bufferX[var24];
										var18 = class159.bufferY[var24];
										var24 = var24 + 1 & 4095;
										var37 = var17 - var21;
										var38 = var18 - var22;
										var26 = var17 - var12.xInset;
										var27 = var18 - var12.yInset;
										if (var11.hasArrived(1, var17, var18, var12)) {
											class159.field1920 = var17;
											class159.field1924 = var18;
											var36 = true;
											break;
										}

										var28 = class159.distances[var37][var38] + 1;
										if (var37 > 0 && class159.directions[var37 - 1][var38] == 0 && (var25[var26 - 1][var27] & 19136776) == 0) {
											class159.bufferX[var40] = var17 - 1;
											class159.bufferY[var40] = var18;
											var40 = var40 + 1 & 4095;
											class159.directions[var37 - 1][var38] = 2;
											class159.distances[var37 - 1][var38] = var28;
										}

										if (var37 < 127 && class159.directions[var37 + 1][var38] == 0 && (var25[var26 + 1][var27] & 19136896) == 0) {
											class159.bufferX[var40] = var17 + 1;
											class159.bufferY[var40] = var18;
											var40 = var40 + 1 & 4095;
											class159.directions[var37 + 1][var38] = 8;
											class159.distances[var37 + 1][var38] = var28;
										}

										if (var38 > 0 && class159.directions[var37][var38 - 1] == 0 && (var25[var26][var27 - 1] & 19136770) == 0) {
											class159.bufferX[var40] = var17;
											class159.bufferY[var40] = var18 - 1;
											var40 = var40 + 1 & 4095;
											class159.directions[var37][var38 - 1] = 1;
											class159.distances[var37][var38 - 1] = var28;
										}

										if (var38 < 127 && class159.directions[var37][var38 + 1] == 0 && (var25[var26][var27 + 1] & 19136800) == 0) {
											class159.bufferX[var40] = var17;
											class159.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class159.directions[var37][var38 + 1] = 4;
											class159.distances[var37][var38 + 1] = var28;
										}

										if (var37 > 0 && var38 > 0 && class159.directions[var37 - 1][var38 - 1] == 0 && (var25[var26 - 1][var27 - 1] & 19136782) == 0 && (var25[var26 - 1][var27] & 19136776) == 0 && (var25[var26][var27 - 1] & 19136770) == 0) {
											class159.bufferX[var40] = var17 - 1;
											class159.bufferY[var40] = var18 - 1;
											var40 = var40 + 1 & 4095;
											class159.directions[var37 - 1][var38 - 1] = 3;
											class159.distances[var37 - 1][var38 - 1] = var28;
										}

										if (var37 < 127 && var38 > 0 && class159.directions[var37 + 1][var38 - 1] == 0 && (var25[var26 + 1][var27 - 1] & 19136899) == 0 && (var25[var26 + 1][var27] & 19136896) == 0 && (var25[var26][var27 - 1] & 19136770) == 0) {
											class159.bufferX[var40] = var17 + 1;
											class159.bufferY[var40] = var18 - 1;
											var40 = var40 + 1 & 4095;
											class159.directions[var37 + 1][var38 - 1] = 9;
											class159.distances[var37 + 1][var38 - 1] = var28;
										}

										if (var37 > 0 && var38 < 127 && class159.directions[var37 - 1][var38 + 1] == 0 && (var25[var26 - 1][var27 + 1] & 19136824) == 0 && (var25[var26 - 1][var27] & 19136776) == 0 && (var25[var26][var27 + 1] & 19136800) == 0) {
											class159.bufferX[var40] = var17 - 1;
											class159.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class159.directions[var37 - 1][var38 + 1] = 6;
											class159.distances[var37 - 1][var38 + 1] = var28;
										}

										if (var37 < 127 && var38 < 127 && class159.directions[var37 + 1][var38 + 1] == 0 && (var25[var26 + 1][var27 + 1] & 19136992) == 0 && (var25[var26 + 1][var27] & 19136896) == 0 && (var25[var26][var27 + 1] & 19136800) == 0) {
											class159.bufferX[var40] = var17 + 1;
											class159.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class159.directions[var37 + 1][var38 + 1] = 12;
											class159.distances[var37 + 1][var38 + 1] = var28;
										}
									}

									var35 = var36;
								} else if (var9 == 2) {
									var17 = var5;
									var18 = var6;
									var19 = 64;
									var20 = 64;
									var21 = var5 - var19;
									var22 = var6 - var20;
									class159.directions[var19][var20] = 99;
									class159.distances[var19][var20] = 0;
									var23 = 0;
									var24 = 0;
									class159.bufferX[var23] = var5;
									var40 = var23 + 1;
									class159.bufferY[var23] = var6;
									var25 = var12.flags;

									while (true) {
										if (var40 == var24) {
											class159.field1920 = var17;
											class159.field1924 = var18;
											var36 = false;
											break;
										}

										var17 = class159.bufferX[var24];
										var18 = class159.bufferY[var24];
										var24 = var24 + 1 & 4095;
										var37 = var17 - var21;
										var38 = var18 - var22;
										var26 = var17 - var12.xInset;
										var27 = var18 - var12.yInset;
										if (var11.hasArrived(2, var17, var18, var12)) {
											class159.field1920 = var17;
											class159.field1924 = var18;
											var36 = true;
											break;
										}

										var28 = class159.distances[var37][var38] + 1;
										if (var37 > 0 && class159.directions[var37 - 1][var38] == 0 && (var25[var26 - 1][var27] & 19136782) == 0 && (var25[var26 - 1][var27 + 1] & 19136824) == 0) {
											class159.bufferX[var40] = var17 - 1;
											class159.bufferY[var40] = var18;
											var40 = var40 + 1 & 4095;
											class159.directions[var37 - 1][var38] = 2;
											class159.distances[var37 - 1][var38] = var28;
										}

										if (var37 < 126 && class159.directions[var37 + 1][var38] == 0 && (var25[var26 + 2][var27] & 19136899) == 0 && (var25[var26 + 2][var27 + 1] & 19136992) == 0) {
											class159.bufferX[var40] = var17 + 1;
											class159.bufferY[var40] = var18;
											var40 = var40 + 1 & 4095;
											class159.directions[var37 + 1][var38] = 8;
											class159.distances[var37 + 1][var38] = var28;
										}

										if (var38 > 0 && class159.directions[var37][var38 - 1] == 0 && (var25[var26][var27 - 1] & 19136782) == 0 && (var25[var26 + 1][var27 - 1] & 19136899) == 0) {
											class159.bufferX[var40] = var17;
											class159.bufferY[var40] = var18 - 1;
											var40 = var40 + 1 & 4095;
											class159.directions[var37][var38 - 1] = 1;
											class159.distances[var37][var38 - 1] = var28;
										}

										if (var38 < 126 && class159.directions[var37][var38 + 1] == 0 && (var25[var26][var27 + 2] & 19136824) == 0 && (var25[var26 + 1][var27 + 2] & 19136992) == 0) {
											class159.bufferX[var40] = var17;
											class159.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class159.directions[var37][var38 + 1] = 4;
											class159.distances[var37][var38 + 1] = var28;
										}

										if (var37 > 0 && var38 > 0 && class159.directions[var37 - 1][var38 - 1] == 0 && (var25[var26 - 1][var27] & 19136830) == 0 && (var25[var26 - 1][var27 - 1] & 19136782) == 0 && (var25[var26][var27 - 1] & 19136911) == 0) {
											class159.bufferX[var40] = var17 - 1;
											class159.bufferY[var40] = var18 - 1;
											var40 = var40 + 1 & 4095;
											class159.directions[var37 - 1][var38 - 1] = 3;
											class159.distances[var37 - 1][var38 - 1] = var28;
										}

										if (var37 < 126 && var38 > 0 && class159.directions[var37 + 1][var38 - 1] == 0 && (var25[var26 + 1][var27 - 1] & 19136911) == 0 && (var25[var26 + 2][var27 - 1] & 19136899) == 0 && (var25[var26 + 2][var27] & 19136995) == 0) {
											class159.bufferX[var40] = var17 + 1;
											class159.bufferY[var40] = var18 - 1;
											var40 = var40 + 1 & 4095;
											class159.directions[var37 + 1][var38 - 1] = 9;
											class159.distances[var37 + 1][var38 - 1] = var28;
										}

										if (var37 > 0 && var38 < 126 && class159.directions[var37 - 1][var38 + 1] == 0 && (var25[var26 - 1][var27 + 1] & 19136830) == 0 && (var25[var26 - 1][var27 + 2] & 19136824) == 0 && (var25[var26][var27 + 2] & 19137016) == 0) {
											class159.bufferX[var40] = var17 - 1;
											class159.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class159.directions[var37 - 1][var38 + 1] = 6;
											class159.distances[var37 - 1][var38 + 1] = var28;
										}

										if (var37 < 126 && var38 < 126 && class159.directions[var37 + 1][var38 + 1] == 0 && (var25[var26 + 1][var27 + 2] & 19137016) == 0 && (var25[var26 + 2][var27 + 2] & 19136992) == 0 && (var25[var26 + 2][var27 + 1] & 19136995) == 0) {
											class159.bufferX[var40] = var17 + 1;
											class159.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class159.directions[var37 + 1][var38 + 1] = 12;
											class159.distances[var37 + 1][var38 + 1] = var28;
										}
									}

									var35 = var36;
								} else {
									var17 = var5;
									var18 = var6;
									var19 = 64;
									var20 = 64;
									var21 = var5 - var19;
									var22 = var6 - var20;
									class159.directions[var19][var20] = 99;
									class159.distances[var19][var20] = 0;
									var23 = 0;
									var24 = 0;
									class159.bufferX[var23] = var5;
									var40 = var23 + 1;
									class159.bufferY[var23] = var6;
									var25 = var12.flags;

									label839:
									while (true) {
										label837:
										while (true) {
											do {
												do {
													do {
														label814:
														do {
															if (var40 == var24) {
																class159.field1920 = var17;
																class159.field1924 = var18;
																var36 = false;
																break label839;
															}

															var17 = class159.bufferX[var24];
															var18 = class159.bufferY[var24];
															var24 = var24 + 1 & 4095;
															var37 = var17 - var21;
															var38 = var18 - var22;
															var26 = var17 - var12.xInset;
															var27 = var18 - var12.yInset;
															if (var11.hasArrived(var9, var17, var18, var12)) {
																class159.field1920 = var17;
																class159.field1924 = var18;
																var36 = true;
																break label839;
															}

															var28 = class159.distances[var37][var38] + 1;
															if (var37 > 0 && class159.directions[var37 - 1][var38] == 0 && (var25[var26 - 1][var27] & 19136782) == 0 && (var25[var26 - 1][var27 + var9 - 1] & 19136824) == 0) {
																var29 = 1;

																while (true) {
																	if (var29 >= var9 - 1) {
																		class159.bufferX[var40] = var17 - 1;
																		class159.bufferY[var40] = var18;
																		var40 = var40 + 1 & 4095;
																		class159.directions[var37 - 1][var38] = 2;
																		class159.distances[var37 - 1][var38] = var28;
																		break;
																	}

																	if ((var25[var26 - 1][var29 + var27] & 19136830) != 0) {
																		break;
																	}

																	++var29;
																}
															}

															if (var37 < 128 - var9 && class159.directions[var37 + 1][var38] == 0 && (var25[var9 + var26][var27] & 19136899) == 0 && (var25[var9 + var26][var27 + var9 - 1] & 19136992) == 0) {
																var29 = 1;

																while (true) {
																	if (var29 >= var9 - 1) {
																		class159.bufferX[var40] = var17 + 1;
																		class159.bufferY[var40] = var18;
																		var40 = var40 + 1 & 4095;
																		class159.directions[var37 + 1][var38] = 8;
																		class159.distances[var37 + 1][var38] = var28;
																		break;
																	}

																	if ((var25[var26 + var9][var29 + var27] & 19136995) != 0) {
																		break;
																	}

																	++var29;
																}
															}

															if (var38 > 0 && class159.directions[var37][var38 - 1] == 0 && (var25[var26][var27 - 1] & 19136782) == 0 && (var25[var26 + var9 - 1][var27 - 1] & 19136899) == 0) {
																var29 = 1;

																while (true) {
																	if (var29 >= var9 - 1) {
																		class159.bufferX[var40] = var17;
																		class159.bufferY[var40] = var18 - 1;
																		var40 = var40 + 1 & 4095;
																		class159.directions[var37][var38 - 1] = 1;
																		class159.distances[var37][var38 - 1] = var28;
																		break;
																	}

																	if ((var25[var26 + var29][var27 - 1] & 19136911) != 0) {
																		break;
																	}

																	++var29;
																}
															}

															if (var38 < 128 - var9 && class159.directions[var37][var38 + 1] == 0 && (var25[var26][var9 + var27] & 19136824) == 0 && (var25[var26 + var9 - 1][var9 + var27] & 19136992) == 0) {
																var29 = 1;

																while (true) {
																	if (var29 >= var9 - 1) {
																		class159.bufferX[var40] = var17;
																		class159.bufferY[var40] = var18 + 1;
																		var40 = var40 + 1 & 4095;
																		class159.directions[var37][var38 + 1] = 4;
																		class159.distances[var37][var38 + 1] = var28;
																		break;
																	}

																	if ((var25[var29 + var26][var27 + var9] & 19137016) != 0) {
																		break;
																	}

																	++var29;
																}
															}

															if (var37 > 0 && var38 > 0 && class159.directions[var37 - 1][var38 - 1] == 0 && (var25[var26 - 1][var27 - 1] & 19136782) == 0) {
																var29 = 1;

																while (true) {
																	if (var29 >= var9) {
																		class159.bufferX[var40] = var17 - 1;
																		class159.bufferY[var40] = var18 - 1;
																		var40 = var40 + 1 & 4095;
																		class159.directions[var37 - 1][var38 - 1] = 3;
																		class159.distances[var37 - 1][var38 - 1] = var28;
																		break;
																	}

																	if ((var25[var26 - 1][var29 + (var27 - 1)] & 19136830) != 0 || (var25[var29 + (var26 - 1)][var27 - 1] & 19136911) != 0) {
																		break;
																	}

																	++var29;
																}
															}

															if (var37 < 128 - var9 && var38 > 0 && class159.directions[var37 + 1][var38 - 1] == 0 && (var25[var9 + var26][var27 - 1] & 19136899) == 0) {
																var29 = 1;

																while (true) {
																	if (var29 >= var9) {
																		class159.bufferX[var40] = var17 + 1;
																		class159.bufferY[var40] = var18 - 1;
																		var40 = var40 + 1 & 4095;
																		class159.directions[var37 + 1][var38 - 1] = 9;
																		class159.distances[var37 + 1][var38 - 1] = var28;
																		break;
																	}

																	if ((var25[var26 + var9][var29 + (var27 - 1)] & 19136995) != 0 || (var25[var29 + var26][var27 - 1] & 19136911) != 0) {
																		break;
																	}

																	++var29;
																}
															}

															if (var37 > 0 && var38 < 128 - var9 && class159.directions[var37 - 1][var38 + 1] == 0 && (var25[var26 - 1][var27 + var9] & 19136824) == 0) {
																for (var29 = 1; var29 < var9; ++var29) {
																	if ((var25[var26 - 1][var27 + var29] & 19136830) != 0 || (var25[var29 + (var26 - 1)][var9 + var27] & 19137016) != 0) {
																		continue label814;
																	}
																}

																class159.bufferX[var40] = var17 - 1;
																class159.bufferY[var40] = var18 + 1;
																var40 = var40 + 1 & 4095;
																class159.directions[var37 - 1][var38 + 1] = 6;
																class159.distances[var37 - 1][var38 + 1] = var28;
															}
														} while(var37 >= 128 - var9);
													} while(var38 >= 128 - var9);
												} while(class159.directions[var37 + 1][var38 + 1] != 0);
											} while((var25[var26 + var9][var27 + var9] & 19136992) != 0);

											for (var29 = 1; var29 < var9; ++var29) {
												if ((var25[var29 + var26][var9 + var27] & 19137016) != 0 || (var25[var26 + var9][var29 + var27] & 19136995) != 0) {
													continue label837;
												}
											}

											class159.bufferX[var40] = var17 + 1;
											class159.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class159.directions[var37 + 1][var38 + 1] = 12;
											class159.distances[var37 + 1][var38 + 1] = var28;
										}
									}

									var35 = var36;
								}

								int var8;
								label896: {
									var16 = var5 - 64;
									var17 = var6 - 64;
									var18 = class159.field1920;
									var37 = class159.field1924;
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
												var29 = var27 - var16;
												int var30 = var28 - var17;
												if (var29 >= 0 && var30 >= 0 && var29 < 128 && var30 < 128 && class159.distances[var29][var30] < 100) {
													int var31 = 0;
													if (var27 < var40) {
														var31 = var40 - var27;
													} else if (var27 > var40 + var34 - 1) {
														var31 = var27 - (var34 + var40 - 1);
													}

													int var32 = 0;
													if (var28 < var24) {
														var32 = var24 - var28;
													} else if (var28 > var26 + var24 - 1) {
														var32 = var28 - (var26 + var24 - 1);
													}

													int var33 = var31 * var31 + var32 * var32;
													if (var33 < var38 || var38 == var33 && class159.distances[var29][var30] < var21) {
														var38 = var33;
														var21 = class159.distances[var29][var30];
														var18 = var27;
														var37 = var28;
													}
												}
											}
										}

										if (var38 == Integer.MAX_VALUE) {
											var8 = -1;
											break label896;
										}
									}

									if (var18 == var5 && var6 == var37) {
										var8 = 0;
									} else {
										var20 = 0;
										class159.bufferX[var20] = var18;
										var38 = var20 + 1;
										class159.bufferY[var20] = var37;

										for (var21 = var22 = class159.directions[var18 - var16][var37 - var17]; var18 != var5 || var37 != var6; var21 = class159.directions[var18 - var16][var37 - var17]) {
											if (var21 != var22) {
												var22 = var21;
												class159.bufferX[var38] = var18;
												class159.bufferY[var38++] = var37;
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
											var13[var40] = class159.bufferX[var38];
											var14[var40++] = class159.bufferY[var38];
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
										break label853;
									}

									var4.method2163(Client.field828[var16], Client.field896[var16], (byte)2);
									++var16;
								}
							}

							for (var16 = 0; var16 < 128; ++var16) {
								class159.directions[var15][var16] = 0;
								class159.distances[var15][var16] = 99999999;
							}

							++var15;
						}
					}
				}

				this.method2163(var1, var2, var3);
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-381441568"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0;
		super.field1215 = 0;
		super.field1250 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		int var3 = this.transformedSize();
		super.x = super.pathX[0] * 128 + var3 * 64;
		super.y = super.pathY[0] * 128 + var3 * 64;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIBI)V",
		garbageValue = "364759226"
	)
	final void method2163(int var1, int var2, byte var3) {
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
		garbageValue = "-1701330496"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lfb;",
		garbageValue = "-595055331"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0);
			var1 = new SequenceDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "1209787772"
	)
	static int method2179(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.ADD) {
			WorldMapCacheName.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var4 + var3;
			return 1;
		} else if (var0 == ScriptOpcodes.SUB) {
			WorldMapCacheName.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3 - var4;
			return 1;
		} else if (var0 == ScriptOpcodes.MULTIPLY) {
			WorldMapCacheName.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var4 * var3;
			return 1;
		} else if (var0 == ScriptOpcodes.DIV) {
			WorldMapCacheName.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3 / var4;
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOM) {
			var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var3);
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOMINC) {
			var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var3 + 1));
			return 1;
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) {
				WorldMapCacheName.Interpreter_intStackSize -= 5;
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 4];
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3 + (var4 - var3) * (var7 - var5) / (var6 - var5);
				return 1;
			} else if (var0 == ScriptOpcodes.ADDPERCENT) {
				WorldMapCacheName.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3 + var3 * var4 / 100;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT) {
				WorldMapCacheName.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3 | 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT) {
				WorldMapCacheName.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3 & -1 - (1 << var4);
				return 1;
			} else if (var0 == ScriptOpcodes.TESTBIT) {
				WorldMapCacheName.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = (var3 & 1 << var4) != 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.MOD) {
				WorldMapCacheName.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3 % var4;
				return 1;
			} else if (var0 == ScriptOpcodes.POW) {
				WorldMapCacheName.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
				if (var3 == 0) {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, (double)var4);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.INVPOW) {
				WorldMapCacheName.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
				if (var3 == 0) {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					switch(var4) {
					case 0:
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
						break;
					case 1:
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3;
						break;
					case 2:
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var3);
						break;
					case 3:
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var3);
						break;
					case 4:
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var3));
						break;
					default:
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, 1.0D / (double)var4);
					}

					return 1;
				}
			} else if (var0 == ScriptOpcodes.AND) {
				WorldMapCacheName.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3 & var4;
				return 1;
			} else if (var0 == ScriptOpcodes.OR) {
				WorldMapCacheName.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3 | var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SCALE) {
				WorldMapCacheName.Interpreter_intStackSize -= 3;
				long var9 = (long)Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
				long var11 = (long)Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
				long var13 = (long)Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = (int)(var13 * var9 / var11);
				return 1;
			} else if (var0 == 4025) {
				var3 = ItemContainer.method2104(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3;
				return 1;
			} else if (var0 == 4026) {
				WorldMapCacheName.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3 ^ 1 << var4;
				return 1;
			} else if (var0 == 4027) {
				WorldMapCacheName.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = WorldMapElement.method2628(var3, var4, var5);
				return 1;
			} else if (var0 == 4028) {
				WorldMapCacheName.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = GrandExchangeEvents.method4968(var3, var4, var5);
				return 1;
			} else if (var0 == 4029) {
				WorldMapCacheName.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2];
				var6 = 31 - var5;
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3 << var6 >>> var4 + var6;
				return 1;
			} else if (var0 == 4030) {
				WorldMapCacheName.Interpreter_intStackSize -= 4;
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 3];
				var3 = GrandExchangeEvents.method4968(var3, var5, var6);
				var7 = WorldMapLabel.method3582(var6 - var5 + 1);
				if (var4 > var7) {
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3 | var4 << var5;
				return 1;
			} else {
				return 2;
			}
		}
	}
}
